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
	public void IIA004()
	{
		runPolicy("src/test/resources/noxacml/IIA004.nox");
		return;
	}

	@Test
	public void IIA003()
	{
		runPolicy("src/test/resources/noxacml/IIA003.nox");
		return;
	}

	@Test
	public void IIA002()
	{
		runPolicy("src/test/resources/noxacml/IIA002.nox");
		return;
	}

	@Test
	public void IIA001()
	{
		GrammarParser.policy_return p = runPolicy("src/test/resources/noxacml/IIA001.nox");
		return;
	}

	private GrammarParser.policy_return runPolicy(String path)
	{
		log.info(path);
		GrammarLexer lexer = null;
		GrammarParser parser = null;
		GrammarParser.policy_return p = null;
		CommonTokenStream tokens = null;
		try
		{
			lexer = new GrammarLexer(new ANTLRFileStream(path));
			tokens = new CommonTokenStream(lexer);
			parser = new GrammarParser(tokens);
			p = parser.policy();

			TreeAdaptor ta = parser.getTreeAdaptor();
			CommonTree t = (CommonTree) p.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
			printTree(t, 0);
			return p;
		}
		catch (IOException e)
		{
			log.error("Fault:{}", path, e);
		}
		catch (RecognitionException e)
		{
			log.error("Fault:{}", path, e);
			log.error(parser.getErrorMessage(e, parser.getTokenNames()));
		}
		catch (Throwable e)
		{
			log.error("Fault:{}", path, e);
			Object t = tokens.getTokens().get(25);
//			log.error(parser.getErrorMessage(e, parser.getTokenNames()));
		}
		return null;
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
		log.info(s);
	}
}
