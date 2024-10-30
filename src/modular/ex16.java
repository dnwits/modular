/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * per resoldre una equació de segon grau. Els coeficients a, b, c s’introdueixen per teclat.
 * Cal utilitzar una funció per al càlcul del discriminant. El programa principal
 * ha d’imprimir el nombre de solucions i el(s) valor(s), o bé, informar que l’equació no té solució.
 * @author Val
 */
public class ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir valores a, b, c y declararlos
        System.out.println("Introduzca el valor de a: ");
        double a = entrada.nextDouble();
        System.out.println("Introduzca el valor de b: ");
        double b = entrada.nextDouble();
        System.out.println("Introduzca el valor de c: ");
        double c = entrada.nextDouble();
        //utilizar metodo en una variable para después trabajar con ella
        double discriminant = disc(a, b, c);
         if (discriminant > 0){
            //dos soluciones
            double solu1 = (-b + Math.sqrt(discriminant))/(2*a); //realizar equación de segundo grado +
            double solu2 = (-b - Math.sqrt(discriminant))/(2*a); //realizar equación de segundo grado -
            System.out.println("La ecuación tiene dos soluciones reales: ");
            System.out.println("Solución 1: "+solu1);
            System.out.println("Solución 2: "+solu2);
        } else if (discriminant == 0){
            //una solución
            double sol_unq = -b / (2 * a);
            System.out.println("La ecuación tiene una única solución real: " + sol_unq);
        } else {
            //no hay soluciones
            System.out.println("La ecuación no tiene soluciones reales.");
        }       
    }
    public static  double disc(double a, double b, double c){ //funció que calcula el descriminant
        return (b * b) - (4 * a * c); //
    }
}
