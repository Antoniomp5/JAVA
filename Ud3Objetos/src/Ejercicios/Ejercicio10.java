/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author 05_1DAW_Alum
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // escaner y declaración de variables
        Scanner sc = new Scanner(System.in);
       double kilosMan;
       double kilosPer;
       double precioMan =  2.35;
       double precioPer =  1.95;
       double totalMan;
       double totalPer;
       
       // inicialización del programa
       System.out.println("Introduzca la cantidad en kg de las manzanas y peras");
       kilosMan = sc.nextDouble();
       kilosPer = sc.nextDouble();
       
       totalMan = kilosMan * precioMan;
       totalPer = kilosPer * precioPer;
       
       System.out.println("El precio total de las manzanas es: " + totalMan + " y el de las peras: " + totalPer);
       
    }
    
}
