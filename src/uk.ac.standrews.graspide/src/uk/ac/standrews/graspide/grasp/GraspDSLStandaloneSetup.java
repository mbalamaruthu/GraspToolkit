/*
* generated by Xtext
*/
package uk.ac.standrews.graspide.grasp;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GraspDSLStandaloneSetup extends GraspDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new GraspDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

