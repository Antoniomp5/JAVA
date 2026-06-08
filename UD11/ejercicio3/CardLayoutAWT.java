package ejercicio3;

import java.awt.*;

public class CardLayoutAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout AWT");
        frame.setSize(400, 300);

        CardLayout cardLayout = new CardLayout();
        Panel panel = new Panel(cardLayout);

        panel.add(new Button("Tarjeta 1"), "1");
        panel.add(new Button("Tarjeta 2"), "2");
        panel.add(new Button("Tarjeta 3"), "3");

        frame.add(panel);
        frame.setVisible(true);

        // Cambia cada 2 segundos
        new java.util.Timer().schedule(new java.util.TimerTask() {
            public void run() {
                cardLayout.next(panel);
            }
        }, 0, 2000);
    }
}
