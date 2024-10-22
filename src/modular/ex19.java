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
        do {
            mostraMenu(); // Mostrar el menú
            opcion = entrada.nextInt();           
            switch (opcion) {
                case 1 -> { //calculos con rectángulos                   
                    System.out.println("Introduce la base del rectángulo: ");
                    double base = entrada.nextDouble();
                    System.out.println("Introduce la altura del rectángulo: ");
                    double altura = entrada.nextDouble();
                    double perimetroRect = perimetroRectangulo(base, altura);
                    double areaRect = areaRectangulo(base, altura);
                    System.out.println("Perímetro del rectángulo: " + perimetroRect);
                    System.out.println("Área del rectángulo: " + areaRect);
                }
                    
                case 2 -> { //para circulos                   
                    System.out.println("Introduce el radio del círculo: ");
                    double radio = entrada.nextDouble();
                    double perimetroCirc = perimetroCirculo(radio);
                    double areaCirc = areaCirculo(radio);
                    System.out.println("Perímetro del círculo: " + perimetroCirc);
                    System.out.println("Área del círculo: " + areaCirc);
                }                   
                case 0 -> //salir del program
                    System.out.println("Saliendo del programa...");
                    
                default -> System.out.println("Opción no válida, elige de nuevo.");
            }
        } while (opcion != 0);
    }
    public static void mostraMenu() {
        System.out.println("Menú:");
        System.out.println("0. Sortir");
        System.out.println("1. Càlculs amb rectangles");
        System.out.println("2. Càlculs amb cercles");
        System.out.print("Selecciona una opció: ");
    }   
    //metodos para cálculos con rectángulos
    public static double perimetroRectangulo(double base, double altura){
        return 2 * (base + altura);
    }
    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }  
    //metodos para cálculos con círculos
    public static double perimetroCirculo(double radio){
        return 2 * Math.PI * radio; // Circunferencia = 2πr
    }
    public static double areaCirculo(double radio){
        return Math.PI * radio * radio; // Área = πr^2
    }
}
