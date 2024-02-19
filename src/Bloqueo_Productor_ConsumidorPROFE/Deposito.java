package Bloqueo_Productor_ConsumidorPROFE;

public class Deposito {
	private int deposito;
	private static final int CAPACIDAD=10;
	
	public Deposito() {
		this.deposito=0;
	}
	public synchronized void agregar() {
		
		while(this.deposito==CAPACIDAD) {
			System.out.println("DEPOSITO LLENO....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.deposito++;
			System.out.println("Agregando producto, total: " + getDeposito());
			notify();
	
		
	}
	public synchronized void retirar() {
		while(this.deposito==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.deposito--;
			System.out.println("Retirado producto, total: "+getDeposito());
			notify();
		
	}
	public int getDeposito() {
		return this.deposito;
	}
	
}
