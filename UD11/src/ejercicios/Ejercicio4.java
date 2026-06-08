package ejercicios;

import javax.swing.*;
import java.awt.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Crear ventana
        JFrame frame = new JFrame("Panel de Ascensor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel con cuadrícula 2x2
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Botones de los pisos
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");

        // Añadir botones al panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        // Añadir panel a la ventana
        frame.add(panel);

        // Ajustes de la ventana
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
