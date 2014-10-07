package uk.ac.standrews.graspide.tests.junittests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.ui.analysis.AffectedByAnalysisUtil
import uk.ac.standrews.graspide.grasp.ui.analysis.AffectsAnalysisUtil
import uk.ac.standrews.graspide.grasp.ui.analysis.AnalysisUtil

import static org.junit.Assert.*

/**
 * Tests the analysis utility functions
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GraspDependencyTests {

    @Inject ParseHelper<GraspSpecification> parseHelper

    @Test
    def testEmptyGetAffectedByComponents() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface;
    }
}
        ''')

        var AffectedByAnalysisUtil analysisUtil = new AffectedByAnalysisUtil();
        val EObject testComponent1 = model.architecture.architecutrebody.system.systemConstituent.get(0)
        val affectedElements = analysisUtil.getAffectedBys(testComponent1)

        assertEquals(affectedElements.size, 0);
    }

    @Test
    def testGetAffectedByComponents() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface;
    }
}
        ''')

        var AffectedByAnalysisUtil analysisUtil = new AffectedByAnalysisUtil();
        val systemConstituents = model.architecture.architecutrebody.system.systemConstituent
        val EObject testComponent2 = (systemConstituents).get(1)
        val affectedElements = analysisUtil.getAffectedBys(testComponent2)

        assertEquals(affectedElements.size, 1);
        val Link link = (systemConstituents).get(2) as Link

        val EObject linkProvider = link.linkProviders.providers.get(0);
        assertEquals(affectedElements.get(0), linkProvider);

    }

    @Test
    def testEmptyAffectsComponents() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface;
    }
}
        ''')

        val analysisUtil = new AffectsAnalysisUtil();
        val EObject testComponent2 = model.architecture.architecutrebody.system.systemConstituent.get(1)
        val affectsElements = analysisUtil.getAffectsElements(testComponent2)

        assertEquals(affectsElements.size, 0);
    }

    @Test
    def testAffectsComponents() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface;
    }
}
        ''')

        val analysisUtil = new AffectsAnalysisUtil();
        val systemConstituents = model.architecture.architecutrebody.system.systemConstituent

        val EObject testComponent1 = systemConstituents.get(0)
        val affectsElements = analysisUtil.getAffectsElements(testComponent1)

        assertEquals(affectsElements.size, 1);

        val Link link = (systemConstituents).get(2) as Link

        val EObject linkConsumer = link.linkConsumer
        assertEquals(affectsElements.get(0), linkConsumer);
    }

    @Test
    def testGetElementName() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1() {
        component testComponent2 = testTemplate2();
        }
    }
}
        ''')

        val systemConstituents = model.architecture.architecutrebody.system.systemConstituent

        val testComponent1 = systemConstituents.get(0) as Component
        val testComponent2 = testComponent1.instantiableConstituent.get(0)
        val elementFullName = AnalysisUtil.getElementFullName(testComponent2)

        assertEquals(elementFullName, "testComponent1.testComponent2");
    }

    @Test
    def testGetElementFromName() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1() {
        component testComponent2 = testTemplate2();
        }
    }
}
        ''')

        val system = model.architecture.architecutrebody.system
        AnalysisUtil.setArchitectureSystem(system)

        val elementFromName = AnalysisUtil.getElementFromName("testComponent1.testComponent2")

        val testComponent1 = system.systemConstituent.get(0) as Component
        val testComponent2 = testComponent1.instantiableConstituent.get(0)

        assertEquals(elementFromName, testComponent2);
    }

    @Test
    def testFindElementInComposition() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1() {
        component testComponent2 = testTemplate2();
        }
    }
}
        ''')

        val system = model.architecture.architecutrebody.system
        val testComponent1 = system.systemConstituent.get(0) as Component

        val elementInComposition = AnalysisUtil.findElementInComposition(testComponent1.eContents, "testComponent2")

        val testComponent2 = testComponent1.instantiableConstituent.get(0)

        assertEquals(elementInComposition, testComponent2);
    }

}
