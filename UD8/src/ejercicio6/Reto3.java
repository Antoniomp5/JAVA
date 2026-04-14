package ejercicio6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Reto3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> colores = new LinkedHashSet<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Color " + i + ":");
			String color = sc.nextLine();
			colores.add(color);
		}
		
		System.out.println(colores);
		
		System.out.println("Colores en el orden en que los escribiste:");
		for (String color: colores) {
			System.out.println(color);
		}	
		
		sc.close();
	
	}


}
