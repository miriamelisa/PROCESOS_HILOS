package Bloqueo_Productor_ConsumidorPROFE;


public class Main_ProductorConsumidor {
	public static void main(String[] args) {

		 Deposito deposito = new Deposito();

	        Productor productor = new Productor(deposito);
	        Consumidor consumidor = new Consumidor(deposito);

	        productor.start();
	        consumidor.start();
	}

}
