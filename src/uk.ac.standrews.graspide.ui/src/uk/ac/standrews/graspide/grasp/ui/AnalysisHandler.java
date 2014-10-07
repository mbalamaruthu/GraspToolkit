package uk.ac.standrews.graspide.grasp.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Provider;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.ui.analysis.DependencyChainAnalysis;

/**
 * Analysis Context Menu Handler
 *
 */

@SuppressWarnings("deprecation")
public class AnalysisHandler extends AbstractHandler implements IHandler {

    @Inject
    private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;

    public Object execute(ExecutionEvent event) throws ExecutionException {

        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        final IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
                IFile.class);
        final EclipseResourceFileSystemAccess fileSystemAccess = fileAccessProvider
                .get();

        if (activeEditor instanceof XtextEditor) {
            ((XtextEditor) activeEditor).getDocument().readOnly(
                    new IUnitOfWork<Boolean, XtextResource>() {

                        public Boolean exec(final XtextResource resource)
                                throws Exception {

                            startAnalysisJob(file, fileSystemAccess, resource);

                            return Boolean.TRUE;
                        }

                    });
        }

        return null;
    }

    private void startAnalysisJob(final IFile file,
            final EclipseResourceFileSystemAccess fileSystemAccess,
            final XtextResource resource) {
        Job analysisJob = new Job("Grasp Dependency Analysis") {

            protected IStatus run(final IProgressMonitor monitor) {
                System.out.println("Analysis StartTime"
                        + System.currentTimeMillis());

                GraspSpecification specification = (GraspSpecification) resource
                        .getContents().get(0);

                DependencyChainAnalysis window = new DependencyChainAnalysis(
                        file, fileSystemAccess);

                window.displayWindow(specification.getArchitecture());

                return Status.OK_STATUS;
            }
        };
        if (ValidationUtil.isValidResource(resource)) {
            analysisJob.schedule();
        }
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
