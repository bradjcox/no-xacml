package noxacml.xacml2;

import java.util.List;

import noxacml.util.Fault;
import noxacml.util.SAMLBuilder;
import noxacml.util.XACMLObjectUtil;
import noxacml.xacml2.Xacml2Types.Function;
import noxacml.xacml2.Xacml2Types.Type;

import org.antlr.runtime.tree.Tree;
import org.opensaml.xacml.XACMLObject;
import org.opensaml.xacml.policy.ActionMatchType;
import org.opensaml.xacml.policy.ActionType;
import org.opensaml.xacml.policy.ActionsType;
import org.opensaml.xacml.policy.ApplyType;
import org.opensaml.xacml.policy.AttributeSelectorType;
import org.opensaml.xacml.policy.AttributeValueType;
import org.opensaml.xacml.policy.ConditionType;
import org.opensaml.xacml.policy.DefaultsType;
import org.opensaml.xacml.policy.DescriptionType;
import org.opensaml.xacml.policy.EffectType;
import org.opensaml.xacml.policy.EnvironmentMatchType;
import org.opensaml.xacml.policy.EnvironmentType;
import org.opensaml.xacml.policy.EnvironmentsType;
import org.opensaml.xacml.policy.ExpressionType;
import org.opensaml.xacml.policy.ObligationsType;
import org.opensaml.xacml.policy.PolicySetType;
import org.opensaml.xacml.policy.PolicyType;
import org.opensaml.xacml.policy.ResourceMatchType;
import org.opensaml.xacml.policy.ResourceType;
import org.opensaml.xacml.policy.ResourcesType;
import org.opensaml.xacml.policy.RuleType;
import org.opensaml.xacml.policy.SubjectMatchType;
import org.opensaml.xacml.policy.SubjectType;
import org.opensaml.xacml.policy.SubjectsType;
import org.opensaml.xacml.policy.TargetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Build XACML2.0 JAXB DOM tree from AST (abstract syntax tree) produced by
 * compiling a NoXACML policy.
 *
 * @author brad
 *
 */
public class PolicyBuilder
{
	final Logger log = LoggerFactory.getLogger(PolicyBuilder.class);
	final SAMLBuilder builder;
	final Xacml2Types types = new Xacml2Types();

	public PolicyBuilder()
	{
		this.builder = new SAMLBuilder();
	}

	// : (policy | policySet) EOF!
	public XACMLObject newXacmlFile(Tree t)
	{
		// Tree policyOrSet = t.getChild(0);
		if ("policy".equals(t.getText())) return newPolicyType(t);
		else if ("policyset".equals(t.getText())) return newPolicySetType(t);
		else throw new Fault("Expecting policy|policyset");
	}

	PolicyType newPolicyType(Tree tree)
	{
		String tok = tree.getText();
		Tree policyId = tree.getChild(0);
		Tree combAlgId = tree.getChild(1);
		Tree target = tree.getChild(2);

		PolicyType o = builder.create(PolicyType.class, PolicyType.DEFAULT_ELEMENT_NAME);
		o.setDescription(newDescriptionType(null));
		o.setPolicyId(policyId.getText());
		o.setObligations(null);
		o.setPolicyDefaults(null);
		o.setRuleCombiningAlgoId(combAlgId.getText());
		o.setVersion("SomeVersion");

		List<RuleType> r = o.getRules();
		if ("target".equals(target.getText()))
		{
			o.setTarget(newTargetType(target));
		}
		else if ("rule".equals(target.getText()))
		{
			r.add(newRuleType(target));
		}
		else
		{
			throw new Fault("Expecting target|rule");
		}
		return o;
	}

	PolicySetType newPolicySetType(Tree tree)
	{
		Tree policyId = tree.getChild(0);
		Tree combAlgId = tree.getChild(1);
		Tree target = tree.getChild(2);
		Tree policyList = tree.getChild(3);

		PolicySetType o = builder.create(PolicySetType.class, PolicySetType.DEFAULT_ELEMENT_NAME);
		o.setPolicySetId(policyId.getText());
		o.setDescription(newDescriptionType(null));
		o.setPolicySetDefaults(newDefaultsType(null));
		o.setTarget(newTargetType(target));
		o.setPolicyCombiningAlgoId(combAlgId.getText());
		o.setVersion("");
		return o;
	}

	TargetType newTargetType(Tree tree)
	{
		String tok = tree.getText();
		Tree conditionals = tree.getChild(0);

		TargetType o = builder.create(TargetType.class, TargetType.DEFAULT_ELEMENT_NAME);
		// SubjectsType subjects = o.getSubjects();
		// ResourcesType resources = o.getResources();
		// ActionsType actions = o.getActions();
		// EnvironmentsType environments = o.getEnvironments();
		for (int i = 0; i < conditionals.getChildCount(); i++)
		{
			Tree c = conditionals.getChild(i);
			addMembersTypeToTarget(c, o);
		}
		return o;
	}

	void addMembersTypeToTarget(Tree tree, TargetType t)
	{
		String tok = tree.getText();
		Tree left = tree.getChild(0);
		Tree right = tree.getChild(1);
		if ("&&".equals(tok))
		{
			addMembersTypeToTarget(left, t);
			addMembersTypeToTarget(right, t);
		}
		else if ("||".equals(tok))
		{
			addMembersTypeToTarget(left, t);
			addMembersTypeToTarget(right, t);
		}
		else if ("matches".equals(tok))
		{
			addMemberTypeToTarget(left, t);
			// addMemberTypeToTarget(right, t);
		}
		else
		{
			throw new Fault("Expecting && or || or matches, got: " + tok);
		}
//		log.debug(XACMLObjectUtil.toString(t));
		return;
	}

	XACMLObject addMemberTypeToTarget(Tree tree, TargetType target)
	{
		String tok = tree.getText();
		Tree left = tree.getChild(0);
		Tree right = tree.getChild(1);

		if ("subject".equals(tok))
		{
			SubjectsType st = target.getSubjects();
			if (st == null)
			{
				st = builder.create(SubjectsType.class, SubjectsType.DEFAULT_ELEMENT_NAME);
				target.setSubjects(st);
			}

			SubjectType o1 = builder.create(SubjectType.class, SubjectType.DEFAULT_ELEMENT_NAME);
			List<SubjectMatchType> rm = o1.getSubjectMatches();
			rm.add(newSubjectMatchType(left));

			st.getSubjects().add(o1);
			return st;
		}
		else if ("resource".equals(tok))
		{
			ResourcesType st = target.getResources();
			if (st == null)
			{
				st = builder.create(ResourcesType.class, ResourcesType.DEFAULT_ELEMENT_NAME);
				target.setResources(st);
			}

			ResourceType o1 = builder.create(ResourceType.class, ResourceType.DEFAULT_ELEMENT_NAME);
			List<ResourceMatchType> rm = o1.getResourceMatches();
			rm.add(newResourceMatchType(left));

			st.getResources().add(o1);
			return st;
		}
		else if ("action".equals(tok))
		{
			ActionsType st = target.getActions();
			if (st == null)
			{
				st = builder.create(ActionsType.class, ActionsType.DEFAULT_ELEMENT_NAME);
				target.setActions(st);
			}

			ActionType o1 = builder.create(ActionType.class, ActionType.DEFAULT_ELEMENT_NAME);
			List<ActionMatchType> rm = o1.getActionMatches();
			rm.add(newActionMatchType(left));

			st.getActions().add(o1);
			return st;
		}
		else if ("environment".equals(tok))
		{
			EnvironmentsType st = target.getEnvironments();
			if (st == null)
			{
				st = builder.create(EnvironmentsType.class, EnvironmentsType.DEFAULT_ELEMENT_NAME);
				target.setEnvironments(st);
			}

			EnvironmentType o1 = builder.create(EnvironmentType.class, EnvironmentType.DEFAULT_ELEMENT_NAME);
			List<EnvironmentMatchType> rm = o1.getEnvrionmentMatches();
			rm.add(newEnvironmentMatchType(left));

			st.getEnvrionments().add(o1);
			return st;
		}
		else throw new Fault("Expecting subject|resource|action|environment in:" + right.toStringTree());
	}

	SubjectMatchType newSubjectMatchType(Tree t)
	{
		String tok = t.getText();
		Tree left = t.getChild(0);
		String name = t.getParent().getText() + "." + tok;

		SubjectMatchType o = builder.create(SubjectMatchType.class, SubjectMatchType.DEFAULT_ELEMENT_NAME);
		// o.getResourceAttributeDesignator();
		// o.getAttributeSelector();
		o.setAttributeSelector(newAttributeSelectorType(t));
		o.setMatchId("urn:oasis:names:tc:xacml:1.0:function:string-equal");
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	ResourceMatchType newResourceMatchType(Tree t)
	{
		String tok = t.getText();
		Tree left = t.getChild(0);

		ResourceMatchType o = builder.create(ResourceMatchType.class, ResourceMatchType.DEFAULT_ELEMENT_NAME);
		// o.getResourceAttributeDesignator();
		// o.getAttributeSelector();
		o.setAttributeSelector(newAttributeSelectorType(t));
		o.setAttributeValue(newAttributeValueType(t));
		o.setMatchId("urn:oasis:names:tc:xacml:1.0:function:string-equal");
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	ActionMatchType newActionMatchType(Tree t)
	{
		String tok = t.getText();
		Tree left = t.getChild(0);

		ActionMatchType o = builder.create(ActionMatchType.class, ActionMatchType.DEFAULT_ELEMENT_NAME);
		// o.getActionAttributeDesignator();
		// o.getAttributeSelector();
		o.setAttributeSelector(newAttributeSelectorType(t));
		o.setAttributeValue(newAttributeValueType(t));
		o.setMatchId("urn:oasis:names:tc:xacml:1.0:function:string-equal");
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	EnvironmentMatchType newEnvironmentMatchType(Tree t)
	{
		String tok = t.getText();
		Tree left = t.getChild(0);

		EnvironmentMatchType o = builder.create(EnvironmentMatchType.class, EnvironmentMatchType.DEFAULT_ELEMENT_QNAME);
		// o.getEnvironmentAttributeDesignator();
		// o.getAttributeSelector();
		o.setAttributeSelector(newAttributeSelectorType(t));
		o.setAttributeValue(newAttributeValueType(t));
		o.setMatchId("urn:oasis:names:tc:xacml:1.0:function:string-equal");
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	AttributeSelectorType newAttributeSelectorType(Tree tree)
	{
		String path = tree.getParent().getText() + "." + tree.getText();
		AttributeSelectorType o = builder.create(AttributeSelectorType.class, AttributeSelectorType.DEFAULT_ELEMENT_NAME);
		o.setMustBePresent(false);
		o.setDataType(Type.String.uri);
		o.setRequestContextPath(path);
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	AttributeValueType newAttributeValueType(Tree tree)
	{
		String path = tree.getParent().getText() + "." + tree.getText();
		AttributeValueType o = builder.create(AttributeValueType.class, AttributeValueType.DEFAULT_ELEMENT_NAME);
		o.setValue(tree.getText());
		o.setDataType("xs:string");
//		log.debug(XACMLObjectUtil.toString(o));
		return o;
	}

	RuleType newRuleType(Tree tree)
	{
		String tok = tree.getText();
		Tree ruleName = tree.getChild(0);
		Tree effect = tree.getChild(1);
		Tree first = tree.getChild(2);
		Tree second = tree.getChild(3);

		RuleType o = builder.create(RuleType.class, RuleType.DEFAULT_ELEMENT_NAME);
		o.setDescription(newDescriptionType(null));
		o.setEffect(newEffectType(effect));
		o.setRuleId(ruleName.getText());
		if (first != null)
		{
			if ("target".equals(first.getText()))
			{
				o.setTarget(newTargetType(first));
			}
			else if ("condition".equals(first.getText()))
			{
				o.setCondition(newConditionType(first));
			}
			else
			{
				throw new Fault("Expecting target");
			}
		}
		/* Don't join */
		if (second != null)
		{
			if ("condition".equals(second.getText()))
			{
				o.setCondition(newConditionType(second));
			}
			else
			{
				throw new Fault("Expecting condition");
			}
		}
		return o;
	}

	ConditionType newConditionType(Tree tree)
	{
		String tok = tree.getText();
		Tree expr = tree.getChild(0);

		ConditionType o = builder.create(ConditionType.class, ConditionType.DEFAULT_ELEMENT_NAME);
		o.setExpression(newBooleanOrExpr(expr));
		return o;
	}
	ExpressionType newBooleanOrExpr(Tree tree)
	{
		String tok = tree.getText();
		Tree t = tree.getChild(0);
		Tree l = tree.getChild(1);
		Tree r = tree.getChild(2);

		Type type = types.getType(t.getText());
		Function function = types.getFunction(tok, type);

		ApplyType o = builder.create(ApplyType.class, ApplyType.DEFAULT_ELEMENT_NAME);
		o.setFunctionId(function.oasisFunctionURI);

		if (r != null)
		{
			List<ExpressionType> e = o.getExpressions();
			e.add(newBooleanAndExpr(l));
			e.add(newBooleanAndExpr(r));
			return o;
		}
		else
		{
			return newBooleanAndExpr(l);
		}
	}
	ExpressionType newBooleanAndExpr(Tree tree)
	{
		String tok = tree.getText();
		Tree t = tree.getChild(0);
		Tree l = tree.getChild(1);
		Tree r = tree.getChild(2);

		Type type = types.getType(t.getText());
		Function function = types.getFunction(tok, type);

		ApplyType o = builder.create(ApplyType.class, ApplyType.DEFAULT_ELEMENT_NAME);
		o.setFunctionId(function.oasisFunctionURI);

		if (r != null)
		{
			List<ExpressionType> e = o.getExpressions();
			e.add(newBooleqnEquals(l));
			e.add(newBooleqnEquals(r));
			return o;
		}
		else
		{
			return newBooleqnEquals(l);
		}
	}

	ExpressionType newBooleqnEquals(Tree tree)
	{
		String tok = tree.getText();
		Tree t = tree.getChild(0);
		Tree l = tree.getChild(1);
		Tree r = tree.getChild(2);

		if (tok.startsWith("\""))
		{
			AttributeValueType o = newAttributeValueType(tree);
			return o;
		}
		else if ("subject".equals(tok) || "resource".equals(tok) || "action".equals(tok) || "environment".equals(tok))
		{
			return newAttributeSelectorType(l);
		}
		ApplyType o = builder.create(ApplyType.class, ApplyType.DEFAULT_ELEMENT_NAME);

		Type type = types.getType(t.getText());
		Function function = types.getFunction(tok, type);
		o.setFunctionId(function.oasisFunctionURI);
		List<ExpressionType> exprList = o.getExpressions();
		exprList.add(newBooleqnEquals(l));
		exprList.add(newBooleqnEquals(r));
		return o;
	}

	DescriptionType newDescriptionType(Tree tree)
	{
		DescriptionType o = builder.create(DescriptionType.class, DescriptionType.DEFAULT_ELEMENT_NAME);
		o.setValue("");
		return o;
	}

	EffectType newEffectType(Tree tree)
	{
		String tok = tree.getText();
		if (EffectType.Permit.name().toLowerCase().equals(tok)) return EffectType.Permit;
		else if (EffectType.Deny.name().toLowerCase().equals(tok)) return EffectType.Deny;
		else throw new Fault("Expecting permit|deny: " + tree);
	}

	DefaultsType newDefaultsType(Tree tree)
	{
		DefaultsType o = builder.create(DefaultsType.class, DefaultsType.POLICY_DEFAULTS_ELEMENT_NAME);
		return o;
	}

	ObligationsType newObligationsType(Tree tree)
	{
		ObligationsType o = builder.create(ObligationsType.class, ObligationsType.DEFAULT_ELEMENT_QNAME);
		return o;
	}
}