package Hilos_Prioridades;

public class Mian_HiloPrioridad1 {
	public static void main(String[] args) {
	HiloPrioridad1 hilo1=new HiloPrioridad1("Hilo1");
	//segundo hilo
	HiloPrioridad1 hilo2=new HiloPrioridad1("Hilo2");
	//Tercer hilo
	HiloPrioridad1 hilo3=new HiloPrioridad1("Hilo3");
	
	//cuanto mayor prioridad se asigne a un hilo, su objeto deberia incrementar
	//el contador un mayor numero de veces que el resto
	
	hilo1.setPriority(Thread.NORM_PRIORITY);//prioridad normal: 5
	hilo2.setPriority(Thread.MAX_PRIORITY);//prioridad maxima: 10
	hilo3.setPriority(Thread.MIN_PRIORITY);//prioridad minima: 1

	hilo1.start();
	hilo2.start();
	hilo3.start();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	hilo1.paraHilo();
	hilo2.paraHilo();
	hilo3.paraHilo();
	//No siempre va a pasar que el hilo con mayor prioridad se ejecute antes
	System.out.println("h2 (Prioridad Maxima): " +hilo2.getContador());
	System.out.println("h1 (Prioridad Normal): " +hilo1.getContador());
	System.out.println("h3 (Prioridad Minima): " +hilo3.getContador());
	
	}

}
