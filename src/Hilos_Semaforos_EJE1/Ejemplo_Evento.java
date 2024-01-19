package Hilos_Semaforos_EJE1;

import java.util.concurrent.Semaphore;

public class Ejemplo_Evento {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(3);

        // Crear instancias de Puerta fuera del bucle
        Puerta puerta1 = new Puerta("Puerta 1", semaforo);
        Puerta puerta2 = new Puerta("Puerta 2", semaforo);
        Puerta puerta3 = new Puerta("Puerta 3", semaforo);

        // Arrancar los hilos en un bucle
        for (int i = 1; i <= 3; i++) {
            puerta1.start();
            puerta2.start();
            puerta3.start();

            // Esperar a que todos los hilos terminen antes de la siguiente iteración
            try {
                puerta1.join();
                puerta2.join();
                puerta3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Obtener el conteo de personas por puerta
        System.out.println("Personas que ingresaron por Puerta 1: " + puerta1.getPersonasQueIngresaron());
        System.out.println("Personas que ingresaron por Puerta 2: " + puerta2.getPersonasQueIngresaron());
        System.out.println("Personas que ingresaron por Puerta 3: " + puerta3.getPersonasQueIngresaron());
    }
}
