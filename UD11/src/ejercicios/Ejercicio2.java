package ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 {
	public static void main(String[] args) {
		Frame ventana = new Frame("Login awt: ");
		ventana.setSize(400, 250);
		ventana.setLayout(new FlowLayout());
		
		Label lblUsuario = new Label("Usuario: ");
		TextField txtUsuario = new TextField(20);
		Label lblPassword = new Label("Contraseña: ");
		TextField txtPassword = new TextField(25);
		txtPassword.setEchoChar('*');
		
        TextField txtFichero = new TextField(25);
        txtFichero.setEditable(false);
        
        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        Button btnSeleccionar = new Button("Seleccionar fichero");
		
        ventana.add(lblUsuario);
        ventana.add(txtUsuario);

        ventana.add(lblPassword);
        ventana.add(txtPassword);

        ventana.add(btnAceptar);
        ventana.add(btnCancelar);

        ventana.add(btnSeleccionar);
        ventana.add(txtFichero);
        
        btnAceptar.addActionListener(e -> {

            Dialog dialogo = new Dialog(ventana, "Bienvenida", true);
            dialogo.setLayout(new FlowLayout());

            Label mensaje = new Label(
                    "Bienvenido " + txtUsuario.getText());

            Button cerrar = new Button("Aceptar");

            cerrar.addActionListener(ev -> dialogo.dispose());

            dialogo.add(mensaje);
            dialogo.add(cerrar);

            dialogo.setSize(250, 120);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);
        });
        
        btnCancelar.addActionListener(e -> {
            txtUsuario.setText("");
            txtPassword.setText("");
            txtFichero.setText("");
        });
        
        btnSeleccionar.addActionListener(e -> {

            FileDialog fd =
                    new FileDialog(ventana,
                                   "Seleccionar fichero",
                                   FileDialog.LOAD);

            fd.setVisible(true);

            if (fd.getFile() != null) {
                txtFichero.setText(
                        fd.getDirectory() + fd.getFile());
            }
        });
        
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
                System.exit(0);
            }
        });

        ventana.setVisible(true);
    }
}


