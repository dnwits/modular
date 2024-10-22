/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * Programa per transformar un temps en segons a hores, minuts i segons. El programa
 * llegirà els segons, cridarà al mètode segonsAhms() i mostrarà el resultat.
 * @author Val
 */
public class ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedir los segundos al usuario
        System.out.println("Introduce el tiempo en segundos: ");
        int totalSegundos = entrada.nextInt();
        // Llamar al método para convertir los segundos a horas, minutos y segundos
        segonsAhms(totalSegundos);
    }
    public static void segonsAhms(int secTotales){
        int horas = secTotales / 3600; // Cada hora tiene 3600 segundos
        int minutos = (secTotales % 3600) / 60; // Los minutos se obtienen del resto de la división entre 3600
        int segundos = secTotales % 60; // Los segundos restantes
        // Mostrar el resultado
        System.out.println("Horas: " + horas + ", minutos: " + minutos + ", segundos: " + segundos);
    }
}
