/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari una distància mesurada en milles i mostra el seu
 * equivalent en quilòmetres (1 milla = 1,6093 km). Ha d’implementar un mètode
 * amb el prototip double millesAKm(int milles).
 * @author Val
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variable
        System.out.println("Introduzca el número de millas: ");
        int mi = entrada.nextInt();
        System.out.println("Eso son "+millesAKM(mi)+" kilometros"); //llamar metodo y mostrar resultado
    }
    public static double millesAKM(int milles){ //metodo que devuelve milla*equivalente en Km
        return (milles*1.6093);
    }
}
