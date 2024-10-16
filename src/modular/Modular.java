/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class Modular {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //entrada de dades
        System.out.print("Entra la base: ");
        double baseRect = lector.nextDouble();
        System.out.print("Entra l'altura: ");
        double alturaRect = lector.nextDouble();
        //calcular el perímetre
        double perimetreRect = 
                calculaPerimetreRectangle(baseRect, alturaRect);
        //calcular l'àrea
        double areaRect = calculaAreaRectangle(baseRect, alturaRect);
        //mostrar resultats
        System.out.println("El perímetre del rectangle és: "+perimetreRect);
        System.out.println("L'àrea del rectangle és: "+areaRect);
    }
    public static double calculaAreaRectangle(double base, double altura) {
        double area = base * altura;
        return area;   //return base*altura;
    }
     public static double calculaPerimetreRectangle(double base, double altura) {
        double perimetre = 2.0 * (base + altura);
        return perimetre;
    }
}
