/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari dos números enters i diu si són iguals o, cas que no
 * ho siguin, quin és el valor del més gran. Ha d’implementar un mètode amb el
 * prototip int compara(int x, int y) que retorna -1, 0, +1 segons que x sigui
 * més petit, igual o major que y.
 * @author Val
 */
public class ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variable
        System.out.println("Introduzca un número: ");
        int a = entrada.nextInt();
        System.out.println("Introduzca otro número: ");
        int b = entrada.nextInt();
        switch (compara(a, b)) { //llamar al metodo y mostrar mensaje
            case +1 -> System.out.println(a+" es mayor que "+b);
            case 0 -> System.out.println(a+" y "+b+" son iguales");
            case -1 -> System.out.println(b+" es mayor que "+a);
        }
    }
    public static int compara (int x, int y){ //metodo que compara 2 valores y dice si uno es mayor que el otro o son iguales
        if (x > y){
            return +1;
        } else if (x<y){
            return -1;
        } else {
            return 0;
        }
    }
}
