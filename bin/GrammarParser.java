// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-06-24 19:42:48

	package noxacml;
	import java.util.Map;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_TOK", "ACTION_TOK", "ALLOFALL_TOK", "ALLOFANY_TOK", "ALLOF_TOK", "ANYCASEIDENTIFIER", "ANYOFALL_TOK", "ANYOFANY_TOK", "ANYOF_TOK", "ANYURI_TOK", "ATLEASTONEMENBEROF_TOK", "BAG_TOK", "BASE64BINARY_TOK", "BOOLEAN_TOK", "CHAR", "COMMENT", "CONCATENATE_TOK", "DATETIME_TOK", "DATE_TOK", "DAYTIMEDURATION_TOK", "DECIMAL_TOK", "DENY_TOK", "DEREF_TOK", "DOUBLE_CONSTANT", "DOUBLE_TOK", "ENVIRONMENT_TOK", "ESC_SEQ", "EXPONENT", "FALSE_TOK", "FLR_TOK", "HEXBINARY_TOK", "HEX_DIGIT", "IF_TOK", "INTEGER_CONSTANT", "INTEGER_TOK", "INTERSECTION_TOK", "ISIN_TOK", "LOWERCASEIDENTIFIER", "MAP_TOK", "MATCH_TOK", "NODECOUNT_TOK", "NODEEQUAL_TOK", "NODEMATCH_TOK", "NOF_TOK", "NORMALIZESPACE_TOK", "NORMALIZETOLOWERCASE_TOK", "NOT_TOK", "OCTAL_ESC", "ONEANDONLY_TOK", "PERMIT_TOK", "POLICYSET_TOK", "POLICY_TOK", "RANGEOP_TOK", "REGEXMATCH_TOK", "RESOURCE_TOK", "RFC822NAME_TOK", "RND_TOK", "RULE_TOK", "SETEQUALS_TOK", "SIGN", "SIZE_TOK", "STRING_CONSTANT", "STRING_CONSTANT_LIST", "STRING_TOK", "SUBJECT_TOK", "SUBSET_TOK", "TARGET_TOK", "TIME_TOK", "TRUE_TOK", "UNICODE_ESC", "UNION_TOK", "URI_TOK", "WHITESPACE", "X500NAME_TOK", "YEARMONTHDURATION_TOK", "'&&'", "'('", "')'", "','", "'.'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int ABS_TOK=4;
    public static final int ACTION_TOK=5;
    public static final int ALLOFALL_TOK=6;
    public static final int ALLOFANY_TOK=7;
    public static final int ALLOF_TOK=8;
    public static final int ANYCASEIDENTIFIER=9;
    public static final int ANYOFALL_TOK=10;
    public static final int ANYOFANY_TOK=11;
    public static final int ANYOF_TOK=12;
    public static final int ANYURI_TOK=13;
    public static final int ATLEASTONEMENBEROF_TOK=14;
    public static final int BAG_TOK=15;
    public static final int BASE64BINARY_TOK=16;
    public static final int BOOLEAN_TOK=17;
    public static final int CHAR=18;
    public static final int COMMENT=19;
    public static final int CONCATENATE_TOK=20;
    public static final int DATETIME_TOK=21;
    public static final int DATE_TOK=22;
    public static final int DAYTIMEDURATION_TOK=23;
    public static final int DECIMAL_TOK=24;
    public static final int DENY_TOK=25;
    public static final int DEREF_TOK=26;
    public static final int DOUBLE_CONSTANT=27;
    public static final int DOUBLE_TOK=28;
    public static final int ENVIRONMENT_TOK=29;
    public static final int ESC_SEQ=30;
    public static final int EXPONENT=31;
    public static final int FALSE_TOK=32;
    public static final int FLR_TOK=33;
    public static final int HEXBINARY_TOK=34;
    public static final int HEX_DIGIT=35;
    public static final int IF_TOK=36;
    public static final int INTEGER_CONSTANT=37;
    public static final int INTEGER_TOK=38;
    public static final int INTERSECTION_TOK=39;
    public static final int ISIN_TOK=40;
    public static final int LOWERCASEIDENTIFIER=41;
    public static final int MAP_TOK=42;
    public static final int MATCH_TOK=43;
    public static final int NODECOUNT_TOK=44;
    public static final int NODEEQUAL_TOK=45;
    public static final int NODEMATCH_TOK=46;
    public static final int NOF_TOK=47;
    public static final int NORMALIZESPACE_TOK=48;
    public static final int NORMALIZETOLOWERCASE_TOK=49;
    public static final int NOT_TOK=50;
    public static final int OCTAL_ESC=51;
    public static final int ONEANDONLY_TOK=52;
    public static final int PERMIT_TOK=53;
    public static final int POLICYSET_TOK=54;
    public static final int POLICY_TOK=55;
    public static final int RANGEOP_TOK=56;
    public static final int REGEXMATCH_TOK=57;
    public static final int RESOURCE_TOK=58;
    public static final int RFC822NAME_TOK=59;
    public static final int RND_TOK=60;
    public static final int RULE_TOK=61;
    public static final int SETEQUALS_TOK=62;
    public static final int SIGN=63;
    public static final int SIZE_TOK=64;
    public static final int STRING_CONSTANT=65;
    public static final int STRING_CONSTANT_LIST=66;
    public static final int STRING_TOK=67;
    public static final int SUBJECT_TOK=68;
    public static final int SUBSET_TOK=69;
    public static final int TARGET_TOK=70;
    public static final int TIME_TOK=71;
    public static final int TRUE_TOK=72;
    public static final int UNICODE_ESC=73;
    public static final int UNION_TOK=74;
    public static final int URI_TOK=75;
    public static final int WHITESPACE=76;
    public static final int X500NAME_TOK=77;
    public static final int YEARMONTHDURATION_TOK=78;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred14_Grammar", "doubleBag", "synpred32_Grammar", 
    "synpred27_Grammar", "synpred9_Grammar", "synpred17_Grammar", "anyUriExpr", 
    "x500NameExpr", "anyUriBag", "synpred34_Grammar", "synpred29_Grammar", 
    "dayTimeDurationExpr", "synpred26_Grammar", "yearMonthDurationBag", 
    "integerBag", "synpred21_Grammar", "synpred16_Grammar", "dateExpr", 
    "stringExpr", "target", "rfc822NameExpr", "booleanBag", "synpred2_Grammar", 
    "synpred8_Grammar", "synpred33_Grammar", "yearMonthDurationExpr", "synpred18_Grammar", 
    "anyBag", "rule", "synpred30_Grammar", "hexBinaryExpr", "timeBag", "synpred42_Grammar", 
    "synpred36_Grammar", "synpred25_Grammar", "base64BinaryExpr", "hexBinaryBag", 
    "synpred38_Grammar", "synpred7_Grammar", "synpred20_Grammar", "synpred31_Grammar", 
    "conditionalAndExpr", "isInOp", "synpred6_Grammar", "booleanExpr", "policy", 
    "dateTimeBag", "synpred1_Grammar", "dateTimeExpr", "synpred11_Grammar", 
    "x500NameBag", "timeExpr", "synpred37_Grammar", "synpred15_Grammar", 
    "synpred28_Grammar", "synpred40_Grammar", "synpred35_Grammar", "doubleExpr", 
    "synpred10_Grammar", "dayTimeDurationBag", "synpred41_Grammar", "equalityExpr", 
    "attributeExpr", "stringBag", "synpred39_Grammar", "rfc822NameBag", 
    "conditionalOrExpr", "regexOp", "synpred12_Grammar", "synpred4_Grammar", 
    "synpred22_Grammar", "synpred3_Grammar", "integerExpr", "synpred19_Grammar", 
    "synpred5_Grammar", "dateBag", "base64BinaryBag", "synpred23_Grammar", 
    "synpred13_Grammar", "synpred24_Grammar", "bagOp", "parseFile"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, true, false, 
        false, true, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public GrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public GrammarParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public GrammarParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g"; }


    public static class parseFile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parseFile"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:85:1: parseFile : policy EOF ;
    public final GrammarParser.parseFile_return parseFile() throws RecognitionException {
        GrammarParser.parseFile_return retval = new GrammarParser.parseFile_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        GrammarParser.policy_return policy1 =null;


        Object EOF2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parseFile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:86:2: ( policy EOF )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:86:4: policy EOF
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(86,4);
            pushFollow(FOLLOW_policy_in_parseFile424);
            policy1=policy();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());
            dbg.location(86,11);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parseFile426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = 
            (Object)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parseFile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parseFile"


    public static class policy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policy"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:89:1: policy : POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' ;
    public final GrammarParser.policy_return policy() throws RecognitionException {
        GrammarParser.policy_return retval = new GrammarParser.policy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POLICY_TOK3=null;
        Token ANYCASEIDENTIFIER4=null;
        Token LOWERCASEIDENTIFIER5=null;
        Token char_literal6=null;
        Token char_literal9=null;
        GrammarParser.target_return target7 =null;

        GrammarParser.rule_return rule8 =null;


        Object POLICY_TOK3_tree=null;
        Object ANYCASEIDENTIFIER4_tree=null;
        Object LOWERCASEIDENTIFIER5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policy");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:2: ( POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:4: POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(90,14);
            POLICY_TOK3=(Token)match(input,POLICY_TOK,FOLLOW_POLICY_TOK_in_policy437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY_TOK3_tree = 
            (Object)adaptor.create(POLICY_TOK3)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICY_TOK3_tree, root_0);
            }
            dbg.location(90,16);
            ANYCASEIDENTIFIER4=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER4_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER4)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER4_tree);
            }
            dbg.location(90,34);
            LOWERCASEIDENTIFIER5=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER5_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER5_tree);
            }
            dbg.location(90,54);
            char_literal6=(Token)match(input,89,FOLLOW_89_in_policy444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = 
            (Object)adaptor.create(char_literal6)
            ;
            adaptor.addChild(root_0, char_literal6_tree);
            }
            dbg.location(90,58);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:58: ( target )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==TARGET_TOK) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:58: target
                    {
                    dbg.location(90,58);
                    pushFollow(FOLLOW_target_in_policy446);
                    target7=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(90,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:66: ( rule )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TOK) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:66: rule
                    {
                    dbg.location(90,66);
                    pushFollow(FOLLOW_rule_in_policy449);
                    rule8=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(90,72);
            char_literal9=(Token)match(input,91,FOLLOW_91_in_policy452); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "policy");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "policy"


    public static class target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "target"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:93:1: target : TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' ;
    public final GrammarParser.target_return target() throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TARGET_TOK10=null;
        Token char_literal11=null;
        Token set12=null;
        Token IF_TOK13=null;
        Token char_literal15=null;
        GrammarParser.booleanExpr_return booleanExpr14 =null;


        Object TARGET_TOK10_tree=null;
        Object char_literal11_tree=null;
        Object set12_tree=null;
        Object IF_TOK13_tree=null;
        Object char_literal15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:2: ( TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:4: TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(94,14);
            TARGET_TOK10=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK10_tree = 
            (Object)adaptor.create(TARGET_TOK10)
            ;
            root_0 = (Object)adaptor.becomeRoot(TARGET_TOK10_tree, root_0);
            }
            dbg.location(94,16);
            char_literal11=(Token)match(input,89,FOLLOW_89_in_target466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);
            }
            dbg.location(94,20);
            set12=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set12)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(94,44);
            IF_TOK13=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_target476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK13_tree = 
            (Object)adaptor.create(IF_TOK13)
            ;
            adaptor.addChild(root_0, IF_TOK13_tree);
            }
            dbg.location(94,51);
            pushFollow(FOLLOW_booleanExpr_in_target478);
            booleanExpr14=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr14.getTree());
            dbg.location(94,63);
            char_literal15=(Token)match(input,91,FOLLOW_91_in_target480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(95, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "target");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "target"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:1: rule : RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' ;
    public final GrammarParser.rule_return rule() throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RULE_TOK16=null;
        Token ANYCASEIDENTIFIER17=null;
        Token char_literal18=null;
        Token set19=null;
        Token IF_TOK20=null;
        Token char_literal22=null;
        GrammarParser.booleanExpr_return booleanExpr21 =null;


        Object RULE_TOK16_tree=null;
        Object ANYCASEIDENTIFIER17_tree=null;
        Object char_literal18_tree=null;
        Object set19_tree=null;
        Object IF_TOK20_tree=null;
        Object char_literal22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:98:2: ( RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:98:4: RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(98,12);
            RULE_TOK16=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK16_tree = 
            (Object)adaptor.create(RULE_TOK16)
            ;
            root_0 = (Object)adaptor.becomeRoot(RULE_TOK16_tree, root_0);
            }
            dbg.location(98,14);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:98:14: ( ANYCASEIDENTIFIER )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ANYCASEIDENTIFIER) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:98:14: ANYCASEIDENTIFIER
                    {
                    dbg.location(98,14);
                    ANYCASEIDENTIFIER17=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER17_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER17)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER17_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(98,33);
            char_literal18=(Token)match(input,89,FOLLOW_89_in_rule497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);
            }
            dbg.location(98,37);
            set19=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set19)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(98,61);
            IF_TOK20=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_rule507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK20_tree = 
            (Object)adaptor.create(IF_TOK20)
            ;
            adaptor.addChild(root_0, IF_TOK20_tree);
            }
            dbg.location(98,68);
            pushFollow(FOLLOW_booleanExpr_in_rule509);
            booleanExpr21=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr21.getTree());
            dbg.location(98,80);
            char_literal22=(Token)match(input,91,FOLLOW_91_in_rule511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = 
            (Object)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule"


    public static class booleanExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' );
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TRUE_TOK23=null;
        Token FALSE_TOK24=null;
        Token BOOLEAN_TOK25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token NOF_TOK29=null;
        Token NOT_TOK30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal40=null;
        Token NODEEQUAL_TOK41=null;
        Token NODEMATCH_TOK42=null;
        Token char_literal43=null;
        Token char_literal45=null;
        GrammarParser.attributeExpr_return attributeExpr27 =null;

        GrammarParser.booleanExpr_return booleanExpr32 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr35 =null;

        GrammarParser.equalityExpr_return equalityExpr37 =null;

        GrammarParser.isInOp_return isInOp38 =null;

        GrammarParser.stringExpr_return stringExpr39 =null;

        GrammarParser.stringExpr_return stringExpr44 =null;


        Object TRUE_TOK23_tree=null;
        Object FALSE_TOK24_tree=null;
        Object BOOLEAN_TOK25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object NOF_TOK29_tree=null;
        Object NOT_TOK30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal40_tree=null;
        Object NODEEQUAL_TOK41_tree=null;
        Object NODEMATCH_TOK42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:102:2: ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' )
            int alt6=8;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            try {
                isCyclicDecision = true;
                alt6 = dfa6.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:102:4: TRUE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(102,12);
                    TRUE_TOK23=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_TOK23_tree = 
                    (Object)adaptor.create(TRUE_TOK23)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRUE_TOK23_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:103:4: FALSE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(103,13);
                    FALSE_TOK24=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_TOK24_tree = 
                    (Object)adaptor.create(FALSE_TOK24)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FALSE_TOK24_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:104:4: BOOLEAN_TOK ^ '(' attributeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(104,15);
                    BOOLEAN_TOK25=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanExpr534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_TOK25_tree = 
                    (Object)adaptor.create(BOOLEAN_TOK25)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK25_tree, root_0);
                    }
                    dbg.location(104,17);
                    char_literal26=(Token)match(input,80,FOLLOW_80_in_booleanExpr537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal26_tree = 
                    (Object)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    dbg.location(104,21);
                    pushFollow(FOLLOW_attributeExpr_in_booleanExpr539);
                    attributeExpr27=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr27.getTree());
                    dbg.location(104,35);
                    char_literal28=(Token)match(input,81,FOLLOW_81_in_booleanExpr541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal28_tree = 
                    (Object)adaptor.create(char_literal28)
                    ;
                    adaptor.addChild(root_0, char_literal28_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:4: ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(105,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:4: ( NOF_TOK ^| NOT_TOK ^)
                    int alt4=2;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NOF_TOK) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==NOT_TOK) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:6: NOF_TOK ^
                            {
                            dbg.location(105,13);
                            NOF_TOK29=(Token)match(input,NOF_TOK,FOLLOW_NOF_TOK_in_booleanExpr548); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOF_TOK29_tree = 
                            (Object)adaptor.create(NOF_TOK29)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOF_TOK29_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:17: NOT_TOK ^
                            {
                            dbg.location(105,24);
                            NOT_TOK30=(Token)match(input,NOT_TOK,FOLLOW_NOT_TOK_in_booleanExpr553); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOT_TOK30_tree = 
                            (Object)adaptor.create(NOT_TOK30)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOT_TOK30_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(105,27);
                    char_literal31=(Token)match(input,80,FOLLOW_80_in_booleanExpr557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal31_tree = 
                    (Object)adaptor.create(char_literal31)
                    ;
                    adaptor.addChild(root_0, char_literal31_tree);
                    }
                    dbg.location(105,31);
                    pushFollow(FOLLOW_booleanExpr_in_booleanExpr559);
                    booleanExpr32=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr32.getTree());
                    dbg.location(105,43);
                    char_literal33=(Token)match(input,81,FOLLOW_81_in_booleanExpr561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = 
                    (Object)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:106:4: '(' conditionalOrExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(106,4);
                    char_literal34=(Token)match(input,80,FOLLOW_80_in_booleanExpr566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = 
                    (Object)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    dbg.location(106,8);
                    pushFollow(FOLLOW_conditionalOrExpr_in_booleanExpr568);
                    conditionalOrExpr35=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr35.getTree());
                    dbg.location(106,26);
                    char_literal36=(Token)match(input,81,FOLLOW_81_in_booleanExpr570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = 
                    (Object)adaptor.create(char_literal36)
                    ;
                    adaptor.addChild(root_0, char_literal36_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:107:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(107,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr575);
                    equalityExpr37=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr37.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(108,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr580);
                    isInOp38=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp38.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:4: stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(109,4);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr585);
                    stringExpr39=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr39.getTree());
                    dbg.location(109,15);
                    char_literal40=(Token)match(input,83,FOLLOW_83_in_booleanExpr587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal40_tree = 
                    (Object)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);
                    }
                    dbg.location(109,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:19: ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^)
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==NODEEQUAL_TOK) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==NODEMATCH_TOK) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:21: NODEEQUAL_TOK ^
                            {
                            dbg.location(109,34);
                            NODEEQUAL_TOK41=(Token)match(input,NODEEQUAL_TOK,FOLLOW_NODEEQUAL_TOK_in_booleanExpr591); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEEQUAL_TOK41_tree = 
                            (Object)adaptor.create(NODEEQUAL_TOK41)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEEQUAL_TOK41_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:38: NODEMATCH_TOK ^
                            {
                            dbg.location(109,51);
                            NODEMATCH_TOK42=(Token)match(input,NODEMATCH_TOK,FOLLOW_NODEMATCH_TOK_in_booleanExpr596); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEMATCH_TOK42_tree = 
                            (Object)adaptor.create(NODEMATCH_TOK42)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEMATCH_TOK42_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(109,55);
                    char_literal43=(Token)match(input,80,FOLLOW_80_in_booleanExpr601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal43_tree = 
                    (Object)adaptor.create(char_literal43)
                    ;
                    adaptor.addChild(root_0, char_literal43_tree);
                    }
                    dbg.location(109,59);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr603);
                    stringExpr44=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr44.getTree());
                    dbg.location(109,70);
                    char_literal45=(Token)match(input,81,FOLLOW_81_in_booleanExpr605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal45_tree = 
                    (Object)adaptor.create(char_literal45)
                    ;
                    adaptor.addChild(root_0, char_literal45_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanExpr"


    public static class booleanBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:113:1: booleanBag : ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK46=null;
        Token STRING_CONSTANT_LIST47=null;

        Object BOOLEAN_TOK46_tree=null;
        Object STRING_CONSTANT_LIST47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:2: ( ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:4: ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(114,21);
            BOOLEAN_TOK46=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag623); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK46_tree = 
            (Object)adaptor.create(BOOLEAN_TOK46)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK46_tree);
            }
            dbg.location(114,33);
            STRING_CONSTANT_LIST47=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag625); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST47_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST47)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST47_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(117, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanBag"


    public static class conditionalOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:1: conditionalOrExpr : ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal49=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr48 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr50 =null;


        Object string_literal49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:5: ( ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:7: ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(120,31);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr647);
            conditionalAndExpr48=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr48.getTree());
            dbg.location(120,50);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:50: ( '||' conditionalAndExpr )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==90) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:51: '||' conditionalAndExpr
            	    {
            	    dbg.location(120,51);
            	    string_literal49=(Token)match(input,90,FOLLOW_90_in_conditionalOrExpr650); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal49_tree = 
            	    (Object)adaptor.create(string_literal49)
            	    ;
            	    adaptor.addChild(root_0, string_literal49_tree);
            	    }
            	    dbg.location(120,56);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr652);
            	    conditionalAndExpr50=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(121, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalOrExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalOrExpr"


    public static class conditionalAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:123:1: conditionalAndExpr : ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal52=null;
        GrammarParser.booleanExpr_return booleanExpr51 =null;

        GrammarParser.booleanExpr_return booleanExpr53 =null;


        Object string_literal52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:5: ( ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:7: ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(124,25);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr679);
            booleanExpr51=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr51.getTree());
            dbg.location(124,37);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:37: ( '&&' booleanExpr )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==79) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:38: '&&' booleanExpr
            	    {
            	    dbg.location(124,38);
            	    string_literal52=(Token)match(input,79,FOLLOW_79_in_conditionalAndExpr682); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal52_tree = 
            	    (Object)adaptor.create(string_literal52)
            	    ;
            	    adaptor.addChild(root_0, string_literal52_tree);
            	    }
            	    dbg.location(124,43);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr684);
            	    booleanExpr53=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr53.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(125, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalAndExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalAndExpr"


    public static class isInOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isInOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:127:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal55=null;
        Token ISIN_TOK56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token ISIN_TOK62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal67=null;
        Token ISIN_TOK68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token ISIN_TOK74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token ISIN_TOK80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token ISIN_TOK86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token ISIN_TOK92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token ISIN_TOK98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token ISIN_TOK104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token ISIN_TOK110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token ISIN_TOK116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token ISIN_TOK122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        Token char_literal127=null;
        Token ISIN_TOK128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        GrammarParser.doubleExpr_return doubleExpr54 =null;

        GrammarParser.doubleBag_return doubleBag58 =null;

        GrammarParser.stringExpr_return stringExpr60 =null;

        GrammarParser.stringBag_return stringBag64 =null;

        GrammarParser.anyUriExpr_return anyUriExpr66 =null;

        GrammarParser.anyUriBag_return anyUriBag70 =null;

        GrammarParser.dateExpr_return dateExpr72 =null;

        GrammarParser.dateBag_return dateBag76 =null;

        GrammarParser.timeExpr_return timeExpr78 =null;

        GrammarParser.timeBag_return timeBag82 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr84 =null;

        GrammarParser.dateTimeBag_return dateTimeBag88 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr90 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag94 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr96 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag100 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr102 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag106 =null;

        GrammarParser.x500NameExpr_return x500NameExpr108 =null;

        GrammarParser.x500NameBag_return x500NameBag112 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr114 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag118 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr120 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag124 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr126 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag130 =null;


        Object char_literal55_tree=null;
        Object ISIN_TOK56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        Object ISIN_TOK62_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        Object ISIN_TOK68_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object ISIN_TOK74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object ISIN_TOK80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object ISIN_TOK86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        Object char_literal91_tree=null;
        Object ISIN_TOK92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal97_tree=null;
        Object ISIN_TOK98_tree=null;
        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object ISIN_TOK104_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        Object char_literal109_tree=null;
        Object ISIN_TOK110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object ISIN_TOK116_tree=null;
        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;
        Object ISIN_TOK122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal125_tree=null;
        Object char_literal127_tree=null;
        Object ISIN_TOK128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:2: ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' )
            int alt9=13;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            try {
                isCyclicDecision = true;
                alt9 = dfa9.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:5: doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(128,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp701);
                    doubleExpr54=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr54.getTree());
                    dbg.location(128,16);
                    char_literal55=(Token)match(input,83,FOLLOW_83_in_isInOp703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = 
                    (Object)adaptor.create(char_literal55)
                    ;
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    dbg.location(128,28);
                    ISIN_TOK56=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK56_tree = 
                    (Object)adaptor.create(ISIN_TOK56)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK56_tree, root_0);
                    }
                    dbg.location(128,30);
                    char_literal57=(Token)match(input,80,FOLLOW_80_in_isInOp708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = 
                    (Object)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);
                    }
                    dbg.location(128,34);
                    pushFollow(FOLLOW_doubleBag_in_isInOp710);
                    doubleBag58=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag58.getTree());
                    dbg.location(128,44);
                    char_literal59=(Token)match(input,81,FOLLOW_81_in_isInOp712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = 
                    (Object)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:5: stringExpr '.' ISIN_TOK ^ '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(129,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp718);
                    stringExpr60=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr60.getTree());
                    dbg.location(129,16);
                    char_literal61=(Token)match(input,83,FOLLOW_83_in_isInOp720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal61_tree = 
                    (Object)adaptor.create(char_literal61)
                    ;
                    adaptor.addChild(root_0, char_literal61_tree);
                    }
                    dbg.location(129,28);
                    ISIN_TOK62=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK62_tree = 
                    (Object)adaptor.create(ISIN_TOK62)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK62_tree, root_0);
                    }
                    dbg.location(129,30);
                    char_literal63=(Token)match(input,80,FOLLOW_80_in_isInOp725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = 
                    (Object)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);
                    }
                    dbg.location(129,34);
                    pushFollow(FOLLOW_stringBag_in_isInOp727);
                    stringBag64=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag64.getTree());
                    dbg.location(129,44);
                    char_literal65=(Token)match(input,81,FOLLOW_81_in_isInOp729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = 
                    (Object)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:5: anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(130,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp735);
                    anyUriExpr66=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr66.getTree());
                    dbg.location(130,16);
                    char_literal67=(Token)match(input,83,FOLLOW_83_in_isInOp737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal67_tree = 
                    (Object)adaptor.create(char_literal67)
                    ;
                    adaptor.addChild(root_0, char_literal67_tree);
                    }
                    dbg.location(130,28);
                    ISIN_TOK68=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK68_tree = 
                    (Object)adaptor.create(ISIN_TOK68)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK68_tree, root_0);
                    }
                    dbg.location(130,30);
                    char_literal69=(Token)match(input,80,FOLLOW_80_in_isInOp742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal69_tree = 
                    (Object)adaptor.create(char_literal69)
                    ;
                    adaptor.addChild(root_0, char_literal69_tree);
                    }
                    dbg.location(130,34);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp744);
                    anyUriBag70=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag70.getTree());
                    dbg.location(130,44);
                    char_literal71=(Token)match(input,81,FOLLOW_81_in_isInOp746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:131:5: dateExpr '.' ISIN_TOK ^ '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(131,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp752);
                    dateExpr72=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr72.getTree());
                    dbg.location(131,14);
                    char_literal73=(Token)match(input,83,FOLLOW_83_in_isInOp754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);
                    }
                    dbg.location(131,26);
                    ISIN_TOK74=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK74_tree = 
                    (Object)adaptor.create(ISIN_TOK74)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK74_tree, root_0);
                    }
                    dbg.location(131,28);
                    char_literal75=(Token)match(input,80,FOLLOW_80_in_isInOp759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);
                    }
                    dbg.location(131,32);
                    pushFollow(FOLLOW_dateBag_in_isInOp761);
                    dateBag76=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag76.getTree());
                    dbg.location(131,40);
                    char_literal77=(Token)match(input,81,FOLLOW_81_in_isInOp763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = 
                    (Object)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:5: timeExpr '.' ISIN_TOK ^ '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(132,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp769);
                    timeExpr78=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr78.getTree());
                    dbg.location(132,14);
                    char_literal79=(Token)match(input,83,FOLLOW_83_in_isInOp771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal79_tree = 
                    (Object)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);
                    }
                    dbg.location(132,26);
                    ISIN_TOK80=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK80_tree = 
                    (Object)adaptor.create(ISIN_TOK80)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK80_tree, root_0);
                    }
                    dbg.location(132,28);
                    char_literal81=(Token)match(input,80,FOLLOW_80_in_isInOp776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal81_tree = 
                    (Object)adaptor.create(char_literal81)
                    ;
                    adaptor.addChild(root_0, char_literal81_tree);
                    }
                    dbg.location(132,32);
                    pushFollow(FOLLOW_timeBag_in_isInOp778);
                    timeBag82=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag82.getTree());
                    dbg.location(132,40);
                    char_literal83=(Token)match(input,81,FOLLOW_81_in_isInOp780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:133:5: dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(133,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp786);
                    dateTimeExpr84=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr84.getTree());
                    dbg.location(133,18);
                    char_literal85=(Token)match(input,83,FOLLOW_83_in_isInOp788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);
                    }
                    dbg.location(133,30);
                    ISIN_TOK86=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK86_tree = 
                    (Object)adaptor.create(ISIN_TOK86)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK86_tree, root_0);
                    }
                    dbg.location(133,32);
                    char_literal87=(Token)match(input,80,FOLLOW_80_in_isInOp793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);
                    }
                    dbg.location(133,36);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp795);
                    dateTimeBag88=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag88.getTree());
                    dbg.location(133,48);
                    char_literal89=(Token)match(input,81,FOLLOW_81_in_isInOp797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:5: base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(134,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp803);
                    base64BinaryExpr90=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr90.getTree());
                    dbg.location(134,22);
                    char_literal91=(Token)match(input,83,FOLLOW_83_in_isInOp805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
                    }
                    dbg.location(134,34);
                    ISIN_TOK92=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK92_tree = 
                    (Object)adaptor.create(ISIN_TOK92)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK92_tree, root_0);
                    }
                    dbg.location(134,36);
                    char_literal93=(Token)match(input,80,FOLLOW_80_in_isInOp810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    adaptor.addChild(root_0, char_literal93_tree);
                    }
                    dbg.location(134,40);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp812);
                    base64BinaryBag94=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag94.getTree());
                    dbg.location(134,56);
                    char_literal95=(Token)match(input,81,FOLLOW_81_in_isInOp814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal95_tree = 
                    (Object)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:5: dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(135,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp820);
                    dayTimeDurationExpr96=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr96.getTree());
                    dbg.location(135,25);
                    char_literal97=(Token)match(input,83,FOLLOW_83_in_isInOp822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);
                    }
                    dbg.location(135,37);
                    ISIN_TOK98=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK98_tree = 
                    (Object)adaptor.create(ISIN_TOK98)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK98_tree, root_0);
                    }
                    dbg.location(135,39);
                    char_literal99=(Token)match(input,80,FOLLOW_80_in_isInOp827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = 
                    (Object)adaptor.create(char_literal99)
                    ;
                    adaptor.addChild(root_0, char_literal99_tree);
                    }
                    dbg.location(135,43);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp829);
                    dayTimeDurationBag100=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag100.getTree());
                    dbg.location(135,62);
                    char_literal101=(Token)match(input,81,FOLLOW_81_in_isInOp831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = 
                    (Object)adaptor.create(char_literal101)
                    ;
                    adaptor.addChild(root_0, char_literal101_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:136:5: yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(136,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp837);
                    yearMonthDurationExpr102=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr102.getTree());
                    dbg.location(136,27);
                    char_literal103=(Token)match(input,83,FOLLOW_83_in_isInOp839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);
                    }
                    dbg.location(136,39);
                    ISIN_TOK104=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK104_tree = 
                    (Object)adaptor.create(ISIN_TOK104)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK104_tree, root_0);
                    }
                    dbg.location(136,41);
                    char_literal105=(Token)match(input,80,FOLLOW_80_in_isInOp844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal105_tree = 
                    (Object)adaptor.create(char_literal105)
                    ;
                    adaptor.addChild(root_0, char_literal105_tree);
                    }
                    dbg.location(136,45);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp846);
                    yearMonthDurationBag106=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag106.getTree());
                    dbg.location(136,66);
                    char_literal107=(Token)match(input,81,FOLLOW_81_in_isInOp848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = 
                    (Object)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:5: x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(137,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp854);
                    x500NameExpr108=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr108.getTree());
                    dbg.location(137,18);
                    char_literal109=(Token)match(input,83,FOLLOW_83_in_isInOp856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);
                    }
                    dbg.location(137,30);
                    ISIN_TOK110=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK110_tree = 
                    (Object)adaptor.create(ISIN_TOK110)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK110_tree, root_0);
                    }
                    dbg.location(137,32);
                    char_literal111=(Token)match(input,80,FOLLOW_80_in_isInOp861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal111_tree = 
                    (Object)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);
                    }
                    dbg.location(137,36);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp863);
                    x500NameBag112=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag112.getTree());
                    dbg.location(137,48);
                    char_literal113=(Token)match(input,81,FOLLOW_81_in_isInOp865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:5: rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(138,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp871);
                    rfc822NameExpr114=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr114.getTree());
                    dbg.location(138,20);
                    char_literal115=(Token)match(input,83,FOLLOW_83_in_isInOp873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = 
                    (Object)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    dbg.location(138,32);
                    ISIN_TOK116=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK116_tree = 
                    (Object)adaptor.create(ISIN_TOK116)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK116_tree, root_0);
                    }
                    dbg.location(138,34);
                    char_literal117=(Token)match(input,80,FOLLOW_80_in_isInOp878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = 
                    (Object)adaptor.create(char_literal117)
                    ;
                    adaptor.addChild(root_0, char_literal117_tree);
                    }
                    dbg.location(138,38);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp880);
                    rfc822NameBag118=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag118.getTree());
                    dbg.location(138,52);
                    char_literal119=(Token)match(input,81,FOLLOW_81_in_isInOp882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal119_tree = 
                    (Object)adaptor.create(char_literal119)
                    ;
                    adaptor.addChild(root_0, char_literal119_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:5: hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp888);
                    hexBinaryExpr120=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr120.getTree());
                    dbg.location(139,19);
                    char_literal121=(Token)match(input,83,FOLLOW_83_in_isInOp890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);
                    }
                    dbg.location(139,31);
                    ISIN_TOK122=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK122_tree = 
                    (Object)adaptor.create(ISIN_TOK122)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK122_tree, root_0);
                    }
                    dbg.location(139,33);
                    char_literal123=(Token)match(input,80,FOLLOW_80_in_isInOp895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal123_tree = 
                    (Object)adaptor.create(char_literal123)
                    ;
                    adaptor.addChild(root_0, char_literal123_tree);
                    }
                    dbg.location(139,37);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp897);
                    hexBinaryBag124=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag124.getTree());
                    dbg.location(139,50);
                    char_literal125=(Token)match(input,81,FOLLOW_81_in_isInOp899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal125_tree = 
                    (Object)adaptor.create(char_literal125)
                    ;
                    adaptor.addChild(root_0, char_literal125_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp911);
                    base64BinaryExpr126=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr126.getTree());
                    dbg.location(140,44);
                    char_literal127=(Token)match(input,83,FOLLOW_83_in_isInOp913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = 
                    (Object)adaptor.create(char_literal127)
                    ;
                    adaptor.addChild(root_0, char_literal127_tree);
                    }
                    dbg.location(140,56);
                    ISIN_TOK128=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK128_tree = 
                    (Object)adaptor.create(ISIN_TOK128)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK128_tree, root_0);
                    }
                    dbg.location(140,58);
                    char_literal129=(Token)match(input,80,FOLLOW_80_in_isInOp918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal129_tree = 
                    (Object)adaptor.create(char_literal129)
                    ;
                    adaptor.addChild(root_0, char_literal129_tree);
                    }
                    dbg.location(140,62);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp920);
                    base64BinaryBag130=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag130.getTree());
                    dbg.location(140,78);
                    char_literal131=(Token)match(input,81,FOLLOW_81_in_isInOp922); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal131_tree = 
                    (Object)adaptor.create(char_literal131)
                    ;
                    adaptor.addChild(root_0, char_literal131_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(141, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "isInOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "isInOp"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:143:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set133=null;
        Token set136=null;
        Token set139=null;
        Token set142=null;
        Token set145=null;
        Token set148=null;
        Token set151=null;
        Token set154=null;
        Token set157=null;
        Token set160=null;
        Token set163=null;
        Token set166=null;
        GrammarParser.integerExpr_return integerExpr132 =null;

        GrammarParser.integerExpr_return integerExpr134 =null;

        GrammarParser.doubleExpr_return doubleExpr135 =null;

        GrammarParser.doubleExpr_return doubleExpr137 =null;

        GrammarParser.stringExpr_return stringExpr138 =null;

        GrammarParser.stringExpr_return stringExpr140 =null;

        GrammarParser.anyUriExpr_return anyUriExpr141 =null;

        GrammarParser.anyUriExpr_return anyUriExpr143 =null;

        GrammarParser.dateExpr_return dateExpr144 =null;

        GrammarParser.dateExpr_return dateExpr146 =null;

        GrammarParser.timeExpr_return timeExpr147 =null;

        GrammarParser.timeExpr_return timeExpr149 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr150 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr152 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr153 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr155 =null;

        GrammarParser.x500NameExpr_return x500NameExpr156 =null;

        GrammarParser.x500NameExpr_return x500NameExpr158 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr159 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr161 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr162 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr164 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr165 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr167 =null;


        Object set133_tree=null;
        Object set136_tree=null;
        Object set139_tree=null;
        Object set142_tree=null;
        Object set145_tree=null;
        Object set148_tree=null;
        Object set151_tree=null;
        Object set154_tree=null;
        Object set157_tree=null;
        Object set160_tree=null;
        Object set163_tree=null;
        Object set166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr )
            int alt10=12;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            try {
                isCyclicDecision = true;
                alt10 = dfa10.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(144,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr933);
                    integerExpr132=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr132.getTree());
                    dbg.location(144,16);
                    set133=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set133)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(144,51);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr957);
                    integerExpr134=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr134.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr962);
                    doubleExpr135=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr135.getTree());
                    dbg.location(145,15);
                    set136=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set136)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(145,50);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr986);
                    doubleExpr137=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr137.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr991);
                    stringExpr138=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr138.getTree());
                    dbg.location(146,15);
                    set139=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set139)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(146,50);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1015);
                    stringExpr140=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr140.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(147,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1020);
                    anyUriExpr141=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr141.getTree());
                    dbg.location(147,15);
                    set142=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set142)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(147,50);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1044);
                    anyUriExpr143=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr143.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:148:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(148,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1049);
                    dateExpr144=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr144.getTree());
                    dbg.location(148,13);
                    set145=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set145)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(148,48);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1073);
                    dateExpr146=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr146.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(149,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1078);
                    timeExpr147=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr147.getTree());
                    dbg.location(149,13);
                    set148=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set148)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(149,48);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1102);
                    timeExpr149=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr149.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(150,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1107);
                    dateTimeExpr150=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr150.getTree());
                    dbg.location(150,17);
                    set151=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set151)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(150,52);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1131);
                    dateTimeExpr152=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr152.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(151,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1136);
                    yearMonthDurationExpr153=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr153.getTree());
                    dbg.location(151,26);
                    set154=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set154)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(151,61);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1160);
                    yearMonthDurationExpr155=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr155.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:152:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(152,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1165);
                    x500NameExpr156=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr156.getTree());
                    dbg.location(152,17);
                    set157=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set157)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(152,52);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1189);
                    x500NameExpr158=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr158.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(153,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1194);
                    rfc822NameExpr159=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr159.getTree());
                    dbg.location(153,19);
                    set160=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set160)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(153,55);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1219);
                    rfc822NameExpr161=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr161.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:4: ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(154,29);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1230);
                    dayTimeDurationExpr162=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr162.getTree());
                    dbg.location(154,49);
                    set163=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set163)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(154,84);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1254);
                    dayTimeDurationExpr164=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr164.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:4: ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(155,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1265);
                    base64BinaryExpr165=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr165.getTree());
                    dbg.location(155,43);
                    set166=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set166)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(155,78);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1289);
                    base64BinaryExpr167=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr167.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(156, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalityExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equalityExpr"


    public static class regexOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:158:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal169=null;
        Token REGEXMATCH_TOK170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token REGEXMATCH_TOK176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token REGEXMATCH_TOK182=null;
        Token char_literal183=null;
        Token char_literal185=null;
        Token char_literal187=null;
        Token REGEXMATCH_TOK188=null;
        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal193=null;
        Token REGEXMATCH_TOK194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        Token char_literal199=null;
        Token REGEXMATCH_TOK200=null;
        Token char_literal201=null;
        Token char_literal203=null;
        Token char_literal205=null;
        Token REGEXMATCH_TOK206=null;
        Token char_literal207=null;
        Token char_literal209=null;
        Token char_literal211=null;
        Token REGEXMATCH_TOK212=null;
        Token char_literal213=null;
        Token char_literal215=null;
        Token char_literal217=null;
        Token REGEXMATCH_TOK218=null;
        Token char_literal219=null;
        Token char_literal221=null;
        Token char_literal223=null;
        Token REGEXMATCH_TOK224=null;
        Token char_literal225=null;
        Token char_literal227=null;
        Token char_literal229=null;
        Token REGEXMATCH_TOK230=null;
        Token char_literal231=null;
        Token char_literal233=null;
        Token char_literal235=null;
        Token REGEXMATCH_TOK236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        GrammarParser.integerExpr_return integerExpr168 =null;

        GrammarParser.integerExpr_return integerExpr172 =null;

        GrammarParser.doubleExpr_return doubleExpr174 =null;

        GrammarParser.doubleExpr_return doubleExpr178 =null;

        GrammarParser.stringExpr_return stringExpr180 =null;

        GrammarParser.stringExpr_return stringExpr184 =null;

        GrammarParser.anyUriExpr_return anyUriExpr186 =null;

        GrammarParser.anyUriExpr_return anyUriExpr190 =null;

        GrammarParser.dateExpr_return dateExpr192 =null;

        GrammarParser.dateExpr_return dateExpr196 =null;

        GrammarParser.timeExpr_return timeExpr198 =null;

        GrammarParser.timeExpr_return timeExpr202 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr204 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr208 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr210 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr214 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr216 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr220 =null;

        GrammarParser.x500NameExpr_return x500NameExpr222 =null;

        GrammarParser.x500NameExpr_return x500NameExpr226 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr228 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr232 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr234 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr238 =null;


        Object char_literal169_tree=null;
        Object REGEXMATCH_TOK170_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object char_literal175_tree=null;
        Object REGEXMATCH_TOK176_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object REGEXMATCH_TOK182_tree=null;
        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        Object char_literal187_tree=null;
        Object REGEXMATCH_TOK188_tree=null;
        Object char_literal189_tree=null;
        Object char_literal191_tree=null;
        Object char_literal193_tree=null;
        Object REGEXMATCH_TOK194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;
        Object char_literal199_tree=null;
        Object REGEXMATCH_TOK200_tree=null;
        Object char_literal201_tree=null;
        Object char_literal203_tree=null;
        Object char_literal205_tree=null;
        Object REGEXMATCH_TOK206_tree=null;
        Object char_literal207_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        Object REGEXMATCH_TOK212_tree=null;
        Object char_literal213_tree=null;
        Object char_literal215_tree=null;
        Object char_literal217_tree=null;
        Object REGEXMATCH_TOK218_tree=null;
        Object char_literal219_tree=null;
        Object char_literal221_tree=null;
        Object char_literal223_tree=null;
        Object REGEXMATCH_TOK224_tree=null;
        Object char_literal225_tree=null;
        Object char_literal227_tree=null;
        Object char_literal229_tree=null;
        Object REGEXMATCH_TOK230_tree=null;
        Object char_literal231_tree=null;
        Object char_literal233_tree=null;
        Object char_literal235_tree=null;
        Object REGEXMATCH_TOK236_tree=null;
        Object char_literal237_tree=null;
        Object char_literal239_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:159:2: ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' )
            int alt11=12;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            try {
                isCyclicDecision = true;
                alt11 = dfa11.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:159:4: integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(159,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1301);
                    integerExpr168=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr168.getTree());
                    dbg.location(159,17);
                    char_literal169=(Token)match(input,83,FOLLOW_83_in_regexOp1304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = 
                    (Object)adaptor.create(char_literal169)
                    ;
                    adaptor.addChild(root_0, char_literal169_tree);
                    }
                    dbg.location(159,21);
                    REGEXMATCH_TOK170=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK170_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK170)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK170_tree);
                    }
                    dbg.location(159,36);
                    char_literal171=(Token)match(input,80,FOLLOW_80_in_regexOp1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal171_tree = 
                    (Object)adaptor.create(char_literal171)
                    ;
                    adaptor.addChild(root_0, char_literal171_tree);
                    }
                    dbg.location(159,40);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1310);
                    integerExpr172=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr172.getTree());
                    dbg.location(159,52);
                    char_literal173=(Token)match(input,81,FOLLOW_81_in_regexOp1312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:4: doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(160,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1317);
                    doubleExpr174=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr174.getTree());
                    dbg.location(160,15);
                    char_literal175=(Token)match(input,83,FOLLOW_83_in_regexOp1319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = 
                    (Object)adaptor.create(char_literal175)
                    ;
                    adaptor.addChild(root_0, char_literal175_tree);
                    }
                    dbg.location(160,19);
                    REGEXMATCH_TOK176=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK176_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK176)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK176_tree);
                    }
                    dbg.location(160,34);
                    char_literal177=(Token)match(input,80,FOLLOW_80_in_regexOp1323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal177_tree = 
                    (Object)adaptor.create(char_literal177)
                    ;
                    adaptor.addChild(root_0, char_literal177_tree);
                    }
                    dbg.location(160,38);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1325);
                    doubleExpr178=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr178.getTree());
                    dbg.location(160,49);
                    char_literal179=(Token)match(input,81,FOLLOW_81_in_regexOp1327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal179_tree = 
                    (Object)adaptor.create(char_literal179)
                    ;
                    adaptor.addChild(root_0, char_literal179_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:4: stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(161,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1332);
                    stringExpr180=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr180.getTree());
                    dbg.location(161,15);
                    char_literal181=(Token)match(input,83,FOLLOW_83_in_regexOp1334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal181_tree = 
                    (Object)adaptor.create(char_literal181)
                    ;
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    dbg.location(161,19);
                    REGEXMATCH_TOK182=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK182_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK182)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK182_tree);
                    }
                    dbg.location(161,34);
                    char_literal183=(Token)match(input,80,FOLLOW_80_in_regexOp1338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal183_tree = 
                    (Object)adaptor.create(char_literal183)
                    ;
                    adaptor.addChild(root_0, char_literal183_tree);
                    }
                    dbg.location(161,38);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1340);
                    stringExpr184=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr184.getTree());
                    dbg.location(161,49);
                    char_literal185=(Token)match(input,81,FOLLOW_81_in_regexOp1342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal185_tree = 
                    (Object)adaptor.create(char_literal185)
                    ;
                    adaptor.addChild(root_0, char_literal185_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:4: anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(162,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1347);
                    anyUriExpr186=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr186.getTree());
                    dbg.location(162,15);
                    char_literal187=(Token)match(input,83,FOLLOW_83_in_regexOp1349); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal187_tree = 
                    (Object)adaptor.create(char_literal187)
                    ;
                    adaptor.addChild(root_0, char_literal187_tree);
                    }
                    dbg.location(162,19);
                    REGEXMATCH_TOK188=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK188_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK188)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK188_tree);
                    }
                    dbg.location(162,34);
                    char_literal189=(Token)match(input,80,FOLLOW_80_in_regexOp1353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal189_tree = 
                    (Object)adaptor.create(char_literal189)
                    ;
                    adaptor.addChild(root_0, char_literal189_tree);
                    }
                    dbg.location(162,38);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1355);
                    anyUriExpr190=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr190.getTree());
                    dbg.location(162,49);
                    char_literal191=(Token)match(input,81,FOLLOW_81_in_regexOp1357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal191_tree = 
                    (Object)adaptor.create(char_literal191)
                    ;
                    adaptor.addChild(root_0, char_literal191_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:4: dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(163,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1362);
                    dateExpr192=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr192.getTree());
                    dbg.location(163,13);
                    char_literal193=(Token)match(input,83,FOLLOW_83_in_regexOp1364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal193_tree = 
                    (Object)adaptor.create(char_literal193)
                    ;
                    adaptor.addChild(root_0, char_literal193_tree);
                    }
                    dbg.location(163,17);
                    REGEXMATCH_TOK194=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK194_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK194)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK194_tree);
                    }
                    dbg.location(163,32);
                    char_literal195=(Token)match(input,80,FOLLOW_80_in_regexOp1368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal195_tree = 
                    (Object)adaptor.create(char_literal195)
                    ;
                    adaptor.addChild(root_0, char_literal195_tree);
                    }
                    dbg.location(163,36);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1370);
                    dateExpr196=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr196.getTree());
                    dbg.location(163,45);
                    char_literal197=(Token)match(input,81,FOLLOW_81_in_regexOp1372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:4: timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(164,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1377);
                    timeExpr198=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr198.getTree());
                    dbg.location(164,13);
                    char_literal199=(Token)match(input,83,FOLLOW_83_in_regexOp1379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal199_tree = 
                    (Object)adaptor.create(char_literal199)
                    ;
                    adaptor.addChild(root_0, char_literal199_tree);
                    }
                    dbg.location(164,17);
                    REGEXMATCH_TOK200=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK200_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK200)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK200_tree);
                    }
                    dbg.location(164,32);
                    char_literal201=(Token)match(input,80,FOLLOW_80_in_regexOp1383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal201_tree = 
                    (Object)adaptor.create(char_literal201)
                    ;
                    adaptor.addChild(root_0, char_literal201_tree);
                    }
                    dbg.location(164,36);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1385);
                    timeExpr202=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr202.getTree());
                    dbg.location(164,45);
                    char_literal203=(Token)match(input,81,FOLLOW_81_in_regexOp1387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal203_tree = 
                    (Object)adaptor.create(char_literal203)
                    ;
                    adaptor.addChild(root_0, char_literal203_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:4: dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1392);
                    dateTimeExpr204=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr204.getTree());
                    dbg.location(165,17);
                    char_literal205=(Token)match(input,83,FOLLOW_83_in_regexOp1394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal205_tree = 
                    (Object)adaptor.create(char_literal205)
                    ;
                    adaptor.addChild(root_0, char_literal205_tree);
                    }
                    dbg.location(165,21);
                    REGEXMATCH_TOK206=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK206_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK206)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK206_tree);
                    }
                    dbg.location(165,36);
                    char_literal207=(Token)match(input,80,FOLLOW_80_in_regexOp1398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal207_tree = 
                    (Object)adaptor.create(char_literal207)
                    ;
                    adaptor.addChild(root_0, char_literal207_tree);
                    }
                    dbg.location(165,40);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1400);
                    dateTimeExpr208=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr208.getTree());
                    dbg.location(165,53);
                    char_literal209=(Token)match(input,81,FOLLOW_81_in_regexOp1402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal209_tree = 
                    (Object)adaptor.create(char_literal209)
                    ;
                    adaptor.addChild(root_0, char_literal209_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:4: dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(166,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1407);
                    dayTimeDurationExpr210=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr210.getTree());
                    dbg.location(166,24);
                    char_literal211=(Token)match(input,83,FOLLOW_83_in_regexOp1409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal211_tree = 
                    (Object)adaptor.create(char_literal211)
                    ;
                    adaptor.addChild(root_0, char_literal211_tree);
                    }
                    dbg.location(166,28);
                    REGEXMATCH_TOK212=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK212_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK212)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK212_tree);
                    }
                    dbg.location(166,43);
                    char_literal213=(Token)match(input,80,FOLLOW_80_in_regexOp1413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal213_tree = 
                    (Object)adaptor.create(char_literal213)
                    ;
                    adaptor.addChild(root_0, char_literal213_tree);
                    }
                    dbg.location(166,47);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1415);
                    dayTimeDurationExpr214=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr214.getTree());
                    dbg.location(166,67);
                    char_literal215=(Token)match(input,81,FOLLOW_81_in_regexOp1417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal215_tree = 
                    (Object)adaptor.create(char_literal215)
                    ;
                    adaptor.addChild(root_0, char_literal215_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:167:4: yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(167,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1422);
                    yearMonthDurationExpr216=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr216.getTree());
                    dbg.location(167,26);
                    char_literal217=(Token)match(input,83,FOLLOW_83_in_regexOp1424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal217_tree = 
                    (Object)adaptor.create(char_literal217)
                    ;
                    adaptor.addChild(root_0, char_literal217_tree);
                    }
                    dbg.location(167,30);
                    REGEXMATCH_TOK218=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK218_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK218)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK218_tree);
                    }
                    dbg.location(167,45);
                    char_literal219=(Token)match(input,80,FOLLOW_80_in_regexOp1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal219_tree = 
                    (Object)adaptor.create(char_literal219)
                    ;
                    adaptor.addChild(root_0, char_literal219_tree);
                    }
                    dbg.location(167,49);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1430);
                    yearMonthDurationExpr220=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr220.getTree());
                    dbg.location(167,71);
                    char_literal221=(Token)match(input,81,FOLLOW_81_in_regexOp1432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal221_tree = 
                    (Object)adaptor.create(char_literal221)
                    ;
                    adaptor.addChild(root_0, char_literal221_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:4: x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(168,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1437);
                    x500NameExpr222=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr222.getTree());
                    dbg.location(168,17);
                    char_literal223=(Token)match(input,83,FOLLOW_83_in_regexOp1439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal223_tree = 
                    (Object)adaptor.create(char_literal223)
                    ;
                    adaptor.addChild(root_0, char_literal223_tree);
                    }
                    dbg.location(168,21);
                    REGEXMATCH_TOK224=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK224_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK224)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK224_tree);
                    }
                    dbg.location(168,36);
                    char_literal225=(Token)match(input,80,FOLLOW_80_in_regexOp1443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal225_tree = 
                    (Object)adaptor.create(char_literal225)
                    ;
                    adaptor.addChild(root_0, char_literal225_tree);
                    }
                    dbg.location(168,40);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1445);
                    x500NameExpr226=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr226.getTree());
                    dbg.location(168,53);
                    char_literal227=(Token)match(input,81,FOLLOW_81_in_regexOp1447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal227_tree = 
                    (Object)adaptor.create(char_literal227)
                    ;
                    adaptor.addChild(root_0, char_literal227_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:4: rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1452);
                    rfc822NameExpr228=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr228.getTree());
                    dbg.location(169,19);
                    char_literal229=(Token)match(input,83,FOLLOW_83_in_regexOp1454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal229_tree = 
                    (Object)adaptor.create(char_literal229)
                    ;
                    adaptor.addChild(root_0, char_literal229_tree);
                    }
                    dbg.location(169,23);
                    REGEXMATCH_TOK230=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK230_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK230)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK230_tree);
                    }
                    dbg.location(169,38);
                    char_literal231=(Token)match(input,80,FOLLOW_80_in_regexOp1458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal231_tree = 
                    (Object)adaptor.create(char_literal231)
                    ;
                    adaptor.addChild(root_0, char_literal231_tree);
                    }
                    dbg.location(169,42);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1460);
                    rfc822NameExpr232=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr232.getTree());
                    dbg.location(169,57);
                    char_literal233=(Token)match(input,81,FOLLOW_81_in_regexOp1462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = 
                    (Object)adaptor.create(char_literal233)
                    ;
                    adaptor.addChild(root_0, char_literal233_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1473);
                    base64BinaryExpr234=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr234.getTree());
                    dbg.location(170,43);
                    char_literal235=(Token)match(input,83,FOLLOW_83_in_regexOp1475); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal235_tree = 
                    (Object)adaptor.create(char_literal235)
                    ;
                    adaptor.addChild(root_0, char_literal235_tree);
                    }
                    dbg.location(170,47);
                    REGEXMATCH_TOK236=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK236_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK236)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK236_tree);
                    }
                    dbg.location(170,62);
                    char_literal237=(Token)match(input,80,FOLLOW_80_in_regexOp1479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);
                    }
                    dbg.location(170,66);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1481);
                    base64BinaryExpr238=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr238.getTree());
                    dbg.location(170,83);
                    char_literal239=(Token)match(input,81,FOLLOW_81_in_regexOp1483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(171, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "regexOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "regexOp"


    public static class bagOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bagOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:1: bagOp : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' );
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal241=null;
        Token set242=null;
        Token char_literal243=null;
        Token char_literal245=null;
        Token char_literal247=null;
        Token set248=null;
        Token char_literal249=null;
        Token char_literal251=null;
        Token char_literal253=null;
        Token set254=null;
        Token char_literal255=null;
        Token char_literal257=null;
        Token char_literal259=null;
        Token set260=null;
        Token char_literal261=null;
        Token char_literal263=null;
        Token char_literal265=null;
        Token set266=null;
        Token char_literal267=null;
        Token char_literal269=null;
        Token char_literal271=null;
        Token set272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        Token char_literal277=null;
        Token set278=null;
        Token char_literal279=null;
        Token char_literal281=null;
        Token char_literal283=null;
        Token set284=null;
        Token char_literal285=null;
        Token char_literal287=null;
        Token char_literal289=null;
        Token set290=null;
        Token char_literal291=null;
        Token char_literal293=null;
        Token char_literal295=null;
        Token set296=null;
        Token char_literal297=null;
        Token char_literal299=null;
        Token char_literal301=null;
        Token set302=null;
        Token char_literal303=null;
        Token char_literal305=null;
        Token char_literal307=null;
        Token set308=null;
        Token char_literal309=null;
        Token char_literal311=null;
        Token char_literal313=null;
        Token set314=null;
        Token char_literal315=null;
        Token char_literal317=null;
        Token char_literal319=null;
        Token set320=null;
        Token char_literal321=null;
        Token char_literal323=null;
        Token char_literal325=null;
        Token set326=null;
        Token char_literal327=null;
        Token char_literal329=null;
        GrammarParser.booleanBag_return booleanBag240 =null;

        GrammarParser.booleanBag_return booleanBag244 =null;

        GrammarParser.integerBag_return integerBag246 =null;

        GrammarParser.integerBag_return integerBag250 =null;

        GrammarParser.doubleBag_return doubleBag252 =null;

        GrammarParser.doubleBag_return doubleBag256 =null;

        GrammarParser.stringBag_return stringBag258 =null;

        GrammarParser.stringBag_return stringBag262 =null;

        GrammarParser.dateBag_return dateBag264 =null;

        GrammarParser.dateBag_return dateBag268 =null;

        GrammarParser.timeBag_return timeBag270 =null;

        GrammarParser.timeBag_return timeBag274 =null;

        GrammarParser.dateTimeBag_return dateTimeBag276 =null;

        GrammarParser.dateTimeBag_return dateTimeBag280 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag282 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag286 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag288 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag292 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag294 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag298 =null;

        GrammarParser.anyUriBag_return anyUriBag300 =null;

        GrammarParser.anyUriBag_return anyUriBag304 =null;

        GrammarParser.x500NameBag_return x500NameBag306 =null;

        GrammarParser.x500NameBag_return x500NameBag310 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag312 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag316 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag318 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag322 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag324 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag328 =null;


        Object char_literal241_tree=null;
        Object set242_tree=null;
        Object char_literal243_tree=null;
        Object char_literal245_tree=null;
        Object char_literal247_tree=null;
        Object set248_tree=null;
        Object char_literal249_tree=null;
        Object char_literal251_tree=null;
        Object char_literal253_tree=null;
        Object set254_tree=null;
        Object char_literal255_tree=null;
        Object char_literal257_tree=null;
        Object char_literal259_tree=null;
        Object set260_tree=null;
        Object char_literal261_tree=null;
        Object char_literal263_tree=null;
        Object char_literal265_tree=null;
        Object set266_tree=null;
        Object char_literal267_tree=null;
        Object char_literal269_tree=null;
        Object char_literal271_tree=null;
        Object set272_tree=null;
        Object char_literal273_tree=null;
        Object char_literal275_tree=null;
        Object char_literal277_tree=null;
        Object set278_tree=null;
        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object char_literal283_tree=null;
        Object set284_tree=null;
        Object char_literal285_tree=null;
        Object char_literal287_tree=null;
        Object char_literal289_tree=null;
        Object set290_tree=null;
        Object char_literal291_tree=null;
        Object char_literal293_tree=null;
        Object char_literal295_tree=null;
        Object set296_tree=null;
        Object char_literal297_tree=null;
        Object char_literal299_tree=null;
        Object char_literal301_tree=null;
        Object set302_tree=null;
        Object char_literal303_tree=null;
        Object char_literal305_tree=null;
        Object char_literal307_tree=null;
        Object set308_tree=null;
        Object char_literal309_tree=null;
        Object char_literal311_tree=null;
        Object char_literal313_tree=null;
        Object set314_tree=null;
        Object char_literal315_tree=null;
        Object char_literal317_tree=null;
        Object char_literal319_tree=null;
        Object set320_tree=null;
        Object char_literal321_tree=null;
        Object char_literal323_tree=null;
        Object char_literal325_tree=null;
        Object set326_tree=null;
        Object char_literal327_tree=null;
        Object char_literal329_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' )
            int alt12=15;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN_TOK) && (synpred8_Grammar())) {
                alt12=1;
            }
            else if ( (LA12_0==INTEGER_TOK) && (synpred9_Grammar())) {
                alt12=2;
            }
            else if ( (LA12_0==BAG_TOK) && (synpred9_Grammar())) {
                alt12=2;
            }
            else if ( (LA12_0==DOUBLE_TOK) && (synpred10_Grammar())) {
                alt12=3;
            }
            else if ( (LA12_0==STRING_TOK) && (synpred11_Grammar())) {
                alt12=4;
            }
            else if ( (LA12_0==ACTION_TOK||LA12_0==ENVIRONMENT_TOK||LA12_0==RESOURCE_TOK||LA12_0==SUBJECT_TOK) && (synpred11_Grammar())) {
                alt12=4;
            }
            else if ( (LA12_0==DATE_TOK) && (synpred12_Grammar())) {
                alt12=5;
            }
            else if ( (LA12_0==TIME_TOK) && (synpred13_Grammar())) {
                alt12=6;
            }
            else if ( (LA12_0==DATETIME_TOK) && (synpred14_Grammar())) {
                alt12=7;
            }
            else if ( (LA12_0==BASE64BINARY_TOK) ) {
                int LA12_10 = input.LA(2);

                if ( (LA12_10==STRING_CONSTANT_LIST) ) {
                    int LA12_17 = input.LA(3);

                    if ( (LA12_17==83) ) {
                        int LA12_18 = input.LA(4);

                        if ( (LA12_18==ATLEASTONEMENBEROF_TOK||LA12_18==SETEQUALS_TOK||LA12_18==SUBSET_TOK) ) {
                            int LA12_19 = input.LA(5);

                            if ( (LA12_19==80) ) {
                                int LA12_20 = input.LA(6);

                                if ( (LA12_20==BASE64BINARY_TOK) ) {
                                    int LA12_21 = input.LA(7);

                                    if ( (LA12_21==STRING_CONSTANT_LIST) ) {
                                        int LA12_22 = input.LA(8);

                                        if ( (LA12_22==81) ) {
                                            int LA12_23 = input.LA(9);

                                            if ( (synpred15_Grammar()) ) {
                                                alt12=8;
                                            }
                                            else if ( (synpred22_Grammar()) ) {
                                                alt12=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 12, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 12, 22, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 12, 21, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 12, 20, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 18, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA12_0==DAYTIMEDURATION_TOK) && (synpred16_Grammar())) {
                alt12=9;
            }
            else if ( (LA12_0==YEARMONTHDURATION_TOK) && (synpred17_Grammar())) {
                alt12=10;
            }
            else if ( (LA12_0==ANYURI_TOK) && (synpred18_Grammar())) {
                alt12=11;
            }
            else if ( (LA12_0==X500NAME_TOK) && (synpred19_Grammar())) {
                alt12=12;
            }
            else if ( (LA12_0==RFC822NAME_TOK) && (synpred20_Grammar())) {
                alt12=13;
            }
            else if ( (LA12_0==HEXBINARY_TOK) && (synpred21_Grammar())) {
                alt12=14;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1500);
                    booleanBag240=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag240.getTree());
                    dbg.location(174,31);
                    char_literal241=(Token)match(input,83,FOLLOW_83_in_bagOp1502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }
                    dbg.location(174,35);
                    set242=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set242)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(174,91);
                    char_literal243=(Token)match(input,80,FOLLOW_80_in_bagOp1518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = 
                    (Object)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);
                    }
                    dbg.location(174,95);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1520);
                    booleanBag244=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag244.getTree());
                    dbg.location(174,106);
                    char_literal245=(Token)match(input,81,FOLLOW_81_in_bagOp1522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal245_tree = 
                    (Object)adaptor.create(char_literal245)
                    ;
                    adaptor.addChild(root_0, char_literal245_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(175,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1533);
                    integerBag246=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag246.getTree());
                    dbg.location(175,31);
                    char_literal247=(Token)match(input,83,FOLLOW_83_in_bagOp1535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal247_tree = 
                    (Object)adaptor.create(char_literal247)
                    ;
                    adaptor.addChild(root_0, char_literal247_tree);
                    }
                    dbg.location(175,35);
                    set248=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set248)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(175,92);
                    char_literal249=(Token)match(input,80,FOLLOW_80_in_bagOp1552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal249_tree = 
                    (Object)adaptor.create(char_literal249)
                    ;
                    adaptor.addChild(root_0, char_literal249_tree);
                    }
                    dbg.location(175,97);
                    pushFollow(FOLLOW_integerBag_in_bagOp1555);
                    integerBag250=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag250.getTree());
                    dbg.location(175,108);
                    char_literal251=(Token)match(input,81,FOLLOW_81_in_bagOp1557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal251_tree = 
                    (Object)adaptor.create(char_literal251)
                    ;
                    adaptor.addChild(root_0, char_literal251_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1568);
                    doubleBag252=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag252.getTree());
                    dbg.location(176,29);
                    char_literal253=(Token)match(input,83,FOLLOW_83_in_bagOp1570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal253_tree = 
                    (Object)adaptor.create(char_literal253)
                    ;
                    adaptor.addChild(root_0, char_literal253_tree);
                    }
                    dbg.location(176,33);
                    set254=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set254)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(176,90);
                    char_literal255=(Token)match(input,80,FOLLOW_80_in_bagOp1587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = 
                    (Object)adaptor.create(char_literal255)
                    ;
                    adaptor.addChild(root_0, char_literal255_tree);
                    }
                    dbg.location(176,95);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1590);
                    doubleBag256=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag256.getTree());
                    dbg.location(176,105);
                    char_literal257=(Token)match(input,81,FOLLOW_81_in_bagOp1592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = 
                    (Object)adaptor.create(char_literal257)
                    ;
                    adaptor.addChild(root_0, char_literal257_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp1604);
                    stringBag258=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag258.getTree());
                    dbg.location(177,30);
                    char_literal259=(Token)match(input,83,FOLLOW_83_in_bagOp1606); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = 
                    (Object)adaptor.create(char_literal259)
                    ;
                    adaptor.addChild(root_0, char_literal259_tree);
                    }
                    dbg.location(177,34);
                    set260=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set260)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(177,91);
                    char_literal261=(Token)match(input,80,FOLLOW_80_in_bagOp1623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = 
                    (Object)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);
                    }
                    dbg.location(177,96);
                    pushFollow(FOLLOW_stringBag_in_bagOp1626);
                    stringBag262=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag262.getTree());
                    dbg.location(177,106);
                    char_literal263=(Token)match(input,81,FOLLOW_81_in_bagOp1628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal263_tree = 
                    (Object)adaptor.create(char_literal263)
                    ;
                    adaptor.addChild(root_0, char_literal263_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp1640);
                    dateBag264=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag264.getTree());
                    dbg.location(178,26);
                    char_literal265=(Token)match(input,83,FOLLOW_83_in_bagOp1642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);
                    }
                    dbg.location(178,30);
                    set266=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set266)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(178,87);
                    char_literal267=(Token)match(input,80,FOLLOW_80_in_bagOp1659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);
                    }
                    dbg.location(178,92);
                    pushFollow(FOLLOW_dateBag_in_bagOp1662);
                    dateBag268=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag268.getTree());
                    dbg.location(178,100);
                    char_literal269=(Token)match(input,81,FOLLOW_81_in_bagOp1664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp1676);
                    timeBag270=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag270.getTree());
                    dbg.location(179,26);
                    char_literal271=(Token)match(input,83,FOLLOW_83_in_bagOp1678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (Object)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }
                    dbg.location(179,30);
                    set272=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set272)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(179,87);
                    char_literal273=(Token)match(input,80,FOLLOW_80_in_bagOp1695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal273_tree = 
                    (Object)adaptor.create(char_literal273)
                    ;
                    adaptor.addChild(root_0, char_literal273_tree);
                    }
                    dbg.location(179,92);
                    pushFollow(FOLLOW_timeBag_in_bagOp1698);
                    timeBag274=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag274.getTree());
                    dbg.location(179,100);
                    char_literal275=(Token)match(input,81,FOLLOW_81_in_bagOp1700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal275_tree = 
                    (Object)adaptor.create(char_literal275)
                    ;
                    adaptor.addChild(root_0, char_literal275_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1712);
                    dateTimeBag276=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag276.getTree());
                    dbg.location(180,34);
                    char_literal277=(Token)match(input,83,FOLLOW_83_in_bagOp1714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = 
                    (Object)adaptor.create(char_literal277)
                    ;
                    adaptor.addChild(root_0, char_literal277_tree);
                    }
                    dbg.location(180,38);
                    set278=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set278)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(180,95);
                    char_literal279=(Token)match(input,80,FOLLOW_80_in_bagOp1731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal279_tree = 
                    (Object)adaptor.create(char_literal279)
                    ;
                    adaptor.addChild(root_0, char_literal279_tree);
                    }
                    dbg.location(180,100);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1734);
                    dateTimeBag280=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag280.getTree());
                    dbg.location(180,112);
                    char_literal281=(Token)match(input,81,FOLLOW_81_in_bagOp1736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal281_tree = 
                    (Object)adaptor.create(char_literal281)
                    ;
                    adaptor.addChild(root_0, char_literal281_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1748);
                    base64BinaryBag282=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag282.getTree());
                    dbg.location(181,42);
                    char_literal283=(Token)match(input,83,FOLLOW_83_in_bagOp1750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal283_tree = 
                    (Object)adaptor.create(char_literal283)
                    ;
                    adaptor.addChild(root_0, char_literal283_tree);
                    }
                    dbg.location(181,46);
                    set284=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set284)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(181,103);
                    char_literal285=(Token)match(input,80,FOLLOW_80_in_bagOp1767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal285_tree = 
                    (Object)adaptor.create(char_literal285)
                    ;
                    adaptor.addChild(root_0, char_literal285_tree);
                    }
                    dbg.location(181,108);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1770);
                    base64BinaryBag286=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag286.getTree());
                    dbg.location(181,124);
                    char_literal287=(Token)match(input,81,FOLLOW_81_in_bagOp1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal287_tree = 
                    (Object)adaptor.create(char_literal287)
                    ;
                    adaptor.addChild(root_0, char_literal287_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp1784);
                    dayTimeDurationBag288=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag288.getTree());
                    dbg.location(182,48);
                    char_literal289=(Token)match(input,83,FOLLOW_83_in_bagOp1786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal289_tree = 
                    (Object)adaptor.create(char_literal289)
                    ;
                    adaptor.addChild(root_0, char_literal289_tree);
                    }
                    dbg.location(182,52);
                    set290=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set290)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(182,109);
                    char_literal291=(Token)match(input,80,FOLLOW_80_in_bagOp1803); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal291_tree = 
                    (Object)adaptor.create(char_literal291)
                    ;
                    adaptor.addChild(root_0, char_literal291_tree);
                    }
                    dbg.location(182,114);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp1806);
                    dayTimeDurationBag292=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag292.getTree());
                    dbg.location(182,133);
                    char_literal293=(Token)match(input,81,FOLLOW_81_in_bagOp1808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal293_tree = 
                    (Object)adaptor.create(char_literal293)
                    ;
                    adaptor.addChild(root_0, char_literal293_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp1820);
                    yearMonthDurationBag294=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag294.getTree());
                    dbg.location(183,52);
                    char_literal295=(Token)match(input,83,FOLLOW_83_in_bagOp1822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);
                    }
                    dbg.location(183,56);
                    set296=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set296)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(183,113);
                    char_literal297=(Token)match(input,80,FOLLOW_80_in_bagOp1839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = 
                    (Object)adaptor.create(char_literal297)
                    ;
                    adaptor.addChild(root_0, char_literal297_tree);
                    }
                    dbg.location(183,118);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp1842);
                    yearMonthDurationBag298=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag298.getTree());
                    dbg.location(183,139);
                    char_literal299=(Token)match(input,81,FOLLOW_81_in_bagOp1844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(184,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp1856);
                    anyUriBag300=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag300.getTree());
                    dbg.location(184,30);
                    char_literal301=(Token)match(input,83,FOLLOW_83_in_bagOp1858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal301_tree = 
                    (Object)adaptor.create(char_literal301)
                    ;
                    adaptor.addChild(root_0, char_literal301_tree);
                    }
                    dbg.location(184,34);
                    set302=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set302)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(184,91);
                    char_literal303=(Token)match(input,80,FOLLOW_80_in_bagOp1875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal303_tree = 
                    (Object)adaptor.create(char_literal303)
                    ;
                    adaptor.addChild(root_0, char_literal303_tree);
                    }
                    dbg.location(184,96);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp1878);
                    anyUriBag304=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag304.getTree());
                    dbg.location(184,106);
                    char_literal305=(Token)match(input,81,FOLLOW_81_in_bagOp1880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal305_tree = 
                    (Object)adaptor.create(char_literal305)
                    ;
                    adaptor.addChild(root_0, char_literal305_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp1892);
                    x500NameBag306=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag306.getTree());
                    dbg.location(185,34);
                    char_literal307=(Token)match(input,83,FOLLOW_83_in_bagOp1894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = 
                    (Object)adaptor.create(char_literal307)
                    ;
                    adaptor.addChild(root_0, char_literal307_tree);
                    }
                    dbg.location(185,38);
                    set308=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set308)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(185,95);
                    char_literal309=(Token)match(input,80,FOLLOW_80_in_bagOp1911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal309_tree = 
                    (Object)adaptor.create(char_literal309)
                    ;
                    adaptor.addChild(root_0, char_literal309_tree);
                    }
                    dbg.location(185,100);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp1914);
                    x500NameBag310=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag310.getTree());
                    dbg.location(185,112);
                    char_literal311=(Token)match(input,81,FOLLOW_81_in_bagOp1916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal311_tree = 
                    (Object)adaptor.create(char_literal311)
                    ;
                    adaptor.addChild(root_0, char_literal311_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp1928);
                    rfc822NameBag312=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag312.getTree());
                    dbg.location(186,38);
                    char_literal313=(Token)match(input,83,FOLLOW_83_in_bagOp1930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal313_tree = 
                    (Object)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);
                    }
                    dbg.location(186,42);
                    set314=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set314)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(186,99);
                    char_literal315=(Token)match(input,80,FOLLOW_80_in_bagOp1947); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal315_tree = 
                    (Object)adaptor.create(char_literal315)
                    ;
                    adaptor.addChild(root_0, char_literal315_tree);
                    }
                    dbg.location(186,104);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp1950);
                    rfc822NameBag316=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag316.getTree());
                    dbg.location(186,118);
                    char_literal317=(Token)match(input,81,FOLLOW_81_in_bagOp1952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal317_tree = 
                    (Object)adaptor.create(char_literal317)
                    ;
                    adaptor.addChild(root_0, char_literal317_tree);
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp1964);
                    hexBinaryBag318=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag318.getTree());
                    dbg.location(187,36);
                    char_literal319=(Token)match(input,83,FOLLOW_83_in_bagOp1966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal319_tree = 
                    (Object)adaptor.create(char_literal319)
                    ;
                    adaptor.addChild(root_0, char_literal319_tree);
                    }
                    dbg.location(187,40);
                    set320=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set320)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(187,97);
                    char_literal321=(Token)match(input,80,FOLLOW_80_in_bagOp1983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal321_tree = 
                    (Object)adaptor.create(char_literal321)
                    ;
                    adaptor.addChild(root_0, char_literal321_tree);
                    }
                    dbg.location(187,102);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp1986);
                    hexBinaryBag322=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag322.getTree());
                    dbg.location(187,115);
                    char_literal323=(Token)match(input,81,FOLLOW_81_in_bagOp1988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = 
                    (Object)adaptor.create(char_literal323)
                    ;
                    adaptor.addChild(root_0, char_literal323_tree);
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1999);
                    base64BinaryBag324=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag324.getTree());
                    dbg.location(188,41);
                    char_literal325=(Token)match(input,83,FOLLOW_83_in_bagOp2001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal325_tree = 
                    (Object)adaptor.create(char_literal325)
                    ;
                    adaptor.addChild(root_0, char_literal325_tree);
                    }
                    dbg.location(188,45);
                    set326=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set326)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(188,102);
                    char_literal327=(Token)match(input,80,FOLLOW_80_in_bagOp2018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = 
                    (Object)adaptor.create(char_literal327)
                    ;
                    adaptor.addChild(root_0, char_literal327_tree);
                    }
                    dbg.location(188,107);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2021);
                    base64BinaryBag328=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag328.getTree());
                    dbg.location(188,123);
                    char_literal329=(Token)match(input,81,FOLLOW_81_in_bagOp2023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal329_tree = 
                    (Object)adaptor.create(char_literal329)
                    ;
                    adaptor.addChild(root_0, char_literal329_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(189, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bagOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bagOp"


    public static class integerExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' );
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT330=null;
        Token char_literal332=null;
        Token set333=null;
        Token char_literal334=null;
        Token char_literal335=null;
        Token char_literal337=null;
        Token SIZE_TOK338=null;
        Token char_literal339=null;
        Token char_literal340=null;
        GrammarParser.stringExpr_return stringExpr331 =null;

        GrammarParser.anyBag_return anyBag336 =null;


        Object INTEGER_CONSTANT330_tree=null;
        Object char_literal332_tree=null;
        Object set333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal335_tree=null;
        Object char_literal337_tree=null;
        Object SIZE_TOK338_tree=null;
        Object char_literal339_tree=null;
        Object char_literal340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:2: ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' )
            int alt13=3;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            try {
                isCyclicDecision = true;
                alt13 = dfa13.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:4: INTEGER_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(192,4);
                    INTEGER_CONSTANT330=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT330_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT330)
                    ;
                    adaptor.addChild(root_0, INTEGER_CONSTANT330_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2039);
                    stringExpr331=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr331.getTree());
                    dbg.location(193,15);
                    char_literal332=(Token)match(input,83,FOLLOW_83_in_integerExpr2041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal332_tree = 
                    (Object)adaptor.create(char_literal332)
                    ;
                    adaptor.addChild(root_0, char_literal332_tree);
                    }
                    dbg.location(193,19);
                    set333=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set333)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(193,51);
                    char_literal334=(Token)match(input,80,FOLLOW_80_in_integerExpr2053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = 
                    (Object)adaptor.create(char_literal334)
                    ;
                    adaptor.addChild(root_0, char_literal334_tree);
                    }
                    dbg.location(193,56);
                    char_literal335=(Token)match(input,81,FOLLOW_81_in_integerExpr2056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal335_tree = 
                    (Object)adaptor.create(char_literal335)
                    ;
                    adaptor.addChild(root_0, char_literal335_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: anyBag '.' SIZE_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(194,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2061);
                    anyBag336=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag336.getTree());
                    dbg.location(194,11);
                    char_literal337=(Token)match(input,83,FOLLOW_83_in_integerExpr2063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal337_tree = 
                    (Object)adaptor.create(char_literal337)
                    ;
                    adaptor.addChild(root_0, char_literal337_tree);
                    }
                    dbg.location(194,15);
                    SIZE_TOK338=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK338_tree = 
                    (Object)adaptor.create(SIZE_TOK338)
                    ;
                    adaptor.addChild(root_0, SIZE_TOK338_tree);
                    }
                    dbg.location(194,24);
                    char_literal339=(Token)match(input,80,FOLLOW_80_in_integerExpr2067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal339_tree = 
                    (Object)adaptor.create(char_literal339)
                    ;
                    adaptor.addChild(root_0, char_literal339_tree);
                    }
                    dbg.location(194,28);
                    char_literal340=(Token)match(input,81,FOLLOW_81_in_integerExpr2069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal340_tree = 
                    (Object)adaptor.create(char_literal340)
                    ;
                    adaptor.addChild(root_0, char_literal340_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(198, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerExpr"


    public static class integerBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:1: integerBag : ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK341=null;
        Token STRING_CONSTANT_LIST342=null;
        Token BAG_TOK343=null;
        Token char_literal344=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal349=null;
        Token set350=null;
        Token char_literal351=null;
        Token char_literal353=null;
        GrammarParser.integerExpr_return integerExpr345 =null;

        GrammarParser.integerExpr_return integerExpr347 =null;

        GrammarParser.integerBag_return integerBag352 =null;


        Object INTEGER_TOK341_tree=null;
        Object STRING_CONSTANT_LIST342_tree=null;
        Object BAG_TOK343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        Object char_literal349_tree=null;
        Object set350_tree=null;
        Object char_literal351_tree=null;
        Object char_literal353_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:2: ( ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(200,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' )
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==INTEGER_TOK) ) {
                alt15=1;
            }
            else if ( (LA15_0==BAG_TOK) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:5: INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    dbg.location(200,5);
                    INTEGER_TOK341=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK341_tree = 
                    (Object)adaptor.create(INTEGER_TOK341)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK341_tree);
                    }
                    dbg.location(200,17);
                    STRING_CONSTANT_LIST342=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST342_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST342)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST342_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:40: BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')'
                    {
                    dbg.location(200,40);
                    BAG_TOK343=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK343_tree = 
                    (Object)adaptor.create(BAG_TOK343)
                    ;
                    adaptor.addChild(root_0, BAG_TOK343_tree);
                    }
                    dbg.location(200,48);
                    char_literal344=(Token)match(input,80,FOLLOW_80_in_integerBag2091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal344_tree = 
                    (Object)adaptor.create(char_literal344)
                    ;
                    adaptor.addChild(root_0, char_literal344_tree);
                    }
                    dbg.location(200,52);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2093);
                    integerExpr345=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr345.getTree());
                    dbg.location(200,64);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:64: ( ',' integerExpr )+
                    int cnt14=0;
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==82) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:66: ',' integerExpr
                    	    {
                    	    dbg.location(200,66);
                    	    char_literal346=(Token)match(input,82,FOLLOW_82_in_integerBag2097); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal346_tree = 
                    	    (Object)adaptor.create(char_literal346)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal346_tree);
                    	    }
                    	    dbg.location(200,70);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2099);
                    	    integerExpr347=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr347.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt14++;
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(200,84);
                    char_literal348=(Token)match(input,81,FOLLOW_81_in_integerBag2103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal348_tree = 
                    (Object)adaptor.create(char_literal348)
                    ;
                    adaptor.addChild(root_0, char_literal348_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(200,89);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:89: ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==83) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==INTERSECTION_TOK||LA16_1==UNION_TOK) ) {
                        alt16=1;
                    }


                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:90: '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')'
            	    {
            	    dbg.location(200,90);
            	    char_literal349=(Token)match(input,83,FOLLOW_83_in_integerBag2107); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal349_tree = 
            	    (Object)adaptor.create(char_literal349)
            	    ;
            	    adaptor.addChild(root_0, char_literal349_tree);
            	    }
            	    dbg.location(200,94);
            	    set350=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set350)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(200,127);
            	    char_literal351=(Token)match(input,80,FOLLOW_80_in_integerBag2119); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal351_tree = 
            	    (Object)adaptor.create(char_literal351)
            	    ;
            	    adaptor.addChild(root_0, char_literal351_tree);
            	    }
            	    dbg.location(200,131);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2121);
            	    integerBag352=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag352.getTree());
            	    dbg.location(200,142);
            	    char_literal353=(Token)match(input,81,FOLLOW_81_in_integerBag2123); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal353_tree = 
            	    (Object)adaptor.create(char_literal353)
            	    ;
            	    adaptor.addChild(root_0, char_literal353_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(201, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerBag"


    public static class doubleExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:1: doubleExpr : ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' );
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT354=null;
        Token DOUBLE_TOK355=null;
        Token char_literal356=null;
        Token char_literal358=null;
        GrammarParser.stringExpr_return stringExpr357 =null;


        Object DOUBLE_CONSTANT354_tree=null;
        Object DOUBLE_TOK355_tree=null;
        Object char_literal356_tree=null;
        Object char_literal358_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:2: ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOUBLE_CONSTANT) ) {
                alt17=1;
            }
            else if ( (LA17_0==DOUBLE_TOK) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: DOUBLE_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,4);
                    DOUBLE_CONSTANT354=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT354_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT354)
                    ;
                    adaptor.addChild(root_0, DOUBLE_CONSTANT354_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: DOUBLE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(205,4);
                    DOUBLE_TOK355=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK355_tree = 
                    (Object)adaptor.create(DOUBLE_TOK355)
                    ;
                    adaptor.addChild(root_0, DOUBLE_TOK355_tree);
                    }
                    dbg.location(205,15);
                    char_literal356=(Token)match(input,80,FOLLOW_80_in_doubleExpr2143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal356_tree = 
                    (Object)adaptor.create(char_literal356)
                    ;
                    adaptor.addChild(root_0, char_literal356_tree);
                    }
                    dbg.location(205,19);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2145);
                    stringExpr357=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr357.getTree());
                    dbg.location(205,30);
                    char_literal358=(Token)match(input,81,FOLLOW_81_in_doubleExpr2147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal358_tree = 
                    (Object)adaptor.create(char_literal358)
                    ;
                    adaptor.addChild(root_0, char_literal358_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(208, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doubleExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doubleExpr"


    public static class doubleBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:1: doubleBag : ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK359=null;
        Token STRING_CONSTANT_LIST360=null;

        Object DOUBLE_TOK359_tree=null;
        Object STRING_CONSTANT_LIST360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:2: ( ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(210,20);
            DOUBLE_TOK359=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK359_tree = 
            (Object)adaptor.create(DOUBLE_TOK359)
            ;
            adaptor.addChild(root_0, DOUBLE_TOK359_tree);
            }
            dbg.location(210,31);
            STRING_CONSTANT_LIST360=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2167); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST360_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST360)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST360_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(213, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doubleBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doubleBag"


    public static class stringExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:1: stringExpr : ( ( STRING_CONSTANT )=> STRING_CONSTANT | stringBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT361=null;
        Token char_literal363=null;
        Token ONEANDONLY_TOK364=null;
        Token char_literal365=null;
        Token char_literal366=null;
        GrammarParser.stringBag_return stringBag362 =null;


        Object STRING_CONSTANT361_tree=null;
        Object char_literal363_tree=null;
        Object ONEANDONLY_TOK364_tree=null;
        Object char_literal365_tree=null;
        Object char_literal366_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:2: ( ( STRING_CONSTANT )=> STRING_CONSTANT | stringBag '.' ONEANDONLY_TOK '(' ')' )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==STRING_CONSTANT) && (synpred24_Grammar())) {
                alt18=1;
            }
            else if ( (LA18_0==ACTION_TOK||LA18_0==ENVIRONMENT_TOK||LA18_0==RESOURCE_TOK||(LA18_0 >= STRING_TOK && LA18_0 <= SUBJECT_TOK)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: ( STRING_CONSTANT )=> STRING_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(216,25);
                    STRING_CONSTANT361=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT361_tree = 
                    (Object)adaptor.create(STRING_CONSTANT361)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT361_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: stringBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,4);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2193);
                    stringBag362=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag362.getTree());
                    dbg.location(218,14);
                    char_literal363=(Token)match(input,83,FOLLOW_83_in_stringExpr2195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal363_tree = 
                    (Object)adaptor.create(char_literal363)
                    ;
                    adaptor.addChild(root_0, char_literal363_tree);
                    }
                    dbg.location(218,18);
                    ONEANDONLY_TOK364=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK364_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK364)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK364_tree);
                    }
                    dbg.location(218,33);
                    char_literal365=(Token)match(input,80,FOLLOW_80_in_stringExpr2199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal365_tree = 
                    (Object)adaptor.create(char_literal365)
                    ;
                    adaptor.addChild(root_0, char_literal365_tree);
                    }
                    dbg.location(218,37);
                    char_literal366=(Token)match(input,81,FOLLOW_81_in_stringExpr2201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal366_tree = 
                    (Object)adaptor.create(char_literal366)
                    ;
                    adaptor.addChild(root_0, char_literal366_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(220, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringExpr"


    public static class stringBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:221:1: stringBag : ( STRING_TOK STRING_CONSTANT_LIST | attributeExpr );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK367=null;
        Token STRING_CONSTANT_LIST368=null;
        GrammarParser.attributeExpr_return attributeExpr369 =null;


        Object STRING_TOK367_tree=null;
        Object STRING_CONSTANT_LIST368_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:2: ( STRING_TOK STRING_CONSTANT_LIST | attributeExpr )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==STRING_TOK) ) {
                alt19=1;
            }
            else if ( (LA19_0==ACTION_TOK||LA19_0==ENVIRONMENT_TOK||LA19_0==RESOURCE_TOK||LA19_0==SUBJECT_TOK) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:4: STRING_TOK STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(222,4);
                    STRING_TOK367=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK367_tree = 
                    (Object)adaptor.create(STRING_TOK367)
                    ;
                    adaptor.addChild(root_0, STRING_TOK367_tree);
                    }
                    dbg.location(222,15);
                    STRING_CONSTANT_LIST368=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST368_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST368)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST368_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(223,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringBag2219);
                    attributeExpr369=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr369.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(225, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringBag"


    public static class attributeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:1: attributeExpr : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set370=null;
        Token char_literal371=null;
        Token LOWERCASEIDENTIFIER372=null;

        Object set370_tree=null;
        Object char_literal371_tree=null;
        Object LOWERCASEIDENTIFIER372_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(229,4);
            set370=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set370)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(229,65);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:65: ( '.' LOWERCASEIDENTIFIER )+
            int cnt20=0;
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==83) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==LOWERCASEIDENTIFIER) ) {
                        alt20=1;
                    }


                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:66: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(229,66);
            	    char_literal371=(Token)match(input,83,FOLLOW_83_in_attributeExpr2251); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal371_tree = 
            	    (Object)adaptor.create(char_literal371)
            	    ;
            	    adaptor.addChild(root_0, char_literal371_tree);
            	    }
            	    dbg.location(229,70);
            	    LOWERCASEIDENTIFIER372=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2253); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER372_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER372)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER372_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt20++;
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(230, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attributeExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attributeExpr"


    public static class anyUriExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:1: anyUriExpr : ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' );
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK373=null;
        Token char_literal374=null;
        Token char_literal376=null;
        Token char_literal378=null;
        Token ONEANDONLY_TOK379=null;
        Token char_literal380=null;
        Token char_literal381=null;
        Token char_literal383=null;
        Token URI_TOK384=null;
        Token char_literal385=null;
        Token char_literal386=null;
        GrammarParser.stringExpr_return stringExpr375 =null;

        GrammarParser.anyUriBag_return anyUriBag377 =null;

        GrammarParser.stringExpr_return stringExpr382 =null;


        Object ANYURI_TOK373_tree=null;
        Object char_literal374_tree=null;
        Object char_literal376_tree=null;
        Object char_literal378_tree=null;
        Object ONEANDONLY_TOK379_tree=null;
        Object char_literal380_tree=null;
        Object char_literal381_tree=null;
        Object char_literal383_tree=null;
        Object URI_TOK384_tree=null;
        Object char_literal385_tree=null;
        Object char_literal386_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:2: ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' )
            int alt21=3;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==ANYURI_TOK) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==80) ) {
                    alt21=1;
                }
                else if ( (LA21_1==STRING_CONSTANT_LIST) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA21_0==STRING_CONSTANT) && (synpred25_Grammar())) {
                alt21=3;
            }
            else if ( (LA21_0==STRING_TOK) && (synpred25_Grammar())) {
                alt21=3;
            }
            else if ( (LA21_0==ACTION_TOK||LA21_0==ENVIRONMENT_TOK||LA21_0==RESOURCE_TOK||LA21_0==SUBJECT_TOK) && (synpred25_Grammar())) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ANYURI_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,4);
                    ANYURI_TOK373=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK373_tree = 
                    (Object)adaptor.create(ANYURI_TOK373)
                    ;
                    adaptor.addChild(root_0, ANYURI_TOK373_tree);
                    }
                    dbg.location(233,15);
                    char_literal374=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal374_tree = 
                    (Object)adaptor.create(char_literal374)
                    ;
                    adaptor.addChild(root_0, char_literal374_tree);
                    }
                    dbg.location(233,19);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2271);
                    stringExpr375=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr375.getTree());
                    dbg.location(233,30);
                    char_literal376=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal376_tree = 
                    (Object)adaptor.create(char_literal376)
                    ;
                    adaptor.addChild(root_0, char_literal376_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: anyUriBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(235,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2279);
                    anyUriBag377=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag377.getTree());
                    dbg.location(235,14);
                    char_literal378=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal378_tree = 
                    (Object)adaptor.create(char_literal378)
                    ;
                    adaptor.addChild(root_0, char_literal378_tree);
                    }
                    dbg.location(235,18);
                    ONEANDONLY_TOK379=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK379_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK379)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK379_tree);
                    }
                    dbg.location(235,33);
                    char_literal380=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal380_tree = 
                    (Object)adaptor.create(char_literal380)
                    ;
                    adaptor.addChild(root_0, char_literal380_tree);
                    }
                    dbg.location(235,37);
                    char_literal381=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal381_tree = 
                    (Object)adaptor.create(char_literal381)
                    ;
                    adaptor.addChild(root_0, char_literal381_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( stringExpr )=> stringExpr '.' URI_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(236,20);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2298);
                    stringExpr382=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr382.getTree());
                    dbg.location(236,31);
                    char_literal383=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal383_tree = 
                    (Object)adaptor.create(char_literal383)
                    ;
                    adaptor.addChild(root_0, char_literal383_tree);
                    }
                    dbg.location(236,35);
                    URI_TOK384=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK384_tree = 
                    (Object)adaptor.create(URI_TOK384)
                    ;
                    adaptor.addChild(root_0, URI_TOK384_tree);
                    }
                    dbg.location(236,43);
                    char_literal385=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = 
                    (Object)adaptor.create(char_literal385)
                    ;
                    adaptor.addChild(root_0, char_literal385_tree);
                    }
                    dbg.location(236,47);
                    char_literal386=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal386_tree = 
                    (Object)adaptor.create(char_literal386)
                    ;
                    adaptor.addChild(root_0, char_literal386_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(238, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyUriExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyUriExpr"


    public static class anyUriBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:1: anyUriBag : ANYURI_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK387=null;
        Token STRING_CONSTANT_LIST388=null;

        Object ANYURI_TOK387_tree=null;
        Object STRING_CONSTANT_LIST388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:2: ( ANYURI_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: ANYURI_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(241,4);
            ANYURI_TOK387=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK387_tree = 
            (Object)adaptor.create(ANYURI_TOK387)
            ;
            adaptor.addChild(root_0, ANYURI_TOK387_tree);
            }
            dbg.location(241,15);
            STRING_CONSTANT_LIST388=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2320); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST388_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST388)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST388_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(243, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyUriBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyUriBag"


    public static class dateExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:1: dateExpr : ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK389=null;
        Token char_literal390=null;
        Token char_literal392=null;
        Token char_literal394=null;
        Token ONEANDONLY_TOK395=null;
        Token char_literal396=null;
        Token char_literal397=null;
        GrammarParser.stringExpr_return stringExpr391 =null;

        GrammarParser.dateBag_return dateBag393 =null;


        Object DATE_TOK389_tree=null;
        Object char_literal390_tree=null;
        Object char_literal392_tree=null;
        Object char_literal394_tree=null;
        Object ONEANDONLY_TOK395_tree=null;
        Object char_literal396_tree=null;
        Object char_literal397_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:2: ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' )
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==DATE_TOK) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==80) ) {
                    alt22=1;
                }
                else if ( (LA22_1==STRING_CONSTANT_LIST) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:4: DATE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(246,4);
                    DATE_TOK389=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK389_tree = 
                    (Object)adaptor.create(DATE_TOK389)
                    ;
                    adaptor.addChild(root_0, DATE_TOK389_tree);
                    }
                    dbg.location(246,13);
                    char_literal390=(Token)match(input,80,FOLLOW_80_in_dateExpr2334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal390_tree = 
                    (Object)adaptor.create(char_literal390)
                    ;
                    adaptor.addChild(root_0, char_literal390_tree);
                    }
                    dbg.location(246,17);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2336);
                    stringExpr391=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr391.getTree());
                    dbg.location(246,28);
                    char_literal392=(Token)match(input,81,FOLLOW_81_in_dateExpr2338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal392_tree = 
                    (Object)adaptor.create(char_literal392)
                    ;
                    adaptor.addChild(root_0, char_literal392_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: dateBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(247,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2343);
                    dateBag393=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag393.getTree());
                    dbg.location(247,12);
                    char_literal394=(Token)match(input,83,FOLLOW_83_in_dateExpr2345); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal394_tree = 
                    (Object)adaptor.create(char_literal394)
                    ;
                    adaptor.addChild(root_0, char_literal394_tree);
                    }
                    dbg.location(247,16);
                    ONEANDONLY_TOK395=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK395_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK395)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK395_tree);
                    }
                    dbg.location(247,31);
                    char_literal396=(Token)match(input,80,FOLLOW_80_in_dateExpr2349); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal396_tree = 
                    (Object)adaptor.create(char_literal396)
                    ;
                    adaptor.addChild(root_0, char_literal396_tree);
                    }
                    dbg.location(247,35);
                    char_literal397=(Token)match(input,81,FOLLOW_81_in_dateExpr2351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal397_tree = 
                    (Object)adaptor.create(char_literal397)
                    ;
                    adaptor.addChild(root_0, char_literal397_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(248, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateExpr"


    public static class dateBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:1: dateBag : ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK398=null;
        Token STRING_CONSTANT_LIST399=null;

        Object DATE_TOK398_tree=null;
        Object STRING_CONSTANT_LIST399_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:2: ( ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(250,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:5: ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST
            {
            dbg.location(250,18);
            DATE_TOK398=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK398_tree = 
            (Object)adaptor.create(DATE_TOK398)
            ;
            adaptor.addChild(root_0, DATE_TOK398_tree);
            }
            dbg.location(250,27);
            STRING_CONSTANT_LIST399=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2369); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST399_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST399)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST399_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(253, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateBag"


    public static class timeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:1: timeExpr : ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK400=null;
        Token char_literal401=null;
        Token char_literal403=null;
        Token char_literal405=null;
        Token ONEANDONLY_TOK406=null;
        Token char_literal407=null;
        Token char_literal408=null;
        GrammarParser.stringExpr_return stringExpr402 =null;

        GrammarParser.timeBag_return timeBag404 =null;


        Object TIME_TOK400_tree=null;
        Object char_literal401_tree=null;
        Object char_literal403_tree=null;
        Object char_literal405_tree=null;
        Object ONEANDONLY_TOK406_tree=null;
        Object char_literal407_tree=null;
        Object char_literal408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:2: ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIME_TOK) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==80) ) {
                    alt23=1;
                }
                else if ( (LA23_1==STRING_CONSTANT_LIST) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:4: TIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(256,4);
                    TIME_TOK400=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK400_tree = 
                    (Object)adaptor.create(TIME_TOK400)
                    ;
                    adaptor.addChild(root_0, TIME_TOK400_tree);
                    }
                    dbg.location(256,13);
                    char_literal401=(Token)match(input,80,FOLLOW_80_in_timeExpr2385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal401_tree = 
                    (Object)adaptor.create(char_literal401)
                    ;
                    adaptor.addChild(root_0, char_literal401_tree);
                    }
                    dbg.location(256,17);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2387);
                    stringExpr402=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr402.getTree());
                    dbg.location(256,28);
                    char_literal403=(Token)match(input,81,FOLLOW_81_in_timeExpr2389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal403_tree = 
                    (Object)adaptor.create(char_literal403)
                    ;
                    adaptor.addChild(root_0, char_literal403_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:4: timeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(257,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2394);
                    timeBag404=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag404.getTree());
                    dbg.location(257,12);
                    char_literal405=(Token)match(input,83,FOLLOW_83_in_timeExpr2396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal405_tree = 
                    (Object)adaptor.create(char_literal405)
                    ;
                    adaptor.addChild(root_0, char_literal405_tree);
                    }
                    dbg.location(257,16);
                    ONEANDONLY_TOK406=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK406_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK406)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK406_tree);
                    }
                    dbg.location(257,31);
                    char_literal407=(Token)match(input,80,FOLLOW_80_in_timeExpr2400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal407_tree = 
                    (Object)adaptor.create(char_literal407)
                    ;
                    adaptor.addChild(root_0, char_literal407_tree);
                    }
                    dbg.location(257,35);
                    char_literal408=(Token)match(input,81,FOLLOW_81_in_timeExpr2402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal408_tree = 
                    (Object)adaptor.create(char_literal408)
                    ;
                    adaptor.addChild(root_0, char_literal408_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(258, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeExpr"


    public static class timeBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:1: timeBag : ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK409=null;
        Token STRING_CONSTANT_LIST410=null;

        Object TIME_TOK409_tree=null;
        Object STRING_CONSTANT_LIST410_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:2: ( ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:4: ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(260,17);
            TIME_TOK409=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag2417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK409_tree = 
            (Object)adaptor.create(TIME_TOK409)
            ;
            adaptor.addChild(root_0, TIME_TOK409_tree);
            }
            dbg.location(260,26);
            STRING_CONSTANT_LIST410=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag2419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST410_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST410)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST410_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(263, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeBag"


    public static class dateTimeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:1: dateTimeExpr : ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK411=null;
        Token char_literal412=null;
        Token char_literal414=null;
        Token char_literal416=null;
        Token ONEANDONLY_TOK417=null;
        Token char_literal418=null;
        Token char_literal419=null;
        GrammarParser.stringExpr_return stringExpr413 =null;

        GrammarParser.dateTimeBag_return dateTimeBag415 =null;


        Object DATETIME_TOK411_tree=null;
        Object char_literal412_tree=null;
        Object char_literal414_tree=null;
        Object char_literal416_tree=null;
        Object ONEANDONLY_TOK417_tree=null;
        Object char_literal418_tree=null;
        Object char_literal419_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:2: ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==DATETIME_TOK) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==80) && (synpred28_Grammar())) {
                    alt24=1;
                }
                else if ( (LA24_1==STRING_CONSTANT_LIST) && (synpred29_Grammar())) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:4: ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(266,22);
                    DATETIME_TOK411=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr2439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK411_tree = 
                    (Object)adaptor.create(DATETIME_TOK411)
                    ;
                    adaptor.addChild(root_0, DATETIME_TOK411_tree);
                    }
                    dbg.location(266,35);
                    char_literal412=(Token)match(input,80,FOLLOW_80_in_dateTimeExpr2441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal412_tree = 
                    (Object)adaptor.create(char_literal412)
                    ;
                    adaptor.addChild(root_0, char_literal412_tree);
                    }
                    dbg.location(266,39);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr2443);
                    stringExpr413=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr413.getTree());
                    dbg.location(266,50);
                    char_literal414=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = 
                    (Object)adaptor.create(char_literal414)
                    ;
                    adaptor.addChild(root_0, char_literal414_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(267,21);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr2456);
                    dateTimeBag415=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag415.getTree());
                    dbg.location(267,33);
                    char_literal416=(Token)match(input,83,FOLLOW_83_in_dateTimeExpr2458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal416_tree = 
                    (Object)adaptor.create(char_literal416)
                    ;
                    adaptor.addChild(root_0, char_literal416_tree);
                    }
                    dbg.location(267,37);
                    ONEANDONLY_TOK417=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK417_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK417)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK417_tree);
                    }
                    dbg.location(267,52);
                    char_literal418=(Token)match(input,80,FOLLOW_80_in_dateTimeExpr2462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal418_tree = 
                    (Object)adaptor.create(char_literal418)
                    ;
                    adaptor.addChild(root_0, char_literal418_tree);
                    }
                    dbg.location(267,56);
                    char_literal419=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = 
                    (Object)adaptor.create(char_literal419)
                    ;
                    adaptor.addChild(root_0, char_literal419_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(268, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateTimeExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateTimeExpr"


    public static class dateTimeBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:1: dateTimeBag : ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK420=null;
        Token STRING_CONSTANT_LIST421=null;

        Object DATETIME_TOK420_tree=null;
        Object STRING_CONSTANT_LIST421_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:2: ( ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(270,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:5: ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST
            {
            dbg.location(270,22);
            DATETIME_TOK420=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag2480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK420_tree = 
            (Object)adaptor.create(DATETIME_TOK420)
            ;
            adaptor.addChild(root_0, DATETIME_TOK420_tree);
            }
            dbg.location(270,35);
            STRING_CONSTANT_LIST421=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST421_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST421)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST421_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(273, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateTimeBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateTimeBag"


    public static class base64BinaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:1: base64BinaryExpr : ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK422=null;
        Token char_literal423=null;
        Token char_literal425=null;
        Token char_literal427=null;
        Token ONEANDONLY_TOK428=null;
        Token char_literal429=null;
        Token char_literal430=null;
        GrammarParser.stringExpr_return stringExpr424 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag426 =null;


        Object BASE64BINARY_TOK422_tree=null;
        Object char_literal423_tree=null;
        Object char_literal425_tree=null;
        Object char_literal427_tree=null;
        Object ONEANDONLY_TOK428_tree=null;
        Object char_literal429_tree=null;
        Object char_literal430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(275, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==BASE64BINARY_TOK) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==80) && (synpred31_Grammar())) {
                    alt25=1;
                }
                else if ( (LA25_1==STRING_CONSTANT_LIST) && (synpred32_Grammar())) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(276,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')'
                    {
                    dbg.location(276,27);
                    BASE64BINARY_TOK422=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK422_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK422)
                    ;
                    adaptor.addChild(root_0, BASE64BINARY_TOK422_tree);
                    }
                    dbg.location(276,44);
                    char_literal423=(Token)match(input,80,FOLLOW_80_in_base64BinaryExpr2505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal423_tree = 
                    (Object)adaptor.create(char_literal423)
                    ;
                    adaptor.addChild(root_0, char_literal423_tree);
                    }
                    dbg.location(276,48);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr2507);
                    stringExpr424=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr424.getTree());
                    dbg.location(276,59);
                    char_literal425=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = 
                    (Object)adaptor.create(char_literal425)
                    ;
                    adaptor.addChild(root_0, char_literal425_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:4: ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(277,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr2521);
                    base64BinaryBag426=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag426.getTree());
                    dbg.location(277,41);
                    char_literal427=(Token)match(input,83,FOLLOW_83_in_base64BinaryExpr2523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal427_tree = 
                    (Object)adaptor.create(char_literal427)
                    ;
                    adaptor.addChild(root_0, char_literal427_tree);
                    }
                    dbg.location(277,45);
                    ONEANDONLY_TOK428=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK428_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK428)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK428_tree);
                    }
                    dbg.location(277,60);
                    char_literal429=(Token)match(input,80,FOLLOW_80_in_base64BinaryExpr2527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal429_tree = 
                    (Object)adaptor.create(char_literal429)
                    ;
                    adaptor.addChild(root_0, char_literal429_tree);
                    }
                    dbg.location(277,64);
                    char_literal430=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal430_tree = 
                    (Object)adaptor.create(char_literal430)
                    ;
                    adaptor.addChild(root_0, char_literal430_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(278, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base64BinaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryExpr"


    public static class base64BinaryBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:279:1: base64BinaryBag : ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK431=null;
        Token STRING_CONSTANT_LIST432=null;

        Object BASE64BINARY_TOK431_tree=null;
        Object STRING_CONSTANT_LIST432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(280,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST
            {
            dbg.location(280,27);
            BASE64BINARY_TOK431=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2546); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK431_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK431)
            ;
            adaptor.addChild(root_0, BASE64BINARY_TOK431_tree);
            }
            dbg.location(280,44);
            STRING_CONSTANT_LIST432=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST432_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST432)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST432_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(284, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base64BinaryBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryBag"


    public static class dayTimeDurationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:1: dayTimeDurationExpr : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK433=null;
        Token char_literal434=null;
        Token char_literal436=null;
        Token char_literal438=null;
        Token ONEANDONLY_TOK439=null;
        Token char_literal440=null;
        Token char_literal441=null;
        GrammarParser.stringExpr_return stringExpr435 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag437 =null;


        Object DAYTIMEDURATION_TOK433_tree=null;
        Object char_literal434_tree=null;
        Object char_literal436_tree=null;
        Object char_literal438_tree=null;
        Object ONEANDONLY_TOK439_tree=null;
        Object char_literal440_tree=null;
        Object char_literal441_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:2: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==DAYTIMEDURATION_TOK) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==80) && (synpred34_Grammar())) {
                    alt26=1;
                }
                else if ( (LA26_1==STRING_CONSTANT_LIST) && (synpred35_Grammar())) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(287,29);
                    DAYTIMEDURATION_TOK433=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK433_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK433)
                    ;
                    adaptor.addChild(root_0, DAYTIMEDURATION_TOK433_tree);
                    }
                    dbg.location(287,49);
                    char_literal434=(Token)match(input,80,FOLLOW_80_in_dayTimeDurationExpr2572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal434_tree = 
                    (Object)adaptor.create(char_literal434)
                    ;
                    adaptor.addChild(root_0, char_literal434_tree);
                    }
                    dbg.location(287,53);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr2574);
                    stringExpr435=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr435.getTree());
                    dbg.location(287,64);
                    char_literal436=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal436_tree = 
                    (Object)adaptor.create(char_literal436)
                    ;
                    adaptor.addChild(root_0, char_literal436_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(288,28);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2587);
                    dayTimeDurationBag437=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag437.getTree());
                    dbg.location(288,47);
                    char_literal438=(Token)match(input,83,FOLLOW_83_in_dayTimeDurationExpr2589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal438_tree = 
                    (Object)adaptor.create(char_literal438)
                    ;
                    adaptor.addChild(root_0, char_literal438_tree);
                    }
                    dbg.location(288,51);
                    ONEANDONLY_TOK439=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK439_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK439)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK439_tree);
                    }
                    dbg.location(288,66);
                    char_literal440=(Token)match(input,80,FOLLOW_80_in_dayTimeDurationExpr2593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal440_tree = 
                    (Object)adaptor.create(char_literal440)
                    ;
                    adaptor.addChild(root_0, char_literal440_tree);
                    }
                    dbg.location(288,70);
                    char_literal441=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal441_tree = 
                    (Object)adaptor.create(char_literal441)
                    ;
                    adaptor.addChild(root_0, char_literal441_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(289, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationExpr"


    public static class dayTimeDurationBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:1: dayTimeDurationBag : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK442=null;
        Token STRING_CONSTANT_LIST443=null;

        Object DAYTIMEDURATION_TOK442_tree=null;
        Object STRING_CONSTANT_LIST443_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(290, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:2: ( ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(291,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:5: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST
            {
            dbg.location(291,30);
            DAYTIMEDURATION_TOK442=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2612); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK442_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK442)
            ;
            adaptor.addChild(root_0, DAYTIMEDURATION_TOK442_tree);
            }
            dbg.location(291,50);
            STRING_CONSTANT_LIST443=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2614); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST443_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST443)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST443_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(294, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationBag"


    public static class yearMonthDurationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:1: yearMonthDurationExpr : ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) );
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK444=null;
        Token char_literal445=null;
        Token char_literal447=null;
        Token char_literal449=null;
        Token ONEANDONLY_TOK450=null;
        Token char_literal451=null;
        Token char_literal452=null;
        GrammarParser.stringExpr_return stringExpr446 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag448 =null;


        Object YEARMONTHDURATION_TOK444_tree=null;
        Object char_literal445_tree=null;
        Object char_literal447_tree=null;
        Object char_literal449_tree=null;
        Object ONEANDONLY_TOK450_tree=null;
        Object char_literal451_tree=null;
        Object char_literal452_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:2: ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==YEARMONTHDURATION_TOK) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==80) && (synpred37_Grammar())) {
                    alt27=1;
                }
                else if ( (LA27_1==STRING_CONSTANT_LIST) && (synpred38_Grammar())) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(297,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:5: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')'
                    {
                    dbg.location(297,32);
                    YEARMONTHDURATION_TOK444=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK444_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK444)
                    ;
                    adaptor.addChild(root_0, YEARMONTHDURATION_TOK444_tree);
                    }
                    dbg.location(297,54);
                    char_literal445=(Token)match(input,80,FOLLOW_80_in_yearMonthDurationExpr2637); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal445_tree = 
                    (Object)adaptor.create(char_literal445)
                    ;
                    adaptor.addChild(root_0, char_literal445_tree);
                    }
                    dbg.location(297,58);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr2639);
                    stringExpr446=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr446.getTree());
                    dbg.location(297,69);
                    char_literal447=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal447_tree = 
                    (Object)adaptor.create(char_literal447)
                    ;
                    adaptor.addChild(root_0, char_literal447_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(298,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:5: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    dbg.location(298,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2654);
                    yearMonthDurationBag448=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag448.getTree());
                    dbg.location(298,52);
                    char_literal449=(Token)match(input,83,FOLLOW_83_in_yearMonthDurationExpr2656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal449_tree = 
                    (Object)adaptor.create(char_literal449)
                    ;
                    adaptor.addChild(root_0, char_literal449_tree);
                    }
                    dbg.location(298,56);
                    ONEANDONLY_TOK450=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK450_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK450)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK450_tree);
                    }
                    dbg.location(298,71);
                    char_literal451=(Token)match(input,80,FOLLOW_80_in_yearMonthDurationExpr2660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal451_tree = 
                    (Object)adaptor.create(char_literal451)
                    ;
                    adaptor.addChild(root_0, char_literal451_tree);
                    }
                    dbg.location(298,75);
                    char_literal452=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal452_tree = 
                    (Object)adaptor.create(char_literal452)
                    ;
                    adaptor.addChild(root_0, char_literal452_tree);
                    }

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(299, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationExpr"


    public static class yearMonthDurationBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:1: yearMonthDurationBag : ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK453=null;
        Token STRING_CONSTANT_LIST454=null;

        Object YEARMONTHDURATION_TOK453_tree=null;
        Object STRING_CONSTANT_LIST454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:301:2: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:301:4: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(301,31);
            YEARMONTHDURATION_TOK453=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2679); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK453_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK453)
            ;
            adaptor.addChild(root_0, YEARMONTHDURATION_TOK453_tree);
            }
            dbg.location(301,53);
            STRING_CONSTANT_LIST454=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST454_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST454)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST454_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(304, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationBag"


    public static class x500NameExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:1: x500NameExpr : ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK455=null;
        Token char_literal456=null;
        Token char_literal458=null;
        Token char_literal460=null;
        Token ONEANDONLY_TOK461=null;
        Token char_literal462=null;
        Token char_literal463=null;
        GrammarParser.stringExpr_return stringExpr457 =null;

        GrammarParser.x500NameBag_return x500NameBag459 =null;


        Object X500NAME_TOK455_tree=null;
        Object char_literal456_tree=null;
        Object char_literal458_tree=null;
        Object char_literal460_tree=null;
        Object ONEANDONLY_TOK461_tree=null;
        Object char_literal462_tree=null;
        Object char_literal463_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(306, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:2: ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==X500NAME_TOK) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==80) ) {
                    alt28=1;
                }
                else if ( (LA28_1==STRING_CONSTANT_LIST) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:4: X500NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(307,4);
                    X500NAME_TOK455=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr2696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK455_tree = 
                    (Object)adaptor.create(X500NAME_TOK455)
                    ;
                    adaptor.addChild(root_0, X500NAME_TOK455_tree);
                    }
                    dbg.location(307,17);
                    char_literal456=(Token)match(input,80,FOLLOW_80_in_x500NameExpr2698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal456_tree = 
                    (Object)adaptor.create(char_literal456)
                    ;
                    adaptor.addChild(root_0, char_literal456_tree);
                    }
                    dbg.location(307,21);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr2700);
                    stringExpr457=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr457.getTree());
                    dbg.location(307,32);
                    char_literal458=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal458_tree = 
                    (Object)adaptor.create(char_literal458)
                    ;
                    adaptor.addChild(root_0, char_literal458_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:4: x500NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(308,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr2707);
                    x500NameBag459=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag459.getTree());
                    dbg.location(308,17);
                    char_literal460=(Token)match(input,83,FOLLOW_83_in_x500NameExpr2710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal460_tree = 
                    (Object)adaptor.create(char_literal460)
                    ;
                    adaptor.addChild(root_0, char_literal460_tree);
                    }
                    dbg.location(308,21);
                    ONEANDONLY_TOK461=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK461_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK461)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK461_tree);
                    }
                    dbg.location(308,36);
                    char_literal462=(Token)match(input,80,FOLLOW_80_in_x500NameExpr2714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal462_tree = 
                    (Object)adaptor.create(char_literal462)
                    ;
                    adaptor.addChild(root_0, char_literal462_tree);
                    }
                    dbg.location(308,40);
                    char_literal463=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal463_tree = 
                    (Object)adaptor.create(char_literal463)
                    ;
                    adaptor.addChild(root_0, char_literal463_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(310, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "x500NameExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "x500NameExpr"


    public static class x500NameBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:311:1: x500NameBag : ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK464=null;
        Token STRING_CONSTANT_LIST465=null;

        Object X500NAME_TOK464_tree=null;
        Object STRING_CONSTANT_LIST465_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(311, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:2: ( ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:4: ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(312,22);
            X500NAME_TOK464=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag2733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK464_tree = 
            (Object)adaptor.create(X500NAME_TOK464)
            ;
            adaptor.addChild(root_0, X500NAME_TOK464_tree);
            }
            dbg.location(312,35);
            STRING_CONSTANT_LIST465=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2735); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST465_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST465)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST465_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(315, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "x500NameBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "x500NameBag"


    public static class rfc822NameExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:1: rfc822NameExpr : ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK466=null;
        Token char_literal467=null;
        Token char_literal469=null;
        Token char_literal471=null;
        Token ONEANDONLY_TOK472=null;
        Token char_literal473=null;
        Token char_literal474=null;
        GrammarParser.stringExpr_return stringExpr468 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag470 =null;


        Object RFC822NAME_TOK466_tree=null;
        Object char_literal467_tree=null;
        Object char_literal469_tree=null;
        Object char_literal471_tree=null;
        Object ONEANDONLY_TOK472_tree=null;
        Object char_literal473_tree=null;
        Object char_literal474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(317, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:2: ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==RFC822NAME_TOK) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==80) ) {
                    alt29=1;
                }
                else if ( (LA29_1==STRING_CONSTANT_LIST) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:4: RFC822NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(318,4);
                    RFC822NAME_TOK466=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK466_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK466)
                    ;
                    adaptor.addChild(root_0, RFC822NAME_TOK466_tree);
                    }
                    dbg.location(318,19);
                    char_literal467=(Token)match(input,80,FOLLOW_80_in_rfc822NameExpr2751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal467_tree = 
                    (Object)adaptor.create(char_literal467)
                    ;
                    adaptor.addChild(root_0, char_literal467_tree);
                    }
                    dbg.location(318,23);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr2753);
                    stringExpr468=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr468.getTree());
                    dbg.location(318,34);
                    char_literal469=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr2755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal469_tree = 
                    (Object)adaptor.create(char_literal469)
                    ;
                    adaptor.addChild(root_0, char_literal469_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:4: rfc822NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(319,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr2760);
                    rfc822NameBag470=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag470.getTree());
                    dbg.location(319,18);
                    char_literal471=(Token)match(input,83,FOLLOW_83_in_rfc822NameExpr2762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal471_tree = 
                    (Object)adaptor.create(char_literal471)
                    ;
                    adaptor.addChild(root_0, char_literal471_tree);
                    }
                    dbg.location(319,22);
                    ONEANDONLY_TOK472=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK472_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK472)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK472_tree);
                    }
                    dbg.location(319,37);
                    char_literal473=(Token)match(input,80,FOLLOW_80_in_rfc822NameExpr2766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal473_tree = 
                    (Object)adaptor.create(char_literal473)
                    ;
                    adaptor.addChild(root_0, char_literal473_tree);
                    }
                    dbg.location(319,41);
                    char_literal474=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr2768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal474_tree = 
                    (Object)adaptor.create(char_literal474)
                    ;
                    adaptor.addChild(root_0, char_literal474_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(321, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rfc822NameExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rfc822NameExpr"


    public static class rfc822NameBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:1: rfc822NameBag : ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK475=null;
        Token STRING_CONSTANT_LIST476=null;

        Object RFC822NAME_TOK475_tree=null;
        Object STRING_CONSTANT_LIST476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:2: ( ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:4: ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(323,24);
            RFC822NAME_TOK475=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag2785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK475_tree = 
            (Object)adaptor.create(RFC822NAME_TOK475)
            ;
            adaptor.addChild(root_0, RFC822NAME_TOK475_tree);
            }
            dbg.location(323,39);
            STRING_CONSTANT_LIST476=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag2787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST476_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST476)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST476_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(326, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rfc822NameBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rfc822NameBag"


    public static class hexBinaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:1: hexBinaryExpr : ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK477=null;
        Token char_literal478=null;
        Token char_literal480=null;
        Token char_literal482=null;
        Token ONEANDONLY_TOK483=null;
        Token char_literal484=null;
        Token char_literal485=null;
        GrammarParser.stringExpr_return stringExpr479 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag481 =null;


        Object HEXBINARY_TOK477_tree=null;
        Object char_literal478_tree=null;
        Object char_literal480_tree=null;
        Object char_literal482_tree=null;
        Object ONEANDONLY_TOK483_tree=null;
        Object char_literal484_tree=null;
        Object char_literal485_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:2: ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==HEXBINARY_TOK) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==80) ) {
                    alt30=1;
                }
                else if ( (LA30_1==STRING_CONSTANT_LIST) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:4: HEXBINARY_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(329,4);
                    HEXBINARY_TOK477=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr2802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK477_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK477)
                    ;
                    adaptor.addChild(root_0, HEXBINARY_TOK477_tree);
                    }
                    dbg.location(329,18);
                    char_literal478=(Token)match(input,80,FOLLOW_80_in_hexBinaryExpr2804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal478_tree = 
                    (Object)adaptor.create(char_literal478)
                    ;
                    adaptor.addChild(root_0, char_literal478_tree);
                    }
                    dbg.location(329,22);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr2806);
                    stringExpr479=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr479.getTree());
                    dbg.location(329,33);
                    char_literal480=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr2808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal480_tree = 
                    (Object)adaptor.create(char_literal480)
                    ;
                    adaptor.addChild(root_0, char_literal480_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:4: hexBinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(330,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr2813);
                    hexBinaryBag481=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag481.getTree());
                    dbg.location(330,17);
                    char_literal482=(Token)match(input,83,FOLLOW_83_in_hexBinaryExpr2815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal482_tree = 
                    (Object)adaptor.create(char_literal482)
                    ;
                    adaptor.addChild(root_0, char_literal482_tree);
                    }
                    dbg.location(330,21);
                    ONEANDONLY_TOK483=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr2817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK483_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK483)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK483_tree);
                    }
                    dbg.location(330,36);
                    char_literal484=(Token)match(input,80,FOLLOW_80_in_hexBinaryExpr2819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal484_tree = 
                    (Object)adaptor.create(char_literal484)
                    ;
                    adaptor.addChild(root_0, char_literal484_tree);
                    }
                    dbg.location(330,40);
                    char_literal485=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr2821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal485_tree = 
                    (Object)adaptor.create(char_literal485)
                    ;
                    adaptor.addChild(root_0, char_literal485_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(331, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hexBinaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hexBinaryExpr"


    public static class hexBinaryBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:1: hexBinaryBag : ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK486=null;
        Token STRING_CONSTANT_LIST487=null;

        Object HEXBINARY_TOK486_tree=null;
        Object STRING_CONSTANT_LIST487_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:2: ( ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:4: ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(333,23);
            HEXBINARY_TOK486=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag2837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK486_tree = 
            (Object)adaptor.create(HEXBINARY_TOK486)
            ;
            adaptor.addChild(root_0, HEXBINARY_TOK486_tree);
            }
            dbg.location(333,37);
            STRING_CONSTANT_LIST487=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag2839); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST487_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST487)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST487_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(336, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hexBinaryBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hexBinaryBag"


    public static class anyBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag488 =null;

        GrammarParser.integerBag_return integerBag489 =null;

        GrammarParser.doubleBag_return doubleBag490 =null;

        GrammarParser.stringBag_return stringBag491 =null;

        GrammarParser.anyUriBag_return anyUriBag492 =null;

        GrammarParser.dateBag_return dateBag493 =null;

        GrammarParser.timeBag_return timeBag494 =null;

        GrammarParser.dateTimeBag_return dateTimeBag495 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag496 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag497 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag498 =null;

        GrammarParser.x500NameBag_return x500NameBag499 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag500 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag501 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt31=14;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            switch ( input.LA(1) ) {
            case BOOLEAN_TOK:
                {
                alt31=1;
                }
                break;
            case BAG_TOK:
            case INTEGER_TOK:
                {
                alt31=2;
                }
                break;
            case DOUBLE_TOK:
                {
                alt31=3;
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case STRING_TOK:
            case SUBJECT_TOK:
                {
                alt31=4;
                }
                break;
            case ANYURI_TOK:
                {
                alt31=5;
                }
                break;
            case DATE_TOK:
                {
                alt31=6;
                }
                break;
            case TIME_TOK:
                {
                alt31=7;
                }
                break;
            case DATETIME_TOK:
                {
                alt31=8;
                }
                break;
            case BASE64BINARY_TOK:
                {
                alt31=9;
                }
                break;
            case DAYTIMEDURATION_TOK:
                {
                alt31=10;
                }
                break;
            case YEARMONTHDURATION_TOK:
                {
                alt31=11;
                }
                break;
            case X500NAME_TOK:
                {
                alt31=12;
                }
                break;
            case RFC822NAME_TOK:
                {
                alt31=13;
                }
                break;
            case HEXBINARY_TOK:
                {
                alt31=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag2852);
                    booleanBag488=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag488.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag2856);
                    integerBag489=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag489.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag2860);
                    doubleBag490=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag490.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag2864);
                    stringBag491=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag491.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag2868);
                    anyUriBag492=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag492.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(339,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag2872);
                    dateBag493=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag493.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag2877);
                    timeBag494=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag494.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag2881);
                    dateTimeBag495=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag495.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag2885);
                    base64BinaryBag496=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag496.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag2889);
                    dayTimeDurationBag497=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag497.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(341,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag2894);
                    yearMonthDurationBag498=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag498.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(341,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag2899);
                    x500NameBag499=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag499.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:342:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(342,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag2904);
                    rfc822NameBag500=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag500.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:342:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(342,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag2908);
                    hexBinaryBag501=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag501.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(343, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyBag"

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:6: base64BinaryExpr
        {
        dbg.location(140,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred4_Grammar906);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:4: ( dayTimeDurationExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:5: dayTimeDurationExpr
        {
        dbg.location(154,5);
        pushFollow(FOLLOW_dayTimeDurationExpr_in_synpred5_Grammar1225);
        dayTimeDurationExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:5: base64BinaryExpr
        {
        dbg.location(155,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred6_Grammar1260);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:5: base64BinaryExpr
        {
        dbg.location(170,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred7_Grammar1468);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:5: booleanBag
        {
        dbg.location(174,5);
        pushFollow(FOLLOW_booleanBag_in_synpred8_Grammar1495);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:5: integerBag
        {
        dbg.location(175,5);
        pushFollow(FOLLOW_integerBag_in_synpred9_Grammar1528);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:5: doubleBag
        {
        dbg.location(176,5);
        pushFollow(FOLLOW_doubleBag_in_synpred10_Grammar1563);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:5: stringBag
        {
        dbg.location(177,5);
        pushFollow(FOLLOW_stringBag_in_synpred11_Grammar1598);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:5: dateBag
        {
        dbg.location(178,5);
        pushFollow(FOLLOW_dateBag_in_synpred12_Grammar1634);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:5: timeBag
        {
        dbg.location(179,5);
        pushFollow(FOLLOW_timeBag_in_synpred13_Grammar1670);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:5: dateTimeBag
        {
        dbg.location(180,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred14_Grammar1706);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:5: base64BinaryBag
        {
        dbg.location(181,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred15_Grammar1742);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:5: dayTimeDurationBag
        {
        dbg.location(182,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred16_Grammar1778);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:5: yearMonthDurationBag
        {
        dbg.location(183,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred17_Grammar1814);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Grammar

    // $ANTLR start synpred18_Grammar
    public final void synpred18_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:5: anyUriBag
        {
        dbg.location(184,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred18_Grammar1850);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Grammar

    // $ANTLR start synpred19_Grammar
    public final void synpred19_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:5: x500NameBag
        {
        dbg.location(185,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred19_Grammar1886);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_Grammar

    // $ANTLR start synpred20_Grammar
    public final void synpred20_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:5: rfc822NameBag
        {
        dbg.location(186,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred20_Grammar1922);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Grammar

    // $ANTLR start synpred21_Grammar
    public final void synpred21_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:5: hexBinaryBag
        {
        dbg.location(187,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred21_Grammar1958);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Grammar

    // $ANTLR start synpred22_Grammar
    public final void synpred22_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:5: base64BinaryBag
        {
        dbg.location(188,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred22_Grammar1994);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_Grammar

    // $ANTLR start synpred24_Grammar
    public final void synpred24_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: ( STRING_CONSTANT )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:5: STRING_CONSTANT
        {
        dbg.location(216,5);
        match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_synpred24_Grammar2182); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Grammar

    // $ANTLR start synpred25_Grammar
    public final void synpred25_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( stringExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:5: stringExpr
        {
        dbg.location(236,5);
        pushFollow(FOLLOW_stringExpr_in_synpred25_Grammar2293);
        stringExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Grammar

    // $ANTLR start synpred28_Grammar
    public final void synpred28_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:4: ( DATETIME_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:5: DATETIME_TOK
        {
        dbg.location(266,5);
        match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_synpred28_Grammar2434); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_Grammar

    // $ANTLR start synpred29_Grammar
    public final void synpred29_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:5: dateTimeBag
        {
        dbg.location(267,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred29_Grammar2451);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred29_Grammar

    // $ANTLR start synpred31_Grammar
    public final void synpred31_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:5: ( BASE64BINARY_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:6: BASE64BINARY_TOK
        {
        dbg.location(276,6);
        match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_synpred31_Grammar2498); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_Grammar

    // $ANTLR start synpred32_Grammar
    public final void synpred32_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:5: base64BinaryBag
        {
        dbg.location(277,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred32_Grammar2516);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_Grammar

    // $ANTLR start synpred34_Grammar
    public final void synpred34_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: ( DAYTIMEDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:5: DAYTIMEDURATION_TOK
        {
        dbg.location(287,5);
        match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_synpred34_Grammar2565); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_Grammar

    // $ANTLR start synpred35_Grammar
    public final void synpred35_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:5: dayTimeDurationBag
        {
        dbg.location(288,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred35_Grammar2582);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred35_Grammar

    // $ANTLR start synpred37_Grammar
    public final void synpred37_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:5: ( YEARMONTHDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:6: YEARMONTHDURATION_TOK
        {
        dbg.location(297,6);
        match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_synpred37_Grammar2630); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred37_Grammar

    // $ANTLR start synpred38_Grammar
    public final void synpred38_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:5: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:6: yearMonthDurationBag
        {
        dbg.location(298,6);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred38_Grammar2649);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred38_Grammar

    // Delegated rules

    public final boolean synpred31_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred31_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred29_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred19_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred14_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred16_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred22_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred37_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred7_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred38_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred34_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred12_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred11_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred25_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred28_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred13_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred35_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred15_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred32_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred18_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred21_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred24_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA6_eotS =
        "\u00d6\uffff";
    static final String DFA6_eofS =
        "\u00d6\uffff";
    static final String DFA6_minS =
        "\1\5\2\uffff\1\102\3\uffff\1\123\1\102\1\123\13\102\1\123\1\uffff"+
        "\1\46\1\123\1\51\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123"+
        "\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\uffff\1\120"+
        "\1\uffff\1\64\1\123\1\121\1\102\1\123\1\64\1\121\1\102\1\123\1\64"+
        "\1\121\1\102\1\123\1\64\1\121\1\102\1\123\1\64\1\121\1\102\1\123"+
        "\1\64\1\121\1\102\1\123\1\64\1\121\1\102\1\123\1\64\1\121\1\102"+
        "\1\123\1\64\1\121\1\102\1\123\1\64\1\121\1\102\1\123\1\64\1\121"+
        "\1\120\1\51\2\123\1\51\1\120\2\123\1\51\1\120\2\123\1\51\1\120\2"+
        "\123\1\51\1\120\2\123\1\51\1\120\2\123\1\51\1\120\2\123\1\51\1\120"+
        "\2\123\1\51\1\120\2\123\1\51\1\120\2\123\1\51\1\123\1\121\1\64\1"+
        "\123\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1"+
        "\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1\121"+
        "\1\64\1\123\1\121\1\64\2\123\1\120\1\51\1\123\1\120\1\51\1\123\1"+
        "\120\1\51\1\123\1\120\1\51\1\123\1\120\1\51\1\123\1\120\1\51\1\123"+
        "\1\120\1\51\1\123\1\120\1\51\1\123\1\120\1\51\1\123\1\120\1\51\24"+
        "\121";
    static final String DFA6_maxS =
        "\1\120\2\uffff\1\120\3\uffff\1\130\1\102\1\123\13\120\1\130\1\uffff"+
        "\1\113\1\123\1\51\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123"+
        "\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123\1\104"+
        "\1\123\1\uffff\1\120\1\uffff\1\100\1\123\1\121\1\102\1\123\1\100"+
        "\1\121\1\102\1\123\1\100\1\121\1\102\1\123\1\100\1\121\1\102\1\123"+
        "\1\100\1\121\1\102\1\123\1\100\1\121\1\102\1\123\1\100\1\121\1\102"+
        "\1\123\1\100\1\121\1\102\1\123\1\100\1\121\1\102\1\123\1\100\1\121"+
        "\1\102\1\123\1\100\1\121\1\120\1\100\1\130\1\123\1\51\1\120\1\130"+
        "\1\123\1\51\1\120\1\130\1\123\1\51\1\120\1\130\1\123\1\51\1\120"+
        "\1\130\1\123\1\51\1\120\1\130\1\123\1\51\1\120\1\130\1\123\1\51"+
        "\1\120\1\130\1\123\1\51\1\120\1\130\1\123\1\51\1\120\1\130\1\123"+
        "\1\51\1\130\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1"+
        "\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123"+
        "\1\121\1\64\1\123\1\121\1\64\1\123\1\121\1\64\1\123\1\130\1\120"+
        "\1\64\1\130\1\120\1\64\1\130\1\120\1\64\1\130\1\120\1\64\1\130\1"+
        "\120\1\64\1\130\1\120\1\64\1\130\1\120\1\64\1\130\1\120\1\64\1\130"+
        "\1\120\1\64\1\130\1\120\1\64\24\121";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\17\uffff\1\3\27\uffff\1\7\1"+
        "\uffff\1\10\u00a5\uffff";
    static final String DFA6_specialS =
        "\u00d6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\11\7\uffff\1\13\1\uffff\1\6\1\17\1\3\3\uffff\1\16\1\14\1"+
            "\20\3\uffff\1\25\1\12\1\11\2\uffff\1\2\1\uffff\1\24\2\uffff"+
            "\2\6\10\uffff\1\4\2\uffff\1\4\7\uffff\1\11\1\23\5\uffff\1\7"+
            "\1\uffff\1\10\1\11\2\uffff\1\15\1\1\4\uffff\1\22\1\21\1\uffff"+
            "\1\5",
            "",
            "",
            "\1\6\15\uffff\1\26",
            "",
            "",
            "",
            "\1\27\5\6",
            "\1\30",
            "\1\31",
            "\1\6\15\uffff\1\32",
            "\1\33\15\uffff\1\34",
            "\1\35\15\uffff\1\36",
            "\1\37\15\uffff\1\40",
            "\1\41\15\uffff\1\42",
            "\1\43\15\uffff\1\44",
            "\1\45\15\uffff\1\46",
            "\1\47\15\uffff\1\50",
            "\1\51\15\uffff\1\52",
            "\1\53\15\uffff\1\54",
            "\1\55\15\uffff\1\56",
            "\1\56\5\6",
            "",
            "\1\6\1\uffff\1\56\3\uffff\1\6\2\60\34\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\65\27\uffff\1\65\34\uffff\1\65\6\uffff\1\63\1\uffff\1\64"+
            "\1\65",
            "\1\66",
            "\1\71\27\uffff\1\71\34\uffff\1\71\6\uffff\1\67\1\uffff\1\70"+
            "\1\71",
            "\1\72",
            "\1\75\27\uffff\1\75\34\uffff\1\75\6\uffff\1\73\1\uffff\1\74"+
            "\1\75",
            "\1\76",
            "\1\101\27\uffff\1\101\34\uffff\1\101\6\uffff\1\77\1\uffff\1"+
            "\100\1\101",
            "\1\102",
            "\1\105\27\uffff\1\105\34\uffff\1\105\6\uffff\1\103\1\uffff"+
            "\1\104\1\105",
            "\1\106",
            "\1\111\27\uffff\1\111\34\uffff\1\111\6\uffff\1\107\1\uffff"+
            "\1\110\1\111",
            "\1\112",
            "\1\115\27\uffff\1\115\34\uffff\1\115\6\uffff\1\113\1\uffff"+
            "\1\114\1\115",
            "\1\116",
            "\1\121\27\uffff\1\121\34\uffff\1\121\6\uffff\1\117\1\uffff"+
            "\1\120\1\121",
            "\1\122",
            "\1\125\27\uffff\1\125\34\uffff\1\125\6\uffff\1\123\1\uffff"+
            "\1\124\1\125",
            "\1\126",
            "\1\131\27\uffff\1\131\34\uffff\1\131\6\uffff\1\127\1\uffff"+
            "\1\130\1\131",
            "\1\132",
            "",
            "\1\133",
            "",
            "\1\134\13\uffff\1\6",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141\13\uffff\1\6",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\13\uffff\1\6",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\13\uffff\1\6",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\13\uffff\1\6",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\13\uffff\1\6",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165\13\uffff\1\6",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\13\uffff\1\6",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175\13\uffff\1\6",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081\13\uffff\1\6",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\56\13\uffff\1\6",
            "\1\u0085",
            "\1\u0086",
            "\1\62\12\uffff\1\134\13\uffff\1\6",
            "\1\56\5\6",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\56\5\6",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\56\5\6",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\56\5\6",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\56\5\6",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\56\5\6",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\56\5\6",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\56\5\6",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\56\5\6",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\56\5\6",
            "\1\u00a2",
            "\1\u00a3",
            "\1\56\5\6",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\27\5\6",
            "\1\u00c2",
            "\1\u0088\12\uffff\1\u00a5",
            "\1\56\5\6",
            "\1\u00c3",
            "\1\u008b\12\uffff\1\u00a8",
            "\1\56\5\6",
            "\1\u00c4",
            "\1\u008e\12\uffff\1\u00ab",
            "\1\56\5\6",
            "\1\u00c5",
            "\1\u0091\12\uffff\1\u00ae",
            "\1\56\5\6",
            "\1\u00c6",
            "\1\u0094\12\uffff\1\u00b1",
            "\1\56\5\6",
            "\1\u00c7",
            "\1\u0097\12\uffff\1\u00b4",
            "\1\56\5\6",
            "\1\u00c8",
            "\1\u009a\12\uffff\1\u00b7",
            "\1\56\5\6",
            "\1\u00c9",
            "\1\u009d\12\uffff\1\u00ba",
            "\1\56\5\6",
            "\1\u00ca",
            "\1\u00a0\12\uffff\1\u00bd",
            "\1\56\5\6",
            "\1\u00cb",
            "\1\u00a3\12\uffff\1\u00c0",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\136",
            "\1\142",
            "\1\146",
            "\1\152",
            "\1\156",
            "\1\162",
            "\1\166",
            "\1\172",
            "\1\176",
            "\1\u0082"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "101:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA9_eotS =
        "\63\uffff";
    static final String DFA9_eofS =
        "\63\uffff";
    static final String DFA9_minS =
        "\1\5\1\uffff\1\123\1\102\1\123\4\uffff\1\102\5\uffff\1\50\1\123"+
        "\1\51\1\5\1\123\1\uffff\1\64\1\123\1\121\1\102\1\123\1\64\1\120"+
        "\1\51\2\123\1\51\1\120\1\121\1\50\1\64\1\123\1\121\1\123\2\120\1"+
        "\51\1\123\1\20\1\121\1\102\2\121\1\0\2\uffff";
    static final String DFA9_maxS =
        "\1\116\1\uffff\1\123\1\102\1\123\4\uffff\1\120\5\uffff\1\113\1\123"+
        "\1\51\1\104\1\123\1\uffff\1\64\1\123\1\121\1\102\1\123\1\64\1\120"+
        "\1\64\2\123\1\51\1\120\1\121\1\50\1\64\1\123\1\121\1\123\2\120\1"+
        "\64\1\123\1\20\1\121\1\102\2\121\1\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\5\uffff\1\2\34\uffff\1\7\1\15";
    static final String DFA9_specialS =
        "\60\uffff\1\0\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\7\uffff\1\5\2\uffff\1\11\4\uffff\1\10\1\6\1\12\3\uffff"+
            "\2\1\1\4\4\uffff\1\16\27\uffff\1\4\1\15\5\uffff\1\2\1\uffff"+
            "\1\3\1\4\2\uffff\1\7\5\uffff\1\14\1\13",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "\1\23\15\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "\1\24\42\uffff\1\5",
            "\1\25",
            "\1\26",
            "\1\31\27\uffff\1\31\34\uffff\1\31\6\uffff\1\27\1\uffff\1\30"+
            "\1\31",
            "\1\32",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\26\12\uffff\1\33",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\17",
            "\1\53",
            "\1\54",
            "\1\44\12\uffff\1\50",
            "\1\42",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\35",
            "\1\60",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "127:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_48 = input.LA(1);

                         
                        int index9_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 49;}

                        else if ( (synpred4_Grammar()) ) {s = 50;}

                         
                        input.seek(index9_48);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA10_eotS =
        "\67\uffff";
    static final String DFA10_eofS =
        "\67\uffff";
    static final String DFA10_minS =
        "\1\5\1\uffff\1\123\1\102\1\123\12\102\1\uffff\1\46\1\uffff\1\123"+
        "\1\51\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1"+
        "\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\64\1\123\11\64\1\120\1\51\2\uffff\1\121\1\123";
    static final String DFA10_maxS =
        "\1\116\1\uffff\1\130\1\102\1\123\12\120\1\uffff\1\113\1\uffff\1"+
        "\123\1\51\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\100\1\123\11\100\1\120\1\100\2\uffff\1\121\1\130";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\15\uffff\1\14\1\13\2\uffff";
    static final String DFA10_specialS =
        "\12\uffff\1\2\1\1\40\uffff\1\3\1\0\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
            "\3\uffff\1\17\1\5\1\4\4\uffff\1\1\2\uffff\2\1\23\uffff\1\4\1"+
            "\16\5\uffff\1\2\1\uffff\1\3\1\4\2\uffff\1\10\5\uffff\1\15\1"+
            "\14",
            "",
            "\1\20\5\21",
            "\1\22",
            "\1\23",
            "\1\1\15\uffff\1\17",
            "\1\24\15\uffff\1\25",
            "\1\26\15\uffff\1\27",
            "\1\30\15\uffff\1\31",
            "\1\32\15\uffff\1\33",
            "\1\34\15\uffff\1\35",
            "\1\36\15\uffff\1\37",
            "\1\40\15\uffff\1\41",
            "\1\42\15\uffff\1\43",
            "\1\44\15\uffff\1\45",
            "",
            "\1\1\5\uffff\1\1\36\uffff\1\25",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "",
            "\1\52",
            "",
            "\1\53",
            "",
            "\1\54",
            "",
            "\1\55",
            "",
            "\1\56",
            "",
            "\1\57",
            "",
            "\1\60",
            "",
            "\1\61\13\uffff\1\1",
            "\1\62",
            "\1\25\13\uffff\1\1",
            "\1\27\13\uffff\1\1",
            "\1\31\13\uffff\1\1",
            "\1\33\13\uffff\1\1",
            "\1\63\13\uffff\1\1",
            "\1\64\13\uffff\1\1",
            "\1\41\13\uffff\1\1",
            "\1\43\13\uffff\1\1",
            "\1\45\13\uffff\1\1",
            "\1\65",
            "\1\47\12\uffff\1\61\13\uffff\1\1",
            "",
            "",
            "\1\66",
            "\1\20\5\21"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "143:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_45 = input.LA(1);

                         
                        int index10_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_45==SIZE_TOK) ) {s = 1;}

                        else if ( (LA10_45==ONEANDONLY_TOK) && (synpred5_Grammar())) {s = 52;}

                         
                        input.seek(index10_45);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_11==STRING_CONSTANT_LIST) ) {s = 30;}

                        else if ( (LA10_11==80) && (synpred5_Grammar())) {s = 31;}

                         
                        input.seek(index10_11);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_10==STRING_CONSTANT_LIST) ) {s = 28;}

                        else if ( (LA10_10==80) && (synpred6_Grammar())) {s = 29;}

                         
                        input.seek(index10_10);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_44 = input.LA(1);

                         
                        int index10_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_44==SIZE_TOK) ) {s = 1;}

                        else if ( (LA10_44==ONEANDONLY_TOK) && (synpred6_Grammar())) {s = 51;}

                         
                        input.seek(index10_44);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA11_eotS =
        "\66\uffff";
    static final String DFA11_eofS =
        "\66\uffff";
    static final String DFA11_minS =
        "\1\5\1\uffff\1\123\1\102\1\123\12\102\1\uffff\1\46\1\123\1\51\1"+
        "\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\2\uffff\1\64\1"+
        "\123\11\64\1\120\1\51\1\uffff\1\121\1\123";
    static final String DFA11_maxS =
        "\1\116\1\uffff\1\123\1\102\1\123\12\120\1\uffff\1\113\1\123\1\51"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\2\uffff\1"+
        "\100\1\123\11\100\1\120\1\100\1\uffff\1\121\1\123";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\3\15\uffff\1\14\2\uffff";
    static final String DFA11_specialS =
        "\12\uffff\1\0\41\uffff\1\1\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
            "\3\uffff\1\17\1\5\1\4\4\uffff\1\1\2\uffff\2\1\23\uffff\1\4\1"+
            "\16\5\uffff\1\2\1\uffff\1\3\1\4\2\uffff\1\10\5\uffff\1\15\1"+
            "\14",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\1\15\uffff\1\17",
            "\1\23\15\uffff\1\24",
            "\1\25\15\uffff\1\26",
            "\1\27\15\uffff\1\30",
            "\1\31\15\uffff\1\32",
            "\1\33\15\uffff\1\34",
            "\1\35\15\uffff\1\36",
            "\1\37\15\uffff\1\40",
            "\1\41\15\uffff\1\42",
            "\1\43\15\uffff\1\44",
            "",
            "\1\1\5\uffff\1\1\14\uffff\1\45\21\uffff\1\24",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "",
            "\1\52",
            "",
            "\1\53",
            "",
            "\1\54",
            "",
            "\1\55",
            "",
            "\1\56",
            "",
            "\1\57",
            "",
            "\1\60",
            "",
            "",
            "\1\61\13\uffff\1\1",
            "\1\62",
            "\1\24\13\uffff\1\1",
            "\1\26\13\uffff\1\1",
            "\1\30\13\uffff\1\1",
            "\1\32\13\uffff\1\1",
            "\1\63\13\uffff\1\1",
            "\1\36\13\uffff\1\1",
            "\1\40\13\uffff\1\1",
            "\1\42\13\uffff\1\1",
            "\1\44\13\uffff\1\1",
            "\1\64",
            "\1\47\12\uffff\1\61\13\uffff\1\1",
            "",
            "\1\65",
            "\1\20"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "158:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_10==STRING_CONSTANT_LIST) ) {s = 27;}

                        else if ( (LA11_10==80) && (synpred7_Grammar())) {s = 28;}

                         
                        input.seek(index11_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA11_44 = input.LA(1);

                         
                        int index11_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_44==SIZE_TOK) ) {s = 1;}

                        else if ( (LA11_44==ONEANDONLY_TOK) && (synpred7_Grammar())) {s = 51;}

                         
                        input.seek(index11_44);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\5\2\uffff\1\102\1\123\1\uffff\1\123\1\51\1\64\1\123\1\51";
    static final String DFA13_maxS =
        "\1\116\2\uffff\1\102\1\123\1\uffff\1\123\1\51\1\100\1\123\1\100";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\5\uffff";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\7\uffff\1\5\1\uffff\3\5\3\uffff\3\5\4\uffff\1\5\1\4\4\uffff"+
            "\1\5\2\uffff\1\1\1\5\23\uffff\1\4\1\5\5\uffff\1\2\1\uffff\1"+
            "\3\1\4\2\uffff\1\5\5\uffff\2\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\11",
            "\1\2\13\uffff\1\5",
            "\1\12",
            "\1\11\12\uffff\1\2\13\uffff\1\5"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "191:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_parseFile424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parseFile426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy437 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy440 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy442 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_policy444 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000040L});
    public static final BitSet FOLLOW_target_in_policy446 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule_in_policy449 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_policy452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target463 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_target466 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_set_in_target468 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_target476 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_booleanExpr_in_target478 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_target480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule491 = new BitSet(new long[]{0x0000000000000200L,0x0000000002000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule494 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_rule497 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_set_in_rule499 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule507 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_booleanExpr_in_rule509 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rule511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanExpr534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_booleanExpr537 = new BitSet(new long[]{0x0400000020000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_attributeExpr_in_booleanExpr539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOF_TOK_in_booleanExpr548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NOT_TOK_in_booleanExpr553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_booleanExpr557 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_booleanExpr566 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanExpr568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_booleanExpr587 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_NODEEQUAL_TOK_in_booleanExpr591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NODEMATCH_TOK_in_booleanExpr596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_booleanExpr601 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr647 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalOrExpr650 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr652 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr679 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_conditionalAndExpr682 = new BitSet(new long[]{0x0C04806538E3A020L,0x000000000001619AL});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp703 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp708 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp720 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp725 = new BitSet(new long[]{0x0400000020000020L,0x0000000000000018L});
    public static final BitSet FOLLOW_stringBag_in_isInOp727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp737 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp742 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp754 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp759 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp771 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeBag_in_isInOp778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp788 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp793 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp805 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp822 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp827 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp839 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp856 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp873 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp878 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp890 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp913 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp918 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr933 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr935 = new BitSet(new long[]{0x0C00006430E3A020L,0x000000000000609AL});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr962 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr964 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr991 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr993 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1022 = new BitSet(new long[]{0x0400000020002020L,0x000000000000001AL});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1051 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1196 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1230 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1232 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1267 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1304 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1308 = new BitSet(new long[]{0x0C00006430E3A020L,0x000000000000609AL});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1319 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1323 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1334 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1338 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1349 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1353 = new BitSet(new long[]{0x0400000020002020L,0x000000000000001AL});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1364 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1368 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1379 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1394 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1398 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1409 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1424 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1439 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1454 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1458 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1475 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1502 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1518 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1535 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1552 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1570 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1606 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1623 = new BitSet(new long[]{0x0400000020000020L,0x0000000000000018L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1642 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1659 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1678 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1714 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1731 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1750 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1767 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1786 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1803 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1822 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1858 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1875 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1894 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1930 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1947 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1966 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1983 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2001 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp2018 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2041 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerExpr2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerExpr2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerBag2091 = new BitSet(new long[]{0x0C00006430E3A020L,0x000000000000609AL});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerBag2097 = new BitSet(new long[]{0x0C00006430E3A020L,0x000000000000609AL});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_integerBag2103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2107 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_integerBag2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerBag2119 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerBag2123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_doubleExpr2143 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_doubleExpr2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_stringExpr2195 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_stringExpr2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stringExpr2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringBag2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_attributeExpr2251 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2269 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2281 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateExpr2334 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateExpr2345 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateExpr2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timeExpr2385 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_timeExpr2396 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timeExpr2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateTimeExpr2441 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateTimeExpr2458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateTimeExpr2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_base64BinaryExpr2505 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_base64BinaryExpr2523 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_base64BinaryExpr2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dayTimeDurationExpr2572 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dayTimeDurationExpr2589 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dayTimeDurationExpr2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_yearMonthDurationExpr2637 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_yearMonthDurationExpr2656 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_yearMonthDurationExpr2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_x500NameExpr2698 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr2700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_x500NameExpr2710 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_x500NameExpr2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rfc822NameExpr2751 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rfc822NameExpr2762 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rfc822NameExpr2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag2785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_hexBinaryExpr2804 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_hexBinaryExpr2815 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_hexBinaryExpr2819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred4_Grammar906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_synpred5_Grammar1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred6_Grammar1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred7_Grammar1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred8_Grammar1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred9_Grammar1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred10_Grammar1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred11_Grammar1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred12_Grammar1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred13_Grammar1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred14_Grammar1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred15_Grammar1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred16_Grammar1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred17_Grammar1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred18_Grammar1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred19_Grammar1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred20_Grammar1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred21_Grammar1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred22_Grammar1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_synpred24_Grammar2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_synpred25_Grammar2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_synpred28_Grammar2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred29_Grammar2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_synpred31_Grammar2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred32_Grammar2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_synpred34_Grammar2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred35_Grammar2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_synpred37_Grammar2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred38_Grammar2649 = new BitSet(new long[]{0x0000000000000002L});

}