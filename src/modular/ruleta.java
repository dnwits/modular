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
        //declarar variables
        int puntos = 100;
        boolean continua;
        int numeroRuleta;
        int numeroApuesta;
        int cantidadApuesta;
        int premio;
        System.out.println("¡Bienvenido a la ruleta!");
        System.out.println("La apuesta a un número es desde el 1 al 36.");
        System.out.println("Para cualquier número impar es 37 y 38 para los pares.");
        do {            
            System.out.println("Actualmente dispone de "+puntos+" puntos.");
            cantidadApuesta =  obtenirQuantitatAposta();
            puntos= puntos - cantidadApuesta;
            numeroApuesta = obtenirTipusAposta();
            numeroRuleta= ruletaTir();
            System.out.println("Ha salido el: "+numeroRuleta);
            premio = calcularPremi(numeroRuleta, numeroApuesta, cantidadApuesta);
            //premio+=cantidadApuesta;
            puntos+=premio;
            System.out.println("Actualmente le quedan "+puntos+" puntos");
            continua = obtenirContinuar();
            //if(continua==true){
            //    System.out.println("Yay! Gambling :3");
            //} else{
            //    System.out.println("Nice decision.");
            //}
        } while (puntos!=0 && continua== true);
        System.out.println("Gracias por jugar. Su saldo final es de " + puntos + " puntos.");
    }
    public static int obtenirQuantitatAposta(){ // Pregunta al jugador els punts que vol apostar. 
        //No s'accepten valors superiors al saldo de punts que té
        System.out.println("Introduzaca su apuesta (puntos): ");
        Scanner entrada = new Scanner(System.in);
        int punts = entrada.nextInt();
        if (punts<=punts && punts >=1){
            return punts;
        } else {
            System.out.println("Apuesta inválida...");
            return 0;
        }
    }
    public static int obtenirTipusAposta(){ //Pregunta al jugador el número per a apostar. Els valors permesos estan entre 1 i 38
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número al que desee apostar(1-38): ");
        int numAposta= entrada.nextInt();
        if (numAposta<1 || numAposta>38){
            numAposta=0;
        }
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
        System.out.println();
        return rule;
    }
    public static int calcularPremi (int numRuleta, int numAposta, int quantitatAposta){ //Calcula l'import del premi 
        if (numAposta == numRuleta){ // Apuesta exacta, premio es la cantidad apostada multiplicada por 36        
            System.out.println("¡Número correcto!");
            return quantitatAposta * 36;            
        }else if (numAposta == 37 && numRuleta % 2 != 0){ // Apuesta a impar y el número de la ruleta es impar
            System.out.println("Número impar, es correcto :3");
            return quantitatAposta * 2;
        } else if (numAposta == 38 && numRuleta % 2 == 0){ // Apuesta a par y el número de la ruleta es par        
            System.out.println("Número par, es correcto :3");
            return quantitatAposta * 2;
        //} else if (numAposta < 1 || numAposta > 38){
        //System.out.println("Número de apuesta incorrecto. No se juega en esta tirada..."); // Entrada incorrecta
            //return 0;
        }
        System.out.println("No has acertado... Suerte en la próxima.");
        return 0; // Si no se cumple ninguna condición, el premio es 0
    }
    public static boolean obtenirContinuar(){ // Pregunta al jugador si vol continuar jugant
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Desea continuar jugando? (escriba 'sí' para continuar o 'no' para terminar):");
        String respuesta = entrada.next().toLowerCase();
        return respuesta.equals("si");
    }
}
