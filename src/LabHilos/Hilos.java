
package LabHilos;
public class Hilos extends Thread{
    private String nombre;
    private int retardo;
    
    public Hilos(String s,int d) {
        nombre = s;
        retardo = d;
    }
    public void run(){
        try {
            sleep(retardo);
        } catch (InterruptedException e) {
        }
        System.out.println("Prueba Hilos: "+nombre+retardo);
    }
    
    
}
