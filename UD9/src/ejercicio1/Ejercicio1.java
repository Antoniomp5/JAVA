package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mete 4 caracteres: ");
		String caracter = sc.nextLine();
		
		if (caracter.length() >=4) {
			
            char c1 = caracter.charAt(0);
            char c2 = caracter.charAt(1);
            char c3 = caracter.charAt(2);
            char c4 = caracter.charAt(3);
			
			System.out.write(c1);
			System.out.write('\n'); 
			
			System.out.print(c2 + "\n");
			
			System.out.println(c3);
			
			System.out.printf("%c\n", c4);
		} else {
			System.out.println("Debe de tener 4 caracteres al menos");
			
		}
		sc.close();

	}

}
