package uk.ac.standrews.graspide.tests.junitplugintests;

import org.junit.Test;
import uk.ac.standrews.graspide.grasp.GraspDSLUiInjectorProvider;

import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import java.util.ArrayList;
import java.util.List;

/**
 * Tests for the custom proposal providers
 */
@SuppressWarnings("all")
public class GraspContentAssistTests extends AbstractContentAssistProcessorTest {
    public GraspContentAssistTests() {

    }

    @Test
    public void testEmptyProgramProposals() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup()).assertText("@", "Architecture - Architecture",
                "architecture");
    }

    @Test
    public void testQAttributeSupportAssistisWithoutSelf() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ requirement testrequirement; quality_attribute testQuality supports ")
                .assertText("testrequirement")
                .append("testrequirement; quality_attribute testQualitySelf supports ")
                .assertText("testrequirement", "testQuality")
                .append("testQuality");
    }

    @Test
    public void testSuperRationaleAssistisWithoutSelf() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ rationale r1() {} rationale r2() extends ")
                .assertText("r1").append("r1 {}");

    }

    @Test
    public void testSuperLayerAssistisWithoutSelf() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ system testSystem { layer base {} layer derived over ")
                .assertText("base").append("base {}");
    }

    @Test
    public void testSuperTemplateAssistisWithoutSelf() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){} template derivedTemplate() extends ")
                .assertText("baseTemplate").append("baseTemplate {}");
    }

    @Test
    public void testLinkKeywordProposalProActive() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){} system testSystem { ")
                .assertText("@", "Component - Simple Component Statement",
                        "Connector - Simple Connector Statement",
                        "Layer - Simple Layer Statement", "check", "component",
                        "connector", "layer", "}")
                .append("component testcomponent = baseTemplate(); ")
                .assertText("@", "Component - Simple Component Statement",
                        "Connector - Simple Connector Statement",
                        "Layer - Simple Layer Statement", "check", "component",
                        "connector", "layer", "}")
                .append("component testcomponent2 = baseTemplate(); ")
                .assertText("@", "Component - Simple Component Statement",
                        "Connector - Simple Connector Statement",
                        "Layer - Simple Layer Statement", "check", "component",
                        "connector", "layer", "link", "}");
    }

    @Test
    public void testLinkConsumerProposal() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){} system testSystem { component testcomponent = baseTemplate(); component testcomponent2 = baseTemplate(); layer layer1 {} link ")
                .assertText("Type", "testcomponent", "testcomponent2", "layer1");

    }

    @Test
    public void testLinkConsumerRightProposal() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){ provides provideInterface;requires requireInterface; } system testSystem { component testcomponent = baseTemplate(){component nestedcomponent = baseTemplate();}link linkType testcomponent. ")
                .assertText("nestedcomponent", "requireInterface", "out",
                        "rightConsumer");

    }

    @Test
    public void testLinkProviderProposal() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){} system testSystem {component testcomponent = baseTemplate(); component testcomponent2 = baseTemplate(); layer layer1 {} link testcomponent.out to ")
                .assertText("testcomponent", "testcomponent2", "layer1");

    }

    @Test
    public void testLinkProviderRightProposal() throws Exception {
        List<String> proposals = new ArrayList<String>();
        super.setUp();
        newBuilder(doGetSetup())
                .append("architecture testArchitecture{ template baseTemplate(){ provides provideInterface;requires requireInterface; } system testSystem { component testcomponent = baseTemplate(){component nestedcomponent = baseTemplate();}link linkType testcomponent.out to testcomponent. ")
                .assertText("nestedcomponent", "provideInterface", "in",
                        "rightProvider");

    }

    @Override
    public ISetup doGetSetup() {
        return new ISetup() {

            public Injector createInjectorAndDoEMFRegistration() {
                return new GraspDSLUiInjectorProvider().getInjector();
            }
        };
    }
}
