package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AccesoBD {
	 // Ruta de nuestra base de datos
    private String servidor = "jdbc:mysql://localhost:3306/amigos";

    // Nombre de usuario de mysql
    private String username = "root";

    // Clave de usuario de mysql
    private String password = "123456789";

    // Nuestra librería mysql
    private String driver = "com.mysql.jdbc.Driver";

    // Objeto del tipo Connection para crear la conexión
    private Connection con;

    public void Conexion()
    {
        try {
            // Cargar drivers de MySQL
            Class.forName(driver);

            // Establecer la conexion con la base de datos
            con = DriverManager.getConnection(servidor, username, password);

            System.out.println("Conexión realizada a la base de datos con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!, conexión fallida a la base de datos.");
        }
    }

    public Connection getConnection() {
        return con; // Retorno el objeto Connection
    }
}
