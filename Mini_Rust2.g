grammar Mini_Rust2;

options {
k = 1;
output=AST;
ASTLabelType=CommonTree;
}

tokens{
    FICHIER;
    ARGUMENT;
    ARGUMENTS;
    DECL_STRUCT;
    APPEL_FCT;
    TYPE;
    BLOC;
    CST_OU_AFF;
    VAR;
    IF;
    POINTEUR_VAL;
    POINTEUR;
    WHILE;
    CONDITION;
    FOR;
    LEN;
    VEC;
    PRINT;
    ELSE;
    RETURN;
    ATTRIBUT;
    DECL_VAR;
    DECL_VAR_MUT;
    DECL_FCT;
    DECL_VEC;
    VAL_ATTRIBUT;
    ACCES_VEC;
    ACCES_ATTRIBUT;
    PARAM_FCT;
    STRUCT;
}

@header {
import java.util.HashMap;
}



@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog :  comm? fichier EOF -> ^(FICHIER fichier)
     ;

fichier : decl*
        ;

decl : decl_struct
     | decl_fun
     ;

decl_struct : 'struct' comm? IDF comm? '{' comm? (attribut (',' comm? attribut)* )? '}' comm? -> ^(DECL_STRUCT IDF ^(BLOC (attribut attribut* )?))
            ;

attribut : IDF comm? ':' comm? type -> ^(ATTRIBUT type IDF)
         ;

decl_fun : 'fn' comm? IDF comm? '(' comm? (argument (',' comm? argument)*)? ')' comm? ('->' comm? type)? bloc -> ^(DECL_FCT IDF ^(ARGUMENTS argument*) ^(TYPE type?) bloc)
         ;

type : 'Vec' comm? '<' comm? type '>' comm? -> ^('Vec' type)
     | '&' comm? type -> ^(POINTEUR type)
     | 'i32' comm? -> 'i32'
     | 'bool' comm? -> 'bool'
     | IDF comm? -> IDF
     ;

argument : IDF ':' comm? type -> ^(DECL_VAR IDF type)
         ;

bloc : '{' comm? sous_bloc? '}' comm? -> ^(BLOC sous_bloc?)
     ;

sous_bloc : instruction_avec_point (';'+ comm? sous_bloc?)? -> instruction_avec_point sous_bloc?
          | instruction_sans_point ';'* sous_bloc? -> instruction_sans_point sous_bloc?
          ;

instruction_avec_point : 'let' let2 -> let2
                       | 'return' comm? expr?  -> ^(RETURN expr?)
                       | 'print' comm? '!' comm? '(' comm? expr ')' comm? -> ^(PRINT expr)
                       | operations_prio4 ('=' ^ (operations_prio4 | bloc))?
                       ;

instruction_sans_point : 'while' comm? operations_prio4b bloc  -> ^(WHILE ^(CONDITION operations_prio4b) bloc)
                       | if_expr
                       ;

let2 : 'mut' comm? accesseur ('=' comm? expr)? -> ^(DECL_VAR_MUT accesseur expr?)
     | accesseur ('=' comm? expr)? -> ^(CST_OU_AFF accesseur expr?)
     ; 

if_expr : 'if' comm? operations_prio4b bloc else2? -> ^(IF ^(CONDITION operations_prio4b) bloc else2?)
        ;

else2 : 'else' comm? else3 -> ^(ELSE else3)
      ;

else3 : bloc
      | if_expr
      ;

expr : bloc
     | operations_prio4
     ;

operations_prio4 : operations_prio3 (prio4 ^ operations_prio4)?
                 ;

operations_prio3 : operations_prio2 (prio3 ^ operations_prio3)?
                 ;

operations_prio2 : operations_prio1 (prio2 ^ operations_prio2)?
                 ;

operations_prio1 : (unaire ^)? operations_unaires (prio1 ^ operations_prio1)?
                 ;

operations_unaires : '(' operations_prio4 ')' -> ^(operations_prio4)
                   | variable
                   ;

variable : variable2
         | unaire_var
         ;

unaire_var : unaire2 unaire_var -> ^(unaire2 unaire_var)
           | variable3
           ;

variable3
@init {int choix = 0;} : IDF (struct | (fonction {choix=1;}) | (acces_variable {choix=2;}) | {choix=3;}) -> {choix==1}? ^(APPEL_FCT IDF fonction?)
                                                                                                         -> {choix == 2}? ^(VAR IDF acces_variable)
                                                                                                         -> {choix == 3}? ^(VAR IDF)
                                                                                                         -> ^(STRUCT IDF struct)
	               ;

struct : '{' comm? (valeur_attribut_struct (',' comm? valeur_attribut_struct)* )? '}' -> (valeur_attribut_struct (valeur_attribut_struct)*)?
       ;

fonction : '(' comm? (expr ( ',' comm? expr)*)? ')' comm? -> (^(PARAM_FCT expr))*
	 ;

acces_variable : '[' comm? expr ']' comm? acces_variable? -> ^(ACCES_VEC expr acces_variable?)
               | '.' attribut_vecteur -> attribut_vecteur
               ;

variable2 : 'true' comm? -> 'true'
          | 'false' comm? -> 'false'
          | CST_ENT comm? -> CST_ENT
          | 'Vec' comm? '!' comm? '[' comm? ( operations_prio4 (',' comm? operations_prio4)*)? ']' comm? -> ^(DECL_VEC (operations_prio4 (operations_prio4)*)?)
          ;

accesseur : IDF acces_accesseur?
          | '*' accesseur -> ^(POINTEUR_VAL accesseur)
          ;

valeur_attribut_struct : IDF ':' operations_prio4 -> ^(VAL_ATTRIBUT IDF operations_prio4)
                       ;

//Debut copie pour opération sans création de variable struct (sert dans if et while)
operations_prio4b : operations_prio3b (prio4 ^ operations_prio4b)?
                 ;

operations_prio3b : operations_prio2b (prio3 ^ operations_prio3b)?
                 ;

operations_prio2b : operations_prio1b (prio2 ^ operations_prio2b)?
                 ;

operations_prio1b : (unaire ^)? operations_unairesb (prio1 ^ operations_prio1b)?
                 ;

operations_unairesb : '(' operations_prio4b ')' -> ^(operations_prio4b)
                   | variableb
                   ;

variableb : unaire_varb
          | variable2
          ;

unaire_varb : unaire2 unaire_varb -> ^(unaire2 unaire_varb)
            | variable3b
            ;

variable3b
@init {int choix = 0;} : IDF (acces_variable | (fonction {choix=1;}) | {choix=2;}) -> {choix==1}? ^(APPEL_FCT IDF fonction)
                                                                                   -> {choix == 2}? ^(VAR IDF)
                                                                                   -> ^(VAR IDF acces_variable)
	           ;
//Fin copie

attribut_vecteur : 'len' comm? '(' comm? ')' comm? -> 'len'
                 | IDF acces_variable? -> ^(ACCES_ATTRIBUT IDF acces_variable?)
                 ;

acces_accesseur : '[' comm? expr ']' comm? acces_accesseur? -> ^(ACCES_VEC expr acces_accesseur?)
                | '.' IDF acces_accesseur? -> ^(ACCES_ATTRIBUT IDF acces_accesseur?)
                ;

unaire : '!' comm? -> '!'
       | '-' comm? -> '-'
       ;

unaire2 : '*' comm? -> POINTEUR_VAL
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

comm : '/*' .* '*/'
     ;

IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
CST_ENT : ('0'..'9')+('.'('0'..'9')+)?;
WS  :   (' '|'\n'|'\t'|'\r'|'\s'|'\$'| '//' .* '\n')+ {$channel=HIDDEN;} ;