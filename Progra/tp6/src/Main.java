import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        Scanner sc = new Scanner(System.in);

        Profesor p1 = new Profesor(125,"David");
        Profesor p2 = new Profesor(126,"Natalia");

        Estudiante e1 = new Estudiante(1010,"Santiago");
        Estudiante e2 = new Estudiante(1011,"Pedro");
        Estudiante e3 = new Estudiante(1012,"Rodrigo");

        Inscripcion i1 = new Inscripcion(fecha,e1,"Matemática",1);
        Inscripcion i2 = new Inscripcion(fecha,e2,"SIC",2);
        Inscripcion i3 = new Inscripcion(fecha, e3,"Matemática",1);
        Inscripcion i4 = new Inscripcion(fecha,e1,"SIC",2);
        Inscripcion i5 = new Inscripcion(fecha, e3,"Matemática",1);
        Inscripcion i6 = new Inscripcion(fecha,e1,"SIC",2);

        i1.en.setInstructor(p1);
        i2.en.setInstructor(p1);
        i3.en.setInstructor(p1);
        i4.en.setInstructor(p2);
        i5.en.setInstructor(p2);
        i6.en.setInstructor(p2);

        p1.setCurso(i1.en);
        p1.setCurso(i2.en);
        p1.setCurso(i3.en);
        p2.setCurso(i4.en);
        p2.setCurso(i5.en);
        p2.setCurso(i6.en);

        e1.setFormulario(i1,1);
        e1.setFormulario(i4,2);
        e2.setFormulario(i2,3);
        e2.setFormulario(i5,4);
        e3.setFormulario(i3,5);
        e3.setFormulario(i6,6);

        //DESDE PROFESOR
        System.out.print("Profesor: "+p1.nombre );
        for (int i = 0; i < p1.curso.size(); i++) {
            System.out.print("  Asignatura: " + p1.curso.get(i).getNombre()+" ");
        }
        System.out.println(" ");

        System.out.println("Ingese el código de la Asignatura");
        int codA = sc.nextInt();
        System.out.print("Profesor: "+p1.nombre+" Legajo:"+p1.legajo);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < p1.curso.size(); i++) {
            if(codA == p1.curso.get(i).getCodigo()){
                if(count != 1){
                    count ++;
                    System.out.print("  Alumnos inscriptos en la Asignatura: "+p1.curso.get(i).getNombre());
                }
                sum++;
            }
        }
        System.out.print(" "+sum+"\n");

        //DESDE ESTUDIANTE
        System.out.println("Inscripciones del alumno "+e1.nombre);
        Collection<Inscripcion> materiase1 = e1.formulario.values();
        for (Inscripcion inscripcion : materiase1) {
            System.out.print("Materia: "+inscripcion.en.getNombre()+" Profesor/a: "+inscripcion.en.getInstructor().nombre+"\n");
        }

        //DESDE INSCRIPCION
        System.out.println("Estudiante: "+i1.inscripto.nombre+" Materia: "+i1.en.getNombre());
        System.out.println("Fecha: "+i4.getFecha()+" Profesor: "+i4.en.getInstructor().nombre);
        System.out.println("Ingrese el n° de estudiante");
        int codE = sc.nextInt();
        switch (codE){
            case 1:
                for (Inscripcion inscripcion : materiase1) {
                    System.out.print("Materia: "+inscripcion.en.getNombre()+" Profesor/a: "+inscripcion.en.getInstructor().nombre+"\n");
                }
                break;
            case 2:
                Collection<Inscripcion> materiase2 = e2.formulario.values();
                for (Inscripcion inscripcion : materiase2) {
                    System.out.print("Materia: "+inscripcion.en.getNombre()+" Profesor/a: "+inscripcion.en.getInstructor().nombre+"\n");
                }
                break;
            case 3:
                Collection<Inscripcion> materiase3 = e3.formulario.values();
                for (Inscripcion inscripcion : materiase3) {
                    System.out.print("Materia: "+inscripcion.en.getNombre()+" Profesor/a: "+inscripcion.en.getInstructor().nombre+"\n");
                }
                break;
        }
    }
}