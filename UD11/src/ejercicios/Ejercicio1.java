package ejercicios;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio1 {

    public static void main(String[] args) {

        Frame ventana = new Frame("Ejercicio AWT");
        ventana.setSize(300, 300);
        ventana.setLayout(new FlowLayout());

        TextField texto = new TextField(20);
        Button limpiar = new Button("Limpiar");
        Button salir = new Button("Salir");
        
        

        limpiar.addActionListener(e -> texto.setText(""));
        salir.addActionListener(o -> System.exit(0));
        
        ventana.add(limpiar);
        ventana.add(salir);
        ventana.add(texto);

        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ventana.setVisible(true);
    }
}
