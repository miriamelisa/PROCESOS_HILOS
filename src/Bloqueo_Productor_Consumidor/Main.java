package Bloqueo_Productor_Consumidor;

public class Main {

	public static void main(String[] args) {

		 Deposito deposito = new Deposito();

	        Productor productor = new Productor(deposito);
	        Consumidor consumidor = new Consumidor(deposito);

	        productor.start();
	        consumidor.start();
	}

}
