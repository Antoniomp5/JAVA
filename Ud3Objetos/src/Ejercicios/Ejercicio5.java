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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota_1, nota_2, media;
        System.out.println("Introduzca la primera nota: ");
        nota_1 = sc.nextDouble();

        System.out.println("Introduzca la segunda nota: ");
        nota_2 = sc.nextDouble();

        media = (nota_1 + nota_2) / 2;

        System.out.println("La media es de:  " + media);

        sc.close();

    }

}
