package ejercicio1;
import java.io.IOException;
public class Ejercicio4 {

	public static void main(String[] args) {
		byte b[] = new byte[5];
		try {
			System.in.read(b);
		}catch(IOException ioe) {
			System.out.println(ioe);
			
		}
		String s = new String(b);
		System.out.println(s);
		/*
		 * ¿Qué hace el siguiente código? Piénsalo y luego pruébalo para confirmarlo.
		 * Lo que haría este código, en teoria, es leer el array de bytes y 
		 * pasarlos a un String, pero que nunca se mostraría al estar vacio.
		 * Pero en realidad con System.in.read(); lo que hace es que podamos
		 * intrudicrl caracteres sin invocar a la clase Scanner y si usar
		 * sc.next();		 
		 */

	}

}
