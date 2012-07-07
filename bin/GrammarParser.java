// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-07-07 10:50:32

	package noxacml;
	import noxacml.util.*;
	import noxacml.xacml2.*;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_TOK", "ACTION_TOK", "ALLOFALL_TOK", "ALLOFANY_TOK", "ALLOF_TOK", "ANYCASEIDENTIFIER", "ANYOFALL_TOK", "ANYOFANY_TOK", "ANYOF_TOK", "ANYURI_TOK", "ATLEASTONEMENBEROF_TOK", "BAG_TOK", "BASE64BINARY_TOK", "BOOLEAN_TOK", "COMMENT", "CONCATENATE_TOK", "CONTAINS_TOK", "DATETIME_TOK", "DATE_TOK", "DAYTIMEDURATION_TOK", "DECIMAL_TOK", "DENY_TOK", "DEREF_TOK", "DOUBLE_CONSTANT", "DOUBLE_TOK", "ENVIRONMENT_TOK", "ESC_SEQ", "EXPONENT", "FALSE_TOK", "FLR_TOK", "HEXBINARY_TOK", "HEX_DIGIT", "IF_TOK", "INTEGER_CONSTANT", "INTEGER_TOK", "INTERSECTION_TOK", "ISIN_TOK", "LOWERCASEIDENTIFIER", "LPAREN", "MAP_TOK", "MATCHES_TOK", "NODECOUNT_TOK", "NODEEQUAL_TOK", "NODEMATCH_TOK", "NOF_TOK", "NORMALIZESPACE_TOK", "NORMALIZETOLOWERCASE_TOK", "NOT_TOK", "OCTAL_ESC", "ONEANDONLY_TOK", "PERMIT_TOK", "POLICYSET_TOK", "POLICY_TOK", "RANGEOP_TOK", "REGEXMATCH_TOK", "REQUIRED_TOK", "RESOURCE_TOK", "RFC822NAME_TOK", "RND_TOK", "RPAREN", "RULE_TOK", "SETEQUALS_TOK", "SIZE_TOK", "STRING_CONSTANT", "STRING_CONSTANT_LIST", "STRING_TOK", "SUBJECT_TOK", "SUBSET_TOK", "TARGET_TOK", "TIME_TOK", "TRUE_TOK", "UNICODE_ESC", "UNION_TOK", "URI_TOK", "WHITESPACE", "X500NAME_TOK", "YEARMONTHDURATION_TOK", "'&&'", "','", "'.'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int COMMENT=18;
    public static final int CONCATENATE_TOK=19;
    public static final int CONTAINS_TOK=20;
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
    public static final int LPAREN=42;
    public static final int MAP_TOK=43;
    public static final int MATCHES_TOK=44;
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
    public static final int REQUIRED_TOK=59;
    public static final int RESOURCE_TOK=60;
    public static final int RFC822NAME_TOK=61;
    public static final int RND_TOK=62;
    public static final int RPAREN=63;
    public static final int RULE_TOK=64;
    public static final int SETEQUALS_TOK=65;
    public static final int SIZE_TOK=66;
    public static final int STRING_CONSTANT=67;
    public static final int STRING_CONSTANT_LIST=68;
    public static final int STRING_TOK=69;
    public static final int SUBJECT_TOK=70;
    public static final int SUBSET_TOK=71;
    public static final int TARGET_TOK=72;
    public static final int TIME_TOK=73;
    public static final int TRUE_TOK=74;
    public static final int UNICODE_ESC=75;
    public static final int UNION_TOK=76;
    public static final int URI_TOK=77;
    public static final int WHITESPACE=78;
    public static final int X500NAME_TOK=79;
    public static final int YEARMONTHDURATION_TOK=80;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "base64BinaryBag", "matchAndExpr", "doubleExpr", "synpred10_Grammar", 
    "anyUriBag", "dayTimeDurationExpr", "rfc822NameExpr", "yearMonthDurationExpr", 
    "synpred8_Grammar", "dateTimeBag", "dayTimeDurationBag", "x500NameBag", 
    "booleanBag", "integerBag", "synpred7_Grammar", "integerExpr", "dateExpr", 
    "matchExpr", "stringBag", "synpred14_Grammar", "booleanNode", "timeExpr", 
    "dateBag", "synpred9_Grammar", "containsOp", "bagOp", "synpred1_Grammar", 
    "rfc822NameBag", "booleanNof", "timeBag", "doubleBag", "synpred17_Grammar", 
    "attributeSelector", "synpred15_Grammar", "booleanCreate", "hexBinaryBag", 
    "anyBag", "synpred13_Grammar", "hexBinaryExpr", "stringExpr", "dateTimeExpr", 
    "synpred16_Grammar", "isInOp", "synpred4_Grammar", "policySet", "regexOp", 
    "xacmlFile", "conditionalAndExpr", "anyUriExpr", "yearMonthDurationBag", 
    "synpred2_Grammar", "booleanExpr", "synpred12_Grammar", "equalityExpr", 
    "rule", "x500NameExpr", "matchOrExpr", "synpred11_Grammar", "policy", 
    "synpred5_Grammar", "synpred3_Grammar", "conditionalOrExpr", "booleanWrap", 
    "synpred6_Grammar", "target", "base64BinaryExpr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, true, true, false, false, true, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false
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


     final PolicyBuilder builder = new PolicyBuilder();


    public static class xacmlFile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xacmlFile"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:100:1: xacmlFile : ( policy | policySet ) EOF !;
    public final GrammarParser.xacmlFile_return xacmlFile() throws RecognitionException {
        GrammarParser.xacmlFile_return retval = new GrammarParser.xacmlFile_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF3=null;
        GrammarParser.policy_return policy1 =null;

        GrammarParser.policySet_return policySet2 =null;


        Object EOF3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "xacmlFile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:2: ( ( policy | policySet ) EOF !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:4: ( policy | policySet ) EOF !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(101,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:4: ( policy | policySet )
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==POLICY_TOK) ) {
                alt1=1;
            }
            else if ( (LA1_0==POLICYSET_TOK) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:5: policy
                    {
                    dbg.location(101,5);
                    pushFollow(FOLLOW_policy_in_xacmlFile490);
                    policy1=policy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:14: policySet
                    {
                    dbg.location(101,14);
                    pushFollow(FOLLOW_policySet_in_xacmlFile494);
                    policySet2=policySet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policySet2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(101,28);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_xacmlFile497); if (state.failed) return retval;

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
        dbg.location(102, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xacmlFile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "xacmlFile"


    public static class policy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policy"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:104:1: policy : POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( rule )? '}' !;
    public final GrammarParser.policy_return policy() throws RecognitionException {
        GrammarParser.policy_return retval = new GrammarParser.policy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POLICY_TOK4=null;
        Token ANYCASEIDENTIFIER5=null;
        Token LOWERCASEIDENTIFIER6=null;
        Token char_literal7=null;
        Token char_literal10=null;
        GrammarParser.target_return target8 =null;

        GrammarParser.rule_return rule9 =null;


        Object POLICY_TOK4_tree=null;
        Object ANYCASEIDENTIFIER5_tree=null;
        Object LOWERCASEIDENTIFIER6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policy");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:2: ( POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( rule )? '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:4: POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( rule )? '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(105,14);
            POLICY_TOK4=(Token)match(input,POLICY_TOK,FOLLOW_POLICY_TOK_in_policy509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY_TOK4_tree = 
            (Object)adaptor.create(POLICY_TOK4)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICY_TOK4_tree, root_0);
            }
            dbg.location(105,16);
            ANYCASEIDENTIFIER5=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy512); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER5_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER5_tree);
            }
            dbg.location(105,34);
            LOWERCASEIDENTIFIER6=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER6_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER6)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER6_tree);
            }
            dbg.location(105,57);
            char_literal7=(Token)match(input,89,FOLLOW_89_in_policy516); if (state.failed) return retval;
            dbg.location(105,59);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:59: ( target )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==TARGET_TOK) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:59: target
                    {
                    dbg.location(105,59);
                    pushFollow(FOLLOW_target_in_policy519);
                    target8=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(105,67);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:67: ( rule )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TOK) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:67: rule
                    {
                    dbg.location(105,67);
                    pushFollow(FOLLOW_rule_in_policy522);
                    rule9=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule9.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(105,76);
            char_literal10=(Token)match(input,91,FOLLOW_91_in_policy525); if (state.failed) return retval;

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
        dbg.location(106, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "policy");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "policy"


    public static class policySet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policySet"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:1: policySet : POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )* '}' !;
    public final GrammarParser.policySet_return policySet() throws RecognitionException {
        GrammarParser.policySet_return retval = new GrammarParser.policySet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POLICYSET_TOK11=null;
        Token ANYCASEIDENTIFIER12=null;
        Token LOWERCASEIDENTIFIER13=null;
        Token char_literal14=null;
        Token char_literal17=null;
        GrammarParser.target_return target15 =null;

        GrammarParser.policy_return policy16 =null;


        Object POLICYSET_TOK11_tree=null;
        Object ANYCASEIDENTIFIER12_tree=null;
        Object LOWERCASEIDENTIFIER13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policySet");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:2: ( POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )* '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:4: POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )* '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(109,17);
            POLICYSET_TOK11=(Token)match(input,POLICYSET_TOK,FOLLOW_POLICYSET_TOK_in_policySet537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICYSET_TOK11_tree = 
            (Object)adaptor.create(POLICYSET_TOK11)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICYSET_TOK11_tree, root_0);
            }
            dbg.location(109,19);
            ANYCASEIDENTIFIER12=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policySet540); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER12_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER12)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER12_tree);
            }
            dbg.location(109,37);
            LOWERCASEIDENTIFIER13=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policySet542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER13_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER13)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER13_tree);
            }
            dbg.location(109,60);
            char_literal14=(Token)match(input,89,FOLLOW_89_in_policySet544); if (state.failed) return retval;
            dbg.location(109,62);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:62: ( target )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==TARGET_TOK) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:62: target
                    {
                    dbg.location(109,62);
                    pushFollow(FOLLOW_target_in_policySet547);
                    target15=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(109,70);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:70: ( policy )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==POLICY_TOK) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:109:70: policy
            	    {
            	    dbg.location(109,70);
            	    pushFollow(FOLLOW_policy_in_policySet550);
            	    policy16=policy();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy16.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(109,81);
            char_literal17=(Token)match(input,91,FOLLOW_91_in_policySet553); if (state.failed) return retval;

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
        dbg.location(110, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "policySet");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "policySet"


    public static class target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "target"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:1: target : TARGET_TOK ^ '{' ! matchOrExpr '}' !;
    public final GrammarParser.target_return target() throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TARGET_TOK18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        GrammarParser.matchOrExpr_return matchOrExpr20 =null;


        Object TARGET_TOK18_tree=null;
        Object char_literal19_tree=null;
        Object char_literal21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:113:2: ( TARGET_TOK ^ '{' ! matchOrExpr '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:113:4: TARGET_TOK ^ '{' ! matchOrExpr '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(113,14);
            TARGET_TOK18=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK18_tree = 
            (Object)adaptor.create(TARGET_TOK18)
            ;
            root_0 = (Object)adaptor.becomeRoot(TARGET_TOK18_tree, root_0);
            }
            dbg.location(113,19);
            char_literal19=(Token)match(input,89,FOLLOW_89_in_target568); if (state.failed) return retval;
            dbg.location(113,21);
            pushFollow(FOLLOW_matchOrExpr_in_target571);
            matchOrExpr20=matchOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, matchOrExpr20.getTree());
            dbg.location(113,36);
            char_literal21=(Token)match(input,91,FOLLOW_91_in_target573); if (state.failed) return retval;

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
        dbg.location(114, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "target");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "target"


    public static class matchOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:1: matchOrExpr : ( matchAndExpr ( '||' ^ matchAndExpr )* | '(' ! matchOrExpr ')' !);
    public final GrammarParser.matchOrExpr_return matchOrExpr() throws RecognitionException {
        GrammarParser.matchOrExpr_return retval = new GrammarParser.matchOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal23=null;
        Token char_literal25=null;
        Token char_literal27=null;
        GrammarParser.matchAndExpr_return matchAndExpr22 =null;

        GrammarParser.matchAndExpr_return matchAndExpr24 =null;

        GrammarParser.matchOrExpr_return matchOrExpr26 =null;


        Object string_literal23_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:117:3: ( matchAndExpr ( '||' ^ matchAndExpr )* | '(' ! matchOrExpr ')' !)
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ACTION_TOK||LA7_0==ENVIRONMENT_TOK||LA7_0==RESOURCE_TOK||LA7_0==SUBJECT_TOK) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:117:5: matchAndExpr ( '||' ^ matchAndExpr )*
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(117,5);
                    pushFollow(FOLLOW_matchAndExpr_in_matchOrExpr586);
                    matchAndExpr22=matchAndExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchAndExpr22.getTree());
                    dbg.location(117,18);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:117:18: ( '||' ^ matchAndExpr )*
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==90) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:117:19: '||' ^ matchAndExpr
                    	    {
                    	    dbg.location(117,23);
                    	    string_literal23=(Token)match(input,90,FOLLOW_90_in_matchOrExpr589); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal23_tree = 
                    	    (Object)adaptor.create(string_literal23)
                    	    ;
                    	    root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);
                    	    }
                    	    dbg.location(117,25);
                    	    pushFollow(FOLLOW_matchAndExpr_in_matchOrExpr592);
                    	    matchAndExpr24=matchAndExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchAndExpr24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:118:4: '(' ! matchOrExpr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(118,7);
                    char_literal25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_matchOrExpr600); if (state.failed) return retval;
                    dbg.location(118,9);
                    pushFollow(FOLLOW_matchOrExpr_in_matchOrExpr603);
                    matchOrExpr26=matchOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchOrExpr26.getTree());
                    dbg.location(118,24);
                    char_literal27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_matchOrExpr605); if (state.failed) return retval;

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
        dbg.location(119, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchOrExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "matchOrExpr"


    public static class matchAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchAndExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:1: matchAndExpr : matchExpr ( '&&' ^ matchExpr )* ;
    public final GrammarParser.matchAndExpr_return matchAndExpr() throws RecognitionException {
        GrammarParser.matchAndExpr_return retval = new GrammarParser.matchAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal29=null;
        GrammarParser.matchExpr_return matchExpr28 =null;

        GrammarParser.matchExpr_return matchExpr30 =null;


        Object string_literal29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:3: ( matchExpr ( '&&' ^ matchExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:5: matchExpr ( '&&' ^ matchExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(122,5);
            pushFollow(FOLLOW_matchExpr_in_matchAndExpr619);
            matchExpr28=matchExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, matchExpr28.getTree());
            dbg.location(122,15);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:15: ( '&&' ^ matchExpr )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==81) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:16: '&&' ^ matchExpr
            	    {
            	    dbg.location(122,20);
            	    string_literal29=(Token)match(input,81,FOLLOW_81_in_matchAndExpr622); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal29_tree = 
            	    (Object)adaptor.create(string_literal29)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal29_tree, root_0);
            	    }
            	    dbg.location(122,22);
            	    pushFollow(FOLLOW_matchExpr_in_matchAndExpr625);
            	    matchExpr30=matchExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchExpr30.getTree());

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
        dbg.location(123, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchAndExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "matchAndExpr"


    public static class matchExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:1: matchExpr : attributeSelector ^ '.' ! MATCHES_TOK '(' ! stringExpr ')' !;
    public final GrammarParser.matchExpr_return matchExpr() throws RecognitionException {
        GrammarParser.matchExpr_return retval = new GrammarParser.matchExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal32=null;
        Token MATCHES_TOK33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        GrammarParser.attributeSelector_return attributeSelector31 =null;

        GrammarParser.stringExpr_return stringExpr35 =null;


        Object char_literal32_tree=null;
        Object MATCHES_TOK33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:2: ( attributeSelector ^ '.' ! MATCHES_TOK '(' ! stringExpr ')' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:4: attributeSelector ^ '.' ! MATCHES_TOK '(' ! stringExpr ')' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(126,21);
            pushFollow(FOLLOW_attributeSelector_in_matchExpr639);
            attributeSelector31=attributeSelector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(attributeSelector31.getTree(), root_0);
            dbg.location(126,26);
            char_literal32=(Token)match(input,83,FOLLOW_83_in_matchExpr642); if (state.failed) return retval;
            dbg.location(126,28);
            MATCHES_TOK33=(Token)match(input,MATCHES_TOK,FOLLOW_MATCHES_TOK_in_matchExpr645); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MATCHES_TOK33_tree = 
            (Object)adaptor.create(MATCHES_TOK33)
            ;
            adaptor.addChild(root_0, MATCHES_TOK33_tree);
            }
            dbg.location(126,43);
            char_literal34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_matchExpr647); if (state.failed) return retval;
            dbg.location(126,45);
            pushFollow(FOLLOW_stringExpr_in_matchExpr650);
            stringExpr35=stringExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr35.getTree());
            dbg.location(126,59);
            char_literal36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_matchExpr652); if (state.failed) return retval;

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
        dbg.location(127, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "matchExpr"


    public static class attributeSelector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeSelector"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:1: attributeSelector : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ '.' ! LOWERCASEIDENTIFIER ;
    public final GrammarParser.attributeSelector_return attributeSelector() throws RecognitionException {
        GrammarParser.attributeSelector_return retval = new GrammarParser.attributeSelector_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set37=null;
        Token char_literal38=null;
        Token LOWERCASEIDENTIFIER39=null;

        Object set37_tree=null;
        Object char_literal38_tree=null;
        Object LOWERCASEIDENTIFIER39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeSelector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ '.' ! LOWERCASEIDENTIFIER )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ '.' ! LOWERCASEIDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(130,64);
            set37=(Token)input.LT(1);

            set37=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set37)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(130,69);
            char_literal38=(Token)match(input,83,FOLLOW_83_in_attributeSelector682); if (state.failed) return retval;
            dbg.location(130,71);
            LOWERCASEIDENTIFIER39=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeSelector685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER39_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER39)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER39_tree);
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
        dbg.location(131, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attributeSelector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attributeSelector"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:133:1: rule : RULE_TOK ^ ANYCASEIDENTIFIER ( PERMIT_TOK | DENY_TOK ) '{' ! ( target )? ( conditionalOrExpr )? '}' !;
    public final GrammarParser.rule_return rule() throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RULE_TOK40=null;
        Token ANYCASEIDENTIFIER41=null;
        Token set42=null;
        Token char_literal43=null;
        Token char_literal46=null;
        GrammarParser.target_return target44 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr45 =null;


        Object RULE_TOK40_tree=null;
        Object ANYCASEIDENTIFIER41_tree=null;
        Object set42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:2: ( RULE_TOK ^ ANYCASEIDENTIFIER ( PERMIT_TOK | DENY_TOK ) '{' ! ( target )? ( conditionalOrExpr )? '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:4: RULE_TOK ^ ANYCASEIDENTIFIER ( PERMIT_TOK | DENY_TOK ) '{' ! ( target )? ( conditionalOrExpr )? '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(134,12);
            RULE_TOK40=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK40_tree = 
            (Object)adaptor.create(RULE_TOK40)
            ;
            root_0 = (Object)adaptor.becomeRoot(RULE_TOK40_tree, root_0);
            }
            dbg.location(134,14);
            ANYCASEIDENTIFIER41=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER41_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER41)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER41_tree);
            }
            dbg.location(134,32);
            set42=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set42)
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

            dbg.location(134,59);
            char_literal43=(Token)match(input,89,FOLLOW_89_in_rule709); if (state.failed) return retval;
            dbg.location(134,61);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:61: ( target )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==TARGET_TOK) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:61: target
                    {
                    dbg.location(134,61);
                    pushFollow(FOLLOW_target_in_rule712);
                    target44=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target44.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(134,69);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:69: ( conditionalOrExpr )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ACTION_TOK||LA10_0==ANYURI_TOK||(LA10_0 >= BAG_TOK && LA10_0 <= BOOLEAN_TOK)||(LA10_0 >= DATETIME_TOK && LA10_0 <= DAYTIMEDURATION_TOK)||(LA10_0 >= DOUBLE_CONSTANT && LA10_0 <= ENVIRONMENT_TOK)||LA10_0==FALSE_TOK||LA10_0==HEXBINARY_TOK||(LA10_0 >= INTEGER_CONSTANT && LA10_0 <= INTEGER_TOK)||LA10_0==LPAREN||LA10_0==NOF_TOK||LA10_0==NOT_TOK||(LA10_0 >= RESOURCE_TOK && LA10_0 <= RFC822NAME_TOK)||LA10_0==STRING_CONSTANT||(LA10_0 >= STRING_TOK && LA10_0 <= SUBJECT_TOK)||(LA10_0 >= TIME_TOK && LA10_0 <= TRUE_TOK)||(LA10_0 >= X500NAME_TOK && LA10_0 <= YEARMONTHDURATION_TOK)) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:69: conditionalOrExpr
                    {
                    dbg.location(134,69);
                    pushFollow(FOLLOW_conditionalOrExpr_in_rule715);
                    conditionalOrExpr45=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr45.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(134,91);
            char_literal46=(Token)match(input,91,FOLLOW_91_in_rule718); if (state.failed) return retval;

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
        dbg.location(135, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:1: booleanExpr : ( TRUE_TOK | FALSE_TOK | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp );
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TRUE_TOK47=null;
        Token FALSE_TOK48=null;
        GrammarParser.booleanCreate_return booleanCreate49 =null;

        GrammarParser.booleanNof_return booleanNof50 =null;

        GrammarParser.booleanWrap_return booleanWrap51 =null;

        GrammarParser.booleanNode_return booleanNode52 =null;

        GrammarParser.equalityExpr_return equalityExpr53 =null;

        GrammarParser.isInOp_return isInOp54 =null;

        GrammarParser.containsOp_return containsOp55 =null;


        Object TRUE_TOK47_tree=null;
        Object FALSE_TOK48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:2: ( TRUE_TOK | FALSE_TOK | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp )
            int alt11=9;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:4: TRUE_TOK
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(138,4);
                    TRUE_TOK47=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_TOK47_tree = 
                    (Object)adaptor.create(TRUE_TOK47)
                    ;
                    adaptor.addChild(root_0, TRUE_TOK47_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:4: FALSE_TOK
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,4);
                    FALSE_TOK48=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_TOK48_tree = 
                    (Object)adaptor.create(FALSE_TOK48)
                    ;
                    adaptor.addChild(root_0, FALSE_TOK48_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:4: booleanCreate
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,4);
                    pushFollow(FOLLOW_booleanCreate_in_booleanExpr740);
                    booleanCreate49=booleanCreate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanCreate49.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:4: booleanNof
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,4);
                    pushFollow(FOLLOW_booleanNof_in_booleanExpr745);
                    booleanNof50=booleanNof();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanNof50.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:4: booleanWrap
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(142,4);
                    pushFollow(FOLLOW_booleanWrap_in_booleanExpr750);
                    booleanWrap51=booleanWrap();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanWrap51.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:143:4: booleanNode
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(143,4);
                    pushFollow(FOLLOW_booleanNode_in_booleanExpr755);
                    booleanNode52=booleanNode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanNode52.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(144,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr760);
                    equalityExpr53=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr53.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr765);
                    isInOp54=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp54.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:4: containsOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,4);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr770);
                    containsOp55=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp55.getTree());

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
        dbg.location(149, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanExpr"


    public static class booleanCreate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanCreate"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:1: booleanCreate : BOOLEAN_TOK ^ LPAREN ! attributeSelector RPAREN !;
    public final GrammarParser.booleanCreate_return booleanCreate() throws RecognitionException {
        GrammarParser.booleanCreate_return retval = new GrammarParser.booleanCreate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK56=null;
        Token LPAREN57=null;
        Token RPAREN59=null;
        GrammarParser.attributeSelector_return attributeSelector58 =null;


        Object BOOLEAN_TOK56_tree=null;
        Object LPAREN57_tree=null;
        Object RPAREN59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanCreate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:2: ( BOOLEAN_TOK ^ LPAREN ! attributeSelector RPAREN !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:4: BOOLEAN_TOK ^ LPAREN ! attributeSelector RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(151,15);
            BOOLEAN_TOK56=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanCreate782); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK56_tree = 
            (Object)adaptor.create(BOOLEAN_TOK56)
            ;
            root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK56_tree, root_0);
            }
            dbg.location(151,23);
            LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanCreate785); if (state.failed) return retval;
            dbg.location(151,25);
            pushFollow(FOLLOW_attributeSelector_in_booleanCreate788);
            attributeSelector58=attributeSelector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector58.getTree());
            dbg.location(151,49);
            RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanCreate790); if (state.failed) return retval;

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
        dbg.location(152, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanCreate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanCreate"


    public static class booleanNof_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanNof"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:1: booleanNof : ( NOF_TOK | NOT_TOK ) ^ LPAREN ! booleanExpr RPAREN !;
    public final GrammarParser.booleanNof_return booleanNof() throws RecognitionException {
        GrammarParser.booleanNof_return retval = new GrammarParser.booleanNof_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set60=null;
        Token LPAREN61=null;
        Token RPAREN63=null;
        GrammarParser.booleanExpr_return booleanExpr62 =null;


        Object set60_tree=null;
        Object LPAREN61_tree=null;
        Object RPAREN63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanNof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:2: ( ( NOF_TOK | NOT_TOK ) ^ LPAREN ! booleanExpr RPAREN !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:4: ( NOF_TOK | NOT_TOK ) ^ LPAREN ! booleanExpr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(154,24);
            set60=(Token)input.LT(1);

            set60=(Token)input.LT(1);

            if ( input.LA(1)==NOF_TOK||input.LA(1)==NOT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set60)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(154,32);
            LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanNof811); if (state.failed) return retval;
            dbg.location(154,34);
            pushFollow(FOLLOW_booleanExpr_in_booleanNof814);
            booleanExpr62=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr62.getTree());
            dbg.location(154,52);
            RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanNof816); if (state.failed) return retval;

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
        dbg.location(155, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanNof");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanNof"


    public static class booleanWrap_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanWrap"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:1: booleanWrap : LPAREN ! conditionalOrExpr RPAREN !;
    public final GrammarParser.booleanWrap_return booleanWrap() throws RecognitionException {
        GrammarParser.booleanWrap_return retval = new GrammarParser.booleanWrap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN64=null;
        Token RPAREN66=null;
        GrammarParser.conditionalOrExpr_return conditionalOrExpr65 =null;


        Object LPAREN64_tree=null;
        Object RPAREN66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanWrap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:2: ( LPAREN ! conditionalOrExpr RPAREN !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:4: LPAREN ! conditionalOrExpr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(157,10);
            LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanWrap827); if (state.failed) return retval;
            dbg.location(157,12);
            pushFollow(FOLLOW_conditionalOrExpr_in_booleanWrap830);
            conditionalOrExpr65=conditionalOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr65.getTree());
            dbg.location(157,36);
            RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanWrap832); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "booleanWrap");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanWrap"


    public static class booleanNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanNode"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:159:1: booleanNode : stringExpr '.' ! ( NODEEQUAL_TOK | NODEMATCH_TOK ) ^ LPAREN ! stringExpr RPAREN !;
    public final GrammarParser.booleanNode_return booleanNode() throws RecognitionException {
        GrammarParser.booleanNode_return retval = new GrammarParser.booleanNode_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal68=null;
        Token set69=null;
        Token LPAREN70=null;
        Token RPAREN72=null;
        GrammarParser.stringExpr_return stringExpr67 =null;

        GrammarParser.stringExpr_return stringExpr71 =null;


        Object char_literal68_tree=null;
        Object set69_tree=null;
        Object LPAREN70_tree=null;
        Object RPAREN72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanNode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:2: ( stringExpr '.' ! ( NODEEQUAL_TOK | NODEMATCH_TOK ) ^ LPAREN ! stringExpr RPAREN !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:4: stringExpr '.' ! ( NODEEQUAL_TOK | NODEMATCH_TOK ) ^ LPAREN ! stringExpr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(160,4);
            pushFollow(FOLLOW_stringExpr_in_booleanNode843);
            stringExpr67=stringExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr67.getTree());
            dbg.location(160,18);
            char_literal68=(Token)match(input,83,FOLLOW_83_in_booleanNode845); if (state.failed) return retval;
            dbg.location(160,53);
            set69=(Token)input.LT(1);

            set69=(Token)input.LT(1);

            if ( (input.LA(1) >= NODEEQUAL_TOK && input.LA(1) <= NODEMATCH_TOK) ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set69)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(160,61);
            LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanNode859); if (state.failed) return retval;
            dbg.location(160,63);
            pushFollow(FOLLOW_stringExpr_in_booleanNode862);
            stringExpr71=stringExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr71.getTree());
            dbg.location(160,80);
            RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanNode864); if (state.failed) return retval;

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
        dbg.location(161, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanNode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanNode"


    public static class booleanBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:1: booleanBag : BOOLEAN_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK73=null;
        Token STRING_CONSTANT_LIST74=null;

        Object BOOLEAN_TOK73_tree=null;
        Object STRING_CONSTANT_LIST74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:2: ( BOOLEAN_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:4: BOOLEAN_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(163,15);
            BOOLEAN_TOK73=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag875); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK73_tree = 
            (Object)adaptor.create(BOOLEAN_TOK73)
            ;
            root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK73_tree, root_0);
            }
            dbg.location(163,17);
            STRING_CONSTANT_LIST74=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST74_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST74)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST74_tree);
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
        dbg.location(166, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:1: conditionalOrExpr : conditionalAndExpr ( '||' ^ conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal76=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr75 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr77 =null;


        Object string_literal76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:3: ( conditionalAndExpr ( '||' ^ conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:5: conditionalAndExpr ( '||' ^ conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(169,5);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr892);
            conditionalAndExpr75=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr75.getTree());
            dbg.location(169,24);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:24: ( '||' ^ conditionalAndExpr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==90) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:25: '||' ^ conditionalAndExpr
            	    {
            	    dbg.location(169,29);
            	    string_literal76=(Token)match(input,90,FOLLOW_90_in_conditionalOrExpr895); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal76_tree = 
            	    (Object)adaptor.create(string_literal76)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal76_tree, root_0);
            	    }
            	    dbg.location(169,31);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr898);
            	    conditionalAndExpr77=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr77.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


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
        dbg.location(170, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:1: conditionalAndExpr : booleanExpr ( '&&' ^ booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal79=null;
        GrammarParser.booleanExpr_return booleanExpr78 =null;

        GrammarParser.booleanExpr_return booleanExpr80 =null;


        Object string_literal79_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:3: ( booleanExpr ( '&&' ^ booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:5: booleanExpr ( '&&' ^ booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(173,5);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr914);
            booleanExpr78=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr78.getTree());
            dbg.location(173,17);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:17: ( '&&' ^ booleanExpr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==81) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:18: '&&' ^ booleanExpr
            	    {
            	    dbg.location(173,22);
            	    string_literal79=(Token)match(input,81,FOLLOW_81_in_conditionalAndExpr917); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal79_tree = 
            	    (Object)adaptor.create(string_literal79)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal79_tree, root_0);
            	    }
            	    dbg.location(173,24);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr920);
            	    booleanExpr80=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr80.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


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
        dbg.location(174, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:1: isInOp : ( doubleExpr '.' ! ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ! ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ! ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ! ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ! ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ! ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ! ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ! ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ! ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ! ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ! ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        Token ISIN_TOK83=null;
        Token LPAREN84=null;
        Token RPAREN86=null;
        Token char_literal88=null;
        Token ISIN_TOK89=null;
        Token LPAREN90=null;
        Token RPAREN92=null;
        Token char_literal94=null;
        Token ISIN_TOK95=null;
        Token LPAREN96=null;
        Token RPAREN98=null;
        Token char_literal100=null;
        Token ISIN_TOK101=null;
        Token LPAREN102=null;
        Token RPAREN104=null;
        Token char_literal106=null;
        Token ISIN_TOK107=null;
        Token LPAREN108=null;
        Token RPAREN110=null;
        Token char_literal112=null;
        Token ISIN_TOK113=null;
        Token LPAREN114=null;
        Token RPAREN116=null;
        Token char_literal118=null;
        Token ISIN_TOK119=null;
        Token LPAREN120=null;
        Token RPAREN122=null;
        Token char_literal124=null;
        Token ISIN_TOK125=null;
        Token LPAREN126=null;
        Token RPAREN128=null;
        Token char_literal130=null;
        Token ISIN_TOK131=null;
        Token LPAREN132=null;
        Token RPAREN134=null;
        Token char_literal136=null;
        Token ISIN_TOK137=null;
        Token LPAREN138=null;
        Token RPAREN140=null;
        Token char_literal142=null;
        Token ISIN_TOK143=null;
        Token LPAREN144=null;
        Token RPAREN146=null;
        Token char_literal148=null;
        Token ISIN_TOK149=null;
        Token LPAREN150=null;
        Token RPAREN152=null;
        Token char_literal154=null;
        Token ISIN_TOK155=null;
        Token LPAREN156=null;
        Token RPAREN158=null;
        GrammarParser.doubleExpr_return doubleExpr81 =null;

        GrammarParser.doubleBag_return doubleBag85 =null;

        GrammarParser.stringExpr_return stringExpr87 =null;

        GrammarParser.stringBag_return stringBag91 =null;

        GrammarParser.anyUriExpr_return anyUriExpr93 =null;

        GrammarParser.anyUriBag_return anyUriBag97 =null;

        GrammarParser.dateExpr_return dateExpr99 =null;

        GrammarParser.dateBag_return dateBag103 =null;

        GrammarParser.timeExpr_return timeExpr105 =null;

        GrammarParser.timeBag_return timeBag109 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr111 =null;

        GrammarParser.dateTimeBag_return dateTimeBag115 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr117 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag121 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr123 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag127 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr129 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag133 =null;

        GrammarParser.x500NameExpr_return x500NameExpr135 =null;

        GrammarParser.x500NameBag_return x500NameBag139 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr141 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag145 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr147 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag151 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr153 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag157 =null;


        Object char_literal82_tree=null;
        Object ISIN_TOK83_tree=null;
        Object LPAREN84_tree=null;
        Object RPAREN86_tree=null;
        Object char_literal88_tree=null;
        Object ISIN_TOK89_tree=null;
        Object LPAREN90_tree=null;
        Object RPAREN92_tree=null;
        Object char_literal94_tree=null;
        Object ISIN_TOK95_tree=null;
        Object LPAREN96_tree=null;
        Object RPAREN98_tree=null;
        Object char_literal100_tree=null;
        Object ISIN_TOK101_tree=null;
        Object LPAREN102_tree=null;
        Object RPAREN104_tree=null;
        Object char_literal106_tree=null;
        Object ISIN_TOK107_tree=null;
        Object LPAREN108_tree=null;
        Object RPAREN110_tree=null;
        Object char_literal112_tree=null;
        Object ISIN_TOK113_tree=null;
        Object LPAREN114_tree=null;
        Object RPAREN116_tree=null;
        Object char_literal118_tree=null;
        Object ISIN_TOK119_tree=null;
        Object LPAREN120_tree=null;
        Object RPAREN122_tree=null;
        Object char_literal124_tree=null;
        Object ISIN_TOK125_tree=null;
        Object LPAREN126_tree=null;
        Object RPAREN128_tree=null;
        Object char_literal130_tree=null;
        Object ISIN_TOK131_tree=null;
        Object LPAREN132_tree=null;
        Object RPAREN134_tree=null;
        Object char_literal136_tree=null;
        Object ISIN_TOK137_tree=null;
        Object LPAREN138_tree=null;
        Object RPAREN140_tree=null;
        Object char_literal142_tree=null;
        Object ISIN_TOK143_tree=null;
        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;
        Object char_literal148_tree=null;
        Object ISIN_TOK149_tree=null;
        Object LPAREN150_tree=null;
        Object RPAREN152_tree=null;
        Object char_literal154_tree=null;
        Object ISIN_TOK155_tree=null;
        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:2: ( doubleExpr '.' ! ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ! ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ! ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ! ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ! ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ! ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ! ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ! ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ! ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ! ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ! ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !)
            int alt14=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: doubleExpr '.' ! ISIN_TOK ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,4);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp934);
                    doubleExpr81=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr81.getTree());
                    dbg.location(177,18);
                    char_literal82=(Token)match(input,83,FOLLOW_83_in_isInOp936); if (state.failed) return retval;
                    dbg.location(177,28);
                    ISIN_TOK83=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK83_tree = 
                    (Object)adaptor.create(ISIN_TOK83)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK83_tree, root_0);
                    }
                    dbg.location(177,36);
                    LPAREN84=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp942); if (state.failed) return retval;
                    dbg.location(177,38);
                    pushFollow(FOLLOW_doubleBag_in_isInOp945);
                    doubleBag85=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag85.getTree());
                    dbg.location(177,54);
                    RPAREN86=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp947); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: stringExpr '.' ! ISIN_TOK ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,4);
                    pushFollow(FOLLOW_stringExpr_in_isInOp953);
                    stringExpr87=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr87.getTree());
                    dbg.location(178,18);
                    char_literal88=(Token)match(input,83,FOLLOW_83_in_isInOp955); if (state.failed) return retval;
                    dbg.location(178,28);
                    ISIN_TOK89=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK89_tree = 
                    (Object)adaptor.create(ISIN_TOK89)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK89_tree, root_0);
                    }
                    dbg.location(178,36);
                    LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp961); if (state.failed) return retval;
                    dbg.location(178,38);
                    pushFollow(FOLLOW_stringBag_in_isInOp964);
                    stringBag91=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag91.getTree());
                    dbg.location(178,54);
                    RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp966); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: anyUriExpr '.' ! ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,4);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp972);
                    anyUriExpr93=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr93.getTree());
                    dbg.location(179,18);
                    char_literal94=(Token)match(input,83,FOLLOW_83_in_isInOp974); if (state.failed) return retval;
                    dbg.location(179,28);
                    ISIN_TOK95=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK95_tree = 
                    (Object)adaptor.create(ISIN_TOK95)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK95_tree, root_0);
                    }
                    dbg.location(179,36);
                    LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp980); if (state.failed) return retval;
                    dbg.location(179,38);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp983);
                    anyUriBag97=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag97.getTree());
                    dbg.location(179,54);
                    RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp985); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: dateExpr '.' ! ISIN_TOK ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,4);
                    pushFollow(FOLLOW_dateExpr_in_isInOp991);
                    dateExpr99=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr99.getTree());
                    dbg.location(180,16);
                    char_literal100=(Token)match(input,83,FOLLOW_83_in_isInOp993); if (state.failed) return retval;
                    dbg.location(180,26);
                    ISIN_TOK101=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK101_tree = 
                    (Object)adaptor.create(ISIN_TOK101)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK101_tree, root_0);
                    }
                    dbg.location(180,34);
                    LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp999); if (state.failed) return retval;
                    dbg.location(180,36);
                    pushFollow(FOLLOW_dateBag_in_isInOp1002);
                    dateBag103=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag103.getTree());
                    dbg.location(180,50);
                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1004); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: timeExpr '.' ! ISIN_TOK ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,4);
                    pushFollow(FOLLOW_timeExpr_in_isInOp1010);
                    timeExpr105=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr105.getTree());
                    dbg.location(181,16);
                    char_literal106=(Token)match(input,83,FOLLOW_83_in_isInOp1012); if (state.failed) return retval;
                    dbg.location(181,26);
                    ISIN_TOK107=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK107_tree = 
                    (Object)adaptor.create(ISIN_TOK107)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK107_tree, root_0);
                    }
                    dbg.location(181,34);
                    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1018); if (state.failed) return retval;
                    dbg.location(181,36);
                    pushFollow(FOLLOW_timeBag_in_isInOp1021);
                    timeBag109=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag109.getTree());
                    dbg.location(181,50);
                    RPAREN110=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1023); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:4: dateTimeExpr '.' ! ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp1029);
                    dateTimeExpr111=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr111.getTree());
                    dbg.location(182,20);
                    char_literal112=(Token)match(input,83,FOLLOW_83_in_isInOp1031); if (state.failed) return retval;
                    dbg.location(182,30);
                    ISIN_TOK113=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK113_tree = 
                    (Object)adaptor.create(ISIN_TOK113)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK113_tree, root_0);
                    }
                    dbg.location(182,38);
                    LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1037); if (state.failed) return retval;
                    dbg.location(182,40);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp1040);
                    dateTimeBag115=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag115.getTree());
                    dbg.location(182,58);
                    RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1042); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:4: base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1048);
                    base64BinaryExpr117=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr117.getTree());
                    dbg.location(183,24);
                    char_literal118=(Token)match(input,83,FOLLOW_83_in_isInOp1050); if (state.failed) return retval;
                    dbg.location(183,34);
                    ISIN_TOK119=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK119_tree = 
                    (Object)adaptor.create(ISIN_TOK119)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK119_tree, root_0);
                    }
                    dbg.location(183,42);
                    LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1056); if (state.failed) return retval;
                    dbg.location(183,44);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1059);
                    base64BinaryBag121=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag121.getTree());
                    dbg.location(183,66);
                    RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1061); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:4: dayTimeDurationExpr '.' ! ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(184,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp1067);
                    dayTimeDurationExpr123=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr123.getTree());
                    dbg.location(184,27);
                    char_literal124=(Token)match(input,83,FOLLOW_83_in_isInOp1069); if (state.failed) return retval;
                    dbg.location(184,37);
                    ISIN_TOK125=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK125_tree = 
                    (Object)adaptor.create(ISIN_TOK125)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK125_tree, root_0);
                    }
                    dbg.location(184,45);
                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1075); if (state.failed) return retval;
                    dbg.location(184,47);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp1078);
                    dayTimeDurationBag127=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag127.getTree());
                    dbg.location(184,72);
                    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1080); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:4: yearMonthDurationExpr '.' ! ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp1086);
                    yearMonthDurationExpr129=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr129.getTree());
                    dbg.location(185,29);
                    char_literal130=(Token)match(input,83,FOLLOW_83_in_isInOp1088); if (state.failed) return retval;
                    dbg.location(185,39);
                    ISIN_TOK131=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK131_tree = 
                    (Object)adaptor.create(ISIN_TOK131)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK131_tree, root_0);
                    }
                    dbg.location(185,47);
                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1094); if (state.failed) return retval;
                    dbg.location(185,49);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp1097);
                    yearMonthDurationBag133=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag133.getTree());
                    dbg.location(185,76);
                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1099); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:4: x500NameExpr '.' ! ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,4);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp1105);
                    x500NameExpr135=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr135.getTree());
                    dbg.location(186,20);
                    char_literal136=(Token)match(input,83,FOLLOW_83_in_isInOp1107); if (state.failed) return retval;
                    dbg.location(186,30);
                    ISIN_TOK137=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK137_tree = 
                    (Object)adaptor.create(ISIN_TOK137)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK137_tree, root_0);
                    }
                    dbg.location(186,38);
                    LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1113); if (state.failed) return retval;
                    dbg.location(186,40);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp1116);
                    x500NameBag139=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag139.getTree());
                    dbg.location(186,58);
                    RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1118); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: rfc822NameExpr '.' ! ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp1124);
                    rfc822NameExpr141=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr141.getTree());
                    dbg.location(187,22);
                    char_literal142=(Token)match(input,83,FOLLOW_83_in_isInOp1126); if (state.failed) return retval;
                    dbg.location(187,32);
                    ISIN_TOK143=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK143_tree = 
                    (Object)adaptor.create(ISIN_TOK143)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK143_tree, root_0);
                    }
                    dbg.location(187,40);
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1132); if (state.failed) return retval;
                    dbg.location(187,42);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp1135);
                    rfc822NameBag145=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag145.getTree());
                    dbg.location(187,62);
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1137); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:4: hexBinaryExpr '.' ! ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,4);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp1143);
                    hexBinaryExpr147=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr147.getTree());
                    dbg.location(188,21);
                    char_literal148=(Token)match(input,83,FOLLOW_83_in_isInOp1145); if (state.failed) return retval;
                    dbg.location(188,31);
                    ISIN_TOK149=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK149_tree = 
                    (Object)adaptor.create(ISIN_TOK149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK149_tree, root_0);
                    }
                    dbg.location(188,39);
                    LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1151); if (state.failed) return retval;
                    dbg.location(188,41);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp1154);
                    hexBinaryBag151=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag151.getTree());
                    dbg.location(188,60);
                    RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1156); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:4: ( base64BinaryExpr )=> base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(189,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1168);
                    base64BinaryExpr153=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr153.getTree());
                    dbg.location(189,46);
                    char_literal154=(Token)match(input,83,FOLLOW_83_in_isInOp1170); if (state.failed) return retval;
                    dbg.location(189,56);
                    ISIN_TOK155=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK155_tree = 
                    (Object)adaptor.create(ISIN_TOK155)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK155_tree, root_0);
                    }
                    dbg.location(189,64);
                    LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1176); if (state.failed) return retval;
                    dbg.location(189,66);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1179);
                    base64BinaryBag157=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag157.getTree());
                    dbg.location(189,88);
                    RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1181); if (state.failed) return retval;

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
        dbg.location(190, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:1: containsOp : ( doubleBag '.' ! CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' ! CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ! CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' ! CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' ! CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' ! CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' ! CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' ! CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal160=null;
        Token CONTAINS_TOK161=null;
        Token LPAREN162=null;
        Token RPAREN164=null;
        Token char_literal166=null;
        Token CONTAINS_TOK167=null;
        Token LPAREN168=null;
        Token RPAREN170=null;
        Token char_literal172=null;
        Token CONTAINS_TOK173=null;
        Token LPAREN174=null;
        Token RPAREN176=null;
        Token char_literal178=null;
        Token CONTAINS_TOK179=null;
        Token LPAREN180=null;
        Token RPAREN182=null;
        Token char_literal184=null;
        Token CONTAINS_TOK185=null;
        Token LPAREN186=null;
        Token RPAREN188=null;
        Token char_literal190=null;
        Token CONTAINS_TOK191=null;
        Token LPAREN192=null;
        Token RPAREN194=null;
        Token char_literal196=null;
        Token CONTAINS_TOK197=null;
        Token LPAREN198=null;
        Token RPAREN200=null;
        Token char_literal202=null;
        Token CONTAINS_TOK203=null;
        Token LPAREN204=null;
        Token RPAREN206=null;
        Token char_literal208=null;
        Token CONTAINS_TOK209=null;
        Token LPAREN210=null;
        Token RPAREN212=null;
        Token char_literal214=null;
        Token CONTAINS_TOK215=null;
        Token LPAREN216=null;
        Token RPAREN218=null;
        Token char_literal220=null;
        Token CONTAINS_TOK221=null;
        Token LPAREN222=null;
        Token RPAREN224=null;
        Token char_literal226=null;
        Token CONTAINS_TOK227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        Token char_literal232=null;
        Token CONTAINS_TOK233=null;
        Token LPAREN234=null;
        Token RPAREN236=null;
        GrammarParser.doubleBag_return doubleBag159 =null;

        GrammarParser.doubleExpr_return doubleExpr163 =null;

        GrammarParser.stringBag_return stringBag165 =null;

        GrammarParser.stringExpr_return stringExpr169 =null;

        GrammarParser.anyUriBag_return anyUriBag171 =null;

        GrammarParser.anyUriExpr_return anyUriExpr175 =null;

        GrammarParser.dateBag_return dateBag177 =null;

        GrammarParser.dateExpr_return dateExpr181 =null;

        GrammarParser.timeBag_return timeBag183 =null;

        GrammarParser.timeExpr_return timeExpr187 =null;

        GrammarParser.dateTimeBag_return dateTimeBag189 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr193 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag195 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr199 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag201 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr205 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag207 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr211 =null;

        GrammarParser.x500NameBag_return x500NameBag213 =null;

        GrammarParser.x500NameExpr_return x500NameExpr217 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag219 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr223 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag225 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr229 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag231 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr235 =null;


        Object char_literal160_tree=null;
        Object CONTAINS_TOK161_tree=null;
        Object LPAREN162_tree=null;
        Object RPAREN164_tree=null;
        Object char_literal166_tree=null;
        Object CONTAINS_TOK167_tree=null;
        Object LPAREN168_tree=null;
        Object RPAREN170_tree=null;
        Object char_literal172_tree=null;
        Object CONTAINS_TOK173_tree=null;
        Object LPAREN174_tree=null;
        Object RPAREN176_tree=null;
        Object char_literal178_tree=null;
        Object CONTAINS_TOK179_tree=null;
        Object LPAREN180_tree=null;
        Object RPAREN182_tree=null;
        Object char_literal184_tree=null;
        Object CONTAINS_TOK185_tree=null;
        Object LPAREN186_tree=null;
        Object RPAREN188_tree=null;
        Object char_literal190_tree=null;
        Object CONTAINS_TOK191_tree=null;
        Object LPAREN192_tree=null;
        Object RPAREN194_tree=null;
        Object char_literal196_tree=null;
        Object CONTAINS_TOK197_tree=null;
        Object LPAREN198_tree=null;
        Object RPAREN200_tree=null;
        Object char_literal202_tree=null;
        Object CONTAINS_TOK203_tree=null;
        Object LPAREN204_tree=null;
        Object RPAREN206_tree=null;
        Object char_literal208_tree=null;
        Object CONTAINS_TOK209_tree=null;
        Object LPAREN210_tree=null;
        Object RPAREN212_tree=null;
        Object char_literal214_tree=null;
        Object CONTAINS_TOK215_tree=null;
        Object LPAREN216_tree=null;
        Object RPAREN218_tree=null;
        Object char_literal220_tree=null;
        Object CONTAINS_TOK221_tree=null;
        Object LPAREN222_tree=null;
        Object RPAREN224_tree=null;
        Object char_literal226_tree=null;
        Object CONTAINS_TOK227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;
        Object char_literal232_tree=null;
        Object CONTAINS_TOK233_tree=null;
        Object LPAREN234_tree=null;
        Object RPAREN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:2: ( doubleBag '.' ! CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' ! CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ! CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' ! CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' ! CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' ! CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' ! CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' ! CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
            int alt15=13;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            try {
                isCyclicDecision = true;
                alt15 = dfa15.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: doubleBag '.' ! CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,4);
                    pushFollow(FOLLOW_doubleBag_in_containsOp1193);
                    doubleBag159=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag159.getTree());
                    dbg.location(193,17);
                    char_literal160=(Token)match(input,83,FOLLOW_83_in_containsOp1195); if (state.failed) return retval;
                    dbg.location(193,31);
                    CONTAINS_TOK161=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK161_tree = 
                    (Object)adaptor.create(CONTAINS_TOK161)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK161_tree, root_0);
                    }
                    dbg.location(193,39);
                    LPAREN162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1201); if (state.failed) return retval;
                    dbg.location(193,41);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp1204);
                    doubleExpr163=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr163.getTree());
                    dbg.location(193,58);
                    RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1206); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: stringBag '.' ! CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(194,4);
                    pushFollow(FOLLOW_stringBag_in_containsOp1212);
                    stringBag165=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag165.getTree());
                    dbg.location(194,17);
                    char_literal166=(Token)match(input,83,FOLLOW_83_in_containsOp1214); if (state.failed) return retval;
                    dbg.location(194,31);
                    CONTAINS_TOK167=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK167_tree = 
                    (Object)adaptor.create(CONTAINS_TOK167)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK167_tree, root_0);
                    }
                    dbg.location(194,39);
                    LPAREN168=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1220); if (state.failed) return retval;
                    dbg.location(194,41);
                    pushFollow(FOLLOW_stringExpr_in_containsOp1223);
                    stringExpr169=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr169.getTree());
                    dbg.location(194,58);
                    RPAREN170=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1225); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:4: anyUriBag '.' ! CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(195,4);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp1231);
                    anyUriBag171=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag171.getTree());
                    dbg.location(195,17);
                    char_literal172=(Token)match(input,83,FOLLOW_83_in_containsOp1233); if (state.failed) return retval;
                    dbg.location(195,31);
                    CONTAINS_TOK173=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK173_tree = 
                    (Object)adaptor.create(CONTAINS_TOK173)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK173_tree, root_0);
                    }
                    dbg.location(195,39);
                    LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1239); if (state.failed) return retval;
                    dbg.location(195,41);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp1242);
                    anyUriExpr175=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr175.getTree());
                    dbg.location(195,58);
                    RPAREN176=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1244); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: dateBag '.' ! CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(196,4);
                    pushFollow(FOLLOW_dateBag_in_containsOp1250);
                    dateBag177=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag177.getTree());
                    dbg.location(196,15);
                    char_literal178=(Token)match(input,83,FOLLOW_83_in_containsOp1252); if (state.failed) return retval;
                    dbg.location(196,29);
                    CONTAINS_TOK179=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK179_tree = 
                    (Object)adaptor.create(CONTAINS_TOK179)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK179_tree, root_0);
                    }
                    dbg.location(196,37);
                    LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1258); if (state.failed) return retval;
                    dbg.location(196,39);
                    pushFollow(FOLLOW_dateExpr_in_containsOp1261);
                    dateExpr181=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr181.getTree());
                    dbg.location(196,54);
                    RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1263); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: timeBag '.' ! CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(197,4);
                    pushFollow(FOLLOW_timeBag_in_containsOp1269);
                    timeBag183=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag183.getTree());
                    dbg.location(197,15);
                    char_literal184=(Token)match(input,83,FOLLOW_83_in_containsOp1271); if (state.failed) return retval;
                    dbg.location(197,29);
                    CONTAINS_TOK185=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK185_tree = 
                    (Object)adaptor.create(CONTAINS_TOK185)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK185_tree, root_0);
                    }
                    dbg.location(197,37);
                    LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1277); if (state.failed) return retval;
                    dbg.location(197,39);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1280);
                    timeExpr187=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr187.getTree());
                    dbg.location(197,54);
                    RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1282); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:4: dateTimeBag '.' ! CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(198,4);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1288);
                    dateTimeBag189=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag189.getTree());
                    dbg.location(198,19);
                    char_literal190=(Token)match(input,83,FOLLOW_83_in_containsOp1290); if (state.failed) return retval;
                    dbg.location(198,33);
                    CONTAINS_TOK191=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK191_tree = 
                    (Object)adaptor.create(CONTAINS_TOK191)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK191_tree, root_0);
                    }
                    dbg.location(198,41);
                    LPAREN192=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1296); if (state.failed) return retval;
                    dbg.location(198,43);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1299);
                    dateTimeExpr193=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr193.getTree());
                    dbg.location(198,62);
                    RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1301); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:4: base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(199,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1307);
                    base64BinaryBag195=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag195.getTree());
                    dbg.location(199,23);
                    char_literal196=(Token)match(input,83,FOLLOW_83_in_containsOp1309); if (state.failed) return retval;
                    dbg.location(199,37);
                    CONTAINS_TOK197=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK197_tree = 
                    (Object)adaptor.create(CONTAINS_TOK197)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK197_tree, root_0);
                    }
                    dbg.location(199,45);
                    LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1315); if (state.failed) return retval;
                    dbg.location(199,47);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1318);
                    base64BinaryExpr199=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr199.getTree());
                    dbg.location(199,70);
                    RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1320); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: dayTimeDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,4);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1326);
                    dayTimeDurationBag201=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag201.getTree());
                    dbg.location(200,26);
                    char_literal202=(Token)match(input,83,FOLLOW_83_in_containsOp1328); if (state.failed) return retval;
                    dbg.location(200,40);
                    CONTAINS_TOK203=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK203_tree = 
                    (Object)adaptor.create(CONTAINS_TOK203)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK203_tree, root_0);
                    }
                    dbg.location(200,48);
                    LPAREN204=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1334); if (state.failed) return retval;
                    dbg.location(200,50);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1337);
                    dayTimeDurationExpr205=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr205.getTree());
                    dbg.location(200,76);
                    RPAREN206=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1339); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: yearMonthDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1345);
                    yearMonthDurationBag207=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag207.getTree());
                    dbg.location(201,28);
                    char_literal208=(Token)match(input,83,FOLLOW_83_in_containsOp1347); if (state.failed) return retval;
                    dbg.location(201,42);
                    CONTAINS_TOK209=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK209_tree = 
                    (Object)adaptor.create(CONTAINS_TOK209)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK209_tree, root_0);
                    }
                    dbg.location(201,50);
                    LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1353); if (state.failed) return retval;
                    dbg.location(201,52);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1356);
                    yearMonthDurationExpr211=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr211.getTree());
                    dbg.location(201,80);
                    RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1358); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: x500NameBag '.' ! CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,4);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1364);
                    x500NameBag213=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag213.getTree());
                    dbg.location(202,19);
                    char_literal214=(Token)match(input,83,FOLLOW_83_in_containsOp1366); if (state.failed) return retval;
                    dbg.location(202,33);
                    CONTAINS_TOK215=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK215_tree = 
                    (Object)adaptor.create(CONTAINS_TOK215)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK215_tree, root_0);
                    }
                    dbg.location(202,41);
                    LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1372); if (state.failed) return retval;
                    dbg.location(202,43);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1375);
                    x500NameExpr217=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr217.getTree());
                    dbg.location(202,62);
                    RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1377); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: rfc822NameBag '.' ! CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1383);
                    rfc822NameBag219=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag219.getTree());
                    dbg.location(203,21);
                    char_literal220=(Token)match(input,83,FOLLOW_83_in_containsOp1385); if (state.failed) return retval;
                    dbg.location(203,35);
                    CONTAINS_TOK221=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK221_tree = 
                    (Object)adaptor.create(CONTAINS_TOK221)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK221_tree, root_0);
                    }
                    dbg.location(203,43);
                    LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1391); if (state.failed) return retval;
                    dbg.location(203,45);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1394);
                    rfc822NameExpr223=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr223.getTree());
                    dbg.location(203,66);
                    RPAREN224=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1396); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: hexBinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1402);
                    hexBinaryBag225=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag225.getTree());
                    dbg.location(204,20);
                    char_literal226=(Token)match(input,83,FOLLOW_83_in_containsOp1404); if (state.failed) return retval;
                    dbg.location(204,34);
                    CONTAINS_TOK227=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK227_tree = 
                    (Object)adaptor.create(CONTAINS_TOK227)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK227_tree, root_0);
                    }
                    dbg.location(204,42);
                    LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1410); if (state.failed) return retval;
                    dbg.location(204,44);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1413);
                    hexBinaryExpr229=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr229.getTree());
                    dbg.location(204,64);
                    RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1415); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( base64BinaryExpr )=> base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(205,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1427);
                    base64BinaryBag231=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag231.getTree());
                    dbg.location(205,45);
                    char_literal232=(Token)match(input,83,FOLLOW_83_in_containsOp1429); if (state.failed) return retval;
                    dbg.location(205,59);
                    CONTAINS_TOK233=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK233_tree = 
                    (Object)adaptor.create(CONTAINS_TOK233)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK233_tree, root_0);
                    }
                    dbg.location(205,67);
                    LPAREN234=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1435); if (state.failed) return retval;
                    dbg.location(205,69);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1438);
                    base64BinaryExpr235=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr235.getTree());
                    dbg.location(205,92);
                    RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1440); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set238=null;
        Token set241=null;
        Token set244=null;
        Token set247=null;
        Token set250=null;
        Token set253=null;
        Token set256=null;
        Token set259=null;
        Token set262=null;
        Token set265=null;
        Token set268=null;
        Token set271=null;
        GrammarParser.integerExpr_return integerExpr237 =null;

        GrammarParser.integerExpr_return integerExpr239 =null;

        GrammarParser.doubleExpr_return doubleExpr240 =null;

        GrammarParser.doubleExpr_return doubleExpr242 =null;

        GrammarParser.stringExpr_return stringExpr243 =null;

        GrammarParser.stringExpr_return stringExpr245 =null;

        GrammarParser.anyUriExpr_return anyUriExpr246 =null;

        GrammarParser.anyUriExpr_return anyUriExpr248 =null;

        GrammarParser.dateExpr_return dateExpr249 =null;

        GrammarParser.dateExpr_return dateExpr251 =null;

        GrammarParser.timeExpr_return timeExpr252 =null;

        GrammarParser.timeExpr_return timeExpr254 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr255 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr257 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr258 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr260 =null;

        GrammarParser.x500NameExpr_return x500NameExpr261 =null;

        GrammarParser.x500NameExpr_return x500NameExpr263 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr264 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr266 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr267 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr269 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr270 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr272 =null;


        Object set238_tree=null;
        Object set241_tree=null;
        Object set244_tree=null;
        Object set247_tree=null;
        Object set250_tree=null;
        Object set253_tree=null;
        Object set256_tree=null;
        Object set259_tree=null;
        Object set262_tree=null;
        Object set265_tree=null;
        Object set268_tree=null;
        Object set271_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr )
            int alt16=12;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            try {
                isCyclicDecision = true;
                alt16 = dfa16.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(209,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1452);
                    integerExpr237=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr237.getTree());
                    dbg.location(209,50);
                    set238=(Token)input.LT(1);

                    set238=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set238)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(209,52);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1477);
                    integerExpr239=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr239.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(210,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1482);
                    doubleExpr240=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr240.getTree());
                    dbg.location(210,49);
                    set241=(Token)input.LT(1);

                    set241=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set241)
                        , root_0);
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
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1507);
                    doubleExpr242=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr242.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(211,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1512);
                    stringExpr243=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr243.getTree());
                    dbg.location(211,49);
                    set244=(Token)input.LT(1);

                    set244=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set244)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(211,51);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1537);
                    stringExpr245=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr245.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(212,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1542);
                    anyUriExpr246=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr246.getTree());
                    dbg.location(212,49);
                    set247=(Token)input.LT(1);

                    set247=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set247)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(212,51);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1567);
                    anyUriExpr248=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr248.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1572);
                    dateExpr249=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr249.getTree());
                    dbg.location(213,47);
                    set250=(Token)input.LT(1);

                    set250=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set250)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(213,49);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1597);
                    dateExpr251=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr251.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(214,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1602);
                    timeExpr252=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr252.getTree());
                    dbg.location(214,47);
                    set253=(Token)input.LT(1);

                    set253=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set253)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(214,49);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1627);
                    timeExpr254=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr254.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1632);
                    dateTimeExpr255=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr255.getTree());
                    dbg.location(215,51);
                    set256=(Token)input.LT(1);

                    set256=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set256)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(215,53);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1657);
                    dateTimeExpr257=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr257.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(216,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1662);
                    yearMonthDurationExpr258=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr258.getTree());
                    dbg.location(216,60);
                    set259=(Token)input.LT(1);

                    set259=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set259)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(216,62);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1687);
                    yearMonthDurationExpr260=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr260.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(217,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1692);
                    x500NameExpr261=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr261.getTree());
                    dbg.location(217,51);
                    set262=(Token)input.LT(1);

                    set262=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set262)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(217,53);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1717);
                    x500NameExpr263=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr263.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1722);
                    rfc822NameExpr264=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr264.getTree());
                    dbg.location(218,53);
                    set265=(Token)input.LT(1);

                    set265=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set265)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(218,55);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1747);
                    rfc822NameExpr266=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr266.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:219:4: dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(219,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1752);
                    dayTimeDurationExpr267=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr267.getTree());
                    dbg.location(219,58);
                    set268=(Token)input.LT(1);

                    set268=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set268)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(219,60);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1777);
                    dayTimeDurationExpr269=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr269.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:220:4: base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(220,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1782);
                    base64BinaryExpr270=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr270.getTree());
                    dbg.location(220,55);
                    set271=(Token)input.LT(1);

                    set271=(Token)input.LT(1);

                    if ( (input.LA(1) >= 84 && input.LA(1) <= 88) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set271)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(220,57);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1807);
                    base64BinaryExpr272=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr272.getTree());

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
        dbg.location(221, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:1: regexOp : ( integerExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal274=null;
        Token REGEXMATCH_TOK275=null;
        Token LPAREN276=null;
        Token RPAREN278=null;
        Token char_literal280=null;
        Token REGEXMATCH_TOK281=null;
        Token LPAREN282=null;
        Token RPAREN284=null;
        Token char_literal286=null;
        Token REGEXMATCH_TOK287=null;
        Token LPAREN288=null;
        Token RPAREN290=null;
        Token char_literal292=null;
        Token REGEXMATCH_TOK293=null;
        Token LPAREN294=null;
        Token RPAREN296=null;
        Token char_literal298=null;
        Token REGEXMATCH_TOK299=null;
        Token LPAREN300=null;
        Token RPAREN302=null;
        Token char_literal304=null;
        Token REGEXMATCH_TOK305=null;
        Token LPAREN306=null;
        Token RPAREN308=null;
        Token char_literal310=null;
        Token REGEXMATCH_TOK311=null;
        Token LPAREN312=null;
        Token RPAREN314=null;
        Token char_literal316=null;
        Token REGEXMATCH_TOK317=null;
        Token LPAREN318=null;
        Token RPAREN320=null;
        Token char_literal322=null;
        Token REGEXMATCH_TOK323=null;
        Token LPAREN324=null;
        Token RPAREN326=null;
        Token char_literal328=null;
        Token REGEXMATCH_TOK329=null;
        Token LPAREN330=null;
        Token RPAREN332=null;
        Token char_literal334=null;
        Token REGEXMATCH_TOK335=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        Token char_literal340=null;
        Token REGEXMATCH_TOK341=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
        GrammarParser.integerExpr_return integerExpr273 =null;

        GrammarParser.integerExpr_return integerExpr277 =null;

        GrammarParser.doubleExpr_return doubleExpr279 =null;

        GrammarParser.doubleExpr_return doubleExpr283 =null;

        GrammarParser.stringExpr_return stringExpr285 =null;

        GrammarParser.stringExpr_return stringExpr289 =null;

        GrammarParser.anyUriExpr_return anyUriExpr291 =null;

        GrammarParser.anyUriExpr_return anyUriExpr295 =null;

        GrammarParser.dateExpr_return dateExpr297 =null;

        GrammarParser.dateExpr_return dateExpr301 =null;

        GrammarParser.timeExpr_return timeExpr303 =null;

        GrammarParser.timeExpr_return timeExpr307 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr309 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr313 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr315 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr319 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr321 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr325 =null;

        GrammarParser.x500NameExpr_return x500NameExpr327 =null;

        GrammarParser.x500NameExpr_return x500NameExpr331 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr333 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr337 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr339 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr343 =null;


        Object char_literal274_tree=null;
        Object REGEXMATCH_TOK275_tree=null;
        Object LPAREN276_tree=null;
        Object RPAREN278_tree=null;
        Object char_literal280_tree=null;
        Object REGEXMATCH_TOK281_tree=null;
        Object LPAREN282_tree=null;
        Object RPAREN284_tree=null;
        Object char_literal286_tree=null;
        Object REGEXMATCH_TOK287_tree=null;
        Object LPAREN288_tree=null;
        Object RPAREN290_tree=null;
        Object char_literal292_tree=null;
        Object REGEXMATCH_TOK293_tree=null;
        Object LPAREN294_tree=null;
        Object RPAREN296_tree=null;
        Object char_literal298_tree=null;
        Object REGEXMATCH_TOK299_tree=null;
        Object LPAREN300_tree=null;
        Object RPAREN302_tree=null;
        Object char_literal304_tree=null;
        Object REGEXMATCH_TOK305_tree=null;
        Object LPAREN306_tree=null;
        Object RPAREN308_tree=null;
        Object char_literal310_tree=null;
        Object REGEXMATCH_TOK311_tree=null;
        Object LPAREN312_tree=null;
        Object RPAREN314_tree=null;
        Object char_literal316_tree=null;
        Object REGEXMATCH_TOK317_tree=null;
        Object LPAREN318_tree=null;
        Object RPAREN320_tree=null;
        Object char_literal322_tree=null;
        Object REGEXMATCH_TOK323_tree=null;
        Object LPAREN324_tree=null;
        Object RPAREN326_tree=null;
        Object char_literal328_tree=null;
        Object REGEXMATCH_TOK329_tree=null;
        Object LPAREN330_tree=null;
        Object RPAREN332_tree=null;
        Object char_literal334_tree=null;
        Object REGEXMATCH_TOK335_tree=null;
        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
        Object char_literal340_tree=null;
        Object REGEXMATCH_TOK341_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:2: ( integerExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
            int alt17=12;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            try {
                isCyclicDecision = true;
                alt17 = dfa17.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: integerExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(224,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1818);
                    integerExpr273=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr273.getTree());
                    dbg.location(224,19);
                    char_literal274=(Token)match(input,83,FOLLOW_83_in_regexOp1820); if (state.failed) return retval;
                    dbg.location(224,35);
                    REGEXMATCH_TOK275=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK275_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK275)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK275_tree, root_0);
                    }
                    dbg.location(224,43);
                    LPAREN276=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1826); if (state.failed) return retval;
                    dbg.location(224,45);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1829);
                    integerExpr277=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr277.getTree());
                    dbg.location(224,63);
                    RPAREN278=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1831); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:4: doubleExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(225,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1837);
                    doubleExpr279=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr279.getTree());
                    dbg.location(225,18);
                    char_literal280=(Token)match(input,83,FOLLOW_83_in_regexOp1839); if (state.failed) return retval;
                    dbg.location(225,34);
                    REGEXMATCH_TOK281=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK281_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK281)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK281_tree, root_0);
                    }
                    dbg.location(225,42);
                    LPAREN282=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1845); if (state.failed) return retval;
                    dbg.location(225,44);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1848);
                    doubleExpr283=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr283.getTree());
                    dbg.location(225,61);
                    RPAREN284=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1850); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:4: stringExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(226,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1856);
                    stringExpr285=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr285.getTree());
                    dbg.location(226,18);
                    char_literal286=(Token)match(input,83,FOLLOW_83_in_regexOp1858); if (state.failed) return retval;
                    dbg.location(226,34);
                    REGEXMATCH_TOK287=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK287_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK287)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK287_tree, root_0);
                    }
                    dbg.location(226,42);
                    LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1864); if (state.failed) return retval;
                    dbg.location(226,44);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1867);
                    stringExpr289=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr289.getTree());
                    dbg.location(226,61);
                    RPAREN290=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1869); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: anyUriExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(227,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1875);
                    anyUriExpr291=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr291.getTree());
                    dbg.location(227,18);
                    char_literal292=(Token)match(input,83,FOLLOW_83_in_regexOp1877); if (state.failed) return retval;
                    dbg.location(227,34);
                    REGEXMATCH_TOK293=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK293_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK293)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK293_tree, root_0);
                    }
                    dbg.location(227,42);
                    LPAREN294=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1883); if (state.failed) return retval;
                    dbg.location(227,44);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1886);
                    anyUriExpr295=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr295.getTree());
                    dbg.location(227,61);
                    RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1888); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: dateExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(228,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1894);
                    dateExpr297=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr297.getTree());
                    dbg.location(228,16);
                    char_literal298=(Token)match(input,83,FOLLOW_83_in_regexOp1896); if (state.failed) return retval;
                    dbg.location(228,32);
                    REGEXMATCH_TOK299=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK299_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK299)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK299_tree, root_0);
                    }
                    dbg.location(228,40);
                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1902); if (state.failed) return retval;
                    dbg.location(228,42);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1905);
                    dateExpr301=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr301.getTree());
                    dbg.location(228,57);
                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1907); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: timeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(229,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1913);
                    timeExpr303=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr303.getTree());
                    dbg.location(229,16);
                    char_literal304=(Token)match(input,83,FOLLOW_83_in_regexOp1915); if (state.failed) return retval;
                    dbg.location(229,32);
                    REGEXMATCH_TOK305=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK305_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK305)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK305_tree, root_0);
                    }
                    dbg.location(229,40);
                    LPAREN306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1921); if (state.failed) return retval;
                    dbg.location(229,42);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1924);
                    timeExpr307=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr307.getTree());
                    dbg.location(229,57);
                    RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1926); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: dateTimeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(230,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1932);
                    dateTimeExpr309=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr309.getTree());
                    dbg.location(230,20);
                    char_literal310=(Token)match(input,83,FOLLOW_83_in_regexOp1934); if (state.failed) return retval;
                    dbg.location(230,36);
                    REGEXMATCH_TOK311=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK311_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK311)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK311_tree, root_0);
                    }
                    dbg.location(230,44);
                    LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1940); if (state.failed) return retval;
                    dbg.location(230,46);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1943);
                    dateTimeExpr313=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr313.getTree());
                    dbg.location(230,65);
                    RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1945); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: dayTimeDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(231,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1951);
                    dayTimeDurationExpr315=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr315.getTree());
                    dbg.location(231,27);
                    char_literal316=(Token)match(input,83,FOLLOW_83_in_regexOp1953); if (state.failed) return retval;
                    dbg.location(231,43);
                    REGEXMATCH_TOK317=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK317_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK317)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK317_tree, root_0);
                    }
                    dbg.location(231,51);
                    LPAREN318=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1959); if (state.failed) return retval;
                    dbg.location(231,53);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1962);
                    dayTimeDurationExpr319=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr319.getTree());
                    dbg.location(231,79);
                    RPAREN320=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1964); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:4: yearMonthDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(232,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1970);
                    yearMonthDurationExpr321=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr321.getTree());
                    dbg.location(232,29);
                    char_literal322=(Token)match(input,83,FOLLOW_83_in_regexOp1972); if (state.failed) return retval;
                    dbg.location(232,45);
                    REGEXMATCH_TOK323=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK323_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK323)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK323_tree, root_0);
                    }
                    dbg.location(232,53);
                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1978); if (state.failed) return retval;
                    dbg.location(232,55);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1981);
                    yearMonthDurationExpr325=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr325.getTree());
                    dbg.location(232,83);
                    RPAREN326=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1983); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: x500NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1989);
                    x500NameExpr327=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr327.getTree());
                    dbg.location(233,20);
                    char_literal328=(Token)match(input,83,FOLLOW_83_in_regexOp1991); if (state.failed) return retval;
                    dbg.location(233,36);
                    REGEXMATCH_TOK329=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1994); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK329_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK329)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK329_tree, root_0);
                    }
                    dbg.location(233,44);
                    LPAREN330=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1997); if (state.failed) return retval;
                    dbg.location(233,46);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp2000);
                    x500NameExpr331=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr331.getTree());
                    dbg.location(233,65);
                    RPAREN332=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp2002); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: rfc822NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(234,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp2008);
                    rfc822NameExpr333=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr333.getTree());
                    dbg.location(234,22);
                    char_literal334=(Token)match(input,83,FOLLOW_83_in_regexOp2010); if (state.failed) return retval;
                    dbg.location(234,38);
                    REGEXMATCH_TOK335=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK335_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK335)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK335_tree, root_0);
                    }
                    dbg.location(234,46);
                    LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp2016); if (state.failed) return retval;
                    dbg.location(234,48);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp2019);
                    rfc822NameExpr337=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr337.getTree());
                    dbg.location(234,69);
                    RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp2021); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: base64BinaryExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(235,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp2027);
                    base64BinaryExpr339=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr339.getTree());
                    dbg.location(235,24);
                    char_literal340=(Token)match(input,83,FOLLOW_83_in_regexOp2029); if (state.failed) return retval;
                    dbg.location(235,40);
                    REGEXMATCH_TOK341=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp2032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK341_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK341)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK341_tree, root_0);
                    }
                    dbg.location(235,48);
                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp2035); if (state.failed) return retval;
                    dbg.location(235,50);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp2038);
                    base64BinaryExpr343=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr343.getTree());
                    dbg.location(235,73);
                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp2040); if (state.failed) return retval;

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
        dbg.location(236, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:1: bagOp : ( ( booleanBag )=> booleanBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal346=null;
        Token set347=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        Token char_literal352=null;
        Token set353=null;
        Token LPAREN354=null;
        Token RPAREN356=null;
        Token char_literal358=null;
        Token set359=null;
        Token LPAREN360=null;
        Token RPAREN362=null;
        Token char_literal364=null;
        Token set365=null;
        Token LPAREN366=null;
        Token RPAREN368=null;
        Token char_literal370=null;
        Token set371=null;
        Token LPAREN372=null;
        Token RPAREN374=null;
        Token char_literal376=null;
        Token set377=null;
        Token LPAREN378=null;
        Token RPAREN380=null;
        Token char_literal382=null;
        Token set383=null;
        Token LPAREN384=null;
        Token RPAREN386=null;
        Token char_literal388=null;
        Token set389=null;
        Token LPAREN390=null;
        Token RPAREN392=null;
        Token char_literal394=null;
        Token set395=null;
        Token LPAREN396=null;
        Token RPAREN398=null;
        Token char_literal400=null;
        Token set401=null;
        Token LPAREN402=null;
        Token RPAREN404=null;
        Token char_literal406=null;
        Token set407=null;
        Token LPAREN408=null;
        Token RPAREN410=null;
        Token char_literal412=null;
        Token set413=null;
        Token LPAREN414=null;
        Token RPAREN416=null;
        Token char_literal418=null;
        Token set419=null;
        Token LPAREN420=null;
        Token RPAREN422=null;
        Token char_literal424=null;
        Token set425=null;
        Token LPAREN426=null;
        Token RPAREN428=null;
        Token char_literal430=null;
        Token set431=null;
        Token LPAREN432=null;
        Token RPAREN434=null;
        GrammarParser.booleanBag_return booleanBag345 =null;

        GrammarParser.booleanBag_return booleanBag349 =null;

        GrammarParser.integerBag_return integerBag351 =null;

        GrammarParser.integerBag_return integerBag355 =null;

        GrammarParser.doubleBag_return doubleBag357 =null;

        GrammarParser.doubleBag_return doubleBag361 =null;

        GrammarParser.stringBag_return stringBag363 =null;

        GrammarParser.stringBag_return stringBag367 =null;

        GrammarParser.dateBag_return dateBag369 =null;

        GrammarParser.dateBag_return dateBag373 =null;

        GrammarParser.timeBag_return timeBag375 =null;

        GrammarParser.timeBag_return timeBag379 =null;

        GrammarParser.dateTimeBag_return dateTimeBag381 =null;

        GrammarParser.dateTimeBag_return dateTimeBag385 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag387 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag391 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag393 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag397 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag399 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag403 =null;

        GrammarParser.anyUriBag_return anyUriBag405 =null;

        GrammarParser.anyUriBag_return anyUriBag409 =null;

        GrammarParser.x500NameBag_return x500NameBag411 =null;

        GrammarParser.x500NameBag_return x500NameBag415 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag417 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag421 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag423 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag427 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag429 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag433 =null;


        Object char_literal346_tree=null;
        Object set347_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;
        Object char_literal352_tree=null;
        Object set353_tree=null;
        Object LPAREN354_tree=null;
        Object RPAREN356_tree=null;
        Object char_literal358_tree=null;
        Object set359_tree=null;
        Object LPAREN360_tree=null;
        Object RPAREN362_tree=null;
        Object char_literal364_tree=null;
        Object set365_tree=null;
        Object LPAREN366_tree=null;
        Object RPAREN368_tree=null;
        Object char_literal370_tree=null;
        Object set371_tree=null;
        Object LPAREN372_tree=null;
        Object RPAREN374_tree=null;
        Object char_literal376_tree=null;
        Object set377_tree=null;
        Object LPAREN378_tree=null;
        Object RPAREN380_tree=null;
        Object char_literal382_tree=null;
        Object set383_tree=null;
        Object LPAREN384_tree=null;
        Object RPAREN386_tree=null;
        Object char_literal388_tree=null;
        Object set389_tree=null;
        Object LPAREN390_tree=null;
        Object RPAREN392_tree=null;
        Object char_literal394_tree=null;
        Object set395_tree=null;
        Object LPAREN396_tree=null;
        Object RPAREN398_tree=null;
        Object char_literal400_tree=null;
        Object set401_tree=null;
        Object LPAREN402_tree=null;
        Object RPAREN404_tree=null;
        Object char_literal406_tree=null;
        Object set407_tree=null;
        Object LPAREN408_tree=null;
        Object RPAREN410_tree=null;
        Object char_literal412_tree=null;
        Object set413_tree=null;
        Object LPAREN414_tree=null;
        Object RPAREN416_tree=null;
        Object char_literal418_tree=null;
        Object set419_tree=null;
        Object LPAREN420_tree=null;
        Object RPAREN422_tree=null;
        Object char_literal424_tree=null;
        Object set425_tree=null;
        Object LPAREN426_tree=null;
        Object RPAREN428_tree=null;
        Object char_literal430_tree=null;
        Object set431_tree=null;
        Object LPAREN432_tree=null;
        Object RPAREN434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:2: ( ( booleanBag )=> booleanBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !)
            int alt18=15;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOLEAN_TOK) && (synpred3_Grammar())) {
                alt18=1;
            }
            else if ( (LA18_0==INTEGER_TOK) && (synpred4_Grammar())) {
                alt18=2;
            }
            else if ( (LA18_0==BAG_TOK) && (synpred4_Grammar())) {
                alt18=2;
            }
            else if ( (LA18_0==DOUBLE_TOK) && (synpred5_Grammar())) {
                alt18=3;
            }
            else if ( (LA18_0==STRING_TOK) && (synpred6_Grammar())) {
                alt18=4;
            }
            else if ( (LA18_0==ACTION_TOK||LA18_0==ENVIRONMENT_TOK||LA18_0==RESOURCE_TOK||LA18_0==SUBJECT_TOK) && (synpred6_Grammar())) {
                alt18=4;
            }
            else if ( (LA18_0==DATE_TOK) && (synpred7_Grammar())) {
                alt18=5;
            }
            else if ( (LA18_0==TIME_TOK) && (synpred8_Grammar())) {
                alt18=6;
            }
            else if ( (LA18_0==DATETIME_TOK) && (synpred9_Grammar())) {
                alt18=7;
            }
            else if ( (LA18_0==BASE64BINARY_TOK) ) {
                int LA18_10 = input.LA(2);

                if ( (LA18_10==STRING_CONSTANT_LIST) ) {
                    int LA18_17 = input.LA(3);

                    if ( (LA18_17==83) ) {
                        int LA18_18 = input.LA(4);

                        if ( (LA18_18==ATLEASTONEMENBEROF_TOK||LA18_18==SETEQUALS_TOK||LA18_18==SUBSET_TOK) ) {
                            int LA18_19 = input.LA(5);

                            if ( (LA18_19==LPAREN) ) {
                                int LA18_20 = input.LA(6);

                                if ( (LA18_20==BASE64BINARY_TOK) ) {
                                    int LA18_21 = input.LA(7);

                                    if ( (LA18_21==STRING_CONSTANT_LIST) ) {
                                        int LA18_22 = input.LA(8);

                                        if ( (LA18_22==RPAREN) ) {
                                            int LA18_23 = input.LA(9);

                                            if ( (synpred10_Grammar()) ) {
                                                alt18=8;
                                            }
                                            else if ( (synpred17_Grammar()) ) {
                                                alt18=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 18, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 18, 22, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 18, 21, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 18, 20, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 18, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA18_0==DAYTIMEDURATION_TOK) && (synpred11_Grammar())) {
                alt18=9;
            }
            else if ( (LA18_0==YEARMONTHDURATION_TOK) && (synpred12_Grammar())) {
                alt18=10;
            }
            else if ( (LA18_0==ANYURI_TOK) && (synpred13_Grammar())) {
                alt18=11;
            }
            else if ( (LA18_0==X500NAME_TOK) && (synpred14_Grammar())) {
                alt18=12;
            }
            else if ( (LA18_0==RFC822NAME_TOK) && (synpred15_Grammar())) {
                alt18=13;
            }
            else if ( (LA18_0==HEXBINARY_TOK) && (synpred16_Grammar())) {
                alt18=14;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( booleanBag )=> booleanBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(239,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp2058);
                    booleanBag345=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag345.getTree());
                    dbg.location(239,34);
                    char_literal346=(Token)match(input,83,FOLLOW_83_in_bagOp2060); if (state.failed) return retval;
                    dbg.location(239,91);
                    set347=(Token)input.LT(1);

                    set347=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set347)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(239,99);
                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2078); if (state.failed) return retval;
                    dbg.location(239,101);
                    pushFollow(FOLLOW_booleanBag_in_bagOp2081);
                    booleanBag349=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag349.getTree());
                    dbg.location(239,118);
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2083); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:4: ( integerBag )=> integerBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(240,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp2095);
                    integerBag351=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag351.getTree());
                    dbg.location(240,34);
                    char_literal352=(Token)match(input,83,FOLLOW_83_in_bagOp2097); if (state.failed) return retval;
                    dbg.location(240,91);
                    set353=(Token)input.LT(1);

                    set353=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set353)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(240,99);
                    LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2115); if (state.failed) return retval;
                    dbg.location(240,101);
                    pushFollow(FOLLOW_integerBag_in_bagOp2118);
                    integerBag355=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag355.getTree());
                    dbg.location(240,118);
                    RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2120); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: ( doubleBag )=> doubleBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(241,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp2132);
                    doubleBag357=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag357.getTree());
                    dbg.location(241,32);
                    char_literal358=(Token)match(input,83,FOLLOW_83_in_bagOp2134); if (state.failed) return retval;
                    dbg.location(241,89);
                    set359=(Token)input.LT(1);

                    set359=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set359)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(241,97);
                    LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2152); if (state.failed) return retval;
                    dbg.location(241,99);
                    pushFollow(FOLLOW_doubleBag_in_bagOp2155);
                    doubleBag361=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag361.getTree());
                    dbg.location(241,115);
                    RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2157); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( stringBag )=> stringBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(242,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp2170);
                    stringBag363=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag363.getTree());
                    dbg.location(242,33);
                    char_literal364=(Token)match(input,83,FOLLOW_83_in_bagOp2172); if (state.failed) return retval;
                    dbg.location(242,90);
                    set365=(Token)input.LT(1);

                    set365=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set365)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(242,98);
                    LPAREN366=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2190); if (state.failed) return retval;
                    dbg.location(242,100);
                    pushFollow(FOLLOW_stringBag_in_bagOp2193);
                    stringBag367=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag367.getTree());
                    dbg.location(242,116);
                    RPAREN368=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2195); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: ( dateBag )=> dateBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(243,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp2208);
                    dateBag369=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag369.getTree());
                    dbg.location(243,29);
                    char_literal370=(Token)match(input,83,FOLLOW_83_in_bagOp2210); if (state.failed) return retval;
                    dbg.location(243,86);
                    set371=(Token)input.LT(1);

                    set371=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set371)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(243,94);
                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2228); if (state.failed) return retval;
                    dbg.location(243,96);
                    pushFollow(FOLLOW_dateBag_in_bagOp2231);
                    dateBag373=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag373.getTree());
                    dbg.location(243,110);
                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2233); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:4: ( timeBag )=> timeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(244,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp2246);
                    timeBag375=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag375.getTree());
                    dbg.location(244,29);
                    char_literal376=(Token)match(input,83,FOLLOW_83_in_bagOp2248); if (state.failed) return retval;
                    dbg.location(244,86);
                    set377=(Token)input.LT(1);

                    set377=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set377)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(244,94);
                    LPAREN378=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2266); if (state.failed) return retval;
                    dbg.location(244,96);
                    pushFollow(FOLLOW_timeBag_in_bagOp2269);
                    timeBag379=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag379.getTree());
                    dbg.location(244,110);
                    RPAREN380=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2271); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:4: ( dateTimeBag )=> dateTimeBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(245,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2284);
                    dateTimeBag381=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag381.getTree());
                    dbg.location(245,37);
                    char_literal382=(Token)match(input,83,FOLLOW_83_in_bagOp2286); if (state.failed) return retval;
                    dbg.location(245,94);
                    set383=(Token)input.LT(1);

                    set383=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set383)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(245,102);
                    LPAREN384=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2304); if (state.failed) return retval;
                    dbg.location(245,104);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2307);
                    dateTimeBag385=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag385.getTree());
                    dbg.location(245,122);
                    RPAREN386=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2309); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:4: ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(246,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2322);
                    base64BinaryBag387=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag387.getTree());
                    dbg.location(246,45);
                    char_literal388=(Token)match(input,83,FOLLOW_83_in_bagOp2324); if (state.failed) return retval;
                    dbg.location(246,102);
                    set389=(Token)input.LT(1);

                    set389=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set389)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(246,110);
                    LPAREN390=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2342); if (state.failed) return retval;
                    dbg.location(246,112);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2345);
                    base64BinaryBag391=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag391.getTree());
                    dbg.location(246,134);
                    RPAREN392=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2347); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(247,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2360);
                    dayTimeDurationBag393=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag393.getTree());
                    dbg.location(247,51);
                    char_literal394=(Token)match(input,83,FOLLOW_83_in_bagOp2362); if (state.failed) return retval;
                    dbg.location(247,108);
                    set395=(Token)input.LT(1);

                    set395=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set395)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(247,116);
                    LPAREN396=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2380); if (state.failed) return retval;
                    dbg.location(247,118);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2383);
                    dayTimeDurationBag397=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag397.getTree());
                    dbg.location(247,143);
                    RPAREN398=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2385); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(248,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2398);
                    yearMonthDurationBag399=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag399.getTree());
                    dbg.location(248,55);
                    char_literal400=(Token)match(input,83,FOLLOW_83_in_bagOp2400); if (state.failed) return retval;
                    dbg.location(248,112);
                    set401=(Token)input.LT(1);

                    set401=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set401)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(248,120);
                    LPAREN402=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2418); if (state.failed) return retval;
                    dbg.location(248,122);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2421);
                    yearMonthDurationBag403=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag403.getTree());
                    dbg.location(248,149);
                    RPAREN404=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2423); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: ( anyUriBag )=> anyUriBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(249,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2436);
                    anyUriBag405=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag405.getTree());
                    dbg.location(249,33);
                    char_literal406=(Token)match(input,83,FOLLOW_83_in_bagOp2438); if (state.failed) return retval;
                    dbg.location(249,90);
                    set407=(Token)input.LT(1);

                    set407=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set407)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(249,98);
                    LPAREN408=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2456); if (state.failed) return retval;
                    dbg.location(249,100);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2459);
                    anyUriBag409=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag409.getTree());
                    dbg.location(249,116);
                    RPAREN410=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2461); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:4: ( x500NameBag )=> x500NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(250,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2474);
                    x500NameBag411=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag411.getTree());
                    dbg.location(250,37);
                    char_literal412=(Token)match(input,83,FOLLOW_83_in_bagOp2476); if (state.failed) return retval;
                    dbg.location(250,94);
                    set413=(Token)input.LT(1);

                    set413=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set413)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(250,102);
                    LPAREN414=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2494); if (state.failed) return retval;
                    dbg.location(250,104);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2497);
                    x500NameBag415=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag415.getTree());
                    dbg.location(250,122);
                    RPAREN416=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2499); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:4: ( rfc822NameBag )=> rfc822NameBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(251,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2512);
                    rfc822NameBag417=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag417.getTree());
                    dbg.location(251,41);
                    char_literal418=(Token)match(input,83,FOLLOW_83_in_bagOp2514); if (state.failed) return retval;
                    dbg.location(251,98);
                    set419=(Token)input.LT(1);

                    set419=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set419)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(251,106);
                    LPAREN420=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2532); if (state.failed) return retval;
                    dbg.location(251,108);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2535);
                    rfc822NameBag421=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag421.getTree());
                    dbg.location(251,128);
                    RPAREN422=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2537); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:4: ( hexBinaryBag )=> hexBinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(252,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2550);
                    hexBinaryBag423=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag423.getTree());
                    dbg.location(252,39);
                    char_literal424=(Token)match(input,83,FOLLOW_83_in_bagOp2552); if (state.failed) return retval;
                    dbg.location(252,96);
                    set425=(Token)input.LT(1);

                    set425=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set425)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(252,104);
                    LPAREN426=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2570); if (state.failed) return retval;
                    dbg.location(252,106);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2573);
                    hexBinaryBag427=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag427.getTree());
                    dbg.location(252,125);
                    RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2575); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( base64BinaryBag )=> base64BinaryBag '.' ! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(253,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2587);
                    base64BinaryBag429=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag429.getTree());
                    dbg.location(253,44);
                    char_literal430=(Token)match(input,83,FOLLOW_83_in_bagOp2589); if (state.failed) return retval;
                    dbg.location(253,101);
                    set431=(Token)input.LT(1);

                    set431=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set431)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(253,109);
                    LPAREN432=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2607); if (state.failed) return retval;
                    dbg.location(253,111);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2610);
                    base64BinaryBag433=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag433.getTree());
                    dbg.location(253,133);
                    RPAREN434=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2612); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:1: integerExpr : ( INTEGER_CONSTANT | stringExpr '.' ! ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' ! SIZE_TOK LPAREN ! RPAREN !);
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT435=null;
        Token char_literal437=null;
        Token set438=null;
        Token LPAREN439=null;
        Token RPAREN440=null;
        Token char_literal442=null;
        Token SIZE_TOK443=null;
        Token LPAREN444=null;
        Token RPAREN445=null;
        GrammarParser.stringExpr_return stringExpr436 =null;

        GrammarParser.anyBag_return anyBag441 =null;


        Object INTEGER_CONSTANT435_tree=null;
        Object char_literal437_tree=null;
        Object set438_tree=null;
        Object LPAREN439_tree=null;
        Object RPAREN440_tree=null;
        Object char_literal442_tree=null;
        Object SIZE_TOK443_tree=null;
        Object LPAREN444_tree=null;
        Object RPAREN445_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:2: ( INTEGER_CONSTANT | stringExpr '.' ! ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' ! SIZE_TOK LPAREN ! RPAREN !)
            int alt19=3;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            switch ( input.LA(1) ) {
            case INTEGER_CONSTANT:
                {
                alt19=1;
                }
                break;
            case STRING_CONSTANT:
                {
                alt19=2;
                }
                break;
            case STRING_TOK:
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3==STRING_CONSTANT_LIST) ) {
                    int LA19_6 = input.LA(3);

                    if ( (LA19_6==83) ) {
                        int LA19_8 = input.LA(4);

                        if ( (LA19_8==ONEANDONLY_TOK) ) {
                            alt19=2;
                        }
                        else if ( (LA19_8==SIZE_TOK) ) {
                            alt19=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 8, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 6, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case SUBJECT_TOK:
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4==83) ) {
                    int LA19_7 = input.LA(3);

                    if ( (LA19_7==LOWERCASEIDENTIFIER) ) {
                        int LA19_9 = input.LA(4);

                        if ( (LA19_9==83) ) {
                            int LA19_8 = input.LA(5);

                            if ( (LA19_8==ONEANDONLY_TOK) ) {
                                alt19=2;
                            }
                            else if ( (LA19_8==SIZE_TOK) ) {
                                alt19=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 8, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 9, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ANYURI_TOK:
            case BAG_TOK:
            case BASE64BINARY_TOK:
            case BOOLEAN_TOK:
            case DATETIME_TOK:
            case DATE_TOK:
            case DAYTIMEDURATION_TOK:
            case DOUBLE_TOK:
            case HEXBINARY_TOK:
            case INTEGER_TOK:
            case RFC822NAME_TOK:
            case TIME_TOK:
            case X500NAME_TOK:
            case YEARMONTHDURATION_TOK:
                {
                alt19=3;
                }
                break;
            default:
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:4: INTEGER_CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(257,4);
                    INTEGER_CONSTANT435=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT435_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT435)
                    ;
                    adaptor.addChild(root_0, INTEGER_CONSTANT435_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:4: stringExpr '.' ! ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(258,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2629);
                    stringExpr436=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr436.getTree());
                    dbg.location(258,18);
                    char_literal437=(Token)match(input,83,FOLLOW_83_in_integerExpr2631); if (state.failed) return retval;
                    dbg.location(258,51);
                    set438=(Token)input.LT(1);

                    set438=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set438)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(258,59);
                    LPAREN439=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2645); if (state.failed) return retval;
                    dbg.location(258,67);
                    RPAREN440=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2648); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:4: anyBag '.' ! SIZE_TOK LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(259,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2654);
                    anyBag441=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag441.getTree());
                    dbg.location(259,14);
                    char_literal442=(Token)match(input,83,FOLLOW_83_in_integerExpr2656); if (state.failed) return retval;
                    dbg.location(259,16);
                    SIZE_TOK443=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK443_tree = 
                    (Object)adaptor.create(SIZE_TOK443)
                    ;
                    adaptor.addChild(root_0, SIZE_TOK443_tree);
                    }
                    dbg.location(259,31);
                    LPAREN444=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2661); if (state.failed) return retval;
                    dbg.location(259,39);
                    RPAREN445=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2664); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:1: integerBag : ( INTEGER_TOK ^ STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ! ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK446=null;
        Token STRING_CONSTANT_LIST447=null;
        Token BAG_TOK448=null;
        Token LPAREN449=null;
        Token char_literal451=null;
        Token RPAREN453=null;
        Token char_literal454=null;
        Token set455=null;
        Token LPAREN456=null;
        Token RPAREN458=null;
        GrammarParser.integerExpr_return integerExpr450 =null;

        GrammarParser.integerExpr_return integerExpr452 =null;

        GrammarParser.integerBag_return integerBag457 =null;


        Object INTEGER_TOK446_tree=null;
        Object STRING_CONSTANT_LIST447_tree=null;
        Object BAG_TOK448_tree=null;
        Object LPAREN449_tree=null;
        Object char_literal451_tree=null;
        Object RPAREN453_tree=null;
        Object char_literal454_tree=null;
        Object set455_tree=null;
        Object LPAREN456_tree=null;
        Object RPAREN458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:2: ( ( INTEGER_TOK ^ STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ! ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:4: ( INTEGER_TOK ^ STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ! ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(265,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:4: ( INTEGER_TOK ^ STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !)
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==INTEGER_TOK) ) {
                alt21=1;
            }
            else if ( (LA21_0==BAG_TOK) ) {
                alt21=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:5: INTEGER_TOK ^ STRING_CONSTANT_LIST
                    {
                    dbg.location(265,16);
                    INTEGER_TOK446=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2679); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK446_tree = 
                    (Object)adaptor.create(INTEGER_TOK446)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(INTEGER_TOK446_tree, root_0);
                    }
                    dbg.location(265,18);
                    STRING_CONSTANT_LIST447=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2682); if (state.failed) return retval;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:41: BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !
                    {
                    dbg.location(265,48);
                    BAG_TOK448=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK448_tree = 
                    (Object)adaptor.create(BAG_TOK448)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BAG_TOK448_tree, root_0);
                    }
                    dbg.location(265,56);
                    LPAREN449=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2689); if (state.failed) return retval;
                    dbg.location(265,58);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2692);
                    integerExpr450=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr450.getTree());
                    dbg.location(265,70);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:70: ( ',' ! integerExpr )+
                    int cnt20=0;
                    try { dbg.enterSubRule(20);

                    loop20:
                    do {
                        int alt20=2;
                        try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==82) ) {
                            alt20=1;
                        }


                        } finally {dbg.exitDecision(20);}

                        switch (alt20) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:72: ',' ! integerExpr
                    	    {
                    	    dbg.location(265,75);
                    	    char_literal451=(Token)match(input,82,FOLLOW_82_in_integerBag2696); if (state.failed) return retval;
                    	    dbg.location(265,77);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2699);
                    	    integerExpr452=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr452.getTree());

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

                    dbg.location(265,97);
                    RPAREN453=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2703); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(265,100);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:100: ( '.' ! ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==83) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==INTERSECTION_TOK||LA22_1==UNION_TOK) ) {
                        alt22=1;
                    }


                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:101: '.' ! ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !
            	    {
            	    dbg.location(265,104);
            	    char_literal454=(Token)match(input,83,FOLLOW_83_in_integerBag2708); if (state.failed) return retval;
            	    dbg.location(265,138);
            	    set455=(Token)input.LT(1);

            	    set455=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set455)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(265,146);
            	    LPAREN456=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2722); if (state.failed) return retval;
            	    dbg.location(265,148);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2725);
            	    integerBag457=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag457.getTree());
            	    dbg.location(265,165);
            	    RPAREN458=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2727); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


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
        dbg.location(266, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:1: doubleExpr : ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !);
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT459=null;
        Token DOUBLE_TOK460=null;
        Token LPAREN461=null;
        Token RPAREN463=null;
        GrammarParser.stringExpr_return stringExpr462 =null;


        Object DOUBLE_CONSTANT459_tree=null;
        Object DOUBLE_TOK460_tree=null;
        Object LPAREN461_tree=null;
        Object RPAREN463_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(268, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:2: ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !)
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==DOUBLE_CONSTANT) ) {
                alt23=1;
            }
            else if ( (LA23_0==DOUBLE_TOK) ) {
                alt23=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:4: DOUBLE_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(269,19);
                    DOUBLE_CONSTANT459=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT459_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT459)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_CONSTANT459_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:4: DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(270,14);
                    DOUBLE_TOK460=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK460_tree = 
                    (Object)adaptor.create(DOUBLE_TOK460)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK460_tree, root_0);
                    }
                    dbg.location(270,22);
                    LPAREN461=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doubleExpr2750); if (state.failed) return retval;
                    dbg.location(270,24);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2753);
                    stringExpr462=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr462.getTree());
                    dbg.location(270,41);
                    RPAREN463=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doubleExpr2755); if (state.failed) return retval;

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
        dbg.location(273, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:1: doubleBag : DOUBLE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK464=null;
        Token STRING_CONSTANT_LIST465=null;

        Object DOUBLE_TOK464_tree=null;
        Object STRING_CONSTANT_LIST465_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:2: ( DOUBLE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:4: DOUBLE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(275,14);
            DOUBLE_TOK464=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2768); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK464_tree = 
            (Object)adaptor.create(DOUBLE_TOK464)
            ;
            root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK464_tree, root_0);
            }
            dbg.location(275,16);
            STRING_CONSTANT_LIST465=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2771); if (state.failed) return retval;
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
        dbg.location(278, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:1: stringExpr : ( STRING_CONSTANT ^| stringBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) ^ LPAREN ! RPAREN !)* ;
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT466=null;
        Token char_literal468=null;
        Token ONEANDONLY_TOK469=null;
        Token LPAREN470=null;
        Token RPAREN471=null;
        Token char_literal472=null;
        Token set473=null;
        Token LPAREN474=null;
        Token RPAREN475=null;
        GrammarParser.stringBag_return stringBag467 =null;


        Object STRING_CONSTANT466_tree=null;
        Object char_literal468_tree=null;
        Object ONEANDONLY_TOK469_tree=null;
        Object LPAREN470_tree=null;
        Object RPAREN471_tree=null;
        Object char_literal472_tree=null;
        Object set473_tree=null;
        Object LPAREN474_tree=null;
        Object RPAREN475_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:2: ( ( STRING_CONSTANT ^| stringBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) ^ LPAREN ! RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:4: ( STRING_CONSTANT ^| stringBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) ^ LPAREN ! RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(281,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:4: ( STRING_CONSTANT ^| stringBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==STRING_CONSTANT) ) {
                alt24=1;
            }
            else if ( (LA24_0==ACTION_TOK||LA24_0==ENVIRONMENT_TOK||LA24_0==RESOURCE_TOK||(LA24_0 >= STRING_TOK && LA24_0 <= SUBJECT_TOK)) ) {
                alt24=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:5: STRING_CONSTANT ^
                    {
                    dbg.location(281,20);
                    STRING_CONSTANT466=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT466_tree = 
                    (Object)adaptor.create(STRING_CONSTANT466)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_CONSTANT466_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:5: stringBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    dbg.location(282,5);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2792);
                    stringBag467=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag467.getTree());
                    dbg.location(282,18);
                    char_literal468=(Token)match(input,83,FOLLOW_83_in_stringExpr2794); if (state.failed) return retval;
                    dbg.location(282,34);
                    ONEANDONLY_TOK469=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK469_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK469)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK469_tree, root_0);
                    }
                    dbg.location(282,42);
                    LPAREN470=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2800); if (state.failed) return retval;
                    dbg.location(282,50);
                    RPAREN471=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2803); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(283,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:3: ( '.' ! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) ^ LPAREN ! RPAREN !)*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==83) ) {
                    int LA25_2 = input.LA(2);

                    if ( ((LA25_2 >= NORMALIZESPACE_TOK && LA25_2 <= NORMALIZETOLOWERCASE_TOK)||LA25_2==REQUIRED_TOK) ) {
                        alt25=1;
                    }


                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:4: '.' ! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) ^ LPAREN ! RPAREN !
            	    {
            	    dbg.location(283,7);
            	    char_literal472=(Token)match(input,83,FOLLOW_83_in_stringExpr2810); if (state.failed) return retval;
            	    dbg.location(283,72);
            	    set473=(Token)input.LT(1);

            	    set473=(Token)input.LT(1);

            	    if ( (input.LA(1) >= NORMALIZESPACE_TOK && input.LA(1) <= NORMALIZETOLOWERCASE_TOK)||input.LA(1)==REQUIRED_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set473)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(283,80);
            	    LPAREN474=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2827); if (state.failed) return retval;
            	    dbg.location(283,88);
            	    RPAREN475=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2830); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:1: stringBag : ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeSelector ^);
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK476=null;
        Token STRING_CONSTANT_LIST477=null;
        GrammarParser.attributeSelector_return attributeSelector478 =null;


        Object STRING_TOK476_tree=null;
        Object STRING_CONSTANT_LIST477_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:2: ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeSelector ^)
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==STRING_TOK) ) {
                alt26=1;
            }
            else if ( (LA26_0==ACTION_TOK||LA26_0==ENVIRONMENT_TOK||LA26_0==RESOURCE_TOK||LA26_0==SUBJECT_TOK) ) {
                alt26=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: STRING_TOK ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(287,14);
                    STRING_TOK476=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK476_tree = 
                    (Object)adaptor.create(STRING_TOK476)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_TOK476_tree, root_0);
                    }
                    dbg.location(287,16);
                    STRING_CONSTANT_LIST477=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST477_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST477)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST477_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:4: attributeSelector ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(288,21);
                    pushFollow(FOLLOW_attributeSelector_in_stringBag2852);
                    attributeSelector478=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(attributeSelector478.getTree(), root_0);

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
        dbg.location(290, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringBag"


    public static class anyUriExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:1: anyUriExpr : ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' ! URI_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK479=null;
        Token LPAREN480=null;
        Token RPAREN482=null;
        Token char_literal484=null;
        Token ONEANDONLY_TOK485=null;
        Token LPAREN486=null;
        Token RPAREN487=null;
        Token char_literal489=null;
        Token URI_TOK490=null;
        Token LPAREN491=null;
        Token RPAREN492=null;
        GrammarParser.stringExpr_return stringExpr481 =null;

        GrammarParser.anyUriBag_return anyUriBag483 =null;

        GrammarParser.stringExpr_return stringExpr488 =null;


        Object ANYURI_TOK479_tree=null;
        Object LPAREN480_tree=null;
        Object RPAREN482_tree=null;
        Object char_literal484_tree=null;
        Object ONEANDONLY_TOK485_tree=null;
        Object LPAREN486_tree=null;
        Object RPAREN487_tree=null;
        Object char_literal489_tree=null;
        Object URI_TOK490_tree=null;
        Object LPAREN491_tree=null;
        Object RPAREN492_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(293, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:2: ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' ! URI_TOK ^ LPAREN ! RPAREN !)
            int alt27=3;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==ANYURI_TOK) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==LPAREN) ) {
                    alt27=1;
                }
                else if ( (LA27_1==STRING_CONSTANT_LIST) ) {
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
            else if ( (LA27_0==ACTION_TOK||LA27_0==ENVIRONMENT_TOK||LA27_0==RESOURCE_TOK||LA27_0==STRING_CONSTANT||(LA27_0 >= STRING_TOK && LA27_0 <= SUBJECT_TOK)) ) {
                alt27=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:4: ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(294,14);
                    ANYURI_TOK479=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK479_tree = 
                    (Object)adaptor.create(ANYURI_TOK479)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK479_tree, root_0);
                    }
                    dbg.location(294,22);
                    LPAREN480=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2869); if (state.failed) return retval;
                    dbg.location(294,24);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2872);
                    stringExpr481=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr481.getTree());
                    dbg.location(294,41);
                    RPAREN482=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2874); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:4: anyUriBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(295,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2880);
                    anyUriBag483=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag483.getTree());
                    dbg.location(295,17);
                    char_literal484=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2882); if (state.failed) return retval;
                    dbg.location(295,33);
                    ONEANDONLY_TOK485=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK485_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK485)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK485_tree, root_0);
                    }
                    dbg.location(295,41);
                    LPAREN486=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2888); if (state.failed) return retval;
                    dbg.location(295,49);
                    RPAREN487=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2891); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:4: stringExpr '.' ! URI_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(296,4);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2897);
                    stringExpr488=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr488.getTree());
                    dbg.location(296,18);
                    char_literal489=(Token)match(input,83,FOLLOW_83_in_anyUriExpr2899); if (state.failed) return retval;
                    dbg.location(296,27);
                    URI_TOK490=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK490_tree = 
                    (Object)adaptor.create(URI_TOK490)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(URI_TOK490_tree, root_0);
                    }
                    dbg.location(296,35);
                    LPAREN491=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2905); if (state.failed) return retval;
                    dbg.location(296,43);
                    RPAREN492=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2908); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:301:1: anyUriBag : ANYURI_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK493=null;
        Token STRING_CONSTANT_LIST494=null;

        Object ANYURI_TOK493_tree=null;
        Object STRING_CONSTANT_LIST494_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:2: ( ANYURI_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:4: ANYURI_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(302,14);
            ANYURI_TOK493=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK493_tree = 
            (Object)adaptor.create(ANYURI_TOK493)
            ;
            root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK493_tree, root_0);
            }
            dbg.location(302,16);
            STRING_CONSTANT_LIST494=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST494_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST494)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST494_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:1: dateExpr : ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK495=null;
        Token LPAREN496=null;
        Token RPAREN498=null;
        Token char_literal500=null;
        Token ONEANDONLY_TOK501=null;
        Token LPAREN502=null;
        Token RPAREN503=null;
        GrammarParser.stringExpr_return stringExpr497 =null;

        GrammarParser.dateBag_return dateBag499 =null;


        Object DATE_TOK495_tree=null;
        Object LPAREN496_tree=null;
        Object RPAREN498_tree=null;
        Object char_literal500_tree=null;
        Object ONEANDONLY_TOK501_tree=null;
        Object LPAREN502_tree=null;
        Object RPAREN503_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(306, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:2: ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==DATE_TOK) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPAREN) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:4: DATE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(307,12);
                    DATE_TOK495=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK495_tree = 
                    (Object)adaptor.create(DATE_TOK495)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATE_TOK495_tree, root_0);
                    }
                    dbg.location(307,20);
                    LPAREN496=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2940); if (state.failed) return retval;
                    dbg.location(307,22);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2943);
                    stringExpr497=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr497.getTree());
                    dbg.location(307,39);
                    RPAREN498=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2945); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:4: dateBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(308,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2951);
                    dateBag499=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag499.getTree());
                    dbg.location(308,15);
                    char_literal500=(Token)match(input,83,FOLLOW_83_in_dateExpr2953); if (state.failed) return retval;
                    dbg.location(308,31);
                    ONEANDONLY_TOK501=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK501_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK501)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK501_tree, root_0);
                    }
                    dbg.location(308,39);
                    LPAREN502=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2959); if (state.failed) return retval;
                    dbg.location(308,47);
                    RPAREN503=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2962); if (state.failed) return retval;

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
        dbg.location(309, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:310:1: dateBag : DATE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK504=null;
        Token STRING_CONSTANT_LIST505=null;

        Object DATE_TOK504_tree=null;
        Object STRING_CONSTANT_LIST505_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:311:2: ( DATE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:311:4: DATE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(311,12);
            DATE_TOK504=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK504_tree = 
            (Object)adaptor.create(DATE_TOK504)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATE_TOK504_tree, root_0);
            }
            dbg.location(311,14);
            STRING_CONSTANT_LIST505=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2976); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST505_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST505)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST505_tree);
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
        dbg.location(314, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:1: timeExpr : ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK506=null;
        Token LPAREN507=null;
        Token RPAREN509=null;
        Token char_literal511=null;
        Token ONEANDONLY_TOK512=null;
        Token LPAREN513=null;
        Token RPAREN514=null;
        GrammarParser.stringExpr_return stringExpr508 =null;

        GrammarParser.timeBag_return timeBag510 =null;


        Object TIME_TOK506_tree=null;
        Object LPAREN507_tree=null;
        Object RPAREN509_tree=null;
        Object char_literal511_tree=null;
        Object ONEANDONLY_TOK512_tree=null;
        Object LPAREN513_tree=null;
        Object RPAREN514_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:2: ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==TIME_TOK) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==LPAREN) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:4: TIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(317,12);
                    TIME_TOK506=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK506_tree = 
                    (Object)adaptor.create(TIME_TOK506)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TIME_TOK506_tree, root_0);
                    }
                    dbg.location(317,20);
                    LPAREN507=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2992); if (state.failed) return retval;
                    dbg.location(317,22);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2995);
                    stringExpr508=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr508.getTree());
                    dbg.location(317,39);
                    RPAREN509=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2997); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:4: timeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(318,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr3003);
                    timeBag510=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag510.getTree());
                    dbg.location(318,15);
                    char_literal511=(Token)match(input,83,FOLLOW_83_in_timeExpr3005); if (state.failed) return retval;
                    dbg.location(318,31);
                    ONEANDONLY_TOK512=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr3008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK512_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK512)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK512_tree, root_0);
                    }
                    dbg.location(318,39);
                    LPAREN513=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr3011); if (state.failed) return retval;
                    dbg.location(318,47);
                    RPAREN514=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr3014); if (state.failed) return retval;

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
        dbg.location(319, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:1: timeBag : TIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK515=null;
        Token STRING_CONSTANT_LIST516=null;

        Object TIME_TOK515_tree=null;
        Object STRING_CONSTANT_LIST516_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:321:2: ( TIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:321:4: TIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(321,12);
            TIME_TOK515=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag3025); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK515_tree = 
            (Object)adaptor.create(TIME_TOK515)
            ;
            root_0 = (Object)adaptor.becomeRoot(TIME_TOK515_tree, root_0);
            }
            dbg.location(321,14);
            STRING_CONSTANT_LIST516=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag3028); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST516_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST516)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST516_tree);
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
        dbg.location(324, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:1: dateTimeExpr : ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK517=null;
        Token LPAREN518=null;
        Token RPAREN520=null;
        Token char_literal522=null;
        Token ONEANDONLY_TOK523=null;
        Token LPAREN524=null;
        Token RPAREN525=null;
        GrammarParser.stringExpr_return stringExpr519 =null;

        GrammarParser.dateTimeBag_return dateTimeBag521 =null;


        Object DATETIME_TOK517_tree=null;
        Object LPAREN518_tree=null;
        Object RPAREN520_tree=null;
        Object char_literal522_tree=null;
        Object ONEANDONLY_TOK523_tree=null;
        Object LPAREN524_tree=null;
        Object RPAREN525_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:327:2: ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==DATETIME_TOK) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==LPAREN) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:327:4: DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(327,16);
                    DATETIME_TOK517=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr3041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK517_tree = 
                    (Object)adaptor.create(DATETIME_TOK517)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK517_tree, root_0);
                    }
                    dbg.location(327,24);
                    LPAREN518=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr3044); if (state.failed) return retval;
                    dbg.location(327,26);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr3047);
                    stringExpr519=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr519.getTree());
                    dbg.location(327,43);
                    RPAREN520=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr3049); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:4: dateTimeBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(328,4);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr3055);
                    dateTimeBag521=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag521.getTree());
                    dbg.location(328,19);
                    char_literal522=(Token)match(input,83,FOLLOW_83_in_dateTimeExpr3057); if (state.failed) return retval;
                    dbg.location(328,35);
                    ONEANDONLY_TOK523=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr3060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK523_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK523)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK523_tree, root_0);
                    }
                    dbg.location(328,43);
                    LPAREN524=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr3063); if (state.failed) return retval;
                    dbg.location(328,51);
                    RPAREN525=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr3066); if (state.failed) return retval;

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
        dbg.location(329, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:1: dateTimeBag : DATETIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK526=null;
        Token STRING_CONSTANT_LIST527=null;

        Object DATETIME_TOK526_tree=null;
        Object STRING_CONSTANT_LIST527_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:331:2: ( DATETIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:331:4: DATETIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(331,16);
            DATETIME_TOK526=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag3077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK526_tree = 
            (Object)adaptor.create(DATETIME_TOK526)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK526_tree, root_0);
            }
            dbg.location(331,18);
            STRING_CONSTANT_LIST527=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag3080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST527_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST527)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST527_tree);
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
        dbg.location(334, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:1: base64BinaryExpr : ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK528=null;
        Token LPAREN529=null;
        Token RPAREN531=null;
        Token char_literal533=null;
        Token ONEANDONLY_TOK534=null;
        Token LPAREN535=null;
        Token RPAREN536=null;
        GrammarParser.stringExpr_return stringExpr530 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag532 =null;


        Object BASE64BINARY_TOK528_tree=null;
        Object LPAREN529_tree=null;
        Object RPAREN531_tree=null;
        Object char_literal533_tree=null;
        Object ONEANDONLY_TOK534_tree=null;
        Object LPAREN535_tree=null;
        Object RPAREN536_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:337:2: ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==BASE64BINARY_TOK) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==LPAREN) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:337:4: BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(337,20);
                    BASE64BINARY_TOK528=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr3093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK528_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK528)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK528_tree, root_0);
                    }
                    dbg.location(337,28);
                    LPAREN529=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr3096); if (state.failed) return retval;
                    dbg.location(337,30);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr3099);
                    stringExpr530=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr530.getTree());
                    dbg.location(337,47);
                    RPAREN531=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr3101); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:4: base64BinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(338,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr3107);
                    base64BinaryBag532=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag532.getTree());
                    dbg.location(338,23);
                    char_literal533=(Token)match(input,83,FOLLOW_83_in_base64BinaryExpr3109); if (state.failed) return retval;
                    dbg.location(338,39);
                    ONEANDONLY_TOK534=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr3112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK534_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK534)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK534_tree, root_0);
                    }
                    dbg.location(338,47);
                    LPAREN535=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr3115); if (state.failed) return retval;
                    dbg.location(338,55);
                    RPAREN536=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr3118); if (state.failed) return retval;

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
        dbg.location(339, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:1: base64BinaryBag : BASE64BINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK537=null;
        Token STRING_CONSTANT_LIST538=null;

        Object BASE64BINARY_TOK537_tree=null;
        Object STRING_CONSTANT_LIST538_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:2: ( BASE64BINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:4: BASE64BINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(341,20);
            BASE64BINARY_TOK537=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3129); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK537_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK537)
            ;
            root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK537_tree, root_0);
            }
            dbg.location(341,22);
            STRING_CONSTANT_LIST538=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST538_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST538)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST538_tree);
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
        dbg.location(345, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:347:1: dayTimeDurationExpr : ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK539=null;
        Token LPAREN540=null;
        Token RPAREN542=null;
        Token char_literal544=null;
        Token ONEANDONLY_TOK545=null;
        Token LPAREN546=null;
        Token RPAREN547=null;
        GrammarParser.stringExpr_return stringExpr541 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag543 =null;


        Object DAYTIMEDURATION_TOK539_tree=null;
        Object LPAREN540_tree=null;
        Object RPAREN542_tree=null;
        Object char_literal544_tree=null;
        Object ONEANDONLY_TOK545_tree=null;
        Object LPAREN546_tree=null;
        Object RPAREN547_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(347, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:348:2: ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt32=2;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==DAYTIMEDURATION_TOK) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAREN) ) {
                    alt32=1;
                }
                else if ( (LA32_1==STRING_CONSTANT_LIST) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:348:4: DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(348,23);
                    DAYTIMEDURATION_TOK539=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK539_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK539)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK539_tree, root_0);
                    }
                    dbg.location(348,31);
                    LPAREN540=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3149); if (state.failed) return retval;
                    dbg.location(348,33);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr3152);
                    stringExpr541=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr541.getTree());
                    dbg.location(348,50);
                    RPAREN542=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3154); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:4: dayTimeDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(349,4);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3160);
                    dayTimeDurationBag543=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag543.getTree());
                    dbg.location(349,26);
                    char_literal544=(Token)match(input,83,FOLLOW_83_in_dayTimeDurationExpr3162); if (state.failed) return retval;
                    dbg.location(349,42);
                    ONEANDONLY_TOK545=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK545_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK545)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK545_tree, root_0);
                    }
                    dbg.location(349,50);
                    LPAREN546=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3168); if (state.failed) return retval;
                    dbg.location(349,58);
                    RPAREN547=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3171); if (state.failed) return retval;

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
        dbg.location(350, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:351:1: dayTimeDurationBag : DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK548=null;
        Token STRING_CONSTANT_LIST549=null;

        Object DAYTIMEDURATION_TOK548_tree=null;
        Object STRING_CONSTANT_LIST549_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:352:2: ( DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:352:4: DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(352,23);
            DAYTIMEDURATION_TOK548=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK548_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK548)
            ;
            root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK548_tree, root_0);
            }
            dbg.location(352,25);
            STRING_CONSTANT_LIST549=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST549_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST549)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST549_tree);
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
        dbg.location(355, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:1: yearMonthDurationExpr : ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK550=null;
        Token LPAREN551=null;
        Token RPAREN553=null;
        Token char_literal555=null;
        Token ONEANDONLY_TOK556=null;
        Token LPAREN557=null;
        Token RPAREN558=null;
        GrammarParser.stringExpr_return stringExpr552 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag554 =null;


        Object YEARMONTHDURATION_TOK550_tree=null;
        Object LPAREN551_tree=null;
        Object RPAREN553_tree=null;
        Object char_literal555_tree=null;
        Object ONEANDONLY_TOK556_tree=null;
        Object LPAREN557_tree=null;
        Object RPAREN558_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:358:2: ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt33=2;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==YEARMONTHDURATION_TOK) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LPAREN) ) {
                    alt33=1;
                }
                else if ( (LA33_1==STRING_CONSTANT_LIST) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:358:4: YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(358,25);
                    YEARMONTHDURATION_TOK550=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK550_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK550)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK550_tree, root_0);
                    }
                    dbg.location(358,33);
                    LPAREN551=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3201); if (state.failed) return retval;
                    dbg.location(358,35);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr3204);
                    stringExpr552=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr552.getTree());
                    dbg.location(358,52);
                    RPAREN553=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3206); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:4: yearMonthDurationBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(359,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3212);
                    yearMonthDurationBag554=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag554.getTree());
                    dbg.location(359,28);
                    char_literal555=(Token)match(input,83,FOLLOW_83_in_yearMonthDurationExpr3214); if (state.failed) return retval;
                    dbg.location(359,44);
                    ONEANDONLY_TOK556=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK556_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK556)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK556_tree, root_0);
                    }
                    dbg.location(359,52);
                    LPAREN557=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3220); if (state.failed) return retval;
                    dbg.location(359,60);
                    RPAREN558=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3223); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:361:1: yearMonthDurationBag : YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK559=null;
        Token STRING_CONSTANT_LIST560=null;

        Object YEARMONTHDURATION_TOK559_tree=null;
        Object STRING_CONSTANT_LIST560_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(361, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:362:2: ( YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:362:4: YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(362,25);
            YEARMONTHDURATION_TOK559=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK559_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK559)
            ;
            root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK559_tree, root_0);
            }
            dbg.location(362,27);
            STRING_CONSTANT_LIST560=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST560_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST560)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST560_tree);
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
        dbg.location(365, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:1: x500NameExpr : ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK561=null;
        Token LPAREN562=null;
        Token RPAREN564=null;
        Token char_literal566=null;
        Token ONEANDONLY_TOK567=null;
        Token LPAREN568=null;
        Token RPAREN569=null;
        GrammarParser.stringExpr_return stringExpr563 =null;

        GrammarParser.x500NameBag_return x500NameBag565 =null;


        Object X500NAME_TOK561_tree=null;
        Object LPAREN562_tree=null;
        Object RPAREN564_tree=null;
        Object char_literal566_tree=null;
        Object ONEANDONLY_TOK567_tree=null;
        Object LPAREN568_tree=null;
        Object RPAREN569_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:368:2: ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt34=2;
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==X500NAME_TOK) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==LPAREN) ) {
                    alt34=1;
                }
                else if ( (LA34_1==STRING_CONSTANT_LIST) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:368:4: X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(368,16);
                    X500NAME_TOK561=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr3250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK561_tree = 
                    (Object)adaptor.create(X500NAME_TOK561)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK561_tree, root_0);
                    }
                    dbg.location(368,24);
                    LPAREN562=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3253); if (state.failed) return retval;
                    dbg.location(368,26);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr3256);
                    stringExpr563=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr563.getTree());
                    dbg.location(368,43);
                    RPAREN564=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3258); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:369:4: x500NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(369,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr3264);
                    x500NameBag565=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag565.getTree());
                    dbg.location(369,19);
                    char_literal566=(Token)match(input,83,FOLLOW_83_in_x500NameExpr3266); if (state.failed) return retval;
                    dbg.location(369,35);
                    ONEANDONLY_TOK567=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK567_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK567)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK567_tree, root_0);
                    }
                    dbg.location(369,43);
                    LPAREN568=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3272); if (state.failed) return retval;
                    dbg.location(369,51);
                    RPAREN569=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3275); if (state.failed) return retval;

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
        dbg.location(371, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:372:1: x500NameBag : X500NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK570=null;
        Token STRING_CONSTANT_LIST571=null;

        Object X500NAME_TOK570_tree=null;
        Object STRING_CONSTANT_LIST571_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:2: ( X500NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:4: X500NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(373,16);
            X500NAME_TOK570=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag3287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK570_tree = 
            (Object)adaptor.create(X500NAME_TOK570)
            ;
            root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK570_tree, root_0);
            }
            dbg.location(373,18);
            STRING_CONSTANT_LIST571=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3290); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST571_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST571)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST571_tree);
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
        dbg.location(376, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:378:1: rfc822NameExpr : ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK572=null;
        Token LPAREN573=null;
        Token RPAREN575=null;
        Token char_literal577=null;
        Token ONEANDONLY_TOK578=null;
        Token LPAREN579=null;
        Token RPAREN580=null;
        GrammarParser.stringExpr_return stringExpr574 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag576 =null;


        Object RFC822NAME_TOK572_tree=null;
        Object LPAREN573_tree=null;
        Object RPAREN575_tree=null;
        Object char_literal577_tree=null;
        Object ONEANDONLY_TOK578_tree=null;
        Object LPAREN579_tree=null;
        Object RPAREN580_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:379:2: ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt35=2;
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==RFC822NAME_TOK) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==LPAREN) ) {
                    alt35=1;
                }
                else if ( (LA35_1==STRING_CONSTANT_LIST) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:379:4: RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(379,18);
                    RFC822NAME_TOK572=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK572_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK572)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK572_tree, root_0);
                    }
                    dbg.location(379,26);
                    LPAREN573=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3306); if (state.failed) return retval;
                    dbg.location(379,28);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr3309);
                    stringExpr574=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr574.getTree());
                    dbg.location(379,45);
                    RPAREN575=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3311); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:380:4: rfc822NameBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(380,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr3317);
                    rfc822NameBag576=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag576.getTree());
                    dbg.location(380,21);
                    char_literal577=(Token)match(input,83,FOLLOW_83_in_rfc822NameExpr3319); if (state.failed) return retval;
                    dbg.location(380,37);
                    ONEANDONLY_TOK578=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK578_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK578)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK578_tree, root_0);
                    }
                    dbg.location(380,45);
                    LPAREN579=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3325); if (state.failed) return retval;
                    dbg.location(380,53);
                    RPAREN580=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3328); if (state.failed) return retval;

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
        dbg.location(382, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:383:1: rfc822NameBag : RFC822NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK581=null;
        Token STRING_CONSTANT_LIST582=null;

        Object RFC822NAME_TOK581_tree=null;
        Object STRING_CONSTANT_LIST582_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(383, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:384:2: ( RFC822NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:384:4: RFC822NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(384,18);
            RFC822NAME_TOK581=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK581_tree = 
            (Object)adaptor.create(RFC822NAME_TOK581)
            ;
            root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK581_tree, root_0);
            }
            dbg.location(384,20);
            STRING_CONSTANT_LIST582=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST582_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST582)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST582_tree);
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
        dbg.location(387, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:389:1: hexBinaryExpr : ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK583=null;
        Token LPAREN584=null;
        Token RPAREN586=null;
        Token char_literal588=null;
        Token ONEANDONLY_TOK589=null;
        Token LPAREN590=null;
        Token RPAREN591=null;
        GrammarParser.stringExpr_return stringExpr585 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag587 =null;


        Object HEXBINARY_TOK583_tree=null;
        Object LPAREN584_tree=null;
        Object RPAREN586_tree=null;
        Object char_literal588_tree=null;
        Object ONEANDONLY_TOK589_tree=null;
        Object LPAREN590_tree=null;
        Object RPAREN591_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(389, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:390:2: ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt36=2;
            try { dbg.enterDecision(36, decisionCanBacktrack[36]);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==HEXBINARY_TOK) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==LPAREN) ) {
                    alt36=1;
                }
                else if ( (LA36_1==STRING_CONSTANT_LIST) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:390:4: HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(390,17);
                    HEXBINARY_TOK583=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3356); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK583_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK583)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK583_tree, root_0);
                    }
                    dbg.location(390,25);
                    LPAREN584=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3359); if (state.failed) return retval;
                    dbg.location(390,27);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr3362);
                    stringExpr585=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr585.getTree());
                    dbg.location(390,44);
                    RPAREN586=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3364); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:391:4: hexBinaryBag '.' ! ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(391,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr3370);
                    hexBinaryBag587=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag587.getTree());
                    dbg.location(391,20);
                    char_literal588=(Token)match(input,83,FOLLOW_83_in_hexBinaryExpr3372); if (state.failed) return retval;
                    dbg.location(391,36);
                    ONEANDONLY_TOK589=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK589_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK589)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK589_tree, root_0);
                    }
                    dbg.location(391,44);
                    LPAREN590=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3378); if (state.failed) return retval;
                    dbg.location(391,52);
                    RPAREN591=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3381); if (state.failed) return retval;

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
        dbg.location(392, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:1: hexBinaryBag : HEXBINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK592=null;
        Token STRING_CONSTANT_LIST593=null;

        Object HEXBINARY_TOK592_tree=null;
        Object STRING_CONSTANT_LIST593_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:2: ( HEXBINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:4: HEXBINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(394,17);
            HEXBINARY_TOK592=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3392); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK592_tree = 
            (Object)adaptor.create(HEXBINARY_TOK592)
            ;
            root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK592_tree, root_0);
            }
            dbg.location(394,19);
            STRING_CONSTANT_LIST593=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST593_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST593)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST593_tree);
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
        dbg.location(397, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:399:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag594 =null;

        GrammarParser.integerBag_return integerBag595 =null;

        GrammarParser.doubleBag_return doubleBag596 =null;

        GrammarParser.stringBag_return stringBag597 =null;

        GrammarParser.anyUriBag_return anyUriBag598 =null;

        GrammarParser.dateBag_return dateBag599 =null;

        GrammarParser.timeBag_return timeBag600 =null;

        GrammarParser.dateTimeBag_return dateTimeBag601 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag602 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag603 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag604 =null;

        GrammarParser.x500NameBag_return x500NameBag605 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag606 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag607 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt37=14;
            try { dbg.enterDecision(37, decisionCanBacktrack[37]);

            switch ( input.LA(1) ) {
            case BOOLEAN_TOK:
                {
                alt37=1;
                }
                break;
            case BAG_TOK:
            case INTEGER_TOK:
                {
                alt37=2;
                }
                break;
            case DOUBLE_TOK:
                {
                alt37=3;
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case STRING_TOK:
            case SUBJECT_TOK:
                {
                alt37=4;
                }
                break;
            case ANYURI_TOK:
                {
                alt37=5;
                }
                break;
            case DATE_TOK:
                {
                alt37=6;
                }
                break;
            case TIME_TOK:
                {
                alt37=7;
                }
                break;
            case DATETIME_TOK:
                {
                alt37=8;
                }
                break;
            case BASE64BINARY_TOK:
                {
                alt37=9;
                }
                break;
            case DAYTIMEDURATION_TOK:
                {
                alt37=10;
                }
                break;
            case YEARMONTHDURATION_TOK:
                {
                alt37=11;
                }
                break;
            case X500NAME_TOK:
                {
                alt37=12;
                }
                break;
            case RFC822NAME_TOK:
                {
                alt37=13;
                }
                break;
            case HEXBINARY_TOK:
                {
                alt37=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag3408);
                    booleanBag594=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag594.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag3412);
                    integerBag595=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag595.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag3416);
                    doubleBag596=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag596.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag3420);
                    stringBag597=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag597.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag3424);
                    anyUriBag598=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag598.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(400,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag3428);
                    dateBag599=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag599.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:401:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(401,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag3433);
                    timeBag600=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag600.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:401:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(401,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag3437);
                    dateTimeBag601=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag601.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:401:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(401,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag3441);
                    base64BinaryBag602=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag602.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:401:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(401,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag3445);
                    dayTimeDurationBag603=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag603.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:402:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(402,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag3450);
                    yearMonthDurationBag604=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag604.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:402:27: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(402,27);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag3454);
                    x500NameBag605=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag605.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:403:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(403,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag3459);
                    rfc822NameBag606=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag606.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:403:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(403,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag3463);
                    hexBinaryBag607=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag607.getTree());

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
        dbg.location(404, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anyBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyBag"

    // $ANTLR start synpred1_Grammar
    public final void synpred1_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:5: base64BinaryExpr
        {
        dbg.location(189,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred1_Grammar1163);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:5: base64BinaryExpr
        {
        dbg.location(205,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred2_Grammar1422);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:5: booleanBag
        {
        dbg.location(239,5);
        pushFollow(FOLLOW_booleanBag_in_synpred3_Grammar2053);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:5: integerBag
        {
        dbg.location(240,5);
        pushFollow(FOLLOW_integerBag_in_synpred4_Grammar2090);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:5: doubleBag
        {
        dbg.location(241,5);
        pushFollow(FOLLOW_doubleBag_in_synpred5_Grammar2127);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:5: stringBag
        {
        dbg.location(242,5);
        pushFollow(FOLLOW_stringBag_in_synpred6_Grammar2164);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:5: dateBag
        {
        dbg.location(243,5);
        pushFollow(FOLLOW_dateBag_in_synpred7_Grammar2202);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:5: timeBag
        {
        dbg.location(244,5);
        pushFollow(FOLLOW_timeBag_in_synpred8_Grammar2240);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:5: dateTimeBag
        {
        dbg.location(245,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred9_Grammar2278);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:5: base64BinaryBag
        {
        dbg.location(246,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred10_Grammar2316);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:5: dayTimeDurationBag
        {
        dbg.location(247,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2354);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:5: yearMonthDurationBag
        {
        dbg.location(248,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2392);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:5: anyUriBag
        {
        dbg.location(249,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred13_Grammar2430);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:5: x500NameBag
        {
        dbg.location(250,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred14_Grammar2468);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:5: rfc822NameBag
        {
        dbg.location(251,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred15_Grammar2506);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:5: hexBinaryBag
        {
        dbg.location(252,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred16_Grammar2544);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:5: base64BinaryBag
        {
        dbg.location(253,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred17_Grammar2582);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Grammar

    // Delegated rules

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
    public final boolean synpred2_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Grammar_fragment(); // can never throw exception
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
    public final boolean synpred1_Grammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Grammar_fragment(); // can never throw exception
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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA11_eotS =
        "\u00f9\uffff";
    static final String DFA11_eofS =
        "\u00f9\uffff";
    static final String DFA11_minS =
        "\1\5\2\uffff\1\52\2\uffff\1\123\1\104\1\123\1\uffff\13\52\1\123"+
        "\1\uffff\1\46\1\123\1\51\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5"+
        "\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123\1\5\1\123"+
        "\1\uffff\1\52\1\uffff\1\52\1\24\1\123\1\24\1\77\1\104\1\123\1\24"+
        "\1\77\1\104\1\123\1\24\1\77\1\104\1\123\1\24\1\77\1\104\1\123\1"+
        "\24\1\77\1\104\1\123\1\24\1\77\1\104\1\123\1\24\1\77\1\104\1\123"+
        "\1\24\1\77\1\104\1\123\1\24\1\77\1\104\1\123\1\24\1\77\1\104\1\123"+
        "\1\24\2\77\1\52\1\uffff\1\61\2\123\1\51\1\52\1\61\2\123\1\51\1\52"+
        "\1\61\2\123\1\51\1\52\1\61\2\123\1\51\1\52\1\61\2\123\1\51\1\52"+
        "\1\61\2\123\1\51\1\52\1\61\2\123\1\51\1\52\1\61\2\123\1\51\1\52"+
        "\1\61\2\123\1\51\1\52\1\61\2\123\1\51\2\123\1\77\1\52\1\65\1\123"+
        "\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123"+
        "\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123"+
        "\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52\1\65\2\123"+
        "\1\77\1\52\1\123\1\77\1\52\1\123\1\77\1\52\1\123\1\77\1\52\1\123"+
        "\1\77\1\52\1\123\1\77\1\52\1\123\1\77\1\52\1\123\1\77\1\52\1\123"+
        "\1\77\1\52\1\123\1\77\1\52\36\77";
    static final String DFA11_maxS =
        "\1\120\2\uffff\1\104\2\uffff\1\130\1\104\1\123\1\uffff\13\104\1"+
        "\130\1\uffff\1\115\1\123\1\51\1\123\1\106\1\123\1\106\1\123\1\106"+
        "\1\123\1\106\1\123\1\106\1\123\1\106\1\123\1\106\1\123\1\106\1\123"+
        "\1\106\1\123\1\106\1\123\1\uffff\1\52\1\uffff\1\52\1\102\1\123\1"+
        "\102\1\123\1\104\1\123\1\102\1\123\1\104\1\123\1\102\1\123\1\104"+
        "\1\123\1\102\1\123\1\104\1\123\1\102\1\123\1\104\1\123\1\102\1\123"+
        "\1\104\1\123\1\102\1\123\1\104\1\123\1\102\1\123\1\104\1\123\1\102"+
        "\1\123\1\104\1\123\1\102\1\123\1\104\1\123\1\102\2\77\1\52\1\uffff"+
        "\1\73\1\130\1\123\1\51\1\52\1\73\1\130\1\123\1\51\1\52\1\73\1\130"+
        "\1\123\1\51\1\52\1\73\1\130\1\123\1\51\1\52\1\73\1\130\1\123\1\51"+
        "\1\52\1\73\1\130\1\123\1\51\1\52\1\73\1\130\1\123\1\51\1\52\1\73"+
        "\1\130\1\123\1\51\1\52\1\73\1\130\1\123\1\51\1\52\1\73\1\130\1\123"+
        "\1\51\2\130\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52"+
        "\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52"+
        "\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52\1\65\1\123\1\77\1\52"+
        "\1\65\1\123\1\77\1\52\1\65\1\123\1\130\1\77\1\52\1\130\1\77\1\52"+
        "\1\130\1\77\1\52\1\130\1\77\1\52\1\130\1\77\1\52\1\130\1\77\1\52"+
        "\1\130\1\77\1\52\1\130\1\77\1\52\1\130\1\77\1\52\1\130\1\77\1\52"+
        "\1\123\1\77\1\123\1\77\1\123\1\77\1\123\1\77\1\123\1\77\1\123\1"+
        "\77\1\123\1\77\1\123\1\77\1\123\1\77\1\123\1\77\12\123";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\3\uffff\1\7\14\uffff\1\3\30\uffff"+
        "\1\10\1\uffff\1\6\57\uffff\1\11\u0097\uffff";
    static final String DFA11_specialS =
        "\u00f9\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\10\7\uffff\1\13\1\uffff\1\11\1\17\1\3\3\uffff\1\16\1\14\1"+
            "\20\3\uffff\1\25\1\12\1\10\2\uffff\1\2\1\uffff\1\24\2\uffff"+
            "\2\11\3\uffff\1\5\5\uffff\1\4\2\uffff\1\4\10\uffff\1\10\1\23"+
            "\5\uffff\1\6\1\uffff\1\7\1\10\2\uffff\1\15\1\1\4\uffff\1\22"+
            "\1\21",
            "",
            "",
            "\1\26\31\uffff\1\11",
            "",
            "",
            "\1\27\5\11",
            "\1\30",
            "\1\31",
            "",
            "\1\33\31\uffff\1\32",
            "\1\35\31\uffff\1\34",
            "\1\37\31\uffff\1\36",
            "\1\41\31\uffff\1\40",
            "\1\43\31\uffff\1\42",
            "\1\45\31\uffff\1\44",
            "\1\47\31\uffff\1\46",
            "\1\51\31\uffff\1\50",
            "\1\53\31\uffff\1\52",
            "\1\55\31\uffff\1\54",
            "\1\57\31\uffff\1\56",
            "\1\57\5\11",
            "",
            "\1\11\1\uffff\1\57\4\uffff\1\11\2\61\1\uffff\2\60\10\uffff"+
            "\1\60\21\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\70\27\uffff\1\70\36\uffff\1\70\6\uffff\1\66\1\uffff\1\67"+
            "\1\70",
            "\1\71",
            "\1\74\27\uffff\1\74\36\uffff\1\74\6\uffff\1\72\1\uffff\1\73"+
            "\1\74",
            "\1\75",
            "\1\100\27\uffff\1\100\36\uffff\1\100\6\uffff\1\76\1\uffff\1"+
            "\77\1\100",
            "\1\101",
            "\1\104\27\uffff\1\104\36\uffff\1\104\6\uffff\1\102\1\uffff"+
            "\1\103\1\104",
            "\1\105",
            "\1\110\27\uffff\1\110\36\uffff\1\110\6\uffff\1\106\1\uffff"+
            "\1\107\1\110",
            "\1\111",
            "\1\114\27\uffff\1\114\36\uffff\1\114\6\uffff\1\112\1\uffff"+
            "\1\113\1\114",
            "\1\115",
            "\1\120\27\uffff\1\120\36\uffff\1\120\6\uffff\1\116\1\uffff"+
            "\1\117\1\120",
            "\1\121",
            "\1\124\27\uffff\1\124\36\uffff\1\124\6\uffff\1\122\1\uffff"+
            "\1\123\1\124",
            "\1\125",
            "\1\130\27\uffff\1\130\36\uffff\1\130\6\uffff\1\126\1\uffff"+
            "\1\127\1\130",
            "\1\131",
            "\1\134\27\uffff\1\134\36\uffff\1\134\6\uffff\1\132\1\uffff"+
            "\1\133\1\134",
            "\1\135",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\141\40\uffff\1\140\14\uffff\1\11",
            "\1\63",
            "\1\141\55\uffff\1\11",
            "\1\143\23\uffff\1\142",
            "\1\144",
            "\1\145",
            "\1\141\40\uffff\1\146\14\uffff\1\11",
            "\1\150\23\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\141\40\uffff\1\153\14\uffff\1\11",
            "\1\155\23\uffff\1\154",
            "\1\156",
            "\1\157",
            "\1\141\40\uffff\1\160\14\uffff\1\11",
            "\1\162\23\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\141\40\uffff\1\165\14\uffff\1\11",
            "\1\167\23\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\141\40\uffff\1\172\14\uffff\1\11",
            "\1\174\23\uffff\1\173",
            "\1\175",
            "\1\176",
            "\1\141\40\uffff\1\177\14\uffff\1\11",
            "\1\u0081\23\uffff\1\u0080",
            "\1\u0082",
            "\1\u0083",
            "\1\141\40\uffff\1\u0084\14\uffff\1\11",
            "\1\u0086\23\uffff\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\1\141\40\uffff\1\u0089\14\uffff\1\11",
            "\1\u008b\23\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\141\40\uffff\1\u008e\14\uffff\1\11",
            "\1\u0090\23\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\141\40\uffff\1\57\14\uffff\1\11",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\2\u0096\10\uffff\1\u0096",
            "\1\57\5\11",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\2\u009a\10\uffff\1\u009a",
            "\1\57\5\11",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\2\u009e\10\uffff\1\u009e",
            "\1\57\5\11",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\2\u00a2\10\uffff\1\u00a2",
            "\1\57\5\11",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\2\u00a6\10\uffff\1\u00a6",
            "\1\57\5\11",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\2\u00aa\10\uffff\1\u00aa",
            "\1\57\5\11",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\2\u00ae\10\uffff\1\u00ae",
            "\1\57\5\11",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\2\u00b2\10\uffff\1\u00b2",
            "\1\57\5\11",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\2\u00b6\10\uffff\1\u00b6",
            "\1\57\5\11",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\2\u00ba\10\uffff\1\u00ba",
            "\1\57\5\11",
            "\1\u00bb",
            "\1\u00bc",
            "\1\27\5\11",
            "\1\57\5\11",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u0097",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u009b",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u009f",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00a3",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00a7",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00ab",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00af",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00b3",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00b7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00bb",
            "\1\27\5\11",
            "\1\u00db",
            "\1\u00dc",
            "\1\57\5\11",
            "\1\u00dd",
            "\1\u00de",
            "\1\57\5\11",
            "\1\u00df",
            "\1\u00e0",
            "\1\57\5\11",
            "\1\u00e1",
            "\1\u00e2",
            "\1\57\5\11",
            "\1\u00e3",
            "\1\u00e4",
            "\1\57\5\11",
            "\1\u00e5",
            "\1\u00e6",
            "\1\57\5\11",
            "\1\u00e7",
            "\1\u00e8",
            "\1\57\5\11",
            "\1\u00e9",
            "\1\u00ea",
            "\1\57\5\11",
            "\1\u00eb",
            "\1\u00ec",
            "\1\57\5\11",
            "\1\u00ed",
            "\1\u00ee",
            "\1\143\23\uffff\1\142",
            "\1\u00ef",
            "\1\150\23\uffff\1\147",
            "\1\u00f0",
            "\1\155\23\uffff\1\154",
            "\1\u00f1",
            "\1\162\23\uffff\1\161",
            "\1\u00f2",
            "\1\167\23\uffff\1\166",
            "\1\u00f3",
            "\1\174\23\uffff\1\173",
            "\1\u00f4",
            "\1\u0081\23\uffff\1\u0080",
            "\1\u00f5",
            "\1\u0086\23\uffff\1\u0085",
            "\1\u00f6",
            "\1\u008b\23\uffff\1\u008a",
            "\1\u00f7",
            "\1\u0090\23\uffff\1\u008f",
            "\1\u00f8",
            "\1\143\23\uffff\1\142",
            "\1\150\23\uffff\1\147",
            "\1\155\23\uffff\1\154",
            "\1\162\23\uffff\1\161",
            "\1\167\23\uffff\1\166",
            "\1\174\23\uffff\1\173",
            "\1\u0081\23\uffff\1\u0080",
            "\1\u0086\23\uffff\1\u0085",
            "\1\u008b\23\uffff\1\u008a",
            "\1\u0090\23\uffff\1\u008f"
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
            return "137:1: booleanExpr : ( TRUE_TOK | FALSE_TOK | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA14_eotS =
        "\70\uffff";
    static final String DFA14_eofS =
        "\70\uffff";
    static final String DFA14_minS =
        "\1\5\1\uffff\1\123\1\104\1\123\4\uffff\1\52\5\uffff\1\50\1\123\1"+
        "\51\1\5\1\123\1\52\1\uffff\1\65\1\123\1\77\1\104\1\123\1\65\1\77"+
        "\1\52\1\61\2\123\1\51\1\52\1\123\1\77\1\52\1\50\1\65\1\123\1\77"+
        "\1\123\1\77\2\52\1\123\1\77\1\20\1\77\1\104\2\77\1\0\2\uffff";
    static final String DFA14_maxS =
        "\1\120\1\uffff\1\123\1\104\1\123\4\uffff\1\104\5\uffff\1\115\1\123"+
        "\1\51\1\106\1\123\1\52\1\uffff\1\65\2\123\1\104\1\123\1\65\1\77"+
        "\1\52\1\73\2\123\1\51\1\52\1\123\1\77\1\52\1\50\1\65\1\123\1\77"+
        "\1\123\1\77\2\52\2\123\1\20\1\77\1\104\1\123\1\77\1\0\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\6\uffff\1\2\40\uffff\1\7\1\15";
    static final String DFA14_specialS =
        "\65\uffff\1\0\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\4\7\uffff\1\5\2\uffff\1\11\4\uffff\1\10\1\6\1\12\3\uffff"+
            "\2\1\1\4\4\uffff\1\16\31\uffff\1\4\1\15\5\uffff\1\2\1\uffff"+
            "\1\3\1\4\2\uffff\1\7\5\uffff\1\14\1\13",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "\1\22\31\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "\1\25\10\uffff\2\24\10\uffff\1\24\21\uffff\1\5",
            "\1\26",
            "\1\27",
            "\1\32\27\uffff\1\32\36\uffff\1\32\6\uffff\1\30\1\uffff\1\31"+
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\35",
            "\1\26",
            "\1\37\23\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\2\45\10\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\17",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\47",
            "\1\56",
            "\1\17",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\46",
            "\1\37\23\uffff\1\36",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\37\23\uffff\1\36",
            "\1\65",
            "\1\uffff",
            "",
            ""
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
            return "176:1: isInOp : ( doubleExpr '.' ! ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ! ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ! ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ! ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ! ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ! ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ! ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ! ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ! ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ! ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ! ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ! ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_53 = input.LA(1);

                         
                        int index14_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 54;}

                        else if ( (synpred1_Grammar()) ) {s = 55;}

                         
                        input.seek(index14_53);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA15_eotS =
        "\53\uffff";
    static final String DFA15_eofS =
        "\53\uffff";
    static final String DFA15_minS =
        "\1\5\6\uffff\1\104\5\uffff\1\123\1\24\1\52\1\20\1\52\1\5\1\123\1"+
        "\77\1\104\1\123\1\65\1\61\1\77\1\123\1\51\2\52\1\0\1\65\1\123\2"+
        "\77\2\uffff\1\52\3\77\1\0\1\77";
    static final String DFA15_maxS =
        "\1\120\6\uffff\1\104\5\uffff\1\123\1\24\1\52\1\20\1\104\1\106\2"+
        "\123\1\104\1\123\1\65\1\73\1\77\1\123\1\51\2\52\1\0\1\65\1\123\2"+
        "\77\2\uffff\1\52\1\77\1\123\1\77\1\0\1\123";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\26\uffff\1\7\1\15\6\uffff";
    static final String DFA15_specialS =
        "\36\uffff\1\1\12\uffff\1\0\1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\7\uffff\1\3\2\uffff\1\7\4\uffff\1\6\1\4\1\10\4\uffff\1"+
            "\1\1\2\4\uffff\1\14\31\uffff\1\2\1\13\7\uffff\2\2\2\uffff\1"+
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
            "\1\22\31\uffff\1\23",
            "\1\26\27\uffff\1\26\36\uffff\1\26\6\uffff\1\24\1\uffff\1\25"+
            "\1\26",
            "\1\27",
            "\1\31\23\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\2\35\10\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\uffff",
            "\1\45",
            "\1\37",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\31\23\uffff\1\30",
            "\1\52",
            "\1\uffff",
            "\1\31\23\uffff\1\30"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "192:1: containsOp : ( doubleBag '.' ! CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' ! CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ! CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' ! CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' ! CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' ! CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' ! CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' ! CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' ! CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' ! CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_41 = input.LA(1);

                         
                        int index15_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index15_41);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA15_30 = input.LA(1);

                         
                        int index15_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index15_30);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA16_eotS =
        "\67\uffff";
    static final String DFA16_eofS =
        "\67\uffff";
    static final String DFA16_minS =
        "\1\5\1\uffff\1\123\1\104\1\123\12\52\1\uffff\1\46\1\uffff\1\123"+
        "\1\51\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1"+
        "\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\52\1\65\1\123\11\65\1\77\1\52\1\123\1\77\1\123";
    static final String DFA16_maxS =
        "\1\120\1\uffff\1\130\1\104\1\123\12\104\1\uffff\1\115\1\uffff\1"+
        "\123\1\51\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\52\1\102\1\123\11\102\1\77\1\52\1\130\1\77\1\130";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\21\uffff";
    static final String DFA16_specialS =
        "\67\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
            "\3\uffff\1\17\1\5\1\4\4\uffff\1\1\2\uffff\2\1\25\uffff\1\4\1"+
            "\16\5\uffff\1\2\1\uffff\1\3\1\4\2\uffff\1\10\5\uffff\1\15\1"+
            "\14",
            "",
            "\1\20\5\21",
            "\1\22",
            "\1\23",
            "\1\17\31\uffff\1\1",
            "\1\25\31\uffff\1\24",
            "\1\27\31\uffff\1\26",
            "\1\31\31\uffff\1\30",
            "\1\33\31\uffff\1\32",
            "\1\35\31\uffff\1\34",
            "\1\37\31\uffff\1\36",
            "\1\41\31\uffff\1\40",
            "\1\43\31\uffff\1\42",
            "\1\45\31\uffff\1\44",
            "",
            "\1\1\6\uffff\1\1\3\uffff\2\46\10\uffff\1\46\21\uffff\1\25",
            "",
            "\1\47",
            "\1\50",
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
            "\1\61",
            "",
            "\1\62",
            "\1\63\14\uffff\1\1",
            "\1\47",
            "\1\25\14\uffff\1\1",
            "\1\27\14\uffff\1\1",
            "\1\31\14\uffff\1\1",
            "\1\33\14\uffff\1\1",
            "\1\35\14\uffff\1\1",
            "\1\37\14\uffff\1\1",
            "\1\41\14\uffff\1\1",
            "\1\43\14\uffff\1\1",
            "\1\45\14\uffff\1\1",
            "\1\64",
            "\1\65",
            "\1\20\5\21",
            "\1\66",
            "\1\20\5\21"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "208:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA17_eotS =
        "\67\uffff";
    static final String DFA17_eofS =
        "\67\uffff";
    static final String DFA17_minS =
        "\1\5\1\uffff\1\123\1\104\1\123\12\52\1\uffff\1\46\1\123\1\51\1\123"+
        "\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\52\1"+
        "\uffff\1\65\1\123\11\65\1\77\1\52\1\123\1\77\1\123";
    static final String DFA17_maxS =
        "\1\120\1\uffff\1\123\1\104\1\123\12\104\1\uffff\1\115\1\123\1\51"+
        "\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1"+
        "\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1"+
        "\52\1\uffff\1\102\1\123\11\102\1\77\1\52\1\123\1\77\1\123";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\uffff\1\3\20\uffff";
    static final String DFA17_specialS =
        "\67\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\4\7\uffff\1\6\1\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
            "\3\uffff\1\17\1\5\1\4\4\uffff\1\1\2\uffff\2\1\25\uffff\1\4\1"+
            "\16\5\uffff\1\2\1\uffff\1\3\1\4\2\uffff\1\10\5\uffff\1\15\1"+
            "\14",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\17\31\uffff\1\1",
            "\1\24\31\uffff\1\23",
            "\1\26\31\uffff\1\25",
            "\1\30\31\uffff\1\27",
            "\1\32\31\uffff\1\31",
            "\1\34\31\uffff\1\33",
            "\1\36\31\uffff\1\35",
            "\1\40\31\uffff\1\37",
            "\1\42\31\uffff\1\41",
            "\1\44\31\uffff\1\43",
            "",
            "\1\1\6\uffff\1\1\3\uffff\2\45\7\uffff\1\46\1\45\21\uffff\1"+
            "\24",
            "\1\47",
            "\1\50",
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
            "\1\61",
            "",
            "\1\62",
            "",
            "\1\63\14\uffff\1\1",
            "\1\47",
            "\1\24\14\uffff\1\1",
            "\1\26\14\uffff\1\1",
            "\1\30\14\uffff\1\1",
            "\1\32\14\uffff\1\1",
            "\1\34\14\uffff\1\1",
            "\1\36\14\uffff\1\1",
            "\1\40\14\uffff\1\1",
            "\1\42\14\uffff\1\1",
            "\1\44\14\uffff\1\1",
            "\1\64",
            "\1\65",
            "\1\20",
            "\1\66",
            "\1\20"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "223:1: regexOp : ( integerExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' ! REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_xacmlFile490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_policySet_in_xacmlFile494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_xacmlFile497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy509 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy512 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy514 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_policy516 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000101L});
    public static final BitSet FOLLOW_target_in_policy519 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000001L});
    public static final BitSet FOLLOW_rule_in_policy522 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_policy525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICYSET_TOK_in_policySet537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policySet540 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policySet542 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_policySet544 = new BitSet(new long[]{0x0100000000000000L,0x0000000008000100L});
    public static final BitSet FOLLOW_target_in_policySet547 = new BitSet(new long[]{0x0100000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_policy_in_policySet550 = new BitSet(new long[]{0x0100000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_policySet553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target565 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_target568 = new BitSet(new long[]{0x1000040020000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_matchOrExpr_in_target571 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_target573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchAndExpr_in_matchOrExpr586 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_matchOrExpr589 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_matchAndExpr_in_matchOrExpr592 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_matchOrExpr600 = new BitSet(new long[]{0x1000040020000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_matchOrExpr_in_matchOrExpr603 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_matchOrExpr605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchExpr_in_matchAndExpr619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_matchAndExpr622 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_matchExpr_in_matchAndExpr625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_attributeSelector_in_matchExpr639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_matchExpr642 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_MATCHES_TOK_in_matchExpr645 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_matchExpr647 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_matchExpr650 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_matchExpr652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeSelector664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_attributeSelector682 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeSelector685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule696 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule699 = new BitSet(new long[]{0x0040000002000000L});
    public static final BitSet FOLLOW_set_in_rule701 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_rule709 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000008018768L});
    public static final BitSet FOLLOW_target_in_rule712 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000008018668L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_rule715 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rule718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanCreate_in_booleanExpr740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanNof_in_booleanExpr745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanWrap_in_booleanExpr750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanNode_in_booleanExpr755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanCreate782 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanCreate785 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_attributeSelector_in_booleanCreate788 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_booleanCreate790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanNof801 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanNof811 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000000018668L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanNof814 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_booleanNof816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_booleanWrap827 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000000018668L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanWrap830 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_booleanWrap832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanNode843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_booleanNode845 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_booleanNode848 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanNode859 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_booleanNode862 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_booleanNode864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr892 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalOrExpr895 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000000018668L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr898 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalAndExpr917 = new BitSet(new long[]{0x3009046538E3A020L,0x0000000000018668L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp936 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp939 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp942 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp945 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp955 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp958 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp961 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000060L});
    public static final BitSet FOLLOW_stringBag_in_isInOp964 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp974 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp977 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp980 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp983 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp993 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp996 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp999 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp1002 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1012 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1015 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_timeBag_in_isInOp1021 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1031 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1034 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1037 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp1040 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1050 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1053 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1056 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1059 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1069 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1072 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1075 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp1078 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1088 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1091 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp1097 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1107 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1110 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp1116 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1126 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1129 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1132 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp1135 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1145 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1148 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1151 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp1154 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_isInOp1170 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1173 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1176 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1179 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1195 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1198 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1201 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp1204 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1214 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1217 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1220 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp1223 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1233 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1236 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1239 = new BitSet(new long[]{0x1000000020002020L,0x0000000000000068L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp1242 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1255 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1258 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_containsOp1261 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1271 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1274 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1280 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1293 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1299 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1312 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1318 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1331 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1334 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1337 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1350 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1356 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1369 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1375 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1388 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1391 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1394 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1404 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1407 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1410 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1413 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_containsOp1429 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1432 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1438 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1454 = new BitSet(new long[]{0x3000006430E3A020L,0x0000000000018268L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1484 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1514 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1544 = new BitSet(new long[]{0x1000000020002020L,0x0000000000000068L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1574 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1634 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1724 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1754 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1820 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1823 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1826 = new BitSet(new long[]{0x3000006430E3A020L,0x0000000000018268L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1829 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1839 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1842 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1845 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1848 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1858 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1861 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1864 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1867 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1877 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1883 = new BitSet(new long[]{0x1000000020002020L,0x0000000000000068L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1886 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1896 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1899 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1902 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1905 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1915 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1918 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1924 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1934 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1937 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1940 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1943 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1953 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1956 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1959 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1962 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1972 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1975 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1981 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp1991 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1994 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp2000 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp2010 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp2013 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp2016 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp2019 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp2027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_regexOp2029 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp2032 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp2035 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp2038 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2060 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2063 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp2081 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2097 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2100 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2115 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp2118 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2134 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2137 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2152 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp2155 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2172 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2175 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2190 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000060L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2193 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2210 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2213 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2228 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2231 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2248 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2251 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2269 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2286 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2289 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2307 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2324 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2327 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2342 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2345 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2362 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2365 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2380 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2383 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2400 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2403 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2421 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2438 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2441 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2459 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2476 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2479 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2497 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2514 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2517 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2532 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2535 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2552 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2555 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2570 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2573 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bagOp2589 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_bagOp2592 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2607 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2610 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2631 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2634 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2645 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerExpr2656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2659 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2661 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2686 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2689 = new BitSet(new long[]{0x3000006430E3A020L,0x0000000000018268L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_integerBag2696 = new BitSet(new long[]{0x3000006430E3A020L,0x0000000000018268L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2699 = new BitSet(new long[]{0x8000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2708 = new BitSet(new long[]{0x0000008000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_integerBag2711 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2722 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2725 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2747 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_doubleExpr2750 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2753 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_doubleExpr2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_stringExpr2794 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2797 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2800 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_stringExpr2810 = new BitSet(new long[]{0x0806000000000000L});
    public static final BitSet FOLLOW_set_in_stringExpr2813 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2827 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeSelector_in_stringBag2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2866 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2869 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2872 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2882 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2885 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2888 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_anyUriExpr2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2902 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2905 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2937 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2940 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2943 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateExpr2953 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2956 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2959 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2989 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2992 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2995 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr3003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_timeExpr3005 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr3008 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr3011 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr3041 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr3044 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr3047 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dateTimeExpr3057 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr3060 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr3063 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr3093 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr3096 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr3099 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_base64BinaryExpr3109 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr3112 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr3115 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3146 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3149 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr3152 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_dayTimeDurationExpr3162 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3165 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3168 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3198 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3201 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr3204 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_yearMonthDurationExpr3214 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3217 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3220 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr3250 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3253 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr3256 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_x500NameExpr3266 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3269 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3272 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3303 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3306 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr3309 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr3317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_rfc822NameExpr3319 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3322 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3325 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3356 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3359 = new BitSet(new long[]{0x1000000020000020L,0x0000000000000068L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr3362 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_hexBinaryExpr3372 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3375 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3378 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred1_Grammar1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred2_Grammar1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred3_Grammar2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred4_Grammar2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred5_Grammar2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred6_Grammar2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred7_Grammar2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred8_Grammar2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred9_Grammar2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred10_Grammar2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred13_Grammar2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred14_Grammar2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred15_Grammar2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred16_Grammar2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred17_Grammar2582 = new BitSet(new long[]{0x0000000000000002L});

}