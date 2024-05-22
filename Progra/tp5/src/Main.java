public class Main {
    public static void main(String[] args) {

        //RELACIÓN EMPRESA | TRABAJADOR
        Trabajador t1 = new Trabajador(94205043);
        Trabajador t2 = new Trabajador(45966570);
        Empresa e1 = new Empresa("Armoma_Mate");
        Empresa e2 = new Empresa("Armoma_Mates");
        Trabajador t3 = new Trabajador();
        t1.setEmpleador(e1);
        t2.setEmpleador(e2);
        t3.setEmpleador(e1);
        e1.setEmpleado(t1);
        e1.setEmpleado(t2);
        System.out.println("Empleador: "+t1.getEmpleador().rSocial);
        System.out.println("Empleador: "+t2.getEmpleador().rSocial);
        System.out.println("Empleador: "+ t3.getEmpleador(). rSocial);
        for (int i=0;i<e1.empleado.size();i++) {
            System.out.println("Documento: " + e1.empleado.get(i).dni);
        }

        //RELACION VIAJERO | EQUIPAJE
        Equipaje eq1 = new Equipaje("Botella",1000);
        Equipaje eq2 = new Equipaje("Llave",100);
        Equipaje eq3 = new Equipaje("Cuchillo",100);
        Equipaje eq4 = new Equipaje("Frasada",150);
        Viajero v1 = new Viajero("Santiago","M",eq3,eq4);
        v1.setGuarda(eq1);
        v1.setGuarda(eq2);
        for(int j=0;j<v1.guarda.size();j++) {
            System.out.println("Tipo: "+v1.guarda.get(j).getTipo()+" | Peso: "+v1.guarda.get(j).getPeso());
        }

        //RELACION TAXI | CHOFER
        Taxi ta1 = new Taxi("AC960DR");
        Taxi ta2 = new Taxi("GDI312");
        Taxi ta3 = new Taxi("AA759RC");
        Taxi ta4 = new Taxi("ISP165");
        Chofer c1 = new Chofer("Pedro",ta2,ta3,ta4);
        c1.setConduce(ta1);
        for(int k=0;k<c1.conduce.size();k++) {
            System.out.println("Taxi a conducir: "+c1.conduce.get(k).printMatricula());
        }

        System.out.println(t1.getEmpleador().empleado.get(1).getEmpleador().rSocial);
        for(int l=0;l<v1.guarda.size();l++) {
            System.out.println(v1.guarda.get(l).getPeso());
        }
        for(int m=0;m<3;m++) {
            System.out.println(c1.conduce.get(m).printMatricula());
        }
        for(int n=0;n<e1.empleado.size();n++) {
            if(0!= e1.empleado.get(n).dni){
                System.out.println(e1.empleado.get(n).dni);
            }
        }

    }
}