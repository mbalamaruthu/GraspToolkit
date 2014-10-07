package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.System
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import java.util.ArrayList
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage

/**
 * Validations for Component construct
 */
class ComponentValidator {

	var GraspDSLValidator validator = null;

	new(GraspDSLValidator validator) {
		this.validator = validator;
	}

	def void validateComponentReferences(System system) {

		var componentList = new ArrayList<Component>();
		var linkList = new ArrayList<Link>();
		for (content : system.eContents) {
			if (content instanceof Component) {
				componentList.add(content)
			} else if (content instanceof Link) {
				linkList.add(content)
			}
		}

		for (component : componentList) {

			if (component.name != null) {

				if (!componentFoundInLinks(component.name, linkList)) {

					validator.warning(
						"Component '" + component.name + "' is not referenced in a Link Configuration",
						component,
						GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
					)
				}
			}

		}

	}

	def boolean componentFoundInLinks(String componentName, ArrayList<Link> links) {

		for (link : links) {

			var linkExpression = link.linkConsumer;
			var linkProviderList = link.linkProviders;

			if (linkExpression != null && linkExpression.consumer != null && linkProviderList != null &&
				linkProviderList.providers != null) {

				var linkConsumer = linkExpression.consumer;

				if (linkConsumer instanceof Component) {

					if (linkConsumer.name != null && linkConsumer.name.equals(componentName)) {
						return true;
					}

				}
				for (provider : linkProviderList.providers) {
					var providerPart = provider.provider
					if (providerPart instanceof Component) {

						if (providerPart.name != null && providerPart.name.equals(componentName)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
