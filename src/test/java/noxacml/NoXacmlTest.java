package noxacml;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import noxacml.util.Fault;

import org.opensaml.xacml.policy.*;
import org.opensaml.xacml.ctx.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import noxacml.xacml2.PolicyBuilder;

public class NoXacmlTest
{
	final static Logger log = LoggerFactory.getLogger(NoXacmlTest.class);
	final static StringBuilder buf = new StringBuilder();

	@Test
	public void IIA010()
	{
		Object p = runPolicy("IIA/IIA010.nox");
		return;
	}

	@Test
	public void IIA009()
	{
		runPolicy("IIA/IIA009.nox");
		return;
	}

	@Test
	public void IIA006()
	{
		runPolicy("IIA/IIA006.nox");
		return;
	}

	@Test
	public void IIA005()
	{
		runPolicy("IIA/IIA005.nox");
		return;
	}

	@Test
	public void IIA004()
	{
		try
		{
			runPolicy("IIA/IIA004.nox");
			log.info("Fail");
		}
		catch (Throwable e)
		{
			log.info("Fault is expected: ");
		}
		return;
	}

	@Test
	public void IIA003()
	{
		runPolicy("IIA/IIA003.nox");
		return;
	}

	@Test
	public void IIA002()
	{
		runPolicy("IIA/IIA002.nox");
		return;
	}

	@Test
	public void IIA001()
	{
		runPolicy("IIA/IIA001.nox");
		return;
	}

	private PolicyType runPolicy(String path)
	{
		path = "src/test/resources/" + path;
		log.info(path);
		GrammarLexer lexer = null;
		GrammarParser parser = null;
		GrammarParser.xacmlFile_return xacmlFileRet = null;
		CommonTokenStream tokens = null;
		PolicyType policyType = null;
		Tree ast;
		try
		{
			lexer = new GrammarLexer(new ANTLRFileStream(path));
			tokens = new CommonTokenStream(lexer);
			parser = new GrammarParser(tokens);
			xacmlFileRet = (GrammarParser.xacmlFile_return) parser.xacmlFile();
			ast = (Tree) xacmlFileRet.getTree();
			policyType = PolicyBuilder.newXacmlFile(ast);

//			final NoXacmlTreeParser treeParser = new NoXacmlTreeParser(new CommonTreeNodeStream(ast));
//			final Formula queryFormula = treeParser.formula();
			return policyType;
		}
		catch (IOException e)
		{
			log.error("Fault:{}", path, e);
			assertTrue(false);
			throw new Fault(e);
		}
		catch (RecognitionException e)
		{
			log.error("Fault:{}", path, e);
			log.error(parser.getErrorMessage(e, parser.getTokenNames()));
			assertTrue(false);
			throw new Fault(e);
		}
	}

	void printTree(final Tree t, final int indent)
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
				printTree((Tree) t.getChild(i), indent + 1);
			}
		}
		return;
	}

	void println(String s)
	{
		buf.append(s);
		buf.append(" ");
		log.info(s);
	}

}
