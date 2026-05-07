package ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre de pila y después pulse intro para finalizar: ");
		String nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
		sc.close();
	}

}
