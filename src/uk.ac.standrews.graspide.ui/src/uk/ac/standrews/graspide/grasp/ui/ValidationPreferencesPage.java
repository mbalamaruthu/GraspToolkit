package uk.ac.standrews.graspide.grasp.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

/**
 * Validations Preference Page Component
 *
 */
public class ValidationPreferencesPage extends LanguageRootPreferencePage {

    private static final String DEFAULT_VALIDATIONS = "DefaultValidations";
    private static final String EXPENSIVE_VALIDATIONS = "ExpensiveValidations";
    private Composite defaultComposite, onDemandComposite;
    private BooleanFieldEditor expensiveFieldEditor, defaultFieldEditor;
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        super.propertyChange(event);
       Object source = event.getSource();
       Object newValue = event.getNewValue();
       if(source instanceof BooleanFieldEditor && newValue instanceof Boolean){
           checkComposites(source, newValue);
       }

    }

    public void checkComposites(Object source, Object newValue) {
        Boolean value = (Boolean)newValue;
           BooleanFieldEditor editor = (BooleanFieldEditor)source;
           final String preferenceName = editor.getPreferenceName();
        if(preferenceName.equalsIgnoreCase(DEFAULT_VALIDATIONS)){
            if(value){
                enableCompositeElements(defaultComposite);
            } else {
                disableCompositeElements(defaultComposite);
            }

        } else if (preferenceName.equalsIgnoreCase(EXPENSIVE_VALIDATIONS)){
            if(value){
                enableCompositeElements(onDemandComposite);
            } else {
                disableCompositeElements(onDemandComposite);
            }
        }
    }

    private void disableCompositeElements(Composite composite) {
        Control[] controls = composite.getChildren();
        for(int i =1; i < controls.length; i++){
            controls[i].setEnabled(false);
        }
    }

    private void enableCompositeElements(Composite composite) {
        Control[] controls = composite.getChildren();
        for(int i =1; i < controls.length; i++){
            controls[i].setEnabled(true);
        }

    }

    @Override
    protected void performDefaults() {
        super.performDefaults();
        enableCompositeElements(defaultComposite);
        enableCompositeElements(onDemandComposite);
    }

    @Override
    protected void createFieldEditors() {
        super.createFieldEditors();

        GridLayout layout = new GridLayout(1, false);

        Composite parent = getFieldEditorParent();
        Group defaultGroup = new Group(parent, SWT.SHADOW_IN);
        defaultGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        defaultGroup.setText("Default Validations");

        defaultGroup.setLayout(layout);
        defaultComposite = new Composite(defaultGroup, SWT.NONE);

        addDefaultValidations(defaultComposite);

        defaultGroup.pack();

        Group onDemandGroup = new Group(parent, SWT.SHADOW_IN);
        onDemandGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        onDemandGroup.setText("OnDemand Validations");
        onDemandGroup.setLayout(layout);
        onDemandComposite = new Composite(onDemandGroup, SWT.NONE);
        addOndemandValidations(onDemandComposite);

        onDemandGroup.pack();

        checkComposites(defaultFieldEditor, getPreferenceStore().getBoolean(DEFAULT_VALIDATIONS));
        checkComposites(expensiveFieldEditor, getPreferenceStore().getBoolean(EXPENSIVE_VALIDATIONS));
    }

    private void addOndemandValidations(Composite onDemandComposite) {

        expensiveFieldEditor = new BooleanFieldEditor(EXPENSIVE_VALIDATIONS,
                "ENABLE ALL ONDEMAND VALIDATIONS", onDemandComposite);
        addField(expensiveFieldEditor);

        addField(new BooleanFieldEditor("validateComponentReferences",
                "Components should be referenced in a link configuration", onDemandComposite));
        addField(new BooleanFieldEditor("validateConnectorReferences",
                "Connectors should be referenced in a link configuration", onDemandComposite));

        addField(new BooleanFieldEditor("validateRequiresAndProvides",
                "Require interface should have a matching Provide interface", onDemandComposite));
        addField(new BooleanFieldEditor("validateRequires",
                "All Require interfaces of a component or connector should be satisfied with a configuration", onDemandComposite));
        addField(new BooleanFieldEditor("validateLinkForInterfaceMatch",
                "Link Configuration's provider and consumer interfaces (Names) should match", onDemandComposite));

        addField(new BooleanFieldEditor("validateTemplatesForCycle",
                "Template should not have a cycle in inheritance", onDemandComposite));
        addField(new BooleanFieldEditor("validateTemplateUsage",
                "Template should be initialised by a component or connector", onDemandComposite));

        addField(new BooleanFieldEditor("validateQualityReqUsages",
                "Quality attribute or Requirement should be supported by a quality Attribute or Rationale's reason", onDemandComposite));
        addField(new BooleanFieldEditor("validateQattributeSupport",
                "Quality attribute may not support itself", onDemandComposite));
        addField(new BooleanFieldEditor("validateDuplicateRequirementsSupport",
                "Quality attribute's supported elements may not have duplicates", onDemandComposite));
        addField(new BooleanFieldEditor("validateDuplicateRequirementsInhibits",
                "Quality attribute's inhibited elements may not have duplicates", onDemandComposite));

        addField(new BooleanFieldEditor("validateReasons",
                "Reason may not support and inhibit the same Requirement or Quality attribute", onDemandComposite));

        addField(new BooleanFieldEditor("validateRationaleUsages",
                "Rationale may need to be realized by an architecture element", onDemandComposite));
        addField(new BooleanFieldEditor("validateEmptyRationales",
                "Rationale may need to contain a reason", onDemandComposite));
        addField(new BooleanFieldEditor("validatorRationaleForcycle",
                "Rationales should not have a cycle in inheritance", onDemandComposite));

        addField(new BooleanFieldEditor("validateLinkForLayerConstraints",
                "Layers should follow strict layering constraints in a link configuration", onDemandComposite));
        addField(new BooleanFieldEditor("validateLayerReference",
                "Layer may need to be configured with another layer", onDemandComposite));
        addField(new BooleanFieldEditor("validateLayersForCycles",
                "Layer over other layers should not cause a cycle", onDemandComposite));
    }

    private void addDefaultValidations(Composite defaultComposite) {
        defaultFieldEditor = new BooleanFieldEditor(DEFAULT_VALIDATIONS,
                "ENABLE ALL DEFAULT VALIDATIONS", defaultComposite);
        addField(defaultFieldEditor);

        addField(new BooleanFieldEditor("validateSelfReferenceTemplates",
                "Template should not extend itself", defaultComposite));
        addField(new BooleanFieldEditor("validateSelfReferenceRationale",
                "Rationale  should not extend itself", defaultComposite));
        addField(new BooleanFieldEditor("validateSelfReferenceLayers",
                "Layer  should not be over itself", defaultComposite));
    }
    @Override
    public void init(IWorkbench workbench) {
        super.init(workbench);
        getPreferenceStore().setDefault(EXPENSIVE_VALIDATIONS, true);
        getPreferenceStore().setDefault("validateComponentReferences", true);
        getPreferenceStore().setDefault("validateConnectorReferences", true);
        getPreferenceStore().setDefault("validateLinkForLayerConstraints", true);
        getPreferenceStore().setDefault("validateRequiresAndProvides", true);
        getPreferenceStore().setDefault("validateRequires", true);
        getPreferenceStore().setDefault("validateLinkForInterfaceMatch", true);
        getPreferenceStore().setDefault("validateTemplatesForCycle", true);
        getPreferenceStore().setDefault("validateTemplateUsage", true);
        getPreferenceStore().setDefault("validateQualityReqUsages", true);
        getPreferenceStore().setDefault("validateQattributeSupport", true);
        getPreferenceStore().setDefault("validateDuplicateRequirementsSupport", true);
        getPreferenceStore().setDefault("validateDuplicateRequirementsInhibits", true);
        getPreferenceStore().setDefault("validateReasons", true);
        getPreferenceStore().setDefault("validateRationaleUsages", true);
        getPreferenceStore().setDefault("validateEmptyRationales", true);
        getPreferenceStore().setDefault("validatorRationaleForcycle", true);
        getPreferenceStore().setDefault("validateLayerReference", true);
        getPreferenceStore().setDefault("validateLayersForCycles", true);
        getPreferenceStore().setDefault(DEFAULT_VALIDATIONS, true);
        getPreferenceStore().setDefault("validateSelfReferenceTemplates", true);
        getPreferenceStore().setDefault("validateSelfReferenceRationale", true);
        getPreferenceStore().setDefault("validateSelfReferenceLayers", true);
    }

}
