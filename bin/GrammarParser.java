// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-06-25 07:02:19

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_TOK", "ACTION_TOK", "ALLOFALL_TOK", "ALLOFANY_TOK", "ALLOF_TOK", "ANYCASEIDENTIFIER", "ANYOFALL_TOK", "ANYOFANY_TOK", "ANYOF_TOK", "ANYURI_TOK", "ATLEASTONEMENBEROF_TOK", "BAG_TOK", "BASE64BINARY_TOK", "BOOLEAN_TOK", "CHAR", "COMMENT", "CONCATENATE_TOK", "CONTAINS_TOK", "DATETIME_TOK", "DATE_TOK", "DAYTIMEDURATION_TOK", "DECIMAL_TOK", "DENY_TOK", "DEREF_TOK", "DOUBLE_CONSTANT", "DOUBLE_TOK", "ENVIRONMENT_TOK", "ESC_SEQ", "EXPONENT", "FALSE_TOK", "FLR_TOK", "HEXBINARY_TOK", "HEX_DIGIT", "IF_TOK", "INTEGER_CONSTANT", "INTEGER_TOK", "INTERSECTION_TOK", "ISIN_TOK", "LOWERCASEIDENTIFIER", "MAP_TOK", "MATCH_TOK", "NODECOUNT_TOK", "NODEEQUAL_TOK", "NODEMATCH_TOK", "NOF_TOK", "NORMALIZESPACE_TOK", "NORMALIZETOLOWERCASE_TOK", "NOT_TOK", "OCTAL_ESC", "ONEANDONLY_TOK", "PERMIT_TOK", "POLICYSET_TOK", "POLICY_TOK", "RANGEOP_TOK", "REGEXMATCH_TOK", "RESOURCE_TOK", "RFC822NAME_TOK", "RND_TOK", "RULE_TOK", "SETEQUALS_TOK", "SIGN", "SIZE_TOK", "STRING_CONSTANT", "STRING_CONSTANT_LIST", "STRING_TOK", "SUBJECT_TOK", "SUBSET_TOK", "TARGET_TOK", "TIME_TOK", "TRUE_TOK", "UNICODE_ESC", "UNION_TOK", "URI_TOK", "WHITESPACE", "X500NAME_TOK", "YEARMONTHDURATION_TOK", "'&&'", "'('", "')'", "','", "'.'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__92=92;
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
    public static final int CONTAINS_TOK=21;
    public static final int DATETIME_TOK=22;
    public static final int DATE_TOK=23;
    public static final int DAYTIMEDURATION_TOK=24;
    public static final int DECIMAL_TOK=25;
    public static final int DENY_TOK=26;
    public static final int DEREF_TOK=27;
    public static final int DOUBLE_CONSTANT=28;
    public static final int DOUBLE_TOK=29;
    public static final int ENVIRONMENT_TOK=30;
    public static final int ESC_SEQ=31;
    public static final int EXPONENT=32;
    public static final int FALSE_TOK=33;
    public static final int FLR_TOK=34;
    public static final int HEXBINARY_TOK=35;
    public static final int HEX_DIGIT=36;
    public static final int IF_TOK=37;
    public static final int INTEGER_CONSTANT=38;
    public static final int INTEGER_TOK=39;
    public static final int INTERSECTION_TOK=40;
    public static final int ISIN_TOK=41;
    public static final int LOWERCASEIDENTIFIER=42;
    public static final int MAP_TOK=43;
    public static final int MATCH_TOK=44;
    public static final int NODECOUNT_TOK=45;
    public static final int NODEEQUAL_TOK=46;
    public static final int NODEMATCH_TOK=47;
    public static final int NOF_TOK=48;
    public static final int NORMALIZESPACE_TOK=49;
    public static final int NORMALIZETOLOWERCASE_TOK=50;
    public static final int NOT_TOK=51;
    public static final int OCTAL_ESC=52;
    public static final int ONEANDONLY_TOK=53;
    public static final int PERMIT_TOK=54;
    public static final int POLICYSET_TOK=55;
    public static final int POLICY_TOK=56;
    public static final int RANGEOP_TOK=57;
    public static final int REGEXMATCH_TOK=58;
    public static final int RESOURCE_TOK=59;
    public static final int RFC822NAME_TOK=60;
    public static final int RND_TOK=61;
    public static final int RULE_TOK=62;
    public static final int SETEQUALS_TOK=63;
    public static final int SIGN=64;
    public static final int SIZE_TOK=65;
    public static final int STRING_CONSTANT=66;
    public static final int STRING_CONSTANT_LIST=67;
    public static final int STRING_TOK=68;
    public static final int SUBJECT_TOK=69;
    public static final int SUBSET_TOK=70;
    public static final int TARGET_TOK=71;
    public static final int TIME_TOK=72;
    public static final int TRUE_TOK=73;
    public static final int UNICODE_ESC=74;
    public static final int UNION_TOK=75;
    public static final int URI_TOK=76;
    public static final int WHITESPACE=77;
    public static final int X500NAME_TOK=78;
    public static final int YEARMONTHDURATION_TOK=79;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred8_Grammar", "dateExpr", "equalityExpr", "synpred6_Grammar", 
    "doubleBag", "regexOp", "hexBinaryBag", "synpred22_Grammar", "timeExpr", 
    "synpred16_Grammar", "anyUriExpr", "yearMonthDurationExpr", "synpred18_Grammar", 
    "parseFile", "dayTimeDurationExpr", "synpred7_Grammar", "synpred36_Grammar", 
    "synpred5_Grammar", "synpred11_Grammar", "synpred15_Grammar", "synpred1_Grammar", 
    "synpred37_Grammar", "rule", "dayTimeDurationBag", "rfc822NameExpr", 
    "synpred4_Grammar", "synpred43_Grammar", "timeBag", "synpred29_Grammar", 
    "conditionalAndExpr", "synpred28_Grammar", "synpred20_Grammar", "synpred13_Grammar", 
    "stringExpr", "synpred31_Grammar", "x500NameBag", "synpred17_Grammar", 
    "synpred9_Grammar", "integerExpr", "synpred41_Grammar", "integerBag", 
    "containsOp", "synpred19_Grammar", "synpred39_Grammar", "doubleExpr", 
    "synpred34_Grammar", "synpred38_Grammar", "synpred30_Grammar", "synpred10_Grammar", 
    "synpred27_Grammar", "conditionalOrExpr", "synpred14_Grammar", "rfc822NameBag", 
    "hexBinaryExpr", "yearMonthDurationBag", "base64BinaryBag", "x500NameExpr", 
    "synpred32_Grammar", "target", "synpred24_Grammar", "booleanBag", "anyUriBag", 
    "synpred26_Grammar", "booleanExpr", "anyBag", "base64BinaryExpr", "stringBag", 
    "synpred35_Grammar", "synpred21_Grammar", "synpred42_Grammar", "synpred33_Grammar", 
    "synpred40_Grammar", "dateTimeExpr", "synpred3_Grammar", "synpred12_Grammar", 
    "synpred23_Grammar", "isInOp", "synpred25_Grammar", "bagOp", "dateTimeBag", 
    "dateBag", "synpred2_Grammar", "attributeExpr", "policy"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, true, true, 
        false, false, true, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:86:1: parseFile : policy EOF ;
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
        dbg.location(86, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:87:2: ( policy EOF )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:87:4: policy EOF
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(87,4);
            pushFollow(FOLLOW_policy_in_parseFile430);
            policy1=policy();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());
            dbg.location(87,11);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parseFile432); if (state.failed) return retval;
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
        dbg.location(88, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:1: policy : POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' ;
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
        dbg.location(90, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:2: ( POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:4: POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(91,14);
            POLICY_TOK3=(Token)match(input,POLICY_TOK,FOLLOW_POLICY_TOK_in_policy443); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY_TOK3_tree = 
            (Object)adaptor.create(POLICY_TOK3)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICY_TOK3_tree, root_0);
            }
            dbg.location(91,16);
            ANYCASEIDENTIFIER4=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER4_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER4)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER4_tree);
            }
            dbg.location(91,34);
            LOWERCASEIDENTIFIER5=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER5_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER5_tree);
            }
            dbg.location(91,54);
            char_literal6=(Token)match(input,90,FOLLOW_90_in_policy450); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = 
            (Object)adaptor.create(char_literal6)
            ;
            adaptor.addChild(root_0, char_literal6_tree);
            }
            dbg.location(91,58);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:58: ( target )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:58: target
                    {
                    dbg.location(91,58);
                    pushFollow(FOLLOW_target_in_policy452);
                    target7=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(91,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:66: ( rule )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:91:66: rule
                    {
                    dbg.location(91,66);
                    pushFollow(FOLLOW_rule_in_policy455);
                    rule8=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(91,72);
            char_literal9=(Token)match(input,92,FOLLOW_92_in_policy458); if (state.failed) return retval;
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
        dbg.location(92, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:1: target : TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' ;
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
        dbg.location(94, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:95:2: ( TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:95:4: TARGET_TOK ^ '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(95,14);
            TARGET_TOK10=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target469); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK10_tree = 
            (Object)adaptor.create(TARGET_TOK10)
            ;
            root_0 = (Object)adaptor.becomeRoot(TARGET_TOK10_tree, root_0);
            }
            dbg.location(95,16);
            char_literal11=(Token)match(input,90,FOLLOW_90_in_target472); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);
            }
            dbg.location(95,20);
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

            dbg.location(95,44);
            IF_TOK13=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_target482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK13_tree = 
            (Object)adaptor.create(IF_TOK13)
            ;
            adaptor.addChild(root_0, IF_TOK13_tree);
            }
            dbg.location(95,51);
            pushFollow(FOLLOW_booleanExpr_in_target484);
            booleanExpr14=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr14.getTree());
            dbg.location(95,63);
            char_literal15=(Token)match(input,92,FOLLOW_92_in_target486); if (state.failed) return retval;
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
        dbg.location(96, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:98:1: rule : RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' ;
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
        dbg.location(98, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:99:2: ( RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:99:4: RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(99,12);
            RULE_TOK16=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK16_tree = 
            (Object)adaptor.create(RULE_TOK16)
            ;
            root_0 = (Object)adaptor.becomeRoot(RULE_TOK16_tree, root_0);
            }
            dbg.location(99,14);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:99:14: ( ANYCASEIDENTIFIER )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:99:14: ANYCASEIDENTIFIER
                    {
                    dbg.location(99,14);
                    ANYCASEIDENTIFIER17=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule500); if (state.failed) return retval;
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

            dbg.location(99,33);
            char_literal18=(Token)match(input,90,FOLLOW_90_in_rule503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);
            }
            dbg.location(99,37);
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

            dbg.location(99,61);
            IF_TOK20=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_rule513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK20_tree = 
            (Object)adaptor.create(IF_TOK20)
            ;
            adaptor.addChild(root_0, IF_TOK20_tree);
            }
            dbg.location(99,68);
            pushFollow(FOLLOW_booleanExpr_in_rule515);
            booleanExpr21=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr21.getTree());
            dbg.location(99,80);
            char_literal22=(Token)match(input,92,FOLLOW_92_in_rule517); if (state.failed) return retval;
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
        dbg.location(100, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:102:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' );
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
        Token char_literal41=null;
        Token NODEEQUAL_TOK42=null;
        Token NODEMATCH_TOK43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        GrammarParser.attributeExpr_return attributeExpr27 =null;

        GrammarParser.booleanExpr_return booleanExpr32 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr35 =null;

        GrammarParser.equalityExpr_return equalityExpr37 =null;

        GrammarParser.isInOp_return isInOp38 =null;

        GrammarParser.containsOp_return containsOp39 =null;

        GrammarParser.stringExpr_return stringExpr40 =null;

        GrammarParser.stringExpr_return stringExpr45 =null;


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
        Object char_literal41_tree=null;
        Object NODEEQUAL_TOK42_tree=null;
        Object NODEMATCH_TOK43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:103:2: ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' )
            int alt6=9;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:103:4: TRUE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(103,12);
                    TRUE_TOK23=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr528); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:104:4: FALSE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(104,13);
                    FALSE_TOK24=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr534); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:4: BOOLEAN_TOK ^ '(' attributeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(105,15);
                    BOOLEAN_TOK25=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanExpr540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_TOK25_tree = 
                    (Object)adaptor.create(BOOLEAN_TOK25)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK25_tree, root_0);
                    }
                    dbg.location(105,17);
                    char_literal26=(Token)match(input,81,FOLLOW_81_in_booleanExpr543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal26_tree = 
                    (Object)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    dbg.location(105,21);
                    pushFollow(FOLLOW_attributeExpr_in_booleanExpr545);
                    attributeExpr27=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr27.getTree());
                    dbg.location(105,35);
                    char_literal28=(Token)match(input,82,FOLLOW_82_in_booleanExpr547); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:106:4: ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(106,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:106:4: ( NOF_TOK ^| NOT_TOK ^)
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:106:6: NOF_TOK ^
                            {
                            dbg.location(106,13);
                            NOF_TOK29=(Token)match(input,NOF_TOK,FOLLOW_NOF_TOK_in_booleanExpr554); if (state.failed) return retval;
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:106:17: NOT_TOK ^
                            {
                            dbg.location(106,24);
                            NOT_TOK30=(Token)match(input,NOT_TOK,FOLLOW_NOT_TOK_in_booleanExpr559); if (state.failed) return retval;
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

                    dbg.location(106,27);
                    char_literal31=(Token)match(input,81,FOLLOW_81_in_booleanExpr563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal31_tree = 
                    (Object)adaptor.create(char_literal31)
                    ;
                    adaptor.addChild(root_0, char_literal31_tree);
                    }
                    dbg.location(106,31);
                    pushFollow(FOLLOW_booleanExpr_in_booleanExpr565);
                    booleanExpr32=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr32.getTree());
                    dbg.location(106,43);
                    char_literal33=(Token)match(input,82,FOLLOW_82_in_booleanExpr567); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:107:4: '(' conditionalOrExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(107,4);
                    char_literal34=(Token)match(input,81,FOLLOW_81_in_booleanExpr572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = 
                    (Object)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    dbg.location(107,8);
                    pushFollow(FOLLOW_conditionalOrExpr_in_booleanExpr574);
                    conditionalOrExpr35=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr35.getTree());
                    dbg.location(107,26);
                    char_literal36=(Token)match(input,82,FOLLOW_82_in_booleanExpr576); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(108,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr581);
                    equalityExpr37=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr37.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(109,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr586);
                    isInOp38=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp38.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:13: containsOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(109,13);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr590);
                    containsOp39=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp39.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:110:4: stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(110,4);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr595);
                    stringExpr40=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr40.getTree());
                    dbg.location(110,15);
                    char_literal41=(Token)match(input,84,FOLLOW_84_in_booleanExpr597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal41_tree = 
                    (Object)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);
                    }
                    dbg.location(110,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:110:19: ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^)
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:110:21: NODEEQUAL_TOK ^
                            {
                            dbg.location(110,34);
                            NODEEQUAL_TOK42=(Token)match(input,NODEEQUAL_TOK,FOLLOW_NODEEQUAL_TOK_in_booleanExpr601); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEEQUAL_TOK42_tree = 
                            (Object)adaptor.create(NODEEQUAL_TOK42)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEEQUAL_TOK42_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:110:38: NODEMATCH_TOK ^
                            {
                            dbg.location(110,51);
                            NODEMATCH_TOK43=(Token)match(input,NODEMATCH_TOK,FOLLOW_NODEMATCH_TOK_in_booleanExpr606); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEMATCH_TOK43_tree = 
                            (Object)adaptor.create(NODEMATCH_TOK43)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEMATCH_TOK43_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(110,55);
                    char_literal44=(Token)match(input,81,FOLLOW_81_in_booleanExpr611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = 
                    (Object)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);
                    }
                    dbg.location(110,59);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr613);
                    stringExpr45=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr45.getTree());
                    dbg.location(110,70);
                    char_literal46=(Token)match(input,82,FOLLOW_82_in_booleanExpr615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = 
                    (Object)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);
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
        dbg.location(113, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:1: booleanBag : ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK47=null;
        Token STRING_CONSTANT_LIST48=null;

        Object BOOLEAN_TOK47_tree=null;
        Object STRING_CONSTANT_LIST48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:2: ( ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:4: ( BOOLEAN_TOK )=> BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(115,21);
            BOOLEAN_TOK47=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag633); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK47_tree = 
            (Object)adaptor.create(BOOLEAN_TOK47)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK47_tree);
            }
            dbg.location(115,33);
            STRING_CONSTANT_LIST48=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag635); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST48_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST48)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST48_tree);
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
        dbg.location(118, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:1: conditionalOrExpr : ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal50=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr49 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr51 =null;


        Object string_literal50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:5: ( ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:7: ( conditionalAndExpr )=> conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(121,31);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr657);
            conditionalAndExpr49=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr49.getTree());
            dbg.location(121,50);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:50: ( '||' conditionalAndExpr )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==91) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:51: '||' conditionalAndExpr
            	    {
            	    dbg.location(121,51);
            	    string_literal50=(Token)match(input,91,FOLLOW_91_in_conditionalOrExpr660); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal50_tree = 
            	    (Object)adaptor.create(string_literal50)
            	    ;
            	    adaptor.addChild(root_0, string_literal50_tree);
            	    }
            	    dbg.location(121,56);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr662);
            	    conditionalAndExpr51=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr51.getTree());

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
        dbg.location(122, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:1: conditionalAndExpr : ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal53=null;
        GrammarParser.booleanExpr_return booleanExpr52 =null;

        GrammarParser.booleanExpr_return booleanExpr54 =null;


        Object string_literal53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:5: ( ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:7: ( booleanExpr )=> booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(125,25);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr689);
            booleanExpr52=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr52.getTree());
            dbg.location(125,37);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:37: ( '&&' booleanExpr )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==80) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:38: '&&' booleanExpr
            	    {
            	    dbg.location(125,38);
            	    string_literal53=(Token)match(input,80,FOLLOW_80_in_conditionalAndExpr692); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal53_tree = 
            	    (Object)adaptor.create(string_literal53)
            	    ;
            	    adaptor.addChild(root_0, string_literal53_tree);
            	    }
            	    dbg.location(125,43);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr694);
            	    booleanExpr54=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr54.getTree());

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
        dbg.location(126, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal56=null;
        Token ISIN_TOK57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token ISIN_TOK63=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token ISIN_TOK69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token ISIN_TOK75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token ISIN_TOK81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token ISIN_TOK87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token ISIN_TOK93=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token ISIN_TOK99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token ISIN_TOK105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token ISIN_TOK111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token ISIN_TOK117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token ISIN_TOK123=null;
        Token char_literal124=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token ISIN_TOK129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        GrammarParser.doubleExpr_return doubleExpr55 =null;

        GrammarParser.doubleBag_return doubleBag59 =null;

        GrammarParser.stringExpr_return stringExpr61 =null;

        GrammarParser.stringBag_return stringBag65 =null;

        GrammarParser.anyUriExpr_return anyUriExpr67 =null;

        GrammarParser.anyUriBag_return anyUriBag71 =null;

        GrammarParser.dateExpr_return dateExpr73 =null;

        GrammarParser.dateBag_return dateBag77 =null;

        GrammarParser.timeExpr_return timeExpr79 =null;

        GrammarParser.timeBag_return timeBag83 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr85 =null;

        GrammarParser.dateTimeBag_return dateTimeBag89 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr91 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag95 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr97 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag101 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr103 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag107 =null;

        GrammarParser.x500NameExpr_return x500NameExpr109 =null;

        GrammarParser.x500NameBag_return x500NameBag113 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr115 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag119 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr121 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag125 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr127 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag131 =null;


        Object char_literal56_tree=null;
        Object ISIN_TOK57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object ISIN_TOK63_tree=null;
        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        Object ISIN_TOK69_tree=null;
        Object char_literal70_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object ISIN_TOK75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object ISIN_TOK81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        Object ISIN_TOK87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        Object char_literal92_tree=null;
        Object ISIN_TOK93_tree=null;
        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object ISIN_TOK99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        Object ISIN_TOK105_tree=null;
        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        Object ISIN_TOK111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        Object ISIN_TOK117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object ISIN_TOK123_tree=null;
        Object char_literal124_tree=null;
        Object char_literal126_tree=null;
        Object char_literal128_tree=null;
        Object ISIN_TOK129_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:2: ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:5: doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(129,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp711);
                    doubleExpr55=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr55.getTree());
                    dbg.location(129,16);
                    char_literal56=(Token)match(input,84,FOLLOW_84_in_isInOp713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = 
                    (Object)adaptor.create(char_literal56)
                    ;
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    dbg.location(129,28);
                    ISIN_TOK57=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK57_tree = 
                    (Object)adaptor.create(ISIN_TOK57)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK57_tree, root_0);
                    }
                    dbg.location(129,30);
                    char_literal58=(Token)match(input,81,FOLLOW_81_in_isInOp718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = 
                    (Object)adaptor.create(char_literal58)
                    ;
                    adaptor.addChild(root_0, char_literal58_tree);
                    }
                    dbg.location(129,34);
                    pushFollow(FOLLOW_doubleBag_in_isInOp720);
                    doubleBag59=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag59.getTree());
                    dbg.location(129,44);
                    char_literal60=(Token)match(input,82,FOLLOW_82_in_isInOp722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = 
                    (Object)adaptor.create(char_literal60)
                    ;
                    adaptor.addChild(root_0, char_literal60_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:5: stringExpr '.' ISIN_TOK ^ '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(130,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp728);
                    stringExpr61=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr61.getTree());
                    dbg.location(130,16);
                    char_literal62=(Token)match(input,84,FOLLOW_84_in_isInOp730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal62_tree = 
                    (Object)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);
                    }
                    dbg.location(130,28);
                    ISIN_TOK63=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK63_tree = 
                    (Object)adaptor.create(ISIN_TOK63)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK63_tree, root_0);
                    }
                    dbg.location(130,30);
                    char_literal64=(Token)match(input,81,FOLLOW_81_in_isInOp735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = 
                    (Object)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);
                    }
                    dbg.location(130,34);
                    pushFollow(FOLLOW_stringBag_in_isInOp737);
                    stringBag65=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag65.getTree());
                    dbg.location(130,44);
                    char_literal66=(Token)match(input,82,FOLLOW_82_in_isInOp739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal66_tree = 
                    (Object)adaptor.create(char_literal66)
                    ;
                    adaptor.addChild(root_0, char_literal66_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:131:5: anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(131,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp745);
                    anyUriExpr67=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr67.getTree());
                    dbg.location(131,16);
                    char_literal68=(Token)match(input,84,FOLLOW_84_in_isInOp747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = 
                    (Object)adaptor.create(char_literal68)
                    ;
                    adaptor.addChild(root_0, char_literal68_tree);
                    }
                    dbg.location(131,28);
                    ISIN_TOK69=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK69_tree = 
                    (Object)adaptor.create(ISIN_TOK69)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK69_tree, root_0);
                    }
                    dbg.location(131,30);
                    char_literal70=(Token)match(input,81,FOLLOW_81_in_isInOp752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = 
                    (Object)adaptor.create(char_literal70)
                    ;
                    adaptor.addChild(root_0, char_literal70_tree);
                    }
                    dbg.location(131,34);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp754);
                    anyUriBag71=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag71.getTree());
                    dbg.location(131,44);
                    char_literal72=(Token)match(input,82,FOLLOW_82_in_isInOp756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = 
                    (Object)adaptor.create(char_literal72)
                    ;
                    adaptor.addChild(root_0, char_literal72_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:5: dateExpr '.' ISIN_TOK ^ '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(132,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp762);
                    dateExpr73=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr73.getTree());
                    dbg.location(132,14);
                    char_literal74=(Token)match(input,84,FOLLOW_84_in_isInOp764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal74_tree = 
                    (Object)adaptor.create(char_literal74)
                    ;
                    adaptor.addChild(root_0, char_literal74_tree);
                    }
                    dbg.location(132,26);
                    ISIN_TOK75=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK75_tree = 
                    (Object)adaptor.create(ISIN_TOK75)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK75_tree, root_0);
                    }
                    dbg.location(132,28);
                    char_literal76=(Token)match(input,81,FOLLOW_81_in_isInOp769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = 
                    (Object)adaptor.create(char_literal76)
                    ;
                    adaptor.addChild(root_0, char_literal76_tree);
                    }
                    dbg.location(132,32);
                    pushFollow(FOLLOW_dateBag_in_isInOp771);
                    dateBag77=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag77.getTree());
                    dbg.location(132,40);
                    char_literal78=(Token)match(input,82,FOLLOW_82_in_isInOp773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = 
                    (Object)adaptor.create(char_literal78)
                    ;
                    adaptor.addChild(root_0, char_literal78_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:133:5: timeExpr '.' ISIN_TOK ^ '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(133,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp779);
                    timeExpr79=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr79.getTree());
                    dbg.location(133,14);
                    char_literal80=(Token)match(input,84,FOLLOW_84_in_isInOp781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal80_tree = 
                    (Object)adaptor.create(char_literal80)
                    ;
                    adaptor.addChild(root_0, char_literal80_tree);
                    }
                    dbg.location(133,26);
                    ISIN_TOK81=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK81_tree = 
                    (Object)adaptor.create(ISIN_TOK81)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK81_tree, root_0);
                    }
                    dbg.location(133,28);
                    char_literal82=(Token)match(input,81,FOLLOW_81_in_isInOp786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal82_tree = 
                    (Object)adaptor.create(char_literal82)
                    ;
                    adaptor.addChild(root_0, char_literal82_tree);
                    }
                    dbg.location(133,32);
                    pushFollow(FOLLOW_timeBag_in_isInOp788);
                    timeBag83=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag83.getTree());
                    dbg.location(133,40);
                    char_literal84=(Token)match(input,82,FOLLOW_82_in_isInOp790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal84_tree = 
                    (Object)adaptor.create(char_literal84)
                    ;
                    adaptor.addChild(root_0, char_literal84_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:5: dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(134,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp796);
                    dateTimeExpr85=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr85.getTree());
                    dbg.location(134,18);
                    char_literal86=(Token)match(input,84,FOLLOW_84_in_isInOp798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal86_tree = 
                    (Object)adaptor.create(char_literal86)
                    ;
                    adaptor.addChild(root_0, char_literal86_tree);
                    }
                    dbg.location(134,30);
                    ISIN_TOK87=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK87_tree = 
                    (Object)adaptor.create(ISIN_TOK87)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK87_tree, root_0);
                    }
                    dbg.location(134,32);
                    char_literal88=(Token)match(input,81,FOLLOW_81_in_isInOp803); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);
                    }
                    dbg.location(134,36);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp805);
                    dateTimeBag89=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag89.getTree());
                    dbg.location(134,48);
                    char_literal90=(Token)match(input,82,FOLLOW_82_in_isInOp807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal90_tree = 
                    (Object)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:5: base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(135,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp813);
                    base64BinaryExpr91=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr91.getTree());
                    dbg.location(135,22);
                    char_literal92=(Token)match(input,84,FOLLOW_84_in_isInOp815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal92_tree = 
                    (Object)adaptor.create(char_literal92)
                    ;
                    adaptor.addChild(root_0, char_literal92_tree);
                    }
                    dbg.location(135,34);
                    ISIN_TOK93=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK93_tree = 
                    (Object)adaptor.create(ISIN_TOK93)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK93_tree, root_0);
                    }
                    dbg.location(135,36);
                    char_literal94=(Token)match(input,81,FOLLOW_81_in_isInOp820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal94_tree = 
                    (Object)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);
                    }
                    dbg.location(135,40);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp822);
                    base64BinaryBag95=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag95.getTree());
                    dbg.location(135,56);
                    char_literal96=(Token)match(input,82,FOLLOW_82_in_isInOp824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:136:5: dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(136,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp830);
                    dayTimeDurationExpr97=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr97.getTree());
                    dbg.location(136,25);
                    char_literal98=(Token)match(input,84,FOLLOW_84_in_isInOp832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal98_tree = 
                    (Object)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);
                    }
                    dbg.location(136,37);
                    ISIN_TOK99=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK99_tree = 
                    (Object)adaptor.create(ISIN_TOK99)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK99_tree, root_0);
                    }
                    dbg.location(136,39);
                    char_literal100=(Token)match(input,81,FOLLOW_81_in_isInOp837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = 
                    (Object)adaptor.create(char_literal100)
                    ;
                    adaptor.addChild(root_0, char_literal100_tree);
                    }
                    dbg.location(136,43);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp839);
                    dayTimeDurationBag101=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag101.getTree());
                    dbg.location(136,62);
                    char_literal102=(Token)match(input,82,FOLLOW_82_in_isInOp841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal102_tree = 
                    (Object)adaptor.create(char_literal102)
                    ;
                    adaptor.addChild(root_0, char_literal102_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:5: yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(137,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp847);
                    yearMonthDurationExpr103=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr103.getTree());
                    dbg.location(137,27);
                    char_literal104=(Token)match(input,84,FOLLOW_84_in_isInOp849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal104_tree = 
                    (Object)adaptor.create(char_literal104)
                    ;
                    adaptor.addChild(root_0, char_literal104_tree);
                    }
                    dbg.location(137,39);
                    ISIN_TOK105=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK105_tree = 
                    (Object)adaptor.create(ISIN_TOK105)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK105_tree, root_0);
                    }
                    dbg.location(137,41);
                    char_literal106=(Token)match(input,81,FOLLOW_81_in_isInOp854); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = 
                    (Object)adaptor.create(char_literal106)
                    ;
                    adaptor.addChild(root_0, char_literal106_tree);
                    }
                    dbg.location(137,45);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp856);
                    yearMonthDurationBag107=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag107.getTree());
                    dbg.location(137,66);
                    char_literal108=(Token)match(input,82,FOLLOW_82_in_isInOp858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal108_tree = 
                    (Object)adaptor.create(char_literal108)
                    ;
                    adaptor.addChild(root_0, char_literal108_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:5: x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(138,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp864);
                    x500NameExpr109=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr109.getTree());
                    dbg.location(138,18);
                    char_literal110=(Token)match(input,84,FOLLOW_84_in_isInOp866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal110_tree = 
                    (Object)adaptor.create(char_literal110)
                    ;
                    adaptor.addChild(root_0, char_literal110_tree);
                    }
                    dbg.location(138,30);
                    ISIN_TOK111=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK111_tree = 
                    (Object)adaptor.create(ISIN_TOK111)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK111_tree, root_0);
                    }
                    dbg.location(138,32);
                    char_literal112=(Token)match(input,81,FOLLOW_81_in_isInOp871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = 
                    (Object)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);
                    }
                    dbg.location(138,36);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp873);
                    x500NameBag113=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag113.getTree());
                    dbg.location(138,48);
                    char_literal114=(Token)match(input,82,FOLLOW_82_in_isInOp875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal114_tree = 
                    (Object)adaptor.create(char_literal114)
                    ;
                    adaptor.addChild(root_0, char_literal114_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:5: rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp881);
                    rfc822NameExpr115=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr115.getTree());
                    dbg.location(139,20);
                    char_literal116=(Token)match(input,84,FOLLOW_84_in_isInOp883); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal116_tree = 
                    (Object)adaptor.create(char_literal116)
                    ;
                    adaptor.addChild(root_0, char_literal116_tree);
                    }
                    dbg.location(139,32);
                    ISIN_TOK117=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK117_tree = 
                    (Object)adaptor.create(ISIN_TOK117)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK117_tree, root_0);
                    }
                    dbg.location(139,34);
                    char_literal118=(Token)match(input,81,FOLLOW_81_in_isInOp888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal118_tree = 
                    (Object)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);
                    }
                    dbg.location(139,38);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp890);
                    rfc822NameBag119=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag119.getTree());
                    dbg.location(139,52);
                    char_literal120=(Token)match(input,82,FOLLOW_82_in_isInOp892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal120_tree = 
                    (Object)adaptor.create(char_literal120)
                    ;
                    adaptor.addChild(root_0, char_literal120_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:5: hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp898);
                    hexBinaryExpr121=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr121.getTree());
                    dbg.location(140,19);
                    char_literal122=(Token)match(input,84,FOLLOW_84_in_isInOp900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);
                    }
                    dbg.location(140,31);
                    ISIN_TOK123=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK123_tree = 
                    (Object)adaptor.create(ISIN_TOK123)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK123_tree, root_0);
                    }
                    dbg.location(140,33);
                    char_literal124=(Token)match(input,81,FOLLOW_81_in_isInOp905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);
                    }
                    dbg.location(140,37);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp907);
                    hexBinaryBag125=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag125.getTree());
                    dbg.location(140,50);
                    char_literal126=(Token)match(input,82,FOLLOW_82_in_isInOp909); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal126_tree = 
                    (Object)adaptor.create(char_literal126)
                    ;
                    adaptor.addChild(root_0, char_literal126_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp921);
                    base64BinaryExpr127=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr127.getTree());
                    dbg.location(141,44);
                    char_literal128=(Token)match(input,84,FOLLOW_84_in_isInOp923); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal128_tree = 
                    (Object)adaptor.create(char_literal128)
                    ;
                    adaptor.addChild(root_0, char_literal128_tree);
                    }
                    dbg.location(141,56);
                    ISIN_TOK129=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK129_tree = 
                    (Object)adaptor.create(ISIN_TOK129)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK129_tree, root_0);
                    }
                    dbg.location(141,58);
                    char_literal130=(Token)match(input,81,FOLLOW_81_in_isInOp928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal130_tree = 
                    (Object)adaptor.create(char_literal130)
                    ;
                    adaptor.addChild(root_0, char_literal130_tree);
                    }
                    dbg.location(141,62);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp930);
                    base64BinaryBag131=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag131.getTree());
                    dbg.location(141,78);
                    char_literal132=(Token)match(input,82,FOLLOW_82_in_isInOp932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal132_tree = 
                    (Object)adaptor.create(char_literal132)
                    ;
                    adaptor.addChild(root_0, char_literal132_tree);
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
        dbg.location(142, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "isInOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "isInOp"


    public static class containsOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "containsOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ '(' doubleExpr ')' | stringBag '.' CONTAINS_TOK ^ '(' stringExpr ')' | anyUriBag '.' CONTAINS_TOK ^ '(' anyUriExpr ')' | dateBag '.' CONTAINS_TOK ^ '(' dateExpr ')' | timeBag '.' CONTAINS_TOK ^ '(' timeExpr ')' | dateTimeBag '.' CONTAINS_TOK ^ '(' dateTimeExpr ')' | base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' | dayTimeDurationBag '.' CONTAINS_TOK ^ '(' dayTimeDurationExpr ')' | yearMonthDurationBag '.' CONTAINS_TOK ^ '(' yearMonthDurationExpr ')' | x500NameBag '.' CONTAINS_TOK ^ '(' x500NameExpr ')' | rfc822NameBag '.' CONTAINS_TOK ^ '(' rfc822NameExpr ')' | hexBinaryBag '.' CONTAINS_TOK ^ '(' hexBinaryExpr ')' | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' );
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal134=null;
        Token CONTAINS_TOK135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token CONTAINS_TOK141=null;
        Token char_literal142=null;
        Token char_literal144=null;
        Token char_literal146=null;
        Token CONTAINS_TOK147=null;
        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal152=null;
        Token CONTAINS_TOK153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token CONTAINS_TOK159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token char_literal164=null;
        Token CONTAINS_TOK165=null;
        Token char_literal166=null;
        Token char_literal168=null;
        Token char_literal170=null;
        Token CONTAINS_TOK171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token CONTAINS_TOK177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token CONTAINS_TOK183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token CONTAINS_TOK189=null;
        Token char_literal190=null;
        Token char_literal192=null;
        Token char_literal194=null;
        Token CONTAINS_TOK195=null;
        Token char_literal196=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token CONTAINS_TOK201=null;
        Token char_literal202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token CONTAINS_TOK207=null;
        Token char_literal208=null;
        Token char_literal210=null;
        GrammarParser.doubleBag_return doubleBag133 =null;

        GrammarParser.doubleExpr_return doubleExpr137 =null;

        GrammarParser.stringBag_return stringBag139 =null;

        GrammarParser.stringExpr_return stringExpr143 =null;

        GrammarParser.anyUriBag_return anyUriBag145 =null;

        GrammarParser.anyUriExpr_return anyUriExpr149 =null;

        GrammarParser.dateBag_return dateBag151 =null;

        GrammarParser.dateExpr_return dateExpr155 =null;

        GrammarParser.timeBag_return timeBag157 =null;

        GrammarParser.timeExpr_return timeExpr161 =null;

        GrammarParser.dateTimeBag_return dateTimeBag163 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr167 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag169 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr173 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag175 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr179 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag181 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr185 =null;

        GrammarParser.x500NameBag_return x500NameBag187 =null;

        GrammarParser.x500NameExpr_return x500NameExpr191 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag193 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr197 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag199 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr203 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag205 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr209 =null;


        Object char_literal134_tree=null;
        Object CONTAINS_TOK135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal140_tree=null;
        Object CONTAINS_TOK141_tree=null;
        Object char_literal142_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        Object CONTAINS_TOK147_tree=null;
        Object char_literal148_tree=null;
        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object CONTAINS_TOK153_tree=null;
        Object char_literal154_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object CONTAINS_TOK159_tree=null;
        Object char_literal160_tree=null;
        Object char_literal162_tree=null;
        Object char_literal164_tree=null;
        Object CONTAINS_TOK165_tree=null;
        Object char_literal166_tree=null;
        Object char_literal168_tree=null;
        Object char_literal170_tree=null;
        Object CONTAINS_TOK171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object CONTAINS_TOK177_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object CONTAINS_TOK183_tree=null;
        Object char_literal184_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;
        Object CONTAINS_TOK189_tree=null;
        Object char_literal190_tree=null;
        Object char_literal192_tree=null;
        Object char_literal194_tree=null;
        Object CONTAINS_TOK195_tree=null;
        Object char_literal196_tree=null;
        Object char_literal198_tree=null;
        Object char_literal200_tree=null;
        Object CONTAINS_TOK201_tree=null;
        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        Object CONTAINS_TOK207_tree=null;
        Object char_literal208_tree=null;
        Object char_literal210_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:2: ( doubleBag '.' CONTAINS_TOK ^ '(' doubleExpr ')' | stringBag '.' CONTAINS_TOK ^ '(' stringExpr ')' | anyUriBag '.' CONTAINS_TOK ^ '(' anyUriExpr ')' | dateBag '.' CONTAINS_TOK ^ '(' dateExpr ')' | timeBag '.' CONTAINS_TOK ^ '(' timeExpr ')' | dateTimeBag '.' CONTAINS_TOK ^ '(' dateTimeExpr ')' | base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' | dayTimeDurationBag '.' CONTAINS_TOK ^ '(' dayTimeDurationExpr ')' | yearMonthDurationBag '.' CONTAINS_TOK ^ '(' yearMonthDurationExpr ')' | x500NameBag '.' CONTAINS_TOK ^ '(' x500NameExpr ')' | rfc822NameBag '.' CONTAINS_TOK ^ '(' rfc822NameExpr ')' | hexBinaryBag '.' CONTAINS_TOK ^ '(' hexBinaryExpr ')' | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' )
            int alt10=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:5: doubleBag '.' CONTAINS_TOK ^ '(' doubleExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,5);
                    pushFollow(FOLLOW_doubleBag_in_containsOp944);
                    doubleBag133=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag133.getTree());
                    dbg.location(145,14);
                    char_literal134=(Token)match(input,84,FOLLOW_84_in_containsOp945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal134_tree = 
                    (Object)adaptor.create(char_literal134)
                    ;
                    adaptor.addChild(root_0, char_literal134_tree);
                    }
                    dbg.location(145,30);
                    CONTAINS_TOK135=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp947); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK135_tree = 
                    (Object)adaptor.create(CONTAINS_TOK135)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK135_tree, root_0);
                    }
                    dbg.location(145,32);
                    char_literal136=(Token)match(input,81,FOLLOW_81_in_containsOp950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);
                    }
                    dbg.location(145,36);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp952);
                    doubleExpr137=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr137.getTree());
                    dbg.location(145,47);
                    char_literal138=(Token)match(input,82,FOLLOW_82_in_containsOp954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = 
                    (Object)adaptor.create(char_literal138)
                    ;
                    adaptor.addChild(root_0, char_literal138_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:5: stringBag '.' CONTAINS_TOK ^ '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,5);
                    pushFollow(FOLLOW_stringBag_in_containsOp960);
                    stringBag139=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag139.getTree());
                    dbg.location(146,14);
                    char_literal140=(Token)match(input,84,FOLLOW_84_in_containsOp961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal140_tree = 
                    (Object)adaptor.create(char_literal140)
                    ;
                    adaptor.addChild(root_0, char_literal140_tree);
                    }
                    dbg.location(146,30);
                    CONTAINS_TOK141=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp963); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK141_tree = 
                    (Object)adaptor.create(CONTAINS_TOK141)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK141_tree, root_0);
                    }
                    dbg.location(146,32);
                    char_literal142=(Token)match(input,81,FOLLOW_81_in_containsOp966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);
                    }
                    dbg.location(146,36);
                    pushFollow(FOLLOW_stringExpr_in_containsOp968);
                    stringExpr143=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr143.getTree());
                    dbg.location(146,47);
                    char_literal144=(Token)match(input,82,FOLLOW_82_in_containsOp970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal144_tree = 
                    (Object)adaptor.create(char_literal144)
                    ;
                    adaptor.addChild(root_0, char_literal144_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:5: anyUriBag '.' CONTAINS_TOK ^ '(' anyUriExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(147,5);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp976);
                    anyUriBag145=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag145.getTree());
                    dbg.location(147,15);
                    char_literal146=(Token)match(input,84,FOLLOW_84_in_containsOp978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal146_tree = 
                    (Object)adaptor.create(char_literal146)
                    ;
                    adaptor.addChild(root_0, char_literal146_tree);
                    }
                    dbg.location(147,31);
                    CONTAINS_TOK147=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK147_tree = 
                    (Object)adaptor.create(CONTAINS_TOK147)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK147_tree, root_0);
                    }
                    dbg.location(147,33);
                    char_literal148=(Token)match(input,81,FOLLOW_81_in_containsOp983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal148_tree = 
                    (Object)adaptor.create(char_literal148)
                    ;
                    adaptor.addChild(root_0, char_literal148_tree);
                    }
                    dbg.location(147,37);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp985);
                    anyUriExpr149=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr149.getTree());
                    dbg.location(147,48);
                    char_literal150=(Token)match(input,82,FOLLOW_82_in_containsOp987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal150_tree = 
                    (Object)adaptor.create(char_literal150)
                    ;
                    adaptor.addChild(root_0, char_literal150_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:148:5: dateBag '.' CONTAINS_TOK ^ '(' dateExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(148,5);
                    pushFollow(FOLLOW_dateBag_in_containsOp993);
                    dateBag151=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag151.getTree());
                    dbg.location(148,13);
                    char_literal152=(Token)match(input,84,FOLLOW_84_in_containsOp995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal152_tree = 
                    (Object)adaptor.create(char_literal152)
                    ;
                    adaptor.addChild(root_0, char_literal152_tree);
                    }
                    dbg.location(148,29);
                    CONTAINS_TOK153=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK153_tree = 
                    (Object)adaptor.create(CONTAINS_TOK153)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK153_tree, root_0);
                    }
                    dbg.location(148,31);
                    char_literal154=(Token)match(input,81,FOLLOW_81_in_containsOp1000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = 
                    (Object)adaptor.create(char_literal154)
                    ;
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    dbg.location(148,35);
                    pushFollow(FOLLOW_dateExpr_in_containsOp1002);
                    dateExpr155=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr155.getTree());
                    dbg.location(148,44);
                    char_literal156=(Token)match(input,82,FOLLOW_82_in_containsOp1004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal156_tree = 
                    (Object)adaptor.create(char_literal156)
                    ;
                    adaptor.addChild(root_0, char_literal156_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:5: timeBag '.' CONTAINS_TOK ^ '(' timeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(149,5);
                    pushFollow(FOLLOW_timeBag_in_containsOp1010);
                    timeBag157=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag157.getTree());
                    dbg.location(149,13);
                    char_literal158=(Token)match(input,84,FOLLOW_84_in_containsOp1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = 
                    (Object)adaptor.create(char_literal158)
                    ;
                    adaptor.addChild(root_0, char_literal158_tree);
                    }
                    dbg.location(149,29);
                    CONTAINS_TOK159=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK159_tree = 
                    (Object)adaptor.create(CONTAINS_TOK159)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK159_tree, root_0);
                    }
                    dbg.location(149,31);
                    char_literal160=(Token)match(input,81,FOLLOW_81_in_containsOp1017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = 
                    (Object)adaptor.create(char_literal160)
                    ;
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    dbg.location(149,35);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1019);
                    timeExpr161=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr161.getTree());
                    dbg.location(149,44);
                    char_literal162=(Token)match(input,82,FOLLOW_82_in_containsOp1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal162_tree = 
                    (Object)adaptor.create(char_literal162)
                    ;
                    adaptor.addChild(root_0, char_literal162_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:5: dateTimeBag '.' CONTAINS_TOK ^ '(' dateTimeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(150,5);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1027);
                    dateTimeBag163=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag163.getTree());
                    dbg.location(150,17);
                    char_literal164=(Token)match(input,84,FOLLOW_84_in_containsOp1029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal164_tree = 
                    (Object)adaptor.create(char_literal164)
                    ;
                    adaptor.addChild(root_0, char_literal164_tree);
                    }
                    dbg.location(150,33);
                    CONTAINS_TOK165=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK165_tree = 
                    (Object)adaptor.create(CONTAINS_TOK165)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK165_tree, root_0);
                    }
                    dbg.location(150,35);
                    char_literal166=(Token)match(input,81,FOLLOW_81_in_containsOp1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = 
                    (Object)adaptor.create(char_literal166)
                    ;
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    dbg.location(150,39);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1036);
                    dateTimeExpr167=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr167.getTree());
                    dbg.location(150,52);
                    char_literal168=(Token)match(input,82,FOLLOW_82_in_containsOp1038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal168_tree = 
                    (Object)adaptor.create(char_literal168)
                    ;
                    adaptor.addChild(root_0, char_literal168_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:5: base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(151,5);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1044);
                    base64BinaryBag169=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag169.getTree());
                    dbg.location(151,21);
                    char_literal170=(Token)match(input,84,FOLLOW_84_in_containsOp1046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal170_tree = 
                    (Object)adaptor.create(char_literal170)
                    ;
                    adaptor.addChild(root_0, char_literal170_tree);
                    }
                    dbg.location(151,37);
                    CONTAINS_TOK171=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK171_tree = 
                    (Object)adaptor.create(CONTAINS_TOK171)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK171_tree, root_0);
                    }
                    dbg.location(151,39);
                    char_literal172=(Token)match(input,81,FOLLOW_81_in_containsOp1051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal172_tree = 
                    (Object)adaptor.create(char_literal172)
                    ;
                    adaptor.addChild(root_0, char_literal172_tree);
                    }
                    dbg.location(151,43);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1053);
                    base64BinaryExpr173=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr173.getTree());
                    dbg.location(151,60);
                    char_literal174=(Token)match(input,82,FOLLOW_82_in_containsOp1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal174_tree = 
                    (Object)adaptor.create(char_literal174)
                    ;
                    adaptor.addChild(root_0, char_literal174_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:152:5: dayTimeDurationBag '.' CONTAINS_TOK ^ '(' dayTimeDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(152,5);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1061);
                    dayTimeDurationBag175=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag175.getTree());
                    dbg.location(152,24);
                    char_literal176=(Token)match(input,84,FOLLOW_84_in_containsOp1063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal176_tree = 
                    (Object)adaptor.create(char_literal176)
                    ;
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    dbg.location(152,40);
                    CONTAINS_TOK177=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK177_tree = 
                    (Object)adaptor.create(CONTAINS_TOK177)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK177_tree, root_0);
                    }
                    dbg.location(152,42);
                    char_literal178=(Token)match(input,81,FOLLOW_81_in_containsOp1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = 
                    (Object)adaptor.create(char_literal178)
                    ;
                    adaptor.addChild(root_0, char_literal178_tree);
                    }
                    dbg.location(152,46);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1070);
                    dayTimeDurationExpr179=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr179.getTree());
                    dbg.location(152,66);
                    char_literal180=(Token)match(input,82,FOLLOW_82_in_containsOp1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = 
                    (Object)adaptor.create(char_literal180)
                    ;
                    adaptor.addChild(root_0, char_literal180_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:5: yearMonthDurationBag '.' CONTAINS_TOK ^ '(' yearMonthDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(153,5);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1078);
                    yearMonthDurationBag181=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag181.getTree());
                    dbg.location(153,26);
                    char_literal182=(Token)match(input,84,FOLLOW_84_in_containsOp1080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal182_tree = 
                    (Object)adaptor.create(char_literal182)
                    ;
                    adaptor.addChild(root_0, char_literal182_tree);
                    }
                    dbg.location(153,42);
                    CONTAINS_TOK183=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK183_tree = 
                    (Object)adaptor.create(CONTAINS_TOK183)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK183_tree, root_0);
                    }
                    dbg.location(153,44);
                    char_literal184=(Token)match(input,81,FOLLOW_81_in_containsOp1085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal184_tree = 
                    (Object)adaptor.create(char_literal184)
                    ;
                    adaptor.addChild(root_0, char_literal184_tree);
                    }
                    dbg.location(153,48);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1087);
                    yearMonthDurationExpr185=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr185.getTree());
                    dbg.location(153,70);
                    char_literal186=(Token)match(input,82,FOLLOW_82_in_containsOp1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal186_tree = 
                    (Object)adaptor.create(char_literal186)
                    ;
                    adaptor.addChild(root_0, char_literal186_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:5: x500NameBag '.' CONTAINS_TOK ^ '(' x500NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(154,5);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1095);
                    x500NameBag187=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag187.getTree());
                    dbg.location(154,17);
                    char_literal188=(Token)match(input,84,FOLLOW_84_in_containsOp1097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal188_tree = 
                    (Object)adaptor.create(char_literal188)
                    ;
                    adaptor.addChild(root_0, char_literal188_tree);
                    }
                    dbg.location(154,33);
                    CONTAINS_TOK189=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK189_tree = 
                    (Object)adaptor.create(CONTAINS_TOK189)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK189_tree, root_0);
                    }
                    dbg.location(154,35);
                    char_literal190=(Token)match(input,81,FOLLOW_81_in_containsOp1102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal190_tree = 
                    (Object)adaptor.create(char_literal190)
                    ;
                    adaptor.addChild(root_0, char_literal190_tree);
                    }
                    dbg.location(154,39);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1104);
                    x500NameExpr191=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr191.getTree());
                    dbg.location(154,52);
                    char_literal192=(Token)match(input,82,FOLLOW_82_in_containsOp1106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal192_tree = 
                    (Object)adaptor.create(char_literal192)
                    ;
                    adaptor.addChild(root_0, char_literal192_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:5: rfc822NameBag '.' CONTAINS_TOK ^ '(' rfc822NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(155,5);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1112);
                    rfc822NameBag193=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag193.getTree());
                    dbg.location(155,19);
                    char_literal194=(Token)match(input,84,FOLLOW_84_in_containsOp1114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal194_tree = 
                    (Object)adaptor.create(char_literal194)
                    ;
                    adaptor.addChild(root_0, char_literal194_tree);
                    }
                    dbg.location(155,35);
                    CONTAINS_TOK195=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK195_tree = 
                    (Object)adaptor.create(CONTAINS_TOK195)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK195_tree, root_0);
                    }
                    dbg.location(155,37);
                    char_literal196=(Token)match(input,81,FOLLOW_81_in_containsOp1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal196_tree = 
                    (Object)adaptor.create(char_literal196)
                    ;
                    adaptor.addChild(root_0, char_literal196_tree);
                    }
                    dbg.location(155,41);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1121);
                    rfc822NameExpr197=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr197.getTree());
                    dbg.location(155,56);
                    char_literal198=(Token)match(input,82,FOLLOW_82_in_containsOp1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal198_tree = 
                    (Object)adaptor.create(char_literal198)
                    ;
                    adaptor.addChild(root_0, char_literal198_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:5: hexBinaryBag '.' CONTAINS_TOK ^ '(' hexBinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(156,5);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1129);
                    hexBinaryBag199=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag199.getTree());
                    dbg.location(156,18);
                    char_literal200=(Token)match(input,84,FOLLOW_84_in_containsOp1131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal200_tree = 
                    (Object)adaptor.create(char_literal200)
                    ;
                    adaptor.addChild(root_0, char_literal200_tree);
                    }
                    dbg.location(156,34);
                    CONTAINS_TOK201=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK201_tree = 
                    (Object)adaptor.create(CONTAINS_TOK201)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK201_tree, root_0);
                    }
                    dbg.location(156,36);
                    char_literal202=(Token)match(input,81,FOLLOW_81_in_containsOp1136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal202_tree = 
                    (Object)adaptor.create(char_literal202)
                    ;
                    adaptor.addChild(root_0, char_literal202_tree);
                    }
                    dbg.location(156,40);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1138);
                    hexBinaryExpr203=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr203.getTree());
                    dbg.location(156,54);
                    char_literal204=(Token)match(input,82,FOLLOW_82_in_containsOp1140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal204_tree = 
                    (Object)adaptor.create(char_literal204)
                    ;
                    adaptor.addChild(root_0, char_literal204_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:5: ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(157,27);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1152);
                    base64BinaryBag205=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag205.getTree());
                    dbg.location(157,43);
                    char_literal206=(Token)match(input,84,FOLLOW_84_in_containsOp1154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal206_tree = 
                    (Object)adaptor.create(char_literal206)
                    ;
                    adaptor.addChild(root_0, char_literal206_tree);
                    }
                    dbg.location(157,59);
                    CONTAINS_TOK207=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK207_tree = 
                    (Object)adaptor.create(CONTAINS_TOK207)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK207_tree, root_0);
                    }
                    dbg.location(157,61);
                    char_literal208=(Token)match(input,81,FOLLOW_81_in_containsOp1159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal208_tree = 
                    (Object)adaptor.create(char_literal208)
                    ;
                    adaptor.addChild(root_0, char_literal208_tree);
                    }
                    dbg.location(157,65);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1161);
                    base64BinaryExpr209=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr209.getTree());
                    dbg.location(157,82);
                    char_literal210=(Token)match(input,82,FOLLOW_82_in_containsOp1163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal210_tree = 
                    (Object)adaptor.create(char_literal210)
                    ;
                    adaptor.addChild(root_0, char_literal210_tree);
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
        dbg.location(158, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "containsOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "containsOp"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set212=null;
        Token set215=null;
        Token set218=null;
        Token set221=null;
        Token set224=null;
        Token set227=null;
        Token set230=null;
        Token set233=null;
        Token set236=null;
        Token set239=null;
        Token set242=null;
        Token set245=null;
        GrammarParser.integerExpr_return integerExpr211 =null;

        GrammarParser.integerExpr_return integerExpr213 =null;

        GrammarParser.doubleExpr_return doubleExpr214 =null;

        GrammarParser.doubleExpr_return doubleExpr216 =null;

        GrammarParser.stringExpr_return stringExpr217 =null;

        GrammarParser.stringExpr_return stringExpr219 =null;

        GrammarParser.anyUriExpr_return anyUriExpr220 =null;

        GrammarParser.anyUriExpr_return anyUriExpr222 =null;

        GrammarParser.dateExpr_return dateExpr223 =null;

        GrammarParser.dateExpr_return dateExpr225 =null;

        GrammarParser.timeExpr_return timeExpr226 =null;

        GrammarParser.timeExpr_return timeExpr228 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr229 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr231 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr232 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr234 =null;

        GrammarParser.x500NameExpr_return x500NameExpr235 =null;

        GrammarParser.x500NameExpr_return x500NameExpr237 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr238 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr240 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr241 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr243 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr244 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr246 =null;


        Object set212_tree=null;
        Object set215_tree=null;
        Object set218_tree=null;
        Object set221_tree=null;
        Object set224_tree=null;
        Object set227_tree=null;
        Object set230_tree=null;
        Object set233_tree=null;
        Object set236_tree=null;
        Object set239_tree=null;
        Object set242_tree=null;
        Object set245_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(161,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1174);
                    integerExpr211=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr211.getTree());
                    dbg.location(161,16);
                    set212=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set212)
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

                    dbg.location(161,51);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1198);
                    integerExpr213=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr213.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(162,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1203);
                    doubleExpr214=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr214.getTree());
                    dbg.location(162,15);
                    set215=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set215)
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

                    dbg.location(162,50);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1227);
                    doubleExpr216=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr216.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(163,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1232);
                    stringExpr217=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr217.getTree());
                    dbg.location(163,15);
                    set218=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set218)
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

                    dbg.location(163,50);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1256);
                    stringExpr219=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr219.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(164,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1261);
                    anyUriExpr220=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr220.getTree());
                    dbg.location(164,15);
                    set221=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set221)
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

                    dbg.location(164,50);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1285);
                    anyUriExpr222=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr222.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1290);
                    dateExpr223=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr223.getTree());
                    dbg.location(165,13);
                    set224=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set224)
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

                    dbg.location(165,48);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1314);
                    dateExpr225=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr225.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(166,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1319);
                    timeExpr226=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr226.getTree());
                    dbg.location(166,13);
                    set227=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set227)
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

                    dbg.location(166,48);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1343);
                    timeExpr228=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr228.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:167:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(167,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1348);
                    dateTimeExpr229=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr229.getTree());
                    dbg.location(167,17);
                    set230=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set230)
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

                    dbg.location(167,52);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1372);
                    dateTimeExpr231=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr231.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(168,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1377);
                    yearMonthDurationExpr232=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr232.getTree());
                    dbg.location(168,26);
                    set233=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set233)
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

                    dbg.location(168,61);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1401);
                    yearMonthDurationExpr234=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr234.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1406);
                    x500NameExpr235=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr235.getTree());
                    dbg.location(169,17);
                    set236=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set236)
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

                    dbg.location(169,52);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1430);
                    x500NameExpr237=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr237.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1435);
                    rfc822NameExpr238=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr238.getTree());
                    dbg.location(170,19);
                    set239=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set239)
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

                    dbg.location(170,55);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1460);
                    rfc822NameExpr240=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr240.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,29);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1471);
                    dayTimeDurationExpr241=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr241.getTree());
                    dbg.location(171,49);
                    set242=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(171,84);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1495);
                    dayTimeDurationExpr243=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr243.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1506);
                    base64BinaryExpr244=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr244.getTree());
                    dbg.location(172,43);
                    set245=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set245)
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

                    dbg.location(172,78);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1530);
                    base64BinaryExpr246=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr246.getTree());

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
        dbg.location(173, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal248=null;
        Token REGEXMATCH_TOK249=null;
        Token char_literal250=null;
        Token char_literal252=null;
        Token char_literal254=null;
        Token REGEXMATCH_TOK255=null;
        Token char_literal256=null;
        Token char_literal258=null;
        Token char_literal260=null;
        Token REGEXMATCH_TOK261=null;
        Token char_literal262=null;
        Token char_literal264=null;
        Token char_literal266=null;
        Token REGEXMATCH_TOK267=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token char_literal272=null;
        Token REGEXMATCH_TOK273=null;
        Token char_literal274=null;
        Token char_literal276=null;
        Token char_literal278=null;
        Token REGEXMATCH_TOK279=null;
        Token char_literal280=null;
        Token char_literal282=null;
        Token char_literal284=null;
        Token REGEXMATCH_TOK285=null;
        Token char_literal286=null;
        Token char_literal288=null;
        Token char_literal290=null;
        Token REGEXMATCH_TOK291=null;
        Token char_literal292=null;
        Token char_literal294=null;
        Token char_literal296=null;
        Token REGEXMATCH_TOK297=null;
        Token char_literal298=null;
        Token char_literal300=null;
        Token char_literal302=null;
        Token REGEXMATCH_TOK303=null;
        Token char_literal304=null;
        Token char_literal306=null;
        Token char_literal308=null;
        Token REGEXMATCH_TOK309=null;
        Token char_literal310=null;
        Token char_literal312=null;
        Token char_literal314=null;
        Token REGEXMATCH_TOK315=null;
        Token char_literal316=null;
        Token char_literal318=null;
        GrammarParser.integerExpr_return integerExpr247 =null;

        GrammarParser.integerExpr_return integerExpr251 =null;

        GrammarParser.doubleExpr_return doubleExpr253 =null;

        GrammarParser.doubleExpr_return doubleExpr257 =null;

        GrammarParser.stringExpr_return stringExpr259 =null;

        GrammarParser.stringExpr_return stringExpr263 =null;

        GrammarParser.anyUriExpr_return anyUriExpr265 =null;

        GrammarParser.anyUriExpr_return anyUriExpr269 =null;

        GrammarParser.dateExpr_return dateExpr271 =null;

        GrammarParser.dateExpr_return dateExpr275 =null;

        GrammarParser.timeExpr_return timeExpr277 =null;

        GrammarParser.timeExpr_return timeExpr281 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr283 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr287 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr289 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr293 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr295 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr299 =null;

        GrammarParser.x500NameExpr_return x500NameExpr301 =null;

        GrammarParser.x500NameExpr_return x500NameExpr305 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr307 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr311 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr313 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr317 =null;


        Object char_literal248_tree=null;
        Object REGEXMATCH_TOK249_tree=null;
        Object char_literal250_tree=null;
        Object char_literal252_tree=null;
        Object char_literal254_tree=null;
        Object REGEXMATCH_TOK255_tree=null;
        Object char_literal256_tree=null;
        Object char_literal258_tree=null;
        Object char_literal260_tree=null;
        Object REGEXMATCH_TOK261_tree=null;
        Object char_literal262_tree=null;
        Object char_literal264_tree=null;
        Object char_literal266_tree=null;
        Object REGEXMATCH_TOK267_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object char_literal272_tree=null;
        Object REGEXMATCH_TOK273_tree=null;
        Object char_literal274_tree=null;
        Object char_literal276_tree=null;
        Object char_literal278_tree=null;
        Object REGEXMATCH_TOK279_tree=null;
        Object char_literal280_tree=null;
        Object char_literal282_tree=null;
        Object char_literal284_tree=null;
        Object REGEXMATCH_TOK285_tree=null;
        Object char_literal286_tree=null;
        Object char_literal288_tree=null;
        Object char_literal290_tree=null;
        Object REGEXMATCH_TOK291_tree=null;
        Object char_literal292_tree=null;
        Object char_literal294_tree=null;
        Object char_literal296_tree=null;
        Object REGEXMATCH_TOK297_tree=null;
        Object char_literal298_tree=null;
        Object char_literal300_tree=null;
        Object char_literal302_tree=null;
        Object REGEXMATCH_TOK303_tree=null;
        Object char_literal304_tree=null;
        Object char_literal306_tree=null;
        Object char_literal308_tree=null;
        Object REGEXMATCH_TOK309_tree=null;
        Object char_literal310_tree=null;
        Object char_literal312_tree=null;
        Object char_literal314_tree=null;
        Object REGEXMATCH_TOK315_tree=null;
        Object char_literal316_tree=null;
        Object char_literal318_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:2: ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' )
            int alt12=12;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            try {
                isCyclicDecision = true;
                alt12 = dfa12.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1542);
                    integerExpr247=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr247.getTree());
                    dbg.location(176,17);
                    char_literal248=(Token)match(input,84,FOLLOW_84_in_regexOp1545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal248_tree = 
                    (Object)adaptor.create(char_literal248)
                    ;
                    adaptor.addChild(root_0, char_literal248_tree);
                    }
                    dbg.location(176,21);
                    REGEXMATCH_TOK249=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK249_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK249)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK249_tree);
                    }
                    dbg.location(176,36);
                    char_literal250=(Token)match(input,81,FOLLOW_81_in_regexOp1549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal250_tree = 
                    (Object)adaptor.create(char_literal250)
                    ;
                    adaptor.addChild(root_0, char_literal250_tree);
                    }
                    dbg.location(176,40);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1551);
                    integerExpr251=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr251.getTree());
                    dbg.location(176,52);
                    char_literal252=(Token)match(input,82,FOLLOW_82_in_regexOp1553); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal252_tree = 
                    (Object)adaptor.create(char_literal252)
                    ;
                    adaptor.addChild(root_0, char_literal252_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1558);
                    doubleExpr253=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr253.getTree());
                    dbg.location(177,15);
                    char_literal254=(Token)match(input,84,FOLLOW_84_in_regexOp1560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal254_tree = 
                    (Object)adaptor.create(char_literal254)
                    ;
                    adaptor.addChild(root_0, char_literal254_tree);
                    }
                    dbg.location(177,19);
                    REGEXMATCH_TOK255=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK255_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK255)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK255_tree);
                    }
                    dbg.location(177,34);
                    char_literal256=(Token)match(input,81,FOLLOW_81_in_regexOp1564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal256_tree = 
                    (Object)adaptor.create(char_literal256)
                    ;
                    adaptor.addChild(root_0, char_literal256_tree);
                    }
                    dbg.location(177,38);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1566);
                    doubleExpr257=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr257.getTree());
                    dbg.location(177,49);
                    char_literal258=(Token)match(input,82,FOLLOW_82_in_regexOp1568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal258_tree = 
                    (Object)adaptor.create(char_literal258)
                    ;
                    adaptor.addChild(root_0, char_literal258_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1573);
                    stringExpr259=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr259.getTree());
                    dbg.location(178,15);
                    char_literal260=(Token)match(input,84,FOLLOW_84_in_regexOp1575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal260_tree = 
                    (Object)adaptor.create(char_literal260)
                    ;
                    adaptor.addChild(root_0, char_literal260_tree);
                    }
                    dbg.location(178,19);
                    REGEXMATCH_TOK261=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK261_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK261)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK261_tree);
                    }
                    dbg.location(178,34);
                    char_literal262=(Token)match(input,81,FOLLOW_81_in_regexOp1579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal262_tree = 
                    (Object)adaptor.create(char_literal262)
                    ;
                    adaptor.addChild(root_0, char_literal262_tree);
                    }
                    dbg.location(178,38);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1581);
                    stringExpr263=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr263.getTree());
                    dbg.location(178,49);
                    char_literal264=(Token)match(input,82,FOLLOW_82_in_regexOp1583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1588);
                    anyUriExpr265=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr265.getTree());
                    dbg.location(179,15);
                    char_literal266=(Token)match(input,84,FOLLOW_84_in_regexOp1590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (Object)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }
                    dbg.location(179,19);
                    REGEXMATCH_TOK267=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK267_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK267)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK267_tree);
                    }
                    dbg.location(179,34);
                    char_literal268=(Token)match(input,81,FOLLOW_81_in_regexOp1594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = 
                    (Object)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);
                    }
                    dbg.location(179,38);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1596);
                    anyUriExpr269=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr269.getTree());
                    dbg.location(179,49);
                    char_literal270=(Token)match(input,82,FOLLOW_82_in_regexOp1598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal270_tree = 
                    (Object)adaptor.create(char_literal270)
                    ;
                    adaptor.addChild(root_0, char_literal270_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1603);
                    dateExpr271=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr271.getTree());
                    dbg.location(180,13);
                    char_literal272=(Token)match(input,84,FOLLOW_84_in_regexOp1605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal272_tree = 
                    (Object)adaptor.create(char_literal272)
                    ;
                    adaptor.addChild(root_0, char_literal272_tree);
                    }
                    dbg.location(180,17);
                    REGEXMATCH_TOK273=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK273_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK273)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK273_tree);
                    }
                    dbg.location(180,32);
                    char_literal274=(Token)match(input,81,FOLLOW_81_in_regexOp1609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }
                    dbg.location(180,36);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1611);
                    dateExpr275=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr275.getTree());
                    dbg.location(180,45);
                    char_literal276=(Token)match(input,82,FOLLOW_82_in_regexOp1613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal276_tree = 
                    (Object)adaptor.create(char_literal276)
                    ;
                    adaptor.addChild(root_0, char_literal276_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1618);
                    timeExpr277=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr277.getTree());
                    dbg.location(181,13);
                    char_literal278=(Token)match(input,84,FOLLOW_84_in_regexOp1620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal278_tree = 
                    (Object)adaptor.create(char_literal278)
                    ;
                    adaptor.addChild(root_0, char_literal278_tree);
                    }
                    dbg.location(181,17);
                    REGEXMATCH_TOK279=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK279_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK279)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK279_tree);
                    }
                    dbg.location(181,32);
                    char_literal280=(Token)match(input,81,FOLLOW_81_in_regexOp1624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal280_tree = 
                    (Object)adaptor.create(char_literal280)
                    ;
                    adaptor.addChild(root_0, char_literal280_tree);
                    }
                    dbg.location(181,36);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1626);
                    timeExpr281=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr281.getTree());
                    dbg.location(181,45);
                    char_literal282=(Token)match(input,82,FOLLOW_82_in_regexOp1628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal282_tree = 
                    (Object)adaptor.create(char_literal282)
                    ;
                    adaptor.addChild(root_0, char_literal282_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1633);
                    dateTimeExpr283=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr283.getTree());
                    dbg.location(182,17);
                    char_literal284=(Token)match(input,84,FOLLOW_84_in_regexOp1635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal284_tree = 
                    (Object)adaptor.create(char_literal284)
                    ;
                    adaptor.addChild(root_0, char_literal284_tree);
                    }
                    dbg.location(182,21);
                    REGEXMATCH_TOK285=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1637); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK285_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK285)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK285_tree);
                    }
                    dbg.location(182,36);
                    char_literal286=(Token)match(input,81,FOLLOW_81_in_regexOp1639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal286_tree = 
                    (Object)adaptor.create(char_literal286)
                    ;
                    adaptor.addChild(root_0, char_literal286_tree);
                    }
                    dbg.location(182,40);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1641);
                    dateTimeExpr287=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr287.getTree());
                    dbg.location(182,53);
                    char_literal288=(Token)match(input,82,FOLLOW_82_in_regexOp1643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal288_tree = 
                    (Object)adaptor.create(char_literal288)
                    ;
                    adaptor.addChild(root_0, char_literal288_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1648);
                    dayTimeDurationExpr289=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr289.getTree());
                    dbg.location(183,24);
                    char_literal290=(Token)match(input,84,FOLLOW_84_in_regexOp1650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal290_tree = 
                    (Object)adaptor.create(char_literal290)
                    ;
                    adaptor.addChild(root_0, char_literal290_tree);
                    }
                    dbg.location(183,28);
                    REGEXMATCH_TOK291=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK291_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK291)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK291_tree);
                    }
                    dbg.location(183,43);
                    char_literal292=(Token)match(input,81,FOLLOW_81_in_regexOp1654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal292_tree = 
                    (Object)adaptor.create(char_literal292)
                    ;
                    adaptor.addChild(root_0, char_literal292_tree);
                    }
                    dbg.location(183,47);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1656);
                    dayTimeDurationExpr293=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr293.getTree());
                    dbg.location(183,67);
                    char_literal294=(Token)match(input,82,FOLLOW_82_in_regexOp1658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal294_tree = 
                    (Object)adaptor.create(char_literal294)
                    ;
                    adaptor.addChild(root_0, char_literal294_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:4: yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(184,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1663);
                    yearMonthDurationExpr295=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr295.getTree());
                    dbg.location(184,26);
                    char_literal296=(Token)match(input,84,FOLLOW_84_in_regexOp1665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal296_tree = 
                    (Object)adaptor.create(char_literal296)
                    ;
                    adaptor.addChild(root_0, char_literal296_tree);
                    }
                    dbg.location(184,30);
                    REGEXMATCH_TOK297=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK297_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK297)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK297_tree);
                    }
                    dbg.location(184,45);
                    char_literal298=(Token)match(input,81,FOLLOW_81_in_regexOp1669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal298_tree = 
                    (Object)adaptor.create(char_literal298)
                    ;
                    adaptor.addChild(root_0, char_literal298_tree);
                    }
                    dbg.location(184,49);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1671);
                    yearMonthDurationExpr299=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr299.getTree());
                    dbg.location(184,71);
                    char_literal300=(Token)match(input,82,FOLLOW_82_in_regexOp1673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal300_tree = 
                    (Object)adaptor.create(char_literal300)
                    ;
                    adaptor.addChild(root_0, char_literal300_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:4: x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1678);
                    x500NameExpr301=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr301.getTree());
                    dbg.location(185,17);
                    char_literal302=(Token)match(input,84,FOLLOW_84_in_regexOp1680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal302_tree = 
                    (Object)adaptor.create(char_literal302)
                    ;
                    adaptor.addChild(root_0, char_literal302_tree);
                    }
                    dbg.location(185,21);
                    REGEXMATCH_TOK303=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK303_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK303)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK303_tree);
                    }
                    dbg.location(185,36);
                    char_literal304=(Token)match(input,81,FOLLOW_81_in_regexOp1684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal304_tree = 
                    (Object)adaptor.create(char_literal304)
                    ;
                    adaptor.addChild(root_0, char_literal304_tree);
                    }
                    dbg.location(185,40);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1686);
                    x500NameExpr305=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr305.getTree());
                    dbg.location(185,53);
                    char_literal306=(Token)match(input,82,FOLLOW_82_in_regexOp1688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = 
                    (Object)adaptor.create(char_literal306)
                    ;
                    adaptor.addChild(root_0, char_literal306_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:4: rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1693);
                    rfc822NameExpr307=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr307.getTree());
                    dbg.location(186,19);
                    char_literal308=(Token)match(input,84,FOLLOW_84_in_regexOp1695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal308_tree = 
                    (Object)adaptor.create(char_literal308)
                    ;
                    adaptor.addChild(root_0, char_literal308_tree);
                    }
                    dbg.location(186,23);
                    REGEXMATCH_TOK309=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK309_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK309)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK309_tree);
                    }
                    dbg.location(186,38);
                    char_literal310=(Token)match(input,81,FOLLOW_81_in_regexOp1699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal310_tree = 
                    (Object)adaptor.create(char_literal310)
                    ;
                    adaptor.addChild(root_0, char_literal310_tree);
                    }
                    dbg.location(186,42);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1701);
                    rfc822NameExpr311=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr311.getTree());
                    dbg.location(186,57);
                    char_literal312=(Token)match(input,82,FOLLOW_82_in_regexOp1703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal312_tree = 
                    (Object)adaptor.create(char_literal312)
                    ;
                    adaptor.addChild(root_0, char_literal312_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1714);
                    base64BinaryExpr313=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr313.getTree());
                    dbg.location(187,43);
                    char_literal314=(Token)match(input,84,FOLLOW_84_in_regexOp1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal314_tree = 
                    (Object)adaptor.create(char_literal314)
                    ;
                    adaptor.addChild(root_0, char_literal314_tree);
                    }
                    dbg.location(187,47);
                    REGEXMATCH_TOK315=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK315_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK315)
                    ;
                    adaptor.addChild(root_0, REGEXMATCH_TOK315_tree);
                    }
                    dbg.location(187,62);
                    char_literal316=(Token)match(input,81,FOLLOW_81_in_regexOp1720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal316_tree = 
                    (Object)adaptor.create(char_literal316)
                    ;
                    adaptor.addChild(root_0, char_literal316_tree);
                    }
                    dbg.location(187,66);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1722);
                    base64BinaryExpr317=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr317.getTree());
                    dbg.location(187,83);
                    char_literal318=(Token)match(input,82,FOLLOW_82_in_regexOp1724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal318_tree = 
                    (Object)adaptor.create(char_literal318)
                    ;
                    adaptor.addChild(root_0, char_literal318_tree);
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
        dbg.location(188, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:190:1: bagOp : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' );
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal320=null;
        Token set321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        Token char_literal326=null;
        Token set327=null;
        Token char_literal328=null;
        Token char_literal330=null;
        Token char_literal332=null;
        Token set333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        Token char_literal338=null;
        Token set339=null;
        Token char_literal340=null;
        Token char_literal342=null;
        Token char_literal344=null;
        Token set345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal350=null;
        Token set351=null;
        Token char_literal352=null;
        Token char_literal354=null;
        Token char_literal356=null;
        Token set357=null;
        Token char_literal358=null;
        Token char_literal360=null;
        Token char_literal362=null;
        Token set363=null;
        Token char_literal364=null;
        Token char_literal366=null;
        Token char_literal368=null;
        Token set369=null;
        Token char_literal370=null;
        Token char_literal372=null;
        Token char_literal374=null;
        Token set375=null;
        Token char_literal376=null;
        Token char_literal378=null;
        Token char_literal380=null;
        Token set381=null;
        Token char_literal382=null;
        Token char_literal384=null;
        Token char_literal386=null;
        Token set387=null;
        Token char_literal388=null;
        Token char_literal390=null;
        Token char_literal392=null;
        Token set393=null;
        Token char_literal394=null;
        Token char_literal396=null;
        Token char_literal398=null;
        Token set399=null;
        Token char_literal400=null;
        Token char_literal402=null;
        Token char_literal404=null;
        Token set405=null;
        Token char_literal406=null;
        Token char_literal408=null;
        GrammarParser.booleanBag_return booleanBag319 =null;

        GrammarParser.booleanBag_return booleanBag323 =null;

        GrammarParser.integerBag_return integerBag325 =null;

        GrammarParser.integerBag_return integerBag329 =null;

        GrammarParser.doubleBag_return doubleBag331 =null;

        GrammarParser.doubleBag_return doubleBag335 =null;

        GrammarParser.stringBag_return stringBag337 =null;

        GrammarParser.stringBag_return stringBag341 =null;

        GrammarParser.dateBag_return dateBag343 =null;

        GrammarParser.dateBag_return dateBag347 =null;

        GrammarParser.timeBag_return timeBag349 =null;

        GrammarParser.timeBag_return timeBag353 =null;

        GrammarParser.dateTimeBag_return dateTimeBag355 =null;

        GrammarParser.dateTimeBag_return dateTimeBag359 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag361 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag365 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag367 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag371 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag373 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag377 =null;

        GrammarParser.anyUriBag_return anyUriBag379 =null;

        GrammarParser.anyUriBag_return anyUriBag383 =null;

        GrammarParser.x500NameBag_return x500NameBag385 =null;

        GrammarParser.x500NameBag_return x500NameBag389 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag391 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag395 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag397 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag401 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag403 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag407 =null;


        Object char_literal320_tree=null;
        Object set321_tree=null;
        Object char_literal322_tree=null;
        Object char_literal324_tree=null;
        Object char_literal326_tree=null;
        Object set327_tree=null;
        Object char_literal328_tree=null;
        Object char_literal330_tree=null;
        Object char_literal332_tree=null;
        Object set333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal336_tree=null;
        Object char_literal338_tree=null;
        Object set339_tree=null;
        Object char_literal340_tree=null;
        Object char_literal342_tree=null;
        Object char_literal344_tree=null;
        Object set345_tree=null;
        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        Object char_literal350_tree=null;
        Object set351_tree=null;
        Object char_literal352_tree=null;
        Object char_literal354_tree=null;
        Object char_literal356_tree=null;
        Object set357_tree=null;
        Object char_literal358_tree=null;
        Object char_literal360_tree=null;
        Object char_literal362_tree=null;
        Object set363_tree=null;
        Object char_literal364_tree=null;
        Object char_literal366_tree=null;
        Object char_literal368_tree=null;
        Object set369_tree=null;
        Object char_literal370_tree=null;
        Object char_literal372_tree=null;
        Object char_literal374_tree=null;
        Object set375_tree=null;
        Object char_literal376_tree=null;
        Object char_literal378_tree=null;
        Object char_literal380_tree=null;
        Object set381_tree=null;
        Object char_literal382_tree=null;
        Object char_literal384_tree=null;
        Object char_literal386_tree=null;
        Object set387_tree=null;
        Object char_literal388_tree=null;
        Object char_literal390_tree=null;
        Object char_literal392_tree=null;
        Object set393_tree=null;
        Object char_literal394_tree=null;
        Object char_literal396_tree=null;
        Object char_literal398_tree=null;
        Object set399_tree=null;
        Object char_literal400_tree=null;
        Object char_literal402_tree=null;
        Object char_literal404_tree=null;
        Object set405_tree=null;
        Object char_literal406_tree=null;
        Object char_literal408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')' | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')' | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')' | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')' | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')' | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')' | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')' | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')' | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')' | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')' | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')' | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')' | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')' )
            int alt13=15;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==BOOLEAN_TOK) && (synpred9_Grammar())) {
                alt13=1;
            }
            else if ( (LA13_0==INTEGER_TOK) && (synpred10_Grammar())) {
                alt13=2;
            }
            else if ( (LA13_0==BAG_TOK) && (synpred10_Grammar())) {
                alt13=2;
            }
            else if ( (LA13_0==DOUBLE_TOK) && (synpred11_Grammar())) {
                alt13=3;
            }
            else if ( (LA13_0==STRING_TOK) && (synpred12_Grammar())) {
                alt13=4;
            }
            else if ( (LA13_0==ACTION_TOK||LA13_0==ENVIRONMENT_TOK||LA13_0==RESOURCE_TOK||LA13_0==SUBJECT_TOK) && (synpred12_Grammar())) {
                alt13=4;
            }
            else if ( (LA13_0==DATE_TOK) && (synpred13_Grammar())) {
                alt13=5;
            }
            else if ( (LA13_0==TIME_TOK) && (synpred14_Grammar())) {
                alt13=6;
            }
            else if ( (LA13_0==DATETIME_TOK) && (synpred15_Grammar())) {
                alt13=7;
            }
            else if ( (LA13_0==BASE64BINARY_TOK) ) {
                int LA13_10 = input.LA(2);

                if ( (LA13_10==STRING_CONSTANT_LIST) ) {
                    int LA13_17 = input.LA(3);

                    if ( (LA13_17==84) ) {
                        int LA13_18 = input.LA(4);

                        if ( (LA13_18==ATLEASTONEMENBEROF_TOK||LA13_18==SETEQUALS_TOK||LA13_18==SUBSET_TOK) ) {
                            int LA13_19 = input.LA(5);

                            if ( (LA13_19==81) ) {
                                int LA13_20 = input.LA(6);

                                if ( (LA13_20==BASE64BINARY_TOK) ) {
                                    int LA13_21 = input.LA(7);

                                    if ( (LA13_21==STRING_CONSTANT_LIST) ) {
                                        int LA13_22 = input.LA(8);

                                        if ( (LA13_22==82) ) {
                                            int LA13_23 = input.LA(9);

                                            if ( (synpred16_Grammar()) ) {
                                                alt13=8;
                                            }
                                            else if ( (synpred23_Grammar()) ) {
                                                alt13=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 13, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 13, 22, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 13, 21, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 20, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 18, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA13_0==DAYTIMEDURATION_TOK) && (synpred17_Grammar())) {
                alt13=9;
            }
            else if ( (LA13_0==YEARMONTHDURATION_TOK) && (synpred18_Grammar())) {
                alt13=10;
            }
            else if ( (LA13_0==ANYURI_TOK) && (synpred19_Grammar())) {
                alt13=11;
            }
            else if ( (LA13_0==X500NAME_TOK) && (synpred20_Grammar())) {
                alt13=12;
            }
            else if ( (LA13_0==RFC822NAME_TOK) && (synpred21_Grammar())) {
                alt13=13;
            }
            else if ( (LA13_0==HEXBINARY_TOK) && (synpred22_Grammar())) {
                alt13=14;
            }
            else {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(191,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1741);
                    booleanBag319=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag319.getTree());
                    dbg.location(191,31);
                    char_literal320=(Token)match(input,84,FOLLOW_84_in_bagOp1743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal320_tree = 
                    (Object)adaptor.create(char_literal320)
                    ;
                    adaptor.addChild(root_0, char_literal320_tree);
                    }
                    dbg.location(191,35);
                    set321=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set321)
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

                    dbg.location(191,91);
                    char_literal322=(Token)match(input,81,FOLLOW_81_in_bagOp1759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal322_tree = 
                    (Object)adaptor.create(char_literal322)
                    ;
                    adaptor.addChild(root_0, char_literal322_tree);
                    }
                    dbg.location(191,95);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1761);
                    booleanBag323=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag323.getTree());
                    dbg.location(191,106);
                    char_literal324=(Token)match(input,82,FOLLOW_82_in_bagOp1763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal324_tree = 
                    (Object)adaptor.create(char_literal324)
                    ;
                    adaptor.addChild(root_0, char_literal324_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' integerBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(192,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1774);
                    integerBag325=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag325.getTree());
                    dbg.location(192,31);
                    char_literal326=(Token)match(input,84,FOLLOW_84_in_bagOp1776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal326_tree = 
                    (Object)adaptor.create(char_literal326)
                    ;
                    adaptor.addChild(root_0, char_literal326_tree);
                    }
                    dbg.location(192,35);
                    set327=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set327)
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

                    dbg.location(192,92);
                    char_literal328=(Token)match(input,81,FOLLOW_81_in_bagOp1793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal328_tree = 
                    (Object)adaptor.create(char_literal328)
                    ;
                    adaptor.addChild(root_0, char_literal328_tree);
                    }
                    dbg.location(192,97);
                    pushFollow(FOLLOW_integerBag_in_bagOp1796);
                    integerBag329=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag329.getTree());
                    dbg.location(192,108);
                    char_literal330=(Token)match(input,82,FOLLOW_82_in_bagOp1798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = 
                    (Object)adaptor.create(char_literal330)
                    ;
                    adaptor.addChild(root_0, char_literal330_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' doubleBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1809);
                    doubleBag331=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag331.getTree());
                    dbg.location(193,29);
                    char_literal332=(Token)match(input,84,FOLLOW_84_in_bagOp1811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal332_tree = 
                    (Object)adaptor.create(char_literal332)
                    ;
                    adaptor.addChild(root_0, char_literal332_tree);
                    }
                    dbg.location(193,33);
                    set333=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
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

                    dbg.location(193,90);
                    char_literal334=(Token)match(input,81,FOLLOW_81_in_bagOp1828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = 
                    (Object)adaptor.create(char_literal334)
                    ;
                    adaptor.addChild(root_0, char_literal334_tree);
                    }
                    dbg.location(193,95);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1831);
                    doubleBag335=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag335.getTree());
                    dbg.location(193,105);
                    char_literal336=(Token)match(input,82,FOLLOW_82_in_bagOp1833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal336_tree = 
                    (Object)adaptor.create(char_literal336)
                    ;
                    adaptor.addChild(root_0, char_literal336_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' stringBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(194,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp1845);
                    stringBag337=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag337.getTree());
                    dbg.location(194,30);
                    char_literal338=(Token)match(input,84,FOLLOW_84_in_bagOp1847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal338_tree = 
                    (Object)adaptor.create(char_literal338)
                    ;
                    adaptor.addChild(root_0, char_literal338_tree);
                    }
                    dbg.location(194,34);
                    set339=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set339)
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

                    dbg.location(194,91);
                    char_literal340=(Token)match(input,81,FOLLOW_81_in_bagOp1864); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal340_tree = 
                    (Object)adaptor.create(char_literal340)
                    ;
                    adaptor.addChild(root_0, char_literal340_tree);
                    }
                    dbg.location(194,96);
                    pushFollow(FOLLOW_stringBag_in_bagOp1867);
                    stringBag341=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag341.getTree());
                    dbg.location(194,106);
                    char_literal342=(Token)match(input,82,FOLLOW_82_in_bagOp1869); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal342_tree = 
                    (Object)adaptor.create(char_literal342)
                    ;
                    adaptor.addChild(root_0, char_literal342_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(195,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp1881);
                    dateBag343=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag343.getTree());
                    dbg.location(195,26);
                    char_literal344=(Token)match(input,84,FOLLOW_84_in_bagOp1883); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal344_tree = 
                    (Object)adaptor.create(char_literal344)
                    ;
                    adaptor.addChild(root_0, char_literal344_tree);
                    }
                    dbg.location(195,30);
                    set345=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set345)
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

                    dbg.location(195,87);
                    char_literal346=(Token)match(input,81,FOLLOW_81_in_bagOp1900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal346_tree = 
                    (Object)adaptor.create(char_literal346)
                    ;
                    adaptor.addChild(root_0, char_literal346_tree);
                    }
                    dbg.location(195,92);
                    pushFollow(FOLLOW_dateBag_in_bagOp1903);
                    dateBag347=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag347.getTree());
                    dbg.location(195,100);
                    char_literal348=(Token)match(input,82,FOLLOW_82_in_bagOp1905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal348_tree = 
                    (Object)adaptor.create(char_literal348)
                    ;
                    adaptor.addChild(root_0, char_literal348_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' timeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(196,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp1917);
                    timeBag349=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag349.getTree());
                    dbg.location(196,26);
                    char_literal350=(Token)match(input,84,FOLLOW_84_in_bagOp1919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal350_tree = 
                    (Object)adaptor.create(char_literal350)
                    ;
                    adaptor.addChild(root_0, char_literal350_tree);
                    }
                    dbg.location(196,30);
                    set351=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
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

                    dbg.location(196,87);
                    char_literal352=(Token)match(input,81,FOLLOW_81_in_bagOp1936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal352_tree = 
                    (Object)adaptor.create(char_literal352)
                    ;
                    adaptor.addChild(root_0, char_literal352_tree);
                    }
                    dbg.location(196,92);
                    pushFollow(FOLLOW_timeBag_in_bagOp1939);
                    timeBag353=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag353.getTree());
                    dbg.location(196,100);
                    char_literal354=(Token)match(input,82,FOLLOW_82_in_bagOp1941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal354_tree = 
                    (Object)adaptor.create(char_literal354)
                    ;
                    adaptor.addChild(root_0, char_literal354_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dateTimeBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(197,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1953);
                    dateTimeBag355=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag355.getTree());
                    dbg.location(197,34);
                    char_literal356=(Token)match(input,84,FOLLOW_84_in_bagOp1955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal356_tree = 
                    (Object)adaptor.create(char_literal356)
                    ;
                    adaptor.addChild(root_0, char_literal356_tree);
                    }
                    dbg.location(197,38);
                    set357=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set357)
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

                    dbg.location(197,95);
                    char_literal358=(Token)match(input,81,FOLLOW_81_in_bagOp1972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal358_tree = 
                    (Object)adaptor.create(char_literal358)
                    ;
                    adaptor.addChild(root_0, char_literal358_tree);
                    }
                    dbg.location(197,100);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp1975);
                    dateTimeBag359=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag359.getTree());
                    dbg.location(197,112);
                    char_literal360=(Token)match(input,82,FOLLOW_82_in_bagOp1977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal360_tree = 
                    (Object)adaptor.create(char_literal360)
                    ;
                    adaptor.addChild(root_0, char_literal360_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(198,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp1989);
                    base64BinaryBag361=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag361.getTree());
                    dbg.location(198,42);
                    char_literal362=(Token)match(input,84,FOLLOW_84_in_bagOp1991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal362_tree = 
                    (Object)adaptor.create(char_literal362)
                    ;
                    adaptor.addChild(root_0, char_literal362_tree);
                    }
                    dbg.location(198,46);
                    set363=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set363)
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

                    dbg.location(198,103);
                    char_literal364=(Token)match(input,81,FOLLOW_81_in_bagOp2008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal364_tree = 
                    (Object)adaptor.create(char_literal364)
                    ;
                    adaptor.addChild(root_0, char_literal364_tree);
                    }
                    dbg.location(198,108);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2011);
                    base64BinaryBag365=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag365.getTree());
                    dbg.location(198,124);
                    char_literal366=(Token)match(input,82,FOLLOW_82_in_bagOp2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal366_tree = 
                    (Object)adaptor.create(char_literal366)
                    ;
                    adaptor.addChild(root_0, char_literal366_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' dayTimeDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(199,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2025);
                    dayTimeDurationBag367=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag367.getTree());
                    dbg.location(199,48);
                    char_literal368=(Token)match(input,84,FOLLOW_84_in_bagOp2027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal368_tree = 
                    (Object)adaptor.create(char_literal368)
                    ;
                    adaptor.addChild(root_0, char_literal368_tree);
                    }
                    dbg.location(199,52);
                    set369=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set369)
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

                    dbg.location(199,109);
                    char_literal370=(Token)match(input,81,FOLLOW_81_in_bagOp2044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal370_tree = 
                    (Object)adaptor.create(char_literal370)
                    ;
                    adaptor.addChild(root_0, char_literal370_tree);
                    }
                    dbg.location(199,114);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2047);
                    dayTimeDurationBag371=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag371.getTree());
                    dbg.location(199,133);
                    char_literal372=(Token)match(input,82,FOLLOW_82_in_bagOp2049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal372_tree = 
                    (Object)adaptor.create(char_literal372)
                    ;
                    adaptor.addChild(root_0, char_literal372_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' yearMonthDurationBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2061);
                    yearMonthDurationBag373=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag373.getTree());
                    dbg.location(200,52);
                    char_literal374=(Token)match(input,84,FOLLOW_84_in_bagOp2063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal374_tree = 
                    (Object)adaptor.create(char_literal374)
                    ;
                    adaptor.addChild(root_0, char_literal374_tree);
                    }
                    dbg.location(200,56);
                    set375=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set375)
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

                    dbg.location(200,113);
                    char_literal376=(Token)match(input,81,FOLLOW_81_in_bagOp2080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal376_tree = 
                    (Object)adaptor.create(char_literal376)
                    ;
                    adaptor.addChild(root_0, char_literal376_tree);
                    }
                    dbg.location(200,118);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2083);
                    yearMonthDurationBag377=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag377.getTree());
                    dbg.location(200,139);
                    char_literal378=(Token)match(input,82,FOLLOW_82_in_bagOp2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal378_tree = 
                    (Object)adaptor.create(char_literal378)
                    ;
                    adaptor.addChild(root_0, char_literal378_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' anyUriBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2097);
                    anyUriBag379=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag379.getTree());
                    dbg.location(201,30);
                    char_literal380=(Token)match(input,84,FOLLOW_84_in_bagOp2099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal380_tree = 
                    (Object)adaptor.create(char_literal380)
                    ;
                    adaptor.addChild(root_0, char_literal380_tree);
                    }
                    dbg.location(201,34);
                    set381=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set381)
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

                    dbg.location(201,91);
                    char_literal382=(Token)match(input,81,FOLLOW_81_in_bagOp2116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = 
                    (Object)adaptor.create(char_literal382)
                    ;
                    adaptor.addChild(root_0, char_literal382_tree);
                    }
                    dbg.location(201,96);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2119);
                    anyUriBag383=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag383.getTree());
                    dbg.location(201,106);
                    char_literal384=(Token)match(input,82,FOLLOW_82_in_bagOp2121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal384_tree = 
                    (Object)adaptor.create(char_literal384)
                    ;
                    adaptor.addChild(root_0, char_literal384_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' x500NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2133);
                    x500NameBag385=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag385.getTree());
                    dbg.location(202,34);
                    char_literal386=(Token)match(input,84,FOLLOW_84_in_bagOp2135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal386_tree = 
                    (Object)adaptor.create(char_literal386)
                    ;
                    adaptor.addChild(root_0, char_literal386_tree);
                    }
                    dbg.location(202,38);
                    set387=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set387)
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

                    dbg.location(202,95);
                    char_literal388=(Token)match(input,81,FOLLOW_81_in_bagOp2152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal388_tree = 
                    (Object)adaptor.create(char_literal388)
                    ;
                    adaptor.addChild(root_0, char_literal388_tree);
                    }
                    dbg.location(202,100);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2155);
                    x500NameBag389=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag389.getTree());
                    dbg.location(202,112);
                    char_literal390=(Token)match(input,82,FOLLOW_82_in_bagOp2157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal390_tree = 
                    (Object)adaptor.create(char_literal390)
                    ;
                    adaptor.addChild(root_0, char_literal390_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' rfc822NameBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2169);
                    rfc822NameBag391=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag391.getTree());
                    dbg.location(203,38);
                    char_literal392=(Token)match(input,84,FOLLOW_84_in_bagOp2171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal392_tree = 
                    (Object)adaptor.create(char_literal392)
                    ;
                    adaptor.addChild(root_0, char_literal392_tree);
                    }
                    dbg.location(203,42);
                    set393=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set393)
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

                    dbg.location(203,99);
                    char_literal394=(Token)match(input,81,FOLLOW_81_in_bagOp2188); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal394_tree = 
                    (Object)adaptor.create(char_literal394)
                    ;
                    adaptor.addChild(root_0, char_literal394_tree);
                    }
                    dbg.location(203,104);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2191);
                    rfc822NameBag395=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag395.getTree());
                    dbg.location(203,118);
                    char_literal396=(Token)match(input,82,FOLLOW_82_in_bagOp2193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal396_tree = 
                    (Object)adaptor.create(char_literal396)
                    ;
                    adaptor.addChild(root_0, char_literal396_tree);
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' hexBinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2205);
                    hexBinaryBag397=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag397.getTree());
                    dbg.location(204,36);
                    char_literal398=(Token)match(input,84,FOLLOW_84_in_bagOp2207); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal398_tree = 
                    (Object)adaptor.create(char_literal398)
                    ;
                    adaptor.addChild(root_0, char_literal398_tree);
                    }
                    dbg.location(204,40);
                    set399=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set399)
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

                    dbg.location(204,97);
                    char_literal400=(Token)match(input,81,FOLLOW_81_in_bagOp2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal400_tree = 
                    (Object)adaptor.create(char_literal400)
                    ;
                    adaptor.addChild(root_0, char_literal400_tree);
                    }
                    dbg.location(204,102);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2227);
                    hexBinaryBag401=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag401.getTree());
                    dbg.location(204,115);
                    char_literal402=(Token)match(input,82,FOLLOW_82_in_bagOp2229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal402_tree = 
                    (Object)adaptor.create(char_literal402)
                    ;
                    adaptor.addChild(root_0, char_literal402_tree);
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' base64BinaryBag ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(205,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2240);
                    base64BinaryBag403=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag403.getTree());
                    dbg.location(205,41);
                    char_literal404=(Token)match(input,84,FOLLOW_84_in_bagOp2242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal404_tree = 
                    (Object)adaptor.create(char_literal404)
                    ;
                    adaptor.addChild(root_0, char_literal404_tree);
                    }
                    dbg.location(205,45);
                    set405=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set405)
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

                    dbg.location(205,102);
                    char_literal406=(Token)match(input,81,FOLLOW_81_in_bagOp2259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal406_tree = 
                    (Object)adaptor.create(char_literal406)
                    ;
                    adaptor.addChild(root_0, char_literal406_tree);
                    }
                    dbg.location(205,107);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2262);
                    base64BinaryBag407=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag407.getTree());
                    dbg.location(205,123);
                    char_literal408=(Token)match(input,82,FOLLOW_82_in_bagOp2264); if (state.failed) return retval;
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
        dbg.location(206, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' );
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT409=null;
        Token char_literal411=null;
        Token set412=null;
        Token char_literal413=null;
        Token char_literal414=null;
        Token char_literal416=null;
        Token SIZE_TOK417=null;
        Token char_literal418=null;
        Token char_literal419=null;
        GrammarParser.stringExpr_return stringExpr410 =null;

        GrammarParser.anyBag_return anyBag415 =null;


        Object INTEGER_CONSTANT409_tree=null;
        Object char_literal411_tree=null;
        Object set412_tree=null;
        Object char_literal413_tree=null;
        Object char_literal414_tree=null;
        Object char_literal416_tree=null;
        Object SIZE_TOK417_tree=null;
        Object char_literal418_tree=null;
        Object char_literal419_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:2: ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' )
            int alt14=3;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            try {
                isCyclicDecision = true;
                alt14 = dfa14.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:4: INTEGER_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(209,4);
                    INTEGER_CONSTANT409=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT409_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT409)
                    ;
                    adaptor.addChild(root_0, INTEGER_CONSTANT409_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(210,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2280);
                    stringExpr410=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr410.getTree());
                    dbg.location(210,15);
                    char_literal411=(Token)match(input,84,FOLLOW_84_in_integerExpr2282); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal411_tree = 
                    (Object)adaptor.create(char_literal411)
                    ;
                    adaptor.addChild(root_0, char_literal411_tree);
                    }
                    dbg.location(210,19);
                    set412=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set412)
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

                    dbg.location(210,51);
                    char_literal413=(Token)match(input,81,FOLLOW_81_in_integerExpr2294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal413_tree = 
                    (Object)adaptor.create(char_literal413)
                    ;
                    adaptor.addChild(root_0, char_literal413_tree);
                    }
                    dbg.location(210,56);
                    char_literal414=(Token)match(input,82,FOLLOW_82_in_integerExpr2297); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = 
                    (Object)adaptor.create(char_literal414)
                    ;
                    adaptor.addChild(root_0, char_literal414_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: anyBag '.' SIZE_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(211,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2302);
                    anyBag415=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag415.getTree());
                    dbg.location(211,11);
                    char_literal416=(Token)match(input,84,FOLLOW_84_in_integerExpr2304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal416_tree = 
                    (Object)adaptor.create(char_literal416)
                    ;
                    adaptor.addChild(root_0, char_literal416_tree);
                    }
                    dbg.location(211,15);
                    SIZE_TOK417=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK417_tree = 
                    (Object)adaptor.create(SIZE_TOK417)
                    ;
                    adaptor.addChild(root_0, SIZE_TOK417_tree);
                    }
                    dbg.location(211,24);
                    char_literal418=(Token)match(input,81,FOLLOW_81_in_integerExpr2308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal418_tree = 
                    (Object)adaptor.create(char_literal418)
                    ;
                    adaptor.addChild(root_0, char_literal418_tree);
                    }
                    dbg.location(211,28);
                    char_literal419=(Token)match(input,82,FOLLOW_82_in_integerExpr2310); if (state.failed) return retval;
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
        dbg.location(215, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:1: integerBag : ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK420=null;
        Token STRING_CONSTANT_LIST421=null;
        Token BAG_TOK422=null;
        Token char_literal423=null;
        Token char_literal425=null;
        Token char_literal427=null;
        Token char_literal428=null;
        Token set429=null;
        Token char_literal430=null;
        Token char_literal432=null;
        GrammarParser.integerExpr_return integerExpr424 =null;

        GrammarParser.integerExpr_return integerExpr426 =null;

        GrammarParser.integerBag_return integerBag431 =null;


        Object INTEGER_TOK420_tree=null;
        Object STRING_CONSTANT_LIST421_tree=null;
        Object BAG_TOK422_tree=null;
        Object char_literal423_tree=null;
        Object char_literal425_tree=null;
        Object char_literal427_tree=null;
        Object char_literal428_tree=null;
        Object set429_tree=null;
        Object char_literal430_tree=null;
        Object char_literal432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:2: ( ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(217,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')' )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==INTEGER_TOK) ) {
                alt16=1;
            }
            else if ( (LA16_0==BAG_TOK) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:5: INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    dbg.location(217,5);
                    INTEGER_TOK420=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK420_tree = 
                    (Object)adaptor.create(INTEGER_TOK420)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK420_tree);
                    }
                    dbg.location(217,17);
                    STRING_CONSTANT_LIST421=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST421_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST421)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST421_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:40: BAG_TOK '(' integerExpr ( ',' integerExpr )+ ')'
                    {
                    dbg.location(217,40);
                    BAG_TOK422=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK422_tree = 
                    (Object)adaptor.create(BAG_TOK422)
                    ;
                    adaptor.addChild(root_0, BAG_TOK422_tree);
                    }
                    dbg.location(217,48);
                    char_literal423=(Token)match(input,81,FOLLOW_81_in_integerBag2332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal423_tree = 
                    (Object)adaptor.create(char_literal423)
                    ;
                    adaptor.addChild(root_0, char_literal423_tree);
                    }
                    dbg.location(217,52);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2334);
                    integerExpr424=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr424.getTree());
                    dbg.location(217,64);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:64: ( ',' integerExpr )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==83) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:66: ',' integerExpr
                    	    {
                    	    dbg.location(217,66);
                    	    char_literal425=(Token)match(input,83,FOLLOW_83_in_integerBag2338); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal425_tree = 
                    	    (Object)adaptor.create(char_literal425)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal425_tree);
                    	    }
                    	    dbg.location(217,70);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2340);
                    	    integerExpr426=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr426.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(217,84);
                    char_literal427=(Token)match(input,82,FOLLOW_82_in_integerBag2344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal427_tree = 
                    (Object)adaptor.create(char_literal427)
                    ;
                    adaptor.addChild(root_0, char_literal427_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(217,89);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:89: ( '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')' )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==84) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==INTERSECTION_TOK||LA17_1==UNION_TOK) ) {
                        alt17=1;
                    }


                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:90: '.' ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ')'
            	    {
            	    dbg.location(217,90);
            	    char_literal428=(Token)match(input,84,FOLLOW_84_in_integerBag2348); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal428_tree = 
            	    (Object)adaptor.create(char_literal428)
            	    ;
            	    adaptor.addChild(root_0, char_literal428_tree);
            	    }
            	    dbg.location(217,94);
            	    set429=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set429)
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

            	    dbg.location(217,127);
            	    char_literal430=(Token)match(input,81,FOLLOW_81_in_integerBag2360); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal430_tree = 
            	    (Object)adaptor.create(char_literal430)
            	    ;
            	    adaptor.addChild(root_0, char_literal430_tree);
            	    }
            	    dbg.location(217,131);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2362);
            	    integerBag431=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag431.getTree());
            	    dbg.location(217,142);
            	    char_literal432=(Token)match(input,82,FOLLOW_82_in_integerBag2364); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal432_tree = 
            	    (Object)adaptor.create(char_literal432)
            	    ;
            	    adaptor.addChild(root_0, char_literal432_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


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
        dbg.location(218, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:220:1: doubleExpr : ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' );
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT433=null;
        Token DOUBLE_TOK434=null;
        Token char_literal435=null;
        Token char_literal437=null;
        GrammarParser.stringExpr_return stringExpr436 =null;


        Object DOUBLE_CONSTANT433_tree=null;
        Object DOUBLE_TOK434_tree=null;
        Object char_literal435_tree=null;
        Object char_literal437_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:221:2: ( DOUBLE_CONSTANT | DOUBLE_TOK '(' stringExpr ')' )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==DOUBLE_CONSTANT) ) {
                alt18=1;
            }
            else if ( (LA18_0==DOUBLE_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:221:4: DOUBLE_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(221,4);
                    DOUBLE_CONSTANT433=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT433_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT433)
                    ;
                    adaptor.addChild(root_0, DOUBLE_CONSTANT433_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:4: DOUBLE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(222,4);
                    DOUBLE_TOK434=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK434_tree = 
                    (Object)adaptor.create(DOUBLE_TOK434)
                    ;
                    adaptor.addChild(root_0, DOUBLE_TOK434_tree);
                    }
                    dbg.location(222,15);
                    char_literal435=(Token)match(input,81,FOLLOW_81_in_doubleExpr2384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal435_tree = 
                    (Object)adaptor.create(char_literal435)
                    ;
                    adaptor.addChild(root_0, char_literal435_tree);
                    }
                    dbg.location(222,19);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2386);
                    stringExpr436=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr436.getTree());
                    dbg.location(222,30);
                    char_literal437=(Token)match(input,82,FOLLOW_82_in_doubleExpr2388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal437_tree = 
                    (Object)adaptor.create(char_literal437)
                    ;
                    adaptor.addChild(root_0, char_literal437_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:1: doubleBag : ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK438=null;
        Token STRING_CONSTANT_LIST439=null;

        Object DOUBLE_TOK438_tree=null;
        Object STRING_CONSTANT_LIST439_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:2: ( ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: ( DOUBLE_TOK )=> DOUBLE_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(227,20);
            DOUBLE_TOK438=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2406); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK438_tree = 
            (Object)adaptor.create(DOUBLE_TOK438)
            ;
            adaptor.addChild(root_0, DOUBLE_TOK438_tree);
            }
            dbg.location(227,31);
            STRING_CONSTANT_LIST439=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST439_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST439)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST439_tree);
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
        dbg.location(230, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:1: stringExpr : ( ( STRING_CONSTANT )=> STRING_CONSTANT | stringBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT440=null;
        Token char_literal442=null;
        Token ONEANDONLY_TOK443=null;
        Token char_literal444=null;
        Token char_literal445=null;
        GrammarParser.stringBag_return stringBag441 =null;


        Object STRING_CONSTANT440_tree=null;
        Object char_literal442_tree=null;
        Object ONEANDONLY_TOK443_tree=null;
        Object char_literal444_tree=null;
        Object char_literal445_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:2: ( ( STRING_CONSTANT )=> STRING_CONSTANT | stringBag '.' ONEANDONLY_TOK '(' ')' )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==STRING_CONSTANT) && (synpred25_Grammar())) {
                alt19=1;
            }
            else if ( (LA19_0==ACTION_TOK||LA19_0==ENVIRONMENT_TOK||LA19_0==RESOURCE_TOK||(LA19_0 >= STRING_TOK && LA19_0 <= SUBJECT_TOK)) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( STRING_CONSTANT )=> STRING_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,25);
                    STRING_CONSTANT440=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT440_tree = 
                    (Object)adaptor.create(STRING_CONSTANT440)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT440_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: stringBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(235,4);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2434);
                    stringBag441=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag441.getTree());
                    dbg.location(235,14);
                    char_literal442=(Token)match(input,84,FOLLOW_84_in_stringExpr2436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal442_tree = 
                    (Object)adaptor.create(char_literal442)
                    ;
                    adaptor.addChild(root_0, char_literal442_tree);
                    }
                    dbg.location(235,18);
                    ONEANDONLY_TOK443=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK443_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK443)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK443_tree);
                    }
                    dbg.location(235,33);
                    char_literal444=(Token)match(input,81,FOLLOW_81_in_stringExpr2440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal444_tree = 
                    (Object)adaptor.create(char_literal444)
                    ;
                    adaptor.addChild(root_0, char_literal444_tree);
                    }
                    dbg.location(235,37);
                    char_literal445=(Token)match(input,82,FOLLOW_82_in_stringExpr2442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal445_tree = 
                    (Object)adaptor.create(char_literal445)
                    ;
                    adaptor.addChild(root_0, char_literal445_tree);
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
        dbg.location(237, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:1: stringBag : ( STRING_TOK STRING_CONSTANT_LIST | attributeExpr );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK446=null;
        Token STRING_CONSTANT_LIST447=null;
        GrammarParser.attributeExpr_return attributeExpr448 =null;


        Object STRING_TOK446_tree=null;
        Object STRING_CONSTANT_LIST447_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:2: ( STRING_TOK STRING_CONSTANT_LIST | attributeExpr )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==STRING_TOK) ) {
                alt20=1;
            }
            else if ( (LA20_0==ACTION_TOK||LA20_0==ENVIRONMENT_TOK||LA20_0==RESOURCE_TOK||LA20_0==SUBJECT_TOK) ) {
                alt20=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: STRING_TOK STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(239,4);
                    STRING_TOK446=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK446_tree = 
                    (Object)adaptor.create(STRING_TOK446)
                    ;
                    adaptor.addChild(root_0, STRING_TOK446_tree);
                    }
                    dbg.location(239,15);
                    STRING_CONSTANT_LIST447=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST447_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST447)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST447_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(240,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringBag2460);
                    attributeExpr448=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr448.getTree());

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
        dbg.location(242, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:1: attributeExpr : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set449=null;
        Token char_literal450=null;
        Token LOWERCASEIDENTIFIER451=null;

        Object set449_tree=null;
        Object char_literal450_tree=null;
        Object LOWERCASEIDENTIFIER451_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(246,4);
            set449=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set449)
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

            dbg.location(246,65);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:65: ( '.' LOWERCASEIDENTIFIER )+
            int cnt21=0;
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==84) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==LOWERCASEIDENTIFIER) ) {
                        alt21=1;
                    }


                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:66: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(246,66);
            	    char_literal450=(Token)match(input,84,FOLLOW_84_in_attributeExpr2492); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal450_tree = 
            	    (Object)adaptor.create(char_literal450)
            	    ;
            	    adaptor.addChild(root_0, char_literal450_tree);
            	    }
            	    dbg.location(246,70);
            	    LOWERCASEIDENTIFIER451=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2494); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER451_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER451)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER451_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt21++;
            } while (true);
            } finally {dbg.exitSubRule(21);}


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
        dbg.location(247, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:1: anyUriExpr : ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' );
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK452=null;
        Token char_literal453=null;
        Token char_literal455=null;
        Token char_literal457=null;
        Token ONEANDONLY_TOK458=null;
        Token char_literal459=null;
        Token char_literal460=null;
        Token char_literal462=null;
        Token URI_TOK463=null;
        Token char_literal464=null;
        Token char_literal465=null;
        GrammarParser.stringExpr_return stringExpr454 =null;

        GrammarParser.anyUriBag_return anyUriBag456 =null;

        GrammarParser.stringExpr_return stringExpr461 =null;


        Object ANYURI_TOK452_tree=null;
        Object char_literal453_tree=null;
        Object char_literal455_tree=null;
        Object char_literal457_tree=null;
        Object ONEANDONLY_TOK458_tree=null;
        Object char_literal459_tree=null;
        Object char_literal460_tree=null;
        Object char_literal462_tree=null;
        Object URI_TOK463_tree=null;
        Object char_literal464_tree=null;
        Object char_literal465_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:2: ( ANYURI_TOK '(' stringExpr ')' | anyUriBag '.' ONEANDONLY_TOK '(' ')' | ( stringExpr )=> stringExpr '.' URI_TOK '(' ')' )
            int alt22=3;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==ANYURI_TOK) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==81) ) {
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
            else if ( (LA22_0==STRING_CONSTANT) && (synpred26_Grammar())) {
                alt22=3;
            }
            else if ( (LA22_0==STRING_TOK) && (synpred26_Grammar())) {
                alt22=3;
            }
            else if ( (LA22_0==ACTION_TOK||LA22_0==ENVIRONMENT_TOK||LA22_0==RESOURCE_TOK||LA22_0==SUBJECT_TOK) && (synpred26_Grammar())) {
                alt22=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:4: ANYURI_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(250,4);
                    ANYURI_TOK452=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK452_tree = 
                    (Object)adaptor.create(ANYURI_TOK452)
                    ;
                    adaptor.addChild(root_0, ANYURI_TOK452_tree);
                    }
                    dbg.location(250,15);
                    char_literal453=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal453_tree = 
                    (Object)adaptor.create(char_literal453)
                    ;
                    adaptor.addChild(root_0, char_literal453_tree);
                    }
                    dbg.location(250,19);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2512);
                    stringExpr454=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr454.getTree());
                    dbg.location(250,30);
                    char_literal455=(Token)match(input,82,FOLLOW_82_in_anyUriExpr2514); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal455_tree = 
                    (Object)adaptor.create(char_literal455)
                    ;
                    adaptor.addChild(root_0, char_literal455_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:4: anyUriBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(252,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2520);
                    anyUriBag456=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag456.getTree());
                    dbg.location(252,14);
                    char_literal457=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal457_tree = 
                    (Object)adaptor.create(char_literal457)
                    ;
                    adaptor.addChild(root_0, char_literal457_tree);
                    }
                    dbg.location(252,18);
                    ONEANDONLY_TOK458=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK458_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK458)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK458_tree);
                    }
                    dbg.location(252,33);
                    char_literal459=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal459_tree = 
                    (Object)adaptor.create(char_literal459)
                    ;
                    adaptor.addChild(root_0, char_literal459_tree);
                    }
                    dbg.location(252,37);
                    char_literal460=(Token)match(input,82,FOLLOW_82_in_anyUriExpr2528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal460_tree = 
                    (Object)adaptor.create(char_literal460)
                    ;
                    adaptor.addChild(root_0, char_literal460_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( stringExpr )=> stringExpr '.' URI_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(253,20);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2539);
                    stringExpr461=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr461.getTree());
                    dbg.location(253,31);
                    char_literal462=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal462_tree = 
                    (Object)adaptor.create(char_literal462)
                    ;
                    adaptor.addChild(root_0, char_literal462_tree);
                    }
                    dbg.location(253,35);
                    URI_TOK463=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK463_tree = 
                    (Object)adaptor.create(URI_TOK463)
                    ;
                    adaptor.addChild(root_0, URI_TOK463_tree);
                    }
                    dbg.location(253,43);
                    char_literal464=(Token)match(input,81,FOLLOW_81_in_anyUriExpr2545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal464_tree = 
                    (Object)adaptor.create(char_literal464)
                    ;
                    adaptor.addChild(root_0, char_literal464_tree);
                    }
                    dbg.location(253,47);
                    char_literal465=(Token)match(input,82,FOLLOW_82_in_anyUriExpr2547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal465_tree = 
                    (Object)adaptor.create(char_literal465)
                    ;
                    adaptor.addChild(root_0, char_literal465_tree);
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
        dbg.location(255, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:1: anyUriBag : ANYURI_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK466=null;
        Token STRING_CONSTANT_LIST467=null;

        Object ANYURI_TOK466_tree=null;
        Object STRING_CONSTANT_LIST467_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:2: ( ANYURI_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:4: ANYURI_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(258,4);
            ANYURI_TOK466=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2559); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK466_tree = 
            (Object)adaptor.create(ANYURI_TOK466)
            ;
            adaptor.addChild(root_0, ANYURI_TOK466_tree);
            }
            dbg.location(258,15);
            STRING_CONSTANT_LIST467=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2561); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST467_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST467)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST467_tree);
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
        dbg.location(260, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:1: dateExpr : ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK468=null;
        Token char_literal469=null;
        Token char_literal471=null;
        Token char_literal473=null;
        Token ONEANDONLY_TOK474=null;
        Token char_literal475=null;
        Token char_literal476=null;
        GrammarParser.stringExpr_return stringExpr470 =null;

        GrammarParser.dateBag_return dateBag472 =null;


        Object DATE_TOK468_tree=null;
        Object char_literal469_tree=null;
        Object char_literal471_tree=null;
        Object char_literal473_tree=null;
        Object ONEANDONLY_TOK474_tree=null;
        Object char_literal475_tree=null;
        Object char_literal476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:263:2: ( DATE_TOK '(' stringExpr ')' | dateBag '.' ONEANDONLY_TOK '(' ')' )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==DATE_TOK) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==81) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:263:4: DATE_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(263,4);
                    DATE_TOK468=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK468_tree = 
                    (Object)adaptor.create(DATE_TOK468)
                    ;
                    adaptor.addChild(root_0, DATE_TOK468_tree);
                    }
                    dbg.location(263,13);
                    char_literal469=(Token)match(input,81,FOLLOW_81_in_dateExpr2575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal469_tree = 
                    (Object)adaptor.create(char_literal469)
                    ;
                    adaptor.addChild(root_0, char_literal469_tree);
                    }
                    dbg.location(263,17);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2577);
                    stringExpr470=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr470.getTree());
                    dbg.location(263,28);
                    char_literal471=(Token)match(input,82,FOLLOW_82_in_dateExpr2579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal471_tree = 
                    (Object)adaptor.create(char_literal471)
                    ;
                    adaptor.addChild(root_0, char_literal471_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:4: dateBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(264,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2584);
                    dateBag472=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag472.getTree());
                    dbg.location(264,12);
                    char_literal473=(Token)match(input,84,FOLLOW_84_in_dateExpr2586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal473_tree = 
                    (Object)adaptor.create(char_literal473)
                    ;
                    adaptor.addChild(root_0, char_literal473_tree);
                    }
                    dbg.location(264,16);
                    ONEANDONLY_TOK474=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK474_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK474)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK474_tree);
                    }
                    dbg.location(264,31);
                    char_literal475=(Token)match(input,81,FOLLOW_81_in_dateExpr2590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal475_tree = 
                    (Object)adaptor.create(char_literal475)
                    ;
                    adaptor.addChild(root_0, char_literal475_tree);
                    }
                    dbg.location(264,35);
                    char_literal476=(Token)match(input,82,FOLLOW_82_in_dateExpr2592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal476_tree = 
                    (Object)adaptor.create(char_literal476)
                    ;
                    adaptor.addChild(root_0, char_literal476_tree);
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
        dbg.location(265, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:1: dateBag : ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK477=null;
        Token STRING_CONSTANT_LIST478=null;

        Object DATE_TOK477_tree=null;
        Object STRING_CONSTANT_LIST478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:2: ( ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(267,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: ( ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:5: ( DATE_TOK )=> DATE_TOK STRING_CONSTANT_LIST
            {
            dbg.location(267,18);
            DATE_TOK477=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2608); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK477_tree = 
            (Object)adaptor.create(DATE_TOK477)
            ;
            adaptor.addChild(root_0, DATE_TOK477_tree);
            }
            dbg.location(267,27);
            STRING_CONSTANT_LIST478=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2610); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST478_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST478)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST478_tree);
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
        dbg.location(270, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:1: timeExpr : ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK479=null;
        Token char_literal480=null;
        Token char_literal482=null;
        Token char_literal484=null;
        Token ONEANDONLY_TOK485=null;
        Token char_literal486=null;
        Token char_literal487=null;
        GrammarParser.stringExpr_return stringExpr481 =null;

        GrammarParser.timeBag_return timeBag483 =null;


        Object TIME_TOK479_tree=null;
        Object char_literal480_tree=null;
        Object char_literal482_tree=null;
        Object char_literal484_tree=null;
        Object ONEANDONLY_TOK485_tree=null;
        Object char_literal486_tree=null;
        Object char_literal487_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:273:2: ( TIME_TOK '(' stringExpr ')' | timeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==TIME_TOK) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==81) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:273:4: TIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(273,4);
                    TIME_TOK479=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK479_tree = 
                    (Object)adaptor.create(TIME_TOK479)
                    ;
                    adaptor.addChild(root_0, TIME_TOK479_tree);
                    }
                    dbg.location(273,13);
                    char_literal480=(Token)match(input,81,FOLLOW_81_in_timeExpr2626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal480_tree = 
                    (Object)adaptor.create(char_literal480)
                    ;
                    adaptor.addChild(root_0, char_literal480_tree);
                    }
                    dbg.location(273,17);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2628);
                    stringExpr481=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr481.getTree());
                    dbg.location(273,28);
                    char_literal482=(Token)match(input,82,FOLLOW_82_in_timeExpr2630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal482_tree = 
                    (Object)adaptor.create(char_literal482)
                    ;
                    adaptor.addChild(root_0, char_literal482_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:4: timeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(274,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2635);
                    timeBag483=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag483.getTree());
                    dbg.location(274,12);
                    char_literal484=(Token)match(input,84,FOLLOW_84_in_timeExpr2637); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal484_tree = 
                    (Object)adaptor.create(char_literal484)
                    ;
                    adaptor.addChild(root_0, char_literal484_tree);
                    }
                    dbg.location(274,16);
                    ONEANDONLY_TOK485=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK485_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK485)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK485_tree);
                    }
                    dbg.location(274,31);
                    char_literal486=(Token)match(input,81,FOLLOW_81_in_timeExpr2641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal486_tree = 
                    (Object)adaptor.create(char_literal486)
                    ;
                    adaptor.addChild(root_0, char_literal486_tree);
                    }
                    dbg.location(274,35);
                    char_literal487=(Token)match(input,82,FOLLOW_82_in_timeExpr2643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal487_tree = 
                    (Object)adaptor.create(char_literal487)
                    ;
                    adaptor.addChild(root_0, char_literal487_tree);
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
        dbg.location(275, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:1: timeBag : ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK488=null;
        Token STRING_CONSTANT_LIST489=null;

        Object TIME_TOK488_tree=null;
        Object STRING_CONSTANT_LIST489_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:2: ( ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:4: ( TIME_TOK )=> TIME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(277,17);
            TIME_TOK488=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag2658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK488_tree = 
            (Object)adaptor.create(TIME_TOK488)
            ;
            adaptor.addChild(root_0, TIME_TOK488_tree);
            }
            dbg.location(277,26);
            STRING_CONSTANT_LIST489=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag2660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST489_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST489)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST489_tree);
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
        dbg.location(280, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:1: dateTimeExpr : ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK490=null;
        Token char_literal491=null;
        Token char_literal493=null;
        Token char_literal495=null;
        Token ONEANDONLY_TOK496=null;
        Token char_literal497=null;
        Token char_literal498=null;
        GrammarParser.stringExpr_return stringExpr492 =null;

        GrammarParser.dateTimeBag_return dateTimeBag494 =null;


        Object DATETIME_TOK490_tree=null;
        Object char_literal491_tree=null;
        Object char_literal493_tree=null;
        Object char_literal495_tree=null;
        Object ONEANDONLY_TOK496_tree=null;
        Object char_literal497_tree=null;
        Object char_literal498_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:2: ( ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')' | ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')' )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==DATETIME_TOK) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==81) && (synpred29_Grammar())) {
                    alt25=1;
                }
                else if ( (LA25_1==STRING_CONSTANT_LIST) && (synpred30_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:4: ( DATETIME_TOK )=> DATETIME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(283,22);
                    DATETIME_TOK490=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr2680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK490_tree = 
                    (Object)adaptor.create(DATETIME_TOK490)
                    ;
                    adaptor.addChild(root_0, DATETIME_TOK490_tree);
                    }
                    dbg.location(283,35);
                    char_literal491=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal491_tree = 
                    (Object)adaptor.create(char_literal491)
                    ;
                    adaptor.addChild(root_0, char_literal491_tree);
                    }
                    dbg.location(283,39);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr2684);
                    stringExpr492=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr492.getTree());
                    dbg.location(283,50);
                    char_literal493=(Token)match(input,82,FOLLOW_82_in_dateTimeExpr2686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal493_tree = 
                    (Object)adaptor.create(char_literal493)
                    ;
                    adaptor.addChild(root_0, char_literal493_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:4: ( dateTimeBag )=> dateTimeBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(284,21);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr2697);
                    dateTimeBag494=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag494.getTree());
                    dbg.location(284,33);
                    char_literal495=(Token)match(input,84,FOLLOW_84_in_dateTimeExpr2699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal495_tree = 
                    (Object)adaptor.create(char_literal495)
                    ;
                    adaptor.addChild(root_0, char_literal495_tree);
                    }
                    dbg.location(284,37);
                    ONEANDONLY_TOK496=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK496_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK496)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK496_tree);
                    }
                    dbg.location(284,52);
                    char_literal497=(Token)match(input,81,FOLLOW_81_in_dateTimeExpr2703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal497_tree = 
                    (Object)adaptor.create(char_literal497)
                    ;
                    adaptor.addChild(root_0, char_literal497_tree);
                    }
                    dbg.location(284,56);
                    char_literal498=(Token)match(input,82,FOLLOW_82_in_dateTimeExpr2705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal498_tree = 
                    (Object)adaptor.create(char_literal498)
                    ;
                    adaptor.addChild(root_0, char_literal498_tree);
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
        dbg.location(285, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:1: dateTimeBag : ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK499=null;
        Token STRING_CONSTANT_LIST500=null;

        Object DATETIME_TOK499_tree=null;
        Object STRING_CONSTANT_LIST500_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:2: ( ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(287,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: ( ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:5: ( DATETIME_TOK )=> DATETIME_TOK STRING_CONSTANT_LIST
            {
            dbg.location(287,22);
            DATETIME_TOK499=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag2721); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK499_tree = 
            (Object)adaptor.create(DATETIME_TOK499)
            ;
            adaptor.addChild(root_0, DATETIME_TOK499_tree);
            }
            dbg.location(287,35);
            STRING_CONSTANT_LIST500=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2723); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST500_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST500)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST500_tree);
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
        dbg.location(290, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:292:1: base64BinaryExpr : ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK501=null;
        Token char_literal502=null;
        Token char_literal504=null;
        Token char_literal506=null;
        Token ONEANDONLY_TOK507=null;
        Token char_literal508=null;
        Token char_literal509=null;
        GrammarParser.stringExpr_return stringExpr503 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag505 =null;


        Object BASE64BINARY_TOK501_tree=null;
        Object char_literal502_tree=null;
        Object char_literal504_tree=null;
        Object char_literal506_tree=null;
        Object ONEANDONLY_TOK507_tree=null;
        Object char_literal508_tree=null;
        Object char_literal509_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' ) | ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==BASE64BINARY_TOK) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==81) && (synpred32_Grammar())) {
                    alt26=1;
                }
                else if ( (LA26_1==STRING_CONSTANT_LIST) && (synpred33_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(293,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK '(' stringExpr ')'
                    {
                    dbg.location(293,27);
                    BASE64BINARY_TOK501=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK501_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK501)
                    ;
                    adaptor.addChild(root_0, BASE64BINARY_TOK501_tree);
                    }
                    dbg.location(293,44);
                    char_literal502=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal502_tree = 
                    (Object)adaptor.create(char_literal502)
                    ;
                    adaptor.addChild(root_0, char_literal502_tree);
                    }
                    dbg.location(293,48);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr2748);
                    stringExpr503=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr503.getTree());
                    dbg.location(293,59);
                    char_literal504=(Token)match(input,82,FOLLOW_82_in_base64BinaryExpr2750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal504_tree = 
                    (Object)adaptor.create(char_literal504)
                    ;
                    adaptor.addChild(root_0, char_literal504_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:4: ( base64BinaryBag )=> base64BinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(294,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr2762);
                    base64BinaryBag505=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag505.getTree());
                    dbg.location(294,41);
                    char_literal506=(Token)match(input,84,FOLLOW_84_in_base64BinaryExpr2764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal506_tree = 
                    (Object)adaptor.create(char_literal506)
                    ;
                    adaptor.addChild(root_0, char_literal506_tree);
                    }
                    dbg.location(294,45);
                    ONEANDONLY_TOK507=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK507_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK507)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK507_tree);
                    }
                    dbg.location(294,60);
                    char_literal508=(Token)match(input,81,FOLLOW_81_in_base64BinaryExpr2768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal508_tree = 
                    (Object)adaptor.create(char_literal508)
                    ;
                    adaptor.addChild(root_0, char_literal508_tree);
                    }
                    dbg.location(294,64);
                    char_literal509=(Token)match(input,82,FOLLOW_82_in_base64BinaryExpr2770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal509_tree = 
                    (Object)adaptor.create(char_literal509)
                    ;
                    adaptor.addChild(root_0, char_literal509_tree);
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
        dbg.location(295, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:1: base64BinaryBag : ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK510=null;
        Token STRING_CONSTANT_LIST511=null;

        Object BASE64BINARY_TOK510_tree=null;
        Object STRING_CONSTANT_LIST511_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:2: ( ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(297,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:4: ( ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:5: ( BASE64BINARY_TOK )=> BASE64BINARY_TOK STRING_CONSTANT_LIST
            {
            dbg.location(297,27);
            BASE64BINARY_TOK510=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK510_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK510)
            ;
            adaptor.addChild(root_0, BASE64BINARY_TOK510_tree);
            }
            dbg.location(297,44);
            STRING_CONSTANT_LIST511=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2789); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST511_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST511)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST511_tree);
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
        dbg.location(301, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:303:1: dayTimeDurationExpr : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK512=null;
        Token char_literal513=null;
        Token char_literal515=null;
        Token char_literal517=null;
        Token ONEANDONLY_TOK518=null;
        Token char_literal519=null;
        Token char_literal520=null;
        GrammarParser.stringExpr_return stringExpr514 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag516 =null;


        Object DAYTIMEDURATION_TOK512_tree=null;
        Object char_literal513_tree=null;
        Object char_literal515_tree=null;
        Object char_literal517_tree=null;
        Object ONEANDONLY_TOK518_tree=null;
        Object char_literal519_tree=null;
        Object char_literal520_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:2: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')' | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')' )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==DAYTIMEDURATION_TOK) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==81) && (synpred35_Grammar())) {
                    alt27=1;
                }
                else if ( (LA27_1==STRING_CONSTANT_LIST) && (synpred36_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:4: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(304,29);
                    DAYTIMEDURATION_TOK512=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK512_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK512)
                    ;
                    adaptor.addChild(root_0, DAYTIMEDURATION_TOK512_tree);
                    }
                    dbg.location(304,49);
                    char_literal513=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2813); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal513_tree = 
                    (Object)adaptor.create(char_literal513)
                    ;
                    adaptor.addChild(root_0, char_literal513_tree);
                    }
                    dbg.location(304,53);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr2815);
                    stringExpr514=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr514.getTree());
                    dbg.location(304,64);
                    char_literal515=(Token)match(input,82,FOLLOW_82_in_dayTimeDurationExpr2817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal515_tree = 
                    (Object)adaptor.create(char_literal515)
                    ;
                    adaptor.addChild(root_0, char_literal515_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(305,28);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2828);
                    dayTimeDurationBag516=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag516.getTree());
                    dbg.location(305,47);
                    char_literal517=(Token)match(input,84,FOLLOW_84_in_dayTimeDurationExpr2830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal517_tree = 
                    (Object)adaptor.create(char_literal517)
                    ;
                    adaptor.addChild(root_0, char_literal517_tree);
                    }
                    dbg.location(305,51);
                    ONEANDONLY_TOK518=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK518_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK518)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK518_tree);
                    }
                    dbg.location(305,66);
                    char_literal519=(Token)match(input,81,FOLLOW_81_in_dayTimeDurationExpr2834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal519_tree = 
                    (Object)adaptor.create(char_literal519)
                    ;
                    adaptor.addChild(root_0, char_literal519_tree);
                    }
                    dbg.location(305,70);
                    char_literal520=(Token)match(input,82,FOLLOW_82_in_dayTimeDurationExpr2836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal520_tree = 
                    (Object)adaptor.create(char_literal520)
                    ;
                    adaptor.addChild(root_0, char_literal520_tree);
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
        dbg.location(306, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:1: dayTimeDurationBag : ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK521=null;
        Token STRING_CONSTANT_LIST522=null;

        Object DAYTIMEDURATION_TOK521_tree=null;
        Object STRING_CONSTANT_LIST522_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:2: ( ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(308,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:4: ( ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:5: ( DAYTIMEDURATION_TOK )=> DAYTIMEDURATION_TOK STRING_CONSTANT_LIST
            {
            dbg.location(308,30);
            DAYTIMEDURATION_TOK521=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK521_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK521)
            ;
            adaptor.addChild(root_0, DAYTIMEDURATION_TOK521_tree);
            }
            dbg.location(308,50);
            STRING_CONSTANT_LIST522=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2855); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST522_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST522)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST522_tree);
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
        dbg.location(311, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:1: yearMonthDurationExpr : ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) );
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK523=null;
        Token char_literal524=null;
        Token char_literal526=null;
        Token char_literal528=null;
        Token ONEANDONLY_TOK529=null;
        Token char_literal530=null;
        Token char_literal531=null;
        GrammarParser.stringExpr_return stringExpr525 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag527 =null;


        Object YEARMONTHDURATION_TOK523_tree=null;
        Object char_literal524_tree=null;
        Object char_literal526_tree=null;
        Object char_literal528_tree=null;
        Object ONEANDONLY_TOK529_tree=null;
        Object char_literal530_tree=null;
        Object char_literal531_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(313, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:2: ( ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' ) | ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' ) )
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==YEARMONTHDURATION_TOK) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==81) && (synpred38_Grammar())) {
                    alt28=1;
                }
                else if ( (LA28_1==STRING_CONSTANT_LIST) && (synpred39_Grammar())) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(314,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:4: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:5: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK '(' stringExpr ')'
                    {
                    dbg.location(314,32);
                    YEARMONTHDURATION_TOK523=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK523_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK523)
                    ;
                    adaptor.addChild(root_0, YEARMONTHDURATION_TOK523_tree);
                    }
                    dbg.location(314,54);
                    char_literal524=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal524_tree = 
                    (Object)adaptor.create(char_literal524)
                    ;
                    adaptor.addChild(root_0, char_literal524_tree);
                    }
                    dbg.location(314,58);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr2880);
                    stringExpr525=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr525.getTree());
                    dbg.location(314,69);
                    char_literal526=(Token)match(input,82,FOLLOW_82_in_yearMonthDurationExpr2882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal526_tree = 
                    (Object)adaptor.create(char_literal526)
                    ;
                    adaptor.addChild(root_0, char_literal526_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(315,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:4: ( ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')' )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:5: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    dbg.location(315,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2895);
                    yearMonthDurationBag527=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag527.getTree());
                    dbg.location(315,52);
                    char_literal528=(Token)match(input,84,FOLLOW_84_in_yearMonthDurationExpr2897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal528_tree = 
                    (Object)adaptor.create(char_literal528)
                    ;
                    adaptor.addChild(root_0, char_literal528_tree);
                    }
                    dbg.location(315,56);
                    ONEANDONLY_TOK529=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK529_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK529)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK529_tree);
                    }
                    dbg.location(315,71);
                    char_literal530=(Token)match(input,81,FOLLOW_81_in_yearMonthDurationExpr2901); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal530_tree = 
                    (Object)adaptor.create(char_literal530)
                    ;
                    adaptor.addChild(root_0, char_literal530_tree);
                    }
                    dbg.location(315,75);
                    char_literal531=(Token)match(input,82,FOLLOW_82_in_yearMonthDurationExpr2903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal531_tree = 
                    (Object)adaptor.create(char_literal531)
                    ;
                    adaptor.addChild(root_0, char_literal531_tree);
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
        dbg.location(316, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:1: yearMonthDurationBag : ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK532=null;
        Token STRING_CONSTANT_LIST533=null;

        Object YEARMONTHDURATION_TOK532_tree=null;
        Object STRING_CONSTANT_LIST533_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(317, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:2: ( ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:4: ( YEARMONTHDURATION_TOK )=> YEARMONTHDURATION_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(318,31);
            YEARMONTHDURATION_TOK532=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK532_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK532)
            ;
            adaptor.addChild(root_0, YEARMONTHDURATION_TOK532_tree);
            }
            dbg.location(318,53);
            STRING_CONSTANT_LIST533=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST533_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST533)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST533_tree);
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
        dbg.location(321, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:1: x500NameExpr : ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK534=null;
        Token char_literal535=null;
        Token char_literal537=null;
        Token char_literal539=null;
        Token ONEANDONLY_TOK540=null;
        Token char_literal541=null;
        Token char_literal542=null;
        GrammarParser.stringExpr_return stringExpr536 =null;

        GrammarParser.x500NameBag_return x500NameBag538 =null;


        Object X500NAME_TOK534_tree=null;
        Object char_literal535_tree=null;
        Object char_literal537_tree=null;
        Object char_literal539_tree=null;
        Object ONEANDONLY_TOK540_tree=null;
        Object char_literal541_tree=null;
        Object char_literal542_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:2: ( X500NAME_TOK '(' stringExpr ')' | x500NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==X500NAME_TOK) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==81) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:4: X500NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(324,4);
                    X500NAME_TOK534=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr2937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK534_tree = 
                    (Object)adaptor.create(X500NAME_TOK534)
                    ;
                    adaptor.addChild(root_0, X500NAME_TOK534_tree);
                    }
                    dbg.location(324,17);
                    char_literal535=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal535_tree = 
                    (Object)adaptor.create(char_literal535)
                    ;
                    adaptor.addChild(root_0, char_literal535_tree);
                    }
                    dbg.location(324,21);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr2941);
                    stringExpr536=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr536.getTree());
                    dbg.location(324,32);
                    char_literal537=(Token)match(input,82,FOLLOW_82_in_x500NameExpr2943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal537_tree = 
                    (Object)adaptor.create(char_literal537)
                    ;
                    adaptor.addChild(root_0, char_literal537_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:4: x500NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(325,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr2948);
                    x500NameBag538=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag538.getTree());
                    dbg.location(325,17);
                    char_literal539=(Token)match(input,84,FOLLOW_84_in_x500NameExpr2951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal539_tree = 
                    (Object)adaptor.create(char_literal539)
                    ;
                    adaptor.addChild(root_0, char_literal539_tree);
                    }
                    dbg.location(325,21);
                    ONEANDONLY_TOK540=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK540_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK540)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK540_tree);
                    }
                    dbg.location(325,36);
                    char_literal541=(Token)match(input,81,FOLLOW_81_in_x500NameExpr2955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal541_tree = 
                    (Object)adaptor.create(char_literal541)
                    ;
                    adaptor.addChild(root_0, char_literal541_tree);
                    }
                    dbg.location(325,40);
                    char_literal542=(Token)match(input,82,FOLLOW_82_in_x500NameExpr2957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal542_tree = 
                    (Object)adaptor.create(char_literal542)
                    ;
                    adaptor.addChild(root_0, char_literal542_tree);
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
        dbg.location(327, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:1: x500NameBag : ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK543=null;
        Token STRING_CONSTANT_LIST544=null;

        Object X500NAME_TOK543_tree=null;
        Object STRING_CONSTANT_LIST544_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:2: ( ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:4: ( X500NAME_TOK )=> X500NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(329,22);
            X500NAME_TOK543=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag2974); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK543_tree = 
            (Object)adaptor.create(X500NAME_TOK543)
            ;
            adaptor.addChild(root_0, X500NAME_TOK543_tree);
            }
            dbg.location(329,35);
            STRING_CONSTANT_LIST544=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2976); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST544_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST544)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST544_tree);
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
        dbg.location(332, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:1: rfc822NameExpr : ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK545=null;
        Token char_literal546=null;
        Token char_literal548=null;
        Token char_literal550=null;
        Token ONEANDONLY_TOK551=null;
        Token char_literal552=null;
        Token char_literal553=null;
        GrammarParser.stringExpr_return stringExpr547 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag549 =null;


        Object RFC822NAME_TOK545_tree=null;
        Object char_literal546_tree=null;
        Object char_literal548_tree=null;
        Object char_literal550_tree=null;
        Object ONEANDONLY_TOK551_tree=null;
        Object char_literal552_tree=null;
        Object char_literal553_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(334, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:335:2: ( RFC822NAME_TOK '(' stringExpr ')' | rfc822NameBag '.' ONEANDONLY_TOK '(' ')' )
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==RFC822NAME_TOK) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==81) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:335:4: RFC822NAME_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(335,4);
                    RFC822NAME_TOK545=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK545_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK545)
                    ;
                    adaptor.addChild(root_0, RFC822NAME_TOK545_tree);
                    }
                    dbg.location(335,19);
                    char_literal546=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr2992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal546_tree = 
                    (Object)adaptor.create(char_literal546)
                    ;
                    adaptor.addChild(root_0, char_literal546_tree);
                    }
                    dbg.location(335,23);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr2994);
                    stringExpr547=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr547.getTree());
                    dbg.location(335,34);
                    char_literal548=(Token)match(input,82,FOLLOW_82_in_rfc822NameExpr2996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal548_tree = 
                    (Object)adaptor.create(char_literal548)
                    ;
                    adaptor.addChild(root_0, char_literal548_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:4: rfc822NameBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(336,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr3001);
                    rfc822NameBag549=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag549.getTree());
                    dbg.location(336,18);
                    char_literal550=(Token)match(input,84,FOLLOW_84_in_rfc822NameExpr3003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal550_tree = 
                    (Object)adaptor.create(char_literal550)
                    ;
                    adaptor.addChild(root_0, char_literal550_tree);
                    }
                    dbg.location(336,22);
                    ONEANDONLY_TOK551=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK551_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK551)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK551_tree);
                    }
                    dbg.location(336,37);
                    char_literal552=(Token)match(input,81,FOLLOW_81_in_rfc822NameExpr3007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal552_tree = 
                    (Object)adaptor.create(char_literal552)
                    ;
                    adaptor.addChild(root_0, char_literal552_tree);
                    }
                    dbg.location(336,41);
                    char_literal553=(Token)match(input,82,FOLLOW_82_in_rfc822NameExpr3009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal553_tree = 
                    (Object)adaptor.create(char_literal553)
                    ;
                    adaptor.addChild(root_0, char_literal553_tree);
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
        dbg.location(338, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:1: rfc822NameBag : ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK554=null;
        Token STRING_CONSTANT_LIST555=null;

        Object RFC822NAME_TOK554_tree=null;
        Object STRING_CONSTANT_LIST555_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:2: ( ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: ( RFC822NAME_TOK )=> RFC822NAME_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(340,24);
            RFC822NAME_TOK554=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK554_tree = 
            (Object)adaptor.create(RFC822NAME_TOK554)
            ;
            adaptor.addChild(root_0, RFC822NAME_TOK554_tree);
            }
            dbg.location(340,39);
            STRING_CONSTANT_LIST555=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3028); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST555_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST555)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST555_tree);
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
        dbg.location(343, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:1: hexBinaryExpr : ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' );
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK556=null;
        Token char_literal557=null;
        Token char_literal559=null;
        Token char_literal561=null;
        Token ONEANDONLY_TOK562=null;
        Token char_literal563=null;
        Token char_literal564=null;
        GrammarParser.stringExpr_return stringExpr558 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag560 =null;


        Object HEXBINARY_TOK556_tree=null;
        Object char_literal557_tree=null;
        Object char_literal559_tree=null;
        Object char_literal561_tree=null;
        Object ONEANDONLY_TOK562_tree=null;
        Object char_literal563_tree=null;
        Object char_literal564_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:2: ( HEXBINARY_TOK '(' stringExpr ')' | hexBinaryBag '.' ONEANDONLY_TOK '(' ')' )
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==HEXBINARY_TOK) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==81) ) {
                    alt31=1;
                }
                else if ( (LA31_1==STRING_CONSTANT_LIST) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:4: HEXBINARY_TOK '(' stringExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(346,4);
                    HEXBINARY_TOK556=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK556_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK556)
                    ;
                    adaptor.addChild(root_0, HEXBINARY_TOK556_tree);
                    }
                    dbg.location(346,18);
                    char_literal557=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr3045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal557_tree = 
                    (Object)adaptor.create(char_literal557)
                    ;
                    adaptor.addChild(root_0, char_literal557_tree);
                    }
                    dbg.location(346,22);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr3047);
                    stringExpr558=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr558.getTree());
                    dbg.location(346,33);
                    char_literal559=(Token)match(input,82,FOLLOW_82_in_hexBinaryExpr3049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal559_tree = 
                    (Object)adaptor.create(char_literal559)
                    ;
                    adaptor.addChild(root_0, char_literal559_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:347:4: hexBinaryBag '.' ONEANDONLY_TOK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(347,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr3054);
                    hexBinaryBag560=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag560.getTree());
                    dbg.location(347,17);
                    char_literal561=(Token)match(input,84,FOLLOW_84_in_hexBinaryExpr3056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal561_tree = 
                    (Object)adaptor.create(char_literal561)
                    ;
                    adaptor.addChild(root_0, char_literal561_tree);
                    }
                    dbg.location(347,21);
                    ONEANDONLY_TOK562=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK562_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK562)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK562_tree);
                    }
                    dbg.location(347,36);
                    char_literal563=(Token)match(input,81,FOLLOW_81_in_hexBinaryExpr3060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal563_tree = 
                    (Object)adaptor.create(char_literal563)
                    ;
                    adaptor.addChild(root_0, char_literal563_tree);
                    }
                    dbg.location(347,40);
                    char_literal564=(Token)match(input,82,FOLLOW_82_in_hexBinaryExpr3062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal564_tree = 
                    (Object)adaptor.create(char_literal564)
                    ;
                    adaptor.addChild(root_0, char_literal564_tree);
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
        dbg.location(348, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:1: hexBinaryBag : ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK565=null;
        Token STRING_CONSTANT_LIST566=null;

        Object HEXBINARY_TOK565_tree=null;
        Object STRING_CONSTANT_LIST566_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:2: ( ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:4: ( HEXBINARY_TOK )=> HEXBINARY_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(350,23);
            HEXBINARY_TOK565=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK565_tree = 
            (Object)adaptor.create(HEXBINARY_TOK565)
            ;
            adaptor.addChild(root_0, HEXBINARY_TOK565_tree);
            }
            dbg.location(350,37);
            STRING_CONSTANT_LIST566=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST566_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST566)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST566_tree);
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
        dbg.location(353, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag567 =null;

        GrammarParser.integerBag_return integerBag568 =null;

        GrammarParser.doubleBag_return doubleBag569 =null;

        GrammarParser.stringBag_return stringBag570 =null;

        GrammarParser.anyUriBag_return anyUriBag571 =null;

        GrammarParser.dateBag_return dateBag572 =null;

        GrammarParser.timeBag_return timeBag573 =null;

        GrammarParser.dateTimeBag_return dateTimeBag574 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag575 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag576 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag577 =null;

        GrammarParser.x500NameBag_return x500NameBag578 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag579 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag580 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt32=14;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            switch ( input.LA(1) ) {
            case BOOLEAN_TOK:
                {
                alt32=1;
                }
                break;
            case BAG_TOK:
            case INTEGER_TOK:
                {
                alt32=2;
                }
                break;
            case DOUBLE_TOK:
                {
                alt32=3;
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case STRING_TOK:
            case SUBJECT_TOK:
                {
                alt32=4;
                }
                break;
            case ANYURI_TOK:
                {
                alt32=5;
                }
                break;
            case DATE_TOK:
                {
                alt32=6;
                }
                break;
            case TIME_TOK:
                {
                alt32=7;
                }
                break;
            case DATETIME_TOK:
                {
                alt32=8;
                }
                break;
            case BASE64BINARY_TOK:
                {
                alt32=9;
                }
                break;
            case DAYTIMEDURATION_TOK:
                {
                alt32=10;
                }
                break;
            case YEARMONTHDURATION_TOK:
                {
                alt32=11;
                }
                break;
            case X500NAME_TOK:
                {
                alt32=12;
                }
                break;
            case RFC822NAME_TOK:
                {
                alt32=13;
                }
                break;
            case HEXBINARY_TOK:
                {
                alt32=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag3093);
                    booleanBag567=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag567.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag3097);
                    integerBag568=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag568.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag3101);
                    doubleBag569=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag569.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag3105);
                    stringBag570=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag570.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag3109);
                    anyUriBag571=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag571.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag3113);
                    dateBag572=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag572.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(357,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag3118);
                    timeBag573=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag573.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(357,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag3122);
                    dateTimeBag574=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag574.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(357,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag3126);
                    base64BinaryBag575=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag575.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(357,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag3130);
                    dayTimeDurationBag576=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag576.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:358:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(358,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag3135);
                    yearMonthDurationBag577=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag577.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:358:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(358,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag3140);
                    x500NameBag578=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag578.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(359,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag3145);
                    rfc822NameBag579=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag579.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(359,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag3149);
                    hexBinaryBag580=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag580.getTree());

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
        dbg.location(360, 1);

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
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:6: base64BinaryExpr
        {
        dbg.location(141,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred4_Grammar916);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:6: base64BinaryExpr
        {
        dbg.location(157,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred5_Grammar1147);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: ( dayTimeDurationExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:5: dayTimeDurationExpr
        {
        dbg.location(171,5);
        pushFollow(FOLLOW_dayTimeDurationExpr_in_synpred6_Grammar1466);
        dayTimeDurationExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:5: base64BinaryExpr
        {
        dbg.location(172,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred7_Grammar1501);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:5: base64BinaryExpr
        {
        dbg.location(187,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred8_Grammar1709);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:5: booleanBag
        {
        dbg.location(191,5);
        pushFollow(FOLLOW_booleanBag_in_synpred9_Grammar1736);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:5: integerBag
        {
        dbg.location(192,5);
        pushFollow(FOLLOW_integerBag_in_synpred10_Grammar1769);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:5: doubleBag
        {
        dbg.location(193,5);
        pushFollow(FOLLOW_doubleBag_in_synpred11_Grammar1804);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:5: stringBag
        {
        dbg.location(194,5);
        pushFollow(FOLLOW_stringBag_in_synpred12_Grammar1839);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:5: dateBag
        {
        dbg.location(195,5);
        pushFollow(FOLLOW_dateBag_in_synpred13_Grammar1875);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:5: timeBag
        {
        dbg.location(196,5);
        pushFollow(FOLLOW_timeBag_in_synpred14_Grammar1911);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:5: dateTimeBag
        {
        dbg.location(197,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred15_Grammar1947);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:5: base64BinaryBag
        {
        dbg.location(198,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred16_Grammar1983);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:5: dayTimeDurationBag
        {
        dbg.location(199,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred17_Grammar2019);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Grammar

    // $ANTLR start synpred18_Grammar
    public final void synpred18_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:5: yearMonthDurationBag
        {
        dbg.location(200,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred18_Grammar2055);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Grammar

    // $ANTLR start synpred19_Grammar
    public final void synpred19_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:5: anyUriBag
        {
        dbg.location(201,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred19_Grammar2091);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_Grammar

    // $ANTLR start synpred20_Grammar
    public final void synpred20_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:5: x500NameBag
        {
        dbg.location(202,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred20_Grammar2127);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Grammar

    // $ANTLR start synpred21_Grammar
    public final void synpred21_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:5: rfc822NameBag
        {
        dbg.location(203,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred21_Grammar2163);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Grammar

    // $ANTLR start synpred22_Grammar
    public final void synpred22_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:5: hexBinaryBag
        {
        dbg.location(204,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred22_Grammar2199);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_Grammar

    // $ANTLR start synpred23_Grammar
    public final void synpred23_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:5: base64BinaryBag
        {
        dbg.location(205,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred23_Grammar2235);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Grammar

    // $ANTLR start synpred25_Grammar
    public final void synpred25_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( STRING_CONSTANT )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:5: STRING_CONSTANT
        {
        dbg.location(233,5);
        match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_synpred25_Grammar2423); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Grammar

    // $ANTLR start synpred26_Grammar
    public final void synpred26_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( stringExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:5: stringExpr
        {
        dbg.location(253,5);
        pushFollow(FOLLOW_stringExpr_in_synpred26_Grammar2534);
        stringExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_Grammar

    // $ANTLR start synpred29_Grammar
    public final void synpred29_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:4: ( DATETIME_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:5: DATETIME_TOK
        {
        dbg.location(283,5);
        match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_synpred29_Grammar2675); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred29_Grammar

    // $ANTLR start synpred30_Grammar
    public final void synpred30_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:5: dateTimeBag
        {
        dbg.location(284,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred30_Grammar2692);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_Grammar

    // $ANTLR start synpred32_Grammar
    public final void synpred32_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:5: ( BASE64BINARY_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:6: BASE64BINARY_TOK
        {
        dbg.location(293,6);
        match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_synpred32_Grammar2739); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_Grammar

    // $ANTLR start synpred33_Grammar
    public final void synpred33_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:5: base64BinaryBag
        {
        dbg.location(294,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred33_Grammar2757);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred33_Grammar

    // $ANTLR start synpred35_Grammar
    public final void synpred35_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:4: ( DAYTIMEDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:5: DAYTIMEDURATION_TOK
        {
        dbg.location(304,5);
        match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_synpred35_Grammar2806); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred35_Grammar

    // $ANTLR start synpred36_Grammar
    public final void synpred36_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:5: dayTimeDurationBag
        {
        dbg.location(305,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred36_Grammar2823);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred36_Grammar

    // $ANTLR start synpred38_Grammar
    public final void synpred38_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:5: ( YEARMONTHDURATION_TOK )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:6: YEARMONTHDURATION_TOK
        {
        dbg.location(314,6);
        match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_synpred38_Grammar2871); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred38_Grammar

    // $ANTLR start synpred39_Grammar
    public final void synpred39_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:5: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:6: yearMonthDurationBag
        {
        dbg.location(315,6);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred39_Grammar2890);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_Grammar

    // Delegated rules

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
    public final boolean synpred33_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred33_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred39_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred39_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred36_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred36_Grammar_fragment(); // can never throw exception
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
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA6_eotS =
        "\u00d9\uffff";
    static final String DFA6_eofS =
        "\u00d9\uffff";
    static final String DFA6_minS =
        "\1\5\2\uffff\1\103\3\uffff\1\124\1\103\1\124\13\103\1\124\1\uffff"+
        "\1\47\1\124\1\52\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1"+
        "\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\uffff"+
        "\1\121\1\uffff\1\25\1\124\1\25\1\122\1\103\1\124\1\25\1\122\1\103"+
        "\1\124\1\25\1\122\1\103\1\124\1\25\1\122\1\103\1\124\1\25\1\122"+
        "\1\103\1\124\1\25\1\122\1\103\1\124\1\25\1\122\1\103\1\124\1\25"+
        "\1\122\1\103\1\124\1\25\1\122\1\103\1\124\1\25\1\122\1\103\1\124"+
        "\1\25\1\122\1\121\1\uffff\1\25\2\124\1\52\1\121\2\124\1\52\1\121"+
        "\2\124\1\52\1\121\2\124\1\52\1\121\2\124\1\52\1\121\2\124\1\52\1"+
        "\121\2\124\1\52\1\121\2\124\1\52\1\121\2\124\1\52\1\121\2\124\1"+
        "\52\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122"+
        "\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1"+
        "\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\2\124\1\121\1\52\1\124"+
        "\1\121\1\52\1\124\1\121\1\52\1\124\1\121\1\52\1\124\1\121\1\52\1"+
        "\124\1\121\1\52\1\124\1\121\1\52\1\124\1\121\1\52\1\124\1\121\1"+
        "\52\1\124\1\121\1\52\24\122";
    static final String DFA6_maxS =
        "\1\121\2\uffff\1\121\3\uffff\1\131\1\103\1\124\13\121\1\131\1\uffff"+
        "\1\114\1\124\1\52\1\124\1\105\1\124\1\105\1\124\1\105\1\124\1\105"+
        "\1\124\1\105\1\124\1\105\1\124\1\105\1\124\1\105\1\124\1\105\1\124"+
        "\1\105\1\124\1\uffff\1\121\1\uffff\1\101\1\124\1\101\1\122\1\103"+
        "\1\124\1\101\1\122\1\103\1\124\1\101\1\122\1\103\1\124\1\101\1\122"+
        "\1\103\1\124\1\101\1\122\1\103\1\124\1\101\1\122\1\103\1\124\1\101"+
        "\1\122\1\103\1\124\1\101\1\122\1\103\1\124\1\101\1\122\1\103\1\124"+
        "\1\101\1\122\1\103\1\124\1\101\1\122\1\121\1\uffff\1\101\1\131\1"+
        "\124\1\52\1\121\1\131\1\124\1\52\1\121\1\131\1\124\1\52\1\121\1"+
        "\131\1\124\1\52\1\121\1\131\1\124\1\52\1\121\1\131\1\124\1\52\1"+
        "\121\1\131\1\124\1\52\1\121\1\131\1\124\1\52\1\121\1\131\1\124\1"+
        "\52\1\121\1\131\1\124\1\52\1\131\1\122\1\65\1\124\1\122\1\65\1\124"+
        "\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1"+
        "\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1\65\1\124\1\122\1"+
        "\65\1\124\1\131\1\121\1\65\1\131\1\121\1\65\1\131\1\121\1\65\1\131"+
        "\1\121\1\65\1\131\1\121\1\65\1\131\1\121\1\65\1\131\1\121\1\65\1"+
        "\131\1\121\1\65\1\131\1\121\1\65\1\131\1\121\1\65\24\122";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\17\uffff\1\3\30\uffff\1\7\1"+
        "\uffff\1\11\55\uffff\1\10\171\uffff";
    static final String DFA6_specialS =
        "\u00d9\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\11\7\uffff\1\13\1\uffff\1\6\1\17\1\3\4\uffff\1\16\1\14\1"+
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
            "\1\32\15\uffff\1\33",
            "\1\34\15\uffff\1\35",
            "\1\36\15\uffff\1\37",
            "\1\40\15\uffff\1\41",
            "\1\42\15\uffff\1\43",
            "\1\44\15\uffff\1\45",
            "\1\46\15\uffff\1\47",
            "\1\50\15\uffff\1\51",
            "\1\52\15\uffff\1\53",
            "\1\54\15\uffff\1\55",
            "\1\56\15\uffff\1\57",
            "\1\57\5\6",
            "",
            "\1\6\1\uffff\1\57\3\uffff\1\6\2\61\34\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\67\30\uffff\1\67\34\uffff\1\67\6\uffff\1\65\1\uffff\1\66"+
            "\1\67",
            "\1\70",
            "\1\73\30\uffff\1\73\34\uffff\1\73\6\uffff\1\71\1\uffff\1\72"+
            "\1\73",
            "\1\74",
            "\1\77\30\uffff\1\77\34\uffff\1\77\6\uffff\1\75\1\uffff\1\76"+
            "\1\77",
            "\1\100",
            "\1\103\30\uffff\1\103\34\uffff\1\103\6\uffff\1\101\1\uffff"+
            "\1\102\1\103",
            "\1\104",
            "\1\107\30\uffff\1\107\34\uffff\1\107\6\uffff\1\105\1\uffff"+
            "\1\106\1\107",
            "\1\110",
            "\1\113\30\uffff\1\113\34\uffff\1\113\6\uffff\1\111\1\uffff"+
            "\1\112\1\113",
            "\1\114",
            "\1\117\30\uffff\1\117\34\uffff\1\117\6\uffff\1\115\1\uffff"+
            "\1\116\1\117",
            "\1\120",
            "\1\123\30\uffff\1\123\34\uffff\1\123\6\uffff\1\121\1\uffff"+
            "\1\122\1\123",
            "\1\124",
            "\1\127\30\uffff\1\127\34\uffff\1\127\6\uffff\1\125\1\uffff"+
            "\1\126\1\127",
            "\1\130",
            "\1\133\30\uffff\1\133\34\uffff\1\133\6\uffff\1\131\1\uffff"+
            "\1\132\1\133",
            "\1\134",
            "",
            "\1\135",
            "",
            "\1\137\37\uffff\1\136\13\uffff\1\6",
            "\1\140",
            "\1\137\53\uffff\1\6",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\137\37\uffff\1\144\13\uffff\1\6",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\137\37\uffff\1\150\13\uffff\1\6",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\137\37\uffff\1\154\13\uffff\1\6",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\137\37\uffff\1\160\13\uffff\1\6",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\137\37\uffff\1\164\13\uffff\1\6",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\137\37\uffff\1\170\13\uffff\1\6",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\137\37\uffff\1\174\13\uffff\1\6",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\137\37\uffff\1\u0080\13\uffff\1\6",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\137\37\uffff\1\u0084\13\uffff\1\6",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\137\37\uffff\1\57\13\uffff\1\6",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\137\24\uffff\1\63\12\uffff\1\136\13\uffff\1\6",
            "\1\57\5\6",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\57\5\6",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\57\5\6",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\57\5\6",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\57\5\6",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\57\5\6",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\57\5\6",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\57\5\6",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\57\5\6",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\57\5\6",
            "\1\u00a5",
            "\1\u00a6",
            "\1\57\5\6",
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
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\27\5\6",
            "\1\u00c5",
            "\1\u008b\12\uffff\1\u00a8",
            "\1\57\5\6",
            "\1\u00c6",
            "\1\u008e\12\uffff\1\u00ab",
            "\1\57\5\6",
            "\1\u00c7",
            "\1\u0091\12\uffff\1\u00ae",
            "\1\57\5\6",
            "\1\u00c8",
            "\1\u0094\12\uffff\1\u00b1",
            "\1\57\5\6",
            "\1\u00c9",
            "\1\u0097\12\uffff\1\u00b4",
            "\1\57\5\6",
            "\1\u00ca",
            "\1\u009a\12\uffff\1\u00b7",
            "\1\57\5\6",
            "\1\u00cb",
            "\1\u009d\12\uffff\1\u00ba",
            "\1\57\5\6",
            "\1\u00cc",
            "\1\u00a0\12\uffff\1\u00bd",
            "\1\57\5\6",
            "\1\u00cd",
            "\1\u00a3\12\uffff\1\u00c0",
            "\1\57\5\6",
            "\1\u00ce",
            "\1\u00a6\12\uffff\1\u00c3",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\141",
            "\1\145",
            "\1\151",
            "\1\155",
            "\1\161",
            "\1\165",
            "\1\171",
            "\1\175",
            "\1\u0081",
            "\1\u0085"
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
            return "102:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ '(' attributeExpr ')' | ( NOF_TOK ^| NOT_TOK ^) '(' booleanExpr ')' | '(' conditionalOrExpr ')' | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) '(' stringExpr ')' );";
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
        "\1\5\1\uffff\1\124\1\103\1\124\4\uffff\1\103\5\uffff\1\51\1\124"+
        "\1\52\1\5\1\124\1\uffff\1\65\1\124\1\122\1\103\1\124\1\65\1\121"+
        "\1\52\2\124\1\52\1\121\1\122\1\51\1\65\1\124\1\122\1\124\2\121\1"+
        "\52\1\124\1\20\1\122\1\103\2\122\1\0\2\uffff";
    static final String DFA9_maxS =
        "\1\117\1\uffff\1\124\1\103\1\124\4\uffff\1\121\5\uffff\1\114\1\124"+
        "\1\52\1\105\1\124\1\uffff\1\65\1\124\1\122\1\103\1\124\1\65\1\121"+
        "\1\65\2\124\1\52\1\121\1\122\1\51\1\65\1\124\1\122\1\124\2\121\1"+
        "\65\1\124\1\20\1\122\1\103\2\122\1\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\5\uffff\1\2\34\uffff\1\7\1\15";
    static final String DFA9_specialS =
        "\60\uffff\1\0\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\7\uffff\1\5\2\uffff\1\11\5\uffff\1\10\1\6\1\12\3\uffff"+
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
            "\1\31\30\uffff\1\31\34\uffff\1\31\6\uffff\1\27\1\uffff\1\30"+
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
            return "128:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ '(' doubleBag ')' | stringExpr '.' ISIN_TOK ^ '(' stringBag ')' | anyUriExpr '.' ISIN_TOK ^ '(' anyUriBag ')' | dateExpr '.' ISIN_TOK ^ '(' dateBag ')' | timeExpr '.' ISIN_TOK ^ '(' timeBag ')' | dateTimeExpr '.' ISIN_TOK ^ '(' dateTimeBag ')' | base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' | dayTimeDurationExpr '.' ISIN_TOK ^ '(' dayTimeDurationBag ')' | yearMonthDurationExpr '.' ISIN_TOK ^ '(' yearMonthDurationBag ')' | x500NameExpr '.' ISIN_TOK ^ '(' x500NameBag ')' | rfc822NameExpr '.' ISIN_TOK ^ '(' rfc822NameBag ')' | hexBinaryExpr '.' ISIN_TOK ^ '(' hexBinaryBag ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ '(' base64BinaryBag ')' );";
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
        "\50\uffff";
    static final String DFA10_eofS =
        "\50\uffff";
    static final String DFA10_minS =
        "\1\5\6\uffff\1\103\5\uffff\1\124\1\25\1\121\1\20\1\103\1\5\1\124"+
        "\1\122\1\103\1\124\1\65\1\122\1\124\1\52\1\121\1\0\1\65\1\124\1"+
        "\122\2\uffff\1\121\1\52\2\122\1\0\1\122";
    static final String DFA10_maxS =
        "\1\117\6\uffff\1\103\5\uffff\1\124\1\25\1\121\1\20\1\121\1\105\1"+
        "\124\1\122\1\103\1\124\1\65\1\122\1\124\1\52\1\121\1\0\1\65\1\124"+
        "\1\122\2\uffff\1\121\1\65\2\122\1\0\1\122";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\23\uffff\1\7\1\15\6\uffff";
    static final String DFA10_specialS =
        "\34\uffff\1\1\11\uffff\1\0\1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\7\uffff\1\3\2\uffff\1\7\5\uffff\1\6\1\4\1\10\4\uffff\1"+
            "\1\1\2\4\uffff\1\14\27\uffff\1\2\1\13\7\uffff\2\2\2\uffff\1"+
            "\5\5\uffff\1\12\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\23\15\uffff\1\22",
            "\1\26\30\uffff\1\26\34\uffff\1\26\6\uffff\1\24\1\uffff\1\25"+
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\uffff",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\45",
            "\1\36\12\uffff\1\42",
            "\1\46",
            "\1\47",
            "\1\uffff",
            "\1\30"
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
            return "144:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ '(' doubleExpr ')' | stringBag '.' CONTAINS_TOK ^ '(' stringExpr ')' | anyUriBag '.' CONTAINS_TOK ^ '(' anyUriExpr ')' | dateBag '.' CONTAINS_TOK ^ '(' dateExpr ')' | timeBag '.' CONTAINS_TOK ^ '(' timeExpr ')' | dateTimeBag '.' CONTAINS_TOK ^ '(' dateTimeExpr ')' | base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' | dayTimeDurationBag '.' CONTAINS_TOK ^ '(' dayTimeDurationExpr ')' | yearMonthDurationBag '.' CONTAINS_TOK ^ '(' yearMonthDurationExpr ')' | x500NameBag '.' CONTAINS_TOK ^ '(' x500NameExpr ')' | rfc822NameBag '.' CONTAINS_TOK ^ '(' rfc822NameExpr ')' | hexBinaryBag '.' CONTAINS_TOK ^ '(' hexBinaryExpr ')' | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ '(' base64BinaryExpr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_38 = input.LA(1);

                         
                        int index10_38 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 32;}

                        else if ( (synpred5_Grammar()) ) {s = 33;}

                         
                        input.seek(index10_38);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_28 = input.LA(1);

                         
                        int index10_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 32;}

                        else if ( (synpred5_Grammar()) ) {s = 33;}

                         
                        input.seek(index10_28);

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
        "\67\uffff";
    static final String DFA11_eofS =
        "\67\uffff";
    static final String DFA11_minS =
        "\1\5\1\uffff\1\124\1\103\1\124\12\103\1\uffff\1\47\1\uffff\1\124"+
        "\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1"+
        "\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\65\1\124\11\65\1\121\1\52\2\uffff\1\122\1\124";
    static final String DFA11_maxS =
        "\1\117\1\uffff\1\131\1\103\1\124\12\121\1\uffff\1\114\1\uffff\1"+
        "\124\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\101\1\124\11\101\1\121\1\101\2\uffff\1\122\1\131";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\15\uffff\1\14\1\13\2\uffff";
    static final String DFA11_specialS =
        "\12\uffff\1\1\1\0\40\uffff\1\3\1\2\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\4\uffff\1\11\1\7\1\13"+
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
            return "160:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) rfc822NameExpr | ( dayTimeDurationExpr )=> dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr | ( base64BinaryExpr )=> base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_11==STRING_CONSTANT_LIST) ) {s = 30;}

                        else if ( (LA11_11==81) && (synpred6_Grammar())) {s = 31;}

                         
                        input.seek(index11_11);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_10==STRING_CONSTANT_LIST) ) {s = 28;}

                        else if ( (LA11_10==81) && (synpred7_Grammar())) {s = 29;}

                         
                        input.seek(index11_10);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA11_45 = input.LA(1);

                         
                        int index11_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA11_45==SIZE_TOK) ) {s = 1;}

                        else if ( (LA11_45==ONEANDONLY_TOK) && (synpred6_Grammar())) {s = 52;}

                         
                        input.seek(index11_45);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
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
    static final String DFA12_eotS =
        "\66\uffff";
    static final String DFA12_eofS =
        "\66\uffff";
    static final String DFA12_minS =
        "\1\5\1\uffff\1\124\1\103\1\124\12\103\1\uffff\1\47\1\124\1\52\1"+
        "\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\2\uffff\1\65\1"+
        "\124\11\65\1\121\1\52\1\uffff\1\122\1\124";
    static final String DFA12_maxS =
        "\1\117\1\uffff\1\124\1\103\1\124\12\121\1\uffff\1\114\1\124\1\52"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\2\uffff\1"+
        "\101\1\124\11\101\1\121\1\101\1\uffff\1\122\1\124";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\3\15\uffff\1\14\2\uffff";
    static final String DFA12_specialS =
        "\12\uffff\1\0\41\uffff\1\1\11\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\4\uffff\1\11\1\7\1\13"+
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "175:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK '(' integerExpr ')' | doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')' | stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')' | anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')' | dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')' | timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')' | dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')' | dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')' | yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')' | x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')' | rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')' | ( base64BinaryExpr )=> base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA12_10==STRING_CONSTANT_LIST) ) {s = 27;}

                        else if ( (LA12_10==81) && (synpred8_Grammar())) {s = 28;}

                         
                        input.seek(index12_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA12_44 = input.LA(1);

                         
                        int index12_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA12_44==SIZE_TOK) ) {s = 1;}

                        else if ( (LA12_44==ONEANDONLY_TOK) && (synpred8_Grammar())) {s = 51;}

                         
                        input.seek(index12_44);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\5\2\uffff\1\103\1\124\1\uffff\1\124\1\52\1\65\1\124\1\52";
    static final String DFA14_maxS =
        "\1\117\2\uffff\1\103\1\124\1\uffff\1\124\1\52\1\101\1\124\1\101";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\5\uffff";
    static final String DFA14_specialS =
        "\13\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\4\7\uffff\1\5\1\uffff\3\5\4\uffff\3\5\4\uffff\1\5\1\4\4\uffff"+
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "208:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) '(' ')' | anyBag '.' SIZE_TOK '(' ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_parseFile430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parseFile432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy443 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy446 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy448 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policy450 = new BitSet(new long[]{0x4000000000000000L,0x0000000010000080L});
    public static final BitSet FOLLOW_target_in_policy452 = new BitSet(new long[]{0x4000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule_in_policy455 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policy458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target469 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_target472 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_set_in_target474 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_target482 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_booleanExpr_in_target484 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_target486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule497 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule500 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_rule503 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_set_in_rule505 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule513 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_booleanExpr_in_rule515 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_rule517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanExpr540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr543 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_attributeExpr_in_booleanExpr545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_booleanExpr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOF_TOK_in_booleanExpr554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NOT_TOK_in_booleanExpr559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr563 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_booleanExpr567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_booleanExpr572 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanExpr574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_booleanExpr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_booleanExpr597 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_NODEEQUAL_TOK_in_booleanExpr601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NODEMATCH_TOK_in_booleanExpr606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_booleanExpr611 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_booleanExpr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr657 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalOrExpr660 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr662 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conditionalAndExpr692 = new BitSet(new long[]{0x180900CA71C3A020L,0x000000000002C334L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp713 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp718 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp730 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp735 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000030L});
    public static final BitSet FOLLOW_stringBag_in_isInOp737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp747 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp764 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp781 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_timeBag_in_isInOp788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp798 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp803 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp815 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp820 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp832 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp837 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp849 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp883 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp888 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp900 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp905 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp923 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_isInOp928 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_isInOp932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp945 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp950 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp961 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp966 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp983 = new BitSet(new long[]{0x0800000040002020L,0x0000000000000034L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1000 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_containsOp1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1012 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1029 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1034 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1046 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1051 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1063 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1068 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1080 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1114 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1119 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1131 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1136 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_containsOp1159 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_containsOp1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1176 = new BitSet(new long[]{0x180000C861C3A020L,0x000000000000C134L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1205 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1234 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1263 = new BitSet(new long[]{0x0800000040002020L,0x0000000000000034L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1350 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1437 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1508 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1545 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1549 = new BitSet(new long[]{0x180000C861C3A020L,0x000000000000C134L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1560 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1564 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1575 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1579 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1590 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1594 = new BitSet(new long[]{0x0800000040002020L,0x0000000000000034L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1605 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1609 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1620 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1635 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1639 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1650 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1654 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1665 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1680 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1695 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1699 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1716 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_regexOp1720 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_regexOp1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1743 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1759 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1776 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1793 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1811 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1828 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1847 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1864 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000030L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1883 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1919 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1955 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp1972 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1991 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2008 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2027 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2063 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2099 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2116 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2135 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2171 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2188 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2207 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2224 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2242 = new BitSet(new long[]{0x8000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_bagOp2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_bagOp2259 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bagOp2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2282 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerExpr2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerExpr2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerExpr2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerBag2332 = new BitSet(new long[]{0x180000C861C3A020L,0x000000000000C134L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2338 = new BitSet(new long[]{0x180000C861C3A020L,0x000000000000C134L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2340 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_integerBag2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerBag2348 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_set_in_integerBag2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_integerBag2360 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerBag2364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_doubleExpr2384 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_doubleExpr2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2436 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stringExpr2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_stringExpr2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringBag2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attributeExpr2492 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2510 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_anyUriExpr2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2522 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_anyUriExpr2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_anyUriExpr2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_anyUriExpr2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2575 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dateExpr2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateExpr2586 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateExpr2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dateExpr2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2626 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_timeExpr2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timeExpr2637 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timeExpr2641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_timeExpr2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2682 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr2684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dateTimeExpr2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateTimeExpr2699 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dateTimeExpr2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dateTimeExpr2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2746 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr2748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_base64BinaryExpr2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_base64BinaryExpr2764 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_base64BinaryExpr2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_base64BinaryExpr2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2813 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dayTimeDurationExpr2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dayTimeDurationExpr2830 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_dayTimeDurationExpr2834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dayTimeDurationExpr2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2878 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_yearMonthDurationExpr2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_yearMonthDurationExpr2897 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yearMonthDurationExpr2901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_yearMonthDurationExpr2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2939 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_x500NameExpr2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_x500NameExpr2951 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_x500NameExpr2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_x500NameExpr2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr2992 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rfc822NameExpr2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr3001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rfc822NameExpr3003 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rfc822NameExpr3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rfc822NameExpr3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr3045 = new BitSet(new long[]{0x0800000040000020L,0x0000000000000034L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_hexBinaryExpr3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_hexBinaryExpr3056 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_hexBinaryExpr3060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_hexBinaryExpr3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred4_Grammar916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred5_Grammar1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_synpred6_Grammar1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred7_Grammar1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred8_Grammar1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred9_Grammar1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred10_Grammar1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred11_Grammar1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred12_Grammar1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred13_Grammar1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred14_Grammar1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred15_Grammar1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred16_Grammar1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred17_Grammar2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred18_Grammar2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred19_Grammar2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred20_Grammar2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred21_Grammar2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred22_Grammar2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred23_Grammar2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_synpred25_Grammar2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_synpred26_Grammar2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_synpred29_Grammar2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred30_Grammar2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_synpred32_Grammar2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred33_Grammar2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_synpred35_Grammar2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred36_Grammar2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_synpred38_Grammar2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred39_Grammar2890 = new BitSet(new long[]{0x0000000000000002L});

}