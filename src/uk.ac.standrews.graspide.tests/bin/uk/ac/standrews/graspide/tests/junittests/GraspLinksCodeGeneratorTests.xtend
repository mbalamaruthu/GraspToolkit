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
 * Tests the code generator for link configurations
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GraspLinksCodeGeneratorTests {

    @Inject IGenerator generatorTest
    @Inject ParseHelper<GraspSpecification> parseHelper

    @Test
    def testLinkComponentsOutandIn() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        component testComponent1 = testTemplate();
        component testComponent2 = testTemplate();
        link testComponent1.out to testComponent2.in;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(4, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java"))
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java"))
        assertEquals(
            '''
package testComponent1;

/**
 * testComponent1 interface is created in mapping to the Component element 'testComponent1'
 *
 *@generated
 */

interface testComponent1 {
    void setRequiredDependencies(testComponent2.testComponent2 testComponent2);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java").toString)

        assertEquals(
            '''
package testComponent2;

/**
 * testComponent2 interface is created in mapping to the Component element 'testComponent2'
 *
 *@generated
 */

public interface testComponent2 {

}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java").toString)
    }

    @Test
    def testLinkComponentsRequiresandProvides() {
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

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(4, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/TestInterface.java"))
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java"))
        assertEquals(
            '''
package testComponent1;

/**
 * TestInterface interface is created in mapping to the Provides element 'testComponent1.TestInterface'
 *
 *@generated
 */

public interface TestInterface {

}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/TestInterface.java").toString)

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
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java").toString)
    }

    @Test
    def testLinkComponentsEmpty() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        component testComponent1 = testTemplate();
        component testComponent2 = testTemplate();
        link testComponent1 to testComponent2;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(4, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java"))
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java"))
        assertEquals(
            '''
package testComponent1;

/**
 * testComponent1 interface is created in mapping to the Component element 'testComponent1'
 *
 *@generated
 */

interface testComponent1 {
    void setRequiredDependencies(testComponent2.testComponent2 testComponent2);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java").toString)

        assertEquals(
            '''
package testComponent2;

/**
 * testComponent2 interface is created in mapping to the Component element 'testComponent2'
 *
 *@generated
 */

public interface testComponent2 {

}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java").toString)
    }

    @Test
    def testLinkComponentsEmptyMultipleProvides() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        component testComponent1 = testTemplate();
        component testComponent2 = testTemplate();
        component testComponent3 = testTemplate();
        link testComponent1 to testComponent2,testComponent3;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(6, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java"))
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java"))
        assertEquals(
            '''
package testComponent1;

/**
 * testComponent1 interface is created in mapping to the Component element 'testComponent1'
 *
 *@generated
 */

interface testComponent1 {
    void setRequiredDependencies(testComponent2.testComponent2 testComponent2, testComponent3.testComponent3 testComponent3);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java").toString)
    }

    @Test
    def testLinkComponentsOutMultipleIns() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        component testComponent1 = testTemplate();
        component testComponent2 = testTemplate();
        component testComponent3 = testTemplate();
        link testComponent1.out to testComponent2.in,testComponent3.in;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(6, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java"))
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/testComponent2.java"))
        assertEquals(
            '''
package testComponent1;

/**
 * testComponent1 interface is created in mapping to the Component element 'testComponent1'
 *
 *@generated
 */

interface testComponent1 {
    void setRequiredDependencies(testComponent2.testComponent2 testComponent2, testComponent3.testComponent3 testComponent3);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent1/testComponent1.java").toString)
    }

    @Test
    def testLinkComponentsRequiresandMultipleProvides() {
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
        component testComponent3 = testTemplate1();
        link testComponent2.TestInterface to testComponent1.TestInterface,testComponent3.TestInterface;
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(6, fileSystem.files.size)
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
    void setRequiredDependencies(testComponent1.TestInterface testInterface, testComponent3.TestInterface testInterface);
}
          '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent2/TestInterface.java").toString)
    }
}
