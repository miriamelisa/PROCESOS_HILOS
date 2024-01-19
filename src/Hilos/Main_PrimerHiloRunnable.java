package Hilos;

public class Main_PrimerHiloRunnable {

	public static void main(String[] args) {
		//prtimer hilo
		Clase_PrimerHiloRunnable hilo1=new Clase_PrimerHiloRunnable();
		new Thread(hilo1).start();
		
		//segundo hilo
		Clase_PrimerHiloRunnable hilo2=new Clase_PrimerHiloRunnable();
		Thread hilo = new Thread(hilo2);
		hilo.start();
		//Tercer hilo
		new Thread(new Clase_PrimerHiloRunnable()).start();
		
		

	}

}
