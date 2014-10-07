package uk.ac.standrews.graspide.grasp.ui.analysis;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.ui.analysis.AffectsAnalysisUtil;
import uk.ac.standrews.graspide.grasp.ui.analysis.AnalysisUtil;

/**
 * Dtangler dependency files content generator using Xtend Templates
 */
@SuppressWarnings("all")
public class DtanglerContentGenerator {
  private AffectsAnalysisUtil affectsAnalysisUtil = new AffectsAnalysisUtil();
  
  public CharSequence getFlatMatrixContents(final Architecture architecture) {
    String _xblockexpression = null;
    {
      StringBuilder contentBuilder = new StringBuilder();
      ArchitectureBody _architecutrebody = architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      Iterable<EObject> allContents = EObjectExtensions.allContentsIterable(_system);
      for (final EObject content : allContents) {
        boolean _or = false;
        if ((content instanceof Component)) {
          _or = true;
        } else {
          _or = (content instanceof Connector);
        }
        if (_or) {
          List<LinkConsumerExpression> dependentElements = this.affectsAnalysisUtil.getAffectsElements(content);
          String fullName = AnalysisUtil.getElementFullName(content);
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(dependentElements);
          if (_isNullOrEmpty) {
            StringBuilder _append = contentBuilder.append("{");
            StringBuilder _append_1 = _append.append(fullName);
            _append_1.append("}\n");
          } else {
            for (final LinkConsumerExpression element : dependentElements) {
              {
                StringBuilder _append_2 = contentBuilder.append("{");
                StringBuilder _append_3 = _append_2.append(fullName);
                _append_3.append("}");
                EObject providerElement = this.affectsAnalysisUtil.getLastConsumerPartElement(element);
                String elementFullName = AnalysisUtil.getElementFullName(providerElement);
                StringBuilder _append_4 = contentBuilder.append(" : {");
                StringBuilder _append_5 = _append_4.append(elementFullName);
                _append_5.append("}\n");
              }
            }
          }
        }
      }
      _xblockexpression = contentBuilder.toString();
    }
    return _xblockexpression;
  }
  
  public CharSequence getScopedMatrixContents(final Architecture architecture) {
    String _xblockexpression = null;
    {
      StringBuilder contentBuilder = new StringBuilder();
      ArchitectureBody _architecutrebody = architecture.getArchitecutrebody();
      uk.ac.standrews.graspide.grasp.graspDSL.System _system = _architecutrebody.getSystem();
      List<EObject> elementsQueue1 = _system.eContents();
      List<EObject> elementsQueue2 = new ArrayList<EObject>();
      List<EObject> currentQueue = elementsQueue1;
      List<EObject> nextQueue = elementsQueue2;
      boolean firstStack = true;
      long level = 0;
      boolean _or = false;
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(elementsQueue1);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _or = true;
      } else {
        boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(elementsQueue2);
        boolean _not_1 = (!_isNullOrEmpty_1);
        _or = _not_1;
      }
      boolean _while = _or;
      while (_while) {
        {
          if (firstStack) {
            firstStack = false;
            currentQueue = elementsQueue1;
            ArrayList<EObject> _arrayList = new ArrayList<EObject>();
            elementsQueue2 = _arrayList;
            nextQueue = elementsQueue2;
          } else {
            firstStack = true;
            currentQueue = elementsQueue2;
            ArrayList<EObject> _arrayList_1 = new ArrayList<EObject>();
            elementsQueue1 = _arrayList_1;
            nextQueue = elementsQueue1;
          }
          for (final EObject content : currentQueue) {
            if ((content instanceof LinkProviderPart)) {
              EList<EObject> _eContents = ((LinkProviderPart)content).eContents();
              nextQueue.addAll(_eContents);
              List<LinkConsumerExpression> dependentElements = this.affectsAnalysisUtil.getAffectsElements(content);
              String consumerElementFullName = AnalysisUtil.getElementFullName(content);
              String consumerLevelName = this.getLevelName(consumerElementFullName, level);
              boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(dependentElements);
              if (_isNullOrEmpty_2) {
                StringBuilder _append = contentBuilder.append((level + 1));
                StringBuilder _append_1 = _append.append(" {");
                StringBuilder _append_2 = _append_1.append(consumerLevelName);
                _append_2.append("}\n");
              } else {
                for (final LinkConsumerExpression element : dependentElements) {
                  {
                    StringBuilder _append_3 = contentBuilder.append((level + 1));
                    StringBuilder _append_4 = _append_3.append(" {");
                    StringBuilder _append_5 = _append_4.append(consumerLevelName);
                    _append_5.append("}");
                    EObject providerElement = this.affectsAnalysisUtil.getLastConsumerPartElement(element);
                    final String providerElementFullName = AnalysisUtil.getElementFullName(providerElement);
                    final String providerLevelName = this.getLevelName(providerElementFullName, level);
                    boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(providerLevelName);
                    boolean _not_2 = (!_isNullOrEmpty_3);
                    if (_not_2) {
                      StringBuilder _append_6 = contentBuilder.append(" : ");
                      StringBuilder _append_7 = _append_6.append((level + 1));
                      StringBuilder _append_8 = _append_7.append(" {");
                      StringBuilder _append_9 = _append_8.append(providerLevelName);
                      _append_9.append("}\n");
                    } else {
                      contentBuilder.append("\n");
                    }
                  }
                }
              }
            }
          }
          level = (level + 1);
        }
        boolean _or_1 = false;
        boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(elementsQueue1);
        boolean _not_2 = (!_isNullOrEmpty_2);
        if (_not_2) {
          _or_1 = true;
        } else {
          boolean _isNullOrEmpty_3 = IterableExtensions.isNullOrEmpty(elementsQueue2);
          boolean _not_3 = (!_isNullOrEmpty_3);
          _or_1 = _not_3;
        }
        _while = _or_1;
      }
      _xblockexpression = contentBuilder.toString();
    }
    return _xblockexpression;
  }
  
  public String getLevelName(final String fullName, final long maxLevel) {
    StringBuilder nameBuilder = new StringBuilder();
    String[] splitNames = fullName.split("\\.");
    int _length = splitNames.length;
    boolean _lessThan = (_length < (maxLevel + 1));
    if (_lessThan) {
      return nameBuilder.toString();
    }
    String _get = splitNames[0];
    nameBuilder.append(_get);
    int level = 0;
    boolean _while = (level < maxLevel);
    while (_while) {
      {
        StringBuilder _append = nameBuilder.append(" ");
        String _get_1 = splitNames[(level + 1)];
        _append.append(_get_1);
        level = (level + 1);
      }
      _while = (level < maxLevel);
    }
    return nameBuilder.toString();
  }
}
