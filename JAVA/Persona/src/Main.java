public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ojeda",18,"Santiago",2000);
        System.out.println(e1.getDesc());
        Alumno a1=new Alumno("Ojeda",17,"Juan","Programación");
        System.out.println(a1.getDesc());
        System.out.println(e1.mostrarTodo());
        System.out.println(a1.mostrarTodo());
        System.out.println("");
        //De la siguiente forma guradamos en un ArrayList objetos de las clases Empleado y Alumno.
        //Podemos llamar a los objetos del array de la siguiente forma
        Persona[] p1 = new Persona[3];
        p1[0]= new Alumno("Lucato",19,"Ulises","Ingeniería en Sistemas");
        p1[1]= new Empleado("De La Vega",19,"Mateo",2500);
        p1[2]= new Jefe("Ojeda",20,"Octavio",3000,500);
        for (Persona p : p1) {
            System.out.println(p.mostrarTodo());
        }

    }
}