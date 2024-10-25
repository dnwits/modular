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
public class ruleta {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int puntos = 100;
        //String comunicado = "n";
        boolean continua = true;
        int numeroRuleta;
        int numeroApuesta = 0;
        int cantidadApuesta= 0;
        System.out.println("Bienvenido a la ruleta!");
        System.out.println("La apuesta a un número es desde el 1 al 36.");
        System.out.println("Para cualquier número impar es 37 y 38 para los pares.");
        do {            
            System.out.println("Actualmente dispone de "+puntos+" puntos.");
            obtenirQuantitatAposta(cantidadApuesta);
            obtenirTipusAposta();
            numeroRuleta= ruletaTir();
            System.out.println("Ha salido el: "+numeroRuleta);
            calcularPremi(numeroRuleta, numeroApuesta, cantidadApuesta);
            puntos=cantidadApuesta;
            System.out.println("Actualmente le quedan "+puntos+" puntos");
            
            
        } while (puntos!=0 || continua==false);
        
    }
    public static int obtenirQuantitatAposta(int punts){ // Pregunta al jugador els punts que vol apostar. 
        //No s'accepten valors superiors al saldo de punts que té
        System.out.println("Introduzaca su apuesta (puntos): ");
        Scanner entrada = new Scanner(System.in);
        punts = entrada.nextInt();
        if (punts<=punts && punts >=1){
            return punts;
        } else{
            return punts; //mensaje de error
        }
    }
    public static int obtenirTipusAposta(){ //Pregunta al jugador el número per a apostar. Els valors permesos estan entre 1 i 38
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número al que desee apostar(1-38): ");
        int numAposta= entrada.nextInt();       
        return numAposta;
    }
    public static String inputString(String mensaje){ //Mostra un missatge i llegeix la resposta de l'usuari
        Scanner entrada = new Scanner(System.in);
        mensaje = entrada.next();
        return mensaje;
    }
    public static int ruletaTir(){ //Tirada de la ruleta per escollir un número aleatòriament entre 1 i 36. 
        //Imprimeix la paraula 'ruleta' i tants asteriscs com el número que ha sortit. Finalment mostra el número
        Random aleatori = new Random();
        int min = 1;
        int max= 36;
        int rule = aleatori.nextInt(max - min); //UTILIZAR FOR PARA LOS ***
        System.out.println("Ruleta: ");
        for (int i = 1; i <= rule; i++) {
            System.out.print("*");
        }
        return rule;
    }
    public static int calcularPremi (int numRuleta, int numAposta, int quantitatAposta){ //Calcula l'import del premi   
        if (numAposta==numRuleta){
            return quantitatAposta*26;
        } else if (numAposta==37 && numAposta!=numRuleta){
            //numRuleta = numRuleta%2=1;
            quantitatAposta*=2;
        } else if (numAposta==38 && numAposta!=numRuleta){
            //numRuleta = numRuleta%2=0;
            quantitatAposta*=2;
        } else if (numAposta<=0 || numAposta >=39){
            //inputString(mensaje);
            return quantitatAposta;
        }
        return quantitatAposta;
    }
    public static boolean obtenirContinuar(){ // Pregunta al jugador si vol continuar jugant
        System.out.println("Desea continuar? (responda con true o false)");
        boolean continua = false;
        return continua;
    }
}
