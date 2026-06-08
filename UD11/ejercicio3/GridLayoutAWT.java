package ejercicio3;

import java.awt.*;

public class GridLayoutAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout AWT");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2, 3));

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));

        frame.setVisible(true);
    }
}
