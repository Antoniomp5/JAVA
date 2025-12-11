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
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int contador = 0;

        System.out.println("¡Bienvenido al juego de sumas!");
        System.out.println("Resuelve las sumas correctamente. El juego termina si fallas.\n");

        while (true) {
            int num1 = rand.nextInt(100) + 1; // 1 a 100
            int num2 = rand.nextInt(100) + 1; // 1 a 100
            int resultadoCorrecto = num1 + num2;

            System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
            int respuesta = sc.nextInt();

            if (respuesta == resultadoCorrecto) {
                System.out.println("¡Correcto!\n");
                contador++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + resultadoCorrecto);
                break;
            }
        }

        System.out.println("\nJuego terminado. Has resuelto correctamente " + contador + " operaciones.");
        sc.close();
    }

}
