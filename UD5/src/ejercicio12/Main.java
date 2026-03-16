package ejercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del animal: ");
		String n1 = sc.nextLine();
		
		System.out.println("Introduzca la edad del animal: ");
		int e1 = sc.nextInt();
		sc.nextLine();
		
		Perro p = new Perro(n1, e1);
		
		p.mostrarInformacion();
		p.hacerSonido();
		p.moverse();
		System.out.println();
		
		System.out.println("Introduzca el nombre del animal: ");
		String n2 = sc.nextLine();
		
		System.out.println("Introduzca la edad del animal: ");
		int e2 = sc.nextInt();
		sc.nextLine();
		
		Gato g = new Gato(n2, e2);
		
		g.mostrarInformacion();
		g.hacerSonido();
		g.moverse();
		System.out.println();
		
		System.out.println("Introduzca el nombre del animal: ");
		String n3 = sc.nextLine();
		
		System.out.println("Introduzca la edad del animal: ");
		int e3 = sc.nextInt();
		sc.nextLine();
		
		Pajaro pa = new Pajaro(n3, e3);
		
		pa.mostrarInformacion();
		pa.hacerSonido();
		pa.moverse();
		System.out.println();
		
		sc.close();

	}

}
