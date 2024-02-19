package Sincronizate_Cajero;

public class SacarDinero extends Thread{
	private Cuenta cuenta;
	String nombre;
	
	public SacarDinero(String nombre,Cuenta cuenta) {
		super(nombre);
		this.cuenta = cuenta;
	}
	
	public void run() {
		for (int i = 1; i <=2; i++) {
			cuenta.comprobarDinero(20, getName());
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
