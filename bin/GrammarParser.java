// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-06-26 20:37:03

	package noxacml;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_TOK", "ACTION_TOK", "ALLOFALL_TOK", "ALLOFANY_TOK", "ALLOF_TOK", "ANYCASEIDENTIFIER", "ANYOFALL_TOK", "ANYOFANY_TOK", "ANYOF_TOK", "ANYURI_TOK", "APPLICABLE_TOK", "ATLEASTONEMENBEROF_TOK", "BAG_TOK", "BASE64BINARY_TOK", "BOOLEAN_TOK", "COMMENT", "CONCATENATE_TOK", "CONTAINS_TOK", "DATETIME_TOK", "DATE_TOK", "DAYTIMEDURATION_TOK", "DECIMAL_TOK", "DENY_TOK", "DEREF_TOK", "DOUBLE_CONSTANT", "DOUBLE_TOK", "ENVIRONMENT_TOK", "ESC_SEQ", "EXPONENT", "FALSE_TOK", "FLR_TOK", "HEXBINARY_TOK", "HEX_DIGIT", "IF_TOK", "INTEGER_CONSTANT", "INTEGER_TOK", "INTERSECTION_TOK", "ISIN_TOK", "LOWERCASEIDENTIFIER", "LPAREN", "MAP_TOK", "MATCH_TOK", "NODECOUNT_TOK", "NODEEQUAL_TOK", "NODEMATCH_TOK", "NOF_TOK", "NORMALIZESPACE_TOK", "NORMALIZETOLOWERCASE_TOK", "NOT_TOK", "OCTAL_ESC", "ONEANDONLY_TOK", "PERMIT_TOK", "POLICYSET_TOK", "POLICY_TOK", "RANGEOP_TOK", "REGEXMATCH_TOK", "REQUIRED_TOK", "RESOURCE_TOK", "RFC822NAME_TOK", "RND_TOK", "RPAREN", "RULE_TOK", "SETEQUALS_TOK", "SIZE_TOK", "STRING_CONSTANT", "STRING_CONSTANT_LIST", "STRING_TOK", "SUBJECT_TOK", "SUBSET_TOK", "TARGET_TOK", "TIME_TOK", "TRUE_TOK", "UNICODE_ESC", "UNION_TOK", "URI_TOK", "WHITESPACE", "X500NAME_TOK", "YEARMONTHDURATION_TOK", "'&&'", "','", "'.'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int APPLICABLE_TOK=14;
    public static final int ATLEASTONEMENBEROF_TOK=15;
    public static final int BAG_TOK=16;
    public static final int BASE64BINARY_TOK=17;
    public static final int BOOLEAN_TOK=18;
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
    public static final int LPAREN=43;
    public static final int MAP_TOK=44;
    public static final int MATCH_TOK=45;
    public static final int NODECOUNT_TOK=46;
    public static final int NODEEQUAL_TOK=47;
    public static final int NODEMATCH_TOK=48;
    public static final int NOF_TOK=49;
    public static final int NORMALIZESPACE_TOK=50;
    public static final int NORMALIZETOLOWERCASE_TOK=51;
    public static final int NOT_TOK=52;
    public static final int OCTAL_ESC=53;
    public static final int ONEANDONLY_TOK=54;
    public static final int PERMIT_TOK=55;
    public static final int POLICYSET_TOK=56;
    public static final int POLICY_TOK=57;
    public static final int RANGEOP_TOK=58;
    public static final int REGEXMATCH_TOK=59;
    public static final int REQUIRED_TOK=60;
    public static final int RESOURCE_TOK=61;
    public static final int RFC822NAME_TOK=62;
    public static final int RND_TOK=63;
    public static final int RPAREN=64;
    public static final int RULE_TOK=65;
    public static final int SETEQUALS_TOK=66;
    public static final int SIZE_TOK=67;
    public static final int STRING_CONSTANT=68;
    public static final int STRING_CONSTANT_LIST=69;
    public static final int STRING_TOK=70;
    public static final int SUBJECT_TOK=71;
    public static final int SUBSET_TOK=72;
    public static final int TARGET_TOK=73;
    public static final int TIME_TOK=74;
    public static final int TRUE_TOK=75;
    public static final int UNICODE_ESC=76;
    public static final int UNION_TOK=77;
    public static final int URI_TOK=78;
    public static final int WHITESPACE=79;
    public static final int X500NAME_TOK=80;
    public static final int YEARMONTHDURATION_TOK=81;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred11_Grammar", "x500NameExpr", "synpred6_Grammar", 
    "synpred8_Grammar", "hexBinaryBag", "dateBag", "doubleExpr", "booleanBag", 
    "synpred5_Grammar", "anyUriBag", "anyBag", "policy", "hexBinaryExpr", 
    "synpred10_Grammar", "dateTimeExpr", "rfc822NameExpr", "xacmlFile", 
    "synpred16_Grammar", "isInOp", "base64BinaryBag", "synpred2_Grammar", 
    "timeBag", "dateExpr", "equalityExpr", "yearMonthDurationBag", "integerBag", 
    "target", "conditionalAndExpr", "stringBag", "anyUriExpr", "dateTimeBag", 
    "synpred3_Grammar", "timeExpr", "attributeExpr", "booleanExpr", "yearMonthDurationExpr", 
    "conditionalOrExpr", "synpred14_Grammar", "bagOp", "synpred17_Grammar", 
    "synpred1_Grammar", "stringExpr", "doubleBag", "dayTimeDurationExpr", 
    "policySet", "synpred9_Grammar", "dayTimeDurationBag", "regexOp", "integerExpr", 
    "synpred4_Grammar", "rule", "synpred15_Grammar", "containsOp", "base64BinaryExpr", 
    "x500NameBag", "synpred13_Grammar", "synpred12_Grammar", "rfc822NameBag", 
    "synpred7_Grammar"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, true, true, false, false, true, false, false, false, 
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


    public static class xacmlFile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xacmlFile"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:89:1: xacmlFile : ( policy | policySet ) EOF ;
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
        dbg.location(89, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:2: ( ( policy | policySet ) EOF )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:4: ( policy | policySet ) EOF
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(90,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:4: ( policy | policySet )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:6: policy
                    {
                    dbg.location(90,6);
                    pushFollow(FOLLOW_policy_in_xacmlFile457);
                    policy1=policy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:90:15: policySet
                    {
                    dbg.location(90,15);
                    pushFollow(FOLLOW_policySet_in_xacmlFile461);
                    policySet2=policySet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policySet2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(90,26);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_xacmlFile464); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF3_tree = 
            (Object)adaptor.create(EOF3)
            ;
            adaptor.addChild(root_0, EOF3_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:93:1: policy : POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' ;
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
        dbg.location(93, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:2: ( POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:4: POLICY_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( rule )? '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(94,14);
            POLICY_TOK4=(Token)match(input,POLICY_TOK,FOLLOW_POLICY_TOK_in_policy475); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY_TOK4_tree = 
            (Object)adaptor.create(POLICY_TOK4)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICY_TOK4_tree, root_0);
            }
            dbg.location(94,16);
            ANYCASEIDENTIFIER5=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy478); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER5_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER5_tree);
            }
            dbg.location(94,34);
            LOWERCASEIDENTIFIER6=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER6_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER6)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER6_tree);
            }
            dbg.location(94,54);
            char_literal7=(Token)match(input,90,FOLLOW_90_in_policy482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);
            }
            dbg.location(94,58);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:58: ( target )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:58: target
                    {
                    dbg.location(94,58);
                    pushFollow(FOLLOW_target_in_policy484);
                    target8=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(94,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:66: ( rule )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:94:66: rule
                    {
                    dbg.location(94,66);
                    pushFollow(FOLLOW_rule_in_policy487);
                    rule9=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule9.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(94,72);
            char_literal10=(Token)match(input,92,FOLLOW_92_in_policy490); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:96:1: policySet : POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( policy )+ '}' ;
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
        dbg.location(96, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:2: ( POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( policy )+ '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:4: POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ( target )? ( policy )+ '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(97,17);
            POLICYSET_TOK11=(Token)match(input,POLICYSET_TOK,FOLLOW_POLICYSET_TOK_in_policySet500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICYSET_TOK11_tree = 
            (Object)adaptor.create(POLICYSET_TOK11)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICYSET_TOK11_tree, root_0);
            }
            dbg.location(97,19);
            ANYCASEIDENTIFIER12=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policySet503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER12_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER12)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER12_tree);
            }
            dbg.location(97,37);
            LOWERCASEIDENTIFIER13=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policySet505); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER13_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER13)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER13_tree);
            }
            dbg.location(97,57);
            char_literal14=(Token)match(input,90,FOLLOW_90_in_policySet507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);
            }
            dbg.location(97,61);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:61: ( target )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:61: target
                    {
                    dbg.location(97,61);
                    pushFollow(FOLLOW_target_in_policySet509);
                    target15=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(97,69);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:69: ( policy )+
            int cnt5=0;
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:69: policy
            	    {
            	    dbg.location(97,69);
            	    pushFollow(FOLLOW_policy_in_policySet512);
            	    policy16=policy();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy16.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt5++;
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(97,77);
            char_literal17=(Token)match(input,92,FOLLOW_92_in_policySet515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);
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
        dbg.location(98, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:104:1: target : TARGET_TOK ( ANYCASEIDENTIFIER )? '{' APPLICABLE_TOK ^ IF_TOK booleanExpr '}' ;
    public final GrammarParser.target_return target() throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TARGET_TOK18=null;
        Token ANYCASEIDENTIFIER19=null;
        Token char_literal20=null;
        Token APPLICABLE_TOK21=null;
        Token IF_TOK22=null;
        Token char_literal24=null;
        GrammarParser.booleanExpr_return booleanExpr23 =null;


        Object TARGET_TOK18_tree=null;
        Object ANYCASEIDENTIFIER19_tree=null;
        Object char_literal20_tree=null;
        Object APPLICABLE_TOK21_tree=null;
        Object IF_TOK22_tree=null;
        Object char_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:2: ( TARGET_TOK ( ANYCASEIDENTIFIER )? '{' APPLICABLE_TOK ^ IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:4: TARGET_TOK ( ANYCASEIDENTIFIER )? '{' APPLICABLE_TOK ^ IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(105,4);
            TARGET_TOK18=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK18_tree = 
            (Object)adaptor.create(TARGET_TOK18)
            ;
            adaptor.addChild(root_0, TARGET_TOK18_tree);
            }
            dbg.location(105,15);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:15: ( ANYCASEIDENTIFIER )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==ANYCASEIDENTIFIER) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:105:15: ANYCASEIDENTIFIER
                    {
                    dbg.location(105,15);
                    ANYCASEIDENTIFIER19=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_target530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER19_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER19)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER19_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(105,34);
            char_literal20=(Token)match(input,90,FOLLOW_90_in_target533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal20_tree = 
            (Object)adaptor.create(char_literal20)
            ;
            adaptor.addChild(root_0, char_literal20_tree);
            }
            dbg.location(105,52);
            APPLICABLE_TOK21=(Token)match(input,APPLICABLE_TOK,FOLLOW_APPLICABLE_TOK_in_target535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            APPLICABLE_TOK21_tree = 
            (Object)adaptor.create(APPLICABLE_TOK21)
            ;
            root_0 = (Object)adaptor.becomeRoot(APPLICABLE_TOK21_tree, root_0);
            }
            dbg.location(105,54);
            IF_TOK22=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_target538); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK22_tree = 
            (Object)adaptor.create(IF_TOK22)
            ;
            adaptor.addChild(root_0, IF_TOK22_tree);
            }
            dbg.location(105,61);
            pushFollow(FOLLOW_booleanExpr_in_target540);
            booleanExpr23=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr23.getTree());
            dbg.location(105,73);
            char_literal24=(Token)match(input,92,FOLLOW_92_in_target542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = 
            (Object)adaptor.create(char_literal24)
            ;
            adaptor.addChild(root_0, char_literal24_tree);
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
        dbg.location(106, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:107:1: rule : RULE_TOK ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) ^ IF_TOK booleanExpr '}' ;
    public final GrammarParser.rule_return rule() throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RULE_TOK25=null;
        Token ANYCASEIDENTIFIER26=null;
        Token char_literal27=null;
        Token set28=null;
        Token IF_TOK29=null;
        Token char_literal31=null;
        GrammarParser.booleanExpr_return booleanExpr30 =null;


        Object RULE_TOK25_tree=null;
        Object ANYCASEIDENTIFIER26_tree=null;
        Object char_literal27_tree=null;
        Object set28_tree=null;
        Object IF_TOK29_tree=null;
        Object char_literal31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:2: ( RULE_TOK ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) ^ IF_TOK booleanExpr '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:4: RULE_TOK ( ANYCASEIDENTIFIER )? '{' ( PERMIT_TOK | DENY_TOK ) ^ IF_TOK booleanExpr '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(108,4);
            RULE_TOK25=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule552); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK25_tree = 
            (Object)adaptor.create(RULE_TOK25)
            ;
            adaptor.addChild(root_0, RULE_TOK25_tree);
            }
            dbg.location(108,13);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:13: ( ANYCASEIDENTIFIER )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ANYCASEIDENTIFIER) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:108:13: ANYCASEIDENTIFIER
                    {
                    dbg.location(108,13);
                    ANYCASEIDENTIFIER26=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER26_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER26)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER26_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(108,32);
            char_literal27=(Token)match(input,90,FOLLOW_90_in_rule557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = 
            (Object)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);
            }
            dbg.location(108,59);
            set28=(Token)input.LT(1);

            set28=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set28)
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

            dbg.location(108,61);
            IF_TOK29=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_rule568); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK29_tree = 
            (Object)adaptor.create(IF_TOK29)
            ;
            adaptor.addChild(root_0, IF_TOK29_tree);
            }
            dbg.location(108,68);
            pushFollow(FOLLOW_booleanExpr_in_rule570);
            booleanExpr30=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr30.getTree());
            dbg.location(108,80);
            char_literal31=(Token)match(input,92,FOLLOW_92_in_rule572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal31_tree = 
            (Object)adaptor.create(char_literal31)
            ;
            adaptor.addChild(root_0, char_literal31_tree);
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
        dbg.location(109, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:111:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN attributeExpr RPAREN | ( NOF_TOK ^| NOT_TOK ^) LPAREN booleanExpr RPAREN | LPAREN conditionalOrExpr RPAREN | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN stringExpr RPAREN );
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TRUE_TOK32=null;
        Token FALSE_TOK33=null;
        Token BOOLEAN_TOK34=null;
        Token LPAREN35=null;
        Token RPAREN37=null;
        Token NOF_TOK38=null;
        Token NOT_TOK39=null;
        Token LPAREN40=null;
        Token RPAREN42=null;
        Token LPAREN43=null;
        Token RPAREN45=null;
        Token char_literal50=null;
        Token NODEEQUAL_TOK51=null;
        Token NODEMATCH_TOK52=null;
        Token LPAREN53=null;
        Token RPAREN55=null;
        GrammarParser.attributeExpr_return attributeExpr36 =null;

        GrammarParser.booleanExpr_return booleanExpr41 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr44 =null;

        GrammarParser.equalityExpr_return equalityExpr46 =null;

        GrammarParser.isInOp_return isInOp47 =null;

        GrammarParser.containsOp_return containsOp48 =null;

        GrammarParser.stringExpr_return stringExpr49 =null;

        GrammarParser.stringExpr_return stringExpr54 =null;


        Object TRUE_TOK32_tree=null;
        Object FALSE_TOK33_tree=null;
        Object BOOLEAN_TOK34_tree=null;
        Object LPAREN35_tree=null;
        Object RPAREN37_tree=null;
        Object NOF_TOK38_tree=null;
        Object NOT_TOK39_tree=null;
        Object LPAREN40_tree=null;
        Object RPAREN42_tree=null;
        Object LPAREN43_tree=null;
        Object RPAREN45_tree=null;
        Object char_literal50_tree=null;
        Object NODEEQUAL_TOK51_tree=null;
        Object NODEMATCH_TOK52_tree=null;
        Object LPAREN53_tree=null;
        Object RPAREN55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:2: ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN attributeExpr RPAREN | ( NOF_TOK ^| NOT_TOK ^) LPAREN booleanExpr RPAREN | LPAREN conditionalOrExpr RPAREN | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN stringExpr RPAREN )
            int alt10=9;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:4: TRUE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(112,12);
                    TRUE_TOK32=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_TOK32_tree = 
                    (Object)adaptor.create(TRUE_TOK32)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRUE_TOK32_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:113:4: FALSE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(113,13);
                    FALSE_TOK33=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_TOK33_tree = 
                    (Object)adaptor.create(FALSE_TOK33)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FALSE_TOK33_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:4: BOOLEAN_TOK ^ LPAREN attributeExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(114,15);
                    BOOLEAN_TOK34=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanExpr595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_TOK34_tree = 
                    (Object)adaptor.create(BOOLEAN_TOK34)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK34_tree, root_0);
                    }
                    dbg.location(114,17);
                    LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN35_tree = 
                    (Object)adaptor.create(LPAREN35)
                    ;
                    adaptor.addChild(root_0, LPAREN35_tree);
                    }
                    dbg.location(114,24);
                    pushFollow(FOLLOW_attributeExpr_in_booleanExpr600);
                    attributeExpr36=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr36.getTree());
                    dbg.location(114,38);
                    RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN37_tree = 
                    (Object)adaptor.create(RPAREN37)
                    ;
                    adaptor.addChild(root_0, RPAREN37_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:4: ( NOF_TOK ^| NOT_TOK ^) LPAREN booleanExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(115,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:4: ( NOF_TOK ^| NOT_TOK ^)
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NOF_TOK) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==NOT_TOK) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:6: NOF_TOK ^
                            {
                            dbg.location(115,13);
                            NOF_TOK38=(Token)match(input,NOF_TOK,FOLLOW_NOF_TOK_in_booleanExpr609); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOF_TOK38_tree = 
                            (Object)adaptor.create(NOF_TOK38)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOF_TOK38_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:17: NOT_TOK ^
                            {
                            dbg.location(115,24);
                            NOT_TOK39=(Token)match(input,NOT_TOK,FOLLOW_NOT_TOK_in_booleanExpr614); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOT_TOK39_tree = 
                            (Object)adaptor.create(NOT_TOK39)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOT_TOK39_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(115,27);
                    LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN40_tree = 
                    (Object)adaptor.create(LPAREN40)
                    ;
                    adaptor.addChild(root_0, LPAREN40_tree);
                    }
                    dbg.location(115,34);
                    pushFollow(FOLLOW_booleanExpr_in_booleanExpr620);
                    booleanExpr41=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr41.getTree());
                    dbg.location(115,46);
                    RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN42_tree = 
                    (Object)adaptor.create(RPAREN42)
                    ;
                    adaptor.addChild(root_0, RPAREN42_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:4: LPAREN conditionalOrExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(116,4);
                    LPAREN43=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr627); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN43_tree = 
                    (Object)adaptor.create(LPAREN43)
                    ;
                    adaptor.addChild(root_0, LPAREN43_tree);
                    }
                    dbg.location(116,11);
                    pushFollow(FOLLOW_conditionalOrExpr_in_booleanExpr629);
                    conditionalOrExpr44=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr44.getTree());
                    dbg.location(116,29);
                    RPAREN45=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr631); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN45_tree = 
                    (Object)adaptor.create(RPAREN45)
                    ;
                    adaptor.addChild(root_0, RPAREN45_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:117:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(117,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr636);
                    equalityExpr46=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr46.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:118:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(118,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr641);
                    isInOp47=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp47.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:118:13: containsOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(118,13);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr645);
                    containsOp48=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp48.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:4: stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(119,4);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr650);
                    stringExpr49=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr49.getTree());
                    dbg.location(119,15);
                    char_literal50=(Token)match(input,84,FOLLOW_84_in_booleanExpr652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal50_tree = 
                    (Object)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);
                    }
                    dbg.location(119,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:19: ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^)
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NODEEQUAL_TOK) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==NODEMATCH_TOK) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:21: NODEEQUAL_TOK ^
                            {
                            dbg.location(119,34);
                            NODEEQUAL_TOK51=(Token)match(input,NODEEQUAL_TOK,FOLLOW_NODEEQUAL_TOK_in_booleanExpr656); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEEQUAL_TOK51_tree = 
                            (Object)adaptor.create(NODEEQUAL_TOK51)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEEQUAL_TOK51_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:38: NODEMATCH_TOK ^
                            {
                            dbg.location(119,51);
                            NODEMATCH_TOK52=(Token)match(input,NODEMATCH_TOK,FOLLOW_NODEMATCH_TOK_in_booleanExpr661); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEMATCH_TOK52_tree = 
                            (Object)adaptor.create(NODEMATCH_TOK52)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEMATCH_TOK52_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(119,55);
                    LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN53_tree = 
                    (Object)adaptor.create(LPAREN53)
                    ;
                    adaptor.addChild(root_0, LPAREN53_tree);
                    }
                    dbg.location(119,62);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr668);
                    stringExpr54=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr54.getTree());
                    dbg.location(119,73);
                    RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN55_tree = 
                    (Object)adaptor.create(RPAREN55)
                    ;
                    adaptor.addChild(root_0, RPAREN55_tree);
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
        dbg.location(122, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:123:1: booleanBag : BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK56=null;
        Token STRING_CONSTANT_LIST57=null;

        Object BOOLEAN_TOK56_tree=null;
        Object STRING_CONSTANT_LIST57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:2: ( BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:4: BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(124,4);
            BOOLEAN_TOK56=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag682); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK56_tree = 
            (Object)adaptor.create(BOOLEAN_TOK56)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK56_tree);
            }
            dbg.location(124,16);
            STRING_CONSTANT_LIST57=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST57_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST57)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST57_tree);
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
        dbg.location(127, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:129:1: conditionalOrExpr : conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal59=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr58 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr60 =null;


        Object string_literal59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:5: ( conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:7: conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(130,7);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr700);
            conditionalAndExpr58=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr58.getTree());
            dbg.location(130,26);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:26: ( '||' conditionalAndExpr )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==91) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:130:27: '||' conditionalAndExpr
            	    {
            	    dbg.location(130,27);
            	    string_literal59=(Token)match(input,91,FOLLOW_91_in_conditionalOrExpr703); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal59_tree = 
            	    (Object)adaptor.create(string_literal59)
            	    ;
            	    adaptor.addChild(root_0, string_literal59_tree);
            	    }
            	    dbg.location(130,32);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr705);
            	    conditionalAndExpr60=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr60.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(131, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:133:1: conditionalAndExpr : booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal62=null;
        GrammarParser.booleanExpr_return booleanExpr61 =null;

        GrammarParser.booleanExpr_return booleanExpr63 =null;


        Object string_literal62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:5: ( booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:7: booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(134,7);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr725);
            booleanExpr61=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr61.getTree());
            dbg.location(134,19);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:19: ( '&&' booleanExpr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==82) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:20: '&&' booleanExpr
            	    {
            	    dbg.location(134,20);
            	    string_literal62=(Token)match(input,82,FOLLOW_82_in_conditionalAndExpr728); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal62_tree = 
            	    (Object)adaptor.create(string_literal62)
            	    ;
            	    adaptor.addChild(root_0, string_literal62_tree);
            	    }
            	    dbg.location(134,25);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr730);
            	    booleanExpr63=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr63.getTree());

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
        dbg.location(135, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ LPAREN doubleBag RPAREN | stringExpr '.' ISIN_TOK ^ LPAREN stringBag RPAREN | anyUriExpr '.' ISIN_TOK ^ LPAREN anyUriBag RPAREN | dateExpr '.' ISIN_TOK ^ LPAREN dateBag RPAREN | timeExpr '.' ISIN_TOK ^ LPAREN timeBag RPAREN | dateTimeExpr '.' ISIN_TOK ^ LPAREN dateTimeBag RPAREN | base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN | dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN dayTimeDurationBag RPAREN | yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN yearMonthDurationBag RPAREN | x500NameExpr '.' ISIN_TOK ^ LPAREN x500NameBag RPAREN | rfc822NameExpr '.' ISIN_TOK ^ LPAREN rfc822NameBag RPAREN | hexBinaryExpr '.' ISIN_TOK ^ LPAREN hexBinaryBag RPAREN | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN );
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal65=null;
        Token ISIN_TOK66=null;
        Token LPAREN67=null;
        Token RPAREN69=null;
        Token char_literal71=null;
        Token ISIN_TOK72=null;
        Token LPAREN73=null;
        Token RPAREN75=null;
        Token char_literal77=null;
        Token ISIN_TOK78=null;
        Token LPAREN79=null;
        Token RPAREN81=null;
        Token char_literal83=null;
        Token ISIN_TOK84=null;
        Token LPAREN85=null;
        Token RPAREN87=null;
        Token char_literal89=null;
        Token ISIN_TOK90=null;
        Token LPAREN91=null;
        Token RPAREN93=null;
        Token char_literal95=null;
        Token ISIN_TOK96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        Token char_literal101=null;
        Token ISIN_TOK102=null;
        Token LPAREN103=null;
        Token RPAREN105=null;
        Token char_literal107=null;
        Token ISIN_TOK108=null;
        Token LPAREN109=null;
        Token RPAREN111=null;
        Token char_literal113=null;
        Token ISIN_TOK114=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        Token char_literal119=null;
        Token ISIN_TOK120=null;
        Token LPAREN121=null;
        Token RPAREN123=null;
        Token char_literal125=null;
        Token ISIN_TOK126=null;
        Token LPAREN127=null;
        Token RPAREN129=null;
        Token char_literal131=null;
        Token ISIN_TOK132=null;
        Token LPAREN133=null;
        Token RPAREN135=null;
        Token char_literal137=null;
        Token ISIN_TOK138=null;
        Token LPAREN139=null;
        Token RPAREN141=null;
        GrammarParser.doubleExpr_return doubleExpr64 =null;

        GrammarParser.doubleBag_return doubleBag68 =null;

        GrammarParser.stringExpr_return stringExpr70 =null;

        GrammarParser.stringBag_return stringBag74 =null;

        GrammarParser.anyUriExpr_return anyUriExpr76 =null;

        GrammarParser.anyUriBag_return anyUriBag80 =null;

        GrammarParser.dateExpr_return dateExpr82 =null;

        GrammarParser.dateBag_return dateBag86 =null;

        GrammarParser.timeExpr_return timeExpr88 =null;

        GrammarParser.timeBag_return timeBag92 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr94 =null;

        GrammarParser.dateTimeBag_return dateTimeBag98 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr100 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag104 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr106 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag110 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr112 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag116 =null;

        GrammarParser.x500NameExpr_return x500NameExpr118 =null;

        GrammarParser.x500NameBag_return x500NameBag122 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr124 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag128 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr130 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag134 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr136 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag140 =null;


        Object char_literal65_tree=null;
        Object ISIN_TOK66_tree=null;
        Object LPAREN67_tree=null;
        Object RPAREN69_tree=null;
        Object char_literal71_tree=null;
        Object ISIN_TOK72_tree=null;
        Object LPAREN73_tree=null;
        Object RPAREN75_tree=null;
        Object char_literal77_tree=null;
        Object ISIN_TOK78_tree=null;
        Object LPAREN79_tree=null;
        Object RPAREN81_tree=null;
        Object char_literal83_tree=null;
        Object ISIN_TOK84_tree=null;
        Object LPAREN85_tree=null;
        Object RPAREN87_tree=null;
        Object char_literal89_tree=null;
        Object ISIN_TOK90_tree=null;
        Object LPAREN91_tree=null;
        Object RPAREN93_tree=null;
        Object char_literal95_tree=null;
        Object ISIN_TOK96_tree=null;
        Object LPAREN97_tree=null;
        Object RPAREN99_tree=null;
        Object char_literal101_tree=null;
        Object ISIN_TOK102_tree=null;
        Object LPAREN103_tree=null;
        Object RPAREN105_tree=null;
        Object char_literal107_tree=null;
        Object ISIN_TOK108_tree=null;
        Object LPAREN109_tree=null;
        Object RPAREN111_tree=null;
        Object char_literal113_tree=null;
        Object ISIN_TOK114_tree=null;
        Object LPAREN115_tree=null;
        Object RPAREN117_tree=null;
        Object char_literal119_tree=null;
        Object ISIN_TOK120_tree=null;
        Object LPAREN121_tree=null;
        Object RPAREN123_tree=null;
        Object char_literal125_tree=null;
        Object ISIN_TOK126_tree=null;
        Object LPAREN127_tree=null;
        Object RPAREN129_tree=null;
        Object char_literal131_tree=null;
        Object ISIN_TOK132_tree=null;
        Object LPAREN133_tree=null;
        Object RPAREN135_tree=null;
        Object char_literal137_tree=null;
        Object ISIN_TOK138_tree=null;
        Object LPAREN139_tree=null;
        Object RPAREN141_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:2: ( doubleExpr '.' ISIN_TOK ^ LPAREN doubleBag RPAREN | stringExpr '.' ISIN_TOK ^ LPAREN stringBag RPAREN | anyUriExpr '.' ISIN_TOK ^ LPAREN anyUriBag RPAREN | dateExpr '.' ISIN_TOK ^ LPAREN dateBag RPAREN | timeExpr '.' ISIN_TOK ^ LPAREN timeBag RPAREN | dateTimeExpr '.' ISIN_TOK ^ LPAREN dateTimeBag RPAREN | base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN | dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN dayTimeDurationBag RPAREN | yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN yearMonthDurationBag RPAREN | x500NameExpr '.' ISIN_TOK ^ LPAREN x500NameBag RPAREN | rfc822NameExpr '.' ISIN_TOK ^ LPAREN rfc822NameBag RPAREN | hexBinaryExpr '.' ISIN_TOK ^ LPAREN hexBinaryBag RPAREN | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN )
            int alt13=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:5: doubleExpr '.' ISIN_TOK ^ LPAREN doubleBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(138,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp747);
                    doubleExpr64=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr64.getTree());
                    dbg.location(138,16);
                    char_literal65=(Token)match(input,84,FOLLOW_84_in_isInOp749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = 
                    (Object)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);
                    }
                    dbg.location(138,28);
                    ISIN_TOK66=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK66_tree = 
                    (Object)adaptor.create(ISIN_TOK66)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK66_tree, root_0);
                    }
                    dbg.location(138,30);
                    LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN67_tree = 
                    (Object)adaptor.create(LPAREN67)
                    ;
                    adaptor.addChild(root_0, LPAREN67_tree);
                    }
                    dbg.location(138,37);
                    pushFollow(FOLLOW_doubleBag_in_isInOp756);
                    doubleBag68=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag68.getTree());
                    dbg.location(138,47);
                    RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN69_tree = 
                    (Object)adaptor.create(RPAREN69)
                    ;
                    adaptor.addChild(root_0, RPAREN69_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:5: stringExpr '.' ISIN_TOK ^ LPAREN stringBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp764);
                    stringExpr70=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr70.getTree());
                    dbg.location(139,16);
                    char_literal71=(Token)match(input,84,FOLLOW_84_in_isInOp766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);
                    }
                    dbg.location(139,28);
                    ISIN_TOK72=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK72_tree = 
                    (Object)adaptor.create(ISIN_TOK72)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK72_tree, root_0);
                    }
                    dbg.location(139,30);
                    LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN73_tree = 
                    (Object)adaptor.create(LPAREN73)
                    ;
                    adaptor.addChild(root_0, LPAREN73_tree);
                    }
                    dbg.location(139,37);
                    pushFollow(FOLLOW_stringBag_in_isInOp773);
                    stringBag74=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag74.getTree());
                    dbg.location(139,47);
                    RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp775); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN75_tree = 
                    (Object)adaptor.create(RPAREN75)
                    ;
                    adaptor.addChild(root_0, RPAREN75_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:5: anyUriExpr '.' ISIN_TOK ^ LPAREN anyUriBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp781);
                    anyUriExpr76=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr76.getTree());
                    dbg.location(140,16);
                    char_literal77=(Token)match(input,84,FOLLOW_84_in_isInOp783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = 
                    (Object)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    dbg.location(140,28);
                    ISIN_TOK78=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK78_tree = 
                    (Object)adaptor.create(ISIN_TOK78)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK78_tree, root_0);
                    }
                    dbg.location(140,30);
                    LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN79_tree = 
                    (Object)adaptor.create(LPAREN79)
                    ;
                    adaptor.addChild(root_0, LPAREN79_tree);
                    }
                    dbg.location(140,37);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp790);
                    anyUriBag80=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag80.getTree());
                    dbg.location(140,47);
                    RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN81_tree = 
                    (Object)adaptor.create(RPAREN81)
                    ;
                    adaptor.addChild(root_0, RPAREN81_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:5: dateExpr '.' ISIN_TOK ^ LPAREN dateBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp798);
                    dateExpr82=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr82.getTree());
                    dbg.location(141,14);
                    char_literal83=(Token)match(input,84,FOLLOW_84_in_isInOp800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);
                    }
                    dbg.location(141,26);
                    ISIN_TOK84=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK84_tree = 
                    (Object)adaptor.create(ISIN_TOK84)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK84_tree, root_0);
                    }
                    dbg.location(141,28);
                    LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN85_tree = 
                    (Object)adaptor.create(LPAREN85)
                    ;
                    adaptor.addChild(root_0, LPAREN85_tree);
                    }
                    dbg.location(141,35);
                    pushFollow(FOLLOW_dateBag_in_isInOp807);
                    dateBag86=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag86.getTree());
                    dbg.location(141,43);
                    RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN87_tree = 
                    (Object)adaptor.create(RPAREN87)
                    ;
                    adaptor.addChild(root_0, RPAREN87_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:5: timeExpr '.' ISIN_TOK ^ LPAREN timeBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(142,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp815);
                    timeExpr88=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr88.getTree());
                    dbg.location(142,14);
                    char_literal89=(Token)match(input,84,FOLLOW_84_in_isInOp817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);
                    }
                    dbg.location(142,26);
                    ISIN_TOK90=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK90_tree = 
                    (Object)adaptor.create(ISIN_TOK90)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK90_tree, root_0);
                    }
                    dbg.location(142,28);
                    LPAREN91=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN91_tree = 
                    (Object)adaptor.create(LPAREN91)
                    ;
                    adaptor.addChild(root_0, LPAREN91_tree);
                    }
                    dbg.location(142,35);
                    pushFollow(FOLLOW_timeBag_in_isInOp824);
                    timeBag92=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag92.getTree());
                    dbg.location(142,43);
                    RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN93_tree = 
                    (Object)adaptor.create(RPAREN93)
                    ;
                    adaptor.addChild(root_0, RPAREN93_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:143:5: dateTimeExpr '.' ISIN_TOK ^ LPAREN dateTimeBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(143,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp832);
                    dateTimeExpr94=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr94.getTree());
                    dbg.location(143,18);
                    char_literal95=(Token)match(input,84,FOLLOW_84_in_isInOp834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal95_tree = 
                    (Object)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);
                    }
                    dbg.location(143,30);
                    ISIN_TOK96=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK96_tree = 
                    (Object)adaptor.create(ISIN_TOK96)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK96_tree, root_0);
                    }
                    dbg.location(143,32);
                    LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN97_tree = 
                    (Object)adaptor.create(LPAREN97)
                    ;
                    adaptor.addChild(root_0, LPAREN97_tree);
                    }
                    dbg.location(143,39);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp841);
                    dateTimeBag98=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag98.getTree());
                    dbg.location(143,51);
                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN99_tree = 
                    (Object)adaptor.create(RPAREN99)
                    ;
                    adaptor.addChild(root_0, RPAREN99_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:5: base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(144,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp849);
                    base64BinaryExpr100=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr100.getTree());
                    dbg.location(144,22);
                    char_literal101=(Token)match(input,84,FOLLOW_84_in_isInOp851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = 
                    (Object)adaptor.create(char_literal101)
                    ;
                    adaptor.addChild(root_0, char_literal101_tree);
                    }
                    dbg.location(144,34);
                    ISIN_TOK102=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK102_tree = 
                    (Object)adaptor.create(ISIN_TOK102)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK102_tree, root_0);
                    }
                    dbg.location(144,36);
                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN103_tree = 
                    (Object)adaptor.create(LPAREN103)
                    ;
                    adaptor.addChild(root_0, LPAREN103_tree);
                    }
                    dbg.location(144,43);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp858);
                    base64BinaryBag104=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag104.getTree());
                    dbg.location(144,59);
                    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN105_tree = 
                    (Object)adaptor.create(RPAREN105)
                    ;
                    adaptor.addChild(root_0, RPAREN105_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:5: dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN dayTimeDurationBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp866);
                    dayTimeDurationExpr106=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr106.getTree());
                    dbg.location(145,25);
                    char_literal107=(Token)match(input,84,FOLLOW_84_in_isInOp868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = 
                    (Object)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);
                    }
                    dbg.location(145,37);
                    ISIN_TOK108=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK108_tree = 
                    (Object)adaptor.create(ISIN_TOK108)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK108_tree, root_0);
                    }
                    dbg.location(145,39);
                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN109_tree = 
                    (Object)adaptor.create(LPAREN109)
                    ;
                    adaptor.addChild(root_0, LPAREN109_tree);
                    }
                    dbg.location(145,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp875);
                    dayTimeDurationBag110=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag110.getTree());
                    dbg.location(145,65);
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN111_tree = 
                    (Object)adaptor.create(RPAREN111)
                    ;
                    adaptor.addChild(root_0, RPAREN111_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:5: yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN yearMonthDurationBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp883);
                    yearMonthDurationExpr112=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr112.getTree());
                    dbg.location(146,27);
                    char_literal113=(Token)match(input,84,FOLLOW_84_in_isInOp885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);
                    }
                    dbg.location(146,39);
                    ISIN_TOK114=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp887); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK114_tree = 
                    (Object)adaptor.create(ISIN_TOK114)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK114_tree, root_0);
                    }
                    dbg.location(146,41);
                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN115_tree = 
                    (Object)adaptor.create(LPAREN115)
                    ;
                    adaptor.addChild(root_0, LPAREN115_tree);
                    }
                    dbg.location(146,48);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp892);
                    yearMonthDurationBag116=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag116.getTree());
                    dbg.location(146,69);
                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN117_tree = 
                    (Object)adaptor.create(RPAREN117)
                    ;
                    adaptor.addChild(root_0, RPAREN117_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:5: x500NameExpr '.' ISIN_TOK ^ LPAREN x500NameBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(147,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp900);
                    x500NameExpr118=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr118.getTree());
                    dbg.location(147,18);
                    char_literal119=(Token)match(input,84,FOLLOW_84_in_isInOp902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal119_tree = 
                    (Object)adaptor.create(char_literal119)
                    ;
                    adaptor.addChild(root_0, char_literal119_tree);
                    }
                    dbg.location(147,30);
                    ISIN_TOK120=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK120_tree = 
                    (Object)adaptor.create(ISIN_TOK120)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK120_tree, root_0);
                    }
                    dbg.location(147,32);
                    LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN121_tree = 
                    (Object)adaptor.create(LPAREN121)
                    ;
                    adaptor.addChild(root_0, LPAREN121_tree);
                    }
                    dbg.location(147,39);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp909);
                    x500NameBag122=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag122.getTree());
                    dbg.location(147,51);
                    RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN123_tree = 
                    (Object)adaptor.create(RPAREN123)
                    ;
                    adaptor.addChild(root_0, RPAREN123_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:148:5: rfc822NameExpr '.' ISIN_TOK ^ LPAREN rfc822NameBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(148,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp917);
                    rfc822NameExpr124=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr124.getTree());
                    dbg.location(148,20);
                    char_literal125=(Token)match(input,84,FOLLOW_84_in_isInOp919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal125_tree = 
                    (Object)adaptor.create(char_literal125)
                    ;
                    adaptor.addChild(root_0, char_literal125_tree);
                    }
                    dbg.location(148,32);
                    ISIN_TOK126=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK126_tree = 
                    (Object)adaptor.create(ISIN_TOK126)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK126_tree, root_0);
                    }
                    dbg.location(148,34);
                    LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN127_tree = 
                    (Object)adaptor.create(LPAREN127)
                    ;
                    adaptor.addChild(root_0, LPAREN127_tree);
                    }
                    dbg.location(148,41);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp926);
                    rfc822NameBag128=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag128.getTree());
                    dbg.location(148,55);
                    RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN129_tree = 
                    (Object)adaptor.create(RPAREN129)
                    ;
                    adaptor.addChild(root_0, RPAREN129_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:5: hexBinaryExpr '.' ISIN_TOK ^ LPAREN hexBinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(149,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp934);
                    hexBinaryExpr130=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr130.getTree());
                    dbg.location(149,19);
                    char_literal131=(Token)match(input,84,FOLLOW_84_in_isInOp936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal131_tree = 
                    (Object)adaptor.create(char_literal131)
                    ;
                    adaptor.addChild(root_0, char_literal131_tree);
                    }
                    dbg.location(149,31);
                    ISIN_TOK132=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK132_tree = 
                    (Object)adaptor.create(ISIN_TOK132)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK132_tree, root_0);
                    }
                    dbg.location(149,33);
                    LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN133_tree = 
                    (Object)adaptor.create(LPAREN133)
                    ;
                    adaptor.addChild(root_0, LPAREN133_tree);
                    }
                    dbg.location(149,40);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp943);
                    hexBinaryBag134=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag134.getTree());
                    dbg.location(149,53);
                    RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN135_tree = 
                    (Object)adaptor.create(RPAREN135)
                    ;
                    adaptor.addChild(root_0, RPAREN135_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(150,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp957);
                    base64BinaryExpr136=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr136.getTree());
                    dbg.location(150,44);
                    char_literal137=(Token)match(input,84,FOLLOW_84_in_isInOp959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal137_tree = 
                    (Object)adaptor.create(char_literal137)
                    ;
                    adaptor.addChild(root_0, char_literal137_tree);
                    }
                    dbg.location(150,56);
                    ISIN_TOK138=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK138_tree = 
                    (Object)adaptor.create(ISIN_TOK138)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK138_tree, root_0);
                    }
                    dbg.location(150,58);
                    LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN139_tree = 
                    (Object)adaptor.create(LPAREN139)
                    ;
                    adaptor.addChild(root_0, LPAREN139_tree);
                    }
                    dbg.location(150,65);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp966);
                    base64BinaryBag140=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag140.getTree());
                    dbg.location(150,81);
                    RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN141_tree = 
                    (Object)adaptor.create(RPAREN141)
                    ;
                    adaptor.addChild(root_0, RPAREN141_tree);
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
        dbg.location(151, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ LPAREN doubleExpr RPAREN | stringBag '.' CONTAINS_TOK ^ LPAREN stringExpr RPAREN | anyUriBag '.' CONTAINS_TOK ^ LPAREN anyUriExpr RPAREN | dateBag '.' CONTAINS_TOK ^ LPAREN dateExpr RPAREN | timeBag '.' CONTAINS_TOK ^ LPAREN timeExpr RPAREN | dateTimeBag '.' CONTAINS_TOK ^ LPAREN dateTimeExpr RPAREN | base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN | dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameBag '.' CONTAINS_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameBag '.' CONTAINS_TOK ^ LPAREN rfc822NameExpr RPAREN | hexBinaryBag '.' CONTAINS_TOK ^ LPAREN hexBinaryExpr RPAREN | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN );
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal143=null;
        Token CONTAINS_TOK144=null;
        Token LPAREN145=null;
        Token RPAREN147=null;
        Token char_literal149=null;
        Token CONTAINS_TOK150=null;
        Token LPAREN151=null;
        Token RPAREN153=null;
        Token char_literal155=null;
        Token CONTAINS_TOK156=null;
        Token LPAREN157=null;
        Token RPAREN159=null;
        Token char_literal161=null;
        Token CONTAINS_TOK162=null;
        Token LPAREN163=null;
        Token RPAREN165=null;
        Token char_literal167=null;
        Token CONTAINS_TOK168=null;
        Token LPAREN169=null;
        Token RPAREN171=null;
        Token char_literal173=null;
        Token CONTAINS_TOK174=null;
        Token LPAREN175=null;
        Token RPAREN177=null;
        Token char_literal179=null;
        Token CONTAINS_TOK180=null;
        Token LPAREN181=null;
        Token RPAREN183=null;
        Token char_literal185=null;
        Token CONTAINS_TOK186=null;
        Token LPAREN187=null;
        Token RPAREN189=null;
        Token char_literal191=null;
        Token CONTAINS_TOK192=null;
        Token LPAREN193=null;
        Token RPAREN195=null;
        Token char_literal197=null;
        Token CONTAINS_TOK198=null;
        Token LPAREN199=null;
        Token RPAREN201=null;
        Token char_literal203=null;
        Token CONTAINS_TOK204=null;
        Token LPAREN205=null;
        Token RPAREN207=null;
        Token char_literal209=null;
        Token CONTAINS_TOK210=null;
        Token LPAREN211=null;
        Token RPAREN213=null;
        Token char_literal215=null;
        Token CONTAINS_TOK216=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        GrammarParser.doubleBag_return doubleBag142 =null;

        GrammarParser.doubleExpr_return doubleExpr146 =null;

        GrammarParser.stringBag_return stringBag148 =null;

        GrammarParser.stringExpr_return stringExpr152 =null;

        GrammarParser.anyUriBag_return anyUriBag154 =null;

        GrammarParser.anyUriExpr_return anyUriExpr158 =null;

        GrammarParser.dateBag_return dateBag160 =null;

        GrammarParser.dateExpr_return dateExpr164 =null;

        GrammarParser.timeBag_return timeBag166 =null;

        GrammarParser.timeExpr_return timeExpr170 =null;

        GrammarParser.dateTimeBag_return dateTimeBag172 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr176 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag178 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr182 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag184 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr188 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag190 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr194 =null;

        GrammarParser.x500NameBag_return x500NameBag196 =null;

        GrammarParser.x500NameExpr_return x500NameExpr200 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag202 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr206 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag208 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr212 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag214 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr218 =null;


        Object char_literal143_tree=null;
        Object CONTAINS_TOK144_tree=null;
        Object LPAREN145_tree=null;
        Object RPAREN147_tree=null;
        Object char_literal149_tree=null;
        Object CONTAINS_TOK150_tree=null;
        Object LPAREN151_tree=null;
        Object RPAREN153_tree=null;
        Object char_literal155_tree=null;
        Object CONTAINS_TOK156_tree=null;
        Object LPAREN157_tree=null;
        Object RPAREN159_tree=null;
        Object char_literal161_tree=null;
        Object CONTAINS_TOK162_tree=null;
        Object LPAREN163_tree=null;
        Object RPAREN165_tree=null;
        Object char_literal167_tree=null;
        Object CONTAINS_TOK168_tree=null;
        Object LPAREN169_tree=null;
        Object RPAREN171_tree=null;
        Object char_literal173_tree=null;
        Object CONTAINS_TOK174_tree=null;
        Object LPAREN175_tree=null;
        Object RPAREN177_tree=null;
        Object char_literal179_tree=null;
        Object CONTAINS_TOK180_tree=null;
        Object LPAREN181_tree=null;
        Object RPAREN183_tree=null;
        Object char_literal185_tree=null;
        Object CONTAINS_TOK186_tree=null;
        Object LPAREN187_tree=null;
        Object RPAREN189_tree=null;
        Object char_literal191_tree=null;
        Object CONTAINS_TOK192_tree=null;
        Object LPAREN193_tree=null;
        Object RPAREN195_tree=null;
        Object char_literal197_tree=null;
        Object CONTAINS_TOK198_tree=null;
        Object LPAREN199_tree=null;
        Object RPAREN201_tree=null;
        Object char_literal203_tree=null;
        Object CONTAINS_TOK204_tree=null;
        Object LPAREN205_tree=null;
        Object RPAREN207_tree=null;
        Object char_literal209_tree=null;
        Object CONTAINS_TOK210_tree=null;
        Object LPAREN211_tree=null;
        Object RPAREN213_tree=null;
        Object char_literal215_tree=null;
        Object CONTAINS_TOK216_tree=null;
        Object LPAREN217_tree=null;
        Object RPAREN219_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:2: ( doubleBag '.' CONTAINS_TOK ^ LPAREN doubleExpr RPAREN | stringBag '.' CONTAINS_TOK ^ LPAREN stringExpr RPAREN | anyUriBag '.' CONTAINS_TOK ^ LPAREN anyUriExpr RPAREN | dateBag '.' CONTAINS_TOK ^ LPAREN dateExpr RPAREN | timeBag '.' CONTAINS_TOK ^ LPAREN timeExpr RPAREN | dateTimeBag '.' CONTAINS_TOK ^ LPAREN dateTimeExpr RPAREN | base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN | dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameBag '.' CONTAINS_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameBag '.' CONTAINS_TOK ^ LPAREN rfc822NameExpr RPAREN | hexBinaryBag '.' CONTAINS_TOK ^ LPAREN hexBinaryExpr RPAREN | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:5: doubleBag '.' CONTAINS_TOK ^ LPAREN doubleExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(154,5);
                    pushFollow(FOLLOW_doubleBag_in_containsOp980);
                    doubleBag142=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag142.getTree());
                    dbg.location(154,15);
                    char_literal143=(Token)match(input,84,FOLLOW_84_in_containsOp982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal143_tree = 
                    (Object)adaptor.create(char_literal143)
                    ;
                    adaptor.addChild(root_0, char_literal143_tree);
                    }
                    dbg.location(154,31);
                    CONTAINS_TOK144=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK144_tree = 
                    (Object)adaptor.create(CONTAINS_TOK144)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK144_tree, root_0);
                    }
                    dbg.location(154,33);
                    LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN145_tree = 
                    (Object)adaptor.create(LPAREN145)
                    ;
                    adaptor.addChild(root_0, LPAREN145_tree);
                    }
                    dbg.location(154,40);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp989);
                    doubleExpr146=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr146.getTree());
                    dbg.location(154,51);
                    RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN147_tree = 
                    (Object)adaptor.create(RPAREN147)
                    ;
                    adaptor.addChild(root_0, RPAREN147_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:5: stringBag '.' CONTAINS_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(155,5);
                    pushFollow(FOLLOW_stringBag_in_containsOp997);
                    stringBag148=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag148.getTree());
                    dbg.location(155,15);
                    char_literal149=(Token)match(input,84,FOLLOW_84_in_containsOp999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal149_tree = 
                    (Object)adaptor.create(char_literal149)
                    ;
                    adaptor.addChild(root_0, char_literal149_tree);
                    }
                    dbg.location(155,31);
                    CONTAINS_TOK150=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK150_tree = 
                    (Object)adaptor.create(CONTAINS_TOK150)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK150_tree, root_0);
                    }
                    dbg.location(155,33);
                    LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN151_tree = 
                    (Object)adaptor.create(LPAREN151)
                    ;
                    adaptor.addChild(root_0, LPAREN151_tree);
                    }
                    dbg.location(155,40);
                    pushFollow(FOLLOW_stringExpr_in_containsOp1006);
                    stringExpr152=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr152.getTree());
                    dbg.location(155,51);
                    RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN153_tree = 
                    (Object)adaptor.create(RPAREN153)
                    ;
                    adaptor.addChild(root_0, RPAREN153_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:5: anyUriBag '.' CONTAINS_TOK ^ LPAREN anyUriExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(156,5);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp1014);
                    anyUriBag154=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag154.getTree());
                    dbg.location(156,15);
                    char_literal155=(Token)match(input,84,FOLLOW_84_in_containsOp1016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal155_tree = 
                    (Object)adaptor.create(char_literal155)
                    ;
                    adaptor.addChild(root_0, char_literal155_tree);
                    }
                    dbg.location(156,31);
                    CONTAINS_TOK156=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK156_tree = 
                    (Object)adaptor.create(CONTAINS_TOK156)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK156_tree, root_0);
                    }
                    dbg.location(156,33);
                    LPAREN157=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN157_tree = 
                    (Object)adaptor.create(LPAREN157)
                    ;
                    adaptor.addChild(root_0, LPAREN157_tree);
                    }
                    dbg.location(156,40);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp1023);
                    anyUriExpr158=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr158.getTree());
                    dbg.location(156,51);
                    RPAREN159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN159_tree = 
                    (Object)adaptor.create(RPAREN159)
                    ;
                    adaptor.addChild(root_0, RPAREN159_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:5: dateBag '.' CONTAINS_TOK ^ LPAREN dateExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(157,5);
                    pushFollow(FOLLOW_dateBag_in_containsOp1031);
                    dateBag160=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag160.getTree());
                    dbg.location(157,13);
                    char_literal161=(Token)match(input,84,FOLLOW_84_in_containsOp1033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal161_tree = 
                    (Object)adaptor.create(char_literal161)
                    ;
                    adaptor.addChild(root_0, char_literal161_tree);
                    }
                    dbg.location(157,29);
                    CONTAINS_TOK162=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK162_tree = 
                    (Object)adaptor.create(CONTAINS_TOK162)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK162_tree, root_0);
                    }
                    dbg.location(157,31);
                    LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN163_tree = 
                    (Object)adaptor.create(LPAREN163)
                    ;
                    adaptor.addChild(root_0, LPAREN163_tree);
                    }
                    dbg.location(157,38);
                    pushFollow(FOLLOW_dateExpr_in_containsOp1040);
                    dateExpr164=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr164.getTree());
                    dbg.location(157,47);
                    RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN165_tree = 
                    (Object)adaptor.create(RPAREN165)
                    ;
                    adaptor.addChild(root_0, RPAREN165_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:158:5: timeBag '.' CONTAINS_TOK ^ LPAREN timeExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(158,5);
                    pushFollow(FOLLOW_timeBag_in_containsOp1048);
                    timeBag166=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag166.getTree());
                    dbg.location(158,13);
                    char_literal167=(Token)match(input,84,FOLLOW_84_in_containsOp1050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal167_tree = 
                    (Object)adaptor.create(char_literal167)
                    ;
                    adaptor.addChild(root_0, char_literal167_tree);
                    }
                    dbg.location(158,29);
                    CONTAINS_TOK168=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK168_tree = 
                    (Object)adaptor.create(CONTAINS_TOK168)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK168_tree, root_0);
                    }
                    dbg.location(158,31);
                    LPAREN169=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN169_tree = 
                    (Object)adaptor.create(LPAREN169)
                    ;
                    adaptor.addChild(root_0, LPAREN169_tree);
                    }
                    dbg.location(158,38);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1057);
                    timeExpr170=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr170.getTree());
                    dbg.location(158,47);
                    RPAREN171=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN171_tree = 
                    (Object)adaptor.create(RPAREN171)
                    ;
                    adaptor.addChild(root_0, RPAREN171_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:159:5: dateTimeBag '.' CONTAINS_TOK ^ LPAREN dateTimeExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(159,5);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1065);
                    dateTimeBag172=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag172.getTree());
                    dbg.location(159,17);
                    char_literal173=(Token)match(input,84,FOLLOW_84_in_containsOp1067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);
                    }
                    dbg.location(159,33);
                    CONTAINS_TOK174=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK174_tree = 
                    (Object)adaptor.create(CONTAINS_TOK174)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK174_tree, root_0);
                    }
                    dbg.location(159,35);
                    LPAREN175=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN175_tree = 
                    (Object)adaptor.create(LPAREN175)
                    ;
                    adaptor.addChild(root_0, LPAREN175_tree);
                    }
                    dbg.location(159,42);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1074);
                    dateTimeExpr176=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr176.getTree());
                    dbg.location(159,55);
                    RPAREN177=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN177_tree = 
                    (Object)adaptor.create(RPAREN177)
                    ;
                    adaptor.addChild(root_0, RPAREN177_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:5: base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(160,5);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1082);
                    base64BinaryBag178=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag178.getTree());
                    dbg.location(160,21);
                    char_literal179=(Token)match(input,84,FOLLOW_84_in_containsOp1084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal179_tree = 
                    (Object)adaptor.create(char_literal179)
                    ;
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    dbg.location(160,37);
                    CONTAINS_TOK180=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK180_tree = 
                    (Object)adaptor.create(CONTAINS_TOK180)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK180_tree, root_0);
                    }
                    dbg.location(160,39);
                    LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN181_tree = 
                    (Object)adaptor.create(LPAREN181)
                    ;
                    adaptor.addChild(root_0, LPAREN181_tree);
                    }
                    dbg.location(160,46);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1091);
                    base64BinaryExpr182=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr182.getTree());
                    dbg.location(160,63);
                    RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN183_tree = 
                    (Object)adaptor.create(RPAREN183)
                    ;
                    adaptor.addChild(root_0, RPAREN183_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:5: dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN dayTimeDurationExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(161,5);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1099);
                    dayTimeDurationBag184=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag184.getTree());
                    dbg.location(161,24);
                    char_literal185=(Token)match(input,84,FOLLOW_84_in_containsOp1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal185_tree = 
                    (Object)adaptor.create(char_literal185)
                    ;
                    adaptor.addChild(root_0, char_literal185_tree);
                    }
                    dbg.location(161,40);
                    CONTAINS_TOK186=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK186_tree = 
                    (Object)adaptor.create(CONTAINS_TOK186)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK186_tree, root_0);
                    }
                    dbg.location(161,42);
                    LPAREN187=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN187_tree = 
                    (Object)adaptor.create(LPAREN187)
                    ;
                    adaptor.addChild(root_0, LPAREN187_tree);
                    }
                    dbg.location(161,49);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1108);
                    dayTimeDurationExpr188=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr188.getTree());
                    dbg.location(161,69);
                    RPAREN189=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN189_tree = 
                    (Object)adaptor.create(RPAREN189)
                    ;
                    adaptor.addChild(root_0, RPAREN189_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:5: yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN yearMonthDurationExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(162,5);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1116);
                    yearMonthDurationBag190=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag190.getTree());
                    dbg.location(162,26);
                    char_literal191=(Token)match(input,84,FOLLOW_84_in_containsOp1118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal191_tree = 
                    (Object)adaptor.create(char_literal191)
                    ;
                    adaptor.addChild(root_0, char_literal191_tree);
                    }
                    dbg.location(162,42);
                    CONTAINS_TOK192=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK192_tree = 
                    (Object)adaptor.create(CONTAINS_TOK192)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK192_tree, root_0);
                    }
                    dbg.location(162,44);
                    LPAREN193=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN193_tree = 
                    (Object)adaptor.create(LPAREN193)
                    ;
                    adaptor.addChild(root_0, LPAREN193_tree);
                    }
                    dbg.location(162,51);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1125);
                    yearMonthDurationExpr194=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr194.getTree());
                    dbg.location(162,73);
                    RPAREN195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN195_tree = 
                    (Object)adaptor.create(RPAREN195)
                    ;
                    adaptor.addChild(root_0, RPAREN195_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:5: x500NameBag '.' CONTAINS_TOK ^ LPAREN x500NameExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(163,5);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1133);
                    x500NameBag196=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag196.getTree());
                    dbg.location(163,17);
                    char_literal197=(Token)match(input,84,FOLLOW_84_in_containsOp1135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);
                    }
                    dbg.location(163,33);
                    CONTAINS_TOK198=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK198_tree = 
                    (Object)adaptor.create(CONTAINS_TOK198)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK198_tree, root_0);
                    }
                    dbg.location(163,35);
                    LPAREN199=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN199_tree = 
                    (Object)adaptor.create(LPAREN199)
                    ;
                    adaptor.addChild(root_0, LPAREN199_tree);
                    }
                    dbg.location(163,42);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1142);
                    x500NameExpr200=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr200.getTree());
                    dbg.location(163,55);
                    RPAREN201=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN201_tree = 
                    (Object)adaptor.create(RPAREN201)
                    ;
                    adaptor.addChild(root_0, RPAREN201_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:5: rfc822NameBag '.' CONTAINS_TOK ^ LPAREN rfc822NameExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(164,5);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1150);
                    rfc822NameBag202=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag202.getTree());
                    dbg.location(164,19);
                    char_literal203=(Token)match(input,84,FOLLOW_84_in_containsOp1152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal203_tree = 
                    (Object)adaptor.create(char_literal203)
                    ;
                    adaptor.addChild(root_0, char_literal203_tree);
                    }
                    dbg.location(164,35);
                    CONTAINS_TOK204=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK204_tree = 
                    (Object)adaptor.create(CONTAINS_TOK204)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK204_tree, root_0);
                    }
                    dbg.location(164,37);
                    LPAREN205=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN205_tree = 
                    (Object)adaptor.create(LPAREN205)
                    ;
                    adaptor.addChild(root_0, LPAREN205_tree);
                    }
                    dbg.location(164,44);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1159);
                    rfc822NameExpr206=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr206.getTree());
                    dbg.location(164,59);
                    RPAREN207=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN207_tree = 
                    (Object)adaptor.create(RPAREN207)
                    ;
                    adaptor.addChild(root_0, RPAREN207_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:5: hexBinaryBag '.' CONTAINS_TOK ^ LPAREN hexBinaryExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,5);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1167);
                    hexBinaryBag208=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag208.getTree());
                    dbg.location(165,18);
                    char_literal209=(Token)match(input,84,FOLLOW_84_in_containsOp1169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal209_tree = 
                    (Object)adaptor.create(char_literal209)
                    ;
                    adaptor.addChild(root_0, char_literal209_tree);
                    }
                    dbg.location(165,34);
                    CONTAINS_TOK210=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK210_tree = 
                    (Object)adaptor.create(CONTAINS_TOK210)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK210_tree, root_0);
                    }
                    dbg.location(165,36);
                    LPAREN211=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN211_tree = 
                    (Object)adaptor.create(LPAREN211)
                    ;
                    adaptor.addChild(root_0, LPAREN211_tree);
                    }
                    dbg.location(165,43);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1176);
                    hexBinaryExpr212=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr212.getTree());
                    dbg.location(165,57);
                    RPAREN213=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN213_tree = 
                    (Object)adaptor.create(RPAREN213)
                    ;
                    adaptor.addChild(root_0, RPAREN213_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:5: ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(166,27);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1190);
                    base64BinaryBag214=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag214.getTree());
                    dbg.location(166,43);
                    char_literal215=(Token)match(input,84,FOLLOW_84_in_containsOp1192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal215_tree = 
                    (Object)adaptor.create(char_literal215)
                    ;
                    adaptor.addChild(root_0, char_literal215_tree);
                    }
                    dbg.location(166,59);
                    CONTAINS_TOK216=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK216_tree = 
                    (Object)adaptor.create(CONTAINS_TOK216)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK216_tree, root_0);
                    }
                    dbg.location(166,61);
                    LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN217_tree = 
                    (Object)adaptor.create(LPAREN217)
                    ;
                    adaptor.addChild(root_0, LPAREN217_tree);
                    }
                    dbg.location(166,68);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1199);
                    base64BinaryExpr218=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr218.getTree());
                    dbg.location(166,85);
                    RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN219_tree = 
                    (Object)adaptor.create(RPAREN219)
                    ;
                    adaptor.addChild(root_0, RPAREN219_tree);
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
        dbg.location(167, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set221=null;
        Token set224=null;
        Token set227=null;
        Token set230=null;
        Token set233=null;
        Token set236=null;
        Token set239=null;
        Token set242=null;
        Token set245=null;
        Token set248=null;
        Token set251=null;
        Token set254=null;
        GrammarParser.integerExpr_return integerExpr220 =null;

        GrammarParser.integerExpr_return integerExpr222 =null;

        GrammarParser.doubleExpr_return doubleExpr223 =null;

        GrammarParser.doubleExpr_return doubleExpr225 =null;

        GrammarParser.stringExpr_return stringExpr226 =null;

        GrammarParser.stringExpr_return stringExpr228 =null;

        GrammarParser.anyUriExpr_return anyUriExpr229 =null;

        GrammarParser.anyUriExpr_return anyUriExpr231 =null;

        GrammarParser.dateExpr_return dateExpr232 =null;

        GrammarParser.dateExpr_return dateExpr234 =null;

        GrammarParser.timeExpr_return timeExpr235 =null;

        GrammarParser.timeExpr_return timeExpr237 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr238 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr240 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr241 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr243 =null;

        GrammarParser.x500NameExpr_return x500NameExpr244 =null;

        GrammarParser.x500NameExpr_return x500NameExpr246 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr247 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr249 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr250 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr252 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr253 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr255 =null;


        Object set221_tree=null;
        Object set224_tree=null;
        Object set227_tree=null;
        Object set230_tree=null;
        Object set233_tree=null;
        Object set236_tree=null;
        Object set239_tree=null;
        Object set242_tree=null;
        Object set245_tree=null;
        Object set248_tree=null;
        Object set251_tree=null;
        Object set254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr )
            int alt15=12;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1212);
                    integerExpr220=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr220.getTree());
                    dbg.location(170,50);
                    set221=(Token)input.LT(1);

                    set221=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set221)
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

                    dbg.location(170,52);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1237);
                    integerExpr222=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr222.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1242);
                    doubleExpr223=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr223.getTree());
                    dbg.location(171,49);
                    set224=(Token)input.LT(1);

                    set224=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set224)
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

                    dbg.location(171,51);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1267);
                    doubleExpr225=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr225.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1272);
                    stringExpr226=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr226.getTree());
                    dbg.location(172,49);
                    set227=(Token)input.LT(1);

                    set227=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set227)
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

                    dbg.location(172,51);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1297);
                    stringExpr228=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr228.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1302);
                    anyUriExpr229=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr229.getTree());
                    dbg.location(173,49);
                    set230=(Token)input.LT(1);

                    set230=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set230)
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

                    dbg.location(173,51);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1327);
                    anyUriExpr231=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr231.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1332);
                    dateExpr232=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr232.getTree());
                    dbg.location(174,47);
                    set233=(Token)input.LT(1);

                    set233=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set233)
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

                    dbg.location(174,49);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1357);
                    dateExpr234=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr234.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(175,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1362);
                    timeExpr235=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr235.getTree());
                    dbg.location(175,47);
                    set236=(Token)input.LT(1);

                    set236=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set236)
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

                    dbg.location(175,49);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1387);
                    timeExpr237=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr237.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1392);
                    dateTimeExpr238=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr238.getTree());
                    dbg.location(176,51);
                    set239=(Token)input.LT(1);

                    set239=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set239)
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

                    dbg.location(176,53);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1417);
                    dateTimeExpr240=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr240.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1422);
                    yearMonthDurationExpr241=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr241.getTree());
                    dbg.location(177,60);
                    set242=(Token)input.LT(1);

                    set242=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set242)
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

                    dbg.location(177,62);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1447);
                    yearMonthDurationExpr243=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr243.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1452);
                    x500NameExpr244=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr244.getTree());
                    dbg.location(178,51);
                    set245=(Token)input.LT(1);

                    set245=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set245)
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

                    dbg.location(178,53);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1477);
                    x500NameExpr246=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr246.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1482);
                    rfc822NameExpr247=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr247.getTree());
                    dbg.location(179,54);
                    set248=(Token)input.LT(1);

                    set248=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set248)
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

                    dbg.location(179,56);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1508);
                    rfc822NameExpr249=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr249.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:4: dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1513);
                    dayTimeDurationExpr250=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr250.getTree());
                    dbg.location(180,58);
                    set251=(Token)input.LT(1);

                    set251=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set251)
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

                    dbg.location(180,60);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1538);
                    dayTimeDurationExpr252=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr252.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1543);
                    base64BinaryExpr253=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr253.getTree());
                    dbg.location(181,55);
                    set254=(Token)input.LT(1);

                    set254=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set254)
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

                    dbg.location(181,57);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1568);
                    base64BinaryExpr255=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr255.getTree());

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
        dbg.location(182, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN integerExpr RPAREN | doubleExpr '.' REGEXMATCH_TOK ^ LPAREN doubleExpr RPAREN | stringExpr '.' REGEXMATCH_TOK ^ LPAREN stringExpr RPAREN | anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN anyUriExpr RPAREN | dateExpr '.' REGEXMATCH_TOK ^ LPAREN dateExpr RPAREN | timeExpr '.' REGEXMATCH_TOK ^ LPAREN timeExpr RPAREN | dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN dateTimeExpr RPAREN | dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN rfc822NameExpr RPAREN | base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN base64BinaryExpr RPAREN );
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal257=null;
        Token REGEXMATCH_TOK258=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        Token char_literal263=null;
        Token REGEXMATCH_TOK264=null;
        Token LPAREN265=null;
        Token RPAREN267=null;
        Token char_literal269=null;
        Token REGEXMATCH_TOK270=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        Token char_literal275=null;
        Token REGEXMATCH_TOK276=null;
        Token LPAREN277=null;
        Token RPAREN279=null;
        Token char_literal281=null;
        Token REGEXMATCH_TOK282=null;
        Token LPAREN283=null;
        Token RPAREN285=null;
        Token char_literal287=null;
        Token REGEXMATCH_TOK288=null;
        Token LPAREN289=null;
        Token RPAREN291=null;
        Token char_literal293=null;
        Token REGEXMATCH_TOK294=null;
        Token LPAREN295=null;
        Token RPAREN297=null;
        Token char_literal299=null;
        Token REGEXMATCH_TOK300=null;
        Token LPAREN301=null;
        Token RPAREN303=null;
        Token char_literal305=null;
        Token REGEXMATCH_TOK306=null;
        Token LPAREN307=null;
        Token RPAREN309=null;
        Token char_literal311=null;
        Token REGEXMATCH_TOK312=null;
        Token LPAREN313=null;
        Token RPAREN315=null;
        Token char_literal317=null;
        Token REGEXMATCH_TOK318=null;
        Token LPAREN319=null;
        Token RPAREN321=null;
        Token char_literal323=null;
        Token REGEXMATCH_TOK324=null;
        Token LPAREN325=null;
        Token RPAREN327=null;
        GrammarParser.integerExpr_return integerExpr256 =null;

        GrammarParser.integerExpr_return integerExpr260 =null;

        GrammarParser.doubleExpr_return doubleExpr262 =null;

        GrammarParser.doubleExpr_return doubleExpr266 =null;

        GrammarParser.stringExpr_return stringExpr268 =null;

        GrammarParser.stringExpr_return stringExpr272 =null;

        GrammarParser.anyUriExpr_return anyUriExpr274 =null;

        GrammarParser.anyUriExpr_return anyUriExpr278 =null;

        GrammarParser.dateExpr_return dateExpr280 =null;

        GrammarParser.dateExpr_return dateExpr284 =null;

        GrammarParser.timeExpr_return timeExpr286 =null;

        GrammarParser.timeExpr_return timeExpr290 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr292 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr296 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr298 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr302 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr304 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr308 =null;

        GrammarParser.x500NameExpr_return x500NameExpr310 =null;

        GrammarParser.x500NameExpr_return x500NameExpr314 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr316 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr320 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr322 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr326 =null;


        Object char_literal257_tree=null;
        Object REGEXMATCH_TOK258_tree=null;
        Object LPAREN259_tree=null;
        Object RPAREN261_tree=null;
        Object char_literal263_tree=null;
        Object REGEXMATCH_TOK264_tree=null;
        Object LPAREN265_tree=null;
        Object RPAREN267_tree=null;
        Object char_literal269_tree=null;
        Object REGEXMATCH_TOK270_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        Object char_literal275_tree=null;
        Object REGEXMATCH_TOK276_tree=null;
        Object LPAREN277_tree=null;
        Object RPAREN279_tree=null;
        Object char_literal281_tree=null;
        Object REGEXMATCH_TOK282_tree=null;
        Object LPAREN283_tree=null;
        Object RPAREN285_tree=null;
        Object char_literal287_tree=null;
        Object REGEXMATCH_TOK288_tree=null;
        Object LPAREN289_tree=null;
        Object RPAREN291_tree=null;
        Object char_literal293_tree=null;
        Object REGEXMATCH_TOK294_tree=null;
        Object LPAREN295_tree=null;
        Object RPAREN297_tree=null;
        Object char_literal299_tree=null;
        Object REGEXMATCH_TOK300_tree=null;
        Object LPAREN301_tree=null;
        Object RPAREN303_tree=null;
        Object char_literal305_tree=null;
        Object REGEXMATCH_TOK306_tree=null;
        Object LPAREN307_tree=null;
        Object RPAREN309_tree=null;
        Object char_literal311_tree=null;
        Object REGEXMATCH_TOK312_tree=null;
        Object LPAREN313_tree=null;
        Object RPAREN315_tree=null;
        Object char_literal317_tree=null;
        Object REGEXMATCH_TOK318_tree=null;
        Object LPAREN319_tree=null;
        Object RPAREN321_tree=null;
        Object char_literal323_tree=null;
        Object REGEXMATCH_TOK324_tree=null;
        Object LPAREN325_tree=null;
        Object RPAREN327_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:2: ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN integerExpr RPAREN | doubleExpr '.' REGEXMATCH_TOK ^ LPAREN doubleExpr RPAREN | stringExpr '.' REGEXMATCH_TOK ^ LPAREN stringExpr RPAREN | anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN anyUriExpr RPAREN | dateExpr '.' REGEXMATCH_TOK ^ LPAREN dateExpr RPAREN | timeExpr '.' REGEXMATCH_TOK ^ LPAREN timeExpr RPAREN | dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN dateTimeExpr RPAREN | dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN rfc822NameExpr RPAREN | base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN base64BinaryExpr RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:4: integerExpr '.' REGEXMATCH_TOK ^ LPAREN integerExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1580);
                    integerExpr256=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr256.getTree());
                    dbg.location(185,17);
                    char_literal257=(Token)match(input,84,FOLLOW_84_in_regexOp1583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = 
                    (Object)adaptor.create(char_literal257)
                    ;
                    adaptor.addChild(root_0, char_literal257_tree);
                    }
                    dbg.location(185,35);
                    REGEXMATCH_TOK258=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK258_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK258)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK258_tree, root_0);
                    }
                    dbg.location(185,37);
                    LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN259_tree = 
                    (Object)adaptor.create(LPAREN259)
                    ;
                    adaptor.addChild(root_0, LPAREN259_tree);
                    }
                    dbg.location(185,44);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1590);
                    integerExpr260=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr260.getTree());
                    dbg.location(185,56);
                    RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN261_tree = 
                    (Object)adaptor.create(RPAREN261)
                    ;
                    adaptor.addChild(root_0, RPAREN261_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:4: doubleExpr '.' REGEXMATCH_TOK ^ LPAREN doubleExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1597);
                    doubleExpr262=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr262.getTree());
                    dbg.location(186,15);
                    char_literal263=(Token)match(input,84,FOLLOW_84_in_regexOp1599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal263_tree = 
                    (Object)adaptor.create(char_literal263)
                    ;
                    adaptor.addChild(root_0, char_literal263_tree);
                    }
                    dbg.location(186,33);
                    REGEXMATCH_TOK264=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK264_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK264)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK264_tree, root_0);
                    }
                    dbg.location(186,35);
                    LPAREN265=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN265_tree = 
                    (Object)adaptor.create(LPAREN265)
                    ;
                    adaptor.addChild(root_0, LPAREN265_tree);
                    }
                    dbg.location(186,42);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1606);
                    doubleExpr266=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr266.getTree());
                    dbg.location(186,53);
                    RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1608); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN267_tree = 
                    (Object)adaptor.create(RPAREN267)
                    ;
                    adaptor.addChild(root_0, RPAREN267_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: stringExpr '.' REGEXMATCH_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1613);
                    stringExpr268=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr268.getTree());
                    dbg.location(187,15);
                    char_literal269=(Token)match(input,84,FOLLOW_84_in_regexOp1615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = 
                    (Object)adaptor.create(char_literal269)
                    ;
                    adaptor.addChild(root_0, char_literal269_tree);
                    }
                    dbg.location(187,33);
                    REGEXMATCH_TOK270=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK270_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK270)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK270_tree, root_0);
                    }
                    dbg.location(187,35);
                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN271_tree = 
                    (Object)adaptor.create(LPAREN271)
                    ;
                    adaptor.addChild(root_0, LPAREN271_tree);
                    }
                    dbg.location(187,42);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1622);
                    stringExpr272=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr272.getTree());
                    dbg.location(187,53);
                    RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN273_tree = 
                    (Object)adaptor.create(RPAREN273)
                    ;
                    adaptor.addChild(root_0, RPAREN273_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:4: anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN anyUriExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1629);
                    anyUriExpr274=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr274.getTree());
                    dbg.location(188,15);
                    char_literal275=(Token)match(input,84,FOLLOW_84_in_regexOp1631); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal275_tree = 
                    (Object)adaptor.create(char_literal275)
                    ;
                    adaptor.addChild(root_0, char_literal275_tree);
                    }
                    dbg.location(188,33);
                    REGEXMATCH_TOK276=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK276_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK276)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK276_tree, root_0);
                    }
                    dbg.location(188,35);
                    LPAREN277=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN277_tree = 
                    (Object)adaptor.create(LPAREN277)
                    ;
                    adaptor.addChild(root_0, LPAREN277_tree);
                    }
                    dbg.location(188,42);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1638);
                    anyUriExpr278=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr278.getTree());
                    dbg.location(188,53);
                    RPAREN279=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1640); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN279_tree = 
                    (Object)adaptor.create(RPAREN279)
                    ;
                    adaptor.addChild(root_0, RPAREN279_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:4: dateExpr '.' REGEXMATCH_TOK ^ LPAREN dateExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(189,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1645);
                    dateExpr280=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr280.getTree());
                    dbg.location(189,13);
                    char_literal281=(Token)match(input,84,FOLLOW_84_in_regexOp1647); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal281_tree = 
                    (Object)adaptor.create(char_literal281)
                    ;
                    adaptor.addChild(root_0, char_literal281_tree);
                    }
                    dbg.location(189,31);
                    REGEXMATCH_TOK282=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK282_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK282)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK282_tree, root_0);
                    }
                    dbg.location(189,33);
                    LPAREN283=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN283_tree = 
                    (Object)adaptor.create(LPAREN283)
                    ;
                    adaptor.addChild(root_0, LPAREN283_tree);
                    }
                    dbg.location(189,40);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1654);
                    dateExpr284=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr284.getTree());
                    dbg.location(189,49);
                    RPAREN285=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN285_tree = 
                    (Object)adaptor.create(RPAREN285)
                    ;
                    adaptor.addChild(root_0, RPAREN285_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:190:4: timeExpr '.' REGEXMATCH_TOK ^ LPAREN timeExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(190,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1661);
                    timeExpr286=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr286.getTree());
                    dbg.location(190,13);
                    char_literal287=(Token)match(input,84,FOLLOW_84_in_regexOp1663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal287_tree = 
                    (Object)adaptor.create(char_literal287)
                    ;
                    adaptor.addChild(root_0, char_literal287_tree);
                    }
                    dbg.location(190,31);
                    REGEXMATCH_TOK288=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK288_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK288)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK288_tree, root_0);
                    }
                    dbg.location(190,33);
                    LPAREN289=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1668); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN289_tree = 
                    (Object)adaptor.create(LPAREN289)
                    ;
                    adaptor.addChild(root_0, LPAREN289_tree);
                    }
                    dbg.location(190,40);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1670);
                    timeExpr290=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr290.getTree());
                    dbg.location(190,49);
                    RPAREN291=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN291_tree = 
                    (Object)adaptor.create(RPAREN291)
                    ;
                    adaptor.addChild(root_0, RPAREN291_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:4: dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN dateTimeExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(191,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1677);
                    dateTimeExpr292=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr292.getTree());
                    dbg.location(191,17);
                    char_literal293=(Token)match(input,84,FOLLOW_84_in_regexOp1679); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal293_tree = 
                    (Object)adaptor.create(char_literal293)
                    ;
                    adaptor.addChild(root_0, char_literal293_tree);
                    }
                    dbg.location(191,35);
                    REGEXMATCH_TOK294=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK294_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK294)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK294_tree, root_0);
                    }
                    dbg.location(191,37);
                    LPAREN295=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN295_tree = 
                    (Object)adaptor.create(LPAREN295)
                    ;
                    adaptor.addChild(root_0, LPAREN295_tree);
                    }
                    dbg.location(191,44);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1686);
                    dateTimeExpr296=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr296.getTree());
                    dbg.location(191,57);
                    RPAREN297=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN297_tree = 
                    (Object)adaptor.create(RPAREN297)
                    ;
                    adaptor.addChild(root_0, RPAREN297_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:4: dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN dayTimeDurationExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(192,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1693);
                    dayTimeDurationExpr298=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr298.getTree());
                    dbg.location(192,24);
                    char_literal299=(Token)match(input,84,FOLLOW_84_in_regexOp1695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);
                    }
                    dbg.location(192,42);
                    REGEXMATCH_TOK300=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK300_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK300)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK300_tree, root_0);
                    }
                    dbg.location(192,44);
                    LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN301_tree = 
                    (Object)adaptor.create(LPAREN301)
                    ;
                    adaptor.addChild(root_0, LPAREN301_tree);
                    }
                    dbg.location(192,51);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1702);
                    dayTimeDurationExpr302=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr302.getTree());
                    dbg.location(192,71);
                    RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN303_tree = 
                    (Object)adaptor.create(RPAREN303)
                    ;
                    adaptor.addChild(root_0, RPAREN303_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN yearMonthDurationExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1709);
                    yearMonthDurationExpr304=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr304.getTree());
                    dbg.location(193,26);
                    char_literal305=(Token)match(input,84,FOLLOW_84_in_regexOp1711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal305_tree = 
                    (Object)adaptor.create(char_literal305)
                    ;
                    adaptor.addChild(root_0, char_literal305_tree);
                    }
                    dbg.location(193,44);
                    REGEXMATCH_TOK306=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK306_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK306)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK306_tree, root_0);
                    }
                    dbg.location(193,46);
                    LPAREN307=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN307_tree = 
                    (Object)adaptor.create(LPAREN307)
                    ;
                    adaptor.addChild(root_0, LPAREN307_tree);
                    }
                    dbg.location(193,53);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1718);
                    yearMonthDurationExpr308=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr308.getTree());
                    dbg.location(193,75);
                    RPAREN309=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN309_tree = 
                    (Object)adaptor.create(RPAREN309)
                    ;
                    adaptor.addChild(root_0, RPAREN309_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN x500NameExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(194,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1725);
                    x500NameExpr310=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr310.getTree());
                    dbg.location(194,17);
                    char_literal311=(Token)match(input,84,FOLLOW_84_in_regexOp1727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal311_tree = 
                    (Object)adaptor.create(char_literal311)
                    ;
                    adaptor.addChild(root_0, char_literal311_tree);
                    }
                    dbg.location(194,35);
                    REGEXMATCH_TOK312=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK312_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK312)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK312_tree, root_0);
                    }
                    dbg.location(194,37);
                    LPAREN313=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN313_tree = 
                    (Object)adaptor.create(LPAREN313)
                    ;
                    adaptor.addChild(root_0, LPAREN313_tree);
                    }
                    dbg.location(194,44);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1734);
                    x500NameExpr314=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr314.getTree());
                    dbg.location(194,57);
                    RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN315_tree = 
                    (Object)adaptor.create(RPAREN315)
                    ;
                    adaptor.addChild(root_0, RPAREN315_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:4: rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN rfc822NameExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(195,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1741);
                    rfc822NameExpr316=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr316.getTree());
                    dbg.location(195,19);
                    char_literal317=(Token)match(input,84,FOLLOW_84_in_regexOp1743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal317_tree = 
                    (Object)adaptor.create(char_literal317)
                    ;
                    adaptor.addChild(root_0, char_literal317_tree);
                    }
                    dbg.location(195,37);
                    REGEXMATCH_TOK318=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK318_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK318)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK318_tree, root_0);
                    }
                    dbg.location(195,39);
                    LPAREN319=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN319_tree = 
                    (Object)adaptor.create(LPAREN319)
                    ;
                    adaptor.addChild(root_0, LPAREN319_tree);
                    }
                    dbg.location(195,46);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1750);
                    rfc822NameExpr320=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr320.getTree());
                    dbg.location(195,61);
                    RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN321_tree = 
                    (Object)adaptor.create(RPAREN321)
                    ;
                    adaptor.addChild(root_0, RPAREN321_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN base64BinaryExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(196,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1757);
                    base64BinaryExpr322=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr322.getTree());
                    dbg.location(196,21);
                    char_literal323=(Token)match(input,84,FOLLOW_84_in_regexOp1759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = 
                    (Object)adaptor.create(char_literal323)
                    ;
                    adaptor.addChild(root_0, char_literal323_tree);
                    }
                    dbg.location(196,39);
                    REGEXMATCH_TOK324=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK324_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK324)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK324_tree, root_0);
                    }
                    dbg.location(196,41);
                    LPAREN325=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN325_tree = 
                    (Object)adaptor.create(LPAREN325)
                    ;
                    adaptor.addChild(root_0, LPAREN325_tree);
                    }
                    dbg.location(196,48);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1766);
                    base64BinaryExpr326=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr326.getTree());
                    dbg.location(196,65);
                    RPAREN327=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN327_tree = 
                    (Object)adaptor.create(RPAREN327)
                    ;
                    adaptor.addChild(root_0, RPAREN327_tree);
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
        dbg.location(197, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:1: bagOp : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN booleanBag RPAREN | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN integerBag RPAREN | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN doubleBag RPAREN | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN stringBag RPAREN | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateBag RPAREN | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN timeBag RPAREN | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateTimeBag RPAREN | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dayTimeDurationBag RPAREN | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN yearMonthDurationBag RPAREN | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN anyUriBag RPAREN | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN x500NameBag RPAREN | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN rfc822NameBag RPAREN | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN hexBinaryBag RPAREN | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN );
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal329=null;
        Token set330=null;
        Token LPAREN331=null;
        Token RPAREN333=null;
        Token char_literal335=null;
        Token set336=null;
        Token LPAREN337=null;
        Token RPAREN339=null;
        Token char_literal341=null;
        Token set342=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token char_literal347=null;
        Token set348=null;
        Token LPAREN349=null;
        Token RPAREN351=null;
        Token char_literal353=null;
        Token set354=null;
        Token LPAREN355=null;
        Token RPAREN357=null;
        Token char_literal359=null;
        Token set360=null;
        Token LPAREN361=null;
        Token RPAREN363=null;
        Token char_literal365=null;
        Token set366=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        Token char_literal371=null;
        Token set372=null;
        Token LPAREN373=null;
        Token RPAREN375=null;
        Token char_literal377=null;
        Token set378=null;
        Token LPAREN379=null;
        Token RPAREN381=null;
        Token char_literal383=null;
        Token set384=null;
        Token LPAREN385=null;
        Token RPAREN387=null;
        Token char_literal389=null;
        Token set390=null;
        Token LPAREN391=null;
        Token RPAREN393=null;
        Token char_literal395=null;
        Token set396=null;
        Token LPAREN397=null;
        Token RPAREN399=null;
        Token char_literal401=null;
        Token set402=null;
        Token LPAREN403=null;
        Token RPAREN405=null;
        Token char_literal407=null;
        Token set408=null;
        Token LPAREN409=null;
        Token RPAREN411=null;
        Token char_literal413=null;
        Token set414=null;
        Token LPAREN415=null;
        Token RPAREN417=null;
        GrammarParser.booleanBag_return booleanBag328 =null;

        GrammarParser.booleanBag_return booleanBag332 =null;

        GrammarParser.integerBag_return integerBag334 =null;

        GrammarParser.integerBag_return integerBag338 =null;

        GrammarParser.doubleBag_return doubleBag340 =null;

        GrammarParser.doubleBag_return doubleBag344 =null;

        GrammarParser.stringBag_return stringBag346 =null;

        GrammarParser.stringBag_return stringBag350 =null;

        GrammarParser.dateBag_return dateBag352 =null;

        GrammarParser.dateBag_return dateBag356 =null;

        GrammarParser.timeBag_return timeBag358 =null;

        GrammarParser.timeBag_return timeBag362 =null;

        GrammarParser.dateTimeBag_return dateTimeBag364 =null;

        GrammarParser.dateTimeBag_return dateTimeBag368 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag370 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag374 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag376 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag380 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag382 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag386 =null;

        GrammarParser.anyUriBag_return anyUriBag388 =null;

        GrammarParser.anyUriBag_return anyUriBag392 =null;

        GrammarParser.x500NameBag_return x500NameBag394 =null;

        GrammarParser.x500NameBag_return x500NameBag398 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag400 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag404 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag406 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag410 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag412 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag416 =null;


        Object char_literal329_tree=null;
        Object set330_tree=null;
        Object LPAREN331_tree=null;
        Object RPAREN333_tree=null;
        Object char_literal335_tree=null;
        Object set336_tree=null;
        Object LPAREN337_tree=null;
        Object RPAREN339_tree=null;
        Object char_literal341_tree=null;
        Object set342_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object char_literal347_tree=null;
        Object set348_tree=null;
        Object LPAREN349_tree=null;
        Object RPAREN351_tree=null;
        Object char_literal353_tree=null;
        Object set354_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN357_tree=null;
        Object char_literal359_tree=null;
        Object set360_tree=null;
        Object LPAREN361_tree=null;
        Object RPAREN363_tree=null;
        Object char_literal365_tree=null;
        Object set366_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;
        Object char_literal371_tree=null;
        Object set372_tree=null;
        Object LPAREN373_tree=null;
        Object RPAREN375_tree=null;
        Object char_literal377_tree=null;
        Object set378_tree=null;
        Object LPAREN379_tree=null;
        Object RPAREN381_tree=null;
        Object char_literal383_tree=null;
        Object set384_tree=null;
        Object LPAREN385_tree=null;
        Object RPAREN387_tree=null;
        Object char_literal389_tree=null;
        Object set390_tree=null;
        Object LPAREN391_tree=null;
        Object RPAREN393_tree=null;
        Object char_literal395_tree=null;
        Object set396_tree=null;
        Object LPAREN397_tree=null;
        Object RPAREN399_tree=null;
        Object char_literal401_tree=null;
        Object set402_tree=null;
        Object LPAREN403_tree=null;
        Object RPAREN405_tree=null;
        Object char_literal407_tree=null;
        Object set408_tree=null;
        Object LPAREN409_tree=null;
        Object RPAREN411_tree=null;
        Object char_literal413_tree=null;
        Object set414_tree=null;
        Object LPAREN415_tree=null;
        Object RPAREN417_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN booleanBag RPAREN | ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN integerBag RPAREN | ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN doubleBag RPAREN | ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN stringBag RPAREN | ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateBag RPAREN | ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN timeBag RPAREN | ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateTimeBag RPAREN | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN | ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dayTimeDurationBag RPAREN | ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN yearMonthDurationBag RPAREN | ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN anyUriBag RPAREN | ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN x500NameBag RPAREN | ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN rfc822NameBag RPAREN | ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN hexBinaryBag RPAREN | ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN )
            int alt17=15;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==BOOLEAN_TOK) && (synpred3_Grammar())) {
                alt17=1;
            }
            else if ( (LA17_0==INTEGER_TOK) && (synpred4_Grammar())) {
                alt17=2;
            }
            else if ( (LA17_0==BAG_TOK) && (synpred4_Grammar())) {
                alt17=2;
            }
            else if ( (LA17_0==DOUBLE_TOK) && (synpred5_Grammar())) {
                alt17=3;
            }
            else if ( (LA17_0==STRING_TOK) && (synpred6_Grammar())) {
                alt17=4;
            }
            else if ( (LA17_0==ACTION_TOK||LA17_0==ENVIRONMENT_TOK||LA17_0==RESOURCE_TOK||LA17_0==SUBJECT_TOK) && (synpred6_Grammar())) {
                alt17=4;
            }
            else if ( (LA17_0==DATE_TOK) && (synpred7_Grammar())) {
                alt17=5;
            }
            else if ( (LA17_0==TIME_TOK) && (synpred8_Grammar())) {
                alt17=6;
            }
            else if ( (LA17_0==DATETIME_TOK) && (synpred9_Grammar())) {
                alt17=7;
            }
            else if ( (LA17_0==BASE64BINARY_TOK) ) {
                int LA17_10 = input.LA(2);

                if ( (LA17_10==STRING_CONSTANT_LIST) ) {
                    int LA17_17 = input.LA(3);

                    if ( (LA17_17==84) ) {
                        int LA17_18 = input.LA(4);

                        if ( (LA17_18==ATLEASTONEMENBEROF_TOK||LA17_18==SETEQUALS_TOK||LA17_18==SUBSET_TOK) ) {
                            int LA17_19 = input.LA(5);

                            if ( (LA17_19==LPAREN) ) {
                                int LA17_20 = input.LA(6);

                                if ( (LA17_20==BASE64BINARY_TOK) ) {
                                    int LA17_21 = input.LA(7);

                                    if ( (LA17_21==STRING_CONSTANT_LIST) ) {
                                        int LA17_22 = input.LA(8);

                                        if ( (LA17_22==RPAREN) ) {
                                            int LA17_23 = input.LA(9);

                                            if ( (synpred10_Grammar()) ) {
                                                alt17=8;
                                            }
                                            else if ( (synpred17_Grammar()) ) {
                                                alt17=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 17, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 17, 22, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 17, 21, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 20, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 18, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA17_0==DAYTIMEDURATION_TOK) && (synpred11_Grammar())) {
                alt17=9;
            }
            else if ( (LA17_0==YEARMONTHDURATION_TOK) && (synpred12_Grammar())) {
                alt17=10;
            }
            else if ( (LA17_0==ANYURI_TOK) && (synpred13_Grammar())) {
                alt17=11;
            }
            else if ( (LA17_0==X500NAME_TOK) && (synpred14_Grammar())) {
                alt17=12;
            }
            else if ( (LA17_0==RFC822NAME_TOK) && (synpred15_Grammar())) {
                alt17=13;
            }
            else if ( (LA17_0==HEXBINARY_TOK) && (synpred16_Grammar())) {
                alt17=14;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN booleanBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1785);
                    booleanBag328=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag328.getTree());
                    dbg.location(200,31);
                    char_literal329=(Token)match(input,84,FOLLOW_84_in_bagOp1787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal329_tree = 
                    (Object)adaptor.create(char_literal329)
                    ;
                    adaptor.addChild(root_0, char_literal329_tree);
                    }
                    dbg.location(200,90);
                    set330=(Token)input.LT(1);

                    set330=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set330)
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

                    dbg.location(200,92);
                    LPAREN331=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN331_tree = 
                    (Object)adaptor.create(LPAREN331)
                    ;
                    adaptor.addChild(root_0, LPAREN331_tree);
                    }
                    dbg.location(200,99);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1806);
                    booleanBag332=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag332.getTree());
                    dbg.location(200,110);
                    RPAREN333=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN333_tree = 
                    (Object)adaptor.create(RPAREN333)
                    ;
                    adaptor.addChild(root_0, RPAREN333_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN integerBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1819);
                    integerBag334=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag334.getTree());
                    dbg.location(201,31);
                    char_literal335=(Token)match(input,84,FOLLOW_84_in_bagOp1821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal335_tree = 
                    (Object)adaptor.create(char_literal335)
                    ;
                    adaptor.addChild(root_0, char_literal335_tree);
                    }
                    dbg.location(201,91);
                    set336=(Token)input.LT(1);

                    set336=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set336)
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

                    dbg.location(201,93);
                    LPAREN337=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN337_tree = 
                    (Object)adaptor.create(LPAREN337)
                    ;
                    adaptor.addChild(root_0, LPAREN337_tree);
                    }
                    dbg.location(201,101);
                    pushFollow(FOLLOW_integerBag_in_bagOp1842);
                    integerBag338=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag338.getTree());
                    dbg.location(201,112);
                    RPAREN339=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN339_tree = 
                    (Object)adaptor.create(RPAREN339)
                    ;
                    adaptor.addChild(root_0, RPAREN339_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN doubleBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1855);
                    doubleBag340=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag340.getTree());
                    dbg.location(202,29);
                    char_literal341=(Token)match(input,84,FOLLOW_84_in_bagOp1857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal341_tree = 
                    (Object)adaptor.create(char_literal341)
                    ;
                    adaptor.addChild(root_0, char_literal341_tree);
                    }
                    dbg.location(202,89);
                    set342=(Token)input.LT(1);

                    set342=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set342)
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

                    dbg.location(202,91);
                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN343_tree = 
                    (Object)adaptor.create(LPAREN343)
                    ;
                    adaptor.addChild(root_0, LPAREN343_tree);
                    }
                    dbg.location(202,99);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1878);
                    doubleBag344=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag344.getTree());
                    dbg.location(202,109);
                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN345_tree = 
                    (Object)adaptor.create(RPAREN345)
                    ;
                    adaptor.addChild(root_0, RPAREN345_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN stringBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp1892);
                    stringBag346=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag346.getTree());
                    dbg.location(203,30);
                    char_literal347=(Token)match(input,84,FOLLOW_84_in_bagOp1894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal347_tree = 
                    (Object)adaptor.create(char_literal347)
                    ;
                    adaptor.addChild(root_0, char_literal347_tree);
                    }
                    dbg.location(203,90);
                    set348=(Token)input.LT(1);

                    set348=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set348)
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

                    dbg.location(203,92);
                    LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN349_tree = 
                    (Object)adaptor.create(LPAREN349)
                    ;
                    adaptor.addChild(root_0, LPAREN349_tree);
                    }
                    dbg.location(203,100);
                    pushFollow(FOLLOW_stringBag_in_bagOp1915);
                    stringBag350=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag350.getTree());
                    dbg.location(203,110);
                    RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN351_tree = 
                    (Object)adaptor.create(RPAREN351)
                    ;
                    adaptor.addChild(root_0, RPAREN351_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp1929);
                    dateBag352=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag352.getTree());
                    dbg.location(204,26);
                    char_literal353=(Token)match(input,84,FOLLOW_84_in_bagOp1931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal353_tree = 
                    (Object)adaptor.create(char_literal353)
                    ;
                    adaptor.addChild(root_0, char_literal353_tree);
                    }
                    dbg.location(204,86);
                    set354=(Token)input.LT(1);

                    set354=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set354)
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

                    dbg.location(204,88);
                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN355_tree = 
                    (Object)adaptor.create(LPAREN355)
                    ;
                    adaptor.addChild(root_0, LPAREN355_tree);
                    }
                    dbg.location(204,96);
                    pushFollow(FOLLOW_dateBag_in_bagOp1952);
                    dateBag356=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag356.getTree());
                    dbg.location(204,104);
                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN357_tree = 
                    (Object)adaptor.create(RPAREN357)
                    ;
                    adaptor.addChild(root_0, RPAREN357_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN timeBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(205,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp1966);
                    timeBag358=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag358.getTree());
                    dbg.location(205,26);
                    char_literal359=(Token)match(input,84,FOLLOW_84_in_bagOp1968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = 
                    (Object)adaptor.create(char_literal359)
                    ;
                    adaptor.addChild(root_0, char_literal359_tree);
                    }
                    dbg.location(205,86);
                    set360=(Token)input.LT(1);

                    set360=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set360)
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

                    dbg.location(205,88);
                    LPAREN361=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN361_tree = 
                    (Object)adaptor.create(LPAREN361)
                    ;
                    adaptor.addChild(root_0, LPAREN361_tree);
                    }
                    dbg.location(205,96);
                    pushFollow(FOLLOW_timeBag_in_bagOp1989);
                    timeBag362=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag362.getTree());
                    dbg.location(205,104);
                    RPAREN363=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN363_tree = 
                    (Object)adaptor.create(RPAREN363)
                    ;
                    adaptor.addChild(root_0, RPAREN363_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dateTimeBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(206,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2003);
                    dateTimeBag364=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag364.getTree());
                    dbg.location(206,34);
                    char_literal365=(Token)match(input,84,FOLLOW_84_in_bagOp2005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal365_tree = 
                    (Object)adaptor.create(char_literal365)
                    ;
                    adaptor.addChild(root_0, char_literal365_tree);
                    }
                    dbg.location(206,94);
                    set366=(Token)input.LT(1);

                    set366=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set366)
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

                    dbg.location(206,96);
                    LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN367_tree = 
                    (Object)adaptor.create(LPAREN367)
                    ;
                    adaptor.addChild(root_0, LPAREN367_tree);
                    }
                    dbg.location(206,104);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2026);
                    dateTimeBag368=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag368.getTree());
                    dbg.location(206,116);
                    RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN369_tree = 
                    (Object)adaptor.create(RPAREN369)
                    ;
                    adaptor.addChild(root_0, RPAREN369_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(207,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2040);
                    base64BinaryBag370=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag370.getTree());
                    dbg.location(207,42);
                    char_literal371=(Token)match(input,84,FOLLOW_84_in_bagOp2042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = 
                    (Object)adaptor.create(char_literal371)
                    ;
                    adaptor.addChild(root_0, char_literal371_tree);
                    }
                    dbg.location(207,101);
                    set372=(Token)input.LT(1);

                    set372=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set372)
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

                    dbg.location(207,103);
                    LPAREN373=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN373_tree = 
                    (Object)adaptor.create(LPAREN373)
                    ;
                    adaptor.addChild(root_0, LPAREN373_tree);
                    }
                    dbg.location(207,111);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2062);
                    base64BinaryBag374=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag374.getTree());
                    dbg.location(207,127);
                    RPAREN375=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN375_tree = 
                    (Object)adaptor.create(RPAREN375)
                    ;
                    adaptor.addChild(root_0, RPAREN375_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN dayTimeDurationBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(208,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2076);
                    dayTimeDurationBag376=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag376.getTree());
                    dbg.location(208,48);
                    char_literal377=(Token)match(input,84,FOLLOW_84_in_bagOp2078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal377_tree = 
                    (Object)adaptor.create(char_literal377)
                    ;
                    adaptor.addChild(root_0, char_literal377_tree);
                    }
                    dbg.location(208,107);
                    set378=(Token)input.LT(1);

                    set378=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set378)
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

                    dbg.location(208,109);
                    LPAREN379=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN379_tree = 
                    (Object)adaptor.create(LPAREN379)
                    ;
                    adaptor.addChild(root_0, LPAREN379_tree);
                    }
                    dbg.location(208,117);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2098);
                    dayTimeDurationBag380=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag380.getTree());
                    dbg.location(208,136);
                    RPAREN381=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN381_tree = 
                    (Object)adaptor.create(RPAREN381)
                    ;
                    adaptor.addChild(root_0, RPAREN381_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN yearMonthDurationBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(209,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2112);
                    yearMonthDurationBag382=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag382.getTree());
                    dbg.location(209,52);
                    char_literal383=(Token)match(input,84,FOLLOW_84_in_bagOp2114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal383_tree = 
                    (Object)adaptor.create(char_literal383)
                    ;
                    adaptor.addChild(root_0, char_literal383_tree);
                    }
                    dbg.location(209,112);
                    set384=(Token)input.LT(1);

                    set384=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set384)
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

                    dbg.location(209,114);
                    LPAREN385=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN385_tree = 
                    (Object)adaptor.create(LPAREN385)
                    ;
                    adaptor.addChild(root_0, LPAREN385_tree);
                    }
                    dbg.location(209,122);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2135);
                    yearMonthDurationBag386=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag386.getTree());
                    dbg.location(209,143);
                    RPAREN387=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN387_tree = 
                    (Object)adaptor.create(RPAREN387)
                    ;
                    adaptor.addChild(root_0, RPAREN387_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN anyUriBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(210,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2149);
                    anyUriBag388=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag388.getTree());
                    dbg.location(210,30);
                    char_literal389=(Token)match(input,84,FOLLOW_84_in_bagOp2151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal389_tree = 
                    (Object)adaptor.create(char_literal389)
                    ;
                    adaptor.addChild(root_0, char_literal389_tree);
                    }
                    dbg.location(210,90);
                    set390=(Token)input.LT(1);

                    set390=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set390)
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

                    dbg.location(210,92);
                    LPAREN391=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN391_tree = 
                    (Object)adaptor.create(LPAREN391)
                    ;
                    adaptor.addChild(root_0, LPAREN391_tree);
                    }
                    dbg.location(210,100);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2172);
                    anyUriBag392=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag392.getTree());
                    dbg.location(210,110);
                    RPAREN393=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN393_tree = 
                    (Object)adaptor.create(RPAREN393)
                    ;
                    adaptor.addChild(root_0, RPAREN393_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN x500NameBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(211,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2186);
                    x500NameBag394=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag394.getTree());
                    dbg.location(211,34);
                    char_literal395=(Token)match(input,84,FOLLOW_84_in_bagOp2188); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal395_tree = 
                    (Object)adaptor.create(char_literal395)
                    ;
                    adaptor.addChild(root_0, char_literal395_tree);
                    }
                    dbg.location(211,94);
                    set396=(Token)input.LT(1);

                    set396=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set396)
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

                    dbg.location(211,96);
                    LPAREN397=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN397_tree = 
                    (Object)adaptor.create(LPAREN397)
                    ;
                    adaptor.addChild(root_0, LPAREN397_tree);
                    }
                    dbg.location(211,104);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2209);
                    x500NameBag398=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag398.getTree());
                    dbg.location(211,116);
                    RPAREN399=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN399_tree = 
                    (Object)adaptor.create(RPAREN399)
                    ;
                    adaptor.addChild(root_0, RPAREN399_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN rfc822NameBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(212,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2223);
                    rfc822NameBag400=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag400.getTree());
                    dbg.location(212,38);
                    char_literal401=(Token)match(input,84,FOLLOW_84_in_bagOp2225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal401_tree = 
                    (Object)adaptor.create(char_literal401)
                    ;
                    adaptor.addChild(root_0, char_literal401_tree);
                    }
                    dbg.location(212,97);
                    set402=(Token)input.LT(1);

                    set402=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set402)
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

                    dbg.location(212,99);
                    LPAREN403=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN403_tree = 
                    (Object)adaptor.create(LPAREN403)
                    ;
                    adaptor.addChild(root_0, LPAREN403_tree);
                    }
                    dbg.location(212,107);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2245);
                    rfc822NameBag404=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag404.getTree());
                    dbg.location(212,121);
                    RPAREN405=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2247); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN405_tree = 
                    (Object)adaptor.create(RPAREN405)
                    ;
                    adaptor.addChild(root_0, RPAREN405_tree);
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN hexBinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2259);
                    hexBinaryBag406=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag406.getTree());
                    dbg.location(213,36);
                    char_literal407=(Token)match(input,84,FOLLOW_84_in_bagOp2261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal407_tree = 
                    (Object)adaptor.create(char_literal407)
                    ;
                    adaptor.addChild(root_0, char_literal407_tree);
                    }
                    dbg.location(213,96);
                    set408=(Token)input.LT(1);

                    set408=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set408)
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

                    dbg.location(213,98);
                    LPAREN409=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN409_tree = 
                    (Object)adaptor.create(LPAREN409)
                    ;
                    adaptor.addChild(root_0, LPAREN409_tree);
                    }
                    dbg.location(213,106);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2282);
                    hexBinaryBag410=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag410.getTree());
                    dbg.location(213,119);
                    RPAREN411=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN411_tree = 
                    (Object)adaptor.create(RPAREN411)
                    ;
                    adaptor.addChild(root_0, RPAREN411_tree);
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN base64BinaryBag RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(214,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2295);
                    base64BinaryBag412=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag412.getTree());
                    dbg.location(214,41);
                    char_literal413=(Token)match(input,84,FOLLOW_84_in_bagOp2297); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal413_tree = 
                    (Object)adaptor.create(char_literal413)
                    ;
                    adaptor.addChild(root_0, char_literal413_tree);
                    }
                    dbg.location(214,101);
                    set414=(Token)input.LT(1);

                    set414=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set414)
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

                    dbg.location(214,103);
                    LPAREN415=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN415_tree = 
                    (Object)adaptor.create(LPAREN415)
                    ;
                    adaptor.addChild(root_0, LPAREN415_tree);
                    }
                    dbg.location(214,111);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2318);
                    base64BinaryBag416=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag416.getTree());
                    dbg.location(214,127);
                    RPAREN417=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN417_tree = 
                    (Object)adaptor.create(RPAREN417)
                    ;
                    adaptor.addChild(root_0, RPAREN417_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:1: integerExpr : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN RPAREN | anyBag '.' SIZE_TOK ^ LPAREN RPAREN );
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT418=null;
        Token char_literal420=null;
        Token set421=null;
        Token LPAREN422=null;
        Token RPAREN423=null;
        Token char_literal425=null;
        Token SIZE_TOK426=null;
        Token LPAREN427=null;
        Token RPAREN428=null;
        GrammarParser.stringExpr_return stringExpr419 =null;

        GrammarParser.anyBag_return anyBag424 =null;


        Object INTEGER_CONSTANT418_tree=null;
        Object char_literal420_tree=null;
        Object set421_tree=null;
        Object LPAREN422_tree=null;
        Object RPAREN423_tree=null;
        Object char_literal425_tree=null;
        Object SIZE_TOK426_tree=null;
        Object LPAREN427_tree=null;
        Object RPAREN428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:2: ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN RPAREN | anyBag '.' SIZE_TOK ^ LPAREN RPAREN )
            int alt18=3;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            try {
                isCyclicDecision = true;
                alt18 = dfa18.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: INTEGER_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,20);
                    INTEGER_CONSTANT418=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT418_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT418)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(INTEGER_CONSTANT418_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:219:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(219,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2337);
                    stringExpr419=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr419.getTree());
                    dbg.location(219,15);
                    char_literal420=(Token)match(input,84,FOLLOW_84_in_integerExpr2339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal420_tree = 
                    (Object)adaptor.create(char_literal420)
                    ;
                    adaptor.addChild(root_0, char_literal420_tree);
                    }
                    dbg.location(219,50);
                    set421=(Token)input.LT(1);

                    set421=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set421)
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

                    dbg.location(219,52);
                    LPAREN422=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN422_tree = 
                    (Object)adaptor.create(LPAREN422)
                    ;
                    adaptor.addChild(root_0, LPAREN422_tree);
                    }
                    dbg.location(219,60);
                    RPAREN423=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN423_tree = 
                    (Object)adaptor.create(RPAREN423)
                    ;
                    adaptor.addChild(root_0, RPAREN423_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:220:4: anyBag '.' SIZE_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(220,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2360);
                    anyBag424=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag424.getTree());
                    dbg.location(220,11);
                    char_literal425=(Token)match(input,84,FOLLOW_84_in_integerExpr2362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = 
                    (Object)adaptor.create(char_literal425)
                    ;
                    adaptor.addChild(root_0, char_literal425_tree);
                    }
                    dbg.location(220,23);
                    SIZE_TOK426=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK426_tree = 
                    (Object)adaptor.create(SIZE_TOK426)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SIZE_TOK426_tree, root_0);
                    }
                    dbg.location(220,25);
                    LPAREN427=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN427_tree = 
                    (Object)adaptor.create(LPAREN427)
                    ;
                    adaptor.addChild(root_0, LPAREN427_tree);
                    }
                    dbg.location(220,32);
                    RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN428_tree = 
                    (Object)adaptor.create(RPAREN428)
                    ;
                    adaptor.addChild(root_0, RPAREN428_tree);
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
        dbg.location(224, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:1: integerBag : ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN integerExpr ( ',' integerExpr )+ RPAREN ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN integerBag RPAREN )* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK429=null;
        Token STRING_CONSTANT_LIST430=null;
        Token BAG_TOK431=null;
        Token LPAREN432=null;
        Token char_literal434=null;
        Token RPAREN436=null;
        Token char_literal437=null;
        Token set438=null;
        Token LPAREN439=null;
        Token RPAREN441=null;
        GrammarParser.integerExpr_return integerExpr433 =null;

        GrammarParser.integerExpr_return integerExpr435 =null;

        GrammarParser.integerBag_return integerBag440 =null;


        Object INTEGER_TOK429_tree=null;
        Object STRING_CONSTANT_LIST430_tree=null;
        Object BAG_TOK431_tree=null;
        Object LPAREN432_tree=null;
        Object char_literal434_tree=null;
        Object RPAREN436_tree=null;
        Object char_literal437_tree=null;
        Object set438_tree=null;
        Object LPAREN439_tree=null;
        Object RPAREN441_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:2: ( ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN integerExpr ( ',' integerExpr )+ RPAREN ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN integerBag RPAREN )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN integerExpr ( ',' integerExpr )+ RPAREN ) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN integerBag RPAREN )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(226,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN integerExpr ( ',' integerExpr )+ RPAREN )
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==INTEGER_TOK) ) {
                alt20=1;
            }
            else if ( (LA20_0==BAG_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:5: INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    dbg.location(226,5);
                    INTEGER_TOK429=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK429_tree = 
                    (Object)adaptor.create(INTEGER_TOK429)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK429_tree);
                    }
                    dbg.location(226,17);
                    STRING_CONSTANT_LIST430=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST430_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST430)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST430_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:40: BAG_TOK ^ LPAREN integerExpr ( ',' integerExpr )+ RPAREN
                    {
                    dbg.location(226,47);
                    BAG_TOK431=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK431_tree = 
                    (Object)adaptor.create(BAG_TOK431)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BAG_TOK431_tree, root_0);
                    }
                    dbg.location(226,49);
                    LPAREN432=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN432_tree = 
                    (Object)adaptor.create(LPAREN432)
                    ;
                    adaptor.addChild(root_0, LPAREN432_tree);
                    }
                    dbg.location(226,56);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2394);
                    integerExpr433=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr433.getTree());
                    dbg.location(226,68);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:68: ( ',' integerExpr )+
                    int cnt19=0;
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==83) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:70: ',' integerExpr
                    	    {
                    	    dbg.location(226,70);
                    	    char_literal434=(Token)match(input,83,FOLLOW_83_in_integerBag2398); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal434_tree = 
                    	    (Object)adaptor.create(char_literal434)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal434_tree);
                    	    }
                    	    dbg.location(226,74);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2400);
                    	    integerExpr435=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr435.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt19++;
                    } while (true);
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(226,88);
                    RPAREN436=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN436_tree = 
                    (Object)adaptor.create(RPAREN436)
                    ;
                    adaptor.addChild(root_0, RPAREN436_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(226,96);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:96: ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN integerBag RPAREN )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==84) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==INTERSECTION_TOK||LA21_1==UNION_TOK) ) {
                        alt21=1;
                    }


                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:97: '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN integerBag RPAREN
            	    {
            	    dbg.location(226,97);
            	    char_literal437=(Token)match(input,84,FOLLOW_84_in_integerBag2408); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal437_tree = 
            	    (Object)adaptor.create(char_literal437)
            	    ;
            	    adaptor.addChild(root_0, char_literal437_tree);
            	    }
            	    dbg.location(226,133);
            	    set438=(Token)input.LT(1);

            	    set438=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
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

            	    dbg.location(226,135);
            	    LPAREN439=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2421); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LPAREN439_tree = 
            	    (Object)adaptor.create(LPAREN439)
            	    ;
            	    adaptor.addChild(root_0, LPAREN439_tree);
            	    }
            	    dbg.location(226,142);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2423);
            	    integerBag440=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag440.getTree());
            	    dbg.location(226,153);
            	    RPAREN441=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2425); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RPAREN441_tree = 
            	    (Object)adaptor.create(RPAREN441)
            	    ;
            	    adaptor.addChild(root_0, RPAREN441_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
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
        dbg.location(227, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:1: doubleExpr : ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN stringExpr RPAREN );
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT442=null;
        Token DOUBLE_TOK443=null;
        Token LPAREN444=null;
        Token RPAREN446=null;
        GrammarParser.stringExpr_return stringExpr445 =null;


        Object DOUBLE_CONSTANT442_tree=null;
        Object DOUBLE_TOK443_tree=null;
        Object LPAREN444_tree=null;
        Object RPAREN446_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:2: ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN stringExpr RPAREN )
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE_CONSTANT) ) {
                alt22=1;
            }
            else if ( (LA22_0==DOUBLE_TOK) ) {
                alt22=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: DOUBLE_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(230,19);
                    DOUBLE_CONSTANT442=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT442_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT442)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_CONSTANT442_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: DOUBLE_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(231,14);
                    DOUBLE_TOK443=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK443_tree = 
                    (Object)adaptor.create(DOUBLE_TOK443)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK443_tree, root_0);
                    }
                    dbg.location(231,16);
                    LPAREN444=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doubleExpr2447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN444_tree = 
                    (Object)adaptor.create(LPAREN444)
                    ;
                    adaptor.addChild(root_0, LPAREN444_tree);
                    }
                    dbg.location(231,23);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2449);
                    stringExpr445=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr445.getTree());
                    dbg.location(231,34);
                    RPAREN446=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doubleExpr2451); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN446_tree = 
                    (Object)adaptor.create(RPAREN446)
                    ;
                    adaptor.addChild(root_0, RPAREN446_tree);
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
        dbg.location(234, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:1: doubleBag : DOUBLE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK447=null;
        Token STRING_CONSTANT_LIST448=null;

        Object DOUBLE_TOK447_tree=null;
        Object STRING_CONSTANT_LIST448_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:2: ( DOUBLE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: DOUBLE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(236,14);
            DOUBLE_TOK447=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK447_tree = 
            (Object)adaptor.create(DOUBLE_TOK447)
            ;
            root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK447_tree, root_0);
            }
            dbg.location(236,16);
            STRING_CONSTANT_LIST448=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST448_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST448)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST448_tree);
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
        dbg.location(239, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:1: stringExpr : ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN ) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN RPAREN )* ;
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT449=null;
        Token char_literal451=null;
        Token ONEANDONLY_TOK452=null;
        Token LPAREN453=null;
        Token RPAREN454=null;
        Token char_literal455=null;
        Token set456=null;
        Token LPAREN457=null;
        Token RPAREN458=null;
        GrammarParser.stringBag_return stringBag450 =null;


        Object STRING_CONSTANT449_tree=null;
        Object char_literal451_tree=null;
        Object ONEANDONLY_TOK452_tree=null;
        Object LPAREN453_tree=null;
        Object RPAREN454_tree=null;
        Object char_literal455_tree=null;
        Object set456_tree=null;
        Object LPAREN457_tree=null;
        Object RPAREN458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:2: ( ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN ) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN RPAREN )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN ) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN RPAREN )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(242,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==STRING_CONSTANT) ) {
                alt23=1;
            }
            else if ( (LA23_0==ACTION_TOK||LA23_0==ENVIRONMENT_TOK||LA23_0==RESOURCE_TOK||(LA23_0 >= STRING_TOK && LA23_0 <= SUBJECT_TOK)) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:5: STRING_CONSTANT ^
                    {
                    dbg.location(242,20);
                    STRING_CONSTANT449=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT449_tree = 
                    (Object)adaptor.create(STRING_CONSTANT449)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_CONSTANT449_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:5: stringBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    dbg.location(243,5);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2487);
                    stringBag450=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag450.getTree());
                    dbg.location(243,15);
                    char_literal451=(Token)match(input,84,FOLLOW_84_in_stringExpr2489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal451_tree = 
                    (Object)adaptor.create(char_literal451)
                    ;
                    adaptor.addChild(root_0, char_literal451_tree);
                    }
                    dbg.location(243,33);
                    ONEANDONLY_TOK452=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK452_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK452)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK452_tree, root_0);
                    }
                    dbg.location(243,35);
                    LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN453_tree = 
                    (Object)adaptor.create(LPAREN453)
                    ;
                    adaptor.addChild(root_0, LPAREN453_tree);
                    }
                    dbg.location(243,42);
                    RPAREN454=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN454_tree = 
                    (Object)adaptor.create(RPAREN454)
                    ;
                    adaptor.addChild(root_0, RPAREN454_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(244,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:3: ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN RPAREN )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==84) ) {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1 >= NORMALIZESPACE_TOK && LA24_1 <= NORMALIZETOLOWERCASE_TOK)||LA24_1==REQUIRED_TOK) ) {
                        alt24=1;
                    }


                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:4: '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN RPAREN
            	    {
            	    dbg.location(244,4);
            	    char_literal455=(Token)match(input,84,FOLLOW_84_in_stringExpr2502); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal455_tree = 
            	    (Object)adaptor.create(char_literal455)
            	    ;
            	    adaptor.addChild(root_0, char_literal455_tree);
            	    }
            	    dbg.location(244,8);
            	    set456=(Token)input.LT(1);

            	    if ( (input.LA(1) >= NORMALIZESPACE_TOK && input.LA(1) <= NORMALIZETOLOWERCASE_TOK)||input.LA(1)==REQUIRED_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set456)
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

            	    dbg.location(244,72);
            	    LPAREN457=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2517); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LPAREN457_tree = 
            	    (Object)adaptor.create(LPAREN457)
            	    ;
            	    adaptor.addChild(root_0, LPAREN457_tree);
            	    }
            	    dbg.location(244,79);
            	    RPAREN458=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2519); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RPAREN458_tree = 
            	    (Object)adaptor.create(RPAREN458)
            	    ;
            	    adaptor.addChild(root_0, RPAREN458_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(245, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:1: stringBag : ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK459=null;
        Token STRING_CONSTANT_LIST460=null;
        GrammarParser.attributeExpr_return attributeExpr461 =null;


        Object STRING_TOK459_tree=null;
        Object STRING_CONSTANT_LIST460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(247, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:2: ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==STRING_TOK) ) {
                alt25=1;
            }
            else if ( (LA25_0==ACTION_TOK||LA25_0==ENVIRONMENT_TOK||LA25_0==RESOURCE_TOK||LA25_0==SUBJECT_TOK) ) {
                alt25=2;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:4: STRING_TOK ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(248,14);
                    STRING_TOK459=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK459_tree = 
                    (Object)adaptor.create(STRING_TOK459)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_TOK459_tree, root_0);
                    }
                    dbg.location(248,16);
                    STRING_CONSTANT_LIST460=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST460_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST460)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST460_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(249,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringBag2540);
                    attributeExpr461=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr461.getTree());

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
        dbg.location(251, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:254:1: attributeExpr : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set462=null;
        Token char_literal463=null;
        Token LOWERCASEIDENTIFIER464=null;

        Object set462_tree=null;
        Object char_literal463_tree=null;
        Object LOWERCASEIDENTIFIER464_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(254, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(255,64);
            set462=(Token)input.LT(1);

            set462=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set462)
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

            dbg.location(255,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:66: ( '.' LOWERCASEIDENTIFIER )+
            int cnt26=0;
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==84) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==LOWERCASEIDENTIFIER) ) {
                        alt26=1;
                    }


                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:255:67: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(255,67);
            	    char_literal463=(Token)match(input,84,FOLLOW_84_in_attributeExpr2572); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal463_tree = 
            	    (Object)adaptor.create(char_literal463)
            	    ;
            	    adaptor.addChild(root_0, char_literal463_tree);
            	    }
            	    dbg.location(255,71);
            	    LOWERCASEIDENTIFIER464=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2574); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER464_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER464)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER464_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt26++;
            } while (true);
            } finally {dbg.exitSubRule(26);}


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
        dbg.location(256, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:1: anyUriExpr : ( ANYURI_TOK ^ LPAREN stringExpr RPAREN | anyUriBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN | stringExpr '.' URI_TOK ^ LPAREN RPAREN );
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK465=null;
        Token LPAREN466=null;
        Token RPAREN468=null;
        Token char_literal470=null;
        Token ONEANDONLY_TOK471=null;
        Token LPAREN472=null;
        Token RPAREN473=null;
        Token char_literal475=null;
        Token URI_TOK476=null;
        Token LPAREN477=null;
        Token RPAREN478=null;
        GrammarParser.stringExpr_return stringExpr467 =null;

        GrammarParser.anyUriBag_return anyUriBag469 =null;

        GrammarParser.stringExpr_return stringExpr474 =null;


        Object ANYURI_TOK465_tree=null;
        Object LPAREN466_tree=null;
        Object RPAREN468_tree=null;
        Object char_literal470_tree=null;
        Object ONEANDONLY_TOK471_tree=null;
        Object LPAREN472_tree=null;
        Object RPAREN473_tree=null;
        Object char_literal475_tree=null;
        Object URI_TOK476_tree=null;
        Object LPAREN477_tree=null;
        Object RPAREN478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:2: ( ANYURI_TOK ^ LPAREN stringExpr RPAREN | anyUriBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN | stringExpr '.' URI_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:4: ANYURI_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(259,14);
                    ANYURI_TOK465=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK465_tree = 
                    (Object)adaptor.create(ANYURI_TOK465)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK465_tree, root_0);
                    }
                    dbg.location(259,16);
                    LPAREN466=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN466_tree = 
                    (Object)adaptor.create(LPAREN466)
                    ;
                    adaptor.addChild(root_0, LPAREN466_tree);
                    }
                    dbg.location(259,23);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2593);
                    stringExpr467=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr467.getTree());
                    dbg.location(259,34);
                    RPAREN468=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN468_tree = 
                    (Object)adaptor.create(RPAREN468)
                    ;
                    adaptor.addChild(root_0, RPAREN468_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:4: anyUriBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(260,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2600);
                    anyUriBag469=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag469.getTree());
                    dbg.location(260,14);
                    char_literal470=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal470_tree = 
                    (Object)adaptor.create(char_literal470)
                    ;
                    adaptor.addChild(root_0, char_literal470_tree);
                    }
                    dbg.location(260,32);
                    ONEANDONLY_TOK471=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK471_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK471)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK471_tree, root_0);
                    }
                    dbg.location(260,34);
                    LPAREN472=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN472_tree = 
                    (Object)adaptor.create(LPAREN472)
                    ;
                    adaptor.addChild(root_0, LPAREN472_tree);
                    }
                    dbg.location(260,41);
                    RPAREN473=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN473_tree = 
                    (Object)adaptor.create(RPAREN473)
                    ;
                    adaptor.addChild(root_0, RPAREN473_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:261:4: stringExpr '.' URI_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(261,4);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2614);
                    stringExpr474=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr474.getTree());
                    dbg.location(261,15);
                    char_literal475=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal475_tree = 
                    (Object)adaptor.create(char_literal475)
                    ;
                    adaptor.addChild(root_0, char_literal475_tree);
                    }
                    dbg.location(261,26);
                    URI_TOK476=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK476_tree = 
                    (Object)adaptor.create(URI_TOK476)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(URI_TOK476_tree, root_0);
                    }
                    dbg.location(261,28);
                    LPAREN477=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN477_tree = 
                    (Object)adaptor.create(LPAREN477)
                    ;
                    adaptor.addChild(root_0, LPAREN477_tree);
                    }
                    dbg.location(261,35);
                    RPAREN478=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN478_tree = 
                    (Object)adaptor.create(RPAREN478)
                    ;
                    adaptor.addChild(root_0, RPAREN478_tree);
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
        dbg.location(264, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:1: anyUriBag : ANYURI_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK479=null;
        Token STRING_CONSTANT_LIST480=null;

        Object ANYURI_TOK479_tree=null;
        Object STRING_CONSTANT_LIST480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:2: ( ANYURI_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: ANYURI_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(267,14);
            ANYURI_TOK479=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK479_tree = 
            (Object)adaptor.create(ANYURI_TOK479)
            ;
            root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK479_tree, root_0);
            }
            dbg.location(267,16);
            STRING_CONSTANT_LIST480=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2639); if (state.failed) return retval;
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
        dbg.location(269, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:1: dateExpr : ( DATE_TOK ^ LPAREN stringExpr RPAREN | dateBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK481=null;
        Token LPAREN482=null;
        Token RPAREN484=null;
        Token char_literal486=null;
        Token ONEANDONLY_TOK487=null;
        Token LPAREN488=null;
        Token RPAREN489=null;
        GrammarParser.stringExpr_return stringExpr483 =null;

        GrammarParser.dateBag_return dateBag485 =null;


        Object DATE_TOK481_tree=null;
        Object LPAREN482_tree=null;
        Object RPAREN484_tree=null;
        Object char_literal486_tree=null;
        Object ONEANDONLY_TOK487_tree=null;
        Object LPAREN488_tree=null;
        Object RPAREN489_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:2: ( DATE_TOK ^ LPAREN stringExpr RPAREN | dateBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:4: DATE_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(272,12);
                    DATE_TOK481=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK481_tree = 
                    (Object)adaptor.create(DATE_TOK481)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATE_TOK481_tree, root_0);
                    }
                    dbg.location(272,14);
                    LPAREN482=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN482_tree = 
                    (Object)adaptor.create(LPAREN482)
                    ;
                    adaptor.addChild(root_0, LPAREN482_tree);
                    }
                    dbg.location(272,21);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2656);
                    stringExpr483=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr483.getTree());
                    dbg.location(272,32);
                    RPAREN484=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN484_tree = 
                    (Object)adaptor.create(RPAREN484)
                    ;
                    adaptor.addChild(root_0, RPAREN484_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:273:4: dateBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(273,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2663);
                    dateBag485=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag485.getTree());
                    dbg.location(273,12);
                    char_literal486=(Token)match(input,84,FOLLOW_84_in_dateExpr2665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal486_tree = 
                    (Object)adaptor.create(char_literal486)
                    ;
                    adaptor.addChild(root_0, char_literal486_tree);
                    }
                    dbg.location(273,30);
                    ONEANDONLY_TOK487=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK487_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK487)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK487_tree, root_0);
                    }
                    dbg.location(273,32);
                    LPAREN488=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN488_tree = 
                    (Object)adaptor.create(LPAREN488)
                    ;
                    adaptor.addChild(root_0, LPAREN488_tree);
                    }
                    dbg.location(273,39);
                    RPAREN489=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN489_tree = 
                    (Object)adaptor.create(RPAREN489)
                    ;
                    adaptor.addChild(root_0, RPAREN489_tree);
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
        dbg.location(274, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:1: dateBag : DATE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK490=null;
        Token STRING_CONSTANT_LIST491=null;

        Object DATE_TOK490_tree=null;
        Object STRING_CONSTANT_LIST491_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(275, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:2: ( DATE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:4: DATE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(276,12);
            DATE_TOK490=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2682); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK490_tree = 
            (Object)adaptor.create(DATE_TOK490)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATE_TOK490_tree, root_0);
            }
            dbg.location(276,14);
            STRING_CONSTANT_LIST491=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST491_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST491)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST491_tree);
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
        dbg.location(279, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:1: timeExpr : ( TIME_TOK ^ LPAREN stringExpr RPAREN | timeBag '.' ONEANDONLY_TOK LPAREN RPAREN );
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK492=null;
        Token LPAREN493=null;
        Token RPAREN495=null;
        Token char_literal497=null;
        Token ONEANDONLY_TOK498=null;
        Token LPAREN499=null;
        Token RPAREN500=null;
        GrammarParser.stringExpr_return stringExpr494 =null;

        GrammarParser.timeBag_return timeBag496 =null;


        Object TIME_TOK492_tree=null;
        Object LPAREN493_tree=null;
        Object RPAREN495_tree=null;
        Object char_literal497_tree=null;
        Object ONEANDONLY_TOK498_tree=null;
        Object LPAREN499_tree=null;
        Object RPAREN500_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(281, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:2: ( TIME_TOK ^ LPAREN stringExpr RPAREN | timeBag '.' ONEANDONLY_TOK LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:4: TIME_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(282,12);
                    TIME_TOK492=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK492_tree = 
                    (Object)adaptor.create(TIME_TOK492)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TIME_TOK492_tree, root_0);
                    }
                    dbg.location(282,14);
                    LPAREN493=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN493_tree = 
                    (Object)adaptor.create(LPAREN493)
                    ;
                    adaptor.addChild(root_0, LPAREN493_tree);
                    }
                    dbg.location(282,21);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2703);
                    stringExpr494=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr494.getTree());
                    dbg.location(282,32);
                    RPAREN495=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN495_tree = 
                    (Object)adaptor.create(RPAREN495)
                    ;
                    adaptor.addChild(root_0, RPAREN495_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:4: timeBag '.' ONEANDONLY_TOK LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(283,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2710);
                    timeBag496=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag496.getTree());
                    dbg.location(283,12);
                    char_literal497=(Token)match(input,84,FOLLOW_84_in_timeExpr2712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal497_tree = 
                    (Object)adaptor.create(char_literal497)
                    ;
                    adaptor.addChild(root_0, char_literal497_tree);
                    }
                    dbg.location(283,16);
                    ONEANDONLY_TOK498=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK498_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK498)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK498_tree);
                    }
                    dbg.location(283,31);
                    LPAREN499=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN499_tree = 
                    (Object)adaptor.create(LPAREN499)
                    ;
                    adaptor.addChild(root_0, LPAREN499_tree);
                    }
                    dbg.location(283,38);
                    RPAREN500=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN500_tree = 
                    (Object)adaptor.create(RPAREN500)
                    ;
                    adaptor.addChild(root_0, RPAREN500_tree);
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
        dbg.location(284, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:1: timeBag : TIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK501=null;
        Token STRING_CONSTANT_LIST502=null;

        Object TIME_TOK501_tree=null;
        Object STRING_CONSTANT_LIST502_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:2: ( TIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:4: TIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(286,12);
            TIME_TOK501=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag2728); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK501_tree = 
            (Object)adaptor.create(TIME_TOK501)
            ;
            root_0 = (Object)adaptor.becomeRoot(TIME_TOK501_tree, root_0);
            }
            dbg.location(286,14);
            STRING_CONSTANT_LIST502=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag2731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST502_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST502)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST502_tree);
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
        dbg.location(289, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:1: dateTimeExpr : ( DATETIME_TOK ^ LPAREN stringExpr RPAREN | dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK503=null;
        Token LPAREN504=null;
        Token RPAREN506=null;
        Token char_literal508=null;
        Token ONEANDONLY_TOK509=null;
        Token LPAREN510=null;
        Token RPAREN511=null;
        GrammarParser.stringExpr_return stringExpr505 =null;

        GrammarParser.dateTimeBag_return dateTimeBag507 =null;


        Object DATETIME_TOK503_tree=null;
        Object LPAREN504_tree=null;
        Object RPAREN506_tree=null;
        Object char_literal508_tree=null;
        Object ONEANDONLY_TOK509_tree=null;
        Object LPAREN510_tree=null;
        Object RPAREN511_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:292:2: ( DATETIME_TOK ^ LPAREN stringExpr RPAREN | dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:292:4: DATETIME_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(292,16);
                    DATETIME_TOK503=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr2744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK503_tree = 
                    (Object)adaptor.create(DATETIME_TOK503)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK503_tree, root_0);
                    }
                    dbg.location(292,18);
                    LPAREN504=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr2747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN504_tree = 
                    (Object)adaptor.create(LPAREN504)
                    ;
                    adaptor.addChild(root_0, LPAREN504_tree);
                    }
                    dbg.location(292,25);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr2749);
                    stringExpr505=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr505.getTree());
                    dbg.location(292,36);
                    RPAREN506=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr2751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN506_tree = 
                    (Object)adaptor.create(RPAREN506)
                    ;
                    adaptor.addChild(root_0, RPAREN506_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:4: dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(293,4);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr2756);
                    dateTimeBag507=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag507.getTree());
                    dbg.location(293,16);
                    char_literal508=(Token)match(input,84,FOLLOW_84_in_dateTimeExpr2758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal508_tree = 
                    (Object)adaptor.create(char_literal508)
                    ;
                    adaptor.addChild(root_0, char_literal508_tree);
                    }
                    dbg.location(293,34);
                    ONEANDONLY_TOK509=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK509_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK509)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK509_tree, root_0);
                    }
                    dbg.location(293,36);
                    LPAREN510=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr2763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN510_tree = 
                    (Object)adaptor.create(LPAREN510)
                    ;
                    adaptor.addChild(root_0, LPAREN510_tree);
                    }
                    dbg.location(293,43);
                    RPAREN511=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr2765); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN511_tree = 
                    (Object)adaptor.create(RPAREN511)
                    ;
                    adaptor.addChild(root_0, RPAREN511_tree);
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
        dbg.location(294, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:1: dateTimeBag : DATETIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK512=null;
        Token STRING_CONSTANT_LIST513=null;

        Object DATETIME_TOK512_tree=null;
        Object STRING_CONSTANT_LIST513_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:2: ( DATETIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:4: DATETIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(296,16);
            DATETIME_TOK512=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag2775); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK512_tree = 
            (Object)adaptor.create(DATETIME_TOK512)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK512_tree, root_0);
            }
            dbg.location(296,18);
            STRING_CONSTANT_LIST513=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST513_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST513)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST513_tree);
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
        dbg.location(299, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:301:1: base64BinaryExpr : ( BASE64BINARY_TOK ^ LPAREN stringExpr RPAREN | base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK514=null;
        Token LPAREN515=null;
        Token RPAREN517=null;
        Token char_literal519=null;
        Token ONEANDONLY_TOK520=null;
        Token LPAREN521=null;
        Token RPAREN522=null;
        GrammarParser.stringExpr_return stringExpr516 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag518 =null;


        Object BASE64BINARY_TOK514_tree=null;
        Object LPAREN515_tree=null;
        Object RPAREN517_tree=null;
        Object char_literal519_tree=null;
        Object ONEANDONLY_TOK520_tree=null;
        Object LPAREN521_tree=null;
        Object RPAREN522_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:2: ( BASE64BINARY_TOK ^ LPAREN stringExpr RPAREN | base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:4: BASE64BINARY_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(302,20);
                    BASE64BINARY_TOK514=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK514_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK514)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK514_tree, root_0);
                    }
                    dbg.location(302,22);
                    LPAREN515=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr2794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN515_tree = 
                    (Object)adaptor.create(LPAREN515)
                    ;
                    adaptor.addChild(root_0, LPAREN515_tree);
                    }
                    dbg.location(302,29);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr2796);
                    stringExpr516=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr516.getTree());
                    dbg.location(302,40);
                    RPAREN517=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr2798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN517_tree = 
                    (Object)adaptor.create(RPAREN517)
                    ;
                    adaptor.addChild(root_0, RPAREN517_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:303:4: base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(303,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr2803);
                    base64BinaryBag518=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag518.getTree());
                    dbg.location(303,20);
                    char_literal519=(Token)match(input,84,FOLLOW_84_in_base64BinaryExpr2805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal519_tree = 
                    (Object)adaptor.create(char_literal519)
                    ;
                    adaptor.addChild(root_0, char_literal519_tree);
                    }
                    dbg.location(303,38);
                    ONEANDONLY_TOK520=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK520_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK520)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK520_tree, root_0);
                    }
                    dbg.location(303,40);
                    LPAREN521=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr2810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN521_tree = 
                    (Object)adaptor.create(LPAREN521)
                    ;
                    adaptor.addChild(root_0, LPAREN521_tree);
                    }
                    dbg.location(303,47);
                    RPAREN522=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr2812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN522_tree = 
                    (Object)adaptor.create(RPAREN522)
                    ;
                    adaptor.addChild(root_0, RPAREN522_tree);
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
        dbg.location(304, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:1: base64BinaryBag : BASE64BINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK523=null;
        Token STRING_CONSTANT_LIST524=null;

        Object BASE64BINARY_TOK523_tree=null;
        Object STRING_CONSTANT_LIST524_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(305, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:2: ( BASE64BINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:4: BASE64BINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(306,20);
            BASE64BINARY_TOK523=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2822); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK523_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK523)
            ;
            root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK523_tree, root_0);
            }
            dbg.location(306,22);
            STRING_CONSTANT_LIST524=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2825); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST524_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST524)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST524_tree);
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
        dbg.location(310, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:1: dayTimeDurationExpr : ( DAYTIMEDURATION_TOK ^ LPAREN stringExpr RPAREN | dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN RPAREN );
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK525=null;
        Token LPAREN526=null;
        Token RPAREN528=null;
        Token char_literal530=null;
        Token ONEANDONLY_TOK531=null;
        Token LPAREN532=null;
        Token RPAREN533=null;
        GrammarParser.stringExpr_return stringExpr527 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag529 =null;


        Object DAYTIMEDURATION_TOK525_tree=null;
        Object LPAREN526_tree=null;
        Object RPAREN528_tree=null;
        Object char_literal530_tree=null;
        Object ONEANDONLY_TOK531_tree=null;
        Object LPAREN532_tree=null;
        Object RPAREN533_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:2: ( DAYTIMEDURATION_TOK ^ LPAREN stringExpr RPAREN | dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:4: DAYTIMEDURATION_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(313,23);
                    DAYTIMEDURATION_TOK525=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK525_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK525)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK525_tree, root_0);
                    }
                    dbg.location(313,25);
                    LPAREN526=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr2842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN526_tree = 
                    (Object)adaptor.create(LPAREN526)
                    ;
                    adaptor.addChild(root_0, LPAREN526_tree);
                    }
                    dbg.location(313,32);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr2844);
                    stringExpr527=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr527.getTree());
                    dbg.location(313,43);
                    RPAREN528=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr2846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN528_tree = 
                    (Object)adaptor.create(RPAREN528)
                    ;
                    adaptor.addChild(root_0, RPAREN528_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:4: dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(314,22);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2851);
                    dayTimeDurationBag529=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dayTimeDurationBag529.getTree(), root_0);
                    dbg.location(314,24);
                    char_literal530=(Token)match(input,84,FOLLOW_84_in_dayTimeDurationExpr2854); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal530_tree = 
                    (Object)adaptor.create(char_literal530)
                    ;
                    adaptor.addChild(root_0, char_literal530_tree);
                    }
                    dbg.location(314,28);
                    ONEANDONLY_TOK531=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK531_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK531)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK531_tree);
                    }
                    dbg.location(314,43);
                    LPAREN532=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr2858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN532_tree = 
                    (Object)adaptor.create(LPAREN532)
                    ;
                    adaptor.addChild(root_0, LPAREN532_tree);
                    }
                    dbg.location(314,50);
                    RPAREN533=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr2860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN533_tree = 
                    (Object)adaptor.create(RPAREN533)
                    ;
                    adaptor.addChild(root_0, RPAREN533_tree);
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
        dbg.location(315, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:1: dayTimeDurationBag : DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK534=null;
        Token STRING_CONSTANT_LIST535=null;

        Object DAYTIMEDURATION_TOK534_tree=null;
        Object STRING_CONSTANT_LIST535_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:2: ( DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:4: DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(317,23);
            DAYTIMEDURATION_TOK534=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK534_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK534)
            ;
            root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK534_tree, root_0);
            }
            dbg.location(317,25);
            STRING_CONSTANT_LIST535=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2873); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST535_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST535)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST535_tree);
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
        dbg.location(320, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:1: yearMonthDurationExpr : ( YEARMONTHDURATION_TOK ^ LPAREN stringExpr RPAREN | yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK536=null;
        Token LPAREN537=null;
        Token RPAREN539=null;
        Token char_literal541=null;
        Token ONEANDONLY_TOK542=null;
        Token LPAREN543=null;
        Token RPAREN544=null;
        GrammarParser.stringExpr_return stringExpr538 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag540 =null;


        Object YEARMONTHDURATION_TOK536_tree=null;
        Object LPAREN537_tree=null;
        Object RPAREN539_tree=null;
        Object char_literal541_tree=null;
        Object ONEANDONLY_TOK542_tree=null;
        Object LPAREN543_tree=null;
        Object RPAREN544_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:2: ( YEARMONTHDURATION_TOK ^ LPAREN stringExpr RPAREN | yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:4: YEARMONTHDURATION_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(323,25);
                    YEARMONTHDURATION_TOK536=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK536_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK536)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK536_tree, root_0);
                    }
                    dbg.location(323,27);
                    LPAREN537=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr2889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN537_tree = 
                    (Object)adaptor.create(LPAREN537)
                    ;
                    adaptor.addChild(root_0, LPAREN537_tree);
                    }
                    dbg.location(323,34);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr2891);
                    stringExpr538=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr538.getTree());
                    dbg.location(323,45);
                    RPAREN539=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr2893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN539_tree = 
                    (Object)adaptor.create(RPAREN539)
                    ;
                    adaptor.addChild(root_0, RPAREN539_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:4: yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(324,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2898);
                    yearMonthDurationBag540=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag540.getTree());
                    dbg.location(324,25);
                    char_literal541=(Token)match(input,84,FOLLOW_84_in_yearMonthDurationExpr2900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal541_tree = 
                    (Object)adaptor.create(char_literal541)
                    ;
                    adaptor.addChild(root_0, char_literal541_tree);
                    }
                    dbg.location(324,43);
                    ONEANDONLY_TOK542=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK542_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK542)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK542_tree, root_0);
                    }
                    dbg.location(324,45);
                    LPAREN543=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr2905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN543_tree = 
                    (Object)adaptor.create(LPAREN543)
                    ;
                    adaptor.addChild(root_0, LPAREN543_tree);
                    }
                    dbg.location(324,52);
                    RPAREN544=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr2907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN544_tree = 
                    (Object)adaptor.create(RPAREN544)
                    ;
                    adaptor.addChild(root_0, RPAREN544_tree);
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
        dbg.location(325, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:1: yearMonthDurationBag : YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK545=null;
        Token STRING_CONSTANT_LIST546=null;

        Object YEARMONTHDURATION_TOK545_tree=null;
        Object STRING_CONSTANT_LIST546_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:327:2: ( YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:327:4: YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(327,25);
            YEARMONTHDURATION_TOK545=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2917); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK545_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK545)
            ;
            root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK545_tree, root_0);
            }
            dbg.location(327,27);
            STRING_CONSTANT_LIST546=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST546_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST546)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST546_tree);
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
        dbg.location(330, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:1: x500NameExpr : ( X500NAME_TOK ^ LPAREN stringExpr RPAREN | x500NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK547=null;
        Token LPAREN548=null;
        Token RPAREN550=null;
        Token char_literal552=null;
        Token ONEANDONLY_TOK553=null;
        Token LPAREN554=null;
        Token RPAREN555=null;
        GrammarParser.stringExpr_return stringExpr549 =null;

        GrammarParser.x500NameBag_return x500NameBag551 =null;


        Object X500NAME_TOK547_tree=null;
        Object LPAREN548_tree=null;
        Object RPAREN550_tree=null;
        Object char_literal552_tree=null;
        Object ONEANDONLY_TOK553_tree=null;
        Object LPAREN554_tree=null;
        Object RPAREN555_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:2: ( X500NAME_TOK ^ LPAREN stringExpr RPAREN | x500NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:4: X500NAME_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(333,16);
                    X500NAME_TOK547=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr2933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK547_tree = 
                    (Object)adaptor.create(X500NAME_TOK547)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK547_tree, root_0);
                    }
                    dbg.location(333,18);
                    LPAREN548=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr2936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN548_tree = 
                    (Object)adaptor.create(LPAREN548)
                    ;
                    adaptor.addChild(root_0, LPAREN548_tree);
                    }
                    dbg.location(333,25);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr2938);
                    stringExpr549=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr549.getTree());
                    dbg.location(333,36);
                    RPAREN550=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr2940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN550_tree = 
                    (Object)adaptor.create(RPAREN550)
                    ;
                    adaptor.addChild(root_0, RPAREN550_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:4: x500NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(334,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr2945);
                    x500NameBag551=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag551.getTree());
                    dbg.location(334,17);
                    char_literal552=(Token)match(input,84,FOLLOW_84_in_x500NameExpr2948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal552_tree = 
                    (Object)adaptor.create(char_literal552)
                    ;
                    adaptor.addChild(root_0, char_literal552_tree);
                    }
                    dbg.location(334,35);
                    ONEANDONLY_TOK553=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK553_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK553)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK553_tree, root_0);
                    }
                    dbg.location(334,37);
                    LPAREN554=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr2953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN554_tree = 
                    (Object)adaptor.create(LPAREN554)
                    ;
                    adaptor.addChild(root_0, LPAREN554_tree);
                    }
                    dbg.location(334,44);
                    RPAREN555=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr2955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN555_tree = 
                    (Object)adaptor.create(RPAREN555)
                    ;
                    adaptor.addChild(root_0, RPAREN555_tree);
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
        dbg.location(336, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:337:1: x500NameBag : X500NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK556=null;
        Token STRING_CONSTANT_LIST557=null;

        Object X500NAME_TOK556_tree=null;
        Object STRING_CONSTANT_LIST557_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(337, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:2: ( X500NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:4: X500NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(338,16);
            X500NAME_TOK556=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag2966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK556_tree = 
            (Object)adaptor.create(X500NAME_TOK556)
            ;
            root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK556_tree, root_0);
            }
            dbg.location(338,18);
            STRING_CONSTANT_LIST557=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2969); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST557_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST557)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST557_tree);
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
        dbg.location(341, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:1: rfc822NameExpr : ( RFC822NAME_TOK ^ LPAREN stringExpr RPAREN | rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK558=null;
        Token LPAREN559=null;
        Token RPAREN561=null;
        Token char_literal563=null;
        Token ONEANDONLY_TOK564=null;
        Token LPAREN565=null;
        Token RPAREN566=null;
        GrammarParser.stringExpr_return stringExpr560 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag562 =null;


        Object RFC822NAME_TOK558_tree=null;
        Object LPAREN559_tree=null;
        Object RPAREN561_tree=null;
        Object char_literal563_tree=null;
        Object ONEANDONLY_TOK564_tree=null;
        Object LPAREN565_tree=null;
        Object RPAREN566_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:2: ( RFC822NAME_TOK ^ LPAREN stringExpr RPAREN | rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:4: RFC822NAME_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(344,18);
                    RFC822NAME_TOK558=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK558_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK558)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK558_tree, root_0);
                    }
                    dbg.location(344,20);
                    LPAREN559=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr2985); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN559_tree = 
                    (Object)adaptor.create(LPAREN559)
                    ;
                    adaptor.addChild(root_0, LPAREN559_tree);
                    }
                    dbg.location(344,27);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr2987);
                    stringExpr560=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr560.getTree());
                    dbg.location(344,38);
                    RPAREN561=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr2989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN561_tree = 
                    (Object)adaptor.create(RPAREN561)
                    ;
                    adaptor.addChild(root_0, RPAREN561_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:4: rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(345,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr2994);
                    rfc822NameBag562=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag562.getTree());
                    dbg.location(345,18);
                    char_literal563=(Token)match(input,84,FOLLOW_84_in_rfc822NameExpr2996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal563_tree = 
                    (Object)adaptor.create(char_literal563)
                    ;
                    adaptor.addChild(root_0, char_literal563_tree);
                    }
                    dbg.location(345,36);
                    ONEANDONLY_TOK564=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK564_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK564)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK564_tree, root_0);
                    }
                    dbg.location(345,38);
                    LPAREN565=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN565_tree = 
                    (Object)adaptor.create(LPAREN565)
                    ;
                    adaptor.addChild(root_0, LPAREN565_tree);
                    }
                    dbg.location(345,45);
                    RPAREN566=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN566_tree = 
                    (Object)adaptor.create(RPAREN566)
                    ;
                    adaptor.addChild(root_0, RPAREN566_tree);
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
        dbg.location(347, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:348:1: rfc822NameBag : RFC822NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK567=null;
        Token STRING_CONSTANT_LIST568=null;

        Object RFC822NAME_TOK567_tree=null;
        Object STRING_CONSTANT_LIST568_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(348, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:2: ( RFC822NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:4: RFC822NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(349,18);
            RFC822NAME_TOK567=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3014); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK567_tree = 
            (Object)adaptor.create(RFC822NAME_TOK567)
            ;
            root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK567_tree, root_0);
            }
            dbg.location(349,20);
            STRING_CONSTANT_LIST568=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST568_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST568)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST568_tree);
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
        dbg.location(352, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:1: hexBinaryExpr : ( HEXBINARY_TOK ^ LPAREN stringExpr RPAREN | hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN );
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK569=null;
        Token LPAREN570=null;
        Token RPAREN572=null;
        Token char_literal574=null;
        Token ONEANDONLY_TOK575=null;
        Token LPAREN576=null;
        Token RPAREN577=null;
        GrammarParser.stringExpr_return stringExpr571 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag573 =null;


        Object HEXBINARY_TOK569_tree=null;
        Object LPAREN570_tree=null;
        Object RPAREN572_tree=null;
        Object char_literal574_tree=null;
        Object ONEANDONLY_TOK575_tree=null;
        Object LPAREN576_tree=null;
        Object RPAREN577_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:2: ( HEXBINARY_TOK ^ LPAREN stringExpr RPAREN | hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:4: HEXBINARY_TOK ^ LPAREN stringExpr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(355,17);
                    HEXBINARY_TOK569=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK569_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK569)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK569_tree, root_0);
                    }
                    dbg.location(355,19);
                    LPAREN570=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN570_tree = 
                    (Object)adaptor.create(LPAREN570)
                    ;
                    adaptor.addChild(root_0, LPAREN570_tree);
                    }
                    dbg.location(355,26);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr3035);
                    stringExpr571=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr571.getTree());
                    dbg.location(355,37);
                    RPAREN572=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3037); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN572_tree = 
                    (Object)adaptor.create(RPAREN572)
                    ;
                    adaptor.addChild(root_0, RPAREN572_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:4: hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr3042);
                    hexBinaryBag573=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag573.getTree());
                    dbg.location(356,17);
                    char_literal574=(Token)match(input,84,FOLLOW_84_in_hexBinaryExpr3044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal574_tree = 
                    (Object)adaptor.create(char_literal574)
                    ;
                    adaptor.addChild(root_0, char_literal574_tree);
                    }
                    dbg.location(356,35);
                    ONEANDONLY_TOK575=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK575_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK575)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK575_tree, root_0);
                    }
                    dbg.location(356,37);
                    LPAREN576=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN576_tree = 
                    (Object)adaptor.create(LPAREN576)
                    ;
                    adaptor.addChild(root_0, LPAREN576_tree);
                    }
                    dbg.location(356,44);
                    RPAREN577=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN577_tree = 
                    (Object)adaptor.create(RPAREN577)
                    ;
                    adaptor.addChild(root_0, RPAREN577_tree);
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
        dbg.location(357, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:358:1: hexBinaryBag : HEXBINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK578=null;
        Token STRING_CONSTANT_LIST579=null;

        Object HEXBINARY_TOK578_tree=null;
        Object STRING_CONSTANT_LIST579_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:2: ( HEXBINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:4: HEXBINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(359,17);
            HEXBINARY_TOK578=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3061); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK578_tree = 
            (Object)adaptor.create(HEXBINARY_TOK578)
            ;
            root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK578_tree, root_0);
            }
            dbg.location(359,19);
            STRING_CONSTANT_LIST579=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST579_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST579)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST579_tree);
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
        dbg.location(362, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:364:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag580 =null;

        GrammarParser.integerBag_return integerBag581 =null;

        GrammarParser.doubleBag_return doubleBag582 =null;

        GrammarParser.stringBag_return stringBag583 =null;

        GrammarParser.anyUriBag_return anyUriBag584 =null;

        GrammarParser.dateBag_return dateBag585 =null;

        GrammarParser.timeBag_return timeBag586 =null;

        GrammarParser.dateTimeBag_return dateTimeBag587 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag588 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag589 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag590 =null;

        GrammarParser.x500NameBag_return x500NameBag591 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag592 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag593 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag3077);
                    booleanBag580=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag580.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag3081);
                    integerBag581=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag581.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag3085);
                    doubleBag582=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag582.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag3089);
                    stringBag583=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag583.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag3093);
                    anyUriBag584=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag584.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(365,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag3097);
                    dateBag585=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag585.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(366,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag3102);
                    timeBag586=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag586.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(366,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag3106);
                    dateTimeBag587=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag587.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(366,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag3110);
                    base64BinaryBag588=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag588.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(366,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag3114);
                    dayTimeDurationBag589=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag589.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(367,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag3119);
                    yearMonthDurationBag590=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag590.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(367,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag3124);
                    x500NameBag591=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag591.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:368:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(368,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag3129);
                    rfc822NameBag592=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag592.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:368:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(368,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag3133);
                    hexBinaryBag593=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag593.getTree());

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
        dbg.location(369, 1);

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
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:6: base64BinaryExpr
        {
        dbg.location(150,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred1_Grammar952);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:6: base64BinaryExpr
        {
        dbg.location(166,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred2_Grammar1185);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:5: booleanBag
        {
        dbg.location(200,5);
        pushFollow(FOLLOW_booleanBag_in_synpred3_Grammar1780);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:5: integerBag
        {
        dbg.location(201,5);
        pushFollow(FOLLOW_integerBag_in_synpred4_Grammar1814);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:5: doubleBag
        {
        dbg.location(202,5);
        pushFollow(FOLLOW_doubleBag_in_synpred5_Grammar1850);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:5: stringBag
        {
        dbg.location(203,5);
        pushFollow(FOLLOW_stringBag_in_synpred6_Grammar1886);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:5: dateBag
        {
        dbg.location(204,5);
        pushFollow(FOLLOW_dateBag_in_synpred7_Grammar1923);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:5: timeBag
        {
        dbg.location(205,5);
        pushFollow(FOLLOW_timeBag_in_synpred8_Grammar1960);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:5: dateTimeBag
        {
        dbg.location(206,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred9_Grammar1997);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:5: base64BinaryBag
        {
        dbg.location(207,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred10_Grammar2034);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:5: dayTimeDurationBag
        {
        dbg.location(208,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2070);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:5: yearMonthDurationBag
        {
        dbg.location(209,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2106);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:5: anyUriBag
        {
        dbg.location(210,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred13_Grammar2143);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:5: x500NameBag
        {
        dbg.location(211,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred14_Grammar2180);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:5: rfc822NameBag
        {
        dbg.location(212,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred15_Grammar2217);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:5: hexBinaryBag
        {
        dbg.location(213,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred16_Grammar2253);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:5: base64BinaryBag
        {
        dbg.location(214,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred17_Grammar2290);
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA10_eotS =
        "\u0104\uffff";
    static final String DFA10_eofS =
        "\u0104\uffff";
    static final String DFA10_minS =
        "\1\5\2\uffff\1\53\3\uffff\1\124\1\105\1\124\13\53\1\124\1\uffff"+
        "\1\47\1\124\1\52\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1"+
        "\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\5\1\124\1\uffff"+
        "\2\53\1\uffff\1\25\1\124\1\25\1\100\1\105\1\124\1\25\1\100\1\105"+
        "\1\124\1\25\1\100\1\105\1\124\1\25\1\100\1\105\1\124\1\25\1\100"+
        "\1\105\1\124\1\25\1\100\1\105\1\124\1\25\1\100\1\105\1\124\1\25"+
        "\1\100\1\105\1\124\1\25\1\100\1\105\1\124\1\25\1\100\1\105\1\124"+
        "\1\25\2\100\1\53\1\uffff\1\25\1\62\2\124\1\52\1\53\1\62\2\124\1"+
        "\52\1\53\1\62\2\124\1\52\1\53\1\62\2\124\1\52\1\53\1\62\2\124\1"+
        "\52\1\53\1\62\2\124\1\52\1\53\1\62\2\124\1\52\1\53\1\62\2\124\1"+
        "\52\1\53\1\62\2\124\1\52\1\53\1\62\2\124\1\52\2\124\1\100\1\53\1"+
        "\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53"+
        "\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1"+
        "\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100"+
        "\1\53\1\66\2\124\1\100\1\53\1\52\1\124\1\100\1\53\1\52\1\124\1\100"+
        "\1\53\1\52\1\124\1\100\1\53\1\52\1\124\1\100\1\53\1\52\1\124\1\100"+
        "\1\53\1\52\1\124\1\100\1\53\1\52\1\124\1\100\1\53\1\52\1\124\1\100"+
        "\1\53\1\52\1\124\1\100\1\53\1\52\36\100";
    static final String DFA10_maxS =
        "\1\121\2\uffff\1\105\3\uffff\1\131\1\105\1\124\13\105\1\131\1\uffff"+
        "\1\116\1\124\1\52\1\124\1\107\1\124\1\107\1\124\1\107\1\124\1\107"+
        "\1\124\1\107\1\124\1\107\1\124\1\107\1\124\1\107\1\124\1\107\1\124"+
        "\1\107\1\124\1\uffff\2\53\1\uffff\1\103\1\124\1\103\1\124\1\105"+
        "\1\124\1\103\1\124\1\105\1\124\1\103\1\124\1\105\1\124\1\103\1\124"+
        "\1\105\1\124\1\103\1\124\1\105\1\124\1\103\1\124\1\105\1\124\1\103"+
        "\1\124\1\105\1\124\1\103\1\124\1\105\1\124\1\103\1\124\1\105\1\124"+
        "\1\103\1\124\1\105\1\124\1\103\2\100\1\53\1\uffff\1\103\1\74\1\131"+
        "\1\124\1\52\1\53\1\74\1\131\1\124\1\52\1\53\1\74\1\131\1\124\1\52"+
        "\1\53\1\74\1\131\1\124\1\52\1\53\1\74\1\131\1\124\1\52\1\53\1\74"+
        "\1\131\1\124\1\52\1\53\1\74\1\131\1\124\1\52\1\53\1\74\1\131\1\124"+
        "\1\52\1\53\1\74\1\131\1\124\1\52\1\53\1\74\1\131\1\124\1\52\2\131"+
        "\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124"+
        "\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124"+
        "\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124\1\100\1\53\1\66\1\124"+
        "\1\100\1\53\1\66\1\124\1\131\1\100\1\53\1\66\1\131\1\100\1\53\1"+
        "\66\1\131\1\100\1\53\1\66\1\131\1\100\1\53\1\66\1\131\1\100\1\53"+
        "\1\66\1\131\1\100\1\53\1\66\1\131\1\100\1\53\1\66\1\131\1\100\1"+
        "\53\1\66\1\131\1\100\1\53\1\66\1\131\1\100\1\53\1\66\1\124\1\100"+
        "\1\124\1\100\1\124\1\100\1\124\1\100\1\124\1\100\1\124\1\100\1\124"+
        "\1\100\1\124\1\100\1\124\1\100\1\124\1\100\12\124";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\17\uffff\1\3\30\uffff\1\7\2"+
        "\uffff\1\11\56\uffff\1\10\u00a2\uffff";
    static final String DFA10_specialS =
        "\u0104\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\11\7\uffff\1\13\2\uffff\1\6\1\17\1\3\3\uffff\1\16\1\14\1"+
            "\20\3\uffff\1\25\1\12\1\11\2\uffff\1\2\1\uffff\1\24\2\uffff"+
            "\2\6\3\uffff\1\5\5\uffff\1\4\2\uffff\1\4\10\uffff\1\11\1\23"+
            "\5\uffff\1\7\1\uffff\1\10\1\11\2\uffff\1\15\1\1\4\uffff\1\22"+
            "\1\21",
            "",
            "",
            "\1\26\31\uffff\1\6",
            "",
            "",
            "",
            "\1\27\5\6",
            "\1\30",
            "\1\31",
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
            "\1\57\5\6",
            "",
            "\1\6\1\uffff\1\57\4\uffff\1\6\2\62\1\uffff\2\60\10\uffff\1"+
            "\60\21\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\70\30\uffff\1\70\36\uffff\1\70\6\uffff\1\66\1\uffff\1\67"+
            "\1\70",
            "\1\71",
            "\1\74\30\uffff\1\74\36\uffff\1\74\6\uffff\1\72\1\uffff\1\73"+
            "\1\74",
            "\1\75",
            "\1\100\30\uffff\1\100\36\uffff\1\100\6\uffff\1\76\1\uffff\1"+
            "\77\1\100",
            "\1\101",
            "\1\104\30\uffff\1\104\36\uffff\1\104\6\uffff\1\102\1\uffff"+
            "\1\103\1\104",
            "\1\105",
            "\1\110\30\uffff\1\110\36\uffff\1\110\6\uffff\1\106\1\uffff"+
            "\1\107\1\110",
            "\1\111",
            "\1\114\30\uffff\1\114\36\uffff\1\114\6\uffff\1\112\1\uffff"+
            "\1\113\1\114",
            "\1\115",
            "\1\120\30\uffff\1\120\36\uffff\1\120\6\uffff\1\116\1\uffff"+
            "\1\117\1\120",
            "\1\121",
            "\1\124\30\uffff\1\124\36\uffff\1\124\6\uffff\1\122\1\uffff"+
            "\1\123\1\124",
            "\1\125",
            "\1\130\30\uffff\1\130\36\uffff\1\130\6\uffff\1\126\1\uffff"+
            "\1\127\1\130",
            "\1\131",
            "\1\134\30\uffff\1\134\36\uffff\1\134\6\uffff\1\132\1\uffff"+
            "\1\133\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\141\40\uffff\1\140\14\uffff\1\6",
            "\1\142",
            "\1\141\55\uffff\1\6",
            "\1\144\23\uffff\1\143",
            "\1\145",
            "\1\146",
            "\1\141\40\uffff\1\147\14\uffff\1\6",
            "\1\151\23\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\141\40\uffff\1\154\14\uffff\1\6",
            "\1\156\23\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\141\40\uffff\1\161\14\uffff\1\6",
            "\1\163\23\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\141\40\uffff\1\166\14\uffff\1\6",
            "\1\170\23\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\141\40\uffff\1\173\14\uffff\1\6",
            "\1\175\23\uffff\1\174",
            "\1\176",
            "\1\177",
            "\1\141\40\uffff\1\u0080\14\uffff\1\6",
            "\1\u0082\23\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084",
            "\1\141\40\uffff\1\u0085\14\uffff\1\6",
            "\1\u0087\23\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\141\40\uffff\1\u008a\14\uffff\1\6",
            "\1\u008c\23\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\141\40\uffff\1\u008f\14\uffff\1\6",
            "\1\u0091\23\uffff\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\141\40\uffff\1\57\14\uffff\1\6",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\141\24\uffff\1\64\13\uffff\1\140\14\uffff\1\6",
            "\2\u0097\10\uffff\1\u0097",
            "\1\57\5\6",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\2\u009b\10\uffff\1\u009b",
            "\1\57\5\6",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\2\u009f\10\uffff\1\u009f",
            "\1\57\5\6",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\2\u00a3\10\uffff\1\u00a3",
            "\1\57\5\6",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\2\u00a7\10\uffff\1\u00a7",
            "\1\57\5\6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\2\u00ab\10\uffff\1\u00ab",
            "\1\57\5\6",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\2\u00af\10\uffff\1\u00af",
            "\1\57\5\6",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\2\u00b3\10\uffff\1\u00b3",
            "\1\57\5\6",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\2\u00b7\10\uffff\1\u00b7",
            "\1\57\5\6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\2\u00bb\10\uffff\1\u00bb",
            "\1\57\5\6",
            "\1\u00bc",
            "\1\u00bd",
            "\1\27\5\6",
            "\1\57\5\6",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
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
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\27\5\6",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u0099\13\uffff\1\u00c0",
            "\1\57\5\6",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u009d\13\uffff\1\u00c4",
            "\1\57\5\6",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00a1\13\uffff\1\u00c8",
            "\1\57\5\6",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00a5\13\uffff\1\u00cc",
            "\1\57\5\6",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00a9\13\uffff\1\u00d0",
            "\1\57\5\6",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00ad\13\uffff\1\u00d4",
            "\1\57\5\6",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00b1\13\uffff\1\u00d8",
            "\1\57\5\6",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00b5\13\uffff\1\u00dc",
            "\1\57\5\6",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00b9\13\uffff\1\u00e0",
            "\1\57\5\6",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00bd\13\uffff\1\u00e4",
            "\1\144\23\uffff\1\143",
            "\1\u00fa",
            "\1\151\23\uffff\1\150",
            "\1\u00fb",
            "\1\156\23\uffff\1\155",
            "\1\u00fc",
            "\1\163\23\uffff\1\162",
            "\1\u00fd",
            "\1\170\23\uffff\1\167",
            "\1\u00fe",
            "\1\175\23\uffff\1\174",
            "\1\u00ff",
            "\1\u0082\23\uffff\1\u0081",
            "\1\u0100",
            "\1\u0087\23\uffff\1\u0086",
            "\1\u0101",
            "\1\u008c\23\uffff\1\u008b",
            "\1\u0102",
            "\1\u0091\23\uffff\1\u0090",
            "\1\u0103",
            "\1\144\23\uffff\1\143",
            "\1\151\23\uffff\1\150",
            "\1\156\23\uffff\1\155",
            "\1\163\23\uffff\1\162",
            "\1\170\23\uffff\1\167",
            "\1\175\23\uffff\1\174",
            "\1\u0082\23\uffff\1\u0081",
            "\1\u0087\23\uffff\1\u0086",
            "\1\u008c\23\uffff\1\u008b",
            "\1\u0091\23\uffff\1\u0090"
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
            return "111:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN attributeExpr RPAREN | ( NOF_TOK ^| NOT_TOK ^) LPAREN booleanExpr RPAREN | LPAREN conditionalOrExpr RPAREN | equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN stringExpr RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA13_eotS =
        "\72\uffff";
    static final String DFA13_eofS =
        "\72\uffff";
    static final String DFA13_minS =
        "\1\5\1\uffff\1\124\1\105\1\124\4\uffff\1\53\5\uffff\1\51\1\124\1"+
        "\52\1\5\1\124\1\53\1\uffff\1\66\1\124\1\100\1\105\1\124\1\66\1\100"+
        "\1\53\1\52\1\62\2\124\1\52\1\53\1\124\1\100\1\53\1\51\1\66\1\124"+
        "\1\100\1\124\1\100\2\53\1\52\1\124\1\100\1\21\1\100\1\105\2\100"+
        "\1\0\2\uffff";
    static final String DFA13_maxS =
        "\1\121\1\uffff\1\124\1\105\1\124\4\uffff\1\105\5\uffff\1\116\1\124"+
        "\1\52\1\107\1\124\1\53\1\uffff\1\66\2\124\1\105\1\124\1\66\1\100"+
        "\1\53\1\66\1\74\2\124\1\52\1\53\1\124\1\100\1\53\1\51\1\66\1\124"+
        "\1\100\1\124\1\100\2\53\1\66\2\124\1\21\1\100\1\105\1\124\1\100"+
        "\1\0\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\6\uffff\1\2\42\uffff\1\7\1\15";
    static final String DFA13_specialS =
        "\67\uffff\1\0\2\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\7\uffff\1\5\3\uffff\1\11\4\uffff\1\10\1\6\1\12\3\uffff"+
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
            "\1\32\30\uffff\1\32\36\uffff\1\32\6\uffff\1\30\1\uffff\1\31"+
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\35",
            "\1\36",
            "\1\40\23\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\27\13\uffff\1\35",
            "\2\46\10\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\17",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\17",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\51\13\uffff\1\56",
            "\1\47",
            "\1\40\23\uffff\1\37",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\40\23\uffff\1\37",
            "\1\67",
            "\1\uffff",
            "",
            ""
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
            return "137:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ LPAREN doubleBag RPAREN | stringExpr '.' ISIN_TOK ^ LPAREN stringBag RPAREN | anyUriExpr '.' ISIN_TOK ^ LPAREN anyUriBag RPAREN | dateExpr '.' ISIN_TOK ^ LPAREN dateBag RPAREN | timeExpr '.' ISIN_TOK ^ LPAREN timeBag RPAREN | dateTimeExpr '.' ISIN_TOK ^ LPAREN dateTimeBag RPAREN | base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN | dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN dayTimeDurationBag RPAREN | yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN yearMonthDurationBag RPAREN | x500NameExpr '.' ISIN_TOK ^ LPAREN x500NameBag RPAREN | rfc822NameExpr '.' ISIN_TOK ^ LPAREN rfc822NameBag RPAREN | hexBinaryExpr '.' ISIN_TOK ^ LPAREN hexBinaryBag RPAREN | ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN base64BinaryBag RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_55 = input.LA(1);

                         
                        int index13_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 56;}

                        else if ( (synpred1_Grammar()) ) {s = 57;}

                         
                        input.seek(index13_55);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA14_eotS =
        "\54\uffff";
    static final String DFA14_eofS =
        "\54\uffff";
    static final String DFA14_minS =
        "\1\5\6\uffff\1\105\5\uffff\1\124\1\25\1\53\1\21\1\53\1\5\1\124\1"+
        "\100\1\105\1\124\1\66\1\62\1\100\1\124\1\52\2\53\1\0\1\66\1\124"+
        "\2\100\2\uffff\1\53\1\52\3\100\1\0\1\100";
    static final String DFA14_maxS =
        "\1\121\6\uffff\1\105\5\uffff\1\124\1\25\1\53\1\21\1\105\1\107\2"+
        "\124\1\105\1\124\1\66\1\74\1\100\1\124\1\52\2\53\1\0\1\66\1\124"+
        "\2\100\2\uffff\1\53\1\66\1\100\1\124\1\100\1\0\1\124";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\26\uffff\1\7\1\15\7\uffff";
    static final String DFA14_specialS =
        "\36\uffff\1\1\13\uffff\1\0\1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\7\uffff\1\3\3\uffff\1\7\4\uffff\1\6\1\4\1\10\4\uffff\1"+
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
            "\1\26\30\uffff\1\26\36\uffff\1\26\6\uffff\1\24\1\uffff\1\25"+
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
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "\1\51",
            "\1\40\13\uffff\1\45",
            "\1\52",
            "\1\31\23\uffff\1\30",
            "\1\53",
            "\1\uffff",
            "\1\31\23\uffff\1\30"
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
            return "153:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ LPAREN doubleExpr RPAREN | stringBag '.' CONTAINS_TOK ^ LPAREN stringExpr RPAREN | anyUriBag '.' CONTAINS_TOK ^ LPAREN anyUriExpr RPAREN | dateBag '.' CONTAINS_TOK ^ LPAREN dateExpr RPAREN | timeBag '.' CONTAINS_TOK ^ LPAREN timeExpr RPAREN | dateTimeBag '.' CONTAINS_TOK ^ LPAREN dateTimeExpr RPAREN | base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN | dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameBag '.' CONTAINS_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameBag '.' CONTAINS_TOK ^ LPAREN rfc822NameExpr RPAREN | hexBinaryBag '.' CONTAINS_TOK ^ LPAREN hexBinaryExpr RPAREN | ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN base64BinaryExpr RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_42 = input.LA(1);

                         
                        int index14_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index14_42);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA14_30 = input.LA(1);

                         
                        int index14_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index14_30);

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
        "\70\uffff";
    static final String DFA15_eofS =
        "\70\uffff";
    static final String DFA15_minS =
        "\1\5\1\uffff\1\124\1\105\1\124\12\53\1\uffff\1\47\1\uffff\1\124"+
        "\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1"+
        "\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\53\1\66\1\124\11\66\1\100\1\53\1\52\1\124\1\100\1\124";
    static final String DFA15_maxS =
        "\1\121\1\uffff\1\131\1\105\1\124\12\105\1\uffff\1\116\1\uffff\1"+
        "\124\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\53\1\103\1\124\11\103\1\100\1\53\1\103\1\131\1\100\1\131";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\22\uffff";
    static final String DFA15_specialS =
        "\70\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\4\7\uffff\1\6\2\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
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
            "\1\64",
            "\1\25\14\uffff\1\1",
            "\1\27\14\uffff\1\1",
            "\1\31\14\uffff\1\1",
            "\1\33\14\uffff\1\1",
            "\1\35\14\uffff\1\1",
            "\1\37\14\uffff\1\1",
            "\1\41\14\uffff\1\1",
            "\1\43\14\uffff\1\1",
            "\1\45\14\uffff\1\1",
            "\1\65",
            "\1\66",
            "\1\50\13\uffff\1\63\14\uffff\1\1",
            "\1\20\5\21",
            "\1\67",
            "\1\20\5\21"
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
            return "169:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA16_eotS =
        "\70\uffff";
    static final String DFA16_eofS =
        "\70\uffff";
    static final String DFA16_minS =
        "\1\5\1\uffff\1\124\1\105\1\124\12\53\1\uffff\1\47\1\124\1\52\1\124"+
        "\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\53\1"+
        "\uffff\1\66\1\124\11\66\1\100\1\53\1\52\1\124\1\100\1\124";
    static final String DFA16_maxS =
        "\1\121\1\uffff\1\124\1\105\1\124\12\105\1\uffff\1\116\1\124\1\52"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1"+
        "\53\1\uffff\1\103\1\124\11\103\1\100\1\53\1\103\1\124\1\100\1\124";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\uffff\1\3\21\uffff";
    static final String DFA16_specialS =
        "\70\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\4\7\uffff\1\6\2\uffff\1\1\1\12\1\1\3\uffff\1\11\1\7\1\13"+
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
            "\1\64",
            "\1\24\14\uffff\1\1",
            "\1\26\14\uffff\1\1",
            "\1\30\14\uffff\1\1",
            "\1\32\14\uffff\1\1",
            "\1\34\14\uffff\1\1",
            "\1\36\14\uffff\1\1",
            "\1\40\14\uffff\1\1",
            "\1\42\14\uffff\1\1",
            "\1\44\14\uffff\1\1",
            "\1\65",
            "\1\66",
            "\1\50\13\uffff\1\63\14\uffff\1\1",
            "\1\20",
            "\1\67",
            "\1\20"
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
            return "184:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN integerExpr RPAREN | doubleExpr '.' REGEXMATCH_TOK ^ LPAREN doubleExpr RPAREN | stringExpr '.' REGEXMATCH_TOK ^ LPAREN stringExpr RPAREN | anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN anyUriExpr RPAREN | dateExpr '.' REGEXMATCH_TOK ^ LPAREN dateExpr RPAREN | timeExpr '.' REGEXMATCH_TOK ^ LPAREN timeExpr RPAREN | dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN dateTimeExpr RPAREN | dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN dayTimeDurationExpr RPAREN | yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN yearMonthDurationExpr RPAREN | x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN x500NameExpr RPAREN | rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN rfc822NameExpr RPAREN | base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN base64BinaryExpr RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\5\2\uffff\1\105\1\124\1\uffff\1\124\1\52\1\66\1\124\1\52";
    static final String DFA18_maxS =
        "\1\121\2\uffff\1\105\1\124\1\uffff\1\124\1\52\1\103\1\124\1\103";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\5\uffff";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\7\uffff\1\5\2\uffff\3\5\3\uffff\3\5\4\uffff\1\5\1\4\4\uffff"+
            "\1\5\2\uffff\1\1\1\5\25\uffff\1\4\1\5\5\uffff\1\2\1\uffff\1"+
            "\3\1\4\2\uffff\1\5\5\uffff\2\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\11",
            "\1\2\14\uffff\1\5",
            "\1\12",
            "\1\11\13\uffff\1\2\14\uffff\1\5"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "217:1: integerExpr : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN RPAREN | anyBag '.' SIZE_TOK ^ LPAREN RPAREN );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_xacmlFile457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_policySet_in_xacmlFile461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_xacmlFile464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy475 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy478 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy480 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policy482 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000202L});
    public static final BitSet FOLLOW_target_in_policy484 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000002L});
    public static final BitSet FOLLOW_rule_in_policy487 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policy490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICYSET_TOK_in_policySet500 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policySet503 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policySet505 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policySet507 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_in_policySet509 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_policy_in_policySet512 = new BitSet(new long[]{0x0200000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policySet515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target528 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_target530 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_target533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_APPLICABLE_TOK_in_target535 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_target538 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_target540 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_target542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule552 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule554 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_rule557 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_set_in_rule559 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule568 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_rule570 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_rule572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanExpr595 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr598 = new BitSet(new long[]{0x2000000040000020L,0x0000000000000080L});
    public static final BitSet FOLLOW_attributeExpr_in_booleanExpr600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOF_TOK_in_booleanExpr609 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_TOK_in_booleanExpr614 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr618 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr627 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanExpr629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_booleanExpr652 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_NODEEQUAL_TOK_in_booleanExpr656 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NODEMATCH_TOK_in_booleanExpr661 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr666 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr700 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalOrExpr703 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr705 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_conditionalAndExpr728 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp749 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp751 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp754 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp766 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp768 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp771 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_isInOp773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp783 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp785 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp788 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp800 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp802 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp805 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp817 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp819 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_isInOp824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp834 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp836 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp839 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp851 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp853 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp868 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp870 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp873 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp885 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp887 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp902 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp904 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp919 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp921 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp924 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp936 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp938 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp941 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp959 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp961 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp964 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp982 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp984 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp987 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp999 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1001 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1004 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp1014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1016 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1018 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1021 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1033 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1035 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1038 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_containsOp1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1050 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1052 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1067 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1069 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1084 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1086 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1089 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1101 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1103 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1106 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1118 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1120 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1135 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1137 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1154 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1157 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1171 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1174 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1192 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1194 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1197 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1214 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1244 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1274 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1304 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1334 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1394 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1484 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1515 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1583 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1585 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1588 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1599 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1601 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1604 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1615 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1617 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1620 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1631 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1633 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1636 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1647 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1649 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1652 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1663 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1665 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1679 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1681 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1695 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1697 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1700 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1711 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1713 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1727 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1729 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1743 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1745 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1748 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1759 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1761 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1764 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1787 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1789 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1804 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1821 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1823 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1839 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1857 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1859 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1875 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1894 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1896 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1912 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_bagOp1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1931 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1933 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1968 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1970 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_bagOp1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2005 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2007 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2023 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2042 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2044 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2059 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2078 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2080 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2095 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2114 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2151 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2153 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2188 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2190 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2225 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2227 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2242 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2261 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2263 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2279 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2297 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2299 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2315 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2339 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2341 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2364 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2389 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2392 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2398 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerBag2408 = new BitSet(new long[]{0x0000010000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_integerBag2410 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2421 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2444 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_doubleExpr2447 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_doubleExpr2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2489 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2491 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2502 = new BitSet(new long[]{0x100C000000000000L});
    public static final BitSet FOLLOW_set_in_stringExpr2504 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringBag2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attributeExpr2572 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2588 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2591 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2602 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2604 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2618 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2651 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2654 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateExpr2665 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2667 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2698 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2701 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timeExpr2712 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2714 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr2744 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr2747 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateTimeExpr2758 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2760 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag2775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2791 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr2794 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr2803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_base64BinaryExpr2805 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2807 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr2839 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr2842 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dayTimeDurationExpr2854 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr2856 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr2886 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr2889 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr2891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_yearMonthDurationExpr2900 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr2902 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag2917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr2933 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr2936 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_x500NameExpr2948 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr2950 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr2982 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr2985 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rfc822NameExpr2996 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr2998 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3030 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3033 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_hexBinaryExpr3044 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3046 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred1_Grammar952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred2_Grammar1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred3_Grammar1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred4_Grammar1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred5_Grammar1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred6_Grammar1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred7_Grammar1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred8_Grammar1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred9_Grammar1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred10_Grammar2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred13_Grammar2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred14_Grammar2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred15_Grammar2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred16_Grammar2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred17_Grammar2290 = new BitSet(new long[]{0x0000000000000002L});

}