package Ejercicios;

import java.util.Scanner;

public class Ejercicio33 {

    // Método para encontrar el máximo entre 2 números
    static int valorMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // Método sobrecargado para encontrar el máximo entre 3 números
    static int valorMax(int x, int y, int z) {
        // Invocamos el metodo anterior para mayor eficiencia
        int maxXY = valorMax(x, y);
        return valorMax(maxXY, z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i;
        System.out.println("Introduzca tres números para encontrar el máximo:");
        n = sc.nextInt();
        m = sc.nextInt();
        i = sc.nextInt();

        System.out.println("El número máximo es: " + valorMax(n, m, i));
        sc.close();
    }
}
