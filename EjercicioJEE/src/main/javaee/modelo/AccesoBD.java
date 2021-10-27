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

    // Nuestra librer�a mysql
    private String driver = "com.mysql.jdbc.Driver";

    // Objeto del tipo Connection para crear la conexi�n
    private Connection con;

    public void Conexion()
    {
        try {
            // Cargar drivers de MySQL
            Class.forName(driver);

            // Establecer la conexion con la base de datos
            con = DriverManager.getConnection(servidor, username, password);

            System.out.println("Conexi�n realizada a la base de datos con �xito.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!, conexi�n fallida a la base de datos.");
        }
    }

    public Connection getConnection() {
        return con; // Retorno el objeto Connection
    }
}
