package noxacml.xacml2;

import noxacml.util.Fault;
import noxacml.util.SAMLBuilder;

import org.antlr.runtime.tree.Tree;
import org.opensaml.xacml.policy.ActionsType;
import org.opensaml.xacml.policy.DescriptionType;
import org.opensaml.xacml.policy.EnvironmentsType;
import org.opensaml.xacml.policy.PolicyType;
import org.opensaml.xacml.policy.ResourcesType;
import org.opensaml.xacml.policy.RuleType;
import org.opensaml.xacml.policy.SubjectsType;
import org.opensaml.xacml.policy.TargetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Build XACML2.0 JAXB DOM tree from AST (abstract syntax tree)
 * produced by compiling a NoXACML policy.
 * @author brad
 *
 */
public class PolicyBuilder
{
	final static Logger log = LoggerFactory.getLogger(PolicyBuilder.class);
	final static SAMLBuilder builder = new SAMLBuilder();

	public static PolicyType newXacmlFile(Tree t)
	{
		PolicyType pt = newPolicyType(t.getChild(0));
		return pt;
	}
	public static PolicyType newPolicyType(Tree tree)
	{
//		XACMLObjectBuilderFactory builderFactory = Configuration.getBuilderFactory();
//		SAMLObjectBuilder<PolicyType> builder = (SAMLObjectBuilder<PolicyType>)
//				builderFactory.getBuilder(PolicyType.DEFAULT_ELEMENT_NAME);
//		PolicyType pt= builder.buildObject();
//
//		UnmarshallerFactory unmarshallerFactory = Configuration.getUnmarshallerFactory();
//		Unmarshaller unmarshaller = unmarshallerFactory.getUnmarshaller(rootElmt);
//		Object o = unmarshaller.unmarshall(rootElmt);
//		PolicyType pt = (PolicyType) o;
//
//		PolicyType o = new PolicyType();
		DescriptionType dt = builder.create(DescriptionType.class, DescriptionType.DEFAULT_ELEMENT_NAME);
		dt.setValue("");

		PolicyType o = builder.create(PolicyType.class, PolicyType.DEFAULT_ELEMENT_NAME);
		o.setDescription(dt);
		o.setPolicyId(tree.getChild(0).toString());
		o.setObligations(null);
		o.setPolicyDefaults(null);
		o.setRuleCombiningAlgoId(tree.getChild(1).toString());
		Tree c = tree.getChild(2);
		if ("target".equals(c.getText()))
		{
			o.setTarget(newTargetType(c));
		}
		else if ("rule".equals(c.getText()))
		{
//			o.setRule(newRuleType(c));
		}
		else
		{
			throw new Fault("Expecting rule|target in:"+c);
		}
		o.setTarget(newTargetType(c));
		o.setVersion("");
		return o;
	}

	private static TargetType newTargetType(Tree tree)
	{
		TargetType o = builder.create(TargetType.class, TargetType.DEFAULT_ELEMENT_NAME);
		o.setActions(newActionType(null));
		o.setEnvironments(newEnvironmentType(null));
		o.setResources(newResourcesType(null));
		o.setSubjects(newSubjectsType(null));
		return o;
	}

	private static RuleType newRuleType(Tree tree)
	{
		RuleType o = builder.create(RuleType.class, RuleType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private static SubjectsType newSubjectsType(Tree tree)
	{
		SubjectsType o = builder.create(SubjectsType.class, SubjectsType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private static EnvironmentsType newEnvironmentType(Object object)
	{
		EnvironmentsType o = builder.create(EnvironmentsType.class, EnvironmentsType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private static ResourcesType newResourcesType(Tree tree)
	{
		ResourcesType o = builder.create(ResourcesType.class, ResourcesType.DEFAULT_ELEMENT_NAME);
		return o;
	}

	private static ActionsType newActionType(Tree tree)
	{
		ActionsType o = builder.create(ActionsType.class, ActionsType.DEFAULT_ELEMENT_NAME);
		return o;
	}
}
