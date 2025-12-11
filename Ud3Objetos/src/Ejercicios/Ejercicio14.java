package Ejercicios;

import java.util.Scanner;

/**
 * Clase que calcula la media de tres notas trimestrales y la redondea a un entero.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        // Se crea el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Declaración de variables para almacenar las notas y la media
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        // Solicitud de entrada al usuario (Corregida la tilde en "Introduzca")
        System.out.println("Introduzca las tres notas de los trimestres:");
        nota1 =  sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        
        // Cálculo de la media
        media = (nota1 + nota2 + nota3) / 3;
        
        // Redondeo de la media al entero más cercano
        int mediaFinal = (int) Math.round(media);
        
        // Impresión del resultado final (Corregida la palabra "media" por "media")
        System.out.println("La media final es: " + mediaFinal);
        
        // Cierre del objeto Scanner para liberar recursos
        sc.close();
        
    } 
    
}
