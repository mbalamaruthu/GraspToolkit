package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Layer constructs
 */
@SuppressWarnings("all")
public class LayerValidator {
  private GraspDSLValidator validator = null;
  
  public LayerValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateLayerReference(final Layer layer) {
    String _name = layer.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      return;
    }
    EObject container = layer.eContainer();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(container, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      EList<EObject> _eContents = container.eContents();
      boolean _notEquals_1 = (!Objects.equal(_eContents, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EList<EObject> _eContents_1 = container.eContents();
      int _size = _eContents_1.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      EList<EObject> _eContents_2 = container.eContents();
      for (final EObject content : _eContents_2) {
        if ((content instanceof Link)) {
          String _name_1 = layer.getName();
          boolean _linkHasLayerReference = this.linkHasLayerReference(((Link)content), _name_1);
          if (_linkHasLayerReference) {
            return;
          }
        }
      }
    }
    String _name_2 = layer.getName();
    String _plus = ("Layer \'" + _name_2);
    String _plus_1 = (_plus + "\' is not referenced in a Link Configuration");
    this.validator.warning(_plus_1, layer, 
      GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
  }
  
  private boolean linkHasLayerReference(final Link link, final String layer) {
    boolean _and = false;
    LinkConsumerExpression _linkConsumer = link.getLinkConsumer();
    boolean _notEquals = (!Objects.equal(_linkConsumer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      LinkConsumerExpression _linkConsumer_1 = link.getLinkConsumer();
      LinkConsumerPart _consumer = _linkConsumer_1.getConsumer();
      _and = (_consumer instanceof Layer);
    }
    if (_and) {
      LinkConsumerExpression _linkConsumer_2 = link.getLinkConsumer();
      LinkConsumerPart _consumer_1 = _linkConsumer_2.getConsumer();
      String consumername = ((Layer) _consumer_1).getName();
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(consumername, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _equals = consumername.equals(layer);
        _and_1 = _equals;
      }
      if (_and_1) {
        return true;
      }
    }
    boolean _and_2 = false;
    LinkProvidersList _linkProviders = link.getLinkProviders();
    boolean _notEquals_2 = (!Objects.equal(_linkProviders, null));
    if (!_notEquals_2) {
      _and_2 = false;
    } else {
      LinkProvidersList _linkProviders_1 = link.getLinkProviders();
      EList<LinkProviders> _providers = _linkProviders_1.getProviders();
      boolean _notEquals_3 = (!Objects.equal(_providers, null));
      _and_2 = _notEquals_3;
    }
    if (_and_2) {
      LinkProvidersList _linkProviders_2 = link.getLinkProviders();
      EList<LinkProviders> _providers_1 = _linkProviders_2.getProviders();
      for (final LinkProviders providerPart : _providers_1) {
        boolean _and_3 = false;
        boolean _notEquals_4 = (!Objects.equal(providerPart, null));
        if (!_notEquals_4) {
          _and_3 = false;
        } else {
          LinkProviderPart _provider = providerPart.getProvider();
          _and_3 = (_provider instanceof Layer);
        }
        if (_and_3) {
          LinkProviderPart _provider_1 = providerPart.getProvider();
          String providerrname = _provider_1.getName();
          boolean _and_4 = false;
          boolean _notEquals_5 = (!Objects.equal(providerrname, null));
          if (!_notEquals_5) {
            _and_4 = false;
          } else {
            boolean _equals_1 = providerrname.equals(layer);
            _and_4 = _equals_1;
          }
          if (_and_4) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public void validateLayersForCycles(final Layer layer) {
    boolean _or = false;
    boolean _or_1 = false;
    String _name = layer.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or_1 = true;
    } else {
      EList<Layer> _superLayer = layer.getSuperLayer();
      boolean _equals_1 = Objects.equal(_superLayer, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<Layer> _superLayer_1 = layer.getSuperLayer();
      int _size = _superLayer_1.size();
      boolean _equals_2 = (_size == 0);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    final String currentLayerName = layer.getName();
    HashSet<Layer> currentSuperLayers = new HashSet<Layer>();
    HashSet<Layer> visitedLayers = new HashSet<Layer>();
    visitedLayers.add(layer);
    EList<Layer> _superLayer_2 = layer.getSuperLayer();
    currentSuperLayers.addAll(_superLayer_2);
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(currentSuperLayers);
    boolean _not = (!_isNullOrEmpty);
    boolean _while = _not;
    while (_while) {
      {
        final Layer currentSuperLayer = IterableExtensions.<Layer>head(currentSuperLayers);
        currentSuperLayers.remove(currentSuperLayer);
        boolean _and = false;
        String _name_1 = currentSuperLayer.getName();
        boolean _notEquals = (!Objects.equal(_name_1, null));
        if (!_notEquals) {
          _and = false;
        } else {
          String _name_2 = currentSuperLayer.getName();
          boolean _equals_3 = currentLayerName.equals(_name_2);
          _and = _equals_3;
        }
        if (_and) {
          String _name_3 = layer.getName();
          String _plus = ("Cycle Exists Over Layers \'" + _name_3);
          String _plus_1 = (_plus + "\' ");
          this.validator.error(_plus_1, 
            GraspDSLPackage.Literals.LAYER__SUPER_LAYER);
          return;
        }
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _add = visitedLayers.add(currentSuperLayer);
        if (!_add) {
          _and_2 = false;
        } else {
          EList<Layer> _superLayer_3 = currentSuperLayer.getSuperLayer();
          boolean _notEquals_1 = (!Objects.equal(_superLayer_3, null));
          _and_2 = _notEquals_1;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          EList<Layer> _superLayer_4 = currentSuperLayer.getSuperLayer();
          int _size_1 = _superLayer_4.size();
          boolean _greaterThan = (_size_1 > 0);
          _and_1 = _greaterThan;
        }
        if (_and_1) {
          EList<Layer> _superLayer_5 = currentSuperLayer.getSuperLayer();
          currentSuperLayers.addAll(_superLayer_5);
        }
      }
      boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(currentSuperLayers);
      boolean _not_1 = (!_isNullOrEmpty_1);
      _while = _not_1;
    }
  }
  
  public void validateSelfReferenceLayers(final Layer layer) {
    boolean _or = false;
    boolean _or_1 = false;
    String _name = layer.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or_1 = true;
    } else {
      EList<Layer> _superLayer = layer.getSuperLayer();
      boolean _equals_1 = Objects.equal(_superLayer, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<Layer> _superLayer_1 = layer.getSuperLayer();
      int _size = _superLayer_1.size();
      boolean _equals_2 = (_size == 0);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    EList<Layer> _superLayer_2 = layer.getSuperLayer();
    for (final Layer content : _superLayer_2) {
      boolean _and = false;
      String _name_1 = content.getName();
      boolean _notEquals = (!Objects.equal(_name_1, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_2 = layer.getName();
        String _name_3 = content.getName();
        boolean _equals_3 = _name_2.equals(_name_3);
        _and = _equals_3;
      }
      if (_and) {
        String _name_4 = layer.getName();
        String _plus = ("Layer cannot be Over itself \'" + _name_4);
        String _plus_1 = (_plus + "\'");
        this.validator.error(_plus_1, content, 
          GraspDSLPackage.Literals.LAYER__SUPER_LAYER);
        return;
      }
    }
    HashSet<String> superLayerSet = new HashSet<String>();
    EList<Layer> _superLayer_3 = layer.getSuperLayer();
    for (final Layer content_1 : _superLayer_3) {
      String _name_5 = content_1.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_5, null));
      if (_notEquals_1) {
        String _name_6 = content_1.getName();
        boolean _add = superLayerSet.add(_name_6);
        boolean _not = (!_add);
        if (_not) {
          String _name_7 = content_1.getName();
          String _plus_2 = ("Duplicate Super Layers \'" + _name_7);
          String _plus_3 = (_plus_2 + "\'");
          this.validator.error(_plus_3, layer, 
            GraspDSLPackage.Literals.LAYER__SUPER_LAYER);
          return;
        }
      }
    }
  }
}
