package ejercicio13;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner sc = new Scanner(System.in);
	private static final double PI = 3.14;
	private static double resultado;
	
	public static void menu() {

	    System.out.println("------------------------");
	    System.out.println("Introduzca una opción: ");
	    System.out.println("1. Sumar");
	    System.out.println("2. Restar");
	    System.out.println("3. Multiplicar");
	    System.out.println("4. Dividir");
	    System.out.println("5. Ruleta de Alumnos");
	    System.out.println("------------------------");

	    int opcion = sc.nextInt();
	    double resultado;

	    switch (opcion) {

	        case 1:
	            System.out.println("Introduce el primer número:");
	            double a = sc.nextDouble();

	            System.out.println("Introduce el segundo número:");
	            double b = sc.nextDouble();

	            resultado = sumar(a, b);
	            System.out.println("Resultado: " + resultado);
	            break;

	        case 2:
	            System.out.println("Introduce el primer número:");
	            a = sc.nextDouble();

	            System.out.println("Introduce el segundo número:");
	            b = sc.nextDouble();

	            resultado = restar(a, b);
	            System.out.println("Resultado: " + resultado);
	            break;

	        case 3:
	            System.out.println("Introduce el primer número:");
	            a = sc.nextDouble();

	            System.out.println("Introduce el segundo número:");
	            b = sc.nextDouble();

	            resultado = multiplicar(a, b);
	            System.out.println("Resultado: " + resultado);
	            break;

	        case 4:
	            System.out.println("Introduce el primer número:");
	            a = sc.nextDouble();

	            System.out.println("Introduce el segundo número:");
	            b = sc.nextDouble();

	            resultado = dividir(a, b);
	            System.out.println("Resultado: " + resultado);
	            break;

	        case 5:
	            System.out.println("Introduce la nota del alumno:");
	            double nota = sc.nextDouble();

	            String alumnoSeleccionado = Operaciones.seleccionAlumno(nota);

	            System.out.println("Alumno seleccionado: " + alumnoSeleccionado);
	            break;

	        default:
	            System.out.println("Opción no válida");
	    }
	}

	public static double sumar(double a, double b){
		return Operaciones.sumar(a, b);
	}

	public static double restar(double a, double b){
		return Operaciones.restar(a, b);
	}

	public static double multiplicar(double a, double b){
		return Operaciones.multiplicar(a, b);
	}

	public static double dividir(double a, double b){
		return Operaciones.dividir(a, b);
	}
	
	public static final int seleccionAlumno(double nota, int totalAlumnos) {
	    return (int)((nota * Calculadora.PI) % totalAlumnos);
	}
}
