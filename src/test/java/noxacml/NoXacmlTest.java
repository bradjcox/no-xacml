package noxacml;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoXacmlTest
{
	final static Logger log = LoggerFactory.getLogger(NoXacmlTest.class);
	final static StringBuilder buf = new StringBuilder();

	@Test
	public void noXacmlTest()
	{
		System.err.println("start");
		String path = "src/test/resources/noxacml/IIA001.noxacml";
		System.err.println(path);
		try
		{
			GrammarParser.policy_return p = runPolicy(path);
			Object t = p.getTree();
			return;
		}
		catch (Exception e)
		{
			log.error("Fault: {}", path, e);
		}
	}

	private GrammarParser.policy_return runPolicy(String path) throws Exception
	{
		GrammarLexer lexer = new GrammarLexer(new ANTLRFileStream(path));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokens);
		GrammarParser.policy_return p = parser.policy();

		TreeAdaptor ta = parser.getTreeAdaptor();
		CommonTree t = (CommonTree) p.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		printTree(t, 0);
		return p;
	}

	void printTree(final CommonTree t, final int indent)
	{
		if (t != null)
		{
			StringBuffer sb = new StringBuffer(indent);
			if (t.getParent() == null)
			{
				println(sb.toString() + t.getText().toString());
			}
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for (int i = 0; i < t.getChildCount(); i++)
			{
				println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree) t.getChild(i), indent + 1);
			}
		}
		return;
	}
	void println(String s)
	{
		buf.append(s);
		buf.append(" ");
		System.err.println(s);
	}

	abstract static class Node
	{

	}

	final static class PolicyNode extends Node
	{
		// final IdentifierNode name;
		// final IdentifierNode combiningAlg;
		// final List<TargetNode> targets;
		// final List<RuleNode> rules;
		//
		// public PolicyNode()
		// {
		//
		// }
		//
		// public void walk()
		// {
		// name.walk();
		// combiningAlg.walk();
		// targets.walk();
		// rules.walk();
		// }
	}

	class IdentifierNode extends Node
	{
		int value;

		public void walk()
		{}
	}
	class TargetNode extends Node
	{
		int value;

		public void walk()
		{}
	}
	class RuleNode extends Node
	{
		int value;

		public void walk()
		{}
	}
}
