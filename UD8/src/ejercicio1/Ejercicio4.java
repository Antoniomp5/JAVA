package ejercicio1;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 1. 
        ArrayList<Double> notas = new ArrayList<>();

        // 2. 
        for (String notaStr : notasEntrada) {
            Double nota = Double.parseDouble(notaStr); 
            notas.add(nota);
        }

        // 3.
        double suma = 0.0;
        for (Double nota : notas) {
            suma += nota; 
        }

        double media = suma / notas.size();

        // 4. 
        ArrayList<Double> aprobados = new ArrayList<>();
        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        System.out.println("Notas: " + notas);
        System.out.println("Nota media: " + media);
        System.out.println("Aprobados: " + aprobados);
    }
}