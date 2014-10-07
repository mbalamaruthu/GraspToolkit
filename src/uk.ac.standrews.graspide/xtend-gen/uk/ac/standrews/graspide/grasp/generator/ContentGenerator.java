package uk.ac.standrews.graspide.grasp.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.generator.GeneratorData;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;

/**
 * Xtend file generation contents for code generation mappings using Xtend template expressions.
 */
@SuppressWarnings("all")
public class ContentGenerator {
  private static List<Rationale> rationales = new ArrayList<Rationale>();
  
  private static List<Rationale> requiredRationales = new ArrayList<Rationale>();
  
  public static void setRationales(final List<Rationale> rationaleInput) {
    ContentGenerator.rationales = rationaleInput;
  }
  
  public static void setRequiredRationales(final List<Rationale> rationaleInput) {
    ContentGenerator.requiredRationales = rationaleInput;
  }
  
  public static CharSequence getRequireInterfaceContents(final String interfaceType, final String interfaceName, final String packageName, final List<String> importList) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append(interfaceName, " ");
    _builder.append(" interface is created in mapping to the ");
    _builder.append(interfaceType, " ");
    _builder.append(" element \'");
    _builder.append(packageName, " ");
    {
      boolean _equals = Objects.equal(interfaceType, GeneratorData.REQUIRE_TYPE);
      if (_equals) {
        _builder.append(".");
        _builder.append(interfaceName, " ");
      }
    }
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    {
      int _size = ContentGenerator.requiredRationales.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("* Rationale for require Interface is ");
        final Function1<Rationale,String> _function = new Function1<Rationale,String>() {
          public String apply(final Rationale rationale) {
            return rationale.getName();
          }
        };
        String _join = IterableExtensions.<Rationale>join(ContentGenerator.requiredRationales, ", ", _function);
        _builder.append(_join, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*@generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("interface ");
    _builder.append(interfaceName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("void setRequiredDependencies(");
    String _join_1 = IterableExtensions.join(importList, ", ");
    _builder.append(_join_1, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      int _size_1 = ContentGenerator.rationales.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("// Rationale for the Configuration is ");
        final Function1<Rationale,String> _function_1 = new Function1<Rationale,String>() {
          public String apply(final Rationale rationale) {
            return rationale.getName();
          }
        };
        String _join_2 = IterableExtensions.<Rationale>join(ContentGenerator.rationales, ", ", _function_1);
        _builder.append(_join_2, "    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence getPackageInfoContents(final String elementType, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append(packageName, " ");
    _builder.append(" package is created in mapping to the ");
    _builder.append(elementType, " ");
    _builder.append(" element \'");
    _builder.append(packageName, " ");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    {
      int _size = ContentGenerator.rationales.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("* Rationale for mapped element is ");
        final Function1<Rationale,String> _function = new Function1<Rationale,String>() {
          public String apply(final Rationale rationale) {
            return rationale.getName();
          }
        };
        String _join = IterableExtensions.<Rationale>join(ContentGenerator.rationales, ", ", _function);
        _builder.append(_join, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*@generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence getInterfaceContents(final String interfaceType, final String interfaceName, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.append(interfaceName, " ");
    _builder.append(" interface is created in mapping to the ");
    _builder.append(interfaceType, " ");
    _builder.append(" element \'");
    _builder.append(packageName, " ");
    {
      boolean _equals = Objects.equal(interfaceType, GeneratorData.PROVIDE_TYPE);
      if (_equals) {
        _builder.append(".");
        _builder.append(interfaceName, " ");
      }
    }
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    {
      int _size = ContentGenerator.rationales.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("* Rationale for mapped element is ");
        final Function1<Rationale,String> _function = new Function1<Rationale,String>() {
          public String apply(final Rationale rationale) {
            return rationale.getName();
          }
        };
        String _join = IterableExtensions.<Rationale>join(ContentGenerator.rationales, ", ", _function);
        _builder.append(_join, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*@generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ");
    _builder.append(interfaceName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
