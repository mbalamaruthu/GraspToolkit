package uk.ac.standrews.graspide.grasp.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import uk.ac.standrews.graspide.grasp.validation.GraspValidationPreferences;

/**
 * Validation utility functions to be performed before context menu invocations.
 *
 */

public class ValidationUtil {

    private static final String PID = "uk.ac.standrews.graspide";

    private static void showError(List<String> errors) {
        IWorkbench workbench = PlatformUI.getWorkbench();
        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();

        if (window != null) {
            Shell parentShell = window.getShell();
            parentShell.forceActive();
            try {

                MultiStatus info = new MultiStatus(
                        PID,
                        1,
                        "Correct validation errors for code generation to proceed",
                        null);
                for (String error : errors) {
                    info.add(new Status(IStatus.ERROR, PID, 1, error, null));
                }

                ErrorDialog
                        .openError(
                                parentShell,
                                "Validation Error",
                                "Enable and Perform All Default and Expensive Validations",
                                info);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    static boolean isValidResource(Resource resource) {

        if(resource.getErrors().size() > 0){
            List<String> errors = new ArrayList<String>();
            for(org.eclipse.emf.ecore.resource.Resource.Diagnostic childError : resource.getErrors()){
                errors.add(childError.getMessage()+" at Line "+childError.getLine());
            }
            showError(errors);
            return false;
        }
        GraspValidationPreferences.setAllValidationEnabled(true);

        EObject myModel = resource.getContents().get(0);
        Diagnostic diagnose = Diagnostician.INSTANCE.validate(myModel);
        List<String> errors = new ArrayList<String>();

        for (Diagnostic child : diagnose.getChildren()) {
            if (child.getSeverity() == Diagnostic.ERROR) {
                errors.add(child.getMessage());
            }
        }

        GraspValidationPreferences.setAllValidationEnabled(false);
        if (errors.size() > 0) {
            showError(errors);
            return false;
        }
        return true;

    }

}
