package Sincronizate_Cajero;

public class Cuenta {
	
	private int saldo;

	public Cuenta(int s) {
		this.saldo = s;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	void restarSaldo(int cantidad) {
	saldo=saldo-cantidad;
	}
	synchronized void comprobarDinero(int cant,String nombre) {
		if(getSaldo()>=cant) {
			System.out.println(nombre + " va a sacar dinero. Saldo actual: "+getSaldo()+ " €");
		
			restarSaldo(cant);
			System.out.println(nombre + " ha sacado " + cant+ " €. El saldo actual es: "+getSaldo()+ " €");
		}else {
			System.out.println(nombre + " no pudo sacar dinero, no hay saldo suficiente. Saldo actual: "+getSaldo()+ " €");
		
		}
		
	}
	
	
	
	

}
