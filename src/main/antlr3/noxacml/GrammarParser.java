// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-06-24 17:29:02

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
    "invalidRule", "regexOp", "attributeExpr", "yearMonthDurationExpr", 
    "synpred37_Grammar", "synpred19_Grammar", "dateTimeExpr", "timeBag", 
    "synpred34_Grammar", "synpred6_Grammar", "dayTimeDurationBag", "synpred5_Grammar", 
    "synpred20_Grammar", "booleanExpr", "synpred10_Grammar", "synpred31_Grammar", 
    "dateBag", "x500NameBag", "synpred11_Grammar", "synpred32_Grammar", 
    "anyBag", "synpred18_Grammar", "stringExpr", "integerExpr", "synpred42_Grammar", 
    "synpred41_Grammar", "synpred40_Grammar", "synpred38_Grammar", "conditionalAndExpr", 
    "synpred44_Grammar", "doubleBag", "synpred9_Grammar", "x500NameExpr", 
    "dateTimeBag", "synpred22_Grammar", "dayTimeDurationExpr", "synpred30_Grammar", 
    "synpred2_Grammar", "rule", "booleanBag", "bagOp", "policy", "synpred3_Grammar", 
    "synpred39_Grammar", "stringBag", "synpred21_Grammar", "base64BinaryBag", 
    "hexBinaryBag", "synpred7_Grammar", "synpred8_Grammar", "timeExpr", 
    "synpred33_Grammar", "synpred15_Grammar", "target", "synpred14_Grammar", 
    "synpred17_Grammar", "equalityExpr", "rfc822NameExpr", "synpred1_Grammar", 
    "synpred25_Grammar", "synpred35_Grammar", "rfc822NameBag", "synpred16_Grammar", 
    "hexBinaryExpr", "synpred29_Grammar", "synpred4_Grammar", "synpred13_Grammar", 
    "integerBag", "synpred26_Grammar", "synpred23_Grammar", "synpred12_Grammar", 
    "synpred28_Grammar", "isInOp", "synpred43_Grammar", "parseFile", "anyUriBag", 
    "dateExpr", "base64BinaryExpr", "conditionalOrExpr", "doubleExpr", "synpred27_Grammar", 
    "anyUriExpr", "synpred24_Grammar", "yearMonthDurationBag", "synpred36_Grammar"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, true, false, 
        false, true, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false
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


    public static class conditionalOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:1: conditionalOrExpr : ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal47=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr46 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr48 =null;


        Object string_literal47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:5: ( ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:7: ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(115,31);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr627);
            conditionalAndExpr46=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr46.getTree());
            dbg.location(115,50);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:50: ( '||' conditionalAndExpr )*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:51: '||' conditionalAndExpr
            	    {
            	    dbg.location(115,51);
            	    string_literal47=(Token)match(input,90,FOLLOW_90_in_conditionalOrExpr630); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal47_tree = 
            	    (Object)adaptor.create(string_literal47)
            	    ;
            	    adaptor.addChild(root_0, string_literal47_tree);
            	    }
            	    dbg.location(115,56);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr632);
            	    conditionalAndExpr48=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr48.getTree());

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
        dbg.location(116, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:118:1: conditionalAndExpr : ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal50=null;
        GrammarParser.booleanExpr_return booleanExpr49 =null;

        GrammarParser.booleanExpr_return booleanExpr51 =null;


        Object string_literal50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:5: ( ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:7: ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(119,25);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr659);
            booleanExpr49=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr49.getTree());
            dbg.location(119,37);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:37: ( '&&' booleanExpr )*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:38: '&&' booleanExpr
            	    {
            	    dbg.location(119,38);
            	    string_literal50=(Token)match(input,79,FOLLOW_79_in_conditionalAndExpr662); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal50_tree = 
            	    (Object)adaptor.create(string_literal50)
            	    ;
            	    adaptor.addChild(root_0, string_literal50_tree);
            	    }
            	    dbg.location(119,43);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr664);
            	    booleanExpr51=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr51.getTree());

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
        dbg.location(120, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal53=null;
        Token ISIN_TOK54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token ISIN_TOK60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token ISIN_TOK66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token ISIN_TOK72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token ISIN_TOK78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token ISIN_TOK84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token ISIN_TOK90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token ISIN_TOK96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token ISIN_TOK102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token ISIN_TOK108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token ISIN_TOK114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token char_literal119=null;
        Token ISIN_TOK120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        Token char_literal125=null;
        Token ISIN_TOK126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        GrammarParser.doubleExpr_return doubleExpr52 =null;

        GrammarParser.doubleBag_return doubleBag56 =null;

        GrammarParser.stringExpr_return stringExpr58 =null;

        GrammarParser.stringBag_return stringBag62 =null;

        GrammarParser.anyUriExpr_return anyUriExpr64 =null;

        GrammarParser.anyUriBag_return anyUriBag68 =null;

        GrammarParser.dateExpr_return dateExpr70 =null;

        GrammarParser.dateBag_return dateBag74 =null;

        GrammarParser.timeExpr_return timeExpr76 =null;

        GrammarParser.timeBag_return timeBag80 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr82 =null;

        GrammarParser.dateTimeBag_return dateTimeBag86 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr88 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag92 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr94 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag98 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr100 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag104 =null;

        GrammarParser.x500NameExpr_return x500NameExpr106 =null;

        GrammarParser.x500NameBag_return x500NameBag110 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr112 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag116 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr118 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag122 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr124 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag128 =null;


        Object char_literal53_tree=null;
        Object ISIN_TOK54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        Object ISIN_TOK60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object ISIN_TOK66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object ISIN_TOK72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object ISIN_TOK78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object ISIN_TOK84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        Object ISIN_TOK90_tree=null;
        Object char_literal91_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object ISIN_TOK96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object ISIN_TOK102_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        Object ISIN_TOK108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        Object ISIN_TOK114_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        Object ISIN_TOK120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;
        Object char_literal125_tree=null;
        Object ISIN_TOK126_tree=null;
        Object char_literal127_tree=null;
        Object char_literal129_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:123:2: ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:123:5: doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(123,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp681);
                    doubleExpr52=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr52.getTree());
                    dbg.location(123,16);
                    char_literal53=(Token)match(input,83,FOLLOW_83_in_isInOp683); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = 
                    (Object)adaptor.create(char_literal53)
                    ;
                    adaptor.addChild(root_0, char_literal53_tree);
                    }
                    dbg.location(123,28);
                    ISIN_TOK54=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK54_tree = 
                    (Object)adaptor.create(ISIN_TOK54)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK54_tree, root_0);
                    }
                    dbg.location(123,30);
                    char_literal55=(Token)match(input,80,FOLLOW_80_in_isInOp688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = 
                    (Object)adaptor.create(char_literal55)
                    ;
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    dbg.location(123,34);
                    pushFollow(FOLLOW_doubleBag_in_isInOp690);
                    doubleBag56=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag56.getTree());
                    dbg.location(123,44);
                    char_literal57=(Token)match(input,81,FOLLOW_81_in_isInOp692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = 
                    (Object)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:5: stringExpr '.' ISIN_TOK ^ '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(124,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp698);
                    stringExpr58=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr58.getTree());
                    dbg.location(124,16);
                    char_literal59=(Token)match(input,83,FOLLOW_83_in_isInOp700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = 
                    (Object)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);
                    }
                    dbg.location(124,28);
                    ISIN_TOK60=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK60_tree = 
                    (Object)adaptor.create(ISIN_TOK60)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK60_tree, root_0);
                    }
                    dbg.location(124,30);
                    char_literal61=(Token)match(input,80,FOLLOW_80_in_isInOp705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal61_tree = 
                    (Object)adaptor.create(char_literal61)
                    ;
                    adaptor.addChild(root_0, char_literal61_tree);
                    }
                    dbg.location(124,34);
                    pushFollow(FOLLOW_stringBag_in_isInOp707);
                    stringBag62=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag62.getTree());
                    dbg.location(124,44);
                    char_literal63=(Token)match(input,81,FOLLOW_81_in_isInOp709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = 
                    (Object)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:5: anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(125,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp715);
                    anyUriExpr64=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr64.getTree());
                    dbg.location(125,16);
                    char_literal65=(Token)match(input,83,FOLLOW_83_in_isInOp717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = 
                    (Object)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);
                    }
                    dbg.location(125,28);
                    ISIN_TOK66=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK66_tree = 
                    (Object)adaptor.create(ISIN_TOK66)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK66_tree, root_0);
                    }
                    dbg.location(125,30);
                    char_literal67=(Token)match(input,80,FOLLOW_80_in_isInOp722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal67_tree = 
                    (Object)adaptor.create(char_literal67)
                    ;
                    adaptor.addChild(root_0, char_literal67_tree);
                    }
                    dbg.location(125,34);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp724);
                    anyUriBag68=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag68.getTree());
                    dbg.location(125,44);
                    char_literal69=(Token)match(input,81,FOLLOW_81_in_isInOp726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal69_tree = 
                    (Object)adaptor.create(char_literal69)
                    ;
                    adaptor.addChild(root_0, char_literal69_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:5: dateExpr '.' ISIN_TOK ^ '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(126,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp732);
                    dateExpr70=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr70.getTree());
                    dbg.location(126,14);
                    char_literal71=(Token)match(input,83,FOLLOW_83_in_isInOp734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);
                    }
                    dbg.location(126,26);
                    ISIN_TOK72=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK72_tree = 
                    (Object)adaptor.create(ISIN_TOK72)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK72_tree, root_0);
                    }
                    dbg.location(126,28);
                    char_literal73=(Token)match(input,80,FOLLOW_80_in_isInOp739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);
                    }
                    dbg.location(126,32);
                    pushFollow(FOLLOW_dateBag_in_isInOp741);
                    dateBag74=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag74.getTree());
                    dbg.location(126,40);
                    char_literal75=(Token)match(input,81,FOLLOW_81_in_isInOp743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:127:5: timeExpr '.' ISIN_TOK ^ '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(127,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp749);
                    timeExpr76=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr76.getTree());
                    dbg.location(127,14);
                    char_literal77=(Token)match(input,83,FOLLOW_83_in_isInOp751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = 
                    (Object)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    dbg.location(127,26);
                    ISIN_TOK78=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK78_tree = 
                    (Object)adaptor.create(ISIN_TOK78)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK78_tree, root_0);
                    }
                    dbg.location(127,28);
                    char_literal79=(Token)match(input,80,FOLLOW_80_in_isInOp756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal79_tree = 
                    (Object)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);
                    }
                    dbg.location(127,32);
                    pushFollow(FOLLOW_timeBag_in_isInOp758);
                    timeBag80=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag80.getTree());
                    dbg.location(127,40);
                    char_literal81=(Token)match(input,81,FOLLOW_81_in_isInOp760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal81_tree = 
                    (Object)adaptor.create(char_literal81)
                    ;
                    adaptor.addChild(root_0, char_literal81_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:5: dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(128,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp766);
                    dateTimeExpr82=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr82.getTree());
                    dbg.location(128,18);
                    char_literal83=(Token)match(input,83,FOLLOW_83_in_isInOp768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);
                    }
                    dbg.location(128,30);
                    ISIN_TOK84=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK84_tree = 
                    (Object)adaptor.create(ISIN_TOK84)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK84_tree, root_0);
                    }
                    dbg.location(128,32);
                    char_literal85=(Token)match(input,80,FOLLOW_80_in_isInOp773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);
                    }
                    dbg.location(128,36);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp775);
                    dateTimeBag86=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag86.getTree());
                    dbg.location(128,48);
                    char_literal87=(Token)match(input,81,FOLLOW_81_in_isInOp777); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:5: base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(129,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp783);
                    base64BinaryExpr88=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr88.getTree());
                    dbg.location(129,22);
                    char_literal89=(Token)match(input,83,FOLLOW_83_in_isInOp785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);
                    }
                    dbg.location(129,34);
                    ISIN_TOK90=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK90_tree = 
                    (Object)adaptor.create(ISIN_TOK90)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK90_tree, root_0);
                    }
                    dbg.location(129,36);
                    char_literal91=(Token)match(input,80,FOLLOW_80_in_isInOp790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
                    }
                    dbg.location(129,40);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp792);
                    base64BinaryBag92=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag92.getTree());
                    dbg.location(129,56);
                    char_literal93=(Token)match(input,81,FOLLOW_81_in_isInOp794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    adaptor.addChild(root_0, char_literal93_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:5: dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(130,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp800);
                    dayTimeDurationExpr94=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr94.getTree());
                    dbg.location(130,25);
                    char_literal95=(Token)match(input,83,FOLLOW_83_in_isInOp802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal95_tree = 
                    (Object)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);
                    }
                    dbg.location(130,37);
                    ISIN_TOK96=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK96_tree = 
                    (Object)adaptor.create(ISIN_TOK96)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK96_tree, root_0);
                    }
                    dbg.location(130,39);
                    char_literal97=(Token)match(input,80,FOLLOW_80_in_isInOp807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);
                    }
                    dbg.location(130,43);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp809);
                    dayTimeDurationBag98=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag98.getTree());
                    dbg.location(130,62);
                    char_literal99=(Token)match(input,81,FOLLOW_81_in_isInOp811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = 
                    (Object)adaptor.create(char_literal99)
                    ;
                    adaptor.addChild(root_0, char_literal99_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:131:5: yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(131,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp817);
                    yearMonthDurationExpr100=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr100.getTree());
                    dbg.location(131,27);
                    char_literal101=(Token)match(input,83,FOLLOW_83_in_isInOp819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = 
                    (Object)adaptor.create(char_literal101)
                    ;
                    adaptor.addChild(root_0, char_literal101_tree);
                    }
                    dbg.location(131,39);
                    ISIN_TOK102=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK102_tree = 
                    (Object)adaptor.create(ISIN_TOK102)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK102_tree, root_0);
                    }
                    dbg.location(131,41);
                    char_literal103=(Token)match(input,80,FOLLOW_80_in_isInOp824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);
                    }
                    dbg.location(131,45);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp826);
                    yearMonthDurationBag104=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag104.getTree());
                    dbg.location(131,66);
                    char_literal105=(Token)match(input,81,FOLLOW_81_in_isInOp828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal105_tree = 
                    (Object)adaptor.create(char_literal105)
                    ;
                    adaptor.addChild(root_0, char_literal105_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:5: x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(132,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp834);
                    x500NameExpr106=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr106.getTree());
                    dbg.location(132,18);
                    char_literal107=(Token)match(input,83,FOLLOW_83_in_isInOp836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = 
                    (Object)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);
                    }
                    dbg.location(132,30);
                    ISIN_TOK108=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK108_tree = 
                    (Object)adaptor.create(ISIN_TOK108)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK108_tree, root_0);
                    }
                    dbg.location(132,32);
                    char_literal109=(Token)match(input,80,FOLLOW_80_in_isInOp841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);
                    }
                    dbg.location(132,36);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp843);
                    x500NameBag110=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag110.getTree());
                    dbg.location(132,48);
                    char_literal111=(Token)match(input,81,FOLLOW_81_in_isInOp845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal111_tree = 
                    (Object)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:133:5: rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(133,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp851);
                    rfc822NameExpr112=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr112.getTree());
                    dbg.location(133,20);
                    char_literal113=(Token)match(input,83,FOLLOW_83_in_isInOp853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);
                    }
                    dbg.location(133,32);
                    ISIN_TOK114=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK114_tree = 
                    (Object)adaptor.create(ISIN_TOK114)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK114_tree, root_0);
                    }
                    dbg.location(133,34);
                    char_literal115=(Token)match(input,80,FOLLOW_80_in_isInOp858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = 
                    (Object)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    dbg.location(133,38);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp860);
                    rfc822NameBag116=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag116.getTree());
                    dbg.location(133,52);
                    char_literal117=(Token)match(input,81,FOLLOW_81_in_isInOp862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = 
                    (Object)adaptor.create(char_literal117)
                    ;
                    adaptor.addChild(root_0, char_literal117_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:5: hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(134,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp868);
                    hexBinaryExpr118=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr118.getTree());
                    dbg.location(134,19);
                    char_literal119=(Token)match(input,83,FOLLOW_83_in_isInOp870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal119_tree = 
                    (Object)adaptor.create(char_literal119)
                    ;
                    adaptor.addChild(root_0, char_literal119_tree);
                    }
                    dbg.location(134,31);
                    ISIN_TOK120=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK120_tree = 
                    (Object)adaptor.create(ISIN_TOK120)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK120_tree, root_0);
                    }
                    dbg.location(134,33);
                    char_literal121=(Token)match(input,80,FOLLOW_80_in_isInOp875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);
                    }
                    dbg.location(134,37);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp877);
                    hexBinaryBag122=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag122.getTree());
                    dbg.location(134,50);
                    char_literal123=(Token)match(input,81,FOLLOW_81_in_isInOp879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal123_tree = 
                    (Object)adaptor.create(char_literal123)
                    ;
                    adaptor.addChild(root_0, char_literal123_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(135,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp891);
                    base64BinaryExpr124=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr124.getTree());
                    dbg.location(135,44);
                    char_literal125=(Token)match(input,83,FOLLOW_83_in_isInOp893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal125_tree = 
                    (Object)adaptor.create(char_literal125)
                    ;
                    adaptor.addChild(root_0, char_literal125_tree);
                    }
                    dbg.location(135,56);
                    ISIN_TOK126=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK126_tree = 
                    (Object)adaptor.create(ISIN_TOK126)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK126_tree, root_0);
                    }
                    dbg.location(135,58);
                    char_literal127=(Token)match(input,80,FOLLOW_80_in_isInOp898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = 
                    (Object)adaptor.create(char_literal127)
                    ;
                    adaptor.addChild(root_0, char_literal127_tree);
                    }
                    dbg.location(135,62);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp900);
                    base64BinaryBag128=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag128.getTree());
                    dbg.location(135,78);
                    char_literal129=(Token)match(input,81,FOLLOW_81_in_isInOp902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal129_tree = 
                    (Object)adaptor.create(char_literal129)
                    ;
                    adaptor.addChild(root_0, char_literal129_tree);
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
        dbg.location(136, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set131=null;
        Token set134=null;
        Token set137=null;
        Token set140=null;
        Token set143=null;
        Token set146=null;
        Token set149=null;
        Token set152=null;
        Token set155=null;
        Token set158=null;
        Token set161=null;
        Token set164=null;
        GrammarParser.integerExpr_return integerExpr130 =null;

        GrammarParser.integerExpr_return integerExpr132 =null;

        GrammarParser.doubleExpr_return doubleExpr133 =null;

        GrammarParser.doubleExpr_return doubleExpr135 =null;

        GrammarParser.stringExpr_return stringExpr136 =null;

        GrammarParser.stringExpr_return stringExpr138 =null;

        GrammarParser.anyUriExpr_return anyUriExpr139 =null;

        GrammarParser.anyUriExpr_return anyUriExpr141 =null;

        GrammarParser.dateExpr_return dateExpr142 =null;

        GrammarParser.dateExpr_return dateExpr144 =null;

        GrammarParser.timeExpr_return timeExpr145 =null;

        GrammarParser.timeExpr_return timeExpr147 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr148 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr150 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr151 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr153 =null;

        GrammarParser.x500NameExpr_return x500NameExpr154 =null;

        GrammarParser.x500NameExpr_return x500NameExpr156 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr157 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr159 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr160 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr162 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr163 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr165 =null;


        Object set131_tree=null;
        Object set134_tree=null;
        Object set137_tree=null;
        Object set140_tree=null;
        Object set143_tree=null;
        Object set146_tree=null;
        Object set149_tree=null;
        Object set152_tree=null;
        Object set155_tree=null;
        Object set158_tree=null;
        Object set161_tree=null;
        Object set164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr913);
                    integerExpr130=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr130.getTree());
                    dbg.location(139,16);
                    set131=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set131)
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

                    dbg.location(139,51);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr937);
                    integerExpr132=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr132.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr942);
                    doubleExpr133=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr133.getTree());
                    dbg.location(140,15);
                    set134=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set134)
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

                    dbg.location(140,50);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr966);
                    doubleExpr135=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr135.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr971);
                    stringExpr136=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr136.getTree());
                    dbg.location(141,15);
                    set137=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set137)
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

                    dbg.location(141,50);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr995);
                    stringExpr138=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr138.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(142,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1000);
                    anyUriExpr139=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr139.getTree());
                    dbg.location(142,15);
                    set140=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set140)
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

                    dbg.location(142,50);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1024);
                    anyUriExpr141=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr141.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:143:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(143,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1029);
                    dateExpr142=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr142.getTree());
                    dbg.location(143,13);
                    set143=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set143)
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

                    dbg.location(143,48);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1053);
                    dateExpr144=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr144.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(144,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1058);
                    timeExpr145=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr145.getTree());
                    dbg.location(144,13);
                    set146=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set146)
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

                    dbg.location(144,48);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1082);
                    timeExpr147=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr147.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1087);
                    dateTimeExpr148=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr148.getTree());
                    dbg.location(145,17);
                    set149=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set149)
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

                    dbg.location(145,52);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1111);
                    dateTimeExpr150=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr150.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1116);
                    yearMonthDurationExpr151=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr151.getTree());
                    dbg.location(146,26);
                    set152=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set152)
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

                    dbg.location(146,61);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1140);
                    yearMonthDurationExpr153=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr153.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(147,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1145);
                    x500NameExpr154=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr154.getTree());
                    dbg.location(147,17);
                    set155=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set155)
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

                    dbg.location(147,52);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1169);
                    x500NameExpr156=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr156.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:148:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(148,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1174);
                    rfc822NameExpr157=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr157.getTree());
                    dbg.location(148,19);
                    set158=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set158)
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

                    dbg.location(148,55);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1199);
                    rfc822NameExpr159=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr159.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:4: ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(149,29);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1210);
                    dayTimeDurationExpr160=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr160.getTree());
                    dbg.location(149,49);
                    set161=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set161)
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

                    dbg.location(149,84);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1234);
                    dayTimeDurationExpr162=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr162.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:4: ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(150,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1245);
                    base64BinaryExpr163=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr163.getTree());
                    dbg.location(150,43);
                    set164=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set164)
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

                    dbg.location(150,78);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1269);
                    base64BinaryExpr165=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr165.getTree());

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
        dbg.location(151, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal167=null;
        Token REGEXMATCH_TOK168=null;
        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token REGEXMATCH_TOK174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token REGEXMATCH_TOK180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal185=null;
        Token REGEXMATCH_TOK186=null;
        Token char_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        Token REGEXMATCH_TOK192=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token char_literal197=null;
        Token REGEXMATCH_TOK198=null;
        Token char_literal199=null;
        Token char_literal201=null;
        Token char_literal203=null;
        Token REGEXMATCH_TOK204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        Token char_literal209=null;
        Token REGEXMATCH_TOK210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        Token char_literal215=null;
        Token REGEXMATCH_TOK216=null;
        Token char_literal217=null;
        Token char_literal219=null;
        Token char_literal221=null;
        Token REGEXMATCH_TOK222=null;
        Token char_literal223=null;
        Token char_literal225=null;
        Token char_literal227=null;
        Token REGEXMATCH_TOK228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token char_literal233=null;
        Token REGEXMATCH_TOK234=null;
        Token char_literal235=null;
        Token char_literal237=null;
        GrammarParser.integerExpr_return integerExpr166 =null;

        GrammarParser.integerExpr_return integerExpr170 =null;

        GrammarParser.doubleExpr_return doubleExpr172 =null;

        GrammarParser.doubleExpr_return doubleExpr176 =null;

        GrammarParser.stringExpr_return stringExpr178 =null;

        GrammarParser.stringExpr_return stringExpr182 =null;

        GrammarParser.anyUriExpr_return anyUriExpr184 =null;

        GrammarParser.anyUriExpr_return anyUriExpr188 =null;

        GrammarParser.dateExpr_return dateExpr190 =null;

        GrammarParser.dateExpr_return dateExpr194 =null;

        GrammarParser.timeExpr_return timeExpr196 =null;

        GrammarParser.timeExpr_return timeExpr200 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr202 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr206 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr208 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr212 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr214 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr218 =null;

        GrammarParser.x500NameExpr_return x500NameExpr220 =null;

        GrammarParser.x500NameExpr_return x500NameExpr224 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr226 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr230 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr232 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr236 =null;


        Object char_literal167_tree=null;
        Object REGEXMATCH_TOK168_tree=null;
        Object char_literal169_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object REGEXMATCH_TOK174_tree=null;
        Object char_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object REGEXMATCH_TOK180_tree=null;
        Object char_literal181_tree=null;
        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        Object REGEXMATCH_TOK186_tree=null;
        Object char_literal187_tree=null;
        Object char_literal189_tree=null;
        Object char_literal191_tree=null;
        Object REGEXMATCH_TOK192_tree=null;
        Object char_literal193_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;
        Object REGEXMATCH_TOK198_tree=null;
        Object char_literal199_tree=null;
        Object char_literal201_tree=null;
        Object char_literal203_tree=null;
        Object REGEXMATCH_TOK204_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;
        Object char_literal209_tree=null;
        Object REGEXMATCH_TOK210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal213_tree=null;
        Object char_literal215_tree=null;
        Object REGEXMATCH_TOK216_tree=null;
        Object char_literal217_tree=null;
        Object char_literal219_tree=null;
        Object char_literal221_tree=null;
        Object REGEXMATCH_TOK222_tree=null;
        Object char_literal223_tree=null;
        Object char_literal225_tree=null;
        Object char_literal227_tree=null;
        Object REGEXMATCH_TOK228_tree=null;
        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        Object char_literal233_tree=null;
        Object REGEXMATCH_TOK234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal237_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:2: ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:4: integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(154,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1281);
                    integerExpr166=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr166.getTree());
                    dbg.location(154,17);
                    char_literal167=(Token)match(input,83,FOLLOW_83_in_regexOp1284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal167_tree = 
                    (Object)adaptor.create(char_literal167)
                    ;
                    adaptor.addChild(root_0, char_literal167_tree);
                    }
                    dbg.location(154,21);
                    REGEXMATCH_TOK168=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1286); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK168_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK168)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK168_tree);
                    }
                    dbg.location(154,36);
                    char_literal169=(Token)match(input,80,FOLLOW_80_in_regexOp1288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = 
                    (Object)adaptor.create(char_literal169)
                    ;
                    adaptor.addChild(root_0, char_literal169_tree);
                    }
                    dbg.location(154,40);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1290);
                    integerExpr170=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr170.getTree());
                    dbg.location(154,52);
                    char_literal171=(Token)match(input,81,FOLLOW_81_in_regexOp1292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal171_tree = 
                    (Object)adaptor.create(char_literal171)
                    ;
                    adaptor.addChild(root_0, char_literal171_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:4: doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(155,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1297);
                    doubleExpr172=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr172.getTree());
                    dbg.location(155,15);
                    char_literal173=(Token)match(input,83,FOLLOW_83_in_regexOp1299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);
                    }
                    dbg.location(155,19);
                    REGEXMATCH_TOK174=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK174_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK174)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK174_tree);
                    }
                    dbg.location(155,34);
                    char_literal175=(Token)match(input,80,FOLLOW_80_in_regexOp1303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = 
                    (Object)adaptor.create(char_literal175)
                    ;
                    adaptor.addChild(root_0, char_literal175_tree);
                    }
                    dbg.location(155,38);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1305);
                    doubleExpr176=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr176.getTree());
                    dbg.location(155,49);
                    char_literal177=(Token)match(input,81,FOLLOW_81_in_regexOp1307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal177_tree = 
                    (Object)adaptor.create(char_literal177)
                    ;
                    adaptor.addChild(root_0, char_literal177_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:4: stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(156,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1312);
                    stringExpr178=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr178.getTree());
                    dbg.location(156,15);
                    char_literal179=(Token)match(input,83,FOLLOW_83_in_regexOp1314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal179_tree = 
                    (Object)adaptor.create(char_literal179)
                    ;
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    dbg.location(156,19);
                    REGEXMATCH_TOK180=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK180_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK180)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK180_tree);
                    }
                    dbg.location(156,34);
                    char_literal181=(Token)match(input,80,FOLLOW_80_in_regexOp1318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal181_tree = 
                    (Object)adaptor.create(char_literal181)
                    ;
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    dbg.location(156,38);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1320);
                    stringExpr182=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr182.getTree());
                    dbg.location(156,49);
                    char_literal183=(Token)match(input,81,FOLLOW_81_in_regexOp1322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal183_tree = 
                    (Object)adaptor.create(char_literal183)
                    ;
                    adaptor.addChild(root_0, char_literal183_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:4: anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(157,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1327);
                    anyUriExpr184=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr184.getTree());
                    dbg.location(157,15);
                    char_literal185=(Token)match(input,83,FOLLOW_83_in_regexOp1329); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal185_tree = 
                    (Object)adaptor.create(char_literal185)
                    ;
                    adaptor.addChild(root_0, char_literal185_tree);
                    }
                    dbg.location(157,19);
                    REGEXMATCH_TOK186=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK186_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK186)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK186_tree);
                    }
                    dbg.location(157,34);
                    char_literal187=(Token)match(input,80,FOLLOW_80_in_regexOp1333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal187_tree = 
                    (Object)adaptor.create(char_literal187)
                    ;
                    adaptor.addChild(root_0, char_literal187_tree);
                    }
                    dbg.location(157,38);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1335);
                    anyUriExpr188=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr188.getTree());
                    dbg.location(157,49);
                    char_literal189=(Token)match(input,81,FOLLOW_81_in_regexOp1337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal189_tree = 
                    (Object)adaptor.create(char_literal189)
                    ;
                    adaptor.addChild(root_0, char_literal189_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:158:4: dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(158,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1342);
                    dateExpr190=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr190.getTree());
                    dbg.location(158,13);
                    char_literal191=(Token)match(input,83,FOLLOW_83_in_regexOp1344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal191_tree = 
                    (Object)adaptor.create(char_literal191)
                    ;
                    adaptor.addChild(root_0, char_literal191_tree);
                    }
                    dbg.location(158,17);
                    REGEXMATCH_TOK192=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK192_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK192)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK192_tree);
                    }
                    dbg.location(158,32);
                    char_literal193=(Token)match(input,80,FOLLOW_80_in_regexOp1348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal193_tree = 
                    (Object)adaptor.create(char_literal193)
                    ;
                    adaptor.addChild(root_0, char_literal193_tree);
                    }
                    dbg.location(158,36);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1350);
                    dateExpr194=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr194.getTree());
                    dbg.location(158,45);
                    char_literal195=(Token)match(input,81,FOLLOW_81_in_regexOp1352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal195_tree = 
                    (Object)adaptor.create(char_literal195)
                    ;
                    adaptor.addChild(root_0, char_literal195_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:159:4: timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(159,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1357);
                    timeExpr196=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr196.getTree());
                    dbg.location(159,13);
                    char_literal197=(Token)match(input,83,FOLLOW_83_in_regexOp1359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }
                    dbg.location(159,17);
                    REGEXMATCH_TOK198=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK198_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK198)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK198_tree);
                    }
                    dbg.location(159,32);
                    char_literal199=(Token)match(input,80,FOLLOW_80_in_regexOp1363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal199_tree = 
                    (Object)adaptor.create(char_literal199)
                    ;
                    adaptor.addChild(root_0, char_literal199_tree);
                    }
                    dbg.location(159,36);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1365);
                    timeExpr200=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr200.getTree());
                    dbg.location(159,45);
                    char_literal201=(Token)match(input,81,FOLLOW_81_in_regexOp1367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal201_tree = 
                    (Object)adaptor.create(char_literal201)
                    ;
                    adaptor.addChild(root_0, char_literal201_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:4: dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(160,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1372);
                    dateTimeExpr202=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr202.getTree());
                    dbg.location(160,17);
                    char_literal203=(Token)match(input,83,FOLLOW_83_in_regexOp1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal203_tree = 
                    (Object)adaptor.create(char_literal203)
                    ;
                    adaptor.addChild(root_0, char_literal203_tree);
                    }
                    dbg.location(160,21);
                    REGEXMATCH_TOK204=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1376); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK204_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK204)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK204_tree);
                    }
                    dbg.location(160,36);
                    char_literal205=(Token)match(input,80,FOLLOW_80_in_regexOp1378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal205_tree = 
                    (Object)adaptor.create(char_literal205)
                    ;
                    adaptor.addChild(root_0, char_literal205_tree);
                    }
                    dbg.location(160,40);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1380);
                    dateTimeExpr206=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr206.getTree());
                    dbg.location(160,53);
                    char_literal207=(Token)match(input,81,FOLLOW_81_in_regexOp1382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal207_tree = 
                    (Object)adaptor.create(char_literal207)
                    ;
                    adaptor.addChild(root_0, char_literal207_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:4: dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(161,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1387);
                    dayTimeDurationExpr208=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr208.getTree());
                    dbg.location(161,24);
                    char_literal209=(Token)match(input,83,FOLLOW_83_in_regexOp1389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal209_tree = 
                    (Object)adaptor.create(char_literal209)
                    ;
                    adaptor.addChild(root_0, char_literal209_tree);
                    }
                    dbg.location(161,28);
                    REGEXMATCH_TOK210=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK210_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK210)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK210_tree);
                    }
                    dbg.location(161,43);
                    char_literal211=(Token)match(input,80,FOLLOW_80_in_regexOp1393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal211_tree = 
                    (Object)adaptor.create(char_literal211)
                    ;
                    adaptor.addChild(root_0, char_literal211_tree);
                    }
                    dbg.location(161,47);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1395);
                    dayTimeDurationExpr212=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr212.getTree());
                    dbg.location(161,67);
                    char_literal213=(Token)match(input,81,FOLLOW_81_in_regexOp1397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal213_tree = 
                    (Object)adaptor.create(char_literal213)
                    ;
                    adaptor.addChild(root_0, char_literal213_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:4: yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(162,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1402);
                    yearMonthDurationExpr214=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr214.getTree());
                    dbg.location(162,26);
                    char_literal215=(Token)match(input,83,FOLLOW_83_in_regexOp1404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal215_tree = 
                    (Object)adaptor.create(char_literal215)
                    ;
                    adaptor.addChild(root_0, char_literal215_tree);
                    }
                    dbg.location(162,30);
                    REGEXMATCH_TOK216=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK216_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK216)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK216_tree);
                    }
                    dbg.location(162,45);
                    char_literal217=(Token)match(input,80,FOLLOW_80_in_regexOp1408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal217_tree = 
                    (Object)adaptor.create(char_literal217)
                    ;
                    adaptor.addChild(root_0, char_literal217_tree);
                    }
                    dbg.location(162,49);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1410);
                    yearMonthDurationExpr218=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr218.getTree());
                    dbg.location(162,71);
                    char_literal219=(Token)match(input,81,FOLLOW_81_in_regexOp1412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal219_tree = 
                    (Object)adaptor.create(char_literal219)
                    ;
                    adaptor.addChild(root_0, char_literal219_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:4: x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(163,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1417);
                    x500NameExpr220=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr220.getTree());
                    dbg.location(163,17);
                    char_literal221=(Token)match(input,83,FOLLOW_83_in_regexOp1419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal221_tree = 
                    (Object)adaptor.create(char_literal221)
                    ;
                    adaptor.addChild(root_0, char_literal221_tree);
                    }
                    dbg.location(163,21);
                    REGEXMATCH_TOK222=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK222_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK222)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK222_tree);
                    }
                    dbg.location(163,36);
                    char_literal223=(Token)match(input,80,FOLLOW_80_in_regexOp1423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal223_tree = 
                    (Object)adaptor.create(char_literal223)
                    ;
                    adaptor.addChild(root_0, char_literal223_tree);
                    }
                    dbg.location(163,40);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1425);
                    x500NameExpr224=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr224.getTree());
                    dbg.location(163,53);
                    char_literal225=(Token)match(input,81,FOLLOW_81_in_regexOp1427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal225_tree = 
                    (Object)adaptor.create(char_literal225)
                    ;
                    adaptor.addChild(root_0, char_literal225_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:4: rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(164,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1432);
                    rfc822NameExpr226=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr226.getTree());
                    dbg.location(164,19);
                    char_literal227=(Token)match(input,83,FOLLOW_83_in_regexOp1434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal227_tree = 
                    (Object)adaptor.create(char_literal227)
                    ;
                    adaptor.addChild(root_0, char_literal227_tree);
                    }
                    dbg.location(164,23);
                    REGEXMATCH_TOK228=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK228_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK228)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK228_tree);
                    }
                    dbg.location(164,38);
                    char_literal229=(Token)match(input,80,FOLLOW_80_in_regexOp1438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal229_tree = 
                    (Object)adaptor.create(char_literal229)
                    ;
                    adaptor.addChild(root_0, char_literal229_tree);
                    }
                    dbg.location(164,42);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1440);
                    rfc822NameExpr230=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr230.getTree());
                    dbg.location(164,57);
                    char_literal231=(Token)match(input,81,FOLLOW_81_in_regexOp1442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal231_tree = 
                    (Object)adaptor.create(char_literal231)
                    ;
                    adaptor.addChild(root_0, char_literal231_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:4: ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1453);
                    base64BinaryExpr232=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr232.getTree());
                    dbg.location(165,43);
                    char_literal233=(Token)match(input,83,FOLLOW_83_in_regexOp1455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = 
                    (Object)adaptor.create(char_literal233)
                    ;
                    adaptor.addChild(root_0, char_literal233_tree);
                    }
                    dbg.location(165,47);
                    REGEXMATCH_TOK234=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK234_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK234)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK234_tree);
                    }
                    dbg.location(165,62);
                    char_literal235=(Token)match(input,80,FOLLOW_80_in_regexOp1459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal235_tree = 
                    (Object)adaptor.create(char_literal235)
                    ;
                    adaptor.addChild(root_0, char_literal235_tree);
                    }
                    dbg.location(165,66);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1461);
                    base64BinaryExpr236=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr236.getTree());
                    dbg.location(165,83);
                    char_literal237=(Token)match(input,81,FOLLOW_81_in_regexOp1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);
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
        dbg.location(166, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:1: bagOp : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' );
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal239=null;
        Token set240=null;
        Token char_literal241=null;
        Token char_literal243=null;
        Token char_literal245=null;
        Token set246=null;
        Token char_literal247=null;
        Token char_literal249=null;
        Token char_literal251=null;
        Token set252=null;
        Token char_literal253=null;
        Token char_literal255=null;
        Token char_literal257=null;
        Token set258=null;
        Token char_literal259=null;
        Token char_literal261=null;
        Token char_literal263=null;
        Token set264=null;
        Token char_literal265=null;
        Token char_literal267=null;
        Token char_literal269=null;
        Token set270=null;
        Token char_literal271=null;
        Token char_literal273=null;
        Token char_literal275=null;
        Token set276=null;
        Token char_literal277=null;
        Token char_literal279=null;
        Token char_literal281=null;
        Token set282=null;
        Token char_literal283=null;
        Token char_literal285=null;
        Token char_literal287=null;
        Token set288=null;
        Token char_literal289=null;
        Token char_literal291=null;
        Token char_literal293=null;
        Token set294=null;
        Token char_literal295=null;
        Token char_literal297=null;
        Token char_literal299=null;
        Token set300=null;
        Token char_literal301=null;
        Token char_literal303=null;
        Token char_literal305=null;
        Token set306=null;
        Token char_literal307=null;
        Token char_literal309=null;
        Token char_literal311=null;
        Token set312=null;
        Token char_literal313=null;
        Token char_literal315=null;
        Token char_literal317=null;
        Token set318=null;
        Token char_literal319=null;
        Token char_literal321=null;
        Token char_literal323=null;
        Token set324=null;
        Token char_literal325=null;
        Token char_literal327=null;
        GrammarParser.booleanBag_return booleanBag238 =null;

        GrammarParser.booleanBag_return booleanBag242 =null;

        GrammarParser.integerBag_return integerBag244 =null;

        GrammarParser.integerBag_return integerBag248 =null;

        GrammarParser.doubleBag_return doubleBag250 =null;

        GrammarParser.doubleBag_return doubleBag254 =null;

        GrammarParser.stringBag_return stringBag256 =null;

        GrammarParser.stringBag_return stringBag260 =null;

        GrammarParser.dateBag_return dateBag262 =null;

        GrammarParser.dateBag_return dateBag266 =null;

        GrammarParser.timeBag_return timeBag268 =null;

        GrammarParser.timeBag_return timeBag272 =null;

        GrammarParser.dateTimeBag_return dateTimeBag274 =null;

        GrammarParser.dateTimeBag_return dateTimeBag278 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag280 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag284 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag286 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag290 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag292 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag296 =null;

        GrammarParser.anyUriBag_return anyUriBag298 =null;

        GrammarParser.anyUriBag_return anyUriBag302 =null;

        GrammarParser.x500NameBag_return x500NameBag304 =null;

        GrammarParser.x500NameBag_return x500NameBag308 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag310 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag314 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag316 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag320 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag322 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag326 =null;


        Object char_literal239_tree=null;
        Object set240_tree=null;
        Object char_literal241_tree=null;
        Object char_literal243_tree=null;
        Object char_literal245_tree=null;
        Object set246_tree=null;
        Object char_literal247_tree=null;
        Object char_literal249_tree=null;
        Object char_literal251_tree=null;
        Object set252_tree=null;
        Object char_literal253_tree=null;
        Object char_literal255_tree=null;
        Object char_literal257_tree=null;
        Object set258_tree=null;
        Object char_literal259_tree=null;
        Object char_literal261_tree=null;
        Object char_literal263_tree=null;
        Object set264_tree=null;
        Object char_literal265_tree=null;
        Object char_literal267_tree=null;
        Object char_literal269_tree=null;
        Object set270_tree=null;
        Object char_literal271_tree=null;
        Object char_literal273_tree=null;
        Object char_literal275_tree=null;
        Object set276_tree=null;
        Object char_literal277_tree=null;
        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object set282_tree=null;
        Object char_literal283_tree=null;
        Object char_literal285_tree=null;
        Object char_literal287_tree=null;
        Object set288_tree=null;
        Object char_literal289_tree=null;
        Object char_literal291_tree=null;
        Object char_literal293_tree=null;
        Object set294_tree=null;
        Object char_literal295_tree=null;
        Object char_literal297_tree=null;
        Object char_literal299_tree=null;
        Object set300_tree=null;
        Object char_literal301_tree=null;
        Object char_literal303_tree=null;
        Object char_literal305_tree=null;
        Object set306_tree=null;
        Object char_literal307_tree=null;
        Object char_literal309_tree=null;
        Object char_literal311_tree=null;
        Object set312_tree=null;
        Object char_literal313_tree=null;
        Object char_literal315_tree=null;
        Object char_literal317_tree=null;
        Object set318_tree=null;
        Object char_literal319_tree=null;
        Object char_literal321_tree=null;
        Object char_literal323_tree=null;
        Object set324_tree=null;
        Object char_literal325_tree=null;
        Object char_literal327_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' )
            int alt12=15;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN_TOK) && (synpred7_Grammar())) {
                alt12=1;
            }
            else if ( (LA12_0==INTEGER_TOK) && (synpred8_Grammar())) {
                alt12=2;
            }
            else if ( (LA12_0==INTERSECTION_TOK||LA12_0==UNION_TOK) && (synpred8_Grammar())) {
                alt12=2;
            }
            else if ( (LA12_0==DOUBLE_TOK) && (synpred9_Grammar())) {
                alt12=3;
            }
            else if ( (LA12_0==STRING_TOK) && (synpred10_Grammar())) {
                alt12=4;
            }
            else if ( (LA12_0==DATE_TOK) && (synpred11_Grammar())) {
                alt12=5;
            }
            else if ( (LA12_0==TIME_TOK) && (synpred12_Grammar())) {
                alt12=6;
            }
            else if ( (LA12_0==DATETIME_TOK) && (synpred13_Grammar())) {
                alt12=7;
            }
            else if ( (LA12_0==BASE64BINARY_TOK) ) {
                int LA12_9 = input.LA(2);

                if ( (LA12_9==STRING_CONSTANT_LIST) ) {
                    int LA12_16 = input.LA(3);

                    if ( (LA12_16==83) ) {
                        int LA12_17 = input.LA(4);

                        if ( (LA12_17==ATLEASTONEMENBEROF_TOK||LA12_17==SETEQUALS_TOK||LA12_17==SUBSET_TOK) ) {
                            int LA12_18 = input.LA(5);

                            if ( (LA12_18==80) ) {
                                int LA12_19 = input.LA(6);

                                if ( (LA12_19==BASE64BINARY_TOK) ) {
                                    int LA12_20 = input.LA(7);

                                    if ( (LA12_20==STRING_CONSTANT_LIST) ) {
                                        int LA12_21 = input.LA(8);

                                        if ( (LA12_21==81) ) {
                                            int LA12_22 = input.LA(9);

                                            if ( (synpred14_Grammar()) ) {
                                                alt12=8;
                                            }
                                            else if ( (synpred21_Grammar()) ) {
                                                alt12=15;
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
                            new NoViableAltException("", 12, 16, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA12_0==DAYTIMEDURATION_TOK) && (synpred15_Grammar())) {
                alt12=9;
            }
            else if ( (LA12_0==YEARMONTHDURATION_TOK) && (synpred16_Grammar())) {
                alt12=10;
            }
            else if ( (LA12_0==ANYURI_TOK) && (synpred17_Grammar())) {
                alt12=11;
            }
            else if ( (LA12_0==X500NAME_TOK) && (synpred18_Grammar())) {
                alt12=12;
            }
            else if ( (LA12_0==RFC822NAME_TOK) && (synpred19_Grammar())) {
                alt12=13;
            }
            else if ( (LA12_0==HEXBINARY_TOK) && (synpred20_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1480);
                    booleanBag238=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag238.getTree());
                    dbg.location(169,31);
                    char_literal239=(Token)match(input,83,FOLLOW_83_in_bagOp1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);
                    }
                    dbg.location(169,35);
                    set240=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set240)
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

                    dbg.location(169,91);
                    char_literal241=(Token)match(input,80,FOLLOW_80_in_bagOp1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }
                    dbg.location(169,95);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1500);
                    booleanBag242=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag242.getTree());
                    dbg.location(169,106);
                    char_literal243=(Token)match(input,81,FOLLOW_81_in_bagOp1502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = 
                    (Object)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1513);
                    integerBag244=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag244.getTree());
                    dbg.location(170,31);
                    char_literal245=(Token)match(input,83,FOLLOW_83_in_bagOp1515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal245_tree = 
                    (Object)adaptor.create(char_literal245)
                    ;
                    adaptor.addChild(root_0, char_literal245_tree);
                    }
                    dbg.location(170,35);
                    set246=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set246)
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

                    dbg.location(170,92);
                    char_literal247=(Token)match(input,80,FOLLOW_80_in_bagOp1532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal247_tree = 
                    (Object)adaptor.create(char_literal247)
                    ;
                    adaptor.addChild(root_0, char_literal247_tree);
                    }
                    dbg.location(170,97);
                    pushFollow(FOLLOW_integerBag_in_bagOp1535);
                    integerBag248=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag248.getTree());
                    dbg.location(170,108);
                    char_literal249=(Token)match(input,81,FOLLOW_81_in_bagOp1537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal249_tree = 
                    (Object)adaptor.create(char_literal249)
                    ;
                    adaptor.addChild(root_0, char_literal249_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1548);
                    doubleBag250=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag250.getTree());
                    dbg.location(171,29);
                    char_literal251=(Token)match(input,83,FOLLOW_83_in_bagOp1550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal251_tree = 
                    (Object)adaptor.create(char_literal251)
                    ;
                    adaptor.addChild(root_0, char_literal251_tree);
                    }
                    dbg.location(171,33);
                    set252=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set252)
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

                    dbg.location(171,90);
                    char_literal253=(Token)match(input,80,FOLLOW_80_in_bagOp1567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal253_tree = 
                    (Object)adaptor.create(char_literal253)
                    ;
                    adaptor.addChild(root_0, char_literal253_tree);
                    }
                    dbg.location(171,95);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1570);
                    doubleBag254=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag254.getTree());
                    dbg.location(171,105);
                    char_literal255=(Token)match(input,81,FOLLOW_81_in_bagOp1572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = 
                    (Object)adaptor.create(char_literal255)
                    ;
                    adaptor.addChild(root_0, char_literal255_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp1584);
                    stringBag256=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag256.getTree());
                    dbg.location(172,30);
                    char_literal257=(Token)match(input,83,FOLLOW_83_in_bagOp1586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = 
                    (Object)adaptor.create(char_literal257)
                    ;
                    adaptor.addChild(root_0, char_literal257_tree);
                    }
                    dbg.location(172,34);
                    set258=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set258)
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

                    dbg.location(172,91);
                    char_literal259=(Token)match(input,80,FOLLOW_80_in_bagOp1603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = 
                    (Object)adaptor.create(char_literal259)
                    ;
                    adaptor.addChild(root_0, char_literal259_tree);
                    }
                    dbg.location(172,96);
                    pushFollow(FOLLOW_stringBag_in_bagOp1606);
                    stringBag260=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag260.getTree());
                    dbg.location(172,106);
                    char_literal261=(Token)match(input,81,FOLLOW_81_in_bagOp1608); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = 
                    (Object)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp1620);
                    dateBag262=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag262.getTree());
                    dbg.location(173,26);
                    char_literal263=(Token)match(input,83,FOLLOW_83_in_bagOp1622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal263_tree = 
                    (Object)adaptor.create(char_literal263)
                    ;
                    adaptor.addChild(root_0, char_literal263_tree);
                    }
                    dbg.location(173,30);
                    set264=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set264)
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

                    dbg.location(173,87);
                    char_literal265=(Token)match(input,80,FOLLOW_80_in_bagOp1639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);
                    }
                    dbg.location(173,92);
                    pushFollow(FOLLOW_dateBag_in_bagOp1642);
                    dateBag266=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag266.getTree());
                    dbg.location(173,100);
                    char_literal267=(Token)match(input,81,FOLLOW_81_in_bagOp1644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp1656);
                    timeBag268=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag268.getTree());
                    dbg.location(174,26);
                    char_literal269=(Token)match(input,83,FOLLOW_83_in_bagOp1658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }
                    dbg.location(174,30);
                    set270=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set270)
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

                    dbg.location(174,87);
                    char_literal271=(Token)match(input,80,FOLLOW_80_in_bagOp1675); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (Object)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }
                    dbg.location(174,92);
                    pushFollow(FOLLOW_timeBag_in_bagOp1678);
                    timeBag272=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag272.getTree());
                    dbg.location(174,100);
                    char_literal273=(Token)match(input,81,FOLLOW_81_in_bagOp1680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal273_tree = 
                    (Object)adaptor.create(char_literal273)
                    ;
                    adaptor.addChild(root_0, char_literal273_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(175,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1692);
                    dateTimeBag274=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag274.getTree());
                    dbg.location(175,34);
                    char_literal275=(Token)match(input,83,FOLLOW_83_in_bagOp1694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal275_tree = 
                    (Object)adaptor.create(char_literal275)
                    ;
                    adaptor.addChild(root_0, char_literal275_tree);
                    }
                    dbg.location(175,38);
                    set276=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set276)
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

                    dbg.location(175,95);
                    char_literal277=(Token)match(input,80,FOLLOW_80_in_bagOp1711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = 
                    (Object)adaptor.create(char_literal277)
                    ;
                    adaptor.addChild(root_0, char_literal277_tree);
                    }
                    dbg.location(175,100);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1714);
                    dateTimeBag278=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag278.getTree());
                    dbg.location(175,112);
                    char_literal279=(Token)match(input,81,FOLLOW_81_in_bagOp1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal279_tree = 
                    (Object)adaptor.create(char_literal279)
                    ;
                    adaptor.addChild(root_0, char_literal279_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1728);
                    base64BinaryBag280=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag280.getTree());
                    dbg.location(176,42);
                    char_literal281=(Token)match(input,83,FOLLOW_83_in_bagOp1730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal281_tree = 
                    (Object)adaptor.create(char_literal281)
                    ;
                    adaptor.addChild(root_0, char_literal281_tree);
                    }
                    dbg.location(176,46);
                    set282=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set282)
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

                    dbg.location(176,103);
                    char_literal283=(Token)match(input,80,FOLLOW_80_in_bagOp1747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal283_tree = 
                    (Object)adaptor.create(char_literal283)
                    ;
                    adaptor.addChild(root_0, char_literal283_tree);
                    }
                    dbg.location(176,108);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1750);
                    base64BinaryBag284=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag284.getTree());
                    dbg.location(176,124);
                    char_literal285=(Token)match(input,81,FOLLOW_81_in_bagOp1752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal285_tree = 
                    (Object)adaptor.create(char_literal285)
                    ;
                    adaptor.addChild(root_0, char_literal285_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp1764);
                    dayTimeDurationBag286=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag286.getTree());
                    dbg.location(177,48);
                    char_literal287=(Token)match(input,83,FOLLOW_83_in_bagOp1766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal287_tree = 
                    (Object)adaptor.create(char_literal287)
                    ;
                    adaptor.addChild(root_0, char_literal287_tree);
                    }
                    dbg.location(177,52);
                    set288=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set288)
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

                    dbg.location(177,109);
                    char_literal289=(Token)match(input,80,FOLLOW_80_in_bagOp1783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal289_tree = 
                    (Object)adaptor.create(char_literal289)
                    ;
                    adaptor.addChild(root_0, char_literal289_tree);
                    }
                    dbg.location(177,114);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp1786);
                    dayTimeDurationBag290=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag290.getTree());
                    dbg.location(177,133);
                    char_literal291=(Token)match(input,81,FOLLOW_81_in_bagOp1788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal291_tree = 
                    (Object)adaptor.create(char_literal291)
                    ;
                    adaptor.addChild(root_0, char_literal291_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp1800);
                    yearMonthDurationBag292=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag292.getTree());
                    dbg.location(178,52);
                    char_literal293=(Token)match(input,83,FOLLOW_83_in_bagOp1802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal293_tree = 
                    (Object)adaptor.create(char_literal293)
                    ;
                    adaptor.addChild(root_0, char_literal293_tree);
                    }
                    dbg.location(178,56);
                    set294=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set294)
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

                    dbg.location(178,113);
                    char_literal295=(Token)match(input,80,FOLLOW_80_in_bagOp1819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);
                    }
                    dbg.location(178,118);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp1822);
                    yearMonthDurationBag296=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag296.getTree());
                    dbg.location(178,139);
                    char_literal297=(Token)match(input,81,FOLLOW_81_in_bagOp1824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = 
                    (Object)adaptor.create(char_literal297)
                    ;
                    adaptor.addChild(root_0, char_literal297_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp1836);
                    anyUriBag298=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag298.getTree());
                    dbg.location(179,30);
                    char_literal299=(Token)match(input,83,FOLLOW_83_in_bagOp1838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);
                    }
                    dbg.location(179,34);
                    set300=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set300)
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

                    dbg.location(179,91);
                    char_literal301=(Token)match(input,80,FOLLOW_80_in_bagOp1855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal301_tree = 
                    (Object)adaptor.create(char_literal301)
                    ;
                    adaptor.addChild(root_0, char_literal301_tree);
                    }
                    dbg.location(179,96);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp1858);
                    anyUriBag302=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag302.getTree());
                    dbg.location(179,106);
                    char_literal303=(Token)match(input,81,FOLLOW_81_in_bagOp1860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal303_tree = 
                    (Object)adaptor.create(char_literal303)
                    ;
                    adaptor.addChild(root_0, char_literal303_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp1872);
                    x500NameBag304=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag304.getTree());
                    dbg.location(180,34);
                    char_literal305=(Token)match(input,83,FOLLOW_83_in_bagOp1874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal305_tree = 
                    (Object)adaptor.create(char_literal305)
                    ;
                    adaptor.addChild(root_0, char_literal305_tree);
                    }
                    dbg.location(180,38);
                    set306=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set306)
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
                    char_literal307=(Token)match(input,80,FOLLOW_80_in_bagOp1891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = 
                    (Object)adaptor.create(char_literal307)
                    ;
                    adaptor.addChild(root_0, char_literal307_tree);
                    }
                    dbg.location(180,100);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp1894);
                    x500NameBag308=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag308.getTree());
                    dbg.location(180,112);
                    char_literal309=(Token)match(input,81,FOLLOW_81_in_bagOp1896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal309_tree = 
                    (Object)adaptor.create(char_literal309)
                    ;
                    adaptor.addChild(root_0, char_literal309_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp1908);
                    rfc822NameBag310=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag310.getTree());
                    dbg.location(181,38);
                    char_literal311=(Token)match(input,83,FOLLOW_83_in_bagOp1910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal311_tree = 
                    (Object)adaptor.create(char_literal311)
                    ;
                    adaptor.addChild(root_0, char_literal311_tree);
                    }
                    dbg.location(181,42);
                    set312=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set312)
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

                    dbg.location(181,99);
                    char_literal313=(Token)match(input,80,FOLLOW_80_in_bagOp1927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal313_tree = 
                    (Object)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);
                    }
                    dbg.location(181,104);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp1930);
                    rfc822NameBag314=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag314.getTree());
                    dbg.location(181,118);
                    char_literal315=(Token)match(input,81,FOLLOW_81_in_bagOp1932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal315_tree = 
                    (Object)adaptor.create(char_literal315)
                    ;
                    adaptor.addChild(root_0, char_literal315_tree);
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp1944);
                    hexBinaryBag316=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag316.getTree());
                    dbg.location(182,36);
                    char_literal317=(Token)match(input,83,FOLLOW_83_in_bagOp1946); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal317_tree = 
                    (Object)adaptor.create(char_literal317)
                    ;
                    adaptor.addChild(root_0, char_literal317_tree);
                    }
                    dbg.location(182,40);
                    set318=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set318)
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

                    dbg.location(182,97);
                    char_literal319=(Token)match(input,80,FOLLOW_80_in_bagOp1963); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal319_tree = 
                    (Object)adaptor.create(char_literal319)
                    ;
                    adaptor.addChild(root_0, char_literal319_tree);
                    }
                    dbg.location(182,102);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp1966);
                    hexBinaryBag320=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag320.getTree());
                    dbg.location(182,115);
                    char_literal321=(Token)match(input,81,FOLLOW_81_in_bagOp1968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal321_tree = 
                    (Object)adaptor.create(char_literal321)
                    ;
                    adaptor.addChild(root_0, char_literal321_tree);
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1979);
                    base64BinaryBag322=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag322.getTree());
                    dbg.location(183,41);
                    char_literal323=(Token)match(input,83,FOLLOW_83_in_bagOp1981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = 
                    (Object)adaptor.create(char_literal323)
                    ;
                    adaptor.addChild(root_0, char_literal323_tree);
                    }
                    dbg.location(183,45);
                    set324=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set324)
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

                    dbg.location(183,102);
                    char_literal325=(Token)match(input,80,FOLLOW_80_in_bagOp1998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal325_tree = 
                    (Object)adaptor.create(char_literal325)
                    ;
                    adaptor.addChild(root_0, char_literal325_tree);
                    }
                    dbg.location(183,107);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2001);
                    base64BinaryBag326=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag326.getTree());
                    dbg.location(183,123);
                    char_literal327=(Token)match(input,81,FOLLOW_81_in_bagOp2003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = 
                    (Object)adaptor.create(char_literal327)
                    ;
                    adaptor.addChild(root_0, char_literal327_tree);
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
        dbg.location(184, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' );
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT328=null;
        Token char_literal330=null;
        Token set331=null;
        Token char_literal332=null;
        Token char_literal333=null;
        Token char_literal335=null;
        Token SIZE_TOK336=null;
        Token char_literal337=null;
        Token char_literal338=null;
        GrammarParser.stringExpr_return stringExpr329 =null;

        GrammarParser.anyBag_return anyBag334 =null;


        Object INTEGER_CONSTANT328_tree=null;
        Object char_literal330_tree=null;
        Object set331_tree=null;
        Object char_literal332_tree=null;
        Object char_literal333_tree=null;
        Object char_literal335_tree=null;
        Object SIZE_TOK336_tree=null;
        Object char_literal337_tree=null;
        Object char_literal338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:2: ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' )
            int alt13=3;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            switch ( input.LA(1) ) {
            case INTEGER_CONSTANT:
                {
                alt13=1;
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case STRING_CONSTANT:
            case SUBJECT_TOK:
                {
                alt13=2;
                }
                break;
            case STRING_TOK:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==STRING_CONSTANT_LIST) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==83) ) {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==ONEANDONLY_TOK) ) {
                            alt13=2;
                        }
                        else if ( (LA13_6==SIZE_TOK) ) {
                            alt13=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 6, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ANYURI_TOK:
            case BASE64BINARY_TOK:
            case BOOLEAN_TOK:
            case DATETIME_TOK:
            case DATE_TOK:
            case DAYTIMEDURATION_TOK:
            case DOUBLE_TOK:
            case HEXBINARY_TOK:
            case INTEGER_TOK:
            case INTERSECTION_TOK:
            case RFC822NAME_TOK:
            case TIME_TOK:
            case UNION_TOK:
            case X500NAME_TOK:
            case YEARMONTHDURATION_TOK:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: INTEGER_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,4);
                    INTEGER_CONSTANT328=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT328_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT328)
                    ;
                    adaptor.addChild(root_0, INTEGER_CONSTANT328_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2019);
                    stringExpr329=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr329.getTree());
                    dbg.location(188,15);
                    char_literal330=(Token)match(input,83,FOLLOW_83_in_integerExpr2021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = 
                    (Object)adaptor.create(char_literal330)
                    ;
                    adaptor.addChild(root_0, char_literal330_tree);
                    }
                    dbg.location(188,19);
                    set331=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set331)
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

                    dbg.location(188,51);
                    char_literal332=(Token)match(input,80,FOLLOW_80_in_integerExpr2033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal332_tree = 
                    (Object)adaptor.create(char_literal332)
                    ;
                    adaptor.addChild(root_0, char_literal332_tree);
                    }
                    dbg.location(188,56);
                    char_literal333=(Token)match(input,81,FOLLOW_81_in_integerExpr2036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = 
                    (Object)adaptor.create(char_literal333)
                    ;
                    adaptor.addChild(root_0, char_literal333_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:4: anyBag '.' SIZE_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(189,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2041);
                    anyBag334=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag334.getTree());
                    dbg.location(189,11);
                    char_literal335=(Token)match(input,83,FOLLOW_83_in_integerExpr2043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal335_tree = 
                    (Object)adaptor.create(char_literal335)
                    ;
                    adaptor.addChild(root_0, char_literal335_tree);
                    }
                    dbg.location(189,15);
                    SIZE_TOK336=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK336_tree = 
                    (Object)adaptor.create(SIZE_TOK336)
                    ;
                    adaptor.addChild(root_0, SIZE_TOK336_tree);
                    }
                    dbg.location(189,24);
                    char_literal337=(Token)match(input,80,FOLLOW_80_in_integerExpr2047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal337_tree = 
                    (Object)adaptor.create(char_literal337)
                    ;
                    adaptor.addChild(root_0, char_literal337_tree);
                    }
                    dbg.location(189,28);
                    char_literal338=(Token)match(input,81,FOLLOW_81_in_integerExpr2049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal338_tree = 
                    (Object)adaptor.create(char_literal338)
                    ;
                    adaptor.addChild(root_0, char_literal338_tree);
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
        dbg.location(193, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerExpr"


    public static class doubleExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:1: doubleExpr : ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' );
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT339=null;
        Token DOUBLE_TOK340=null;
        Token char_literal341=null;
        Token char_literal343=null;
        GrammarParser.stringExpr_return stringExpr342 =null;


        Object DOUBLE_CONSTANT339_tree=null;
        Object DOUBLE_TOK340_tree=null;
        Object char_literal341_tree=null;
        Object char_literal343_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:2: ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==DOUBLE_CONSTANT) ) {
                alt14=1;
            }
            else if ( (LA14_0==DOUBLE_TOK) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: DOUBLE_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(196,4);
                    DOUBLE_CONSTANT339=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT339_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT339)
                    ;
                    adaptor.addChild(root_0, DOUBLE_CONSTANT339_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: DOUBLE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(197,4);
                    DOUBLE_TOK340=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK340_tree = 
                    (Object)adaptor.create(DOUBLE_TOK340)
                    ;
                    adaptor.addChild(root_0, DOUBLE_TOK340_tree);
                    }
                    dbg.location(197,15);
                    char_literal341=(Token)match(input,80,FOLLOW_80_in_doubleExpr2070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal341_tree = 
                    (Object)adaptor.create(char_literal341)
                    ;
                    adaptor.addChild(root_0, char_literal341_tree);
                    }
                    dbg.location(197,19);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2072);
                    stringExpr342=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr342.getTree());
                    dbg.location(197,30);
                    char_literal343=(Token)match(input,81,FOLLOW_81_in_doubleExpr2074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal343_tree = 
                    (Object)adaptor.create(char_literal343)
                    ;
                    adaptor.addChild(root_0, char_literal343_tree);
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
        dbg.location(200, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doubleExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doubleExpr"


    public static class stringExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:1: stringExpr : ( ( STRING_CONSTANT )=> STRING_CONSTANT | attributeExpr | stringBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT344=null;
        Token char_literal347=null;
        Token ONEANDONLY_TOK348=null;
        Token char_literal349=null;
        Token char_literal350=null;
        GrammarParser.attributeExpr_return attributeExpr345 =null;

        GrammarParser.stringBag_return stringBag346 =null;


        Object STRING_CONSTANT344_tree=null;
        Object char_literal347_tree=null;
        Object ONEANDONLY_TOK348_tree=null;
        Object char_literal349_tree=null;
        Object char_literal350_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:2: ( ( STRING_CONSTANT )=> STRING_CONSTANT | attributeExpr | stringBag '.' ONEANDONLY_TOK '(' ')' )
            int alt15=3;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==STRING_CONSTANT) && (synpred22_Grammar())) {
                alt15=1;
            }
            else if ( (LA15_0==ACTION_TOK||LA15_0==ENVIRONMENT_TOK||LA15_0==RESOURCE_TOK||LA15_0==SUBJECT_TOK) ) {
                alt15=2;
            }
            else if ( (LA15_0==STRING_TOK) ) {
                alt15=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( STRING_CONSTANT )=> STRING_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,25);
                    STRING_CONSTANT344=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT344_tree = 
                    (Object)adaptor.create(STRING_CONSTANT344)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT344_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringExpr2098);
                    attributeExpr345=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr345.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:4: stringBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(206,4);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2104);
                    stringBag346=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag346.getTree());
                    dbg.location(206,14);
                    char_literal347=(Token)match(input,83,FOLLOW_83_in_stringExpr2106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal347_tree = 
                    (Object)adaptor.create(char_literal347)
                    ;
                    adaptor.addChild(root_0, char_literal347_tree);
                    }
                    dbg.location(206,18);
                    ONEANDONLY_TOK348=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK348_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK348)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK348_tree);
                    }
                    dbg.location(206,33);
                    char_literal349=(Token)match(input,80,FOLLOW_80_in_stringExpr2110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = 
                    (Object)adaptor.create(char_literal349)
                    ;
                    adaptor.addChild(root_0, char_literal349_tree);
                    }
                    dbg.location(206,37);
                    char_literal350=(Token)match(input,81,FOLLOW_81_in_stringExpr2112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal350_tree = 
                    (Object)adaptor.create(char_literal350)
                    ;
                    adaptor.addChild(root_0, char_literal350_tree);
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
            dbg.exitRule(getGrammarFileName(), "stringExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringExpr"


    public static class attributeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:1: attributeExpr : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set351=null;
        Token char_literal352=null;
        Token LOWERCASEIDENTIFIER353=null;

        Object set351_tree=null;
        Object char_literal352_tree=null;
        Object LOWERCASEIDENTIFIER353_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(211,4);
            set351=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set351)
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

            dbg.location(211,65);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:65: ( '.' LOWERCASEIDENTIFIER )+
            int cnt16=0;
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==83) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==LOWERCASEIDENTIFIER) ) {
                        alt16=1;
                    }


                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:66: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(211,66);
            	    char_literal352=(Token)match(input,83,FOLLOW_83_in_attributeExpr2142); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal352_tree = 
            	    (Object)adaptor.create(char_literal352)
            	    ;
            	    adaptor.addChild(root_0, char_literal352_tree);
            	    }
            	    dbg.location(211,70);
            	    LOWERCASEIDENTIFIER353=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2144); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER353_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER353)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER353_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt16++;
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
        dbg.location(212, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:1: anyUriExpr : ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' );
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK354=null;
        Token char_literal355=null;
        Token char_literal357=null;
        Token char_literal359=null;
        Token ONEANDONLY_TOK360=null;
        Token char_literal361=null;
        Token char_literal362=null;
        Token char_literal364=null;
        Token URI_TOK365=null;
        Token char_literal366=null;
        Token char_literal367=null;
        GrammarParser.stringExpr_return stringExpr356 =null;

        GrammarParser.anyUriBag_return anyUriBag358 =null;

        GrammarParser.stringExpr_return stringExpr363 =null;


        Object ANYURI_TOK354_tree=null;
        Object char_literal355_tree=null;
        Object char_literal357_tree=null;
        Object char_literal359_tree=null;
        Object ONEANDONLY_TOK360_tree=null;
        Object char_literal361_tree=null;
        Object char_literal362_tree=null;
        Object char_literal364_tree=null;
        Object URI_TOK365_tree=null;
        Object char_literal366_tree=null;
        Object char_literal367_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:2: ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' )
            int alt17=3;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==ANYURI_TOK) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==80) ) {
                    alt17=1;
                }
                else if ( (LA17_1==STRING_CONSTANT_LIST) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA17_0==STRING_CONSTANT) && (synpred23_Grammar())) {
                alt17=3;
            }
            else if ( (LA17_0==ACTION_TOK||LA17_0==ENVIRONMENT_TOK||LA17_0==RESOURCE_TOK||LA17_0==SUBJECT_TOK) && (synpred23_Grammar())) {
                alt17=3;
            }
            else if ( (LA17_0==STRING_TOK) && (synpred23_Grammar())) {
                alt17=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:4: ANYURI_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,4);
                    ANYURI_TOK354=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK354_tree = 
                    (Object)adaptor.create(ANYURI_TOK354)
                    ;
                    adaptor.addChild(root_0, ANYURI_TOK354_tree);
                    }
                    dbg.location(215,15);
                    char_literal355=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal355_tree = 
                    (Object)adaptor.create(char_literal355)
                    ;
                    adaptor.addChild(root_0, char_literal355_tree);
                    }
                    dbg.location(215,19);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2162);
                    stringExpr356=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr356.getTree());
                    dbg.location(215,30);
                    char_literal357=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal357_tree = 
                    (Object)adaptor.create(char_literal357)
                    ;
                    adaptor.addChild(root_0, char_literal357_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: anyUriBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(217,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2170);
                    anyUriBag358=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag358.getTree());
                    dbg.location(217,14);
                    char_literal359=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = 
                    (Object)adaptor.create(char_literal359)
                    ;
                    adaptor.addChild(root_0, char_literal359_tree);
                    }
                    dbg.location(217,18);
                    ONEANDONLY_TOK360=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK360_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK360)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK360_tree);
                    }
                    dbg.location(217,33);
                    char_literal361=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal361_tree = 
                    (Object)adaptor.create(char_literal361)
                    ;
                    adaptor.addChild(root_0, char_literal361_tree);
                    }
                    dbg.location(217,37);
                    char_literal362=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal362_tree = 
                    (Object)adaptor.create(char_literal362)
                    ;
                    adaptor.addChild(root_0, char_literal362_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: ( stringExpr )=> stringExpr '.' URI_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,20);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2189);
                    stringExpr363=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr363.getTree());
                    dbg.location(218,31);
                    char_literal364=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal364_tree = 
                    (Object)adaptor.create(char_literal364)
                    ;
                    adaptor.addChild(root_0, char_literal364_tree);
                    }
                    dbg.location(218,35);
                    URI_TOK365=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK365_tree = 
                    (Object)adaptor.create(URI_TOK365)
                    ;
                    adaptor.addChild(root_0, URI_TOK365_tree);
                    }
                    dbg.location(218,43);
                    char_literal366=(Token)match(input,80,FOLLOW_80_in_anyUriExpr2195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal366_tree = 
                    (Object)adaptor.create(char_literal366)
                    ;
                    adaptor.addChild(root_0, char_literal366_tree);
                    }
                    dbg.location(218,47);
                    char_literal367=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal367_tree = 
                    (Object)adaptor.create(char_literal367)
                    ;
                    adaptor.addChild(root_0, char_literal367_tree);
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
            dbg.exitRule(getGrammarFileName(), "anyUriExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyUriExpr"


    public static class dateExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:1: dateExpr : ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK368=null;
        Token char_literal369=null;
        Token char_literal371=null;
        Token char_literal373=null;
        Token ONEANDONLY_TOK374=null;
        Token char_literal375=null;
        Token char_literal376=null;
        GrammarParser.stringExpr_return stringExpr370 =null;

        GrammarParser.dateBag_return dateBag372 =null;


        Object DATE_TOK368_tree=null;
        Object char_literal369_tree=null;
        Object char_literal371_tree=null;
        Object char_literal373_tree=null;
        Object ONEANDONLY_TOK374_tree=null;
        Object char_literal375_tree=null;
        Object char_literal376_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:2: ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==DATE_TOK) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==80) ) {
                    alt18=1;
                }
                else if ( (LA18_1==STRING_CONSTANT_LIST) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:4: DATE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(223,4);
                    DATE_TOK368=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK368_tree = 
                    (Object)adaptor.create(DATE_TOK368)
                    ;
                    adaptor.addChild(root_0, DATE_TOK368_tree);
                    }
                    dbg.location(223,13);
                    char_literal369=(Token)match(input,80,FOLLOW_80_in_dateExpr2211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal369_tree = 
                    (Object)adaptor.create(char_literal369)
                    ;
                    adaptor.addChild(root_0, char_literal369_tree);
                    }
                    dbg.location(223,17);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2213);
                    stringExpr370=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr370.getTree());
                    dbg.location(223,28);
                    char_literal371=(Token)match(input,81,FOLLOW_81_in_dateExpr2215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = 
                    (Object)adaptor.create(char_literal371)
                    ;
                    adaptor.addChild(root_0, char_literal371_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: dateBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(224,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2220);
                    dateBag372=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag372.getTree());
                    dbg.location(224,12);
                    char_literal373=(Token)match(input,83,FOLLOW_83_in_dateExpr2222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal373_tree = 
                    (Object)adaptor.create(char_literal373)
                    ;
                    adaptor.addChild(root_0, char_literal373_tree);
                    }
                    dbg.location(224,16);
                    ONEANDONLY_TOK374=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK374_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK374)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK374_tree);
                    }
                    dbg.location(224,31);
                    char_literal375=(Token)match(input,80,FOLLOW_80_in_dateExpr2226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal375_tree = 
                    (Object)adaptor.create(char_literal375)
                    ;
                    adaptor.addChild(root_0, char_literal375_tree);
                    }
                    dbg.location(224,35);
                    char_literal376=(Token)match(input,81,FOLLOW_81_in_dateExpr2228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal376_tree = 
                    (Object)adaptor.create(char_literal376)
                    ;
                    adaptor.addChild(root_0, char_literal376_tree);
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
        dbg.location(225, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateExpr"


    public static class timeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:1: timeExpr : ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK377=null;
        Token char_literal378=null;
        Token char_literal380=null;
        Token char_literal382=null;
        Token ONEANDONLY_TOK383=null;
        Token char_literal384=null;
        Token char_literal385=null;
        GrammarParser.stringExpr_return stringExpr379 =null;

        GrammarParser.timeBag_return timeBag381 =null;


        Object TIME_TOK377_tree=null;
        Object char_literal378_tree=null;
        Object char_literal380_tree=null;
        Object char_literal382_tree=null;
        Object ONEANDONLY_TOK383_tree=null;
        Object char_literal384_tree=null;
        Object char_literal385_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(227, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:2: ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==TIME_TOK) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==80) ) {
                    alt19=1;
                }
                else if ( (LA19_1==STRING_CONSTANT_LIST) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: TIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(228,4);
                    TIME_TOK377=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK377_tree = 
                    (Object)adaptor.create(TIME_TOK377)
                    ;
                    adaptor.addChild(root_0, TIME_TOK377_tree);
                    }
                    dbg.location(228,13);
                    char_literal378=(Token)match(input,80,FOLLOW_80_in_timeExpr2241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal378_tree = 
                    (Object)adaptor.create(char_literal378)
                    ;
                    adaptor.addChild(root_0, char_literal378_tree);
                    }
                    dbg.location(228,17);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2243);
                    stringExpr379=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr379.getTree());
                    dbg.location(228,28);
                    char_literal380=(Token)match(input,81,FOLLOW_81_in_timeExpr2245); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal380_tree = 
                    (Object)adaptor.create(char_literal380)
                    ;
                    adaptor.addChild(root_0, char_literal380_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: timeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(229,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2250);
                    timeBag381=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag381.getTree());
                    dbg.location(229,12);
                    char_literal382=(Token)match(input,83,FOLLOW_83_in_timeExpr2252); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = 
                    (Object)adaptor.create(char_literal382)
                    ;
                    adaptor.addChild(root_0, char_literal382_tree);
                    }
                    dbg.location(229,16);
                    ONEANDONLY_TOK383=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2254); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK383_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK383)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK383_tree);
                    }
                    dbg.location(229,31);
                    char_literal384=(Token)match(input,80,FOLLOW_80_in_timeExpr2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal384_tree = 
                    (Object)adaptor.create(char_literal384)
                    ;
                    adaptor.addChild(root_0, char_literal384_tree);
                    }
                    dbg.location(229,35);
                    char_literal385=(Token)match(input,81,FOLLOW_81_in_timeExpr2258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = 
                    (Object)adaptor.create(char_literal385)
                    ;
                    adaptor.addChild(root_0, char_literal385_tree);
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
        dbg.location(230, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeExpr"


    public static class dateTimeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:1: dateTimeExpr : ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK386=null;
        Token char_literal387=null;
        Token char_literal389=null;
        Token char_literal391=null;
        Token ONEANDONLY_TOK392=null;
        Token char_literal393=null;
        Token char_literal394=null;
        GrammarParser.stringExpr_return stringExpr388 =null;

        GrammarParser.dateTimeBag_return dateTimeBag390 =null;


        Object DATETIME_TOK386_tree=null;
        Object char_literal387_tree=null;
        Object char_literal389_tree=null;
        Object char_literal391_tree=null;
        Object ONEANDONLY_TOK392_tree=null;
        Object char_literal393_tree=null;
        Object char_literal394_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:2: ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==DATETIME_TOK) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==80) && (synpred24_Grammar())) {
                    alt20=1;
                }
                else if ( (LA20_1==STRING_CONSTANT_LIST) && (synpred25_Grammar())) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,22);
                    DATETIME_TOK386=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr2275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK386_tree = 
                    (Object)adaptor.create(DATETIME_TOK386)
                    ;
                    adaptor.addChild(root_0, DATETIME_TOK386_tree);
                    }
                    dbg.location(233,35);
                    char_literal387=(Token)match(input,80,FOLLOW_80_in_dateTimeExpr2277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal387_tree = 
                    (Object)adaptor.create(char_literal387)
                    ;
                    adaptor.addChild(root_0, char_literal387_tree);
                    }
                    dbg.location(233,39);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr2279);
                    stringExpr388=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr388.getTree());
                    dbg.location(233,50);
                    char_literal389=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal389_tree = 
                    (Object)adaptor.create(char_literal389)
                    ;
                    adaptor.addChild(root_0, char_literal389_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(234,21);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr2292);
                    dateTimeBag390=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag390.getTree());
                    dbg.location(234,33);
                    char_literal391=(Token)match(input,83,FOLLOW_83_in_dateTimeExpr2294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal391_tree = 
                    (Object)adaptor.create(char_literal391)
                    ;
                    adaptor.addChild(root_0, char_literal391_tree);
                    }
                    dbg.location(234,37);
                    ONEANDONLY_TOK392=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK392_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK392)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK392_tree);
                    }
                    dbg.location(234,52);
                    char_literal393=(Token)match(input,80,FOLLOW_80_in_dateTimeExpr2298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal393_tree = 
                    (Object)adaptor.create(char_literal393)
                    ;
                    adaptor.addChild(root_0, char_literal393_tree);
                    }
                    dbg.location(234,56);
                    char_literal394=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal394_tree = 
                    (Object)adaptor.create(char_literal394)
                    ;
                    adaptor.addChild(root_0, char_literal394_tree);
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
        dbg.location(235, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateTimeExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateTimeExpr"


    public static class base64BinaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:1: base64BinaryExpr : ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK395=null;
        Token char_literal396=null;
        Token char_literal398=null;
        Token char_literal400=null;
        Token ONEANDONLY_TOK401=null;
        Token char_literal402=null;
        Token char_literal403=null;
        GrammarParser.stringExpr_return stringExpr397 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag399 =null;


        Object BASE64BINARY_TOK395_tree=null;
        Object char_literal396_tree=null;
        Object char_literal398_tree=null;
        Object char_literal400_tree=null;
        Object ONEANDONLY_TOK401_tree=null;
        Object char_literal402_tree=null;
        Object char_literal403_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==BASE64BINARY_TOK) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==80) && (synpred26_Grammar())) {
                    alt21=1;
                }
                else if ( (LA21_1==STRING_CONSTANT_LIST) && (synpred27_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(238,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')'
                    {
                    dbg.location(238,27);
                    BASE64BINARY_TOK395=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK395_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK395)
                    ;
                    adaptor.addChild(root_0, BASE64BINARY_TOK395_tree);
                    }
                    dbg.location(238,44);
                    char_literal396=(Token)match(input,80,FOLLOW_80_in_base64BinaryExpr2320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal396_tree = 
                    (Object)adaptor.create(char_literal396)
                    ;
                    adaptor.addChild(root_0, char_literal396_tree);
                    }
                    dbg.location(238,48);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr2322);
                    stringExpr397=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr397.getTree());
                    dbg.location(238,59);
                    char_literal398=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal398_tree = 
                    (Object)adaptor.create(char_literal398)
                    ;
                    adaptor.addChild(root_0, char_literal398_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(239,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr2336);
                    base64BinaryBag399=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag399.getTree());
                    dbg.location(239,41);
                    char_literal400=(Token)match(input,83,FOLLOW_83_in_base64BinaryExpr2338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal400_tree = 
                    (Object)adaptor.create(char_literal400)
                    ;
                    adaptor.addChild(root_0, char_literal400_tree);
                    }
                    dbg.location(239,45);
                    ONEANDONLY_TOK401=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK401_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK401)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK401_tree);
                    }
                    dbg.location(239,60);
                    char_literal402=(Token)match(input,80,FOLLOW_80_in_base64BinaryExpr2342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal402_tree = 
                    (Object)adaptor.create(char_literal402)
                    ;
                    adaptor.addChild(root_0, char_literal402_tree);
                    }
                    dbg.location(239,64);
                    char_literal403=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal403_tree = 
                    (Object)adaptor.create(char_literal403)
                    ;
                    adaptor.addChild(root_0, char_literal403_tree);
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
        dbg.location(240, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base64BinaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryExpr"


    public static class dayTimeDurationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:1: dayTimeDurationExpr : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK404=null;
        Token char_literal405=null;
        Token char_literal407=null;
        Token char_literal409=null;
        Token ONEANDONLY_TOK410=null;
        Token char_literal411=null;
        Token char_literal412=null;
        GrammarParser.stringExpr_return stringExpr406 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag408 =null;


        Object DAYTIMEDURATION_TOK404_tree=null;
        Object char_literal405_tree=null;
        Object char_literal407_tree=null;
        Object char_literal409_tree=null;
        Object ONEANDONLY_TOK410_tree=null;
        Object char_literal411_tree=null;
        Object char_literal412_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:2: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' )
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==DAYTIMEDURATION_TOK) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==80) && (synpred28_Grammar())) {
                    alt22=1;
                }
                else if ( (LA22_1==STRING_CONSTANT_LIST) && (synpred29_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(242,29);
                    DAYTIMEDURATION_TOK404=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK404_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK404)
                    ;
                    adaptor.addChild(root_0, DAYTIMEDURATION_TOK404_tree);
                    }
                    dbg.location(242,49);
                    char_literal405=(Token)match(input,80,FOLLOW_80_in_dayTimeDurationExpr2362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal405_tree = 
                    (Object)adaptor.create(char_literal405)
                    ;
                    adaptor.addChild(root_0, char_literal405_tree);
                    }
                    dbg.location(242,53);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr2364);
                    stringExpr406=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr406.getTree());
                    dbg.location(242,64);
                    char_literal407=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal407_tree = 
                    (Object)adaptor.create(char_literal407)
                    ;
                    adaptor.addChild(root_0, char_literal407_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(243,28);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2377);
                    dayTimeDurationBag408=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag408.getTree());
                    dbg.location(243,47);
                    char_literal409=(Token)match(input,83,FOLLOW_83_in_dayTimeDurationExpr2379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal409_tree = 
                    (Object)adaptor.create(char_literal409)
                    ;
                    adaptor.addChild(root_0, char_literal409_tree);
                    }
                    dbg.location(243,51);
                    ONEANDONLY_TOK410=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK410_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK410)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK410_tree);
                    }
                    dbg.location(243,66);
                    char_literal411=(Token)match(input,80,FOLLOW_80_in_dayTimeDurationExpr2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal411_tree = 
                    (Object)adaptor.create(char_literal411)
                    ;
                    adaptor.addChild(root_0, char_literal411_tree);
                    }
                    dbg.location(243,70);
                    char_literal412=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal412_tree = 
                    (Object)adaptor.create(char_literal412)
                    ;
                    adaptor.addChild(root_0, char_literal412_tree);
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
        dbg.location(244, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationExpr"


    public static class yearMonthDurationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:1: yearMonthDurationExpr : ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) );
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK413=null;
        Token char_literal414=null;
        Token char_literal416=null;
        Token char_literal418=null;
        Token ONEANDONLY_TOK419=null;
        Token char_literal420=null;
        Token char_literal421=null;
        GrammarParser.stringExpr_return stringExpr415 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag417 =null;


        Object YEARMONTHDURATION_TOK413_tree=null;
        Object char_literal414_tree=null;
        Object char_literal416_tree=null;
        Object char_literal418_tree=null;
        Object ONEANDONLY_TOK419_tree=null;
        Object char_literal420_tree=null;
        Object char_literal421_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:2: ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==YEARMONTHDURATION_TOK) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==80) && (synpred30_Grammar())) {
                    alt23=1;
                }
                else if ( (LA23_1==STRING_CONSTANT_LIST) && (synpred31_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(247,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:5: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')'
                    {
                    dbg.location(247,32);
                    YEARMONTHDURATION_TOK413=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK413_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK413)
                    ;
                    adaptor.addChild(root_0, YEARMONTHDURATION_TOK413_tree);
                    }
                    dbg.location(247,54);
                    char_literal414=(Token)match(input,80,FOLLOW_80_in_yearMonthDurationExpr2405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = 
                    (Object)adaptor.create(char_literal414)
                    ;
                    adaptor.addChild(root_0, char_literal414_tree);
                    }
                    dbg.location(247,58);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr2407);
                    stringExpr415=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr415.getTree());
                    dbg.location(247,69);
                    char_literal416=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal416_tree = 
                    (Object)adaptor.create(char_literal416)
                    ;
                    adaptor.addChild(root_0, char_literal416_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(248,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:5: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    dbg.location(248,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2422);
                    yearMonthDurationBag417=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag417.getTree());
                    dbg.location(248,52);
                    char_literal418=(Token)match(input,83,FOLLOW_83_in_yearMonthDurationExpr2424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal418_tree = 
                    (Object)adaptor.create(char_literal418)
                    ;
                    adaptor.addChild(root_0, char_literal418_tree);
                    }
                    dbg.location(248,56);
                    ONEANDONLY_TOK419=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK419_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK419)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK419_tree);
                    }
                    dbg.location(248,71);
                    char_literal420=(Token)match(input,80,FOLLOW_80_in_yearMonthDurationExpr2428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal420_tree = 
                    (Object)adaptor.create(char_literal420)
                    ;
                    adaptor.addChild(root_0, char_literal420_tree);
                    }
                    dbg.location(248,75);
                    char_literal421=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal421_tree = 
                    (Object)adaptor.create(char_literal421)
                    ;
                    adaptor.addChild(root_0, char_literal421_tree);
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
        dbg.location(249, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationExpr"


    public static class x500NameExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:1: x500NameExpr : ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK422=null;
        Token char_literal423=null;
        Token char_literal425=null;
        Token char_literal427=null;
        Token ONEANDONLY_TOK428=null;
        Token char_literal429=null;
        Token char_literal430=null;
        GrammarParser.stringExpr_return stringExpr424 =null;

        GrammarParser.x500NameBag_return x500NameBag426 =null;


        Object X500NAME_TOK422_tree=null;
        Object char_literal423_tree=null;
        Object char_literal425_tree=null;
        Object char_literal427_tree=null;
        Object ONEANDONLY_TOK428_tree=null;
        Object char_literal429_tree=null;
        Object char_literal430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:2: ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==X500NAME_TOK) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==80) ) {
                    alt24=1;
                }
                else if ( (LA24_1==STRING_CONSTANT_LIST) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:4: X500NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(251,4);
                    X500NAME_TOK422=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr2441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK422_tree = 
                    (Object)adaptor.create(X500NAME_TOK422)
                    ;
                    adaptor.addChild(root_0, X500NAME_TOK422_tree);
                    }
                    dbg.location(251,17);
                    char_literal423=(Token)match(input,80,FOLLOW_80_in_x500NameExpr2443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal423_tree = 
                    (Object)adaptor.create(char_literal423)
                    ;
                    adaptor.addChild(root_0, char_literal423_tree);
                    }
                    dbg.location(251,21);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr2445);
                    stringExpr424=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr424.getTree());
                    dbg.location(251,32);
                    char_literal425=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = 
                    (Object)adaptor.create(char_literal425)
                    ;
                    adaptor.addChild(root_0, char_literal425_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:4: x500NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(252,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr2452);
                    x500NameBag426=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag426.getTree());
                    dbg.location(252,17);
                    char_literal427=(Token)match(input,83,FOLLOW_83_in_x500NameExpr2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal427_tree = 
                    (Object)adaptor.create(char_literal427)
                    ;
                    adaptor.addChild(root_0, char_literal427_tree);
                    }
                    dbg.location(252,21);
                    ONEANDONLY_TOK428=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK428_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK428)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK428_tree);
                    }
                    dbg.location(252,36);
                    char_literal429=(Token)match(input,80,FOLLOW_80_in_x500NameExpr2459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal429_tree = 
                    (Object)adaptor.create(char_literal429)
                    ;
                    adaptor.addChild(root_0, char_literal429_tree);
                    }
                    dbg.location(252,40);
                    char_literal430=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2461); if (state.failed) return retval;
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
        dbg.location(254, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "x500NameExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "x500NameExpr"


    public static class rfc822NameExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:1: rfc822NameExpr : ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK431=null;
        Token char_literal432=null;
        Token char_literal434=null;
        Token char_literal436=null;
        Token ONEANDONLY_TOK437=null;
        Token char_literal438=null;
        Token char_literal439=null;
        GrammarParser.stringExpr_return stringExpr433 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag435 =null;


        Object RFC822NAME_TOK431_tree=null;
        Object char_literal432_tree=null;
        Object char_literal434_tree=null;
        Object char_literal436_tree=null;
        Object ONEANDONLY_TOK437_tree=null;
        Object char_literal438_tree=null;
        Object char_literal439_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:2: ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==RFC822NAME_TOK) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==80) ) {
                    alt25=1;
                }
                else if ( (LA25_1==STRING_CONSTANT_LIST) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:4: RFC822NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(256,4);
                    RFC822NAME_TOK431=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2472); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK431_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK431)
                    ;
                    adaptor.addChild(root_0, RFC822NAME_TOK431_tree);
                    }
                    dbg.location(256,19);
                    char_literal432=(Token)match(input,80,FOLLOW_80_in_rfc822NameExpr2474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal432_tree = 
                    (Object)adaptor.create(char_literal432)
                    ;
                    adaptor.addChild(root_0, char_literal432_tree);
                    }
                    dbg.location(256,23);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr2476);
                    stringExpr433=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr433.getTree());
                    dbg.location(256,34);
                    char_literal434=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr2478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal434_tree = 
                    (Object)adaptor.create(char_literal434)
                    ;
                    adaptor.addChild(root_0, char_literal434_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:4: rfc822NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(257,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr2483);
                    rfc822NameBag435=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag435.getTree());
                    dbg.location(257,18);
                    char_literal436=(Token)match(input,83,FOLLOW_83_in_rfc822NameExpr2485); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal436_tree = 
                    (Object)adaptor.create(char_literal436)
                    ;
                    adaptor.addChild(root_0, char_literal436_tree);
                    }
                    dbg.location(257,22);
                    ONEANDONLY_TOK437=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK437_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK437)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK437_tree);
                    }
                    dbg.location(257,37);
                    char_literal438=(Token)match(input,80,FOLLOW_80_in_rfc822NameExpr2489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal438_tree = 
                    (Object)adaptor.create(char_literal438)
                    ;
                    adaptor.addChild(root_0, char_literal438_tree);
                    }
                    dbg.location(257,41);
                    char_literal439=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr2491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal439_tree = 
                    (Object)adaptor.create(char_literal439)
                    ;
                    adaptor.addChild(root_0, char_literal439_tree);
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
        dbg.location(259, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rfc822NameExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rfc822NameExpr"


    public static class hexBinaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:1: hexBinaryExpr : ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK440=null;
        Token char_literal441=null;
        Token char_literal443=null;
        Token char_literal445=null;
        Token ONEANDONLY_TOK446=null;
        Token char_literal447=null;
        Token char_literal448=null;
        GrammarParser.stringExpr_return stringExpr442 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag444 =null;


        Object HEXBINARY_TOK440_tree=null;
        Object char_literal441_tree=null;
        Object char_literal443_tree=null;
        Object char_literal445_tree=null;
        Object ONEANDONLY_TOK446_tree=null;
        Object char_literal447_tree=null;
        Object char_literal448_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:261:2: ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==HEXBINARY_TOK) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==80) ) {
                    alt26=1;
                }
                else if ( (LA26_1==STRING_CONSTANT_LIST) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:261:4: HEXBINARY_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(261,4);
                    HEXBINARY_TOK440=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr2502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK440_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK440)
                    ;
                    adaptor.addChild(root_0, HEXBINARY_TOK440_tree);
                    }
                    dbg.location(261,18);
                    char_literal441=(Token)match(input,80,FOLLOW_80_in_hexBinaryExpr2504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal441_tree = 
                    (Object)adaptor.create(char_literal441)
                    ;
                    adaptor.addChild(root_0, char_literal441_tree);
                    }
                    dbg.location(261,22);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr2506);
                    stringExpr442=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr442.getTree());
                    dbg.location(261,33);
                    char_literal443=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr2508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal443_tree = 
                    (Object)adaptor.create(char_literal443)
                    ;
                    adaptor.addChild(root_0, char_literal443_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:4: hexBinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(262,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr2513);
                    hexBinaryBag444=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag444.getTree());
                    dbg.location(262,17);
                    char_literal445=(Token)match(input,83,FOLLOW_83_in_hexBinaryExpr2515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal445_tree = 
                    (Object)adaptor.create(char_literal445)
                    ;
                    adaptor.addChild(root_0, char_literal445_tree);
                    }
                    dbg.location(262,21);
                    ONEANDONLY_TOK446=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr2517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK446_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK446)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK446_tree);
                    }
                    dbg.location(262,36);
                    char_literal447=(Token)match(input,80,FOLLOW_80_in_hexBinaryExpr2519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal447_tree = 
                    (Object)adaptor.create(char_literal447)
                    ;
                    adaptor.addChild(root_0, char_literal447_tree);
                    }
                    dbg.location(262,40);
                    char_literal448=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr2521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal448_tree = 
                    (Object)adaptor.create(char_literal448)
                    ;
                    adaptor.addChild(root_0, char_literal448_tree);
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
        dbg.location(263, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hexBinaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hexBinaryExpr"


    public static class stringBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:1: stringBag : STRING_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK449=null;
        Token STRING_CONSTANT_LIST450=null;

        Object STRING_TOK449_tree=null;
        Object STRING_CONSTANT_LIST450_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:2: ( STRING_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:4: STRING_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(266,4);
            STRING_TOK449=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2532); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_TOK449_tree = 
            (Object)adaptor.create(STRING_TOK449)
            ;
            adaptor.addChild(root_0, STRING_TOK449_tree);
            }
            dbg.location(266,15);
            STRING_CONSTANT_LIST450=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2534); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST450_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST450)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST450_tree);
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
        dbg.location(268, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringBag"


    public static class anyUriBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:1: anyUriBag : ANYURI_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK451=null;
        Token STRING_CONSTANT_LIST452=null;

        Object ANYURI_TOK451_tree=null;
        Object STRING_CONSTANT_LIST452_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:2: ( ANYURI_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:4: ANYURI_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(270,4);
            ANYURI_TOK451=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2545); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK451_tree = 
            (Object)adaptor.create(ANYURI_TOK451)
            ;
            adaptor.addChild(root_0, ANYURI_TOK451_tree);
            }
            dbg.location(270,15);
            STRING_CONSTANT_LIST452=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2547); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST452_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST452)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST452_tree);
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
        dbg.location(272, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyUriBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyUriBag"


    public static class base64BinaryBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:273:1: base64BinaryBag : ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK453=null;
        Token STRING_CONSTANT_LIST454=null;

        Object BASE64BINARY_TOK453_tree=null;
        Object STRING_CONSTANT_LIST454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(274,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST
            {
            dbg.location(274,27);
            BASE64BINARY_TOK453=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK453_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK453)
            ;
            adaptor.addChild(root_0, BASE64BINARY_TOK453_tree);
            }
            dbg.location(274,44);
            STRING_CONSTANT_LIST454=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST454_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST454)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST454_tree);
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
        dbg.location(278, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base64BinaryBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryBag"


    public static class booleanBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:279:1: booleanBag : ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK455=null;
        Token STRING_CONSTANT_LIST456=null;

        Object BOOLEAN_TOK455_tree=null;
        Object STRING_CONSTANT_LIST456_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:2: ( ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:4: ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(280,21);
            BOOLEAN_TOK455=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag2587); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK455_tree = 
            (Object)adaptor.create(BOOLEAN_TOK455)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK455_tree);
            }
            dbg.location(280,33);
            STRING_CONSTANT_LIST456=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag2589); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST456_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST456)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST456_tree);
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
        dbg.location(283, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanBag"


    public static class dateBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:1: dateBag : ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK457=null;
        Token STRING_CONSTANT_LIST458=null;

        Object DATE_TOK457_tree=null;
        Object STRING_CONSTANT_LIST458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:2: ( ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(285,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:5: ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST
            {
            dbg.location(285,18);
            DATE_TOK457=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK457_tree = 
            (Object)adaptor.create(DATE_TOK457)
            ;
            adaptor.addChild(root_0, DATE_TOK457_tree);
            }
            dbg.location(285,27);
            STRING_CONSTANT_LIST458=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2609); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST458_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST458)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST458_tree);
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
        dbg.location(288, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateBag"


    public static class dateTimeBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:289:1: dateTimeBag : ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK459=null;
        Token STRING_CONSTANT_LIST460=null;

        Object DATETIME_TOK459_tree=null;
        Object STRING_CONSTANT_LIST460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:2: ( ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(290,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:5: ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST
            {
            dbg.location(290,22);
            DATETIME_TOK459=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag2628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK459_tree = 
            (Object)adaptor.create(DATETIME_TOK459)
            ;
            adaptor.addChild(root_0, DATETIME_TOK459_tree);
            }
            dbg.location(290,35);
            STRING_CONSTANT_LIST460=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2630); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST460_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST460)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST460_tree);
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
        dbg.location(293, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dateTimeBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dateTimeBag"


    public static class dayTimeDurationBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:1: dayTimeDurationBag : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK461=null;
        Token STRING_CONSTANT_LIST462=null;

        Object DAYTIMEDURATION_TOK461_tree=null;
        Object STRING_CONSTANT_LIST462_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:2: ( ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(295,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:5: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST
            {
            dbg.location(295,30);
            DAYTIMEDURATION_TOK461=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2650); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK461_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK461)
            ;
            adaptor.addChild(root_0, DAYTIMEDURATION_TOK461_tree);
            }
            dbg.location(295,50);
            STRING_CONSTANT_LIST462=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST462_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST462)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST462_tree);
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
        dbg.location(298, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationBag"


    public static class integerBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:1: integerBag : ( ( INTEGER_TOK )=> INTEGER_TOK STRING_CONSTANT_LIST | ( integerBag )=> ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ',' integerBag ')' );
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK463=null;
        Token STRING_CONSTANT_LIST464=null;
        Token set465=null;
        Token char_literal466=null;
        Token char_literal468=null;
        Token char_literal470=null;
        GrammarParser.integerBag_return integerBag467 =null;

        GrammarParser.integerBag_return integerBag469 =null;


        Object INTEGER_TOK463_tree=null;
        Object STRING_CONSTANT_LIST464_tree=null;
        Object set465_tree=null;
        Object char_literal466_tree=null;
        Object char_literal468_tree=null;
        Object char_literal470_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(299, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:2: ( ( INTEGER_TOK )=> INTEGER_TOK STRING_CONSTANT_LIST | ( integerBag )=> ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ',' integerBag ')' )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==INTEGER_TOK) && (synpred37_Grammar())) {
                alt27=1;
            }
            else if ( (LA27_0==INTERSECTION_TOK||LA27_0==UNION_TOK) && (synpred38_Grammar())) {
                alt27=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:4: ( INTEGER_TOK )=> INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(300,21);
                    INTEGER_TOK463=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2671); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK463_tree = 
                    (Object)adaptor.create(INTEGER_TOK463)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK463_tree);
                    }
                    dbg.location(300,33);
                    STRING_CONSTANT_LIST464=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST464_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST464)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST464_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:4: ( integerBag )=> ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ',' integerBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(302,20);
                    set465=(Token)input.LT(1);

                    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set465)
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

                    dbg.location(302,53);
                    char_literal466=(Token)match(input,80,FOLLOW_80_in_integerBag2695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal466_tree = 
                    (Object)adaptor.create(char_literal466)
                    ;
                    adaptor.addChild(root_0, char_literal466_tree);
                    }
                    dbg.location(302,57);
                    pushFollow(FOLLOW_integerBag_in_integerBag2697);
                    integerBag467=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag467.getTree());
                    dbg.location(302,68);
                    char_literal468=(Token)match(input,82,FOLLOW_82_in_integerBag2699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal468_tree = 
                    (Object)adaptor.create(char_literal468)
                    ;
                    adaptor.addChild(root_0, char_literal468_tree);
                    }
                    dbg.location(302,72);
                    pushFollow(FOLLOW_integerBag_in_integerBag2701);
                    integerBag469=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag469.getTree());
                    dbg.location(302,83);
                    char_literal470=(Token)match(input,81,FOLLOW_81_in_integerBag2703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal470_tree = 
                    (Object)adaptor.create(char_literal470)
                    ;
                    adaptor.addChild(root_0, char_literal470_tree);
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
        dbg.location(303, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerBag"


    public static class doubleBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:1: doubleBag : ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK471=null;
        Token STRING_CONSTANT_LIST472=null;

        Object DOUBLE_TOK471_tree=null;
        Object STRING_CONSTANT_LIST472_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:2: ( ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:4: ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(305,20);
            DOUBLE_TOK471=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK471_tree = 
            (Object)adaptor.create(DOUBLE_TOK471)
            ;
            adaptor.addChild(root_0, DOUBLE_TOK471_tree);
            }
            dbg.location(305,31);
            STRING_CONSTANT_LIST472=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2721); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST472_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST472)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST472_tree);
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
        dbg.location(308, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doubleBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doubleBag"


    public static class hexBinaryBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:309:1: hexBinaryBag : ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK473=null;
        Token STRING_CONSTANT_LIST474=null;

        Object HEXBINARY_TOK473_tree=null;
        Object STRING_CONSTANT_LIST474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:310:2: ( ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:310:4: ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(310,23);
            HEXBINARY_TOK473=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag2739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK473_tree = 
            (Object)adaptor.create(HEXBINARY_TOK473)
            ;
            adaptor.addChild(root_0, HEXBINARY_TOK473_tree);
            }
            dbg.location(310,37);
            STRING_CONSTANT_LIST474=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag2741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST474_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST474)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST474_tree);
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
        dbg.location(313, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hexBinaryBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hexBinaryBag"


    public static class rfc822NameBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:1: rfc822NameBag : ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST ;
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
        dbg.location(314, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:2: ( ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:4: ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(315,24);
            RFC822NAME_TOK475=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag2759); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK475_tree = 
            (Object)adaptor.create(RFC822NAME_TOK475)
            ;
            adaptor.addChild(root_0, RFC822NAME_TOK475_tree);
            }
            dbg.location(315,39);
            STRING_CONSTANT_LIST476=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag2761); if (state.failed) return retval;
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
        dbg.location(318, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rfc822NameBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rfc822NameBag"


    public static class timeBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:1: timeBag : ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK477=null;
        Token STRING_CONSTANT_LIST478=null;

        Object TIME_TOK477_tree=null;
        Object STRING_CONSTANT_LIST478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(319, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:2: ( ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:4: ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(320,17);
            TIME_TOK477=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag2778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK477_tree = 
            (Object)adaptor.create(TIME_TOK477)
            ;
            adaptor.addChild(root_0, TIME_TOK477_tree);
            }
            dbg.location(320,26);
            STRING_CONSTANT_LIST478=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag2780); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST478_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST478)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST478_tree);
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
        dbg.location(323, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeBag"


    public static class x500NameBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:1: x500NameBag : ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK479=null;
        Token STRING_CONSTANT_LIST480=null;

        Object X500NAME_TOK479_tree=null;
        Object STRING_CONSTANT_LIST480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:2: ( ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:4: ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(325,22);
            X500NAME_TOK479=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag2798); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK479_tree = 
            (Object)adaptor.create(X500NAME_TOK479)
            ;
            adaptor.addChild(root_0, X500NAME_TOK479_tree);
            }
            dbg.location(325,35);
            STRING_CONSTANT_LIST480=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST480_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST480)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST480_tree);
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
        dbg.location(328, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "x500NameBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "x500NameBag"


    public static class yearMonthDurationBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:1: yearMonthDurationBag : ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK481=null;
        Token STRING_CONSTANT_LIST482=null;

        Object YEARMONTHDURATION_TOK481_tree=null;
        Object STRING_CONSTANT_LIST482_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(329, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:2: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:4: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(330,31);
            YEARMONTHDURATION_TOK481=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK481_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK481)
            ;
            adaptor.addChild(root_0, YEARMONTHDURATION_TOK481_tree);
            }
            dbg.location(330,53);
            STRING_CONSTANT_LIST482=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST482_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST482)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST482_tree);
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
        dbg.location(333, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationBag"


    public static class anyBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:342:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag483 =null;

        GrammarParser.integerBag_return integerBag484 =null;

        GrammarParser.doubleBag_return doubleBag485 =null;

        GrammarParser.stringBag_return stringBag486 =null;

        GrammarParser.anyUriBag_return anyUriBag487 =null;

        GrammarParser.dateBag_return dateBag488 =null;

        GrammarParser.timeBag_return timeBag489 =null;

        GrammarParser.dateTimeBag_return dateTimeBag490 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag491 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag492 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag493 =null;

        GrammarParser.x500NameBag_return x500NameBag494 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag495 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag496 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt28=14;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            switch ( input.LA(1) ) {
            case BOOLEAN_TOK:
                {
                alt28=1;
                }
                break;
            case INTEGER_TOK:
            case INTERSECTION_TOK:
            case UNION_TOK:
                {
                alt28=2;
                }
                break;
            case DOUBLE_TOK:
                {
                alt28=3;
                }
                break;
            case STRING_TOK:
                {
                alt28=4;
                }
                break;
            case ANYURI_TOK:
                {
                alt28=5;
                }
                break;
            case DATE_TOK:
                {
                alt28=6;
                }
                break;
            case TIME_TOK:
                {
                alt28=7;
                }
                break;
            case DATETIME_TOK:
                {
                alt28=8;
                }
                break;
            case BASE64BINARY_TOK:
                {
                alt28=9;
                }
                break;
            case DAYTIMEDURATION_TOK:
                {
                alt28=10;
                }
                break;
            case YEARMONTHDURATION_TOK:
                {
                alt28=11;
                }
                break;
            case X500NAME_TOK:
                {
                alt28=12;
                }
                break;
            case RFC822NAME_TOK:
                {
                alt28=13;
                }
                break;
            case HEXBINARY_TOK:
                {
                alt28=14;
                }
                break;
            default:
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag2840);
                    booleanBag483=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag483.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag2844);
                    integerBag484=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag484.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag2848);
                    doubleBag485=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag485.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag2852);
                    stringBag486=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag486.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag2856);
                    anyUriBag487=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag487.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(343,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag2860);
                    dateBag488=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag488.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(344,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag2865);
                    timeBag489=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag489.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(344,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag2869);
                    dateTimeBag490=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag490.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(344,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag2873);
                    base64BinaryBag491=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag491.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(344,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag2877);
                    dayTimeDurationBag492=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag492.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(345,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag2882);
                    yearMonthDurationBag493=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag493.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(345,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag2887);
                    x500NameBag494=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag494.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(346,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag2892);
                    rfc822NameBag495=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag495.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(346,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag2896);
                    hexBinaryBag496=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag496.getTree());

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
        dbg.location(347, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyBag"

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:6: base64BinaryExpr
        {
        dbg.location(135,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred3_Grammar886);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:4: ( dayTimeDurationExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:5: dayTimeDurationExpr
        {
        dbg.location(149,5);
        pushFollow(FOLLOW_dayTimeDurationExpr_in_synpred4_Grammar1205);
        dayTimeDurationExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:5: base64BinaryExpr
        {
        dbg.location(150,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred5_Grammar1240);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:5: base64BinaryExpr
        {
        dbg.location(165,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred6_Grammar1448);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:5: booleanBag
        {
        dbg.location(169,5);
        pushFollow(FOLLOW_booleanBag_in_synpred7_Grammar1475);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:5: integerBag
        {
        dbg.location(170,5);
        pushFollow(FOLLOW_integerBag_in_synpred8_Grammar1508);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:5: doubleBag
        {
        dbg.location(171,5);
        pushFollow(FOLLOW_doubleBag_in_synpred9_Grammar1543);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:5: stringBag
        {
        dbg.location(172,5);
        pushFollow(FOLLOW_stringBag_in_synpred10_Grammar1578);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:5: dateBag
        {
        dbg.location(173,5);
        pushFollow(FOLLOW_dateBag_in_synpred11_Grammar1614);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:5: timeBag
        {
        dbg.location(174,5);
        pushFollow(FOLLOW_timeBag_in_synpred12_Grammar1650);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:5: dateTimeBag
        {
        dbg.location(175,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred13_Grammar1686);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:5: base64BinaryBag
        {
        dbg.location(176,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred14_Grammar1722);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:5: dayTimeDurationBag
        {
        dbg.location(177,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred15_Grammar1758);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:5: yearMonthDurationBag
        {
        dbg.location(178,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred16_Grammar1794);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:5: anyUriBag
        {
        dbg.location(179,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred17_Grammar1830);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Grammar

    // $ANTLR start synpred18_Grammar
    public final void synpred18_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:5: x500NameBag
        {
        dbg.location(180,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred18_Grammar1866);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Grammar

    // $ANTLR start synpred19_Grammar
    public final void synpred19_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:5: rfc822NameBag
        {
        dbg.location(181,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred19_Grammar1902);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_Grammar

    // $ANTLR start synpred20_Grammar
    public final void synpred20_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:5: hexBinaryBag
        {
        dbg.location(182,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred20_Grammar1938);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Grammar

    // $ANTLR start synpred21_Grammar
    public final void synpred21_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:5: base64BinaryBag
        {
        dbg.location(183,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred21_Grammar1974);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Grammar

    // $ANTLR start synpred22_Grammar
    public final void synpred22_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( STRING_CONSTANT )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:5: STRING_CONSTANT
        {
        dbg.location(203,5);
        match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_synpred22_Grammar2088); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_Grammar

    // $ANTLR start synpred23_Grammar
    public final void synpred23_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: ( stringExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:5: stringExpr
        {
        dbg.location(218,5);
        pushFollow(FOLLOW_stringExpr_in_synpred23_Grammar2184);
        stringExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Grammar

    // $ANTLR start synpred24_Grammar
    public final void synpred24_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( DATETIME_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:5: DATETIME_TOK
        {
        dbg.location(233,5);
        match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_synpred24_Grammar2270); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Grammar

    // $ANTLR start synpred25_Grammar
    public final void synpred25_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:5: dateTimeBag
        {
        dbg.location(234,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred25_Grammar2287);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Grammar

    // $ANTLR start synpred26_Grammar
    public final void synpred26_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:5: ( BASE64BINARY_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:6: BASE64BINARY_TOK
        {
        dbg.location(238,6);
        match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_synpred26_Grammar2313); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_Grammar

    // $ANTLR start synpred27_Grammar
    public final void synpred27_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:5: base64BinaryBag
        {
        dbg.location(239,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred27_Grammar2331);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_Grammar

    // $ANTLR start synpred28_Grammar
    public final void synpred28_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( DAYTIMEDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:5: DAYTIMEDURATION_TOK
        {
        dbg.location(242,5);
        match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_synpred28_Grammar2355); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_Grammar

    // $ANTLR start synpred29_Grammar
    public final void synpred29_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:5: dayTimeDurationBag
        {
        dbg.location(243,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred29_Grammar2372);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred29_Grammar

    // $ANTLR start synpred30_Grammar
    public final void synpred30_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:5: ( YEARMONTHDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:6: YEARMONTHDURATION_TOK
        {
        dbg.location(247,6);
        match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_synpred30_Grammar2398); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_Grammar

    // $ANTLR start synpred31_Grammar
    public final void synpred31_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:5: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:6: yearMonthDurationBag
        {
        dbg.location(248,6);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred31_Grammar2417);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_Grammar

    // $ANTLR start synpred37_Grammar
    public final void synpred37_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:4: ( INTEGER_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:5: INTEGER_TOK
        {
        dbg.location(300,5);
        match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_synpred37_Grammar2666); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred37_Grammar

    // $ANTLR start synpred38_Grammar
    public final void synpred38_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:5: integerBag
        {
        dbg.location(302,5);
        pushFollow(FOLLOW_integerBag_in_synpred38_Grammar2680);
        integerBag();

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
    public final boolean synpred23_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred23_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred26_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred26_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred30_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred30_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred3_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred27_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred27_Grammar_fragment(); // can never throw exception
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
    static final String DFA6_eotS =
        "\u00cc\uffff";
    static final String DFA6_eofS =
        "\u00cc\uffff";
    static final String DFA6_minS =
        "\1\5\2\uffff\1\102\3\uffff\2\123\14\102\1\123\1\uffff\1\46\1\51"+
        "\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123"+
        "\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\uffff\1\120\1\uffff\1"+
        "\123\1\64\1\121\1\123\1\102\1\64\1\121\1\123\1\102\1\64\1\121\1"+
        "\123\1\102\1\64\1\121\1\123\1\102\1\64\1\121\1\123\1\102\1\64\1"+
        "\121\1\123\1\102\1\64\1\121\1\123\1\102\1\64\1\121\1\123\1\102\1"+
        "\64\1\121\1\123\1\102\1\64\1\121\1\123\1\102\1\64\1\121\1\46\1\120"+
        "\1\123\1\51\1\123\1\120\1\123\1\51\1\123\1\120\1\123\1\51\1\123"+
        "\1\120\1\123\1\51\1\123\1\120\1\123\1\51\1\123\1\120\1\123\1\51"+
        "\1\123\1\120\1\123\1\51\1\123\1\120\1\123\1\51\1\123\1\120\1\123"+
        "\1\51\1\123\1\120\1\123\1\51\2\123\2\121\1\64\2\121\1\64\2\121\1"+
        "\64\2\121\1\64\2\121\1\64\2\121\1\64\2\121\1\64\2\121\1\64\2\121"+
        "\1\64\2\121\1\64\1\123\1\120\1\123\1\120\1\123\1\120\1\123\1\120"+
        "\1\123\1\120\1\123\1\120\1\123\1\120\1\123\1\120\1\123\1\120\1\123"+
        "\1\120\24\121";
    static final String DFA6_maxS =
        "\1\120\2\uffff\1\120\3\uffff\1\130\1\123\1\102\13\120\1\130\1\uffff"+
        "\1\113\1\51\1\123\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123"+
        "\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123\1\104\1\123\1\104"+
        "\1\123\1\uffff\1\120\1\uffff\1\130\1\100\1\121\1\123\1\102\1\100"+
        "\1\121\1\123\1\102\1\100\1\121\1\123\1\102\1\100\1\121\1\123\1\102"+
        "\1\100\1\121\1\123\1\102\1\100\1\121\1\123\1\102\1\100\1\121\1\123"+
        "\1\102\1\100\1\121\1\123\1\102\1\100\1\121\1\123\1\102\1\100\1\121"+
        "\1\123\1\102\1\100\1\121\1\113\1\120\1\130\1\51\1\123\1\120\1\130"+
        "\1\51\1\123\1\120\1\130\1\51\1\123\1\120\1\130\1\51\1\123\1\120"+
        "\1\130\1\51\1\123\1\120\1\130\1\51\1\123\1\120\1\130\1\51\1\123"+
        "\1\120\1\130\1\51\1\123\1\120\1\130\1\51\1\123\1\120\1\130\1\51"+
        "\1\123\1\130\1\121\1\123\1\64\1\121\1\123\1\64\1\121\1\123\1\64"+
        "\1\121\1\123\1\64\1\121\1\123\1\64\1\121\1\123\1\64\1\121\1\123"+
        "\1\64\1\121\1\123\1\64\1\121\1\123\1\64\1\121\1\123\1\64\1\130\1"+
        "\120\1\130\1\120\1\130\1\120\1\130\1\120\1\130\1\120\1\130\1\120"+
        "\1\130\1\120\1\130\1\120\1\130\1\120\1\130\1\120\24\121";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\17\uffff\1\3\27\uffff\1\7\1"+
        "\uffff\1\10\u009b\uffff";
    static final String DFA6_specialS =
        "\u00cc\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\7\uffff\1\13\2\uffff\1\17\1\3\3\uffff\1\16\1\14\1\20\3"+
            "\uffff\1\25\1\12\1\10\2\uffff\1\2\1\uffff\1\24\2\uffff\3\6\7"+
            "\uffff\1\4\2\uffff\1\4\7\uffff\1\10\1\23\5\uffff\1\7\1\uffff"+
            "\1\11\1\10\2\uffff\1\15\1\1\1\uffff\1\6\2\uffff\1\22\1\21\1"+
            "\uffff\1\5",
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
            "\1\64\27\uffff\1\64\34\uffff\1\64\6\uffff\1\63\1\uffff\1\65"+
            "\1\64",
            "\1\66",
            "\1\70\27\uffff\1\70\34\uffff\1\70\6\uffff\1\67\1\uffff\1\71"+
            "\1\70",
            "\1\72",
            "\1\74\27\uffff\1\74\34\uffff\1\74\6\uffff\1\73\1\uffff\1\75"+
            "\1\74",
            "\1\76",
            "\1\100\27\uffff\1\100\34\uffff\1\100\6\uffff\1\77\1\uffff\1"+
            "\101\1\100",
            "\1\102",
            "\1\104\27\uffff\1\104\34\uffff\1\104\6\uffff\1\103\1\uffff"+
            "\1\105\1\104",
            "\1\106",
            "\1\110\27\uffff\1\110\34\uffff\1\110\6\uffff\1\107\1\uffff"+
            "\1\111\1\110",
            "\1\112",
            "\1\114\27\uffff\1\114\34\uffff\1\114\6\uffff\1\113\1\uffff"+
            "\1\115\1\114",
            "\1\116",
            "\1\120\27\uffff\1\120\34\uffff\1\120\6\uffff\1\117\1\uffff"+
            "\1\121\1\120",
            "\1\122",
            "\1\124\27\uffff\1\124\34\uffff\1\124\6\uffff\1\123\1\uffff"+
            "\1\125\1\124",
            "\1\126",
            "\1\130\27\uffff\1\130\34\uffff\1\130\6\uffff\1\127\1\uffff"+
            "\1\131\1\130",
            "\1\132",
            "",
            "\1\133",
            "",
            "\1\134\5\6",
            "\1\135\13\uffff\1\6",
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
            "\1\6\1\uffff\1\56\1\61\2\uffff\1\6\2\60\34\uffff\1\57",
            "\1\u0086",
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
            "\1\136\1\uffff\1\137",
            "\1\u00a5",
            "\1\u00a6",
            "\1\142\1\uffff\1\143",
            "\1\u00a7",
            "\1\u00a8",
            "\1\146\1\uffff\1\147",
            "\1\u00a9",
            "\1\u00aa",
            "\1\152\1\uffff\1\153",
            "\1\u00ab",
            "\1\u00ac",
            "\1\156\1\uffff\1\157",
            "\1\u00ad",
            "\1\u00ae",
            "\1\162\1\uffff\1\163",
            "\1\u00af",
            "\1\u00b0",
            "\1\166\1\uffff\1\167",
            "\1\u00b1",
            "\1\u00b2",
            "\1\172\1\uffff\1\173",
            "\1\u00b3",
            "\1\u00b4",
            "\1\176\1\uffff\1\177",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u0082\1\uffff\1\u0083",
            "\1\u00b7",
            "\1\27\5\6",
            "\1\u00b8",
            "\1\56\5\6",
            "\1\u00b9",
            "\1\56\5\6",
            "\1\u00ba",
            "\1\56\5\6",
            "\1\u00bb",
            "\1\56\5\6",
            "\1\u00bc",
            "\1\56\5\6",
            "\1\u00bd",
            "\1\56\5\6",
            "\1\u00be",
            "\1\56\5\6",
            "\1\u00bf",
            "\1\56\5\6",
            "\1\u00c0",
            "\1\56\5\6",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
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
        "\62\uffff";
    static final String DFA9_eofS =
        "\62\uffff";
    static final String DFA9_minS =
        "\1\5\1\uffff\2\123\1\102\4\uffff\1\102\5\uffff\1\50\1\51\1\123\1"+
        "\5\1\123\1\uffff\1\123\1\64\1\121\1\123\1\102\1\64\1\50\1\120\1"+
        "\123\1\51\1\123\1\120\1\121\1\50\1\121\1\64\1\121\1\123\2\120\1"+
        "\123\1\20\1\121\1\102\2\121\1\0\2\uffff";
    static final String DFA9_maxS =
        "\1\116\1\uffff\2\123\1\102\4\uffff\1\120\5\uffff\1\113\1\51\1\123"+
        "\1\104\1\123\1\uffff\1\123\1\64\1\121\1\123\1\102\1\64\1\113\1\120"+
        "\1\123\1\51\1\123\1\120\1\121\1\50\1\123\1\64\1\121\1\123\2\120"+
        "\1\123\1\20\1\121\1\102\2\121\1\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\5\uffff\1\2\33\uffff\1\7\1\15";
    static final String DFA9_specialS =
        "\57\uffff\1\0\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\7\uffff\1\5\2\uffff\1\11\4\uffff\1\10\1\6\1\12\3\uffff"+
            "\2\1\1\3\4\uffff\1\16\27\uffff\1\3\1\15\5\uffff\1\2\1\uffff"+
            "\1\4\1\3\2\uffff\1\7\5\uffff\1\14\1\13",
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
            "\1\30\27\uffff\1\30\34\uffff\1\30\6\uffff\1\27\1\uffff\1\31"+
            "\1\30",
            "\1\32",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\24\1\25\41\uffff\1\5",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\35\1\uffff\1\36",
            "\1\50",
            "\1\51",
            "\1\17",
            "\1\52",
            "\1\53",
            "\1\42",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\35",
            "\1\57",
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
            return "122:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_47 = input.LA(1);

                         
                        int index9_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 48;}

                        else if ( (synpred3_Grammar()) ) {s = 49;}

                         
                        input.seek(index9_47);

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
        "\1\5\1\uffff\2\123\13\102\1\uffff\1\46\1\uffff\1\51\2\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\12\64\1\46"+
        "\1\120\2\uffff\1\121\1\123";
    static final String DFA10_maxS =
        "\1\116\1\uffff\1\130\1\123\1\102\12\120\1\uffff\1\113\1\uffff\1"+
        "\51\2\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123"+
        "\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\130\12\100\1\113\1\120\2\uffff\1\121\1\130";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\15\uffff\1\14\1\13\2\uffff";
    static final String DFA10_specialS =
        "\12\uffff\1\1\1\3\40\uffff\1\0\1\2\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\7\uffff\1\6\2\uffff\1\12\1\1\3\uffff\1\11\1\7\1\13\3\uffff"+
            "\1\17\1\5\1\3\4\uffff\1\1\2\uffff\3\1\22\uffff\1\3\1\16\5\uffff"+
            "\1\2\1\uffff\1\4\1\3\2\uffff\1\10\2\uffff\1\1\2\uffff\1\15\1"+
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
            "\1\61\5\21",
            "\1\62\13\uffff\1\1",
            "\1\25\13\uffff\1\1",
            "\1\27\13\uffff\1\1",
            "\1\31\13\uffff\1\1",
            "\1\33\13\uffff\1\1",
            "\1\63\13\uffff\1\1",
            "\1\64\13\uffff\1\1",
            "\1\41\13\uffff\1\1",
            "\1\43\13\uffff\1\1",
            "\1\45\13\uffff\1\1",
            "\1\1\2\uffff\1\46\2\uffff\1\1\36\uffff\1\25",
            "\1\65",
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
            return "138:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_44 = input.LA(1);

                         
                        int index10_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_44==SIZE_TOK) ) {s = 1;}

                        else if ( (LA10_44==ONEANDONLY_TOK) && (synpred5_Grammar())) {s = 51;}

                         
                        input.seek(index10_44);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_10==STRING_CONSTANT_LIST) ) {s = 28;}

                        else if ( (LA10_10==80) && (synpred5_Grammar())) {s = 29;}

                         
                        input.seek(index10_10);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_45 = input.LA(1);

                         
                        int index10_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_45==SIZE_TOK) ) {s = 1;}

                        else if ( (LA10_45==ONEANDONLY_TOK) && (synpred4_Grammar())) {s = 52;}

                         
                        input.seek(index10_45);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA10_11==STRING_CONSTANT_LIST) ) {s = 30;}

                        else if ( (LA10_11==80) && (synpred4_Grammar())) {s = 31;}

                         
                        input.seek(index10_11);

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
        "\1\5\1\uffff\2\123\13\102\1\uffff\1\46\1\51\2\123\1\uffff\1\123"+
        "\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\2\uffff\1\123\12\64\1\46\1\120"+
        "\1\uffff\1\121\1\123";
    static final String DFA11_maxS =
        "\1\116\1\uffff\2\123\1\102\12\120\1\uffff\1\113\1\51\2\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\123\1\uffff\1\123\1\uffff\1\123\2\uffff\1\123\12\100\1"+
        "\113\1\120\1\uffff\1\121\1\123";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\3\15\uffff\1\14\2\uffff";
    static final String DFA11_specialS =
        "\12\uffff\1\1\41\uffff\1\0\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\7\uffff\1\6\2\uffff\1\12\1\1\3\uffff\1\11\1\7\1\13\3\uffff"+
            "\1\17\1\5\1\3\4\uffff\1\1\2\uffff\3\1\22\uffff\1\3\1\16\5\uffff"+
            "\1\2\1\uffff\1\4\1\3\2\uffff\1\10\2\uffff\1\1\2\uffff\1\15\1"+
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
            "\1\61",
            "\1\62\13\uffff\1\1",
            "\1\24\13\uffff\1\1",
            "\1\26\13\uffff\1\1",
            "\1\30\13\uffff\1\1",
            "\1\32\13\uffff\1\1",
            "\1\63\13\uffff\1\1",
            "\1\36\13\uffff\1\1",
            "\1\40\13\uffff\1\1",
            "\1\42\13\uffff\1\1",
            "\1\44\13\uffff\1\1",
            "\1\1\2\uffff\1\46\2\uffff\1\1\14\uffff\1\45\21\uffff\1\24",
            "\1\64",
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
            return "153:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_44 = input.LA(1);

                         
                        int index11_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_44==SIZE_TOK) ) {s = 1;}

                        else if ( (LA11_44==ONEANDONLY_TOK) && (synpred6_Grammar())) {s = 51;}

                         
                        input.seek(index11_44);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_10==STRING_CONSTANT_LIST) ) {s = 27;}

                        else if ( (LA11_10==80) && (synpred6_Grammar())) {s = 28;}

                         
                        input.seek(index11_10);

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
    public static final BitSet FOLLOW_IF_TOK_in_target476 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
    public static final BitSet FOLLOW_booleanExpr_in_target478 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_target480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule491 = new BitSet(new long[]{0x0000000000000200L,0x0000000002000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule494 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_rule497 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_set_in_rule499 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule507 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
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
    public static final BitSet FOLLOW_80_in_booleanExpr557 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_booleanExpr566 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
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
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr627 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalOrExpr630 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr632 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_conditionalAndExpr662 = new BitSet(new long[]{0x0C0480E538E32020L,0x000000000001659AL});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp683 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp688 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp700 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_stringBag_in_isInOp707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp717 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp722 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp734 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp739 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp751 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeBag_in_isInOp758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp768 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp773 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp785 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp790 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp802 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp807 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp819 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp836 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp853 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp858 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp870 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp875 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp893 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_isInOp898 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr913 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr915 = new BitSet(new long[]{0x0C0000E430E32020L,0x000000000000649AL});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr942 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr944 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr971 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr973 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1002 = new BitSet(new long[]{0x0400000020002020L,0x000000000000001AL});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1031 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1089 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1176 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1212 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1284 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1288 = new BitSet(new long[]{0x0C0000E430E32020L,0x000000000000649AL});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1299 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1303 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1314 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1318 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1329 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1333 = new BitSet(new long[]{0x0400000020002020L,0x000000000000001AL});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1344 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1359 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1374 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1378 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1389 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1393 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1404 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1419 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1434 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1438 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1455 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_regexOp1459 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1482 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1515 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1532 = new BitSet(new long[]{0x000000C000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1550 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1567 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1586 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1622 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1639 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1658 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1694 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1711 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1730 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1747 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1766 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1783 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1802 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1838 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1874 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1910 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1927 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp1930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1946 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1963 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp1981 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_bagOp1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_bagOp1998 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2021 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerExpr2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerExpr2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_doubleExpr2070 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_doubleExpr2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringExpr2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_stringExpr2106 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_stringExpr2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stringExpr2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_attributeExpr2142 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2160 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2172 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_anyUriExpr2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateExpr2211 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateExpr2222 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateExpr2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timeExpr2241 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_timeExpr2252 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timeExpr2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateTimeExpr2277 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateTimeExpr2294 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dateTimeExpr2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_base64BinaryExpr2320 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_base64BinaryExpr2338 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_base64BinaryExpr2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dayTimeDurationExpr2362 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dayTimeDurationExpr2379 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_dayTimeDurationExpr2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_yearMonthDurationExpr2405 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_yearMonthDurationExpr2424 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_yearMonthDurationExpr2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr2441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_x500NameExpr2443 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_x500NameExpr2455 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_x500NameExpr2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rfc822NameExpr2474 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rfc822NameExpr2485 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rfc822NameExpr2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_hexBinaryExpr2504 = new BitSet(new long[]{0x0400000020000020L,0x000000000000001AL});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_hexBinaryExpr2515 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_hexBinaryExpr2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerBag2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_integerBag2695 = new BitSet(new long[]{0x000000C000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerBag2699 = new BitSet(new long[]{0x000000C000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerBag2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag2739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred3_Grammar886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_synpred4_Grammar1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred5_Grammar1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred6_Grammar1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred7_Grammar1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred8_Grammar1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred9_Grammar1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred10_Grammar1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred11_Grammar1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred12_Grammar1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred13_Grammar1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred14_Grammar1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred15_Grammar1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred16_Grammar1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred17_Grammar1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred18_Grammar1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred19_Grammar1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred20_Grammar1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred21_Grammar1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_synpred22_Grammar2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_synpred23_Grammar2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_synpred24_Grammar2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred25_Grammar2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_synpred26_Grammar2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred27_Grammar2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_synpred28_Grammar2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred29_Grammar2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_synpred30_Grammar2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred31_Grammar2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_synpred37_Grammar2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred38_Grammar2680 = new BitSet(new long[]{0x0000000000000002L});

}