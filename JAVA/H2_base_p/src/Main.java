import Conf.ConexionDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto para poder crear la conexión
        ConexionDataBase cdb = new ConexionDataBase();
        //Utilizamos el método que crea la conexión y la testea
        cdb.getConnectionDBH2();


        Statement statement = null;
        try {
            Scanner read = new Scanner(System.in);
            int decision = 0;
            boolean decided = true;
            System.out.println("BIENVENIDO A MIDB APP");
            do {
                System.out.println("Ingrese el número de la opción que desea realizar");
                System.out.print("1_Crear Tabla Alumnos" +
                        "\n2_Insertar Registro" +
                        "\n3_Mostrar Registros Insertados" +
                        "\n4_Borrar Registros" +
                        "\n5_Modificar Apellido" +
                        "\n6_Borrar Menores 19" +
                        "\n7_Crear Tabla Notas"+
                        "\n8_Insertar Notas"+
                        "\n9_Asignar Notas"+
                        "\n10_Mostrar Tabla Nota"+
                        "\n11_Salir \n");
                decision = read.nextInt();
                if (decision < 0 | decision > 11) {
                    do {
                        System.out.println("Opción Inexistente");
                        System.out.println("Ingese nuevamente la opción deseada");
                        decision = read.nextInt();
                    } while (decision < 0 | decision > 11);
                }
                if (decision == 11) {
                    decided = false;
                    break;
                }
                System.out.println("Decisión tomada");


                //Creamos un Statement para poder realizar consultas con la DB
                statement = cdb.getConnectionDBH2().createStatement();

                //En un string guardamos una consulta y luego la enviamos al H2
                String sql = "CREATE SCHEMA IF NOT EXISTS H2DB_PRUEBA;";
                statement.execute(sql);


                Main main = new Main();
                switch (decision) {
                    case 1:
                        main.crearTablaAlumnos(statement);
                        System.out.println("Tabla Alumnos Creada");
                        break;
                    case 2:
                        main.insertarDatosAlumnos(statement);
                        System.out.println("Datos Insertados");
                        break;
                    case 3:
                        main.mostrarDatosAlumnos(statement);
                        break;
                    case 4:
                        main.eliminarDatosAlumnos(statement);
                        System.out.println("Datos Eliminados");
                        break;
                    case 5:
                        main.modificarApellidoAlumnos(statement);
                        System.out.println("Apellido Modificado");
                        break;
                    case 6:
                        main.eliminarMenoresAlumnos(statement);
                        System.out.println("Menores Eliminados");
                        break;
                    case 7:
                        main.crearTablaNotas(statement);
                        System.out.println("Tabla Notas Creada");
                        break;
                    case 8:
                        main.insertarNotas(statement);
                        System.out.println("Datos Insertados");
                        break;
                    case 9:
                        main.asignarNotas(statement);
                        System.out.println("Clave foranea creada");
                        break;
                    case 10:
                        main.mostrarTablaNotas(statement);
                        break;
                }
            }while (decided);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {  // Este finally cierra los Statement | Connection para liberar recursos
            if (statement != null) {
                try {
                    statement.close();
                    //System.out.println("Statement cerrada");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cdb.getConnectionDBH2() != null) {
                try {
                    cdb.getConnectionDBH2().close();
                    //System.out.println("Connection cerrada");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void crearTablaAlumnos(Statement statement){
        try {
            String sqlCT = "CREATE TABLE IF NOT EXISTS H2DB_PRUEBA.Alumnos (" +
                    "id INT PRIMARY KEY ," +
                    "Nombre VARCHAR(255)," +
                    "Apellido VARCHAR(255),"+
                    "Edad INT)";
            statement.execute(sqlCT);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear el tabla: " + e.getMessage());
        }

    }
    public void insertarDatosAlumnos(Statement statement){
        try{
            String sqlID="INSERT INTO H2DB_PRUEBA.Alumnos(id,Nombre,Apellido,Edad) VALUES " +
                    "(100,'Luis','Paes',20)," +
                    "(200,'María','Perez',19)," +
                    "(300,'Martin','García',19),"+
                    "(400,'Lucía','Paes',18)";
            statement.execute(sqlID);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al insertar datos");
        }
    }
    public void mostrarDatosAlumnos(Statement statement) throws SQLException {
        ResultSet resultSet = null;
        try {
            String sqlMD = "SELECT * FROM H2DB_PRUEBA.Alumnos";

            //Creamos un objeto resulSet, este toma los resultados de consultas SELECT
            resultSet = statement.executeQuery(sqlMD);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                int edad = resultSet.getInt("Edad");
                System.out.println("ID: "+id+" Nombre: "+ nombre+" Apellido: "+apellido+" Edad: "+edad);
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al mostrar datos");
        }finally {
            if (resultSet != null) {
                resultSet.close();
                //System.out.println("Resultados cerradas");
            }
        }
    }

    public void eliminarDatosAlumnos(Statement statement) throws SQLException {
        try{
            String sqlID = "DELETE FROM H2DB_PRUEBA.Alumnos";
            statement.execute(sqlID);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al eliminar datos");
        }
    }
    public void modificarApellidoAlumnos(Statement statement){
        try{
        String sqlMA = "UPDATE H2DB_PRUEBA.Alumnos SET Apellido = 'Paez' WHERE Apellido='Paes'";
        statement.execute(sqlMA);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void eliminarMenoresAlumnos(Statement statement){
        try{
            String sqlED = "DELETE FROM H2DB_PRUEBA.Alumnos WHERE Edad < 19";
            statement.execute(sqlED);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al eliminar menores");
        }
    }
    public void crearTablaNotas(Statement statement){
        try{
            String sqlCTN = "CREATE TABLE IF NOT EXISTS H2DB_PRUEBA.Notas ("+
                    "\nid INTEGER PRIMARY KEY," +
                    "\nAlumno INTEGER," +
                    "\nMateria VARCHAR (250)," +
                    "\nNota INTEGER)";
            statement.execute(sqlCTN);
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear tabla notas");
        }
    }
    public void insertarNotas(Statement statement){
        try{
            String sqlIN= "INSERT INTO H2DB_PRUEBA.Notas (id,Alumno,Materia,Nota) VALUES" +
                    "\n(10,100,'Inglés',8),"+
                    "\n(20,200,'Matemática',6)," +
                    "\n(30,300,'Lengua',5)," +
                    "\n(40,400,'Física',10)";
            statement.execute(sqlIN);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al insertar notas");
        }
    }
    public void asignarNotas(Statement statement){
        try{
            String sqlAN = "ALTER TABLE H2DB_PRUEBA.Notas ADD FOREIGN KEY (Alumno) REFERENCES H2DB_PRUEBA.Alumnos(id)";
            statement.execute(sqlAN);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al asignar notas");
        }
    }
    public void mostrarTablaNotas(Statement statement){
        ResultSet resultSet1 = null;
        try{
            String sqlTN = "SELECT * FROM H2DB_PRUEBA.Notas";

            resultSet1 = statement.executeQuery(sqlTN);
            while (resultSet1.next()) {
                int id = resultSet1.getInt("id");
                String nombre = resultSet1.getString("Alumno");
                String materia = resultSet1.getString("Materia");
                int nota = resultSet1.getInt("Nota");
                System.out.println("ID: "+id+" Nombre: "+nombre+" Materia: "+materia+" Nota: "+nota);

            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al mostrar tabla notas");
        }
    }
}