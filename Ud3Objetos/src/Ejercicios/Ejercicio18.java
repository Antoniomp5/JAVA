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
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numero = sc.nextDouble();

        boolean esCasiCero = (Math.abs(numero) < 1) && (numero != 0);

        if (esCasiCero) {
            System.out.println("El número es casi-cero.");
        } else {
            System.out.println("El número NO es casi-cero.");
        }
    }

}
