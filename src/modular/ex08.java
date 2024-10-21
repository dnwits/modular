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
        System.out.println("Introduzca el valor A:");
        int a = entrada.nextInt();
        System.out.println("Introduzca el valor B:");
        int b = entrada.nextInt();
        int suma = sumatori(a, b);
        System.out.println("La suma de esos valores es "+suma);
        int prod = productori(a, b);
        System.out.println("La suma de esos valores es "+prod);
    }
    public static int sumatori (int m, int n){
        return m+n;
    }
    public static int productori (int m, int n){
        return m*n;
    }
}
