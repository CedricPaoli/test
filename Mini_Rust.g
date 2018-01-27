grammar Mini_Rust;

@header {
import java.util.HashMap;
}

options {
k = 1
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

fichier : decl fichier 
        |
        ;

decl : decl_struct
     | decl_fun
     ;
          
decl_struct : 'struct' IDF '{' (IDF ':' type (',' IDF ':' type)* )? '}'
            ;

decl_fun : 'fn' IDF '(' (argument (',' argument)*)? ')' ('->' type)? bloc
         ;

type : 'vec' <type> 
     | '&' type
     | I32
     | BOOL
     | IDF
     ;

argument : IDF ':' type
         ;

bloc : '{' (instruction)* (expr)? '}'
     ;

instruction : ';'
            | expr
            | 'let' ('mut')? IDF '=' a
            | 'while' expr bloc
            | 'return' (expr)?
            |if_expr
            ;

a : expr
  | IDF '{' (IDF ':' expr (',' IDF ':' expr)*)? '}'
  ;

if_expr : 'if' expr bloc ('else' (bloc | if_expr))?
        ;

expr : CST_ENT ex
	| 'true' ex
	| 'false' ex
	| IDF ( '(' ( expr ( ',' expr)*)?)? ex
	| unaire expr ex
	| 'vec' '!' '[' (expr(,expr)*)? ']'
	| 'print' '!' '(' expr ')'
	| bloc
	| '(' expr ')'
	;

ex : '.' expr2 ex
	| '[' expr ']' ex
	|
	;

expr2 : IDF
	| 'len' '(' ')'
	;

binaire : '+'
	| '-' 
	| '*' 
	| '/' 
	| '&''&' 
	| '|''|' 
	| '<' binaire2 
	| '>' binaire2
	| '=''=' 
	| '!''='
	;

binaire2 : '='
	 | 
	 ;

unaire : '-'
	| '!'
	| '*'
	| '&'
	;

IDF : '';
I32 : '';
BOOL : '';
CST_ENT : '';



