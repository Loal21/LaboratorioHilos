package LabHilos;
public class Laboratorio2Hilos {

    public static void main(String[] args) {
        Hilos t1,t2,t3;
        t1 = new Hilos("Hilo 1 ", (int)(Math.random()*2000));
        t2 = new Hilos("Hilo 2 ", (int)(Math.random()*2000));
        t3 = new Hilos("Hilo 3 ", (int)(Math.random()*2000));
        t1.start();
        t2.start();
        t3.start();
    }
    
}
