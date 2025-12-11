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
public class Ejercicio2 {
        public static void main(String[] args) {

        // declaración de variables
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
        edad = edad + 1;

        System.out.println("Su edad para el año que viene es: " + edad);

        sc.close();
    }
}
    

