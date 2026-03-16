package ejercicio15;

public class Main {

    public static void main(String[] args) {
        int valorPrimitivo = 5;
        System.out.println("Antes de llamar al método, numero = " + valorPrimitivo);
        modificarPrimitivo(valorPrimitivo);
        System.out.println("Después de llamar al método, numero = " + valorPrimitivo);

        StringBuilder valorObjeto = new StringBuilder("Hola");
        System.out.println("Antes de llamar al método, texto = " + valorObjeto);
        modificarObjeto(valorObjeto);
        System.out.println("Después de llamar al método, texto = " + valorObjeto);
    }

    public static void modificarPrimitivo(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método, numero = " + numero);
    }

    public static void modificarObjeto(StringBuilder texto) {
        texto.append("Modificado");
        System.out.println("Dentro del método, texto = " + texto);
    }
}
