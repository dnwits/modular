/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * Programa que demana a l’usuari dos números reals i mostra el seu producte. Cal implementar
 * el mètode double producte(double x, double y), el qual retorna el producte dels arguments
 * passats com a paràmetres
 * @author ves8167
 */
public class ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entroduzca valor A: ");
        double valor1 = entrada.nextDouble();
        System.out.println("Entroduzca valor B: ");
        double valor2 = entrada.nextDouble();
        double producto = 
                producte(valor1, valor2);
        System.out.println("El resultado es: "+ producto);
    }
    public static double producte (double x, double y){
    double prod = x * y;
    return prod;
    }
}
