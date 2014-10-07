package uk.ac.standrews.graspide.tests.junittests;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent;
import uk.ac.standrews.graspide.grasp.ui.analysis.AffectedByAnalysisUtil;
import uk.ac.standrews.graspide.grasp.ui.analysis.AffectsAnalysisUtil;
import uk.ac.standrews.graspide.grasp.ui.analysis.AnalysisUtil;

/**
 * Tests the analysis utility functions
 */
@RunWith(XtextRunner.class)
@InjectWith(GraspDSLInjectorProvider.class)
@SuppressWarnings("all")
public class GraspDependencyTests {
  @Inject
  private ParseHelper<GraspSpecification> parseHelper;
  
  @Test
  public void testEmptyGetAffectedByComponents() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent2.TestInterface to testComponent1.TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      AffectedByAnalysisUtil analysisUtil = new AffectedByAnalysisUtil();
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      EList<SystemConstituent> _systemConstituent = _system.getSystemConstituent();
      final EObject testComponent1 = _systemConstituent.get(0);
      final List<LinkProviders> affectedElements = analysisUtil.getAffectedBys(testComponent1);
      int _size = affectedElements.size();
      Assert.assertEquals(_size, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGetAffectedByComponents() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent2.TestInterface to testComponent1.TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      AffectedByAnalysisUtil analysisUtil = new AffectedByAnalysisUtil();
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      final EList<SystemConstituent> systemConstituents = _system.getSystemConstituent();
      final EObject testComponent2 = systemConstituents.get(1);
      final List<LinkProviders> affectedElements = analysisUtil.getAffectedBys(testComponent2);
      int _size = affectedElements.size();
      Assert.assertEquals(_size, 1);
      SystemConstituent _get = systemConstituents.get(2);
      final Link link = ((Link) _get);
      LinkProvidersList _linkProviders = link.getLinkProviders();
      EList<LinkProviders> _providers = _linkProviders.getProviders();
      final EObject linkProvider = _providers.get(0);
      LinkProviders _get_1 = affectedElements.get(0);
      Assert.assertEquals(_get_1, linkProvider);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyAffectsComponents() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent2.TestInterface to testComponent1.TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final AffectsAnalysisUtil analysisUtil = new AffectsAnalysisUtil();
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      EList<SystemConstituent> _systemConstituent = _system.getSystemConstituent();
      final EObject testComponent2 = _systemConstituent.get(1);
      final List<LinkConsumerExpression> affectsElements = analysisUtil.getAffectsElements(testComponent2);
      int _size = affectsElements.size();
      Assert.assertEquals(_size, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAffectsComponents() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent2.TestInterface to testComponent1.TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final AffectsAnalysisUtil analysisUtil = new AffectsAnalysisUtil();
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      final EList<SystemConstituent> systemConstituents = _system.getSystemConstituent();
      final EObject testComponent1 = systemConstituents.get(0);
      final List<LinkConsumerExpression> affectsElements = analysisUtil.getAffectsElements(testComponent1);
      int _size = affectsElements.size();
      Assert.assertEquals(_size, 1);
      SystemConstituent _get = systemConstituents.get(2);
      final Link link = ((Link) _get);
      final EObject linkConsumer = link.getLinkConsumer();
      LinkConsumerExpression _get_1 = affectsElements.get(0);
      Assert.assertEquals(_get_1, linkConsumer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGetElementName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      final EList<SystemConstituent> systemConstituents = _system.getSystemConstituent();
      SystemConstituent _get = systemConstituents.get(0);
      final Component testComponent1 = ((Component) _get);
      EList<InstantiableConstituent> _instantiableConstituent = testComponent1.getInstantiableConstituent();
      final InstantiableConstituent testComponent2 = _instantiableConstituent.get(0);
      final String elementFullName = AnalysisUtil.getElementFullName(testComponent2);
      Assert.assertEquals(elementFullName, "testComponent1.testComponent2");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGetElementFromName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      final uk.ac.standrews.graspide.grasp.graspDSL.System system = _architecutrebody.getSystem();
      AnalysisUtil.setArchitectureSystem(system);
      final EObject elementFromName = AnalysisUtil.getElementFromName("testComponent1.testComponent2");
      EList<SystemConstituent> _systemConstituent = system.getSystemConstituent();
      SystemConstituent _get = _systemConstituent.get(0);
      final Component testComponent1 = ((Component) _get);
      EList<InstantiableConstituent> _instantiableConstituent = testComponent1.getInstantiableConstituent();
      final InstantiableConstituent testComponent2 = _instantiableConstituent.get(0);
      Assert.assertEquals(elementFromName, testComponent2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFindElementInComposition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate2() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate1() {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate2();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      Architecture _architecture = model.getArchitecture();
      ArchitectureBody _architecutrebody = _architecture.getArchitecutrebody();
      final uk.ac.standrews.graspide.grasp.graspDSL.System system = _architecutrebody.getSystem();
      EList<SystemConstituent> _systemConstituent = system.getSystemConstituent();
      SystemConstituent _get = _systemConstituent.get(0);
      final Component testComponent1 = ((Component) _get);
      EList<EObject> _eContents = testComponent1.eContents();
      final EObject elementInComposition = AnalysisUtil.findElementInComposition(_eContents, "testComponent2");
      EList<InstantiableConstituent> _instantiableConstituent = testComponent1.getInstantiableConstituent();
      final InstantiableConstituent testComponent2 = _instantiableConstituent.get(0);
      Assert.assertEquals(elementInComposition, testComponent2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
