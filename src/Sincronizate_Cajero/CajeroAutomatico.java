package Sincronizate_Cajero;

public class CajeroAutomatico {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(60);
		
		SacarDinero sc1=new SacarDinero("Agus", c);
		SacarDinero sc2 = new SacarDinero("Javier", c);
		sc1.start();
		sc2.start();

	}

}
