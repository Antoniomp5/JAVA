package ejercicios;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        Frame frame = new Frame("Contador");
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());

        // Componentes
        Button btnRestar = new Button("-1");
        Button btnSumar = new Button("+1");
        Label lblContador = new Label("0");

        final int[] contador = {0}; // truco para modificar dentro de lambdas

        // Añadir componentes
        frame.add(btnRestar);
        frame.add(lblContador);
        frame.add(btnSumar);

        // Evento restar
        btnRestar.addActionListener(e -> {
            contador[0]--;
            lblContador.setText(String.valueOf(contador[0]));
        });

        // Evento sumar
        btnSumar.addActionListener(e -> {
            contador[0]++;
            lblContador.setText(String.valueOf(contador[0]));
        });

        // Cerrar ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
