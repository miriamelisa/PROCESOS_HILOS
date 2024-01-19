package Hilos;
//se crean 3 hilos en el main()
//Cada hilo muestra un mensaje del hijo(Thread) que se esta ejecutando
public class HiloEjemplo1 extends Thread{

	//se pasa como parametro el nombre del hilo. si no se pasa el nombre lo asigna java automaticamente
	//agina un nombre automaticamente(Therad-0,Thread -1,...Thread -n)
	public HiloEjemplo1(String nombreHilo) {
		super(nombreHilo);
		System.out.println("Creando hilo: " + getName());
		// TODO Auto-generated constructor stub
	}
//CODIGO QUE VA A AJECUTAR CADA UNO DE LOS HILOS QUE CREEMOS CON RUM
	//mETODO run(), con el codigo a ejecutar por cada hilo
	public void run() {
		//cinco repeticiones por cada hijo
		for(int i=0;i<5;i++) {
			System.out.println("Hilo --> " +getName() + "C = "+i);
			//parar o interrumpir 
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		HiloEjemplo1 h1=new HiloEjemplo1("HILO 1 ");
		HiloEjemplo1 h2=new HiloEjemplo1("HILO 2 ");
		HiloEjemplo1 h3=new HiloEjemplo1("HILO 3 ");
		//inicializamos
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 Hilos iniciados...");
		
		

	}

}
