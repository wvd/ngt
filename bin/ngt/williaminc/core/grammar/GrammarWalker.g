// START:header
tree grammar GrammarWalker;

options {
  tokenVocab=Grammar; // import tokens from CMinus.g
  ASTLabelType=CommonTree;
}

@header { package ngt.williaminc.core.grammar; 
          import ngt.williaminc.core.ext.*;
          import ngt.williaminc.core.type.*;
          
          import java.util.Map;
          import java.util.HashMap;
          
}

@members {
  private Map<String, Function> fList = new HashMap<String, Function>();
}
// END:header

// START:decl
program
    :   declaration+
    ;

declaration
    :   variable
    |   function
    ;

variable
    :   ^(VAR type ID expr)
        {System.out.println("define "+$type.text+" "+$ID.text);}
    ;

type:   'nummer' 
    |   'lijst'
    ;

function
    @init { Map exprList = new HashMap(); }
    :   ^(FUNC type ID (e=formalParameter {exprList.put($e.id, $e.type);})* block)
        {System.out.println("define "+$type.text+" "+$ID.text+"()"+exprList.size());
        Function f = new Function(exprList); 
        this.fList.put($ID.text, f);     
        }
    ;

formalParameter returns [String type, String id]
    :   ^(ARG type ID) { System.out.print("hoi"); $type = $type.text; $id = $ID.text; }
    ;
// END:decl

// START:stat
block
    :   ^(SLIST variable* stat*)
    ;

stat: forStat
    | expr
    | block
    | assignStat
    | keywords
    ;
    
keywords: 'toon' expr   { System.out.print($expr.value); }
        ;

forStat
    :   ^('for' assignStat expr assignStat block)
    ;

assignStat
    :   ^('=' ID expr)
    ;
// END:stat

// START:expr
expr returns [Type value]
    :   ^('==' expr expr)
    |   ^('!=' expr expr)
    |   ^('+' e=expr e2=expr)  { System.out.print($e.value.sum_operator($e2.value).toType()); }
    |   ^('*' expr expr)
    |   ID
    |   ^(FCALL ID expr*) { if (this.fList.containsKey($ID.text)) {
                            System.out.print("Found it!");
                            } else {
                            System.out.print("Not found!");
                            }  }
    |   INT              { $value = CollType.newType(Integer.parseInt($INT.text)); }
    ;
// END:expr
