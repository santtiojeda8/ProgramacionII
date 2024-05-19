import java.io.*;
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        File ficheroR = new File("randomOrdenado1-100.txt");
        File fichero1 = new File("random1-100.txt");
        ArrayList<String> lines = new ArrayList<>();

        try(Scanner sc = new Scanner(fichero1)) {
            while(sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        }
        //Se ordena de mayor a menor
        //Collections.sort(lines,(b,a) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));
        //Se ordena de menor a mayor
        Collections.sort(lines, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));

        try(FileWriter fw = new FileWriter(ficheroR)){
            for(String line: lines){
                fw.write(line+ "\n");
            }
        }

        long t1 = System.currentTimeMillis();

        File fichero = new File("datos.txt");
        File fichero2 = new File("datosOrdenados.txt");

        ArrayList<String> lines1 = new ArrayList<>();

        try(Scanner reader = new Scanner(new FileReader(fichero))) {
            while(reader.hasNextLine()) {
                lines1.add(reader.nextLine());
            }
        }
        Collections.sort(lines1);

        try(FileWriter fw = new FileWriter(fichero2)) {
            for(String line: lines1){
                fw.write(line+"\n");
            }
        }



        File fichero = new File("datos.txt");
        try{
            nombresFichero(fichero);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }

    public static void nombresFichero (File fichero) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese el documento");
            String docBuscado = read.nextLine();

            String linea;
            boolean find= false;
            while ((linea = br.readLine()) != null) {
                ArrayList<String> partes= new ArrayList<>(List.of(linea.split(" ")));

                String nombre = partes.get(0);
                String edad = partes.get(1);
                String doc= partes.get(2);


                if(doc.equals(docBuscado)){
                    System.out.println("Documento encontrado: "+ nombre +" "+ edad);
                    find = true;
                    break;
                }
            }
            if(!find){
                System.out.println("El documento ingresada no existe");
            }
        }
    }
    */
    }
}
