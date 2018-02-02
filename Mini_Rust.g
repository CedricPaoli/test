grammar Mini_Rust;

options {
k = 1;
}

@header {
import java.util.HashMap;
}


@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog : fichier+ ;

fichier : decl fichier NEWLINE
        | NEWLINE
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
     | 'i32'
     | 'bool'
     | IDF
     ;

argument : IDF ':' type
         ;

bloc : '{' (A)*'}'
     ;


instruction : ';'
            | expr
            | 'let' ('mut')? IDF '=' expr
            | 'while' expr bloc  
            | 'return' (expr)?
            | if_expr
            ;
  
b : '{' (IDF ':' expr (',' IDF ':' expr)*)? '}'
  | '(' ( ( expr ( ',' expr)*)?)? ex ')'
  ;

if_expr : 'if' expr bloc ('else' (bloc | if_expr))?
        ;

expr : CST_ENT ex
	| 'true' ex
	| 'false' ex
	| IDF b
	| unaire expr ex
	| 'vec' '!' '[' ( expr (','expr)*)? ']'
	| 'print' '!' '(' expr ')'
	| bloc
	| '(' expr ')'
	;

/*Boucle infinie qui cause les erreurs*/
ex : '.' expr2 ex
	| '[' expr ']' ex
	| binaire expr ex
	|
	;

expr2 : IDF
	| 'len' '(' ')'
	;

binaire : prio2
        | prio3
	;

prio0 : '&'
      ;	
      
/*prio1*/
unaire : '!'
      | '-'
      | '*'
      | prio0
      ;	
      
prio2 : '*'
      | '/'
      ;	
      
prio3 : '+'
      | '-'
      ;	
      
prio4 : prio0'&'
      | '|''|'
      | '<' binaire2
      | '>' binaire2
      | '=''='
      | '!''='
      ;

binaire2 : '='
	 |
	 ;


communUB : '-'
	 | '*'
	 ;

BOOL : 'true'|'false';
IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CST_ENT : ('0'..'9')+','('0'..'9')+;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {$channel=HIDDEN;} ;
A   	:	'ç';
Br 	:	'è';
C 	:	'&';
