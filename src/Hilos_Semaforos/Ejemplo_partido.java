package Hilos_Semaforos;

import java.util.concurrent.Semaphore;

public class Ejemplo_partido extends Thread{
	private Semaphore semaforo;
	public Ejemplo_partido(String nombre,Semaphore semaforo) {
		super(nombre);
		this.semaforo=semaforo;
	}
	public void run() {
		try{semaforo.acquire();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Partido "+getName()+ " se esta jugando");
		try {
			sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ha terminado el partido "+ getName());
		semaforo.release();
		
	}

}
