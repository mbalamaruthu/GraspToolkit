package uk.ac.standrews.graspide.grasp.generator;

import com.google.common.collect.Iterables
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.Layer
import uk.ac.standrews.graspide.grasp.graspDSL.Provides
import uk.ac.standrews.graspide.grasp.graspDSL.Template

import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.*

import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

/**
 * Code generator for templates, components and connectors
 */

public class SystemsGenerator {

    final IFileSystemAccess fileSystem;
    private EObject currentElement;

    new(IFileSystemAccess fileSystem) {
        this.fileSystem = fileSystem;
    }

    def void processSystemElements(Architecture architecture) {

        var system = architecture.getArchitecutrebody().getSystem();
        for (content : system.eContents()) {
            var isComponentOrConnector = isComponentorConnector(content);
            if (isComponentOrConnector) {
                processComponentandConnector(content);

            } else if (content instanceof Layer)
                processLayerElement(content);

        }
    }

    def private boolean isComponentorConnector(EObject content) {
        return content instanceof Component || content instanceof Connector;
    }

    def private void processLayerElement(Layer layer) {
        var name = layer.getName();
        RationaleGenerator.extractAndSetRationales(layer);
        createPackage(name, LAYER_TYPE);
        processNestedElements(layer);
    }

    def private void processComponentandConnector(EObject element) {
        var name = "";
        var Template templateValue = null;
        var type = TEMPLATE_TYPE;
        if (element instanceof Component) {
            name = element.getName();
            type = COMPONENT_TYPE;
            templateValue = element.getValue();
        } else if (element instanceof Connector) {
            name = element.getName();
            type = CONNECTOR_TYPE;
            templateValue = element.getValue();
        }
        currentElement = element;
        processTemplate(templateValue, name, type);

        processTemplateInheritance(templateValue, name, type);

        processNestedElements(element);

    }

    def private void processNestedElements(EObject element) {

        //var allContents = element.eAllContents();
        //var iterableContents = IteratorExtensions.<EObject>toIterable(allContents)

        var iterableContents = element.allContentsIterable
        processComposedComponents(iterableContents);

        processComposedConnectors(iterableContents);

        processComposedLayers(iterableContents);
    }

    def private void processComposedLayers(Iterable<EObject> iterableContents) {
        var String name;
        var filteredComponentContents = Iterables.<Layer>filter(iterableContents, typeof(Layer));

        for (content : filteredComponentContents) {
            name = getNestedElementName(content);
            RationaleGenerator.extractAndSetRationales(content);
            createPackage(name, LAYER_TYPE);
        }

    }

    def private void processComposedConnectors(Iterable<EObject> iterableContents) {
        var String name;
        var Iterable<Connector> filteredConnectorContents = Iterables.<Connector>filter(iterableContents,
            typeof(Connector));
        for (content : filteredConnectorContents) {
            currentElement = content;
            name = getNestedElementName(content);
            processTemplate(content.getValue(), name, CONNECTOR_TYPE);
            processTemplateInheritance(content.getValue(), name, CONNECTOR_TYPE);

        }
    }

    def private void processComposedComponents(Iterable<EObject> iterableContents) {
        var String name;
        var Iterable<Component> filteredComponentContents = Iterables.<Component>filter(iterableContents,
            typeof(Component));

        for (content : filteredComponentContents) {
            currentElement = content;
            name = getNestedElementName(content);
            processTemplate(content.getValue(), name, COMPONENT_TYPE);
            processTemplateInheritance(content.getValue(), name, COMPONENT_TYPE);

        }
    }

    def private String getNestedElementName(EObject inputElement) {
        var element = inputElement;
        var String name = "";
        if (!isPackageableElement(element))
            return name;

        do {
            if (element instanceof Component) {
                name = element.getName() + FILE_SEPERATOR + name;

            } else if (element instanceof Connector) {
                name = element.getName() + FILE_SEPERATOR + name;

            } else if (element instanceof Layer) {
                name = element.getName() + FILE_SEPERATOR + name;

            }
            element = element.eContainer();
        } while (isPackageableElement(element));
        var int length = name.length();
        return name.substring(0, length - 1);
    }

    def private void processTemplateInheritance(Template templateValue, String name, String type) {
        var Template superTemplate = templateValue.getSuperTemplate();
        currentElement = null;
        while (superTemplate != null) {
            processTemplate(superTemplate, name, type);
            superTemplate = superTemplate.getSuperTemplate();
        }
    }

    def private boolean isPackageableElement(EObject content) {

        val boolean isPackageable = content instanceof Component || content instanceof Connector ||
            content instanceof Layer;
        return isPackageable;
    }

    def private void processTemplate(Template declaration, String elementName, String type) {
        var String declarationName = getFirstLowerString(elementName);

        var String packageName = declarationName;
        RationaleGenerator.extractAndSetRationales(currentElement);
        createPackage(packageName, type);
        createInterfacesForTemplateContents(declaration, packageName);

        var Iterable<EObject> iterableContents = declaration.allContentsIterable;
        var Iterable<Template> filteredContents = Iterables.<Template>filter(iterableContents, typeof(Template));
        for (content : filteredContents) {
            packageName = declarationName + FILE_SEPERATOR + getNestedTemplateName(content);
            RationaleGenerator.extractAndSetRationales(content);
            createPackage(packageName, TEMPLATE_TYPE);
            createInterfacesForTemplateContents(content, packageName);

        }

    }

    def private String getNestedTemplateName(Template inputContent) {
        var content = inputContent;
        var String name = getFirstLowerString(content.getName());
        var String previousName = name;
        while (content.eContainer() instanceof Template) {
            content = content.eContainer() as Template;
            previousName = name;
            name = getFirstLowerString(content.getName()) + FILE_SEPERATOR + name;
        }
        return previousName;
    }

    def private void createInterfacesForTemplateContents(Template declaration, String lowerTemplateName) {
        for (EObject content : declaration.eContents()) {
            if (content instanceof Provides) {
                var Provides provideContent = content;

                RationaleGenerator.extractAndSetRationales(provideContent);

                val String interfaceName = getFirstUpperString(provideContent.getName());

                val String provideFileName = lowerTemplateName + FILE_SEPERATOR + interfaceName + JAVA_CONSTANT;
                val String packageName = convertSlashtoDot(lowerTemplateName);

                val CharSequence provideContents = ContentGenerator.getInterfaceContents(PROVIDE_TYPE, interfaceName,
                    packageName);
                try {
                    fileSystem.generateFile(provideFileName, provideContents);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    def String createPackage(String name, String type) {

        val String packageFileName = name + FILE_SEPERATOR + PACKAGE_INFO_JAVA;
        val String packageName = convertSlashtoDot(name);

        val CharSequence packageInfoContents = ContentGenerator.getPackageInfoContents(type, packageName);
        try {
            fileSystem.generateFile(packageFileName, packageInfoContents);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

    def String convertSlashtoDot(String lowerTemplateName) {
        return lowerTemplateName.replace(FILE_SEPERATOR, PACKAGE_SEPERATOR);
    }

    // Not using lower and upper constraints imposed by Java language
    def String getFirstLowerString(String declarationName) {

        // return declarationName.substring(0, 1).toLowerCase() +
        // declarationName.substring(1);
        return declarationName;
    }

    def String getFirstUpperString(String declarationName) {

        // return declarationName.substring(0, 1).toUpperCase() +
        // declarationName.substring(1);
        return declarationName;
    }

}
