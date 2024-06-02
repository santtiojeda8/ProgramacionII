package Conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//DE ESTA FORMA REALIZAMOS LA CONEXIÓN DEL JAVA CON LA BASE DE DATOS

public class ConexionDataBase {

    public String Drive = "org.h2.Driver";
    public String jdbcURL="jdbc:h2:~/test";
    public String user = "";
    public String pass = "";


    public Connection getConnectionDBH2(){
        Connection connection = null;
        try {
            Class.forName(Drive); // Pasamos URl pasa idedntificar q base de datos se usa

            // Realizamos la conexión con DriveManager pasandole el JDBC URl el usuario y la contraseña
            connection = DriverManager.getConnection(jdbcURL, user, pass);

            System.out.println("Conexión Exitosa");
        } catch (ClassNotFoundException | SQLException e ) {
            e.printStackTrace();
            System.out.println("Error en la conexíon con la Base de Datos");
        }
        return connection;
    }
}
