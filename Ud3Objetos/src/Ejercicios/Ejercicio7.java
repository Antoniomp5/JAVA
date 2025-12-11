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
public class Ejercicio7 {
    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
        
         boolean esMayor_18 = edad >= 18;

        if (esMayor_18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        sc.close();
    }
    
}
