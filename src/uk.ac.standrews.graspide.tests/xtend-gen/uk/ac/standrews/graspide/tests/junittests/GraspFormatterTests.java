package uk.ac.standrews.graspide.tests.junittests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;

/**
 * Tests the formatting options
 */
@RunWith(XtextRunner.class)
@InjectWith(GraspDSLInjectorProvider.class)
@SuppressWarnings("all")
public class GraspFormatterTests {
  @Inject
  @Extension
  private ParseHelper<GraspSpecification> _parseHelper;
  
  @Inject
  @Extension
  private INodeModelFormatter _iNodeModelFormatter;
  
  @Test
  public void baseArchitectureFormatting() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("architecture testArchitecture{system testSystem { }}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("architecture testArchitecture {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("system testSystem {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("}");
    this.assertFormattedEquals(_builder, _builder_1);
  }
  
  @Test
  public void testDeclarationFormatting() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("architecture testArchitecture{ requirement testrequirement; quality_attribute testQuality; template test template1(){} rationale r1(){reason supports testQuality;}system testSystem { }}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("architecture testArchitecture {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("requirement testrequirement;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("quality_attribute testQuality;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("template test template1 () {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("rationale r1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("reason supports testQuality;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("system testSystem {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("}");
    this.assertFormattedEquals(_builder, _builder_1);
  }
  
  @Test
  public void testSystemConstituentFormatting() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("architecture testArchitecture{ template testtemplate1(){} system testSystem { component testComponent = testtemplate1(); connector testConnector = testtemplate1(); link testComponent.out to testConnector.in; }}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("architecture testArchitecture {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("template testtemplate1 () {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("system testSystem {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("component testComponent = testtemplate1 ();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("connector testConnector = testtemplate1 ();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("link testComponent.out to testConnector.in;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("}");
    this.assertFormattedEquals(_builder, _builder_1);
  }
  
  @Test
  public void testNestedCompositionFormatting() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("architecture testArchitecture{ template testtemplate1(){ template testNested1() { template testNested2() {} }} system testSystem { component testComponent = testtemplate1(){ component nestedComponent1 = testtemplate1(); } connector testConnector =testtemplate1(){ connector testnestedConnector = testtemplate1(){}} link testComponent.out to testConnector.in; }}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("architecture testArchitecture {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("template testtemplate1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("template testNested1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("template testNested2 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("system testSystem {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("component testComponent = testtemplate1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("component nestedComponent1 = testtemplate1 ();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("connector testConnector = testtemplate1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("connector testnestedConnector = testtemplate1 () {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("link testComponent.out to testConnector.in;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("}");
    this.assertFormattedEquals(_builder, _builder_1);
  }
  
  public void assertFormattedEquals(final CharSequence inputSequence, final CharSequence expectedSequence) {
    try {
      GraspSpecification _parse = this._parseHelper.parse(inputSequence);
      Resource _eResource = _parse.eResource();
      final XtextResource xtextResource = ((XtextResource) _eResource);
      IParseResult _parseResult = xtextResource.getParseResult();
      final ICompositeNode graspRootNode = _parseResult.getRootNode();
      String _string = expectedSequence.toString();
      int _length = inputSequence.length();
      INodeModelFormatter.IFormattedRegion _format = this._iNodeModelFormatter.format(graspRootNode, 0, _length);
      String _formattedText = _format.getFormattedText();
      Assert.assertEquals(_string, _formattedText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
