import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Hello world!");
        Empleado e1 = new Empleado();
        System.out.println("Ingese su nombre");
        e1.setNombre(read.next());
        System.out.println("Ingese su sueldo");
        e1.setSueldo(read.nextInt());
        System.out.println("Ingese su fecha de ingreso");
        e1.setFechaAlta(read.next());
        System.out.println(e1.mostrarTodo());
    }
}