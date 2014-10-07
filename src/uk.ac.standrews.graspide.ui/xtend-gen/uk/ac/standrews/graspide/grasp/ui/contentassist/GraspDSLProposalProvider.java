/**
 * generated by Xtext
 */
package uk.ac.standrews.graspide.grasp.ui.contentassist;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.ui.contentassist.AbstractGraspDSLProposalProvider;

/**
 * Content assist extension provided by Xtext
 */
@SuppressWarnings("all")
public class GraspDSLProposalProvider extends AbstractGraspDSLProposalProvider {
  public void completeSupportsClause_Value(final EObject supportClause, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final SupportsClause support = ((SupportsClause) supportClause);
    AbstractElement _terminal = assignment.getTerminal();
    CrossReference assignmentTerminal = ((CrossReference) _terminal);
    boolean _or = false;
    boolean _equals = Objects.equal(support, null);
    if (_equals) {
      _or = true;
    } else {
      _or = (!(support.eContainer() instanceof Qattribute));
    }
    if (_or) {
      this.lookupCrossReference(assignmentTerminal, context, acceptor);
      return;
    }
    EObject _eContainer = support.eContainer();
    final Qattribute qattribute = ((Qattribute) _eContainer);
    final String currentName = qattribute.getName();
    final Predicate<IEObjectDescription> _function = new Predicate<IEObjectDescription>() {
      public boolean apply(final IEObjectDescription description) {
        boolean _or = false;
        if ((!(description.getEObjectOrProxy() instanceof Qattribute))) {
          _or = true;
        } else {
          EObject _eObjectOrProxy = description.getEObjectOrProxy();
          String _name = ((Qattribute) _eObjectOrProxy).getName();
          boolean _notEquals = (!Objects.equal(_name, currentName));
          _or = _notEquals;
        }
        return _or;
      }
    };
    this.lookupCrossReference(assignmentTerminal, context, acceptor, _function);
  }
  
  public void completeTemplate_SuperTemplate(final EObject template, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String currentName = ((Template) template).getName();
    AbstractElement _terminal = assignment.getTerminal();
    CrossReference assignmentTerminal = ((CrossReference) _terminal);
    final Predicate<IEObjectDescription> _function = new Predicate<IEObjectDescription>() {
      public boolean apply(final IEObjectDescription description) {
        EObject _eObjectOrProxy = description.getEObjectOrProxy();
        String _name = ((Template) _eObjectOrProxy).getName();
        return (!Objects.equal(_name, currentName));
      }
    };
    this.lookupCrossReference(assignmentTerminal, context, acceptor, _function);
  }
  
  public void completeRationale_SuperRationale(final EObject rationale, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String currentName = ((Rationale) rationale).getName();
    AbstractElement _terminal = assignment.getTerminal();
    CrossReference assignmentTerminal = ((CrossReference) _terminal);
    final Predicate<IEObjectDescription> _function = new Predicate<IEObjectDescription>() {
      public boolean apply(final IEObjectDescription description) {
        EObject _eObjectOrProxy = description.getEObjectOrProxy();
        String _name = ((Rationale) _eObjectOrProxy).getName();
        return (!Objects.equal(_name, currentName));
      }
    };
    this.lookupCrossReference(assignmentTerminal, context, acceptor, _function);
  }
  
  public void completeLayer_SuperLayer(final EObject layerObject, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Layer layer = ((Layer) layerObject);
    final HashSet<String> layerSet = new HashSet<String>();
    final String currentName = layer.getName();
    layerSet.add(currentName);
    EList<Layer> _superLayer = layer.getSuperLayer();
    for (final Layer currentLayer : _superLayer) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(currentLayer, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name = currentLayer.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        _and = _notEquals_1;
      }
      if (_and) {
        String _name_1 = currentLayer.getName();
        layerSet.add(_name_1);
      }
    }
    AbstractElement _terminal = assignment.getTerminal();
    CrossReference assignmentTerminal = ((CrossReference) _terminal);
    final Predicate<IEObjectDescription> _function = new Predicate<IEObjectDescription>() {
      public boolean apply(final IEObjectDescription description) {
        EObject _eObjectOrProxy = description.getEObjectOrProxy();
        String _name = ((Layer) _eObjectOrProxy).getName();
        boolean _contains = layerSet.contains(_name);
        return (!_contains);
      }
    };
    this.lookupCrossReference(assignmentTerminal, context, acceptor, _function);
  }
  
  public void completeLinkConsumerExpression_RightConsumer(final LinkConsumerExpression linkConsumer, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    LinkConsumerPart _consumer = linkConsumer.getConsumer();
    boolean _equals = Objects.equal(_consumer, null);
    if (_equals) {
      return;
    }
    LinkConsumerPart lastComponent = linkConsumer.getConsumer();
    EList<String> rightList = linkConsumer.getRightConsumer();
    for (final String right : rightList) {
      {
        boolean _equals_1 = Objects.equal(lastComponent, null);
        if (_equals_1) {
          return;
        }
        EList<EObject> contents = lastComponent.eContents();
        boolean _equals_2 = Objects.equal(contents, null);
        if (_equals_2) {
          return;
        }
        LinkConsumerPart _findConsumerComponent = this.findConsumerComponent(contents, right);
        lastComponent = _findConsumerComponent;
      }
    }
    boolean _or = false;
    boolean _equals_1 = Objects.equal(lastComponent, null);
    if (_equals_1) {
      _or = true;
    } else {
      EList<EObject> _eContents = lastComponent.eContents();
      boolean _equals_2 = Objects.equal(_eContents, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    EList<EObject> _eContents_1 = lastComponent.eContents();
    this.addConsumerContentsToProposals(_eContents_1, context, acceptor);
    Template template = null;
    if ((lastComponent instanceof Component)) {
      Template _value = ((Component)lastComponent).getValue();
      template = _value;
    } else {
      if ((lastComponent instanceof Connector)) {
        Template _value_1 = ((Connector)lastComponent).getValue();
        template = _value_1;
      }
    }
    boolean _notEquals = (!Objects.equal(template, null));
    if (_notEquals) {
      this.addConsumerTemplateContentsToProposals(template, context, acceptor);
    }
  }
  
  public LinkConsumerPart findConsumerComponent(final EList<EObject> contents, final String right) {
    LinkConsumerPart lastComponent = null;
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
              boolean _equals = _name_1.equals(right);
              _and = _equals;
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
                boolean _equals_1 = _name_3.equals(right);
                _and_1 = _equals_1;
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
                  boolean _equals_2 = _name_5.equals(right);
                  _and_2 = _equals_2;
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
                    boolean _equals_3 = _type_1.equals(right);
                    _and_3 = _equals_3;
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
  
  public void addConsumerTemplateContentsToProposals(final Template template, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Template currentTemplate = template;
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EList<EObject> _eContents = currentTemplate.eContents();
        this.addConsumerContentsToProposals(_eContents, context, acceptor);
        Template _superTemplate = currentTemplate.getSuperTemplate();
        boolean _equals = Objects.equal(currentTemplate, _superTemplate);
        if (_equals) {
          return;
        }
        Template _superTemplate_1 = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate_1;
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
  }
  
  public void addConsumerContentsToProposals(final List<EObject> contents, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal completionProposal = null;
    for (final EObject content : contents) {
      {
        if ((content instanceof LinkConsumerPart)) {
          if ((content instanceof Layer)) {
            String _name = ((Layer)content).getName();
            String _name_1 = ((Layer)content).getName();
            Image _image = this.getImage(content);
            ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_name, _name_1, _image, context);
            completionProposal = _createCompletionProposal;
          } else {
            if ((content instanceof Component)) {
              String _name_2 = ((Component)content).getName();
              String _name_3 = ((Component)content).getName();
              Image _image_1 = this.getImage(content);
              ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal(_name_2, _name_3, _image_1, context);
              completionProposal = _createCompletionProposal_1;
            } else {
              if ((content instanceof Connector)) {
                String _name_4 = ((Connector)content).getName();
                String _name_5 = ((Connector)content).getName();
                Image _image_2 = this.getImage(content);
                ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal(_name_4, _name_5, _image_2, context);
                completionProposal = _createCompletionProposal_2;
              } else {
                if ((content instanceof Requires)) {
                  String _type = ((Requires)content).getType();
                  String _type_1 = ((Requires)content).getType();
                  Image _image_3 = this.getImage(content);
                  ICompletionProposal _createCompletionProposal_3 = this.createCompletionProposal(_type, _type_1, _image_3, context);
                  completionProposal = _createCompletionProposal_3;
                }
              }
            }
          }
        }
        acceptor.accept(completionProposal);
      }
    }
  }
  
  public void completeLinkProviders_RightProvider(final LinkProviders linkProvider, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    LinkProviderPart _provider = linkProvider.getProvider();
    boolean _equals = Objects.equal(_provider, null);
    if (_equals) {
      return;
    }
    LinkProviderPart lastComponent = linkProvider.getProvider();
    EList<String> rightList = linkProvider.getRightProvider();
    for (final String right : rightList) {
      {
        boolean _equals_1 = Objects.equal(lastComponent, null);
        if (_equals_1) {
          return;
        }
        EList<EObject> contents = lastComponent.eContents();
        boolean _equals_2 = Objects.equal(contents, null);
        if (_equals_2) {
          return;
        }
        LinkProviderPart _findProviderComponent = this.findProviderComponent(contents, right);
        lastComponent = _findProviderComponent;
      }
    }
    boolean _or = false;
    boolean _equals_1 = Objects.equal(lastComponent, null);
    if (_equals_1) {
      _or = true;
    } else {
      EList<EObject> _eContents = lastComponent.eContents();
      boolean _equals_2 = Objects.equal(_eContents, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    EList<EObject> _eContents_1 = lastComponent.eContents();
    this.addProviderContentsToProposals(_eContents_1, context, acceptor);
    Template template = null;
    if ((lastComponent instanceof Component)) {
      Template _value = ((Component)lastComponent).getValue();
      template = _value;
    } else {
      if ((lastComponent instanceof Connector)) {
        Template _value_1 = ((Connector)lastComponent).getValue();
        template = _value_1;
      }
    }
    boolean _notEquals = (!Objects.equal(template, null));
    if (_notEquals) {
      this.addProviderTemplateContentsToProposals(template, context, acceptor);
    }
  }
  
  public LinkProviderPart findProviderComponent(final EList<EObject> contents, final String right) {
    LinkProviderPart lastComponent = null;
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
  
  public void addProviderTemplateContentsToProposals(final Template template, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Template currentTemplate = template;
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EList<EObject> _eContents = currentTemplate.eContents();
        this.addProviderContentsToProposals(_eContents, context, acceptor);
        Template _superTemplate = currentTemplate.getSuperTemplate();
        boolean _equals = Objects.equal(currentTemplate, _superTemplate);
        if (_equals) {
          return;
        }
        Template _superTemplate_1 = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate_1;
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
  }
  
  public void addProviderContentsToProposals(final List<EObject> contents, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal completionProposal = null;
    for (final EObject content : contents) {
      {
        if ((content instanceof LinkProviderPart)) {
          String _name = ((LinkProviderPart)content).getName();
          String _name_1 = ((LinkProviderPart)content).getName();
          Image _image = this.getImage(content);
          ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_name, _name_1, _image, context);
          completionProposal = _createCompletionProposal;
        }
        acceptor.accept(completionProposal);
      }
    }
  }
  
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(keyword, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      String _value = keyword.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _value_1 = keyword.getValue();
      boolean _equals = _value_1.equals("link");
      _and = _equals;
    }
    if (_and) {
      final EObject system = contentAssistContext.getCurrentModel();
      int count = 0;
      EList<EObject> _eContents = system.eContents();
      for (final EObject content : _eContents) {
        {
          boolean _or = false;
          if ((content instanceof Component)) {
            _or = true;
          } else {
            _or = (content instanceof Connector);
          }
          if (_or) {
            count = (count + 1);
          }
          if ((count >= 2)) {
            super.completeKeyword(keyword, contentAssistContext, acceptor);
            return;
          }
        }
      }
    } else {
      super.completeKeyword(keyword, contentAssistContext, acceptor);
    }
  }
}