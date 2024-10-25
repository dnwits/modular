/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * Programa que llegeix la base Imposable de l’IRPF d’una persona i imprimeix la
 * quota a pagar segons la següent taula:
 * base imposable ////// % a aplicar
Entre 0 i 10.000 € ////// 5%
entre 10.001 i 15.000 € ////// 8%
entre 15.001 i 30.000 € ////// 12%
entre 30.001 i 60.000 € ////// 20%
més de 60.000 € ////// 25%
 * Si la persona es discapacitada està exempta de l’impost (el programa ha de preguntar si ho és).
 * Les persones de 65 o més anys d’edat tenen una reducció de 250 € (el programa ha de preguntar
 * l’edat). La quota a pagar no pot ser negativa. El programa llegirà les dades de la persona,
 * determinarà si està o no exempta i mostrarà un missatge. Després obtindrà la quota amb
 * la funció calculaQuota() i els paràmetres adients i mostrarà el resultat per pantalla.
 * @author Val
 */
public class ex17 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        //pedir y declarar variables
        System.out.println("Introduzca su base de IRPF en €: ");
        double baseImponible = entrada.nextDouble();
        System.out.println("Introduzca su edad: ");
        int edad = entrada.nextInt();
        System.out.println("¿Es usted discapacitado? (true/false): ");
        boolean esDiscapacitado = entrada.nextBoolean();
        //comprobar si no excempta de impuestos
        if (esDiscapacitado){
            System.out.println("Está exento de pagar el IRPF.");
        } else{
            //calcular la cuota a pagar mediante el metodo
            double cuota = calculaQuota(baseImponible);
            //reduccir 250euros si es >= a 65 años
            if (edad >= 65) {
                cuota -= 250;
            }
            //para que la cuota no sea negativa
            if (cuota < 0) {
                cuota = 0;
            }
            System.out.println("La cuota a pagar es: "+cuota+" €."); //mostrar resultat
        }
    }
    //metodo para calcular la cuota a partir de la base
    public static double calculaQuota(double baseImponible) {
        double cuota;
        if (baseImponible <= 10000) {
            cuota = baseImponible * 0.05;
        } else if (baseImponible <= 15000) {
            cuota = 10000 * 0.05 + (baseImponible - 10000) * 0.08;
        } else if (baseImponible <= 30000) {
            cuota = 10000 * 0.05 + 5000 * 0.08 + (baseImponible - 15000) * 0.12;
        } else if (baseImponible <= 60000) {
            cuota = 10000 * 0.05 + 5000 * 0.08 + 15000 * 0.12 + (baseImponible - 30000) * 0.20;
        } else {
            cuota = 10000 * 0.05 + 5000 * 0.08 + 15000 * 0.12 + 30000 * 0.20 + (baseImponible - 60000) * 0.25;
        }
        return cuota; //devolver resultado
    }
}
