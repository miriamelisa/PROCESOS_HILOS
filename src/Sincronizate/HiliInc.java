package Sincronizate;

public class HiliInc extends Thread {
	private Contador contador;

	public HiliInc(String n,Contador c) {
		super(n);
		this.contador = c;
	}
	public void run() {
		
			
		for (int i = 0; i <10; i++) {
			synchronized (contador) {
			contador.incrementa();
			System.out.println("En el hilo " + getName()+ " el contador vale "+contador.getCont());
			}
		}
		
		
	}
	
	

}
