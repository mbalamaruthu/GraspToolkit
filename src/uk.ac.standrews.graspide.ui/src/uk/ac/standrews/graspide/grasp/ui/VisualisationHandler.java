package uk.ac.standrews.graspide.grasp.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Open Visualiser Context Menu Handler.
 *
 */
public class VisualisationHandler extends AbstractHandler implements IHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {

        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        final IFile file = (IFile) activeEditor.getEditorInput().getAdapter(
                IFile.class);
        if (file != null) {

            try {
                final String filePath = file.getLocation().toFile()
                        .getAbsolutePath();
                // System.out.println("Absolute Path of String " + filePath);

                if (activeEditor instanceof XtextEditor) {
                    ((XtextEditor) activeEditor).getDocument().readOnly(
                            new IUnitOfWork<Boolean, XtextResource>() {

                                public Boolean exec(XtextResource resource)
                                        throws Exception {
                                    if (ValidationUtil
                                            .isValidResource(resource)) {
                                        openVisualisation(filePath);
                                    }
                                    return Boolean.TRUE;
                                }

                            });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;

    }

    private void openVisualisation(final String filePath) {
        Runnable runnable = new Runnable() {

            public void run() {
                graspvis.Main.main(new String[] { filePath });

            }
        };

        Thread visualThread = new Thread(runnable);
        visualThread.start();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
