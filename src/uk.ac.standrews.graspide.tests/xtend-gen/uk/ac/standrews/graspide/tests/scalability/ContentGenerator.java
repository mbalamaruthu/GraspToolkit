package uk.ac.standrews.graspide.tests.scalability;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.eclipse.xtend2.lib.StringConcatenation;
import uk.ac.standrews.graspide.tests.scalability.Architecture;

/**
 * Xtend file to generate architecture contents based on the initialised parameters set
 * by ArchitectureGenerator class
 */
@SuppressWarnings("all")
public class ContentGenerator {
  private Architecture architecture;
  
  private final HashMap<Long,List<Long>> linkMap = new HashMap<Long, List<Long>>();
  
  private final HashMap<Long,Long> componentParentMap = new HashMap<Long, Long>();
  
  public ContentGenerator(final Architecture architecture) {
    this.architecture = architecture;
  }
  
  public String getArchitectureContents() {
    StringBuilder content = new StringBuilder();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// An auto generated test architecture");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("architecture ");
    String _architectureName = this.architecture.getArchitectureName();
    _builder.append(_architectureName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("// Requirements and quality attribute specifiers");
    _builder.newLine();
    content.append(_builder);
    long counter = 0;
    Long _requirementCount = this.architecture.getRequirementCount();
    boolean _lessThan = (counter < (_requirementCount).longValue());
    boolean _while = _lessThan;
    while (_while) {
      {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("requirement testRequirement");
        _builder_1.append(counter, "");
        _builder_1.append(" ;");
        _builder_1.newLineIfNotEmpty();
        content.append(_builder_1);
        counter = (counter + 1);
      }
      Long _requirementCount_1 = this.architecture.getRequirementCount();
      boolean _lessThan_1 = (counter < (_requirementCount_1).longValue());
      _while = _lessThan_1;
    }
    counter = 0;
    Long _qualityAttributeCount = this.architecture.getQualityAttributeCount();
    boolean _lessThan_1 = (counter < (_qualityAttributeCount).longValue());
    boolean _while_1 = _lessThan_1;
    while (_while_1) {
      {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("quality_attribute testQualityAttribute");
        _builder_1.append(counter, "");
        content.append(_builder_1);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(";");
        content.append(_builder_2);
        counter = (counter + 1);
      }
      Long _qualityAttributeCount_1 = this.architecture.getQualityAttributeCount();
      boolean _lessThan_2 = (counter < (_qualityAttributeCount_1).longValue());
      _while_1 = _lessThan_2;
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("// Rationale descriptors");
    _builder_1.newLine();
    content.append(_builder_1);
    counter = 0;
    Long _rationaleCount = this.architecture.getRationaleCount();
    boolean _lessThan_2 = (counter < (_rationaleCount).longValue());
    boolean _while_2 = _lessThan_2;
    while (_while_2) {
      {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("rationale testRationale");
        _builder_2.append(counter, "");
        _builder_2.append("(){");
        _builder_2.newLineIfNotEmpty();
        content.append(_builder_2);
        boolean _isSupportPossible = this.isSupportPossible();
        if (_isSupportPossible) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("reason supports ");
          content.append(_builder_3);
          String _supportedQualityRequirements = this.getSupportedQualityRequirements(counter);
          StringBuilder _append = content.append(_supportedQualityRequirements);
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append(";");
          _append.append(_builder_4);
        }
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.newLine();
        _builder_5.append("}");
        _builder_5.newLine();
        content.append(_builder_5);
        counter = (counter + 1);
      }
      Long _rationaleCount_1 = this.architecture.getRationaleCount();
      boolean _lessThan_3 = (counter < (_rationaleCount_1).longValue());
      _while_2 = _lessThan_3;
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("// Template descriptions");
    _builder_2.newLine();
    _builder_2.newLine();
    content.append(_builder_2);
    counter = 0;
    Long _templateCount = this.architecture.getTemplateCount();
    boolean _lessThan_3 = (counter < (_templateCount).longValue());
    boolean _while_3 = _lessThan_3;
    while (_while_3) {
      {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("template testTemplate");
        _builder_3.append(counter, "");
        _builder_3.append("(){");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("}");
        _builder_3.newLine();
        content.append(_builder_3);
        counter = (counter + 1);
      }
      Long _templateCount_1 = this.architecture.getTemplateCount();
      boolean _lessThan_4 = (counter < (_templateCount_1).longValue());
      _while_3 = _lessThan_4;
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("// System structure");
    _builder_3.newLine();
    _builder_3.append("system ");
    String _systemName = this.architecture.getSystemName();
    _builder_3.append(_systemName, "");
    _builder_3.append(" {");
    content.append(_builder_3);
    String _systemContents = this.getSystemContents();
    content.append(_systemContents);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("}");
    _builder_4.newLine();
    content.append(_builder_4);
    return content.toString();
  }
  
  public String getSupportedQualityRequirements(final long l) {
    boolean _hasHalfChance = this.hasHalfChance();
    if (_hasHalfChance) {
      Long _requirementCount = this.architecture.getRequirementCount();
      final long requirementIndex = this.getRandomLong(0, (_requirementCount).longValue());
      return ("testRequirement" + Long.valueOf(requirementIndex));
    } else {
      Long _requirementCount_1 = this.architecture.getRequirementCount();
      final long qualityIndex = this.getRandomLong(0, (_requirementCount_1).longValue());
      return ("testQualityAttribute" + Long.valueOf(qualityIndex));
    }
  }
  
  public boolean isSupportPossible() {
    Long _requirementCount = this.architecture.getRequirementCount();
    Long _qualityAttributeCount = this.architecture.getQualityAttributeCount();
    long _plus = ((_requirementCount).longValue() + (_qualityAttributeCount).longValue());
    boolean _greaterThan = (_plus > 2);
    if (_greaterThan) {
      return this.hasHalfChance();
    }
    return false;
  }
  
  public String getSystemContents() {
    long counter = 0;
    final StringBuilder content = new StringBuilder();
    Long _componentCount = this.architecture.getComponentCount();
    boolean _lessThan = (counter < (_componentCount).longValue());
    boolean _while = _lessThan;
    while (_while) {
      {
        this.generatePartialComponent(content, counter);
        counter = (counter + 1);
        int chance = this.architecture.getComponentNestedLevels();
        int nestedLength = 0;
        boolean _hasNestableChance = this.hasNestableChance(chance, counter, nestedLength);
        boolean _while_1 = _hasNestableChance;
        while (_while_1) {
          {
            this.generatePartialComponent(content, counter);
            System.out.println(("Nested Parent " + Long.valueOf(counter)));
            this.componentParentMap.put(Long.valueOf(counter), Long.valueOf((counter - 1)));
            nestedLength = (nestedLength + 1);
            chance = (chance - 1);
            counter = (counter + 1);
          }
          boolean _hasNestableChance_1 = this.hasNestableChance(chance, counter, nestedLength);
          _while_1 = _hasNestableChance_1;
        }
        long currentLevelComponentId = (counter - 1);
        boolean _while_2 = (nestedLength > 0);
        while (_while_2) {
          {
            long otherComponents = 0;
            boolean _canHaveOtherComponentsAtSameLevel = this.canHaveOtherComponentsAtSameLevel(otherComponents, counter, nestedLength);
            boolean _while_3 = _canHaveOtherComponentsAtSameLevel;
            while (_while_3) {
              {
                this.generatePartialComponent(content, counter);
                System.out.println(((("Level Parent " + Long.valueOf(counter)) + ", ") + Long.valueOf(currentLevelComponentId)));
                this.componentParentMap.put(Long.valueOf(counter), Long.valueOf(currentLevelComponentId));
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("}");
                _builder.newLine();
                content.append(_builder);
                counter = (counter + 1);
                otherComponents = (otherComponents + 1);
              }
              boolean _canHaveOtherComponentsAtSameLevel_1 = this.canHaveOtherComponentsAtSameLevel(otherComponents, counter, nestedLength);
              _while_3 = _canHaveOtherComponentsAtSameLevel_1;
            }
            nestedLength = (nestedLength - 1);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("}");
            content.append(_builder);
            currentLevelComponentId = (currentLevelComponentId - 1);
          }
          _while_2 = (nestedLength > 0);
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("}");
        content.append(_builder);
      }
      Long _componentCount_1 = this.architecture.getComponentCount();
      boolean _lessThan_1 = (counter < (_componentCount_1).longValue());
      _while = _lessThan_1;
    }
    content.append("\n");
    counter = 0;
    long randomSource = 0;
    Long _linkCount = this.architecture.getLinkCount();
    boolean _lessThan_1 = (counter < (_linkCount).longValue());
    boolean _while_1 = _lessThan_1;
    while (_while_1) {
      {
        Long _componentCount_1 = this.architecture.getComponentCount();
        long _randomLong = this.getRandomLong(0, (_componentCount_1).longValue());
        randomSource = _randomLong;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("link ");
        String _componentFullPath = this.getComponentFullPath(randomSource);
        _builder.append(_componentFullPath, "");
        _builder.append(".out to ");
        long _targetRandomComponent = this.getTargetRandomComponent(randomSource);
        String _componentFullPath_1 = this.getComponentFullPath(_targetRandomComponent);
        _builder.append(_componentFullPath_1, "");
        _builder.append(".in");
        content.append(_builder);
        boolean _hasHalfChance = this.hasHalfChance();
        if (_hasHalfChance) {
          Long _rationaleCount = this.architecture.getRationaleCount();
          final long randomRationale = this.getRandomLong(0, (_rationaleCount).longValue());
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(" ");
          _builder_1.append("because testRationale");
          _builder_1.append(randomRationale, " ");
          _builder_1.append("()");
          content.append(_builder_1);
        }
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(";");
        _builder_2.newLine();
        content.append(_builder_2);
        counter = (counter + 1);
      }
      Long _linkCount_1 = this.architecture.getLinkCount();
      boolean _lessThan_2 = (counter < (_linkCount_1).longValue());
      _while_1 = _lessThan_2;
    }
    return content.toString();
  }
  
  public String getComponentFullPath(final long componentId) {
    StringBuilder fullPath = new StringBuilder();
    StringBuilder _append = fullPath.append("testComponent");
    _append.append(componentId);
    long currentComponent = componentId;
    Long _get = this.componentParentMap.get(Long.valueOf(currentComponent));
    boolean _notEquals = (!Objects.equal(_get, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        Long _get_1 = this.componentParentMap.get(Long.valueOf(currentComponent));
        currentComponent = (_get_1).longValue();
        fullPath.insert(0, (("testComponent" + Long.valueOf(currentComponent)) + "."));
      }
      Long _get_1 = this.componentParentMap.get(Long.valueOf(currentComponent));
      boolean _notEquals_1 = (!Objects.equal(_get_1, null));
      _while = _notEquals_1;
    }
    return fullPath.toString();
  }
  
  public StringBuilder generatePartialComponent(final StringBuilder content, final long componentId) {
    StringBuilder _xblockexpression = null;
    {
      Long _templateCount = this.architecture.getTemplateCount();
      final long randomTemplate = this.getRandomLong(0, (_templateCount).longValue());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("component testComponent");
      _builder.append(componentId, "");
      _builder.append(" = testTemplate");
      _builder.append(randomTemplate, "");
      _builder.append("()");
      content.append(_builder);
      boolean _hasHalfChance = this.hasHalfChance();
      if (_hasHalfChance) {
        Long _rationaleCount = this.architecture.getRationaleCount();
        final long randomRationale = this.getRandomLong(0, (_rationaleCount).longValue());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("because testRationale");
        _builder_1.append(randomRationale, " ");
        _builder_1.append("()");
        content.append(_builder_1);
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("{");
      _xblockexpression = content.append(_builder_2);
    }
    return _xblockexpression;
  }
  
  public long getTargetRandomComponent(final long source) {
    Long _componentCount = this.architecture.getComponentCount();
    long randomTarget = this.getRandomLong(0, (_componentCount).longValue());
    List<Long> _get = this.linkMap.get(Long.valueOf(source));
    boolean _notEquals = (!Objects.equal(_get, null));
    if (_notEquals) {
      long safetyCount = 0;
      boolean _or = false;
      if ((source == randomTarget)) {
        _or = true;
      } else {
        boolean _and = false;
        List<Long> _get_1 = this.linkMap.get(Long.valueOf(source));
        boolean _contains = _get_1.contains(Long.valueOf(randomTarget));
        if (!_contains) {
          _and = false;
        } else {
          _and = (safetyCount < 100);
        }
        _or = _and;
      }
      boolean _while = _or;
      while (_while) {
        {
          Long _componentCount_1 = this.architecture.getComponentCount();
          long _randomLong = this.getRandomLong(0, (_componentCount_1).longValue());
          randomTarget = _randomLong;
          safetyCount = (safetyCount + 1);
        }
        boolean _or_1 = false;
        if ((source == randomTarget)) {
          _or_1 = true;
        } else {
          boolean _and_1 = false;
          List<Long> _get_2 = this.linkMap.get(Long.valueOf(source));
          boolean _contains_1 = _get_2.contains(Long.valueOf(randomTarget));
          if (!_contains_1) {
            _and_1 = false;
          } else {
            _and_1 = (safetyCount < 100);
          }
          _or_1 = _and_1;
        }
        _while = _or_1;
      }
    } else {
      final ArrayList<Long> targetList = new ArrayList<Long>();
      targetList.add(Long.valueOf(randomTarget));
      this.linkMap.put(Long.valueOf(source), targetList);
    }
    return randomTarget;
  }
  
  public boolean hasNestableChance(final int remainingLevels, final long counter, final long currentLength) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    int _componentNestedLevels = this.architecture.getComponentNestedLevels();
    boolean _lessThan = (currentLength < _componentNestedLevels);
    if (!_lessThan) {
      _and_2 = false;
    } else {
      _and_2 = (remainingLevels > 0);
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      Long _componentCount = this.architecture.getComponentCount();
      boolean _lessThan_1 = (counter < (_componentCount).longValue());
      _and_1 = _lessThan_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _hasComplementChance = this.hasComplementChance(remainingLevels);
      _and = _hasComplementChance;
    }
    return _and;
  }
  
  public boolean canHaveOtherComponentsAtSameLevel(final long numberOfComponentsAtSameLevel, final long counter, final int nestedLength) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    if (!(nestedLength > 0)) {
      _and_2 = false;
    } else {
      int _maximumComponentsAtSameLevel = this.architecture.getMaximumComponentsAtSameLevel();
      boolean _lessThan = (numberOfComponentsAtSameLevel < _maximumComponentsAtSameLevel);
      _and_2 = _lessThan;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      Long _componentCount = this.architecture.getComponentCount();
      boolean _lessThan_1 = (counter < (_componentCount).longValue());
      _and_1 = _lessThan_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _hasComplementChance = this.hasComplementChance(4);
      _and = _hasComplementChance;
    }
    return _and;
  }
  
  /**
   * Chances Methods
   */
  public boolean hasHalfChance() {
    return this.hasChance(2);
  }
  
  /**
   * Give true with a probability 1/chance
   */
  public boolean hasChance(final int chance) {
    final Random random = new Random();
    final int randomValue = random.nextInt(chance);
    if ((randomValue == 1)) {
      return true;
    }
    return false;
  }
  
  /**
   * Give true with a probability 1 - 1/chance
   */
  public boolean hasComplementChance(final int chance) {
    final Random random = new Random();
    final int randomValue = random.nextInt(chance);
    if ((randomValue != 1)) {
      return true;
    }
    return false;
  }
  
  public long getRandomLong(final long min, final long max) {
    double _random = Math.random();
    double _multiply = (_random * (max - min));
    double _plus = (min + _multiply);
    return ((long) _plus);
  }
}
