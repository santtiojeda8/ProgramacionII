import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Atleta a1= new Atleta(1.65F,70,"Santiago",19,"94205043");
        Atleta a2= new Atleta(1.70F,70,"Agustin",19,"45966570");
        Atleta a3= new Atleta(1.80F,78,"Santino",20,"44454245");
        Atleta a4 = new Atleta(1.64F,63,"Martin",21,"46850772");
        Prueba p1 = new Prueba("A1","Correr");
        Prueba p2 = new Prueba("A2","Saltar");
        Instalacion i1= new Instalacion("Gimnsasio","cerrado","OJEDAGYM","M");
        EquipoNacional en1 = new EquipoNacional();
        Sede s1 = new Sede("29/04/2024","10:02",1, p1.getCodigo());

        p1.setParticipa(a1);
        p1.setParticipa(a2);
        p1.setParticipa(a3);
        p1.setParticipa(a4);

        p2.setParticipa(a1);
        p2.setParticipa(a2);
        p2.setParticipa(a3);
        p2.setParticipa(a4);

        en1.setPertenece(a1);
        en1.setPertenece(a2);
        en1.setPertenece(a4);

        i1.setSeHace(p1);
        i1.setSeHace(p2);

        i1.setSede(s1);
        p1.setDonde(i1);

        System.out.println(i1.getSeHace().get(1).getParticipa().get(2).getNombre());
        System.out.println(i1.getSeHace().get(0).getCodigo());

        for(int i=0; i<en1.getPertenece().size(); i++){
            if(en1.getPertenece().get(i).hayPesoExtra(en1.getPertenece().get(i).calcularIMC())){
                System.out.println("El atleta "+en1.getPertenece().get(i).getNombre()+" tiene sobrepeso");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");

        System.out.println(a1.calcularIMC());
        System.out.println(i1.getSeHace().get(0).getParticipa().get(0).calcularIMC());
        int pulsasciones= (int)i1.getSeHace().get(1).getParticipa().get(3).tomarPulsaciones();
        System.out.println(pulsasciones);
    }
}