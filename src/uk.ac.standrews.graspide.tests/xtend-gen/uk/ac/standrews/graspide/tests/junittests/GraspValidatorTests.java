package uk.ac.standrews.graspide.tests.junittests;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.validation.GraspValidationPreferences;

/**
 * Tests the custom semantic validations
 */
@RunWith(XtextRunner.class)
@InjectWith(GraspDSLInjectorProvider.class)
@SuppressWarnings("all")
public class GraspValidatorTests {
  @Inject
  @Extension
  private ParseHelper<GraspSpecification> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Before
  public void setUp() {
    GraspValidationPreferences.setAllValidationEnabled(true);
  }
  
  @Test
  public void testQAttributeSupportInvalid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("requirement testRequirement;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("quality_attribute testErrorQualityAttribute supports testErrorQualityAttribute;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("quality_attribute testQualityAttribute supports testErrorQualityAttribute,testRequirement;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Quality Attribute cannot support itself \'testErrorQualityAttribute\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testQAttributeNotReferenced() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("quality_attribute testQualityAttribute;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains(
        "Requirement or Quality Attribute \'testQualityAttribute\' is not supported by any Elements");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRequirementNotReferenced() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("requirement testRequirement;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Requirement or Quality Attribute \'testRequirement\' is not supported by any Elements");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTemplateextendsItself() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template baseTemplate() extends baseTemplate{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Template cannot Extend itself \'baseTemplate\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCycleinTemplate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template template1() extends template2{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template template2() extends template3{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template template3() extends template1{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Cycle exist in extends Template \'template1\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRationalenotRealized() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale testRationale(){}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(1);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Rationale \'testRationale\' is not Realized by any Elements");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRationalewithoutReasons() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale testRationale(){}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Rationale does not contain any reasons\'testRationale\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.INFO);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRationaleextendsItself() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale baseRationale() extends baseRationale{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Rationale cannot Extend itself \'baseRationale\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCycleinRationale() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale rationale1() extends rationale2{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale rationale2() extends rationale3{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rationale rationale3() extends rationale1{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(1);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Cycle exist in extends Rationale \'rationale1\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLayerOverItself() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer baseLayer over baseLayer{}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(1);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Layer cannot be Over itself \'baseLayer\'");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCycleInLayer() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer1 over layer2,layer3{}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer2 {}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer3 over layer4 {}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer4 over layer1 {}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(1);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Cycle Exists Over Layers \'layer1\' ");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.ERROR);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStrictLayeringConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer1{}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer2{}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link layer1.out to layer2.in;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Consumer \'layer1\' and Provider \'layer2\'are not conforming to strict layer constraints");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComponentNotReferenced() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent = testTemplate();");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Component \'testComponent\' is not referenced in a Link Configuration");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testConnectorNotReferenced() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("connector testConnector = testTemplate();");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Connector \'testConnector\' is not referenced in a Link Configuration");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLayerNotReferenced() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("layer layer1 {}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Layer \'layer1\' is not referenced in a Link Configuration");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkInterfaceMismatch() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires i1;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides i2;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent1 = testTemplate();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("component testComponent2 = testTemplate();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent1.i1 to testComponent2;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(3);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Consumer\'s Require Interface \'i1\' does not match with Providers Provides Interface");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRequiresInterfaceMatch() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("requires requiresInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Requires Definition \'requiresInterface\' has no matching Provider Definition");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.WARNING);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProvidesInterfaceMatch() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate(){");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("provides providesInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("system testSystem {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification grasp = this._parseHelper.parse(_builder);
      List<Issue> issues = this._validationTestHelper.validate(grasp);
      int _size = issues.size();
      boolean _greaterEqualsThan = (_size >= 1);
      Assert.assertTrue(_greaterEqualsThan);
      final Issue issue = issues.get(0);
      final String message = issue.getMessage();
      boolean _contains = message.contains("Provider Definition \'providesInterface\' has no matching Requires Definition");
      Assert.assertTrue(_contains);
      Severity _severity = issue.getSeverity();
      Assert.assertEquals(_severity, Severity.INFO);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
