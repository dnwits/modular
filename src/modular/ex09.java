/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana tres nombres enters i diu quin és el valor més gran. Implementar
 * un mètode amb el prototip int major(int x, int y) que retorni el valor major de dos.
 * @author Val
 */
public class ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declara las variables
        System.out.println("Introduzca el primer número: ");
        int a = entrada.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int b = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int c = entrada.nextInt();
        //comparar 2 valores y guaradar el resultado 
        int compara = major(a, b);
        //comparar el resultado anterior con el tercer valor
        int compara2 = major(compara, c);
        System.out.println("El número más grande es "+compara2); //mostrar cual de lso 3 números es el mayor
    }
    public static int major(int x, int y){ //metod que compara 2 números y devuelve el mayor
        if(x>=y){
            return x;
        } else{
            return y;
        }  
    }
}
