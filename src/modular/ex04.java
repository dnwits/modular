/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * a que demana a l’usuari un nombre enter i mostra si és positiu, zero o 
 * negatiu. Cal crear el mètode int obteSigne(int x), el qual retorna -1, 0, +1
 * segons el nombre és negatiu, zero o positiu, respectivament.
 * @author Val
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variable
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();
        int signe = obteSigne(num); //llamar al metodo 
        switch (signe) { //según lo que devuelva mostrar mensaje
            case +1 -> System.out.println("El número es positivo");
            case 0 -> System.out.println("El número es cero");
            case -1 -> System.out.println("El número es negativo");
        }
    }
    public static int obteSigne(int x){ //metodo que comprueba si valor es positivo, negativo o cero
        if (x >= 1){
            return +1;
        } else if (x==0){
            return 0;
        } else {
            return -1;
        }
    }
}
