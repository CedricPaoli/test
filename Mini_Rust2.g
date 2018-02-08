grammar Mini_Rust2;

options {
k = 1;
output=AST;
}

@header {
import java.util.HashMap;
}


@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog :  comm? fichier EOF;

fichier : decl*
        ;

decl : decl_struct
     | decl_fun
     ;

decl_struct : 'struct' comm? IDF comm? '{' comm? (IDF comm? ':' comm? type (',' comm? IDF comm? ':' comm? type)* )? '}' comm?
            ;

decl_fun : 'fn' comm? IDF comm? '(' comm? (argument (',' comm? argument)*)? ')' comm? ('->' comm? type)? bloc
         ;

type : 'Vec' comm? '<' comm? type '>' comm?
     | '&' comm? type
     | 'i32' comm?
     | 'bool' comm?
     | IDF comm?
     ;

argument : IDF ':' comm? type
         ;

//instruction* expr?
bloc : '{' comm? sous_bloc '}' comm?
     ;

sous_bloc : instruction_sans_expr sous_bloc | expr (';' comm? sous_bloc)?
	  |
          ;

instruction_sans_expr : ';' comm?
                      | 'let' comm? ('mut' comm?)? IDF comm? '=' comm? b ';' comm?
                      | 'while' comm? expr bloc  
                      | 'return' comm? expr? ';' comm?
                      | if_expr
                      ;

instruction : expr ';' comm?
            | instruction_sans_expr
            ;
  
b : IDF comm? ('{' comm? (IDF comm? ':' comm? expr (',' comm? IDF comm? ':' comm? expr)*)? '}' comm? | operation_suivante )
  | expr_sans_idf 
  ;

operation_suivante : (fonctions_ou_vecteurs)? (prio1 operations_prio1)? (prio2 operations_prio2)? (prio3 operations_prio3)? (prio4 operations_prio4)? (prio5 operations_prio5)?
                   ;

if_expr : 'if' comm? expr bloc ('else' comm? (bloc | if_expr))?
        ;

expr : operations_prio5
     | 'vec' comm? '!' comm? '[' comm? ( expr (',' comm? expr)*)? ']' comm?
     | 'print' comm? '!' comm? '(' comm? expr ')' comm?
     | bloc
     ;

/*Selon la reponse a la question posee dans le drive, il faudra faire la distinction entre les booleens et les entiers*/
operations_prio5 : operations_prio4 (prio5 operations_prio4)?
                 ;

operations_prio4 : operations_prio3 (prio4 operations_prio4)?
                 ;

operations_prio3 : operations_prio2 (prio3 operations_prio3)?
                 ;

operations_prio2 : operations_prio1 (prio2 operations_prio2)?
                 ;

operations_prio1 : unaire? operations_unaires (prio1 operations_prio1)?
                 ;

operations_unaires : '(' operations_prio4 ')'
                   | variables
                   ;

variables : IDF comm? fonctions_ou_vecteurs?
          | 'true' comm?
          | 'false' comm?
          | CST_ENT comm?
          ;

/* On dedouble le code avec une legere modification pour regler un conflit avec b (oui je sais c'est tres sale) */
expr_sans_idf : operations_unairesb operations_prio5b
              | 'vec' comm? '!' comm? '[' comm? ( expr (',' comm? expr)*)? ']' comm?
              | 'print' comm? '!' comm? '(' comm? expr ')' comm?
              | bloc
              ;

operations_prio5b : (prio4 operations_prio4)?
                  ;

operations_prio4b : (prio3 operations_prio3)?
                  ;

operations_prio3b : (prio3 operations_prio3)?
                  ;

operations_prio2b : (prio2 operations_prio2)?
                  ;

operations_prio1b : unaire? operations_unairesb (prio1 operations_prio1)?
                  ;

operations_unairesb : '(' operations_prio4 ')'
                    | variablesb
                    ;

variablesb : 'true' comm? //Tout ce code pour enlever le idf ici
           | 'false' comm?
           | CST_ENT comm?
           ;
/* Fin du dedoublement */
          
fonctions_ou_vecteurs : '(' comm? (expr ( ',' comm? expr)*)? ')' comm?
                      | '[' comm? expr ']' comm?
                      | '.' comm? attribut_vecteur
                      ;

attribut_vecteur : 'len' comm? '(' comm? ')' comm?
                 | variables
                 ;

unaire : '!' comm?
       | '-' comm?
       | '*' comm?
       | '&' comm?
       ;

prio1 : '*' comm?
      | '/' comm?
      ;	
      
prio2 : '+' comm?
      | '-' comm?
      ;	
    
prio3 : '<' '='? comm?
      | '>' '='? comm?
      | '==' comm?
      | '!=' comm?
      ;

prio4 : '&&' comm?
      | '||' comm?
      ;

prio5 : '=' comm?
      ;

//comm : '/*' (('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|' ')  |  ('*'+ ('a'..'z'|'A'..'Z'|'0'..'9'|'_')) )* '*/'
comm : '/*' ( (IDF|CST_ENT|'/')  |  ('*'+ (IDF|CST_ENT)) )* '*/'
     ;

IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CST_ENT : ('0'..'9')+('.'('0'..'9')+)?;
WS  :   (' '|'\t'|'\n')+ {$channel=HIDDEN;} ;
