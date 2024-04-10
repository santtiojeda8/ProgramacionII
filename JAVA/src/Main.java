public class Main {
    public static void main(String[] args) {
        Auto a1=new Auto();
        System.out.println("El auto tiene "+ a1.getRuedas() +" ruedas");
        //Vamos a modificar un private con un set.
        a1.setRuedas(6);
        System.out.println("El auto tiene "+ a1.getRuedas() +" ruedas");
        System.out.println("El ancho del auto es " + a1.getAncho()+"cm");
        //Mostramos el peso del chasis
        System.out.println(a1.getPeso());
        // Mostramos y cambiamos el tipo del motor
        System.out.println(a1.getMotor());
        a1.setMotor(1.8F);
        System.out.println(a1.getMotor());
        //Cambiamos el peso del chasis del auto
        a1.setPeso(1800F);
        System.out.println(a1.getPeso());
        //Forma de mostrar algunos de los datos con un solo métooo
        System.out.println(a1.mostrarTodo());
        //Modificamos y mostramos un private boolean.
        // Con los boolean en vez de get para nombrar la variable se usa is.
        a1.setAireAcondicionado(false);
        System.out.println(a1.isAireAcondicionado());
        //Hacemos lo mismo con los asietos
        a1.setAsientosCuero(true);
        System.out.println(a1.isAsientosCuero());
        //vamos a ingresar el método de peso_total
        a1.setPeso_total(2500);
        System.out.println("El peso total del auto es "+a1.getPeso_total()+" kg");


    }
}