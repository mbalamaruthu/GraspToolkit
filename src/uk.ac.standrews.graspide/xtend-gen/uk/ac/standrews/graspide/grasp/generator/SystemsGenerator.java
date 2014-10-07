package uk.ac.standrews.graspide.grasp.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.generator.ContentGenerator;
import uk.ac.standrews.graspide.grasp.generator.GeneratorData;
import uk.ac.standrews.graspide.grasp.generator.RationaleGenerator;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;

/**
 * Code generator for templates, components and connectors
 */
@SuppressWarnings("all")
public class SystemsGenerator {
  private final IFileSystemAccess fileSystem;
  
  private EObject currentElement;
  
  public SystemsGenerator(final IFileSystemAccess fileSystem) {
    this.fileSystem = fileSystem;
  }
  
  public void processSystemElements(final Architecture architecture) {
    ArchitectureBody _architecutrebody = architecture.getArchitecutrebody();
    uk.ac.standrews.graspide.grasp.graspDSL.System system = _architecutrebody.getSystem();
    EList<EObject> _eContents = system.eContents();
    for (final EObject content : _eContents) {
      {
        boolean isComponentOrConnector = this.isComponentorConnector(content);
        if (isComponentOrConnector) {
          this.processComponentandConnector(content);
        } else {
          if ((content instanceof Layer)) {
            this.processLayerElement(((Layer)content));
          }
        }
      }
    }
  }
  
  private boolean isComponentorConnector(final EObject content) {
    boolean _or = false;
    if ((content instanceof Component)) {
      _or = true;
    } else {
      _or = (content instanceof Connector);
    }
    return _or;
  }
  
  private void processLayerElement(final Layer layer) {
    String name = layer.getName();
    RationaleGenerator.extractAndSetRationales(layer);
    this.createPackage(name, GeneratorData.LAYER_TYPE);
    this.processNestedElements(layer);
  }
  
  private void processComponentandConnector(final EObject element) {
    String name = "";
    Template templateValue = null;
    String type = GeneratorData.TEMPLATE_TYPE;
    if ((element instanceof Component)) {
      String _name = ((Component)element).getName();
      name = _name;
      type = GeneratorData.COMPONENT_TYPE;
      Template _value = ((Component)element).getValue();
      templateValue = _value;
    } else {
      if ((element instanceof Connector)) {
        String _name_1 = ((Connector)element).getName();
        name = _name_1;
        type = GeneratorData.CONNECTOR_TYPE;
        Template _value_1 = ((Connector)element).getValue();
        templateValue = _value_1;
      }
    }
    this.currentElement = element;
    this.processTemplate(templateValue, name, type);
    this.processTemplateInheritance(templateValue, name, type);
    this.processNestedElements(element);
  }
  
  private void processNestedElements(final EObject element) {
    Iterable<EObject> iterableContents = EObjectExtensions.allContentsIterable(element);
    this.processComposedComponents(iterableContents);
    this.processComposedConnectors(iterableContents);
    this.processComposedLayers(iterableContents);
  }
  
  private void processComposedLayers(final Iterable<EObject> iterableContents) {
    String name = null;
    Iterable<Layer> filteredComponentContents = Iterables.<Layer>filter(iterableContents, Layer.class);
    for (final Layer content : filteredComponentContents) {
      {
        String _nestedElementName = this.getNestedElementName(content);
        name = _nestedElementName;
        RationaleGenerator.extractAndSetRationales(content);
        this.createPackage(name, GeneratorData.LAYER_TYPE);
      }
    }
  }
  
  private void processComposedConnectors(final Iterable<EObject> iterableContents) {
    String name = null;
    Iterable<Connector> filteredConnectorContents = Iterables.<Connector>filter(iterableContents, 
      Connector.class);
    for (final Connector content : filteredConnectorContents) {
      {
        this.currentElement = content;
        String _nestedElementName = this.getNestedElementName(content);
        name = _nestedElementName;
        Template _value = content.getValue();
        this.processTemplate(_value, name, GeneratorData.CONNECTOR_TYPE);
        Template _value_1 = content.getValue();
        this.processTemplateInheritance(_value_1, name, GeneratorData.CONNECTOR_TYPE);
      }
    }
  }
  
  private void processComposedComponents(final Iterable<EObject> iterableContents) {
    String name = null;
    Iterable<Component> filteredComponentContents = Iterables.<Component>filter(iterableContents, 
      Component.class);
    for (final Component content : filteredComponentContents) {
      {
        this.currentElement = content;
        String _nestedElementName = this.getNestedElementName(content);
        name = _nestedElementName;
        Template _value = content.getValue();
        this.processTemplate(_value, name, GeneratorData.COMPONENT_TYPE);
        Template _value_1 = content.getValue();
        this.processTemplateInheritance(_value_1, name, GeneratorData.COMPONENT_TYPE);
      }
    }
  }
  
  private String getNestedElementName(final EObject inputElement) {
    EObject element = inputElement;
    String name = "";
    boolean _isPackageableElement = this.isPackageableElement(element);
    boolean _not = (!_isPackageableElement);
    if (_not) {
      return name;
    }
    boolean _dowhile = false;
    do {
      {
        if ((element instanceof Component)) {
          String _name = ((Component)element).getName();
          String _plus = (_name + GeneratorData.FILE_SEPERATOR);
          String _plus_1 = (_plus + name);
          name = _plus_1;
        } else {
          if ((element instanceof Connector)) {
            String _name_1 = ((Connector)element).getName();
            String _plus_2 = (_name_1 + GeneratorData.FILE_SEPERATOR);
            String _plus_3 = (_plus_2 + name);
            name = _plus_3;
          } else {
            if ((element instanceof Layer)) {
              String _name_2 = ((Layer)element).getName();
              String _plus_4 = (_name_2 + GeneratorData.FILE_SEPERATOR);
              String _plus_5 = (_plus_4 + name);
              name = _plus_5;
            }
          }
        }
        EObject _eContainer = element.eContainer();
        element = _eContainer;
      }
      boolean _isPackageableElement_1 = this.isPackageableElement(element);
      _dowhile = _isPackageableElement_1;
    } while(_dowhile);
    int length = name.length();
    return name.substring(0, (length - 1));
  }
  
  private void processTemplateInheritance(final Template templateValue, final String name, final String type) {
    Template superTemplate = templateValue.getSuperTemplate();
    this.currentElement = null;
    boolean _notEquals = (!Objects.equal(superTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        this.processTemplate(superTemplate, name, type);
        Template _superTemplate = superTemplate.getSuperTemplate();
        superTemplate = _superTemplate;
      }
      boolean _notEquals_1 = (!Objects.equal(superTemplate, null));
      _while = _notEquals_1;
    }
  }
  
  private boolean isPackageableElement(final EObject content) {
    boolean _or = false;
    if (((content instanceof Component) || (content instanceof Connector))) {
      _or = true;
    } else {
      _or = (content instanceof Layer);
    }
    final boolean isPackageable = _or;
    return isPackageable;
  }
  
  private void processTemplate(final Template declaration, final String elementName, final String type) {
    String declarationName = this.getFirstLowerString(elementName);
    String packageName = declarationName;
    RationaleGenerator.extractAndSetRationales(this.currentElement);
    this.createPackage(packageName, type);
    this.createInterfacesForTemplateContents(declaration, packageName);
    Iterable<EObject> iterableContents = EObjectExtensions.allContentsIterable(declaration);
    Iterable<Template> filteredContents = Iterables.<Template>filter(iterableContents, Template.class);
    for (final Template content : filteredContents) {
      {
        String _nestedTemplateName = this.getNestedTemplateName(content);
        String _plus = ((declarationName + GeneratorData.FILE_SEPERATOR) + _nestedTemplateName);
        packageName = _plus;
        RationaleGenerator.extractAndSetRationales(content);
        this.createPackage(packageName, GeneratorData.TEMPLATE_TYPE);
        this.createInterfacesForTemplateContents(content, packageName);
      }
    }
  }
  
  private String getNestedTemplateName(final Template inputContent) {
    Template content = inputContent;
    String _name = content.getName();
    String name = this.getFirstLowerString(_name);
    String previousName = name;
    EObject _eContainer = content.eContainer();
    boolean _while = (_eContainer instanceof Template);
    while (_while) {
      {
        EObject _eContainer_1 = content.eContainer();
        content = ((Template) _eContainer_1);
        previousName = name;
        String _name_1 = content.getName();
        String _firstLowerString = this.getFirstLowerString(_name_1);
        String _plus = (_firstLowerString + GeneratorData.FILE_SEPERATOR);
        String _plus_1 = (_plus + name);
        name = _plus_1;
      }
      EObject _eContainer_1 = content.eContainer();
      _while = (_eContainer_1 instanceof Template);
    }
    return previousName;
  }
  
  private void createInterfacesForTemplateContents(final Template declaration, final String lowerTemplateName) {
    EList<EObject> _eContents = declaration.eContents();
    for (final EObject content : _eContents) {
      if ((content instanceof Provides)) {
        Provides provideContent = ((Provides)content);
        RationaleGenerator.extractAndSetRationales(provideContent);
        String _name = provideContent.getName();
        final String interfaceName = this.getFirstUpperString(_name);
        final String provideFileName = (((lowerTemplateName + GeneratorData.FILE_SEPERATOR) + interfaceName) + GeneratorData.JAVA_CONSTANT);
        final String packageName = this.convertSlashtoDot(lowerTemplateName);
        final CharSequence provideContents = ContentGenerator.getInterfaceContents(GeneratorData.PROVIDE_TYPE, interfaceName, packageName);
        try {
          this.fileSystem.generateFile(provideFileName, provideContents);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
  
  public String createPackage(final String name, final String type) {
    final String packageFileName = ((name + GeneratorData.FILE_SEPERATOR) + GeneratorData.PACKAGE_INFO_JAVA);
    final String packageName = this.convertSlashtoDot(name);
    final CharSequence packageInfoContents = ContentGenerator.getPackageInfoContents(type, packageName);
    try {
      this.fileSystem.generateFile(packageFileName, packageInfoContents);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return name;
  }
  
  public String convertSlashtoDot(final String lowerTemplateName) {
    return lowerTemplateName.replace(GeneratorData.FILE_SEPERATOR, GeneratorData.PACKAGE_SEPERATOR);
  }
  
  public String getFirstLowerString(final String declarationName) {
    return declarationName;
  }
  
  public String getFirstUpperString(final String declarationName) {
    return declarationName;
  }
}
