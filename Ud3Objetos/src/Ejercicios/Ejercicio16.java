/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 05_1DAW_Alum
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generamos dos números aleatorios
        int a = rand.nextInt(100);   // rango 0–99 (puedes cambiarlo)
        int b = rand.nextInt(100);

        // Aseguramos que a sea el menor y b el mayor
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Comprobación del rango
        if (numero >= min && numero <= max) {
            System.out.println("El número está dentro del rango.");
            System.out.println("Valor de a: " + min);
            System.out.println("Valor de b: " + max);
        }

        // Siempre se muestra esto
        System.out.println("Número introducido: " + numero);
    }
}