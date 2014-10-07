package uk.ac.standrews.graspide.grasp.ui.analysis;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;

/**
 * Common Analysis utility functions
 */
@SuppressWarnings("all")
public class AnalysisUtil {
  private static uk.ac.standrews.graspide.grasp.graspDSL.System architectureSystem;
  
  public static uk.ac.standrews.graspide.grasp.graspDSL.System setArchitectureSystem(final uk.ac.standrews.graspide.grasp.graspDSL.System system) {
    return AnalysisUtil.architectureSystem = system;
  }
  
  public static EObject findElementInComposition(final EList<EObject> contents, final String elementName) {
    EObject lastComponent = null;
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
        if ((content instanceof LinkProviderPart)) {
          boolean _and = false;
          String _name = ((LinkProviderPart)content).getName();
          boolean _notEquals_1 = (!Objects.equal(_name, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            String _name_1 = ((LinkProviderPart)content).getName();
            boolean _equals_1 = _name_1.equals(elementName);
            _and = _equals_1;
          }
          if (_and) {
            lastComponent = content;
          }
        }
      }
    }
    return lastComponent;
  }
  
  public static List<EObject> getAllElements(final uk.ac.standrews.graspide.grasp.graspDSL.System system) {
    AnalysisUtil.architectureSystem = system;
    List<EObject> allElements = new ArrayList<EObject>();
    Iterable<EObject> iterableContents = EObjectExtensions.allContentsIterable(AnalysisUtil.architectureSystem);
    Iterable<Component> _filter = Iterables.<Component>filter(iterableContents, Component.class);
    Iterables.<EObject>addAll(allElements, _filter);
    Iterable<Connector> _filter_1 = Iterables.<Connector>filter(iterableContents, Connector.class);
    Iterables.<EObject>addAll(allElements, _filter_1);
    return allElements;
  }
  
  public static EObject getElementFromName(final String fullName) {
    EObject element = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(fullName);
    if (_isNullOrEmpty) {
      return element;
    }
    EObject currentElement = AnalysisUtil.architectureSystem;
    String[] names = fullName.split("\\.");
    for (final String name : names) {
      {
        EList<EObject> _eContents = currentElement.eContents();
        EObject _findElementInComposition = AnalysisUtil.findElementInComposition(_eContents, name);
        element = _findElementInComposition;
        currentElement = element;
        boolean _equals = Objects.equal(element, null);
        if (_equals) {
          return element;
        }
      }
    }
    return element;
  }
  
  public static String getElementFullName(final EObject element) {
    StringBuilder fullname = new StringBuilder();
    String _name = ((LinkProviderPart) element).getName();
    fullname.append(_name);
    EObject currentElement = element.eContainer();
    boolean _while = (currentElement instanceof LinkProviderPart);
    while (_while) {
      {
        String _name_1 = ((LinkProviderPart)currentElement).getName();
        String _plus = (_name_1 + ".");
        fullname.insert(0, _plus);
        EObject _eContainer = ((LinkProviderPart)currentElement).eContainer();
        currentElement = _eContainer;
      }
      _while = (currentElement instanceof LinkProviderPart);
    }
    return fullname.toString();
  }
}
