public class Box <T> {
    private T obj;
    public void add(T obj) {
        this.obj = obj;
    }
    public T get(){
        return obj;
    }
}
