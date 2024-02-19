package Bloqueo_Hilos_Parque;

public class Parque_ObjetoCompartido {
	private int cuenta=0;
	
	public int getCuenta() {
		return cuenta;
	}
	
	public synchronized void sumar() {
		cuenta++;
		System.out.println("Visitante nùmero "+getCuenta()+ " ha entrado en el parque.");
		try {
			Thread.sleep(30);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
