package uk.ac.standrews.graspide.grasp.ui.hover

/**
 * Xtend file containing Hover documentation contents
 */

class GraspElementsDocumentation {

    def static String getArchitectureText() {
        '''
The architecture statement specifies the entire architecture within which
the runtime structure of the architecture is declared in system statement.
        '''
    }

    def static String getRequirementText() {
        '''
Requirements are constraints typically functional constraints that are placed on the system.
Architecture of system should satisfy these requirements.
        '''
    }

    def static String getQualityText() {
        '''
Quality Attributes are constraints typically non functional constraints that are placed on the system.
Architecture of system should support these quality attributes.
        '''
    }

    def static String getSystemText() {
        '''
The system element is the root of the architecture containing other concrete elements.
There can be only one instance of a system in a given architecture specification.
        '''
    }

    def static String getLayerText() {
        '''
Layering is an architectural style that provides a logical separation and grouping of elements.
The Over property represents the stacking order by referencing the layers below the current layer.
        '''
    }

    def static String getComponentText() {
        '''
Components define the core functional entities in this model.
A component can be instantiated using a template element and may contain layers,
 connectors, interfaces, links and constraints in addition to other components.
        '''
    }

    def static String getConnectorText() {
        '''
Connectors are structurally identical to components, but the
primary role of a connector is to facilitate communication between components.
A connector can be instantiated using a template element and may contain layers,
components, interfaces, links and constraints in addition to other connectors.
        '''
    }

    def static String getLinkText() {
        '''
Link element specifies communication path between two interfaces. The two interfaces in
 a link should have compatible directionality, which is validated by the link.
        '''
    }

    def static String getTemplateText() {
        '''
Templates are abstract entities used to define composite architectural structures
that can be reused in components and connectors.
        '''
    }

    def static String getRationaleText() {
        '''
A rationale is a composition of one or more reasons describing the design decisions in the architecture.
        '''
    }

    def static String getReasonText() {
        '''
A reason is an argument or logical expressions that describes a design rationale.
Textual reasons are treated as logical true statements.
        '''
    }

    def static String getProvideText() {
        '''
Interface elements provide the connections points required for components, connectors and layers
to communicate with each other. Provides Interface allows only outward communications.
        '''
    }

    def static String getRequireText() {
        '''
Interface elements provide the connections points required for components, connectors and layers
to communicate with each other. Requires Interface allows only incoming communications.
        '''
    }

}
