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
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int veces = sc.nextInt();

        if (veces <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        } else {
            for (int i = 0; i < veces; i++) {
                System.out.println("Eco...");
            }
        }

        sc.close();
    }

}
