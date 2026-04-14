package ejercicio6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Reto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> juegos = new TreeSet<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce el nombre del juego " + i + ":");
			String juego = sc.nextLine();
			juegos.add(juego);
		}
		
		System.out.println(juegos);
		
		System.out.println("Ranking alfabético de videojuegos:");
		for (String juego: juegos) {
			System.out.println(juego);
		}	
		
		sc.close();

	
	}

}
