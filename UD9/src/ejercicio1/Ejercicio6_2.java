package ejercicio1;

import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su cuantos años viviras y después pulse intro para finalizar: ");
		int annos = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduzca su nombre de pila y después pulse intro para finalizar: ");
		String nombre = sc.nextLine();
		
		int defuncion = annos + 10;
		
		System.out.println("Hola " + nombre + " los astros dicen que morirás a los " +
				defuncion +  " años por culpa de un café frío");
		sc.close();

	}

}
