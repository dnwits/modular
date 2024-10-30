/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * Programa amb un menú de tres opcions:
0. Sortir.
1. Càlculs amb rectangles
2. Càlculs amb cercles
El programa presentarà iterativament el menú a l’usuari perquè esculli una de les opcions fins
que esculli sortir.
Cal crear un mètode void mostraMenu() per mostrar el menú.
Per a cada figura es calcularà el perímetre i l’àrea. Cal preguntar a l’usuari les dimensions de la
figura i invocar mètodes específics per a cada càlcul.
 * @author Val
 */
public class ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;       
        do { //iniciar bucle
            mostraMenu(); //llamar metodo del menú
            opcion = entrada.nextInt();           
            switch (opcion) {
                case 1 -> { //calculos con rectángulos                   
                    calculsRectangles(entrada);
                    break;
                }
                    
                case 2 -> { //para circulos                   
                    calculsCercles(entrada);
                    break;
                }                   
                case 0 -> //salir del program
                    System.out.println("Saliendo del programa... ^^");
                    
                default -> 
                    System.out.println("Error, opción no válida..."); //error si selección fuera del rango
                    //break;
            }
        } while (opcion != 0); //romper el bucle cuando opcion=0
    }
    public static void mostraMenu(){ //mostrar menú con las opciones definidas
        System.out.println("Menú:");
        System.out.println("0. Sortir");
        System.out.println("1. Càlculs amb rectangles");
        System.out.println("2. Càlculs amb cercles");
        System.out.print("Selecciona una opció: ");
    }   
    //metodos para cálculos con rectángulos
    public static void calculsRectangles(Scanner scanner) {
        System.out.print("Introdueix la llargada del rectangle: ");
        double llargada = scanner.nextDouble();
        System.out.print("Introdueix l'amplada del rectangle: ");
        double amplada = scanner.nextDouble();
        
        double perimetre = 2 * (llargada + amplada);
        double area = llargada * amplada;
        
        System.out.println("Perímetre del rectangle: " + perimetre);
        System.out.println("Àrea del rectangle: "+area);
    }
     // Mètode per fer càlculs amb cercles
    public static void calculsCercles(Scanner scanner) {
        System.out.print("Introdueix el radi del cercle: ");
        double radi = scanner.nextDouble();
        
        double perimetre = 2 * Math.PI * radi;
        double area = Math.PI * radi * radi;
        
        System.out.println("Perímetre del cercle: " + perimetre);
        System.out.println("Àrea del cercle: " + area);
    }
}
