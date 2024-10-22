/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari un caràcter i un número de línies i imprimeix un
 * triangle amb el número de línies indicat i el caràcter especificat.
 * Cal usar un mètode que rebi aquests valors.
 * @author Val
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un caracter: ");
        char algo = entrada.next().charAt(0);
        System.out.println("Introduzca el número de líneas: ");
        int num = entrada.nextInt();
        pyramid(algo, num);
        
    }
    public static void pyramid (char caracter ,int line){
         for (int i = 1; i <= line; i++) {
            // mostrar la cantidad de caracteres correspondiente a la línea actual
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            //saltos de linea
            System.out.println();
        }
    }
}
