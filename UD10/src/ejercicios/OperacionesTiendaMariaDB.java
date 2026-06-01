package ejercicios;

import java.sql.*;

public class OperacionesTiendaMariaDB {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        String usuario = "antonio";
        String contrasena = "4nt0n10";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena)) {
            // --- 1. Borrar todos los registros de la tabla productos ---
            String deleteSQL = "DELETE FROM productos";

            // --- 2. Insertar 3 nuevos productos ---
            String insertSQL1 = "INSERT INTO productos (nombre, descripcion, precio, stock, id_categoria, id_proveedor) " +
                                "VALUES ('Manzana', 'Fruta fresca', 1.50, 100, 1, 1)";
            String insertSQL2 = "INSERT INTO productos (nombre, descripcion, precio, stock, id_categoria, id_proveedor) " +
                                "VALUES ('Pera', 'Fruta dulce', 1.20, 80, 1, 1)";
            String insertSQL3 = "INSERT INTO productos (nombre, descripcion, precio, stock, id_categoria, id_proveedor) " +
                                "VALUES ('Plátano', 'Fruta tropical', 0.90, 120, 1, 2)";

            // --- 3. Modificar el precio de la pera a 0.20 € ---
            String updateSQL = "UPDATE productos SET precio = 0.20 WHERE nombre = 'Pera'";

            // --- 4. Ejecutar en un solo lote (batch) ---
            try (Statement stmt = conexion.createStatement()) {
                // Añadir consultas al batch
                stmt.addBatch(deleteSQL);
                stmt.addBatch(insertSQL1);
                stmt.addBatch(insertSQL2);
                stmt.addBatch(insertSQL3);
                stmt.addBatch(updateSQL);

                // Ejecutar el batch
                stmt.executeBatch();
                System.out.println("Batch ejecutado correctamente.");
            }

            // --- 5. Usar execute() para imprimir productos españoles ---
            // Asumiendo que la tabla productos tiene un campo 'pais_origen'
            String selectEspañoles = "SELECT * FROM productos WHERE pais_origen = 'España'";
            try (Statement stmt = conexion.createStatement()) {
                boolean hayResultados = stmt.execute(selectEspañoles);
                if (hayResultados) {
                    ResultSet rs = stmt.getResultSet();
                    System.out.println("\nProductos españoles:");
                    while (rs.next()) {
                        System.out.println(
                            "ID: " + rs.getInt("id_producto") +
                            ", Nombre: " + rs.getString("nombre") +
                            ", Precio: " + rs.getDouble("precio")
                        );
                    }
                }
            }

            // --- 6. Mostrar metadatos de la conexión ---
            DatabaseMetaData metaData = conexion.getMetaData();

            // Tablas de la base de datos
            System.out.println("\n--- Metadatos de la conexión ---");
            System.out.println("Tablas en la base de datos 'tienda':");
            try (ResultSet tablas = metaData.getTables("tienda", null, null, null)) {
                while (tablas.next()) {
                    System.out.println(tablas.getString("TABLE_NAME"));
                }
            }

            // Columnas de la tabla 'productos'
            System.out.println("\nColumnas de la tabla 'productos':");
            try (ResultSet columnas = metaData.getColumns("tienda", null, "productos", null)) {
                while (columnas.next()) {
                    System.out.println(
                        columnas.getString("COLUMN_NAME") +
                        " (" + columnas.getString("TYPE_NAME") + ")"
                    );
                }
            }

            // Nombre del usuario
            System.out.println("\nUsuario de la conexión: " + metaData.getUserName());

            // URL de conexión
            System.out.println("URL de conexión: " + metaData.getURL());

            // Nombre y versión del driver
            System.out.println("Driver: " + metaData.getDriverName() + " (Versión: " + metaData.getDriverVersion() + ")");

            // Nombre del SGBD
            System.out.println("SGBD: " + metaData.getDatabaseProductName() +
                               " (Versión: " + metaData.getDatabaseProductVersion() + ")");

        } catch (SQLException e) {
            System.out.println("Error en la conexión o consulta: " + e.getMessage());
            e.printStackTrace();
        }
    }
}