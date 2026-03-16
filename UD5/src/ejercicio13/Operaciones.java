package ejercicio13;

public class Operaciones {
	
    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }
    
    public static final String seleccionAlumno(double nota) {

        String[] alumnos = {"Ana", "Carlos", "Lucía", "Pedro", "Marta"};

        int indice = (int)(Math.random() * alumnos.length);

        return alumnos[indice];
    }

}
