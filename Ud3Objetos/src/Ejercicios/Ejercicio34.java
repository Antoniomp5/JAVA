/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author 05_1DAW_Alum
 */
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiqueta = 0;            // Identificador de cada árbol
        int altura;
        int alturaMax = -1;          // Guardará la altura máxima
        int arbolMasAlto = -1;       // Guardará la etiqueta del árbol más alto

        System.out.println("Introduce la altura de cada árbol en cm (termina con -1):");

        while (true) {
            System.out.print("Altura del árbol " + etiqueta + ": ");
            altura = sc.nextInt();

            if (altura == -1) {
                break;  // Terminamos la lectura
            }

            if (altura > alturaMax) {
                alturaMax = altura;
                arbolMasAlto = etiqueta;
            }

            etiqueta++;  // Pasamos al siguiente árbol
        }

        if (arbolMasAlto != -1) {
            System.out.println("El árbol más alto es el número " + arbolMasAlto + " con una altura de " + alturaMax + " cm.");
        } else {
            System.out.println("No se ingresaron alturas válidas.");
        }

        sc.close();
    }
}

