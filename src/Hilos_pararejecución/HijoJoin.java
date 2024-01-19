package Hilos_pararejecución;

public class HijoJoin extends Thread{
	
	private int n;
	public HijoJoin(String nombre, int n) {
		//PASAS LA VARIABE CON EL NOMBRE DE LHILO
		super(nombre);
		this.n=n;
	}
	public void run() {
		for(int i=0; i<n;i++) {
			System.out.println("HILO "+ getName()+ ": " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Bucle de "+ getName()+ " Finalizado");
	}
	
	public static void main(String[] args) {
		//creacion de los hilos
		HijoJoin HJ1 =new HijoJoin("Hilo_1",2);
		HijoJoin HJ2 =new HijoJoin("Hilo_2",5);
		HijoJoin HJ3 =new HijoJoin("Hilo_3",7);
		//inicio de los hilos
		HJ1.start();
		HJ2.start();
		HJ3.start();
		
		
		
		try {
			//el método join() garantiza que la impresión 
			//final solo ocurra cuando todos los hilos hayan terminado.
			HJ1.join();
			HJ2.join();
			HJ3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("pROGRAMA fINALIZADO");
		
	}

}
