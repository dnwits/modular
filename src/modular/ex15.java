/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana tres nombres enters i informa de si compleixen la desigualtat
 * triangular. Cal implementar un mètode que rebi aquests valors i retorni un booleà.
 * @author Val
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        // pedir y declarara valores
        System.out.println("Introduzca el valor del primer costado: ");
        int a = entrada.nextInt();
        System.out.println("Introduzca el valor del segundo costado: ");
        int b = entrada.nextInt();
        System.out.println("Introduzca el valor del tercer costado: ");
        int c = entrada.nextInt();
        //llamar al metodo y mostrar mensajes en funcion de si es true o false
        if (triangular(a, b, c)){
            System.out.println("Se cumple la desigualdat triangular :3");
        } else {
            System.out.println("No se cumple la desigualdad triangular...");
        }
    }
    public static boolean triangular (int x, int y, int z){ //metodo que realiza la desigualdad triangular
        return x + y > z && x + z > y && y + z > x; //devuelve true
    }
}
