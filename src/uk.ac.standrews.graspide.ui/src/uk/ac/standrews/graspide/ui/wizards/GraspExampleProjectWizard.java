package uk.ac.standrews.graspide.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * Grasp Example Projects implementation using New Project extension point.
 *
 */
public class GraspExampleProjectWizard extends BasicNewProjectResourceWizard implements INewWizard {

    public GraspExampleProjectWizard() {
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        super.init(workbench, selection);
     }

    @Override
    public boolean performFinish() {

        IWizardPage page = this.getPage("basicNewProjectPage");
        if(page instanceof WizardNewProjectCreationPage) {
        WizardNewProjectCreationPage wizardPage = (WizardNewProjectCreationPage) page;
        wizardPage.setInitialProjectName("Grasp-Examples");
        }
        boolean isSuccess = super.performFinish();

        if(isSuccess){

            IProject project = this.getNewProject();
            try{
            IFolder folder = project.getFolder("examples");
            IFile file = folder.getFile("WsnSimulater.grasp");
            //at this point, no resources have been created
            if (!project.exists()) project.create(null);
            if (!project.isOpen()) project.open(null);
            if (!folder.exists())
                folder.create(IResource.NONE, true, null);

            if (!file.exists()) {
                try{
                byte[] bytes = ExamplesText.getWsnSimulatorText().getBytes();
                InputStream source = new ByteArrayInputStream(bytes);
                file.create(source, IResource.NONE, null);
                } catch(CoreException e){
                    e.printStackTrace();
                }
            }

            file = folder.getFile("REST.grasp");

            if (!file.exists()) {
                try{
                byte[] bytes = ExamplesText.getRESTText().getBytes();
                InputStream source = new ByteArrayInputStream(bytes);
                file.create(source, IResource.NONE, null);
                } catch(CoreException e){
                    e.printStackTrace();
                }
            }

            file = folder.getFile("BankingTransactions.grasp");

            if (!file.exists()) {
                try{
                byte[] bytes = ExamplesText.getTransactionsText().getBytes();
                InputStream source = new ByteArrayInputStream(bytes);
                file.create(source, IResource.NONE, null);
                } catch(CoreException e){
                    e.printStackTrace();
                }
            }

            } catch(Exception e){
                e.printStackTrace();
            }

        }

        return isSuccess;
    }


}
