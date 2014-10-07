/**
 * generated by Xtext
 */
package uk.ac.standrews.graspide.grasp.formatting;

import java.util.List;
import javax.inject.Inject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;
import uk.ac.standrews.graspide.grasp.services.GraspDSLGrammarAccess;

/**
 * This extension point contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class GraspDSLFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private GraspDSLGrammarAccess g;
  
  protected void configureFormatting(final FormattingConfig formatConfig) {
    FormattingConfig.LinewrapLocator _setLinewrap = formatConfig.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this.g.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = formatConfig.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this.g.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = formatConfig.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this.g.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    List<Pair<Keyword,Keyword>> _findKeywordPairs = this.g.findKeywordPairs("{", "}");
    for (final Pair<Keyword,Keyword> brackets : _findKeywordPairs) {
      {
        FormattingConfig.SpaceLocator _setSpace = formatConfig.setSpace(" ");
        Keyword _first = brackets.getFirst();
        _setSpace.before(_first);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = formatConfig.setLinewrap(1);
        Keyword _first_1 = brackets.getFirst();
        _setLinewrap_3.after(_first_1);
        Keyword _first_2 = brackets.getFirst();
        Keyword _second = brackets.getSecond();
        formatConfig.setIndentation(_first_2, _second);
        FormattingConfig.LinewrapLocator _setLinewrap_4 = formatConfig.setLinewrap(1);
        Keyword _second_1 = brackets.getSecond();
        _setLinewrap_4.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_5 = formatConfig.setLinewrap(2);
        Keyword _second_2 = brackets.getSecond();
        _setLinewrap_5.after(_second_2);
      }
    }
    final List<Keyword> keywords = this.g.findKeywords("@", "architecture", "requirement", "quality_attribute", "rationale", "reason", 
      "template", "provides", "requires", "property", "check", "system", "layer", "component", "connector", "link");
    for (final Keyword keyword : keywords) {
      FormattingConfig.LinewrapLocator _setLinewrap_3 = formatConfig.setLinewrap(1);
      _setLinewrap_3.before(keyword);
    }
    final List<Keyword> noSpaceBeforeKeywords = this.g.findKeywords(",", ";", ".", ")", "]", ".out", ".in");
    for (final Keyword noSpaceBeforeKeyword : noSpaceBeforeKeywords) {
      FormattingConfig.NoSpaceLocator _setNoSpace = formatConfig.setNoSpace();
      _setNoSpace.before(noSpaceBeforeKeyword);
    }
    final List<Keyword> noSpaceAfterKeywords = this.g.findKeywords("@", ".", "(", "[");
    for (final Keyword noSpaceAfterKeyword : noSpaceAfterKeywords) {
      FormattingConfig.NoSpaceLocator _setNoSpace_1 = formatConfig.setNoSpace();
      _setNoSpace_1.after(noSpaceAfterKeyword);
    }
    final List<Keyword> spacedKeywords = this.g.findKeywords("to");
    for (final Keyword spacedKeyword : spacedKeywords) {
      {
        FormattingConfig.SpaceLocator _setSpace = formatConfig.setSpace(" ");
        _setSpace.after(spacedKeyword);
        FormattingConfig.SpaceLocator _setSpace_1 = formatConfig.setSpace(" ");
        _setSpace_1.before(spacedKeyword);
      }
    }
  }
}