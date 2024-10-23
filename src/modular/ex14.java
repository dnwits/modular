/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que calcula la hipotenusa d’un triangle (utilitzeu la fórmula). (El mètode 
 * principal llegirà els catets i cridarà el mètode hipotenusa() al qual passarà
 * els catets. Aquest mètode retornarà el valor de la hipotenusa, el qual serà
 * mostrat per pantalla pel mètode principal)
 * @author Val
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        // pedir y declarara valores
        System.out.println("Introduzca el valor del primer cateto: ");
        double cateto1 = entrada.nextDouble();       
        System.out.println("Introduzca el valor del segundo cateto: ");
        double cateto2 = entrada.nextDouble();        
        //utilizar metodo    
        System.out.println("La hipotenusa es " + hipotenusa(cateto1, cateto2)); //resultado en pantalla
    }
    //method hipotenusa
    public static double hipotenusa(double cat1, double cat2) {
        return Math.sqrt((cat1 * cat1) + (cat2 * cat2)); //pitagoras utilizando Math.sqrt para la raiz cuadrada
    }
}
