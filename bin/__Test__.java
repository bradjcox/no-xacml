import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import noxacml.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        GrammarLexer lex = new GrammarLexer(new ANTLRFileStream("/Users/Brad/Dropbox/NoXacml/bin/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GrammarParser g = new GrammarParser(tokens, 49100, null);
        try {
            g.parseFile();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}