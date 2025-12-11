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
public class Ejercicio24 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int edadMax = Integer.MIN_VALUE;
        int edadMin = Integer.MAX_VALUE;
        int sumaEdades = 0;
        int contador = 0;

        System.out.println("Introduce las edades de los alumnos (termina con -1):");

        while (true) {
            System.out.print("Edad: ");
            edad = sc.nextInt();

            if (edad == -1) {
                break; // Salimos del bucle si se introduce -1
            }

            if (edad < 0) {
                System.out.println("Edad no válida. Introduce un número positivo.");
                continue;
            }

            // Actualizamos máximo y mínimo
            if (edad > edadMax) {
                edadMax = edad;
            }
            if (edad < edadMin) {
                edadMin = edad;
            }

            sumaEdades += edad;
            contador++;
        }

        if (contador == 0) {
            System.out.println("No se introdujeron edades válidas.");
        } else {
            double promedio = (double) sumaEdades / contador;
            System.out.println("\nResumen de edades:");
            System.out.println("-----------------");
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Edad mínima: " + edadMin);
            System.out.println("Edad máxima: " + edadMax);
            System.out.printf("Edad promedio: %.2f\n", promedio);
        }

        sc.close();
    }
    
}
