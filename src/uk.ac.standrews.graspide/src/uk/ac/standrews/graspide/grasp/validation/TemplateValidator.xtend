package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.Declaration
import org.eclipse.emf.common.util.EList
import java.util.List
import uk.ac.standrews.graspide.grasp.graspDSL.Template
import java.util.ArrayList
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import java.util.Set
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import java.util.HashSet
import uk.ac.standrews.graspide.grasp.graspDSL.Requires
import uk.ac.standrews.graspide.grasp.graspDSL.Provides

/**
 * Validations for Template constructs
 */

class TemplateValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {

        this.validator = validator;
    }

    def void validateTemplatesForCycle(Template template) {
        if (template.name == null || template.superTemplate == null) {
            return
        }

        var visitedTemplateNames = newHashSet();

        var visitedConstituentNames = new HashSet<String>();

        addConstituentNames(template, visitedConstituentNames, true)
        var currentTemplate = template.superTemplate;

        while (currentTemplate != null) {

            if (currentTemplate.name != null && template.name.equals(currentTemplate.name)) {
                validator.error(
                    "Cycle exist in extends Template '" + template.name + "'",
                    GraspDSLPackage.Literals::TEMPLATE__SUPER_TEMPLATE
                )
                return;

            }

            addConstituentNames(currentTemplate, visitedConstituentNames, false)
            if(!visitedTemplateNames.add(currentTemplate.name))
                return;
            currentTemplate = currentTemplate.superTemplate;
        }
    }

    // Check for Unique Names for Templates Inheritance
    private def void addConstituentNames(Template template, HashSet<String> visitedConstituentNames,
        boolean isBaseTemplate) {
        for (constituent : template.templateConstituent) {

            if (constituent instanceof Template) {

                if (!visitedConstituentNames.add(constituent.name) && !isBaseTemplate)
                    validator.info(
                        "Redefinition of Element after Inheritance '" + constituent.name + "'",
                        constituent,
                        GraspDSLPackage.Literals::DECLARATION__NAME
                    )
            } else if (constituent instanceof uk.ac.standrews.graspide.grasp.graspDSL.Property) {
                if (!visitedConstituentNames.add(constituent.name) && !isBaseTemplate)
                    validator.info(
                        "Redefinition of Element after Inheritance '" + constituent.name + "'",
                        constituent,
                        GraspDSLPackage.Literals::PROPERTY__NAME
                    )

            } else if (constituent instanceof Provides) {
                if (!visitedConstituentNames.add(constituent.name) && !isBaseTemplate)
                    validator.info(
                        "Redefinition of Element after Inheritance '" + constituent.name + "'",
                        constituent,
                        GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
                    )
            } else if (constituent instanceof Requires) {
                if (!visitedConstituentNames.add(constituent.type)) {

                    if (isBaseTemplate) {
                        validator.error(
                            "Duplicate identifier '" + constituent.type + "'",
                            constituent,
                            GraspDSLPackage.Literals::REQUIRES__TYPE
                        )

                    } else {
                        validator.info(
                            "Redefinition of Element after Inheritance '" + constituent.type + "'",
                            constituent,
                            GraspDSLPackage.Literals::REQUIRES__TYPE
                        )
                    }

                }

            }
        }

    }

    def void validateSelfReferenceTemplates(Template template) {
        if (template.name == null || template.superTemplate == null || template.superTemplate.name == null) {
            return
        }

        if (template.name.equals(template.superTemplate.name)) {
            validator.error(
                "Template cannot Extend itself '" + template.name + "'",
                GraspDSLPackage.Literals::TEMPLATE__SUPER_TEMPLATE
            )
        }
    }

    def addTemplateUsagesInComponents(Component component, Set<String> templateSet) {
        if (component == null || component.value == null || component.value.name == null)
            return;

        templateSet.add(component.value.name)
    }

    def addTemplateUsagesInConnectors(Connector connector, Set<String> templateSet) {
        if (connector == null || connector.value == null || connector.value.name == null)
            return;

        templateSet.add(connector.value.name)
    }

    def validateTemplateUsage(DeclarationEnd declarationEnd, Set<String> templateSet) {
        var architectureBody = declarationEnd.eContainer as ArchitectureBody;

        var declarationsAtEnd = declarationEnd.declaration;
        var declarationsAtStart = architectureBody.declarationStart.declaration;

        var List<Template> templateDeclaration = new ArrayList<Template>();
        getTemplateDeclarations(declarationsAtStart, templateDeclaration)
        getTemplateDeclarations(declarationsAtEnd, templateDeclaration)

        removeInheritedTemplates(templateDeclaration)

        for (template : templateDeclaration) {

            if (template.name != null && !templateSet.contains(template.name)) {
                validator.warning(
                    "Template '" + template.name + "' is not initialised by a component or connector",
                    template,
                    GraspDSLPackage.Literals::DECLARATION__NAME
                )
            }
        }
    }

    private def void getTemplateDeclarations(EList<Declaration> declarations, List<Template> templates) {
        if (declarations != null) {
            for (declaration : declarations) {

                if (declaration instanceof Template) {
                    templates.add(declaration);
                }
            }
        }
    }

    private def void removeInheritedTemplates(List<Template> templates) {
        var List<Template> templateCopy = new ArrayList<Template>(templates);

        for (current : templateCopy) {

            var boolean foundAsSuper = false;
            var currentName = current.name;

            if (currentName != null) {

                for (template : templates) {

                    var templateName = template.name;
                    var superTemplate = template.superTemplate;
                    if (superTemplate != null && !currentName.equals(templateName) &&
                        currentName.equals(superTemplate.name))
                        foundAsSuper = true;
                }
            }

            if (foundAsSuper) {
                templates.remove(current);
            }
        }
    }

}
