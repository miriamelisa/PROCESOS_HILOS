package Bloqueo_Hilos_Parque;

public class Puerta_Hilo extends Thread {
	private Parque_ObjetoCompartido parque;
	private boolean continua=true;
	private int cuenta=0;
	
	public Puerta_Hilo(Parque_ObjetoCompartido parque, String puerta) {
		super(puerta);
		this.parque=parque;
	}
	
	public void parar() {
		continua=false;
	}
	
	public void run() {
		while(continua) {
			parque.sumar();
			cuenta++;
		}
		System.out.println("Total visitantes por " +getName()+ ": "+ cuenta);
		
	}
}
