package Bloqueo_Hilos_Parque;

public class Main {
	
	public static void main (String[] args) {
		
		Parque_ObjetoCompartido parque=new Parque_ObjetoCompartido();
		
		Puerta_Hilo puerta1=new Puerta_Hilo(parque,"Puerta1");
		Puerta_Hilo puerta2=new Puerta_Hilo(parque,"Puerta2");
		Puerta_Hilo puerta3=new Puerta_Hilo(parque,"Puerta3");
		
		puerta1.start();
		puerta2.start();
		puerta3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		puerta1.parar();
		puerta2.parar();
		puerta3.parar();
		
		try {
			puerta1.join();
			puerta2.join();
			puerta3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

}
}