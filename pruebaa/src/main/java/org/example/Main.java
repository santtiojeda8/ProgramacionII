package org.example;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        long t1 = System.currentTimeMillis();

        File fichero = new File("palabra4.txt");
       // File fichero = new File("palabraOrdenada.txt");
        List<String> lineas = new ArrayList<>();
        String palabraBuscada = "manzana";
        int i = 0;

        try (Scanner s = new Scanner(new FileReader(fichero))) {
            while (s.hasNext()) {
                if(s.next().equals(";")){
                    lineas.add(s.next());
                }

            }



            Collections.sort(lineas);
//            for(String linea:lineas){
//                System.out.println(linea);
//            }
            int inicio = 0;
            int fin = lineas.size() - 1;

           // System.out.println("... Leyendo el contenido del fichero ...");
            while(inicio<=fin){
                int medio = (inicio+fin)/2;
                String palabraMedio = lineas.get(medio);
                int comparacion = palabraMedio.compareTo(palabraBuscada);
                if(comparacion==0){
                    System.out.println("Palabra encontrada en posicion "+ medio);
                    System.out.println("Palabra encontrada luego de dividir la lista " + i + " veces");
                    break;
                }else if(comparacion < 0 ){
                    inicio = medio +1;
                    i++;
                }else{
                    fin = medio -1;
                    i++;
                }
            }

            try(FileWriter writer = new FileWriter("palabraOrdenada.txt")){
                for(String linea:lineas ){
                    linea=linea.split(" ")[0];
                    if(!linea.equals(";")){
                        writer.write(linea + "\n");
                    }

                }
                System.out.println("Archivo ordenado correctamente");

            }catch(Exception e){
                System.out.println("Error al escribir el archivo ordenado: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}