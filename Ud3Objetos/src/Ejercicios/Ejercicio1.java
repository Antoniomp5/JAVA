package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // declaración de variables
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        num = sc.nextInt();

        System.out.println("El número seleccionado es: " + num);

        sc.close();
    }
}
