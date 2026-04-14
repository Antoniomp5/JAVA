package ejercicio6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> paises = new HashSet<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce el país: ");
			String pais = sc.nextLine();
			
	
			if(!paises.add(pais)) {
				System.out.println("¡Ese ya pasó por la frontera!");
			}
		}
		
		System.out.println("Países únicos registrados: " + paises.size());
		System.out.println("Lista de países: " + paises);
		sc.close();
	}


}
