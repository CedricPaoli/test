import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    private static File fichier;
    private static FileWriter flot;
    private static BufferedWriter flotFiltre;
    public static boolean isErreur = false;
    private static int nbStrings = 0;
    private static int nbIf = 0;

    public static void main(String[] args) throws Exception
    {
    	//Récupération des fichiers pour les contrôles
        ANTLRFileStream input = new ANTLRFileStream("exemples/tests_assembleur/if.rs");
        
        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);
        
        Mini_Rust2Parser.prog_return r = parser.prog();
        CommonTree ast = (CommonTree)r.getTree();

        //Création de la table des symboles
        creerTableSymboles(ast);
        //affichage de la TDS
        for (int i=0; i<TDS.tablesDesSymboles.size(); i++) TDS.tablesDesSymboles.get(i).displayTDS();

        //Contrôle sémantique de l'existence d'un main
        boolean isMain = false;
        TDS mainTDS = TDS.tablesDesSymboles.get(0);
        for (int i=0; i<mainTDS.size(); i++){
	        if(mainTDS.getNom(i).equals("main")){
	        	isMain = true;
	        }
        }
        if(!isMain){
	        System.out.println("Erreur, la fonction 'main' n'existe pas !\n");
	        isErreur=true;
        }

        if (!isErreur) {
            initialiserFichier("resultat.src");

            //On écrit le début
            ecrireInstruction("SP EQU R15");
            ecrireInstruction("WR EQU R14");
            ecrireInstruction("BP EQU R13");
            ecrireInstruction("EXIT_EXC EQU 64");
            ecrireInstruction("READ_EXC EQU 65");
            ecrireInstruction("WRITE_EXC EQU 66");
            ecrireInstruction("STACK_ADRS EQU 0x1000");
            ecrireInstruction("LOAD_ADRS EQU 0xF000");
            ecrireInstruction("NO_FIND EQU -1");
            ecrireInstruction("NIL EQU 0");
            ecrireInstruction("");
            ecrireInstruction("ORG LOAD_ADRS");
            ecrireInstruction("START LOAD_ADRS");
            ecrireInstruction("");
            ecrireInstruction("JSR @MAIN");
            ecrireInstruction("LDQ EXIT_EXC, WR");
            ecrireInstruction("TRP WR");
            ecrireCode(ast, 0);


            //Fonction d'affichage, i32
            ecrireInstruction("\nPRINT", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("LDW BP, SP");
	
            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 24, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
	
            ecrireInstruction("LDW R5, #NIL");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("LDW R5, #0");
            ecrireInstruction("LDW R6, #10");
	
            ecrireInstruction("PRINT_DEBUT", "STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @DIV32");
	
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("LDW R7, R2");
            ecrireInstruction("LDW R8, R3");
	
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @MUL32");
	
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SUB32");
	
            ecrireInstruction("ADQ 2, SP");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");

	        ecrireInstruction("ADQ 48, R3");
            ecrireInstruction("STB R3, -(SP)");
            ecrireInstruction("LDW R0, R7");
            ecrireInstruction("LDW R1, R8");
            ecrireInstruction("JNE #PRINT_SUITE-$-2");
	
            ecrireInstruction("LDW R0, R0");
            ecrireInstruction("JEQ #PRINT_FIN-$-2");
	
            ecrireInstruction("PRINT_SUITE", "ADQ -1, SP");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @DIV32");
	
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("LDW R7, R2");
            ecrireInstruction("LDW R8, R3");
	
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @MUL32");
	
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SUB32");
	
            ecrireInstruction("ADQ 2, SP");
            ecrireInstruction("LDW R3, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("ADQ 48, R3");
            ecrireInstruction("STB R3, (SP)");
            ecrireInstruction("LDW R0, R7");
            ecrireInstruction("LDW R1, R8");
            ecrireInstruction("JNE #PRINT_DEBUT-$-2");
	
            ecrireInstruction("LDW R0, R0");
            ecrireInstruction("JNE #PRINT_DEBUT-$-2");

            ecrireInstruction("PRINT_FIN", "LDW R0, SP");
	        ecrireInstruction("STW R0, @WRITE_EXC");
            ecrireInstruction("LDQ WRITE_EXC, WR");
            ecrireInstruction("TRP WR");
	
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R8, (SP)+");
            ecrireInstruction("LDW R7, (SP)+");
            ecrireInstruction("LDW R6, (SP)+");
            ecrireInstruction("LDW R5, (SP)+");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");
            

            //Fonction addition, i32, i32 -> i32
            ecrireInstruction("\nADD32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("LDW BP, SP");
	
            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 30, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
            ecrireInstruction("LDW R3, -(R4)");
            ecrireInstruction("LDW R2, -(R4)");
	
            ecrireInstruction("ADD R0, R2, R5");
            ecrireInstruction("ADD R1, R3, R6");
            ecrireInstruction("JCS #ADD32_RETENU-$-2");
            ecrireInstruction("JMP #ADD32_FIN-$-2");
	
            ecrireInstruction("ADD32_RETENU", "ADQ 1, R5");
	
            ecrireInstruction("ADD32_FIN", "STW R6, -(R4)");
            ecrireInstruction("STW R5, -(R4)");
            
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R7, (SP)+");
            ecrireInstruction("LDW R6, (SP)+");
            ecrireInstruction("LDW R5, (SP)+");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");
	
	
	        //Fonction soustraction, i32, i32 -> i32
            ecrireInstruction("\nSUB32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("LDW BP, SP");
	
            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 16, R4");
            ecrireInstruction("LDW R0, (R4)");
            ecrireInstruction("NOT R0, R0");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("LDW R0, -(R4)");
            ecrireInstruction("NOT R0, R0");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("LDW R0, #1");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("LDW R0, #0");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @ADD32");
	
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("STW R0, (SP)+");
            ecrireInstruction("STW R1, (SP)+");
	
            ecrireInstruction("ADQ 4, R4");
            ecrireInstruction("LDW R0, (R4)+");
            ecrireInstruction("STW R0, (SP)+");
            ecrireInstruction("LDW R0, (R4)");
            ecrireInstruction("STW R0, (SP)");
            ecrireInstruction("ADQ -10, SP");
            ecrireInstruction("JSR @ADD32");
	
            ecrireInstruction("ADQ -10, R4");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("STW R0, (R4)+");
            ecrireInstruction("LDW R0, (SP)");
            ecrireInstruction("STW R0, (R4)");
            ecrireInstruction("ADQ 12, SP");

            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");
	
	
	        //Fonction multiplication, i32, i32 -> i32
            ecrireInstruction("\nMUL32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("STW R9, -(SP)");
            ecrireInstruction("STW R10, -(SP)");
            ecrireInstruction("LDW BP, SP");
	
            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 36, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
            ecrireInstruction("LDW R3, -(R4)");
            ecrireInstruction("LDW R2, -(R4)");
	
            ecrireInstruction("LDW R7, #0");
            ecrireInstruction("LDW R8, #1");
            ecrireInstruction("LDW R5, #0");
            ecrireInstruction("LDW R6, #0");
	
            ecrireInstruction("MUL32_DEBUT", "STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @AND32");
            ecrireInstruction("LDW R9, (SP)+");
            ecrireInstruction("LDW R10, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("LDW R10, R10");
            ecrireInstruction("JNE #MUL32_SUITE-$-2");
            ecrireInstruction("LDW R9, R9");
            ecrireInstruction("JEQ #MUL32_NUL-$-2");
	
            ecrireInstruction("MUL32_SUITE", "STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @ADD32");
            ecrireInstruction("LDW R5, (SP)+");
            ecrireInstruction("LDW R6, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("MUL32_NUL", "STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SHL32");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW R1, (SP)");
            ecrireInstruction("ADQ 6, SP");
	
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SHL32");
            ecrireInstruction("LDW R7, (SP)+");
            ecrireInstruction("LDW R8, (SP)");
            ecrireInstruction("ADQ 6, SP");
	
            ecrireInstruction("LDW R7, R7");
            ecrireInstruction("JNE #MUL32_DEBUT-$-2");
            ecrireInstruction("LDW R8, R8");
            ecrireInstruction("JNE #MUL32_DEBUT-$-2");
	
            ecrireInstruction("STW R6, -(R4)");
            ecrireInstruction("STW R5, -(R4)");
	
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R10, (SP)+");
            ecrireInstruction("LDW R9, (SP)+");
            ecrireInstruction("LDW R8, (SP)+");
            ecrireInstruction("LDW R7, (SP)+");
            ecrireInstruction("LDW R6, (SP)+");
            ecrireInstruction("LDW R5, (SP)+");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");


            //Fonction décalage à droite, i32, i32 -> i32
            ecrireInstruction("\nSHR32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("LDW BP, SP");

            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 20, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
	
            ecrireInstruction("LDW R2, #1");
            ecrireInstruction("LDW R3, R0");
            ecrireInstruction("SRL R1, R1");
            ecrireInstruction("SRA R0, R0");
	
            ecrireInstruction("AND R3, R2, R3");

            ecrireInstruction("JEQ #SHR32_FIN-$-2");
	
            ecrireInstruction("LDW R2, #0x8000");
            ecrireInstruction("ADD R2, R1, R1");

            ecrireInstruction("SHR32_FIN", "STW R1, -(R4)");
            ecrireInstruction("STW R0, -(R4)");
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");


            //Fonctions décalage à gauche, i32 -> i32
            ecrireInstruction("\nSHL32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("LDW BP, SP");

            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 20, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");

            ecrireInstruction("LDW R2, #0x8000");
            ecrireInstruction("LDW R3, R1");
            ecrireInstruction("SHL R1, R1");
            ecrireInstruction("SHL R0, R0");
            ecrireInstruction("AND R3, R2, R3");
            ecrireInstruction("JEQ #SHL32_FIN-$-2");

            ecrireInstruction("LDW R2, #1");
            ecrireInstruction("ADD R2, R0, R0");

            ecrireInstruction("SHL32_FIN", "STW R1, -(R4)");
            ecrireInstruction("STW R0, -(R4)");
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");


            //Fonction division, i32, i32 -> i32
            ecrireInstruction("\nDIV32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("STW R6, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("STW R9, -(SP)");
            ecrireInstruction("STW R10, -(SP)");
            ecrireInstruction("STW R11, -(SP)");
            ecrireInstruction("STW R12, -(SP)");
            ecrireInstruction("LDW BP, SP");
	
            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 40, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
            ecrireInstruction("LDW R3, -(R4)");
            ecrireInstruction("LDW R2, -(R4)");
	
            ecrireInstruction("LDW R5, #0");
            ecrireInstruction("LDW R6, #0");
            ecrireInstruction("LDW R7, R0");
            ecrireInstruction("LDW R8, R1");
	
            ecrireInstruction("DIV32_DEBUT", "STW R6, -(SP)");
            ecrireInstruction("STW R5, -(SP)");
            ecrireInstruction("STW R8, -(SP)");
            ecrireInstruction("STW R7, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @ADD32");
            ecrireInstruction("LDW R9, (SP)+");
            ecrireInstruction("LDW R10, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("STW R10, -(SP)");
            ecrireInstruction("STW R9, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SHR32");
            ecrireInstruction("LDW R9, (SP)+");
            ecrireInstruction("LDW R10, (SP)");
            ecrireInstruction("ADQ 6, SP");
	
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R10, -(SP)");
            ecrireInstruction("STW R9, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @MUL32");
            ecrireInstruction("LDW R11, (SP)+");
            ecrireInstruction("LDW R12, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("STW R12, -(SP)");
            ecrireInstruction("STW R11, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("ADQ -4, SP");
            ecrireInstruction("JSR @SUB32");
            ecrireInstruction("LDW R11, (SP)+");
            ecrireInstruction("LDW R12, (SP)");
            ecrireInstruction("ADQ 10, SP");
	
            ecrireInstruction("LDW R11, R11");
            ecrireInstruction("JNE #DIV32_SUITE1-$-2");
            ecrireInstruction("LDW R12, R12");
            ecrireInstruction("JEQ #DIV32_FIN-$-2");
	
            ecrireInstruction("DIV32_SUITE1", "CMP R7, R5");
            ecrireInstruction("JNE #DIV32_SUITE2-$-2");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("LDW R0, #1");
            ecrireInstruction("ADD R0, R6, R0");
            ecrireInstruction("ADQ 2, SP");
            ecrireInstruction("CMP R8, R0");
            ecrireInstruction("JEQ #DIV32_FIN-$-2");
	
            ecrireInstruction("ADQ -2, SP");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("CMP R8, R6");
	
            ecrireInstruction("DIV32_SUITE2", "LDW R11, R11");
            ecrireInstruction("JGE #DIV32_INF-$-2");
	
            ecrireInstruction("LDW R5, R9");
            ecrireInstruction("LDW R6, R10");
            ecrireInstruction("JMP #DIV32_DEBUT-$-2");

	
            ecrireInstruction("DIV32_INF", "LDW R7, R9");
            ecrireInstruction("LDW R8, R10");
            ecrireInstruction("JMP #DIV32_DEBUT-$-2");

	
            ecrireInstruction("DIV32_FIN", "STW R10, -(R4)");
            ecrireInstruction("STW R9, -(R4)");
            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R12, (SP)+");
            ecrireInstruction("LDW R11, (SP)+");
            ecrireInstruction("LDW R10, (SP)+");
            ecrireInstruction("LDW R9, (SP)+");
            ecrireInstruction("LDW R8, (SP)+");
            ecrireInstruction("LDW R7, (SP)+");
            ecrireInstruction("LDW R6, (SP)+");
            ecrireInstruction("LDW R5, (SP)+");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");


            //Fonction AND, i32, i32 -> i32
            ecrireInstruction("\nAND32", "STW BP, -(SP)");
            ecrireInstruction("STW R0, -(SP)");
            ecrireInstruction("STW R1, -(SP)");
            ecrireInstruction("STW R2, -(SP)");
            ecrireInstruction("STW R3, -(SP)");
            ecrireInstruction("STW R4, -(SP)");
            ecrireInstruction("LDW BP, SP");

            ecrireInstruction("LDW R4, BP");
            ecrireInstruction("ADQ 24, R4");
            ecrireInstruction("LDW R1, (R4)");
            ecrireInstruction("LDW R0, -(R4)");
            ecrireInstruction("LDW R3, -(R4)");
            ecrireInstruction("LDW R2, -(R4)");

            ecrireInstruction("AND R0, R2, R0");
            ecrireInstruction("AND R1, R3, R1");

            ecrireInstruction("STW R1, -(R4)");
            ecrireInstruction("STW R0, -(R4)");

            ecrireInstruction("LDW SP, BP");
            ecrireInstruction("LDW R4, (SP)+");
            ecrireInstruction("LDW R3, (SP)+");
            ecrireInstruction("LDW R2, (SP)+");
            ecrireInstruction("LDW R1, (SP)+");
            ecrireInstruction("LDW R0, (SP)+");
            ecrireInstruction("LDW BP, (SP)+");
            ecrireInstruction("RTS");
            
            System.out.println("Code écrit avec succès !");
            fermerFichier();
        }
    }
    
    /**
     * Contient l'intégralité des TDS
     * @param ast AST à partir duquel les TDS sont construite
     * @return l'ensemble des TDS sous la forme d'une ArrayList<TDS>
     */
    static void creerTableSymboles(CommonTree ast)
    {
        // on pose la 1er TDS
        TDS.tablesDesSymboles.add(new TDS(0, -1));
        // On initialise les type valides particuliers
        //On initialise les tructures déclarées
        ArrayList<Structure> structuresDeclarees = new ArrayList<>();
        // On crée récursivement les TDS
        iCreerTableSymboles(structuresDeclarees, ast, 0, 0);
        for (Structure n: structuresDeclarees){
            System.out.println("STRUCTURES !!");
            n.displayStructure();
        }
    }
    
    /**
     * Fonction permettant de créer récursivement l'ensemble des TDS associée à un AST
     * @param ast AST à partis duquel l'on construit les TDS
     * @param num_block numéro du block courant
     * @param father_region numéro de région englobante
     */
    static void iCreerTableSymboles(ArrayList<Structure> structures, CommonTree ast, int num_block, int father_region)
    {
        Type type;
        Type type2;
        String nom_var;
        ArrayList<TDS> tablesDesSymboles = TDS.tablesDesSymboles;
        TDS tableDesSymboles = tablesDesSymboles.get(num_block);
        
        switch (ast.getToken().getType()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                String nom = ast.getChild(0).toString();
                if (ast.getChild(2).getChildCount() > 0) type = new Type((CommonTree) ast.getChild(2).getChild(0), structures);
                else type = new Type();
                
                //Contrôles sémantiques
                if (tdsOuVariableIn(nom, tablesDesSymboles, num_block) != null){ //Verification du nom
                    System.out.println("Erreur: Le nom '" + nom + "' est déjà attribué ligne : " + ast.getLine());
                    isErreur=true;}
                else if (!type.gIsValide()){
                    System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : "+ast.getLine()); //Verification du type
                    isErreur=true;}
                else
                {
                    ArrayList<Type> arguments = new ArrayList<Type>();
                    
                    for (int i=0; i<ast.getChild(1).getChildCount(); i++)
                    {
                        arguments.add(new Type((CommonTree)(ast.getChild(1).getChild(i).getChild(1)), structures));
                    }
                    tableDesSymboles.ajouter(nom, type, arguments, 0);
                }
                
                father_region = num_block;
                num_block = tablesDesSymboles.size();
                
                tablesDesSymboles.add(new TDS(num_block, father_region));
                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);
                
                ast = (CommonTree)ast.getChild(3);
                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);
                
                break;
            case Mini_Rust2Lexer.DECL_VAR: //Declaration de variable dans les parametres d'une fonction
                nom_var = ast.getChild(0).toString();
                
                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null){
                    System.out.println("Erreur: Le nom '" + nom_var + "' est déjà attribué ligne : " + ast.getLine());
                    isErreur=true;}
                else {
                    type = new Type((CommonTree) ast.getChild(1),structures);
                    
                    if (!type.gIsValide()){
                        System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : "+ast.getLine()); //Verification du type
                        isErreur=true;}
                    else tableDesSymboles.ajouter(nom_var, type, 0, true);
                }
                break;
            case Mini_Rust2Lexer.DECL_VAR_MUT:
                nom_var = ast.getChild(0).toString();
                
                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null){
                    System.out.println("Erreur: Le nom '" + nom_var + "' est déjà attribué ligne : " + ast.getLine());
                    isErreur=true;}
                else {
                    type = new Type((CommonTree) ast.getChild(1), structures, num_block);
                    
                    if (!type.gIsValide()){
                        System.out.println("Erreur: Le type '" + type + "' n'existe pas ligne " + ast.getLine()); //Verification du type
                        isErreur=true;}
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1), true);
                }
                break;
            case Mini_Rust2Lexer.CST_OU_AFF:
                nom_var = ast.getChild(0).toString();
                
                TDS tds = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);
                
                if (tds != null) {
                    type = tds.getType(tds.getLigne(nom_var));
                    type2 = new Type((CommonTree) ast.getChild(ast.getChildCount()-1), structures, num_block);
                    
                    if (type.isEgal(new Type())) //aff
                    {
                        tds.setType(nom_var, type2);
                    }
                    else {
                        if (!type.isEgal(type2)){
                            System.out.println("Les types " + type + " et " + type2 + " ne correspondent pas, ligne : " + ast.getLine());
                            isErreur=true;}
                    }
                } else {
                    if (ast.getChildCount() > 1 && ast.getChild(ast.getChildCount()-1).getType() != Mini_Rust2Lexer.ACCES_VEC &&
                        ast.getChild(ast.getChildCount()-1).getType() != Mini_Rust2Lexer.ACCES_ATTRIBUT)
                        type = new Type((CommonTree) ast.getChild(ast.getChildCount()-1), structures, num_block);
                    else type = new Type();
                    
                    if (!type.gIsValide()){
                        System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : " + ast.getLine()); //Verification du type
                        isErreur=true;}
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(ast.getChildCount()-1), false);
                }
                break;
            case Mini_Rust2Lexer.WHILE:
                type = new Type((CommonTree) ast.getChild(0).getChild(0), structures, num_block);
                //Vérification de la condition => boolean ou nombre
                if(!type.isCondition()) {
                    System.out.println("La condition n'est pas valide, ligne : " + ast.getLine());
                    isErreur=true;
                }
                
                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);
                break;
            case Mini_Rust2Lexer.IF:
                type = new Type((CommonTree) ast.getChild(0).getChild(0), structures, num_block);
                //Vérification de la condition => boolean ou nombre
                if(!type.isCondition()) {
                    System.out.println("La condition n'est pas valide, ligne : " + ast.getLine());
                    isErreur=true;
                }
                
                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);
                
                if (ast.getChildCount() == 3) iCreerTableSymboles(structures, (CommonTree) ast.getChild(2), num_block, father_region);
                break;
            case Mini_Rust2Lexer.LEN:
                nom_var = ast.getChild(0).toString();
                TDS tedeess2 = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);
                if(tedeess2 != null) {
                    if(tedeess2.getType(tedeess2.getLigne(nom_var)).getToken() != Mini_Rust2Lexer.VEC) {
                        System.out.println("La variable n'est pas un vecteur");
                        isErreur=true;
                    }
                }else {
                    System.out.println("Variable non définie");
                    isErreur=true;
                }
                break;
            case Mini_Rust2Lexer.BLOC:
                father_region = num_block;
                num_block = tablesDesSymboles.size();
                tablesDesSymboles.add(new TDS(num_block, father_region));
                
                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);
                
                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                String nom_fn = ast.getChild(0).toString();
                //contrôle sem : vérifier que la fonction existe
                boolean exist = false;
                int current = num_block;
                
                TDS fn_tds = tdsOuVariableIn(nom_fn, tablesDesSymboles, num_block);
                
                if (fn_tds == null) {
                    System.out.println("Erreur ligne " + ast.getLine() + " : La fonction '" + nom_fn + "' n'est pas définie");
                    isErreur=true;
                }
                else
                {
                    //TDS fn_tds = tablesDesSymboles.get(current);
                    if (ast.getChildCount()-1 != fn_tds.getArgOf(nom_fn).size()){
                        System.out.println("Erreur ligne " + ast.getLine()+" : Le nombre de paramètres est erroné");
                        isErreur=true;
                    }

                    else {
                        for (int i = 1; i < ast.getChildCount(); i++) {
                            Type tested_type = new Type((CommonTree) ast.getChild(i).getChild(0), structures, num_block);
                            
                            if (!tested_type.isEgal(fn_tds.getArgOf(nom_fn).get(i-1))) {
                                System.out.println("Erreur ligne " + ast.getLine() + " : L'argument de la fonction '" + nom_fn + "' doit être de type " + fn_tds.getArgOf(nom_fn).get(i-1)+" alors qu'il est de type "+tested_type);
                                isErreur=true;
                            }
                        }
                    }
                }
                break;
            case Mini_Rust2Lexer.DECL_STRUCT:
                String nom_struct = ast.getChild(0).toString();
                
                ArrayList<String> champs = new ArrayList<>();
                ArrayList<Type> types = new ArrayList<>();
                
                Type nouveau_type = new Type((CommonTree)ast,structures);
                for(int i=0; i<ast.getChild(1).getChildCount();i++){
                    types.add(new Type((CommonTree)ast.getChild(1).getChild(i).getChild(0),structures));
                    champs.add(ast.getChild(1).getChild(i).getChild(1).toString());
                }
                // ajout de la nouvelle structure aux types valides et aux structures déclarées
                structures.add(new Structure(nom_struct,champs, types));
                break;
            default:
                for (int i=0; i<ast.getChildCount(); i++) iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);
                
                break;
        }
    }

    static void ecrireCode(CommonTree ast, int num_bloc)
    {
        int nVar;
        String nom;
        int valeur;
        TDS tableDesSymboles;

        switch (ast.getToken().getType()) {
            case Mini_Rust2Lexer.PRINT:
                String chaine;

                if (ast.getChild(0).getType() == Mini_Rust2Lexer.VAR)
                {
                    chaine = ast.getChild(0).getChild(0).toString();
                    tableDesSymboles = tdsOuVariableIn(chaine, TDS.tablesDesSymboles, num_bloc);
                    nVar = tableDesSymboles.getLigne(chaine);

                    //On récupère la variable
                    ecrireInstruction("LDW R1, BP");

                    if (tableDesSymboles.getIsParam(nVar)) ecrireInstruction("ADQ "+(2+tableDesSymboles.getDepl(tableDesSymboles.getLigne(chaine)))+", R1");
                    else ecrireInstruction("ADQ -"+tableDesSymboles.getDepl(tableDesSymboles.getLigne(chaine))+", R1");

                    ecrireInstruction("LDW R1, (R1)");
                    ecrireInstruction("STW R1, -(SP)");
                    ecrireInstruction("LDW R1, #0");
                    ecrireInstruction("STW R1, -(SP)");
                    ecrireInstruction("JSR @PRINT");
                    ecrireInstruction("ADQ 4, SP");
                }
                else
                {
                    chaine = ast.getChild(0).toString();
                    ecrireInstruction("STRING"+nbStrings+" string \""+chaine+"\"");
                    ecrireInstruction("LDW R0, #STRING"+nbStrings);
                    ecrireInstruction("STW R0, @WRITE_EXC");
                    ecrireInstruction("LDQ WRITE_EXC, WR");
                    ecrireInstruction("TRP WR");
                }

                nbStrings++;
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                nom = ast.getChild(0).toString();
                nVar = TDS.tablesDesSymboles.get(num_bloc).getLigne(nom);

                ecrireInstruction("");

                if (nom.equals("main")) ecrireInstruction("MAIN", "STW BP, -(SP)");
                else ecrireInstruction("F"+num_bloc+"_"+nVar, "STW BP, -(SP)");

                ecrireInstruction("LDW BP, SP");

                ecrireCode((CommonTree) ast.getChild(3), num_bloc);

                ecrireInstruction("LDW SP, BP");
                ecrireInstruction("LDW BP, (SP)+");
                ecrireInstruction("RTS");
                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                nom = ast.getChild(0).toString();
                nVar = TDS.tablesDesSymboles.get(num_bloc).getLigne(nom);

                tableDesSymboles = tdsOuVariableIn(nom, TDS.tablesDesSymboles, num_bloc);
                nVar = tableDesSymboles.getLigne(nom);

                ArrayList<Type> parametres = tableDesSymboles.getArgOf(nom);
                int tailleParam = 0;

                for (int i=0; i<parametres.size(); i++)
                {
                    ecrireCode((CommonTree) ast.getChild(i+1).getChild(0), num_bloc);
                    tailleParam += parametres.get(i).getTaille();
                }

                ecrireInstruction("JSR @F"+tableDesSymboles.getNum_block()+"_"+nVar);
                ecrireInstruction("ADQ "+tailleParam+", SP");
                break;
            case Mini_Rust2Lexer.DECL_VAR_MUT:
                ecrireInstruction("STW R0, (BP)z_disp");
                break;
            case Mini_Rust2Lexer.BLOC:
                num_bloc++;
                for (int i=0; i<ast.getChildCount(); i++) ecrireCode((CommonTree) ast.getChild(i), num_bloc);
                break;
            case Mini_Rust2Lexer.CST_ENT:
                //Big endian
                valeur = Integer.parseInt(ast.toString());
                ecrireInstruction("LDW R0, #"+valeur%(256*256));
                ecrireInstruction("STW R0, -(SP)");
                ecrireInstruction("LDW R0, #"+valeur/(256*256));
                ecrireInstruction("STW R0, -(SP)");
            	break;
            case Mini_Rust2Lexer.DECL_VAR:
            	break;
            case Mini_Rust2Lexer.DECL_VEC:
            	break;
            case Mini_Rust2Lexer.VAR:

                break;
            case Mini_Rust2Lexer.CST_OU_AFF:
            	int nbEnfant = ast.getChildCount();
            	break;
            case Mini_Rust2Lexer.T__71: //cas de +
                ecrireCode((CommonTree) ast.getChild(0), num_bloc);
                ecrireCode((CommonTree) ast.getChild(1), num_bloc);

                ecrireInstruction("ADQ -4, SP");
                ecrireInstruction("JSR @ADD32");
                ecrireInstruction("LDW R0, (SP)+");
                ecrireInstruction("LDW R1, (SP)");
                ecrireInstruction("ADQ 8, SP");
                ecrireInstruction("STW R1, (SP)");
                ecrireInstruction("STW R0, -(SP)");
            	break;
            case Mini_Rust2Lexer.T__69: //cas de -
                ecrireCode((CommonTree) ast.getChild(0), num_bloc);
                ecrireCode((CommonTree) ast.getChild(1), num_bloc);

                ecrireInstruction("ADQ -4, SP");
                ecrireInstruction("JSR @SUB32");
                ecrireInstruction("LDW R0, (SP)+");
                ecrireInstruction("LDW R1, (SP)");
                ecrireInstruction("ADQ 8, SP");
                ecrireInstruction("STW R1, (SP)");
                ecrireInstruction("STW R0, -(SP)");
            	break;
            case Mini_Rust2Lexer.T__67: //cas de *
                ecrireCode((CommonTree) ast.getChild(0), num_bloc);
                ecrireCode((CommonTree) ast.getChild(1), num_bloc);

                ecrireInstruction("ADQ -4, SP");
                ecrireInstruction("JSR @MUL32");
                ecrireInstruction("LDW R0, (SP)+");
                ecrireInstruction("LDW R1, (SP)");
                ecrireInstruction("ADQ 8, SP");
                ecrireInstruction("STW R1, (SP)");
                ecrireInstruction("STW R0, -(SP)");
            	break;
            case Mini_Rust2Lexer.IF:
            	//écrire le résultat
            	ecrireCode((CommonTree) ast.getChild(0), num_bloc);
            	
            	//regarder si la condition est vrai ou pas
            	//Premier registre
            	ecrireInstruction("LDW R0, (SP)+");
            	ecrireInstruction("JEQ #IFFALSE1"+nbIf+"-$-2");
            	
            	//Deuxième registre avec premier registre vrai
            	ecrireInstruction("LDW R1, (SP)");
            	ecrireInstruction("JEQ #IFFALSE"+nbIf+"-$-2");
            	ecrireInstruction("JMP #IFTRUE"+nbIf+"-$-2");
            	
            	//Première instruction fausse on teste la deuxième
            	ecrireInstruction("IFFALSE1"+nbIf, "LDW R0, R0");
            	ecrireInstruction("LDW R1, (SP)");
            	ecrireInstruction("JEQ #IFFALSE"+nbIf+"-$-2");
            	
            	//condition true
            	ecrireInstruction("IFTRUE"+nbIf, "LDW R0, R0");
            	
            	//Cas où les deux registres sont vrais on exécute le bloc
            	ecrireCode((CommonTree) ast.getChild(1), num_bloc);
            	//on saute pour rejoindre la fin de la condition
            	ecrireInstruction("JMP #FINIF"+nbIf+"-$-2");
            	
            	//Cas du else
            	ecrireInstruction("IFFALSE"+nbIf, "LDW R0, R0");
            	//on regarde si on a un else
            	if(ast.getChildCount()==3) {
            		//excution du code du else
            		ecrireCode((CommonTree) ast.getChild(2), num_bloc);
            	}
            	ecrireInstruction("FINIF"+nbIf, "LDW R0, R0");
            	nbIf = nbIf + 1;
            	break;
            default:
                for (int i=0; i<ast.getChildCount(); i++) ecrireCode((CommonTree) ast.getChild(i), num_bloc);
                break;
        }
    }

    static public TDS tdsOuVariableIn(String nom, ArrayList<TDS> tablesDesSymboles, int nTableDesSymboles)
    {
        int i=0;
        boolean res = false;
        
        for (i=0; i<tablesDesSymboles.size(); i++)
        {
            if (tablesDesSymboles.get(i).getNum_block() == nTableDesSymboles)
            {
                if (tablesDesSymboles.get(i).isVariableIn(nom))
                {
                    res = true;
                }
                break;
            }
        }
        
        if (res) return tablesDesSymboles.get(i);
        else if (nTableDesSymboles == 0) return null;
        else return tdsOuVariableIn(nom, tablesDesSymboles, tablesDesSymboles.get(i).getFather_num_block());
    }

    public static void ecrire(String ligne)
    {
        try
        {
            flotFiltre.write(ligne);
        }
        catch (IOException e)
        {
            System.out.println("Erreur: "+e);
        }
    }

    public static void ecrireInstruction(String ligne)
    {
        ecrire("\t"+ligne+"\n");
    }

    public static void ecrireInstruction(String nomLigne, String ligne)
    {
        ecrire(nomLigne+"\t"+ligne+"\n");
    }

    public static void initialiserFichier(String nomFichier)
    {
        try
        {
            //On vérifie si le fichier existe
            fichier = new File(nomFichier);

            flot = new FileWriter(nomFichier);
            flotFiltre = new BufferedWriter(flot);
        }
        catch (IOException e)
        {
            System.out.println("Erreur: "+e);
        }
    }

    public static void fermerFichier()
    {
        try
        {
            flotFiltre.close();
        }
        catch (IOException e)
        {
            System.out.println("Erreur: "+e);
        }
    }
}
