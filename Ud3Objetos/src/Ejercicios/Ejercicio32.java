package Ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
	static int valorMax(int x, int y) {
		int resultado;
		if (x > y) {
			resultado = x;
		} else if (x < y) {
			resultado = y;
		} else {
			resultado = x = y;
		}
		
		return resultado;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		int m;
		System.out.println("Introduzca los números para encontrar el máx:");
		n = sc.nextInt();
		m = sc.nextInt();
		
		System.out.println(valorMax(n, m));
	}

}
