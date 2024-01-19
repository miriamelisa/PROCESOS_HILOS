package Hilos_Semaforos_EJE1;

import java.util.concurrent.Semaphore;

public class Puerta extends Thread {
    private int personasQueIngresaron = 0;
    private Semaphore semaforo;

    public Puerta(String nombrePuerta, Semaphore semaforo) {
        super(nombrePuerta);
        this.semaforo = semaforo;
    }

    public void run() {
        try {
            semaforo.acquire();

            // Entrada
            System.out.println(getName() + ": Ha entrado una persona.");
            personasQueIngresaron++;

            sleep(1000);

            // Salida
            System.out.println(getName() + ": Ha salido una persona.");

            semaforo.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPersonasQueIngresaron() {
        return personasQueIngresaron;
    }
}

