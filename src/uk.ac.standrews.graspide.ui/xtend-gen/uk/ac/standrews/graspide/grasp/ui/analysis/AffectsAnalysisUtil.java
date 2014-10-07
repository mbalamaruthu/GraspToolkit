package uk.ac.standrews.graspide.grasp.ui.analysis;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.ui.analysis.AnalysisUtil;

/**
 * Analysis utility class that identifies Affects chain of the given element.
 */
@SuppressWarnings("all")
public class AffectsAnalysisUtil {
  public List<LinkConsumerExpression> getAffectsElements(final EObject rootElement) {
    final List<LinkConsumerExpression> consumerObjects = new ArrayList<LinkConsumerExpression>();
    EObject currentElement = rootElement;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(currentElement, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (currentElement instanceof LinkProviderPart);
    }
    boolean _while = _and;
    while (_while) {
      {
        EObject _eContainer = currentElement.eContainer();
        EList<EObject> _eContents = _eContainer.eContents();
        Iterable<Link> links = Iterables.<Link>filter(_eContents, Link.class);
        for (final Link link : links) {
          LinkProvidersList _linkProviders = link.getLinkProviders();
          boolean _isDependencyExistsForElement = this.isDependencyExistsForElement(_linkProviders, rootElement);
          if (_isDependencyExistsForElement) {
            LinkConsumerExpression _linkConsumer = link.getLinkConsumer();
            CollectionExtensions.<LinkConsumerExpression>addAll(consumerObjects, _linkConsumer);
          }
        }
        EObject _eContainer_1 = currentElement.eContainer();
        currentElement = _eContainer_1;
      }
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(currentElement, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        _and_1 = (currentElement instanceof LinkProviderPart);
      }
      _while = _and_1;
    }
    return consumerObjects;
  }
  
  private boolean isDependencyExistsForElement(final LinkProvidersList providerList, final EObject rootElement) {
    boolean _or = false;
    boolean _equals = Objects.equal(providerList, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(rootElement, null);
      _or = _equals_1;
    }
    if (_or) {
      return false;
    }
    EList<LinkProviders> _providers = providerList.getProviders();
    for (final LinkProviders providers : _providers) {
      boolean _isProviderDependencyExistsForElement = this.isProviderDependencyExistsForElement(providers, rootElement);
      if (_isProviderDependencyExistsForElement) {
        return true;
      }
    }
    return false;
  }
  
  private boolean isProviderDependencyExistsForElement(final LinkProviders providers, final EObject rootElement) {
    boolean _equals = Objects.equal(providers, null);
    if (_equals) {
      return false;
    }
    EObject provider = providers.getProvider();
    Iterable<String> rightList = providers.getRightProvider();
    EObject currentProvider = provider;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(provider, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _equals_1 = provider.equals(rootElement);
      _and = _equals_1;
    }
    if (_and) {
      return true;
    }
    boolean _or = false;
    boolean _equals_2 = Objects.equal(rightList, null);
    if (_equals_2) {
      _or = true;
    } else {
      int _size = IterableExtensions.size(rightList);
      boolean _equals_3 = (_size == 0);
      _or = _equals_3;
    }
    if (_or) {
      return false;
    }
    boolean _and_1 = false;
    final Iterable<String> _converted_rightList = (Iterable<String>)rightList;
    int _size_1 = IterableExtensions.size(rightList);
    int _minus = (_size_1 - 1);
    String _get = ((String[])Conversions.unwrapArray(_converted_rightList, String.class))[_minus];
    boolean _notEquals_1 = (!Objects.equal(_get, null));
    if (!_notEquals_1) {
      _and_1 = false;
    } else {
      final Iterable<String> _converted_rightList_1 = (Iterable<String>)rightList;
      int _size_2 = IterableExtensions.size(rightList);
      int _minus_1 = (_size_2 - 1);
      String _get_1 = ((String[])Conversions.unwrapArray(_converted_rightList_1, String.class))[_minus_1];
      boolean _equals_4 = _get_1.equals("in");
      _and_1 = _equals_4;
    }
    if (_and_1) {
      int _size_3 = IterableExtensions.size(rightList);
      int _minus_2 = (_size_3 - 1);
      Iterable<String> _take = IterableExtensions.<String>take(rightList, _minus_2);
      rightList = _take;
    }
    for (final String right : rightList) {
      {
        EList<EObject> _eContents = provider.eContents();
        EObject _findElementInComposition = AnalysisUtil.findElementInComposition(_eContents, right);
        currentProvider = _findElementInComposition;
        boolean _equals_5 = Objects.equal(currentProvider, null);
        if (_equals_5) {
          return false;
        } else {
          boolean _and_2 = false;
          if (!(currentProvider instanceof LinkProviderPart)) {
            _and_2 = false;
          } else {
            boolean _equals_6 = currentProvider.equals(rootElement);
            _and_2 = _equals_6;
          }
          if (_and_2) {
            return true;
          }
        }
        provider = currentProvider;
      }
    }
    return false;
  }
  
  public EObject getLastConsumerPartElement(final LinkConsumerExpression consumerExpression) {
    boolean _equals = Objects.equal(consumerExpression, null);
    if (_equals) {
      return null;
    }
    EObject consumer = consumerExpression.getConsumer();
    Iterable<String> rightList = consumerExpression.getRightConsumer();
    EObject currentConsumer = consumer;
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
      return consumer;
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
        EObject _findElementInComposition = AnalysisUtil.findElementInComposition(_eContents, right);
        currentConsumer = _findElementInComposition;
        boolean _or_2 = false;
        boolean _equals_5 = Objects.equal(currentConsumer, null);
        if (_equals_5) {
          _or_2 = true;
        } else {
          _or_2 = (currentConsumer instanceof Requires);
        }
        if (_or_2) {
          return consumer;
        }
        consumer = currentConsumer;
      }
    }
    return consumer;
  }
}
