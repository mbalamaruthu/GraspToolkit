package uk.ac.standrews.graspide.grasp.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.standrews.graspide.grasp.generator.ContentGenerator;
import uk.ac.standrews.graspide.grasp.generator.GeneratorUtil;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;

/**
 * Generator Class for Rationales in architecture.
 */
@SuppressWarnings("all")
public class RationaleGenerator {
  public static void extractAndSetRationales(final EObject object) {
    List<BecauseCausalcontext> becauseClauseList = null;
    EList<BecauseCausalcontext> _becauseList = RationaleGenerator.getBecauseList(object);
    becauseClauseList = _becauseList;
    List<Rationale> rationales = new ArrayList<Rationale>();
    RationaleGenerator.addRationalesFromBecauseList(becauseClauseList, rationales);
    ContentGenerator.setRationales(rationales);
  }
  
  public static void addRationalesFromBecauseList(final List<BecauseCausalcontext> becauseClauseList, final List<Rationale> rationales) {
    boolean _or = false;
    boolean _equals = Objects.equal(becauseClauseList, null);
    if (_equals) {
      _or = true;
    } else {
      int _size = becauseClauseList.size();
      boolean _equals_1 = (_size == 0);
      _or = _equals_1;
    }
    if (_or) {
      return;
    }
    for (final BecauseCausalcontext becauseClause : becauseClauseList) {
      Rationale _value = becauseClause.getValue();
      rationales.add(_value);
    }
  }
  
  public static EList<BecauseCausalcontext> getBecauseList(final EObject object) {
    if ((object instanceof Provides)) {
      BecauseClause _becauseClause = ((Provides)object).getBecauseClause();
      boolean _notEquals = (!Objects.equal(_becauseClause, null));
      if (_notEquals) {
        BecauseClause _becauseClause_1 = ((Provides)object).getBecauseClause();
        return _becauseClause_1.getMembers();
      }
    } else {
      if ((object instanceof Component)) {
        BecauseClause _becauseClause_2 = ((Component)object).getBecauseClause();
        boolean _notEquals_1 = (!Objects.equal(_becauseClause_2, null));
        if (_notEquals_1) {
          BecauseClause _becauseClause_3 = ((Component)object).getBecauseClause();
          return _becauseClause_3.getMembers();
        }
      } else {
        if ((object instanceof Connector)) {
          BecauseClause _becauseClause_4 = ((Connector)object).getBecauseClause();
          boolean _notEquals_2 = (!Objects.equal(_becauseClause_4, null));
          if (_notEquals_2) {
            BecauseClause _becauseClause_5 = ((Connector)object).getBecauseClause();
            return _becauseClause_5.getMembers();
          }
        } else {
          if ((object instanceof Layer)) {
            BecauseClause _becauseClause_6 = ((Layer)object).getBecauseClause();
            boolean _notEquals_3 = (!Objects.equal(_becauseClause_6, null));
            if (_notEquals_3) {
              BecauseClause _becauseClause_7 = ((Layer)object).getBecauseClause();
              return _becauseClause_7.getMembers();
            }
          } else {
            if ((object instanceof Link)) {
              BecauseClause _becauseClause_8 = ((Link)object).getBecauseClause();
              boolean _notEquals_4 = (!Objects.equal(_becauseClause_8, null));
              if (_notEquals_4) {
                BecauseClause _becauseClause_9 = ((Link)object).getBecauseClause();
                return _becauseClause_9.getMembers();
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public static void extractAndSetRationales(final List<Link> linkList) {
    List<Rationale> rationales = new ArrayList<Rationale>();
    for (final Link link : linkList) {
      {
        EList<BecauseCausalcontext> becauseList = RationaleGenerator.getBecauseList(link);
        RationaleGenerator.addRationalesFromBecauseList(becauseList, rationales);
      }
    }
    ContentGenerator.setRationales(rationales);
    ArrayList<Rationale> _arrayList = new ArrayList<Rationale>();
    rationales = _arrayList;
    int _size = linkList.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Link link_1 = linkList.get(0);
      final GeneratorUtil utility = new GeneratorUtil();
      LinkConsumerExpression _linkConsumer = link_1.getLinkConsumer();
      final EObject lastConsumer = utility.getLastConsumer(_linkConsumer, false);
      if ((lastConsumer instanceof Requires)) {
        BecauseClause _becauseRequiresClause = ((Requires)lastConsumer).getBecauseRequiresClause();
        boolean _notEquals = (!Objects.equal(_becauseRequiresClause, null));
        if (_notEquals) {
          BecauseClause _becauseRequiresClause_1 = ((Requires)lastConsumer).getBecauseRequiresClause();
          final EList<BecauseCausalcontext> becauseList = _becauseRequiresClause_1.getMembers();
          RationaleGenerator.addRationalesFromBecauseList(becauseList, rationales);
        }
      }
    }
    ContentGenerator.setRequiredRationales(rationales);
  }
}
