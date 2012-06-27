package noxacml.xacml2;

import noxacml.GrammarParser;
import oasis.names.tc.xacml._2_0.policy.schema.os.ActionsType;
import oasis.names.tc.xacml._2_0.policy.schema.os.EnvironmentsType;
import oasis.names.tc.xacml._2_0.policy.schema.os.PolicyType;
import oasis.names.tc.xacml._2_0.policy.schema.os.ResourcesType;
import oasis.names.tc.xacml._2_0.policy.schema.os.SubjectsType;
import oasis.names.tc.xacml._2_0.policy.schema.os.TargetType;

import org.antlr.runtime.tree.Tree;
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

	public static PolicyType buildXacmlFile(Tree t)
	{
		PolicyType pt = buildPolicyType(t.getChild(0));
		return pt;
	}
	public static PolicyType buildPolicyType(Tree t)
	{
		PolicyType policyType = new PolicyType();
		policyType.setDescription(t.toStringTree());
		policyType.setPolicyId(t.getChild(0).toString());
		policyType.setObligations(null);
		policyType.setPolicyDefaults(null);
		policyType.setRuleCombiningAlgId(t.getChild(1).toString());
		policyType.setTarget(buildTargetType(t.getChild(3)));
		policyType.setVersion("");
		return policyType;
	}

	private static TargetType buildTargetType(Tree tree)
	{
		TargetType target = new TargetType();
		target.setActions(buildActionType(null));
		target.setEnvironments(buildEnvironmentType(null));
		target.setResources(buildResourcesType(null));
		target.setSubjects(buildSubjectsType(null));
		return target;
	}

	private static SubjectsType buildSubjectsType(Tree tree)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static EnvironmentsType buildEnvironmentType(Object object)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static ResourcesType buildResourcesType(Tree tree)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static ActionsType buildActionType(Tree tree)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
