package uk.ac.standrews.graspide.tests.junittests;

import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.standrews.graspide.grasp.GraspDSLInjectorProvider;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;

/**
 * Tests the code generator for link configurations
 */
@RunWith(XtextRunner.class)
@InjectWith(GraspDSLInjectorProvider.class)
@SuppressWarnings("all")
public class GraspLinksCodeGeneratorTests {
  @Inject
  private IGenerator generatorTest;
  
  @Inject
  private ParseHelper<GraspSpecification> parseHelper;
  
  @Test
  public void testLinkComponentsOutandIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate() {");
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
      _builder.append("link testComponent1.out to testComponent2.in;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(4, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      Assert.assertTrue(_containsKey);
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      boolean _containsKey_1 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent1;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* testComponent1 interface is created in mapping to the Component element \'testComponent1\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("interface testComponent1 {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("void setRequiredDependencies(testComponent2.testComponent2 testComponent2);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_4 = fileSystem.getFiles();
      CharSequence _get = _files_4.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package testComponent2;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("/**");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* testComponent2 interface is created in mapping to the Component element \'testComponent2\'");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*@generated");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*/");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("public interface testComponent2 {");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      String _string_2 = _builder_2.toString();
      Map<String,CharSequence> _files_5 = fileSystem.getFiles();
      CharSequence _get_1 = _files_5.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      String _string_3 = _get_1.toString();
      Assert.assertEquals(_string_2, _string_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkComponentsRequiresandProvides() {
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
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(4, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/TestInterface.java"));
      Assert.assertTrue(_containsKey);
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      boolean _containsKey_1 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/TestInterface.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent1;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* TestInterface interface is created in mapping to the Provides element \'testComponent1.TestInterface\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public interface TestInterface {");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_4 = fileSystem.getFiles();
      CharSequence _get = _files_4.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/TestInterface.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package testComponent2;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("/**");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* TestInterface interface is created in mapping to the Requires element \'testComponent2.TestInterface\'");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*@generated");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*/");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("interface TestInterface {");
      _builder_2.newLine();
      _builder_2.append("    ");
      _builder_2.append("void setRequiredDependencies(testComponent1.TestInterface testInterface);");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      String _string_2 = _builder_2.toString();
      Map<String,CharSequence> _files_5 = fileSystem.getFiles();
      CharSequence _get_1 = _files_5.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/TestInterface.java"));
      String _string_3 = _get_1.toString();
      Assert.assertEquals(_string_2, _string_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkComponentsEmpty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate() {");
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
      _builder.append("link testComponent1 to testComponent2;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(4, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      Assert.assertTrue(_containsKey);
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      boolean _containsKey_1 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent1;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* testComponent1 interface is created in mapping to the Component element \'testComponent1\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("interface testComponent1 {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("void setRequiredDependencies(testComponent2.testComponent2 testComponent2);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_4 = fileSystem.getFiles();
      CharSequence _get = _files_4.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package testComponent2;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("/**");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* testComponent2 interface is created in mapping to the Component element \'testComponent2\'");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*@generated");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*/");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("public interface testComponent2 {");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      String _string_2 = _builder_2.toString();
      Map<String,CharSequence> _files_5 = fileSystem.getFiles();
      CharSequence _get_1 = _files_5.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      String _string_3 = _get_1.toString();
      Assert.assertEquals(_string_2, _string_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkComponentsEmptyMultipleProvides() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate() {");
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
      _builder.append("component testComponent3 = testTemplate();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent1 to testComponent2,testComponent3;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(6, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      Assert.assertTrue(_containsKey);
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      boolean _containsKey_1 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent1;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* testComponent1 interface is created in mapping to the Component element \'testComponent1\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("interface testComponent1 {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("void setRequiredDependencies(testComponent2.testComponent2 testComponent2, testComponent3.testComponent3 testComponent3);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_4 = fileSystem.getFiles();
      CharSequence _get = _files_4.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkComponentsOutMultipleIns() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("architecture testArchitecture");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("template testTemplate() {");
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
      _builder.append("component testComponent3 = testTemplate();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent1.out to testComponent2.in,testComponent3.in;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(6, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      Assert.assertTrue(_containsKey);
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      boolean _containsKey_1 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/testComponent2.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent1;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* testComponent1 interface is created in mapping to the Component element \'testComponent1\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("interface testComponent1 {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("void setRequiredDependencies(testComponent2.testComponent2 testComponent2, testComponent3.testComponent3 testComponent3);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_4 = fileSystem.getFiles();
      CharSequence _get = _files_4.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent1/testComponent1.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLinkComponentsRequiresandMultipleProvides() {
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
      _builder.append("component testComponent3 = testTemplate1();");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("link testComponent2.TestInterface to testComponent1.TestInterface,testComponent3.TestInterface;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final GraspSpecification model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fileSystem = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.generatorTest.doGenerate(_eResource, fileSystem);
      Map<String,CharSequence> _files = fileSystem.getFiles();
      InputOutput.<Map<String,CharSequence>>println(_files);
      Map<String,CharSequence> _files_1 = fileSystem.getFiles();
      int _size = _files_1.size();
      Assert.assertEquals(6, _size);
      Map<String,CharSequence> _files_2 = fileSystem.getFiles();
      boolean _containsKey = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/TestInterface.java"));
      Assert.assertTrue(_containsKey);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package testComponent2;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* TestInterface interface is created in mapping to the Requires element \'testComponent2.TestInterface\'");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*@generated");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("interface TestInterface {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("void setRequiredDependencies(testComponent1.TestInterface testInterface, testComponent3.TestInterface testInterface);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String,CharSequence> _files_3 = fileSystem.getFiles();
      CharSequence _get = _files_3.get((IFileSystemAccess.DEFAULT_OUTPUT + "testComponent2/TestInterface.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
