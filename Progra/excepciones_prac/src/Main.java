import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, NoPositivosException {
        Scanner read = new Scanner(System.in);
        /*
        System.out.println("Ingrese su nombre");
        try {
            String a = read.next();
            if (a.substring(0,1).equals(a.substring(1,2))) {
                throw new MyException("Doble letra al principio");
            }
        }
        catch(MyException e) {
            System.out.println(e.getMessage());
        }
         */

        int[]num=new int[3];
        System.out.println("Ingrese tres enteros negativos");
        num[0]= read.nextInt();
        num[1]= read.nextInt();
        num[2]= read.nextInt();
        int sum=0;
        boolean a= false;
        try {
            for (int i = 0; i < 3; i++) {
                if (num[i]>0) {
                    throw new NoPositivosException("Ingresó un numero positivo");

                }else{
                    a=true;
                }
            }
            if (a) {
                for (int j = 0; j < 3; j++) {
                    sum+=num[j];
                }
                System.out.println(sum);
            }

        }catch(NoPositivosException e){
            System.out.println(e.getMessage());
        }
    }
}