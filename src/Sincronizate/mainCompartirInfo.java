package Sincronizate;

public class mainCompartirInfo {

	public static void main(String[] args) {
		Contador cont = new Contador(100);
		HiliInc HInc = new HiliInc("Incrementado", cont);
		HiloDec HDec = new HiloDec("Decrementado", cont);
		
		HInc.start();
		HDec.start();
		
		
		

	}

}
