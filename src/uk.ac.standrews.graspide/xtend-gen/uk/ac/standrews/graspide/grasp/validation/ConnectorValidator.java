package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Connector constructs
 */
@SuppressWarnings("all")
public class ConnectorValidator {
  private GraspDSLValidator validator = null;
  
  public ConnectorValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateConnectorReferences(final uk.ac.standrews.graspide.grasp.graspDSL.System system) {
    ArrayList<Connector> connectorList = new ArrayList<Connector>();
    ArrayList<Link> linkList = new ArrayList<Link>();
    EList<EObject> _eContents = system.eContents();
    for (final EObject content : _eContents) {
      if ((content instanceof Connector)) {
        connectorList.add(((Connector)content));
      } else {
        if ((content instanceof Link)) {
          linkList.add(((Link)content));
        }
      }
    }
    for (final Connector connector : connectorList) {
      String _name = connector.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        String _name_1 = connector.getName();
        boolean _connectorFoundInLinks = this.connectorFoundInLinks(_name_1, linkList);
        boolean _not = (!_connectorFoundInLinks);
        if (_not) {
          String _name_2 = connector.getName();
          String _plus = ("Connector \'" + _name_2);
          String _plus_1 = (_plus + "\' is not referenced in a Link Configuration");
          this.validator.warning(_plus_1, connector, 
            GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
        }
      }
    }
  }
  
  public boolean connectorFoundInLinks(final String connectorName, final ArrayList<Link> links) {
    for (final Link link : links) {
      {
        LinkConsumerExpression linkExpression = link.getLinkConsumer();
        LinkProvidersList linkProviderList = link.getLinkProviders();
        boolean _and = false;
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _notEquals = (!Objects.equal(linkExpression, null));
        if (!_notEquals) {
          _and_2 = false;
        } else {
          LinkConsumerPart _consumer = linkExpression.getConsumer();
          boolean _notEquals_1 = (!Objects.equal(_consumer, null));
          _and_2 = _notEquals_1;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          boolean _notEquals_2 = (!Objects.equal(linkProviderList, null));
          _and_1 = _notEquals_2;
        }
        if (!_and_1) {
          _and = false;
        } else {
          EList<LinkProviders> _providers = linkProviderList.getProviders();
          boolean _notEquals_3 = (!Objects.equal(_providers, null));
          _and = _notEquals_3;
        }
        if (_and) {
          LinkConsumerPart linkConsumer = linkExpression.getConsumer();
          if ((linkConsumer instanceof Connector)) {
            boolean _and_3 = false;
            String _name = ((Connector)linkConsumer).getName();
            boolean _notEquals_4 = (!Objects.equal(_name, null));
            if (!_notEquals_4) {
              _and_3 = false;
            } else {
              String _name_1 = ((Connector)linkConsumer).getName();
              boolean _equals = _name_1.equals(connectorName);
              _and_3 = _equals;
            }
            if (_and_3) {
              return true;
            }
          }
          EList<LinkProviders> _providers_1 = linkProviderList.getProviders();
          for (final LinkProviders provider : _providers_1) {
            {
              LinkProviderPart providerPart = provider.getProvider();
              if ((providerPart instanceof Connector)) {
                boolean _and_4 = false;
                String _name_2 = ((Connector)providerPart).getName();
                boolean _notEquals_5 = (!Objects.equal(_name_2, null));
                if (!_notEquals_5) {
                  _and_4 = false;
                } else {
                  String _name_3 = ((Connector)providerPart).getName();
                  boolean _equals_1 = _name_3.equals(connectorName);
                  _and_4 = _equals_1;
                }
                if (_and_4) {
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}
