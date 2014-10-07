package uk.ac.standrews.graspide.grasp.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;

/**
 * Code Generator utility functions
 */
@SuppressWarnings("all")
public class GeneratorUtil {
  public LinkProviderPart getLastLinkProvider(final LinkProviders providers) {
    boolean _equals = Objects.equal(providers, null);
    if (_equals) {
      return null;
    }
    LinkProviderPart provider = providers.getProvider();
    Iterable<String> rightList = providers.getRightProvider();
    LinkProviderPart currentProvider = provider;
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals_1 = Objects.equal(provider, null);
    if (_equals_1) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(rightList, null);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      int _size = IterableExtensions.size(rightList);
      boolean _equals_3 = (_size == 0);
      _or = _equals_3;
    }
    if (_or) {
      return currentProvider;
    }
    boolean _and = false;
    final Iterable<String> _converted_rightList = (Iterable<String>)rightList;
    int _size_1 = IterableExtensions.size(rightList);
    int _minus = (_size_1 - 1);
    String _get = ((String[])Conversions.unwrapArray(_converted_rightList, String.class))[_minus];
    boolean _notEquals = (!Objects.equal(_get, null));
    if (!_notEquals) {
      _and = false;
    } else {
      final Iterable<String> _converted_rightList_1 = (Iterable<String>)rightList;
      int _size_2 = IterableExtensions.size(rightList);
      int _minus_1 = (_size_2 - 1);
      String _get_1 = ((String[])Conversions.unwrapArray(_converted_rightList_1, String.class))[_minus_1];
      boolean _equals_4 = _get_1.equals("in");
      _and = _equals_4;
    }
    if (_and) {
      int _size_3 = IterableExtensions.size(rightList);
      int _minus_2 = (_size_3 - 1);
      Iterable<String> _take = IterableExtensions.<String>take(rightList, _minus_2);
      rightList = _take;
    }
    for (final String right : rightList) {
      {
        EList<EObject> _eContents = provider.eContents();
        LinkProviderPart _findProviderInComposition = this.findProviderInComposition(_eContents, right);
        currentProvider = _findProviderInComposition;
        boolean _equals_5 = Objects.equal(currentProvider, null);
        if (_equals_5) {
          LinkProviderPart _findProviderInTemplates = this.findProviderInTemplates(provider, right);
          currentProvider = _findProviderInTemplates;
          boolean _equals_6 = Objects.equal(currentProvider, null);
          if (_equals_6) {
            return null;
          }
        }
        provider = currentProvider;
      }
    }
    return currentProvider;
  }
  
  private LinkProviderPart findProviderInTemplates(final LinkProviderPart part, final String right) {
    LinkProviderPart provider = null;
    if ((part instanceof Component)) {
      Template _value = ((Component)part).getValue();
      LinkProviderPart _findProviderInTemplate = this.findProviderInTemplate(_value, right);
      provider = _findProviderInTemplate;
    } else {
      if ((part instanceof Connector)) {
        Template _value_1 = ((Connector)part).getValue();
        LinkProviderPart _findProviderInTemplate_1 = this.findProviderInTemplate(_value_1, right);
        provider = _findProviderInTemplate_1;
      }
    }
    return provider;
  }
  
  private LinkProviderPart findProviderInTemplate(final Template template, final String right) {
    LinkProviderPart provider = null;
    Template currentTemplate = template;
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EList<EObject> _eContents = currentTemplate.eContents();
        LinkProviderPart _findProviderInComposition = this.findProviderInComposition(_eContents, right);
        provider = _findProviderInComposition;
        boolean _or = false;
        boolean _notEquals_1 = (!Objects.equal(provider, null));
        if (_notEquals_1) {
          _or = true;
        } else {
          Template _superTemplate = currentTemplate.getSuperTemplate();
          boolean _equals = Objects.equal(currentTemplate, _superTemplate);
          _or = _equals;
        }
        if (_or) {
          return provider;
        }
        Template _superTemplate_1 = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate_1;
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
    return provider;
  }
  
  private LinkProviderPart findProviderInComposition(final EList<EObject> list, final String right) {
    LinkProviderPart lastComponent = null;
    for (final EObject content : list) {
      {
        boolean _notEquals = (!Objects.equal(lastComponent, null));
        if (_notEquals) {
          return lastComponent;
        }
        if ((content instanceof LinkProviderPart)) {
          boolean _and = false;
          String _name = ((LinkProviderPart)content).getName();
          boolean _notEquals_1 = (!Objects.equal(_name, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            String _name_1 = ((LinkProviderPart)content).getName();
            boolean _equals = _name_1.equals(right);
            _and = _equals;
          }
          if (_and) {
            lastComponent = ((LinkProviderPart)content);
          }
        }
      }
    }
    return lastComponent;
  }
  
  public LinkConsumerPart getLastConsumer(final LinkConsumerExpression expression, final boolean isValidateConsumer) {
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      return null;
    }
    LinkConsumerPart consumer = expression.getConsumer();
    Iterable<String> rightList = expression.getRightConsumer();
    LinkConsumerPart currentConsumer = consumer;
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals_1 = Objects.equal(consumer, null);
    if (_equals_1) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(rightList, null);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      int _size = IterableExtensions.size(rightList);
      boolean _equals_3 = (_size == 0);
      _or = _equals_3;
    }
    if (_or) {
      return currentConsumer;
    }
    boolean _and = false;
    final Iterable<String> _converted_rightList = (Iterable<String>)rightList;
    int _size_1 = IterableExtensions.size(rightList);
    int _minus = (_size_1 - 1);
    String _get = ((String[])Conversions.unwrapArray(_converted_rightList, String.class))[_minus];
    boolean _notEquals = (!Objects.equal(_get, null));
    if (!_notEquals) {
      _and = false;
    } else {
      final Iterable<String> _converted_rightList_1 = (Iterable<String>)rightList;
      int _size_2 = IterableExtensions.size(rightList);
      int _minus_1 = (_size_2 - 1);
      String _get_1 = ((String[])Conversions.unwrapArray(_converted_rightList_1, String.class))[_minus_1];
      boolean _equals_4 = _get_1.equals("out");
      _and = _equals_4;
    }
    if (_and) {
      int _size_3 = IterableExtensions.size(rightList);
      int _minus_2 = (_size_3 - 1);
      Iterable<String> _take = IterableExtensions.<String>take(rightList, _minus_2);
      rightList = _take;
    }
    for (final String right : rightList) {
      {
        EList<EObject> _eContents = consumer.eContents();
        LinkConsumerPart _findConsumerInComposition = this.findConsumerInComposition(_eContents, right);
        currentConsumer = _findConsumerInComposition;
        boolean _equals_5 = Objects.equal(currentConsumer, null);
        if (_equals_5) {
          LinkConsumerPart _findConsumerInTemplates = this.findConsumerInTemplates(consumer, right);
          currentConsumer = _findConsumerInTemplates;
          boolean _and_1 = false;
          boolean _equals_6 = Objects.equal(currentConsumer, null);
          if (!_equals_6) {
            _and_1 = false;
          } else {
            _and_1 = isValidateConsumer;
          }
          if (_and_1) {
            return null;
          }
        }
        consumer = currentConsumer;
      }
    }
    return currentConsumer;
  }
  
  private LinkConsumerPart findConsumerInTemplates(final LinkConsumerPart part, final String right) {
    LinkConsumerPart consumer = null;
    if ((part instanceof Component)) {
      Template _value = ((Component)part).getValue();
      LinkConsumerPart _findConsumerInTemplate = this.findConsumerInTemplate(_value, right);
      consumer = _findConsumerInTemplate;
    } else {
      if ((part instanceof Connector)) {
        Template _value_1 = ((Connector)part).getValue();
        LinkConsumerPart _findConsumerInTemplate_1 = this.findConsumerInTemplate(_value_1, right);
        consumer = _findConsumerInTemplate_1;
      }
    }
    return consumer;
  }
  
  private LinkConsumerPart findConsumerInTemplate(final Template template, final String right) {
    LinkConsumerPart consumer = null;
    Template currentTemplate = template;
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EList<EObject> _eContents = currentTemplate.eContents();
        LinkConsumerPart _findConsumerInComposition = this.findConsumerInComposition(_eContents, right);
        consumer = _findConsumerInComposition;
        boolean _or = false;
        boolean _notEquals_1 = (!Objects.equal(consumer, null));
        if (_notEquals_1) {
          _or = true;
        } else {
          Template _superTemplate = currentTemplate.getSuperTemplate();
          boolean _equals = Objects.equal(currentTemplate, _superTemplate);
          _or = _equals;
        }
        if (_or) {
          return consumer;
        }
        Template _superTemplate_1 = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate_1;
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
    return consumer;
  }
  
  private LinkConsumerPart findConsumerInComposition(final EList<EObject> contents, final String right) {
    LinkConsumerPart lastComponent = null;
    boolean _equals = Objects.equal(contents, null);
    if (_equals) {
      return lastComponent;
    }
    for (final EObject content : contents) {
      {
        boolean _notEquals = (!Objects.equal(lastComponent, null));
        if (_notEquals) {
          return lastComponent;
        }
        if ((content instanceof LinkConsumerPart)) {
          if ((content instanceof Layer)) {
            boolean _and = false;
            String _name = ((Layer)content).getName();
            boolean _notEquals_1 = (!Objects.equal(_name, null));
            if (!_notEquals_1) {
              _and = false;
            } else {
              String _name_1 = ((Layer)content).getName();
              boolean _equals_1 = _name_1.equals(right);
              _and = _equals_1;
            }
            if (_and) {
              lastComponent = ((LinkConsumerPart)content);
            }
          } else {
            if ((content instanceof Component)) {
              boolean _and_1 = false;
              String _name_2 = ((Component)content).getName();
              boolean _notEquals_2 = (!Objects.equal(_name_2, null));
              if (!_notEquals_2) {
                _and_1 = false;
              } else {
                String _name_3 = ((Component)content).getName();
                boolean _equals_2 = _name_3.equals(right);
                _and_1 = _equals_2;
              }
              if (_and_1) {
                lastComponent = ((LinkConsumerPart)content);
              }
            } else {
              if ((content instanceof Connector)) {
                boolean _and_2 = false;
                String _name_4 = ((Connector)content).getName();
                boolean _notEquals_3 = (!Objects.equal(_name_4, null));
                if (!_notEquals_3) {
                  _and_2 = false;
                } else {
                  String _name_5 = ((Connector)content).getName();
                  boolean _equals_3 = _name_5.equals(right);
                  _and_2 = _equals_3;
                }
                if (_and_2) {
                  lastComponent = ((LinkConsumerPart)content);
                }
              } else {
                if ((content instanceof Requires)) {
                  boolean _and_3 = false;
                  String _type = ((Requires)content).getType();
                  boolean _notEquals_4 = (!Objects.equal(_type, null));
                  if (!_notEquals_4) {
                    _and_3 = false;
                  } else {
                    String _type_1 = ((Requires)content).getType();
                    boolean _equals_4 = _type_1.equals(right);
                    _and_3 = _equals_4;
                  }
                  if (_and_3) {
                    lastComponent = ((LinkConsumerPart)content);
                  }
                }
              }
            }
          }
        }
      }
    }
    return lastComponent;
  }
}
