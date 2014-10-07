package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.System
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import java.util.ArrayList
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage

/**
 * Validations for Connector constructs
 */
class ConnectorValidator {

	var GraspDSLValidator validator = null;

	new(GraspDSLValidator validator) {
		this.validator = validator;
	}

	def void validateConnectorReferences(System system) {
		var connectorList = new ArrayList<Connector>();
		var linkList = new ArrayList<Link>();
		for (content : system.eContents) {
			if (content instanceof Connector) {
				connectorList.add(content)
			} else if (content instanceof Link) {
				linkList.add(content)
			}
		}

		for (connector : connectorList) {

			if (connector.name != null) {

				if (!connectorFoundInLinks(connector.name, linkList)) {

					validator.warning(
						"Connector '" + connector.name + "' is not referenced in a Link Configuration",
						connector,
						GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
					)
				}
			}
		}
	}

	def boolean connectorFoundInLinks(String connectorName, ArrayList<Link> links) {

		for (link : links) {

			var linkExpression = link.linkConsumer;
			var linkProviderList = link.linkProviders;

			if (linkExpression != null && linkExpression.consumer != null && linkProviderList != null &&
				linkProviderList.providers != null) {

				var linkConsumer = linkExpression.consumer;

				if (linkConsumer instanceof Connector) {

					if (linkConsumer.name != null && linkConsumer.name.equals(connectorName)) {
						return true;
					}

				}
				for (provider : linkProviderList.providers) {
					var providerPart = provider.provider
					if (providerPart instanceof Connector) {

						if (providerPart.name != null && providerPart.name.equals(connectorName)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
