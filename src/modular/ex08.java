/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * prog  que demana dos nombres enters m i n i mostra:
 * a) el sumatori de nombres entre m i n, ambdós inclosos.
 *      Implementar int sumatori(int m, int n)
 * b) el productori de nombres entre m i n, ambdós inclosos.
 *      Implementar int productori(int m, int n)
 * @author Val
 */
public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variables
        System.out.println("Introduzca el valor A:");
        int a = entrada.nextInt();
        System.out.println("Introduzca el valor B:");
        int b = entrada.nextInt();
        //llamar a los metodos y mostrar mensaje
        System.out.println("La suma de esos valores es "+sumatori(a, b));
        System.out.println("La suma de esos valores es "+productori(a, b));
    }
    public static int sumatori (int m, int n){ //metodo que suma dos valores y devuleve el resultado
        return m+n;
    }
    public static int productori (int m, int n){ //metodo que devuelve el  producto de dos valores
        return m*n;
    }
}
