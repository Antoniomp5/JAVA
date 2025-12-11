package Ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
	
	
	static void variosSaludos (int numero) {
		for (int i = 0 ; i < numero; i++) {
			System.out.println("Hola");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = 3;
		int n;
		int x;
		System.out.println("Introduzca un número para que se muestre n veces");
		n = sc.nextInt();
		x = n * 2;
		//variosSaludos(n);
		variosSaludos(x);

	}

}
