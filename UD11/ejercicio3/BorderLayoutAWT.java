package ejercicio3;

import java.awt.*;

public class BorderLayoutAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout AWT");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        frame.add(new Button("Norte"), BorderLayout.NORTH);
        frame.add(new Button("Sur"), BorderLayout.SOUTH);
        frame.add(new Button("Este"), BorderLayout.EAST);
        frame.add(new Button("Oeste"), BorderLayout.WEST);
        frame.add(new Button("Centro"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
