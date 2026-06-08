package ejercicios;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Frame frame = new Frame("Login");
        frame.setSize(350, 180);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Campos
        TextField txtUsuario = new TextField();
        TextField txtPassword = new TextField();
        txtPassword.setEchoChar('*');

        // Botones
        Button btnAceptar = new Button("Aceptar");
        Button btnLimpiar = new Button("Limpiar");
        Button btnSalir = new Button("Salir");

        // Labels
        Label lblUsuario = new Label("Usuario:");
        Label lblPassword = new Label("Contraseña:");

        // Añadir componentes
        frame.add(lblUsuario);
        frame.add(txtUsuario);

        frame.add(lblPassword);
        frame.add(txtPassword);

        frame.add(btnAceptar);
        frame.add(btnLimpiar);

        frame.add(btnSalir);
        frame.add(new Label(""));

        // Método para mostrar diálogo
        class Dialogo {
            void mostrar(String titulo, String mensaje) {
                Dialog dialogo = new Dialog(frame, titulo, true);
                dialogo.setLayout(new FlowLayout());
                dialogo.setSize(250, 120);

                Label lblMensaje = new Label(mensaje);
                Button btnCerrar = new Button("Aceptar");

                btnCerrar.addActionListener(e -> dialogo.dispose());

                dialogo.add(lblMensaje);
                dialogo.add(btnCerrar);

                dialogo.setLocationRelativeTo(frame);
                dialogo.setVisible(true);
            }
        }

        Dialogo dialogo = new Dialogo();

        // EVENTO ACEPTAR
        btnAceptar.addActionListener(e -> {

            String usuario = txtUsuario.getText();
            String password = txtPassword.getText();

            if (usuario.isEmpty() || password.isEmpty()) {
                dialogo.mostrar("Error", "Debe rellenar todos los campos.");
            } else {
                dialogo.mostrar("Bienvenido", "Bienvenido, " + usuario + "!");
            }
        });

        // EVENTO LIMPIAR
        btnLimpiar.addActionListener(e -> {
            txtUsuario.setText("");
            txtPassword.setText("");
        });

        // EVENTO SALIR
        btnSalir.addActionListener(e -> frame.dispose());

        // Cerrar ventana con X
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
