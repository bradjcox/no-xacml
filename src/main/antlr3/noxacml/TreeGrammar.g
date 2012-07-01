tree grammar TreeGrammar;

options {
    tokenVocab=Grammar;
    ASTLabelType=CommonTree;
}

// START:members
@header
{
	package noxacml;
	import java.util.Map;
    import java.util.HashMap;
    import java.math.BigInteger;
}

@members {
    /** Points to functions tracked by tree builder. */
    private List<CommonTree> functionDefinitions;

    /** Remember local variables. Currently, this is only the function parameter.
     */
    private final Map<String, BigInteger> localMemory = new HashMap<String, BigInteger>();

    /** Remember global variables set by =. */
    private Map<String, BigInteger> globalMemory = new HashMap<String, BigInteger>();

    /** Set up an evaluator with a node stream; and a set of function definition ASTs. */
    public Eval1(CommonTreeNodeStream nodes, List<CommonTree> functionDefinitions) {
        this(nodes);
        this.functionDefinitions = functionDefinitions;
    }

    /** Set up a local evaluator for a nested function call. The evaluator gets the definition
     *  tree of the function; the set of all defined functions (to find locally called ones); a
     *  pointer to the global variable memory; and the value of the function parameter to be
     *  added to the local memory.
     */
    private Eval1(CommonTree function,
                 List<CommonTree> functionDefinitions,
                 Map<String, BigInteger> globalMemory,
                 BigInteger paramValue) {
        // Expected tree for function: ^(FUNC ID ( INT | ID ) expr)
        this(new CommonTreeNodeStream(function.getChild(2)), functionDefinitions);
        this.globalMemory = globalMemory;
        localMemory.put(function.getChild(1).getText(), paramValue);
    }

    /** Find matching function definition for a function name and parameter
     *  value. The first definition is returned where (a) the name matches
     *  and (b) the formal parameter agrees if it is defined as constant.
     */
    private CommonTree findFunction(String name, BigInteger paramValue) {
        SEARCH:
        for (CommonTree f : functionDefinitions) {
            // Expected tree for f: ^(FUNC ID (ID | INT) expr)
            if (f.getChild(0).getText().equals(name)) {
                // Check whether parameter matches
              	CommonTree formalPar = (CommonTree) f.getChild(1);
                if (formalPar.getToken().getType() == INT
                    && !new BigInteger(formalPar.getToken().getText()).equals(paramValue)) {
                        // Constant in formalPar list does not match actual value -> no match.
                        continue SEARCH;
                }
                // Parameter (value for INT formal arg) as well as fct name agrees!
                return f;
            }
        }
        return null;
    }

    /** Get value of name up call stack. */
    public BigInteger getValue(String name) {
        BigInteger value = localMemory.get(name);
        if ( value!=null ) {
            return value;
        }
        value = globalMemory.get(name);
        if ( value!=null ) {
            return value;
        }
        // not found in local memory or global memory
        System.err.println("undefined variable "+name);
        return BigInteger.ZERO;
    }
}
// END:members

// START:rules
prog:   stat*
    ;

stat:   expr                       { String result = $expr.value.toString();
                                     System.out.println($expr.value + " (about " + result.charAt(0) + "*10^" + (result.length()-1) + ")");
                                   }
    |   ^('=' ID expr)             { globalMemory.put($ID.text, $expr.value); }
    |   ^(FUNC .+)	               // ignore FUNCs - we added them to functionDefinitions already in parser.
    ;

expr returns [BigInteger value]
    :   ^('+' a=expr b=expr)       { $value = $a.value.add($b.value); }
    |   ^('-' a=expr b=expr)       { $value = $a.value.subtract($b.value); }
    |   ^('*' a=expr b=expr)       { $value = $a.value.multiply($b.value); }
    |   ^('/' a=expr b=expr)       { $value = $a.value.divide($b.value); }
    |   ^('%' a=expr b=expr)       { $value = $a.value.remainder($b.value); }
    |   ID                         { $value = getValue($ID.text); }
    |   INT                        { $value = new BigInteger($INT.text); }
    |   call                       { $value = $call.value; }
    ;

call returns [BigInteger value]
    :   ^(CALL ID expr)            { BigInteger p = $expr.value;
                                     CommonTree funcRoot = findFunction($ID.text, p);
                                     if (funcRoot == null) {
                                         System.err.println("No match found for " + $ID.text + "(" + p + ")");
                                     } else {
                                         // Here we set up the local evaluator to run over the
                                         // function definition with the parameter value.
                                         // This re-reads a sub-AST of our input AST!
                                         Eval1 e = new Eval1(funcRoot, functionDefinitions, globalMemory, p);
                                         $value = e.expr();
                                     }
                                   }
    ;
// END:rules