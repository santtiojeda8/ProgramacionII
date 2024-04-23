public class Main {
    public static void main(String[] args) {
        Prueba p1 = new Prueba(1,"Seba");
        Atleta a1 = new Atleta("Ñoqui",p1);
        System.out.println(p1.get);

    }
    /*
    public boolean hayPesoExtra(float imc){
        if (imc >25 && imc < 29.9){
            return true;
        }
        return false;
    }

    public float calcularIMC(){
        float imc= (float) (65/(Math.pow(1.67,2)));
        return imc;
    }
    for (Instalacion p : Instalacion){
        if(p == Instalacion[2]){
            int códigoGuardado = p.getCategoria();
        }
    }
    */
    for (Atleta a:Atleta){
        if (a.getParticipa().getCodigo() == 1){
            return calcularIMC();
        }
        return "";
    }
    for (Instalacion i: Instalacion){
        if (i.getSeHace().getCodigo()==2){
            if(i.getseHace().getParticipa().getAtleta().getCodigoAtleta == 3) {
                System.out.println(i.getSeHace().getParticipa().getNombre);
                break;
            }
        }
    }
}