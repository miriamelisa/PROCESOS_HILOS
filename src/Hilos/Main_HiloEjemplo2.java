package Hilos;

public class Main_HiloEjemplo2{
	public static void main(String[] args) {
		Clase_HiloEjemplo2 h=null;
		for(int i=0; i<3; i++) {
			h=new Clase_HiloEjemplo2(i+1);
			h.start();
			
		}
		
		System.out.println("3 Hilos iniciados...");
	}

}
