grammar Mini_Rust2;

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

bloc : '{' (instruction)*'}' //Penser a mettre instructions* ici pour debuguer les dernieres erreurs
     ;


instruction : ';'
            | expr ';'
            | 'let' ('mut')? IDF '=' b
            | 'while' expr bloc  
            | 'return' (expr)? ';'
            | if_expr
            ;
  
b : IDF ('{' (IDF ':' expr (',' IDF ':' expr)*)? '}' | operation_suivante)
  | expr_sans_idf
  ;

operation_suivante : (fonctions_ou_vecteurs)? (prio1 operations_prio1)? (prio2 operations_prio2)? (prio3 operations_prio3)? (prio4 operations_prio4)?
                   ;

if_expr : 'if' expr bloc ('else' (bloc | if_expr))?
        ;

expr : operations_prio4
     | 'vec' '!' '[' ( expr (','expr)*)? ']'
     | 'print' '!' '(' expr ')'
     | bloc
     ;

/*Selon la reponse a la question posee dans le drive, il faudra faire la distinction entre les booleens et les entiers*/
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

variables : IDF fonctions_ou_vecteurs?
          | 'true'
          | 'false'
          | CST_ENT
          ;

/* On dedouble le code avec une legere modification pour regler un conflit avec b (oui je sais c'est tres sale) */
expr_sans_idf : operations_prio4b
              | 'vec' '!' '[' ( expr (','expr)*)? ']'
              | 'print' '!' '(' expr ')'
              | bloc
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

variablesb : 'true' //Tout ce code pour enlever le idf ici
           | 'false'
           | CST_ENT
           ;
/* Fin du dedoublement */
          
fonctions_ou_vecteurs : '(' (expr ( ',' expr)*)? ')'
                      | '[' expr ']'
                      | '.' attribut_vecteur
                      ;

attribut_vecteur : 'len''('')'
                 | variables
                 ;

unaire : '!'
       | '-'
       | '*'
       | '&'
       ;

prio1 : '*'
      | '/'
      ;	
      
prio2 : '+'
      | '-'
      ;	
    
prio3 : '<' '='?
      | '>' '='?
      | '=='
      | '!='
      ;

prio4 : '&&'
      | '||'
      ;


IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CST_ENT : ('0'..'9')+','('0'..'9')+;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {$channel=HIDDEN;} ;
