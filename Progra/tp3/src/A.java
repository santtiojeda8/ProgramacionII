public class A {
    String a;
    int b, c, d;
    public A(String s, int t){
        a=s;
        b=t;
        c=0;
        d=0;
    }
    public int sumar(int k){
        int auxi=b+c+d+k;
        return auxi;
    }

    public A(String a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

}