import static java.lang.Thread.yield;
class Animal extends Thread {
    String nombre;
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        synchronized(nombre) {
            for (int x = 0;x<5 ;x++) {
                System.out.print(this.getPriority()+"- "+nombre +"- ");
                System.out.println("hilo actual: ->"+Thread.currentThread());
                if (this.isAlive()) System.out.println(" En carrera");
                Thread.yield();
            }
            System.out.println("\nLlega "+nombre);
        }
    }
}
class AnimalThreads {
    static Animal tortuga;
    static Animal liebre;
    static Animal leopardo;
    static Animal rata;
    static Animal koala;
    public static void main (String argv[]) throws InterruptedException {
        tortuga = new Animal("Tortuga");
        tortuga.setPriority(1);

        koala = new Animal("Koala");
        koala.setPriority(2);

        liebre = new Animal("Liebre");
        liebre.setPriority(3);
        rata = new Animal("Rata");
        rata.setPriority(6);
        leopardo = new Animal("Leopardo");
        leopardo.setPriority(10);
        tortuga.start();
        koala.start();
        rata.start();
        liebre.start();
        leopardo.start();
        tortuga.join();
        koala.join();
        rata.join();
        liebre.join();
        leopardo.join();
    }
}
