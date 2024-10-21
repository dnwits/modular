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
        System.out.println("Introduzca un numero: ");
        int num = entrada.nextInt();
        int signe = obteSigne(num);
        switch (signe) {
            case +1 -> System.out.println("El número es positivo");
            case 0 -> System.out.println("El número es cero");
            case -1 -> System.out.println("El número es negativo");
        }
    }
    public static int obteSigne(int x){
        if (x >= 1){
            return +1;
        } else if (x==0){
            return 0;
        } else {
            return -1;
        }
    }
}
