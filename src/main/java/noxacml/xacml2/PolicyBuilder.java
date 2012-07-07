package noxacml.xacml2;

import java.util.List;

import noxacml.util.Fault;
import noxacml.util.SAMLBuilder;

import org.antlr.runtime.tree.Tree;
import org.opensaml.xacml.XACMLObject;
import org.opensaml.xacml.policy.ActionsType;
import org.opensaml.xacml.policy.AttributeDesignatorType;
import org.opensaml.xacml.policy.AttributeSelectorType;
import org.opensaml.xacml.policy.ConditionType;
import org.opensaml.xacml.policy.DefaultsType;
import org.opensaml.xacml.policy.DescriptionType;
import org.opensaml.xacml.policy.EffectType;
import org.opensaml.xacml.policy.EnvironmentsType;
import org.opensaml.xacml.policy.ExpressionType;
import org.opensaml.xacml.policy.ObligationsType;
import org.opensaml.xacml.policy.PolicySetType;
import org.opensaml.xacml.policy.PolicyType;
import org.opensaml.xacml.policy.ResourcesType;
import org.opensaml.xacml.policy.RuleType;
import org.opensaml.xacml.policy.SubjectAttributeDesignatorType;
import org.opensaml.xacml.policy.SubjectsType;
import org.opensaml.xacml.policy.TargetType;
import org.opensaml.xml.XMLObject;
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

	public PolicyBuilder()
	{
		this.builder = new SAMLBuilder();
	}

	// : (policy | policySet) EOF!
	public XACMLObject newXacmlFile(Tree t)
	{
//		Tree policyOrSet = t.getChild(0);
		if ("policy".equals(t.getText()))
			return newPolicyType(t);
		else if ("policyset".equals(t.getText()))
			return newPolicySetType(t);
		else
			throw new Fault("Expecting policy|policyset");
	}

	private PolicyType newPolicyType(Tree tree)
	{
		String tok = tree.getText();
		Tree policyId = tree.getChild(0);
		Tree combAlgId = tree.getChild(1);
		Tree target = tree.getChild(2);
		Tree condition = tree.getChild(3);

		PolicyType o = builder.create(PolicyType.class, PolicyType.DEFAULT_ELEMENT_NAME);
		o.setDescription(newDescriptionType(null));
		o.setPolicyId(policyId.getText());
		o.setObligations(null);
		o.setPolicyDefaults(null);
		o.setRuleCombiningAlgoId(combAlgId.getText());

		List<RuleType> r = o.getRules();
		if ("target".equals(target.getText()))
		{
			o.setTarget(newTargetType(target));
		}
		else if ("rule".equals(target.getText()))
		{
			r.add(newRuleType(target));
//			for (int i = 0; i < target.getChildCount(); i++)
//			{
//				Tree c = target.getChild(i);
//				r.add(newRuleType(c));
//			}
		}
		else
		{
			r.add(newRuleType(condition));
//			for (int i = 0; i < rules.getChildCount(); i++)
//			{
//				Tree c = rules.getChild(i);
//				r.add(newRuleType(c));
//			}
		}
		o.setVersion("");
		return o;
	}

	private PolicySetType newPolicySetType(Tree tree)
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

	private TargetType newTargetType(Tree tree)
	{
		String tok = tree.getText();
		Tree conditionals = tree.getChild(0);

		TargetType o = builder.create(TargetType.class, TargetType.DEFAULT_ELEMENT_NAME);
		for (int i = 0; i < conditionals.getChildCount(); i++)
		{
			Tree c = conditionals.getChild(i);
			XACMLObject co = newTargetMemberType(c);
			String cTok = c.getText();
			for (int j = 0; j < c.getChildCount(); j++)
			{
				Tree d = c.getChild(i);
				String dTok = d.getText();
//				o.getSubjects().add(newSubjectsType(d));
			}
		}
//		o.setSubjects(newSubjectsType(subjects));
//		o.setResources(newResourcesType(resources));
//		o.setActions(newActionType(actions));
//		o.setEnvironments(newEnvironmentType(environments));
		return o;
	}
	private XACMLObject newTargetMemberType(Tree tree)
	{
		return null;
	}

	private SubjectsType newSubjectsType(Tree tree)
	{
		SubjectsType o = builder.create(SubjectsType.class, SubjectsType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private EnvironmentsType newEnvironmentType(Object object)
	{
		EnvironmentsType o = builder.create(EnvironmentsType.class, EnvironmentsType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private ResourcesType newResourcesType(Tree tree)
	{
		ResourcesType o = builder.create(ResourcesType.class, ResourcesType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private ActionsType newActionType(Tree tree)
	{
		ActionsType o = builder.create(ActionsType.class, ActionsType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	//	: RULE_TOK ANYCASEIDENTIFIER? '{' (PERMIT_TOK | DENY_TOK) IF_TOK conditions '}'
	private RuleType newRuleType(Tree tree)
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
		if ("target".equals(first.getText()))
		{
			o.setTarget(newTargetType(first));
		}
		else if ("rule".equals(first.getText()))
		{
			o.setCondition(newConditionType(first));
		}
		else
		{
			o.setCondition(newConditionType(second));
		}
		return o;
	}

	private ConditionType newConditionType(Tree tree)
	{
		String tok = tree.getText();
		Tree expr = tree.getChild(0);

		ConditionType o = builder.create(ConditionType.class, ConditionType.DEFAULT_ELEMENT_NAME);
		o.setExpression(newExpressionType(expr));
		return o;
	}

	private ExpressionType newExpressionType(Tree tree)
	{
		String tok = tree.getText();
		Tree left = tree.getChild(0);
		Tree right = tree.getChild(1);

		if (".".equals(tok))
		{
			int dotNdx = left.getText().indexOf(".");
			String kind = left.getText().substring(0, dotNdx);
			AttributeDesignatorType o = builder.create(AttributeDesignatorType.class, AttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
			if ("subject".equals(kind))
			{
				o = builder.create(SubjectAttributeDesignatorType.class, SubjectAttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
			}
			else if ("resource".equals(kind) || "action".equals(kind) || "environment".equals(kind))
			{
				o = builder.create(AttributeDesignatorType.class, AttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
			}
//			else if ("action".equals(kind))
//			{
//				o = builder.create(SubjectAttributeDesignatorType.class, SubjectAttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
//
//			}
//			else if ("environment".equals(kind))
//			{
//				o = builder.create(SubjectAttributeDesignatorType.class, SubjectAttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
//
//			}
			else throw new Fault("Unrecognized kind:"+kind);
//			AttributeDesignatorType o = builder.create(AttributeDesignatorType.class, AttributeDesignatorType.DEFAULT_ELEMENT_NAME_XACML20);
//			AttributeSelectorType o = builder.create(AttributeSelectorType.class, AttributeSelectorType.DEFAULT_ELEMENT_NAME_XACML20);
			o.setAttribtueId(tok);
			o.setDataType("string");
			o.setIssuer("");
			o.setMustBePresent(false);
			List<XMLObject> l = o.getOrderedChildren();
			return o;
		}
		else
			throw new Fault("Not supported: "+tok);
//		ExpressionType o = builder.create(ExpressionType.class, ExpressionType.DEFAULT_ELEMENT_NAME_XACML20);
//		ApplyType
//		AttributeDesignatorType
//		AttributeSelectorType
//		AttributeValueType
//		ConditionType
//		FunctionType
//		VariableReferenceType
//		return o;
	}

	private DescriptionType newDescriptionType(Tree tree)
	{
		DescriptionType o = builder.create(DescriptionType.class, DescriptionType.DEFAULT_ELEMENT_NAME);
		o.setValue("");
		return o;
	}

	private EffectType newEffectType(Tree tree)
	{
		String tok = tree.getText();
		if (EffectType.Permit.name().toLowerCase().equals(tok))
			return EffectType.Permit;
		else if (EffectType.Deny.name().toLowerCase().equals(tok))
			return EffectType.Deny;
		else
			throw new Fault("Expecting permit|deny: "+tree);
	}

	private DefaultsType newDefaultsType(Tree tree)
	{
		DefaultsType o = builder.create(DefaultsType.class, DefaultsType.POLICY_DEFAULTS_ELEMENT_NAME);
		return o;
	}
	private ObligationsType newObligationsType(Tree tree)
	{
		ObligationsType o = builder.create(ObligationsType.class, ObligationsType.DEFAULT_ELEMENT_QNAME);
		return o;
	}

}
