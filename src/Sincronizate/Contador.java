package Sincronizate;

public class Contador {
	private int cont=0;
	public Contador (int c) {
		cont =c;
	}
	
	public void incrementa() {
		cont++;
	}
	public void decrementar() {
		cont--;
	}

	public int getCont() {
		return cont;
	}


}
