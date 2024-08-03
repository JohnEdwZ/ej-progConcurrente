package org.programacionconcurrente;

public class HiloEjemplo extends Thread {
    private String nombre;

    public HiloEjemplo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + ": " + i);
            try {
                Thread.sleep(1000); // Simula una tarea que toma tiempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        HiloEjemplo hilo1 = new HiloEjemplo("Hilo 1");
        HiloEjemplo hilo2 = new HiloEjemplo("Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}
