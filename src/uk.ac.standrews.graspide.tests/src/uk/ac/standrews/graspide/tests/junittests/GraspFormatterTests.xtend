package uk.ac.standrews.graspide.tests.junittests

import com.google.inject.Inject
import org.eclipse.xtext.formatting.INodeModelFormatter
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResource
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification

import static extension org.junit.Assert.*

/**
 * Tests the formatting options
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraspDSLInjectorProvider))
class GraspFormatterTests {
	@Inject extension ParseHelper<GraspSpecification>

	@Inject extension INodeModelFormatter;

	@Test
	def void baseArchitectureFormatting() {
'''
architecture testArchitecture{system testSystem { }}
'''.assertFormattedEquals(
'''

architecture testArchitecture {
	system testSystem {
	}

}''')
}


@Test
	def void testDeclarationFormatting() {
'''
architecture testArchitecture{ requirement testrequirement; quality_attribute testQuality; template test template1(){} rationale r1(){reason supports testQuality;}system testSystem { }}
'''.assertFormattedEquals(
'''

architecture testArchitecture {
	requirement testrequirement;
	quality_attribute testQuality;
	template test template1 () {
	}

	rationale r1 () {
		reason supports testQuality;
	}

	system testSystem {
	}

}''')
}

@Test
	def void testSystemConstituentFormatting() {
'''
architecture testArchitecture{ template testtemplate1(){} system testSystem { component testComponent = testtemplate1(); connector testConnector = testtemplate1(); link testComponent.out to testConnector.in; }}
'''.assertFormattedEquals(
'''

architecture testArchitecture {
	template testtemplate1 () {
	}

	system testSystem {
		component testComponent = testtemplate1 ();
		connector testConnector = testtemplate1 ();
		link testComponent.out to testConnector.in;
	}

}''')
}


@Test
	def void testNestedCompositionFormatting() {
'''
architecture testArchitecture{ template testtemplate1(){ template testNested1() { template testNested2() {} }} system testSystem { component testComponent = testtemplate1(){ component nestedComponent1 = testtemplate1(); } connector testConnector =testtemplate1(){ connector testnestedConnector = testtemplate1(){}} link testComponent.out to testConnector.in; }}
'''.assertFormattedEquals(
'''

architecture testArchitecture {
	template testtemplate1 () {
		template testNested1 () {
			template testNested2 () {
			}

		}

	}

	system testSystem {
		component testComponent = testtemplate1 () {
			component nestedComponent1 = testtemplate1 ();
		}

		connector testConnector = testtemplate1 () {
			connector testnestedConnector = testtemplate1 () {
			}

		}

		link testComponent.out to testConnector.in;
	}

}''')
}

def void assertFormattedEquals(CharSequence inputSequence, CharSequence expectedSequence) {
		val xtextResource = inputSequence.parse.eResource as XtextResource
		val graspRootNode = (xtextResource).parseResult.rootNode
		expectedSequence.toString.assertEquals(
			graspRootNode.format(0, inputSequence.length).formattedText)
	}

}
