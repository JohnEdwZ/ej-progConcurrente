package org.programacionconcurrente;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEjemplo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Crea un pool de 3 hilos

        for (int i = 1; i <= 5; i++) {
            int tareaId = i;
            executor.submit(() -> {
                System.out.println("Tarea " + tareaId + " ejecutada por " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simula una tarea que toma tiempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
