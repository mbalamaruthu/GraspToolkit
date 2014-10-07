package uk.ac.standrews.graspide.tests.junittests

import com.google.inject.Inject
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification

import static org.junit.Assert.*
import uk.ac.standrews.graspide.grasp.validation.GraspValidationPreferences
import org.junit.Before

/**
 * Tests the custom semantic validations
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GraspValidatorTests {

    @Inject extension ParseHelper<GraspSpecification>
    @Inject extension ValidationTestHelper


    @Before
    def public void setUp() {
        GraspValidationPreferences.setAllValidationEnabled(true);
    }

    @Test
    def void testQAttributeSupportInvalid() {

        val grasp = '''
architecture testArchitecture
{
    requirement testRequirement;
    quality_attribute testErrorQualityAttribute supports testErrorQualityAttribute;
    quality_attribute testQualityAttribute supports testErrorQualityAttribute,testRequirement;
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Quality Attribute cannot support itself 'testErrorQualityAttribute'"))

        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testQAttributeNotReferenced() {
        val grasp = '''
architecture testArchitecture
{
    quality_attribute testQualityAttribute;
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue(
            (message).contains(
                "Requirement or Quality Attribute 'testQualityAttribute' is not supported by any Elements"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testRequirementNotReferenced() {
        val grasp = '''
architecture testArchitecture
{
    requirement testRequirement;
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue(
            (message).contains("Requirement or Quality Attribute 'testRequirement' is not supported by any Elements"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testTemplateextendsItself() {
        val grasp = '''
architecture testArchitecture
{
    template baseTemplate() extends baseTemplate{}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Template cannot Extend itself 'baseTemplate'"))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testCycleinTemplate() {
        val grasp = '''
architecture testArchitecture
{
    template template1() extends template2{}
    template template2() extends template3{}
    template template3() extends template1{}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Cycle exist in extends Template 'template1'"))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testRationalenotRealized() {
        val grasp = '''
architecture testArchitecture
{
    rationale testRationale(){}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(1)

        val message = issue.message
        assertTrue((message).contains("Rationale 'testRationale' is not Realized by any Elements"))

        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testRationalewithoutReasons() {
        val grasp = '''
architecture testArchitecture
{
    rationale testRationale(){}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Rationale does not contain any reasons'testRationale'"))

        assertEquals(issue.severity, Severity.INFO)
    }

    @Test
    def void testRationaleextendsItself() {
        val grasp = '''
architecture testArchitecture
{
    rationale baseRationale() extends baseRationale{}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Rationale cannot Extend itself 'baseRationale'"))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testCycleinRationale() {
        val grasp = '''
architecture testArchitecture
{
    rationale rationale1() extends rationale2{}
    rationale rationale2() extends rationale3{}
    rationale rationale3() extends rationale1{}
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(1)

        val message = issue.message
        assertTrue((message).contains("Cycle exist in extends Rationale 'rationale1'"))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testLayerOverItself() {
        val grasp = '''
architecture testArchitecture
{

    system testSystem {
        layer baseLayer over baseLayer{}
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(1)

        val message = issue.message
        assertTrue((message).contains("Layer cannot be Over itself 'baseLayer'"))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testCycleInLayer() {
        val grasp = '''
architecture testArchitecture
{

    system testSystem {
        layer layer1 over layer2,layer3{}
        layer layer2 {}
        layer layer3 over layer4 {}
        layer layer4 over layer1 {}
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(1)

        val message = issue.message
        assertTrue((message).contains("Cycle Exists Over Layers 'layer1' "))

        assertEquals(issue.severity, Severity.ERROR)
    }

    @Test
    def void testStrictLayeringConstraint() {
        val grasp = '''
architecture testArchitecture
{

    system testSystem {
        layer layer1{}

        layer layer2{}

        link layer1.out to layer2.in;
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue(
            (message).contains("Consumer 'layer1' and Provider 'layer2'are not conforming to strict layer constraints"))

        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testComponentNotReferenced() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){}
    system testSystem {
        component testComponent = testTemplate();
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Component 'testComponent' is not referenced in a Link Configuration"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testConnectorNotReferenced() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){}
    system testSystem {
        connector testConnector = testTemplate();
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Connector 'testConnector' is not referenced in a Link Configuration"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testLayerNotReferenced() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){}
    system testSystem {
        layer layer1 {}
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Layer 'layer1' is not referenced in a Link Configuration"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testLinkInterfaceMismatch() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){
        requires i1;
        provides i2;
    }
    system testSystem {
        component testComponent1 = testTemplate();
        component testComponent2 = testTemplate();
        link testComponent1.i1 to testComponent2;
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(3)

        val message = issue.message
        assertTrue(
            (message).contains("Consumer's Require Interface 'i1' does not match with Providers Provides Interface"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testRequiresInterfaceMatch() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){
        requires requiresInterface;
    }
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Requires Definition 'requiresInterface' has no matching Provider Definition"))
        assertEquals(issue.severity, Severity.WARNING)
    }

    @Test
    def void testProvidesInterfaceMatch() {
        val grasp = '''
architecture testArchitecture
{
    template testTemplate(){
        provides providesInterface;
    }
    system testSystem {
    }
}
'''.parse

        var issues = grasp.validate
        assertTrue(issues.size >= 1)
        val issue = issues.get(0)

        val message = issue.message
        assertTrue((message).contains("Provider Definition 'providesInterface' has no matching Requires Definition"))
        assertEquals(issue.severity, Severity.INFO)
    }

}
