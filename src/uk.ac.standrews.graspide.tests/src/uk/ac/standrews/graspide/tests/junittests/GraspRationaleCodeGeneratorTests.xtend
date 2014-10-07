package uk.ac.standrews.graspide.tests.junittests

import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import static org.junit.Assert.*
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification

/**
 * Tests the code generator for Rationale specifications
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GraspRationaleCodeGeneratorTests {

    @Inject IGenerator generatorTest
    @Inject ParseHelper<GraspSpecification> parseHelper

    @Test
    def testConnectorRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }

    template testTemplate() {
    }
    system testSystem {
        connector testConnector = testTemplate() because testRationale();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(1, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/package-info.java"))
        assertEquals(
            '''
/**
 * testConnector package is created in mapping to the Connector element 'testConnector'
 *
 * Rationale for mapped element is testRationale
 *
 *@generated
 */

package testConnector;
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/package-info.java").toString)
    }

    @Test
    def testComponentRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }

    template testTemplate() {
    }
    system testSystem {
        component testComponent = testTemplate() because testRationale();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(1, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/package-info.java"))
        assertEquals(
            '''
/**
 * testComponent package is created in mapping to the Component element 'testComponent'
 *
 * Rationale for mapped element is testRationale
 *
 *@generated
 */

package testComponent;
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/package-info.java").toString)
    }

    @Test
    def testLayerRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }

    system testSystem {
        layer testLayer because testRationale() {
        }
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(1, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testLayer/package-info.java"))
        assertEquals(
            '''
/**
 * testLayer package is created in mapping to the Layer element 'testLayer'
 *
 * Rationale for mapped element is testRationale
 *
 *@generated
 */

package testLayer;
            '''.
                toString, fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testLayer/package-info.java").toString)
    }

    @Test
    def testProvidesRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }

    template testTemplate() {
        provides TestInterface because testRationale();
    }
    system testSystem {
        connector testConnector = testTemplate();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(2, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/TestInterface.java"))
        assertEquals(
            '''
package testConnector;

/**
 * TestInterface interface is created in mapping to the Provides element 'testConnector.TestInterface'
 *
 * Rationale for mapped element is testRationale
 *
 *@generated
 */

public interface TestInterface {

}
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/TestInterface.java").toString)
    }

    @Test
    def testLinkRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface;
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface because testRationale();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(4, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/TestInterface.java"))
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java"))
        assertEquals(
            '''
package testComponent2;

/**
 * TestInterface interface is created in mapping to the Requires element 'testComponent2.TestInterface'
 *
 *@generated
 */

interface TestInterface {
    void setRequiredDependencies(testComponent1.TestInterface testInterface);
    // Rationale for the Configuration is testRationale
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java").toString)
    }

    @Test
    def testRequiresRationaleGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    rationale testRationale() {
        reason '#testReason';
    }
    template testTemplate1() {
        provides TestInterface;
    }
    template testTemplate2() {
        requires TestInterface because testRationale();
    }
    system testSystem {
        component testComponent1 = testTemplate1();
        component testComponent2 = testTemplate2();
        link testComponent2.TestInterface to testComponent1.TestInterface;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(4, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/TestInterface.java"))
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java"))
        assertEquals(
            '''
package testComponent2;

/**
 * TestInterface interface is created in mapping to the Requires element 'testComponent2.TestInterface'
 *
 * Rationale for require Interface is testRationale
 *
 *@generated
 */

interface TestInterface {
    void setRequiredDependencies(testComponent1.TestInterface testInterface);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java").toString)
    }

}
