// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-07-01 16:54:21

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
    "invalidRule", "conditionalAndExpr", "synpred2_Grammar", "synpred12_Grammar", 
    "anyUriBag", "yearMonthDurationExpr", "dayTimeDurationBag", "rule", 
    "anyBag", "xacmlFile", "base64BinaryExpr", "hexBinaryExpr", "dateTimeBag", 
    "x500NameBag", "policy", "synpred8_Grammar", "x500NameExpr", "stringBag", 
    "hexBinaryBag", "stringExpr", "synpred13_Grammar", "dateExpr", "synpred7_Grammar", 
    "timeExpr", "synpred15_Grammar", "synpred6_Grammar", "booleanBag", "synpred16_Grammar", 
    "synpred17_Grammar", "dateTimeExpr", "booleanExpr", "timeBag", "dayTimeDurationExpr", 
    "rfc822NameExpr", "synpred14_Grammar", "rfc822NameBag", "yearMonthDurationBag", 
    "doubleExpr", "synpred10_Grammar", "containsOp", "synpred3_Grammar", 
    "anyUriExpr", "attributeExpr", "conditionalOrExpr", "synpred9_Grammar", 
    "policySet", "dateBag", "base64BinaryBag", "synpred11_Grammar", "doubleBag", 
    "isInOp", "bagOp", "synpred1_Grammar", "target", "integerBag", "integerExpr", 
    "synpred4_Grammar", "regexOp", "synpred5_Grammar", "equalityExpr"
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
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:100:1: policy returns [ PolicyType o] : POLICY_TOK pid= ANYCASEIDENTIFIER combAlgId= LOWERCASEIDENTIFIER '{' t= target '}' ;
    public final GrammarParser.policy_return policy() throws RecognitionException {
        GrammarParser.policy_return retval = new GrammarParser.policy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token pid=null;
        Token combAlgId=null;
        Token POLICY_TOK4=null;
        Token char_literal5=null;
        Token char_literal6=null;
        GrammarParser.target_return t =null;


        Object pid_tree=null;
        Object combAlgId_tree=null;
        Object POLICY_TOK4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policy");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:2: ( POLICY_TOK pid= ANYCASEIDENTIFIER combAlgId= LOWERCASEIDENTIFIER '{' t= target '}' )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:101:4: POLICY_TOK pid= ANYCASEIDENTIFIER combAlgId= LOWERCASEIDENTIFIER '{' t= target '}'
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
            dbg.location(101,18);
            pid=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            pid_tree = 
            (Object)adaptor.create(pid)
            ;
            adaptor.addChild(root_0, pid_tree);
            }
            dbg.location(101,46);
            combAlgId=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            combAlgId_tree = 
            (Object)adaptor.create(combAlgId)
            ;
            adaptor.addChild(root_0, combAlgId_tree);
            }
            dbg.location(101,67);
            char_literal5=(Token)match(input,90,FOLLOW_90_in_policy497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);
            }
            dbg.location(101,72);
            pushFollow(FOLLOW_target_in_policy501);
            t=target();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
            dbg.location(101,80);
            char_literal6=(Token)match(input,92,FOLLOW_92_in_policy503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = 
            (Object)adaptor.create(char_literal6)
            ;
            adaptor.addChild(root_0, char_literal6_tree);
            }
            dbg.location(102,2);
            if ( state.backtracking==0 ) {
            		PolicyType o = builder.create(PolicyType.class, PolicyType.DEFAULT_ELEMENT_NAME);
            //		o.setDescription("");
            		o.setPolicyId((pid!=null?pid.getText():null));
            		o.setObligations(null);
            		o.setPolicyDefaults(null);
            		o.setRuleCombiningAlgoId((combAlgId!=null?combAlgId.getText():null));
            		o.setTarget((t!=null?t.o:null));
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

        Token POLICYSET_TOK7=null;
        Token ANYCASEIDENTIFIER8=null;
        Token LOWERCASEIDENTIFIER9=null;
        Token char_literal10=null;
        Token char_literal13=null;
        GrammarParser.target_return target11 =null;

        GrammarParser.policy_return policy12 =null;


        Object POLICYSET_TOK7_tree=null;
        Object ANYCASEIDENTIFIER8_tree=null;
        Object LOWERCASEIDENTIFIER9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal13_tree=null;

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
            POLICYSET_TOK7=(Token)match(input,POLICYSET_TOK,FOLLOW_POLICYSET_TOK_in_policySet520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICYSET_TOK7_tree = 
            (Object)adaptor.create(POLICYSET_TOK7)
            ;
            root_0 = (Object)adaptor.becomeRoot(POLICYSET_TOK7_tree, root_0);
            }
            dbg.location(115,19);
            ANYCASEIDENTIFIER8=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policySet523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER8_tree = 
            (Object)adaptor.create(ANYCASEIDENTIFIER8)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER8_tree);
            }
            dbg.location(115,37);
            LOWERCASEIDENTIFIER9=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policySet525); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER9_tree = 
            (Object)adaptor.create(LOWERCASEIDENTIFIER9)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER9_tree);
            }
            dbg.location(115,60);
            char_literal10=(Token)match(input,90,FOLLOW_90_in_policySet527); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_target_in_policySet530);
                    target11=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target11.getTree());

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
            	    pushFollow(FOLLOW_policy_in_policySet533);
            	    policy12=policy();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy12.getTree());

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
            char_literal13=(Token)match(input,92,FOLLOW_92_in_policySet536); if (state.failed) return retval;
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
        public TargetType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "target"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:121:1: target returns [ TargetType o] : TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !;
    public final GrammarParser.target_return target() throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TARGET_TOK14=null;
        Token ANYCASEIDENTIFIER15=null;
        Token char_literal16=null;
        Token APPLICABLE_TOK17=null;
        Token IF_TOK18=null;
        Token char_literal20=null;
        GrammarParser.booleanExpr_return booleanExpr19 =null;


        Object TARGET_TOK14_tree=null;
        Object ANYCASEIDENTIFIER15_tree=null;
        Object char_literal16_tree=null;
        Object APPLICABLE_TOK17_tree=null;
        Object IF_TOK18_tree=null;
        Object char_literal20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:2: ( TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:4: TARGET_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! APPLICABLE_TOK IF_TOK booleanExpr '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(122,14);
            TARGET_TOK14=(Token)match(input,TARGET_TOK,FOLLOW_TARGET_TOK_in_target555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET_TOK14_tree = 
            (Object)adaptor.create(TARGET_TOK14)
            ;
            root_0 = (Object)adaptor.becomeRoot(TARGET_TOK14_tree, root_0);
            }
            dbg.location(122,16);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:16: ( ANYCASEIDENTIFIER )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:122:16: ANYCASEIDENTIFIER
                    {
                    dbg.location(122,16);
                    ANYCASEIDENTIFIER15=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_target558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER15_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER15)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER15_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(122,38);
            char_literal16=(Token)match(input,90,FOLLOW_90_in_target561); if (state.failed) return retval;
            dbg.location(122,40);
            APPLICABLE_TOK17=(Token)match(input,APPLICABLE_TOK,FOLLOW_APPLICABLE_TOK_in_target564); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            APPLICABLE_TOK17_tree = 
            (Object)adaptor.create(APPLICABLE_TOK17)
            ;
            adaptor.addChild(root_0, APPLICABLE_TOK17_tree);
            }
            dbg.location(122,55);
            IF_TOK18=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_target566); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK18_tree = 
            (Object)adaptor.create(IF_TOK18)
            ;
            adaptor.addChild(root_0, IF_TOK18_tree);
            }
            dbg.location(122,62);
            pushFollow(FOLLOW_booleanExpr_in_target568);
            booleanExpr19=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr19.getTree());
            dbg.location(122,77);
            char_literal20=(Token)match(input,92,FOLLOW_92_in_target570); if (state.failed) return retval;
            dbg.location(123,2);
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
        dbg.location(126, 1);

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
        public RuleType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:127:1: rule returns [ RuleType o] : RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !;
    public final GrammarParser.rule_return rule() throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RULE_TOK21=null;
        Token ANYCASEIDENTIFIER22=null;
        Token char_literal23=null;
        Token set24=null;
        Token IF_TOK25=null;
        Token char_literal27=null;
        GrammarParser.booleanExpr_return booleanExpr26 =null;


        Object RULE_TOK21_tree=null;
        Object ANYCASEIDENTIFIER22_tree=null;
        Object char_literal23_tree=null;
        Object set24_tree=null;
        Object IF_TOK25_tree=null;
        Object char_literal27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:2: ( RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:4: RULE_TOK ^ ( ANYCASEIDENTIFIER )? '{' ! ( PERMIT_TOK | DENY_TOK ) IF_TOK booleanExpr '}' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(128,12);
            RULE_TOK21=(Token)match(input,RULE_TOK,FOLLOW_RULE_TOK_in_rule588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE_TOK21_tree = 
            (Object)adaptor.create(RULE_TOK21)
            ;
            root_0 = (Object)adaptor.becomeRoot(RULE_TOK21_tree, root_0);
            }
            dbg.location(128,14);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:14: ( ANYCASEIDENTIFIER )?
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:14: ANYCASEIDENTIFIER
                    {
                    dbg.location(128,14);
                    ANYCASEIDENTIFIER22=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYCASEIDENTIFIER22_tree = 
                    (Object)adaptor.create(ANYCASEIDENTIFIER22)
                    ;
                    adaptor.addChild(root_0, ANYCASEIDENTIFIER22_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(128,36);
            char_literal23=(Token)match(input,90,FOLLOW_90_in_rule594); if (state.failed) return retval;
            dbg.location(128,38);
            set24=(Token)input.LT(1);

            if ( input.LA(1)==DENY_TOK||input.LA(1)==PERMIT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set24)
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

            dbg.location(128,62);
            IF_TOK25=(Token)match(input,IF_TOK,FOLLOW_IF_TOK_in_rule605); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_TOK25_tree = 
            (Object)adaptor.create(IF_TOK25)
            ;
            adaptor.addChild(root_0, IF_TOK25_tree);
            }
            dbg.location(128,69);
            pushFollow(FOLLOW_booleanExpr_in_rule607);
            booleanExpr26=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr26.getTree());
            dbg.location(128,84);
            char_literal27=(Token)match(input,92,FOLLOW_92_in_rule609); if (state.failed) return retval;
            dbg.location(129,2);
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
        dbg.location(132, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:134:1: booleanExpr returns [SomeType o] : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !);
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TRUE_TOK28=null;
        Token FALSE_TOK29=null;
        Token BOOLEAN_TOK30=null;
        Token LPAREN31=null;
        Token RPAREN33=null;
        Token NOF_TOK34=null;
        Token NOT_TOK35=null;
        Token LPAREN36=null;
        Token RPAREN38=null;
        Token LPAREN39=null;
        Token RPAREN41=null;
        Token char_literal46=null;
        Token NODEEQUAL_TOK47=null;
        Token NODEMATCH_TOK48=null;
        Token LPAREN49=null;
        Token RPAREN51=null;
        GrammarParser.attributeExpr_return attributeExpr32 =null;

        GrammarParser.booleanExpr_return booleanExpr37 =null;

        GrammarParser.conditionalOrExpr_return conditionalOrExpr40 =null;

        GrammarParser.equalityExpr_return equalityExpr42 =null;

        GrammarParser.isInOp_return isInOp43 =null;

        GrammarParser.containsOp_return containsOp44 =null;

        GrammarParser.stringExpr_return stringExpr45 =null;

        GrammarParser.stringExpr_return stringExpr50 =null;


        Object TRUE_TOK28_tree=null;
        Object FALSE_TOK29_tree=null;
        Object BOOLEAN_TOK30_tree=null;
        Object LPAREN31_tree=null;
        Object RPAREN33_tree=null;
        Object NOF_TOK34_tree=null;
        Object NOT_TOK35_tree=null;
        Object LPAREN36_tree=null;
        Object RPAREN38_tree=null;
        Object LPAREN39_tree=null;
        Object RPAREN41_tree=null;
        Object char_literal46_tree=null;
        Object NODEEQUAL_TOK47_tree=null;
        Object NODEMATCH_TOK48_tree=null;
        Object LPAREN49_tree=null;
        Object RPAREN51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:2: ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:4: TRUE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(135,12);
                    TRUE_TOK28=(Token)match(input,TRUE_TOK,FOLLOW_TRUE_TOK_in_booleanExpr628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_TOK28_tree = 
                    (Object)adaptor.create(TRUE_TOK28)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRUE_TOK28_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:136:4: FALSE_TOK ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(136,13);
                    FALSE_TOK29=(Token)match(input,FALSE_TOK,FOLLOW_FALSE_TOK_in_booleanExpr634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_TOK29_tree = 
                    (Object)adaptor.create(FALSE_TOK29)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FALSE_TOK29_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:4: BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(137,15);
                    BOOLEAN_TOK30=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanExpr640); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_TOK30_tree = 
                    (Object)adaptor.create(BOOLEAN_TOK30)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BOOLEAN_TOK30_tree, root_0);
                    }
                    dbg.location(137,23);
                    LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr643); if (state.failed) return retval;
                    dbg.location(137,25);
                    pushFollow(FOLLOW_attributeExpr_in_booleanExpr646);
                    attributeExpr32=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr32.getTree());
                    dbg.location(137,45);
                    RPAREN33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr648); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:4: ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(138,4);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:4: ( NOF_TOK ^| NOT_TOK ^)
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:6: NOF_TOK ^
                            {
                            dbg.location(138,13);
                            NOF_TOK34=(Token)match(input,NOF_TOK,FOLLOW_NOF_TOK_in_booleanExpr656); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOF_TOK34_tree = 
                            (Object)adaptor.create(NOF_TOK34)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOF_TOK34_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:138:17: NOT_TOK ^
                            {
                            dbg.location(138,24);
                            NOT_TOK35=(Token)match(input,NOT_TOK,FOLLOW_NOT_TOK_in_booleanExpr661); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOT_TOK35_tree = 
                            (Object)adaptor.create(NOT_TOK35)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NOT_TOK35_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(138,33);
                    LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr665); if (state.failed) return retval;
                    dbg.location(138,35);
                    pushFollow(FOLLOW_booleanExpr_in_booleanExpr668);
                    booleanExpr37=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr37.getTree());
                    dbg.location(138,53);
                    RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr670); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:139:4: LPAREN ! conditionalOrExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(139,10);
                    LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr676); if (state.failed) return retval;
                    dbg.location(139,12);
                    pushFollow(FOLLOW_conditionalOrExpr_in_booleanExpr679);
                    conditionalOrExpr40=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr40.getTree());
                    dbg.location(139,36);
                    RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr681); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:4: equalityExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(140,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr687);
                    equalityExpr42=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr42.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:4: isInOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr692);
                    isInOp43=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp43.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:13: containsOp
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(141,13);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr696);
                    containsOp44=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp44.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:4: stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(142,4);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr701);
                    stringExpr45=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr45.getTree());
                    dbg.location(142,15);
                    char_literal46=(Token)match(input,84,FOLLOW_84_in_booleanExpr703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = 
                    (Object)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);
                    }
                    dbg.location(142,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:19: ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^)
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:21: NODEEQUAL_TOK ^
                            {
                            dbg.location(142,34);
                            NODEEQUAL_TOK47=(Token)match(input,NODEEQUAL_TOK,FOLLOW_NODEEQUAL_TOK_in_booleanExpr707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEEQUAL_TOK47_tree = 
                            (Object)adaptor.create(NODEEQUAL_TOK47)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEEQUAL_TOK47_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:142:38: NODEMATCH_TOK ^
                            {
                            dbg.location(142,51);
                            NODEMATCH_TOK48=(Token)match(input,NODEMATCH_TOK,FOLLOW_NODEMATCH_TOK_in_booleanExpr712); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NODEMATCH_TOK48_tree = 
                            (Object)adaptor.create(NODEMATCH_TOK48)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(NODEMATCH_TOK48_tree, root_0);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(142,61);
                    LPAREN49=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_booleanExpr717); if (state.failed) return retval;
                    dbg.location(142,63);
                    pushFollow(FOLLOW_stringExpr_in_booleanExpr720);
                    stringExpr50=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr50.getTree());
                    dbg.location(142,80);
                    RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_booleanExpr722); if (state.failed) return retval;

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
        dbg.location(145, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:146:1: booleanBag returns [SomeType o] : BOOLEAN_TOK STRING_CONSTANT_LIST ;
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN_TOK52=null;
        Token STRING_CONSTANT_LIST53=null;

        Object BOOLEAN_TOK52_tree=null;
        Object STRING_CONSTANT_LIST53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:2: ( BOOLEAN_TOK STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:147:4: BOOLEAN_TOK STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(147,4);
            BOOLEAN_TOK52=(Token)match(input,BOOLEAN_TOK,FOLLOW_BOOLEAN_TOK_in_booleanBag739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_TOK52_tree = 
            (Object)adaptor.create(BOOLEAN_TOK52)
            ;
            adaptor.addChild(root_0, BOOLEAN_TOK52_tree);
            }
            dbg.location(147,16);
            STRING_CONSTANT_LIST53=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST53_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST53)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST53_tree);
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
        dbg.location(150, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:152:1: conditionalOrExpr returns [SomeType o] : conditionalAndExpr ( '||' conditionalAndExpr )* ;
    public final GrammarParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        GrammarParser.conditionalOrExpr_return retval = new GrammarParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal55=null;
        GrammarParser.conditionalAndExpr_return conditionalAndExpr54 =null;

        GrammarParser.conditionalAndExpr_return conditionalAndExpr56 =null;


        Object string_literal55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:5: ( conditionalAndExpr ( '||' conditionalAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:7: conditionalAndExpr ( '||' conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(153,7);
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr761);
            conditionalAndExpr54=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr54.getTree());
            dbg.location(153,26);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:26: ( '||' conditionalAndExpr )*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:27: '||' conditionalAndExpr
            	    {
            	    dbg.location(153,27);
            	    string_literal55=(Token)match(input,91,FOLLOW_91_in_conditionalOrExpr764); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal55_tree = 
            	    (Object)adaptor.create(string_literal55)
            	    ;
            	    adaptor.addChild(root_0, string_literal55_tree);
            	    }
            	    dbg.location(153,32);
            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr766);
            	    conditionalAndExpr56=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr56.getTree());

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
        dbg.location(154, 4);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:1: conditionalAndExpr returns [SomeType o] : booleanExpr ( '&&' booleanExpr )* ;
    public final GrammarParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        GrammarParser.conditionalAndExpr_return retval = new GrammarParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        GrammarParser.booleanExpr_return booleanExpr57 =null;

        GrammarParser.booleanExpr_return booleanExpr59 =null;


        Object string_literal58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:5: ( booleanExpr ( '&&' booleanExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:7: booleanExpr ( '&&' booleanExpr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(157,7);
            pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr790);
            booleanExpr57=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr57.getTree());
            dbg.location(157,19);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:19: ( '&&' booleanExpr )*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:20: '&&' booleanExpr
            	    {
            	    dbg.location(157,20);
            	    string_literal58=(Token)match(input,82,FOLLOW_82_in_conditionalAndExpr793); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = 
            	    (Object)adaptor.create(string_literal58)
            	    ;
            	    adaptor.addChild(root_0, string_literal58_tree);
            	    }
            	    dbg.location(157,25);
            	    pushFollow(FOLLOW_booleanExpr_in_conditionalAndExpr795);
            	    booleanExpr59=booleanExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr59.getTree());

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
        dbg.location(158, 4);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isInOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:1: isInOp returns [SomeType o] : ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal61=null;
        Token ISIN_TOK62=null;
        Token LPAREN63=null;
        Token RPAREN65=null;
        Token char_literal67=null;
        Token ISIN_TOK68=null;
        Token LPAREN69=null;
        Token RPAREN71=null;
        Token char_literal73=null;
        Token ISIN_TOK74=null;
        Token LPAREN75=null;
        Token RPAREN77=null;
        Token char_literal79=null;
        Token ISIN_TOK80=null;
        Token LPAREN81=null;
        Token RPAREN83=null;
        Token char_literal85=null;
        Token ISIN_TOK86=null;
        Token LPAREN87=null;
        Token RPAREN89=null;
        Token char_literal91=null;
        Token ISIN_TOK92=null;
        Token LPAREN93=null;
        Token RPAREN95=null;
        Token char_literal97=null;
        Token ISIN_TOK98=null;
        Token LPAREN99=null;
        Token RPAREN101=null;
        Token char_literal103=null;
        Token ISIN_TOK104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        Token char_literal109=null;
        Token ISIN_TOK110=null;
        Token LPAREN111=null;
        Token RPAREN113=null;
        Token char_literal115=null;
        Token ISIN_TOK116=null;
        Token LPAREN117=null;
        Token RPAREN119=null;
        Token char_literal121=null;
        Token ISIN_TOK122=null;
        Token LPAREN123=null;
        Token RPAREN125=null;
        Token char_literal127=null;
        Token ISIN_TOK128=null;
        Token LPAREN129=null;
        Token RPAREN131=null;
        Token char_literal133=null;
        Token ISIN_TOK134=null;
        Token LPAREN135=null;
        Token RPAREN137=null;
        GrammarParser.doubleExpr_return doubleExpr60 =null;

        GrammarParser.doubleBag_return doubleBag64 =null;

        GrammarParser.stringExpr_return stringExpr66 =null;

        GrammarParser.stringBag_return stringBag70 =null;

        GrammarParser.anyUriExpr_return anyUriExpr72 =null;

        GrammarParser.anyUriBag_return anyUriBag76 =null;

        GrammarParser.dateExpr_return dateExpr78 =null;

        GrammarParser.dateBag_return dateBag82 =null;

        GrammarParser.timeExpr_return timeExpr84 =null;

        GrammarParser.timeBag_return timeBag88 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr90 =null;

        GrammarParser.dateTimeBag_return dateTimeBag94 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr96 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag100 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr102 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag106 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr108 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag112 =null;

        GrammarParser.x500NameExpr_return x500NameExpr114 =null;

        GrammarParser.x500NameBag_return x500NameBag118 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr120 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag124 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr126 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag130 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr132 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag136 =null;


        Object char_literal61_tree=null;
        Object ISIN_TOK62_tree=null;
        Object LPAREN63_tree=null;
        Object RPAREN65_tree=null;
        Object char_literal67_tree=null;
        Object ISIN_TOK68_tree=null;
        Object LPAREN69_tree=null;
        Object RPAREN71_tree=null;
        Object char_literal73_tree=null;
        Object ISIN_TOK74_tree=null;
        Object LPAREN75_tree=null;
        Object RPAREN77_tree=null;
        Object char_literal79_tree=null;
        Object ISIN_TOK80_tree=null;
        Object LPAREN81_tree=null;
        Object RPAREN83_tree=null;
        Object char_literal85_tree=null;
        Object ISIN_TOK86_tree=null;
        Object LPAREN87_tree=null;
        Object RPAREN89_tree=null;
        Object char_literal91_tree=null;
        Object ISIN_TOK92_tree=null;
        Object LPAREN93_tree=null;
        Object RPAREN95_tree=null;
        Object char_literal97_tree=null;
        Object ISIN_TOK98_tree=null;
        Object LPAREN99_tree=null;
        Object RPAREN101_tree=null;
        Object char_literal103_tree=null;
        Object ISIN_TOK104_tree=null;
        Object LPAREN105_tree=null;
        Object RPAREN107_tree=null;
        Object char_literal109_tree=null;
        Object ISIN_TOK110_tree=null;
        Object LPAREN111_tree=null;
        Object RPAREN113_tree=null;
        Object char_literal115_tree=null;
        Object ISIN_TOK116_tree=null;
        Object LPAREN117_tree=null;
        Object RPAREN119_tree=null;
        Object char_literal121_tree=null;
        Object ISIN_TOK122_tree=null;
        Object LPAREN123_tree=null;
        Object RPAREN125_tree=null;
        Object char_literal127_tree=null;
        Object ISIN_TOK128_tree=null;
        Object LPAREN129_tree=null;
        Object RPAREN131_tree=null;
        Object char_literal133_tree=null;
        Object ISIN_TOK134_tree=null;
        Object LPAREN135_tree=null;
        Object RPAREN137_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:2: ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:5: doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(161,5);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp816);
                    doubleExpr60=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr60.getTree());
                    dbg.location(161,16);
                    char_literal61=(Token)match(input,84,FOLLOW_84_in_isInOp818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal61_tree = 
                    (Object)adaptor.create(char_literal61)
                    ;
                    adaptor.addChild(root_0, char_literal61_tree);
                    }
                    dbg.location(161,28);
                    ISIN_TOK62=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK62_tree = 
                    (Object)adaptor.create(ISIN_TOK62)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK62_tree, root_0);
                    }
                    dbg.location(161,36);
                    LPAREN63=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp823); if (state.failed) return retval;
                    dbg.location(161,38);
                    pushFollow(FOLLOW_doubleBag_in_isInOp826);
                    doubleBag64=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag64.getTree());
                    dbg.location(161,54);
                    RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp828); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:5: stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(162,5);
                    pushFollow(FOLLOW_stringExpr_in_isInOp835);
                    stringExpr66=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr66.getTree());
                    dbg.location(162,16);
                    char_literal67=(Token)match(input,84,FOLLOW_84_in_isInOp837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal67_tree = 
                    (Object)adaptor.create(char_literal67)
                    ;
                    adaptor.addChild(root_0, char_literal67_tree);
                    }
                    dbg.location(162,28);
                    ISIN_TOK68=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK68_tree = 
                    (Object)adaptor.create(ISIN_TOK68)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK68_tree, root_0);
                    }
                    dbg.location(162,36);
                    LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp842); if (state.failed) return retval;
                    dbg.location(162,38);
                    pushFollow(FOLLOW_stringBag_in_isInOp845);
                    stringBag70=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag70.getTree());
                    dbg.location(162,54);
                    RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp847); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:5: anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(163,5);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp854);
                    anyUriExpr72=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr72.getTree());
                    dbg.location(163,16);
                    char_literal73=(Token)match(input,84,FOLLOW_84_in_isInOp856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);
                    }
                    dbg.location(163,28);
                    ISIN_TOK74=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK74_tree = 
                    (Object)adaptor.create(ISIN_TOK74)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK74_tree, root_0);
                    }
                    dbg.location(163,36);
                    LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp861); if (state.failed) return retval;
                    dbg.location(163,38);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp864);
                    anyUriBag76=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag76.getTree());
                    dbg.location(163,54);
                    RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp866); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:5: dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(164,5);
                    pushFollow(FOLLOW_dateExpr_in_isInOp873);
                    dateExpr78=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr78.getTree());
                    dbg.location(164,14);
                    char_literal79=(Token)match(input,84,FOLLOW_84_in_isInOp875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal79_tree = 
                    (Object)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);
                    }
                    dbg.location(164,26);
                    ISIN_TOK80=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK80_tree = 
                    (Object)adaptor.create(ISIN_TOK80)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK80_tree, root_0);
                    }
                    dbg.location(164,34);
                    LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp880); if (state.failed) return retval;
                    dbg.location(164,36);
                    pushFollow(FOLLOW_dateBag_in_isInOp883);
                    dateBag82=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag82.getTree());
                    dbg.location(164,50);
                    RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp885); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:165:5: timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(165,5);
                    pushFollow(FOLLOW_timeExpr_in_isInOp892);
                    timeExpr84=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr84.getTree());
                    dbg.location(165,14);
                    char_literal85=(Token)match(input,84,FOLLOW_84_in_isInOp894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);
                    }
                    dbg.location(165,26);
                    ISIN_TOK86=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK86_tree = 
                    (Object)adaptor.create(ISIN_TOK86)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK86_tree, root_0);
                    }
                    dbg.location(165,34);
                    LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp899); if (state.failed) return retval;
                    dbg.location(165,36);
                    pushFollow(FOLLOW_timeBag_in_isInOp902);
                    timeBag88=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag88.getTree());
                    dbg.location(165,50);
                    RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp904); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:166:5: dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(166,5);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp911);
                    dateTimeExpr90=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr90.getTree());
                    dbg.location(166,18);
                    char_literal91=(Token)match(input,84,FOLLOW_84_in_isInOp913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
                    }
                    dbg.location(166,30);
                    ISIN_TOK92=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK92_tree = 
                    (Object)adaptor.create(ISIN_TOK92)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK92_tree, root_0);
                    }
                    dbg.location(166,38);
                    LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp918); if (state.failed) return retval;
                    dbg.location(166,40);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp921);
                    dateTimeBag94=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag94.getTree());
                    dbg.location(166,58);
                    RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp923); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:167:5: base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(167,5);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp930);
                    base64BinaryExpr96=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr96.getTree());
                    dbg.location(167,22);
                    char_literal97=(Token)match(input,84,FOLLOW_84_in_isInOp932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);
                    }
                    dbg.location(167,34);
                    ISIN_TOK98=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK98_tree = 
                    (Object)adaptor.create(ISIN_TOK98)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK98_tree, root_0);
                    }
                    dbg.location(167,42);
                    LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp937); if (state.failed) return retval;
                    dbg.location(167,44);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp940);
                    base64BinaryBag100=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag100.getTree());
                    dbg.location(167,66);
                    RPAREN101=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp942); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:5: dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(168,5);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp949);
                    dayTimeDurationExpr102=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr102.getTree());
                    dbg.location(168,25);
                    char_literal103=(Token)match(input,84,FOLLOW_84_in_isInOp951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);
                    }
                    dbg.location(168,37);
                    ISIN_TOK104=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp953); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK104_tree = 
                    (Object)adaptor.create(ISIN_TOK104)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK104_tree, root_0);
                    }
                    dbg.location(168,45);
                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp956); if (state.failed) return retval;
                    dbg.location(168,47);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp959);
                    dayTimeDurationBag106=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag106.getTree());
                    dbg.location(168,72);
                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp961); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:5: yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(169,5);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp968);
                    yearMonthDurationExpr108=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr108.getTree());
                    dbg.location(169,27);
                    char_literal109=(Token)match(input,84,FOLLOW_84_in_isInOp970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);
                    }
                    dbg.location(169,39);
                    ISIN_TOK110=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK110_tree = 
                    (Object)adaptor.create(ISIN_TOK110)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK110_tree, root_0);
                    }
                    dbg.location(169,47);
                    LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp975); if (state.failed) return retval;
                    dbg.location(169,49);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp978);
                    yearMonthDurationBag112=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag112.getTree());
                    dbg.location(169,76);
                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp980); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:5: x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,5);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp987);
                    x500NameExpr114=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr114.getTree());
                    dbg.location(170,18);
                    char_literal115=(Token)match(input,84,FOLLOW_84_in_isInOp989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = 
                    (Object)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    dbg.location(170,30);
                    ISIN_TOK116=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK116_tree = 
                    (Object)adaptor.create(ISIN_TOK116)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK116_tree, root_0);
                    }
                    dbg.location(170,38);
                    LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp994); if (state.failed) return retval;
                    dbg.location(170,40);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp997);
                    x500NameBag118=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag118.getTree());
                    dbg.location(170,58);
                    RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp999); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:5: rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,5);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp1006);
                    rfc822NameExpr120=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr120.getTree());
                    dbg.location(171,20);
                    char_literal121=(Token)match(input,84,FOLLOW_84_in_isInOp1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);
                    }
                    dbg.location(171,32);
                    ISIN_TOK122=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK122_tree = 
                    (Object)adaptor.create(ISIN_TOK122)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK122_tree, root_0);
                    }
                    dbg.location(171,40);
                    LPAREN123=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1013); if (state.failed) return retval;
                    dbg.location(171,42);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp1016);
                    rfc822NameBag124=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag124.getTree());
                    dbg.location(171,62);
                    RPAREN125=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1018); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:5: hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,5);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp1025);
                    hexBinaryExpr126=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr126.getTree());
                    dbg.location(172,19);
                    char_literal127=(Token)match(input,84,FOLLOW_84_in_isInOp1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = 
                    (Object)adaptor.create(char_literal127)
                    ;
                    adaptor.addChild(root_0, char_literal127_tree);
                    }
                    dbg.location(172,31);
                    ISIN_TOK128=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK128_tree = 
                    (Object)adaptor.create(ISIN_TOK128)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK128_tree, root_0);
                    }
                    dbg.location(172,39);
                    LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1032); if (state.failed) return retval;
                    dbg.location(172,41);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp1035);
                    hexBinaryBag130=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag130.getTree());
                    dbg.location(172,60);
                    RPAREN131=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1037); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:5: ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,27);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1050);
                    base64BinaryExpr132=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr132.getTree());
                    dbg.location(173,44);
                    char_literal133=(Token)match(input,84,FOLLOW_84_in_isInOp1052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal133_tree = 
                    (Object)adaptor.create(char_literal133)
                    ;
                    adaptor.addChild(root_0, char_literal133_tree);
                    }
                    dbg.location(173,56);
                    ISIN_TOK134=(Token)match(input,ISIN_TOK,FOLLOW_ISIN_TOK_in_isInOp1054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISIN_TOK134_tree = 
                    (Object)adaptor.create(ISIN_TOK134)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ISIN_TOK134_tree, root_0);
                    }
                    dbg.location(173,64);
                    LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isInOp1057); if (state.failed) return retval;
                    dbg.location(173,66);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1060);
                    base64BinaryBag136=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag136.getTree());
                    dbg.location(173,88);
                    RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isInOp1062); if (state.failed) return retval;

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
        dbg.location(174, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "containsOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:1: containsOp returns [SomeType o] : ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal139=null;
        Token CONTAINS_TOK140=null;
        Token LPAREN141=null;
        Token RPAREN143=null;
        Token char_literal145=null;
        Token CONTAINS_TOK146=null;
        Token LPAREN147=null;
        Token RPAREN149=null;
        Token char_literal151=null;
        Token CONTAINS_TOK152=null;
        Token LPAREN153=null;
        Token RPAREN155=null;
        Token char_literal157=null;
        Token CONTAINS_TOK158=null;
        Token LPAREN159=null;
        Token RPAREN161=null;
        Token char_literal163=null;
        Token CONTAINS_TOK164=null;
        Token LPAREN165=null;
        Token RPAREN167=null;
        Token char_literal169=null;
        Token CONTAINS_TOK170=null;
        Token LPAREN171=null;
        Token RPAREN173=null;
        Token char_literal175=null;
        Token CONTAINS_TOK176=null;
        Token LPAREN177=null;
        Token RPAREN179=null;
        Token char_literal181=null;
        Token CONTAINS_TOK182=null;
        Token LPAREN183=null;
        Token RPAREN185=null;
        Token char_literal187=null;
        Token CONTAINS_TOK188=null;
        Token LPAREN189=null;
        Token RPAREN191=null;
        Token char_literal193=null;
        Token CONTAINS_TOK194=null;
        Token LPAREN195=null;
        Token RPAREN197=null;
        Token char_literal199=null;
        Token CONTAINS_TOK200=null;
        Token LPAREN201=null;
        Token RPAREN203=null;
        Token char_literal205=null;
        Token CONTAINS_TOK206=null;
        Token LPAREN207=null;
        Token RPAREN209=null;
        Token char_literal211=null;
        Token CONTAINS_TOK212=null;
        Token LPAREN213=null;
        Token RPAREN215=null;
        GrammarParser.doubleBag_return doubleBag138 =null;

        GrammarParser.doubleExpr_return doubleExpr142 =null;

        GrammarParser.stringBag_return stringBag144 =null;

        GrammarParser.stringExpr_return stringExpr148 =null;

        GrammarParser.anyUriBag_return anyUriBag150 =null;

        GrammarParser.anyUriExpr_return anyUriExpr154 =null;

        GrammarParser.dateBag_return dateBag156 =null;

        GrammarParser.dateExpr_return dateExpr160 =null;

        GrammarParser.timeBag_return timeBag162 =null;

        GrammarParser.timeExpr_return timeExpr166 =null;

        GrammarParser.dateTimeBag_return dateTimeBag168 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr172 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag174 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr178 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag180 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr184 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag186 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr190 =null;

        GrammarParser.x500NameBag_return x500NameBag192 =null;

        GrammarParser.x500NameExpr_return x500NameExpr196 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag198 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr202 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag204 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr208 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag210 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr214 =null;


        Object char_literal139_tree=null;
        Object CONTAINS_TOK140_tree=null;
        Object LPAREN141_tree=null;
        Object RPAREN143_tree=null;
        Object char_literal145_tree=null;
        Object CONTAINS_TOK146_tree=null;
        Object LPAREN147_tree=null;
        Object RPAREN149_tree=null;
        Object char_literal151_tree=null;
        Object CONTAINS_TOK152_tree=null;
        Object LPAREN153_tree=null;
        Object RPAREN155_tree=null;
        Object char_literal157_tree=null;
        Object CONTAINS_TOK158_tree=null;
        Object LPAREN159_tree=null;
        Object RPAREN161_tree=null;
        Object char_literal163_tree=null;
        Object CONTAINS_TOK164_tree=null;
        Object LPAREN165_tree=null;
        Object RPAREN167_tree=null;
        Object char_literal169_tree=null;
        Object CONTAINS_TOK170_tree=null;
        Object LPAREN171_tree=null;
        Object RPAREN173_tree=null;
        Object char_literal175_tree=null;
        Object CONTAINS_TOK176_tree=null;
        Object LPAREN177_tree=null;
        Object RPAREN179_tree=null;
        Object char_literal181_tree=null;
        Object CONTAINS_TOK182_tree=null;
        Object LPAREN183_tree=null;
        Object RPAREN185_tree=null;
        Object char_literal187_tree=null;
        Object CONTAINS_TOK188_tree=null;
        Object LPAREN189_tree=null;
        Object RPAREN191_tree=null;
        Object char_literal193_tree=null;
        Object CONTAINS_TOK194_tree=null;
        Object LPAREN195_tree=null;
        Object RPAREN197_tree=null;
        Object char_literal199_tree=null;
        Object CONTAINS_TOK200_tree=null;
        Object LPAREN201_tree=null;
        Object RPAREN203_tree=null;
        Object char_literal205_tree=null;
        Object CONTAINS_TOK206_tree=null;
        Object LPAREN207_tree=null;
        Object RPAREN209_tree=null;
        Object char_literal211_tree=null;
        Object CONTAINS_TOK212_tree=null;
        Object LPAREN213_tree=null;
        Object RPAREN215_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:2: ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:177:5: doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,5);
                    pushFollow(FOLLOW_doubleBag_in_containsOp1079);
                    doubleBag138=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag138.getTree());
                    dbg.location(177,15);
                    char_literal139=(Token)match(input,84,FOLLOW_84_in_containsOp1081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal139_tree = 
                    (Object)adaptor.create(char_literal139)
                    ;
                    adaptor.addChild(root_0, char_literal139_tree);
                    }
                    dbg.location(177,31);
                    CONTAINS_TOK140=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK140_tree = 
                    (Object)adaptor.create(CONTAINS_TOK140)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK140_tree, root_0);
                    }
                    dbg.location(177,39);
                    LPAREN141=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1086); if (state.failed) return retval;
                    dbg.location(177,41);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp1089);
                    doubleExpr142=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr142.getTree());
                    dbg.location(177,58);
                    RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1091); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:178:5: stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,5);
                    pushFollow(FOLLOW_stringBag_in_containsOp1098);
                    stringBag144=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag144.getTree());
                    dbg.location(178,15);
                    char_literal145=(Token)match(input,84,FOLLOW_84_in_containsOp1100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = 
                    (Object)adaptor.create(char_literal145)
                    ;
                    adaptor.addChild(root_0, char_literal145_tree);
                    }
                    dbg.location(178,31);
                    CONTAINS_TOK146=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK146_tree = 
                    (Object)adaptor.create(CONTAINS_TOK146)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK146_tree, root_0);
                    }
                    dbg.location(178,39);
                    LPAREN147=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1105); if (state.failed) return retval;
                    dbg.location(178,41);
                    pushFollow(FOLLOW_stringExpr_in_containsOp1108);
                    stringExpr148=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr148.getTree());
                    dbg.location(178,58);
                    RPAREN149=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1110); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:179:5: anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(179,5);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp1117);
                    anyUriBag150=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag150.getTree());
                    dbg.location(179,15);
                    char_literal151=(Token)match(input,84,FOLLOW_84_in_containsOp1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = 
                    (Object)adaptor.create(char_literal151)
                    ;
                    adaptor.addChild(root_0, char_literal151_tree);
                    }
                    dbg.location(179,31);
                    CONTAINS_TOK152=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK152_tree = 
                    (Object)adaptor.create(CONTAINS_TOK152)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK152_tree, root_0);
                    }
                    dbg.location(179,39);
                    LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1124); if (state.failed) return retval;
                    dbg.location(179,41);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp1127);
                    anyUriExpr154=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr154.getTree());
                    dbg.location(179,58);
                    RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1129); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:5: dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,5);
                    pushFollow(FOLLOW_dateBag_in_containsOp1136);
                    dateBag156=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag156.getTree());
                    dbg.location(180,13);
                    char_literal157=(Token)match(input,84,FOLLOW_84_in_containsOp1138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal157_tree = 
                    (Object)adaptor.create(char_literal157)
                    ;
                    adaptor.addChild(root_0, char_literal157_tree);
                    }
                    dbg.location(180,29);
                    CONTAINS_TOK158=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK158_tree = 
                    (Object)adaptor.create(CONTAINS_TOK158)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK158_tree, root_0);
                    }
                    dbg.location(180,37);
                    LPAREN159=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1143); if (state.failed) return retval;
                    dbg.location(180,39);
                    pushFollow(FOLLOW_dateExpr_in_containsOp1146);
                    dateExpr160=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr160.getTree());
                    dbg.location(180,54);
                    RPAREN161=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1148); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:5: timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(181,5);
                    pushFollow(FOLLOW_timeBag_in_containsOp1155);
                    timeBag162=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag162.getTree());
                    dbg.location(181,13);
                    char_literal163=(Token)match(input,84,FOLLOW_84_in_containsOp1157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal163_tree = 
                    (Object)adaptor.create(char_literal163)
                    ;
                    adaptor.addChild(root_0, char_literal163_tree);
                    }
                    dbg.location(181,29);
                    CONTAINS_TOK164=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK164_tree = 
                    (Object)adaptor.create(CONTAINS_TOK164)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK164_tree, root_0);
                    }
                    dbg.location(181,37);
                    LPAREN165=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1162); if (state.failed) return retval;
                    dbg.location(181,39);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1165);
                    timeExpr166=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr166.getTree());
                    dbg.location(181,54);
                    RPAREN167=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1167); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:182:5: dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(182,5);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1174);
                    dateTimeBag168=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag168.getTree());
                    dbg.location(182,17);
                    char_literal169=(Token)match(input,84,FOLLOW_84_in_containsOp1176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = 
                    (Object)adaptor.create(char_literal169)
                    ;
                    adaptor.addChild(root_0, char_literal169_tree);
                    }
                    dbg.location(182,33);
                    CONTAINS_TOK170=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK170_tree = 
                    (Object)adaptor.create(CONTAINS_TOK170)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK170_tree, root_0);
                    }
                    dbg.location(182,41);
                    LPAREN171=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1181); if (state.failed) return retval;
                    dbg.location(182,43);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1184);
                    dateTimeExpr172=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr172.getTree());
                    dbg.location(182,62);
                    RPAREN173=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1186); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:5: base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(183,5);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1193);
                    base64BinaryBag174=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag174.getTree());
                    dbg.location(183,21);
                    char_literal175=(Token)match(input,84,FOLLOW_84_in_containsOp1195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = 
                    (Object)adaptor.create(char_literal175)
                    ;
                    adaptor.addChild(root_0, char_literal175_tree);
                    }
                    dbg.location(183,37);
                    CONTAINS_TOK176=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK176_tree = 
                    (Object)adaptor.create(CONTAINS_TOK176)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK176_tree, root_0);
                    }
                    dbg.location(183,45);
                    LPAREN177=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1200); if (state.failed) return retval;
                    dbg.location(183,47);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1203);
                    base64BinaryExpr178=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr178.getTree());
                    dbg.location(183,70);
                    RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1205); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:5: dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(184,5);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1212);
                    dayTimeDurationBag180=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag180.getTree());
                    dbg.location(184,24);
                    char_literal181=(Token)match(input,84,FOLLOW_84_in_containsOp1214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal181_tree = 
                    (Object)adaptor.create(char_literal181)
                    ;
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    dbg.location(184,40);
                    CONTAINS_TOK182=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK182_tree = 
                    (Object)adaptor.create(CONTAINS_TOK182)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK182_tree, root_0);
                    }
                    dbg.location(184,48);
                    LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1219); if (state.failed) return retval;
                    dbg.location(184,50);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1222);
                    dayTimeDurationExpr184=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr184.getTree());
                    dbg.location(184,76);
                    RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1224); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:185:5: yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(185,5);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1231);
                    yearMonthDurationBag186=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag186.getTree());
                    dbg.location(185,26);
                    char_literal187=(Token)match(input,84,FOLLOW_84_in_containsOp1233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal187_tree = 
                    (Object)adaptor.create(char_literal187)
                    ;
                    adaptor.addChild(root_0, char_literal187_tree);
                    }
                    dbg.location(185,42);
                    CONTAINS_TOK188=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK188_tree = 
                    (Object)adaptor.create(CONTAINS_TOK188)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK188_tree, root_0);
                    }
                    dbg.location(185,50);
                    LPAREN189=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1238); if (state.failed) return retval;
                    dbg.location(185,52);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1241);
                    yearMonthDurationExpr190=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr190.getTree());
                    dbg.location(185,80);
                    RPAREN191=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1243); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:5: x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(186,5);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1250);
                    x500NameBag192=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag192.getTree());
                    dbg.location(186,17);
                    char_literal193=(Token)match(input,84,FOLLOW_84_in_containsOp1252); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal193_tree = 
                    (Object)adaptor.create(char_literal193)
                    ;
                    adaptor.addChild(root_0, char_literal193_tree);
                    }
                    dbg.location(186,33);
                    CONTAINS_TOK194=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1254); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK194_tree = 
                    (Object)adaptor.create(CONTAINS_TOK194)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK194_tree, root_0);
                    }
                    dbg.location(186,41);
                    LPAREN195=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1257); if (state.failed) return retval;
                    dbg.location(186,43);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1260);
                    x500NameExpr196=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr196.getTree());
                    dbg.location(186,62);
                    RPAREN197=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1262); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:5: rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(187,5);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1269);
                    rfc822NameBag198=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag198.getTree());
                    dbg.location(187,19);
                    char_literal199=(Token)match(input,84,FOLLOW_84_in_containsOp1271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal199_tree = 
                    (Object)adaptor.create(char_literal199)
                    ;
                    adaptor.addChild(root_0, char_literal199_tree);
                    }
                    dbg.location(187,35);
                    CONTAINS_TOK200=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK200_tree = 
                    (Object)adaptor.create(CONTAINS_TOK200)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK200_tree, root_0);
                    }
                    dbg.location(187,43);
                    LPAREN201=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1276); if (state.failed) return retval;
                    dbg.location(187,45);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1279);
                    rfc822NameExpr202=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr202.getTree());
                    dbg.location(187,66);
                    RPAREN203=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1281); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:188:5: hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(188,5);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1288);
                    hexBinaryBag204=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag204.getTree());
                    dbg.location(188,18);
                    char_literal205=(Token)match(input,84,FOLLOW_84_in_containsOp1290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal205_tree = 
                    (Object)adaptor.create(char_literal205)
                    ;
                    adaptor.addChild(root_0, char_literal205_tree);
                    }
                    dbg.location(188,34);
                    CONTAINS_TOK206=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK206_tree = 
                    (Object)adaptor.create(CONTAINS_TOK206)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK206_tree, root_0);
                    }
                    dbg.location(188,42);
                    LPAREN207=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1295); if (state.failed) return retval;
                    dbg.location(188,44);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1298);
                    hexBinaryExpr208=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryExpr208.getTree());
                    dbg.location(188,64);
                    RPAREN209=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1300); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:5: ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(189,27);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1313);
                    base64BinaryBag210=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag210.getTree());
                    dbg.location(189,43);
                    char_literal211=(Token)match(input,84,FOLLOW_84_in_containsOp1315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal211_tree = 
                    (Object)adaptor.create(char_literal211)
                    ;
                    adaptor.addChild(root_0, char_literal211_tree);
                    }
                    dbg.location(189,59);
                    CONTAINS_TOK212=(Token)match(input,CONTAINS_TOK,FOLLOW_CONTAINS_TOK_in_containsOp1317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTAINS_TOK212_tree = 
                    (Object)adaptor.create(CONTAINS_TOK212)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CONTAINS_TOK212_tree, root_0);
                    }
                    dbg.location(189,67);
                    LPAREN213=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_containsOp1320); if (state.failed) return retval;
                    dbg.location(189,69);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1323);
                    base64BinaryExpr214=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr214.getTree());
                    dbg.location(189,92);
                    RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_containsOp1325); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "containsOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "containsOp"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:1: equalityExpr returns [SomeType o] : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set217=null;
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
        GrammarParser.integerExpr_return integerExpr216 =null;

        GrammarParser.integerExpr_return integerExpr218 =null;

        GrammarParser.doubleExpr_return doubleExpr219 =null;

        GrammarParser.doubleExpr_return doubleExpr221 =null;

        GrammarParser.stringExpr_return stringExpr222 =null;

        GrammarParser.stringExpr_return stringExpr224 =null;

        GrammarParser.anyUriExpr_return anyUriExpr225 =null;

        GrammarParser.anyUriExpr_return anyUriExpr227 =null;

        GrammarParser.dateExpr_return dateExpr228 =null;

        GrammarParser.dateExpr_return dateExpr230 =null;

        GrammarParser.timeExpr_return timeExpr231 =null;

        GrammarParser.timeExpr_return timeExpr233 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr234 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr236 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr237 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr239 =null;

        GrammarParser.x500NameExpr_return x500NameExpr240 =null;

        GrammarParser.x500NameExpr_return x500NameExpr242 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr243 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr245 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr246 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr248 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr249 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr251 =null;


        Object set217_tree=null;
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

        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:2: ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(193,4);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1341);
                    integerExpr216=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr216.getTree());
                    dbg.location(193,50);
                    set217=(Token)input.LT(1);

                    set217=(Token)input.LT(1);

                    if ( (input.LA(1) >= 85 && input.LA(1) <= 89) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set217)
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

                    dbg.location(193,52);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1366);
                    integerExpr218=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr218.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(194,4);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1371);
                    doubleExpr219=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr219.getTree());
                    dbg.location(194,49);
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

                    dbg.location(194,51);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1396);
                    doubleExpr221=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr221.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:195:4: stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(195,4);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1401);
                    stringExpr222=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr222.getTree());
                    dbg.location(195,49);
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

                    dbg.location(195,51);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr1426);
                    stringExpr224=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr224.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:196:4: anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(196,4);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1431);
                    anyUriExpr225=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr225.getTree());
                    dbg.location(196,49);
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

                    dbg.location(196,51);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr1456);
                    anyUriExpr227=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr227.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:197:4: dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(197,4);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1461);
                    dateExpr228=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr228.getTree());
                    dbg.location(197,47);
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

                    dbg.location(197,49);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr1486);
                    dateExpr230=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr230.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:198:4: timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(198,4);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1491);
                    timeExpr231=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr231.getTree());
                    dbg.location(198,47);
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

                    dbg.location(198,49);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr1516);
                    timeExpr233=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr233.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:4: dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(199,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1521);
                    dateTimeExpr234=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr234.getTree());
                    dbg.location(199,51);
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

                    dbg.location(199,53);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr1546);
                    dateTimeExpr236=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr236.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(200,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1551);
                    yearMonthDurationExpr237=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr237.getTree());
                    dbg.location(200,60);
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

                    dbg.location(200,62);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr1576);
                    yearMonthDurationExpr239=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr239.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:4: x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(201,4);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1581);
                    x500NameExpr240=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr240.getTree());
                    dbg.location(201,51);
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

                    dbg.location(201,53);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr1606);
                    x500NameExpr242=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr242.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(202,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1611);
                    rfc822NameExpr243=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr243.getTree());
                    dbg.location(202,54);
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

                    dbg.location(202,56);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr1637);
                    rfc822NameExpr245=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr245.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:4: dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(203,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1642);
                    dayTimeDurationExpr246=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr246.getTree());
                    dbg.location(203,58);
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

                    dbg.location(203,60);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr1667);
                    dayTimeDurationExpr248=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr248.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1672);
                    base64BinaryExpr249=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr249.getTree());
                    dbg.location(204,55);
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

                    dbg.location(204,57);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr1697);
                    base64BinaryExpr251=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr251.getTree());

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
        dbg.location(205, 2);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:1: regexOp returns [SomeType o] : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal253=null;
        Token REGEXMATCH_TOK254=null;
        Token LPAREN255=null;
        Token RPAREN257=null;
        Token char_literal259=null;
        Token REGEXMATCH_TOK260=null;
        Token LPAREN261=null;
        Token RPAREN263=null;
        Token char_literal265=null;
        Token REGEXMATCH_TOK266=null;
        Token LPAREN267=null;
        Token RPAREN269=null;
        Token char_literal271=null;
        Token REGEXMATCH_TOK272=null;
        Token LPAREN273=null;
        Token RPAREN275=null;
        Token char_literal277=null;
        Token REGEXMATCH_TOK278=null;
        Token LPAREN279=null;
        Token RPAREN281=null;
        Token char_literal283=null;
        Token REGEXMATCH_TOK284=null;
        Token LPAREN285=null;
        Token RPAREN287=null;
        Token char_literal289=null;
        Token REGEXMATCH_TOK290=null;
        Token LPAREN291=null;
        Token RPAREN293=null;
        Token char_literal295=null;
        Token REGEXMATCH_TOK296=null;
        Token LPAREN297=null;
        Token RPAREN299=null;
        Token char_literal301=null;
        Token REGEXMATCH_TOK302=null;
        Token LPAREN303=null;
        Token RPAREN305=null;
        Token char_literal307=null;
        Token REGEXMATCH_TOK308=null;
        Token LPAREN309=null;
        Token RPAREN311=null;
        Token char_literal313=null;
        Token REGEXMATCH_TOK314=null;
        Token LPAREN315=null;
        Token RPAREN317=null;
        Token char_literal319=null;
        Token REGEXMATCH_TOK320=null;
        Token LPAREN321=null;
        Token RPAREN323=null;
        GrammarParser.integerExpr_return integerExpr252 =null;

        GrammarParser.integerExpr_return integerExpr256 =null;

        GrammarParser.doubleExpr_return doubleExpr258 =null;

        GrammarParser.doubleExpr_return doubleExpr262 =null;

        GrammarParser.stringExpr_return stringExpr264 =null;

        GrammarParser.stringExpr_return stringExpr268 =null;

        GrammarParser.anyUriExpr_return anyUriExpr270 =null;

        GrammarParser.anyUriExpr_return anyUriExpr274 =null;

        GrammarParser.dateExpr_return dateExpr276 =null;

        GrammarParser.dateExpr_return dateExpr280 =null;

        GrammarParser.timeExpr_return timeExpr282 =null;

        GrammarParser.timeExpr_return timeExpr286 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr288 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr292 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr294 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr298 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr300 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr304 =null;

        GrammarParser.x500NameExpr_return x500NameExpr306 =null;

        GrammarParser.x500NameExpr_return x500NameExpr310 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr312 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr316 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr318 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr322 =null;


        Object char_literal253_tree=null;
        Object REGEXMATCH_TOK254_tree=null;
        Object LPAREN255_tree=null;
        Object RPAREN257_tree=null;
        Object char_literal259_tree=null;
        Object REGEXMATCH_TOK260_tree=null;
        Object LPAREN261_tree=null;
        Object RPAREN263_tree=null;
        Object char_literal265_tree=null;
        Object REGEXMATCH_TOK266_tree=null;
        Object LPAREN267_tree=null;
        Object RPAREN269_tree=null;
        Object char_literal271_tree=null;
        Object REGEXMATCH_TOK272_tree=null;
        Object LPAREN273_tree=null;
        Object RPAREN275_tree=null;
        Object char_literal277_tree=null;
        Object REGEXMATCH_TOK278_tree=null;
        Object LPAREN279_tree=null;
        Object RPAREN281_tree=null;
        Object char_literal283_tree=null;
        Object REGEXMATCH_TOK284_tree=null;
        Object LPAREN285_tree=null;
        Object RPAREN287_tree=null;
        Object char_literal289_tree=null;
        Object REGEXMATCH_TOK290_tree=null;
        Object LPAREN291_tree=null;
        Object RPAREN293_tree=null;
        Object char_literal295_tree=null;
        Object REGEXMATCH_TOK296_tree=null;
        Object LPAREN297_tree=null;
        Object RPAREN299_tree=null;
        Object char_literal301_tree=null;
        Object REGEXMATCH_TOK302_tree=null;
        Object LPAREN303_tree=null;
        Object RPAREN305_tree=null;
        Object char_literal307_tree=null;
        Object REGEXMATCH_TOK308_tree=null;
        Object LPAREN309_tree=null;
        Object RPAREN311_tree=null;
        Object char_literal313_tree=null;
        Object REGEXMATCH_TOK314_tree=null;
        Object LPAREN315_tree=null;
        Object RPAREN317_tree=null;
        Object char_literal319_tree=null;
        Object REGEXMATCH_TOK320_tree=null;
        Object LPAREN321_tree=null;
        Object RPAREN323_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:2: ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:4: integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(208,4);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1713);
                    integerExpr252=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr252.getTree());
                    dbg.location(208,17);
                    char_literal253=(Token)match(input,84,FOLLOW_84_in_regexOp1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal253_tree = 
                    (Object)adaptor.create(char_literal253)
                    ;
                    adaptor.addChild(root_0, char_literal253_tree);
                    }
                    dbg.location(208,35);
                    REGEXMATCH_TOK254=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK254_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK254)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK254_tree, root_0);
                    }
                    dbg.location(208,43);
                    LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1721); if (state.failed) return retval;
                    dbg.location(208,45);
                    pushFollow(FOLLOW_integerExpr_in_regexOp1724);
                    integerExpr256=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr256.getTree());
                    dbg.location(208,63);
                    RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1726); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:4: doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(209,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1732);
                    doubleExpr258=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr258.getTree());
                    dbg.location(209,15);
                    char_literal259=(Token)match(input,84,FOLLOW_84_in_regexOp1734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = 
                    (Object)adaptor.create(char_literal259)
                    ;
                    adaptor.addChild(root_0, char_literal259_tree);
                    }
                    dbg.location(209,33);
                    REGEXMATCH_TOK260=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK260_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK260)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK260_tree, root_0);
                    }
                    dbg.location(209,41);
                    LPAREN261=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1739); if (state.failed) return retval;
                    dbg.location(209,43);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp1742);
                    doubleExpr262=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleExpr262.getTree());
                    dbg.location(209,60);
                    RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1744); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(210,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1750);
                    stringExpr264=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr264.getTree());
                    dbg.location(210,15);
                    char_literal265=(Token)match(input,84,FOLLOW_84_in_regexOp1752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);
                    }
                    dbg.location(210,33);
                    REGEXMATCH_TOK266=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK266_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK266)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK266_tree, root_0);
                    }
                    dbg.location(210,41);
                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1757); if (state.failed) return retval;
                    dbg.location(210,43);
                    pushFollow(FOLLOW_stringExpr_in_regexOp1760);
                    stringExpr268=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr268.getTree());
                    dbg.location(210,60);
                    RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1762); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:4: anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(211,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1768);
                    anyUriExpr270=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr270.getTree());
                    dbg.location(211,15);
                    char_literal271=(Token)match(input,84,FOLLOW_84_in_regexOp1770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (Object)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }
                    dbg.location(211,33);
                    REGEXMATCH_TOK272=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK272_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK272)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK272_tree, root_0);
                    }
                    dbg.location(211,41);
                    LPAREN273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1775); if (state.failed) return retval;
                    dbg.location(211,43);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp1778);
                    anyUriExpr274=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriExpr274.getTree());
                    dbg.location(211,60);
                    RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1780); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(212,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1786);
                    dateExpr276=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr276.getTree());
                    dbg.location(212,13);
                    char_literal277=(Token)match(input,84,FOLLOW_84_in_regexOp1788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = 
                    (Object)adaptor.create(char_literal277)
                    ;
                    adaptor.addChild(root_0, char_literal277_tree);
                    }
                    dbg.location(212,31);
                    REGEXMATCH_TOK278=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK278_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK278)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK278_tree, root_0);
                    }
                    dbg.location(212,39);
                    LPAREN279=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1793); if (state.failed) return retval;
                    dbg.location(212,41);
                    pushFollow(FOLLOW_dateExpr_in_regexOp1796);
                    dateExpr280=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateExpr280.getTree());
                    dbg.location(212,56);
                    RPAREN281=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1798); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:4: timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1804);
                    timeExpr282=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr282.getTree());
                    dbg.location(213,13);
                    char_literal283=(Token)match(input,84,FOLLOW_84_in_regexOp1806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal283_tree = 
                    (Object)adaptor.create(char_literal283)
                    ;
                    adaptor.addChild(root_0, char_literal283_tree);
                    }
                    dbg.location(213,31);
                    REGEXMATCH_TOK284=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK284_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK284)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK284_tree, root_0);
                    }
                    dbg.location(213,39);
                    LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1811); if (state.failed) return retval;
                    dbg.location(213,41);
                    pushFollow(FOLLOW_timeExpr_in_regexOp1814);
                    timeExpr286=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeExpr286.getTree());
                    dbg.location(213,56);
                    RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1816); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(214,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1822);
                    dateTimeExpr288=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr288.getTree());
                    dbg.location(214,17);
                    char_literal289=(Token)match(input,84,FOLLOW_84_in_regexOp1824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal289_tree = 
                    (Object)adaptor.create(char_literal289)
                    ;
                    adaptor.addChild(root_0, char_literal289_tree);
                    }
                    dbg.location(214,35);
                    REGEXMATCH_TOK290=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK290_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK290)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK290_tree, root_0);
                    }
                    dbg.location(214,43);
                    LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1829); if (state.failed) return retval;
                    dbg.location(214,45);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp1832);
                    dateTimeExpr292=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeExpr292.getTree());
                    dbg.location(214,64);
                    RPAREN293=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1834); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:4: dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1840);
                    dayTimeDurationExpr294=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr294.getTree());
                    dbg.location(215,24);
                    char_literal295=(Token)match(input,84,FOLLOW_84_in_regexOp1842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);
                    }
                    dbg.location(215,42);
                    REGEXMATCH_TOK296=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK296_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK296)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK296_tree, root_0);
                    }
                    dbg.location(215,50);
                    LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1847); if (state.failed) return retval;
                    dbg.location(215,52);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp1850);
                    dayTimeDurationExpr298=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationExpr298.getTree());
                    dbg.location(215,78);
                    RPAREN299=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1852); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(216,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1858);
                    yearMonthDurationExpr300=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr300.getTree());
                    dbg.location(216,26);
                    char_literal301=(Token)match(input,84,FOLLOW_84_in_regexOp1860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal301_tree = 
                    (Object)adaptor.create(char_literal301)
                    ;
                    adaptor.addChild(root_0, char_literal301_tree);
                    }
                    dbg.location(216,44);
                    REGEXMATCH_TOK302=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK302_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK302)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK302_tree, root_0);
                    }
                    dbg.location(216,52);
                    LPAREN303=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1865); if (state.failed) return retval;
                    dbg.location(216,54);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp1868);
                    yearMonthDurationExpr304=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationExpr304.getTree());
                    dbg.location(216,82);
                    RPAREN305=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1870); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:4: x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(217,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1876);
                    x500NameExpr306=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr306.getTree());
                    dbg.location(217,17);
                    char_literal307=(Token)match(input,84,FOLLOW_84_in_regexOp1878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = 
                    (Object)adaptor.create(char_literal307)
                    ;
                    adaptor.addChild(root_0, char_literal307_tree);
                    }
                    dbg.location(217,35);
                    REGEXMATCH_TOK308=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK308_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK308)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK308_tree, root_0);
                    }
                    dbg.location(217,43);
                    LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1883); if (state.failed) return retval;
                    dbg.location(217,45);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp1886);
                    x500NameExpr310=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameExpr310.getTree());
                    dbg.location(217,64);
                    RPAREN311=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1888); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(218,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1894);
                    rfc822NameExpr312=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr312.getTree());
                    dbg.location(218,19);
                    char_literal313=(Token)match(input,84,FOLLOW_84_in_regexOp1896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal313_tree = 
                    (Object)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);
                    }
                    dbg.location(218,37);
                    REGEXMATCH_TOK314=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK314_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK314)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK314_tree, root_0);
                    }
                    dbg.location(218,45);
                    LPAREN315=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1901); if (state.failed) return retval;
                    dbg.location(218,47);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp1904);
                    rfc822NameExpr316=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameExpr316.getTree());
                    dbg.location(218,68);
                    RPAREN317=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1906); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:219:4: base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(219,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1912);
                    base64BinaryExpr318=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr318.getTree());
                    dbg.location(219,21);
                    char_literal319=(Token)match(input,84,FOLLOW_84_in_regexOp1914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal319_tree = 
                    (Object)adaptor.create(char_literal319)
                    ;
                    adaptor.addChild(root_0, char_literal319_tree);
                    }
                    dbg.location(219,39);
                    REGEXMATCH_TOK320=(Token)match(input,REGEXMATCH_TOK,FOLLOW_REGEXMATCH_TOK_in_regexOp1916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXMATCH_TOK320_tree = 
                    (Object)adaptor.create(REGEXMATCH_TOK320)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(REGEXMATCH_TOK320_tree, root_0);
                    }
                    dbg.location(219,47);
                    LPAREN321=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regexOp1919); if (state.failed) return retval;
                    dbg.location(219,49);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp1922);
                    base64BinaryExpr322=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryExpr322.getTree());
                    dbg.location(219,72);
                    RPAREN323=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regexOp1924); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "regexOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "regexOp"


    public static class bagOp_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bagOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:1: bagOp returns [SomeType o] : ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !);
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal325=null;
        Token set326=null;
        Token LPAREN327=null;
        Token RPAREN329=null;
        Token char_literal331=null;
        Token set332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        Token char_literal337=null;
        Token set338=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        Token char_literal343=null;
        Token set344=null;
        Token LPAREN345=null;
        Token RPAREN347=null;
        Token char_literal349=null;
        Token set350=null;
        Token LPAREN351=null;
        Token RPAREN353=null;
        Token char_literal355=null;
        Token set356=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        Token char_literal361=null;
        Token set362=null;
        Token LPAREN363=null;
        Token RPAREN365=null;
        Token char_literal367=null;
        Token set368=null;
        Token LPAREN369=null;
        Token RPAREN371=null;
        Token char_literal373=null;
        Token set374=null;
        Token LPAREN375=null;
        Token RPAREN377=null;
        Token char_literal379=null;
        Token set380=null;
        Token LPAREN381=null;
        Token RPAREN383=null;
        Token char_literal385=null;
        Token set386=null;
        Token LPAREN387=null;
        Token RPAREN389=null;
        Token char_literal391=null;
        Token set392=null;
        Token LPAREN393=null;
        Token RPAREN395=null;
        Token char_literal397=null;
        Token set398=null;
        Token LPAREN399=null;
        Token RPAREN401=null;
        Token char_literal403=null;
        Token set404=null;
        Token LPAREN405=null;
        Token RPAREN407=null;
        Token char_literal409=null;
        Token set410=null;
        Token LPAREN411=null;
        Token RPAREN413=null;
        GrammarParser.booleanBag_return booleanBag324 =null;

        GrammarParser.booleanBag_return booleanBag328 =null;

        GrammarParser.integerBag_return integerBag330 =null;

        GrammarParser.integerBag_return integerBag334 =null;

        GrammarParser.doubleBag_return doubleBag336 =null;

        GrammarParser.doubleBag_return doubleBag340 =null;

        GrammarParser.stringBag_return stringBag342 =null;

        GrammarParser.stringBag_return stringBag346 =null;

        GrammarParser.dateBag_return dateBag348 =null;

        GrammarParser.dateBag_return dateBag352 =null;

        GrammarParser.timeBag_return timeBag354 =null;

        GrammarParser.timeBag_return timeBag358 =null;

        GrammarParser.dateTimeBag_return dateTimeBag360 =null;

        GrammarParser.dateTimeBag_return dateTimeBag364 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag366 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag370 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag372 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag376 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag378 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag382 =null;

        GrammarParser.anyUriBag_return anyUriBag384 =null;

        GrammarParser.anyUriBag_return anyUriBag388 =null;

        GrammarParser.x500NameBag_return x500NameBag390 =null;

        GrammarParser.x500NameBag_return x500NameBag394 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag396 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag400 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag402 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag406 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag408 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag412 =null;


        Object char_literal325_tree=null;
        Object set326_tree=null;
        Object LPAREN327_tree=null;
        Object RPAREN329_tree=null;
        Object char_literal331_tree=null;
        Object set332_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;
        Object char_literal337_tree=null;
        Object set338_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
        Object char_literal343_tree=null;
        Object set344_tree=null;
        Object LPAREN345_tree=null;
        Object RPAREN347_tree=null;
        Object char_literal349_tree=null;
        Object set350_tree=null;
        Object LPAREN351_tree=null;
        Object RPAREN353_tree=null;
        Object char_literal355_tree=null;
        Object set356_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;
        Object char_literal361_tree=null;
        Object set362_tree=null;
        Object LPAREN363_tree=null;
        Object RPAREN365_tree=null;
        Object char_literal367_tree=null;
        Object set368_tree=null;
        Object LPAREN369_tree=null;
        Object RPAREN371_tree=null;
        Object char_literal373_tree=null;
        Object set374_tree=null;
        Object LPAREN375_tree=null;
        Object RPAREN377_tree=null;
        Object char_literal379_tree=null;
        Object set380_tree=null;
        Object LPAREN381_tree=null;
        Object RPAREN383_tree=null;
        Object char_literal385_tree=null;
        Object set386_tree=null;
        Object LPAREN387_tree=null;
        Object RPAREN389_tree=null;
        Object char_literal391_tree=null;
        Object set392_tree=null;
        Object LPAREN393_tree=null;
        Object RPAREN395_tree=null;
        Object char_literal397_tree=null;
        Object set398_tree=null;
        Object LPAREN399_tree=null;
        Object RPAREN401_tree=null;
        Object char_literal403_tree=null;
        Object set404_tree=null;
        Object LPAREN405_tree=null;
        Object RPAREN407_tree=null;
        Object char_literal409_tree=null;
        Object set410_tree=null;
        Object LPAREN411_tree=null;
        Object RPAREN413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:2: ( ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !| ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !| ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !| ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !| ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !| ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !| ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !| ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !| ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !| ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !| ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !| ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !| ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:4: ( booleanBag )=> booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! booleanBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(223,20);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1946);
                    booleanBag324=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag324.getTree());
                    dbg.location(223,31);
                    char_literal325=(Token)match(input,84,FOLLOW_84_in_bagOp1948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal325_tree = 
                    (Object)adaptor.create(char_literal325)
                    ;
                    adaptor.addChild(root_0, char_literal325_tree);
                    }
                    dbg.location(223,90);
                    set326=(Token)input.LT(1);

                    set326=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set326)
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

                    dbg.location(223,98);
                    LPAREN327=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp1965); if (state.failed) return retval;
                    dbg.location(223,100);
                    pushFollow(FOLLOW_booleanBag_in_bagOp1968);
                    booleanBag328=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag328.getTree());
                    dbg.location(223,117);
                    RPAREN329=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp1970); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: ( integerBag )=> integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! integerBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(224,20);
                    pushFollow(FOLLOW_integerBag_in_bagOp1982);
                    integerBag330=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag330.getTree());
                    dbg.location(224,31);
                    char_literal331=(Token)match(input,84,FOLLOW_84_in_bagOp1984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal331_tree = 
                    (Object)adaptor.create(char_literal331)
                    ;
                    adaptor.addChild(root_0, char_literal331_tree);
                    }
                    dbg.location(224,91);
                    set332=(Token)input.LT(1);

                    set332=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set332)
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

                    dbg.location(224,99);
                    LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2002); if (state.failed) return retval;
                    dbg.location(224,102);
                    pushFollow(FOLLOW_integerBag_in_bagOp2006);
                    integerBag334=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag334.getTree());
                    dbg.location(224,119);
                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2008); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:4: ( doubleBag )=> doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! doubleBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(225,19);
                    pushFollow(FOLLOW_doubleBag_in_bagOp2020);
                    doubleBag336=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag336.getTree());
                    dbg.location(225,29);
                    char_literal337=(Token)match(input,84,FOLLOW_84_in_bagOp2022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal337_tree = 
                    (Object)adaptor.create(char_literal337)
                    ;
                    adaptor.addChild(root_0, char_literal337_tree);
                    }
                    dbg.location(225,89);
                    set338=(Token)input.LT(1);

                    set338=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set338)
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

                    dbg.location(225,97);
                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2040); if (state.failed) return retval;
                    dbg.location(225,100);
                    pushFollow(FOLLOW_doubleBag_in_bagOp2044);
                    doubleBag340=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag340.getTree());
                    dbg.location(225,116);
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2046); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:4: ( stringBag )=> stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! stringBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(226,20);
                    pushFollow(FOLLOW_stringBag_in_bagOp2059);
                    stringBag342=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag342.getTree());
                    dbg.location(226,30);
                    char_literal343=(Token)match(input,84,FOLLOW_84_in_bagOp2061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal343_tree = 
                    (Object)adaptor.create(char_literal343)
                    ;
                    adaptor.addChild(root_0, char_literal343_tree);
                    }
                    dbg.location(226,90);
                    set344=(Token)input.LT(1);

                    set344=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set344)
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

                    dbg.location(226,98);
                    LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2079); if (state.failed) return retval;
                    dbg.location(226,101);
                    pushFollow(FOLLOW_stringBag_in_bagOp2083);
                    stringBag346=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag346.getTree());
                    dbg.location(226,117);
                    RPAREN347=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2085); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: ( dateBag )=> dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(227,18);
                    pushFollow(FOLLOW_dateBag_in_bagOp2098);
                    dateBag348=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag348.getTree());
                    dbg.location(227,26);
                    char_literal349=(Token)match(input,84,FOLLOW_84_in_bagOp2100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = 
                    (Object)adaptor.create(char_literal349)
                    ;
                    adaptor.addChild(root_0, char_literal349_tree);
                    }
                    dbg.location(227,86);
                    set350=(Token)input.LT(1);

                    set350=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set350)
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

                    dbg.location(227,94);
                    LPAREN351=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2118); if (state.failed) return retval;
                    dbg.location(227,97);
                    pushFollow(FOLLOW_dateBag_in_bagOp2122);
                    dateBag352=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag352.getTree());
                    dbg.location(227,111);
                    RPAREN353=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2124); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: ( timeBag )=> timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! timeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(228,18);
                    pushFollow(FOLLOW_timeBag_in_bagOp2137);
                    timeBag354=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag354.getTree());
                    dbg.location(228,26);
                    char_literal355=(Token)match(input,84,FOLLOW_84_in_bagOp2139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal355_tree = 
                    (Object)adaptor.create(char_literal355)
                    ;
                    adaptor.addChild(root_0, char_literal355_tree);
                    }
                    dbg.location(228,86);
                    set356=(Token)input.LT(1);

                    set356=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set356)
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

                    dbg.location(228,94);
                    LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2157); if (state.failed) return retval;
                    dbg.location(228,97);
                    pushFollow(FOLLOW_timeBag_in_bagOp2161);
                    timeBag358=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag358.getTree());
                    dbg.location(228,111);
                    RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2163); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: ( dateTimeBag )=> dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dateTimeBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(229,22);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2176);
                    dateTimeBag360=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag360.getTree());
                    dbg.location(229,34);
                    char_literal361=(Token)match(input,84,FOLLOW_84_in_bagOp2178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal361_tree = 
                    (Object)adaptor.create(char_literal361)
                    ;
                    adaptor.addChild(root_0, char_literal361_tree);
                    }
                    dbg.location(229,94);
                    set362=(Token)input.LT(1);

                    set362=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set362)
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

                    dbg.location(229,102);
                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2196); if (state.failed) return retval;
                    dbg.location(229,105);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp2200);
                    dateTimeBag364=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag364.getTree());
                    dbg.location(229,123);
                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2202); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(230,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2215);
                    base64BinaryBag366=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag366.getTree());
                    dbg.location(230,42);
                    char_literal367=(Token)match(input,84,FOLLOW_84_in_bagOp2217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal367_tree = 
                    (Object)adaptor.create(char_literal367)
                    ;
                    adaptor.addChild(root_0, char_literal367_tree);
                    }
                    dbg.location(230,101);
                    set368=(Token)input.LT(1);

                    set368=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set368)
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

                    dbg.location(230,109);
                    LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2234); if (state.failed) return retval;
                    dbg.location(230,112);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2238);
                    base64BinaryBag370=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag370.getTree());
                    dbg.location(230,134);
                    RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2240); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: ( dayTimeDurationBag )=> dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! dayTimeDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(231,29);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2253);
                    dayTimeDurationBag372=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag372.getTree());
                    dbg.location(231,48);
                    char_literal373=(Token)match(input,84,FOLLOW_84_in_bagOp2255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal373_tree = 
                    (Object)adaptor.create(char_literal373)
                    ;
                    adaptor.addChild(root_0, char_literal373_tree);
                    }
                    dbg.location(231,107);
                    set374=(Token)input.LT(1);

                    set374=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set374)
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

                    dbg.location(231,115);
                    LPAREN375=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2272); if (state.failed) return retval;
                    dbg.location(231,118);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp2276);
                    dayTimeDurationBag376=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag376.getTree());
                    dbg.location(231,143);
                    RPAREN377=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2278); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:4: ( yearMonthDurationBag )=> yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! yearMonthDurationBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(232,31);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2291);
                    yearMonthDurationBag378=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag378.getTree());
                    dbg.location(232,52);
                    char_literal379=(Token)match(input,84,FOLLOW_84_in_bagOp2293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal379_tree = 
                    (Object)adaptor.create(char_literal379)
                    ;
                    adaptor.addChild(root_0, char_literal379_tree);
                    }
                    dbg.location(232,112);
                    set380=(Token)input.LT(1);

                    set380=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set380)
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

                    dbg.location(232,120);
                    LPAREN381=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2311); if (state.failed) return retval;
                    dbg.location(232,123);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp2315);
                    yearMonthDurationBag382=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag382.getTree());
                    dbg.location(232,150);
                    RPAREN383=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2317); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( anyUriBag )=> anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! anyUriBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(233,20);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2330);
                    anyUriBag384=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag384.getTree());
                    dbg.location(233,30);
                    char_literal385=(Token)match(input,84,FOLLOW_84_in_bagOp2332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = 
                    (Object)adaptor.create(char_literal385)
                    ;
                    adaptor.addChild(root_0, char_literal385_tree);
                    }
                    dbg.location(233,90);
                    set386=(Token)input.LT(1);

                    set386=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set386)
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

                    dbg.location(233,98);
                    LPAREN387=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2350); if (state.failed) return retval;
                    dbg.location(233,101);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp2354);
                    anyUriBag388=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag388.getTree());
                    dbg.location(233,117);
                    RPAREN389=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2356); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( x500NameBag )=> x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! x500NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(234,22);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2369);
                    x500NameBag390=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag390.getTree());
                    dbg.location(234,34);
                    char_literal391=(Token)match(input,84,FOLLOW_84_in_bagOp2371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal391_tree = 
                    (Object)adaptor.create(char_literal391)
                    ;
                    adaptor.addChild(root_0, char_literal391_tree);
                    }
                    dbg.location(234,94);
                    set392=(Token)input.LT(1);

                    set392=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set392)
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

                    dbg.location(234,102);
                    LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2389); if (state.failed) return retval;
                    dbg.location(234,105);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp2393);
                    x500NameBag394=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag394.getTree());
                    dbg.location(234,123);
                    RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2395); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: ( rfc822NameBag )=> rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! rfc822NameBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(235,24);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2408);
                    rfc822NameBag396=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag396.getTree());
                    dbg.location(235,38);
                    char_literal397=(Token)match(input,84,FOLLOW_84_in_bagOp2410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal397_tree = 
                    (Object)adaptor.create(char_literal397)
                    ;
                    adaptor.addChild(root_0, char_literal397_tree);
                    }
                    dbg.location(235,97);
                    set398=(Token)input.LT(1);

                    set398=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set398)
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

                    dbg.location(235,105);
                    LPAREN399=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2427); if (state.failed) return retval;
                    dbg.location(235,108);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp2431);
                    rfc822NameBag400=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag400.getTree());
                    dbg.location(235,128);
                    RPAREN401=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2433); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( hexBinaryBag )=> hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! hexBinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(236,23);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2446);
                    hexBinaryBag402=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag402.getTree());
                    dbg.location(236,36);
                    char_literal403=(Token)match(input,84,FOLLOW_84_in_bagOp2448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal403_tree = 
                    (Object)adaptor.create(char_literal403)
                    ;
                    adaptor.addChild(root_0, char_literal403_tree);
                    }
                    dbg.location(236,96);
                    set404=(Token)input.LT(1);

                    set404=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set404)
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

                    dbg.location(236,104);
                    LPAREN405=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2466); if (state.failed) return retval;
                    dbg.location(236,107);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp2470);
                    hexBinaryBag406=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag406.getTree());
                    dbg.location(236,126);
                    RPAREN407=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2472); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:4: ( base64BinaryBag )=> base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) ^ LPAREN ! base64BinaryBag RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(237,25);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2484);
                    base64BinaryBag408=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag408.getTree());
                    dbg.location(237,41);
                    char_literal409=(Token)match(input,84,FOLLOW_84_in_bagOp2486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal409_tree = 
                    (Object)adaptor.create(char_literal409)
                    ;
                    adaptor.addChild(root_0, char_literal409_tree);
                    }
                    dbg.location(237,101);
                    set410=(Token)input.LT(1);

                    set410=(Token)input.LT(1);

                    if ( input.LA(1)==ATLEASTONEMENBEROF_TOK||input.LA(1)==SETEQUALS_TOK||input.LA(1)==SUBSET_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set410)
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

                    dbg.location(237,109);
                    LPAREN411=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_bagOp2504); if (state.failed) return retval;
                    dbg.location(237,112);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp2508);
                    base64BinaryBag412=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag412.getTree());
                    dbg.location(237,134);
                    RPAREN413=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_bagOp2510); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "bagOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bagOp"


    public static class integerExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:1: integerExpr returns [SomeType o] : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_CONSTANT414=null;
        Token char_literal416=null;
        Token set417=null;
        Token LPAREN418=null;
        Token RPAREN419=null;
        Token char_literal421=null;
        Token SIZE_TOK422=null;
        Token LPAREN423=null;
        Token RPAREN424=null;
        GrammarParser.stringExpr_return stringExpr415 =null;

        GrammarParser.anyBag_return anyBag420 =null;


        Object INTEGER_CONSTANT414_tree=null;
        Object char_literal416_tree=null;
        Object set417_tree=null;
        Object LPAREN418_tree=null;
        Object RPAREN419_tree=null;
        Object char_literal421_tree=null;
        Object SIZE_TOK422_tree=null;
        Object LPAREN423_tree=null;
        Object RPAREN424_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:2: ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: INTEGER_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(241,20);
                    INTEGER_CONSTANT414=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr2526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT414_tree = 
                    (Object)adaptor.create(INTEGER_CONSTANT414)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(INTEGER_CONSTANT414_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:4: stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(242,4);
                    pushFollow(FOLLOW_stringExpr_in_integerExpr2532);
                    stringExpr415=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr415.getTree());
                    dbg.location(242,15);
                    char_literal416=(Token)match(input,84,FOLLOW_84_in_integerExpr2534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal416_tree = 
                    (Object)adaptor.create(char_literal416)
                    ;
                    adaptor.addChild(root_0, char_literal416_tree);
                    }
                    dbg.location(242,50);
                    set417=(Token)input.LT(1);

                    set417=(Token)input.LT(1);

                    if ( input.LA(1)==INTEGER_TOK||input.LA(1)==NODECOUNT_TOK ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set417)
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

                    dbg.location(242,58);
                    LPAREN418=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2547); if (state.failed) return retval;
                    dbg.location(242,67);
                    RPAREN419=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2551); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(243,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr2557);
                    anyBag420=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag420.getTree());
                    dbg.location(243,11);
                    char_literal421=(Token)match(input,84,FOLLOW_84_in_integerExpr2559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal421_tree = 
                    (Object)adaptor.create(char_literal421)
                    ;
                    adaptor.addChild(root_0, char_literal421_tree);
                    }
                    dbg.location(243,23);
                    SIZE_TOK422=(Token)match(input,SIZE_TOK,FOLLOW_SIZE_TOK_in_integerExpr2561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE_TOK422_tree = 
                    (Object)adaptor.create(SIZE_TOK422)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SIZE_TOK422_tree, root_0);
                    }
                    dbg.location(243,31);
                    LPAREN423=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerExpr2564); if (state.failed) return retval;
                    dbg.location(243,39);
                    RPAREN424=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerExpr2567); if (state.failed) return retval;

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
        dbg.location(247, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:1: integerBag returns [SomeType o] : ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_TOK425=null;
        Token STRING_CONSTANT_LIST426=null;
        Token BAG_TOK427=null;
        Token LPAREN428=null;
        Token char_literal430=null;
        Token RPAREN432=null;
        Token char_literal433=null;
        Token set434=null;
        Token LPAREN435=null;
        Token RPAREN437=null;
        GrammarParser.integerExpr_return integerExpr429 =null;

        GrammarParser.integerExpr_return integerExpr431 =null;

        GrammarParser.integerBag_return integerBag436 =null;


        Object INTEGER_TOK425_tree=null;
        Object STRING_CONSTANT_LIST426_tree=null;
        Object BAG_TOK427_tree=null;
        Object LPAREN428_tree=null;
        Object char_literal430_tree=null;
        Object RPAREN432_tree=null;
        Object char_literal433_tree=null;
        Object set434_tree=null;
        Object LPAREN435_tree=null;
        Object RPAREN437_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:2: ( ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !) ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(249,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: ( INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:5: INTEGER_TOK STRING_CONSTANT_LIST
                    {
                    dbg.location(249,5);
                    INTEGER_TOK425=(Token)match(input,INTEGER_TOK,FOLLOW_INTEGER_TOK_in_integerBag2586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_TOK425_tree = 
                    (Object)adaptor.create(INTEGER_TOK425)
                    ;
                    adaptor.addChild(root_0, INTEGER_TOK425_tree);
                    }
                    dbg.location(249,17);
                    STRING_CONSTANT_LIST426=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_integerBag2588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST426_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST426)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST426_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:40: BAG_TOK ^ LPAREN ! integerExpr ( ',' ! integerExpr )+ RPAREN !
                    {
                    dbg.location(249,47);
                    BAG_TOK427=(Token)match(input,BAG_TOK,FOLLOW_BAG_TOK_in_integerBag2592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG_TOK427_tree = 
                    (Object)adaptor.create(BAG_TOK427)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BAG_TOK427_tree, root_0);
                    }
                    dbg.location(249,55);
                    LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2595); if (state.failed) return retval;
                    dbg.location(249,57);
                    pushFollow(FOLLOW_integerExpr_in_integerBag2598);
                    integerExpr429=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr429.getTree());
                    dbg.location(249,69);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:69: ( ',' ! integerExpr )+
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

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:71: ',' ! integerExpr
                    	    {
                    	    dbg.location(249,74);
                    	    char_literal430=(Token)match(input,83,FOLLOW_83_in_integerBag2602); if (state.failed) return retval;
                    	    dbg.location(249,76);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag2605);
                    	    integerExpr431=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr431.getTree());

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

                    dbg.location(249,96);
                    RPAREN432=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2609); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(249,99);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:99: ( '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !)*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:100: '.' ( INTERSECTION_TOK | UNION_TOK ) ^ LPAREN ! integerBag RPAREN !
            	    {
            	    dbg.location(249,100);
            	    char_literal433=(Token)match(input,84,FOLLOW_84_in_integerBag2614); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal433_tree = 
            	    (Object)adaptor.create(char_literal433)
            	    ;
            	    adaptor.addChild(root_0, char_literal433_tree);
            	    }
            	    dbg.location(249,136);
            	    set434=(Token)input.LT(1);

            	    set434=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION_TOK||input.LA(1)==UNION_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set434)
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

            	    dbg.location(249,144);
            	    LPAREN435=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_integerBag2627); if (state.failed) return retval;
            	    dbg.location(249,146);
            	    pushFollow(FOLLOW_integerBag_in_integerBag2630);
            	    integerBag436=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag436.getTree());
            	    dbg.location(249,163);
            	    RPAREN437=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_integerBag2632); if (state.failed) return retval;

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
        dbg.location(250, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:1: doubleExpr returns [SomeType o] : ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !);
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_CONSTANT438=null;
        Token DOUBLE_TOK439=null;
        Token LPAREN440=null;
        Token RPAREN442=null;
        GrammarParser.stringExpr_return stringExpr441 =null;


        Object DOUBLE_CONSTANT438_tree=null;
        Object DOUBLE_TOK439_tree=null;
        Object LPAREN440_tree=null;
        Object RPAREN442_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:2: ( DOUBLE_CONSTANT ^| DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: DOUBLE_CONSTANT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(253,19);
                    DOUBLE_CONSTANT438=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT438_tree = 
                    (Object)adaptor.create(DOUBLE_CONSTANT438)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_CONSTANT438_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:254:4: DOUBLE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(254,14);
                    DOUBLE_TOK439=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleExpr2656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_TOK439_tree = 
                    (Object)adaptor.create(DOUBLE_TOK439)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK439_tree, root_0);
                    }
                    dbg.location(254,22);
                    LPAREN440=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doubleExpr2659); if (state.failed) return retval;
                    dbg.location(254,24);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr2662);
                    stringExpr441=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr441.getTree());
                    dbg.location(254,41);
                    RPAREN442=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doubleExpr2664); if (state.failed) return retval;

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
        dbg.location(257, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:1: doubleBag returns [SomeType o] : DOUBLE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_TOK443=null;
        Token STRING_CONSTANT_LIST444=null;

        Object DOUBLE_TOK443_tree=null;
        Object STRING_CONSTANT_LIST444_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:2: ( DOUBLE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:4: DOUBLE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(259,14);
            DOUBLE_TOK443=(Token)match(input,DOUBLE_TOK,FOLLOW_DOUBLE_TOK_in_doubleBag2681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOUBLE_TOK443_tree = 
            (Object)adaptor.create(DOUBLE_TOK443)
            ;
            root_0 = (Object)adaptor.becomeRoot(DOUBLE_TOK443_tree, root_0);
            }
            dbg.location(259,16);
            STRING_CONSTANT_LIST444=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST444_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST444)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST444_tree);
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
        dbg.location(262, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:1: stringExpr returns [SomeType o] : ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)* ;
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_CONSTANT445=null;
        Token char_literal447=null;
        Token ONEANDONLY_TOK448=null;
        Token LPAREN449=null;
        Token RPAREN450=null;
        Token char_literal451=null;
        Token set452=null;
        Token LPAREN453=null;
        Token RPAREN454=null;
        GrammarParser.stringBag_return stringBag446 =null;


        Object STRING_CONSTANT445_tree=null;
        Object char_literal447_tree=null;
        Object ONEANDONLY_TOK448_tree=null;
        Object LPAREN449_tree=null;
        Object RPAREN450_tree=null;
        Object char_literal451_tree=null;
        Object set452_tree=null;
        Object LPAREN453_tree=null;
        Object RPAREN454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:2: ( ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !) ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(265,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:4: ( STRING_CONSTANT ^| stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:5: STRING_CONSTANT ^
                    {
                    dbg.location(265,20);
                    STRING_CONSTANT445=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr2702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT445_tree = 
                    (Object)adaptor.create(STRING_CONSTANT445)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_CONSTANT445_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:5: stringBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    dbg.location(266,5);
                    pushFollow(FOLLOW_stringBag_in_stringExpr2709);
                    stringBag446=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag446.getTree());
                    dbg.location(266,15);
                    char_literal447=(Token)match(input,84,FOLLOW_84_in_stringExpr2711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal447_tree = 
                    (Object)adaptor.create(char_literal447)
                    ;
                    adaptor.addChild(root_0, char_literal447_tree);
                    }
                    dbg.location(266,33);
                    ONEANDONLY_TOK448=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_stringExpr2713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK448_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK448)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK448_tree, root_0);
                    }
                    dbg.location(266,41);
                    LPAREN449=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2716); if (state.failed) return retval;
                    dbg.location(266,49);
                    RPAREN450=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2719); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(267,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:3: ( '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !)*
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:4: '.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK ) LPAREN ! RPAREN !
            	    {
            	    dbg.location(267,4);
            	    char_literal451=(Token)match(input,84,FOLLOW_84_in_stringExpr2726); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal451_tree = 
            	    (Object)adaptor.create(char_literal451)
            	    ;
            	    adaptor.addChild(root_0, char_literal451_tree);
            	    }
            	    dbg.location(267,8);
            	    set452=(Token)input.LT(1);

            	    if ( (input.LA(1) >= NORMALIZESPACE_TOK && input.LA(1) <= NORMALIZETOLOWERCASE_TOK)||input.LA(1)==REQUIRED_TOK ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set452)
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

            	    dbg.location(267,78);
            	    LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stringExpr2741); if (state.failed) return retval;
            	    dbg.location(267,86);
            	    RPAREN454=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stringExpr2744); if (state.failed) return retval;

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
        dbg.location(268, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:1: stringBag returns [SomeType o] : ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_TOK455=null;
        Token STRING_CONSTANT_LIST456=null;
        GrammarParser.attributeExpr_return attributeExpr457 =null;


        Object STRING_TOK455_tree=null;
        Object STRING_CONSTANT_LIST456_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:2: ( STRING_TOK ^ STRING_CONSTANT_LIST | attributeExpr )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:4: STRING_TOK ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(271,14);
                    STRING_TOK455=(Token)match(input,STRING_TOK,FOLLOW_STRING_TOK_in_stringBag2762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_TOK455_tree = 
                    (Object)adaptor.create(STRING_TOK455)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(STRING_TOK455_tree, root_0);
                    }
                    dbg.location(271,16);
                    STRING_CONSTANT_LIST456=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag2765); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST456_tree = 
                    (Object)adaptor.create(STRING_CONSTANT_LIST456)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST456_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:4: attributeExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(272,4);
                    pushFollow(FOLLOW_attributeExpr_in_stringBag2770);
                    attributeExpr457=attributeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeExpr457.getTree());

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
            dbg.exitRule(getGrammarFileName(), "stringBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stringBag"


    public static class attributeExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:1: attributeExpr returns [SomeType o] : ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ ;
    public final GrammarParser.attributeExpr_return attributeExpr() throws RecognitionException {
        GrammarParser.attributeExpr_return retval = new GrammarParser.attributeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set458=null;
        Token char_literal459=null;
        Token LOWERCASEIDENTIFIER460=null;

        Object set458_tree=null;
        Object char_literal459_tree=null;
        Object LOWERCASEIDENTIFIER460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(277, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:2: ( ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+ )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:4: ( SUBJECT_TOK | RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK ) ^ ( '.' LOWERCASEIDENTIFIER )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(278,64);
            set458=(Token)input.LT(1);

            set458=(Token)input.LT(1);

            if ( input.LA(1)==ACTION_TOK||input.LA(1)==ENVIRONMENT_TOK||input.LA(1)==RESOURCE_TOK||input.LA(1)==SUBJECT_TOK ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set458)
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

            dbg.location(278,66);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:66: ( '.' LOWERCASEIDENTIFIER )+
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

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:67: '.' LOWERCASEIDENTIFIER
            	    {
            	    dbg.location(278,67);
            	    char_literal459=(Token)match(input,84,FOLLOW_84_in_attributeExpr2806); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal459_tree = 
            	    (Object)adaptor.create(char_literal459)
            	    ;
            	    adaptor.addChild(root_0, char_literal459_tree);
            	    }
            	    dbg.location(278,71);
            	    LOWERCASEIDENTIFIER460=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2808); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOWERCASEIDENTIFIER460_tree = 
            	    (Object)adaptor.create(LOWERCASEIDENTIFIER460)
            	    ;
            	    adaptor.addChild(root_0, LOWERCASEIDENTIFIER460_tree);
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
        dbg.location(279, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:1: anyUriExpr returns [SomeType o] : ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK461=null;
        Token LPAREN462=null;
        Token RPAREN464=null;
        Token char_literal466=null;
        Token ONEANDONLY_TOK467=null;
        Token LPAREN468=null;
        Token RPAREN469=null;
        Token char_literal471=null;
        Token URI_TOK472=null;
        Token LPAREN473=null;
        Token RPAREN474=null;
        GrammarParser.stringExpr_return stringExpr463 =null;

        GrammarParser.anyUriBag_return anyUriBag465 =null;

        GrammarParser.stringExpr_return stringExpr470 =null;


        Object ANYURI_TOK461_tree=null;
        Object LPAREN462_tree=null;
        Object RPAREN464_tree=null;
        Object char_literal466_tree=null;
        Object ONEANDONLY_TOK467_tree=null;
        Object LPAREN468_tree=null;
        Object RPAREN469_tree=null;
        Object char_literal471_tree=null;
        Object URI_TOK472_tree=null;
        Object LPAREN473_tree=null;
        Object RPAREN474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(281, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:2: ( ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !| stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:282:4: ANYURI_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(282,14);
                    ANYURI_TOK461=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriExpr2826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI_TOK461_tree = 
                    (Object)adaptor.create(ANYURI_TOK461)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK461_tree, root_0);
                    }
                    dbg.location(282,22);
                    LPAREN462=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2829); if (state.failed) return retval;
                    dbg.location(282,24);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2832);
                    stringExpr463=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr463.getTree());
                    dbg.location(282,41);
                    RPAREN464=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2834); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:283:4: anyUriBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(283,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr2840);
                    anyUriBag465=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag465.getTree());
                    dbg.location(283,14);
                    char_literal466=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal466_tree = 
                    (Object)adaptor.create(char_literal466)
                    ;
                    adaptor.addChild(root_0, char_literal466_tree);
                    }
                    dbg.location(283,32);
                    ONEANDONLY_TOK467=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK467_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK467)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK467_tree, root_0);
                    }
                    dbg.location(283,40);
                    LPAREN468=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2847); if (state.failed) return retval;
                    dbg.location(283,48);
                    RPAREN469=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2850); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:4: stringExpr '.' URI_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(284,4);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr2856);
                    stringExpr470=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr470.getTree());
                    dbg.location(284,15);
                    char_literal471=(Token)match(input,84,FOLLOW_84_in_anyUriExpr2858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal471_tree = 
                    (Object)adaptor.create(char_literal471)
                    ;
                    adaptor.addChild(root_0, char_literal471_tree);
                    }
                    dbg.location(284,26);
                    URI_TOK472=(Token)match(input,URI_TOK,FOLLOW_URI_TOK_in_anyUriExpr2860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI_TOK472_tree = 
                    (Object)adaptor.create(URI_TOK472)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(URI_TOK472_tree, root_0);
                    }
                    dbg.location(284,34);
                    LPAREN473=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_anyUriExpr2863); if (state.failed) return retval;
                    dbg.location(284,42);
                    RPAREN474=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_anyUriExpr2866); if (state.failed) return retval;

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
        dbg.location(287, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:289:1: anyUriBag returns [SomeType o] : ANYURI_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANYURI_TOK475=null;
        Token STRING_CONSTANT_LIST476=null;

        Object ANYURI_TOK475_tree=null;
        Object STRING_CONSTANT_LIST476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:2: ( ANYURI_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:4: ANYURI_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(290,14);
            ANYURI_TOK475=(Token)match(input,ANYURI_TOK,FOLLOW_ANYURI_TOK_in_anyUriBag2884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYURI_TOK475_tree = 
            (Object)adaptor.create(ANYURI_TOK475)
            ;
            root_0 = (Object)adaptor.becomeRoot(ANYURI_TOK475_tree, root_0);
            }
            dbg.location(290,16);
            STRING_CONSTANT_LIST476=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2887); if (state.failed) return retval;
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
        dbg.location(292, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:1: dateExpr returns [SomeType o] : ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK477=null;
        Token LPAREN478=null;
        Token RPAREN480=null;
        Token char_literal482=null;
        Token ONEANDONLY_TOK483=null;
        Token LPAREN484=null;
        Token RPAREN485=null;
        GrammarParser.stringExpr_return stringExpr479 =null;

        GrammarParser.dateBag_return dateBag481 =null;


        Object DATE_TOK477_tree=null;
        Object LPAREN478_tree=null;
        Object RPAREN480_tree=null;
        Object char_literal482_tree=null;
        Object ONEANDONLY_TOK483_tree=null;
        Object LPAREN484_tree=null;
        Object RPAREN485_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:2: ( DATE_TOK ^ LPAREN ! stringExpr RPAREN !| dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:4: DATE_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(295,12);
                    DATE_TOK477=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateExpr2903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE_TOK477_tree = 
                    (Object)adaptor.create(DATE_TOK477)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATE_TOK477_tree, root_0);
                    }
                    dbg.location(295,20);
                    LPAREN478=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2906); if (state.failed) return retval;
                    dbg.location(295,22);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr2909);
                    stringExpr479=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr479.getTree());
                    dbg.location(295,39);
                    RPAREN480=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2911); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:4: dateBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(296,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr2917);
                    dateBag481=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag481.getTree());
                    dbg.location(296,12);
                    char_literal482=(Token)match(input,84,FOLLOW_84_in_dateExpr2919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal482_tree = 
                    (Object)adaptor.create(char_literal482)
                    ;
                    adaptor.addChild(root_0, char_literal482_tree);
                    }
                    dbg.location(296,30);
                    ONEANDONLY_TOK483=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateExpr2921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK483_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK483)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK483_tree, root_0);
                    }
                    dbg.location(296,38);
                    LPAREN484=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateExpr2924); if (state.failed) return retval;
                    dbg.location(296,46);
                    RPAREN485=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateExpr2927); if (state.failed) return retval;

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
        dbg.location(297, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:1: dateBag returns [SomeType o] : DATE_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATE_TOK486=null;
        Token STRING_CONSTANT_LIST487=null;

        Object DATE_TOK486_tree=null;
        Object STRING_CONSTANT_LIST487_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:2: ( DATE_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:4: DATE_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(299,12);
            DATE_TOK486=(Token)match(input,DATE_TOK,FOLLOW_DATE_TOK_in_dateBag2942); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE_TOK486_tree = 
            (Object)adaptor.create(DATE_TOK486)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATE_TOK486_tree, root_0);
            }
            dbg.location(299,14);
            STRING_CONSTANT_LIST487=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag2945); if (state.failed) return retval;
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
        dbg.location(302, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:1: timeExpr returns [SomeType o] : ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !);
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK488=null;
        Token LPAREN489=null;
        Token RPAREN491=null;
        Token char_literal493=null;
        Token ONEANDONLY_TOK494=null;
        Token LPAREN495=null;
        Token RPAREN496=null;
        GrammarParser.stringExpr_return stringExpr490 =null;

        GrammarParser.timeBag_return timeBag492 =null;


        Object TIME_TOK488_tree=null;
        Object LPAREN489_tree=null;
        Object RPAREN491_tree=null;
        Object char_literal493_tree=null;
        Object ONEANDONLY_TOK494_tree=null;
        Object LPAREN495_tree=null;
        Object RPAREN496_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:2: ( TIME_TOK ^ LPAREN ! stringExpr RPAREN !| timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:4: TIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(305,12);
                    TIME_TOK488=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeExpr2962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME_TOK488_tree = 
                    (Object)adaptor.create(TIME_TOK488)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TIME_TOK488_tree, root_0);
                    }
                    dbg.location(305,20);
                    LPAREN489=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2965); if (state.failed) return retval;
                    dbg.location(305,22);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr2968);
                    stringExpr490=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr490.getTree());
                    dbg.location(305,39);
                    RPAREN491=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2970); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:4: timeBag '.' ONEANDONLY_TOK LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(306,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr2976);
                    timeBag492=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag492.getTree());
                    dbg.location(306,12);
                    char_literal493=(Token)match(input,84,FOLLOW_84_in_timeExpr2978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal493_tree = 
                    (Object)adaptor.create(char_literal493)
                    ;
                    adaptor.addChild(root_0, char_literal493_tree);
                    }
                    dbg.location(306,16);
                    ONEANDONLY_TOK494=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_timeExpr2980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK494_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK494)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK494_tree);
                    }
                    dbg.location(306,37);
                    LPAREN495=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_timeExpr2982); if (state.failed) return retval;
                    dbg.location(306,45);
                    RPAREN496=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_timeExpr2985); if (state.failed) return retval;

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
        dbg.location(307, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:1: timeBag returns [SomeType o] : TIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIME_TOK497=null;
        Token STRING_CONSTANT_LIST498=null;

        Object TIME_TOK497_tree=null;
        Object STRING_CONSTANT_LIST498_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:309:2: ( TIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:309:4: TIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(309,12);
            TIME_TOK497=(Token)match(input,TIME_TOK,FOLLOW_TIME_TOK_in_timeBag3000); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME_TOK497_tree = 
            (Object)adaptor.create(TIME_TOK497)
            ;
            root_0 = (Object)adaptor.becomeRoot(TIME_TOK497_tree, root_0);
            }
            dbg.location(309,14);
            STRING_CONSTANT_LIST498=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag3003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST498_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST498)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST498_tree);
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
        dbg.location(312, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:1: dateTimeExpr returns [SomeType o] : ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK499=null;
        Token LPAREN500=null;
        Token RPAREN502=null;
        Token char_literal504=null;
        Token ONEANDONLY_TOK505=null;
        Token LPAREN506=null;
        Token RPAREN507=null;
        GrammarParser.stringExpr_return stringExpr501 =null;

        GrammarParser.dateTimeBag_return dateTimeBag503 =null;


        Object DATETIME_TOK499_tree=null;
        Object LPAREN500_tree=null;
        Object RPAREN502_tree=null;
        Object char_literal504_tree=null;
        Object ONEANDONLY_TOK505_tree=null;
        Object LPAREN506_tree=null;
        Object RPAREN507_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:2: ( DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !| dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:4: DATETIME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(315,16);
                    DATETIME_TOK499=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeExpr3020); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME_TOK499_tree = 
                    (Object)adaptor.create(DATETIME_TOK499)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK499_tree, root_0);
                    }
                    dbg.location(315,24);
                    LPAREN500=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr3023); if (state.failed) return retval;
                    dbg.location(315,26);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr3026);
                    stringExpr501=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr501.getTree());
                    dbg.location(315,43);
                    RPAREN502=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr3028); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:4: dateTimeBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(316,4);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr3034);
                    dateTimeBag503=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag503.getTree());
                    dbg.location(316,16);
                    char_literal504=(Token)match(input,84,FOLLOW_84_in_dateTimeExpr3036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal504_tree = 
                    (Object)adaptor.create(char_literal504)
                    ;
                    adaptor.addChild(root_0, char_literal504_tree);
                    }
                    dbg.location(316,34);
                    ONEANDONLY_TOK505=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr3038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK505_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK505)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK505_tree, root_0);
                    }
                    dbg.location(316,42);
                    LPAREN506=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateTimeExpr3041); if (state.failed) return retval;
                    dbg.location(316,50);
                    RPAREN507=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateTimeExpr3044); if (state.failed) return retval;

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
        dbg.location(317, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:1: dateTimeBag returns [SomeType o] : DATETIME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME_TOK508=null;
        Token STRING_CONSTANT_LIST509=null;

        Object DATETIME_TOK508_tree=null;
        Object STRING_CONSTANT_LIST509_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:2: ( DATETIME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:4: DATETIME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(319,16);
            DATETIME_TOK508=(Token)match(input,DATETIME_TOK,FOLLOW_DATETIME_TOK_in_dateTimeBag3059); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATETIME_TOK508_tree = 
            (Object)adaptor.create(DATETIME_TOK508)
            ;
            root_0 = (Object)adaptor.becomeRoot(DATETIME_TOK508_tree, root_0);
            }
            dbg.location(319,18);
            STRING_CONSTANT_LIST509=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag3062); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST509_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST509)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST509_tree);
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
        dbg.location(322, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:1: base64BinaryExpr returns [SomeType o] : ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK510=null;
        Token LPAREN511=null;
        Token RPAREN513=null;
        Token char_literal515=null;
        Token ONEANDONLY_TOK516=null;
        Token LPAREN517=null;
        Token RPAREN518=null;
        GrammarParser.stringExpr_return stringExpr512 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag514 =null;


        Object BASE64BINARY_TOK510_tree=null;
        Object LPAREN511_tree=null;
        Object RPAREN513_tree=null;
        Object char_literal515_tree=null;
        Object ONEANDONLY_TOK516_tree=null;
        Object LPAREN517_tree=null;
        Object RPAREN518_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:2: ( BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !| base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:4: BASE64BINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(325,20);
                    BASE64BINARY_TOK510=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr3079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY_TOK510_tree = 
                    (Object)adaptor.create(BASE64BINARY_TOK510)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK510_tree, root_0);
                    }
                    dbg.location(325,28);
                    LPAREN511=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr3082); if (state.failed) return retval;
                    dbg.location(325,30);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr3085);
                    stringExpr512=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr512.getTree());
                    dbg.location(325,47);
                    RPAREN513=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr3087); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:4: base64BinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(326,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr3093);
                    base64BinaryBag514=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag514.getTree());
                    dbg.location(326,20);
                    char_literal515=(Token)match(input,84,FOLLOW_84_in_base64BinaryExpr3095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal515_tree = 
                    (Object)adaptor.create(char_literal515)
                    ;
                    adaptor.addChild(root_0, char_literal515_tree);
                    }
                    dbg.location(326,38);
                    ONEANDONLY_TOK516=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr3097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK516_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK516)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK516_tree, root_0);
                    }
                    dbg.location(326,46);
                    LPAREN517=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_base64BinaryExpr3100); if (state.failed) return retval;
                    dbg.location(326,54);
                    RPAREN518=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_base64BinaryExpr3103); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "base64BinaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryExpr"


    public static class base64BinaryBag_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:1: base64BinaryBag returns [SomeType o] : BASE64BINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE64BINARY_TOK519=null;
        Token STRING_CONSTANT_LIST520=null;

        Object BASE64BINARY_TOK519_tree=null;
        Object STRING_CONSTANT_LIST520_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:2: ( BASE64BINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:4: BASE64BINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(329,20);
            BASE64BINARY_TOK519=(Token)match(input,BASE64BINARY_TOK,FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3118); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BASE64BINARY_TOK519_tree = 
            (Object)adaptor.create(BASE64BINARY_TOK519)
            ;
            root_0 = (Object)adaptor.becomeRoot(BASE64BINARY_TOK519_tree, root_0);
            }
            dbg.location(329,22);
            STRING_CONSTANT_LIST520=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST520_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST520)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST520_tree);
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
            dbg.exitRule(getGrammarFileName(), "base64BinaryBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base64BinaryBag"


    public static class dayTimeDurationExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:335:1: dayTimeDurationExpr returns [SomeType o] : ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !);
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK521=null;
        Token LPAREN522=null;
        Token RPAREN524=null;
        Token char_literal526=null;
        Token ONEANDONLY_TOK527=null;
        Token LPAREN528=null;
        Token RPAREN529=null;
        GrammarParser.stringExpr_return stringExpr523 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag525 =null;


        Object DAYTIMEDURATION_TOK521_tree=null;
        Object LPAREN522_tree=null;
        Object RPAREN524_tree=null;
        Object char_literal526_tree=null;
        Object ONEANDONLY_TOK527_tree=null;
        Object LPAREN528_tree=null;
        Object RPAREN529_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(335, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:2: ( DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:4: DAYTIMEDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(336,23);
                    DAYTIMEDURATION_TOK521=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION_TOK521_tree = 
                    (Object)adaptor.create(DAYTIMEDURATION_TOK521)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK521_tree, root_0);
                    }
                    dbg.location(336,31);
                    LPAREN522=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3142); if (state.failed) return retval;
                    dbg.location(336,33);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr3145);
                    stringExpr523=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr523.getTree());
                    dbg.location(336,50);
                    RPAREN524=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3147); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:337:4: dayTimeDurationBag ^ '.' ONEANDONLY_TOK LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(337,22);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3153);
                    dayTimeDurationBag525=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dayTimeDurationBag525.getTree(), root_0);
                    dbg.location(337,24);
                    char_literal526=(Token)match(input,84,FOLLOW_84_in_dayTimeDurationExpr3156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal526_tree = 
                    (Object)adaptor.create(char_literal526)
                    ;
                    adaptor.addChild(root_0, char_literal526_tree);
                    }
                    dbg.location(337,28);
                    ONEANDONLY_TOK527=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK527_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK527)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY_TOK527_tree);
                    }
                    dbg.location(337,49);
                    LPAREN528=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dayTimeDurationExpr3160); if (state.failed) return retval;
                    dbg.location(337,57);
                    RPAREN529=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dayTimeDurationExpr3163); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationExpr"


    public static class dayTimeDurationBag_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:1: dayTimeDurationBag returns [SomeType o] : DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DAYTIMEDURATION_TOK530=null;
        Token STRING_CONSTANT_LIST531=null;

        Object DAYTIMEDURATION_TOK530_tree=null;
        Object STRING_CONSTANT_LIST531_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:2: ( DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: DAYTIMEDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(340,23);
            DAYTIMEDURATION_TOK530=(Token)match(input,DAYTIMEDURATION_TOK,FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3178); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DAYTIMEDURATION_TOK530_tree = 
            (Object)adaptor.create(DAYTIMEDURATION_TOK530)
            ;
            root_0 = (Object)adaptor.becomeRoot(DAYTIMEDURATION_TOK530_tree, root_0);
            }
            dbg.location(340,25);
            STRING_CONSTANT_LIST531=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3181); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST531_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST531)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST531_tree);
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
            dbg.exitRule(getGrammarFileName(), "dayTimeDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayTimeDurationBag"


    public static class yearMonthDurationExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:1: yearMonthDurationExpr returns [SomeType o] : ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK532=null;
        Token LPAREN533=null;
        Token RPAREN535=null;
        Token char_literal537=null;
        Token ONEANDONLY_TOK538=null;
        Token LPAREN539=null;
        Token RPAREN540=null;
        GrammarParser.stringExpr_return stringExpr534 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag536 =null;


        Object YEARMONTHDURATION_TOK532_tree=null;
        Object LPAREN533_tree=null;
        Object RPAREN535_tree=null;
        Object char_literal537_tree=null;
        Object ONEANDONLY_TOK538_tree=null;
        Object LPAREN539_tree=null;
        Object RPAREN540_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:2: ( YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !| yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:4: YEARMONTHDURATION_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(346,25);
                    YEARMONTHDURATION_TOK532=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION_TOK532_tree = 
                    (Object)adaptor.create(YEARMONTHDURATION_TOK532)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK532_tree, root_0);
                    }
                    dbg.location(346,33);
                    LPAREN533=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3201); if (state.failed) return retval;
                    dbg.location(346,35);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr3204);
                    stringExpr534=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr534.getTree());
                    dbg.location(346,52);
                    RPAREN535=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3206); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:347:4: yearMonthDurationBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(347,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3212);
                    yearMonthDurationBag536=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag536.getTree());
                    dbg.location(347,25);
                    char_literal537=(Token)match(input,84,FOLLOW_84_in_yearMonthDurationExpr3214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal537_tree = 
                    (Object)adaptor.create(char_literal537)
                    ;
                    adaptor.addChild(root_0, char_literal537_tree);
                    }
                    dbg.location(347,43);
                    ONEANDONLY_TOK538=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK538_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK538)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK538_tree, root_0);
                    }
                    dbg.location(347,51);
                    LPAREN539=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_yearMonthDurationExpr3219); if (state.failed) return retval;
                    dbg.location(347,59);
                    RPAREN540=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_yearMonthDurationExpr3222); if (state.failed) return retval;

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
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationExpr"


    public static class yearMonthDurationBag_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:349:1: yearMonthDurationBag returns [SomeType o] : YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token YEARMONTHDURATION_TOK541=null;
        Token STRING_CONSTANT_LIST542=null;

        Object YEARMONTHDURATION_TOK541_tree=null;
        Object STRING_CONSTANT_LIST542_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:2: ( YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:350:4: YEARMONTHDURATION_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(350,25);
            YEARMONTHDURATION_TOK541=(Token)match(input,YEARMONTHDURATION_TOK,FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            YEARMONTHDURATION_TOK541_tree = 
            (Object)adaptor.create(YEARMONTHDURATION_TOK541)
            ;
            root_0 = (Object)adaptor.becomeRoot(YEARMONTHDURATION_TOK541_tree, root_0);
            }
            dbg.location(350,27);
            STRING_CONSTANT_LIST542=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST542_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST542)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST542_tree);
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
            dbg.exitRule(getGrammarFileName(), "yearMonthDurationBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "yearMonthDurationBag"


    public static class x500NameExpr_return extends ParserRuleReturnScope {
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:1: x500NameExpr returns [SomeType o] : ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK543=null;
        Token LPAREN544=null;
        Token RPAREN546=null;
        Token char_literal548=null;
        Token ONEANDONLY_TOK549=null;
        Token LPAREN550=null;
        Token RPAREN551=null;
        GrammarParser.stringExpr_return stringExpr545 =null;

        GrammarParser.x500NameBag_return x500NameBag547 =null;


        Object X500NAME_TOK543_tree=null;
        Object LPAREN544_tree=null;
        Object RPAREN546_tree=null;
        Object char_literal548_tree=null;
        Object ONEANDONLY_TOK549_tree=null;
        Object LPAREN550_tree=null;
        Object RPAREN551_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:2: ( X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !| x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:4: X500NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(356,16);
                    X500NAME_TOK543=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameExpr3257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME_TOK543_tree = 
                    (Object)adaptor.create(X500NAME_TOK543)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK543_tree, root_0);
                    }
                    dbg.location(356,24);
                    LPAREN544=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3260); if (state.failed) return retval;
                    dbg.location(356,26);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr3263);
                    stringExpr545=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr545.getTree());
                    dbg.location(356,43);
                    RPAREN546=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3265); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:357:4: x500NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(357,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr3271);
                    x500NameBag547=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag547.getTree());
                    dbg.location(357,17);
                    char_literal548=(Token)match(input,84,FOLLOW_84_in_x500NameExpr3274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal548_tree = 
                    (Object)adaptor.create(char_literal548)
                    ;
                    adaptor.addChild(root_0, char_literal548_tree);
                    }
                    dbg.location(357,35);
                    ONEANDONLY_TOK549=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK549_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK549)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK549_tree, root_0);
                    }
                    dbg.location(357,43);
                    LPAREN550=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_x500NameExpr3279); if (state.failed) return retval;
                    dbg.location(357,51);
                    RPAREN551=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_x500NameExpr3282); if (state.failed) return retval;

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
        dbg.location(359, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:360:1: x500NameBag returns [SomeType o] : X500NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token X500NAME_TOK552=null;
        Token STRING_CONSTANT_LIST553=null;

        Object X500NAME_TOK552_tree=null;
        Object STRING_CONSTANT_LIST553_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(360, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:361:2: ( X500NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:361:4: X500NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(361,16);
            X500NAME_TOK552=(Token)match(input,X500NAME_TOK,FOLLOW_X500NAME_TOK_in_x500NameBag3298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            X500NAME_TOK552_tree = 
            (Object)adaptor.create(X500NAME_TOK552)
            ;
            root_0 = (Object)adaptor.becomeRoot(X500NAME_TOK552_tree, root_0);
            }
            dbg.location(361,18);
            STRING_CONSTANT_LIST553=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3301); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST553_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST553)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST553_tree);
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
        dbg.location(364, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:1: rfc822NameExpr returns [SomeType o] : ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK554=null;
        Token LPAREN555=null;
        Token RPAREN557=null;
        Token char_literal559=null;
        Token ONEANDONLY_TOK560=null;
        Token LPAREN561=null;
        Token RPAREN562=null;
        GrammarParser.stringExpr_return stringExpr556 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag558 =null;


        Object RFC822NAME_TOK554_tree=null;
        Object LPAREN555_tree=null;
        Object RPAREN557_tree=null;
        Object char_literal559_tree=null;
        Object ONEANDONLY_TOK560_tree=null;
        Object LPAREN561_tree=null;
        Object RPAREN562_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(366, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:2: ( RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !| rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:4: RFC822NAME_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(367,18);
                    RFC822NAME_TOK554=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME_TOK554_tree = 
                    (Object)adaptor.create(RFC822NAME_TOK554)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK554_tree, root_0);
                    }
                    dbg.location(367,26);
                    LPAREN555=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3321); if (state.failed) return retval;
                    dbg.location(367,28);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr3324);
                    stringExpr556=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr556.getTree());
                    dbg.location(367,45);
                    RPAREN557=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3326); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:368:4: rfc822NameBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(368,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr3332);
                    rfc822NameBag558=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag558.getTree());
                    dbg.location(368,18);
                    char_literal559=(Token)match(input,84,FOLLOW_84_in_rfc822NameExpr3334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal559_tree = 
                    (Object)adaptor.create(char_literal559)
                    ;
                    adaptor.addChild(root_0, char_literal559_tree);
                    }
                    dbg.location(368,36);
                    ONEANDONLY_TOK560=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK560_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK560)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK560_tree, root_0);
                    }
                    dbg.location(368,44);
                    LPAREN561=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rfc822NameExpr3339); if (state.failed) return retval;
                    dbg.location(368,52);
                    RPAREN562=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rfc822NameExpr3342); if (state.failed) return retval;

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
        dbg.location(370, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:371:1: rfc822NameBag returns [SomeType o] : RFC822NAME_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RFC822NAME_TOK563=null;
        Token STRING_CONSTANT_LIST564=null;

        Object RFC822NAME_TOK563_tree=null;
        Object STRING_CONSTANT_LIST564_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(371, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:372:2: ( RFC822NAME_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:372:4: RFC822NAME_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(372,18);
            RFC822NAME_TOK563=(Token)match(input,RFC822NAME_TOK,FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RFC822NAME_TOK563_tree = 
            (Object)adaptor.create(RFC822NAME_TOK563)
            ;
            root_0 = (Object)adaptor.becomeRoot(RFC822NAME_TOK563_tree, root_0);
            }
            dbg.location(372,20);
            STRING_CONSTANT_LIST564=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST564_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST564)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST564_tree);
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
        dbg.location(375, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:377:1: hexBinaryExpr returns [SomeType o] : ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !);
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK565=null;
        Token LPAREN566=null;
        Token RPAREN568=null;
        Token char_literal570=null;
        Token ONEANDONLY_TOK571=null;
        Token LPAREN572=null;
        Token RPAREN573=null;
        GrammarParser.stringExpr_return stringExpr567 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag569 =null;


        Object HEXBINARY_TOK565_tree=null;
        Object LPAREN566_tree=null;
        Object RPAREN568_tree=null;
        Object char_literal570_tree=null;
        Object ONEANDONLY_TOK571_tree=null;
        Object LPAREN572_tree=null;
        Object RPAREN573_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:378:2: ( HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !| hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !)
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:378:4: HEXBINARY_TOK ^ LPAREN ! stringExpr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(378,17);
                    HEXBINARY_TOK565=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY_TOK565_tree = 
                    (Object)adaptor.create(HEXBINARY_TOK565)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK565_tree, root_0);
                    }
                    dbg.location(378,25);
                    LPAREN566=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3381); if (state.failed) return retval;
                    dbg.location(378,27);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr3384);
                    stringExpr567=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr567.getTree());
                    dbg.location(378,44);
                    RPAREN568=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3386); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:379:4: hexBinaryBag '.' ONEANDONLY_TOK ^ LPAREN ! RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(379,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr3392);
                    hexBinaryBag569=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag569.getTree());
                    dbg.location(379,17);
                    char_literal570=(Token)match(input,84,FOLLOW_84_in_hexBinaryExpr3394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal570_tree = 
                    (Object)adaptor.create(char_literal570)
                    ;
                    adaptor.addChild(root_0, char_literal570_tree);
                    }
                    dbg.location(379,35);
                    ONEANDONLY_TOK571=(Token)match(input,ONEANDONLY_TOK,FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY_TOK571_tree = 
                    (Object)adaptor.create(ONEANDONLY_TOK571)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ONEANDONLY_TOK571_tree, root_0);
                    }
                    dbg.location(379,43);
                    LPAREN572=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hexBinaryExpr3399); if (state.failed) return retval;
                    dbg.location(379,51);
                    RPAREN573=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hexBinaryExpr3402); if (state.failed) return retval;

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
        dbg.location(380, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:381:1: hexBinaryBag returns [SomeType o] : HEXBINARY_TOK ^ STRING_CONSTANT_LIST ;
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HEXBINARY_TOK574=null;
        Token STRING_CONSTANT_LIST575=null;

        Object HEXBINARY_TOK574_tree=null;
        Object STRING_CONSTANT_LIST575_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:382:2: ( HEXBINARY_TOK ^ STRING_CONSTANT_LIST )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:382:4: HEXBINARY_TOK ^ STRING_CONSTANT_LIST
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(382,17);
            HEXBINARY_TOK574=(Token)match(input,HEXBINARY_TOK,FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEXBINARY_TOK574_tree = 
            (Object)adaptor.create(HEXBINARY_TOK574)
            ;
            root_0 = (Object)adaptor.becomeRoot(HEXBINARY_TOK574_tree, root_0);
            }
            dbg.location(382,19);
            STRING_CONSTANT_LIST575=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_CONSTANT_LIST575_tree = 
            (Object)adaptor.create(STRING_CONSTANT_LIST575)
            ;
            adaptor.addChild(root_0, STRING_CONSTANT_LIST575_tree);
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
        dbg.location(385, 1);

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
        public SomeType o;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:387:1: anyBag returns [SomeType o] : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GrammarParser.booleanBag_return booleanBag576 =null;

        GrammarParser.integerBag_return integerBag577 =null;

        GrammarParser.doubleBag_return doubleBag578 =null;

        GrammarParser.stringBag_return stringBag579 =null;

        GrammarParser.anyUriBag_return anyUriBag580 =null;

        GrammarParser.dateBag_return dateBag581 =null;

        GrammarParser.timeBag_return timeBag582 =null;

        GrammarParser.dateTimeBag_return dateTimeBag583 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag584 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag585 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag586 =null;

        GrammarParser.x500NameBag_return x500NameBag587 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag588 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag589 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:4: booleanBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag3437);
                    booleanBag576=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag576.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:17: integerBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag3441);
                    integerBag577=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag577.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:30: doubleBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag3445);
                    doubleBag578=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag578.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:42: stringBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag3449);
                    stringBag579=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag579.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:54: anyUriBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag3453);
                    anyUriBag580=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag580.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:66: dateBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(388,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag3457);
                    dateBag581=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag581.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:389:4: timeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(389,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag3462);
                    timeBag582=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag582.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:389:14: dateTimeBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(389,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag3466);
                    dateTimeBag583=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag583.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:389:28: base64BinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(389,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag3470);
                    base64BinaryBag584=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag584.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:389:46: dayTimeDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(389,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag3474);
                    dayTimeDurationBag585=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag585.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:390:4: yearMonthDurationBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(390,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag3479);
                    yearMonthDurationBag586=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag586.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:390:28: x500NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(390,28);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag3484);
                    x500NameBag587=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag587.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:391:4: rfc822NameBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(391,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag3489);
                    rfc822NameBag588=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag588.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:391:20: hexBinaryBag
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(391,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag3493);
                    hexBinaryBag589=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag589.getTree());

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
            dbg.exitRule(getGrammarFileName(), "anyBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anyBag"

    // $ANTLR start synpred1_Grammar
    public final void synpred1_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:6: base64BinaryExpr
        {
        dbg.location(173,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred1_Grammar1045);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:5: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:6: base64BinaryExpr
        {
        dbg.location(189,6);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred2_Grammar1308);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:5: booleanBag
        {
        dbg.location(223,5);
        pushFollow(FOLLOW_booleanBag_in_synpred3_Grammar1941);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:5: integerBag
        {
        dbg.location(224,5);
        pushFollow(FOLLOW_integerBag_in_synpred4_Grammar1977);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:5: doubleBag
        {
        dbg.location(225,5);
        pushFollow(FOLLOW_doubleBag_in_synpred5_Grammar2015);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:226:5: stringBag
        {
        dbg.location(226,5);
        pushFollow(FOLLOW_stringBag_in_synpred6_Grammar2053);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:227:5: dateBag
        {
        dbg.location(227,5);
        pushFollow(FOLLOW_dateBag_in_synpred7_Grammar2092);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:5: timeBag
        {
        dbg.location(228,5);
        pushFollow(FOLLOW_timeBag_in_synpred8_Grammar2131);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:5: dateTimeBag
        {
        dbg.location(229,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred9_Grammar2170);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:5: base64BinaryBag
        {
        dbg.location(230,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred10_Grammar2209);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:5: dayTimeDurationBag
        {
        dbg.location(231,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2247);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:5: yearMonthDurationBag
        {
        dbg.location(232,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2285);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:5: anyUriBag
        {
        dbg.location(233,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred13_Grammar2324);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:5: x500NameBag
        {
        dbg.location(234,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred14_Grammar2363);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:5: rfc822NameBag
        {
        dbg.location(235,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred15_Grammar2402);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:5: hexBinaryBag
        {
        dbg.location(236,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred16_Grammar2440);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:5: base64BinaryBag
        {
        dbg.location(237,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred17_Grammar2479);
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
            return "134:1: booleanExpr returns [SomeType o] : ( TRUE_TOK ^| FALSE_TOK ^| BOOLEAN_TOK ^ LPAREN ! attributeExpr RPAREN !| ( NOF_TOK ^| NOT_TOK ^) LPAREN ! booleanExpr RPAREN !| LPAREN ! conditionalOrExpr RPAREN !| equalityExpr | isInOp | containsOp | stringExpr '.' ( NODEEQUAL_TOK ^| NODEMATCH_TOK ^) LPAREN ! stringExpr RPAREN !);";
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
            return "160:1: isInOp returns [SomeType o] : ( doubleExpr '.' ISIN_TOK ^ LPAREN ! doubleBag RPAREN !| stringExpr '.' ISIN_TOK ^ LPAREN ! stringBag RPAREN !| anyUriExpr '.' ISIN_TOK ^ LPAREN ! anyUriBag RPAREN !| dateExpr '.' ISIN_TOK ^ LPAREN ! dateBag RPAREN !| timeExpr '.' ISIN_TOK ^ LPAREN ! timeBag RPAREN !| dateTimeExpr '.' ISIN_TOK ^ LPAREN ! dateTimeBag RPAREN !| base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !| dayTimeDurationExpr '.' ISIN_TOK ^ LPAREN ! dayTimeDurationBag RPAREN !| yearMonthDurationExpr '.' ISIN_TOK ^ LPAREN ! yearMonthDurationBag RPAREN !| x500NameExpr '.' ISIN_TOK ^ LPAREN ! x500NameBag RPAREN !| rfc822NameExpr '.' ISIN_TOK ^ LPAREN ! rfc822NameBag RPAREN !| hexBinaryExpr '.' ISIN_TOK ^ LPAREN ! hexBinaryBag RPAREN !| ( base64BinaryExpr )=> base64BinaryExpr '.' ISIN_TOK ^ LPAREN ! base64BinaryBag RPAREN !);";
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
            return "176:1: containsOp returns [SomeType o] : ( doubleBag '.' CONTAINS_TOK ^ LPAREN ! doubleExpr RPAREN !| stringBag '.' CONTAINS_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriBag '.' CONTAINS_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateBag '.' CONTAINS_TOK ^ LPAREN ! dateExpr RPAREN !| timeBag '.' CONTAINS_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeBag '.' CONTAINS_TOK ^ LPAREN ! dateTimeExpr RPAREN !| base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !| dayTimeDurationBag '.' CONTAINS_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationBag '.' CONTAINS_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameBag '.' CONTAINS_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameBag '.' CONTAINS_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| hexBinaryBag '.' CONTAINS_TOK ^ LPAREN ! hexBinaryExpr RPAREN !| ( base64BinaryExpr )=> base64BinaryBag '.' CONTAINS_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
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
            return "192:1: equalityExpr returns [SomeType o] : ( integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ integerExpr | doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ doubleExpr | stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ stringExpr | anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ anyUriExpr | dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateExpr | timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ timeExpr | dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dateTimeExpr | yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ yearMonthDurationExpr | x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ x500NameExpr | rfc822NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ rfc822NameExpr | dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ dayTimeDurationExpr | base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) ^ base64BinaryExpr );";
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
            return "207:1: regexOp returns [SomeType o] : ( integerExpr '.' REGEXMATCH_TOK ^ LPAREN ! integerExpr RPAREN !| doubleExpr '.' REGEXMATCH_TOK ^ LPAREN ! doubleExpr RPAREN !| stringExpr '.' REGEXMATCH_TOK ^ LPAREN ! stringExpr RPAREN !| anyUriExpr '.' REGEXMATCH_TOK ^ LPAREN ! anyUriExpr RPAREN !| dateExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateExpr RPAREN !| timeExpr '.' REGEXMATCH_TOK ^ LPAREN ! timeExpr RPAREN !| dateTimeExpr '.' REGEXMATCH_TOK ^ LPAREN ! dateTimeExpr RPAREN !| dayTimeDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! dayTimeDurationExpr RPAREN !| yearMonthDurationExpr '.' REGEXMATCH_TOK ^ LPAREN ! yearMonthDurationExpr RPAREN !| x500NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! x500NameExpr RPAREN !| rfc822NameExpr '.' REGEXMATCH_TOK ^ LPAREN ! rfc822NameExpr RPAREN !| base64BinaryExpr '.' REGEXMATCH_TOK ^ LPAREN ! base64BinaryExpr RPAREN !);";
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
            return "240:1: integerExpr returns [SomeType o] : ( INTEGER_CONSTANT ^| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) ^ LPAREN ! RPAREN !| anyBag '.' SIZE_TOK ^ LPAREN ! RPAREN !);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_xacmlFile465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_policySet_in_xacmlFile469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_xacmlFile472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_TOK_in_policy487 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy491 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy495 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policy497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_in_policy501 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policy503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICYSET_TOK_in_policySet520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policySet523 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policySet525 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_policySet527 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_target_in_policySet530 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_policy_in_policySet533 = new BitSet(new long[]{0x0200000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_policySet536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_TOK_in_target555 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_target558 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_target561 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_APPLICABLE_TOK_in_target564 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_target566 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_target568 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_target570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOK_in_rule588 = new BitSet(new long[]{0x0000000000000200L,0x0000000004000000L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule591 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_rule594 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_set_in_rule597 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IF_TOK_in_rule605 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_rule607 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_rule609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_TOK_in_booleanExpr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_TOK_in_booleanExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanExpr640 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr643 = new BitSet(new long[]{0x2000000040000020L,0x0000000000000080L});
    public static final BitSet FOLLOW_attributeExpr_in_booleanExpr646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOF_TOK_in_booleanExpr656 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOT_TOK_in_booleanExpr661 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr665 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanExpr668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr676 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_booleanExpr679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_booleanExpr703 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_NODEEQUAL_TOK_in_booleanExpr707 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NODEMATCH_TOK_in_booleanExpr712 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_booleanExpr717 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_booleanExpr720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_booleanExpr722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_TOK_in_booleanBag739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr761 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_conditionalOrExpr764 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr766 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_conditionalAndExpr793 = new BitSet(new long[]{0x601208CA71C72020L,0x0000000000030CD0L});
    public static final BitSet FOLLOW_booleanExpr_in_conditionalAndExpr795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp818 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp820 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp823 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp837 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp839 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp842 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_isInOp845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp856 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp858 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp875 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp877 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp880 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp894 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp896 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_isInOp902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp913 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp915 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp918 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp932 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp934 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp937 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp951 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp953 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp956 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp970 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp972 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp989 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp991 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp1008 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1010 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1013 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp1027 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1029 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1032 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_isInOp1052 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ISIN_TOK_in_isInOp1054 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_isInOp1057 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_isInOp1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1081 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1083 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1086 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1100 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1102 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1105 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1119 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1121 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1124 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1140 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_containsOp1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1157 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1159 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1176 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1178 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1181 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1197 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1200 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1214 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1216 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1219 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1233 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1235 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1252 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1254 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1271 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1273 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1276 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1290 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1292 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1295 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_containsOp1315 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CONTAINS_TOK_in_containsOp1317 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_containsOp1320 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_containsOp1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1343 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1373 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1403 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1433 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1463 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1523 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1613 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_set_in_equalityExpr1674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1716 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1718 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1721 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1734 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1736 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1739 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1752 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1754 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1757 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp1760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1770 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1772 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1775 = new BitSet(new long[]{0x2000000040002020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1788 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1790 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1793 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1806 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1808 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1824 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1826 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1829 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1842 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1844 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1847 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1860 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1862 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1878 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1880 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1896 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1901 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_regexOp1914 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGEXMATCH_TOK_in_regexOp1916 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regexOp1919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_regexOp1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1948 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1950 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp1965 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp1984 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp1986 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2002 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp2006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2022 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2024 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2040 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2061 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2063 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2079 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000C0L});
    public static final BitSet FOLLOW_stringBag_in_bagOp2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2100 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2102 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2118 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp2122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2139 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2141 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_timeBag_in_bagOp2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2178 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2180 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2196 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2217 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2219 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2234 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2255 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2257 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2272 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2293 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2295 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2332 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2334 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2350 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2371 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2373 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2410 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2412 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2427 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2448 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2450 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2466 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bagOp2486 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000104L});
    public static final BitSet FOLLOW_set_in_bagOp2488 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_bagOp2504 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_bagOp2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_integerExpr2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2534 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_set_in_integerExpr2536 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr2557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerExpr2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SIZE_TOK_in_integerExpr2561 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerExpr2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerExpr2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_TOK_in_integerBag2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_integerBag2588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_BAG_TOK_in_integerBag2592 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2595 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_integerBag2602 = new BitSet(new long[]{0x600000C861C72020L,0x00000000000304D0L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag2605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_integerBag2614 = new BitSet(new long[]{0x0000010000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_integerBag2616 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_integerBag2627 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag2630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_integerBag2632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleExpr2656 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_doubleExpr2659 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_doubleExpr2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TOK_in_doubleBag2681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr2702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2711 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_stringExpr2713 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_stringExpr2726 = new BitSet(new long[]{0x100C000000000000L});
    public static final BitSet FOLLOW_set_in_stringExpr2728 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_stringExpr2741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_stringExpr2744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_STRING_TOK_in_stringBag2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeExpr_in_stringBag2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeExpr2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attributeExpr2806 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeExpr2808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriExpr2826 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2829 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2842 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_anyUriExpr2844 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_anyUriExpr2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_URI_TOK_in_anyUriExpr2860 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_anyUriExpr2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_anyUriExpr2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_TOK_in_anyUriBag2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateExpr2903 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2906 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr2917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateExpr2919 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateExpr2921 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateExpr2924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateExpr2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TOK_in_dateBag2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeExpr2962 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2965 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timeExpr2978 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_timeExpr2980 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timeExpr2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_timeExpr2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_TOK_in_timeBag3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeExpr3020 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr3023 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dateTimeExpr3036 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dateTimeExpr3038 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dateTimeExpr3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dateTimeExpr3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_TOK_in_dateTimeBag3059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryExpr3079 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr3082 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr3085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_base64BinaryExpr3095 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_base64BinaryExpr3097 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_base64BinaryExpr3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_base64BinaryExpr3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_TOK_in_base64BinaryBag3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationExpr3139 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3142 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr3153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dayTimeDurationExpr3156 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_dayTimeDurationExpr3158 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_dayTimeDurationExpr3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_dayTimeDurationExpr3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_TOK_in_dayTimeDurationBag3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationExpr3198 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3201 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_yearMonthDurationExpr3214 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_yearMonthDurationExpr3216 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_yearMonthDurationExpr3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_yearMonthDurationExpr3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_TOK_in_yearMonthDurationBag3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameExpr3257 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3260 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr3271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_x500NameExpr3274 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_x500NameExpr3276 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_x500NameExpr3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_x500NameExpr3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_TOK_in_x500NameBag3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameExpr3318 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3321 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rfc822NameExpr3334 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_rfc822NameExpr3336 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rfc822NameExpr3339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_rfc822NameExpr3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_TOK_in_rfc822NameBag3358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryExpr3378 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3381 = new BitSet(new long[]{0x2000000040000020L,0x00000000000000D0L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_hexBinaryExpr3394 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_TOK_in_hexBinaryExpr3396 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPAREN_in_hexBinaryExpr3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_hexBinaryExpr3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_TOK_in_hexBinaryBag3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred1_Grammar1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred2_Grammar1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred3_Grammar1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred4_Grammar1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred5_Grammar2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred6_Grammar2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred7_Grammar2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred8_Grammar2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred9_Grammar2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred10_Grammar2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred11_Grammar2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred12_Grammar2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred13_Grammar2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred14_Grammar2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred15_Grammar2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred16_Grammar2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred17_Grammar2479 = new BitSet(new long[]{0x0000000000000002L});

}