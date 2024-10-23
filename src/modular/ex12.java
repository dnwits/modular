/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari un preu sense i amb descompte i informa del percentatge
 * de descompte que s’hi ha aplicat. Cal crear un mètode que rebi els preus i
 * retorni el percentatge de descompte.
 * @author Val
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declara variables
        System.out.println("Introduzca el precio del artículo sin el descuento: ");
        double preu_sense = entrada.nextDouble();
        System.out.println("Introduzca el precio del artículo con el descuento: ");
        double preu_desc = entrada.nextDouble();
        //llamara al metodo con las variables del main
        System.out.println("El porcentaje de descuento es del "+descompte(preu_sense, preu_desc)+"%");
    }
    public static double descompte (double preu_ini, double preu_fin){ //metodo que devuelve un porcentaje
        preu_fin = preu_ini - preu_fin; //importante poner en orden
        preu_fin = (preu_fin*100)/preu_ini;
        return preu_fin;
    }
}
