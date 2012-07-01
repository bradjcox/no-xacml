// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-07-01 14:35:19

	package noxacml;
	import org.opensaml.xacml.policy.*;
	import org.opensaml.xacml.ctx.*;
	import noxacml.util.*;


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
    "invalidRule", "x500NameExpr", "dateExpr", "stringBag", "synpred1_Grammar", 
    "hexBinaryExpr", "yearMonthDurationExpr", "timeExpr", "anyUriExpr", 
    "doubleBag", "doubleExpr", "dateTimeExpr", "synpred14_Grammar", "regexOp", 
    "anyBag", "integerExpr", "policySet", "synpred13_Grammar", "synpred5_Grammar", 
    "attributeExpr", "conditionalOrExpr", "synpred17_Grammar", "synpred15_Grammar", 
    "target", "synpred12_Grammar", "synpred2_Grammar", "dateBag", "rule", 
    "hexBinaryBag", "timeBag", "dateTimeBag", "booleanBag", "synpred4_Grammar", 
    "dayTimeDurationExpr", "synpred7_Grammar", "bagOp", "rfc822NameBag", 
    "synpred9_Grammar", "synpred3_Grammar", "isInOp", "rfc822NameExpr", 
    "stringExpr", "integerBag", "yearMonthDurationBag", "dayTimeDurationBag", 
    "base64BinaryExpr", "anyUriBag", "synpred6_Grammar", "conditionalAndExpr", 
    "x500NameBag", "synpred16_Grammar", "synpred8_Grammar", "booleanExpr", 
    "policy", "synpred10_Grammar", "containsOp", "equalityExpr", "base64BinaryBag", 
    "xacmlFile", "synpred11_Grammar"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        true, true, false, false, true, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
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


      final SAMLBuilder builder = new SAMLBuilder();


    public static class xacmlFile_return extends ParserRuleReturnScope {
        public Object o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xacmlFile"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:96:1: xacmlFile returns [ Object o] : ( policy | policySet ) EOF ;
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
        dbg.location(96, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:2: ( ( policy | policySet ) EOF )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:4: ( policy | policySet ) EOF
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(97,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:4: ( policy | policySet )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:5: policy
                    {
                    dbg.location(97,5);
                    pushFollow(FOLLOW_policy_in_xacmlFile465);
                    policy1=policy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:97:14: policySet
                    {
                    dbg.location(97,14);
                    pushFollow(FOLLOW_policySet_in_xacmlFile469);
                    policySet2=policySet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policySet2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(97,25);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_xacmlFile472); if (state.failed) return retval;
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
        dbg.location(98, 1);

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
        public PolicyType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policy"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:100:1: policy returns [ PolicyType o] : POLICY_TOK ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' target '}' ;
    public final GrammarParser.policy_return policy() throws RecognitionException {
        GrammarParser.policy_return retval = new GrammarParser.policy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POLICY_TOK4=null;
        Token ANYCASEIDENTIFIER5=null;
        Token LOWERCASEIDENTIFIER6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        GrammarParser.target_return target8 =null;


        Object POLICY_TOK4_tree=null;
        Object ANYCASEIDENTIFIER5_tree=null;
        Object LOWERCASEIDENTIFIER6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policy");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:2: ( POLICY_TOK ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' target '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:4: POLICY_TOK ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' target '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(101,4);
            POLICY_TOK4=(Token)match(input,POLICY_TOK,FOLLOW_POLICY_TOK_in_policy487); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY_TOK4_tree = 
            (Object)adaptor.create(POLICY_TOK4)
            ;
            adaptor.addChild(root_0, POLICY_TOK4_tree);
            }
            dbg.location(101,15);
            ANYCASEIDENTIFIER5=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy489); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER5_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER5_tree);
            }
            dbg.location(101,33);
            LOWERCASEIDENTIFIER6=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER6_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER6)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER6_tree);
            }
            dbg.location(101,53);
            char_literal7=(Token)match(input,90,FOLLOW_90_in_policy493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);
            }
            dbg.location(101,57);
            pushFollow(FOLLOW_target_in_policy495);
            target8=target();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, target8.getTree());
            dbg.location(101,64);
            char_literal9=(Token)match(input,92,FOLLOW_92_in_policy497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);
            }
            dbg.location(102,2);
            if ( state.backtracking==0 ) {
            		PolicyType o = builder.create(PolicyType.class, PolicyType.DEFAULT_ELEMENT_NAME);
            //		o.setDescription("");
            		o.setPolicyId((ANYCASEIDENTIFIER5!=null?ANYCASEIDENTIFIER5.getText():null));
            		o.setObligations(null);
            		o.setPolicyDefaults(null);
            		o.setRuleCombiningAlgoId((LOWERCASEIDENTIFIER6!=null?LOWERCASEIDENTIFIER6.getText():null));
            		o.setTarget($target.o);
            //		o.setRule(r);
            		o.setVersion("");
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
        dbg.location(113, 1);

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
        public PolicySetType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policySet"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:114:1: policySet returns [ PolicySetType o ] : POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )+ '}' !;
    public final GrammarParser.policySet_return policySet() throws RecognitionException {
        GrammarParser.policySet_return retval = new GrammarParser.policySet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POLICYSET_TOK10=null;
        Token ANYCASEIDENTIFIER11=null;
        Token LOWERCASEIDENTIFIER12=null;
        Token char_literal13=null;
        Token char_literal16=null;
        GrammarParser.target_return target14 =null;

        GrammarParser.policy_return policy15 =null;


        Object POLICYSET_TOK10_tree=null;
        Object ANYCASEIDENTIFIER11_tree=null;
        Object LOWERCASEIDENTIFIER12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policySet");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:2: ( POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )+ '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:4: POLICYSET_TOK ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{' ! ( target )? ( policy )+ '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(115,17);
            POLICYSET_TOK10=(Token)match(input,POLICYSET_TOK,FOLLOW_POLICYSET_TOK_in_policySet514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICYSET_TOK10_tree = 
            (Object)adaptor.create(POLICYSET_TOK10)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICYSET_TOK10_tree, root_0);
            }
            dbg.location(115,19);
            ANYCASEIDENTIFIER11=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policySet517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER11_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER11)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER11_tree);
            }
            dbg.location(115,37);
            LOWERCASEIDENTIFIER12=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policySet519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER12_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER12)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER12_tree);
            }
            dbg.location(115,60);
            char_literal13=(Token)match(input,90,FOLLOW_90_in_policySet521); if (state.failed) return retval;
            dbg.location(115,62);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:62: ( target )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:62: target
                    {
                    dbg.location(115,62);
                    pushFollow(FOLLOW_target_in_policySet524);
                    target14=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target14.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(115,70);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:70: ( policy )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==POLICY_TOK) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:70: policy
            	    {
            	    dbg.location(115,70);
            	    pushFollow(FOLLOW_policy_in_policySet527);
            	    policy15=policy();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy15.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(115,81);
            char_literal16=(Token)match(input,92,FOLLOW_92_in_policySet530); if (state.failed) return retval;
            dbg.location(116,2);
            if ( state.backtracking==0 ) {
            		PolicySetType o = builder.create(PolicySetType.class, PolicySetType.DEFAULT_ELEMENT_NAME);
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
        dbg.location(119, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:125:1: target[ TargetType o] : TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !;
    public final GrammarParser.target_return target(TargetType o) throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TARGET_TOK17=null;
        Token ANYCASEIDENTIFIER18=null;
        Token char_literal19=null;
        Token APPLICABLE_TOK20=null;
        Token IF_TOK21=null;
        Token char_literal23=null;
        GrammarParser.booleanExpr_return booleanExpr22 =null;


        Object TARGET_TOK17_tree=null;
        Object ANYCASEIDENTIFIER18_tree=null;
        Object char_literal19_tree=null;
        Object APPLICABLE_TOK20_tree=null;
        Object IF_TOK21_tree=null;
        Object char_literal23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:2: ( TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:4: TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(126,14);
            TARGET_TOK17=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK17_tree = 
            (Object)adaptor.create(TARGET_TOK17)
            ;
            root_0 = (Object)adaptor.becomeRoot(TARGET_TOK17_tree, root_0);
            }
            dbg.location(126,16);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:16: ( ANYCASEIDENTIFIER )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ANYCASEIDENTIFIER) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:126:16: ANYCASEIDENTIFIER
                    {
                    dbg.location(126,16);
                    ANYCASEIDENTIFIER18=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_target552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER18_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER18)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER18_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(126,38);
            char_literal19=(Token)match(input,90,FOLLOW_90_in_target555); if (state.failed) return retval;
            dbg.location(126,40);
            APPLICABLE_TOK20=(Token)match(input,APPLICABLE_TOK,FOLLOW_APPLICABLE_TOK_in_target558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            APPLICABLE_TOK20_tree = 
            (Object)adaptor.create(APPLICABLE_TOK20)
            ;
            adaptor.addChild(root_0, APPLICABLE_TOK20_tree);
            }
            dbg.location(126,55);
            IF_TOK21=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_target560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK21_tree = 
            (Object)adaptor.create(IF_TOK21)
            ;
            adaptor.addChild(root_0, IF_TOK21_tree);
            }
            dbg.location(126,62);
            pushFollow(FOLLOW_booleanExpr_in_target562);
            booleanExpr22=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr22.getTree());
            dbg.location(126,77);
            char_literal23=(Token)match(input,92,FOLLOW_92_in_target564); if (state.failed) return retval;
            dbg.location(127,2);
            if ( state.backtracking==0 ) {
            		TargetType o = builder.create(TargetType.class, TargetType.DEFAULT_ELEMENT_NAME);
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
        dbg.location(130, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:131:1: rule[ RuleType o] : RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !;
    public final GrammarParser.rule_return rule(RuleType o) throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RULE_TOK24=null;
        Token ANYCASEIDENTIFIER25=null;
        Token char_literal26=null;
        Token set27=null;
        Token IF_TOK28=null;
        Token char_literal30=null;
        GrammarParser.booleanExpr_return booleanExpr29 =null;


        Object RULE_TOK24_tree=null;
        Object ANYCASEIDENTIFIER25_tree=null;
        Object char_literal26_tree=null;
        Object set27_tree=null;
        Object IF_TOK28_tree=null;
        Object char_literal30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:2: ( RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:4: RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(132,12);
            RULE_TOK24=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule580); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK24_tree = 
            (Object)adaptor.create(RULE_TOK24)
            ;
            root_0 = (Object)adaptor.becomeRoot(RULE_TOK24_tree, root_0);
            }
            dbg.location(132,14);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:14: ( ANYCASEIDENTIFIER )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==ANYCASEIDENTIFIER) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:14: ANYCASEIDENTIFIER
                    {
                    dbg.location(132,14);
                    ANYCASEIDENTIFIER25=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER25_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER25)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER25_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(132,36);
            char_literal26=(Token)match(input,90,FOLLOW_90_in_rule586); if (state.failed) return retval;
            dbg.location(132,38);
            set27=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set27)
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

            dbg.location(132,62);
            IF_TOK28=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_rule597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK28_tree = 
            (Object)adaptor.create(IF_TOK28)
            ;
            adaptor.addChild(root_0, IF_TOK28_tree);
            }
            dbg.location(132,69);
            pushFollow(FOLLOW_booleanExpr_in_rule599);
            booleanExpr29=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr29.getTree());
            dbg.location(132,84);
            char_literal30=(Token)match(input,92,FOLLOW_92_in_rule601); if (state.failed) return retval;
            dbg.location(133,2);
            if ( state.backtracking==0 ) {
            		RuleType o = builder.create(RuleType.class, RuleType.DEFAULT_ELEMENT_NAME);
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
        dbg.location(136, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !);
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TRUE_TOK31=null;
        Token FALSE_TOK32=null;
        Token BOOLEAN_TOK33=null;
        Token LPAREN34=null;
        Token RPAREN36=null;
        Token NOF_TOK37=null;
        Token NOT_TOK38=null;
        Token LPAREN39=null;
        Token RPAREN41=null;
        Token LPAREN42=null;
        Token RPAREN44=null;
        Token char_literal49=null;
        Token NODEEQUAL_TOK50=null;
        Token NODEMATCH_TOK51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        GrammarParser.attributeExpr_return attributeExpr35 =null;

        GrammarParser.booleanExpr_return booleanExpr40 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr43 =null;

        GrammarParser.equalityExpr_return equalityExpr45 =null;

        GrammarParser.isInOp_return isInOp46 =null;

        GrammarParser.containsOp_return containsOp47 =null;

        GrammarParser.stringExpr_return stringExpr48 =null;

        GrammarParser.stringExpr_return stringExpr53 =null;


        Object TRUE_TOK31_tree=null;
        Object FALSE_TOK32_tree=null;
        Object BOOLEAN_TOK33_tree=null;
        Object LPAREN34_tree=null;
        Object RPAREN36_tree=null;
        Object NOF_TOK37_tree=null;
        Object NOT_TOK38_tree=null;
        Object LPAREN39_tree=null;
        Object RPAREN41_tree=null;
        Object LPAREN42_tree=null;
        Object RPAREN44_tree=null;
        Object char_literal49_tree=null;
        Object NODEEQUAL_TOK50_tree=null;
        Object NODEMATCH_TOK51_tree=null;
        Object LPAREN52_tree=null;
        Object RPAREN54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:2: ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !)
            int alt8=9;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            try {
                isCyclicDecision = true;
                alt8 = dfa8.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:4: TRUE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,12);
                    TRUE_TOK31=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_TOK31_tree = 
                    (Object)adaptor.create(TRUE_TOK31)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRUE_TOK31_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:4: FALSE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,13);
                    FALSE_TOK32=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_TOK32_tree = 
                    (Object)adaptor.create(FALSE_TOK32)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FALSE_TOK32_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:4: BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,15);
                    BOOLEAN_TOK33=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanExpr628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_TOK33_tree = 
                    (Object)adaptor.create(BOOLEAN_TOK33)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK33_tree, root_0);
                    }
                    dbg.location(141,23);
                    LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr631); if (state.failed) return retval;
                    dbg.location(141,25);
                    pushFollow(FOLLOW_attributeExpr_in_booleanExpr634);
                    attributeExpr35=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr35.getTree());
                    dbg.location(141,45);
                    RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr636); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:4: ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(142,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:4: ( NOF_TOK ^| NOT_TOK ^)
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NOF_TOK) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==NOT_TOK) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:6: NOF_TOK ^
                            {
                            dbg.location(142,13);
                            NOF_TOK37=(Token)match(input,NOF_TOK,FOLLOW_NOF_TOK_in_booleanExpr644); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOF_TOK37_tree = 
                            (Object)adaptor.create(NOF_TOK37)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOF_TOK37_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:17: NOT_TOK ^
                            {
                            dbg.location(142,24);
                            NOT_TOK38=(Token)match(input,NOT_TOK,FOLLOW_NOT_TOK_in_booleanExpr649); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOT_TOK38_tree = 
                            (Object)adaptor.create(NOT_TOK38)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOT_TOK38_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(142,33);
                    LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr653); if (state.failed) return retval;
                    dbg.location(142,35);
                    pushFollow(FOLLOW_booleanExpr_in_booleanExpr656);
                    booleanExpr40=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr40.getTree());
                    dbg.location(142,53);
                    RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr658); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:143:4: LPAREN ! conditionalOrExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(143,10);
                    LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr664); if (state.failed) return retval;
                    dbg.location(143,12);
                    pushFollow(FOLLOW_conditionalOrExpr_in_booleanExpr667);
                    conditionalOrExpr43=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr43.getTree());
                    dbg.location(143,36);
                    RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr669); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(144,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr675);
                    equalityExpr45=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr45.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr680);
                    isInOp46=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp46.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:13: containsOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(145,13);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr684);
                    containsOp47=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp47.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:4: stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(146,4);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr689);
                    stringExpr48=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr48.getTree());
                    dbg.location(146,15);
                    char_literal49=(Token)match(input,84,FOLLOW_84_in_booleanExpr691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal49_tree = 
                    (Object)adaptor.create(char_literal49)
                    ;
                    adaptor.addChild(root_0, char_literal49_tree);
                    }
                    dbg.location(146,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:19: ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^)
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NODEEQUAL_TOK) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==NODEMATCH_TOK) ) {
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:21: NODEEQUAL_TOK ^
                            {
                            dbg.location(146,34);
                            NODEEQUAL_TOK50=(Token)match(input,NODEEQUAL_TOK,FOLLOW_NODEEQUAL_TOK_in_booleanExpr695); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEEQUAL_TOK50_tree = 
                            (Object)adaptor.create(NODEEQUAL_TOK50)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEEQUAL_TOK50_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:38: NODEMATCH_TOK ^
                            {
                            dbg.location(146,51);
                            NODEMATCH_TOK51=(Token)match(input,NODEMATCH_TOK,FOLLOW_NODEMATCH_TOK_in_booleanExpr700); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEMATCH_TOK51_tree = 
                            (Object)adaptor.create(NODEMATCH_TOK51)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEMATCH_TOK51_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(146,61);
                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr705); if (state.failed) return retval;
                    dbg.location(146,63);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr708);
                    stringExpr53=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr53.getTree());
                    dbg.location(146,80);
                    RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr710); if (state.failed) return retval;

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


    public static class booleanBag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:1: booleanBag : BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK55=null;
        Token STRING_CONSTANT_LIST56=null;

        Object BOOLEAN_TOK55_tree=null;
        Object STRING_CONSTANT_LIST56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:2: ( BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:151:4: BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(151,4);
            BOOLEAN_TOK55=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag723); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK55_tree = 
            (Object)adaptor.create(BOOLEAN_TOK55)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK55_tree);
            }
            dbg.location(151,16);
            STRING_CONSTANT_LIST56=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag725); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST56_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST56)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST56_tree);
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
        dbg.location(154, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:1: conditionalOrExpr : conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr57 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr59 =null;


        Object string_literal58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:5: ( conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:7: conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(157,7);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr741);
            conditionalAndExpr57=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr57.getTree());
            dbg.location(157,26);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:26: ( '||' conditionalAndExpr )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==91) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:27: '||' conditionalAndExpr
            	    {
            	    dbg.location(157,27);
            	    string_literal58=(Token)match(input,91,FOLLOW_91_in_conditionalOrExpr744); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = 
            	    (Object)adaptor.create(string_literal58)
            	    ;
            	    adaptor.addChild(root_0, string_literal58_tree);
            	    }
            	    dbg.location(157,32);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr746);
            	    conditionalAndExpr59=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr59.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


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
        dbg.location(158, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:1: conditionalAndExpr : booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal61=null;
        GrammarParser.booleanExpr_return booleanExpr60 =null;

        GrammarParser.booleanExpr_return booleanExpr62 =null;


        Object string_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:5: ( booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:7: booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(161,7);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr766);
            booleanExpr60=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr60.getTree());
            dbg.location(161,19);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:19: ( '&&' booleanExpr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==82) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:20: '&&' booleanExpr
            	    {
            	    dbg.location(161,20);
            	    string_literal61=(Token)match(input,82,FOLLOW_82_in_conditionalAndExpr769); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = 
            	    (Object)adaptor.create(string_literal61)
            	    ;
            	    adaptor.addChild(root_0, string_literal61_tree);
            	    }
            	    dbg.location(161,25);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr771);
            	    booleanExpr62=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr62.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


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
        dbg.location(162, 4);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal64=null;
        Token ISIN_TOK65=null;
        Token LPAREN66=null;
        Token RPAREN68=null;
        Token char_literal70=null;
        Token ISIN_TOK71=null;
        Token LPAREN72=null;
        Token RPAREN74=null;
        Token char_literal76=null;
        Token ISIN_TOK77=null;
        Token LPAREN78=null;
        Token RPAREN80=null;
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
        GrammarParser.doubleExpr_return doubleExpr63 =null;

        GrammarParser.doubleBag_return doubleBag67 =null;

        GrammarParser.stringExpr_return stringExpr69 =null;

        GrammarParser.stringBag_return stringBag73 =null;

        GrammarParser.anyUriExpr_return anyUriExpr75 =null;

        GrammarParser.anyUriBag_return anyUriBag79 =null;

        GrammarParser.dateExpr_return dateExpr81 =null;

        GrammarParser.dateBag_return dateBag85 =null;

        GrammarParser.timeExpr_return timeExpr87 =null;

        GrammarParser.timeBag_return timeBag91 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr93 =null;

        GrammarParser.dateTimeBag_return dateTimeBag97 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr99 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag103 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr105 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag109 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr111 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag115 =null;

        GrammarParser.x500NameExpr_return x500NameExpr117 =null;

        GrammarParser.x500NameBag_return x500NameBag121 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr123 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag127 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr129 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag133 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr135 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag139 =null;


        Object char_literal64_tree=null;
        Object ISIN_TOK65_tree=null;
        Object LPAREN66_tree=null;
        Object RPAREN68_tree=null;
        Object char_literal70_tree=null;
        Object ISIN_TOK71_tree=null;
        Object LPAREN72_tree=null;
        Object RPAREN74_tree=null;
        Object char_literal76_tree=null;
        Object ISIN_TOK77_tree=null;
        Object LPAREN78_tree=null;
        Object RPAREN80_tree=null;
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

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:2: ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !)
            int alt11=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:5: doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp788);
                    doubleExpr63=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr63.getTree());
                    dbg.location(165,16);
                    char_literal64=(Token)match(input,84,FOLLOW_84_in_isInOp790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = 
                    (Object)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);
                    }
                    dbg.location(165,28);
                    ISIN_TOK65=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK65_tree = 
                    (Object)adaptor.create(ISIN_TOK65)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK65_tree, root_0);
                    }
                    dbg.location(165,36);
                    LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp795); if (state.failed) return retval;
                    dbg.location(165,38);
                    pushFollow(FOLLOW_doubleBag_in_isInOp798);
                    doubleBag67=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag67.getTree());
                    dbg.location(165,54);
                    RPAREN68=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp800); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:5: stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(166,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp807);
                    stringExpr69=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr69.getTree());
                    dbg.location(166,16);
                    char_literal70=(Token)match(input,84,FOLLOW_84_in_isInOp809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = 
                    (Object)adaptor.create(char_literal70)
                    ;
                    adaptor.addChild(root_0, char_literal70_tree);
                    }
                    dbg.location(166,28);
                    ISIN_TOK71=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK71_tree = 
                    (Object)adaptor.create(ISIN_TOK71)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK71_tree, root_0);
                    }
                    dbg.location(166,36);
                    LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp814); if (state.failed) return retval;
                    dbg.location(166,38);
                    pushFollow(FOLLOW_stringBag_in_isInOp817);
                    stringBag73=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag73.getTree());
                    dbg.location(166,54);
                    RPAREN74=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp819); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:167:5: anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(167,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp826);
                    anyUriExpr75=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr75.getTree());
                    dbg.location(167,16);
                    char_literal76=(Token)match(input,84,FOLLOW_84_in_isInOp828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = 
                    (Object)adaptor.create(char_literal76)
                    ;
                    adaptor.addChild(root_0, char_literal76_tree);
                    }
                    dbg.location(167,28);
                    ISIN_TOK77=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK77_tree = 
                    (Object)adaptor.create(ISIN_TOK77)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK77_tree, root_0);
                    }
                    dbg.location(167,36);
                    LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp833); if (state.failed) return retval;
                    dbg.location(167,38);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp836);
                    anyUriBag79=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag79.getTree());
                    dbg.location(167,54);
                    RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp838); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:5: dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(168,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp845);
                    dateExpr81=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr81.getTree());
                    dbg.location(168,14);
                    char_literal82=(Token)match(input,84,FOLLOW_84_in_isInOp847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal82_tree = 
                    (Object)adaptor.create(char_literal82)
                    ;
                    adaptor.addChild(root_0, char_literal82_tree);
                    }
                    dbg.location(168,26);
                    ISIN_TOK83=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK83_tree = 
                    (Object)adaptor.create(ISIN_TOK83)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK83_tree, root_0);
                    }
                    dbg.location(168,34);
                    LPAREN84=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp852); if (state.failed) return retval;
                    dbg.location(168,36);
                    pushFollow(FOLLOW_dateBag_in_isInOp855);
                    dateBag85=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag85.getTree());
                    dbg.location(168,50);
                    RPAREN86=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp857); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:5: timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp864);
                    timeExpr87=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr87.getTree());
                    dbg.location(169,14);
                    char_literal88=(Token)match(input,84,FOLLOW_84_in_isInOp866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);
                    }
                    dbg.location(169,26);
                    ISIN_TOK89=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK89_tree = 
                    (Object)adaptor.create(ISIN_TOK89)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK89_tree, root_0);
                    }
                    dbg.location(169,34);
                    LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp871); if (state.failed) return retval;
                    dbg.location(169,36);
                    pushFollow(FOLLOW_timeBag_in_isInOp874);
                    timeBag91=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag91.getTree());
                    dbg.location(169,50);
                    RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp876); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:5: dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp883);
                    dateTimeExpr93=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr93.getTree());
                    dbg.location(170,18);
                    char_literal94=(Token)match(input,84,FOLLOW_84_in_isInOp885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal94_tree = 
                    (Object)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);
                    }
                    dbg.location(170,30);
                    ISIN_TOK95=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp887); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK95_tree = 
                    (Object)adaptor.create(ISIN_TOK95)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK95_tree, root_0);
                    }
                    dbg.location(170,38);
                    LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp890); if (state.failed) return retval;
                    dbg.location(170,40);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp893);
                    dateTimeBag97=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag97.getTree());
                    dbg.location(170,58);
                    RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp895); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:5: base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp902);
                    base64BinaryExpr99=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr99.getTree());
                    dbg.location(171,22);
                    char_literal100=(Token)match(input,84,FOLLOW_84_in_isInOp904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = 
                    (Object)adaptor.create(char_literal100)
                    ;
                    adaptor.addChild(root_0, char_literal100_tree);
                    }
                    dbg.location(171,34);
                    ISIN_TOK101=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK101_tree = 
                    (Object)adaptor.create(ISIN_TOK101)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK101_tree, root_0);
                    }
                    dbg.location(171,42);
                    LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp909); if (state.failed) return retval;
                    dbg.location(171,44);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp912);
                    base64BinaryBag103=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag103.getTree());
                    dbg.location(171,66);
                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp914); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:5: dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp921);
                    dayTimeDurationExpr105=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr105.getTree());
                    dbg.location(172,25);
                    char_literal106=(Token)match(input,84,FOLLOW_84_in_isInOp923); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = 
                    (Object)adaptor.create(char_literal106)
                    ;
                    adaptor.addChild(root_0, char_literal106_tree);
                    }
                    dbg.location(172,37);
                    ISIN_TOK107=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK107_tree = 
                    (Object)adaptor.create(ISIN_TOK107)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK107_tree, root_0);
                    }
                    dbg.location(172,45);
                    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp928); if (state.failed) return retval;
                    dbg.location(172,47);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp931);
                    dayTimeDurationBag109=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag109.getTree());
                    dbg.location(172,72);
                    RPAREN110=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp933); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:5: yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp940);
                    yearMonthDurationExpr111=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr111.getTree());
                    dbg.location(173,27);
                    char_literal112=(Token)match(input,84,FOLLOW_84_in_isInOp942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = 
                    (Object)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);
                    }
                    dbg.location(173,39);
                    ISIN_TOK113=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK113_tree = 
                    (Object)adaptor.create(ISIN_TOK113)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK113_tree, root_0);
                    }
                    dbg.location(173,47);
                    LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp947); if (state.failed) return retval;
                    dbg.location(173,49);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp950);
                    yearMonthDurationBag115=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag115.getTree());
                    dbg.location(173,76);
                    RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp952); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:5: x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp959);
                    x500NameExpr117=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr117.getTree());
                    dbg.location(174,18);
                    char_literal118=(Token)match(input,84,FOLLOW_84_in_isInOp961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal118_tree = 
                    (Object)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);
                    }
                    dbg.location(174,30);
                    ISIN_TOK119=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp963); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK119_tree = 
                    (Object)adaptor.create(ISIN_TOK119)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK119_tree, root_0);
                    }
                    dbg.location(174,38);
                    LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp966); if (state.failed) return retval;
                    dbg.location(174,40);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp969);
                    x500NameBag121=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag121.getTree());
                    dbg.location(174,58);
                    RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp971); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:5: rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(175,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp978);
                    rfc822NameExpr123=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr123.getTree());
                    dbg.location(175,20);
                    char_literal124=(Token)match(input,84,FOLLOW_84_in_isInOp980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);
                    }
                    dbg.location(175,32);
                    ISIN_TOK125=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK125_tree = 
                    (Object)adaptor.create(ISIN_TOK125)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK125_tree, root_0);
                    }
                    dbg.location(175,40);
                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp985); if (state.failed) return retval;
                    dbg.location(175,42);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp988);
                    rfc822NameBag127=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag127.getTree());
                    dbg.location(175,62);
                    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp990); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:5: hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp997);
                    hexBinaryExpr129=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr129.getTree());
                    dbg.location(176,19);
                    char_literal130=(Token)match(input,84,FOLLOW_84_in_isInOp999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal130_tree = 
                    (Object)adaptor.create(char_literal130)
                    ;
                    adaptor.addChild(root_0, char_literal130_tree);
                    }
                    dbg.location(176,31);
                    ISIN_TOK131=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK131_tree = 
                    (Object)adaptor.create(ISIN_TOK131)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK131_tree, root_0);
                    }
                    dbg.location(176,39);
                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1004); if (state.failed) return retval;
                    dbg.location(176,41);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp1007);
                    hexBinaryBag133=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag133.getTree());
                    dbg.location(176,60);
                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1009); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1022);
                    base64BinaryExpr135=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr135.getTree());
                    dbg.location(177,44);
                    char_literal136=(Token)match(input,84,FOLLOW_84_in_isInOp1024); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);
                    }
                    dbg.location(177,56);
                    ISIN_TOK137=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1026); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK137_tree = 
                    (Object)adaptor.create(ISIN_TOK137)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK137_tree, root_0);
                    }
                    dbg.location(177,64);
                    LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1029); if (state.failed) return retval;
                    dbg.location(177,66);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1032);
                    base64BinaryBag139=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag139.getTree());
                    dbg.location(177,88);
                    RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1034); if (state.failed) return retval;

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
        dbg.location(178, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal142=null;
        Token CONTAINS_TOK143=null;
        Token LPAREN144=null;
        Token RPAREN146=null;
        Token char_literal148=null;
        Token CONTAINS_TOK149=null;
        Token LPAREN150=null;
        Token RPAREN152=null;
        Token char_literal154=null;
        Token CONTAINS_TOK155=null;
        Token LPAREN156=null;
        Token RPAREN158=null;
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
        GrammarParser.doubleBag_return doubleBag141 =null;

        GrammarParser.doubleExpr_return doubleExpr145 =null;

        GrammarParser.stringBag_return stringBag147 =null;

        GrammarParser.stringExpr_return stringExpr151 =null;

        GrammarParser.anyUriBag_return anyUriBag153 =null;

        GrammarParser.anyUriExpr_return anyUriExpr157 =null;

        GrammarParser.dateBag_return dateBag159 =null;

        GrammarParser.dateExpr_return dateExpr163 =null;

        GrammarParser.timeBag_return timeBag165 =null;

        GrammarParser.timeExpr_return timeExpr169 =null;

        GrammarParser.dateTimeBag_return dateTimeBag171 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr175 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag177 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr181 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag183 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr187 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag189 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr193 =null;

        GrammarParser.x500NameBag_return x500NameBag195 =null;

        GrammarParser.x500NameExpr_return x500NameExpr199 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag201 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr205 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag207 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr211 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag213 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr217 =null;


        Object char_literal142_tree=null;
        Object CONTAINS_TOK143_tree=null;
        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;
        Object char_literal148_tree=null;
        Object CONTAINS_TOK149_tree=null;
        Object LPAREN150_tree=null;
        Object RPAREN152_tree=null;
        Object char_literal154_tree=null;
        Object CONTAINS_TOK155_tree=null;
        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;
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

        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:2: ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
            int alt12=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:5: doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,5);
                    pushFollow(FOLLOW_doubleBag_in_containsOp1047);
                    doubleBag141=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag141.getTree());
                    dbg.location(181,15);
                    char_literal142=(Token)match(input,84,FOLLOW_84_in_containsOp1049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);
                    }
                    dbg.location(181,31);
                    CONTAINS_TOK143=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK143_tree = 
                    (Object)adaptor.create(CONTAINS_TOK143)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK143_tree, root_0);
                    }
                    dbg.location(181,39);
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1054); if (state.failed) return retval;
                    dbg.location(181,41);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp1057);
                    doubleExpr145=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr145.getTree());
                    dbg.location(181,58);
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1059); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:5: stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,5);
                    pushFollow(FOLLOW_stringBag_in_containsOp1066);
                    stringBag147=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag147.getTree());
                    dbg.location(182,15);
                    char_literal148=(Token)match(input,84,FOLLOW_84_in_containsOp1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal148_tree = 
                    (Object)adaptor.create(char_literal148)
                    ;
                    adaptor.addChild(root_0, char_literal148_tree);
                    }
                    dbg.location(182,31);
                    CONTAINS_TOK149=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK149_tree = 
                    (Object)adaptor.create(CONTAINS_TOK149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK149_tree, root_0);
                    }
                    dbg.location(182,39);
                    LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1073); if (state.failed) return retval;
                    dbg.location(182,41);
                    pushFollow(FOLLOW_stringExpr_in_containsOp1076);
                    stringExpr151=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr151.getTree());
                    dbg.location(182,58);
                    RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1078); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:5: anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,5);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp1085);
                    anyUriBag153=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag153.getTree());
                    dbg.location(183,15);
                    char_literal154=(Token)match(input,84,FOLLOW_84_in_containsOp1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = 
                    (Object)adaptor.create(char_literal154)
                    ;
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    dbg.location(183,31);
                    CONTAINS_TOK155=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK155_tree = 
                    (Object)adaptor.create(CONTAINS_TOK155)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK155_tree, root_0);
                    }
                    dbg.location(183,39);
                    LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1092); if (state.failed) return retval;
                    dbg.location(183,41);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp1095);
                    anyUriExpr157=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr157.getTree());
                    dbg.location(183,58);
                    RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1097); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:5: dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(184,5);
                    pushFollow(FOLLOW_dateBag_in_containsOp1104);
                    dateBag159=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag159.getTree());
                    dbg.location(184,13);
                    char_literal160=(Token)match(input,84,FOLLOW_84_in_containsOp1106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = 
                    (Object)adaptor.create(char_literal160)
                    ;
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    dbg.location(184,29);
                    CONTAINS_TOK161=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK161_tree = 
                    (Object)adaptor.create(CONTAINS_TOK161)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK161_tree, root_0);
                    }
                    dbg.location(184,37);
                    LPAREN162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1111); if (state.failed) return retval;
                    dbg.location(184,39);
                    pushFollow(FOLLOW_dateExpr_in_containsOp1114);
                    dateExpr163=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr163.getTree());
                    dbg.location(184,54);
                    RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1116); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:5: timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,5);
                    pushFollow(FOLLOW_timeBag_in_containsOp1123);
                    timeBag165=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag165.getTree());
                    dbg.location(185,13);
                    char_literal166=(Token)match(input,84,FOLLOW_84_in_containsOp1125); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = 
                    (Object)adaptor.create(char_literal166)
                    ;
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    dbg.location(185,29);
                    CONTAINS_TOK167=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK167_tree = 
                    (Object)adaptor.create(CONTAINS_TOK167)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK167_tree, root_0);
                    }
                    dbg.location(185,37);
                    LPAREN168=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1130); if (state.failed) return retval;
                    dbg.location(185,39);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1133);
                    timeExpr169=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr169.getTree());
                    dbg.location(185,54);
                    RPAREN170=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1135); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:5: dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,5);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1142);
                    dateTimeBag171=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag171.getTree());
                    dbg.location(186,17);
                    char_literal172=(Token)match(input,84,FOLLOW_84_in_containsOp1144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal172_tree = 
                    (Object)adaptor.create(char_literal172)
                    ;
                    adaptor.addChild(root_0, char_literal172_tree);
                    }
                    dbg.location(186,33);
                    CONTAINS_TOK173=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK173_tree = 
                    (Object)adaptor.create(CONTAINS_TOK173)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK173_tree, root_0);
                    }
                    dbg.location(186,41);
                    LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1149); if (state.failed) return retval;
                    dbg.location(186,43);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1152);
                    dateTimeExpr175=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr175.getTree());
                    dbg.location(186,62);
                    RPAREN176=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1154); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:5: base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,5);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1161);
                    base64BinaryBag177=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag177.getTree());
                    dbg.location(187,21);
                    char_literal178=(Token)match(input,84,FOLLOW_84_in_containsOp1163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = 
                    (Object)adaptor.create(char_literal178)
                    ;
                    adaptor.addChild(root_0, char_literal178_tree);
                    }
                    dbg.location(187,37);
                    CONTAINS_TOK179=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK179_tree = 
                    (Object)adaptor.create(CONTAINS_TOK179)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK179_tree, root_0);
                    }
                    dbg.location(187,45);
                    LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1168); if (state.failed) return retval;
                    dbg.location(187,47);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1171);
                    base64BinaryExpr181=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr181.getTree());
                    dbg.location(187,70);
                    RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1173); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:5: dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,5);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1180);
                    dayTimeDurationBag183=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag183.getTree());
                    dbg.location(188,24);
                    char_literal184=(Token)match(input,84,FOLLOW_84_in_containsOp1182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal184_tree = 
                    (Object)adaptor.create(char_literal184)
                    ;
                    adaptor.addChild(root_0, char_literal184_tree);
                    }
                    dbg.location(188,40);
                    CONTAINS_TOK185=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK185_tree = 
                    (Object)adaptor.create(CONTAINS_TOK185)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK185_tree, root_0);
                    }
                    dbg.location(188,48);
                    LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1187); if (state.failed) return retval;
                    dbg.location(188,50);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1190);
                    dayTimeDurationExpr187=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr187.getTree());
                    dbg.location(188,76);
                    RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1192); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:5: yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(189,5);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1199);
                    yearMonthDurationBag189=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag189.getTree());
                    dbg.location(189,26);
                    char_literal190=(Token)match(input,84,FOLLOW_84_in_containsOp1201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal190_tree = 
                    (Object)adaptor.create(char_literal190)
                    ;
                    adaptor.addChild(root_0, char_literal190_tree);
                    }
                    dbg.location(189,42);
                    CONTAINS_TOK191=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK191_tree = 
                    (Object)adaptor.create(CONTAINS_TOK191)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK191_tree, root_0);
                    }
                    dbg.location(189,50);
                    LPAREN192=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1206); if (state.failed) return retval;
                    dbg.location(189,52);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1209);
                    yearMonthDurationExpr193=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr193.getTree());
                    dbg.location(189,80);
                    RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1211); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:190:5: x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(190,5);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1218);
                    x500NameBag195=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag195.getTree());
                    dbg.location(190,17);
                    char_literal196=(Token)match(input,84,FOLLOW_84_in_containsOp1220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal196_tree = 
                    (Object)adaptor.create(char_literal196)
                    ;
                    adaptor.addChild(root_0, char_literal196_tree);
                    }
                    dbg.location(190,33);
                    CONTAINS_TOK197=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK197_tree = 
                    (Object)adaptor.create(CONTAINS_TOK197)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK197_tree, root_0);
                    }
                    dbg.location(190,41);
                    LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1225); if (state.failed) return retval;
                    dbg.location(190,43);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1228);
                    x500NameExpr199=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr199.getTree());
                    dbg.location(190,62);
                    RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1230); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:191:5: rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(191,5);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1237);
                    rfc822NameBag201=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag201.getTree());
                    dbg.location(191,19);
                    char_literal202=(Token)match(input,84,FOLLOW_84_in_containsOp1239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal202_tree = 
                    (Object)adaptor.create(char_literal202)
                    ;
                    adaptor.addChild(root_0, char_literal202_tree);
                    }
                    dbg.location(191,35);
                    CONTAINS_TOK203=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK203_tree = 
                    (Object)adaptor.create(CONTAINS_TOK203)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK203_tree, root_0);
                    }
                    dbg.location(191,43);
                    LPAREN204=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1244); if (state.failed) return retval;
                    dbg.location(191,45);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1247);
                    rfc822NameExpr205=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr205.getTree());
                    dbg.location(191,66);
                    RPAREN206=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1249); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:5: hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(192,5);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1256);
                    hexBinaryBag207=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag207.getTree());
                    dbg.location(192,18);
                    char_literal208=(Token)match(input,84,FOLLOW_84_in_containsOp1258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal208_tree = 
                    (Object)adaptor.create(char_literal208)
                    ;
                    adaptor.addChild(root_0, char_literal208_tree);
                    }
                    dbg.location(192,34);
                    CONTAINS_TOK209=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK209_tree = 
                    (Object)adaptor.create(CONTAINS_TOK209)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK209_tree, root_0);
                    }
                    dbg.location(192,42);
                    LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1263); if (state.failed) return retval;
                    dbg.location(192,44);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1266);
                    hexBinaryExpr211=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr211.getTree());
                    dbg.location(192,64);
                    RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1268); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:5: ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,27);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1281);
                    base64BinaryBag213=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag213.getTree());
                    dbg.location(193,43);
                    char_literal214=(Token)match(input,84,FOLLOW_84_in_containsOp1283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal214_tree = 
                    (Object)adaptor.create(char_literal214)
                    ;
                    adaptor.addChild(root_0, char_literal214_tree);
                    }
                    dbg.location(193,59);
                    CONTAINS_TOK215=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK215_tree = 
                    (Object)adaptor.create(CONTAINS_TOK215)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK215_tree, root_0);
                    }
                    dbg.location(193,67);
                    LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1288); if (state.failed) return retval;
                    dbg.location(193,69);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1291);
                    base64BinaryExpr217=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr217.getTree());
                    dbg.location(193,92);
                    RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1293); if (state.failed) return retval;

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
        dbg.location(194, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set220=null;
        Token set223=null;
        Token set226=null;
        Token set229=null;
        Token set232=null;
        Token set235=null;
        Token set238=null;
        Token set241=null;
        Token set244=null;
        Token set247=null;
        Token set250=null;
        Token set253=null;
        GrammarParser.integerExpr_return integerExpr219 =null;

        GrammarParser.integerExpr_return integerExpr221 =null;

        GrammarParser.doubleExpr_return doubleExpr222 =null;

        GrammarParser.doubleExpr_return doubleExpr224 =null;

        GrammarParser.stringExpr_return stringExpr225 =null;

        GrammarParser.stringExpr_return stringExpr227 =null;

        GrammarParser.anyUriExpr_return anyUriExpr228 =null;

        GrammarParser.anyUriExpr_return anyUriExpr230 =null;

        GrammarParser.dateExpr_return dateExpr231 =null;

        GrammarParser.dateExpr_return dateExpr233 =null;

        GrammarParser.timeExpr_return timeExpr234 =null;

        GrammarParser.timeExpr_return timeExpr236 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr237 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr239 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr240 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr242 =null;

        GrammarParser.x500NameExpr_return x500NameExpr243 =null;

        GrammarParser.x500NameExpr_return x500NameExpr245 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr246 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr248 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr249 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr251 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr252 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr254 =null;


        Object set220_tree=null;
        Object set223_tree=null;
        Object set226_tree=null;
        Object set229_tree=null;
        Object set232_tree=null;
        Object set235_tree=null;
        Object set238_tree=null;
        Object set241_tree=null;
        Object set244_tree=null;
        Object set247_tree=null;
        Object set250_tree=null;
        Object set253_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr )
            int alt13=12;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(197,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1305);
                    integerExpr219=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr219.getTree());
                    dbg.location(197,50);
                    set220=(Token)input.LT(1);

                    set220=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set220)
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

                    dbg.location(197,52);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1330);
                    integerExpr221=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr221.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(198,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1335);
                    doubleExpr222=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr222.getTree());
                    dbg.location(198,49);
                    set223=(Token)input.LT(1);

                    set223=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set223)
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

                    dbg.location(198,51);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1360);
                    doubleExpr224=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr224.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(199,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1365);
                    stringExpr225=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr225.getTree());
                    dbg.location(199,49);
                    set226=(Token)input.LT(1);

                    set226=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set226)
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

                    dbg.location(199,51);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1390);
                    stringExpr227=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr227.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1395);
                    anyUriExpr228=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr228.getTree());
                    dbg.location(200,49);
                    set229=(Token)input.LT(1);

                    set229=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set229)
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

                    dbg.location(200,51);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1420);
                    anyUriExpr230=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr230.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1425);
                    dateExpr231=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr231.getTree());
                    dbg.location(201,47);
                    set232=(Token)input.LT(1);

                    set232=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set232)
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

                    dbg.location(201,49);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1450);
                    dateExpr233=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr233.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1455);
                    timeExpr234=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr234.getTree());
                    dbg.location(202,47);
                    set235=(Token)input.LT(1);

                    set235=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set235)
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

                    dbg.location(202,49);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1480);
                    timeExpr236=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr236.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1485);
                    dateTimeExpr237=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr237.getTree());
                    dbg.location(203,51);
                    set238=(Token)input.LT(1);

                    set238=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(203,53);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1510);
                    dateTimeExpr239=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr239.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1515);
                    yearMonthDurationExpr240=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr240.getTree());
                    dbg.location(204,60);
                    set241=(Token)input.LT(1);

                    set241=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(204,62);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1540);
                    yearMonthDurationExpr242=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr242.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(205,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1545);
                    x500NameExpr243=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr243.getTree());
                    dbg.location(205,51);
                    set244=(Token)input.LT(1);

                    set244=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(205,53);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1570);
                    x500NameExpr245=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr245.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(206,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1575);
                    rfc822NameExpr246=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr246.getTree());
                    dbg.location(206,54);
                    set247=(Token)input.LT(1);

                    set247=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(206,56);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1601);
                    rfc822NameExpr248=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr248.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:4: dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(207,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1606);
                    dayTimeDurationExpr249=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr249.getTree());
                    dbg.location(207,58);
                    set250=(Token)input.LT(1);

                    set250=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(207,60);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1631);
                    dayTimeDurationExpr251=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr251.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:4: base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(208,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1636);
                    base64BinaryExpr252=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr252.getTree());
                    dbg.location(208,55);
                    set253=(Token)input.LT(1);

                    set253=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
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

                    dbg.location(208,57);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1661);
                    base64BinaryExpr254=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr254.getTree());

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
        dbg.location(209, 2);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal256=null;
        Token REGEXMATCH_TOK257=null;
        Token LPAREN258=null;
        Token RPAREN260=null;
        Token char_literal262=null;
        Token REGEXMATCH_TOK263=null;
        Token LPAREN264=null;
        Token RPAREN266=null;
        Token char_literal268=null;
        Token REGEXMATCH_TOK269=null;
        Token LPAREN270=null;
        Token RPAREN272=null;
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
        GrammarParser.integerExpr_return integerExpr255 =null;

        GrammarParser.integerExpr_return integerExpr259 =null;

        GrammarParser.doubleExpr_return doubleExpr261 =null;

        GrammarParser.doubleExpr_return doubleExpr265 =null;

        GrammarParser.stringExpr_return stringExpr267 =null;

        GrammarParser.stringExpr_return stringExpr271 =null;

        GrammarParser.anyUriExpr_return anyUriExpr273 =null;

        GrammarParser.anyUriExpr_return anyUriExpr277 =null;

        GrammarParser.dateExpr_return dateExpr279 =null;

        GrammarParser.dateExpr_return dateExpr283 =null;

        GrammarParser.timeExpr_return timeExpr285 =null;

        GrammarParser.timeExpr_return timeExpr289 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr291 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr295 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr297 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr301 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr303 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr307 =null;

        GrammarParser.x500NameExpr_return x500NameExpr309 =null;

        GrammarParser.x500NameExpr_return x500NameExpr313 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr315 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr319 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr321 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr325 =null;


        Object char_literal256_tree=null;
        Object REGEXMATCH_TOK257_tree=null;
        Object LPAREN258_tree=null;
        Object RPAREN260_tree=null;
        Object char_literal262_tree=null;
        Object REGEXMATCH_TOK263_tree=null;
        Object LPAREN264_tree=null;
        Object RPAREN266_tree=null;
        Object char_literal268_tree=null;
        Object REGEXMATCH_TOK269_tree=null;
        Object LPAREN270_tree=null;
        Object RPAREN272_tree=null;
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

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:2: ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
            int alt14=12;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(212,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1673);
                    integerExpr255=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr255.getTree());
                    dbg.location(212,17);
                    char_literal256=(Token)match(input,84,FOLLOW_84_in_regexOp1676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal256_tree = 
                    (Object)adaptor.create(char_literal256)
                    ;
                    adaptor.addChild(root_0, char_literal256_tree);
                    }
                    dbg.location(212,35);
                    REGEXMATCH_TOK257=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK257_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK257)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK257_tree, root_0);
                    }
                    dbg.location(212,43);
                    LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1681); if (state.failed) return retval;
                    dbg.location(212,45);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1684);
                    integerExpr259=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr259.getTree());
                    dbg.location(212,63);
                    RPAREN260=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1686); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:4: doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1692);
                    doubleExpr261=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr261.getTree());
                    dbg.location(213,15);
                    char_literal262=(Token)match(input,84,FOLLOW_84_in_regexOp1694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal262_tree = 
                    (Object)adaptor.create(char_literal262)
                    ;
                    adaptor.addChild(root_0, char_literal262_tree);
                    }
                    dbg.location(213,33);
                    REGEXMATCH_TOK263=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK263_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK263)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK263_tree, root_0);
                    }
                    dbg.location(213,41);
                    LPAREN264=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1699); if (state.failed) return retval;
                    dbg.location(213,43);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1702);
                    doubleExpr265=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr265.getTree());
                    dbg.location(213,60);
                    RPAREN266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1704); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(214,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1710);
                    stringExpr267=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr267.getTree());
                    dbg.location(214,15);
                    char_literal268=(Token)match(input,84,FOLLOW_84_in_regexOp1712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = 
                    (Object)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);
                    }
                    dbg.location(214,33);
                    REGEXMATCH_TOK269=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK269_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK269)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK269_tree, root_0);
                    }
                    dbg.location(214,41);
                    LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1717); if (state.failed) return retval;
                    dbg.location(214,43);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1720);
                    stringExpr271=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr271.getTree());
                    dbg.location(214,60);
                    RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1722); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:4: anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1728);
                    anyUriExpr273=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr273.getTree());
                    dbg.location(215,15);
                    char_literal274=(Token)match(input,84,FOLLOW_84_in_regexOp1730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);
                    }
                    dbg.location(215,33);
                    REGEXMATCH_TOK275=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK275_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK275)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK275_tree, root_0);
                    }
                    dbg.location(215,41);
                    LPAREN276=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1735); if (state.failed) return retval;
                    dbg.location(215,43);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1738);
                    anyUriExpr277=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr277.getTree());
                    dbg.location(215,60);
                    RPAREN278=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1740); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(216,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1746);
                    dateExpr279=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr279.getTree());
                    dbg.location(216,13);
                    char_literal280=(Token)match(input,84,FOLLOW_84_in_regexOp1748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal280_tree = 
                    (Object)adaptor.create(char_literal280)
                    ;
                    adaptor.addChild(root_0, char_literal280_tree);
                    }
                    dbg.location(216,31);
                    REGEXMATCH_TOK281=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK281_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK281)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK281_tree, root_0);
                    }
                    dbg.location(216,39);
                    LPAREN282=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1753); if (state.failed) return retval;
                    dbg.location(216,41);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1756);
                    dateExpr283=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr283.getTree());
                    dbg.location(216,56);
                    RPAREN284=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1758); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(217,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1764);
                    timeExpr285=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr285.getTree());
                    dbg.location(217,13);
                    char_literal286=(Token)match(input,84,FOLLOW_84_in_regexOp1766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal286_tree = 
                    (Object)adaptor.create(char_literal286)
                    ;
                    adaptor.addChild(root_0, char_literal286_tree);
                    }
                    dbg.location(217,31);
                    REGEXMATCH_TOK287=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK287_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK287)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK287_tree, root_0);
                    }
                    dbg.location(217,39);
                    LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1771); if (state.failed) return retval;
                    dbg.location(217,41);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1774);
                    timeExpr289=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr289.getTree());
                    dbg.location(217,56);
                    RPAREN290=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1776); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1782);
                    dateTimeExpr291=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr291.getTree());
                    dbg.location(218,17);
                    char_literal292=(Token)match(input,84,FOLLOW_84_in_regexOp1784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal292_tree = 
                    (Object)adaptor.create(char_literal292)
                    ;
                    adaptor.addChild(root_0, char_literal292_tree);
                    }
                    dbg.location(218,35);
                    REGEXMATCH_TOK293=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK293_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK293)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK293_tree, root_0);
                    }
                    dbg.location(218,43);
                    LPAREN294=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1789); if (state.failed) return retval;
                    dbg.location(218,45);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1792);
                    dateTimeExpr295=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr295.getTree());
                    dbg.location(218,64);
                    RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1794); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:219:4: dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(219,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1800);
                    dayTimeDurationExpr297=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr297.getTree());
                    dbg.location(219,24);
                    char_literal298=(Token)match(input,84,FOLLOW_84_in_regexOp1802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal298_tree = 
                    (Object)adaptor.create(char_literal298)
                    ;
                    adaptor.addChild(root_0, char_literal298_tree);
                    }
                    dbg.location(219,42);
                    REGEXMATCH_TOK299=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK299_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK299)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK299_tree, root_0);
                    }
                    dbg.location(219,50);
                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1807); if (state.failed) return retval;
                    dbg.location(219,52);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1810);
                    dayTimeDurationExpr301=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr301.getTree());
                    dbg.location(219,78);
                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1812); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:220:4: yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(220,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1818);
                    yearMonthDurationExpr303=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr303.getTree());
                    dbg.location(220,26);
                    char_literal304=(Token)match(input,84,FOLLOW_84_in_regexOp1820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal304_tree = 
                    (Object)adaptor.create(char_literal304)
                    ;
                    adaptor.addChild(root_0, char_literal304_tree);
                    }
                    dbg.location(220,44);
                    REGEXMATCH_TOK305=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK305_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK305)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK305_tree, root_0);
                    }
                    dbg.location(220,52);
                    LPAREN306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1825); if (state.failed) return retval;
                    dbg.location(220,54);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1828);
                    yearMonthDurationExpr307=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr307.getTree());
                    dbg.location(220,82);
                    RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1830); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:221:4: x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(221,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1836);
                    x500NameExpr309=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr309.getTree());
                    dbg.location(221,17);
                    char_literal310=(Token)match(input,84,FOLLOW_84_in_regexOp1838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal310_tree = 
                    (Object)adaptor.create(char_literal310)
                    ;
                    adaptor.addChild(root_0, char_literal310_tree);
                    }
                    dbg.location(221,35);
                    REGEXMATCH_TOK311=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK311_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK311)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK311_tree, root_0);
                    }
                    dbg.location(221,43);
                    LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1843); if (state.failed) return retval;
                    dbg.location(221,45);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1846);
                    x500NameExpr313=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr313.getTree());
                    dbg.location(221,64);
                    RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1848); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:4: rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(222,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1854);
                    rfc822NameExpr315=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr315.getTree());
                    dbg.location(222,19);
                    char_literal316=(Token)match(input,84,FOLLOW_84_in_regexOp1856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal316_tree = 
                    (Object)adaptor.create(char_literal316)
                    ;
                    adaptor.addChild(root_0, char_literal316_tree);
                    }
                    dbg.location(222,37);
                    REGEXMATCH_TOK317=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK317_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK317)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK317_tree, root_0);
                    }
                    dbg.location(222,45);
                    LPAREN318=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1861); if (state.failed) return retval;
                    dbg.location(222,47);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1864);
                    rfc822NameExpr319=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr319.getTree());
                    dbg.location(222,68);
                    RPAREN320=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1866); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:4: base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(223,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1872);
                    base64BinaryExpr321=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr321.getTree());
                    dbg.location(223,21);
                    char_literal322=(Token)match(input,84,FOLLOW_84_in_regexOp1874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal322_tree = 
                    (Object)adaptor.create(char_literal322)
                    ;
                    adaptor.addChild(root_0, char_literal322_tree);
                    }
                    dbg.location(223,39);
                    REGEXMATCH_TOK323=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK323_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK323)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK323_tree, root_0);
                    }
                    dbg.location(223,47);
                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1879); if (state.failed) return retval;
                    dbg.location(223,49);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1882);
                    base64BinaryExpr325=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr325.getTree());
                    dbg.location(223,72);
                    RPAREN326=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1884); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:1: bagOp : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal328=null;
        Token set329=null;
        Token LPAREN330=null;
        Token RPAREN332=null;
        Token char_literal334=null;
        Token set335=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        Token char_literal340=null;
        Token set341=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
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
        GrammarParser.booleanBag_return booleanBag327 =null;

        GrammarParser.booleanBag_return booleanBag331 =null;

        GrammarParser.integerBag_return integerBag333 =null;

        GrammarParser.integerBag_return integerBag337 =null;

        GrammarParser.doubleBag_return doubleBag339 =null;

        GrammarParser.doubleBag_return doubleBag343 =null;

        GrammarParser.stringBag_return stringBag345 =null;

        GrammarParser.stringBag_return stringBag349 =null;

        GrammarParser.dateBag_return dateBag351 =null;

        GrammarParser.dateBag_return dateBag355 =null;

        GrammarParser.timeBag_return timeBag357 =null;

        GrammarParser.timeBag_return timeBag361 =null;

        GrammarParser.dateTimeBag_return dateTimeBag363 =null;

        GrammarParser.dateTimeBag_return dateTimeBag367 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag369 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag373 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag375 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag379 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag381 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag385 =null;

        GrammarParser.anyUriBag_return anyUriBag387 =null;

        GrammarParser.anyUriBag_return anyUriBag391 =null;

        GrammarParser.x500NameBag_return x500NameBag393 =null;

        GrammarParser.x500NameBag_return x500NameBag397 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag399 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag403 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag405 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag409 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag411 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag415 =null;


        Object char_literal328_tree=null;
        Object set329_tree=null;
        Object LPAREN330_tree=null;
        Object RPAREN332_tree=null;
        Object char_literal334_tree=null;
        Object set335_tree=null;
        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
        Object char_literal340_tree=null;
        Object set341_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;
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

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !)
            int alt15=15;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOLEAN_TOK) && (synpred3_Grammar())) {
                alt15=1;
            }
            else if ( (LA15_0==INTEGER_TOK) && (synpred4_Grammar())) {
                alt15=2;
            }
            else if ( (LA15_0==BAG_TOK) && (synpred4_Grammar())) {
                alt15=2;
            }
            else if ( (LA15_0==DOUBLE_TOK) && (synpred5_Grammar())) {
                alt15=3;
            }
            else if ( (LA15_0==STRING_TOK) && (synpred6_Grammar())) {
                alt15=4;
            }
            else if ( (LA15_0==ACTION_TOK||LA15_0==ENVIRONMENT_TOK||LA15_0==RESOURCE_TOK||LA15_0==SUBJECT_TOK) && (synpred6_Grammar())) {
                alt15=4;
            }
            else if ( (LA15_0==DATE_TOK) && (synpred7_Grammar())) {
                alt15=5;
            }
            else if ( (LA15_0==TIME_TOK) && (synpred8_Grammar())) {
                alt15=6;
            }
            else if ( (LA15_0==DATETIME_TOK) && (synpred9_Grammar())) {
                alt15=7;
            }
            else if ( (LA15_0==BASE64BINARY_TOK) ) {
                int LA15_10 = input.LA(2);

                if ( (LA15_10==STRING_CONSTANT_LIST) ) {
                    int LA15_17 = input.LA(3);

                    if ( (LA15_17==84) ) {
                        int LA15_18 = input.LA(4);

                        if ( (LA15_18==ATLEASTONEMENBEROF_TOK||LA15_18==SETEQUALS_TOK||LA15_18==SUBSET_TOK) ) {
                            int LA15_19 = input.LA(5);

                            if ( (LA15_19==LPAREN) ) {
                                int LA15_20 = input.LA(6);

                                if ( (LA15_20==BASE64BINARY_TOK) ) {
                                    int LA15_21 = input.LA(7);

                                    if ( (LA15_21==STRING_CONSTANT_LIST) ) {
                                        int LA15_22 = input.LA(8);

                                        if ( (LA15_22==RPAREN) ) {
                                            int LA15_23 = input.LA(9);

                                            if ( (synpred10_Grammar()) ) {
                                                alt15=8;
                                            }
                                            else if ( (synpred17_Grammar()) ) {
                                                alt15=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 15, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 15, 22, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 15, 21, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 20, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 19, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 18, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA15_0==DAYTIMEDURATION_TOK) && (synpred11_Grammar())) {
                alt15=9;
            }
            else if ( (LA15_0==YEARMONTHDURATION_TOK) && (synpred12_Grammar())) {
                alt15=10;
            }
            else if ( (LA15_0==ANYURI_TOK) && (synpred13_Grammar())) {
                alt15=11;
            }
            else if ( (LA15_0==X500NAME_TOK) && (synpred14_Grammar())) {
                alt15=12;
            }
            else if ( (LA15_0==RFC822NAME_TOK) && (synpred15_Grammar())) {
                alt15=13;
            }
            else if ( (LA15_0==HEXBINARY_TOK) && (synpred16_Grammar())) {
                alt15=14;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(227,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1902);
                    booleanBag327=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag327.getTree());
                    dbg.location(227,31);
                    char_literal328=(Token)match(input,84,FOLLOW_84_in_bagOp1904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal328_tree = 
                    (Object)adaptor.create(char_literal328)
                    ;
                    adaptor.addChild(root_0, char_literal328_tree);
                    }
                    dbg.location(227,90);
                    set329=(Token)input.LT(1);

                    set329=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set329)
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

                    dbg.location(227,98);
                    LPAREN330=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1921); if (state.failed) return retval;
                    dbg.location(227,100);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1924);
                    booleanBag331=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag331.getTree());
                    dbg.location(227,117);
                    RPAREN332=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1926); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(228,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1938);
                    integerBag333=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag333.getTree());
                    dbg.location(228,31);
                    char_literal334=(Token)match(input,84,FOLLOW_84_in_bagOp1940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = 
                    (Object)adaptor.create(char_literal334)
                    ;
                    adaptor.addChild(root_0, char_literal334_tree);
                    }
                    dbg.location(228,91);
                    set335=(Token)input.LT(1);

                    set335=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set335)
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

                    dbg.location(228,99);
                    LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1958); if (state.failed) return retval;
                    dbg.location(228,102);
                    pushFollow(FOLLOW_integerBag_in_bagOp1962);
                    integerBag337=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag337.getTree());
                    dbg.location(228,119);
                    RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1964); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(229,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp1976);
                    doubleBag339=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag339.getTree());
                    dbg.location(229,29);
                    char_literal340=(Token)match(input,84,FOLLOW_84_in_bagOp1978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal340_tree = 
                    (Object)adaptor.create(char_literal340)
                    ;
                    adaptor.addChild(root_0, char_literal340_tree);
                    }
                    dbg.location(229,89);
                    set341=(Token)input.LT(1);

                    set341=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set341)
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

                    dbg.location(229,97);
                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1996); if (state.failed) return retval;
                    dbg.location(229,100);
                    pushFollow(FOLLOW_doubleBag_in_bagOp2000);
                    doubleBag343=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag343.getTree());
                    dbg.location(229,116);
                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2002); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(230,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp2015);
                    stringBag345=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag345.getTree());
                    dbg.location(230,30);
                    char_literal346=(Token)match(input,84,FOLLOW_84_in_bagOp2017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal346_tree = 
                    (Object)adaptor.create(char_literal346)
                    ;
                    adaptor.addChild(root_0, char_literal346_tree);
                    }
                    dbg.location(230,90);
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

                    dbg.location(230,98);
                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2035); if (state.failed) return retval;
                    dbg.location(230,101);
                    pushFollow(FOLLOW_stringBag_in_bagOp2039);
                    stringBag349=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag349.getTree());
                    dbg.location(230,117);
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2041); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(231,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp2054);
                    dateBag351=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag351.getTree());
                    dbg.location(231,26);
                    char_literal352=(Token)match(input,84,FOLLOW_84_in_bagOp2056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal352_tree = 
                    (Object)adaptor.create(char_literal352)
                    ;
                    adaptor.addChild(root_0, char_literal352_tree);
                    }
                    dbg.location(231,86);
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

                    dbg.location(231,94);
                    LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2074); if (state.failed) return retval;
                    dbg.location(231,97);
                    pushFollow(FOLLOW_dateBag_in_bagOp2078);
                    dateBag355=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag355.getTree());
                    dbg.location(231,111);
                    RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2080); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(232,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp2093);
                    timeBag357=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag357.getTree());
                    dbg.location(232,26);
                    char_literal358=(Token)match(input,84,FOLLOW_84_in_bagOp2095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal358_tree = 
                    (Object)adaptor.create(char_literal358)
                    ;
                    adaptor.addChild(root_0, char_literal358_tree);
                    }
                    dbg.location(232,86);
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

                    dbg.location(232,94);
                    LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2113); if (state.failed) return retval;
                    dbg.location(232,97);
                    pushFollow(FOLLOW_timeBag_in_bagOp2117);
                    timeBag361=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag361.getTree());
                    dbg.location(232,111);
                    RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2119); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2132);
                    dateTimeBag363=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag363.getTree());
                    dbg.location(233,34);
                    char_literal364=(Token)match(input,84,FOLLOW_84_in_bagOp2134); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal364_tree = 
                    (Object)adaptor.create(char_literal364)
                    ;
                    adaptor.addChild(root_0, char_literal364_tree);
                    }
                    dbg.location(233,94);
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

                    dbg.location(233,102);
                    LPAREN366=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2152); if (state.failed) return retval;
                    dbg.location(233,105);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2156);
                    dateTimeBag367=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag367.getTree());
                    dbg.location(233,123);
                    RPAREN368=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2158); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(234,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2171);
                    base64BinaryBag369=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag369.getTree());
                    dbg.location(234,42);
                    char_literal370=(Token)match(input,84,FOLLOW_84_in_bagOp2173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal370_tree = 
                    (Object)adaptor.create(char_literal370)
                    ;
                    adaptor.addChild(root_0, char_literal370_tree);
                    }
                    dbg.location(234,101);
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

                    dbg.location(234,109);
                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2190); if (state.failed) return retval;
                    dbg.location(234,112);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2194);
                    base64BinaryBag373=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag373.getTree());
                    dbg.location(234,134);
                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2196); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(235,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2209);
                    dayTimeDurationBag375=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag375.getTree());
                    dbg.location(235,48);
                    char_literal376=(Token)match(input,84,FOLLOW_84_in_bagOp2211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal376_tree = 
                    (Object)adaptor.create(char_literal376)
                    ;
                    adaptor.addChild(root_0, char_literal376_tree);
                    }
                    dbg.location(235,107);
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

                    dbg.location(235,115);
                    LPAREN378=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2228); if (state.failed) return retval;
                    dbg.location(235,118);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2232);
                    dayTimeDurationBag379=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag379.getTree());
                    dbg.location(235,143);
                    RPAREN380=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2234); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(236,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2247);
                    yearMonthDurationBag381=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag381.getTree());
                    dbg.location(236,52);
                    char_literal382=(Token)match(input,84,FOLLOW_84_in_bagOp2249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = 
                    (Object)adaptor.create(char_literal382)
                    ;
                    adaptor.addChild(root_0, char_literal382_tree);
                    }
                    dbg.location(236,112);
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

                    dbg.location(236,120);
                    LPAREN384=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2267); if (state.failed) return retval;
                    dbg.location(236,123);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2271);
                    yearMonthDurationBag385=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag385.getTree());
                    dbg.location(236,150);
                    RPAREN386=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2273); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(237,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2286);
                    anyUriBag387=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag387.getTree());
                    dbg.location(237,30);
                    char_literal388=(Token)match(input,84,FOLLOW_84_in_bagOp2288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal388_tree = 
                    (Object)adaptor.create(char_literal388)
                    ;
                    adaptor.addChild(root_0, char_literal388_tree);
                    }
                    dbg.location(237,90);
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

                    dbg.location(237,98);
                    LPAREN390=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2306); if (state.failed) return retval;
                    dbg.location(237,101);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2310);
                    anyUriBag391=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag391.getTree());
                    dbg.location(237,117);
                    RPAREN392=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2312); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(238,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2325);
                    x500NameBag393=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag393.getTree());
                    dbg.location(238,34);
                    char_literal394=(Token)match(input,84,FOLLOW_84_in_bagOp2327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal394_tree = 
                    (Object)adaptor.create(char_literal394)
                    ;
                    adaptor.addChild(root_0, char_literal394_tree);
                    }
                    dbg.location(238,94);
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

                    dbg.location(238,102);
                    LPAREN396=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2345); if (state.failed) return retval;
                    dbg.location(238,105);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2349);
                    x500NameBag397=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag397.getTree());
                    dbg.location(238,123);
                    RPAREN398=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2351); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(239,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2364);
                    rfc822NameBag399=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag399.getTree());
                    dbg.location(239,38);
                    char_literal400=(Token)match(input,84,FOLLOW_84_in_bagOp2366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal400_tree = 
                    (Object)adaptor.create(char_literal400)
                    ;
                    adaptor.addChild(root_0, char_literal400_tree);
                    }
                    dbg.location(239,97);
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

                    dbg.location(239,105);
                    LPAREN402=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2383); if (state.failed) return retval;
                    dbg.location(239,108);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2387);
                    rfc822NameBag403=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag403.getTree());
                    dbg.location(239,128);
                    RPAREN404=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2389); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(240,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2402);
                    hexBinaryBag405=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag405.getTree());
                    dbg.location(240,36);
                    char_literal406=(Token)match(input,84,FOLLOW_84_in_bagOp2404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal406_tree = 
                    (Object)adaptor.create(char_literal406)
                    ;
                    adaptor.addChild(root_0, char_literal406_tree);
                    }
                    dbg.location(240,96);
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

                    dbg.location(240,104);
                    LPAREN408=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2422); if (state.failed) return retval;
                    dbg.location(240,107);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2426);
                    hexBinaryBag409=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag409.getTree());
                    dbg.location(240,126);
                    RPAREN410=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2428); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(241,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2440);
                    base64BinaryBag411=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag411.getTree());
                    dbg.location(241,41);
                    char_literal412=(Token)match(input,84,FOLLOW_84_in_bagOp2442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal412_tree = 
                    (Object)adaptor.create(char_literal412)
                    ;
                    adaptor.addChild(root_0, char_literal412_tree);
                    }
                    dbg.location(241,101);
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

                    dbg.location(241,109);
                    LPAREN414=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2460); if (state.failed) return retval;
                    dbg.location(241,112);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2464);
                    base64BinaryBag415=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag415.getTree());
                    dbg.location(241,134);
                    RPAREN416=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2466); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:1: integerExpr : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT417=null;
        Token char_literal419=null;
        Token set420=null;
        Token LPAREN421=null;
        Token RPAREN422=null;
        Token char_literal424=null;
        Token SIZE_TOK425=null;
        Token LPAREN426=null;
        Token RPAREN427=null;
        GrammarParser.stringExpr_return stringExpr418 =null;

        GrammarParser.anyBag_return anyBag423 =null;


        Object INTEGER_CONSTANT417_tree=null;
        Object char_literal419_tree=null;
        Object set420_tree=null;
        Object LPAREN421_tree=null;
        Object RPAREN422_tree=null;
        Object char_literal424_tree=null;
        Object SIZE_TOK425_tree=null;
        Object LPAREN426_tree=null;
        Object RPAREN427_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:2: ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !)
            int alt16=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:4: INTEGER_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(245,20);
                    INTEGER_CONSTANT417=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT417_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT417)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(INTEGER_CONSTANT417_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(246,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2484);
                    stringExpr418=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr418.getTree());
                    dbg.location(246,15);
                    char_literal419=(Token)match(input,84,FOLLOW_84_in_integerExpr2486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = 
                    (Object)adaptor.create(char_literal419)
                    ;
                    adaptor.addChild(root_0, char_literal419_tree);
                    }
                    dbg.location(246,50);
                    set420=(Token)input.LT(1);

                    set420=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set420)
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

                    dbg.location(246,58);
                    LPAREN421=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2499); if (state.failed) return retval;
                    dbg.location(246,67);
                    RPAREN422=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2503); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(247,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2509);
                    anyBag423=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag423.getTree());
                    dbg.location(247,11);
                    char_literal424=(Token)match(input,84,FOLLOW_84_in_integerExpr2511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal424_tree = 
                    (Object)adaptor.create(char_literal424)
                    ;
                    adaptor.addChild(root_0, char_literal424_tree);
                    }
                    dbg.location(247,23);
                    SIZE_TOK425=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK425_tree = 
                    (Object)adaptor.create(SIZE_TOK425)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SIZE_TOK425_tree, root_0);
                    }
                    dbg.location(247,31);
                    LPAREN426=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2516); if (state.failed) return retval;
                    dbg.location(247,39);
                    RPAREN427=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2519); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:1: integerBag : ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK428=null;
        Token STRING_CONSTANT_LIST429=null;
        Token BAG_TOK430=null;
        Token LPAREN431=null;
        Token char_literal433=null;
        Token RPAREN435=null;
        Token char_literal436=null;
        Token set437=null;
        Token LPAREN438=null;
        Token RPAREN440=null;
        GrammarParser.integerExpr_return integerExpr432 =null;

        GrammarParser.integerExpr_return integerExpr434 =null;

        GrammarParser.integerBag_return integerBag439 =null;


        Object INTEGER_TOK428_tree=null;
        Object STRING_CONSTANT_LIST429_tree=null;
        Object BAG_TOK430_tree=null;
        Object LPAREN431_tree=null;
        Object char_literal433_tree=null;
        Object RPAREN435_tree=null;
        Object char_literal436_tree=null;
        Object set437_tree=null;
        Object LPAREN438_tree=null;
        Object RPAREN440_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:2: ( ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(253,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !)
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==INTEGER_TOK) ) {
                alt18=1;
            }
            else if ( (LA18_0==BAG_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:5: INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    dbg.location(253,5);
                    INTEGER_TOK428=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK428_tree = 
                    (Object)adaptor.create(INTEGER_TOK428)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK428_tree);
                    }
                    dbg.location(253,17);
                    STRING_CONSTANT_LIST429=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST429_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST429)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST429_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:40: BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !
                    {
                    dbg.location(253,47);
                    BAG_TOK430=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK430_tree = 
                    (Object)adaptor.create(BAG_TOK430)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BAG_TOK430_tree, root_0);
                    }
                    dbg.location(253,55);
                    LPAREN431=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2543); if (state.failed) return retval;
                    dbg.location(253,57);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2546);
                    integerExpr432=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr432.getTree());
                    dbg.location(253,69);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:69: ( ',' ! integerExpr )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==83) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:71: ',' ! integerExpr
                    	    {
                    	    dbg.location(253,74);
                    	    char_literal433=(Token)match(input,83,FOLLOW_83_in_integerBag2550); if (state.failed) return retval;
                    	    dbg.location(253,76);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2553);
                    	    integerExpr434=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr434.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt17++;
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(253,96);
                    RPAREN435=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2557); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(253,99);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:99: ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==84) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==INTERSECTION_TOK||LA19_1==UNION_TOK) ) {
                        alt19=1;
                    }


                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:100: '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !
            	    {
            	    dbg.location(253,100);
            	    char_literal436=(Token)match(input,84,FOLLOW_84_in_integerBag2562); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal436_tree = 
            	    (Object)adaptor.create(char_literal436)
            	    ;
            	    adaptor.addChild(root_0, char_literal436_tree);
            	    }
            	    dbg.location(253,136);
            	    set437=(Token)input.LT(1);

            	    set437=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set437)
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

            	    dbg.location(253,144);
            	    LPAREN438=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2575); if (state.failed) return retval;
            	    dbg.location(253,146);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2578);
            	    integerBag439=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag439.getTree());
            	    dbg.location(253,163);
            	    RPAREN440=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2580); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:256:1: doubleExpr : ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !);
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT441=null;
        Token DOUBLE_TOK442=null;
        Token LPAREN443=null;
        Token RPAREN445=null;
        GrammarParser.stringExpr_return stringExpr444 =null;


        Object DOUBLE_CONSTANT441_tree=null;
        Object DOUBLE_TOK442_tree=null;
        Object LPAREN443_tree=null;
        Object RPAREN445_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:2: ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !)
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOUBLE_CONSTANT) ) {
                alt20=1;
            }
            else if ( (LA20_0==DOUBLE_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:4: DOUBLE_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(257,19);
                    DOUBLE_CONSTANT441=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT441_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT441)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_CONSTANT441_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:4: DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(258,14);
                    DOUBLE_TOK442=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK442_tree = 
                    (Object)adaptor.create(DOUBLE_TOK442)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK442_tree, root_0);
                    }
                    dbg.location(258,22);
                    LPAREN443=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doubleExpr2603); if (state.failed) return retval;
                    dbg.location(258,24);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2606);
                    stringExpr444=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr444.getTree());
                    dbg.location(258,41);
                    RPAREN445=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doubleExpr2608); if (state.failed) return retval;

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
        dbg.location(261, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:1: doubleBag : DOUBLE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK446=null;
        Token STRING_CONSTANT_LIST447=null;

        Object DOUBLE_TOK446_tree=null;
        Object STRING_CONSTANT_LIST447_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:263:2: ( DOUBLE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:263:4: DOUBLE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(263,14);
            DOUBLE_TOK446=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2621); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK446_tree = 
            (Object)adaptor.create(DOUBLE_TOK446)
            ;
            root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK446_tree, root_0);
            }
            dbg.location(263,16);
            STRING_CONSTANT_LIST447=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2624); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST447_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST447)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST447_tree);
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
        dbg.location(266, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:1: stringExpr : ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)* ;
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT448=null;
        Token char_literal450=null;
        Token ONEANDONLY_TOK451=null;
        Token LPAREN452=null;
        Token RPAREN453=null;
        Token char_literal454=null;
        Token set455=null;
        Token LPAREN456=null;
        Token RPAREN457=null;
        GrammarParser.stringBag_return stringBag449 =null;


        Object STRING_CONSTANT448_tree=null;
        Object char_literal450_tree=null;
        Object ONEANDONLY_TOK451_tree=null;
        Object LPAREN452_tree=null;
        Object RPAREN453_tree=null;
        Object char_literal454_tree=null;
        Object set455_tree=null;
        Object LPAREN456_tree=null;
        Object RPAREN457_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(268, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:2: ( ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(269,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==STRING_CONSTANT) ) {
                alt21=1;
            }
            else if ( (LA21_0==ACTION_TOK||LA21_0==ENVIRONMENT_TOK||LA21_0==RESOURCE_TOK||(LA21_0 >= STRING_TOK && LA21_0 <= SUBJECT_TOK)) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:5: STRING_CONSTANT ^
                    {
                    dbg.location(269,20);
                    STRING_CONSTANT448=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT448_tree = 
                    (Object)adaptor.create(STRING_CONSTANT448)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_CONSTANT448_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:5: stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    dbg.location(270,5);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2645);
                    stringBag449=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag449.getTree());
                    dbg.location(270,15);
                    char_literal450=(Token)match(input,84,FOLLOW_84_in_stringExpr2647); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal450_tree = 
                    (Object)adaptor.create(char_literal450)
                    ;
                    adaptor.addChild(root_0, char_literal450_tree);
                    }
                    dbg.location(270,33);
                    ONEANDONLY_TOK451=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK451_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK451)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK451_tree, root_0);
                    }
                    dbg.location(270,41);
                    LPAREN452=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2652); if (state.failed) return retval;
                    dbg.location(270,49);
                    RPAREN453=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2655); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(271,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:3: ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==84) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1 >= NORMALIZESPACE_TOK && LA22_1 <= NORMALIZETOLOWERCASE_TOK)||LA22_1==REQUIRED_TOK) ) {
                        alt22=1;
                    }


                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:4: '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !
            	    {
            	    dbg.location(271,4);
            	    char_literal454=(Token)match(input,84,FOLLOW_84_in_stringExpr2662); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal454_tree = 
            	    (Object)adaptor.create(char_literal454)
            	    ;
            	    adaptor.addChild(root_0, char_literal454_tree);
            	    }
            	    dbg.location(271,8);
            	    set455=(Token)input.LT(1);

            	    if ( (input.LA(1) >= NORMALIZESPACE_TOK && input.LA(1) <= NORMALIZETOLOWERCASE_TOK)||input.LA(1)==REQUIRED_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set455)
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

            	    dbg.location(271,78);
            	    LPAREN456=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2677); if (state.failed) return retval;
            	    dbg.location(271,86);
            	    RPAREN457=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2680); if (state.failed) return retval;

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
        dbg.location(272, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:1: stringBag : ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK458=null;
        Token STRING_CONSTANT_LIST459=null;
        GrammarParser.attributeExpr_return attributeExpr460 =null;


        Object STRING_TOK458_tree=null;
        Object STRING_CONSTANT_LIST459_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:2: ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==STRING_TOK) ) {
                alt23=1;
            }
            else if ( (LA23_0==ACTION_TOK||LA23_0==ENVIRONMENT_TOK||LA23_0==RESOURCE_TOK||LA23_0==SUBJECT_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:4: STRING_TOK ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(275,14);
                    STRING_TOK458=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK458_tree = 
                    (Object)adaptor.create(STRING_TOK458)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_TOK458_tree, root_0);
                    }
                    dbg.location(275,16);
                    STRING_CONSTANT_LIST459=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST459_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST459)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST459_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(276,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringBag2702);
                    attributeExpr460=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr460.getTree());

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:1: attributeExpr : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set461=null;
        Token char_literal462=null;
        Token LOWERCASEIDENTIFIER463=null;

        Object set461_tree=null;
        Object char_literal462_tree=null;
        Object LOWERCASEIDENTIFIER463_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(281, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(282,64);
            set461=(Token)input.LT(1);

            set461=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set461)
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

            dbg.location(282,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:66: ( '.' LOWERCASEIDENTIFIER )+
            int cnt24=0;
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==84) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==LOWERCASEIDENTIFIER) ) {
                        alt24=1;
                    }


                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:67: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(282,67);
            	    char_literal462=(Token)match(input,84,FOLLOW_84_in_attributeExpr2734); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal462_tree = 
            	    (Object)adaptor.create(char_literal462)
            	    ;
            	    adaptor.addChild(root_0, char_literal462_tree);
            	    }
            	    dbg.location(282,71);
            	    LOWERCASEIDENTIFIER463=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2736); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER463_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER463)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER463_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt24++;
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
        dbg.location(283, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:1: anyUriExpr : ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK464=null;
        Token LPAREN465=null;
        Token RPAREN467=null;
        Token char_literal469=null;
        Token ONEANDONLY_TOK470=null;
        Token LPAREN471=null;
        Token RPAREN472=null;
        Token char_literal474=null;
        Token URI_TOK475=null;
        Token LPAREN476=null;
        Token RPAREN477=null;
        GrammarParser.stringExpr_return stringExpr466 =null;

        GrammarParser.anyUriBag_return anyUriBag468 =null;

        GrammarParser.stringExpr_return stringExpr473 =null;


        Object ANYURI_TOK464_tree=null;
        Object LPAREN465_tree=null;
        Object RPAREN467_tree=null;
        Object char_literal469_tree=null;
        Object ONEANDONLY_TOK470_tree=null;
        Object LPAREN471_tree=null;
        Object RPAREN472_tree=null;
        Object char_literal474_tree=null;
        Object URI_TOK475_tree=null;
        Object LPAREN476_tree=null;
        Object RPAREN477_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:2: ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !)
            int alt25=3;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==ANYURI_TOK) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
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
            else if ( (LA25_0==ACTION_TOK||LA25_0==ENVIRONMENT_TOK||LA25_0==RESOURCE_TOK||LA25_0==STRING_CONSTANT||(LA25_0 >= STRING_TOK && LA25_0 <= SUBJECT_TOK)) ) {
                alt25=3;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:4: ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(286,14);
                    ANYURI_TOK464=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK464_tree = 
                    (Object)adaptor.create(ANYURI_TOK464)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK464_tree, root_0);
                    }
                    dbg.location(286,22);
                    LPAREN465=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2753); if (state.failed) return retval;
                    dbg.location(286,24);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2756);
                    stringExpr466=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr466.getTree());
                    dbg.location(286,41);
                    RPAREN467=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2758); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(287,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2764);
                    anyUriBag468=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag468.getTree());
                    dbg.location(287,14);
                    char_literal469=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal469_tree = 
                    (Object)adaptor.create(char_literal469)
                    ;
                    adaptor.addChild(root_0, char_literal469_tree);
                    }
                    dbg.location(287,32);
                    ONEANDONLY_TOK470=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK470_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK470)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK470_tree, root_0);
                    }
                    dbg.location(287,40);
                    LPAREN471=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2771); if (state.failed) return retval;
                    dbg.location(287,48);
                    RPAREN472=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2774); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:4: stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(288,4);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2780);
                    stringExpr473=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr473.getTree());
                    dbg.location(288,15);
                    char_literal474=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal474_tree = 
                    (Object)adaptor.create(char_literal474)
                    ;
                    adaptor.addChild(root_0, char_literal474_tree);
                    }
                    dbg.location(288,26);
                    URI_TOK475=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK475_tree = 
                    (Object)adaptor.create(URI_TOK475)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(URI_TOK475_tree, root_0);
                    }
                    dbg.location(288,34);
                    LPAREN476=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2787); if (state.failed) return retval;
                    dbg.location(288,42);
                    RPAREN477=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2790); if (state.failed) return retval;

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
        dbg.location(291, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:1: anyUriBag : ANYURI_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK478=null;
        Token STRING_CONSTANT_LIST479=null;

        Object ANYURI_TOK478_tree=null;
        Object STRING_CONSTANT_LIST479_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(293, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:2: ( ANYURI_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:4: ANYURI_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(294,14);
            ANYURI_TOK478=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK478_tree = 
            (Object)adaptor.create(ANYURI_TOK478)
            ;
            root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK478_tree, root_0);
            }
            dbg.location(294,16);
            STRING_CONSTANT_LIST479=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2807); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST479_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST479)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST479_tree);
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
        dbg.location(296, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:1: dateExpr : ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK480=null;
        Token LPAREN481=null;
        Token RPAREN483=null;
        Token char_literal485=null;
        Token ONEANDONLY_TOK486=null;
        Token LPAREN487=null;
        Token RPAREN488=null;
        GrammarParser.stringExpr_return stringExpr482 =null;

        GrammarParser.dateBag_return dateBag484 =null;


        Object DATE_TOK480_tree=null;
        Object LPAREN481_tree=null;
        Object RPAREN483_tree=null;
        Object char_literal485_tree=null;
        Object ONEANDONLY_TOK486_tree=null;
        Object LPAREN487_tree=null;
        Object RPAREN488_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:2: ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==DATE_TOK) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==LPAREN) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:4: DATE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(299,12);
                    DATE_TOK480=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK480_tree = 
                    (Object)adaptor.create(DATE_TOK480)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATE_TOK480_tree, root_0);
                    }
                    dbg.location(299,20);
                    LPAREN481=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2822); if (state.failed) return retval;
                    dbg.location(299,22);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2825);
                    stringExpr482=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr482.getTree());
                    dbg.location(299,39);
                    RPAREN483=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2827); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:4: dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(300,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2833);
                    dateBag484=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag484.getTree());
                    dbg.location(300,12);
                    char_literal485=(Token)match(input,84,FOLLOW_84_in_dateExpr2835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal485_tree = 
                    (Object)adaptor.create(char_literal485)
                    ;
                    adaptor.addChild(root_0, char_literal485_tree);
                    }
                    dbg.location(300,30);
                    ONEANDONLY_TOK486=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK486_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK486)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK486_tree, root_0);
                    }
                    dbg.location(300,38);
                    LPAREN487=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2840); if (state.failed) return retval;
                    dbg.location(300,46);
                    RPAREN488=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2843); if (state.failed) return retval;

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
        dbg.location(301, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:1: dateBag : DATE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK489=null;
        Token STRING_CONSTANT_LIST490=null;

        Object DATE_TOK489_tree=null;
        Object STRING_CONSTANT_LIST490_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(302, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:303:2: ( DATE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:303:4: DATE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(303,12);
            DATE_TOK489=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK489_tree = 
            (Object)adaptor.create(DATE_TOK489)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATE_TOK489_tree, root_0);
            }
            dbg.location(303,14);
            STRING_CONSTANT_LIST490=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2857); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST490_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST490)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST490_tree);
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
        dbg.location(306, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:1: timeExpr : ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !);
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK491=null;
        Token LPAREN492=null;
        Token RPAREN494=null;
        Token char_literal496=null;
        Token ONEANDONLY_TOK497=null;
        Token LPAREN498=null;
        Token RPAREN499=null;
        GrammarParser.stringExpr_return stringExpr493 =null;

        GrammarParser.timeBag_return timeBag495 =null;


        Object TIME_TOK491_tree=null;
        Object LPAREN492_tree=null;
        Object RPAREN494_tree=null;
        Object char_literal496_tree=null;
        Object ONEANDONLY_TOK497_tree=null;
        Object LPAREN498_tree=null;
        Object RPAREN499_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:309:2: ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !)
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==TIME_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:309:4: TIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(309,12);
                    TIME_TOK491=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK491_tree = 
                    (Object)adaptor.create(TIME_TOK491)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TIME_TOK491_tree, root_0);
                    }
                    dbg.location(309,20);
                    LPAREN492=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2873); if (state.failed) return retval;
                    dbg.location(309,22);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2876);
                    stringExpr493=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr493.getTree());
                    dbg.location(309,39);
                    RPAREN494=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2878); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:310:4: timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(310,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2884);
                    timeBag495=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag495.getTree());
                    dbg.location(310,12);
                    char_literal496=(Token)match(input,84,FOLLOW_84_in_timeExpr2886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal496_tree = 
                    (Object)adaptor.create(char_literal496)
                    ;
                    adaptor.addChild(root_0, char_literal496_tree);
                    }
                    dbg.location(310,16);
                    ONEANDONLY_TOK497=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK497_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK497)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK497_tree);
                    }
                    dbg.location(310,37);
                    LPAREN498=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2890); if (state.failed) return retval;
                    dbg.location(310,45);
                    RPAREN499=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2893); if (state.failed) return retval;

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
        dbg.location(311, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:1: timeBag : TIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK500=null;
        Token STRING_CONSTANT_LIST501=null;

        Object TIME_TOK500_tree=null;
        Object STRING_CONSTANT_LIST501_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:2: ( TIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:4: TIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(313,12);
            TIME_TOK500=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag2904); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK500_tree = 
            (Object)adaptor.create(TIME_TOK500)
            ;
            root_0 = (Object)adaptor.becomeRoot(TIME_TOK500_tree, root_0);
            }
            dbg.location(313,14);
            STRING_CONSTANT_LIST501=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag2907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST501_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST501)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST501_tree);
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
        dbg.location(316, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:1: dateTimeExpr : ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK502=null;
        Token LPAREN503=null;
        Token RPAREN505=null;
        Token char_literal507=null;
        Token ONEANDONLY_TOK508=null;
        Token LPAREN509=null;
        Token RPAREN510=null;
        GrammarParser.stringExpr_return stringExpr504 =null;

        GrammarParser.dateTimeBag_return dateTimeBag506 =null;


        Object DATETIME_TOK502_tree=null;
        Object LPAREN503_tree=null;
        Object RPAREN505_tree=null;
        Object char_literal507_tree=null;
        Object ONEANDONLY_TOK508_tree=null;
        Object LPAREN509_tree=null;
        Object RPAREN510_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:2: ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==DATETIME_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:4: DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(319,16);
                    DATETIME_TOK502=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr2920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK502_tree = 
                    (Object)adaptor.create(DATETIME_TOK502)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK502_tree, root_0);
                    }
                    dbg.location(319,24);
                    LPAREN503=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr2923); if (state.failed) return retval;
                    dbg.location(319,26);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr2926);
                    stringExpr504=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr504.getTree());
                    dbg.location(319,43);
                    RPAREN505=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr2928); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:4: dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(320,4);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr2934);
                    dateTimeBag506=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag506.getTree());
                    dbg.location(320,16);
                    char_literal507=(Token)match(input,84,FOLLOW_84_in_dateTimeExpr2936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal507_tree = 
                    (Object)adaptor.create(char_literal507)
                    ;
                    adaptor.addChild(root_0, char_literal507_tree);
                    }
                    dbg.location(320,34);
                    ONEANDONLY_TOK508=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK508_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK508)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK508_tree, root_0);
                    }
                    dbg.location(320,42);
                    LPAREN509=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr2941); if (state.failed) return retval;
                    dbg.location(320,50);
                    RPAREN510=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr2944); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:1: dateTimeBag : DATETIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK511=null;
        Token STRING_CONSTANT_LIST512=null;

        Object DATETIME_TOK511_tree=null;
        Object STRING_CONSTANT_LIST512_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:2: ( DATETIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:4: DATETIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(323,16);
            DATETIME_TOK511=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag2955); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK511_tree = 
            (Object)adaptor.create(DATETIME_TOK511)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK511_tree, root_0);
            }
            dbg.location(323,18);
            STRING_CONSTANT_LIST512=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST512_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST512)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST512_tree);
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:1: base64BinaryExpr : ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK513=null;
        Token LPAREN514=null;
        Token RPAREN516=null;
        Token char_literal518=null;
        Token ONEANDONLY_TOK519=null;
        Token LPAREN520=null;
        Token RPAREN521=null;
        GrammarParser.stringExpr_return stringExpr515 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag517 =null;


        Object BASE64BINARY_TOK513_tree=null;
        Object LPAREN514_tree=null;
        Object RPAREN516_tree=null;
        Object char_literal518_tree=null;
        Object ONEANDONLY_TOK519_tree=null;
        Object LPAREN520_tree=null;
        Object RPAREN521_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:2: ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==BASE64BINARY_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:4: BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(329,20);
                    BASE64BINARY_TOK513=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK513_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK513)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK513_tree, root_0);
                    }
                    dbg.location(329,28);
                    LPAREN514=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr2974); if (state.failed) return retval;
                    dbg.location(329,30);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr2977);
                    stringExpr515=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr515.getTree());
                    dbg.location(329,47);
                    RPAREN516=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr2979); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:4: base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(330,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr2985);
                    base64BinaryBag517=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag517.getTree());
                    dbg.location(330,20);
                    char_literal518=(Token)match(input,84,FOLLOW_84_in_base64BinaryExpr2987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal518_tree = 
                    (Object)adaptor.create(char_literal518)
                    ;
                    adaptor.addChild(root_0, char_literal518_tree);
                    }
                    dbg.location(330,38);
                    ONEANDONLY_TOK519=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK519_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK519)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK519_tree, root_0);
                    }
                    dbg.location(330,46);
                    LPAREN520=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr2992); if (state.failed) return retval;
                    dbg.location(330,54);
                    RPAREN521=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr2995); if (state.failed) return retval;

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:1: base64BinaryBag : BASE64BINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK522=null;
        Token STRING_CONSTANT_LIST523=null;

        Object BASE64BINARY_TOK522_tree=null;
        Object STRING_CONSTANT_LIST523_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:2: ( BASE64BINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:4: BASE64BINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(333,20);
            BASE64BINARY_TOK522=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3006); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK522_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK522)
            ;
            root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK522_tree, root_0);
            }
            dbg.location(333,22);
            STRING_CONSTANT_LIST523=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3009); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST523_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST523)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST523_tree);
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
        dbg.location(337, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:1: dayTimeDurationExpr : ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !);
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK524=null;
        Token LPAREN525=null;
        Token RPAREN527=null;
        Token char_literal529=null;
        Token ONEANDONLY_TOK530=null;
        Token LPAREN531=null;
        Token RPAREN532=null;
        GrammarParser.stringExpr_return stringExpr526 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag528 =null;


        Object DAYTIMEDURATION_TOK524_tree=null;
        Object LPAREN525_tree=null;
        Object RPAREN527_tree=null;
        Object char_literal529_tree=null;
        Object ONEANDONLY_TOK530_tree=null;
        Object LPAREN531_tree=null;
        Object RPAREN532_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:2: ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !)
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==DAYTIMEDURATION_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(340,23);
                    DAYTIMEDURATION_TOK524=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK524_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK524)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK524_tree, root_0);
                    }
                    dbg.location(340,31);
                    LPAREN525=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3026); if (state.failed) return retval;
                    dbg.location(340,33);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr3029);
                    stringExpr526=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr526.getTree());
                    dbg.location(340,50);
                    RPAREN527=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3031); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:4: dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(341,22);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3037);
                    dayTimeDurationBag528=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dayTimeDurationBag528.getTree(), root_0);
                    dbg.location(341,24);
                    char_literal529=(Token)match(input,84,FOLLOW_84_in_dayTimeDurationExpr3040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal529_tree = 
                    (Object)adaptor.create(char_literal529)
                    ;
                    adaptor.addChild(root_0, char_literal529_tree);
                    }
                    dbg.location(341,28);
                    ONEANDONLY_TOK530=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK530_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK530)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK530_tree);
                    }
                    dbg.location(341,49);
                    LPAREN531=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3044); if (state.failed) return retval;
                    dbg.location(341,57);
                    RPAREN532=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3047); if (state.failed) return retval;

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
        dbg.location(342, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:343:1: dayTimeDurationBag : DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK533=null;
        Token STRING_CONSTANT_LIST534=null;

        Object DAYTIMEDURATION_TOK533_tree=null;
        Object STRING_CONSTANT_LIST534_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:2: ( DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:4: DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(344,23);
            DAYTIMEDURATION_TOK533=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK533_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK533)
            ;
            root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK533_tree, root_0);
            }
            dbg.location(344,25);
            STRING_CONSTANT_LIST534=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3061); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST534_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST534)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST534_tree);
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
        dbg.location(347, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:1: yearMonthDurationExpr : ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK535=null;
        Token LPAREN536=null;
        Token RPAREN538=null;
        Token char_literal540=null;
        Token ONEANDONLY_TOK541=null;
        Token LPAREN542=null;
        Token RPAREN543=null;
        GrammarParser.stringExpr_return stringExpr537 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag539 =null;


        Object YEARMONTHDURATION_TOK535_tree=null;
        Object LPAREN536_tree=null;
        Object RPAREN538_tree=null;
        Object char_literal540_tree=null;
        Object ONEANDONLY_TOK541_tree=null;
        Object LPAREN542_tree=null;
        Object RPAREN543_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:2: ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==YEARMONTHDURATION_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:4: YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(350,25);
                    YEARMONTHDURATION_TOK535=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK535_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK535)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK535_tree, root_0);
                    }
                    dbg.location(350,33);
                    LPAREN536=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3077); if (state.failed) return retval;
                    dbg.location(350,35);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr3080);
                    stringExpr537=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr537.getTree());
                    dbg.location(350,52);
                    RPAREN538=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3082); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:351:4: yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(351,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3088);
                    yearMonthDurationBag539=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag539.getTree());
                    dbg.location(351,25);
                    char_literal540=(Token)match(input,84,FOLLOW_84_in_yearMonthDurationExpr3090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal540_tree = 
                    (Object)adaptor.create(char_literal540)
                    ;
                    adaptor.addChild(root_0, char_literal540_tree);
                    }
                    dbg.location(351,43);
                    ONEANDONLY_TOK541=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK541_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK541)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK541_tree, root_0);
                    }
                    dbg.location(351,51);
                    LPAREN542=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3095); if (state.failed) return retval;
                    dbg.location(351,59);
                    RPAREN543=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3098); if (state.failed) return retval;

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
        dbg.location(352, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:353:1: yearMonthDurationBag : YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK544=null;
        Token STRING_CONSTANT_LIST545=null;

        Object YEARMONTHDURATION_TOK544_tree=null;
        Object STRING_CONSTANT_LIST545_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:2: ( YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:4: YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(354,25);
            YEARMONTHDURATION_TOK544=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3109); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK544_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK544)
            ;
            root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK544_tree, root_0);
            }
            dbg.location(354,27);
            STRING_CONSTANT_LIST545=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3112); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST545_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST545)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST545_tree);
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
        dbg.location(357, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:1: x500NameExpr : ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK546=null;
        Token LPAREN547=null;
        Token RPAREN549=null;
        Token char_literal551=null;
        Token ONEANDONLY_TOK552=null;
        Token LPAREN553=null;
        Token RPAREN554=null;
        GrammarParser.stringExpr_return stringExpr548 =null;

        GrammarParser.x500NameBag_return x500NameBag550 =null;


        Object X500NAME_TOK546_tree=null;
        Object LPAREN547_tree=null;
        Object RPAREN549_tree=null;
        Object char_literal551_tree=null;
        Object ONEANDONLY_TOK552_tree=null;
        Object LPAREN553_tree=null;
        Object RPAREN554_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:360:2: ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt32=2;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==X500NAME_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:360:4: X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(360,16);
                    X500NAME_TOK546=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr3125); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK546_tree = 
                    (Object)adaptor.create(X500NAME_TOK546)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK546_tree, root_0);
                    }
                    dbg.location(360,24);
                    LPAREN547=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3128); if (state.failed) return retval;
                    dbg.location(360,26);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr3131);
                    stringExpr548=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr548.getTree());
                    dbg.location(360,43);
                    RPAREN549=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3133); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:361:4: x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(361,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr3139);
                    x500NameBag550=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag550.getTree());
                    dbg.location(361,17);
                    char_literal551=(Token)match(input,84,FOLLOW_84_in_x500NameExpr3142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal551_tree = 
                    (Object)adaptor.create(char_literal551)
                    ;
                    adaptor.addChild(root_0, char_literal551_tree);
                    }
                    dbg.location(361,35);
                    ONEANDONLY_TOK552=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK552_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK552)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK552_tree, root_0);
                    }
                    dbg.location(361,43);
                    LPAREN553=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3147); if (state.failed) return retval;
                    dbg.location(361,51);
                    RPAREN554=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3150); if (state.failed) return retval;

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
        dbg.location(363, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:364:1: x500NameBag : X500NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK555=null;
        Token STRING_CONSTANT_LIST556=null;

        Object X500NAME_TOK555_tree=null;
        Object STRING_CONSTANT_LIST556_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:2: ( X500NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:4: X500NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(365,16);
            X500NAME_TOK555=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag3162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK555_tree = 
            (Object)adaptor.create(X500NAME_TOK555)
            ;
            root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK555_tree, root_0);
            }
            dbg.location(365,18);
            STRING_CONSTANT_LIST556=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST556_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST556)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST556_tree);
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
        dbg.location(368, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:370:1: rfc822NameExpr : ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK557=null;
        Token LPAREN558=null;
        Token RPAREN560=null;
        Token char_literal562=null;
        Token ONEANDONLY_TOK563=null;
        Token LPAREN564=null;
        Token RPAREN565=null;
        GrammarParser.stringExpr_return stringExpr559 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag561 =null;


        Object RFC822NAME_TOK557_tree=null;
        Object LPAREN558_tree=null;
        Object RPAREN560_tree=null;
        Object char_literal562_tree=null;
        Object ONEANDONLY_TOK563_tree=null;
        Object LPAREN564_tree=null;
        Object RPAREN565_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(370, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:371:2: ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt33=2;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==RFC822NAME_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:371:4: RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(371,18);
                    RFC822NAME_TOK557=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK557_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK557)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK557_tree, root_0);
                    }
                    dbg.location(371,26);
                    LPAREN558=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3181); if (state.failed) return retval;
                    dbg.location(371,28);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr3184);
                    stringExpr559=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr559.getTree());
                    dbg.location(371,45);
                    RPAREN560=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3186); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:372:4: rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(372,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr3192);
                    rfc822NameBag561=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag561.getTree());
                    dbg.location(372,18);
                    char_literal562=(Token)match(input,84,FOLLOW_84_in_rfc822NameExpr3194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal562_tree = 
                    (Object)adaptor.create(char_literal562)
                    ;
                    adaptor.addChild(root_0, char_literal562_tree);
                    }
                    dbg.location(372,36);
                    ONEANDONLY_TOK563=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3196); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK563_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK563)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK563_tree, root_0);
                    }
                    dbg.location(372,44);
                    LPAREN564=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3199); if (state.failed) return retval;
                    dbg.location(372,52);
                    RPAREN565=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3202); if (state.failed) return retval;

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
        dbg.location(374, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:375:1: rfc822NameBag : RFC822NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK566=null;
        Token STRING_CONSTANT_LIST567=null;

        Object RFC822NAME_TOK566_tree=null;
        Object STRING_CONSTANT_LIST567_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:376:2: ( RFC822NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:376:4: RFC822NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(376,18);
            RFC822NAME_TOK566=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3214); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK566_tree = 
            (Object)adaptor.create(RFC822NAME_TOK566)
            ;
            root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK566_tree, root_0);
            }
            dbg.location(376,20);
            STRING_CONSTANT_LIST567=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST567_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST567)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST567_tree);
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
        dbg.location(379, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:381:1: hexBinaryExpr : ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK568=null;
        Token LPAREN569=null;
        Token RPAREN571=null;
        Token char_literal573=null;
        Token ONEANDONLY_TOK574=null;
        Token LPAREN575=null;
        Token RPAREN576=null;
        GrammarParser.stringExpr_return stringExpr570 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag572 =null;


        Object HEXBINARY_TOK568_tree=null;
        Object LPAREN569_tree=null;
        Object RPAREN571_tree=null;
        Object char_literal573_tree=null;
        Object ONEANDONLY_TOK574_tree=null;
        Object LPAREN575_tree=null;
        Object RPAREN576_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:382:2: ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
            int alt34=2;
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==HEXBINARY_TOK) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:382:4: HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(382,17);
                    HEXBINARY_TOK568=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK568_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK568)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK568_tree, root_0);
                    }
                    dbg.location(382,25);
                    LPAREN569=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3233); if (state.failed) return retval;
                    dbg.location(382,27);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr3236);
                    stringExpr570=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr570.getTree());
                    dbg.location(382,44);
                    RPAREN571=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3238); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:383:4: hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(383,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr3244);
                    hexBinaryBag572=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag572.getTree());
                    dbg.location(383,17);
                    char_literal573=(Token)match(input,84,FOLLOW_84_in_hexBinaryExpr3246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal573_tree = 
                    (Object)adaptor.create(char_literal573)
                    ;
                    adaptor.addChild(root_0, char_literal573_tree);
                    }
                    dbg.location(383,35);
                    ONEANDONLY_TOK574=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK574_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK574)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK574_tree, root_0);
                    }
                    dbg.location(383,43);
                    LPAREN575=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3251); if (state.failed) return retval;
                    dbg.location(383,51);
                    RPAREN576=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3254); if (state.failed) return retval;

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
        dbg.location(384, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:385:1: hexBinaryBag : HEXBINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK577=null;
        Token STRING_CONSTANT_LIST578=null;

        Object HEXBINARY_TOK577_tree=null;
        Object STRING_CONSTANT_LIST578_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:386:2: ( HEXBINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:386:4: HEXBINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(386,17);
            HEXBINARY_TOK577=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK577_tree = 
            (Object)adaptor.create(HEXBINARY_TOK577)
            ;
            root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK577_tree, root_0);
            }
            dbg.location(386,19);
            STRING_CONSTANT_LIST578=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST578_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST578)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST578_tree);
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
        dbg.location(389, 1);

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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:391:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag579 =null;

        GrammarParser.integerBag_return integerBag580 =null;

        GrammarParser.doubleBag_return doubleBag581 =null;

        GrammarParser.stringBag_return stringBag582 =null;

        GrammarParser.anyUriBag_return anyUriBag583 =null;

        GrammarParser.dateBag_return dateBag584 =null;

        GrammarParser.timeBag_return timeBag585 =null;

        GrammarParser.dateTimeBag_return dateTimeBag586 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag587 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag588 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag589 =null;

        GrammarParser.x500NameBag_return x500NameBag590 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag591 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag592 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(391, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt35=14;
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            switch ( input.LA(1) ) {
            case BOOLEAN_TOK:
                {
                alt35=1;
                }
                break;
            case BAG_TOK:
            case INTEGER_TOK:
                {
                alt35=2;
                }
                break;
            case DOUBLE_TOK:
                {
                alt35=3;
                }
                break;
            case ACTION_TOK:
            case ENVIRONMENT_TOK:
            case RESOURCE_TOK:
            case STRING_TOK:
            case SUBJECT_TOK:
                {
                alt35=4;
                }
                break;
            case ANYURI_TOK:
                {
                alt35=5;
                }
                break;
            case DATE_TOK:
                {
                alt35=6;
                }
                break;
            case TIME_TOK:
                {
                alt35=7;
                }
                break;
            case DATETIME_TOK:
                {
                alt35=8;
                }
                break;
            case BASE64BINARY_TOK:
                {
                alt35=9;
                }
                break;
            case DAYTIMEDURATION_TOK:
                {
                alt35=10;
                }
                break;
            case YEARMONTHDURATION_TOK:
                {
                alt35=11;
                }
                break;
            case X500NAME_TOK:
                {
                alt35=12;
                }
                break;
            case RFC822NAME_TOK:
                {
                alt35=13;
                }
                break;
            case HEXBINARY_TOK:
                {
                alt35=14;
                }
                break;
            default:
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag3281);
                    booleanBag579=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag579.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag3285);
                    integerBag580=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag580.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag3289);
                    doubleBag581=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag581.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag3293);
                    stringBag582=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag582.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag3297);
                    anyUriBag583=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag583.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:392:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(392,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag3301);
                    dateBag584=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag584.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(393,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag3306);
                    timeBag585=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag585.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(393,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag3310);
                    dateTimeBag586=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag586.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(393,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag3314);
                    base64BinaryBag587=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag587.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(393,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag3318);
                    dayTimeDurationBag588=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag588.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(394,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag3323);
                    yearMonthDurationBag589=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag589.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(394,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag3328);
                    x500NameBag590=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag590.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:395:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(395,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag3333);
                    rfc822NameBag591=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag591.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:395:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(395,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag3337);
                    hexBinaryBag592=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag592.getTree());

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
        dbg.location(396, 1);

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
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:6: base64BinaryExpr
        {
        dbg.location(177,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred1_Grammar1017);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:6: base64BinaryExpr
        {
        dbg.location(193,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred2_Grammar1276);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:5: booleanBag
        {
        dbg.location(227,5);
        pushFollow(FOLLOW_booleanBag_in_synpred3_Grammar1897);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:5: integerBag
        {
        dbg.location(228,5);
        pushFollow(FOLLOW_integerBag_in_synpred4_Grammar1933);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:5: doubleBag
        {
        dbg.location(229,5);
        pushFollow(FOLLOW_doubleBag_in_synpred5_Grammar1971);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:5: stringBag
        {
        dbg.location(230,5);
        pushFollow(FOLLOW_stringBag_in_synpred6_Grammar2009);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:5: dateBag
        {
        dbg.location(231,5);
        pushFollow(FOLLOW_dateBag_in_synpred7_Grammar2048);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:5: timeBag
        {
        dbg.location(232,5);
        pushFollow(FOLLOW_timeBag_in_synpred8_Grammar2087);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:5: dateTimeBag
        {
        dbg.location(233,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred9_Grammar2126);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:5: base64BinaryBag
        {
        dbg.location(234,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred10_Grammar2165);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:5: dayTimeDurationBag
        {
        dbg.location(235,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2203);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:5: yearMonthDurationBag
        {
        dbg.location(236,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2241);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:5: anyUriBag
        {
        dbg.location(237,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred13_Grammar2280);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:5: x500NameBag
        {
        dbg.location(238,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred14_Grammar2319);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:5: rfc822NameBag
        {
        dbg.location(239,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred15_Grammar2358);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:5: hexBinaryBag
        {
        dbg.location(240,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred16_Grammar2396);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:5: base64BinaryBag
        {
        dbg.location(241,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred17_Grammar2435);
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA8_eotS =
        "\u0104\uffff";
    static final String DFA8_eofS =
        "\u0104\uffff";
    static final String DFA8_minS =
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
    static final String DFA8_maxS =
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
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\17\uffff\1\3\30\uffff\1\7\2"+
        "\uffff\1\11\56\uffff\1\10\u00a2\uffff";
    static final String DFA8_specialS =
        "\u0104\uffff}>";
    static final String[] DFA8_transitionS = {
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "138:1: booleanExpr : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA11_eotS =
        "\72\uffff";
    static final String DFA11_eofS =
        "\72\uffff";
    static final String DFA11_minS =
        "\1\5\1\uffff\1\124\1\105\1\124\4\uffff\1\53\5\uffff\1\51\1\124\1"+
        "\52\1\5\1\124\1\53\1\uffff\1\66\1\124\1\100\1\105\1\124\1\66\1\100"+
        "\1\53\1\52\1\62\2\124\1\52\1\53\1\124\1\100\1\53\1\51\1\66\1\124"+
        "\1\100\1\124\1\100\2\53\1\52\1\124\1\100\1\21\1\100\1\105\2\100"+
        "\1\0\2\uffff";
    static final String DFA11_maxS =
        "\1\121\1\uffff\1\124\1\105\1\124\4\uffff\1\105\5\uffff\1\116\1\124"+
        "\1\52\1\107\1\124\1\53\1\uffff\1\66\2\124\1\105\1\124\1\66\1\100"+
        "\1\53\1\66\1\74\2\124\1\52\1\53\1\124\1\100\1\53\1\51\1\66\1\124"+
        "\1\100\1\124\1\100\2\53\1\66\2\124\1\21\1\100\1\105\1\124\1\100"+
        "\1\0\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\6\uffff\1\2\42\uffff\1\7\1\15";
    static final String DFA11_specialS =
        "\67\uffff\1\0\2\uffff}>";
    static final String[] DFA11_transitionS = {
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
            return "164:1: isInOp : ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_55 = input.LA(1);

                         
                        int index11_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 56;}

                        else if ( (synpred1_Grammar()) ) {s = 57;}

                         
                        input.seek(index11_55);

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
        "\54\uffff";
    static final String DFA12_eofS =
        "\54\uffff";
    static final String DFA12_minS =
        "\1\5\6\uffff\1\105\5\uffff\1\124\1\25\1\53\1\21\1\53\1\5\1\124\1"+
        "\100\1\105\1\124\1\66\1\62\1\100\1\124\1\52\2\53\1\0\1\66\1\124"+
        "\2\100\2\uffff\1\53\1\52\3\100\1\0\1\100";
    static final String DFA12_maxS =
        "\1\121\6\uffff\1\105\5\uffff\1\124\1\25\1\53\1\21\1\105\1\107\2"+
        "\124\1\105\1\124\1\66\1\74\1\100\1\124\1\52\2\53\1\0\1\66\1\124"+
        "\2\100\2\uffff\1\53\1\66\1\100\1\124\1\100\1\0\1\124";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\26\uffff\1\7\1\15\7\uffff";
    static final String DFA12_specialS =
        "\36\uffff\1\1\13\uffff\1\0\1\uffff}>";
    static final String[] DFA12_transitionS = {
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
            return "180:1: containsOp : ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_42 = input.LA(1);

                         
                        int index12_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index12_42);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA12_30 = input.LA(1);

                         
                        int index12_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 35;}

                        else if ( (synpred2_Grammar()) ) {s = 36;}

                         
                        input.seek(index12_30);

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
    static final String DFA13_eotS =
        "\70\uffff";
    static final String DFA13_eofS =
        "\70\uffff";
    static final String DFA13_minS =
        "\1\5\1\uffff\1\124\1\105\1\124\12\53\1\uffff\1\47\1\uffff\1\124"+
        "\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1"+
        "\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\53\1\66\1\124\11\66\1\100\1\53\1\52\1\124\1\100\1\124";
    static final String DFA13_maxS =
        "\1\121\1\uffff\1\131\1\105\1\124\12\105\1\uffff\1\116\1\uffff\1"+
        "\124\1\52\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\53\1\103\1\124\11\103\1\100\1\53\1\103\1\131\1\100\1\131";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\6\1\uffff\1\7\1\uffff\1\14\1\uffff\1\13\1\uffff\1\10\1"+
        "\uffff\1\11\1\uffff\1\12\22\uffff";
    static final String DFA13_specialS =
        "\70\uffff}>";
    static final String[] DFA13_transitionS = {
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
            return "196:1: equalityExpr : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );";
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
        "\1\5\1\uffff\1\124\1\105\1\124\12\53\1\uffff\1\47\1\124\1\52\1\124"+
        "\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\53\1"+
        "\uffff\1\66\1\124\11\66\1\100\1\53\1\52\1\124\1\100\1\124";
    static final String DFA14_maxS =
        "\1\121\1\uffff\1\124\1\105\1\124\12\105\1\uffff\1\116\1\124\1\52"+
        "\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1"+
        "\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\1"+
        "\53\1\uffff\1\103\1\124\11\103\1\100\1\53\1\103\1\124\1\100\1\124";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\4\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1"+
        "\uffff\1\7\1\uffff\1\14\1\uffff\1\10\1\uffff\1\11\1\uffff\1\12\1"+
        "\uffff\1\13\1\uffff\1\3\21\uffff";
    static final String DFA14_specialS =
        "\70\uffff}>";
    static final String[] DFA14_transitionS = {
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
            return "211:1: regexOp : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\5\2\uffff\1\105\1\124\1\uffff\1\124\1\52\1\66\1\124\1\52";
    static final String DFA16_maxS =
        "\1\121\2\uffff\1\105\1\124\1\uffff\1\124\1\52\1\103\1\124\1\103";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\5\uffff";
    static final String DFA16_specialS =
        "\13\uffff}>";
    static final String[] DFA16_transitionS = {
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
            return "244:1: integerExpr : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_xacmlFile465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_policySet_in_xacmlFile469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_xacmlFile472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy487 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy489 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy491 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policy493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_in_policy495 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policy497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICYSET_TOK_in_policySet514 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policySet517 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policySet519 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policySet521 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_in_policySet524 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_policy_in_policySet527 = new BitSet(new long[]{0x0200000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policySet530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target549 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_target552 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_target555 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_APPLICABLE_TOK_in_target558 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_target560 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_target562 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_target564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule580 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule583 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_rule586 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_set_in_rule589 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule597 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_rule599 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_rule601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanExpr628 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr631 = new BitSet(new long[]{0x2000000040000020L,0x0000000000000080L});
    public static final BitSet FOLLOW_attributeExpr_in_booleanExpr634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOF_TOK_in_booleanExpr644 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_TOK_in_booleanExpr649 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr653 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr664 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanExpr667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_booleanExpr691 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_NODEEQUAL_TOK_in_booleanExpr695 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NODEMATCH_TOK_in_booleanExpr700 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr705 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr741 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalOrExpr744 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr746 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_conditionalAndExpr769 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp790 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp792 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp795 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp809 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp811 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp814 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_isInOp817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp828 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp830 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp833 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp847 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp849 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp852 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp868 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_isInOp874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp885 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp887 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp890 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp904 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp906 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp909 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp923 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp925 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp942 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp944 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp961 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp963 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp980 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp982 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp985 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp999 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1001 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1004 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp1024 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1026 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1029 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1049 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1051 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1054 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1068 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1070 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1073 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1087 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1089 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1092 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp1095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1106 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1108 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1111 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_containsOp1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1125 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1127 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1144 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1146 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1149 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1165 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1168 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1182 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1184 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1187 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1201 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1203 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1220 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1222 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1239 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1241 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1244 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1258 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1260 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1263 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1285 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1307 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1337 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1367 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1397 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1427 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1487 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1577 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1608 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1676 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1678 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1681 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1694 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1696 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1699 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1712 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1714 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1717 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1730 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1732 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1735 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1748 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1750 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1753 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1766 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1768 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1784 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1786 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1789 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1802 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1804 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1807 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1820 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1822 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1838 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1840 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1856 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1858 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1861 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1874 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1876 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1879 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1904 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1906 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1921 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1940 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1942 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1958 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp1976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1978 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1980 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1996 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2017 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2019 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2035 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2056 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2058 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2074 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2095 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2097 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2134 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2136 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2152 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2173 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2175 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2211 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2213 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2228 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2249 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2251 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2288 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2290 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2306 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2327 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2329 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2366 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2368 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2383 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2404 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2406 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2422 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2442 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2444 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2460 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2486 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2488 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2513 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2540 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2543 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2550 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerBag2562 = new BitSet(new long[]{0x0000010000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_integerBag2564 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2575 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2600 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_doubleExpr2603 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_doubleExpr2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2647 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2649 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2662 = new BitSet(new long[]{0x100C000000000000L});
    public static final BitSet FOLLOW_set_in_stringExpr2664 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringBag2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attributeExpr2734 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2750 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2753 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2766 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2768 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2784 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2819 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2822 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateExpr2835 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2837 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2870 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2873 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timeExpr2886 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2888 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag2904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr2920 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr2923 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr2926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr2934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateTimeExpr2936 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr2938 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr2971 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr2974 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_base64BinaryExpr2987 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr2989 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3023 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3026 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dayTimeDurationExpr3040 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3042 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3074 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3077 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_yearMonthDurationExpr3090 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3092 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr3125 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3128 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_x500NameExpr3142 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3144 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag3162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3178 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3181 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr3184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rfc822NameExpr3194 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3196 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3230 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3233 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr3236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_hexBinaryExpr3246 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3248 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred1_Grammar1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred2_Grammar1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred3_Grammar1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred4_Grammar1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred5_Grammar1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred6_Grammar2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred7_Grammar2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred8_Grammar2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred9_Grammar2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred10_Grammar2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred13_Grammar2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred14_Grammar2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred15_Grammar2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred16_Grammar2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred17_Grammar2435 = new BitSet(new long[]{0x0000000000000002L});

}