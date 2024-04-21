import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
        Empleado e1 = new Empleado("26/06/2021", "Octavio", 300);
        e1.aumentarSalario();

        System.out.println("Ingese su nombre");
        e1.setNombre(read.next());
        System.out.println("Ingese su sueldo");
        e1.setSueldo(read.nextDouble());
        System.out.println("Ingese la fecha en la que fue dado de alta (dd/mm/aaaa)");
        e1.setFechaAlta(read.next());
        System.out.println(e1.mostrarTodo());
        System.out.println("Como su salario esta desactualizado vamos a aumentarselo un 10%");
        System.out.println("Su salario aumentado es de $"+e1.aumentarSalario());

        Empleado e2 = new Empleado("27/07/2020", "Santiago", 200);
        e2.aumentarSalario();
        System.out.println(e1.mostrarTodo());
        System.out.println(e2.mostrarTodo());

        // Estamos llamando al metodo MostrarTodo para mostrar todos los datos
        //System.out.println(e1.MostrarTodo());}

        Jefe j1 = new Jefe("25/05/2022", "Pedro", 400, 100);
        j1.setIncentivo(50);
        System.out.println(j1.mostrarTodo());

            Asignamos el objeto ya creado de la clase Jefe a un nuevo objeto de la clase Empleado,
            a esto se le llama Polimorfismo y podemos llamar al objeto de la clase Jefe como un
            objeto de la clas Empleado.
        Empleado e3 = j1;
        System.out.println(e3.mostrarTodo());
         */
        Empleado [] e3 = new Empleado[3];
        e3[0] = new Empleado("26/06/2022", "Miguel", 300);
        e3[1] = new Jefe("27/07/2022", "Pedro", 200,100);
        e3[2] = new Empleado("27/08/2021", "Martin", 100);
        Jefe j1= new Jefe("27/05/2020","Santiago",300,150);

        Arrays.sort(e3);

        for (Empleado e : e3) {
            System.out.println(e.mostrarTodo());
        }

        System.out.println(j1.tomarDecisiones("irse de gira"));

        System.out.println(j1.estableceBonus(60));

        System.out.println(e3[0].estableceBonus(20));

        System.out.println(e3[1].estableceBonus(30));
    }
}