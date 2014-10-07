package uk.ac.standrews.graspide.grasp.ui.hover;

import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Xtend file containing Hover documentation contents
 */
@SuppressWarnings("all")
public class GraspElementsDocumentation {
  public static String getArchitectureText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The architecture statement specifies the entire architecture within which");
    _builder.newLine();
    _builder.append("the runtime structure of the architecture is declared in system statement.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getRequirementText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Requirements are constraints typically functional constraints that are placed on the system.");
    _builder.newLine();
    _builder.append("Architecture of system should satisfy these requirements.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getQualityText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Quality Attributes are constraints typically non functional constraints that are placed on the system.");
    _builder.newLine();
    _builder.append("Architecture of system should support these quality attributes.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getSystemText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The system element is the root of the architecture containing other concrete elements.");
    _builder.newLine();
    _builder.append("There can be only one instance of a system in a given architecture specification.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getLayerText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Layering is an architectural style that provides a logical separation and grouping of elements.");
    _builder.newLine();
    _builder.append("The Over property represents the stacking order by referencing the layers below the current layer.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getComponentText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Components define the core functional entities in this model.");
    _builder.newLine();
    _builder.append("A component can be instantiated using a template element and may contain layers,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("connectors, interfaces, links and constraints in addition to other components.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getConnectorText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Connectors are structurally identical to components, but the");
    _builder.newLine();
    _builder.append("primary role of a connector is to facilitate communication between components.");
    _builder.newLine();
    _builder.append("A connector can be instantiated using a template element and may contain layers,");
    _builder.newLine();
    _builder.append("components, interfaces, links and constraints in addition to other connectors.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getLinkText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Link element specifies communication path between two interfaces. The two interfaces in");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("a link should have compatible directionality, which is validated by the link.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getTemplateText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Templates are abstract entities used to define composite architectural structures");
    _builder.newLine();
    _builder.append("that can be reused in components and connectors.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getRationaleText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("A rationale is a composition of one or more reasons describing the design decisions in the architecture.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getReasonText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("A reason is an argument or logical expressions that describes a design rationale.");
    _builder.newLine();
    _builder.append("Textual reasons are treated as logical true statements.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getProvideText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Interface elements provide the connections points required for components, connectors and layers");
    _builder.newLine();
    _builder.append("to communicate with each other. Provides Interface allows only outward communications.");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getRequireText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Interface elements provide the connections points required for components, connectors and layers");
    _builder.newLine();
    _builder.append("to communicate with each other. Requires Interface allows only incoming communications.");
    _builder.newLine();
    return _builder.toString();
  }
}
