package Hilos;

public class HiloEjemplo3 extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Dentro del hilo --> " + Thread.currentThread().getName());
			System.out.println("Prioridad: " + Thread.currentThread().getPriority());
			System.out.println("Identificador: "+ Thread.currentThread().getId());
			System.out.println("Hilos Activos: "+ Thread.currentThread().activeCount());
			
	}
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("Principal");
		System.out.println("Nombre: "+ Thread.currentThread().getName());
		System.out.println("Nombre: "+ Thread.currentThread().toString());
		
		HiloEjemplo3 h=null;
		for(int i=0;i<3;i++) {
			//creacion hilo
			h = new HiloEjemplo3();
			//asignar nombre al hilo
			h.setName("Hilo "+i);
			//asignar prioridad
			h.setPriority(i+1);
			//inicializar el hilo 
			h.start();
			System.out.println("Informacion del hilo " + h.getName()+ ": "+h.toString());
		}
		System.out.println("3 Hilos iniciados...");
		System.out.println("Hilo Activo: "+Thread.activeCount());
	}

	

	}

