package uk.ac.standrews.graspide.grasp.ui.analysis;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.standrews.graspide.grasp.generator.GeneratorUtil;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.ui.analysis.AnalysisUtil;

/**
 * Analysis utility class that identifies Affected by chain of the given element.
 */
@SuppressWarnings("all")
public class AffectedByAnalysisUtil {
  public List<LinkProviders> getAffectedBys(final EObject rootElement) {
    final List<LinkProviders> providedObjects = new ArrayList<LinkProviders>();
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
          LinkConsumerExpression _linkConsumer = link.getLinkConsumer();
          boolean _isDependencyExistsForElement = this.isDependencyExistsForElement(_linkConsumer, rootElement);
          if (_isDependencyExistsForElement) {
            LinkProvidersList _linkProviders = link.getLinkProviders();
            EList<LinkProviders> _providers = _linkProviders.getProviders();
            providedObjects.addAll(_providers);
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
    return providedObjects;
  }
  
  public String getConsumerFullName(final LinkConsumerExpression consumerExpression) {
    final LinkConsumerPart consumer = consumerExpression.getConsumer();
    StringBuilder consumerName = new StringBuilder();
    String _elementFullName = AnalysisUtil.getElementFullName(consumer);
    consumerName.append(_elementFullName);
    Iterable<String> rightList = consumerExpression.getRightConsumer();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(rightList, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = IterableExtensions.size(rightList);
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
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
        boolean _equals = _get_1.equals("in");
        _and_1 = _equals;
      }
      if (_and_1) {
        int _size_3 = IterableExtensions.size(rightList);
        int _minus_2 = (_size_3 - 1);
        Iterable<String> _take = IterableExtensions.<String>take(rightList, _minus_2);
        rightList = _take;
      }
      final GeneratorUtil utility = new GeneratorUtil();
      final LinkConsumerPart lastConsumer = utility.getLastConsumer(consumerExpression, false);
      if ((lastConsumer instanceof Requires)) {
        int _size_4 = IterableExtensions.size(rightList);
        int _minus_3 = (_size_4 - 1);
        Iterable<String> _take_1 = IterableExtensions.<String>take(rightList, _minus_3);
        rightList = _take_1;
      }
      for (final String right : rightList) {
        StringBuilder _append = consumerName.append(".");
        _append.append(right);
      }
    }
    return consumerName.toString();
  }
  
  private boolean isDependencyExistsForElement(final LinkConsumerExpression expression, final EObject element) {
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      return false;
    }
    EObject consumer = expression.getConsumer();
    Iterable<String> rightList = expression.getRightConsumer();
    EObject currentConsumer = consumer;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(consumer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _equals_1 = consumer.equals(element);
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
      boolean _equals_4 = _get_1.equals("out");
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
        EList<EObject> _eContents = consumer.eContents();
        EObject _findElementInComposition = AnalysisUtil.findElementInComposition(_eContents, right);
        currentConsumer = _findElementInComposition;
        boolean _equals_5 = Objects.equal(currentConsumer, null);
        if (_equals_5) {
          return false;
        } else {
          boolean _and_2 = false;
          if (!(currentConsumer instanceof LinkProviderPart)) {
            _and_2 = false;
          } else {
            boolean _equals_6 = currentConsumer.equals(element);
            _and_2 = _equals_6;
          }
          if (_and_2) {
            return true;
          }
        }
        consumer = currentConsumer;
      }
    }
    return false;
  }
  
  public EObject getLastProviderPartElement(final LinkProviders providers) {
    boolean _equals = Objects.equal(providers, null);
    if (_equals) {
      return null;
    }
    EObject provider = providers.getProvider();
    Iterable<String> rightList = providers.getRightProvider();
    EObject currentProvider = provider;
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
      return provider;
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
        EObject _findElementInComposition = AnalysisUtil.findElementInComposition(_eContents, right);
        currentProvider = _findElementInComposition;
        boolean _or_2 = false;
        boolean _equals_5 = Objects.equal(currentProvider, null);
        if (_equals_5) {
          _or_2 = true;
        } else {
          _or_2 = (currentProvider instanceof Provides);
        }
        if (_or_2) {
          return provider;
        }
        provider = currentProvider;
      }
    }
    return provider;
  }
}
