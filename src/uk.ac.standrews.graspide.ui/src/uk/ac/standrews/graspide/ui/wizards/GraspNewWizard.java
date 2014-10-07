package uk.ac.standrews.graspide.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;

import java.io.*;

import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * This is a new wizard using New Wizard extension. Its role is to create a new file
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "grasp".
 */

public class GraspNewWizard extends Wizard implements INewWizard {
	private GraspNewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for GraspNewWizard.
	 */
	public GraspNewWizard() {
		super();
		setWindowTitle("New Grasp Architecture");
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new GraspNewWizardPage(selection);
		final String title = "New Architecture";
        page.setTitle(title);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}

		updatePerspective();
		return true;
	}

    private void updatePerspective() {
        IConfigurationElement configElement = new IConfigurationElement(){

            public Object createExecutableExtension(String propertyName)
                    throws CoreException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getAttribute(String name)
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return "uk.ac.standrews.graspide.ui.perspectives.GraspPerspective";
            }

            public String getAttribute(String attrName, String locale)
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getAttributeAsIs(String name)
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String[] getAttributeNames()
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public IConfigurationElement[] getChildren()
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public IConfigurationElement[] getChildren(String name)
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public IExtension getDeclaringExtension()
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getName() throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public Object getParent() throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getValue() throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getValue(String locale)
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getValueAsIs() throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getNamespace() throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public String getNamespaceIdentifier()
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public IContributor getContributor()
                    throws InvalidRegistryObjectException {
                // TODO Auto-generated method stub
                return null;
            }

            public boolean isValid() {
                // TODO Auto-generated method stub
                return false;
            }

		};
        BasicNewProjectResourceWizard.updatePerspective(configElement );
    }

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream(fileName);
			if (file.exists()) {
			    throwCoreException("File \"" + fileName + "\" already exists");
//				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream(String fileName) {
	    String architectureName = fileName.substring(0, fileName.lastIndexOf("."));
		String contents =
			"/** " + architectureName + " Architecture*/\n\n"
			+ "architecture " + architectureName + "Architecture {\n\n\tsystem " + architectureName + "System {"
			+ "\n\t}\n\n}";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "uk.ac.standrews.graspide.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
