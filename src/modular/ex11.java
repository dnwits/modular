/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que escriu la taula de multiplicació d’un número introduït per teclat. Cal
 * implementar un mètode que rebi com a paràmetre un enter i imprimeixi la taula
 * de multiplicació de l’enter rebut.
 * @author Val
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para saber su tabla de multiplicació: ");
        int num = entrada.nextInt();
        taula(num);
    }
    public static void taula (int x){ //void porque no se devuleve nada al main, todo se hace en taula
         for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (i * x));
         }
    }
}
