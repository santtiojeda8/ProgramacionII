public class B extends A {
    private char a,b,c;
    public B(String h,int j, char m){
        super(h,j);
        a=m;//3
    }

    public B(String a, int b, int c, int d, char a1, char c1, char b1) {
        super(a, b);
        this.a = a1;
        this.c = c1;
        this.b = b1;
    }

    public B(String s, int t, char a, char c, char b) {
        super(s, t);
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public void inicializarCarB(char b){
        this.b=b;
    }

    public void muestraCars(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public int sumar(int k){
        int auxi=(int)b+(int)c+super.d+k;
        return auxi;
    }

    public int sumar(int k,int b){
        int auxi=(int)b+(int)c+super.d+k;
        return auxi;
    }

}
