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
        //pedir los segundos al usuario
        System.out.println("Introduce el tiempo en segundos: ");
        int totalSegundos = entrada.nextInt();
        //llamar al método para convertir los segundos a horas, minutos y segundos
        segonsAhms(totalSegundos);
    }
    public static void segonsAhms(int secTotales){
        int horas = secTotales / 3600; //1 hora tiene 3600 segundos
        int minutos = (secTotales % 3600) / 60; //calcular los minutos
        int segundos = secTotales % 60; //los segundos restantes
        System.out.println("Horas: "+horas+", minutos: "+minutos+", segundos: "+segundos); //mostrar resultata per pantalla
    }
}
