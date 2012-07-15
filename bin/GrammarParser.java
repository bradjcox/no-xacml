// $ANTLR 3.4 /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g 2012-07-15 10:21:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "ACTION", "ALLOF", "ALLOFALL", "ALLOFANY", "AND", "ANYCASEIDENTIFIER", "ANYOF", "ANYOFALL", "ANYOFANY", "ANYURI", "ATLEASTONEMENBEROF", "BAG", "BASE64BINARY", "BOOLEAN", "COMMENT", "CONCATENATE", "CONDITION", "CONTAINS", "DATE", "DATETIME", "DAYTIMEDURATION", "DECIMAL", "DENY", "DEREF", "DOT", "DOUBLE", "DOUBLE_CONSTANT", "ENVIRONMENT", "EQ", "ESC_SEQ", "EXPONENT", "FALSE", "FLR", "GE", "GT", "HEXBINARY", "HEX_DIGIT", "IF", "INTEGER", "INTEGER_CONSTANT", "INTERSECTION", "ISIN", "LB", "LE", "LOWERCASEIDENTIFIER", "LP", "LT", "MAP", "MATCHES", "NODECOUNT", "NODEEQUAL", "NODEMATCH", "NOF", "NORMALIZESPACE", "NORMALIZETOLOWERCASE", "NOT", "OCTAL_ESC", "ONEANDONLY", "OR", "PERMIT", "POLICY", "POLICYSET", "RANGEOP", "RB", "REGEXMATCH", "REQUIRED", "RESOURCE", "RFC822NAME", "RND", "RP", "RULE", "SETEQUALS", "SIZE", "STRING", "STRING_CONSTANT", "STRING_CONSTANT_LIST", "STRING_LIST", "SUBJECT", "SUBSET", "TARGET", "TIME", "TRUE", "UNICODE_ESC", "UNION", "URI", "WHITESPACE", "X500NAME", "YEARMONTHDURATION", "','"
    };

    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int ABS=4;
    public static final int ACTION=5;
    public static final int ALLOF=6;
    public static final int ALLOFALL=7;
    public static final int ALLOFANY=8;
    public static final int AND=9;
    public static final int ANYCASEIDENTIFIER=10;
    public static final int ANYOF=11;
    public static final int ANYOFALL=12;
    public static final int ANYOFANY=13;
    public static final int ANYURI=14;
    public static final int ATLEASTONEMENBEROF=15;
    public static final int BAG=16;
    public static final int BASE64BINARY=17;
    public static final int BOOLEAN=18;
    public static final int COMMENT=19;
    public static final int CONCATENATE=20;
    public static final int CONDITION=21;
    public static final int CONTAINS=22;
    public static final int DATE=23;
    public static final int DATETIME=24;
    public static final int DAYTIMEDURATION=25;
    public static final int DECIMAL=26;
    public static final int DENY=27;
    public static final int DEREF=28;
    public static final int DOT=29;
    public static final int DOUBLE=30;
    public static final int DOUBLE_CONSTANT=31;
    public static final int ENVIRONMENT=32;
    public static final int EQ=33;
    public static final int ESC_SEQ=34;
    public static final int EXPONENT=35;
    public static final int FALSE=36;
    public static final int FLR=37;
    public static final int GE=38;
    public static final int GT=39;
    public static final int HEXBINARY=40;
    public static final int HEX_DIGIT=41;
    public static final int IF=42;
    public static final int INTEGER=43;
    public static final int INTEGER_CONSTANT=44;
    public static final int INTERSECTION=45;
    public static final int ISIN=46;
    public static final int LB=47;
    public static final int LE=48;
    public static final int LOWERCASEIDENTIFIER=49;
    public static final int LP=50;
    public static final int LT=51;
    public static final int MAP=52;
    public static final int MATCHES=53;
    public static final int NODECOUNT=54;
    public static final int NODEEQUAL=55;
    public static final int NODEMATCH=56;
    public static final int NOF=57;
    public static final int NORMALIZESPACE=58;
    public static final int NORMALIZETOLOWERCASE=59;
    public static final int NOT=60;
    public static final int OCTAL_ESC=61;
    public static final int ONEANDONLY=62;
    public static final int OR=63;
    public static final int PERMIT=64;
    public static final int POLICY=65;
    public static final int POLICYSET=66;
    public static final int RANGEOP=67;
    public static final int RB=68;
    public static final int REGEXMATCH=69;
    public static final int REQUIRED=70;
    public static final int RESOURCE=71;
    public static final int RFC822NAME=72;
    public static final int RND=73;
    public static final int RP=74;
    public static final int RULE=75;
    public static final int SETEQUALS=76;
    public static final int SIZE=77;
    public static final int STRING=78;
    public static final int STRING_CONSTANT=79;
    public static final int STRING_CONSTANT_LIST=80;
    public static final int STRING_LIST=81;
    public static final int SUBJECT=82;
    public static final int SUBSET=83;
    public static final int TARGET=84;
    public static final int TIME=85;
    public static final int TRUE=86;
    public static final int UNICODE_ESC=87;
    public static final int UNION=88;
    public static final int URI=89;
    public static final int WHITESPACE=90;
    public static final int X500NAME=91;
    public static final int YEARMONTHDURATION=92;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "booleanAndExpr", "dateTimeExpr", "synpred5_Grammar", 
    "synpred3_Grammar", "containsOp", "doubleBag", "synpred20_Grammar", 
    "synpred18_Grammar", "timeBag", "booleanBag", "dateBag", "synpred6_Grammar", 
    "synpred7_Grammar", "integerExpr", "timeExpr", "synpred13_Grammar", 
    "synpred17_Grammar", "matchExpr", "booleanExpr", "regexOp", "condition", 
    "stringBag", "booleanWrap", "rfc822NameExpr", "policy", "matchAndExpr", 
    "yearMonthDurationBag", "bagOp", "matchOrExpr", "dateTimeBag", "base64BinaryExpr", 
    "synpred1_Grammar", "anyBag", "hexBinaryBag", "x500NameExpr", "synpred19_Grammar", 
    "integerBag", "yearMonthDurationExpr", "synpred10_Grammar", "attributeSelector", 
    "anyUriBag", "rule", "synpred14_Grammar", "synpred16_Grammar", "booleanNof", 
    "synpred2_Grammar", "booleanCreate", "rfc822NameBag", "x500NameBag", 
    "xacmlFile", "booleanNode", "synpred8_Grammar", "synpred11_Grammar", 
    "hexBinaryExpr", "doubleExpr", "anyUriExpr", "target", "isInOp", "booleanOrExpr", 
    "synpred15_Grammar", "synpred12_Grammar", "equalityExpr", "dayTimeDurationExpr", 
    "stringExpr", "dateExpr", "base64BinaryBag", "dayTimeDurationBag", "synpred9_Grammar", 
    "synpred4_Grammar", "policySet"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, true, false, true, false, false, true, true, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, true, true, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xacmlFile"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:111:1: xacmlFile : ( policy | policySet ) EOF !;
    public final GrammarParser.xacmlFile_return xacmlFile() throws RecognitionException {
        GrammarParser.xacmlFile_return retval = new GrammarParser.xacmlFile_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        GrammarParser.policy_return policy1 =null;

        GrammarParser.policySet_return policySet2 =null;


        CommonTree EOF3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "xacmlFile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:2: ( ( policy | policySet ) EOF !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:4: ( policy | policySet ) EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(112,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:4: ( policy | policySet )
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==POLICY) ) {
                alt1=1;
            }
            else if ( (LA1_0==POLICYSET) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:5: policy
                    {
                    dbg.location(112,5);
                    pushFollow(FOLLOW_policy_in_xacmlFile561);
                    policy1=policy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policy1.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:112:14: policySet
                    {
                    dbg.location(112,14);
                    pushFollow(FOLLOW_policySet_in_xacmlFile565);
                    policySet2=policySet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, policySet2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(112,28);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_xacmlFile568); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(113, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policy"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:115:1: policy : POLICY ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( rule )? RB !;
    public final GrammarParser.policy_return policy() throws RecognitionException {
        GrammarParser.policy_return retval = new GrammarParser.policy_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POLICY4=null;
        Token ANYCASEIDENTIFIER5=null;
        Token LOWERCASEIDENTIFIER6=null;
        Token LB7=null;
        Token RB10=null;
        GrammarParser.target_return target8 =null;

        GrammarParser.rule_return rule9 =null;


        CommonTree POLICY4_tree=null;
        CommonTree ANYCASEIDENTIFIER5_tree=null;
        CommonTree LOWERCASEIDENTIFIER6_tree=null;
        CommonTree LB7_tree=null;
        CommonTree RB10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policy");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:2: ( POLICY ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( rule )? RB !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:4: POLICY ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( rule )? RB !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(116,10);
            POLICY4=(Token)match(input,POLICY,FOLLOW_POLICY_in_policy580); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICY4_tree = 
            (CommonTree)adaptor.create(POLICY4)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POLICY4_tree, root_0);
            }
            dbg.location(116,12);
            ANYCASEIDENTIFIER5=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policy583); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER5_tree = 
            (CommonTree)adaptor.create(ANYCASEIDENTIFIER5)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER5_tree);
            }
            dbg.location(116,30);
            LOWERCASEIDENTIFIER6=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policy585); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER6_tree = 
            (CommonTree)adaptor.create(LOWERCASEIDENTIFIER6)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER6_tree);
            }
            dbg.location(116,52);
            LB7=(Token)match(input,LB,FOLLOW_LB_in_policy587); if (state.failed) return retval;
            dbg.location(116,54);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:54: ( target )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==TARGET) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:54: target
                    {
                    dbg.location(116,54);
                    pushFollow(FOLLOW_target_in_policy590);
                    target8=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(116,62);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:62: ( rule )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:116:62: rule
                    {
                    dbg.location(116,62);
                    pushFollow(FOLLOW_rule_in_policy593);
                    rule9=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule9.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(116,70);
            RB10=(Token)match(input,RB,FOLLOW_RB_in_policy596); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(117, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "policySet"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:119:1: policySet : POLICYSET ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( policy )* RB !;
    public final GrammarParser.policySet_return policySet() throws RecognitionException {
        GrammarParser.policySet_return retval = new GrammarParser.policySet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POLICYSET11=null;
        Token ANYCASEIDENTIFIER12=null;
        Token LOWERCASEIDENTIFIER13=null;
        Token LB14=null;
        Token RB17=null;
        GrammarParser.target_return target15 =null;

        GrammarParser.policy_return policy16 =null;


        CommonTree POLICYSET11_tree=null;
        CommonTree ANYCASEIDENTIFIER12_tree=null;
        CommonTree LOWERCASEIDENTIFIER13_tree=null;
        CommonTree LB14_tree=null;
        CommonTree RB17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "policySet");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:2: ( POLICYSET ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( policy )* RB !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:4: POLICYSET ^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB ! ( target )? ( policy )* RB !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(120,13);
            POLICYSET11=(Token)match(input,POLICYSET,FOLLOW_POLICYSET_in_policySet608); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POLICYSET11_tree = 
            (CommonTree)adaptor.create(POLICYSET11)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POLICYSET11_tree, root_0);
            }
            dbg.location(120,15);
            ANYCASEIDENTIFIER12=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_policySet611); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER12_tree = 
            (CommonTree)adaptor.create(ANYCASEIDENTIFIER12)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER12_tree);
            }
            dbg.location(120,33);
            LOWERCASEIDENTIFIER13=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_policySet613); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER13_tree = 
            (CommonTree)adaptor.create(LOWERCASEIDENTIFIER13)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER13_tree);
            }
            dbg.location(120,55);
            LB14=(Token)match(input,LB,FOLLOW_LB_in_policySet615); if (state.failed) return retval;
            dbg.location(120,57);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:57: ( target )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==TARGET) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:57: target
                    {
                    dbg.location(120,57);
                    pushFollow(FOLLOW_target_in_policySet618);
                    target15=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(120,65);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:65: ( policy )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==POLICY) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:120:65: policy
            	    {
            	    dbg.location(120,65);
            	    pushFollow(FOLLOW_policy_in_policySet621);
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

            dbg.location(120,75);
            RB17=(Token)match(input,RB,FOLLOW_RB_in_policySet624); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(121, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "target"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:123:1: target : TARGET ^ LB ! matchOrExpr RB !;
    public final GrammarParser.target_return target() throws RecognitionException {
        GrammarParser.target_return retval = new GrammarParser.target_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TARGET18=null;
        Token LB19=null;
        Token RB21=null;
        GrammarParser.matchOrExpr_return matchOrExpr20 =null;


        CommonTree TARGET18_tree=null;
        CommonTree LB19_tree=null;
        CommonTree RB21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:2: ( TARGET ^ LB ! matchOrExpr RB !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:124:4: TARGET ^ LB ! matchOrExpr RB !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(124,10);
            TARGET18=(Token)match(input,TARGET,FOLLOW_TARGET_in_target636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TARGET18_tree = 
            (CommonTree)adaptor.create(TARGET18)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TARGET18_tree, root_0);
            }
            dbg.location(124,14);
            LB19=(Token)match(input,LB,FOLLOW_LB_in_target639); if (state.failed) return retval;
            dbg.location(124,16);
            pushFollow(FOLLOW_matchOrExpr_in_target642);
            matchOrExpr20=matchOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, matchOrExpr20.getTree());
            dbg.location(124,30);
            RB21=(Token)match(input,RB,FOLLOW_RB_in_target644); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(125, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:127:1: matchOrExpr : matchAndExpr ( OR ^ matchAndExpr )* ;
    public final GrammarParser.matchOrExpr_return matchOrExpr() throws RecognitionException {
        GrammarParser.matchOrExpr_return retval = new GrammarParser.matchOrExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR23=null;
        GrammarParser.matchAndExpr_return matchAndExpr22 =null;

        GrammarParser.matchAndExpr_return matchAndExpr24 =null;


        CommonTree OR23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:3: ( matchAndExpr ( OR ^ matchAndExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:5: matchAndExpr ( OR ^ matchAndExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(128,5);
            pushFollow(FOLLOW_matchAndExpr_in_matchOrExpr657);
            matchAndExpr22=matchAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, matchAndExpr22.getTree());
            dbg.location(128,18);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:18: ( OR ^ matchAndExpr )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==OR) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:128:19: OR ^ matchAndExpr
            	    {
            	    dbg.location(128,21);
            	    OR23=(Token)match(input,OR,FOLLOW_OR_in_matchOrExpr660); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR23_tree = 
            	    (CommonTree)adaptor.create(OR23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR23_tree, root_0);
            	    }
            	    dbg.location(128,23);
            	    pushFollow(FOLLOW_matchAndExpr_in_matchOrExpr663);
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(129, 2);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchAndExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:131:1: matchAndExpr : matchExpr ( AND ^ matchExpr )* ;
    public final GrammarParser.matchAndExpr_return matchAndExpr() throws RecognitionException {
        GrammarParser.matchAndExpr_return retval = new GrammarParser.matchAndExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND26=null;
        GrammarParser.matchExpr_return matchExpr25 =null;

        GrammarParser.matchExpr_return matchExpr27 =null;


        CommonTree AND26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:3: ( matchExpr ( AND ^ matchExpr )* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:5: matchExpr ( AND ^ matchExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(132,5);
            pushFollow(FOLLOW_matchExpr_in_matchAndExpr679);
            matchExpr25=matchExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, matchExpr25.getTree());
            dbg.location(132,15);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:15: ( AND ^ matchExpr )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:132:16: AND ^ matchExpr
            	    {
            	    dbg.location(132,19);
            	    AND26=(Token)match(input,AND,FOLLOW_AND_in_matchAndExpr682); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND26_tree = 
            	    (CommonTree)adaptor.create(AND26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND26_tree, root_0);
            	    }
            	    dbg.location(132,21);
            	    pushFollow(FOLLOW_matchExpr_in_matchAndExpr685);
            	    matchExpr27=matchExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchExpr27.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(133, 2);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matchExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:135:1: matchExpr : ( attributeSelector DOT ! MATCHES ^ '(' ! stringExpr ')' !| '(' ! matchOrExpr ')' !);
    public final GrammarParser.matchExpr_return matchExpr() throws RecognitionException {
        GrammarParser.matchExpr_return retval = new GrammarParser.matchExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT29=null;
        Token MATCHES30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        GrammarParser.attributeSelector_return attributeSelector28 =null;

        GrammarParser.stringExpr_return stringExpr32 =null;

        GrammarParser.matchOrExpr_return matchOrExpr35 =null;


        CommonTree DOT29_tree=null;
        CommonTree MATCHES30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:136:2: ( attributeSelector DOT ! MATCHES ^ '(' ! stringExpr ')' !| '(' ! matchOrExpr ')' !)
            int alt8=2;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ACTION||LA8_0==ENVIRONMENT||LA8_0==RESOURCE||LA8_0==SUBJECT) ) {
                alt8=1;
            }
            else if ( (LA8_0==LP) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:136:4: attributeSelector DOT ! MATCHES ^ '(' ! stringExpr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(136,4);
                    pushFollow(FOLLOW_attributeSelector_in_matchExpr699);
                    attributeSelector28=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector28.getTree());
                    dbg.location(136,25);
                    DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_matchExpr701); if (state.failed) return retval;
                    dbg.location(136,34);
                    MATCHES30=(Token)match(input,MATCHES,FOLLOW_MATCHES_in_matchExpr704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MATCHES30_tree = 
                    (CommonTree)adaptor.create(MATCHES30)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(MATCHES30_tree, root_0);
                    }
                    dbg.location(136,39);
                    char_literal31=(Token)match(input,LP,FOLLOW_LP_in_matchExpr707); if (state.failed) return retval;
                    dbg.location(136,41);
                    pushFollow(FOLLOW_stringExpr_in_matchExpr710);
                    stringExpr32=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr32.getTree());
                    dbg.location(136,55);
                    char_literal33=(Token)match(input,RP,FOLLOW_RP_in_matchExpr712); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:137:4: '(' ! matchOrExpr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(137,7);
                    char_literal34=(Token)match(input,LP,FOLLOW_LP_in_matchExpr718); if (state.failed) return retval;
                    dbg.location(137,9);
                    pushFollow(FOLLOW_matchOrExpr_in_matchExpr721);
                    matchOrExpr35=matchOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, matchOrExpr35.getTree());
                    dbg.location(137,24);
                    char_literal36=(Token)match(input,RP,FOLLOW_RP_in_matchExpr723); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(138, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeSelector"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:140:1: attributeSelector : ( SUBJECT | RESOURCE | ACTION | ENVIRONMENT ) ^ DOT ! LOWERCASEIDENTIFIER ;
    public final GrammarParser.attributeSelector_return attributeSelector() throws RecognitionException {
        GrammarParser.attributeSelector_return retval = new GrammarParser.attributeSelector_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set37=null;
        Token DOT38=null;
        Token LOWERCASEIDENTIFIER39=null;

        CommonTree set37_tree=null;
        CommonTree DOT38_tree=null;
        CommonTree LOWERCASEIDENTIFIER39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attributeSelector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:2: ( ( SUBJECT | RESOURCE | ACTION | ENVIRONMENT ) ^ DOT ! LOWERCASEIDENTIFIER )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:141:4: ( SUBJECT | RESOURCE | ACTION | ENVIRONMENT ) ^ DOT ! LOWERCASEIDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(141,48);
            set37=(Token)input.LT(1);

            set37=(Token)input.LT(1);

            if ( input.LA(1)==ACTION||input.LA(1)==ENVIRONMENT||input.LA(1)==RESOURCE||input.LA(1)==SUBJECT ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set37)
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

            dbg.location(141,53);
            DOT38=(Token)match(input,DOT,FOLLOW_DOT_in_attributeSelector753); if (state.failed) return retval;
            dbg.location(141,55);
            LOWERCASEIDENTIFIER39=(Token)match(input,LOWERCASEIDENTIFIER,FOLLOW_LOWERCASEIDENTIFIER_in_attributeSelector756); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOWERCASEIDENTIFIER39_tree = 
            (CommonTree)adaptor.create(LOWERCASEIDENTIFIER39)
            ;
            adaptor.addChild(root_0, LOWERCASEIDENTIFIER39_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(142, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:144:1: rule : RULE ^ ANYCASEIDENTIFIER ( PERMIT | DENY ) LB ! ( target )? ( condition )? RB !;
    public final GrammarParser.rule_return rule() throws RecognitionException {
        GrammarParser.rule_return retval = new GrammarParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RULE40=null;
        Token ANYCASEIDENTIFIER41=null;
        Token set42=null;
        Token LB43=null;
        Token RB46=null;
        GrammarParser.target_return target44 =null;

        GrammarParser.condition_return condition45 =null;


        CommonTree RULE40_tree=null;
        CommonTree ANYCASEIDENTIFIER41_tree=null;
        CommonTree set42_tree=null;
        CommonTree LB43_tree=null;
        CommonTree RB46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:2: ( RULE ^ ANYCASEIDENTIFIER ( PERMIT | DENY ) LB ! ( target )? ( condition )? RB !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:4: RULE ^ ANYCASEIDENTIFIER ( PERMIT | DENY ) LB ! ( target )? ( condition )? RB !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(145,8);
            RULE40=(Token)match(input,RULE,FOLLOW_RULE_in_rule767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RULE40_tree = 
            (CommonTree)adaptor.create(RULE40)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RULE40_tree, root_0);
            }
            dbg.location(145,10);
            ANYCASEIDENTIFIER41=(Token)match(input,ANYCASEIDENTIFIER,FOLLOW_ANYCASEIDENTIFIER_in_rule770); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANYCASEIDENTIFIER41_tree = 
            (CommonTree)adaptor.create(ANYCASEIDENTIFIER41)
            ;
            adaptor.addChild(root_0, ANYCASEIDENTIFIER41_tree);
            }
            dbg.location(145,28);
            set42=(Token)input.LT(1);

            if ( input.LA(1)==DENY||input.LA(1)==PERMIT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set42)
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

            dbg.location(145,46);
            LB43=(Token)match(input,LB,FOLLOW_LB_in_rule780); if (state.failed) return retval;
            dbg.location(145,48);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:48: ( target )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==TARGET) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:48: target
                    {
                    dbg.location(145,48);
                    pushFollow(FOLLOW_target_in_rule783);
                    target44=target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, target44.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(145,56);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:56: ( condition )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==CONDITION) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:145:56: condition
                    {
                    dbg.location(145,56);
                    pushFollow(FOLLOW_condition_in_rule786);
                    condition45=condition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition45.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(145,69);
            RB46=(Token)match(input,RB,FOLLOW_RB_in_rule789); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(146, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:148:1: condition : CONDITION LB booleanAndExpr RB -> ^( CONDITION BOOLEAN booleanAndExpr ) ;
    public final GrammarParser.condition_return condition() throws RecognitionException {
        GrammarParser.condition_return retval = new GrammarParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONDITION47=null;
        Token LB48=null;
        Token RB50=null;
        GrammarParser.booleanAndExpr_return booleanAndExpr49 =null;


        CommonTree CONDITION47_tree=null;
        CommonTree LB48_tree=null;
        CommonTree RB50_tree=null;
        RewriteRuleTokenStream stream_CONDITION=new RewriteRuleTokenStream(adaptor,"token CONDITION");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleSubtreeStream stream_booleanAndExpr=new RewriteRuleSubtreeStream(adaptor,"rule booleanAndExpr");
        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:2: ( CONDITION LB booleanAndExpr RB -> ^( CONDITION BOOLEAN booleanAndExpr ) )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:149:4: CONDITION LB booleanAndExpr RB
            {
            dbg.location(149,4);
            CONDITION47=(Token)match(input,CONDITION,FOLLOW_CONDITION_in_condition801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONDITION.add(CONDITION47);

            dbg.location(149,14);
            LB48=(Token)match(input,LB,FOLLOW_LB_in_condition803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LB.add(LB48);

            dbg.location(149,17);
            pushFollow(FOLLOW_booleanAndExpr_in_condition805);
            booleanAndExpr49=booleanAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanAndExpr.add(booleanAndExpr49.getTree());
            dbg.location(149,32);
            RB50=(Token)match(input,RB,FOLLOW_RB_in_condition807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RB.add(RB50);


            // AST REWRITE
            // elements: CONDITION, booleanAndExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:3: -> ^( CONDITION BOOLEAN booleanAndExpr )
            {
                dbg.location(150,6);
                // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:150:6: ^( CONDITION BOOLEAN booleanAndExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(150,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_CONDITION.nextNode()
                , root_1);

                dbg.location(150,18);
                adaptor.addChild(root_1, 
                (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                );
                dbg.location(150,26);
                adaptor.addChild(root_1, stream_booleanAndExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(151, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"


    public static class booleanAndExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanAndExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:153:1: booleanAndExpr : ( ( AND )=> (l= booleanOrExpr ( AND r+= booleanOrExpr )+ ) -> ^( AND BOOLEAN $l $r) |l= booleanOrExpr -> ^( AND BOOLEAN $l) );
    public final GrammarParser.booleanAndExpr_return booleanAndExpr() throws RecognitionException {
        GrammarParser.booleanAndExpr_return retval = new GrammarParser.booleanAndExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND51=null;
        List list_r=null;
        GrammarParser.booleanOrExpr_return l =null;

        RuleReturnScope r = null;
        CommonTree AND51_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_booleanOrExpr=new RewriteRuleSubtreeStream(adaptor,"rule booleanOrExpr");
        try { dbg.enterRule(getGrammarFileName(), "booleanAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:3: ( ( AND )=> (l= booleanOrExpr ( AND r+= booleanOrExpr )+ ) -> ^( AND BOOLEAN $l $r) |l= booleanOrExpr -> ^( AND BOOLEAN $l) )
            int alt12=2;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case TRUE:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case NOF:
            case NOT:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case LP:
                {
                int LA12_5 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING_CONSTANT:
                {
                int LA12_6 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA12_7 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER_CONSTANT:
                {
                int LA12_8 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER:
                {
                int LA12_9 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BAG:
                {
                int LA12_10 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ACTION:
            case ENVIRONMENT:
            case RESOURCE:
            case SUBJECT:
                {
                int LA12_11 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA12_12 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ANYURI:
                {
                int LA12_13 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DATE:
                {
                int LA12_14 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case TIME:
                {
                int LA12_15 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DATETIME:
                {
                int LA12_16 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 16, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BASE64BINARY:
                {
                int LA12_17 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 17, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DAYTIMEDURATION:
                {
                int LA12_18 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 18, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case YEARMONTHDURATION:
                {
                int LA12_19 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 19, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case X500NAME:
                {
                int LA12_20 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 20, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case RFC822NAME:
                {
                int LA12_21 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 21, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case HEXBINARY:
                {
                int LA12_22 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 22, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DOUBLE_CONSTANT:
                {
                int LA12_23 = input.LA(2);

                if ( (synpred1_Grammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 23, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:5: ( AND )=> (l= booleanOrExpr ( AND r+= booleanOrExpr )+ )
                    {
                    dbg.location(154,14);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:14: (l= booleanOrExpr ( AND r+= booleanOrExpr )+ )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:15: l= booleanOrExpr ( AND r+= booleanOrExpr )+
                    {
                    dbg.location(154,16);
                    pushFollow(FOLLOW_booleanOrExpr_in_booleanAndExpr840);
                    l=booleanOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanOrExpr.add(l.getTree());
                    dbg.location(154,31);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:31: ( AND r+= booleanOrExpr )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==AND) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:32: AND r+= booleanOrExpr
                    	    {
                    	    dbg.location(154,32);
                    	    AND51=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpr843); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(AND51);

                    	    dbg.location(154,37);
                    	    pushFollow(FOLLOW_booleanOrExpr_in_booleanAndExpr847);
                    	    r=booleanOrExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_booleanOrExpr.add(r.getTree());
                    	    if (list_r==null) list_r=new ArrayList();
                    	    list_r.add(r.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt11++;
                    } while (true);
                    } finally {dbg.exitSubRule(11);}


                    }


                    // AST REWRITE
                    // elements: l, r, AND
                    // token labels: 
                    // rule labels: retval, l
                    // token list labels: 
                    // rule list labels: r
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",list_r);
                    root_0 = (CommonTree)adaptor.nil();
                    // 155:4: -> ^( AND BOOLEAN $l $r)
                    {
                        dbg.location(155,7);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:155:7: ^( AND BOOLEAN $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(155,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_AND.nextNode()
                        , root_1);

                        dbg.location(155,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                        );
                        dbg.location(155,22);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(155,25);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:156:5: l= booleanOrExpr
                    {
                    dbg.location(156,6);
                    pushFollow(FOLLOW_booleanOrExpr_in_booleanAndExpr875);
                    l=booleanOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanOrExpr.add(l.getTree());

                    // AST REWRITE
                    // elements: l
                    // token labels: 
                    // rule labels: retval, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 157:4: -> ^( AND BOOLEAN $l)
                    {
                        dbg.location(157,7);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:157:7: ^( AND BOOLEAN $l)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(157,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(AND, "AND")
                        , root_1);

                        dbg.location(157,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                        );
                        dbg.location(157,22);
                        adaptor.addChild(root_1, stream_l.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(158, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanAndExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanAndExpr"


    public static class booleanOrExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanOrExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:160:1: booleanOrExpr : ( ( OR )=> (l= booleanExpr ( OR r+= booleanExpr )+ ) -> ^( OR BOOLEAN $l $r) |l= booleanExpr -> ^( OR BOOLEAN $l) );
    public final GrammarParser.booleanOrExpr_return booleanOrExpr() throws RecognitionException {
        GrammarParser.booleanOrExpr_return retval = new GrammarParser.booleanOrExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR52=null;
        List list_r=null;
        GrammarParser.booleanExpr_return l =null;

        RuleReturnScope r = null;
        CommonTree OR52_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_booleanExpr=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpr");
        try { dbg.enterRule(getGrammarFileName(), "booleanOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:3: ( ( OR )=> (l= booleanExpr ( OR r+= booleanExpr )+ ) -> ^( OR BOOLEAN $l $r) |l= booleanExpr -> ^( OR BOOLEAN $l) )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case TRUE:
                {
                int LA14_1 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case NOF:
            case NOT:
                {
                int LA14_4 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case LP:
                {
                int LA14_5 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING_CONSTANT:
                {
                int LA14_6 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA14_7 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER_CONSTANT:
                {
                int LA14_8 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER:
                {
                int LA14_9 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BAG:
                {
                int LA14_10 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ACTION:
            case ENVIRONMENT:
            case RESOURCE:
            case SUBJECT:
                {
                int LA14_11 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA14_12 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ANYURI:
                {
                int LA14_13 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DATE:
                {
                int LA14_14 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case TIME:
                {
                int LA14_15 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DATETIME:
                {
                int LA14_16 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 16, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BASE64BINARY:
                {
                int LA14_17 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 17, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DAYTIMEDURATION:
                {
                int LA14_18 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 18, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case YEARMONTHDURATION:
                {
                int LA14_19 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 19, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case X500NAME:
                {
                int LA14_20 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 20, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case RFC822NAME:
                {
                int LA14_21 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 21, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case HEXBINARY:
                {
                int LA14_22 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 22, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case DOUBLE_CONSTANT:
                {
                int LA14_23 = input.LA(2);

                if ( (synpred2_Grammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 23, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:5: ( OR )=> (l= booleanExpr ( OR r+= booleanExpr )+ )
                    {
                    dbg.location(161,13);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:13: (l= booleanExpr ( OR r+= booleanExpr )+ )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:14: l= booleanExpr ( OR r+= booleanExpr )+
                    {
                    dbg.location(161,15);
                    pushFollow(FOLLOW_booleanExpr_in_booleanOrExpr911);
                    l=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpr.add(l.getTree());
                    dbg.location(161,28);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:28: ( OR r+= booleanExpr )+
                    int cnt13=0;
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==OR) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:29: OR r+= booleanExpr
                    	    {
                    	    dbg.location(161,29);
                    	    OR52=(Token)match(input,OR,FOLLOW_OR_in_booleanOrExpr914); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OR.add(OR52);

                    	    dbg.location(161,33);
                    	    pushFollow(FOLLOW_booleanExpr_in_booleanOrExpr918);
                    	    r=booleanExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_booleanExpr.add(r.getTree());
                    	    if (list_r==null) list_r=new ArrayList();
                    	    list_r.add(r.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt13++;
                    } while (true);
                    } finally {dbg.exitSubRule(13);}


                    }


                    // AST REWRITE
                    // elements: OR, r, l
                    // token labels: 
                    // rule labels: retval, l
                    // token list labels: 
                    // rule list labels: r
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",list_r);
                    root_0 = (CommonTree)adaptor.nil();
                    // 162:4: -> ^( OR BOOLEAN $l $r)
                    {
                        dbg.location(162,7);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:162:7: ^( OR BOOLEAN $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(162,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_OR.nextNode()
                        , root_1);

                        dbg.location(162,12);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                        );
                        dbg.location(162,21);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(162,24);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:163:5: l= booleanExpr
                    {
                    dbg.location(163,6);
                    pushFollow(FOLLOW_booleanExpr_in_booleanOrExpr947);
                    l=booleanExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanExpr.add(l.getTree());

                    // AST REWRITE
                    // elements: l
                    // token labels: 
                    // rule labels: retval, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 164:4: -> ^( OR BOOLEAN $l)
                    {
                        dbg.location(164,7);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:164:7: ^( OR BOOLEAN $l)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(164,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(OR, "OR")
                        , root_1);

                        dbg.location(164,12);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                        );
                        dbg.location(164,21);
                        adaptor.addChild(root_1, stream_l.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(165, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanOrExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanOrExpr"


    public static class booleanExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:167:1: booleanExpr : ( TRUE | FALSE | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp );
    public final GrammarParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GrammarParser.booleanExpr_return retval = new GrammarParser.booleanExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TRUE53=null;
        Token FALSE54=null;
        GrammarParser.booleanCreate_return booleanCreate55 =null;

        GrammarParser.booleanNof_return booleanNof56 =null;

        GrammarParser.booleanWrap_return booleanWrap57 =null;

        GrammarParser.booleanNode_return booleanNode58 =null;

        GrammarParser.equalityExpr_return equalityExpr59 =null;

        GrammarParser.isInOp_return isInOp60 =null;

        GrammarParser.containsOp_return containsOp61 =null;


        CommonTree TRUE53_tree=null;
        CommonTree FALSE54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:2: ( TRUE | FALSE | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp )
            int alt15=9;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:168:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(168,4);
                    TRUE53=(Token)match(input,TRUE,FOLLOW_TRUE_in_booleanExpr973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE53_tree = 
                    (CommonTree)adaptor.create(TRUE53)
                    ;
                    adaptor.addChild(root_0, TRUE53_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:169:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(169,4);
                    FALSE54=(Token)match(input,FALSE,FOLLOW_FALSE_in_booleanExpr978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE54_tree = 
                    (CommonTree)adaptor.create(FALSE54)
                    ;
                    adaptor.addChild(root_0, FALSE54_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:170:4: booleanCreate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(170,4);
                    pushFollow(FOLLOW_booleanCreate_in_booleanExpr983);
                    booleanCreate55=booleanCreate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanCreate55.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:171:4: booleanNof
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(171,4);
                    pushFollow(FOLLOW_booleanNof_in_booleanExpr988);
                    booleanNof56=booleanNof();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanNof56.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:172:4: booleanWrap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(172,4);
                    pushFollow(FOLLOW_booleanWrap_in_booleanExpr993);
                    booleanWrap57=booleanWrap();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanWrap57.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:173:4: booleanNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(173,4);
                    pushFollow(FOLLOW_booleanNode_in_booleanExpr998);
                    booleanNode58=booleanNode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanNode58.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:174:4: equalityExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(174,4);
                    pushFollow(FOLLOW_equalityExpr_in_booleanExpr1003);
                    equalityExpr59=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr59.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:175:4: isInOp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(175,4);
                    pushFollow(FOLLOW_isInOp_in_booleanExpr1008);
                    isInOp60=isInOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isInOp60.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:176:4: containsOp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(176,4);
                    pushFollow(FOLLOW_containsOp_in_booleanExpr1013);
                    containsOp61=containsOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, containsOp61.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(179, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanCreate"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:180:1: booleanCreate : BOOLEAN ^ LP ! attributeSelector RP !;
    public final GrammarParser.booleanCreate_return booleanCreate() throws RecognitionException {
        GrammarParser.booleanCreate_return retval = new GrammarParser.booleanCreate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOLEAN62=null;
        Token LP63=null;
        Token RP65=null;
        GrammarParser.attributeSelector_return attributeSelector64 =null;


        CommonTree BOOLEAN62_tree=null;
        CommonTree LP63_tree=null;
        CommonTree RP65_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanCreate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:2: ( BOOLEAN ^ LP ! attributeSelector RP !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:181:4: BOOLEAN ^ LP ! attributeSelector RP !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(181,11);
            BOOLEAN62=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanCreate1025); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN62_tree = 
            (CommonTree)adaptor.create(BOOLEAN62)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(BOOLEAN62_tree, root_0);
            }
            dbg.location(181,15);
            LP63=(Token)match(input,LP,FOLLOW_LP_in_booleanCreate1028); if (state.failed) return retval;
            dbg.location(181,17);
            pushFollow(FOLLOW_attributeSelector_in_booleanCreate1031);
            attributeSelector64=attributeSelector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector64.getTree());
            dbg.location(181,37);
            RP65=(Token)match(input,RP,FOLLOW_RP_in_booleanCreate1033); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(182, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanNof"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:183:1: booleanNof : ( NOF | NOT ) ^ LP ! booleanExpr RP !;
    public final GrammarParser.booleanNof_return booleanNof() throws RecognitionException {
        GrammarParser.booleanNof_return retval = new GrammarParser.booleanNof_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set66=null;
        Token LP67=null;
        Token RP69=null;
        GrammarParser.booleanExpr_return booleanExpr68 =null;


        CommonTree set66_tree=null;
        CommonTree LP67_tree=null;
        CommonTree RP69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanNof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:2: ( ( NOF | NOT ) ^ LP ! booleanExpr RP !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:184:4: ( NOF | NOT ) ^ LP ! booleanExpr RP !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(184,16);
            set66=(Token)input.LT(1);

            set66=(Token)input.LT(1);

            if ( input.LA(1)==NOF||input.LA(1)==NOT ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set66)
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

            dbg.location(184,20);
            LP67=(Token)match(input,LP,FOLLOW_LP_in_booleanNof1054); if (state.failed) return retval;
            dbg.location(184,22);
            pushFollow(FOLLOW_booleanExpr_in_booleanNof1057);
            booleanExpr68=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanExpr68.getTree());
            dbg.location(184,36);
            RP69=(Token)match(input,RP,FOLLOW_RP_in_booleanNof1059); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(185, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanWrap"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:186:1: booleanWrap : LP ! booleanOrExpr RP !;
    public final GrammarParser.booleanWrap_return booleanWrap() throws RecognitionException {
        GrammarParser.booleanWrap_return retval = new GrammarParser.booleanWrap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LP70=null;
        Token RP72=null;
        GrammarParser.booleanOrExpr_return booleanOrExpr71 =null;


        CommonTree LP70_tree=null;
        CommonTree RP72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanWrap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:2: ( LP ! booleanOrExpr RP !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:187:4: LP ! booleanOrExpr RP !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(187,6);
            LP70=(Token)match(input,LP,FOLLOW_LP_in_booleanWrap1070); if (state.failed) return retval;
            dbg.location(187,8);
            pushFollow(FOLLOW_booleanOrExpr_in_booleanWrap1073);
            booleanOrExpr71=booleanOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanOrExpr71.getTree());
            dbg.location(187,24);
            RP72=(Token)match(input,RP,FOLLOW_RP_in_booleanWrap1075); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(188, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanNode"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:189:1: booleanNode : stringExpr DOT ! ( NODEEQUAL | NODEMATCH ) ^ LP ! stringExpr RP !;
    public final GrammarParser.booleanNode_return booleanNode() throws RecognitionException {
        GrammarParser.booleanNode_return retval = new GrammarParser.booleanNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT74=null;
        Token set75=null;
        Token LP76=null;
        Token RP78=null;
        GrammarParser.stringExpr_return stringExpr73 =null;

        GrammarParser.stringExpr_return stringExpr77 =null;


        CommonTree DOT74_tree=null;
        CommonTree set75_tree=null;
        CommonTree LP76_tree=null;
        CommonTree RP78_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanNode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:190:2: ( stringExpr DOT ! ( NODEEQUAL | NODEMATCH ) ^ LP ! stringExpr RP !)
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:190:4: stringExpr DOT ! ( NODEEQUAL | NODEMATCH ) ^ LP ! stringExpr RP !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(190,4);
            pushFollow(FOLLOW_stringExpr_in_booleanNode1086);
            stringExpr73=stringExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr73.getTree());
            dbg.location(190,18);
            DOT74=(Token)match(input,DOT,FOLLOW_DOT_in_booleanNode1088); if (state.failed) return retval;
            dbg.location(190,45);
            set75=(Token)input.LT(1);

            set75=(Token)input.LT(1);

            if ( (input.LA(1) >= NODEEQUAL && input.LA(1) <= NODEMATCH) ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set75)
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

            dbg.location(190,49);
            LP76=(Token)match(input,LP,FOLLOW_LP_in_booleanNode1102); if (state.failed) return retval;
            dbg.location(190,51);
            pushFollow(FOLLOW_stringExpr_in_booleanNode1105);
            stringExpr77=stringExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr77.getTree());
            dbg.location(190,64);
            RP78=(Token)match(input,RP,FOLLOW_RP_in_booleanNode1107); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(191, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:192:1: booleanBag : ( BOOLEAN ^ STRING_CONSTANT_LIST | attributeSelector ^ DOT BOOLEAN LP RP );
    public final GrammarParser.booleanBag_return booleanBag() throws RecognitionException {
        GrammarParser.booleanBag_return retval = new GrammarParser.booleanBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOLEAN79=null;
        Token STRING_CONSTANT_LIST80=null;
        Token DOT82=null;
        Token BOOLEAN83=null;
        Token LP84=null;
        Token RP85=null;
        GrammarParser.attributeSelector_return attributeSelector81 =null;


        CommonTree BOOLEAN79_tree=null;
        CommonTree STRING_CONSTANT_LIST80_tree=null;
        CommonTree DOT82_tree=null;
        CommonTree BOOLEAN83_tree=null;
        CommonTree LP84_tree=null;
        CommonTree RP85_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:2: ( BOOLEAN ^ STRING_CONSTANT_LIST | attributeSelector ^ DOT BOOLEAN LP RP )
            int alt16=2;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==BOOLEAN) ) {
                alt16=1;
            }
            else if ( (LA16_0==ACTION||LA16_0==ENVIRONMENT||LA16_0==RESOURCE||LA16_0==SUBJECT) ) {
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:193:4: BOOLEAN ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(193,11);
                    BOOLEAN79=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanBag1118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN79_tree = 
                    (CommonTree)adaptor.create(BOOLEAN79)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(BOOLEAN79_tree, root_0);
                    }
                    dbg.location(193,13);
                    STRING_CONSTANT_LIST80=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_booleanBag1121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST80_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST80)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST80_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:194:4: attributeSelector ^ DOT BOOLEAN LP RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(194,21);
                    pushFollow(FOLLOW_attributeSelector_in_booleanBag1126);
                    attributeSelector81=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(attributeSelector81.getTree(), root_0);
                    dbg.location(194,23);
                    DOT82=(Token)match(input,DOT,FOLLOW_DOT_in_booleanBag1129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT82_tree = 
                    (CommonTree)adaptor.create(DOT82)
                    ;
                    adaptor.addChild(root_0, DOT82_tree);
                    }
                    dbg.location(194,27);
                    BOOLEAN83=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanBag1131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN83_tree = 
                    (CommonTree)adaptor.create(BOOLEAN83)
                    ;
                    adaptor.addChild(root_0, BOOLEAN83_tree);
                    }
                    dbg.location(194,35);
                    LP84=(Token)match(input,LP,FOLLOW_LP_in_booleanBag1133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP84_tree = 
                    (CommonTree)adaptor.create(LP84)
                    ;
                    adaptor.addChild(root_0, LP84_tree);
                    }
                    dbg.location(194,38);
                    RP85=(Token)match(input,RP,FOLLOW_RP_in_booleanBag1135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP85_tree = 
                    (CommonTree)adaptor.create(RP85)
                    ;
                    adaptor.addChild(root_0, RP85_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(197, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanBag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanBag"


    public static class isInOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isInOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:199:1: isInOp : ( doubleExpr DOT ISIN LP doubleBag RP -> ^( ISIN DOUBLE doubleExpr doubleBag ) | stringExpr DOT ISIN LP stringBag RP -> ^( ISIN INTEGER stringExpr stringBag ) | anyUriExpr DOT ISIN LP anyUriBag RP -> ^( ISIN ANYURI anyUriExpr anyUriBag ) | dateExpr DOT ISIN LP dateBag RP -> ^( ISIN DATE dateExpr dateBag ) | timeExpr DOT ISIN LP timeBag RP -> ^( ISIN TIME timeExpr timeBag ) | dateTimeExpr DOT ISIN LP dateTimeBag RP -> ^( ISIN DATETIME dateTimeExpr dateTimeBag ) | base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) | dayTimeDurationExpr DOT ISIN LP dayTimeDurationBag RP -> ^( ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag ) | yearMonthDurationExpr DOT ISIN LP yearMonthDurationBag RP -> ^( ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag ) | x500NameExpr DOT ISIN LP x500NameBag RP -> ^( ISIN X500NAME x500NameExpr x500NameBag ) | rfc822NameExpr DOT ISIN LP rfc822NameBag RP -> ^( ISIN RFC822NAME rfc822NameExpr rfc822NameBag ) | hexBinaryExpr DOT ISIN LP hexBinaryBag RP -> ^( ISIN HEXBINARY hexBinaryExpr hexBinaryBag ) | ( base64BinaryExpr )=> base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) );
    public final GrammarParser.isInOp_return isInOp() throws RecognitionException {
        GrammarParser.isInOp_return retval = new GrammarParser.isInOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT87=null;
        Token ISIN88=null;
        Token LP89=null;
        Token RP91=null;
        Token DOT93=null;
        Token ISIN94=null;
        Token LP95=null;
        Token RP97=null;
        Token DOT99=null;
        Token ISIN100=null;
        Token LP101=null;
        Token RP103=null;
        Token DOT105=null;
        Token ISIN106=null;
        Token LP107=null;
        Token RP109=null;
        Token DOT111=null;
        Token ISIN112=null;
        Token LP113=null;
        Token RP115=null;
        Token DOT117=null;
        Token ISIN118=null;
        Token LP119=null;
        Token RP121=null;
        Token DOT123=null;
        Token ISIN124=null;
        Token LP125=null;
        Token RP127=null;
        Token DOT129=null;
        Token ISIN130=null;
        Token LP131=null;
        Token RP133=null;
        Token DOT135=null;
        Token ISIN136=null;
        Token LP137=null;
        Token RP139=null;
        Token DOT141=null;
        Token ISIN142=null;
        Token LP143=null;
        Token RP145=null;
        Token DOT147=null;
        Token ISIN148=null;
        Token LP149=null;
        Token RP151=null;
        Token DOT153=null;
        Token ISIN154=null;
        Token LP155=null;
        Token RP157=null;
        Token DOT159=null;
        Token ISIN160=null;
        Token LP161=null;
        Token RP163=null;
        GrammarParser.doubleExpr_return doubleExpr86 =null;

        GrammarParser.doubleBag_return doubleBag90 =null;

        GrammarParser.stringExpr_return stringExpr92 =null;

        GrammarParser.stringBag_return stringBag96 =null;

        GrammarParser.anyUriExpr_return anyUriExpr98 =null;

        GrammarParser.anyUriBag_return anyUriBag102 =null;

        GrammarParser.dateExpr_return dateExpr104 =null;

        GrammarParser.dateBag_return dateBag108 =null;

        GrammarParser.timeExpr_return timeExpr110 =null;

        GrammarParser.timeBag_return timeBag114 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr116 =null;

        GrammarParser.dateTimeBag_return dateTimeBag120 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr122 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag126 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr128 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag132 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr134 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag138 =null;

        GrammarParser.x500NameExpr_return x500NameExpr140 =null;

        GrammarParser.x500NameBag_return x500NameBag144 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr146 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag150 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr152 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag156 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr158 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag162 =null;


        CommonTree DOT87_tree=null;
        CommonTree ISIN88_tree=null;
        CommonTree LP89_tree=null;
        CommonTree RP91_tree=null;
        CommonTree DOT93_tree=null;
        CommonTree ISIN94_tree=null;
        CommonTree LP95_tree=null;
        CommonTree RP97_tree=null;
        CommonTree DOT99_tree=null;
        CommonTree ISIN100_tree=null;
        CommonTree LP101_tree=null;
        CommonTree RP103_tree=null;
        CommonTree DOT105_tree=null;
        CommonTree ISIN106_tree=null;
        CommonTree LP107_tree=null;
        CommonTree RP109_tree=null;
        CommonTree DOT111_tree=null;
        CommonTree ISIN112_tree=null;
        CommonTree LP113_tree=null;
        CommonTree RP115_tree=null;
        CommonTree DOT117_tree=null;
        CommonTree ISIN118_tree=null;
        CommonTree LP119_tree=null;
        CommonTree RP121_tree=null;
        CommonTree DOT123_tree=null;
        CommonTree ISIN124_tree=null;
        CommonTree LP125_tree=null;
        CommonTree RP127_tree=null;
        CommonTree DOT129_tree=null;
        CommonTree ISIN130_tree=null;
        CommonTree LP131_tree=null;
        CommonTree RP133_tree=null;
        CommonTree DOT135_tree=null;
        CommonTree ISIN136_tree=null;
        CommonTree LP137_tree=null;
        CommonTree RP139_tree=null;
        CommonTree DOT141_tree=null;
        CommonTree ISIN142_tree=null;
        CommonTree LP143_tree=null;
        CommonTree RP145_tree=null;
        CommonTree DOT147_tree=null;
        CommonTree ISIN148_tree=null;
        CommonTree LP149_tree=null;
        CommonTree RP151_tree=null;
        CommonTree DOT153_tree=null;
        CommonTree ISIN154_tree=null;
        CommonTree LP155_tree=null;
        CommonTree RP157_tree=null;
        CommonTree DOT159_tree=null;
        CommonTree ISIN160_tree=null;
        CommonTree LP161_tree=null;
        CommonTree RP163_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_ISIN=new RewriteRuleTokenStream(adaptor,"token ISIN");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_yearMonthDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationBag");
        RewriteRuleSubtreeStream stream_dateBag=new RewriteRuleSubtreeStream(adaptor,"rule dateBag");
        RewriteRuleSubtreeStream stream_dayTimeDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationExpr");
        RewriteRuleSubtreeStream stream_doubleExpr=new RewriteRuleSubtreeStream(adaptor,"rule doubleExpr");
        RewriteRuleSubtreeStream stream_rfc822NameBag=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameBag");
        RewriteRuleSubtreeStream stream_stringExpr=new RewriteRuleSubtreeStream(adaptor,"rule stringExpr");
        RewriteRuleSubtreeStream stream_x500NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule x500NameExpr");
        RewriteRuleSubtreeStream stream_hexBinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule hexBinaryBag");
        RewriteRuleSubtreeStream stream_anyUriBag=new RewriteRuleSubtreeStream(adaptor,"rule anyUriBag");
        RewriteRuleSubtreeStream stream_dateTimeExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeExpr");
        RewriteRuleSubtreeStream stream_doubleBag=new RewriteRuleSubtreeStream(adaptor,"rule doubleBag");
        RewriteRuleSubtreeStream stream_timeBag=new RewriteRuleSubtreeStream(adaptor,"rule timeBag");
        RewriteRuleSubtreeStream stream_dateExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateExpr");
        RewriteRuleSubtreeStream stream_dayTimeDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationBag");
        RewriteRuleSubtreeStream stream_x500NameBag=new RewriteRuleSubtreeStream(adaptor,"rule x500NameBag");
        RewriteRuleSubtreeStream stream_base64BinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryExpr");
        RewriteRuleSubtreeStream stream_base64BinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryBag");
        RewriteRuleSubtreeStream stream_anyUriExpr=new RewriteRuleSubtreeStream(adaptor,"rule anyUriExpr");
        RewriteRuleSubtreeStream stream_rfc822NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameExpr");
        RewriteRuleSubtreeStream stream_dateTimeBag=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeBag");
        RewriteRuleSubtreeStream stream_hexBinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule hexBinaryExpr");
        RewriteRuleSubtreeStream stream_stringBag=new RewriteRuleSubtreeStream(adaptor,"rule stringBag");
        RewriteRuleSubtreeStream stream_yearMonthDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationExpr");
        try { dbg.enterRule(getGrammarFileName(), "isInOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:2: ( doubleExpr DOT ISIN LP doubleBag RP -> ^( ISIN DOUBLE doubleExpr doubleBag ) | stringExpr DOT ISIN LP stringBag RP -> ^( ISIN INTEGER stringExpr stringBag ) | anyUriExpr DOT ISIN LP anyUriBag RP -> ^( ISIN ANYURI anyUriExpr anyUriBag ) | dateExpr DOT ISIN LP dateBag RP -> ^( ISIN DATE dateExpr dateBag ) | timeExpr DOT ISIN LP timeBag RP -> ^( ISIN TIME timeExpr timeBag ) | dateTimeExpr DOT ISIN LP dateTimeBag RP -> ^( ISIN DATETIME dateTimeExpr dateTimeBag ) | base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) | dayTimeDurationExpr DOT ISIN LP dayTimeDurationBag RP -> ^( ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag ) | yearMonthDurationExpr DOT ISIN LP yearMonthDurationBag RP -> ^( ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag ) | x500NameExpr DOT ISIN LP x500NameBag RP -> ^( ISIN X500NAME x500NameExpr x500NameBag ) | rfc822NameExpr DOT ISIN LP rfc822NameBag RP -> ^( ISIN RFC822NAME rfc822NameExpr rfc822NameBag ) | hexBinaryExpr DOT ISIN LP hexBinaryBag RP -> ^( ISIN HEXBINARY hexBinaryExpr hexBinaryBag ) | ( base64BinaryExpr )=> base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) )
            int alt17=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:200:4: doubleExpr DOT ISIN LP doubleBag RP
                    {
                    dbg.location(200,4);
                    pushFollow(FOLLOW_doubleExpr_in_isInOp1148);
                    doubleExpr86=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(doubleExpr86.getTree());
                    dbg.location(200,15);
                    DOT87=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT87);

                    dbg.location(200,19);
                    ISIN88=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN88);

                    dbg.location(200,24);
                    LP89=(Token)match(input,LP,FOLLOW_LP_in_isInOp1154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP89);

                    dbg.location(200,27);
                    pushFollow(FOLLOW_doubleBag_in_isInOp1156);
                    doubleBag90=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleBag.add(doubleBag90.getTree());
                    dbg.location(200,37);
                    RP91=(Token)match(input,RP,FOLLOW_RP_in_isInOp1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP91);


                    // AST REWRITE
                    // elements: doubleBag, ISIN, doubleExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:3: -> ^( ISIN DOUBLE doubleExpr doubleBag )
                    {
                        dbg.location(201,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:201:6: ^( ISIN DOUBLE doubleExpr doubleBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(201,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(201,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DOUBLE, "DOUBLE")
                        );
                        dbg.location(201,20);
                        adaptor.addChild(root_1, stream_doubleExpr.nextTree());
                        dbg.location(201,31);
                        adaptor.addChild(root_1, stream_doubleBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:202:4: stringExpr DOT ISIN LP stringBag RP
                    {
                    dbg.location(202,4);
                    pushFollow(FOLLOW_stringExpr_in_isInOp1177);
                    stringExpr92=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(stringExpr92.getTree());
                    dbg.location(202,15);
                    DOT93=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT93);

                    dbg.location(202,19);
                    ISIN94=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN94);

                    dbg.location(202,24);
                    LP95=(Token)match(input,LP,FOLLOW_LP_in_isInOp1183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP95);

                    dbg.location(202,27);
                    pushFollow(FOLLOW_stringBag_in_isInOp1185);
                    stringBag96=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringBag.add(stringBag96.getTree());
                    dbg.location(202,37);
                    RP97=(Token)match(input,RP,FOLLOW_RP_in_isInOp1187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP97);


                    // AST REWRITE
                    // elements: stringBag, ISIN, stringExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:3: -> ^( ISIN INTEGER stringExpr stringBag )
                    {
                        dbg.location(203,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:203:6: ^( ISIN INTEGER stringExpr stringBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(203,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(203,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(203,21);
                        adaptor.addChild(root_1, stream_stringExpr.nextTree());
                        dbg.location(203,32);
                        adaptor.addChild(root_1, stream_stringBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:204:4: anyUriExpr DOT ISIN LP anyUriBag RP
                    {
                    dbg.location(204,4);
                    pushFollow(FOLLOW_anyUriExpr_in_isInOp1206);
                    anyUriExpr98=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(anyUriExpr98.getTree());
                    dbg.location(204,15);
                    DOT99=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT99);

                    dbg.location(204,19);
                    ISIN100=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN100);

                    dbg.location(204,24);
                    LP101=(Token)match(input,LP,FOLLOW_LP_in_isInOp1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP101);

                    dbg.location(204,27);
                    pushFollow(FOLLOW_anyUriBag_in_isInOp1214);
                    anyUriBag102=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriBag.add(anyUriBag102.getTree());
                    dbg.location(204,37);
                    RP103=(Token)match(input,RP,FOLLOW_RP_in_isInOp1216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP103);


                    // AST REWRITE
                    // elements: anyUriBag, anyUriExpr, ISIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 205:3: -> ^( ISIN ANYURI anyUriExpr anyUriBag )
                    {
                        dbg.location(205,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:205:6: ^( ISIN ANYURI anyUriExpr anyUriBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(205,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(205,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ANYURI, "ANYURI")
                        );
                        dbg.location(205,20);
                        adaptor.addChild(root_1, stream_anyUriExpr.nextTree());
                        dbg.location(205,31);
                        adaptor.addChild(root_1, stream_anyUriBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:206:4: dateExpr DOT ISIN LP dateBag RP
                    {
                    dbg.location(206,4);
                    pushFollow(FOLLOW_dateExpr_in_isInOp1235);
                    dateExpr104=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateExpr.add(dateExpr104.getTree());
                    dbg.location(206,13);
                    DOT105=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT105);

                    dbg.location(206,17);
                    ISIN106=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN106);

                    dbg.location(206,22);
                    LP107=(Token)match(input,LP,FOLLOW_LP_in_isInOp1241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP107);

                    dbg.location(206,25);
                    pushFollow(FOLLOW_dateBag_in_isInOp1243);
                    dateBag108=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateBag.add(dateBag108.getTree());
                    dbg.location(206,33);
                    RP109=(Token)match(input,RP,FOLLOW_RP_in_isInOp1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP109);


                    // AST REWRITE
                    // elements: dateBag, dateExpr, ISIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:4: -> ^( ISIN DATE dateExpr dateBag )
                    {
                        dbg.location(207,7);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:207:7: ^( ISIN DATE dateExpr dateBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(207,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(207,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATE, "DATE")
                        );
                        dbg.location(207,19);
                        adaptor.addChild(root_1, stream_dateExpr.nextTree());
                        dbg.location(207,28);
                        adaptor.addChild(root_1, stream_dateBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:208:4: timeExpr DOT ISIN LP timeBag RP
                    {
                    dbg.location(208,4);
                    pushFollow(FOLLOW_timeExpr_in_isInOp1265);
                    timeExpr110=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr110.getTree());
                    dbg.location(208,13);
                    DOT111=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT111);

                    dbg.location(208,17);
                    ISIN112=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN112);

                    dbg.location(208,22);
                    LP113=(Token)match(input,LP,FOLLOW_LP_in_isInOp1271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP113);

                    dbg.location(208,25);
                    pushFollow(FOLLOW_timeBag_in_isInOp1273);
                    timeBag114=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeBag.add(timeBag114.getTree());
                    dbg.location(208,33);
                    RP115=(Token)match(input,RP,FOLLOW_RP_in_isInOp1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP115);


                    // AST REWRITE
                    // elements: ISIN, timeExpr, timeBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 209:3: -> ^( ISIN TIME timeExpr timeBag )
                    {
                        dbg.location(209,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:209:6: ^( ISIN TIME timeExpr timeBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(209,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(209,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TIME, "TIME")
                        );
                        dbg.location(209,18);
                        adaptor.addChild(root_1, stream_timeExpr.nextTree());
                        dbg.location(209,27);
                        adaptor.addChild(root_1, stream_timeBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:210:4: dateTimeExpr DOT ISIN LP dateTimeBag RP
                    {
                    dbg.location(210,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_isInOp1294);
                    dateTimeExpr116=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(dateTimeExpr116.getTree());
                    dbg.location(210,17);
                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT117);

                    dbg.location(210,21);
                    ISIN118=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN118);

                    dbg.location(210,26);
                    LP119=(Token)match(input,LP,FOLLOW_LP_in_isInOp1300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP119);

                    dbg.location(210,29);
                    pushFollow(FOLLOW_dateTimeBag_in_isInOp1302);
                    dateTimeBag120=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeBag.add(dateTimeBag120.getTree());
                    dbg.location(210,41);
                    RP121=(Token)match(input,RP,FOLLOW_RP_in_isInOp1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP121);


                    // AST REWRITE
                    // elements: ISIN, dateTimeBag, dateTimeExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:3: -> ^( ISIN DATETIME dateTimeExpr dateTimeBag )
                    {
                        dbg.location(211,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:211:6: ^( ISIN DATETIME dateTimeExpr dateTimeBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(211,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(211,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATETIME, "DATETIME")
                        );
                        dbg.location(211,22);
                        adaptor.addChild(root_1, stream_dateTimeExpr.nextTree());
                        dbg.location(211,35);
                        adaptor.addChild(root_1, stream_dateTimeBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:212:4: base64BinaryExpr DOT ISIN LP base64BinaryBag RP
                    {
                    dbg.location(212,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1323);
                    base64BinaryExpr122=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr122.getTree());
                    dbg.location(212,21);
                    DOT123=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT123);

                    dbg.location(212,25);
                    ISIN124=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN124);

                    dbg.location(212,30);
                    LP125=(Token)match(input,LP,FOLLOW_LP_in_isInOp1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP125);

                    dbg.location(212,33);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1331);
                    base64BinaryBag126=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(base64BinaryBag126.getTree());
                    dbg.location(212,49);
                    RP127=(Token)match(input,RP,FOLLOW_RP_in_isInOp1333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP127);


                    // AST REWRITE
                    // elements: ISIN, base64BinaryExpr, base64BinaryBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:3: -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag )
                    {
                        dbg.location(213,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:213:6: ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(213,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(213,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BASE64BINARY, "BASE64BINARY")
                        );
                        dbg.location(213,26);
                        adaptor.addChild(root_1, stream_base64BinaryExpr.nextTree());
                        dbg.location(213,43);
                        adaptor.addChild(root_1, stream_base64BinaryBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:214:4: dayTimeDurationExpr DOT ISIN LP dayTimeDurationBag RP
                    {
                    dbg.location(214,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_isInOp1352);
                    dayTimeDurationExpr128=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(dayTimeDurationExpr128.getTree());
                    dbg.location(214,24);
                    DOT129=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT129);

                    dbg.location(214,28);
                    ISIN130=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN130);

                    dbg.location(214,33);
                    LP131=(Token)match(input,LP,FOLLOW_LP_in_isInOp1358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP131);

                    dbg.location(214,36);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_isInOp1360);
                    dayTimeDurationBag132=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationBag.add(dayTimeDurationBag132.getTree());
                    dbg.location(214,55);
                    RP133=(Token)match(input,RP,FOLLOW_RP_in_isInOp1362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP133);


                    // AST REWRITE
                    // elements: dayTimeDurationExpr, dayTimeDurationBag, ISIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 215:3: -> ^( ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag )
                    {
                        dbg.location(215,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:215:6: ^( ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(215,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(215,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DAYTIMEDURATION, "DAYTIMEDURATION")
                        );
                        dbg.location(215,29);
                        adaptor.addChild(root_1, stream_dayTimeDurationExpr.nextTree());
                        dbg.location(215,49);
                        adaptor.addChild(root_1, stream_dayTimeDurationBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:216:4: yearMonthDurationExpr DOT ISIN LP yearMonthDurationBag RP
                    {
                    dbg.location(216,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_isInOp1381);
                    yearMonthDurationExpr134=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(yearMonthDurationExpr134.getTree());
                    dbg.location(216,26);
                    DOT135=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT135);

                    dbg.location(216,30);
                    ISIN136=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN136);

                    dbg.location(216,35);
                    LP137=(Token)match(input,LP,FOLLOW_LP_in_isInOp1387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP137);

                    dbg.location(216,38);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_isInOp1389);
                    yearMonthDurationBag138=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationBag.add(yearMonthDurationBag138.getTree());
                    dbg.location(216,59);
                    RP139=(Token)match(input,RP,FOLLOW_RP_in_isInOp1391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP139);


                    // AST REWRITE
                    // elements: yearMonthDurationBag, yearMonthDurationExpr, ISIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 217:3: -> ^( ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag )
                    {
                        dbg.location(217,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:217:6: ^( ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(217,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(217,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(YEARMONTHDURATION, "YEARMONTHDURATION")
                        );
                        dbg.location(217,31);
                        adaptor.addChild(root_1, stream_yearMonthDurationExpr.nextTree());
                        dbg.location(217,53);
                        adaptor.addChild(root_1, stream_yearMonthDurationBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:218:4: x500NameExpr DOT ISIN LP x500NameBag RP
                    {
                    dbg.location(218,4);
                    pushFollow(FOLLOW_x500NameExpr_in_isInOp1410);
                    x500NameExpr140=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(x500NameExpr140.getTree());
                    dbg.location(218,17);
                    DOT141=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT141);

                    dbg.location(218,21);
                    ISIN142=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN142);

                    dbg.location(218,26);
                    LP143=(Token)match(input,LP,FOLLOW_LP_in_isInOp1416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP143);

                    dbg.location(218,29);
                    pushFollow(FOLLOW_x500NameBag_in_isInOp1418);
                    x500NameBag144=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameBag.add(x500NameBag144.getTree());
                    dbg.location(218,41);
                    RP145=(Token)match(input,RP,FOLLOW_RP_in_isInOp1420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP145);


                    // AST REWRITE
                    // elements: x500NameExpr, x500NameBag, ISIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 219:3: -> ^( ISIN X500NAME x500NameExpr x500NameBag )
                    {
                        dbg.location(219,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:219:6: ^( ISIN X500NAME x500NameExpr x500NameBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(219,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(219,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(X500NAME, "X500NAME")
                        );
                        dbg.location(219,22);
                        adaptor.addChild(root_1, stream_x500NameExpr.nextTree());
                        dbg.location(219,35);
                        adaptor.addChild(root_1, stream_x500NameBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:220:4: rfc822NameExpr DOT ISIN LP rfc822NameBag RP
                    {
                    dbg.location(220,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_isInOp1439);
                    rfc822NameExpr146=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(rfc822NameExpr146.getTree());
                    dbg.location(220,19);
                    DOT147=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT147);

                    dbg.location(220,23);
                    ISIN148=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN148);

                    dbg.location(220,28);
                    LP149=(Token)match(input,LP,FOLLOW_LP_in_isInOp1445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP149);

                    dbg.location(220,31);
                    pushFollow(FOLLOW_rfc822NameBag_in_isInOp1447);
                    rfc822NameBag150=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameBag.add(rfc822NameBag150.getTree());
                    dbg.location(220,45);
                    RP151=(Token)match(input,RP,FOLLOW_RP_in_isInOp1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP151);


                    // AST REWRITE
                    // elements: ISIN, rfc822NameExpr, rfc822NameBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:3: -> ^( ISIN RFC822NAME rfc822NameExpr rfc822NameBag )
                    {
                        dbg.location(221,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:221:6: ^( ISIN RFC822NAME rfc822NameExpr rfc822NameBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(221,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(221,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(RFC822NAME, "RFC822NAME")
                        );
                        dbg.location(221,24);
                        adaptor.addChild(root_1, stream_rfc822NameExpr.nextTree());
                        dbg.location(221,39);
                        adaptor.addChild(root_1, stream_rfc822NameBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:222:4: hexBinaryExpr DOT ISIN LP hexBinaryBag RP
                    {
                    dbg.location(222,4);
                    pushFollow(FOLLOW_hexBinaryExpr_in_isInOp1468);
                    hexBinaryExpr152=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryExpr.add(hexBinaryExpr152.getTree());
                    dbg.location(222,18);
                    DOT153=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT153);

                    dbg.location(222,22);
                    ISIN154=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN154);

                    dbg.location(222,27);
                    LP155=(Token)match(input,LP,FOLLOW_LP_in_isInOp1474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP155);

                    dbg.location(222,30);
                    pushFollow(FOLLOW_hexBinaryBag_in_isInOp1476);
                    hexBinaryBag156=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryBag.add(hexBinaryBag156.getTree());
                    dbg.location(222,43);
                    RP157=(Token)match(input,RP,FOLLOW_RP_in_isInOp1478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP157);


                    // AST REWRITE
                    // elements: ISIN, hexBinaryBag, hexBinaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 223:3: -> ^( ISIN HEXBINARY hexBinaryExpr hexBinaryBag )
                    {
                        dbg.location(223,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:223:6: ^( ISIN HEXBINARY hexBinaryExpr hexBinaryBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(223,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(223,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(HEXBINARY, "HEXBINARY")
                        );
                        dbg.location(223,23);
                        adaptor.addChild(root_1, stream_hexBinaryExpr.nextTree());
                        dbg.location(223,37);
                        adaptor.addChild(root_1, stream_hexBinaryBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: ( base64BinaryExpr )=> base64BinaryExpr DOT ISIN LP base64BinaryBag RP
                    {
                    dbg.location(224,26);
                    pushFollow(FOLLOW_base64BinaryExpr_in_isInOp1503);
                    base64BinaryExpr158=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr158.getTree());
                    dbg.location(224,43);
                    DOT159=(Token)match(input,DOT,FOLLOW_DOT_in_isInOp1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT159);

                    dbg.location(224,47);
                    ISIN160=(Token)match(input,ISIN,FOLLOW_ISIN_in_isInOp1507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ISIN.add(ISIN160);

                    dbg.location(224,52);
                    LP161=(Token)match(input,LP,FOLLOW_LP_in_isInOp1509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP161);

                    dbg.location(224,55);
                    pushFollow(FOLLOW_base64BinaryBag_in_isInOp1511);
                    base64BinaryBag162=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(base64BinaryBag162.getTree());
                    dbg.location(224,71);
                    RP163=(Token)match(input,RP,FOLLOW_RP_in_isInOp1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP163);


                    // AST REWRITE
                    // elements: base64BinaryExpr, ISIN, base64BinaryBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 225:3: -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag )
                    {
                        dbg.location(225,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:225:6: ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(225,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ISIN.nextNode()
                        , root_1);

                        dbg.location(225,13);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BASE64BINARY, "BASE64BINARY")
                        );
                        dbg.location(225,26);
                        adaptor.addChild(root_1, stream_base64BinaryExpr.nextTree());
                        dbg.location(225,43);
                        adaptor.addChild(root_1, stream_base64BinaryBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(226, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "containsOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:228:1: containsOp : ( doubleBag DOT CONTAINS LP doubleExpr RP -> ^( CONTAINS DOUBLE doubleBag doubleExpr ) | stringBag DOT CONTAINS LP stringExpr RP -> ^( CONTAINS STRING stringBag stringExpr ) | anyUriBag DOT CONTAINS LP anyUriExpr RP -> ^( CONTAINS STRING anyUriBag anyUriExpr ) | dateBag DOT CONTAINS LP dateBag RP -> ^( CONTAINS STRING dateBag dateBag ) | timeBag DOT CONTAINS LP timeExpr RP -> ^( CONTAINS STRING timeBag timeExpr ) | dateTimeBag DOT CONTAINS LP dateTimeExpr RP -> ^( CONTAINS STRING dateTimeBag dateTimeExpr ) | base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) | dayTimeDurationBag DOT CONTAINS LP dayTimeDurationExpr RP -> ^( CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr ) | yearMonthDurationBag DOT CONTAINS LP yearMonthDurationExpr RP -> ^( CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr ) | x500NameBag DOT CONTAINS LP x500NameExpr RP -> ^( CONTAINS STRING x500NameBag x500NameExpr ) | rfc822NameBag DOT CONTAINS LP rfc822NameExpr RP -> ^( CONTAINS STRING rfc822NameBag rfc822NameExpr ) | hexBinaryBag DOT CONTAINS LP hexBinaryExpr RP -> ^( CONTAINS STRING hexBinaryBag hexBinaryExpr ) | ( base64BinaryExpr )=> base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) );
    public final GrammarParser.containsOp_return containsOp() throws RecognitionException {
        GrammarParser.containsOp_return retval = new GrammarParser.containsOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT165=null;
        Token CONTAINS166=null;
        Token LP167=null;
        Token RP169=null;
        Token DOT171=null;
        Token CONTAINS172=null;
        Token LP173=null;
        Token RP175=null;
        Token DOT177=null;
        Token CONTAINS178=null;
        Token LP179=null;
        Token RP181=null;
        Token DOT183=null;
        Token CONTAINS184=null;
        Token LP185=null;
        Token RP187=null;
        Token DOT189=null;
        Token CONTAINS190=null;
        Token LP191=null;
        Token RP193=null;
        Token DOT195=null;
        Token CONTAINS196=null;
        Token LP197=null;
        Token RP199=null;
        Token DOT201=null;
        Token CONTAINS202=null;
        Token LP203=null;
        Token RP205=null;
        Token DOT207=null;
        Token CONTAINS208=null;
        Token LP209=null;
        Token RP211=null;
        Token DOT213=null;
        Token CONTAINS214=null;
        Token LP215=null;
        Token RP217=null;
        Token DOT219=null;
        Token CONTAINS220=null;
        Token LP221=null;
        Token RP223=null;
        Token DOT225=null;
        Token CONTAINS226=null;
        Token LP227=null;
        Token RP229=null;
        Token DOT231=null;
        Token CONTAINS232=null;
        Token LP233=null;
        Token RP235=null;
        Token DOT237=null;
        Token CONTAINS238=null;
        Token LP239=null;
        Token RP241=null;
        GrammarParser.doubleBag_return doubleBag164 =null;

        GrammarParser.doubleExpr_return doubleExpr168 =null;

        GrammarParser.stringBag_return stringBag170 =null;

        GrammarParser.stringExpr_return stringExpr174 =null;

        GrammarParser.anyUriBag_return anyUriBag176 =null;

        GrammarParser.anyUriExpr_return anyUriExpr180 =null;

        GrammarParser.dateBag_return dateBag182 =null;

        GrammarParser.dateBag_return dateBag186 =null;

        GrammarParser.timeBag_return timeBag188 =null;

        GrammarParser.timeExpr_return timeExpr192 =null;

        GrammarParser.dateTimeBag_return dateTimeBag194 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr198 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag200 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr204 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag206 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr210 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag212 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr216 =null;

        GrammarParser.x500NameBag_return x500NameBag218 =null;

        GrammarParser.x500NameExpr_return x500NameExpr222 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag224 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr228 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag230 =null;

        GrammarParser.hexBinaryExpr_return hexBinaryExpr234 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag236 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr240 =null;


        CommonTree DOT165_tree=null;
        CommonTree CONTAINS166_tree=null;
        CommonTree LP167_tree=null;
        CommonTree RP169_tree=null;
        CommonTree DOT171_tree=null;
        CommonTree CONTAINS172_tree=null;
        CommonTree LP173_tree=null;
        CommonTree RP175_tree=null;
        CommonTree DOT177_tree=null;
        CommonTree CONTAINS178_tree=null;
        CommonTree LP179_tree=null;
        CommonTree RP181_tree=null;
        CommonTree DOT183_tree=null;
        CommonTree CONTAINS184_tree=null;
        CommonTree LP185_tree=null;
        CommonTree RP187_tree=null;
        CommonTree DOT189_tree=null;
        CommonTree CONTAINS190_tree=null;
        CommonTree LP191_tree=null;
        CommonTree RP193_tree=null;
        CommonTree DOT195_tree=null;
        CommonTree CONTAINS196_tree=null;
        CommonTree LP197_tree=null;
        CommonTree RP199_tree=null;
        CommonTree DOT201_tree=null;
        CommonTree CONTAINS202_tree=null;
        CommonTree LP203_tree=null;
        CommonTree RP205_tree=null;
        CommonTree DOT207_tree=null;
        CommonTree CONTAINS208_tree=null;
        CommonTree LP209_tree=null;
        CommonTree RP211_tree=null;
        CommonTree DOT213_tree=null;
        CommonTree CONTAINS214_tree=null;
        CommonTree LP215_tree=null;
        CommonTree RP217_tree=null;
        CommonTree DOT219_tree=null;
        CommonTree CONTAINS220_tree=null;
        CommonTree LP221_tree=null;
        CommonTree RP223_tree=null;
        CommonTree DOT225_tree=null;
        CommonTree CONTAINS226_tree=null;
        CommonTree LP227_tree=null;
        CommonTree RP229_tree=null;
        CommonTree DOT231_tree=null;
        CommonTree CONTAINS232_tree=null;
        CommonTree LP233_tree=null;
        CommonTree RP235_tree=null;
        CommonTree DOT237_tree=null;
        CommonTree CONTAINS238_tree=null;
        CommonTree LP239_tree=null;
        CommonTree RP241_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_yearMonthDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationBag");
        RewriteRuleSubtreeStream stream_dateBag=new RewriteRuleSubtreeStream(adaptor,"rule dateBag");
        RewriteRuleSubtreeStream stream_dayTimeDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationExpr");
        RewriteRuleSubtreeStream stream_doubleExpr=new RewriteRuleSubtreeStream(adaptor,"rule doubleExpr");
        RewriteRuleSubtreeStream stream_rfc822NameBag=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameBag");
        RewriteRuleSubtreeStream stream_stringExpr=new RewriteRuleSubtreeStream(adaptor,"rule stringExpr");
        RewriteRuleSubtreeStream stream_x500NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule x500NameExpr");
        RewriteRuleSubtreeStream stream_hexBinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule hexBinaryBag");
        RewriteRuleSubtreeStream stream_anyUriBag=new RewriteRuleSubtreeStream(adaptor,"rule anyUriBag");
        RewriteRuleSubtreeStream stream_dateTimeExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeExpr");
        RewriteRuleSubtreeStream stream_doubleBag=new RewriteRuleSubtreeStream(adaptor,"rule doubleBag");
        RewriteRuleSubtreeStream stream_timeBag=new RewriteRuleSubtreeStream(adaptor,"rule timeBag");
        RewriteRuleSubtreeStream stream_dayTimeDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationBag");
        RewriteRuleSubtreeStream stream_x500NameBag=new RewriteRuleSubtreeStream(adaptor,"rule x500NameBag");
        RewriteRuleSubtreeStream stream_base64BinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryExpr");
        RewriteRuleSubtreeStream stream_base64BinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryBag");
        RewriteRuleSubtreeStream stream_anyUriExpr=new RewriteRuleSubtreeStream(adaptor,"rule anyUriExpr");
        RewriteRuleSubtreeStream stream_rfc822NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameExpr");
        RewriteRuleSubtreeStream stream_dateTimeBag=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeBag");
        RewriteRuleSubtreeStream stream_hexBinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule hexBinaryExpr");
        RewriteRuleSubtreeStream stream_stringBag=new RewriteRuleSubtreeStream(adaptor,"rule stringBag");
        RewriteRuleSubtreeStream stream_yearMonthDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationExpr");
        try { dbg.enterRule(getGrammarFileName(), "containsOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:2: ( doubleBag DOT CONTAINS LP doubleExpr RP -> ^( CONTAINS DOUBLE doubleBag doubleExpr ) | stringBag DOT CONTAINS LP stringExpr RP -> ^( CONTAINS STRING stringBag stringExpr ) | anyUriBag DOT CONTAINS LP anyUriExpr RP -> ^( CONTAINS STRING anyUriBag anyUriExpr ) | dateBag DOT CONTAINS LP dateBag RP -> ^( CONTAINS STRING dateBag dateBag ) | timeBag DOT CONTAINS LP timeExpr RP -> ^( CONTAINS STRING timeBag timeExpr ) | dateTimeBag DOT CONTAINS LP dateTimeExpr RP -> ^( CONTAINS STRING dateTimeBag dateTimeExpr ) | base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) | dayTimeDurationBag DOT CONTAINS LP dayTimeDurationExpr RP -> ^( CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr ) | yearMonthDurationBag DOT CONTAINS LP yearMonthDurationExpr RP -> ^( CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr ) | x500NameBag DOT CONTAINS LP x500NameExpr RP -> ^( CONTAINS STRING x500NameBag x500NameExpr ) | rfc822NameBag DOT CONTAINS LP rfc822NameExpr RP -> ^( CONTAINS STRING rfc822NameBag rfc822NameExpr ) | hexBinaryBag DOT CONTAINS LP hexBinaryExpr RP -> ^( CONTAINS STRING hexBinaryBag hexBinaryExpr ) | ( base64BinaryExpr )=> base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) )
            int alt18=13;
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

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:229:4: doubleBag DOT CONTAINS LP doubleExpr RP
                    {
                    dbg.location(229,4);
                    pushFollow(FOLLOW_doubleBag_in_containsOp1538);
                    doubleBag164=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleBag.add(doubleBag164.getTree());
                    dbg.location(229,14);
                    DOT165=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT165);

                    dbg.location(229,18);
                    CONTAINS166=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS166);

                    dbg.location(229,27);
                    LP167=(Token)match(input,LP,FOLLOW_LP_in_containsOp1544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP167);

                    dbg.location(229,30);
                    pushFollow(FOLLOW_doubleExpr_in_containsOp1546);
                    doubleExpr168=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(doubleExpr168.getTree());
                    dbg.location(229,41);
                    RP169=(Token)match(input,RP,FOLLOW_RP_in_containsOp1548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP169);


                    // AST REWRITE
                    // elements: CONTAINS, doubleBag, doubleExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:3: -> ^( CONTAINS DOUBLE doubleBag doubleExpr )
                    {
                        dbg.location(230,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:230:6: ^( CONTAINS DOUBLE doubleBag doubleExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(230,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(230,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DOUBLE, "DOUBLE")
                        );
                        dbg.location(230,24);
                        adaptor.addChild(root_1, stream_doubleBag.nextTree());
                        dbg.location(230,34);
                        adaptor.addChild(root_1, stream_doubleExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:231:4: stringBag DOT CONTAINS LP stringExpr RP
                    {
                    dbg.location(231,4);
                    pushFollow(FOLLOW_stringBag_in_containsOp1568);
                    stringBag170=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringBag.add(stringBag170.getTree());
                    dbg.location(231,14);
                    DOT171=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT171);

                    dbg.location(231,18);
                    CONTAINS172=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS172);

                    dbg.location(231,27);
                    LP173=(Token)match(input,LP,FOLLOW_LP_in_containsOp1574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP173);

                    dbg.location(231,30);
                    pushFollow(FOLLOW_stringExpr_in_containsOp1576);
                    stringExpr174=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(stringExpr174.getTree());
                    dbg.location(231,41);
                    RP175=(Token)match(input,RP,FOLLOW_RP_in_containsOp1578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP175);


                    // AST REWRITE
                    // elements: stringBag, CONTAINS, stringExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:3: -> ^( CONTAINS STRING stringBag stringExpr )
                    {
                        dbg.location(232,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:232:6: ^( CONTAINS STRING stringBag stringExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(232,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(232,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(232,24);
                        adaptor.addChild(root_1, stream_stringBag.nextTree());
                        dbg.location(232,34);
                        adaptor.addChild(root_1, stream_stringExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:233:4: anyUriBag DOT CONTAINS LP anyUriExpr RP
                    {
                    dbg.location(233,4);
                    pushFollow(FOLLOW_anyUriBag_in_containsOp1598);
                    anyUriBag176=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriBag.add(anyUriBag176.getTree());
                    dbg.location(233,14);
                    DOT177=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT177);

                    dbg.location(233,18);
                    CONTAINS178=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS178);

                    dbg.location(233,27);
                    LP179=(Token)match(input,LP,FOLLOW_LP_in_containsOp1604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP179);

                    dbg.location(233,30);
                    pushFollow(FOLLOW_anyUriExpr_in_containsOp1606);
                    anyUriExpr180=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(anyUriExpr180.getTree());
                    dbg.location(233,41);
                    RP181=(Token)match(input,RP,FOLLOW_RP_in_containsOp1608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP181);


                    // AST REWRITE
                    // elements: anyUriBag, CONTAINS, anyUriExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:3: -> ^( CONTAINS STRING anyUriBag anyUriExpr )
                    {
                        dbg.location(234,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:234:6: ^( CONTAINS STRING anyUriBag anyUriExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(234,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(234,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(234,24);
                        adaptor.addChild(root_1, stream_anyUriBag.nextTree());
                        dbg.location(234,34);
                        adaptor.addChild(root_1, stream_anyUriExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:235:4: dateBag DOT CONTAINS LP dateBag RP
                    {
                    dbg.location(235,4);
                    pushFollow(FOLLOW_dateBag_in_containsOp1627);
                    dateBag182=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateBag.add(dateBag182.getTree());
                    dbg.location(235,12);
                    DOT183=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT183);

                    dbg.location(235,16);
                    CONTAINS184=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS184);

                    dbg.location(235,25);
                    LP185=(Token)match(input,LP,FOLLOW_LP_in_containsOp1633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP185);

                    dbg.location(235,28);
                    pushFollow(FOLLOW_dateBag_in_containsOp1635);
                    dateBag186=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateBag.add(dateBag186.getTree());
                    dbg.location(235,36);
                    RP187=(Token)match(input,RP,FOLLOW_RP_in_containsOp1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP187);


                    // AST REWRITE
                    // elements: CONTAINS, dateBag, dateBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:3: -> ^( CONTAINS STRING dateBag dateBag )
                    {
                        dbg.location(236,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:236:6: ^( CONTAINS STRING dateBag dateBag )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(236,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(236,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(236,24);
                        adaptor.addChild(root_1, stream_dateBag.nextTree());
                        dbg.location(236,32);
                        adaptor.addChild(root_1, stream_dateBag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:237:4: timeBag DOT CONTAINS LP timeExpr RP
                    {
                    dbg.location(237,4);
                    pushFollow(FOLLOW_timeBag_in_containsOp1656);
                    timeBag188=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeBag.add(timeBag188.getTree());
                    dbg.location(237,12);
                    DOT189=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT189);

                    dbg.location(237,16);
                    CONTAINS190=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS190);

                    dbg.location(237,25);
                    LP191=(Token)match(input,LP,FOLLOW_LP_in_containsOp1662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP191);

                    dbg.location(237,28);
                    pushFollow(FOLLOW_timeExpr_in_containsOp1664);
                    timeExpr192=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr192.getTree());
                    dbg.location(237,37);
                    RP193=(Token)match(input,RP,FOLLOW_RP_in_containsOp1666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP193);


                    // AST REWRITE
                    // elements: timeExpr, CONTAINS, timeBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:3: -> ^( CONTAINS STRING timeBag timeExpr )
                    {
                        dbg.location(238,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:238:6: ^( CONTAINS STRING timeBag timeExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(238,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(238,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(238,24);
                        adaptor.addChild(root_1, stream_timeBag.nextTree());
                        dbg.location(238,32);
                        adaptor.addChild(root_1, stream_timeExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:239:4: dateTimeBag DOT CONTAINS LP dateTimeExpr RP
                    {
                    dbg.location(239,4);
                    pushFollow(FOLLOW_dateTimeBag_in_containsOp1685);
                    dateTimeBag194=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeBag.add(dateTimeBag194.getTree());
                    dbg.location(239,16);
                    DOT195=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT195);

                    dbg.location(239,20);
                    CONTAINS196=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS196);

                    dbg.location(239,29);
                    LP197=(Token)match(input,LP,FOLLOW_LP_in_containsOp1691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP197);

                    dbg.location(239,32);
                    pushFollow(FOLLOW_dateTimeExpr_in_containsOp1693);
                    dateTimeExpr198=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(dateTimeExpr198.getTree());
                    dbg.location(239,45);
                    RP199=(Token)match(input,RP,FOLLOW_RP_in_containsOp1695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP199);


                    // AST REWRITE
                    // elements: dateTimeBag, dateTimeExpr, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:3: -> ^( CONTAINS STRING dateTimeBag dateTimeExpr )
                    {
                        dbg.location(240,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:240:6: ^( CONTAINS STRING dateTimeBag dateTimeExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(240,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(240,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(240,24);
                        adaptor.addChild(root_1, stream_dateTimeBag.nextTree());
                        dbg.location(240,36);
                        adaptor.addChild(root_1, stream_dateTimeExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:241:4: base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP
                    {
                    dbg.location(241,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1714);
                    base64BinaryBag200=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(base64BinaryBag200.getTree());
                    dbg.location(241,20);
                    DOT201=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT201);

                    dbg.location(241,24);
                    CONTAINS202=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS202);

                    dbg.location(241,33);
                    LP203=(Token)match(input,LP,FOLLOW_LP_in_containsOp1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP203);

                    dbg.location(241,36);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1722);
                    base64BinaryExpr204=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr204.getTree());
                    dbg.location(241,53);
                    RP205=(Token)match(input,RP,FOLLOW_RP_in_containsOp1724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP205);


                    // AST REWRITE
                    // elements: CONTAINS, base64BinaryExpr, base64BinaryBag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 242:3: -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr )
                    {
                        dbg.location(242,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:242:6: ^( CONTAINS STRING base64BinaryBag base64BinaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(242,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(242,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(242,24);
                        adaptor.addChild(root_1, stream_base64BinaryBag.nextTree());
                        dbg.location(242,40);
                        adaptor.addChild(root_1, stream_base64BinaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:243:4: dayTimeDurationBag DOT CONTAINS LP dayTimeDurationExpr RP
                    {
                    dbg.location(243,4);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_containsOp1743);
                    dayTimeDurationBag206=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationBag.add(dayTimeDurationBag206.getTree());
                    dbg.location(243,23);
                    DOT207=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT207);

                    dbg.location(243,27);
                    CONTAINS208=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS208);

                    dbg.location(243,36);
                    LP209=(Token)match(input,LP,FOLLOW_LP_in_containsOp1749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP209);

                    dbg.location(243,39);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_containsOp1751);
                    dayTimeDurationExpr210=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(dayTimeDurationExpr210.getTree());
                    dbg.location(243,59);
                    RP211=(Token)match(input,RP,FOLLOW_RP_in_containsOp1753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP211);


                    // AST REWRITE
                    // elements: dayTimeDurationBag, CONTAINS, dayTimeDurationExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 244:3: -> ^( CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr )
                    {
                        dbg.location(244,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:244:6: ^( CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(244,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(244,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(244,24);
                        adaptor.addChild(root_1, stream_dayTimeDurationBag.nextTree());
                        dbg.location(244,43);
                        adaptor.addChild(root_1, stream_dayTimeDurationExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:245:4: yearMonthDurationBag DOT CONTAINS LP yearMonthDurationExpr RP
                    {
                    dbg.location(245,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_containsOp1772);
                    yearMonthDurationBag212=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationBag.add(yearMonthDurationBag212.getTree());
                    dbg.location(245,25);
                    DOT213=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT213);

                    dbg.location(245,29);
                    CONTAINS214=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS214);

                    dbg.location(245,38);
                    LP215=(Token)match(input,LP,FOLLOW_LP_in_containsOp1778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP215);

                    dbg.location(245,41);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_containsOp1780);
                    yearMonthDurationExpr216=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(yearMonthDurationExpr216.getTree());
                    dbg.location(245,63);
                    RP217=(Token)match(input,RP,FOLLOW_RP_in_containsOp1782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP217);


                    // AST REWRITE
                    // elements: yearMonthDurationBag, yearMonthDurationExpr, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:3: -> ^( CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr )
                    {
                        dbg.location(246,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:246:6: ^( CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(246,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(246,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(246,24);
                        adaptor.addChild(root_1, stream_yearMonthDurationBag.nextTree());
                        dbg.location(246,45);
                        adaptor.addChild(root_1, stream_yearMonthDurationExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:247:4: x500NameBag DOT CONTAINS LP x500NameExpr RP
                    {
                    dbg.location(247,4);
                    pushFollow(FOLLOW_x500NameBag_in_containsOp1801);
                    x500NameBag218=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameBag.add(x500NameBag218.getTree());
                    dbg.location(247,16);
                    DOT219=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT219);

                    dbg.location(247,20);
                    CONTAINS220=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS220);

                    dbg.location(247,29);
                    LP221=(Token)match(input,LP,FOLLOW_LP_in_containsOp1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP221);

                    dbg.location(247,32);
                    pushFollow(FOLLOW_x500NameExpr_in_containsOp1809);
                    x500NameExpr222=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(x500NameExpr222.getTree());
                    dbg.location(247,45);
                    RP223=(Token)match(input,RP,FOLLOW_RP_in_containsOp1811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP223);


                    // AST REWRITE
                    // elements: CONTAINS, x500NameBag, x500NameExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:3: -> ^( CONTAINS STRING x500NameBag x500NameExpr )
                    {
                        dbg.location(248,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:248:6: ^( CONTAINS STRING x500NameBag x500NameExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(248,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(248,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(248,24);
                        adaptor.addChild(root_1, stream_x500NameBag.nextTree());
                        dbg.location(248,36);
                        adaptor.addChild(root_1, stream_x500NameExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:249:4: rfc822NameBag DOT CONTAINS LP rfc822NameExpr RP
                    {
                    dbg.location(249,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_containsOp1830);
                    rfc822NameBag224=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameBag.add(rfc822NameBag224.getTree());
                    dbg.location(249,18);
                    DOT225=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT225);

                    dbg.location(249,22);
                    CONTAINS226=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS226);

                    dbg.location(249,31);
                    LP227=(Token)match(input,LP,FOLLOW_LP_in_containsOp1836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP227);

                    dbg.location(249,34);
                    pushFollow(FOLLOW_rfc822NameExpr_in_containsOp1838);
                    rfc822NameExpr228=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(rfc822NameExpr228.getTree());
                    dbg.location(249,49);
                    RP229=(Token)match(input,RP,FOLLOW_RP_in_containsOp1840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP229);


                    // AST REWRITE
                    // elements: rfc822NameExpr, rfc822NameBag, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 250:3: -> ^( CONTAINS STRING rfc822NameBag rfc822NameExpr )
                    {
                        dbg.location(250,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:250:6: ^( CONTAINS STRING rfc822NameBag rfc822NameExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(250,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(250,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(250,24);
                        adaptor.addChild(root_1, stream_rfc822NameBag.nextTree());
                        dbg.location(250,38);
                        adaptor.addChild(root_1, stream_rfc822NameExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:251:4: hexBinaryBag DOT CONTAINS LP hexBinaryExpr RP
                    {
                    dbg.location(251,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_containsOp1859);
                    hexBinaryBag230=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryBag.add(hexBinaryBag230.getTree());
                    dbg.location(251,17);
                    DOT231=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT231);

                    dbg.location(251,21);
                    CONTAINS232=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS232);

                    dbg.location(251,30);
                    LP233=(Token)match(input,LP,FOLLOW_LP_in_containsOp1865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP233);

                    dbg.location(251,33);
                    pushFollow(FOLLOW_hexBinaryExpr_in_containsOp1867);
                    hexBinaryExpr234=hexBinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryExpr.add(hexBinaryExpr234.getTree());
                    dbg.location(251,47);
                    RP235=(Token)match(input,RP,FOLLOW_RP_in_containsOp1869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP235);


                    // AST REWRITE
                    // elements: hexBinaryBag, CONTAINS, hexBinaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 252:3: -> ^( CONTAINS STRING hexBinaryBag hexBinaryExpr )
                    {
                        dbg.location(252,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:252:6: ^( CONTAINS STRING hexBinaryBag hexBinaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(252,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(252,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(252,24);
                        adaptor.addChild(root_1, stream_hexBinaryBag.nextTree());
                        dbg.location(252,37);
                        adaptor.addChild(root_1, stream_hexBinaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( base64BinaryExpr )=> base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP
                    {
                    dbg.location(253,26);
                    pushFollow(FOLLOW_base64BinaryBag_in_containsOp1894);
                    base64BinaryBag236=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(base64BinaryBag236.getTree());
                    dbg.location(253,42);
                    DOT237=(Token)match(input,DOT,FOLLOW_DOT_in_containsOp1896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT237);

                    dbg.location(253,46);
                    CONTAINS238=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_containsOp1898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS238);

                    dbg.location(253,55);
                    LP239=(Token)match(input,LP,FOLLOW_LP_in_containsOp1900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP239);

                    dbg.location(253,58);
                    pushFollow(FOLLOW_base64BinaryExpr_in_containsOp1902);
                    base64BinaryExpr240=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr240.getTree());
                    dbg.location(253,75);
                    RP241=(Token)match(input,RP,FOLLOW_RP_in_containsOp1904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP241);


                    // AST REWRITE
                    // elements: base64BinaryBag, base64BinaryExpr, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 254:3: -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr )
                    {
                        dbg.location(254,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:254:6: ^( CONTAINS STRING base64BinaryBag base64BinaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(254,8);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        dbg.location(254,17);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(254,24);
                        adaptor.addChild(root_1, stream_base64BinaryBag.nextTree());
                        dbg.location(254,40);
                        adaptor.addChild(root_1, stream_base64BinaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(255, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:257:1: equalityExpr : (l1= integerExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r1= integerExpr -> ^( $o INTEGER $l1 $r1) |l2= doubleExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r2= doubleExpr -> ^( $o DOUBLE $l2 $r2) |l3= stringExpr (o= EQ | GE | GT | LT | LE ) r3= stringExpr -> ^( $o STRING $l3 $r3) |l4= anyUriExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r4= anyUriExpr -> ^( $o ANYURI $l4 $r4) |l5= dateExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r5= dateExpr -> ^( $o DATE $l5 $r5) |l6= timeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r6= timeExpr -> ^( $o TIME $l6 $r6) |l7= dateTimeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r7= dateTimeExpr -> ^( $o DATETIME $l7 $r7) |l8= yearMonthDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r8= yearMonthDurationExpr -> ^( $o YEARMONTHDURATION $l8 $r8) |l9= x500NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r9= x500NameExpr -> ^( $o X500NAME $l9 $r9) |lA= rfc822NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rA= rfc822NameExpr -> ^( $o RFC822NAME $lA $rA) |lB= dayTimeDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rB= dayTimeDurationExpr -> ^( $o DAYTIMEDURATION $lB $rB) |lC= base64BinaryExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rC= base64BinaryExpr -> ^( $o BASE64BINARY $lC $rC) );
    public final GrammarParser.equalityExpr_return equalityExpr() throws RecognitionException {
        GrammarParser.equalityExpr_return retval = new GrammarParser.equalityExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        Token GE242=null;
        Token GT243=null;
        Token LT244=null;
        Token LE245=null;
        GrammarParser.integerExpr_return l1 =null;

        GrammarParser.integerExpr_return r1 =null;

        GrammarParser.doubleExpr_return l2 =null;

        GrammarParser.doubleExpr_return r2 =null;

        GrammarParser.stringExpr_return l3 =null;

        GrammarParser.stringExpr_return r3 =null;

        GrammarParser.anyUriExpr_return l4 =null;

        GrammarParser.anyUriExpr_return r4 =null;

        GrammarParser.dateExpr_return l5 =null;

        GrammarParser.dateExpr_return r5 =null;

        GrammarParser.timeExpr_return l6 =null;

        GrammarParser.timeExpr_return r6 =null;

        GrammarParser.dateTimeExpr_return l7 =null;

        GrammarParser.dateTimeExpr_return r7 =null;

        GrammarParser.yearMonthDurationExpr_return l8 =null;

        GrammarParser.yearMonthDurationExpr_return r8 =null;

        GrammarParser.x500NameExpr_return l9 =null;

        GrammarParser.x500NameExpr_return r9 =null;

        GrammarParser.rfc822NameExpr_return lA =null;

        GrammarParser.rfc822NameExpr_return rA =null;

        GrammarParser.dayTimeDurationExpr_return lB =null;

        GrammarParser.dayTimeDurationExpr_return rB =null;

        GrammarParser.base64BinaryExpr_return lC =null;

        GrammarParser.base64BinaryExpr_return rC =null;


        CommonTree o_tree=null;
        CommonTree GE242_tree=null;
        CommonTree GT243_tree=null;
        CommonTree LT244_tree=null;
        CommonTree LE245_tree=null;
        RewriteRuleTokenStream stream_GE=new RewriteRuleTokenStream(adaptor,"token GE");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_LE=new RewriteRuleTokenStream(adaptor,"token LE");
        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_dayTimeDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationExpr");
        RewriteRuleSubtreeStream stream_doubleExpr=new RewriteRuleSubtreeStream(adaptor,"rule doubleExpr");
        RewriteRuleSubtreeStream stream_stringExpr=new RewriteRuleSubtreeStream(adaptor,"rule stringExpr");
        RewriteRuleSubtreeStream stream_base64BinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryExpr");
        RewriteRuleSubtreeStream stream_x500NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule x500NameExpr");
        RewriteRuleSubtreeStream stream_anyUriExpr=new RewriteRuleSubtreeStream(adaptor,"rule anyUriExpr");
        RewriteRuleSubtreeStream stream_dateTimeExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeExpr");
        RewriteRuleSubtreeStream stream_rfc822NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameExpr");
        RewriteRuleSubtreeStream stream_integerExpr=new RewriteRuleSubtreeStream(adaptor,"rule integerExpr");
        RewriteRuleSubtreeStream stream_yearMonthDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationExpr");
        RewriteRuleSubtreeStream stream_dateExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateExpr");
        try { dbg.enterRule(getGrammarFileName(), "equalityExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:2: (l1= integerExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r1= integerExpr -> ^( $o INTEGER $l1 $r1) |l2= doubleExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r2= doubleExpr -> ^( $o DOUBLE $l2 $r2) |l3= stringExpr (o= EQ | GE | GT | LT | LE ) r3= stringExpr -> ^( $o STRING $l3 $r3) |l4= anyUriExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r4= anyUriExpr -> ^( $o ANYURI $l4 $r4) |l5= dateExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r5= dateExpr -> ^( $o DATE $l5 $r5) |l6= timeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r6= timeExpr -> ^( $o TIME $l6 $r6) |l7= dateTimeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r7= dateTimeExpr -> ^( $o DATETIME $l7 $r7) |l8= yearMonthDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r8= yearMonthDurationExpr -> ^( $o YEARMONTHDURATION $l8 $r8) |l9= x500NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r9= x500NameExpr -> ^( $o X500NAME $l9 $r9) |lA= rfc822NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rA= rfc822NameExpr -> ^( $o RFC822NAME $lA $rA) |lB= dayTimeDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rB= dayTimeDurationExpr -> ^( $o DAYTIMEDURATION $lB $rB) |lC= base64BinaryExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rC= base64BinaryExpr -> ^( $o BASE64BINARY $lC $rC) )
            int alt31=12;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            try {
                isCyclicDecision = true;
                alt31 = dfa31.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:4: l1= integerExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r1= integerExpr
                    {
                    dbg.location(258,6);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1931);
                    l1=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerExpr.add(l1.getTree());
                    dbg.location(258,19);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:19: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt19=5;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt19=1;
                        }
                        break;
                    case GE:
                        {
                        alt19=2;
                        }
                        break;
                    case GT:
                        {
                        alt19=3;
                        }
                        break;
                    case LT:
                        {
                        alt19=4;
                        }
                        break;
                    case LE:
                        {
                        alt19=5;
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:21: o= EQ
                            {
                            dbg.location(258,22);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr1937); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:28: o= GE
                            {
                            dbg.location(258,29);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr1943); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:35: o= GT
                            {
                            dbg.location(258,36);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr1949); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:42: o= LT
                            {
                            dbg.location(258,43);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr1955); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:258:49: o= LE
                            {
                            dbg.location(258,50);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr1961); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(258,58);
                    pushFollow(FOLLOW_integerExpr_in_equalityExpr1967);
                    r1=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerExpr.add(r1.getTree());

                    // AST REWRITE
                    // elements: l1, r1, o
                    // token labels: o
                    // rule labels: retval, r1, l1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r1=new RewriteRuleSubtreeStream(adaptor,"rule r1",r1!=null?r1.tree:null);
                    RewriteRuleSubtreeStream stream_l1=new RewriteRuleSubtreeStream(adaptor,"rule l1",l1!=null?l1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 259:3: -> ^( $o INTEGER $l1 $r1)
                    {
                        dbg.location(259,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:259:6: ^( $o INTEGER $l1 $r1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(259,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(259,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(259,20);
                        adaptor.addChild(root_1, stream_l1.nextTree());
                        dbg.location(259,24);
                        adaptor.addChild(root_1, stream_r1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:4: l2= doubleExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r2= doubleExpr
                    {
                    dbg.location(260,6);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr1991);
                    l2=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(l2.getTree());
                    dbg.location(260,18);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:18: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt20=5;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt20=1;
                        }
                        break;
                    case GE:
                        {
                        alt20=2;
                        }
                        break;
                    case GT:
                        {
                        alt20=3;
                        }
                        break;
                    case LT:
                        {
                        alt20=4;
                        }
                        break;
                    case LE:
                        {
                        alt20=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:20: o= EQ
                            {
                            dbg.location(260,21);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr1997); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:27: o= GE
                            {
                            dbg.location(260,28);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2003); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:34: o= GT
                            {
                            dbg.location(260,35);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:41: o= LT
                            {
                            dbg.location(260,42);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:260:48: o= LE
                            {
                            dbg.location(260,49);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2021); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(260,57);
                    pushFollow(FOLLOW_doubleExpr_in_equalityExpr2027);
                    r2=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(r2.getTree());

                    // AST REWRITE
                    // elements: l2, o, r2
                    // token labels: o
                    // rule labels: retval, l2, r2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);
                    RewriteRuleSubtreeStream stream_r2=new RewriteRuleSubtreeStream(adaptor,"rule r2",r2!=null?r2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 261:3: -> ^( $o DOUBLE $l2 $r2)
                    {
                        dbg.location(261,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:261:6: ^( $o DOUBLE $l2 $r2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(261,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(261,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DOUBLE, "DOUBLE")
                        );
                        dbg.location(261,19);
                        adaptor.addChild(root_1, stream_l2.nextTree());
                        dbg.location(261,23);
                        adaptor.addChild(root_1, stream_r2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:4: l3= stringExpr (o= EQ | GE | GT | LT | LE ) r3= stringExpr
                    {
                    dbg.location(262,6);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr2051);
                    l3=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(l3.getTree());
                    dbg.location(262,18);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:18: (o= EQ | GE | GT | LT | LE )
                    int alt21=5;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt21=1;
                        }
                        break;
                    case GE:
                        {
                        alt21=2;
                        }
                        break;
                    case GT:
                        {
                        alt21=3;
                        }
                        break;
                    case LT:
                        {
                        alt21=4;
                        }
                        break;
                    case LE:
                        {
                        alt21=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:20: o= EQ
                            {
                            dbg.location(262,21);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2057); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:27: GE
                            {
                            dbg.location(262,27);
                            GE242=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2061); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(GE242);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:32: GT
                            {
                            dbg.location(262,32);
                            GT243=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2065); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(GT243);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:37: LT
                            {
                            dbg.location(262,37);
                            LT244=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2069); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(LT244);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:262:42: LE
                            {
                            dbg.location(262,42);
                            LE245=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2073); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(LE245);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(262,49);
                    pushFollow(FOLLOW_stringExpr_in_equalityExpr2079);
                    r3=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(r3.getTree());

                    // AST REWRITE
                    // elements: r3, l3, o
                    // token labels: o
                    // rule labels: retval, l3, r3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);
                    RewriteRuleSubtreeStream stream_r3=new RewriteRuleSubtreeStream(adaptor,"rule r3",r3!=null?r3.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 263:3: -> ^( $o STRING $l3 $r3)
                    {
                        dbg.location(263,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:263:6: ^( $o STRING $l3 $r3)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(263,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(263,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(263,19);
                        adaptor.addChild(root_1, stream_l3.nextTree());
                        dbg.location(263,23);
                        adaptor.addChild(root_1, stream_r3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:4: l4= anyUriExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r4= anyUriExpr
                    {
                    dbg.location(264,6);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr2103);
                    l4=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(l4.getTree());
                    dbg.location(264,18);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:18: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt22=5;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt22=1;
                        }
                        break;
                    case GE:
                        {
                        alt22=2;
                        }
                        break;
                    case GT:
                        {
                        alt22=3;
                        }
                        break;
                    case LT:
                        {
                        alt22=4;
                        }
                        break;
                    case LE:
                        {
                        alt22=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:20: o= EQ
                            {
                            dbg.location(264,21);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2109); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:27: o= GE
                            {
                            dbg.location(264,28);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2115); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:34: o= GT
                            {
                            dbg.location(264,35);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2121); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:41: o= LT
                            {
                            dbg.location(264,42);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2127); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:264:48: o= LE
                            {
                            dbg.location(264,49);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2133); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(264,57);
                    pushFollow(FOLLOW_anyUriExpr_in_equalityExpr2139);
                    r4=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(r4.getTree());

                    // AST REWRITE
                    // elements: l4, o, r4
                    // token labels: o
                    // rule labels: retval, l4, r4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l4=new RewriteRuleSubtreeStream(adaptor,"rule l4",l4!=null?l4.tree:null);
                    RewriteRuleSubtreeStream stream_r4=new RewriteRuleSubtreeStream(adaptor,"rule r4",r4!=null?r4.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 265:3: -> ^( $o ANYURI $l4 $r4)
                    {
                        dbg.location(265,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:265:6: ^( $o ANYURI $l4 $r4)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(265,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(265,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ANYURI, "ANYURI")
                        );
                        dbg.location(265,19);
                        adaptor.addChild(root_1, stream_l4.nextTree());
                        dbg.location(265,23);
                        adaptor.addChild(root_1, stream_r4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:4: l5= dateExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r5= dateExpr
                    {
                    dbg.location(266,6);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr2163);
                    l5=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateExpr.add(l5.getTree());
                    dbg.location(266,16);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:16: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt23=5;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt23=1;
                        }
                        break;
                    case GE:
                        {
                        alt23=2;
                        }
                        break;
                    case GT:
                        {
                        alt23=3;
                        }
                        break;
                    case LT:
                        {
                        alt23=4;
                        }
                        break;
                    case LE:
                        {
                        alt23=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:18: o= EQ
                            {
                            dbg.location(266,19);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2169); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:25: o= GE
                            {
                            dbg.location(266,26);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2175); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:32: o= GT
                            {
                            dbg.location(266,33);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2181); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:39: o= LT
                            {
                            dbg.location(266,40);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2187); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:266:46: o= LE
                            {
                            dbg.location(266,47);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2193); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(266,55);
                    pushFollow(FOLLOW_dateExpr_in_equalityExpr2199);
                    r5=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateExpr.add(r5.getTree());

                    // AST REWRITE
                    // elements: r5, l5, o
                    // token labels: o
                    // rule labels: retval, l5, r5
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l5=new RewriteRuleSubtreeStream(adaptor,"rule l5",l5!=null?l5.tree:null);
                    RewriteRuleSubtreeStream stream_r5=new RewriteRuleSubtreeStream(adaptor,"rule r5",r5!=null?r5.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:3: -> ^( $o DATE $l5 $r5)
                    {
                        dbg.location(267,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:267:6: ^( $o DATE $l5 $r5)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(267,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(267,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATE, "DATE")
                        );
                        dbg.location(267,17);
                        adaptor.addChild(root_1, stream_l5.nextTree());
                        dbg.location(267,21);
                        adaptor.addChild(root_1, stream_r5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:4: l6= timeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r6= timeExpr
                    {
                    dbg.location(268,6);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr2223);
                    l6=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(l6.getTree());
                    dbg.location(268,16);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:16: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt24=5;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt24=1;
                        }
                        break;
                    case GE:
                        {
                        alt24=2;
                        }
                        break;
                    case GT:
                        {
                        alt24=3;
                        }
                        break;
                    case LT:
                        {
                        alt24=4;
                        }
                        break;
                    case LE:
                        {
                        alt24=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:18: o= EQ
                            {
                            dbg.location(268,19);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2229); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:25: o= GE
                            {
                            dbg.location(268,26);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2235); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:32: o= GT
                            {
                            dbg.location(268,33);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2241); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:39: o= LT
                            {
                            dbg.location(268,40);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2247); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:268:46: o= LE
                            {
                            dbg.location(268,47);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2253); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(268,55);
                    pushFollow(FOLLOW_timeExpr_in_equalityExpr2259);
                    r6=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(r6.getTree());

                    // AST REWRITE
                    // elements: o, l6, r6
                    // token labels: o
                    // rule labels: retval, l6, r6
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l6=new RewriteRuleSubtreeStream(adaptor,"rule l6",l6!=null?l6.tree:null);
                    RewriteRuleSubtreeStream stream_r6=new RewriteRuleSubtreeStream(adaptor,"rule r6",r6!=null?r6.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 269:3: -> ^( $o TIME $l6 $r6)
                    {
                        dbg.location(269,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:269:6: ^( $o TIME $l6 $r6)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(269,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(269,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TIME, "TIME")
                        );
                        dbg.location(269,17);
                        adaptor.addChild(root_1, stream_l6.nextTree());
                        dbg.location(269,21);
                        adaptor.addChild(root_1, stream_r6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:4: l7= dateTimeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r7= dateTimeExpr
                    {
                    dbg.location(270,6);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr2283);
                    l7=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(l7.getTree());
                    dbg.location(270,20);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:20: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt25=5;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt25=1;
                        }
                        break;
                    case GE:
                        {
                        alt25=2;
                        }
                        break;
                    case GT:
                        {
                        alt25=3;
                        }
                        break;
                    case LT:
                        {
                        alt25=4;
                        }
                        break;
                    case LE:
                        {
                        alt25=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:22: o= EQ
                            {
                            dbg.location(270,23);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2289); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:29: o= GE
                            {
                            dbg.location(270,30);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2295); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:36: o= GT
                            {
                            dbg.location(270,37);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2301); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:43: o= LT
                            {
                            dbg.location(270,44);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2307); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:270:50: o= LE
                            {
                            dbg.location(270,51);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2313); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}

                    dbg.location(270,59);
                    pushFollow(FOLLOW_dateTimeExpr_in_equalityExpr2319);
                    r7=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(r7.getTree());

                    // AST REWRITE
                    // elements: o, l7, r7
                    // token labels: o
                    // rule labels: retval, l7, r7
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l7=new RewriteRuleSubtreeStream(adaptor,"rule l7",l7!=null?l7.tree:null);
                    RewriteRuleSubtreeStream stream_r7=new RewriteRuleSubtreeStream(adaptor,"rule r7",r7!=null?r7.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:3: -> ^( $o DATETIME $l7 $r7)
                    {
                        dbg.location(271,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:271:6: ^( $o DATETIME $l7 $r7)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(271,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(271,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATETIME, "DATETIME")
                        );
                        dbg.location(271,21);
                        adaptor.addChild(root_1, stream_l7.nextTree());
                        dbg.location(271,25);
                        adaptor.addChild(root_1, stream_r7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:4: l8= yearMonthDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r8= yearMonthDurationExpr
                    {
                    dbg.location(272,6);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr2343);
                    l8=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(l8.getTree());
                    dbg.location(272,29);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:29: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt26=5;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt26=1;
                        }
                        break;
                    case GE:
                        {
                        alt26=2;
                        }
                        break;
                    case GT:
                        {
                        alt26=3;
                        }
                        break;
                    case LT:
                        {
                        alt26=4;
                        }
                        break;
                    case LE:
                        {
                        alt26=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:31: o= EQ
                            {
                            dbg.location(272,32);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2349); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:38: o= GE
                            {
                            dbg.location(272,39);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2355); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:45: o= GT
                            {
                            dbg.location(272,46);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2361); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:52: o= LT
                            {
                            dbg.location(272,53);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2367); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:272:59: o= LE
                            {
                            dbg.location(272,60);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2373); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}

                    dbg.location(272,68);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_equalityExpr2379);
                    r8=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(r8.getTree());

                    // AST REWRITE
                    // elements: o, l8, r8
                    // token labels: o
                    // rule labels: retval, l8, r8
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l8=new RewriteRuleSubtreeStream(adaptor,"rule l8",l8!=null?l8.tree:null);
                    RewriteRuleSubtreeStream stream_r8=new RewriteRuleSubtreeStream(adaptor,"rule r8",r8!=null?r8.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:3: -> ^( $o YEARMONTHDURATION $l8 $r8)
                    {
                        dbg.location(273,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:273:6: ^( $o YEARMONTHDURATION $l8 $r8)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(273,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(273,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(YEARMONTHDURATION, "YEARMONTHDURATION")
                        );
                        dbg.location(273,30);
                        adaptor.addChild(root_1, stream_l8.nextTree());
                        dbg.location(273,34);
                        adaptor.addChild(root_1, stream_r8.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:4: l9= x500NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r9= x500NameExpr
                    {
                    dbg.location(274,6);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr2403);
                    l9=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(l9.getTree());
                    dbg.location(274,20);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:20: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt27=5;
                    try { dbg.enterSubRule(27);
                    try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt27=1;
                        }
                        break;
                    case GE:
                        {
                        alt27=2;
                        }
                        break;
                    case GT:
                        {
                        alt27=3;
                        }
                        break;
                    case LT:
                        {
                        alt27=4;
                        }
                        break;
                    case LE:
                        {
                        alt27=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:22: o= EQ
                            {
                            dbg.location(274,23);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2409); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:29: o= GE
                            {
                            dbg.location(274,30);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2415); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:36: o= GT
                            {
                            dbg.location(274,37);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2421); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:43: o= LT
                            {
                            dbg.location(274,44);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2427); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:274:50: o= LE
                            {
                            dbg.location(274,51);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2433); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(27);}

                    dbg.location(274,59);
                    pushFollow(FOLLOW_x500NameExpr_in_equalityExpr2439);
                    r9=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(r9.getTree());

                    // AST REWRITE
                    // elements: o, r9, l9
                    // token labels: o
                    // rule labels: retval, l9, r9
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l9=new RewriteRuleSubtreeStream(adaptor,"rule l9",l9!=null?l9.tree:null);
                    RewriteRuleSubtreeStream stream_r9=new RewriteRuleSubtreeStream(adaptor,"rule r9",r9!=null?r9.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 275:3: -> ^( $o X500NAME $l9 $r9)
                    {
                        dbg.location(275,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:275:6: ^( $o X500NAME $l9 $r9)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(275,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(275,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(X500NAME, "X500NAME")
                        );
                        dbg.location(275,21);
                        adaptor.addChild(root_1, stream_l9.nextTree());
                        dbg.location(275,25);
                        adaptor.addChild(root_1, stream_r9.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:4: lA= rfc822NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rA= rfc822NameExpr
                    {
                    dbg.location(276,6);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr2463);
                    lA=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(lA.getTree());
                    dbg.location(276,22);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:22: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt28=5;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt28=1;
                        }
                        break;
                    case GE:
                        {
                        alt28=2;
                        }
                        break;
                    case GT:
                        {
                        alt28=3;
                        }
                        break;
                    case LT:
                        {
                        alt28=4;
                        }
                        break;
                    case LE:
                        {
                        alt28=5;
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:24: o= EQ
                            {
                            dbg.location(276,25);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2469); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:31: o= GE
                            {
                            dbg.location(276,32);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2475); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:38: o= GT
                            {
                            dbg.location(276,39);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2481); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:45: o= LT
                            {
                            dbg.location(276,46);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2487); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:276:52: o= LE
                            {
                            dbg.location(276,53);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2493); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}

                    dbg.location(276,61);
                    pushFollow(FOLLOW_rfc822NameExpr_in_equalityExpr2499);
                    rA=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(rA.getTree());

                    // AST REWRITE
                    // elements: o, rA, lA
                    // token labels: o
                    // rule labels: retval, rA, lA
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_rA=new RewriteRuleSubtreeStream(adaptor,"rule rA",rA!=null?rA.tree:null);
                    RewriteRuleSubtreeStream stream_lA=new RewriteRuleSubtreeStream(adaptor,"rule lA",lA!=null?lA.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 277:3: -> ^( $o RFC822NAME $lA $rA)
                    {
                        dbg.location(277,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:277:6: ^( $o RFC822NAME $lA $rA)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(277,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(277,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(RFC822NAME, "RFC822NAME")
                        );
                        dbg.location(277,23);
                        adaptor.addChild(root_1, stream_lA.nextTree());
                        dbg.location(277,27);
                        adaptor.addChild(root_1, stream_rA.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:4: lB= dayTimeDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rB= dayTimeDurationExpr
                    {
                    dbg.location(278,6);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr2523);
                    lB=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(lB.getTree());
                    dbg.location(278,27);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:27: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt29=5;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt29=1;
                        }
                        break;
                    case GE:
                        {
                        alt29=2;
                        }
                        break;
                    case GT:
                        {
                        alt29=3;
                        }
                        break;
                    case LT:
                        {
                        alt29=4;
                        }
                        break;
                    case LE:
                        {
                        alt29=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:29: o= EQ
                            {
                            dbg.location(278,30);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2529); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:36: o= GE
                            {
                            dbg.location(278,37);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2535); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:43: o= GT
                            {
                            dbg.location(278,44);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2541); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:50: o= LT
                            {
                            dbg.location(278,51);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2547); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:278:57: o= LE
                            {
                            dbg.location(278,58);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2553); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(278,66);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_equalityExpr2559);
                    rB=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(rB.getTree());

                    // AST REWRITE
                    // elements: o, lB, rB
                    // token labels: o
                    // rule labels: retval, lB, rB
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lB=new RewriteRuleSubtreeStream(adaptor,"rule lB",lB!=null?lB.tree:null);
                    RewriteRuleSubtreeStream stream_rB=new RewriteRuleSubtreeStream(adaptor,"rule rB",rB!=null?rB.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 279:3: -> ^( $o DAYTIMEDURATION $lB $rB)
                    {
                        dbg.location(279,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:279:6: ^( $o DAYTIMEDURATION $lB $rB)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(279,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(279,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DAYTIMEDURATION, "DAYTIMEDURATION")
                        );
                        dbg.location(279,28);
                        adaptor.addChild(root_1, stream_lB.nextTree());
                        dbg.location(279,32);
                        adaptor.addChild(root_1, stream_rB.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:4: lC= base64BinaryExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rC= base64BinaryExpr
                    {
                    dbg.location(280,6);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr2583);
                    lC=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(lC.getTree());
                    dbg.location(280,24);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:24: (o= EQ |o= GE |o= GT |o= LT |o= LE )
                    int alt30=5;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt30=1;
                        }
                        break;
                    case GE:
                        {
                        alt30=2;
                        }
                        break;
                    case GT:
                        {
                        alt30=3;
                        }
                        break;
                    case LT:
                        {
                        alt30=4;
                        }
                        break;
                    case LE:
                        {
                        alt30=5;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:26: o= EQ
                            {
                            dbg.location(280,27);
                            o=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr2589); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQ.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:33: o= GE
                            {
                            dbg.location(280,34);
                            o=(Token)match(input,GE,FOLLOW_GE_in_equalityExpr2595); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GE.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:40: o= GT
                            {
                            dbg.location(280,41);
                            o=(Token)match(input,GT,FOLLOW_GT_in_equalityExpr2601); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_GT.add(o);


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:47: o= LT
                            {
                            dbg.location(280,48);
                            o=(Token)match(input,LT,FOLLOW_LT_in_equalityExpr2607); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LT.add(o);


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:280:54: o= LE
                            {
                            dbg.location(280,55);
                            o=(Token)match(input,LE,FOLLOW_LE_in_equalityExpr2613); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LE.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(280,63);
                    pushFollow(FOLLOW_base64BinaryExpr_in_equalityExpr2619);
                    rC=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(rC.getTree());

                    // AST REWRITE
                    // elements: o, rC, lC
                    // token labels: o
                    // rule labels: retval, lC, rC
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lC=new RewriteRuleSubtreeStream(adaptor,"rule lC",lC!=null?lC.tree:null);
                    RewriteRuleSubtreeStream stream_rC=new RewriteRuleSubtreeStream(adaptor,"rule rC",rC!=null?rC.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 281:3: -> ^( $o BASE64BINARY $lC $rC)
                    {
                        dbg.location(281,6);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:281:6: ^( $o BASE64BINARY $lC $rC)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(281,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(281,11);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BASE64BINARY, "BASE64BINARY")
                        );
                        dbg.location(281,25);
                        adaptor.addChild(root_1, stream_lC.nextTree());
                        dbg.location(281,29);
                        adaptor.addChild(root_1, stream_rC.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(282, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:284:1: regexOp : (l= integerExpr DOT REGEXMATCH LP r= integerExpr RP -> ^( REGEXMATCH INTEGER $l $r) | doubleExpr DOT REGEXMATCH LP doubleExpr RP -> ^( REGEXMATCH INTEGER $l $r) | stringExpr DOT REGEXMATCH LP stringExpr RP -> ^( REGEXMATCH INTEGER $l $r) | anyUriExpr DOT REGEXMATCH LP anyUriExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateExpr DOT REGEXMATCH LP dateExpr RP -> ^( REGEXMATCH INTEGER $l $r) | timeExpr DOT REGEXMATCH LP timeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateTimeExpr DOT REGEXMATCH LP dateTimeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dayTimeDurationExpr DOT REGEXMATCH LP dayTimeDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | yearMonthDurationExpr DOT REGEXMATCH LP yearMonthDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | x500NameExpr DOT REGEXMATCH LP x500NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | rfc822NameExpr DOT REGEXMATCH LP rfc822NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | base64BinaryExpr DOT REGEXMATCH LP base64BinaryExpr RP -> ^( REGEXMATCH INTEGER $l $r) );
    public final GrammarParser.regexOp_return regexOp() throws RecognitionException {
        GrammarParser.regexOp_return retval = new GrammarParser.regexOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT246=null;
        Token REGEXMATCH247=null;
        Token LP248=null;
        Token RP249=null;
        Token DOT251=null;
        Token REGEXMATCH252=null;
        Token LP253=null;
        Token RP255=null;
        Token DOT257=null;
        Token REGEXMATCH258=null;
        Token LP259=null;
        Token RP261=null;
        Token DOT263=null;
        Token REGEXMATCH264=null;
        Token LP265=null;
        Token RP267=null;
        Token DOT269=null;
        Token REGEXMATCH270=null;
        Token LP271=null;
        Token RP273=null;
        Token DOT275=null;
        Token REGEXMATCH276=null;
        Token LP277=null;
        Token RP279=null;
        Token DOT281=null;
        Token REGEXMATCH282=null;
        Token LP283=null;
        Token RP285=null;
        Token DOT287=null;
        Token REGEXMATCH288=null;
        Token LP289=null;
        Token RP291=null;
        Token DOT293=null;
        Token REGEXMATCH294=null;
        Token LP295=null;
        Token RP297=null;
        Token DOT299=null;
        Token REGEXMATCH300=null;
        Token LP301=null;
        Token RP303=null;
        Token DOT305=null;
        Token REGEXMATCH306=null;
        Token LP307=null;
        Token RP309=null;
        Token DOT311=null;
        Token REGEXMATCH312=null;
        Token LP313=null;
        Token RP315=null;
        GrammarParser.integerExpr_return l =null;

        GrammarParser.integerExpr_return r =null;

        GrammarParser.doubleExpr_return doubleExpr250 =null;

        GrammarParser.doubleExpr_return doubleExpr254 =null;

        GrammarParser.stringExpr_return stringExpr256 =null;

        GrammarParser.stringExpr_return stringExpr260 =null;

        GrammarParser.anyUriExpr_return anyUriExpr262 =null;

        GrammarParser.anyUriExpr_return anyUriExpr266 =null;

        GrammarParser.dateExpr_return dateExpr268 =null;

        GrammarParser.dateExpr_return dateExpr272 =null;

        GrammarParser.timeExpr_return timeExpr274 =null;

        GrammarParser.timeExpr_return timeExpr278 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr280 =null;

        GrammarParser.dateTimeExpr_return dateTimeExpr284 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr286 =null;

        GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr290 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr292 =null;

        GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr296 =null;

        GrammarParser.x500NameExpr_return x500NameExpr298 =null;

        GrammarParser.x500NameExpr_return x500NameExpr302 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr304 =null;

        GrammarParser.rfc822NameExpr_return rfc822NameExpr308 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr310 =null;

        GrammarParser.base64BinaryExpr_return base64BinaryExpr314 =null;


        CommonTree DOT246_tree=null;
        CommonTree REGEXMATCH247_tree=null;
        CommonTree LP248_tree=null;
        CommonTree RP249_tree=null;
        CommonTree DOT251_tree=null;
        CommonTree REGEXMATCH252_tree=null;
        CommonTree LP253_tree=null;
        CommonTree RP255_tree=null;
        CommonTree DOT257_tree=null;
        CommonTree REGEXMATCH258_tree=null;
        CommonTree LP259_tree=null;
        CommonTree RP261_tree=null;
        CommonTree DOT263_tree=null;
        CommonTree REGEXMATCH264_tree=null;
        CommonTree LP265_tree=null;
        CommonTree RP267_tree=null;
        CommonTree DOT269_tree=null;
        CommonTree REGEXMATCH270_tree=null;
        CommonTree LP271_tree=null;
        CommonTree RP273_tree=null;
        CommonTree DOT275_tree=null;
        CommonTree REGEXMATCH276_tree=null;
        CommonTree LP277_tree=null;
        CommonTree RP279_tree=null;
        CommonTree DOT281_tree=null;
        CommonTree REGEXMATCH282_tree=null;
        CommonTree LP283_tree=null;
        CommonTree RP285_tree=null;
        CommonTree DOT287_tree=null;
        CommonTree REGEXMATCH288_tree=null;
        CommonTree LP289_tree=null;
        CommonTree RP291_tree=null;
        CommonTree DOT293_tree=null;
        CommonTree REGEXMATCH294_tree=null;
        CommonTree LP295_tree=null;
        CommonTree RP297_tree=null;
        CommonTree DOT299_tree=null;
        CommonTree REGEXMATCH300_tree=null;
        CommonTree LP301_tree=null;
        CommonTree RP303_tree=null;
        CommonTree DOT305_tree=null;
        CommonTree REGEXMATCH306_tree=null;
        CommonTree LP307_tree=null;
        CommonTree RP309_tree=null;
        CommonTree DOT311_tree=null;
        CommonTree REGEXMATCH312_tree=null;
        CommonTree LP313_tree=null;
        CommonTree RP315_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_REGEXMATCH=new RewriteRuleTokenStream(adaptor,"token REGEXMATCH");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_dayTimeDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationExpr");
        RewriteRuleSubtreeStream stream_doubleExpr=new RewriteRuleSubtreeStream(adaptor,"rule doubleExpr");
        RewriteRuleSubtreeStream stream_stringExpr=new RewriteRuleSubtreeStream(adaptor,"rule stringExpr");
        RewriteRuleSubtreeStream stream_base64BinaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryExpr");
        RewriteRuleSubtreeStream stream_x500NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule x500NameExpr");
        RewriteRuleSubtreeStream stream_anyUriExpr=new RewriteRuleSubtreeStream(adaptor,"rule anyUriExpr");
        RewriteRuleSubtreeStream stream_dateTimeExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeExpr");
        RewriteRuleSubtreeStream stream_rfc822NameExpr=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameExpr");
        RewriteRuleSubtreeStream stream_integerExpr=new RewriteRuleSubtreeStream(adaptor,"rule integerExpr");
        RewriteRuleSubtreeStream stream_yearMonthDurationExpr=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationExpr");
        RewriteRuleSubtreeStream stream_dateExpr=new RewriteRuleSubtreeStream(adaptor,"rule dateExpr");
        try { dbg.enterRule(getGrammarFileName(), "regexOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:2: (l= integerExpr DOT REGEXMATCH LP r= integerExpr RP -> ^( REGEXMATCH INTEGER $l $r) | doubleExpr DOT REGEXMATCH LP doubleExpr RP -> ^( REGEXMATCH INTEGER $l $r) | stringExpr DOT REGEXMATCH LP stringExpr RP -> ^( REGEXMATCH INTEGER $l $r) | anyUriExpr DOT REGEXMATCH LP anyUriExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateExpr DOT REGEXMATCH LP dateExpr RP -> ^( REGEXMATCH INTEGER $l $r) | timeExpr DOT REGEXMATCH LP timeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateTimeExpr DOT REGEXMATCH LP dateTimeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dayTimeDurationExpr DOT REGEXMATCH LP dayTimeDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | yearMonthDurationExpr DOT REGEXMATCH LP yearMonthDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | x500NameExpr DOT REGEXMATCH LP x500NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | rfc822NameExpr DOT REGEXMATCH LP rfc822NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | base64BinaryExpr DOT REGEXMATCH LP base64BinaryExpr RP -> ^( REGEXMATCH INTEGER $l $r) )
            int alt32=12;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            try {
                isCyclicDecision = true;
                alt32 = dfa32.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:285:4: l= integerExpr DOT REGEXMATCH LP r= integerExpr RP
                    {
                    dbg.location(285,5);
                    pushFollow(FOLLOW_integerExpr_in_regexOp2649);
                    l=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerExpr.add(l.getTree());
                    dbg.location(285,18);
                    DOT246=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT246);

                    dbg.location(285,22);
                    REGEXMATCH247=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH247);

                    dbg.location(285,33);
                    LP248=(Token)match(input,LP,FOLLOW_LP_in_regexOp2655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP248);

                    dbg.location(285,37);
                    pushFollow(FOLLOW_integerExpr_in_regexOp2659);
                    r=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerExpr.add(r.getTree());
                    dbg.location(285,50);
                    RP249=(Token)match(input,RP,FOLLOW_RP_in_regexOp2661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP249);


                    // AST REWRITE
                    // elements: r, l, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 286:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(286,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:286:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(286,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(286,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(286,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(286,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:287:4: doubleExpr DOT REGEXMATCH LP doubleExpr RP
                    {
                    dbg.location(287,4);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp2688);
                    doubleExpr250=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(doubleExpr250.getTree());
                    dbg.location(287,15);
                    DOT251=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT251);

                    dbg.location(287,19);
                    REGEXMATCH252=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH252);

                    dbg.location(287,30);
                    LP253=(Token)match(input,LP,FOLLOW_LP_in_regexOp2694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP253);

                    dbg.location(287,33);
                    pushFollow(FOLLOW_doubleExpr_in_regexOp2696);
                    doubleExpr254=doubleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleExpr.add(doubleExpr254.getTree());
                    dbg.location(287,44);
                    RP255=(Token)match(input,RP,FOLLOW_RP_in_regexOp2698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP255);


                    // AST REWRITE
                    // elements: l, REGEXMATCH, r
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 288:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(288,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:288:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(288,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(288,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(288,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(288,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:289:4: stringExpr DOT REGEXMATCH LP stringExpr RP
                    {
                    dbg.location(289,4);
                    pushFollow(FOLLOW_stringExpr_in_regexOp2725);
                    stringExpr256=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(stringExpr256.getTree());
                    dbg.location(289,15);
                    DOT257=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT257);

                    dbg.location(289,19);
                    REGEXMATCH258=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH258);

                    dbg.location(289,30);
                    LP259=(Token)match(input,LP,FOLLOW_LP_in_regexOp2731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP259);

                    dbg.location(289,33);
                    pushFollow(FOLLOW_stringExpr_in_regexOp2733);
                    stringExpr260=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringExpr.add(stringExpr260.getTree());
                    dbg.location(289,44);
                    RP261=(Token)match(input,RP,FOLLOW_RP_in_regexOp2735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP261);


                    // AST REWRITE
                    // elements: r, REGEXMATCH, l
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 290:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(290,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:290:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(290,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(290,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(290,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(290,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:291:4: anyUriExpr DOT REGEXMATCH LP anyUriExpr RP
                    {
                    dbg.location(291,4);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp2762);
                    anyUriExpr262=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(anyUriExpr262.getTree());
                    dbg.location(291,15);
                    DOT263=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT263);

                    dbg.location(291,19);
                    REGEXMATCH264=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH264);

                    dbg.location(291,30);
                    LP265=(Token)match(input,LP,FOLLOW_LP_in_regexOp2768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP265);

                    dbg.location(291,33);
                    pushFollow(FOLLOW_anyUriExpr_in_regexOp2770);
                    anyUriExpr266=anyUriExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriExpr.add(anyUriExpr266.getTree());
                    dbg.location(291,44);
                    RP267=(Token)match(input,RP,FOLLOW_RP_in_regexOp2772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP267);


                    // AST REWRITE
                    // elements: r, l, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 292:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(292,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:292:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(292,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(292,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(292,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(292,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:293:4: dateExpr DOT REGEXMATCH LP dateExpr RP
                    {
                    dbg.location(293,4);
                    pushFollow(FOLLOW_dateExpr_in_regexOp2799);
                    dateExpr268=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateExpr.add(dateExpr268.getTree());
                    dbg.location(293,13);
                    DOT269=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT269);

                    dbg.location(293,17);
                    REGEXMATCH270=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH270);

                    dbg.location(293,28);
                    LP271=(Token)match(input,LP,FOLLOW_LP_in_regexOp2805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP271);

                    dbg.location(293,31);
                    pushFollow(FOLLOW_dateExpr_in_regexOp2807);
                    dateExpr272=dateExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateExpr.add(dateExpr272.getTree());
                    dbg.location(293,40);
                    RP273=(Token)match(input,RP,FOLLOW_RP_in_regexOp2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP273);


                    // AST REWRITE
                    // elements: r, l, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(294,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:294:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(294,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(294,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(294,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(294,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:295:4: timeExpr DOT REGEXMATCH LP timeExpr RP
                    {
                    dbg.location(295,4);
                    pushFollow(FOLLOW_timeExpr_in_regexOp2836);
                    timeExpr274=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr274.getTree());
                    dbg.location(295,13);
                    DOT275=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT275);

                    dbg.location(295,17);
                    REGEXMATCH276=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH276);

                    dbg.location(295,28);
                    LP277=(Token)match(input,LP,FOLLOW_LP_in_regexOp2842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP277);

                    dbg.location(295,31);
                    pushFollow(FOLLOW_timeExpr_in_regexOp2844);
                    timeExpr278=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr278.getTree());
                    dbg.location(295,40);
                    RP279=(Token)match(input,RP,FOLLOW_RP_in_regexOp2846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP279);


                    // AST REWRITE
                    // elements: l, r, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 296:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(296,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:296:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(296,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(296,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(296,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(296,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:297:4: dateTimeExpr DOT REGEXMATCH LP dateTimeExpr RP
                    {
                    dbg.location(297,4);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp2873);
                    dateTimeExpr280=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(dateTimeExpr280.getTree());
                    dbg.location(297,17);
                    DOT281=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT281);

                    dbg.location(297,21);
                    REGEXMATCH282=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH282);

                    dbg.location(297,32);
                    LP283=(Token)match(input,LP,FOLLOW_LP_in_regexOp2879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP283);

                    dbg.location(297,35);
                    pushFollow(FOLLOW_dateTimeExpr_in_regexOp2881);
                    dateTimeExpr284=dateTimeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeExpr.add(dateTimeExpr284.getTree());
                    dbg.location(297,48);
                    RP285=(Token)match(input,RP,FOLLOW_RP_in_regexOp2883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP285);


                    // AST REWRITE
                    // elements: REGEXMATCH, r, l
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 298:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(298,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:298:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(298,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(298,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(298,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(298,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:299:4: dayTimeDurationExpr DOT REGEXMATCH LP dayTimeDurationExpr RP
                    {
                    dbg.location(299,4);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp2910);
                    dayTimeDurationExpr286=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(dayTimeDurationExpr286.getTree());
                    dbg.location(299,24);
                    DOT287=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT287);

                    dbg.location(299,28);
                    REGEXMATCH288=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH288);

                    dbg.location(299,39);
                    LP289=(Token)match(input,LP,FOLLOW_LP_in_regexOp2916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP289);

                    dbg.location(299,42);
                    pushFollow(FOLLOW_dayTimeDurationExpr_in_regexOp2918);
                    dayTimeDurationExpr290=dayTimeDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationExpr.add(dayTimeDurationExpr290.getTree());
                    dbg.location(299,62);
                    RP291=(Token)match(input,RP,FOLLOW_RP_in_regexOp2920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP291);


                    // AST REWRITE
                    // elements: l, r, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 300:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(300,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:300:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(300,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(300,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(300,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(300,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:301:4: yearMonthDurationExpr DOT REGEXMATCH LP yearMonthDurationExpr RP
                    {
                    dbg.location(301,4);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp2947);
                    yearMonthDurationExpr292=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(yearMonthDurationExpr292.getTree());
                    dbg.location(301,26);
                    DOT293=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT293);

                    dbg.location(301,30);
                    REGEXMATCH294=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH294);

                    dbg.location(301,41);
                    LP295=(Token)match(input,LP,FOLLOW_LP_in_regexOp2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP295);

                    dbg.location(301,44);
                    pushFollow(FOLLOW_yearMonthDurationExpr_in_regexOp2955);
                    yearMonthDurationExpr296=yearMonthDurationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationExpr.add(yearMonthDurationExpr296.getTree());
                    dbg.location(301,66);
                    RP297=(Token)match(input,RP,FOLLOW_RP_in_regexOp2957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP297);


                    // AST REWRITE
                    // elements: l, REGEXMATCH, r
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 302:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(302,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:302:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(302,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(302,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(302,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(302,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:303:4: x500NameExpr DOT REGEXMATCH LP x500NameExpr RP
                    {
                    dbg.location(303,4);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp2984);
                    x500NameExpr298=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(x500NameExpr298.getTree());
                    dbg.location(303,17);
                    DOT299=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp2986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT299);

                    dbg.location(303,21);
                    REGEXMATCH300=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp2988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH300);

                    dbg.location(303,32);
                    LP301=(Token)match(input,LP,FOLLOW_LP_in_regexOp2990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP301);

                    dbg.location(303,35);
                    pushFollow(FOLLOW_x500NameExpr_in_regexOp2992);
                    x500NameExpr302=x500NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameExpr.add(x500NameExpr302.getTree());
                    dbg.location(303,48);
                    RP303=(Token)match(input,RP,FOLLOW_RP_in_regexOp2994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP303);


                    // AST REWRITE
                    // elements: r, l, REGEXMATCH
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 304:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(304,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:304:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(304,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(304,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(304,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(304,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:305:4: rfc822NameExpr DOT REGEXMATCH LP rfc822NameExpr RP
                    {
                    dbg.location(305,4);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp3021);
                    rfc822NameExpr304=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(rfc822NameExpr304.getTree());
                    dbg.location(305,19);
                    DOT305=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp3023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT305);

                    dbg.location(305,23);
                    REGEXMATCH306=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp3025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH306);

                    dbg.location(305,34);
                    LP307=(Token)match(input,LP,FOLLOW_LP_in_regexOp3027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP307);

                    dbg.location(305,37);
                    pushFollow(FOLLOW_rfc822NameExpr_in_regexOp3029);
                    rfc822NameExpr308=rfc822NameExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameExpr.add(rfc822NameExpr308.getTree());
                    dbg.location(305,52);
                    RP309=(Token)match(input,RP,FOLLOW_RP_in_regexOp3031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP309);


                    // AST REWRITE
                    // elements: r, REGEXMATCH, l
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 306:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(306,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:306:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(306,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(306,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(306,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(306,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:307:4: base64BinaryExpr DOT REGEXMATCH LP base64BinaryExpr RP
                    {
                    dbg.location(307,4);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp3058);
                    base64BinaryExpr310=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr310.getTree());
                    dbg.location(307,21);
                    DOT311=(Token)match(input,DOT,FOLLOW_DOT_in_regexOp3060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT311);

                    dbg.location(307,25);
                    REGEXMATCH312=(Token)match(input,REGEXMATCH,FOLLOW_REGEXMATCH_in_regexOp3062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGEXMATCH.add(REGEXMATCH312);

                    dbg.location(307,36);
                    LP313=(Token)match(input,LP,FOLLOW_LP_in_regexOp3064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP313);

                    dbg.location(307,39);
                    pushFollow(FOLLOW_base64BinaryExpr_in_regexOp3066);
                    base64BinaryExpr314=base64BinaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryExpr.add(base64BinaryExpr314.getTree());
                    dbg.location(307,56);
                    RP315=(Token)match(input,RP,FOLLOW_RP_in_regexOp3068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP315);


                    // AST REWRITE
                    // elements: l, REGEXMATCH, r
                    // token labels: 
                    // rule labels: retval, r, l
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 308:9: -> ^( REGEXMATCH INTEGER $l $r)
                    {
                        dbg.location(308,12);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:308:12: ^( REGEXMATCH INTEGER $l $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(308,14);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REGEXMATCH.nextNode()
                        , root_1);

                        dbg.location(308,25);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(308,34);
                        adaptor.addChild(root_1, stream_l.nextTree());
                        dbg.location(308,37);
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(309, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bagOp"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:311:1: bagOp : ( ( booleanBag )=>l1= booleanBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r1= booleanBag RP -> ^( $o BOOLEAN $l1 $r1) | ( integerBag )=>l2= integerBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r2= integerBag RP -> ^( $o INTEGER $l2 $r2) | ( doubleBag )=>l3= doubleBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r3= doubleBag RP -> ^( $o DOUBLE $l3 $r3) | ( stringBag )=>l4= stringBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r4= stringBag RP -> ^( $o STRING $l4 $r4) | ( dateBag )=>l5= dateBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r5= dateBag RP -> ^( $o DATE $l5 $r5) | ( timeBag )=>l6= timeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r6= timeBag RP -> ^( $o TIME $l6 $r6) | ( dateTimeBag )=>l7= dateTimeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r7= dateTimeBag RP -> ^( $o DATETIME $l7 $r7) | ( base64BinaryBag )=>l8= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r8= base64BinaryBag RP -> ^( $o BASE64BINARY $l8 $r8) | ( dayTimeDurationBag )=>l9= dayTimeDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r9= dayTimeDurationBag RP -> ^( $o DAYTIMEDURATION $l9 $r9) | ( yearMonthDurationBag )=>lA= yearMonthDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rA= yearMonthDurationBag RP -> ^( $o YEARMONTHDURATION $lA $rA) | ( anyUriBag )=>lB= anyUriBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rB= anyUriBag RP -> ^( $o ANYURI $lB $rB) | ( x500NameBag )=>lC= x500NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rC= x500NameBag RP -> ^( $o X500NAME $lC $rC) | ( rfc822NameBag )=>lD= rfc822NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rD= rfc822NameBag RP -> ^( $o RFC822NAME $lD $rD) | ( hexBinaryBag )=>lE= hexBinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rE= hexBinaryBag RP -> ^( $o HEXBINARY $lE $rE) | ( base64BinaryBag )=>lF= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rF= base64BinaryBag RP -> ^( $o BASE64BINARY $lF $rF) );
    public final GrammarParser.bagOp_return bagOp() throws RecognitionException {
        GrammarParser.bagOp_return retval = new GrammarParser.bagOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        Token DOT316=null;
        Token LP317=null;
        Token RP318=null;
        Token DOT319=null;
        Token LP320=null;
        Token RP321=null;
        Token DOT322=null;
        Token LP323=null;
        Token RP324=null;
        Token DOT325=null;
        Token LP326=null;
        Token RP327=null;
        Token DOT328=null;
        Token LP329=null;
        Token RP330=null;
        Token DOT331=null;
        Token LP332=null;
        Token RP333=null;
        Token DOT334=null;
        Token LP335=null;
        Token RP336=null;
        Token DOT337=null;
        Token LP338=null;
        Token RP339=null;
        Token DOT340=null;
        Token LP341=null;
        Token RP342=null;
        Token DOT343=null;
        Token LP344=null;
        Token RP345=null;
        Token DOT346=null;
        Token LP347=null;
        Token RP348=null;
        Token DOT349=null;
        Token LP350=null;
        Token RP351=null;
        Token DOT352=null;
        Token LP353=null;
        Token RP354=null;
        Token DOT355=null;
        Token LP356=null;
        Token RP357=null;
        Token DOT358=null;
        Token LP359=null;
        Token RP360=null;
        GrammarParser.booleanBag_return l1 =null;

        GrammarParser.booleanBag_return r1 =null;

        GrammarParser.integerBag_return l2 =null;

        GrammarParser.integerBag_return r2 =null;

        GrammarParser.doubleBag_return l3 =null;

        GrammarParser.doubleBag_return r3 =null;

        GrammarParser.stringBag_return l4 =null;

        GrammarParser.stringBag_return r4 =null;

        GrammarParser.dateBag_return l5 =null;

        GrammarParser.dateBag_return r5 =null;

        GrammarParser.timeBag_return l6 =null;

        GrammarParser.timeBag_return r6 =null;

        GrammarParser.dateTimeBag_return l7 =null;

        GrammarParser.dateTimeBag_return r7 =null;

        GrammarParser.base64BinaryBag_return l8 =null;

        GrammarParser.base64BinaryBag_return r8 =null;

        GrammarParser.dayTimeDurationBag_return l9 =null;

        GrammarParser.dayTimeDurationBag_return r9 =null;

        GrammarParser.yearMonthDurationBag_return lA =null;

        GrammarParser.yearMonthDurationBag_return rA =null;

        GrammarParser.anyUriBag_return lB =null;

        GrammarParser.anyUriBag_return rB =null;

        GrammarParser.x500NameBag_return lC =null;

        GrammarParser.x500NameBag_return rC =null;

        GrammarParser.rfc822NameBag_return lD =null;

        GrammarParser.rfc822NameBag_return rD =null;

        GrammarParser.hexBinaryBag_return lE =null;

        GrammarParser.hexBinaryBag_return rE =null;

        GrammarParser.base64BinaryBag_return lF =null;

        GrammarParser.base64BinaryBag_return rF =null;


        CommonTree o_tree=null;
        CommonTree DOT316_tree=null;
        CommonTree LP317_tree=null;
        CommonTree RP318_tree=null;
        CommonTree DOT319_tree=null;
        CommonTree LP320_tree=null;
        CommonTree RP321_tree=null;
        CommonTree DOT322_tree=null;
        CommonTree LP323_tree=null;
        CommonTree RP324_tree=null;
        CommonTree DOT325_tree=null;
        CommonTree LP326_tree=null;
        CommonTree RP327_tree=null;
        CommonTree DOT328_tree=null;
        CommonTree LP329_tree=null;
        CommonTree RP330_tree=null;
        CommonTree DOT331_tree=null;
        CommonTree LP332_tree=null;
        CommonTree RP333_tree=null;
        CommonTree DOT334_tree=null;
        CommonTree LP335_tree=null;
        CommonTree RP336_tree=null;
        CommonTree DOT337_tree=null;
        CommonTree LP338_tree=null;
        CommonTree RP339_tree=null;
        CommonTree DOT340_tree=null;
        CommonTree LP341_tree=null;
        CommonTree RP342_tree=null;
        CommonTree DOT343_tree=null;
        CommonTree LP344_tree=null;
        CommonTree RP345_tree=null;
        CommonTree DOT346_tree=null;
        CommonTree LP347_tree=null;
        CommonTree RP348_tree=null;
        CommonTree DOT349_tree=null;
        CommonTree LP350_tree=null;
        CommonTree RP351_tree=null;
        CommonTree DOT352_tree=null;
        CommonTree LP353_tree=null;
        CommonTree RP354_tree=null;
        CommonTree DOT355_tree=null;
        CommonTree LP356_tree=null;
        CommonTree RP357_tree=null;
        CommonTree DOT358_tree=null;
        CommonTree LP359_tree=null;
        CommonTree RP360_tree=null;
        RewriteRuleTokenStream stream_ATLEASTONEMENBEROF=new RewriteRuleTokenStream(adaptor,"token ATLEASTONEMENBEROF");
        RewriteRuleTokenStream stream_SUBSET=new RewriteRuleTokenStream(adaptor,"token SUBSET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_SETEQUALS=new RewriteRuleTokenStream(adaptor,"token SETEQUALS");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_dateBag=new RewriteRuleSubtreeStream(adaptor,"rule dateBag");
        RewriteRuleSubtreeStream stream_yearMonthDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule yearMonthDurationBag");
        RewriteRuleSubtreeStream stream_rfc822NameBag=new RewriteRuleSubtreeStream(adaptor,"rule rfc822NameBag");
        RewriteRuleSubtreeStream stream_integerBag=new RewriteRuleSubtreeStream(adaptor,"rule integerBag");
        RewriteRuleSubtreeStream stream_hexBinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule hexBinaryBag");
        RewriteRuleSubtreeStream stream_anyUriBag=new RewriteRuleSubtreeStream(adaptor,"rule anyUriBag");
        RewriteRuleSubtreeStream stream_doubleBag=new RewriteRuleSubtreeStream(adaptor,"rule doubleBag");
        RewriteRuleSubtreeStream stream_timeBag=new RewriteRuleSubtreeStream(adaptor,"rule timeBag");
        RewriteRuleSubtreeStream stream_booleanBag=new RewriteRuleSubtreeStream(adaptor,"rule booleanBag");
        RewriteRuleSubtreeStream stream_dayTimeDurationBag=new RewriteRuleSubtreeStream(adaptor,"rule dayTimeDurationBag");
        RewriteRuleSubtreeStream stream_x500NameBag=new RewriteRuleSubtreeStream(adaptor,"rule x500NameBag");
        RewriteRuleSubtreeStream stream_base64BinaryBag=new RewriteRuleSubtreeStream(adaptor,"rule base64BinaryBag");
        RewriteRuleSubtreeStream stream_dateTimeBag=new RewriteRuleSubtreeStream(adaptor,"rule dateTimeBag");
        RewriteRuleSubtreeStream stream_stringBag=new RewriteRuleSubtreeStream(adaptor,"rule stringBag");
        try { dbg.enterRule(getGrammarFileName(), "bagOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(311, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:2: ( ( booleanBag )=>l1= booleanBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r1= booleanBag RP -> ^( $o BOOLEAN $l1 $r1) | ( integerBag )=>l2= integerBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r2= integerBag RP -> ^( $o INTEGER $l2 $r2) | ( doubleBag )=>l3= doubleBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r3= doubleBag RP -> ^( $o DOUBLE $l3 $r3) | ( stringBag )=>l4= stringBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r4= stringBag RP -> ^( $o STRING $l4 $r4) | ( dateBag )=>l5= dateBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r5= dateBag RP -> ^( $o DATE $l5 $r5) | ( timeBag )=>l6= timeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r6= timeBag RP -> ^( $o TIME $l6 $r6) | ( dateTimeBag )=>l7= dateTimeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r7= dateTimeBag RP -> ^( $o DATETIME $l7 $r7) | ( base64BinaryBag )=>l8= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r8= base64BinaryBag RP -> ^( $o BASE64BINARY $l8 $r8) | ( dayTimeDurationBag )=>l9= dayTimeDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r9= dayTimeDurationBag RP -> ^( $o DAYTIMEDURATION $l9 $r9) | ( yearMonthDurationBag )=>lA= yearMonthDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rA= yearMonthDurationBag RP -> ^( $o YEARMONTHDURATION $lA $rA) | ( anyUriBag )=>lB= anyUriBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rB= anyUriBag RP -> ^( $o ANYURI $lB $rB) | ( x500NameBag )=>lC= x500NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rC= x500NameBag RP -> ^( $o X500NAME $lC $rC) | ( rfc822NameBag )=>lD= rfc822NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rD= rfc822NameBag RP -> ^( $o RFC822NAME $lD $rD) | ( hexBinaryBag )=>lE= hexBinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rE= hexBinaryBag RP -> ^( $o HEXBINARY $lE $rE) | ( base64BinaryBag )=>lF= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rF= base64BinaryBag RP -> ^( $o BASE64BINARY $lF $rF) )
            int alt48=15;
            try { dbg.enterDecision(48, decisionCanBacktrack[48]);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==BOOLEAN) && (synpred5_Grammar())) {
                alt48=1;
            }
            else if ( (LA48_0==ACTION||LA48_0==ENVIRONMENT||LA48_0==RESOURCE||LA48_0==SUBJECT) && (synpred5_Grammar())) {
                alt48=1;
            }
            else if ( (LA48_0==INTEGER) && (synpred6_Grammar())) {
                alt48=2;
            }
            else if ( (LA48_0==BAG) && (synpred6_Grammar())) {
                alt48=2;
            }
            else if ( (LA48_0==DOUBLE) && (synpred7_Grammar())) {
                alt48=3;
            }
            else if ( (LA48_0==STRING) && (synpred8_Grammar())) {
                alt48=4;
            }
            else if ( (LA48_0==DATE) && (synpred9_Grammar())) {
                alt48=5;
            }
            else if ( (LA48_0==TIME) && (synpred10_Grammar())) {
                alt48=6;
            }
            else if ( (LA48_0==DATETIME) && (synpred11_Grammar())) {
                alt48=7;
            }
            else if ( (LA48_0==BASE64BINARY) ) {
                int LA48_10 = input.LA(2);

                if ( (LA48_10==STRING_CONSTANT_LIST) ) {
                    int LA48_17 = input.LA(3);

                    if ( (LA48_17==DOT) ) {
                        switch ( input.LA(4) ) {
                        case ATLEASTONEMENBEROF:
                            {
                            int LA48_21 = input.LA(5);

                            if ( (LA48_21==LP) ) {
                                int LA48_25 = input.LA(6);

                                if ( (LA48_25==BASE64BINARY) ) {
                                    int LA48_27 = input.LA(7);

                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                        int LA48_29 = input.LA(8);

                                        if ( (LA48_29==RP) ) {
                                            int LA48_31 = input.LA(9);

                                            if ( (synpred12_Grammar()) ) {
                                                alt48=8;
                                            }
                                            else if ( (synpred19_Grammar()) ) {
                                                alt48=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 31, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 29, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA48_27==LP) ) {
                                        int LA48_30 = input.LA(8);

                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                            int LA48_32 = input.LA(9);

                                            if ( (LA48_32==DOT) ) {
                                                int LA48_35 = input.LA(10);

                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                    int LA48_36 = input.LA(11);

                                                    if ( (LA48_36==RP) ) {
                                                        int LA48_37 = input.LA(12);

                                                        if ( (LA48_37==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 37, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 36, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 35, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 32, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 30, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 48, 27, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 25, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 21, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                            }
                            break;
                        case SUBSET:
                            {
                            int LA48_22 = input.LA(5);

                            if ( (LA48_22==LP) ) {
                                int LA48_25 = input.LA(6);

                                if ( (LA48_25==BASE64BINARY) ) {
                                    int LA48_27 = input.LA(7);

                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                        int LA48_29 = input.LA(8);

                                        if ( (LA48_29==RP) ) {
                                            int LA48_31 = input.LA(9);

                                            if ( (synpred12_Grammar()) ) {
                                                alt48=8;
                                            }
                                            else if ( (synpred19_Grammar()) ) {
                                                alt48=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 31, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 29, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA48_27==LP) ) {
                                        int LA48_30 = input.LA(8);

                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                            int LA48_32 = input.LA(9);

                                            if ( (LA48_32==DOT) ) {
                                                int LA48_35 = input.LA(10);

                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                    int LA48_36 = input.LA(11);

                                                    if ( (LA48_36==RP) ) {
                                                        int LA48_37 = input.LA(12);

                                                        if ( (LA48_37==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 37, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 36, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 35, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 32, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 30, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 48, 27, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 25, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 22, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                            }
                            break;
                        case SETEQUALS:
                            {
                            int LA48_23 = input.LA(5);

                            if ( (LA48_23==LP) ) {
                                int LA48_25 = input.LA(6);

                                if ( (LA48_25==BASE64BINARY) ) {
                                    int LA48_27 = input.LA(7);

                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                        int LA48_29 = input.LA(8);

                                        if ( (LA48_29==RP) ) {
                                            int LA48_31 = input.LA(9);

                                            if ( (synpred12_Grammar()) ) {
                                                alt48=8;
                                            }
                                            else if ( (synpred19_Grammar()) ) {
                                                alt48=15;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 31, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 29, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA48_27==LP) ) {
                                        int LA48_30 = input.LA(8);

                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                            int LA48_32 = input.LA(9);

                                            if ( (LA48_32==DOT) ) {
                                                int LA48_35 = input.LA(10);

                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                    int LA48_36 = input.LA(11);

                                                    if ( (LA48_36==RP) ) {
                                                        int LA48_37 = input.LA(12);

                                                        if ( (LA48_37==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 37, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 36, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 35, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 32, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 30, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 48, 27, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 25, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 23, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 19, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 17, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA48_10==LP) ) {
                    int LA48_18 = input.LA(3);

                    if ( (LA48_18==ACTION||LA48_18==ENVIRONMENT||LA48_18==RESOURCE||LA48_18==SUBJECT) ) {
                        int LA48_20 = input.LA(4);

                        if ( (LA48_20==DOT) ) {
                            int LA48_24 = input.LA(5);

                            if ( (LA48_24==LOWERCASEIDENTIFIER) ) {
                                int LA48_26 = input.LA(6);

                                if ( (LA48_26==RP) ) {
                                    int LA48_28 = input.LA(7);

                                    if ( (LA48_28==DOT) ) {
                                        switch ( input.LA(8) ) {
                                        case ATLEASTONEMENBEROF:
                                            {
                                            int LA48_21 = input.LA(9);

                                            if ( (LA48_21==LP) ) {
                                                int LA48_25 = input.LA(10);

                                                if ( (LA48_25==BASE64BINARY) ) {
                                                    int LA48_27 = input.LA(11);

                                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                                        int LA48_29 = input.LA(12);

                                                        if ( (LA48_29==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 29, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else if ( (LA48_27==LP) ) {
                                                        int LA48_30 = input.LA(12);

                                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                                            int LA48_32 = input.LA(13);

                                                            if ( (LA48_32==DOT) ) {
                                                                int LA48_35 = input.LA(14);

                                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                                    int LA48_36 = input.LA(15);

                                                                    if ( (LA48_36==RP) ) {
                                                                        int LA48_37 = input.LA(16);

                                                                        if ( (LA48_37==RP) ) {
                                                                            int LA48_31 = input.LA(17);

                                                                            if ( (synpred12_Grammar()) ) {
                                                                                alt48=8;
                                                                            }
                                                                            else if ( (synpred19_Grammar()) ) {
                                                                                alt48=15;
                                                                            }
                                                                            else {
                                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("", 48, 31, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;

                                                                            }
                                                                        }
                                                                        else {
                                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 48, 37, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else {
                                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 48, 36, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 48, 35, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 32, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 30, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 27, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 25, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 21, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case SUBSET:
                                            {
                                            int LA48_22 = input.LA(9);

                                            if ( (LA48_22==LP) ) {
                                                int LA48_25 = input.LA(10);

                                                if ( (LA48_25==BASE64BINARY) ) {
                                                    int LA48_27 = input.LA(11);

                                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                                        int LA48_29 = input.LA(12);

                                                        if ( (LA48_29==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 29, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else if ( (LA48_27==LP) ) {
                                                        int LA48_30 = input.LA(12);

                                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                                            int LA48_32 = input.LA(13);

                                                            if ( (LA48_32==DOT) ) {
                                                                int LA48_35 = input.LA(14);

                                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                                    int LA48_36 = input.LA(15);

                                                                    if ( (LA48_36==RP) ) {
                                                                        int LA48_37 = input.LA(16);

                                                                        if ( (LA48_37==RP) ) {
                                                                            int LA48_31 = input.LA(17);

                                                                            if ( (synpred12_Grammar()) ) {
                                                                                alt48=8;
                                                                            }
                                                                            else if ( (synpred19_Grammar()) ) {
                                                                                alt48=15;
                                                                            }
                                                                            else {
                                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("", 48, 31, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;

                                                                            }
                                                                        }
                                                                        else {
                                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 48, 37, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else {
                                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 48, 36, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 48, 35, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 32, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 30, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 27, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 25, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 22, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case SETEQUALS:
                                            {
                                            int LA48_23 = input.LA(9);

                                            if ( (LA48_23==LP) ) {
                                                int LA48_25 = input.LA(10);

                                                if ( (LA48_25==BASE64BINARY) ) {
                                                    int LA48_27 = input.LA(11);

                                                    if ( (LA48_27==STRING_CONSTANT_LIST) ) {
                                                        int LA48_29 = input.LA(12);

                                                        if ( (LA48_29==RP) ) {
                                                            int LA48_31 = input.LA(13);

                                                            if ( (synpred12_Grammar()) ) {
                                                                alt48=8;
                                                            }
                                                            else if ( (synpred19_Grammar()) ) {
                                                                alt48=15;
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 31, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 29, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else if ( (LA48_27==LP) ) {
                                                        int LA48_30 = input.LA(12);

                                                        if ( (LA48_30==ACTION||LA48_30==ENVIRONMENT||LA48_30==RESOURCE||LA48_30==SUBJECT) ) {
                                                            int LA48_32 = input.LA(13);

                                                            if ( (LA48_32==DOT) ) {
                                                                int LA48_35 = input.LA(14);

                                                                if ( (LA48_35==LOWERCASEIDENTIFIER) ) {
                                                                    int LA48_36 = input.LA(15);

                                                                    if ( (LA48_36==RP) ) {
                                                                        int LA48_37 = input.LA(16);

                                                                        if ( (LA48_37==RP) ) {
                                                                            int LA48_31 = input.LA(17);

                                                                            if ( (synpred12_Grammar()) ) {
                                                                                alt48=8;
                                                                            }
                                                                            else if ( (synpred19_Grammar()) ) {
                                                                                alt48=15;
                                                                            }
                                                                            else {
                                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("", 48, 31, input);

                                                                                dbg.recognitionException(nvae);
                                                                                throw nvae;

                                                                            }
                                                                        }
                                                                        else {
                                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 48, 37, input);

                                                                            dbg.recognitionException(nvae);
                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else {
                                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 48, 36, input);

                                                                        dbg.recognitionException(nvae);
                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 48, 35, input);

                                                                    dbg.recognitionException(nvae);
                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 48, 32, input);

                                                                dbg.recognitionException(nvae);
                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 48, 30, input);

                                                            dbg.recognitionException(nvae);
                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 48, 27, input);

                                                        dbg.recognitionException(nvae);
                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 48, 25, input);

                                                    dbg.recognitionException(nvae);
                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 48, 23, input);

                                                dbg.recognitionException(nvae);
                                                throw nvae;

                                            }
                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 48, 19, input);

                                            dbg.recognitionException(nvae);
                                            throw nvae;

                                        }

                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 48, 28, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 26, input);

                                    dbg.recognitionException(nvae);
                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 24, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 20, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 18, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA48_0==DAYTIMEDURATION) && (synpred13_Grammar())) {
                alt48=9;
            }
            else if ( (LA48_0==YEARMONTHDURATION) && (synpred14_Grammar())) {
                alt48=10;
            }
            else if ( (LA48_0==ANYURI) && (synpred15_Grammar())) {
                alt48=11;
            }
            else if ( (LA48_0==X500NAME) && (synpred16_Grammar())) {
                alt48=12;
            }
            else if ( (LA48_0==RFC822NAME) && (synpred17_Grammar())) {
                alt48=13;
            }
            else if ( (LA48_0==HEXBINARY) && (synpred18_Grammar())) {
                alt48=14;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:4: ( booleanBag )=>l1= booleanBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r1= booleanBag RP
                    {
                    dbg.location(312,22);
                    pushFollow(FOLLOW_booleanBag_in_bagOp3109);
                    l1=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanBag.add(l1.getTree());
                    dbg.location(312,34);
                    DOT316=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT316);

                    dbg.location(312,38);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:38: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt33=3;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33, decisionCanBacktrack[33]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt33=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt33=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt33=3;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:40: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(312,41);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3117); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:63: o= SUBSET
                            {
                            dbg.location(312,64);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3123); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:74: o= SETEQUALS
                            {
                            dbg.location(312,75);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3129); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(312,88);
                    LP317=(Token)match(input,LP,FOLLOW_LP_in_bagOp3133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP317);

                    dbg.location(312,93);
                    pushFollow(FOLLOW_booleanBag_in_bagOp3137);
                    r1=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_booleanBag.add(r1.getTree());
                    dbg.location(312,105);
                    RP318=(Token)match(input,RP,FOLLOW_RP_in_bagOp3139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP318);


                    // AST REWRITE
                    // elements: r1, o, l1
                    // token labels: o
                    // rule labels: retval, l1, r1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l1=new RewriteRuleSubtreeStream(adaptor,"rule l1",l1!=null?l1.tree:null);
                    RewriteRuleSubtreeStream stream_r1=new RewriteRuleSubtreeStream(adaptor,"rule r1",r1!=null?r1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 313:6: -> ^( $o BOOLEAN $l1 $r1)
                    {
                        dbg.location(313,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:313:9: ^( $o BOOLEAN $l1 $r1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(313,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(313,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN")
                        );
                        dbg.location(313,23);
                        adaptor.addChild(root_1, stream_l1.nextTree());
                        dbg.location(313,27);
                        adaptor.addChild(root_1, stream_r1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:4: ( integerBag )=>l2= integerBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r2= integerBag RP
                    {
                    dbg.location(314,22);
                    pushFollow(FOLLOW_integerBag_in_bagOp3172);
                    l2=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerBag.add(l2.getTree());
                    dbg.location(314,34);
                    DOT319=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT319);

                    dbg.location(314,38);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:38: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt34=3;
                    try { dbg.enterSubRule(34);
                    try { dbg.enterDecision(34, decisionCanBacktrack[34]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt34=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt34=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt34=3;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:40: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(314,41);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3180); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:63: o= SUBSET
                            {
                            dbg.location(314,64);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3186); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:74: o= SETEQUALS
                            {
                            dbg.location(314,75);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3192); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(34);}

                    dbg.location(314,88);
                    LP320=(Token)match(input,LP,FOLLOW_LP_in_bagOp3196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP320);

                    dbg.location(314,93);
                    pushFollow(FOLLOW_integerBag_in_bagOp3200);
                    r2=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integerBag.add(r2.getTree());
                    dbg.location(314,105);
                    RP321=(Token)match(input,RP,FOLLOW_RP_in_bagOp3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP321);


                    // AST REWRITE
                    // elements: l2, o, r2
                    // token labels: o
                    // rule labels: retval, l2, r2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);
                    RewriteRuleSubtreeStream stream_r2=new RewriteRuleSubtreeStream(adaptor,"rule r2",r2!=null?r2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:6: -> ^( $o INTEGER $l2 $r2)
                    {
                        dbg.location(315,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:315:9: ^( $o INTEGER $l2 $r2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(315,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(315,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INTEGER, "INTEGER")
                        );
                        dbg.location(315,23);
                        adaptor.addChild(root_1, stream_l2.nextTree());
                        dbg.location(315,27);
                        adaptor.addChild(root_1, stream_r2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:4: ( doubleBag )=>l3= doubleBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r3= doubleBag RP
                    {
                    dbg.location(316,21);
                    pushFollow(FOLLOW_doubleBag_in_bagOp3235);
                    l3=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleBag.add(l3.getTree());
                    dbg.location(316,32);
                    DOT322=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT322);

                    dbg.location(316,36);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:36: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt35=3;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35, decisionCanBacktrack[35]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt35=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt35=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt35=3;
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:38: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(316,39);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3243); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:61: o= SUBSET
                            {
                            dbg.location(316,62);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3249); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:72: o= SETEQUALS
                            {
                            dbg.location(316,73);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3255); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(316,86);
                    LP323=(Token)match(input,LP,FOLLOW_LP_in_bagOp3259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP323);

                    dbg.location(316,91);
                    pushFollow(FOLLOW_doubleBag_in_bagOp3263);
                    r3=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleBag.add(r3.getTree());
                    dbg.location(316,102);
                    RP324=(Token)match(input,RP,FOLLOW_RP_in_bagOp3265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP324);


                    // AST REWRITE
                    // elements: r3, l3, o
                    // token labels: o
                    // rule labels: retval, l3, r3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);
                    RewriteRuleSubtreeStream stream_r3=new RewriteRuleSubtreeStream(adaptor,"rule r3",r3!=null?r3.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 317:6: -> ^( $o DOUBLE $l3 $r3)
                    {
                        dbg.location(317,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:317:9: ^( $o DOUBLE $l3 $r3)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(317,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(317,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DOUBLE, "DOUBLE")
                        );
                        dbg.location(317,22);
                        adaptor.addChild(root_1, stream_l3.nextTree());
                        dbg.location(317,26);
                        adaptor.addChild(root_1, stream_r3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:4: ( stringBag )=>l4= stringBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r4= stringBag RP
                    {
                    dbg.location(318,22);
                    pushFollow(FOLLOW_stringBag_in_bagOp3299);
                    l4=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringBag.add(l4.getTree());
                    dbg.location(318,33);
                    DOT325=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT325);

                    dbg.location(318,37);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:37: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt36=3;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36, decisionCanBacktrack[36]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt36=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt36=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt36=3;
                        }
                        break;
                    default:
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:39: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(318,40);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3307); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:62: o= SUBSET
                            {
                            dbg.location(318,63);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3313); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:73: o= SETEQUALS
                            {
                            dbg.location(318,74);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3319); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}

                    dbg.location(318,87);
                    LP326=(Token)match(input,LP,FOLLOW_LP_in_bagOp3323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP326);

                    dbg.location(318,92);
                    pushFollow(FOLLOW_stringBag_in_bagOp3327);
                    r4=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringBag.add(r4.getTree());
                    dbg.location(318,103);
                    RP327=(Token)match(input,RP,FOLLOW_RP_in_bagOp3329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP327);


                    // AST REWRITE
                    // elements: r4, o, l4
                    // token labels: o
                    // rule labels: retval, l4, r4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l4=new RewriteRuleSubtreeStream(adaptor,"rule l4",l4!=null?l4.tree:null);
                    RewriteRuleSubtreeStream stream_r4=new RewriteRuleSubtreeStream(adaptor,"rule r4",r4!=null?r4.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 319:6: -> ^( $o STRING $l4 $r4)
                    {
                        dbg.location(319,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:319:9: ^( $o STRING $l4 $r4)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(319,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(319,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(STRING, "STRING")
                        );
                        dbg.location(319,22);
                        adaptor.addChild(root_1, stream_l4.nextTree());
                        dbg.location(319,26);
                        adaptor.addChild(root_1, stream_r4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:4: ( dateBag )=>l5= dateBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r5= dateBag RP
                    {
                    dbg.location(320,20);
                    pushFollow(FOLLOW_dateBag_in_bagOp3363);
                    l5=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateBag.add(l5.getTree());
                    dbg.location(320,29);
                    DOT328=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT328);

                    dbg.location(320,33);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:33: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt37=3;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37, decisionCanBacktrack[37]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt37=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt37=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt37=3;
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

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:35: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(320,36);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3371); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:58: o= SUBSET
                            {
                            dbg.location(320,59);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3377); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:69: o= SETEQUALS
                            {
                            dbg.location(320,70);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3383); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(320,83);
                    LP329=(Token)match(input,LP,FOLLOW_LP_in_bagOp3387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP329);

                    dbg.location(320,88);
                    pushFollow(FOLLOW_dateBag_in_bagOp3391);
                    r5=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateBag.add(r5.getTree());
                    dbg.location(320,97);
                    RP330=(Token)match(input,RP,FOLLOW_RP_in_bagOp3393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP330);


                    // AST REWRITE
                    // elements: o, r5, l5
                    // token labels: o
                    // rule labels: retval, l5, r5
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l5=new RewriteRuleSubtreeStream(adaptor,"rule l5",l5!=null?l5.tree:null);
                    RewriteRuleSubtreeStream stream_r5=new RewriteRuleSubtreeStream(adaptor,"rule r5",r5!=null?r5.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 321:6: -> ^( $o DATE $l5 $r5)
                    {
                        dbg.location(321,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:321:9: ^( $o DATE $l5 $r5)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(321,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(321,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATE, "DATE")
                        );
                        dbg.location(321,20);
                        adaptor.addChild(root_1, stream_l5.nextTree());
                        dbg.location(321,24);
                        adaptor.addChild(root_1, stream_r5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:4: ( timeBag )=>l6= timeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r6= timeBag RP
                    {
                    dbg.location(322,20);
                    pushFollow(FOLLOW_timeBag_in_bagOp3427);
                    l6=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeBag.add(l6.getTree());
                    dbg.location(322,29);
                    DOT331=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT331);

                    dbg.location(322,33);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:33: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt38=3;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38, decisionCanBacktrack[38]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt38=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt38=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:35: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(322,36);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3435); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:58: o= SUBSET
                            {
                            dbg.location(322,59);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3441); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:69: o= SETEQUALS
                            {
                            dbg.location(322,70);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3447); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(322,83);
                    LP332=(Token)match(input,LP,FOLLOW_LP_in_bagOp3451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP332);

                    dbg.location(322,88);
                    pushFollow(FOLLOW_timeBag_in_bagOp3455);
                    r6=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeBag.add(r6.getTree());
                    dbg.location(322,97);
                    RP333=(Token)match(input,RP,FOLLOW_RP_in_bagOp3457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP333);


                    // AST REWRITE
                    // elements: l6, r6, o
                    // token labels: o
                    // rule labels: retval, l6, r6
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l6=new RewriteRuleSubtreeStream(adaptor,"rule l6",l6!=null?l6.tree:null);
                    RewriteRuleSubtreeStream stream_r6=new RewriteRuleSubtreeStream(adaptor,"rule r6",r6!=null?r6.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 323:6: -> ^( $o TIME $l6 $r6)
                    {
                        dbg.location(323,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:323:9: ^( $o TIME $l6 $r6)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(323,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(323,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TIME, "TIME")
                        );
                        dbg.location(323,20);
                        adaptor.addChild(root_1, stream_l6.nextTree());
                        dbg.location(323,24);
                        adaptor.addChild(root_1, stream_r6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:4: ( dateTimeBag )=>l7= dateTimeBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r7= dateTimeBag RP
                    {
                    dbg.location(324,24);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp3491);
                    l7=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeBag.add(l7.getTree());
                    dbg.location(324,37);
                    DOT334=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT334);

                    dbg.location(324,41);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:41: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt39=3;
                    try { dbg.enterSubRule(39);
                    try { dbg.enterDecision(39, decisionCanBacktrack[39]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt39=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt39=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(39);}

                    switch (alt39) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:43: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(324,44);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:66: o= SUBSET
                            {
                            dbg.location(324,67);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3505); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:77: o= SETEQUALS
                            {
                            dbg.location(324,78);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3511); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(324,91);
                    LP335=(Token)match(input,LP,FOLLOW_LP_in_bagOp3515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP335);

                    dbg.location(324,96);
                    pushFollow(FOLLOW_dateTimeBag_in_bagOp3519);
                    r7=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dateTimeBag.add(r7.getTree());
                    dbg.location(324,109);
                    RP336=(Token)match(input,RP,FOLLOW_RP_in_bagOp3521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP336);


                    // AST REWRITE
                    // elements: l7, o, r7
                    // token labels: o
                    // rule labels: retval, l7, r7
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l7=new RewriteRuleSubtreeStream(adaptor,"rule l7",l7!=null?l7.tree:null);
                    RewriteRuleSubtreeStream stream_r7=new RewriteRuleSubtreeStream(adaptor,"rule r7",r7!=null?r7.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:6: -> ^( $o DATETIME $l7 $r7)
                    {
                        dbg.location(325,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:325:9: ^( $o DATETIME $l7 $r7)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(325,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(325,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DATETIME, "DATETIME")
                        );
                        dbg.location(325,24);
                        adaptor.addChild(root_1, stream_l7.nextTree());
                        dbg.location(325,28);
                        adaptor.addChild(root_1, stream_r7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:4: ( base64BinaryBag )=>l8= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r8= base64BinaryBag RP
                    {
                    dbg.location(326,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp3555);
                    l8=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(l8.getTree());
                    dbg.location(326,45);
                    DOT337=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT337);

                    dbg.location(326,49);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:49: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt40=3;
                    try { dbg.enterSubRule(40);
                    try { dbg.enterDecision(40, decisionCanBacktrack[40]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt40=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt40=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(40);}

                    switch (alt40) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:51: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(326,52);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3563); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:74: o= SUBSET
                            {
                            dbg.location(326,75);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3569); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:85: o= SETEQUALS
                            {
                            dbg.location(326,86);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3575); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}

                    dbg.location(326,99);
                    LP338=(Token)match(input,LP,FOLLOW_LP_in_bagOp3579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP338);

                    dbg.location(326,104);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp3583);
                    r8=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(r8.getTree());
                    dbg.location(326,121);
                    RP339=(Token)match(input,RP,FOLLOW_RP_in_bagOp3585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP339);


                    // AST REWRITE
                    // elements: l8, o, r8
                    // token labels: o
                    // rule labels: retval, l8, r8
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l8=new RewriteRuleSubtreeStream(adaptor,"rule l8",l8!=null?l8.tree:null);
                    RewriteRuleSubtreeStream stream_r8=new RewriteRuleSubtreeStream(adaptor,"rule r8",r8!=null?r8.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:6: -> ^( $o BASE64BINARY $l8 $r8)
                    {
                        dbg.location(327,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:327:9: ^( $o BASE64BINARY $l8 $r8)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(327,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(327,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BASE64BINARY, "BASE64BINARY")
                        );
                        dbg.location(327,28);
                        adaptor.addChild(root_1, stream_l8.nextTree());
                        dbg.location(327,32);
                        adaptor.addChild(root_1, stream_r8.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:4: ( dayTimeDurationBag )=>l9= dayTimeDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP r9= dayTimeDurationBag RP
                    {
                    dbg.location(328,31);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp3619);
                    l9=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationBag.add(l9.getTree());
                    dbg.location(328,51);
                    DOT340=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT340);

                    dbg.location(328,55);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:55: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt41=3;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41, decisionCanBacktrack[41]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt41=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt41=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt41=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:57: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(328,58);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3627); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:80: o= SUBSET
                            {
                            dbg.location(328,81);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3633); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:91: o= SETEQUALS
                            {
                            dbg.location(328,92);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(328,105);
                    LP341=(Token)match(input,LP,FOLLOW_LP_in_bagOp3643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP341);

                    dbg.location(328,110);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_bagOp3647);
                    r9=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayTimeDurationBag.add(r9.getTree());
                    dbg.location(328,130);
                    RP342=(Token)match(input,RP,FOLLOW_RP_in_bagOp3649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP342);


                    // AST REWRITE
                    // elements: l9, r9, o
                    // token labels: o
                    // rule labels: retval, l9, r9
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l9=new RewriteRuleSubtreeStream(adaptor,"rule l9",l9!=null?l9.tree:null);
                    RewriteRuleSubtreeStream stream_r9=new RewriteRuleSubtreeStream(adaptor,"rule r9",r9!=null?r9.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 329:6: -> ^( $o DAYTIMEDURATION $l9 $r9)
                    {
                        dbg.location(329,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:329:9: ^( $o DAYTIMEDURATION $l9 $r9)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(329,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(329,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DAYTIMEDURATION, "DAYTIMEDURATION")
                        );
                        dbg.location(329,31);
                        adaptor.addChild(root_1, stream_l9.nextTree());
                        dbg.location(329,35);
                        adaptor.addChild(root_1, stream_r9.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:4: ( yearMonthDurationBag )=>lA= yearMonthDurationBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rA= yearMonthDurationBag RP
                    {
                    dbg.location(330,33);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp3683);
                    lA=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationBag.add(lA.getTree());
                    dbg.location(330,55);
                    DOT343=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT343);

                    dbg.location(330,59);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:59: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt42=3;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42, decisionCanBacktrack[42]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt42=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt42=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt42=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:61: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(330,62);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3691); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:84: o= SUBSET
                            {
                            dbg.location(330,85);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3697); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:95: o= SETEQUALS
                            {
                            dbg.location(330,96);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3703); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}

                    dbg.location(330,109);
                    LP344=(Token)match(input,LP,FOLLOW_LP_in_bagOp3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP344);

                    dbg.location(330,114);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_bagOp3711);
                    rA=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearMonthDurationBag.add(rA.getTree());
                    dbg.location(330,136);
                    RP345=(Token)match(input,RP,FOLLOW_RP_in_bagOp3713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP345);


                    // AST REWRITE
                    // elements: o, rA, lA
                    // token labels: o
                    // rule labels: retval, rA, lA
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_rA=new RewriteRuleSubtreeStream(adaptor,"rule rA",rA!=null?rA.tree:null);
                    RewriteRuleSubtreeStream stream_lA=new RewriteRuleSubtreeStream(adaptor,"rule lA",lA!=null?lA.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:6: -> ^( $o YEARMONTHDURATION $lA $rA)
                    {
                        dbg.location(331,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:331:9: ^( $o YEARMONTHDURATION $lA $rA)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(331,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(331,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(YEARMONTHDURATION, "YEARMONTHDURATION")
                        );
                        dbg.location(331,33);
                        adaptor.addChild(root_1, stream_lA.nextTree());
                        dbg.location(331,37);
                        adaptor.addChild(root_1, stream_rA.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:4: ( anyUriBag )=>lB= anyUriBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rB= anyUriBag RP
                    {
                    dbg.location(332,22);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp3747);
                    lB=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriBag.add(lB.getTree());
                    dbg.location(332,33);
                    DOT346=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT346);

                    dbg.location(332,37);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:37: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt43=3;
                    try { dbg.enterSubRule(43);
                    try { dbg.enterDecision(43, decisionCanBacktrack[43]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt43=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt43=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(43);}

                    switch (alt43) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:39: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(332,40);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3755); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:62: o= SUBSET
                            {
                            dbg.location(332,63);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:73: o= SETEQUALS
                            {
                            dbg.location(332,74);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3767); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(43);}

                    dbg.location(332,87);
                    LP347=(Token)match(input,LP,FOLLOW_LP_in_bagOp3771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP347);

                    dbg.location(332,92);
                    pushFollow(FOLLOW_anyUriBag_in_bagOp3775);
                    rB=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anyUriBag.add(rB.getTree());
                    dbg.location(332,103);
                    RP348=(Token)match(input,RP,FOLLOW_RP_in_bagOp3777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP348);


                    // AST REWRITE
                    // elements: lB, rB, o
                    // token labels: o
                    // rule labels: retval, lB, rB
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lB=new RewriteRuleSubtreeStream(adaptor,"rule lB",lB!=null?lB.tree:null);
                    RewriteRuleSubtreeStream stream_rB=new RewriteRuleSubtreeStream(adaptor,"rule rB",rB!=null?rB.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:6: -> ^( $o ANYURI $lB $rB)
                    {
                        dbg.location(333,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:333:9: ^( $o ANYURI $lB $rB)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(333,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(333,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ANYURI, "ANYURI")
                        );
                        dbg.location(333,22);
                        adaptor.addChild(root_1, stream_lB.nextTree());
                        dbg.location(333,26);
                        adaptor.addChild(root_1, stream_rB.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:4: ( x500NameBag )=>lC= x500NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rC= x500NameBag RP
                    {
                    dbg.location(334,24);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp3811);
                    lC=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameBag.add(lC.getTree());
                    dbg.location(334,37);
                    DOT349=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT349);

                    dbg.location(334,41);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:41: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt44=3;
                    try { dbg.enterSubRule(44);
                    try { dbg.enterDecision(44, decisionCanBacktrack[44]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt44=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt44=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(44);}

                    switch (alt44) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:43: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(334,44);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3819); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:66: o= SUBSET
                            {
                            dbg.location(334,67);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3825); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:77: o= SETEQUALS
                            {
                            dbg.location(334,78);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3831); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(44);}

                    dbg.location(334,91);
                    LP350=(Token)match(input,LP,FOLLOW_LP_in_bagOp3835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP350);

                    dbg.location(334,96);
                    pushFollow(FOLLOW_x500NameBag_in_bagOp3839);
                    rC=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_x500NameBag.add(rC.getTree());
                    dbg.location(334,109);
                    RP351=(Token)match(input,RP,FOLLOW_RP_in_bagOp3841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP351);


                    // AST REWRITE
                    // elements: lC, o, rC
                    // token labels: o
                    // rule labels: retval, lC, rC
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lC=new RewriteRuleSubtreeStream(adaptor,"rule lC",lC!=null?lC.tree:null);
                    RewriteRuleSubtreeStream stream_rC=new RewriteRuleSubtreeStream(adaptor,"rule rC",rC!=null?rC.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:6: -> ^( $o X500NAME $lC $rC)
                    {
                        dbg.location(335,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:335:9: ^( $o X500NAME $lC $rC)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(335,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(335,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(X500NAME, "X500NAME")
                        );
                        dbg.location(335,24);
                        adaptor.addChild(root_1, stream_lC.nextTree());
                        dbg.location(335,28);
                        adaptor.addChild(root_1, stream_rC.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:4: ( rfc822NameBag )=>lD= rfc822NameBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rD= rfc822NameBag RP
                    {
                    dbg.location(336,26);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp3875);
                    lD=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameBag.add(lD.getTree());
                    dbg.location(336,41);
                    DOT352=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT352);

                    dbg.location(336,45);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:45: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt45=3;
                    try { dbg.enterSubRule(45);
                    try { dbg.enterDecision(45, decisionCanBacktrack[45]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt45=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt45=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt45=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(45);}

                    switch (alt45) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:47: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(336,48);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3883); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:70: o= SUBSET
                            {
                            dbg.location(336,71);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3889); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:81: o= SETEQUALS
                            {
                            dbg.location(336,82);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3895); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(45);}

                    dbg.location(336,95);
                    LP353=(Token)match(input,LP,FOLLOW_LP_in_bagOp3899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP353);

                    dbg.location(336,100);
                    pushFollow(FOLLOW_rfc822NameBag_in_bagOp3903);
                    rD=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rfc822NameBag.add(rD.getTree());
                    dbg.location(336,115);
                    RP354=(Token)match(input,RP,FOLLOW_RP_in_bagOp3905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP354);


                    // AST REWRITE
                    // elements: rD, lD, o
                    // token labels: o
                    // rule labels: retval, lD, rD
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lD=new RewriteRuleSubtreeStream(adaptor,"rule lD",lD!=null?lD.tree:null);
                    RewriteRuleSubtreeStream stream_rD=new RewriteRuleSubtreeStream(adaptor,"rule rD",rD!=null?rD.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:6: -> ^( $o RFC822NAME $lD $rD)
                    {
                        dbg.location(337,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:337:9: ^( $o RFC822NAME $lD $rD)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(337,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(337,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(RFC822NAME, "RFC822NAME")
                        );
                        dbg.location(337,26);
                        adaptor.addChild(root_1, stream_lD.nextTree());
                        dbg.location(337,30);
                        adaptor.addChild(root_1, stream_rD.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:4: ( hexBinaryBag )=>lE= hexBinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rE= hexBinaryBag RP
                    {
                    dbg.location(338,25);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp3939);
                    lE=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryBag.add(lE.getTree());
                    dbg.location(338,39);
                    DOT355=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp3941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT355);

                    dbg.location(338,43);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:43: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt46=3;
                    try { dbg.enterSubRule(46);
                    try { dbg.enterDecision(46, decisionCanBacktrack[46]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt46=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt46=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt46=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(46);}

                    switch (alt46) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:45: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(338,46);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp3947); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:68: o= SUBSET
                            {
                            dbg.location(338,69);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp3953); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:79: o= SETEQUALS
                            {
                            dbg.location(338,80);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp3959); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(46);}

                    dbg.location(338,93);
                    LP356=(Token)match(input,LP,FOLLOW_LP_in_bagOp3963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP356);

                    dbg.location(338,98);
                    pushFollow(FOLLOW_hexBinaryBag_in_bagOp3967);
                    rE=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hexBinaryBag.add(rE.getTree());
                    dbg.location(338,112);
                    RP357=(Token)match(input,RP,FOLLOW_RP_in_bagOp3969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP357);


                    // AST REWRITE
                    // elements: lE, o, rE
                    // token labels: o
                    // rule labels: retval, lE, rE
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lE=new RewriteRuleSubtreeStream(adaptor,"rule lE",lE!=null?lE.tree:null);
                    RewriteRuleSubtreeStream stream_rE=new RewriteRuleSubtreeStream(adaptor,"rule rE",rE!=null?rE.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 339:6: -> ^( $o HEXBINARY $lE $rE)
                    {
                        dbg.location(339,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:339:9: ^( $o HEXBINARY $lE $rE)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(339,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(339,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(HEXBINARY, "HEXBINARY")
                        );
                        dbg.location(339,25);
                        adaptor.addChild(root_1, stream_lE.nextTree());
                        dbg.location(339,29);
                        adaptor.addChild(root_1, stream_rE.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: ( base64BinaryBag )=>lF= base64BinaryBag DOT (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS ) LP rF= base64BinaryBag RP
                    {
                    dbg.location(340,27);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp4002);
                    lF=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(lF.getTree());
                    dbg.location(340,44);
                    DOT358=(Token)match(input,DOT,FOLLOW_DOT_in_bagOp4004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT358);

                    dbg.location(340,48);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:48: (o= ATLEASTONEMENBEROF |o= SUBSET |o= SETEQUALS )
                    int alt47=3;
                    try { dbg.enterSubRule(47);
                    try { dbg.enterDecision(47, decisionCanBacktrack[47]);

                    switch ( input.LA(1) ) {
                    case ATLEASTONEMENBEROF:
                        {
                        alt47=1;
                        }
                        break;
                    case SUBSET:
                        {
                        alt47=2;
                        }
                        break;
                    case SETEQUALS:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(47);}

                    switch (alt47) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:50: o= ATLEASTONEMENBEROF
                            {
                            dbg.location(340,51);
                            o=(Token)match(input,ATLEASTONEMENBEROF,FOLLOW_ATLEASTONEMENBEROF_in_bagOp4010); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ATLEASTONEMENBEROF.add(o);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:73: o= SUBSET
                            {
                            dbg.location(340,74);
                            o=(Token)match(input,SUBSET,FOLLOW_SUBSET_in_bagOp4016); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBSET.add(o);


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:84: o= SETEQUALS
                            {
                            dbg.location(340,85);
                            o=(Token)match(input,SETEQUALS,FOLLOW_SETEQUALS_in_bagOp4022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SETEQUALS.add(o);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(47);}

                    dbg.location(340,98);
                    LP359=(Token)match(input,LP,FOLLOW_LP_in_bagOp4026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP359);

                    dbg.location(340,103);
                    pushFollow(FOLLOW_base64BinaryBag_in_bagOp4030);
                    rF=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base64BinaryBag.add(rF.getTree());
                    dbg.location(340,120);
                    RP360=(Token)match(input,RP,FOLLOW_RP_in_bagOp4032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP360);


                    // AST REWRITE
                    // elements: o, lF, rF
                    // token labels: o
                    // rule labels: retval, lF, rF
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_lF=new RewriteRuleSubtreeStream(adaptor,"rule lF",lF!=null?lF.tree:null);
                    RewriteRuleSubtreeStream stream_rF=new RewriteRuleSubtreeStream(adaptor,"rule rF",rF!=null?rF.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 341:6: -> ^( $o BASE64BINARY $lF $rF)
                    {
                        dbg.location(341,9);
                        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:341:9: ^( $o BASE64BINARY $lF $rF)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(341,12);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_o.nextNode(), root_1);

                        dbg.location(341,14);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(BASE64BINARY, "BASE64BINARY")
                        );
                        dbg.location(341,28);
                        adaptor.addChild(root_1, stream_lF.nextTree());
                        dbg.location(341,32);
                        adaptor.addChild(root_1, stream_rF.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(342, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:344:1: integerExpr : ( INTEGER_CONSTANT | ( ONEANDONLY )=> ( integerBag DOT ONEANDONLY LP RP ) | anyBag DOT ! SIZE LP ! RP !);
    public final GrammarParser.integerExpr_return integerExpr() throws RecognitionException {
        GrammarParser.integerExpr_return retval = new GrammarParser.integerExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INTEGER_CONSTANT361=null;
        Token DOT363=null;
        Token ONEANDONLY364=null;
        Token LP365=null;
        Token RP366=null;
        Token DOT368=null;
        Token SIZE369=null;
        Token LP370=null;
        Token RP371=null;
        GrammarParser.integerBag_return integerBag362 =null;

        GrammarParser.anyBag_return anyBag367 =null;


        CommonTree INTEGER_CONSTANT361_tree=null;
        CommonTree DOT363_tree=null;
        CommonTree ONEANDONLY364_tree=null;
        CommonTree LP365_tree=null;
        CommonTree RP366_tree=null;
        CommonTree DOT368_tree=null;
        CommonTree SIZE369_tree=null;
        CommonTree LP370_tree=null;
        CommonTree RP371_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(344, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:2: ( INTEGER_CONSTANT | ( ONEANDONLY )=> ( integerBag DOT ONEANDONLY LP RP ) | anyBag DOT ! SIZE LP ! RP !)
            int alt49=3;
            try { dbg.enterDecision(49, decisionCanBacktrack[49]);

            switch ( input.LA(1) ) {
            case INTEGER_CONSTANT:
                {
                alt49=1;
                }
                break;
            case INTEGER:
                {
                int LA49_2 = input.LA(2);

                if ( (synpred20_Grammar()) ) {
                    alt49=2;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BAG:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred20_Grammar()) ) {
                    alt49=2;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ACTION:
            case ANYURI:
            case BASE64BINARY:
            case BOOLEAN:
            case DATE:
            case DATETIME:
            case DAYTIMEDURATION:
            case DOUBLE:
            case ENVIRONMENT:
            case HEXBINARY:
            case RESOURCE:
            case RFC822NAME:
            case STRING:
            case SUBJECT:
            case TIME:
            case X500NAME:
            case YEARMONTHDURATION:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:345:4: INTEGER_CONSTANT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(345,4);
                    INTEGER_CONSTANT361=(Token)match(input,INTEGER_CONSTANT,FOLLOW_INTEGER_CONSTANT_in_integerExpr4063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER_CONSTANT361_tree = 
                    (CommonTree)adaptor.create(INTEGER_CONSTANT361)
                    ;
                    adaptor.addChild(root_0, INTEGER_CONSTANT361_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:4: ( ONEANDONLY )=> ( integerBag DOT ONEANDONLY LP RP )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(346,20);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:20: ( integerBag DOT ONEANDONLY LP RP )
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:21: integerBag DOT ONEANDONLY LP RP
                    {
                    dbg.location(346,21);
                    pushFollow(FOLLOW_integerBag_in_integerExpr4075);
                    integerBag362=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag362.getTree());
                    dbg.location(346,32);
                    DOT363=(Token)match(input,DOT,FOLLOW_DOT_in_integerExpr4077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT363_tree = 
                    (CommonTree)adaptor.create(DOT363)
                    ;
                    adaptor.addChild(root_0, DOT363_tree);
                    }
                    dbg.location(346,36);
                    ONEANDONLY364=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_integerExpr4079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY364_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY364)
                    ;
                    adaptor.addChild(root_0, ONEANDONLY364_tree);
                    }
                    dbg.location(346,47);
                    LP365=(Token)match(input,LP,FOLLOW_LP_in_integerExpr4081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP365_tree = 
                    (CommonTree)adaptor.create(LP365)
                    ;
                    adaptor.addChild(root_0, LP365_tree);
                    }
                    dbg.location(346,50);
                    RP366=(Token)match(input,RP,FOLLOW_RP_in_integerExpr4083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP366_tree = 
                    (CommonTree)adaptor.create(RP366)
                    ;
                    adaptor.addChild(root_0, RP366_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:347:4: anyBag DOT ! SIZE LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(347,4);
                    pushFollow(FOLLOW_anyBag_in_integerExpr4089);
                    anyBag367=anyBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyBag367.getTree());
                    dbg.location(347,14);
                    DOT368=(Token)match(input,DOT,FOLLOW_DOT_in_integerExpr4091); if (state.failed) return retval;
                    dbg.location(347,16);
                    SIZE369=(Token)match(input,SIZE,FOLLOW_SIZE_in_integerExpr4094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SIZE369_tree = 
                    (CommonTree)adaptor.create(SIZE369)
                    ;
                    adaptor.addChild(root_0, SIZE369_tree);
                    }
                    dbg.location(347,23);
                    LP370=(Token)match(input,LP,FOLLOW_LP_in_integerExpr4096); if (state.failed) return retval;
                    dbg.location(347,27);
                    RP371=(Token)match(input,RP,FOLLOW_RP_in_integerExpr4099); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(352, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:353:1: integerBag : ( INTEGER ^ LP ! ( STRING_LIST | attributeSelector ) RP !| BAG ^ LP ! integerExpr ( ',' ! integerExpr )+ RP !) ( DOT ! ( INTERSECTION | UNION ) ^ LP ! integerBag RP !)* ;
    public final GrammarParser.integerBag_return integerBag() throws RecognitionException {
        GrammarParser.integerBag_return retval = new GrammarParser.integerBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INTEGER372=null;
        Token LP373=null;
        Token STRING_LIST374=null;
        Token RP376=null;
        Token BAG377=null;
        Token LP378=null;
        Token char_literal380=null;
        Token RP382=null;
        Token DOT383=null;
        Token set384=null;
        Token LP385=null;
        Token RP387=null;
        GrammarParser.attributeSelector_return attributeSelector375 =null;

        GrammarParser.integerExpr_return integerExpr379 =null;

        GrammarParser.integerExpr_return integerExpr381 =null;

        GrammarParser.integerBag_return integerBag386 =null;


        CommonTree INTEGER372_tree=null;
        CommonTree LP373_tree=null;
        CommonTree STRING_LIST374_tree=null;
        CommonTree RP376_tree=null;
        CommonTree BAG377_tree=null;
        CommonTree LP378_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree RP382_tree=null;
        CommonTree DOT383_tree=null;
        CommonTree set384_tree=null;
        CommonTree LP385_tree=null;
        CommonTree RP387_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:2: ( ( INTEGER ^ LP ! ( STRING_LIST | attributeSelector ) RP !| BAG ^ LP ! integerExpr ( ',' ! integerExpr )+ RP !) ( DOT ! ( INTERSECTION | UNION ) ^ LP ! integerBag RP !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:4: ( INTEGER ^ LP ! ( STRING_LIST | attributeSelector ) RP !| BAG ^ LP ! integerExpr ( ',' ! integerExpr )+ RP !) ( DOT ! ( INTERSECTION | UNION ) ^ LP ! integerBag RP !)*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(354,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:4: ( INTEGER ^ LP ! ( STRING_LIST | attributeSelector ) RP !| BAG ^ LP ! integerExpr ( ',' ! integerExpr )+ RP !)
            int alt52=2;
            try { dbg.enterSubRule(52);
            try { dbg.enterDecision(52, decisionCanBacktrack[52]);

            int LA52_0 = input.LA(1);

            if ( (LA52_0==INTEGER) ) {
                alt52=1;
            }
            else if ( (LA52_0==BAG) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:5: INTEGER ^ LP ! ( STRING_LIST | attributeSelector ) RP !
                    {
                    dbg.location(354,12);
                    INTEGER372=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integerBag4115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER372_tree = 
                    (CommonTree)adaptor.create(INTEGER372)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(INTEGER372_tree, root_0);
                    }
                    dbg.location(354,16);
                    LP373=(Token)match(input,LP,FOLLOW_LP_in_integerBag4118); if (state.failed) return retval;
                    dbg.location(354,18);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:18: ( STRING_LIST | attributeSelector )
                    int alt50=2;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50, decisionCanBacktrack[50]);

                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==STRING_LIST) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==ACTION||LA50_0==ENVIRONMENT||LA50_0==RESOURCE||LA50_0==SUBJECT) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:19: STRING_LIST
                            {
                            dbg.location(354,19);
                            STRING_LIST374=(Token)match(input,STRING_LIST,FOLLOW_STRING_LIST_in_integerBag4122); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING_LIST374_tree = 
                            (CommonTree)adaptor.create(STRING_LIST374)
                            ;
                            adaptor.addChild(root_0, STRING_LIST374_tree);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:354:33: attributeSelector
                            {
                            dbg.location(354,33);
                            pushFollow(FOLLOW_attributeSelector_in_integerBag4126);
                            attributeSelector375=attributeSelector();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector375.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}

                    dbg.location(354,54);
                    RP376=(Token)match(input,RP,FOLLOW_RP_in_integerBag4129); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:5: BAG ^ LP ! integerExpr ( ',' ! integerExpr )+ RP !
                    {
                    dbg.location(355,8);
                    BAG377=(Token)match(input,BAG,FOLLOW_BAG_in_integerBag4136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAG377_tree = 
                    (CommonTree)adaptor.create(BAG377)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(BAG377_tree, root_0);
                    }
                    dbg.location(355,12);
                    LP378=(Token)match(input,LP,FOLLOW_LP_in_integerBag4139); if (state.failed) return retval;
                    dbg.location(355,14);
                    pushFollow(FOLLOW_integerExpr_in_integerBag4142);
                    integerExpr379=integerExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr379.getTree());
                    dbg.location(355,26);
                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:26: ( ',' ! integerExpr )+
                    int cnt51=0;
                    try { dbg.enterSubRule(51);

                    loop51:
                    do {
                        int alt51=2;
                        try { dbg.enterDecision(51, decisionCanBacktrack[51]);

                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==93) ) {
                            alt51=1;
                        }


                        } finally {dbg.exitDecision(51);}

                        switch (alt51) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:355:28: ',' ! integerExpr
                    	    {
                    	    dbg.location(355,31);
                    	    char_literal380=(Token)match(input,93,FOLLOW_93_in_integerBag4146); if (state.failed) return retval;
                    	    dbg.location(355,33);
                    	    pushFollow(FOLLOW_integerExpr_in_integerBag4149);
                    	    integerExpr381=integerExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerExpr381.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt51++;
                    } while (true);
                    } finally {dbg.exitSubRule(51);}

                    dbg.location(355,49);
                    RP382=(Token)match(input,RP,FOLLOW_RP_in_integerBag4153); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(52);}

            dbg.location(356,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:3: ( DOT ! ( INTERSECTION | UNION ) ^ LP ! integerBag RP !)*
            try { dbg.enterSubRule(53);

            loop53:
            do {
                int alt53=2;
                try { dbg.enterDecision(53, decisionCanBacktrack[53]);

                int LA53_0 = input.LA(1);

                if ( (LA53_0==DOT) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==INTERSECTION||LA53_1==UNION) ) {
                        alt53=1;
                    }


                }


                } finally {dbg.exitDecision(53);}

                switch (alt53) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:356:4: DOT ! ( INTERSECTION | UNION ) ^ LP ! integerBag RP !
            	    {
            	    dbg.location(356,7);
            	    DOT383=(Token)match(input,DOT,FOLLOW_DOT_in_integerBag4160); if (state.failed) return retval;
            	    dbg.location(356,33);
            	    set384=(Token)input.LT(1);

            	    set384=(Token)input.LT(1);

            	    if ( input.LA(1)==INTERSECTION||input.LA(1)==UNION ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set384)
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

            	    dbg.location(356,37);
            	    LP385=(Token)match(input,LP,FOLLOW_LP_in_integerBag4174); if (state.failed) return retval;
            	    dbg.location(356,39);
            	    pushFollow(FOLLOW_integerBag_in_integerBag4177);
            	    integerBag386=integerBag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag386.getTree());
            	    dbg.location(356,52);
            	    RP387=(Token)match(input,RP,FOLLOW_RP_in_integerBag4179); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);
            } finally {dbg.exitSubRule(53);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(357, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:359:1: doubleExpr : ( DOUBLE_CONSTANT ^| DOUBLE ^ LP ! stringExpr RP !);
    public final GrammarParser.doubleExpr_return doubleExpr() throws RecognitionException {
        GrammarParser.doubleExpr_return retval = new GrammarParser.doubleExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOUBLE_CONSTANT388=null;
        Token DOUBLE389=null;
        Token LP390=null;
        Token RP392=null;
        GrammarParser.stringExpr_return stringExpr391 =null;


        CommonTree DOUBLE_CONSTANT388_tree=null;
        CommonTree DOUBLE389_tree=null;
        CommonTree LP390_tree=null;
        CommonTree RP392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:360:2: ( DOUBLE_CONSTANT ^| DOUBLE ^ LP ! stringExpr RP !)
            int alt54=2;
            try { dbg.enterDecision(54, decisionCanBacktrack[54]);

            int LA54_0 = input.LA(1);

            if ( (LA54_0==DOUBLE_CONSTANT) ) {
                alt54=1;
            }
            else if ( (LA54_0==DOUBLE) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:360:4: DOUBLE_CONSTANT ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(360,19);
                    DOUBLE_CONSTANT388=(Token)match(input,DOUBLE_CONSTANT,FOLLOW_DOUBLE_CONSTANT_in_doubleExpr4193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE_CONSTANT388_tree = 
                    (CommonTree)adaptor.create(DOUBLE_CONSTANT388)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOUBLE_CONSTANT388_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:361:4: DOUBLE ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(361,10);
                    DOUBLE389=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_doubleExpr4199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE389_tree = 
                    (CommonTree)adaptor.create(DOUBLE389)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOUBLE389_tree, root_0);
                    }
                    dbg.location(361,14);
                    LP390=(Token)match(input,LP,FOLLOW_LP_in_doubleExpr4202); if (state.failed) return retval;
                    dbg.location(361,16);
                    pushFollow(FOLLOW_stringExpr_in_doubleExpr4205);
                    stringExpr391=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr391.getTree());
                    dbg.location(361,29);
                    RP392=(Token)match(input,RP,FOLLOW_RP_in_doubleExpr4207); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(364, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:365:1: doubleBag : ( DOUBLE ^ STRING_CONSTANT_LIST | DOUBLE LP attributeSelector RP );
    public final GrammarParser.doubleBag_return doubleBag() throws RecognitionException {
        GrammarParser.doubleBag_return retval = new GrammarParser.doubleBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOUBLE393=null;
        Token STRING_CONSTANT_LIST394=null;
        Token DOUBLE395=null;
        Token LP396=null;
        Token RP398=null;
        GrammarParser.attributeSelector_return attributeSelector397 =null;


        CommonTree DOUBLE393_tree=null;
        CommonTree STRING_CONSTANT_LIST394_tree=null;
        CommonTree DOUBLE395_tree=null;
        CommonTree LP396_tree=null;
        CommonTree RP398_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doubleBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:2: ( DOUBLE ^ STRING_CONSTANT_LIST | DOUBLE LP attributeSelector RP )
            int alt55=2;
            try { dbg.enterDecision(55, decisionCanBacktrack[55]);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOUBLE) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==STRING_CONSTANT_LIST) ) {
                    alt55=1;
                }
                else if ( (LA55_1==LP) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:366:4: DOUBLE ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(366,10);
                    DOUBLE393=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_doubleBag4220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE393_tree = 
                    (CommonTree)adaptor.create(DOUBLE393)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DOUBLE393_tree, root_0);
                    }
                    dbg.location(366,12);
                    STRING_CONSTANT_LIST394=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_doubleBag4223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST394_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST394)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST394_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:367:4: DOUBLE LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(367,4);
                    DOUBLE395=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_doubleBag4228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE395_tree = 
                    (CommonTree)adaptor.create(DOUBLE395)
                    ;
                    adaptor.addChild(root_0, DOUBLE395_tree);
                    }
                    dbg.location(367,11);
                    LP396=(Token)match(input,LP,FOLLOW_LP_in_doubleBag4230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP396_tree = 
                    (CommonTree)adaptor.create(LP396)
                    ;
                    adaptor.addChild(root_0, LP396_tree);
                    }
                    dbg.location(367,14);
                    pushFollow(FOLLOW_attributeSelector_in_doubleBag4232);
                    attributeSelector397=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector397.getTree());
                    dbg.location(367,32);
                    RP398=(Token)match(input,RP,FOLLOW_RP_in_doubleBag4234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP398_tree = 
                    (CommonTree)adaptor.create(RP398)
                    ;
                    adaptor.addChild(root_0, RP398_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(370, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:372:1: stringExpr : ( STRING_CONSTANT ^| stringBag DOT ! ONEANDONLY ^ LP ! RP !) ( DOT ! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE ) ^ LP ! RP !)* ;
    public final GrammarParser.stringExpr_return stringExpr() throws RecognitionException {
        GrammarParser.stringExpr_return retval = new GrammarParser.stringExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_CONSTANT399=null;
        Token DOT401=null;
        Token ONEANDONLY402=null;
        Token LP403=null;
        Token RP404=null;
        Token DOT405=null;
        Token set406=null;
        Token LP407=null;
        Token RP408=null;
        GrammarParser.stringBag_return stringBag400 =null;


        CommonTree STRING_CONSTANT399_tree=null;
        CommonTree DOT401_tree=null;
        CommonTree ONEANDONLY402_tree=null;
        CommonTree LP403_tree=null;
        CommonTree RP404_tree=null;
        CommonTree DOT405_tree=null;
        CommonTree set406_tree=null;
        CommonTree LP407_tree=null;
        CommonTree RP408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:2: ( ( STRING_CONSTANT ^| stringBag DOT ! ONEANDONLY ^ LP ! RP !) ( DOT ! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE ) ^ LP ! RP !)* )
            dbg.enterAlt(1);

            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:4: ( STRING_CONSTANT ^| stringBag DOT ! ONEANDONLY ^ LP ! RP !) ( DOT ! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE ) ^ LP ! RP !)*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(373,4);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:4: ( STRING_CONSTANT ^| stringBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt56=2;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56, decisionCanBacktrack[56]);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==STRING_CONSTANT) ) {
                alt56=1;
            }
            else if ( (LA56_0==STRING) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:373:5: STRING_CONSTANT ^
                    {
                    dbg.location(373,20);
                    STRING_CONSTANT399=(Token)match(input,STRING_CONSTANT,FOLLOW_STRING_CONSTANT_in_stringExpr4248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT399_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT399)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(STRING_CONSTANT399_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:374:5: stringBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    dbg.location(374,5);
                    pushFollow(FOLLOW_stringBag_in_stringExpr4255);
                    stringBag400=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag400.getTree());
                    dbg.location(374,18);
                    DOT401=(Token)match(input,DOT,FOLLOW_DOT_in_stringExpr4257); if (state.failed) return retval;
                    dbg.location(374,30);
                    ONEANDONLY402=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_stringExpr4260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY402_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY402)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY402_tree, root_0);
                    }
                    dbg.location(374,34);
                    LP403=(Token)match(input,LP,FOLLOW_LP_in_stringExpr4263); if (state.failed) return retval;
                    dbg.location(374,38);
                    RP404=(Token)match(input,RP,FOLLOW_RP_in_stringExpr4266); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}

            dbg.location(375,3);
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:375:3: ( DOT ! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE ) ^ LP ! RP !)*
            try { dbg.enterSubRule(57);

            loop57:
            do {
                int alt57=2;
                try { dbg.enterDecision(57, decisionCanBacktrack[57]);

                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    int LA57_2 = input.LA(2);

                    if ( ((LA57_2 >= NORMALIZESPACE && LA57_2 <= NORMALIZETOLOWERCASE)||LA57_2==REQUIRED) ) {
                        alt57=1;
                    }


                }


                } finally {dbg.exitDecision(57);}

                switch (alt57) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:375:4: DOT ! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE ) ^ LP ! RP !
            	    {
            	    dbg.location(375,7);
            	    DOT405=(Token)match(input,DOT,FOLLOW_DOT_in_stringExpr4273); if (state.failed) return retval;
            	    dbg.location(375,60);
            	    set406=(Token)input.LT(1);

            	    set406=(Token)input.LT(1);

            	    if ( (input.LA(1) >= NORMALIZESPACE && input.LA(1) <= NORMALIZETOLOWERCASE)||input.LA(1)==REQUIRED ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set406)
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

            	    dbg.location(375,64);
            	    LP407=(Token)match(input,LP,FOLLOW_LP_in_stringExpr4290); if (state.failed) return retval;
            	    dbg.location(375,68);
            	    RP408=(Token)match(input,RP,FOLLOW_RP_in_stringExpr4293); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);
            } finally {dbg.exitSubRule(57);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(376, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:378:1: stringBag : ( STRING ^ STRING_CONSTANT_LIST | STRING LP attributeSelector RP );
    public final GrammarParser.stringBag_return stringBag() throws RecognitionException {
        GrammarParser.stringBag_return retval = new GrammarParser.stringBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING409=null;
        Token STRING_CONSTANT_LIST410=null;
        Token STRING411=null;
        Token LP412=null;
        Token RP414=null;
        GrammarParser.attributeSelector_return attributeSelector413 =null;


        CommonTree STRING409_tree=null;
        CommonTree STRING_CONSTANT_LIST410_tree=null;
        CommonTree STRING411_tree=null;
        CommonTree LP412_tree=null;
        CommonTree RP414_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stringBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:379:2: ( STRING ^ STRING_CONSTANT_LIST | STRING LP attributeSelector RP )
            int alt58=2;
            try { dbg.enterDecision(58, decisionCanBacktrack[58]);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==STRING) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==STRING_CONSTANT_LIST) ) {
                    alt58=1;
                }
                else if ( (LA58_1==LP) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:379:4: STRING ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(379,10);
                    STRING409=(Token)match(input,STRING,FOLLOW_STRING_in_stringBag4307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING409_tree = 
                    (CommonTree)adaptor.create(STRING409)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(STRING409_tree, root_0);
                    }
                    dbg.location(379,12);
                    STRING_CONSTANT_LIST410=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_stringBag4310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST410_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST410)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST410_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:380:4: STRING LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(380,4);
                    STRING411=(Token)match(input,STRING,FOLLOW_STRING_in_stringBag4315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING411_tree = 
                    (CommonTree)adaptor.create(STRING411)
                    ;
                    adaptor.addChild(root_0, STRING411_tree);
                    }
                    dbg.location(380,11);
                    LP412=(Token)match(input,LP,FOLLOW_LP_in_stringBag4317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP412_tree = 
                    (CommonTree)adaptor.create(LP412)
                    ;
                    adaptor.addChild(root_0, LP412_tree);
                    }
                    dbg.location(380,14);
                    pushFollow(FOLLOW_attributeSelector_in_stringBag4319);
                    attributeSelector413=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector413.getTree());
                    dbg.location(380,32);
                    RP414=(Token)match(input,RP,FOLLOW_RP_in_stringBag4321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP414_tree = 
                    (CommonTree)adaptor.create(RP414)
                    ;
                    adaptor.addChild(root_0, RP414_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(382, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:385:1: anyUriExpr : ( ANYURI ^ LP ! stringExpr RP !| anyUriBag DOT ! ONEANDONLY ^ LP ! RP !| stringExpr DOT ! URI ^ LP ! RP !);
    public final GrammarParser.anyUriExpr_return anyUriExpr() throws RecognitionException {
        GrammarParser.anyUriExpr_return retval = new GrammarParser.anyUriExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ANYURI415=null;
        Token LP416=null;
        Token RP418=null;
        Token DOT420=null;
        Token ONEANDONLY421=null;
        Token LP422=null;
        Token RP423=null;
        Token DOT425=null;
        Token URI426=null;
        Token LP427=null;
        Token RP428=null;
        GrammarParser.stringExpr_return stringExpr417 =null;

        GrammarParser.anyUriBag_return anyUriBag419 =null;

        GrammarParser.stringExpr_return stringExpr424 =null;


        CommonTree ANYURI415_tree=null;
        CommonTree LP416_tree=null;
        CommonTree RP418_tree=null;
        CommonTree DOT420_tree=null;
        CommonTree ONEANDONLY421_tree=null;
        CommonTree LP422_tree=null;
        CommonTree RP423_tree=null;
        CommonTree DOT425_tree=null;
        CommonTree URI426_tree=null;
        CommonTree LP427_tree=null;
        CommonTree RP428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:386:2: ( ANYURI ^ LP ! stringExpr RP !| anyUriBag DOT ! ONEANDONLY ^ LP ! RP !| stringExpr DOT ! URI ^ LP ! RP !)
            int alt59=3;
            try { dbg.enterDecision(59, decisionCanBacktrack[59]);

            int LA59_0 = input.LA(1);

            if ( (LA59_0==ANYURI) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==LP) ) {
                    int LA59_3 = input.LA(3);

                    if ( ((LA59_3 >= STRING && LA59_3 <= STRING_CONSTANT)) ) {
                        alt59=1;
                    }
                    else if ( (LA59_3==ACTION||LA59_3==ENVIRONMENT||LA59_3==RESOURCE||LA59_3==SUBJECT) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA59_1==STRING_CONSTANT_LIST) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( ((LA59_0 >= STRING && LA59_0 <= STRING_CONSTANT)) ) {
                alt59=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:386:4: ANYURI ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(386,10);
                    ANYURI415=(Token)match(input,ANYURI,FOLLOW_ANYURI_in_anyUriExpr4334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI415_tree = 
                    (CommonTree)adaptor.create(ANYURI415)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ANYURI415_tree, root_0);
                    }
                    dbg.location(386,14);
                    LP416=(Token)match(input,LP,FOLLOW_LP_in_anyUriExpr4337); if (state.failed) return retval;
                    dbg.location(386,16);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr4340);
                    stringExpr417=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr417.getTree());
                    dbg.location(386,29);
                    RP418=(Token)match(input,RP,FOLLOW_RP_in_anyUriExpr4342); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:387:4: anyUriBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(387,4);
                    pushFollow(FOLLOW_anyUriBag_in_anyUriExpr4348);
                    anyUriBag419=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag419.getTree());
                    dbg.location(387,17);
                    DOT420=(Token)match(input,DOT,FOLLOW_DOT_in_anyUriExpr4350); if (state.failed) return retval;
                    dbg.location(387,29);
                    ONEANDONLY421=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_anyUriExpr4353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY421_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY421)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY421_tree, root_0);
                    }
                    dbg.location(387,33);
                    LP422=(Token)match(input,LP,FOLLOW_LP_in_anyUriExpr4356); if (state.failed) return retval;
                    dbg.location(387,37);
                    RP423=(Token)match(input,RP,FOLLOW_RP_in_anyUriExpr4359); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:388:4: stringExpr DOT ! URI ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(388,4);
                    pushFollow(FOLLOW_stringExpr_in_anyUriExpr4365);
                    stringExpr424=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr424.getTree());
                    dbg.location(388,18);
                    DOT425=(Token)match(input,DOT,FOLLOW_DOT_in_anyUriExpr4367); if (state.failed) return retval;
                    dbg.location(388,23);
                    URI426=(Token)match(input,URI,FOLLOW_URI_in_anyUriExpr4370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI426_tree = 
                    (CommonTree)adaptor.create(URI426)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(URI426_tree, root_0);
                    }
                    dbg.location(388,27);
                    LP427=(Token)match(input,LP,FOLLOW_LP_in_anyUriExpr4373); if (state.failed) return retval;
                    dbg.location(388,31);
                    RP428=(Token)match(input,RP,FOLLOW_RP_in_anyUriExpr4376); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(391, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyUriBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:393:1: anyUriBag : ( ANYURI ^ STRING_CONSTANT_LIST | ANYURI LP attributeSelector RP );
    public final GrammarParser.anyUriBag_return anyUriBag() throws RecognitionException {
        GrammarParser.anyUriBag_return retval = new GrammarParser.anyUriBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ANYURI429=null;
        Token STRING_CONSTANT_LIST430=null;
        Token ANYURI431=null;
        Token LP432=null;
        Token RP434=null;
        GrammarParser.attributeSelector_return attributeSelector433 =null;


        CommonTree ANYURI429_tree=null;
        CommonTree STRING_CONSTANT_LIST430_tree=null;
        CommonTree ANYURI431_tree=null;
        CommonTree LP432_tree=null;
        CommonTree RP434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anyUriBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:2: ( ANYURI ^ STRING_CONSTANT_LIST | ANYURI LP attributeSelector RP )
            int alt60=2;
            try { dbg.enterDecision(60, decisionCanBacktrack[60]);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==ANYURI) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==STRING_CONSTANT_LIST) ) {
                    alt60=1;
                }
                else if ( (LA60_1==LP) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:394:4: ANYURI ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(394,10);
                    ANYURI429=(Token)match(input,ANYURI,FOLLOW_ANYURI_in_anyUriBag4390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI429_tree = 
                    (CommonTree)adaptor.create(ANYURI429)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ANYURI429_tree, root_0);
                    }
                    dbg.location(394,12);
                    STRING_CONSTANT_LIST430=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag4393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST430_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST430)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST430_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:395:4: ANYURI LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(395,4);
                    ANYURI431=(Token)match(input,ANYURI,FOLLOW_ANYURI_in_anyUriBag4398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANYURI431_tree = 
                    (CommonTree)adaptor.create(ANYURI431)
                    ;
                    adaptor.addChild(root_0, ANYURI431_tree);
                    }
                    dbg.location(395,11);
                    LP432=(Token)match(input,LP,FOLLOW_LP_in_anyUriBag4400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP432_tree = 
                    (CommonTree)adaptor.create(LP432)
                    ;
                    adaptor.addChild(root_0, LP432_tree);
                    }
                    dbg.location(395,14);
                    pushFollow(FOLLOW_attributeSelector_in_anyUriBag4402);
                    attributeSelector433=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector433.getTree());
                    dbg.location(395,32);
                    RP434=(Token)match(input,RP,FOLLOW_RP_in_anyUriBag4404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP434_tree = 
                    (CommonTree)adaptor.create(RP434)
                    ;
                    adaptor.addChild(root_0, RP434_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(397, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:399:1: dateExpr : ( DATE ^ LP ! stringExpr RP !| dateBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.dateExpr_return dateExpr() throws RecognitionException {
        GrammarParser.dateExpr_return retval = new GrammarParser.dateExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE435=null;
        Token LP436=null;
        Token RP438=null;
        Token DOT440=null;
        Token ONEANDONLY441=null;
        Token LP442=null;
        Token RP443=null;
        GrammarParser.stringExpr_return stringExpr437 =null;

        GrammarParser.dateBag_return dateBag439 =null;


        CommonTree DATE435_tree=null;
        CommonTree LP436_tree=null;
        CommonTree RP438_tree=null;
        CommonTree DOT440_tree=null;
        CommonTree ONEANDONLY441_tree=null;
        CommonTree LP442_tree=null;
        CommonTree RP443_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:2: ( DATE ^ LP ! stringExpr RP !| dateBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt61=2;
            try { dbg.enterDecision(61, decisionCanBacktrack[61]);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==DATE) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==LP) ) {
                    int LA61_2 = input.LA(3);

                    if ( ((LA61_2 >= STRING && LA61_2 <= STRING_CONSTANT)) ) {
                        alt61=1;
                    }
                    else if ( (LA61_2==ACTION||LA61_2==ENVIRONMENT||LA61_2==RESOURCE||LA61_2==SUBJECT) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA61_1==STRING_CONSTANT_LIST) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:400:4: DATE ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(400,8);
                    DATE435=(Token)match(input,DATE,FOLLOW_DATE_in_dateExpr4416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE435_tree = 
                    (CommonTree)adaptor.create(DATE435)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DATE435_tree, root_0);
                    }
                    dbg.location(400,12);
                    LP436=(Token)match(input,LP,FOLLOW_LP_in_dateExpr4419); if (state.failed) return retval;
                    dbg.location(400,14);
                    pushFollow(FOLLOW_stringExpr_in_dateExpr4422);
                    stringExpr437=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr437.getTree());
                    dbg.location(400,27);
                    RP438=(Token)match(input,RP,FOLLOW_RP_in_dateExpr4424); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:401:4: dateBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(401,4);
                    pushFollow(FOLLOW_dateBag_in_dateExpr4430);
                    dateBag439=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag439.getTree());
                    dbg.location(401,15);
                    DOT440=(Token)match(input,DOT,FOLLOW_DOT_in_dateExpr4432); if (state.failed) return retval;
                    dbg.location(401,27);
                    ONEANDONLY441=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_dateExpr4435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY441_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY441)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY441_tree, root_0);
                    }
                    dbg.location(401,31);
                    LP442=(Token)match(input,LP,FOLLOW_LP_in_dateExpr4438); if (state.failed) return retval;
                    dbg.location(401,35);
                    RP443=(Token)match(input,RP,FOLLOW_RP_in_dateExpr4441); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(402, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:403:1: dateBag : ( DATE ^ STRING_CONSTANT_LIST | DATE LP attributeSelector RP );
    public final GrammarParser.dateBag_return dateBag() throws RecognitionException {
        GrammarParser.dateBag_return retval = new GrammarParser.dateBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE444=null;
        Token STRING_CONSTANT_LIST445=null;
        Token DATE446=null;
        Token LP447=null;
        Token RP449=null;
        GrammarParser.attributeSelector_return attributeSelector448 =null;


        CommonTree DATE444_tree=null;
        CommonTree STRING_CONSTANT_LIST445_tree=null;
        CommonTree DATE446_tree=null;
        CommonTree LP447_tree=null;
        CommonTree RP449_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(403, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:404:2: ( DATE ^ STRING_CONSTANT_LIST | DATE LP attributeSelector RP )
            int alt62=2;
            try { dbg.enterDecision(62, decisionCanBacktrack[62]);

            int LA62_0 = input.LA(1);

            if ( (LA62_0==DATE) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==STRING_CONSTANT_LIST) ) {
                    alt62=1;
                }
                else if ( (LA62_1==LP) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:404:4: DATE ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(404,8);
                    DATE444=(Token)match(input,DATE,FOLLOW_DATE_in_dateBag4452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE444_tree = 
                    (CommonTree)adaptor.create(DATE444)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DATE444_tree, root_0);
                    }
                    dbg.location(404,10);
                    STRING_CONSTANT_LIST445=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateBag4455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST445_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST445)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST445_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:405:4: DATE LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(405,4);
                    DATE446=(Token)match(input,DATE,FOLLOW_DATE_in_dateBag4460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE446_tree = 
                    (CommonTree)adaptor.create(DATE446)
                    ;
                    adaptor.addChild(root_0, DATE446_tree);
                    }
                    dbg.location(405,9);
                    LP447=(Token)match(input,LP,FOLLOW_LP_in_dateBag4462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP447_tree = 
                    (CommonTree)adaptor.create(LP447)
                    ;
                    adaptor.addChild(root_0, LP447_tree);
                    }
                    dbg.location(405,12);
                    pushFollow(FOLLOW_attributeSelector_in_dateBag4464);
                    attributeSelector448=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector448.getTree());
                    dbg.location(405,30);
                    RP449=(Token)match(input,RP,FOLLOW_RP_in_dateBag4466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP449_tree = 
                    (CommonTree)adaptor.create(RP449)
                    ;
                    adaptor.addChild(root_0, RP449_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(408, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:410:1: timeExpr : ( TIME ^ LP ! stringExpr RP !| timeBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        GrammarParser.timeExpr_return retval = new GrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME450=null;
        Token LP451=null;
        Token RP453=null;
        Token DOT455=null;
        Token ONEANDONLY456=null;
        Token LP457=null;
        Token RP458=null;
        GrammarParser.stringExpr_return stringExpr452 =null;

        GrammarParser.timeBag_return timeBag454 =null;


        CommonTree TIME450_tree=null;
        CommonTree LP451_tree=null;
        CommonTree RP453_tree=null;
        CommonTree DOT455_tree=null;
        CommonTree ONEANDONLY456_tree=null;
        CommonTree LP457_tree=null;
        CommonTree RP458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:411:2: ( TIME ^ LP ! stringExpr RP !| timeBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt63=2;
            try { dbg.enterDecision(63, decisionCanBacktrack[63]);

            int LA63_0 = input.LA(1);

            if ( (LA63_0==TIME) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==LP) ) {
                    int LA63_2 = input.LA(3);

                    if ( ((LA63_2 >= STRING && LA63_2 <= STRING_CONSTANT)) ) {
                        alt63=1;
                    }
                    else if ( (LA63_2==ACTION||LA63_2==ENVIRONMENT||LA63_2==RESOURCE||LA63_2==SUBJECT) ) {
                        alt63=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA63_1==STRING_CONSTANT_LIST) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:411:4: TIME ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(411,8);
                    TIME450=(Token)match(input,TIME,FOLLOW_TIME_in_timeExpr4479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME450_tree = 
                    (CommonTree)adaptor.create(TIME450)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(TIME450_tree, root_0);
                    }
                    dbg.location(411,12);
                    LP451=(Token)match(input,LP,FOLLOW_LP_in_timeExpr4482); if (state.failed) return retval;
                    dbg.location(411,14);
                    pushFollow(FOLLOW_stringExpr_in_timeExpr4485);
                    stringExpr452=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr452.getTree());
                    dbg.location(411,27);
                    RP453=(Token)match(input,RP,FOLLOW_RP_in_timeExpr4487); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:412:4: timeBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(412,4);
                    pushFollow(FOLLOW_timeBag_in_timeExpr4493);
                    timeBag454=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag454.getTree());
                    dbg.location(412,15);
                    DOT455=(Token)match(input,DOT,FOLLOW_DOT_in_timeExpr4495); if (state.failed) return retval;
                    dbg.location(412,27);
                    ONEANDONLY456=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_timeExpr4498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY456_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY456)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY456_tree, root_0);
                    }
                    dbg.location(412,31);
                    LP457=(Token)match(input,LP,FOLLOW_LP_in_timeExpr4501); if (state.failed) return retval;
                    dbg.location(412,35);
                    RP458=(Token)match(input,RP,FOLLOW_RP_in_timeExpr4504); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(413, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:414:1: timeBag : ( TIME ^ STRING_CONSTANT_LIST | TIME LP attributeSelector RP );
    public final GrammarParser.timeBag_return timeBag() throws RecognitionException {
        GrammarParser.timeBag_return retval = new GrammarParser.timeBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME459=null;
        Token STRING_CONSTANT_LIST460=null;
        Token TIME461=null;
        Token LP462=null;
        Token RP464=null;
        GrammarParser.attributeSelector_return attributeSelector463 =null;


        CommonTree TIME459_tree=null;
        CommonTree STRING_CONSTANT_LIST460_tree=null;
        CommonTree TIME461_tree=null;
        CommonTree LP462_tree=null;
        CommonTree RP464_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:415:2: ( TIME ^ STRING_CONSTANT_LIST | TIME LP attributeSelector RP )
            int alt64=2;
            try { dbg.enterDecision(64, decisionCanBacktrack[64]);

            int LA64_0 = input.LA(1);

            if ( (LA64_0==TIME) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==STRING_CONSTANT_LIST) ) {
                    alt64=1;
                }
                else if ( (LA64_1==LP) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:415:4: TIME ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(415,8);
                    TIME459=(Token)match(input,TIME,FOLLOW_TIME_in_timeBag4515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME459_tree = 
                    (CommonTree)adaptor.create(TIME459)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(TIME459_tree, root_0);
                    }
                    dbg.location(415,10);
                    STRING_CONSTANT_LIST460=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_timeBag4518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST460_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST460)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST460_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:416:4: TIME LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(416,4);
                    TIME461=(Token)match(input,TIME,FOLLOW_TIME_in_timeBag4523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME461_tree = 
                    (CommonTree)adaptor.create(TIME461)
                    ;
                    adaptor.addChild(root_0, TIME461_tree);
                    }
                    dbg.location(416,9);
                    LP462=(Token)match(input,LP,FOLLOW_LP_in_timeBag4525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP462_tree = 
                    (CommonTree)adaptor.create(LP462)
                    ;
                    adaptor.addChild(root_0, LP462_tree);
                    }
                    dbg.location(416,12);
                    pushFollow(FOLLOW_attributeSelector_in_timeBag4527);
                    attributeSelector463=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector463.getTree());
                    dbg.location(416,30);
                    RP464=(Token)match(input,RP,FOLLOW_RP_in_timeBag4529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP464_tree = 
                    (CommonTree)adaptor.create(RP464)
                    ;
                    adaptor.addChild(root_0, RP464_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(419, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:421:1: dateTimeExpr : ( DATETIME ^ LP ! stringExpr RP !| dateTimeBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.dateTimeExpr_return dateTimeExpr() throws RecognitionException {
        GrammarParser.dateTimeExpr_return retval = new GrammarParser.dateTimeExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATETIME465=null;
        Token LP466=null;
        Token RP468=null;
        Token DOT470=null;
        Token ONEANDONLY471=null;
        Token LP472=null;
        Token RP473=null;
        GrammarParser.stringExpr_return stringExpr467 =null;

        GrammarParser.dateTimeBag_return dateTimeBag469 =null;


        CommonTree DATETIME465_tree=null;
        CommonTree LP466_tree=null;
        CommonTree RP468_tree=null;
        CommonTree DOT470_tree=null;
        CommonTree ONEANDONLY471_tree=null;
        CommonTree LP472_tree=null;
        CommonTree RP473_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(421, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:422:2: ( DATETIME ^ LP ! stringExpr RP !| dateTimeBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt65=2;
            try { dbg.enterDecision(65, decisionCanBacktrack[65]);

            int LA65_0 = input.LA(1);

            if ( (LA65_0==DATETIME) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==LP) ) {
                    int LA65_2 = input.LA(3);

                    if ( ((LA65_2 >= STRING && LA65_2 <= STRING_CONSTANT)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_2==ACTION||LA65_2==ENVIRONMENT||LA65_2==RESOURCE||LA65_2==SUBJECT) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA65_1==STRING_CONSTANT_LIST) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:422:4: DATETIME ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(422,12);
                    DATETIME465=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_dateTimeExpr4542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME465_tree = 
                    (CommonTree)adaptor.create(DATETIME465)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DATETIME465_tree, root_0);
                    }
                    dbg.location(422,16);
                    LP466=(Token)match(input,LP,FOLLOW_LP_in_dateTimeExpr4545); if (state.failed) return retval;
                    dbg.location(422,18);
                    pushFollow(FOLLOW_stringExpr_in_dateTimeExpr4548);
                    stringExpr467=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr467.getTree());
                    dbg.location(422,31);
                    RP468=(Token)match(input,RP,FOLLOW_RP_in_dateTimeExpr4550); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:423:4: dateTimeBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(423,4);
                    pushFollow(FOLLOW_dateTimeBag_in_dateTimeExpr4556);
                    dateTimeBag469=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag469.getTree());
                    dbg.location(423,19);
                    DOT470=(Token)match(input,DOT,FOLLOW_DOT_in_dateTimeExpr4558); if (state.failed) return retval;
                    dbg.location(423,31);
                    ONEANDONLY471=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_dateTimeExpr4561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY471_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY471)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY471_tree, root_0);
                    }
                    dbg.location(423,35);
                    LP472=(Token)match(input,LP,FOLLOW_LP_in_dateTimeExpr4564); if (state.failed) return retval;
                    dbg.location(423,39);
                    RP473=(Token)match(input,RP,FOLLOW_RP_in_dateTimeExpr4567); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(424, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateTimeBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:425:1: dateTimeBag : ( DATETIME ^ STRING_CONSTANT_LIST | DATETIME LP attributeSelector RP );
    public final GrammarParser.dateTimeBag_return dateTimeBag() throws RecognitionException {
        GrammarParser.dateTimeBag_return retval = new GrammarParser.dateTimeBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATETIME474=null;
        Token STRING_CONSTANT_LIST475=null;
        Token DATETIME476=null;
        Token LP477=null;
        Token RP479=null;
        GrammarParser.attributeSelector_return attributeSelector478 =null;


        CommonTree DATETIME474_tree=null;
        CommonTree STRING_CONSTANT_LIST475_tree=null;
        CommonTree DATETIME476_tree=null;
        CommonTree LP477_tree=null;
        CommonTree RP479_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dateTimeBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(425, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:426:2: ( DATETIME ^ STRING_CONSTANT_LIST | DATETIME LP attributeSelector RP )
            int alt66=2;
            try { dbg.enterDecision(66, decisionCanBacktrack[66]);

            int LA66_0 = input.LA(1);

            if ( (LA66_0==DATETIME) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==STRING_CONSTANT_LIST) ) {
                    alt66=1;
                }
                else if ( (LA66_1==LP) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(66);}

            switch (alt66) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:426:4: DATETIME ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(426,12);
                    DATETIME474=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_dateTimeBag4578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME474_tree = 
                    (CommonTree)adaptor.create(DATETIME474)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DATETIME474_tree, root_0);
                    }
                    dbg.location(426,14);
                    STRING_CONSTANT_LIST475=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag4581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST475_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST475)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST475_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:427:4: DATETIME LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(427,4);
                    DATETIME476=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_dateTimeBag4586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATETIME476_tree = 
                    (CommonTree)adaptor.create(DATETIME476)
                    ;
                    adaptor.addChild(root_0, DATETIME476_tree);
                    }
                    dbg.location(427,13);
                    LP477=(Token)match(input,LP,FOLLOW_LP_in_dateTimeBag4588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP477_tree = 
                    (CommonTree)adaptor.create(LP477)
                    ;
                    adaptor.addChild(root_0, LP477_tree);
                    }
                    dbg.location(427,16);
                    pushFollow(FOLLOW_attributeSelector_in_dateTimeBag4590);
                    attributeSelector478=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector478.getTree());
                    dbg.location(427,34);
                    RP479=(Token)match(input,RP,FOLLOW_RP_in_dateTimeBag4592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP479_tree = 
                    (CommonTree)adaptor.create(RP479)
                    ;
                    adaptor.addChild(root_0, RP479_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(430, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:432:1: base64BinaryExpr : ( BASE64BINARY ^ LP ! stringExpr RP !| base64BinaryBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.base64BinaryExpr_return base64BinaryExpr() throws RecognitionException {
        GrammarParser.base64BinaryExpr_return retval = new GrammarParser.base64BinaryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BASE64BINARY480=null;
        Token LP481=null;
        Token RP483=null;
        Token DOT485=null;
        Token ONEANDONLY486=null;
        Token LP487=null;
        Token RP488=null;
        GrammarParser.stringExpr_return stringExpr482 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag484 =null;


        CommonTree BASE64BINARY480_tree=null;
        CommonTree LP481_tree=null;
        CommonTree RP483_tree=null;
        CommonTree DOT485_tree=null;
        CommonTree ONEANDONLY486_tree=null;
        CommonTree LP487_tree=null;
        CommonTree RP488_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(432, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:433:2: ( BASE64BINARY ^ LP ! stringExpr RP !| base64BinaryBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt67=2;
            try { dbg.enterDecision(67, decisionCanBacktrack[67]);

            int LA67_0 = input.LA(1);

            if ( (LA67_0==BASE64BINARY) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==LP) ) {
                    int LA67_2 = input.LA(3);

                    if ( ((LA67_2 >= STRING && LA67_2 <= STRING_CONSTANT)) ) {
                        alt67=1;
                    }
                    else if ( (LA67_2==ACTION||LA67_2==ENVIRONMENT||LA67_2==RESOURCE||LA67_2==SUBJECT) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA67_1==STRING_CONSTANT_LIST) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:433:4: BASE64BINARY ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(433,16);
                    BASE64BINARY480=(Token)match(input,BASE64BINARY,FOLLOW_BASE64BINARY_in_base64BinaryExpr4605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY480_tree = 
                    (CommonTree)adaptor.create(BASE64BINARY480)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(BASE64BINARY480_tree, root_0);
                    }
                    dbg.location(433,20);
                    LP481=(Token)match(input,LP,FOLLOW_LP_in_base64BinaryExpr4608); if (state.failed) return retval;
                    dbg.location(433,22);
                    pushFollow(FOLLOW_stringExpr_in_base64BinaryExpr4611);
                    stringExpr482=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr482.getTree());
                    dbg.location(433,35);
                    RP483=(Token)match(input,RP,FOLLOW_RP_in_base64BinaryExpr4613); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:434:4: base64BinaryBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(434,4);
                    pushFollow(FOLLOW_base64BinaryBag_in_base64BinaryExpr4619);
                    base64BinaryBag484=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag484.getTree());
                    dbg.location(434,23);
                    DOT485=(Token)match(input,DOT,FOLLOW_DOT_in_base64BinaryExpr4621); if (state.failed) return retval;
                    dbg.location(434,35);
                    ONEANDONLY486=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_base64BinaryExpr4624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY486_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY486)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY486_tree, root_0);
                    }
                    dbg.location(434,39);
                    LP487=(Token)match(input,LP,FOLLOW_LP_in_base64BinaryExpr4627); if (state.failed) return retval;
                    dbg.location(434,43);
                    RP488=(Token)match(input,RP,FOLLOW_RP_in_base64BinaryExpr4630); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(435, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64BinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:436:1: base64BinaryBag : ( BASE64BINARY ^ STRING_CONSTANT_LIST | BASE64BINARY LP attributeSelector RP );
    public final GrammarParser.base64BinaryBag_return base64BinaryBag() throws RecognitionException {
        GrammarParser.base64BinaryBag_return retval = new GrammarParser.base64BinaryBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BASE64BINARY489=null;
        Token STRING_CONSTANT_LIST490=null;
        Token BASE64BINARY491=null;
        Token LP492=null;
        Token RP494=null;
        GrammarParser.attributeSelector_return attributeSelector493 =null;


        CommonTree BASE64BINARY489_tree=null;
        CommonTree STRING_CONSTANT_LIST490_tree=null;
        CommonTree BASE64BINARY491_tree=null;
        CommonTree LP492_tree=null;
        CommonTree RP494_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "base64BinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(436, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:437:2: ( BASE64BINARY ^ STRING_CONSTANT_LIST | BASE64BINARY LP attributeSelector RP )
            int alt68=2;
            try { dbg.enterDecision(68, decisionCanBacktrack[68]);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==BASE64BINARY) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==STRING_CONSTANT_LIST) ) {
                    alt68=1;
                }
                else if ( (LA68_1==LP) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:437:4: BASE64BINARY ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(437,16);
                    BASE64BINARY489=(Token)match(input,BASE64BINARY,FOLLOW_BASE64BINARY_in_base64BinaryBag4641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY489_tree = 
                    (CommonTree)adaptor.create(BASE64BINARY489)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(BASE64BINARY489_tree, root_0);
                    }
                    dbg.location(437,18);
                    STRING_CONSTANT_LIST490=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag4644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST490_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST490)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST490_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:438:4: BASE64BINARY LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(438,4);
                    BASE64BINARY491=(Token)match(input,BASE64BINARY,FOLLOW_BASE64BINARY_in_base64BinaryBag4649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BASE64BINARY491_tree = 
                    (CommonTree)adaptor.create(BASE64BINARY491)
                    ;
                    adaptor.addChild(root_0, BASE64BINARY491_tree);
                    }
                    dbg.location(438,17);
                    LP492=(Token)match(input,LP,FOLLOW_LP_in_base64BinaryBag4651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP492_tree = 
                    (CommonTree)adaptor.create(LP492)
                    ;
                    adaptor.addChild(root_0, LP492_tree);
                    }
                    dbg.location(438,20);
                    pushFollow(FOLLOW_attributeSelector_in_base64BinaryBag4653);
                    attributeSelector493=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector493.getTree());
                    dbg.location(438,38);
                    RP494=(Token)match(input,RP,FOLLOW_RP_in_base64BinaryBag4655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP494_tree = 
                    (CommonTree)adaptor.create(RP494)
                    ;
                    adaptor.addChild(root_0, RP494_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(442, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:444:1: dayTimeDurationExpr : ( DAYTIMEDURATION ^ LP ! stringExpr RP !| dayTimeDurationBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.dayTimeDurationExpr_return dayTimeDurationExpr() throws RecognitionException {
        GrammarParser.dayTimeDurationExpr_return retval = new GrammarParser.dayTimeDurationExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DAYTIMEDURATION495=null;
        Token LP496=null;
        Token RP498=null;
        Token DOT500=null;
        Token ONEANDONLY501=null;
        Token LP502=null;
        Token RP503=null;
        GrammarParser.stringExpr_return stringExpr497 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag499 =null;


        CommonTree DAYTIMEDURATION495_tree=null;
        CommonTree LP496_tree=null;
        CommonTree RP498_tree=null;
        CommonTree DOT500_tree=null;
        CommonTree ONEANDONLY501_tree=null;
        CommonTree LP502_tree=null;
        CommonTree RP503_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:445:2: ( DAYTIMEDURATION ^ LP ! stringExpr RP !| dayTimeDurationBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt69=2;
            try { dbg.enterDecision(69, decisionCanBacktrack[69]);

            int LA69_0 = input.LA(1);

            if ( (LA69_0==DAYTIMEDURATION) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==LP) ) {
                    int LA69_2 = input.LA(3);

                    if ( ((LA69_2 >= STRING && LA69_2 <= STRING_CONSTANT)) ) {
                        alt69=1;
                    }
                    else if ( (LA69_2==ACTION||LA69_2==ENVIRONMENT||LA69_2==RESOURCE||LA69_2==SUBJECT) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA69_1==STRING_CONSTANT_LIST) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:445:4: DAYTIMEDURATION ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(445,19);
                    DAYTIMEDURATION495=(Token)match(input,DAYTIMEDURATION,FOLLOW_DAYTIMEDURATION_in_dayTimeDurationExpr4669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION495_tree = 
                    (CommonTree)adaptor.create(DAYTIMEDURATION495)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DAYTIMEDURATION495_tree, root_0);
                    }
                    dbg.location(445,23);
                    LP496=(Token)match(input,LP,FOLLOW_LP_in_dayTimeDurationExpr4672); if (state.failed) return retval;
                    dbg.location(445,25);
                    pushFollow(FOLLOW_stringExpr_in_dayTimeDurationExpr4675);
                    stringExpr497=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr497.getTree());
                    dbg.location(445,38);
                    RP498=(Token)match(input,RP,FOLLOW_RP_in_dayTimeDurationExpr4677); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:446:4: dayTimeDurationBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(446,4);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr4683);
                    dayTimeDurationBag499=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag499.getTree());
                    dbg.location(446,26);
                    DOT500=(Token)match(input,DOT,FOLLOW_DOT_in_dayTimeDurationExpr4685); if (state.failed) return retval;
                    dbg.location(446,38);
                    ONEANDONLY501=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_dayTimeDurationExpr4688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY501_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY501)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY501_tree, root_0);
                    }
                    dbg.location(446,42);
                    LP502=(Token)match(input,LP,FOLLOW_LP_in_dayTimeDurationExpr4691); if (state.failed) return retval;
                    dbg.location(446,46);
                    RP503=(Token)match(input,RP,FOLLOW_RP_in_dayTimeDurationExpr4694); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(447, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayTimeDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:448:1: dayTimeDurationBag : ( DAYTIMEDURATION ^ STRING_CONSTANT_LIST | DAYTIMEDURATION LP attributeSelector RP );
    public final GrammarParser.dayTimeDurationBag_return dayTimeDurationBag() throws RecognitionException {
        GrammarParser.dayTimeDurationBag_return retval = new GrammarParser.dayTimeDurationBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DAYTIMEDURATION504=null;
        Token STRING_CONSTANT_LIST505=null;
        Token DAYTIMEDURATION506=null;
        Token LP507=null;
        Token RP509=null;
        GrammarParser.attributeSelector_return attributeSelector508 =null;


        CommonTree DAYTIMEDURATION504_tree=null;
        CommonTree STRING_CONSTANT_LIST505_tree=null;
        CommonTree DAYTIMEDURATION506_tree=null;
        CommonTree LP507_tree=null;
        CommonTree RP509_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dayTimeDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(448, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:449:2: ( DAYTIMEDURATION ^ STRING_CONSTANT_LIST | DAYTIMEDURATION LP attributeSelector RP )
            int alt70=2;
            try { dbg.enterDecision(70, decisionCanBacktrack[70]);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==DAYTIMEDURATION) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==STRING_CONSTANT_LIST) ) {
                    alt70=1;
                }
                else if ( (LA70_1==LP) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:449:4: DAYTIMEDURATION ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(449,19);
                    DAYTIMEDURATION504=(Token)match(input,DAYTIMEDURATION,FOLLOW_DAYTIMEDURATION_in_dayTimeDurationBag4705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION504_tree = 
                    (CommonTree)adaptor.create(DAYTIMEDURATION504)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(DAYTIMEDURATION504_tree, root_0);
                    }
                    dbg.location(449,21);
                    STRING_CONSTANT_LIST505=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag4708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST505_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST505)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST505_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:450:4: DAYTIMEDURATION LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(450,4);
                    DAYTIMEDURATION506=(Token)match(input,DAYTIMEDURATION,FOLLOW_DAYTIMEDURATION_in_dayTimeDurationBag4713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DAYTIMEDURATION506_tree = 
                    (CommonTree)adaptor.create(DAYTIMEDURATION506)
                    ;
                    adaptor.addChild(root_0, DAYTIMEDURATION506_tree);
                    }
                    dbg.location(450,20);
                    LP507=(Token)match(input,LP,FOLLOW_LP_in_dayTimeDurationBag4715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP507_tree = 
                    (CommonTree)adaptor.create(LP507)
                    ;
                    adaptor.addChild(root_0, LP507_tree);
                    }
                    dbg.location(450,23);
                    pushFollow(FOLLOW_attributeSelector_in_dayTimeDurationBag4717);
                    attributeSelector508=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector508.getTree());
                    dbg.location(450,41);
                    RP509=(Token)match(input,RP,FOLLOW_RP_in_dayTimeDurationBag4719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP509_tree = 
                    (CommonTree)adaptor.create(RP509)
                    ;
                    adaptor.addChild(root_0, RP509_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(453, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:455:1: yearMonthDurationExpr : ( YEARMONTHDURATION ^ LP ! stringExpr RP !| yearMonthDurationBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.yearMonthDurationExpr_return yearMonthDurationExpr() throws RecognitionException {
        GrammarParser.yearMonthDurationExpr_return retval = new GrammarParser.yearMonthDurationExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token YEARMONTHDURATION510=null;
        Token LP511=null;
        Token RP513=null;
        Token DOT515=null;
        Token ONEANDONLY516=null;
        Token LP517=null;
        Token RP518=null;
        GrammarParser.stringExpr_return stringExpr512 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag514 =null;


        CommonTree YEARMONTHDURATION510_tree=null;
        CommonTree LP511_tree=null;
        CommonTree RP513_tree=null;
        CommonTree DOT515_tree=null;
        CommonTree ONEANDONLY516_tree=null;
        CommonTree LP517_tree=null;
        CommonTree RP518_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(455, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:456:2: ( YEARMONTHDURATION ^ LP ! stringExpr RP !| yearMonthDurationBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt71=2;
            try { dbg.enterDecision(71, decisionCanBacktrack[71]);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==YEARMONTHDURATION) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==LP) ) {
                    int LA71_2 = input.LA(3);

                    if ( ((LA71_2 >= STRING && LA71_2 <= STRING_CONSTANT)) ) {
                        alt71=1;
                    }
                    else if ( (LA71_2==ACTION||LA71_2==ENVIRONMENT||LA71_2==RESOURCE||LA71_2==SUBJECT) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA71_1==STRING_CONSTANT_LIST) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:456:4: YEARMONTHDURATION ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(456,21);
                    YEARMONTHDURATION510=(Token)match(input,YEARMONTHDURATION,FOLLOW_YEARMONTHDURATION_in_yearMonthDurationExpr4732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION510_tree = 
                    (CommonTree)adaptor.create(YEARMONTHDURATION510)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(YEARMONTHDURATION510_tree, root_0);
                    }
                    dbg.location(456,25);
                    LP511=(Token)match(input,LP,FOLLOW_LP_in_yearMonthDurationExpr4735); if (state.failed) return retval;
                    dbg.location(456,27);
                    pushFollow(FOLLOW_stringExpr_in_yearMonthDurationExpr4738);
                    stringExpr512=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr512.getTree());
                    dbg.location(456,40);
                    RP513=(Token)match(input,RP,FOLLOW_RP_in_yearMonthDurationExpr4740); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:457:4: yearMonthDurationBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(457,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr4746);
                    yearMonthDurationBag514=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag514.getTree());
                    dbg.location(457,28);
                    DOT515=(Token)match(input,DOT,FOLLOW_DOT_in_yearMonthDurationExpr4748); if (state.failed) return retval;
                    dbg.location(457,40);
                    ONEANDONLY516=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_yearMonthDurationExpr4751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY516_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY516)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY516_tree, root_0);
                    }
                    dbg.location(457,44);
                    LP517=(Token)match(input,LP,FOLLOW_LP_in_yearMonthDurationExpr4754); if (state.failed) return retval;
                    dbg.location(457,48);
                    RP518=(Token)match(input,RP,FOLLOW_RP_in_yearMonthDurationExpr4757); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(458, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearMonthDurationBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:459:1: yearMonthDurationBag : ( YEARMONTHDURATION ^ STRING_CONSTANT_LIST | YEARMONTHDURATION LP attributeSelector RP );
    public final GrammarParser.yearMonthDurationBag_return yearMonthDurationBag() throws RecognitionException {
        GrammarParser.yearMonthDurationBag_return retval = new GrammarParser.yearMonthDurationBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token YEARMONTHDURATION519=null;
        Token STRING_CONSTANT_LIST520=null;
        Token YEARMONTHDURATION521=null;
        Token LP522=null;
        Token RP524=null;
        GrammarParser.attributeSelector_return attributeSelector523 =null;


        CommonTree YEARMONTHDURATION519_tree=null;
        CommonTree STRING_CONSTANT_LIST520_tree=null;
        CommonTree YEARMONTHDURATION521_tree=null;
        CommonTree LP522_tree=null;
        CommonTree RP524_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "yearMonthDurationBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:460:2: ( YEARMONTHDURATION ^ STRING_CONSTANT_LIST | YEARMONTHDURATION LP attributeSelector RP )
            int alt72=2;
            try { dbg.enterDecision(72, decisionCanBacktrack[72]);

            int LA72_0 = input.LA(1);

            if ( (LA72_0==YEARMONTHDURATION) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==STRING_CONSTANT_LIST) ) {
                    alt72=1;
                }
                else if ( (LA72_1==LP) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:460:4: YEARMONTHDURATION ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(460,21);
                    YEARMONTHDURATION519=(Token)match(input,YEARMONTHDURATION,FOLLOW_YEARMONTHDURATION_in_yearMonthDurationBag4768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION519_tree = 
                    (CommonTree)adaptor.create(YEARMONTHDURATION519)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(YEARMONTHDURATION519_tree, root_0);
                    }
                    dbg.location(460,23);
                    STRING_CONSTANT_LIST520=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag4771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST520_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST520)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST520_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:461:4: YEARMONTHDURATION LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(461,4);
                    YEARMONTHDURATION521=(Token)match(input,YEARMONTHDURATION,FOLLOW_YEARMONTHDURATION_in_yearMonthDurationBag4776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEARMONTHDURATION521_tree = 
                    (CommonTree)adaptor.create(YEARMONTHDURATION521)
                    ;
                    adaptor.addChild(root_0, YEARMONTHDURATION521_tree);
                    }
                    dbg.location(461,22);
                    LP522=(Token)match(input,LP,FOLLOW_LP_in_yearMonthDurationBag4778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP522_tree = 
                    (CommonTree)adaptor.create(LP522)
                    ;
                    adaptor.addChild(root_0, LP522_tree);
                    }
                    dbg.location(461,25);
                    pushFollow(FOLLOW_attributeSelector_in_yearMonthDurationBag4780);
                    attributeSelector523=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector523.getTree());
                    dbg.location(461,43);
                    RP524=(Token)match(input,RP,FOLLOW_RP_in_yearMonthDurationBag4782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP524_tree = 
                    (CommonTree)adaptor.create(RP524)
                    ;
                    adaptor.addChild(root_0, RP524_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(464, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:466:1: x500NameExpr : ( X500NAME ^ LP ! stringExpr RP !| x500NameBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.x500NameExpr_return x500NameExpr() throws RecognitionException {
        GrammarParser.x500NameExpr_return retval = new GrammarParser.x500NameExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token X500NAME525=null;
        Token LP526=null;
        Token RP528=null;
        Token DOT530=null;
        Token ONEANDONLY531=null;
        Token LP532=null;
        Token RP533=null;
        GrammarParser.stringExpr_return stringExpr527 =null;

        GrammarParser.x500NameBag_return x500NameBag529 =null;


        CommonTree X500NAME525_tree=null;
        CommonTree LP526_tree=null;
        CommonTree RP528_tree=null;
        CommonTree DOT530_tree=null;
        CommonTree ONEANDONLY531_tree=null;
        CommonTree LP532_tree=null;
        CommonTree RP533_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(466, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:467:2: ( X500NAME ^ LP ! stringExpr RP !| x500NameBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt73=2;
            try { dbg.enterDecision(73, decisionCanBacktrack[73]);

            int LA73_0 = input.LA(1);

            if ( (LA73_0==X500NAME) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==LP) ) {
                    int LA73_2 = input.LA(3);

                    if ( ((LA73_2 >= STRING && LA73_2 <= STRING_CONSTANT)) ) {
                        alt73=1;
                    }
                    else if ( (LA73_2==ACTION||LA73_2==ENVIRONMENT||LA73_2==RESOURCE||LA73_2==SUBJECT) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA73_1==STRING_CONSTANT_LIST) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:467:4: X500NAME ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(467,12);
                    X500NAME525=(Token)match(input,X500NAME,FOLLOW_X500NAME_in_x500NameExpr4795); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME525_tree = 
                    (CommonTree)adaptor.create(X500NAME525)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(X500NAME525_tree, root_0);
                    }
                    dbg.location(467,16);
                    LP526=(Token)match(input,LP,FOLLOW_LP_in_x500NameExpr4798); if (state.failed) return retval;
                    dbg.location(467,18);
                    pushFollow(FOLLOW_stringExpr_in_x500NameExpr4801);
                    stringExpr527=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr527.getTree());
                    dbg.location(467,31);
                    RP528=(Token)match(input,RP,FOLLOW_RP_in_x500NameExpr4803); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:468:4: x500NameBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(468,4);
                    pushFollow(FOLLOW_x500NameBag_in_x500NameExpr4809);
                    x500NameBag529=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag529.getTree());
                    dbg.location(468,19);
                    DOT530=(Token)match(input,DOT,FOLLOW_DOT_in_x500NameExpr4811); if (state.failed) return retval;
                    dbg.location(468,31);
                    ONEANDONLY531=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_x500NameExpr4814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY531_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY531)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY531_tree, root_0);
                    }
                    dbg.location(468,35);
                    LP532=(Token)match(input,LP,FOLLOW_LP_in_x500NameExpr4817); if (state.failed) return retval;
                    dbg.location(468,39);
                    RP533=(Token)match(input,RP,FOLLOW_RP_in_x500NameExpr4820); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(470, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "x500NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:471:1: x500NameBag : ( X500NAME ^ STRING_CONSTANT_LIST | X500NAME LP attributeSelector RP );
    public final GrammarParser.x500NameBag_return x500NameBag() throws RecognitionException {
        GrammarParser.x500NameBag_return retval = new GrammarParser.x500NameBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token X500NAME534=null;
        Token STRING_CONSTANT_LIST535=null;
        Token X500NAME536=null;
        Token LP537=null;
        Token RP539=null;
        GrammarParser.attributeSelector_return attributeSelector538 =null;


        CommonTree X500NAME534_tree=null;
        CommonTree STRING_CONSTANT_LIST535_tree=null;
        CommonTree X500NAME536_tree=null;
        CommonTree LP537_tree=null;
        CommonTree RP539_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "x500NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(471, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:472:2: ( X500NAME ^ STRING_CONSTANT_LIST | X500NAME LP attributeSelector RP )
            int alt74=2;
            try { dbg.enterDecision(74, decisionCanBacktrack[74]);

            int LA74_0 = input.LA(1);

            if ( (LA74_0==X500NAME) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==STRING_CONSTANT_LIST) ) {
                    alt74=1;
                }
                else if ( (LA74_1==LP) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:472:4: X500NAME ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(472,12);
                    X500NAME534=(Token)match(input,X500NAME,FOLLOW_X500NAME_in_x500NameBag4832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME534_tree = 
                    (CommonTree)adaptor.create(X500NAME534)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(X500NAME534_tree, root_0);
                    }
                    dbg.location(472,14);
                    STRING_CONSTANT_LIST535=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag4835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST535_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST535)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST535_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:473:4: X500NAME LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(473,4);
                    X500NAME536=(Token)match(input,X500NAME,FOLLOW_X500NAME_in_x500NameBag4840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    X500NAME536_tree = 
                    (CommonTree)adaptor.create(X500NAME536)
                    ;
                    adaptor.addChild(root_0, X500NAME536_tree);
                    }
                    dbg.location(473,13);
                    LP537=(Token)match(input,LP,FOLLOW_LP_in_x500NameBag4842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP537_tree = 
                    (CommonTree)adaptor.create(LP537)
                    ;
                    adaptor.addChild(root_0, LP537_tree);
                    }
                    dbg.location(473,16);
                    pushFollow(FOLLOW_attributeSelector_in_x500NameBag4844);
                    attributeSelector538=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector538.getTree());
                    dbg.location(473,34);
                    RP539=(Token)match(input,RP,FOLLOW_RP_in_x500NameBag4846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP539_tree = 
                    (CommonTree)adaptor.create(RP539)
                    ;
                    adaptor.addChild(root_0, RP539_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(476, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:478:1: rfc822NameExpr : ( RFC822NAME ^ LP ! stringExpr RP !| rfc822NameBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.rfc822NameExpr_return rfc822NameExpr() throws RecognitionException {
        GrammarParser.rfc822NameExpr_return retval = new GrammarParser.rfc822NameExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RFC822NAME540=null;
        Token LP541=null;
        Token RP543=null;
        Token DOT545=null;
        Token ONEANDONLY546=null;
        Token LP547=null;
        Token RP548=null;
        GrammarParser.stringExpr_return stringExpr542 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag544 =null;


        CommonTree RFC822NAME540_tree=null;
        CommonTree LP541_tree=null;
        CommonTree RP543_tree=null;
        CommonTree DOT545_tree=null;
        CommonTree ONEANDONLY546_tree=null;
        CommonTree LP547_tree=null;
        CommonTree RP548_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(478, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:479:2: ( RFC822NAME ^ LP ! stringExpr RP !| rfc822NameBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt75=2;
            try { dbg.enterDecision(75, decisionCanBacktrack[75]);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==RFC822NAME) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==LP) ) {
                    int LA75_2 = input.LA(3);

                    if ( ((LA75_2 >= STRING && LA75_2 <= STRING_CONSTANT)) ) {
                        alt75=1;
                    }
                    else if ( (LA75_2==ACTION||LA75_2==ENVIRONMENT||LA75_2==RESOURCE||LA75_2==SUBJECT) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA75_1==STRING_CONSTANT_LIST) ) {
                    alt75=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:479:4: RFC822NAME ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(479,14);
                    RFC822NAME540=(Token)match(input,RFC822NAME,FOLLOW_RFC822NAME_in_rfc822NameExpr4859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME540_tree = 
                    (CommonTree)adaptor.create(RFC822NAME540)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(RFC822NAME540_tree, root_0);
                    }
                    dbg.location(479,18);
                    LP541=(Token)match(input,LP,FOLLOW_LP_in_rfc822NameExpr4862); if (state.failed) return retval;
                    dbg.location(479,20);
                    pushFollow(FOLLOW_stringExpr_in_rfc822NameExpr4865);
                    stringExpr542=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr542.getTree());
                    dbg.location(479,33);
                    RP543=(Token)match(input,RP,FOLLOW_RP_in_rfc822NameExpr4867); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:480:4: rfc822NameBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(480,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_rfc822NameExpr4873);
                    rfc822NameBag544=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag544.getTree());
                    dbg.location(480,21);
                    DOT545=(Token)match(input,DOT,FOLLOW_DOT_in_rfc822NameExpr4875); if (state.failed) return retval;
                    dbg.location(480,33);
                    ONEANDONLY546=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_rfc822NameExpr4878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY546_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY546)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY546_tree, root_0);
                    }
                    dbg.location(480,37);
                    LP547=(Token)match(input,LP,FOLLOW_LP_in_rfc822NameExpr4881); if (state.failed) return retval;
                    dbg.location(480,41);
                    RP548=(Token)match(input,RP,FOLLOW_RP_in_rfc822NameExpr4884); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(482, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rfc822NameBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:483:1: rfc822NameBag : ( RFC822NAME ^ STRING_CONSTANT_LIST | RFC822NAME LP attributeSelector RP );
    public final GrammarParser.rfc822NameBag_return rfc822NameBag() throws RecognitionException {
        GrammarParser.rfc822NameBag_return retval = new GrammarParser.rfc822NameBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RFC822NAME549=null;
        Token STRING_CONSTANT_LIST550=null;
        Token RFC822NAME551=null;
        Token LP552=null;
        Token RP554=null;
        GrammarParser.attributeSelector_return attributeSelector553 =null;


        CommonTree RFC822NAME549_tree=null;
        CommonTree STRING_CONSTANT_LIST550_tree=null;
        CommonTree RFC822NAME551_tree=null;
        CommonTree LP552_tree=null;
        CommonTree RP554_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rfc822NameBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(483, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:484:2: ( RFC822NAME ^ STRING_CONSTANT_LIST | RFC822NAME LP attributeSelector RP )
            int alt76=2;
            try { dbg.enterDecision(76, decisionCanBacktrack[76]);

            int LA76_0 = input.LA(1);

            if ( (LA76_0==RFC822NAME) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==STRING_CONSTANT_LIST) ) {
                    alt76=1;
                }
                else if ( (LA76_1==LP) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(76);}

            switch (alt76) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:484:4: RFC822NAME ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(484,14);
                    RFC822NAME549=(Token)match(input,RFC822NAME,FOLLOW_RFC822NAME_in_rfc822NameBag4896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME549_tree = 
                    (CommonTree)adaptor.create(RFC822NAME549)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(RFC822NAME549_tree, root_0);
                    }
                    dbg.location(484,16);
                    STRING_CONSTANT_LIST550=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag4899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST550_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST550)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST550_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:485:4: RFC822NAME LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(485,4);
                    RFC822NAME551=(Token)match(input,RFC822NAME,FOLLOW_RFC822NAME_in_rfc822NameBag4904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RFC822NAME551_tree = 
                    (CommonTree)adaptor.create(RFC822NAME551)
                    ;
                    adaptor.addChild(root_0, RFC822NAME551_tree);
                    }
                    dbg.location(485,15);
                    LP552=(Token)match(input,LP,FOLLOW_LP_in_rfc822NameBag4906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP552_tree = 
                    (CommonTree)adaptor.create(LP552)
                    ;
                    adaptor.addChild(root_0, LP552_tree);
                    }
                    dbg.location(485,18);
                    pushFollow(FOLLOW_attributeSelector_in_rfc822NameBag4908);
                    attributeSelector553=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector553.getTree());
                    dbg.location(485,36);
                    RP554=(Token)match(input,RP,FOLLOW_RP_in_rfc822NameBag4910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP554_tree = 
                    (CommonTree)adaptor.create(RP554)
                    ;
                    adaptor.addChild(root_0, RP554_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(488, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryExpr"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:490:1: hexBinaryExpr : ( HEXBINARY ^ LP ! stringExpr RP !| hexBinaryBag DOT ! ONEANDONLY ^ LP ! RP !);
    public final GrammarParser.hexBinaryExpr_return hexBinaryExpr() throws RecognitionException {
        GrammarParser.hexBinaryExpr_return retval = new GrammarParser.hexBinaryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HEXBINARY555=null;
        Token LP556=null;
        Token RP558=null;
        Token DOT560=null;
        Token ONEANDONLY561=null;
        Token LP562=null;
        Token RP563=null;
        GrammarParser.stringExpr_return stringExpr557 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag559 =null;


        CommonTree HEXBINARY555_tree=null;
        CommonTree LP556_tree=null;
        CommonTree RP558_tree=null;
        CommonTree DOT560_tree=null;
        CommonTree ONEANDONLY561_tree=null;
        CommonTree LP562_tree=null;
        CommonTree RP563_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(490, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:491:2: ( HEXBINARY ^ LP ! stringExpr RP !| hexBinaryBag DOT ! ONEANDONLY ^ LP ! RP !)
            int alt77=2;
            try { dbg.enterDecision(77, decisionCanBacktrack[77]);

            int LA77_0 = input.LA(1);

            if ( (LA77_0==HEXBINARY) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==LP) ) {
                    int LA77_2 = input.LA(3);

                    if ( ((LA77_2 >= STRING && LA77_2 <= STRING_CONSTANT)) ) {
                        alt77=1;
                    }
                    else if ( (LA77_2==ACTION||LA77_2==ENVIRONMENT||LA77_2==RESOURCE||LA77_2==SUBJECT) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA77_1==STRING_CONSTANT_LIST) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:491:4: HEXBINARY ^ LP ! stringExpr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(491,13);
                    HEXBINARY555=(Token)match(input,HEXBINARY,FOLLOW_HEXBINARY_in_hexBinaryExpr4923); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY555_tree = 
                    (CommonTree)adaptor.create(HEXBINARY555)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(HEXBINARY555_tree, root_0);
                    }
                    dbg.location(491,17);
                    LP556=(Token)match(input,LP,FOLLOW_LP_in_hexBinaryExpr4926); if (state.failed) return retval;
                    dbg.location(491,19);
                    pushFollow(FOLLOW_stringExpr_in_hexBinaryExpr4929);
                    stringExpr557=stringExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringExpr557.getTree());
                    dbg.location(491,32);
                    RP558=(Token)match(input,RP,FOLLOW_RP_in_hexBinaryExpr4931); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:492:4: hexBinaryBag DOT ! ONEANDONLY ^ LP ! RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(492,4);
                    pushFollow(FOLLOW_hexBinaryBag_in_hexBinaryExpr4937);
                    hexBinaryBag559=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag559.getTree());
                    dbg.location(492,20);
                    DOT560=(Token)match(input,DOT,FOLLOW_DOT_in_hexBinaryExpr4939); if (state.failed) return retval;
                    dbg.location(492,32);
                    ONEANDONLY561=(Token)match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_hexBinaryExpr4942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ONEANDONLY561_tree = 
                    (CommonTree)adaptor.create(ONEANDONLY561)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ONEANDONLY561_tree, root_0);
                    }
                    dbg.location(492,36);
                    LP562=(Token)match(input,LP,FOLLOW_LP_in_hexBinaryExpr4945); if (state.failed) return retval;
                    dbg.location(492,40);
                    RP563=(Token)match(input,RP,FOLLOW_RP_in_hexBinaryExpr4948); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(493, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hexBinaryBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:494:1: hexBinaryBag : ( HEXBINARY ^ STRING_CONSTANT_LIST | HEXBINARY LP attributeSelector RP );
    public final GrammarParser.hexBinaryBag_return hexBinaryBag() throws RecognitionException {
        GrammarParser.hexBinaryBag_return retval = new GrammarParser.hexBinaryBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HEXBINARY564=null;
        Token STRING_CONSTANT_LIST565=null;
        Token HEXBINARY566=null;
        Token LP567=null;
        Token RP569=null;
        GrammarParser.attributeSelector_return attributeSelector568 =null;


        CommonTree HEXBINARY564_tree=null;
        CommonTree STRING_CONSTANT_LIST565_tree=null;
        CommonTree HEXBINARY566_tree=null;
        CommonTree LP567_tree=null;
        CommonTree RP569_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hexBinaryBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(494, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:495:2: ( HEXBINARY ^ STRING_CONSTANT_LIST | HEXBINARY LP attributeSelector RP )
            int alt78=2;
            try { dbg.enterDecision(78, decisionCanBacktrack[78]);

            int LA78_0 = input.LA(1);

            if ( (LA78_0==HEXBINARY) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==STRING_CONSTANT_LIST) ) {
                    alt78=1;
                }
                else if ( (LA78_1==LP) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(78);}

            switch (alt78) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:495:4: HEXBINARY ^ STRING_CONSTANT_LIST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(495,13);
                    HEXBINARY564=(Token)match(input,HEXBINARY,FOLLOW_HEXBINARY_in_hexBinaryBag4959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY564_tree = 
                    (CommonTree)adaptor.create(HEXBINARY564)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(HEXBINARY564_tree, root_0);
                    }
                    dbg.location(495,15);
                    STRING_CONSTANT_LIST565=(Token)match(input,STRING_CONSTANT_LIST,FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag4962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_CONSTANT_LIST565_tree = 
                    (CommonTree)adaptor.create(STRING_CONSTANT_LIST565)
                    ;
                    adaptor.addChild(root_0, STRING_CONSTANT_LIST565_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:496:4: HEXBINARY LP attributeSelector RP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(496,4);
                    HEXBINARY566=(Token)match(input,HEXBINARY,FOLLOW_HEXBINARY_in_hexBinaryBag4967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEXBINARY566_tree = 
                    (CommonTree)adaptor.create(HEXBINARY566)
                    ;
                    adaptor.addChild(root_0, HEXBINARY566_tree);
                    }
                    dbg.location(496,14);
                    LP567=(Token)match(input,LP,FOLLOW_LP_in_hexBinaryBag4969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LP567_tree = 
                    (CommonTree)adaptor.create(LP567)
                    ;
                    adaptor.addChild(root_0, LP567_tree);
                    }
                    dbg.location(496,17);
                    pushFollow(FOLLOW_attributeSelector_in_hexBinaryBag4971);
                    attributeSelector568=attributeSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeSelector568.getTree());
                    dbg.location(496,35);
                    RP569=(Token)match(input,RP,FOLLOW_RP_in_hexBinaryBag4973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RP569_tree = 
                    (CommonTree)adaptor.create(RP569)
                    ;
                    adaptor.addChild(root_0, RP569_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(499, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anyBag"
    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:501:1: anyBag : ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag );
    public final GrammarParser.anyBag_return anyBag() throws RecognitionException {
        GrammarParser.anyBag_return retval = new GrammarParser.anyBag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GrammarParser.booleanBag_return booleanBag570 =null;

        GrammarParser.integerBag_return integerBag571 =null;

        GrammarParser.doubleBag_return doubleBag572 =null;

        GrammarParser.stringBag_return stringBag573 =null;

        GrammarParser.anyUriBag_return anyUriBag574 =null;

        GrammarParser.dateBag_return dateBag575 =null;

        GrammarParser.timeBag_return timeBag576 =null;

        GrammarParser.dateTimeBag_return dateTimeBag577 =null;

        GrammarParser.base64BinaryBag_return base64BinaryBag578 =null;

        GrammarParser.dayTimeDurationBag_return dayTimeDurationBag579 =null;

        GrammarParser.yearMonthDurationBag_return yearMonthDurationBag580 =null;

        GrammarParser.x500NameBag_return x500NameBag581 =null;

        GrammarParser.rfc822NameBag_return rfc822NameBag582 =null;

        GrammarParser.hexBinaryBag_return hexBinaryBag583 =null;



        try { dbg.enterRule(getGrammarFileName(), "anyBag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(501, 0);

        try {
            // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:2: ( booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag | timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag | yearMonthDurationBag | x500NameBag | rfc822NameBag | hexBinaryBag )
            int alt79=14;
            try { dbg.enterDecision(79, decisionCanBacktrack[79]);

            switch ( input.LA(1) ) {
            case ACTION:
            case BOOLEAN:
            case ENVIRONMENT:
            case RESOURCE:
            case SUBJECT:
                {
                alt79=1;
                }
                break;
            case BAG:
            case INTEGER:
                {
                alt79=2;
                }
                break;
            case DOUBLE:
                {
                alt79=3;
                }
                break;
            case STRING:
                {
                alt79=4;
                }
                break;
            case ANYURI:
                {
                alt79=5;
                }
                break;
            case DATE:
                {
                alt79=6;
                }
                break;
            case TIME:
                {
                alt79=7;
                }
                break;
            case DATETIME:
                {
                alt79=8;
                }
                break;
            case BASE64BINARY:
                {
                alt79=9;
                }
                break;
            case DAYTIMEDURATION:
                {
                alt79=10;
                }
                break;
            case YEARMONTHDURATION:
                {
                alt79=11;
                }
                break;
            case X500NAME:
                {
                alt79=12;
                }
                break;
            case RFC822NAME:
                {
                alt79=13;
                }
                break;
            case HEXBINARY:
                {
                alt79=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:4: booleanBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,4);
                    pushFollow(FOLLOW_booleanBag_in_anyBag4986);
                    booleanBag570=booleanBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanBag570.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:17: integerBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,17);
                    pushFollow(FOLLOW_integerBag_in_anyBag4990);
                    integerBag571=integerBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerBag571.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:30: doubleBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,30);
                    pushFollow(FOLLOW_doubleBag_in_anyBag4994);
                    doubleBag572=doubleBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doubleBag572.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:42: stringBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,42);
                    pushFollow(FOLLOW_stringBag_in_anyBag4998);
                    stringBag573=stringBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringBag573.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:54: anyUriBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,54);
                    pushFollow(FOLLOW_anyUriBag_in_anyBag5002);
                    anyUriBag574=anyUriBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anyUriBag574.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:502:66: dateBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(502,66);
                    pushFollow(FOLLOW_dateBag_in_anyBag5006);
                    dateBag575=dateBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateBag575.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:503:4: timeBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(503,4);
                    pushFollow(FOLLOW_timeBag_in_anyBag5011);
                    timeBag576=timeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeBag576.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:503:14: dateTimeBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(503,14);
                    pushFollow(FOLLOW_dateTimeBag_in_anyBag5015);
                    dateTimeBag577=dateTimeBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateTimeBag577.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:503:28: base64BinaryBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(503,28);
                    pushFollow(FOLLOW_base64BinaryBag_in_anyBag5019);
                    base64BinaryBag578=base64BinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base64BinaryBag578.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:503:46: dayTimeDurationBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(503,46);
                    pushFollow(FOLLOW_dayTimeDurationBag_in_anyBag5023);
                    dayTimeDurationBag579=dayTimeDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dayTimeDurationBag579.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:504:4: yearMonthDurationBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(504,4);
                    pushFollow(FOLLOW_yearMonthDurationBag_in_anyBag5028);
                    yearMonthDurationBag580=yearMonthDurationBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yearMonthDurationBag580.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:504:27: x500NameBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(504,27);
                    pushFollow(FOLLOW_x500NameBag_in_anyBag5032);
                    x500NameBag581=x500NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, x500NameBag581.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:505:4: rfc822NameBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(505,4);
                    pushFollow(FOLLOW_rfc822NameBag_in_anyBag5037);
                    rfc822NameBag582=rfc822NameBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rfc822NameBag582.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:505:20: hexBinaryBag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(505,20);
                    pushFollow(FOLLOW_hexBinaryBag_in_anyBag5041);
                    hexBinaryBag583=hexBinaryBag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexBinaryBag583.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(506, 1);

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
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:5: ( AND )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:154:6: AND
        {
        dbg.location(154,6);
        match(input,AND,FOLLOW_AND_in_synpred1_Grammar832); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Grammar

    // $ANTLR start synpred2_Grammar
    public final void synpred2_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:5: ( OR )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:161:6: OR
        {
        dbg.location(161,6);
        match(input,OR,FOLLOW_OR_in_synpred2_Grammar903); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Grammar

    // $ANTLR start synpred3_Grammar
    public final void synpred3_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:224:5: base64BinaryExpr
        {
        dbg.location(224,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred3_Grammar1498);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Grammar

    // $ANTLR start synpred4_Grammar
    public final void synpred4_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:4: ( base64BinaryExpr )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:253:5: base64BinaryExpr
        {
        dbg.location(253,5);
        pushFollow(FOLLOW_base64BinaryExpr_in_synpred4_Grammar1889);
        base64BinaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Grammar

    // $ANTLR start synpred5_Grammar
    public final void synpred5_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:4: ( booleanBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:312:5: booleanBag
        {
        dbg.location(312,5);
        pushFollow(FOLLOW_booleanBag_in_synpred5_Grammar3102);
        booleanBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Grammar

    // $ANTLR start synpred6_Grammar
    public final void synpred6_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:4: ( integerBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:314:5: integerBag
        {
        dbg.location(314,5);
        pushFollow(FOLLOW_integerBag_in_synpred6_Grammar3165);
        integerBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Grammar

    // $ANTLR start synpred7_Grammar
    public final void synpred7_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:4: ( doubleBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:316:5: doubleBag
        {
        dbg.location(316,5);
        pushFollow(FOLLOW_doubleBag_in_synpred7_Grammar3228);
        doubleBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Grammar

    // $ANTLR start synpred8_Grammar
    public final void synpred8_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:4: ( stringBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:318:5: stringBag
        {
        dbg.location(318,5);
        pushFollow(FOLLOW_stringBag_in_synpred8_Grammar3291);
        stringBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Grammar

    // $ANTLR start synpred9_Grammar
    public final void synpred9_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:4: ( dateBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:320:5: dateBag
        {
        dbg.location(320,5);
        pushFollow(FOLLOW_dateBag_in_synpred9_Grammar3355);
        dateBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Grammar

    // $ANTLR start synpred10_Grammar
    public final void synpred10_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:4: ( timeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:322:5: timeBag
        {
        dbg.location(322,5);
        pushFollow(FOLLOW_timeBag_in_synpred10_Grammar3419);
        timeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Grammar

    // $ANTLR start synpred11_Grammar
    public final void synpred11_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:4: ( dateTimeBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:324:5: dateTimeBag
        {
        dbg.location(324,5);
        pushFollow(FOLLOW_dateTimeBag_in_synpred11_Grammar3483);
        dateTimeBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Grammar

    // $ANTLR start synpred12_Grammar
    public final void synpred12_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:326:5: base64BinaryBag
        {
        dbg.location(326,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred12_Grammar3547);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Grammar

    // $ANTLR start synpred13_Grammar
    public final void synpred13_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:4: ( dayTimeDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:328:5: dayTimeDurationBag
        {
        dbg.location(328,5);
        pushFollow(FOLLOW_dayTimeDurationBag_in_synpred13_Grammar3611);
        dayTimeDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Grammar

    // $ANTLR start synpred14_Grammar
    public final void synpred14_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:4: ( yearMonthDurationBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:330:5: yearMonthDurationBag
        {
        dbg.location(330,5);
        pushFollow(FOLLOW_yearMonthDurationBag_in_synpred14_Grammar3675);
        yearMonthDurationBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Grammar

    // $ANTLR start synpred15_Grammar
    public final void synpred15_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:4: ( anyUriBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:332:5: anyUriBag
        {
        dbg.location(332,5);
        pushFollow(FOLLOW_anyUriBag_in_synpred15_Grammar3739);
        anyUriBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_Grammar

    // $ANTLR start synpred16_Grammar
    public final void synpred16_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:4: ( x500NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:334:5: x500NameBag
        {
        dbg.location(334,5);
        pushFollow(FOLLOW_x500NameBag_in_synpred16_Grammar3803);
        x500NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Grammar

    // $ANTLR start synpred17_Grammar
    public final void synpred17_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:4: ( rfc822NameBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:336:5: rfc822NameBag
        {
        dbg.location(336,5);
        pushFollow(FOLLOW_rfc822NameBag_in_synpred17_Grammar3867);
        rfc822NameBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Grammar

    // $ANTLR start synpred18_Grammar
    public final void synpred18_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:4: ( hexBinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:338:5: hexBinaryBag
        {
        dbg.location(338,5);
        pushFollow(FOLLOW_hexBinaryBag_in_synpred18_Grammar3931);
        hexBinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Grammar

    // $ANTLR start synpred19_Grammar
    public final void synpred19_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:4: ( base64BinaryBag )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:340:5: base64BinaryBag
        {
        dbg.location(340,5);
        pushFollow(FOLLOW_base64BinaryBag_in_synpred19_Grammar3995);
        base64BinaryBag();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_Grammar

    // $ANTLR start synpred20_Grammar
    public final void synpred20_Grammar_fragment() throws RecognitionException {
        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:4: ( ONEANDONLY )
        dbg.enterAlt(1);

        // /Users/Brad/Dropbox/NoXacml/src/main/antlr3/noxacml/Grammar.g:346:5: ONEANDONLY
        {
        dbg.location(346,5);
        match(input,ONEANDONLY,FOLLOW_ONEANDONLY_in_synpred20_Grammar4069); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Grammar

    // Delegated rules

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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA15_eotS =
        "\u013c\uffff";
    static final String DFA15_eofS =
        "\u013c\uffff";
    static final String DFA15_minS =
        "\1\5\2\uffff\1\62\2\uffff\1\35\1\62\1\uffff\13\62\1\35\1\uffff\1"+
        "\56\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1"+
        "\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\uffff\1\62\1\uffff"+
        "\1\62\1\26\1\35\1\26\2\35\1\62\1\26\2\35\1\62\1\26\2\35\1\62\1\26"+
        "\2\35\1\62\1\26\2\35\1\62\1\26\2\35\1\62\1\26\2\35\1\62\1\26\2\35"+
        "\1\62\1\26\2\35\1\62\1\26\2\35\1\62\1\26\1\35\2\112\1\62\1\uffff"+
        "\2\61\1\72\2\35\1\5\1\62\1\61\1\72\2\35\1\5\1\62\1\61\1\72\2\35"+
        "\1\5\1\62\1\61\1\72\2\35\1\5\1\62\1\61\1\72\2\35\1\5\1\62\1\61\1"+
        "\72\2\35\1\5\1\62\1\61\1\72\2\35\1\5\1\62\1\61\1\72\2\35\1\5\1\62"+
        "\1\61\1\72\2\35\1\5\1\62\1\61\1\72\2\35\1\5\1\61\2\35\3\112\1\62"+
        "\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62"+
        "\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62"+
        "\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62"+
        "\1\76\1\35\1\112\3\35\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35"+
        "\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35"+
        "\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35"+
        "\1\112\1\62\1\61\2\35\1\112\1\62\1\61\2\35\2\112\1\35\2\112\1\35"+
        "\2\112\1\35\2\112\1\35\2\112\1\35\2\112\1\35\2\112\1\35\2\112\1"+
        "\35\2\112\1\35\2\112\24\35";
    static final String DFA15_maxS =
        "\1\134\2\uffff\1\120\2\uffff\1\63\1\120\1\uffff\13\120\1\63\1\uffff"+
        "\1\131\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1"+
        "\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122"+
        "\1\35\1\122\1\uffff\1\62\1\uffff\1\62\1\115\1\35\1\115\1\35\1\112"+
        "\1\120\1\115\1\35\1\112\1\120\1\115\1\35\1\112\1\120\1\115\1\35"+
        "\1\112\1\120\1\115\1\35\1\112\1\120\1\115\1\35\1\112\1\120\1\115"+
        "\1\35\1\112\1\120\1\115\1\35\1\112\1\120\1\115\1\35\1\112\1\120"+
        "\1\115\1\35\1\112\1\120\1\115\1\35\2\112\1\62\1\uffff\2\61\1\106"+
        "\1\63\1\35\1\122\1\62\1\61\1\106\1\63\1\35\1\122\1\62\1\61\1\106"+
        "\1\63\1\35\1\122\1\62\1\61\1\106\1\63\1\35\1\122\1\62\1\61\1\106"+
        "\1\63\1\35\1\122\1\62\1\61\1\106\1\63\1\35\1\122\1\62\1\61\1\106"+
        "\1\63\1\35\1\122\1\62\1\61\1\106\1\63\1\35\1\122\1\62\1\61\1\106"+
        "\1\63\1\35\1\122\1\62\1\61\1\106\1\63\1\35\1\122\1\61\2\63\3\112"+
        "\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112"+
        "\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112"+
        "\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112\1\62\1\76\1\35\2\112"+
        "\1\62\1\76\1\35\1\112\1\63\2\35\1\112\1\62\1\61\1\63\1\35\1\112"+
        "\1\62\1\61\1\63\1\35\1\112\1\62\1\61\1\63\1\35\1\112\1\62\1\61\1"+
        "\63\1\35\1\112\1\62\1\61\1\63\1\35\1\112\1\62\1\61\1\63\1\35\1\112"+
        "\1\62\1\61\1\63\1\35\1\112\1\62\1\61\1\63\1\35\1\112\1\62\1\61\1"+
        "\63\1\35\1\112\1\62\1\61\1\35\37\112\1\35\1\112\1\35\1\112\1\35"+
        "\1\112\1\35\1\112\1\35\1\112\1\35\1\112\1\35\1\112\1\35\1\112\1"+
        "\35\1\112\1\35";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\2\uffff\1\7\14\uffff\1\3\31\uffff"+
        "\1\10\1\uffff\1\6\60\uffff\1\11\u00d9\uffff";
    static final String DFA15_specialS =
        "\u013c\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\10\10\uffff\1\12\1\uffff\1\10\1\16\1\3\4\uffff\1\13\1\15"+
            "\1\17\4\uffff\1\11\1\24\1\10\3\uffff\1\2\3\uffff\1\23\2\uffff"+
            "\2\10\5\uffff\1\5\6\uffff\1\4\2\uffff\1\4\12\uffff\1\10\1\22"+
            "\5\uffff\1\7\1\6\2\uffff\1\10\2\uffff\1\14\1\1\4\uffff\1\21"+
            "\1\20",
            "",
            "",
            "\1\25\35\uffff\1\10",
            "",
            "",
            "\1\26\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\30\35\uffff\1\27",
            "",
            "\1\32\35\uffff\1\31",
            "\1\34\35\uffff\1\33",
            "\1\36\35\uffff\1\35",
            "\1\40\35\uffff\1\37",
            "\1\42\35\uffff\1\41",
            "\1\44\35\uffff\1\43",
            "\1\46\35\uffff\1\45",
            "\1\50\35\uffff\1\47",
            "\1\52\35\uffff\1\51",
            "\1\54\35\uffff\1\53",
            "\1\56\35\uffff\1\55",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "",
            "\1\57\10\uffff\2\61\1\uffff\2\60\12\uffff\1\60\22\uffff\1\62",
            "\1\63",
            "\1\64\32\uffff\1\64\46\uffff\1\64\12\uffff\1\64",
            "\1\65",
            "\1\66\32\uffff\1\66\46\uffff\1\66\6\uffff\1\70\1\67\2\uffff"+
            "\1\66",
            "\1\71",
            "\1\72\32\uffff\1\72\46\uffff\1\72\6\uffff\1\74\1\73\2\uffff"+
            "\1\72",
            "\1\75",
            "\1\76\32\uffff\1\76\46\uffff\1\76\6\uffff\1\100\1\77\2\uffff"+
            "\1\76",
            "\1\101",
            "\1\102\32\uffff\1\102\46\uffff\1\102\6\uffff\1\104\1\103\2"+
            "\uffff\1\102",
            "\1\105",
            "\1\106\32\uffff\1\106\46\uffff\1\106\6\uffff\1\110\1\107\2"+
            "\uffff\1\106",
            "\1\111",
            "\1\112\32\uffff\1\112\46\uffff\1\112\6\uffff\1\114\1\113\2"+
            "\uffff\1\112",
            "\1\115",
            "\1\116\32\uffff\1\116\46\uffff\1\116\6\uffff\1\120\1\117\2"+
            "\uffff\1\116",
            "\1\121",
            "\1\122\32\uffff\1\122\46\uffff\1\122\6\uffff\1\124\1\123\2"+
            "\uffff\1\122",
            "\1\125",
            "\1\126\32\uffff\1\126\46\uffff\1\126\6\uffff\1\130\1\127\2"+
            "\uffff\1\126",
            "\1\131",
            "\1\132\32\uffff\1\132\46\uffff\1\132\6\uffff\1\134\1\133\2"+
            "\uffff\1\132",
            "\1\135",
            "\1\136\32\uffff\1\136\46\uffff\1\136\6\uffff\2\57\2\uffff\1"+
            "\136",
            "",
            "\1\137",
            "",
            "\1\140",
            "\1\142\47\uffff\1\141\16\uffff\1\10",
            "\1\143",
            "\1\142\66\uffff\1\10",
            "\1\144",
            "\1\145\54\uffff\1\146",
            "\1\150\35\uffff\1\147",
            "\1\142\47\uffff\1\151\16\uffff\1\10",
            "\1\152",
            "\1\153\54\uffff\1\154",
            "\1\156\35\uffff\1\155",
            "\1\142\47\uffff\1\157\16\uffff\1\10",
            "\1\160",
            "\1\161\54\uffff\1\162",
            "\1\164\35\uffff\1\163",
            "\1\142\47\uffff\1\165\16\uffff\1\10",
            "\1\166",
            "\1\167\54\uffff\1\170",
            "\1\172\35\uffff\1\171",
            "\1\142\47\uffff\1\173\16\uffff\1\10",
            "\1\174",
            "\1\175\54\uffff\1\176",
            "\1\u0080\35\uffff\1\177",
            "\1\142\47\uffff\1\u0081\16\uffff\1\10",
            "\1\u0082",
            "\1\u0083\54\uffff\1\u0084",
            "\1\u0086\35\uffff\1\u0085",
            "\1\142\47\uffff\1\u0087\16\uffff\1\10",
            "\1\u0088",
            "\1\u0089\54\uffff\1\u008a",
            "\1\u008c\35\uffff\1\u008b",
            "\1\142\47\uffff\1\u008d\16\uffff\1\10",
            "\1\u008e",
            "\1\u008f\54\uffff\1\u0090",
            "\1\u0092\35\uffff\1\u0091",
            "\1\142\47\uffff\1\u0093\16\uffff\1\10",
            "\1\u0094",
            "\1\u0095\54\uffff\1\u0096",
            "\1\u0098\35\uffff\1\u0097",
            "\1\142\47\uffff\1\u0099\16\uffff\1\10",
            "\1\u009a",
            "\1\u009b\54\uffff\1\u009c",
            "\1\u009e\35\uffff\1\u009d",
            "\1\142\47\uffff\1\57\16\uffff\1\10",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\2\u00a5\12\uffff\1\u00a5",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00a6",
            "\1\u00a7\32\uffff\1\u00a7\46\uffff\1\u00a7\12\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\2\u00aa\12\uffff\1\u00aa",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00ab",
            "\1\u00ac\32\uffff\1\u00ac\46\uffff\1\u00ac\12\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\2\u00af\12\uffff\1\u00af",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00b0",
            "\1\u00b1\32\uffff\1\u00b1\46\uffff\1\u00b1\12\uffff\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\2\u00b4\12\uffff\1\u00b4",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00b5",
            "\1\u00b6\32\uffff\1\u00b6\46\uffff\1\u00b6\12\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\2\u00b9\12\uffff\1\u00b9",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00ba",
            "\1\u00bb\32\uffff\1\u00bb\46\uffff\1\u00bb\12\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\2\u00be\12\uffff\1\u00be",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00bf",
            "\1\u00c0\32\uffff\1\u00c0\46\uffff\1\u00c0\12\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\2\u00c3\12\uffff\1\u00c3",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00c4",
            "\1\u00c5\32\uffff\1\u00c5\46\uffff\1\u00c5\12\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\2\u00c8\12\uffff\1\u00c8",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00c9",
            "\1\u00ca\32\uffff\1\u00ca\46\uffff\1\u00ca\12\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\2\u00cd\12\uffff\1\u00cd",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00ce",
            "\1\u00cf\32\uffff\1\u00cf\46\uffff\1\u00cf\12\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\2\u00d2\12\uffff\1\u00d2",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\u00d3",
            "\1\u00d4\32\uffff\1\u00d4\46\uffff\1\u00d4\12\uffff\1\u00d4",
            "\1\u00d5",
            "\1\26\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
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
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\26\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\63",
            "\1\65",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\71",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\75",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\101",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\105",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\111",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\115",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\121",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\125",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\57\3\uffff\1\10\4\uffff\2\10\10\uffff\1\10\2\uffff\1\10",
            "\1\131",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\135",
            "\1\145\54\uffff\1\146",
            "\1\u0128",
            "\1\u0129",
            "\1\153\54\uffff\1\154",
            "\1\u012a",
            "\1\u012b",
            "\1\161\54\uffff\1\162",
            "\1\u012c",
            "\1\u012d",
            "\1\167\54\uffff\1\170",
            "\1\u012e",
            "\1\u012f",
            "\1\175\54\uffff\1\176",
            "\1\u0130",
            "\1\u0131",
            "\1\u0083\54\uffff\1\u0084",
            "\1\u0132",
            "\1\u0133",
            "\1\u0089\54\uffff\1\u008a",
            "\1\u0134",
            "\1\u0135",
            "\1\u008f\54\uffff\1\u0090",
            "\1\u0136",
            "\1\u0137",
            "\1\u0095\54\uffff\1\u0096",
            "\1\u0138",
            "\1\u0139",
            "\1\u009b\54\uffff\1\u009c",
            "\1\u013a",
            "\1\u013b",
            "\1\145\54\uffff\1\146",
            "\1\u00a6",
            "\1\153\54\uffff\1\154",
            "\1\u00ab",
            "\1\161\54\uffff\1\162",
            "\1\u00b0",
            "\1\167\54\uffff\1\170",
            "\1\u00b5",
            "\1\175\54\uffff\1\176",
            "\1\u00ba",
            "\1\u0083\54\uffff\1\u0084",
            "\1\u00bf",
            "\1\u0089\54\uffff\1\u008a",
            "\1\u00c4",
            "\1\u008f\54\uffff\1\u0090",
            "\1\u00c9",
            "\1\u0095\54\uffff\1\u0096",
            "\1\u00ce",
            "\1\u009b\54\uffff\1\u009c",
            "\1\u00d3"
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
            return "167:1: booleanExpr : ( TRUE | FALSE | booleanCreate | booleanNof | booleanWrap | booleanNode | equalityExpr | isInOp | containsOp );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA17_eotS =
        "\106\uffff";
    static final String DFA17_eofS =
        "\106\uffff";
    static final String DFA17_minS =
        "\1\16\1\uffff\1\35\1\62\4\uffff\1\62\5\uffff\1\56\1\35\2\5\1\35"+
        "\1\62\1\uffff\1\76\2\35\1\62\1\35\1\76\1\112\1\62\1\61\1\72\2\35"+
        "\1\5\1\61\1\62\1\35\2\112\1\62\1\56\1\76\1\35\2\112\2\35\1\112\2"+
        "\62\1\61\3\35\1\21\2\112\1\62\2\35\1\112\1\5\1\0\1\35\2\uffff\1"+
        "\61\2\112\1\0";
    static final String DFA17_maxS =
        "\1\134\1\uffff\1\35\1\120\4\uffff\1\120\5\uffff\1\131\1\35\2\122"+
        "\1\35\1\62\1\uffff\1\76\1\35\1\112\1\120\1\35\1\76\1\112\1\62\1"+
        "\61\1\106\2\35\1\122\1\61\1\62\1\35\2\112\1\62\1\56\1\76\1\35\2"+
        "\112\2\35\1\112\2\62\1\61\2\35\1\112\1\21\2\112\1\120\1\112\1\35"+
        "\1\112\1\122\1\0\1\35\2\uffff\1\61\2\112\1\0";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\6\uffff\1\2\53\uffff\1\7\1\15\4\uffff";
    static final String DFA17_specialS =
        "\76\uffff\1\1\6\uffff\1\0}>";
    static final String[] DFA17_transitionS = {
            "\1\4\2\uffff\1\10\5\uffff\1\5\1\7\1\11\4\uffff\2\1\10\uffff"+
            "\1\15\37\uffff\1\14\5\uffff\1\3\1\2\5\uffff\1\6\5\uffff\1\13"+
            "\1\12",
            "",
            "\1\16",
            "\1\20\35\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\21\35\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "\1\24\13\uffff\2\23\12\uffff\1\23\22\uffff\1\4",
            "\1\25",
            "\1\26\32\uffff\1\26\46\uffff\1\26\12\uffff\1\26",
            "\1\31\32\uffff\1\31\46\uffff\1\31\6\uffff\1\30\1\27\2\uffff"+
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36\54\uffff\1\37",
            "\1\41\35\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\2\47\12\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52\32\uffff\1\52\46\uffff\1\52\12\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\16",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\16",
            "\1\25",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\32",
            "\1\50",
            "\1\36\54\uffff\1\37",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\35\uffff\1\74",
            "\1\36\54\uffff\1\37",
            "\1\51",
            "\1\76",
            "\1\77\32\uffff\1\77\46\uffff\1\77\12\uffff\1\77",
            "\1\uffff",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\uffff"
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
            return "199:1: isInOp : ( doubleExpr DOT ISIN LP doubleBag RP -> ^( ISIN DOUBLE doubleExpr doubleBag ) | stringExpr DOT ISIN LP stringBag RP -> ^( ISIN INTEGER stringExpr stringBag ) | anyUriExpr DOT ISIN LP anyUriBag RP -> ^( ISIN ANYURI anyUriExpr anyUriBag ) | dateExpr DOT ISIN LP dateBag RP -> ^( ISIN DATE dateExpr dateBag ) | timeExpr DOT ISIN LP timeBag RP -> ^( ISIN TIME timeExpr timeBag ) | dateTimeExpr DOT ISIN LP dateTimeBag RP -> ^( ISIN DATETIME dateTimeExpr dateTimeBag ) | base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) | dayTimeDurationExpr DOT ISIN LP dayTimeDurationBag RP -> ^( ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag ) | yearMonthDurationExpr DOT ISIN LP yearMonthDurationBag RP -> ^( ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag ) | x500NameExpr DOT ISIN LP x500NameBag RP -> ^( ISIN X500NAME x500NameExpr x500NameBag ) | rfc822NameExpr DOT ISIN LP rfc822NameBag RP -> ^( ISIN RFC822NAME rfc822NameExpr rfc822NameBag ) | hexBinaryExpr DOT ISIN LP hexBinaryBag RP -> ^( ISIN HEXBINARY hexBinaryExpr hexBinaryBag ) | ( base64BinaryExpr )=> base64BinaryExpr DOT ISIN LP base64BinaryBag RP -> ^( ISIN BASE64BINARY base64BinaryExpr base64BinaryBag ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_69 = input.LA(1);

                         
                        int index17_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 64;}

                        else if ( (synpred3_Grammar()) ) {s = 65;}

                         
                        input.seek(index17_69);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA17_62 = input.LA(1);

                         
                        int index17_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 64;}

                        else if ( (synpred3_Grammar()) ) {s = 65;}

                         
                        input.seek(index17_62);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA18_eotS =
        "\66\uffff";
    static final String DFA18_eofS =
        "\66\uffff";
    static final String DFA18_minS =
        "\1\16\6\uffff\1\62\5\uffff\1\35\1\5\1\26\1\35\1\62\1\61\1\21\1\112"+
        "\1\62\1\35\1\5\2\35\1\62\1\35\1\76\1\72\1\112\1\35\1\5\1\61\2\62"+
        "\1\0\1\76\1\35\3\112\2\uffff\1\62\1\61\1\35\1\112\1\35\2\112\1\0"+
        "\2\35";
    static final String DFA18_maxS =
        "\1\134\6\uffff\1\120\5\uffff\1\35\1\122\1\26\1\35\1\62\1\61\1\21"+
        "\1\112\1\120\1\35\1\122\1\35\1\112\1\120\1\35\1\76\1\106\1\112\1"+
        "\35\1\122\1\61\2\62\1\0\1\76\1\35\3\112\2\uffff\1\62\1\61\1\35\4"+
        "\112\1\0\1\112\1\35";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\35\uffff\1\7\1\15\12\uffff";
    static final String DFA18_specialS =
        "\44\uffff\1\1\16\uffff\1\0\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\3\2\uffff\1\7\5\uffff\1\4\1\6\1\10\4\uffff\1\1\11\uffff\1"+
            "\14\37\uffff\1\13\5\uffff\1\2\6\uffff\1\5\5\uffff\1\12\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\35\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\17",
            "\1\20\32\uffff\1\20\46\uffff\1\20\12\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27\35\uffff\1\30",
            "\1\17",
            "\1\33\32\uffff\1\33\46\uffff\1\33\6\uffff\1\32\1\31\2\uffff"+
            "\1\33",
            "\1\34",
            "\1\35\54\uffff\1\36",
            "\1\40\35\uffff\1\37",
            "\1\41",
            "\1\42",
            "\2\43\12\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46\32\uffff\1\46\46\uffff\1\46\12\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\uffff",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\34",
            "\1\63",
            "\1\35\54\uffff\1\36",
            "\1\64",
            "\1\65",
            "\1\uffff",
            "\1\35\54\uffff\1\36",
            "\1\45"
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
            return "228:1: containsOp : ( doubleBag DOT CONTAINS LP doubleExpr RP -> ^( CONTAINS DOUBLE doubleBag doubleExpr ) | stringBag DOT CONTAINS LP stringExpr RP -> ^( CONTAINS STRING stringBag stringExpr ) | anyUriBag DOT CONTAINS LP anyUriExpr RP -> ^( CONTAINS STRING anyUriBag anyUriExpr ) | dateBag DOT CONTAINS LP dateBag RP -> ^( CONTAINS STRING dateBag dateBag ) | timeBag DOT CONTAINS LP timeExpr RP -> ^( CONTAINS STRING timeBag timeExpr ) | dateTimeBag DOT CONTAINS LP dateTimeExpr RP -> ^( CONTAINS STRING dateTimeBag dateTimeExpr ) | base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) | dayTimeDurationBag DOT CONTAINS LP dayTimeDurationExpr RP -> ^( CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr ) | yearMonthDurationBag DOT CONTAINS LP yearMonthDurationExpr RP -> ^( CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr ) | x500NameBag DOT CONTAINS LP x500NameExpr RP -> ^( CONTAINS STRING x500NameBag x500NameExpr ) | rfc822NameBag DOT CONTAINS LP rfc822NameExpr RP -> ^( CONTAINS STRING rfc822NameBag rfc822NameExpr ) | hexBinaryBag DOT CONTAINS LP hexBinaryExpr RP -> ^( CONTAINS STRING hexBinaryBag hexBinaryExpr ) | ( base64BinaryExpr )=> base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP -> ^( CONTAINS STRING base64BinaryBag base64BinaryExpr ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_51 = input.LA(1);

                         
                        int index18_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 42;}

                        else if ( (synpred4_Grammar()) ) {s = 43;}

                         
                        input.seek(index18_51);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA18_36 = input.LA(1);

                         
                        int index18_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 42;}

                        else if ( (synpred4_Grammar()) ) {s = 43;}

                         
                        input.seek(index18_36);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA31_eotS =
        "\147\uffff";
    static final String DFA31_eofS =
        "\147\uffff";
    static final String DFA31_minS =
        "\1\5\1\uffff\13\62\1\uffff\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1"+
        "\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1"+
        "\72\1\uffff\1\76\1\35\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1"+
        "\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff"+
        "\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff\2\62\12\61"+
        "\14\112\14\35";
    static final String DFA31_maxS =
        "\1\134\1\uffff\13\120\1\uffff\1\63\1\122\1\35\1\122\1\35\1\122\1"+
        "\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122"+
        "\1\35\1\122\1\35\1\122\1\131\1\uffff\1\115\1\35\1\115\1\35\1\uffff"+
        "\1\115\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1\uffff\1\115"+
        "\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1"+
        "\uffff\1\115\1\35\1\uffff\2\62\12\61\14\112\2\63\12\35";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\27\uffff\1\3\4\uffff\1\4\2\uffff\1\5\2"+
        "\uffff\1\6\2\uffff\1\7\2\uffff\1\14\2\uffff\1\13\2\uffff\1\10\2"+
        "\uffff\1\11\2\uffff\1\12\44\uffff";
    static final String DFA31_specialS =
        "\147\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\10\uffff\1\4\1\uffff\1\1\1\10\1\1\4\uffff\1\5\1\7\1\11"+
            "\4\uffff\1\2\1\15\1\1\7\uffff\1\1\2\uffff\2\1\32\uffff\1\1\1"+
            "\14\5\uffff\1\3\1\16\2\uffff\1\1\2\uffff\1\6\5\uffff\1\13\1"+
            "\12",
            "",
            "\1\17\35\uffff\1\1",
            "\1\21\35\uffff\1\20",
            "\1\23\35\uffff\1\22",
            "\1\25\35\uffff\1\24",
            "\1\27\35\uffff\1\26",
            "\1\31\35\uffff\1\30",
            "\1\33\35\uffff\1\32",
            "\1\35\35\uffff\1\34",
            "\1\37\35\uffff\1\36",
            "\1\41\35\uffff\1\40",
            "\1\43\35\uffff\1\42",
            "",
            "\1\44\3\uffff\1\45\4\uffff\2\45\10\uffff\1\45\2\uffff\1\45",
            "\1\1\32\uffff\1\1\46\uffff\1\1\6\uffff\2\15\2\uffff\1\1",
            "\1\46",
            "\1\47\32\uffff\1\47\46\uffff\1\47\12\uffff\1\47",
            "\1\50",
            "\1\51\32\uffff\1\51\46\uffff\1\51\6\uffff\2\52\2\uffff\1\51",
            "\1\53",
            "\1\54\32\uffff\1\54\46\uffff\1\54\6\uffff\2\55\2\uffff\1\54",
            "\1\56",
            "\1\57\32\uffff\1\57\46\uffff\1\57\6\uffff\2\60\2\uffff\1\57",
            "\1\61",
            "\1\62\32\uffff\1\62\46\uffff\1\62\6\uffff\2\63\2\uffff\1\62",
            "\1\64",
            "\1\65\32\uffff\1\65\46\uffff\1\65\6\uffff\2\66\2\uffff\1\65",
            "\1\67",
            "\1\70\32\uffff\1\70\46\uffff\1\70\6\uffff\2\71\2\uffff\1\70",
            "\1\72",
            "\1\73\32\uffff\1\73\46\uffff\1\73\6\uffff\2\74\2\uffff\1\73",
            "\1\75",
            "\1\76\32\uffff\1\76\46\uffff\1\76\6\uffff\2\77\2\uffff\1\76",
            "\1\100",
            "\1\101\32\uffff\1\101\46\uffff\1\101\6\uffff\2\102\2\uffff"+
            "\1\101",
            "\2\103\12\uffff\1\103\22\uffff\1\52",
            "",
            "\1\104\16\uffff\1\1",
            "\1\105",
            "\1\52\16\uffff\1\1",
            "\1\106",
            "",
            "\1\55\16\uffff\1\1",
            "\1\107",
            "",
            "\1\60\16\uffff\1\1",
            "\1\110",
            "",
            "\1\63\16\uffff\1\1",
            "\1\111",
            "",
            "\1\66\16\uffff\1\1",
            "\1\112",
            "",
            "\1\71\16\uffff\1\1",
            "\1\113",
            "",
            "\1\74\16\uffff\1\1",
            "\1\114",
            "",
            "\1\77\16\uffff\1\1",
            "\1\115",
            "",
            "\1\102\16\uffff\1\1",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\44\3\uffff\1\45\4\uffff\2\45\10\uffff\1\45\2\uffff\1\45",
            "\1\44\3\uffff\1\45\4\uffff\2\45\10\uffff\1\45\2\uffff\1\45",
            "\1\46",
            "\1\50",
            "\1\53",
            "\1\56",
            "\1\61",
            "\1\64",
            "\1\67",
            "\1\72",
            "\1\75",
            "\1\100"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "257:1: equalityExpr : (l1= integerExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r1= integerExpr -> ^( $o INTEGER $l1 $r1) |l2= doubleExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r2= doubleExpr -> ^( $o DOUBLE $l2 $r2) |l3= stringExpr (o= EQ | GE | GT | LT | LE ) r3= stringExpr -> ^( $o STRING $l3 $r3) |l4= anyUriExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r4= anyUriExpr -> ^( $o ANYURI $l4 $r4) |l5= dateExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r5= dateExpr -> ^( $o DATE $l5 $r5) |l6= timeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r6= timeExpr -> ^( $o TIME $l6 $r6) |l7= dateTimeExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r7= dateTimeExpr -> ^( $o DATETIME $l7 $r7) |l8= yearMonthDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r8= yearMonthDurationExpr -> ^( $o YEARMONTHDURATION $l8 $r8) |l9= x500NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) r9= x500NameExpr -> ^( $o X500NAME $l9 $r9) |lA= rfc822NameExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rA= rfc822NameExpr -> ^( $o RFC822NAME $lA $rA) |lB= dayTimeDurationExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rB= dayTimeDurationExpr -> ^( $o DAYTIMEDURATION $lB $rB) |lC= base64BinaryExpr (o= EQ |o= GE |o= GT |o= LT |o= LE ) rC= base64BinaryExpr -> ^( $o BASE64BINARY $lC $rC) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA32_eotS =
        "\147\uffff";
    static final String DFA32_eofS =
        "\147\uffff";
    static final String DFA32_minS =
        "\1\5\1\uffff\13\62\1\uffff\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1"+
        "\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1\35\1\5\1"+
        "\72\1\76\1\35\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff"+
        "\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\76\1\35"+
        "\1\uffff\1\76\1\35\1\uffff\1\76\1\35\1\uffff\1\62\1\uffff\1\62\12"+
        "\61\14\112\14\35";
    static final String DFA32_maxS =
        "\1\134\1\uffff\13\120\1\uffff\1\35\1\122\1\35\1\122\1\35\1\122\1"+
        "\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122\1\35\1\122"+
        "\1\35\1\122\1\35\1\122\1\131\1\115\1\35\1\115\1\35\1\uffff\1\115"+
        "\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1"+
        "\uffff\1\115\1\35\1\uffff\1\115\1\35\1\uffff\1\115\1\35\1\uffff"+
        "\1\115\1\35\1\uffff\1\62\1\uffff\1\62\12\61\14\112\14\35";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\33\uffff\1\4\2\uffff\1\5\2\uffff\1\6\2"+
        "\uffff\1\7\2\uffff\1\14\2\uffff\1\10\2\uffff\1\11\2\uffff\1\12\2"+
        "\uffff\1\13\1\uffff\1\3\43\uffff";
    static final String DFA32_specialS =
        "\147\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\10\uffff\1\4\1\uffff\1\1\1\10\1\1\4\uffff\1\5\1\7\1\11"+
            "\4\uffff\1\2\1\15\1\1\7\uffff\1\1\2\uffff\2\1\32\uffff\1\1\1"+
            "\14\5\uffff\1\3\1\16\2\uffff\1\1\2\uffff\1\6\5\uffff\1\13\1"+
            "\12",
            "",
            "\1\17\35\uffff\1\1",
            "\1\21\35\uffff\1\20",
            "\1\23\35\uffff\1\22",
            "\1\25\35\uffff\1\24",
            "\1\27\35\uffff\1\26",
            "\1\31\35\uffff\1\30",
            "\1\33\35\uffff\1\32",
            "\1\35\35\uffff\1\34",
            "\1\37\35\uffff\1\36",
            "\1\41\35\uffff\1\40",
            "\1\43\35\uffff\1\42",
            "",
            "\1\44",
            "\1\1\32\uffff\1\1\46\uffff\1\1\6\uffff\2\15\2\uffff\1\1",
            "\1\45",
            "\1\46\32\uffff\1\46\46\uffff\1\46\12\uffff\1\46",
            "\1\47",
            "\1\50\32\uffff\1\50\46\uffff\1\50\6\uffff\2\51\2\uffff\1\50",
            "\1\52",
            "\1\53\32\uffff\1\53\46\uffff\1\53\6\uffff\2\54\2\uffff\1\53",
            "\1\55",
            "\1\56\32\uffff\1\56\46\uffff\1\56\6\uffff\2\57\2\uffff\1\56",
            "\1\60",
            "\1\61\32\uffff\1\61\46\uffff\1\61\6\uffff\2\62\2\uffff\1\61",
            "\1\63",
            "\1\64\32\uffff\1\64\46\uffff\1\64\6\uffff\2\65\2\uffff\1\64",
            "\1\66",
            "\1\67\32\uffff\1\67\46\uffff\1\67\6\uffff\2\70\2\uffff\1\67",
            "\1\71",
            "\1\72\32\uffff\1\72\46\uffff\1\72\6\uffff\2\73\2\uffff\1\72",
            "\1\74",
            "\1\75\32\uffff\1\75\46\uffff\1\75\6\uffff\2\76\2\uffff\1\75",
            "\1\77",
            "\1\100\32\uffff\1\100\46\uffff\1\100\6\uffff\2\101\2\uffff"+
            "\1\100",
            "\2\102\11\uffff\1\103\1\102\22\uffff\1\51",
            "\1\104\16\uffff\1\1",
            "\1\105",
            "\1\51\16\uffff\1\1",
            "\1\106",
            "",
            "\1\54\16\uffff\1\1",
            "\1\107",
            "",
            "\1\57\16\uffff\1\1",
            "\1\110",
            "",
            "\1\62\16\uffff\1\1",
            "\1\111",
            "",
            "\1\65\16\uffff\1\1",
            "\1\112",
            "",
            "\1\70\16\uffff\1\1",
            "\1\113",
            "",
            "\1\73\16\uffff\1\1",
            "\1\114",
            "",
            "\1\76\16\uffff\1\1",
            "\1\115",
            "",
            "\1\101\16\uffff\1\1",
            "\1\116",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\47",
            "\1\52",
            "\1\55",
            "\1\60",
            "\1\63",
            "\1\66",
            "\1\71",
            "\1\74",
            "\1\77"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "284:1: regexOp : (l= integerExpr DOT REGEXMATCH LP r= integerExpr RP -> ^( REGEXMATCH INTEGER $l $r) | doubleExpr DOT REGEXMATCH LP doubleExpr RP -> ^( REGEXMATCH INTEGER $l $r) | stringExpr DOT REGEXMATCH LP stringExpr RP -> ^( REGEXMATCH INTEGER $l $r) | anyUriExpr DOT REGEXMATCH LP anyUriExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateExpr DOT REGEXMATCH LP dateExpr RP -> ^( REGEXMATCH INTEGER $l $r) | timeExpr DOT REGEXMATCH LP timeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dateTimeExpr DOT REGEXMATCH LP dateTimeExpr RP -> ^( REGEXMATCH INTEGER $l $r) | dayTimeDurationExpr DOT REGEXMATCH LP dayTimeDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | yearMonthDurationExpr DOT REGEXMATCH LP yearMonthDurationExpr RP -> ^( REGEXMATCH INTEGER $l $r) | x500NameExpr DOT REGEXMATCH LP x500NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | rfc822NameExpr DOT REGEXMATCH LP rfc822NameExpr RP -> ^( REGEXMATCH INTEGER $l $r) | base64BinaryExpr DOT REGEXMATCH LP base64BinaryExpr RP -> ^( REGEXMATCH INTEGER $l $r) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_policy_in_xacmlFile561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_policySet_in_xacmlFile565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_xacmlFile568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICY_in_policy580 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policy583 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policy585 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LB_in_policy587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100810L});
    public static final BitSet FOLLOW_target_in_policy590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000810L});
    public static final BitSet FOLLOW_rule_in_policy593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RB_in_policy596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLICYSET_in_policySet608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_policySet611 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_policySet613 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LB_in_policySet615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100012L});
    public static final BitSet FOLLOW_target_in_policySet618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_policy_in_policySet621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_RB_in_policySet624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TARGET_in_target636 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LB_in_target639 = new BitSet(new long[]{0x0004000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_matchOrExpr_in_target642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RB_in_target644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchAndExpr_in_matchOrExpr657 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_OR_in_matchOrExpr660 = new BitSet(new long[]{0x0004000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_matchAndExpr_in_matchOrExpr663 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_matchExpr_in_matchAndExpr679 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AND_in_matchAndExpr682 = new BitSet(new long[]{0x0004000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_matchExpr_in_matchAndExpr685 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_attributeSelector_in_matchExpr699 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_matchExpr701 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_MATCHES_in_matchExpr704 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_matchExpr707 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_matchExpr710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_matchExpr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_matchExpr718 = new BitSet(new long[]{0x0004000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_matchOrExpr_in_matchExpr721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_matchExpr723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributeSelector735 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_attributeSelector753 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LOWERCASEIDENTIFIER_in_attributeSelector756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_in_rule767 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ANYCASEIDENTIFIER_in_rule770 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_rule772 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LB_in_rule780 = new BitSet(new long[]{0x0000000000200000L,0x0000000000100010L});
    public static final BitSet FOLLOW_target_in_rule783 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_condition_in_rule786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RB_in_rule789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition801 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LB_in_condition803 = new BitSet(new long[]{0x12041911C3874020L,0x000000001864C180L});
    public static final BitSet FOLLOW_booleanAndExpr_in_condition805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RB_in_condition807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanOrExpr_in_booleanAndExpr840 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AND_in_booleanAndExpr843 = new BitSet(new long[]{0x12041911C3874020L,0x000000001864C180L});
    public static final BitSet FOLLOW_booleanOrExpr_in_booleanAndExpr847 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_booleanOrExpr_in_booleanAndExpr875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanOrExpr911 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_OR_in_booleanOrExpr914 = new BitSet(new long[]{0x12041911C3874020L,0x000000001864C180L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanOrExpr918 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanOrExpr947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanExpr973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanExpr978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanCreate_in_booleanExpr983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanNof_in_booleanExpr988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanWrap_in_booleanExpr993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanNode_in_booleanExpr998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_booleanExpr1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isInOp_in_booleanExpr1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsOp_in_booleanExpr1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanCreate1025 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_booleanCreate1028 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_booleanCreate1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_booleanCreate1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanNof1044 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_booleanNof1054 = new BitSet(new long[]{0x12041911C3874020L,0x000000001864C180L});
    public static final BitSet FOLLOW_booleanExpr_in_booleanNof1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_booleanNof1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_booleanWrap1070 = new BitSet(new long[]{0x12041911C3874020L,0x000000001864C180L});
    public static final BitSet FOLLOW_booleanOrExpr_in_booleanWrap1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_booleanWrap1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_booleanNode1086 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_booleanNode1088 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_set_in_booleanNode1091 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_booleanNode1102 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_booleanNode1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_booleanNode1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanBag1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_booleanBag1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeSelector_in_booleanBag1126 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_booleanBag1129 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanBag1131 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_booleanBag1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_booleanBag1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_isInOp1148 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1150 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1152 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1154 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_doubleBag_in_isInOp1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_isInOp1177 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1179 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1181 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_stringBag_in_isInOp1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_isInOp1206 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1208 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1210 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_anyUriBag_in_isInOp1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_isInOp1235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1237 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1239 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1241 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_isInOp1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_isInOp1265 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1267 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1269 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_timeBag_in_isInOp1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_isInOp1294 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1296 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1298 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1300 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dateTimeBag_in_isInOp1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1323 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1325 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1327 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1329 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_isInOp1352 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1354 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1356 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1358 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_isInOp1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_isInOp1381 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1383 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1385 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_isInOp1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_isInOp1410 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1412 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1414 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_x500NameBag_in_isInOp1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_isInOp1439 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1441 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1443 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rfc822NameBag_in_isInOp1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_isInOp1468 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1470 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1472 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1474 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_isInOp1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_isInOp1503 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_isInOp1505 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ISIN_in_isInOp1507 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_isInOp1509 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_isInOp1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_isInOp1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_containsOp1538 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1540 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1542 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1544 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_doubleExpr_in_containsOp1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_containsOp1568 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1570 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1572 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1574 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_containsOp1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_containsOp1598 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1600 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1602 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1604 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_anyUriExpr_in_containsOp1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1627 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1629 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1631 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1633 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_containsOp1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_containsOp1656 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1658 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1660 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_timeExpr_in_containsOp1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_containsOp1685 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1687 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1689 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1691 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_containsOp1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1714 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1716 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1718 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_containsOp1743 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1745 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1747 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1749 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_containsOp1751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_containsOp1772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1774 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1776 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_containsOp1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_containsOp1801 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1803 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1805 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_x500NameExpr_in_containsOp1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_containsOp1830 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1832 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1834 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_containsOp1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_containsOp1859 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1861 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1863 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1865 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_hexBinaryExpr_in_containsOp1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_containsOp1894 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_containsOp1896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONTAINS_in_containsOp1898 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_containsOp1900 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_containsOp1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_containsOp1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1931 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr1937 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_GE_in_equalityExpr1943 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_GT_in_equalityExpr1949 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_LT_in_equalityExpr1955 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_LE_in_equalityExpr1961 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_integerExpr_in_equalityExpr1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr1991 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr1997 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2003 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2009 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2015 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2021 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_doubleExpr_in_equalityExpr2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr2051 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2057 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2061 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2065 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2069 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2073 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_equalityExpr2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr2103 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2109 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2115 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2121 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2127 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2133 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_anyUriExpr_in_equalityExpr2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr2163 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2169 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2175 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2181 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2187 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2193 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_equalityExpr2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr2223 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_timeExpr_in_equalityExpr2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr2283 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2289 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2295 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2301 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2313 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_equalityExpr2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr2343 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_equalityExpr2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr2403 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2409 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2427 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_x500NameExpr_in_equalityExpr2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr2463 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_equalityExpr2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr2523 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2529 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2541 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2547 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2553 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_equalityExpr2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr2583 = new BitSet(new long[]{0x000900C200000000L});
    public static final BitSet FOLLOW_EQ_in_equalityExpr2589 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_GE_in_equalityExpr2595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_GT_in_equalityExpr2601 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LT_in_equalityExpr2607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LE_in_equalityExpr2613 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_equalityExpr2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp2649 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2653 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2655 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_integerExpr_in_regexOp2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp2688 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2692 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2694 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_doubleExpr_in_regexOp2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp2725 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2729 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2731 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_regexOp2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp2762 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2766 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2768 = new BitSet(new long[]{0x0000000000004000L,0x000000000000C000L});
    public static final BitSet FOLLOW_anyUriExpr_in_regexOp2770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp2799 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2803 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2805 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateExpr_in_regexOp2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp2836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2840 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_timeExpr_in_regexOp2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp2873 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2877 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2879 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dateTimeExpr_in_regexOp2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp2910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2914 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2916 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dayTimeDurationExpr_in_regexOp2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp2947 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2951 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_yearMonthDurationExpr_in_regexOp2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp2984 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp2988 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_x500NameExpr_in_regexOp2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp3021 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp3025 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rfc822NameExpr_in_regexOp3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp3058 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_regexOp3060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_REGEXMATCH_in_regexOp3062 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_regexOp3064 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_regexOp3066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_regexOp3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp3109 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3111 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3117 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3123 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3129 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3133 = new BitSet(new long[]{0x0000000100040020L,0x0000000000040080L});
    public static final BitSet FOLLOW_booleanBag_in_bagOp3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_bagOp3172 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3174 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3180 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3186 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3192 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3196 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_integerBag_in_bagOp3200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp3235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3237 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3243 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3249 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3255 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3259 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_doubleBag_in_bagOp3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_bagOp3299 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3301 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3307 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3313 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3319 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_stringBag_in_bagOp3327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_bagOp3363 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3365 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3371 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3377 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3383 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3387 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dateBag_in_bagOp3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_bagOp3427 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3429 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3435 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3441 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3447 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_timeBag_in_bagOp3455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp3491 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3493 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3499 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3505 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3511 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3515 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dateTimeBag_in_bagOp3519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp3555 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3557 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3563 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3569 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3575 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3579 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp3583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp3619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3621 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3627 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3633 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3639 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3643 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_bagOp3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp3683 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3685 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3691 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3697 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3703 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_bagOp3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp3747 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3749 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3755 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3761 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3767 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3771 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_anyUriBag_in_bagOp3775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp3811 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3813 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3819 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3825 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3831 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3835 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_x500NameBag_in_bagOp3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp3875 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3877 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3883 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3889 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3895 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rfc822NameBag_in_bagOp3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp3939 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp3941 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp3947 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp3953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp3959 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp3963 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_hexBinaryBag_in_bagOp3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp4002 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_bagOp4004 = new BitSet(new long[]{0x0000000000008000L,0x0000000000081000L});
    public static final BitSet FOLLOW_ATLEASTONEMENBEROF_in_bagOp4010 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SUBSET_in_bagOp4016 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SETEQUALS_in_bagOp4022 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_bagOp4026 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_base64BinaryBag_in_bagOp4030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_bagOp4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_CONSTANT_in_integerExpr4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_integerExpr4075 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_integerExpr4077 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_integerExpr4079 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_integerExpr4081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_integerExpr4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyBag_in_integerExpr4089 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_integerExpr4091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SIZE_in_integerExpr4094 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_integerExpr4096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_integerExpr4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integerBag4115 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_integerBag4118 = new BitSet(new long[]{0x0000000100000020L,0x0000000000060080L});
    public static final BitSet FOLLOW_STRING_LIST_in_integerBag4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_attributeSelector_in_integerBag4126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_integerBag4129 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_BAG_in_integerBag4136 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_integerBag4139 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag4142 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_integerBag4146 = new BitSet(new long[]{0x0000190143874020L,0x0000000018244180L});
    public static final BitSet FOLLOW_integerExpr_in_integerBag4149 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_RP_in_integerBag4153 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_DOT_in_integerBag4160 = new BitSet(new long[]{0x0000200000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_set_in_integerBag4163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_integerBag4174 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_integerBag_in_integerBag4177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_integerBag4179 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_DOUBLE_CONSTANT_in_doubleExpr4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_doubleExpr4199 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_doubleExpr4202 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_doubleExpr4205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_doubleExpr4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_doubleBag4220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_doubleBag4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_doubleBag4228 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_doubleBag4230 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_doubleBag4232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_doubleBag4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CONSTANT_in_stringExpr4248 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_stringBag_in_stringExpr4255 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_stringExpr4257 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_stringExpr4260 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_stringExpr4263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_stringExpr4266 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_DOT_in_stringExpr4273 = new BitSet(new long[]{0x0C00000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_stringExpr4276 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_stringExpr4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_stringExpr4293 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_STRING_in_stringBag4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_stringBag4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringBag4315 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_stringBag4317 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_stringBag4319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_stringBag4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_in_anyUriExpr4334 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_anyUriExpr4337 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_anyUriExpr4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyUriExpr4348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_anyUriExpr4350 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_anyUriExpr4353 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_anyUriExpr4356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_anyUriExpr4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpr_in_anyUriExpr4365 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_anyUriExpr4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_URI_in_anyUriExpr4370 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_anyUriExpr4373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_anyUriExpr4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_in_anyUriBag4390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_anyUriBag4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANYURI_in_anyUriBag4398 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_anyUriBag4400 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_anyUriBag4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_anyUriBag4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_dateExpr4416 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateExpr4419 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_dateExpr4422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateExpr4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_dateExpr4430 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_dateExpr4432 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_dateExpr4435 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateExpr4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateExpr4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_dateBag4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateBag4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_dateBag4460 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateBag4462 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_dateBag4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateBag4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeExpr4479 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_timeExpr4482 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_timeExpr4485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_timeExpr4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_timeExpr4493 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_timeExpr4495 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_timeExpr4498 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_timeExpr4501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_timeExpr4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeBag4515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_timeBag4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeBag4523 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_timeBag4525 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_timeBag4527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_timeBag4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_in_dateTimeExpr4542 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateTimeExpr4545 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_dateTimeExpr4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateTimeExpr4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_dateTimeExpr4556 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_dateTimeExpr4558 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_dateTimeExpr4561 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateTimeExpr4564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateTimeExpr4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_in_dateTimeBag4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dateTimeBag4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_in_dateTimeBag4586 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dateTimeBag4588 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_dateTimeBag4590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dateTimeBag4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_in_base64BinaryExpr4605 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_base64BinaryExpr4608 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_base64BinaryExpr4611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_base64BinaryExpr4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_base64BinaryExpr4619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_base64BinaryExpr4621 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_base64BinaryExpr4624 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_base64BinaryExpr4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_base64BinaryExpr4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_in_base64BinaryBag4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_base64BinaryBag4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE64BINARY_in_base64BinaryBag4649 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_base64BinaryBag4651 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_base64BinaryBag4653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_base64BinaryBag4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_in_dayTimeDurationExpr4669 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dayTimeDurationExpr4672 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_dayTimeDurationExpr4675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dayTimeDurationExpr4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_dayTimeDurationExpr4683 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_dayTimeDurationExpr4685 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_dayTimeDurationExpr4688 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dayTimeDurationExpr4691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dayTimeDurationExpr4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_in_dayTimeDurationBag4705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_dayTimeDurationBag4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAYTIMEDURATION_in_dayTimeDurationBag4713 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_dayTimeDurationBag4715 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_dayTimeDurationBag4717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_dayTimeDurationBag4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_in_yearMonthDurationExpr4732 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_yearMonthDurationExpr4735 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_yearMonthDurationExpr4738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_yearMonthDurationExpr4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_yearMonthDurationExpr4746 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_yearMonthDurationExpr4748 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_yearMonthDurationExpr4751 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_yearMonthDurationExpr4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_yearMonthDurationExpr4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_in_yearMonthDurationBag4768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_yearMonthDurationBag4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEARMONTHDURATION_in_yearMonthDurationBag4776 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_yearMonthDurationBag4778 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_yearMonthDurationBag4780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_yearMonthDurationBag4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_in_x500NameExpr4795 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_x500NameExpr4798 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_x500NameExpr4801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_x500NameExpr4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_x500NameExpr4809 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_x500NameExpr4811 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_x500NameExpr4814 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_x500NameExpr4817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_x500NameExpr4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_in_x500NameBag4832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_x500NameBag4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X500NAME_in_x500NameBag4840 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_x500NameBag4842 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_x500NameBag4844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_x500NameBag4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_in_rfc822NameExpr4859 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_rfc822NameExpr4862 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_rfc822NameExpr4865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_rfc822NameExpr4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_rfc822NameExpr4873 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_rfc822NameExpr4875 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_rfc822NameExpr4878 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_rfc822NameExpr4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_rfc822NameExpr4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_in_rfc822NameBag4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_rfc822NameBag4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RFC822NAME_in_rfc822NameBag4904 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_rfc822NameBag4906 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_rfc822NameBag4908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_rfc822NameBag4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_in_hexBinaryExpr4923 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_hexBinaryExpr4926 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_stringExpr_in_hexBinaryExpr4929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_hexBinaryExpr4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_hexBinaryExpr4937 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_hexBinaryExpr4939 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ONEANDONLY_in_hexBinaryExpr4942 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_hexBinaryExpr4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_hexBinaryExpr4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_in_hexBinaryBag4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_CONSTANT_LIST_in_hexBinaryBag4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXBINARY_in_hexBinaryBag4967 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LP_in_hexBinaryBag4969 = new BitSet(new long[]{0x0000000100000020L,0x0000000000040080L});
    public static final BitSet FOLLOW_attributeSelector_in_hexBinaryBag4971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_hexBinaryBag4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_anyBag4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_anyBag4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_anyBag4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_anyBag4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_anyBag5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_anyBag5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_anyBag5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_anyBag5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_anyBag5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_anyBag5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_anyBag5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_anyBag5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_anyBag5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_anyBag5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred1_Grammar832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred2_Grammar903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred3_Grammar1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryExpr_in_synpred4_Grammar1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanBag_in_synpred5_Grammar3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerBag_in_synpred6_Grammar3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleBag_in_synpred7_Grammar3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringBag_in_synpred8_Grammar3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateBag_in_synpred9_Grammar3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeBag_in_synpred10_Grammar3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateTimeBag_in_synpred11_Grammar3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred12_Grammar3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayTimeDurationBag_in_synpred13_Grammar3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearMonthDurationBag_in_synpred14_Grammar3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyUriBag_in_synpred15_Grammar3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_x500NameBag_in_synpred16_Grammar3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rfc822NameBag_in_synpred17_Grammar3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexBinaryBag_in_synpred18_Grammar3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base64BinaryBag_in_synpred19_Grammar3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONEANDONLY_in_synpred20_Grammar4069 = new BitSet(new long[]{0x0000000000000002L});

}