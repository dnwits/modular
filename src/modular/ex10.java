/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que demana a l’usuari una data (any, mes, dia) i informa de si és o no correcta.
 * Per simplificar, suposarem que tots els mesos tenen 30 dies. Cal implementar
 * un mètode que rebi les dades i retorni un booleà.
 * @author Val
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variables
        System.out.println("Introduzca el año: ");
        int yr = entrada.nextInt();
        System.out.println("Introduzca el mes: ");
        int mnth = entrada.nextInt();
        System.out.println("Introduzca el día: ");
        int dy = entrada.nextInt();
        if (date(yr, mnth, dy)){ //llamar al metodo
            System.out.println("La fecha es válida :3"); //mensaje de fecha correcto
        } else {
            System.out.println("La fecha es erronea..."); //mensaje de error
        }
    }
    public static boolean date (int year, int month, int day){ //metodo que indica si los parametros introducidos son pausibes o no
        if (year<=0){
            return false;
        } if (month<1 || month>12){
            return false;
        } if (day < 1 || day > 30){
        return false;
        }else{
            
        }
        return true;
    } 
}
