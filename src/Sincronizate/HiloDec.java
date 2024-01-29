package Sincronizate;

public class HiloDec extends Thread {
	private Contador contador;

	public HiloDec(String n,Contador c) {
		super(n);
		this.contador = c;
	}
	public void run() {
		
		for (int i = 0; i <10; i++) {
			synchronized (contador) {
			contador.decrementar();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("En el hilo " + getName()+ " el contador vale "+contador.getCont());
			}
		}
	
	

}
}
