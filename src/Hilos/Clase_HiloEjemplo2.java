package Hilos;

public class Clase_HiloEjemplo2 extends Thread {
	private int hilo;
	//private int c;
	//Constructor 
	public Clase_HiloEjemplo2(int hilo) {
		this.hilo=hilo;
		System.out.println("Creando hilo: "+ hilo);
	}
	
	//metodo run()
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hilo --> " +getName() + "C = "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
	
}
