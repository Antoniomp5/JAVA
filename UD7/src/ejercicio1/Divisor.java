package ejercicio1;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		System.out.println("Comienzo programa división");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduzca los números: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			System.out.println("Resultado: " + division(x, y));
		} catch (ArithmeticException ex) {
			System.out.println("Es imposible dividir entre 0");
			
		} finally {
			System.out.println("Fin del programa de división");
		}

	}
	
	private static double division(double dividendo, double divisor) 
			throws ArithmeticException{
		return dividendo / divisor;
	}

}
