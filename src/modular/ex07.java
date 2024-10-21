/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 * que pregunta a l’usuari preus d’articles fins que decideix no continuar
 * (cal preguntar a cada iteració) i mostra el preu amb IVA (21 %). Implementa
 * el mètode float preuAmbIva(float preu).
 * @author Val
 */
public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca precios de articulos para saber el IVA. Para salir ponga 0.");
        float art;
        do {      
        System.out.println("Introduzca el precio de su artículo: ");
        art = entrada.nextFloat();
        float iva = preuAmbIva(art);
            System.out.println("El IVA es de "+iva);
        } while (art != 0);       
    }
    public static float preuAmbIva(float preu){
        return ((preu*21)/100);
    }
}
