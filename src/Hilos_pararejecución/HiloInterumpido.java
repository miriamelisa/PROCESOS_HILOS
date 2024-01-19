package Hilos_pararejecución;

public class HiloInterumpido extends Thread {

	//iniciarlo 
	public void run() {
		try {
		while(!isInterrupted()) {
			System.out.println("Estamos en el hilo ");
			
			
				sleep(1000);
			} 
		} catch (InterruptedException e) {
				System.out.println("Ha ocurrido una excepción");
			
		}
		System.out.println("hilo finalizado");
	}
	
	
	
	
	
	public static void main(String[] args) {
		HiloInterumpido H1 =new  HiloInterumpido();
		H1.start();
		try {
			sleep(2000);//ESTOS SEGUNDOS SON LOS QUE DEJPASAR PARA INTERUMPIR EL HIJO 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		H1.interrupt();
		
	}

}
