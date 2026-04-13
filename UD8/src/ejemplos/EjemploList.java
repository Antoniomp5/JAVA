package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		System.out.println(lista);
		
		int[] array = new int[5];
		array[0] = 6;
		array[1] = 7;
		array[2] = 8;
		array[3] = 9;
		array[4] = 10;
		
		System.out.println(array);
		
		
	}

}
