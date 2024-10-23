/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari dos números enters i mostra quin és el menor.
 * Cal implementar i usar el mètode int menor(int x, int y), el qual retorna
 * el menor dels dos passats com a paràmetres.
 * @author Val
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variables
        System.out.println("Introduxca un número entero (A): ");
        int a = entrada.nextInt();
        System.out.println("Introduxca un número entero (B): ");
        int b = entrada.nextInt();
        System.out.println("El menor entre A y B es: " + menor(a, b)); //llamar al metodo y mostrar resultado por pantalla
    }
    public static int menor (int x, int y){ //metodo que compara 2 valores y devuelve el mayor
         if (x < y) {
            return x;
        } else {
            return y;
        }
    }
    
}
