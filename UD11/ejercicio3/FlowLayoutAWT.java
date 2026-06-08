package ejercicio3;

import java.awt.*;

public class FlowLayoutAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout AWT");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        frame.add(new Button("Botón 1"));
        frame.add(new Button("Botón 2"));
        frame.add(new Button("Botón 3"));
        frame.add(new Button("Botón 4"));

        frame.setVisible(true);
    }
}
