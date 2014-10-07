package uk.ac.standrews.graspide.grasp.ui.analysis;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;

import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;

/**
 * Class performing Dtangler Flat space and Scoped File generations
 *
 */
@SuppressWarnings("deprecation")
public class DtanglerMatrix {
    private Architecture architecture;
    private IFile file;
    private EclipseResourceFileSystemAccess fileSystemAccess;
    private String generationPath;
    private final String flatDependencyFile = "flat-dependencies.dt";
    private final String scopedDependencyFile = "scoped-dependencies.dt";
    private DtanglerContentGenerator flatSpaceGenerator = new DtanglerContentGenerator();

    public DtanglerMatrix(IFile file,
            EclipseResourceFileSystemAccess fileSystemAccess) {
        this.file = file;
        this.fileSystemAccess = fileSystemAccess;
    }

    public void showFlatSpacedMatrix(Shell shell) {
        try {

            Runnable runnable = new Runnable() {

                public void run() {
                    String inputFile = generationPath + File.separator
                            + flatDependencyFile;
                    org.dtangler.swingui.app.Main.main(new String[] {
                            "-engine=generic", "-input=" + inputFile });
                }
            };

            Thread matrixThread = new Thread(runnable);
            matrixThread.start();

        } catch (Exception e) {
            MessageBox messagebox = new MessageBox(shell, SWT.ERROR);
            messagebox.setMessage("Error occured during Dtangler invocation\n"
                    + e.getMessage());
            messagebox.setText("Error on Dtangler invocation");
            messagebox.open();
            e.printStackTrace();
        }
    }

    public void showScopedMatrix(Shell shell) {
        try {

            Runnable runnable = new Runnable() {

                public void run() {
                    String inputFile = generationPath + File.separator
                            + scopedDependencyFile;
                    org.dtangler.swingui.app.Main.main(new String[] {
                            "-engine=generic", "-input=" + inputFile ,"-scope=1"});
                }
            };

            Thread matrixThread = new Thread(runnable);
            matrixThread.start();

        } catch (Exception e) {
            MessageBox messagebox = new MessageBox(shell, SWT.ERROR);
            messagebox.setMessage("Error occured during Dtangler invocation\n"
                    + e.getMessage());
            messagebox.setText("Error on Dtangler invocation");
            messagebox.open();
            e.printStackTrace();
        }
    }

    void CreateSourceFolderAndGenerateFlatDependencies(Architecture architecture) {
        this.architecture = architecture;
        createDependencyGenerationFolder();
        generateFlatSpacedDtanglerDependencies();

    }
    void generateScopedDependencies() {
        generateScopedDtanglerDependencies();
    }

    private void generateScopedDtanglerDependencies() {
        CharSequence flatSpaceContents = flatSpaceGenerator
                .getScopedMatrixContents(architecture);
        try {
            fileSystemAccess.generateFile(scopedDependencyFile,
                    flatSpaceContents);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generateFlatSpacedDtanglerDependencies() {
        CharSequence flatSpaceContents = flatSpaceGenerator
                .getFlatMatrixContents(architecture);
        try {
            fileSystemAccess
                    .generateFile(flatDependencyFile, flatSpaceContents);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void createDependencyGenerationFolder() {

        if (file != null) {
            IProject project = file.getProject();
            final String fileName = file.getName();
            int extensionIndex = fileName.lastIndexOf('.');
            String name = fileName.substring(0, extensionIndex);

            String generationFolder = name + "-dependency-generated";
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
                return;
            }

            generationPath = srcGenFolder.getLocation().toFile()
                    .getAbsolutePath();
            String generationFolderPath = srcGenFolder.getFullPath().toString();
            fileSystemAccess.setOutputPath(generationFolderPath);
        }

    }

}
