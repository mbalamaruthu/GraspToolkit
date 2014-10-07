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
 * Tests the code generator for Components, Connectors and Layers in a System construct.
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GeneratorTest {

    @Inject IGenerator generatorTest
    @Inject ParseHelper<GraspSpecification> parseHelper

    @Test
    def testEmptyConnectorFileGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        connector testConnector = testTemplate();
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
 *@generated
 */

package testConnector;
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/package-info.java").toString)
    }

    @Test
    def testProvideConnectorGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
        provides TestProvide;
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
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/package-info.java"))
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/TestProvide.java"))

        assertEquals(
            '''
package testConnector;

/**
 * TestProvide interface is created in mapping to the Provides element 'testConnector.TestProvide'
 *
 *@generated
 */

public interface TestProvide {

}
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testConnector/TestProvide.java").toString)
    }

    @Test
    def testEmptyComponentFileGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        connector testComponent = testTemplate();
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
 * testComponent package is created in mapping to the Connector element 'testComponent'
 *
 *@generated
 */

package testComponent;
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/package-info.java").toString)

    }

    @Test
    def testProvideComponentGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
        provides TestProvide;
    }
    system testSystem {
        connector testComponent = testTemplate();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(2, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/package-info.java"))
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/TestProvide.java"))
        assertEquals(
            '''
package testComponent;

/**
 * TestProvide interface is created in mapping to the Provides element 'testComponent.TestProvide'
 *
 *@generated
 */

public interface TestProvide {

}
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/TestProvide.java").toString)

    }

    @Test
    def testLayerFileGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
    }
    system testSystem {
        layer testLayer {
            connector testConnector = testTemplate();
        }
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(2, fileSystem.files.size)
        assertTrue(fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testLayer/package-info.java"))
        assertEquals(
            '''
/**
 * testLayer package is created in mapping to the Layer element 'testLayer'
 *
 *@generated
 */

package testLayer;
            '''.
                toString, fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testLayer/package-info.java").toString)
    }

    @Test
    def testTemplateInheritanceGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testSuperTemplate() {
        provides TestSuperProvide;
    }
    template testTemplate() extends testSuperTemplate{
    }
    system testSystem {
            component testComponent = testTemplate();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(2, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/TestSuperProvide.java"))
        assertEquals(
            '''
package testComponent;

/**
 * TestSuperProvide interface is created in mapping to the Provides element 'testComponent.TestSuperProvide'
 *
 *@generated
 */

public interface TestSuperProvide {

}
            '''.
                toString,
            fileSystem.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/TestSuperProvide.java").toString)
    }

    @Test
    def testTemplateEmptyCompositionGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
        template testComposedTemplate() {
        }
    }
    system testSystem {
            component testComponent = testTemplate();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(2, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(
                IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/testComposedTemplate/package-info.java"))
        assertEquals(
            '''
/**
 * testComponent.testComposedTemplate package is created in mapping to the Template element 'testComponent.testComposedTemplate'
 *
 *@generated
 */

package testComponent.testComposedTemplate;
          '''.
                toString,
            fileSystem.files.get(
                IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/testComposedTemplate/package-info.java").toString)
    }

    @Test
    def testTemplateProvideCompositionGenerator() {
        val model = parseHelper.parse(
            '''
architecture testArchitecture
{
    template testTemplate() {
        template testComposedTemplate() {
            provides TestProvide;
        }
    }
    system testSystem {
            component testComponent = testTemplate();
    }
}
        ''')

        val fileSystem = new InMemoryFileSystemAccess()
        generatorTest.doGenerate(model.eResource, fileSystem)
        println(fileSystem.files)
        assertEquals(3, fileSystem.files.size)
        assertTrue(
            fileSystem.files.containsKey(
                IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/testComposedTemplate/TestProvide.java"))
        assertEquals(
            '''
package testComponent.testComposedTemplate;

/**
 * TestProvide interface is created in mapping to the Provides element 'testComponent.testComposedTemplate.TestProvide'
 *
 *@generated
 */

public interface TestProvide {

}
          '''.
                toString,
            fileSystem.files.get(
                IFileSystemAccess::DEFAULT_OUTPUT + "testComponent/testComposedTemplate/TestProvide.java").toString)
    }

}
