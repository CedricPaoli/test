grammar Mini_Rust2;

options {
k = 1;
output=AST;
ASTLabelType=CommonTree;
}

tokens
{
    FICHIER;
    DECL;
    ARGUMENT;
    ARGUMENTS;
    STRUCT;
    FCT;
    TYPE;
    BLOC;
    CST;
    VAR;
    VALUE;
    INSTRUCTION;
    IF;
    EXPR;
    SOMME;
    DIFFERENCE;
    PRODUIT;
    RAPPORT;
    ET;
    OU;
    INF;
    INF_E;
    SUP;
    SUP_E;
    EGAL;
    DIFF;
    NOT;
    POINTEUR_ADDR;
    POINTEUR_VAL;
    NEG;
    WHILE;
    CONDITION;
    FOR;
    LEN;
    VEC;
    PRINT;
    AFFECTATION;
    ELSE;
    OPERATION;
    RETURN;
    PRIO1;
    PRIO2;
    PRIO3;
    PRIO4;
}

@header {
import java.util.HashMap;
}



@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog :  comm? fichier EOF -> ^(FICHIER fichier);

fichier : decl*
        ;

decl : decl_struct
     | decl_fun
     ;

decl_struct : 'struct' comm? IDF comm? '{' comm? (IDF comm? ':' comm? type (',' comm? IDF comm? ':' comm? type)* )? '}' comm? 
            ;

decl_fun : 'fn' comm? IDF comm? '(' comm? (argument (',' comm? argument)*)? ')' comm? ('->' comm? type)? bloc -> ^(FCT IDF ^(ARGUMENTS argument*) type? bloc)
         ;

type : 'Vec' comm? '<' comm? type '>' comm? -> ^(TYPE VEC type)
     | '&' comm? type -> ^(TYPE '&' type)
     | 'i32' comm? -> 'i32'
     | 'bool' comm? -> 'bool'
     | IDF comm? -> IDF
     ;

argument : IDF ':' comm? type -> IDF type
         ;

//instruction* expr?
bloc : '{' comm? sous_bloc '}' comm? -> ^(BLOC sous_bloc)
     ;

sous_bloc : instruction_sans_expr sous_bloc
          | expr (';' comm? sous_bloc)? -> expr sous_bloc?
	  |
          ;

instruction_sans_expr : ';' comm? ->
                      | 'let' let2 -> let2
                      | 'while' comm? expr bloc  -> ^(WHILE ^(CONDITION expr) bloc)
                      | 'return' comm? expr? ';' comm? -> ^(RETURN expr?)
                      | if_expr
                      ;
let2 : 'mut' comm? IDF comm? '=' comm? b ';' comm? -> ^(VAR IDF b )
     | IDF comm? '=' comm? b ';' comm? -> ^(CST IDF b)
     ; 

instruction : expr ';' comm? -> expr
            | instruction_sans_expr
            ;
  
b : IDF comm?  b2 -> ^(VALUE IDF b2)
  | expr_sans_idf -> ^(VALUE expr_sans_idf)
  ;
  
b2 : '{' comm? (IDF comm? ':' comm? expr (',' comm? IDF comm? ':' comm? expr)*)? '}' comm? -> (IDF expr(IDF expr)*)?
   | operations_suivantes
   ;

if_expr : 'if' comm? expr bloc else2? -> ^(IF ^(CONDITION expr) bloc else2?)
        ;

else2 : 'else' comm? else3 -> ^(ELSE else3)
      ;

else3 : bloc
      | if_expr
      ;

expr : IDF expr2
     | expr_sans_idf
     ;

expr_sans_idf : operations_unairesb operations_suivantes
              | 'Vec' comm? '!' comm? '[' comm? ( expr (',' comm? expr)*)? ']' comm? -> ^(VEC (expr(expr)*)?)
              | 'print' comm? '!' comm? '(' comm? expr ')' comm? -> ^(PRINT  expr)
              | bloc
              ;

expr2 : '=' comm? operations_prio4 -> ^(AFFECTATION operations_prio4)
      | operations_suivantes
      ;

operations_prio4 : operations_prio3 (prio4 operations_prio4)? //-> ^(OPERATION operations_prio3 (prio4 operations_prio4)?)
                 ;

operations_prio3 : operations_prio2 (prio3 operations_prio3)? //-> ^(OPERATION operations_prio2 (prio3 operations_prio3)?)
                 ;

operations_prio2 : operations_prio1 (prio2 operations_prio2)? //-> ^(OPERATION operations_prio1 (prio2 operations_prio2)?)
                 ;

operations_prio1 : unaire? operations_unaires (prio1 operations_prio1)? //-> ^(OPERATION unaire? operations_unaires (prio1 operations_prio1)?)
                 ;

operations_unaires : '(' operations_prio4 ')' -> ^(operations_prio4)
                   | variable
                   ;

variable : IDF comm? fonctions_ou_vecteurs? -> ^(VAR IDF (fonctions_ou_vecteurs)?)
         | variable_sans_idf
         ;

variable_sans_idf : 'true' comm? -> 'true'
                  | 'false' comm? -> 'false'
                  | CST_ENT comm? -> CST_ENT
                  ;

operations_suivantes : prio1 operations_prio1
                     | prio2 operations_prio2
                     | prio3 operations_prio3
                     | prio4 operations_prio4
                     | acces_variable operations_suivantes
                     |
                     ;

operations_unairesb : '(' comm? operations_prio4 ')' comm? -> ^(operations_prio4)
                    | variable_sans_idf
                    ;
  
fonctions_ou_vecteurs : '(' comm? (expr ( ',' comm? expr)*)? ')' comm? -> (expr (expr)*)?
                      | '[' comm? expr ']' comm? -> expr
                      | '.' comm? attribut_vecteur -> attribut_vecteur
                      ;

acces_variable : '[' comm? expr ']' comm? acces_variable -> expr acces_variable
               | '.' IDF acces_variable -> IDF acces_variable
               ;

attribut_vecteur : 'len' comm? '(' comm? ')' comm? -> 'len'
                 | variable_sans_idf
                 ;

unaire : '!' comm? -> '!'
       | '-' comm? -> '-'
       | '*' comm? -> '*'
       | '&' comm? -> '&'
       ;

prio1 : '*' comm? -> '*'
      | '/' comm? -> '/'
      ;	
      
prio2 : '+' comm? -> '+'
      | '-' comm? -> '-'
      ;	
    
prio3 : '<' comm? -> '<'
      | '>' comm? -> '>'
      | '>=' comm? -> '>='
      | '<=' comm? -> '<='
      | '==' comm? -> '=='
      | '!=' comm? -> '!='
      ;

prio4 : '&&' comm? -> '&&'
      | '||' comm? -> '||'
      ;

prio5 : '=' comm? -> '='
      ;

//comm : '/*' (('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|' ')  |  ('*'+ ('a'..'z'|'A'..'Z'|'0'..'9'|'_')) )* '*/'
comm : '/*' ( (IDF|CST_ENT|'/')  |  ('*'+ (IDF|CST_ENT)) )* '*/'
     | '//'(IDF|CST_ENT)* '\n'
     ;

IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CST_ENT : ('0'..'9')+('.'('0'..'9')+)?;
WS  :   (' '|'\t'|'\n')+ {$channel=HIDDEN;} ;

