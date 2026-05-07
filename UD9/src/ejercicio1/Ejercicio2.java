package ejercicio1;
import java.io.FileWriter;

public class Ejercicio2 {
	
    public static void main(String[] args) throws Exception {
        
    	// Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        escritor.close();
        System.out.println("He escrito en el archivo... ¿o no?");
    	
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos
    	
        // No hemos puesto ni flush() ni close()
        
        /* ¿Se ha escrito algo en prueba.txt? No se ha escrito nada
         * ¿Por qué? Porque falta poner un .close(); y para
         * hacerlo con buenas practicas, se puede meter en un 
         * try-catch-finally
         * ¿Cómo lo arreglarias? Hazlo y compruebalo. 
         * Lo arreglariamos poniendo escritor.close();
         * De está forma cerramos el flujo de datos, diciendo al programa que no inserte 
         * más texto y al cerralo tembién lo almacena haciendo un flush. 
         */
    }
}