/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class PedraPaperTisora {
    public static void main(String[] args) {
        System.out.println("Benvingut a pedra-paper-tisora!");
        final int nombre_tirades_max = 6;
        int puntsPersona = 0;
        int puntsMaquina = 0;
        int tirades = 0;
        int guanyador;
        int num_tirades = 0; //per a comptar el nombre de jugades
        do {
            //jugada persona
            int jugada_persona = jugadaPersona();
            imp_jugada(jugada_persona);
            //jugada maquina
            int jugada_maquina = jugadaMaquina();
            imp_jugada(jugada_maquina);
            //mostra guanyador
            guanyador = guanyadorTirada(jugada_persona, jugada_maquina);
            
            imp_guanyador(guanyador);
            //incremento la puntuació
            if (guanyador == 1) {
                puntsPersona++;
            }
            if (guanyador == 2) {
                puntsMaquina++;
            }
            //mostro marcador
            marcador(puntsPersona, puntsMaquina);
            num_tirades++;
            
        } while ((puntsPersona < 3 && puntsMaquina < 3) && num_tirades < nombre_tirades_max);
        
    }
    public static int jugadaPersona(){
        //demana a l'usuari escollir entre pedra-paper-tisora (0,1,2) i retorna l'elecció.
        Scanner entrada = new Scanner(System.in);
        int selec_jugador = -1;
        do {System.out.println("Seleccioni Pedra (0), Paper (1) o Tisora (2): ");
        selec_jugador = entrada.nextInt();
        } while (selec_jugador <0 || selec_jugador >2);
        return selec_jugador;
    }
    public static int jugadaMaquina(){
        //genera un número aleatori entre 0 i 2 (0 pedra, 1 paper, 2 tisora).
        Random r1 = new Random();
        return r1.nextInt(3);
    }
    public static void imp_jugada(int player){
        //imprimeix per pantalla Pedra, paper o tisora en funció del paràmetre d'entrada.
        switch (player) {
            case 0 -> System.out.println("Pedra");
            case 1 -> System.out.println("Paper");
            case 2 -> System.out.println("Tisora");
            default -> System.out.println("Error...");
        }
    }
    public static int guanyadorTirada(int tiradaPlayer1, int tiradaPlayer2){
        /** retorna 0 si hi ha empat, 1 si guanya el jugador 1, i 2 si guanya el jugador 2.
         * Pedra, Pedra: empat. 0
         * Pedra 0, Paper 1: guanya paper. 2
         * Pedra 0, Tisora 2: guanya pedra. 1
         * Paper, Paper: empat. 0
         * Paper 1, Tisora 2: guanya tisora. 2
         * Tisora, Tisora: empat. 0
         */
        int guanyador= 0;
        if (tiradaPlayer1 == tiradaPlayer2) {
            guanyador = 0;
        } else if (tiradaPlayer1 == 0 && tiradaPlayer2 == 1) {
            guanyador = 2;
        } else if (tiradaPlayer1 == 1 && tiradaPlayer2 == 2) {
            guanyador = 2;
        } else if (tiradaPlayer1 == 2 && tiradaPlayer2 == 0) {
            guanyador = 2;
        } else {
            guanyador = 1;
        }
        return guanyador;
    }
    public static void imp_guanyador(int guanyador){
        //imprimeix la frase indicant quin jugador ha guanyat.
        switch (guanyador) {
            case 1 -> System.out.println("Ha guanyat el jugador 1!!");
            case 2 -> System.out.println("Ha guanyat el jugador 2!!");
            case 0 -> System.out.println("Hi ha hagut un empat :3");
        }
    }
    public static void marcador(int puntosPlayer1, int puntosPlayer2){
        System.err.println("----MARCADOR----");
        System.out.println("El jugador-1 té "+puntosPlayer1);
        System.out.println("el jugador-2 té "+puntosPlayer2);
        System.out.println("----------------");
    }
}
