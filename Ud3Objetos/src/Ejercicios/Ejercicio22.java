package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero != 0) {

                // Par o impar
                if (numero % 2 == 0) {
                    System.out.println("→ Es par.");
                } else {
                    System.out.println("→ Es impar.");
                }

                // Positivo o negativo
                if (numero > 0) {
                    System.out.println("→ Es positivo.");
                } else {
                    System.out.println("→ Es negativo.");
                }

                // Cuadrado
                System.out.println("→ Su cuadrado es: " + (numero * numero));
                System.out.println();  // línea en blanco
            }

        } while (numero != 0);

        System.out.println("Fin del programa.");
        sc.close();
    }
}


