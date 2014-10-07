package uk.ac.standrews.graspide.grasp.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Code Generation Context Menu Handler
 *
 */

@SuppressWarnings("deprecation")
public class GenerationHandler extends AbstractHandler implements IHandler {


    @Inject
    private IGenerator generator;

    @Inject
    private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;

    @Inject
    IResourceDescriptions resourceDescriptions;

    @Inject
    IResourceSetProvider resourceSetProvider;


    public Object execute(final ExecutionEvent event) throws ExecutionException {

        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        final IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
                IFile.class);
        final EclipseResourceFileSystemAccess fileSystemAccess = fileAccessProvider
                .get();

        if (activeEditor instanceof XtextEditor) {
            ((XtextEditor) activeEditor).getDocument().readOnly(
                    new IUnitOfWork<Boolean, XtextResource>() {

                        public Boolean exec(final XtextResource state)
                                throws Exception {

                            startGeneratorJob(file, fileSystemAccess, state);

                            return Boolean.TRUE;
                        }
                    });

        }

        return null;
    }

    private void startGeneratorJob(
            final IFile file,
            final EclipseResourceFileSystemAccess fileSystemAccess,
            final XtextResource state) {
        Job generatorJob = new Job("Grasp Code Generation") {

            protected IStatus run(final IProgressMonitor monitor) {
                long startTime = System.currentTimeMillis();
                            createSrcGenerationFolder(file,
                                    fileSystemAccess);
                            generator.doGenerate(state,
                                    fileSystemAccess);

                 long endTime = System.currentTimeMillis();

                 System.out.println("Code generation Execution Time "+ (endTime-startTime));

                return Status.OK_STATUS;
            }
        };

        if (ValidationUtil.isValidResource(state)) {
            generatorJob.setPriority(Job.LONG);
            generatorJob.schedule();
        }
    }

    private void createSrcGenerationFolder(final IFile file, final EclipseResourceFileSystemAccess fsa){

        if (file != null) {
            IProject project = file.getProject();
            final String fileName = file.getName();
            int extensionIndex = fileName.lastIndexOf('.');
            String name = fileName.substring(0, extensionIndex);

            String generationFolder = name + "-stubs-generated";
            IFolder srcGenFolder = project.getFolder(generationFolder);
            if (srcGenFolder.exists()) {
                try {
                    srcGenFolder.delete(true, new NullProgressMonitor());
                } catch (CoreException e1) {
                    e1.printStackTrace();
                }
            }

            try {
                srcGenFolder.create(true, true, new NullProgressMonitor());
            } catch (CoreException e) {
                e.printStackTrace();
                return ;
            }


            fsa.setOutputPath(srcGenFolder.getFullPath().toString());
        }

    }



    @Override
    public boolean isEnabled() {
        return true;
    }

}
