package uk.ac.standrews.graspide.grasp.validation

import com.google.common.collect.Iterables
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import java.util.Stack
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.EObjectExtensions
import uk.ac.standrews.graspide.grasp.generator.GeneratorUtil
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.Provides
import uk.ac.standrews.graspide.grasp.graspDSL.Requires
import uk.ac.standrews.graspide.grasp.graspDSL.System
import uk.ac.standrews.graspide.grasp.graspDSL.Template

/**
 * Validations for Requires and Provides Interface constructs
 */

class RequiresProvidesValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {
        this.validator = validator;
    }

    def void validateRequires(System system) {
        var iterableContents = EObjectExtensions.allContentsIterable(system);
        var Iterable<Connector> filteredConnectors = Iterables.<Connector>filter(iterableContents, typeof(Connector));
        var Iterable<Component> filteredComponents = Iterables.<Component>filter(iterableContents, typeof(Component));
        var Set<Requires> requires;
        for (connector : filteredConnectors) {
            requires = new HashSet<Requires>();
            populateRequiresList(requires, connector.value);
            checkRequiresForElement(requires, connector);
        }

        for (component : filteredComponents) {
            requires = new HashSet<Requires>();
            populateRequiresList(requires, component.value);
            checkRequiresForElement(requires, component);
        }
    }

    def private checkRequiresForElement(Set<Requires> requires, EObject element) {
        if (requires == null || requires.empty)
            return;
        var currentElement = element;
        var Stack<LinkProviderPart> containedElements = new Stack<LinkProviderPart>();

        while (currentElement != null && currentElement instanceof LinkProviderPart) {

            var Iterable<Link> links = currentElement.eContainer.eContents.filter(typeof(Link));
            for (link : links) {
                var clonedElements = containedElements.clone as Stack<LinkProviderPart>;
                checkRequiresInLink(requires, link, currentElement, clonedElements);
                if (requires.empty)
                    return;
            }
            containedElements.push(currentElement as LinkProviderPart);
            currentElement = currentElement.eContainer;
        }

        if (element instanceof Component) {
            validator.warning(
                "Component '" + element.name + "' has unsatisfied Require Interfaces " + requires.join(", ", [t|t.type]),
                element,
                GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
            )

        } else if (element instanceof Connector) {
            validator.warning(
                "Connector '" + element.name + "' has unsatisfied Require Interfaces " + requires.join(", ", [t|t.type]),
                element,
                GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
            )
        }
    }

    def private checkRequiresInLink(Set<Requires> requires, Link link, EObject element,
        Stack<LinkProviderPart> containedElements) {
        var linkExpression = link.linkConsumer;

        if (linkExpression != null && linkExpression.consumer != null) {

            var linkConsumer = linkExpression.consumer;
            if (element.equals(linkConsumer)) {

                var utility = new GeneratorUtil();
                var lastComponent = utility.getLastConsumer(linkExpression, false);
                if (lastComponent instanceof Requires) {

                    if (isElementContainedinHeirarchy(linkExpression.rightConsumer, containedElements))
                        requires.remove(lastComponent);
                }
            }

        }
    }

    def isElementContainedinHeirarchy(EList<String> rightList, Stack<LinkProviderPart> stack) {
        if (stack.nullOrEmpty || rightList == null)
            return true;

        for (elementName : rightList) {
            val topElement = stack.pop;
            if (topElement == null || topElement.name == null || !topElement.name.equals(elementName))
                return false;
            if (stack.empty())
                return true;
        }
        return false;
    }

    def private populateRequiresList(Set<Requires> requires, Template template) {
        var Template currentTemplate = template;
        var HashSet<Template> templateSet = new HashSet<Template>();
        while (currentTemplate != null) {

            var iterableContents = EObjectExtensions.allContentsIterable(currentTemplate);
            var Iterable<Requires> filteredRequires = Iterables.<Requires>filter(iterableContents, typeof(Requires));
            if (filteredRequires != null)
                requires.addAll(filteredRequires);
            templateSet.add(currentTemplate);
            currentTemplate = currentTemplate.superTemplate;
            if(templateSet.contains(currentTemplate))
                return;
        }
    }

    def void validateRequiresAndProvides(ArchitectureBody architectureBody) {

        var List<Template> declarations = new ArrayList<Template>();

        getAllDeclarations(architectureBody, declarations)

        var Set<String> requiresSet = new HashSet<String>();
        var Set<String> providesSet = new HashSet<String>();

        var Set<Requires> requiresObjectSet = new HashSet<Requires>();
        var Set<Provides> providesObjectSet = new HashSet<Provides>();

        for (declaration : declarations) {
            getAllRequiresAndProvides(declaration, requiresSet, providesSet, requiresObjectSet,
                providesObjectSet);
        }

        for (require : requiresSet) {

            if (providesSet.contains(require)) {
                providesSet.remove(require)
            } else {
                var requireObject = requiresObjectSet.findFirst[it.type != null && it.type.equals(require)]
                validator.warning(
                    "Requires Definition '" + require + "' has no matching Provider Definition",
                    requireObject,
                    GraspDSLPackage.Literals::REQUIRES__TYPE
                )
            }
        }
        for (provide : providesSet) {

            var provideObject = providesObjectSet.findFirst[it.name != null && it.name.equals(provide)]
            validator.info(
                "Provider Definition '" + provide + "' has no matching Requires Definition",
                provideObject,
                GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
            )
        }

    }

    private def getAllDeclarations(ArchitectureBody architectureBody, List<Template> declarations) {
        var start = architectureBody.declarationStart;
        var end = architectureBody.declarationEnd;

        if (start != null && start.declaration != null && start.declaration.size > 0) {
            for (declaration : start.declaration) {
                if (declaration instanceof Template) {
                    declarations.add(declaration)
                }
            }
        }
        if (end != null && end.declaration != null && end.declaration.size > 0) {
            for (declaration : end.declaration) {
                if (declaration instanceof Template) {
                    declarations.add(declaration)
                }
            }
        }
    }

    private def void getAllRequiresAndProvides(Template template, Set<String> requiresSet, Set<String> providesSet,
        Set<Requires> requiresObjectSet, Set<Provides> providesObjectSet) {

        var Set<Template> templateSet = new HashSet<Template>();
        templateSet.add(template);

        while (templateSet.size > 0) {

            var currentTemplate = templateSet.head;
            if (currentTemplate != null && currentTemplate.eContents != null && currentTemplate.eContents.size > 0) {
                for (content : currentTemplate.eContents) {

                    if (content instanceof Requires) {
                        requiresSet.add(content.type)
                        requiresObjectSet.add(content);
                    } else if (content instanceof Provides) {
                        providesSet.add(content.name)
                        providesObjectSet.add(content)
                    } else if (content instanceof Template) {
                        templateSet.add(content)
                    }
                }
            }
            templateSet.remove(currentTemplate)
        }
    }

}
