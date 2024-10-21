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
        System.out.println("Introduxca un número entero (A): ");
        int a = entrada.nextInt();
        System.out.println("Introduxca un número entero (B): ");
        int b = entrada.nextInt();
        int menorValor = menor(a, b);
        System.out.println("El menor entre A y B es: " + menorValor);
    }
    public static int menor (int x, int y){
         if (x < y) {
            return x;
        } else {
            return y;
        }
    }
    
}
