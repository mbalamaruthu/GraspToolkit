package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Link Configuration constructs
 */
@SuppressWarnings("all")
public class LinkValidator {
  private GraspDSLValidator validator = null;
  
  public LinkValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateLinkForLayerConfiguration(final Link link) {
    LinkConsumerExpression linkExpression = link.getLinkConsumer();
    LinkProvidersList linkProviderList = link.getLinkProviders();
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _equals = Objects.equal(linkExpression, null);
    if (_equals) {
      _or_2 = true;
    } else {
      LinkConsumerPart _consumer = linkExpression.getConsumer();
      boolean _equals_1 = Objects.equal(_consumer, null);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(linkProviderList, null);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<LinkProviders> _providers = linkProviderList.getProviders();
      boolean _equals_3 = Objects.equal(_providers, null);
      _or = _equals_3;
    }
    if (_or) {
      return;
    }
    LinkConsumerPart lastConsumer = this.validateLinkConsumer(linkExpression, false);
    if ((lastConsumer instanceof Layer)) {
      String _name = ((Layer)lastConsumer).getName();
      String _plus = ("Invalid Link Configuration on layers from layer \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.validator.error(_plus_1, 
        GraspDSLPackage.Literals.LINK__LINK_CONSUMER);
    }
    EList<LinkProviders> _providers_1 = linkProviderList.getProviders();
    for (final LinkProviders provider : _providers_1) {
      {
        LinkProviderPart lastProvider = this.validateLinkProvider(provider);
        if ((lastProvider instanceof Layer)) {
          String _name_1 = ((Layer)lastProvider).getName();
          String _plus_2 = ("Invalid Link Configuration on layers to layer \'" + _name_1);
          String _plus_3 = (_plus_2 + "\'");
          this.validator.error(_plus_3, 
            GraspDSLPackage.Literals.LINK__LINK_PROVIDERS);
        }
      }
    }
  }
  
  public void validateLinkForLayerConstraints(final Link link) {
    LinkConsumerExpression linkExpression = link.getLinkConsumer();
    LinkProvidersList linkProviderList = link.getLinkProviders();
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _equals = Objects.equal(linkExpression, null);
    if (_equals) {
      _or_2 = true;
    } else {
      LinkConsumerPart _consumer = linkExpression.getConsumer();
      boolean _equals_1 = Objects.equal(_consumer, null);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(linkProviderList, null);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<LinkProviders> _providers = linkProviderList.getProviders();
      boolean _equals_3 = Objects.equal(_providers, null);
      _or = _equals_3;
    }
    if (_or) {
      return;
    }
    LinkConsumerPart linkConsumer = linkExpression.getConsumer();
    if ((!(linkConsumer instanceof Layer))) {
      boolean layerFound = false;
      EList<LinkProviders> _providers_1 = linkProviderList.getProviders();
      for (final LinkProviders provider : _providers_1) {
        LinkProviderPart _provider = provider.getProvider();
        if ((_provider instanceof Layer)) {
          layerFound = true;
        }
      }
      if (layerFound) {
        this.validator.warning(
          "Consumer is not conforming to strict layer constraints (communicate only with layer above or below)", link, 
          GraspDSLPackage.Literals.LINK__LINK_CONSUMER);
      }
      return;
    } else {
      EList<LinkProviders> _providers_2 = linkProviderList.getProviders();
      for (final LinkProviders provider_1 : _providers_2) {
        LinkProviderPart _provider_1 = provider_1.getProvider();
        this.validateLinkLayerProviderForLayeringConstraints(link, _provider_1, ((Layer) linkConsumer));
      }
    }
  }
  
  private void validateLinkLayerProviderForLayeringConstraints(final Link link, final LinkProviderPart provider, final Layer consumerLayer) {
    boolean _equals = Objects.equal(provider, null);
    if (_equals) {
      return;
    }
    if ((!(provider instanceof Layer))) {
      String _name = provider.getName();
      String _plus = ("Provider \'" + _name);
      String _plus_1 = (_plus + 
        "\' is not conforming to strict layer constraints (can only with layer above or below)");
      this.validator.warning(_plus_1, link, 
        GraspDSLPackage.Literals.LINK__LINK_PROVIDERS);
      return;
    }
    Layer providerLayer = ((Layer) provider);
    boolean _and = false;
    EList<Layer> _superLayer = consumerLayer.getSuperLayer();
    boolean _notEquals = (!Objects.equal(_superLayer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<Layer> _superLayer_1 = consumerLayer.getSuperLayer();
      int _size = _superLayer_1.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      EList<Layer> _superLayer_2 = consumerLayer.getSuperLayer();
      for (final Layer layer : _superLayer_2) {
        String _name_1 = layer.getName();
        String _name_2 = providerLayer.getName();
        boolean _equals_1 = _name_1.equals(_name_2);
        if (_equals_1) {
          return;
        }
      }
    }
    boolean _and_1 = false;
    EList<Layer> _superLayer_3 = providerLayer.getSuperLayer();
    boolean _notEquals_1 = (!Objects.equal(_superLayer_3, null));
    if (!_notEquals_1) {
      _and_1 = false;
    } else {
      EList<Layer> _superLayer_4 = providerLayer.getSuperLayer();
      int _size_1 = _superLayer_4.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      _and_1 = _greaterThan_1;
    }
    if (_and_1) {
      EList<Layer> _superLayer_5 = providerLayer.getSuperLayer();
      for (final Layer layer_1 : _superLayer_5) {
        String _name_3 = layer_1.getName();
        String _name_4 = consumerLayer.getName();
        boolean _equals_2 = _name_3.equals(_name_4);
        if (_equals_2) {
          return;
        }
      }
    }
    String _name_5 = consumerLayer.getName();
    String _plus_2 = ("Consumer \'" + _name_5);
    String _plus_3 = (_plus_2 + "\' and Provider \'");
    String _name_6 = providerLayer.getName();
    String _plus_4 = (_plus_3 + _name_6);
    String _plus_5 = (_plus_4 + 
      "\'are not conforming to strict layer constraints (can only with layer above or below)");
    this.validator.warning(_plus_5, link, 
      GraspDSLPackage.Literals.LINK__LINK_CONSUMER);
    return;
  }
  
  public void validateLinkForInterfaceMatch(final Link link) {
    LinkConsumerExpression _linkConsumer = link.getLinkConsumer();
    LinkConsumerPart lastConsumer = this.validateLinkConsumer(_linkConsumer, false);
    String consumerName = null;
    if ((lastConsumer instanceof Requires)) {
      String _type = ((Requires)lastConsumer).getType();
      consumerName = _type;
    }
    LinkProvidersList _linkProviders = link.getLinkProviders();
    Set<String> lastProvider = this.validateLinkProviders(link, _linkProviders, consumerName);
    boolean _and = false;
    boolean _equals = Objects.equal(consumerName, null);
    if (!_equals) {
      _and = false;
    } else {
      int _size = lastProvider.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      this.validator.warning(
        "Providers Provides Interfaces (Names) is not matched by Consumer with Requires Interface", link, 
        GraspDSLPackage.Literals.LINK__LINK_CONSUMER);
    }
  }
  
  public Set<String> validateLinkLayerAutoCompletion(final Link link) {
    Set<String> _xblockexpression = null;
    {
      LinkConsumerExpression _linkConsumer = link.getLinkConsumer();
      this.validateLinkConsumer(_linkConsumer, true);
      LinkProvidersList _linkProviders = link.getLinkProviders();
      _xblockexpression = this.validateLinkProviders(link, _linkProviders, null);
    }
    return _xblockexpression;
  }
  
  private Set<String> validateLinkProviders(final Link link, final LinkProvidersList list, final String consumerName) {
    Set<String> returnProvides = new HashSet<String>();
    EList<LinkProviders> _providers = list.getProviders();
    boolean _equals = Objects.equal(_providers, null);
    if (_equals) {
      return returnProvides;
    }
    EList<LinkProviders> _providers_1 = list.getProviders();
    for (final LinkProviders provider : _providers_1) {
      {
        LinkProviderPart lastProvider = this.validateLinkProvider(provider);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _notEquals = (!Objects.equal(lastProvider, null));
        if (!_notEquals) {
          _and_1 = false;
        } else {
          _and_1 = (lastProvider instanceof Provides);
        }
        if (!_and_1) {
          _and = false;
        } else {
          String _name = lastProvider.getName();
          boolean _notEquals_1 = (!Objects.equal(_name, null));
          _and = _notEquals_1;
        }
        if (_and) {
          String _name_1 = lastProvider.getName();
          returnProvides.add(_name_1);
          boolean _and_2 = false;
          boolean _notEquals_2 = (!Objects.equal(consumerName, null));
          if (!_notEquals_2) {
            _and_2 = false;
          } else {
            String _name_2 = lastProvider.getName();
            boolean _equals_1 = consumerName.equals(_name_2);
            boolean _not = (!_equals_1);
            _and_2 = _not;
          }
          if (_and_2) {
            String _name_3 = lastProvider.getName();
            String _plus = ((("Consumer\'s Require Interface \'" + consumerName) + 
              "\' does not match with Providers Provides Interface \'") + _name_3);
            String _plus_1 = (_plus + "\'");
            this.validator.warning(_plus_1, link, 
              GraspDSLPackage.Literals.LINK__LINK_PROVIDERS);
          }
        } else {
          boolean _notEquals_3 = (!Objects.equal(consumerName, null));
          if (_notEquals_3) {
            this.validator.warning(
              (("Consumer\'s Require Interface \'" + consumerName) + 
                "\' does not match with Providers Provides Interface"), link, 
              GraspDSLPackage.Literals.LINK__LINK_PROVIDERS);
          }
        }
      }
    }
    return returnProvides;
  }
  
  private LinkProviderPart validateLinkProvider(final LinkProviders providers) {
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
      return null;
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
            this.validator.error(
              (("Invalid Provider Name \'" + right) + "\'"), 
              GraspDSLPackage.Literals.LINK__LINK_PROVIDERS);
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
  
  private LinkConsumerPart validateLinkConsumer(final LinkConsumerExpression expression, final boolean isValidateConsumer) {
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
      return null;
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
            this.validator.error(
              (("Invalid Consumer Name \'" + right) + "\'"), 
              GraspDSLPackage.Literals.LINK__LINK_CONSUMER);
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
