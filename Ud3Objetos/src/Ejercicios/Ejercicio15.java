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
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        float numero = sc.nextFloat();

        int redondeado = Math.round(numero);

        System.out.println("Número redondeado: " + redondeado);
    }
}
    

