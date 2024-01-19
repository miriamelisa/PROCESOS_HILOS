package Hilos_Prioridades;

public class HiloPrioridad1 extends Thread {
	
	private int c=0;
	private boolean stopHilo=false;
	
	public HiloPrioridad1(String nombre) {
		super(nombre);
	}
	//para obtener el valor del contador
	public int getContador() {
		return c;
	}
	//metodo para parar el hilo
	public void paraHilo(){
		stopHilo=true;
	}
	//para iniciar el hilo o arrancar
	public void run() {
		while(!stopHilo) {
			try {
				sleep(7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}
		System.out.println("Fin de hilo "+getName());
	}
	
	

}
