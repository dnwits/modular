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
        int puntsPersona = 0;
        int puntsMaquina = 0;
        int tirades;
        int guanyador=0;
        //boolean continuar_joc=true;
        do {            
            int jugada_persona = jugadaPersona();
            imp_jugada(jugada_persona);
            int jugada_maquina = jugadaMaquina();
            imp_jugada(jugada_maquina);
            int quiGuanyaTirada = guanyadorTirada(jugada_persona, jugada_maquina);
            
            switch (quiGuanyaTirada) {
                case 1 -> puntsPersona=+1;
                case 2 -> puntsMaquina=+1;
                default -> {
                    puntsMaquina = puntsMaquina+0;
                    puntsPersona = puntsPersona+0;
                }
            }
            marcador(puntsPersona, puntsMaquina);
            tirades=+1;
            //continuar_joc=true;
            if (puntsPersona==3){
              guanyador=+1;
            } else if (puntsMaquina==3){
                guanyador=+2;
            } else if (tirades==6){
                guanyador= guanyador+0;
            }
            imp_guanyador(guanyador);
            //if (puntsMaquina> puntsPersona && puntsMaquina==3){
                //System.out.println("El guanyador és el jugador-2!!");
                //continuar_joc= false;
            //} else if (puntsPersona> puntsMaquina && puntsPersona==3){
                //System.out.println("El guanyador és el jugador-1!!");
                //continuar_joc= false;
            //} else if (tirades==6){
                //System.out.println("Hi ha hagut un empat :3");
                //continuar_joc= false;
            //}
            //marcador(puntsPersona, puntsPersona);
            //System.out.println("Felicitats ^^");
        } while (puntsMaquina!=3 || puntsPersona!=3 || tirades==6);
        //puntsMaquina==3 || puntsPersona==3 || tirades==6
        
    }
    public static int jugadaPersona(){
        //demana a l'usuari escollir entre pedra-paper-tisora (0,1,2) i retorna l'elecció.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccioni Pedra (0), Paper (1) o Tisora (2): ");
        int selec_jugador = entrada.nextInt();
        return selec_jugador;
    }
    public static int jugadaMaquina(){
        //genera un número aleatori entre 0 i 2 (0 pedra, 1 paper, 2 tisora).
        Random aleatori = new Random();
        int selec_maquina =  aleatori.nextInt(0, 2);
        return selec_maquina;
    }
    public static void imp_jugada(int player){
        //imprimeix per pantalla Pedra, paper o tisora en funció del paràmetre d'entrada.
        switch (player) {
            case 0 -> System.out.print("Pedra");
            case 1 -> System.out.print("Paper");
            case 2 -> System.out.print("Tisora");
            default -> System.out.print("Error...");
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
        if (tiradaPlayer1==0 && tiradaPlayer2==1){
            return 2;
        } else if (tiradaPlayer1==0 && tiradaPlayer2==2){
            return 1;
        } else if (tiradaPlayer1==1 && tiradaPlayer2==0) {
            return 1;
        } else if (tiradaPlayer1==1 && tiradaPlayer1==2){
            return 2;    
        } else if(tiradaPlayer1==2 && tiradaPlayer2==0){
            return 2;
        } else if (tiradaPlayer1==2 && tiradaPlayer2==1){
            return 1;
        } else{
            return 0;
        }
    }
    public static void imp_guanyador(int guanyador){
        //imprimeix la frase indicant quin jugador ha guanyat.
        switch (guanyador) {
            case 1 -> System.out.println("Ha guanyat el jugador 1!!");
            case 2 -> System.out.println("Ha guanyat el jugador 2!!");
            default -> System.out.println("Hi ha hagut un empat :3");
        }
    }
    public static void marcador(int puntosPlayer1, int puntosPlayer2){
        System.out.println("El jugador-1 té "+puntosPlayer1+" i el jugador-2 en té "+puntosPlayer2);
    }
}
