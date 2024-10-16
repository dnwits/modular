/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * Programa que demana a l’usuari una edat i indica si és major d’edat (edat major o igual a 18anys)
 * Ha d’implementar un mètode amb el prototip boolean esMajorEdat(int edat).
 * @author ves8167
 */
public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introuzca su edad: ");
        int edad = entrada.nextInt();
            //if ()
    }
    public static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }
}
