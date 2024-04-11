import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Hello world!");
        Empleado e1 = new Empleado();
        System.out.println("Ingese su nombre");
        e1.setNombre(read.next());
        System.out.println("Ingese su sueldo");
        e1.setSueldo(read.nextDouble());
        System.out.println("Ingese la fecha en la que fue dado de alta (dd/mm/aaaa)");
        e1.setFechaAlta(read.next());
        System.out.println(e1.mostrarTodo());
        System.out.println("Como su salario esta desactualizado vamos a aumentarselo un 10%");
        System.out.println("Su salario aumentado es de $"+e1.aumentarSalario());

        // Estamos llamando al metodo MostrarTodo para mostrar todos los datos
        //System.out.println(e1.MostrarTodo());}

    }
}