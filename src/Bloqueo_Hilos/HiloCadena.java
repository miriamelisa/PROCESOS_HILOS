package Bloqueo_Hilos;

public class HiloCadena extends Thread {
	private  ObjetoCompartido objeto;
		String cadena;
		
		public HiloCadena(ObjetoCompartido c, String s) {
			
			this.objeto = c;
			this.cadena = s;
		}
	

		public void run() {
			synchronized (objeto) {
				for (int i = 0; i <10; i++) {
					objeto.escribeCadena(cadena);
					//notifica q ha terminado para q pueda entrar el otro 
					//avisa q ha dejado de utilizar el objeto 
					objeto.notify();
					
					//bloquear hilo(en espera)
					try {
						objeto.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("SE ha termiando de ejecutar el hilo "+getName() );
				objeto.notify();
				//Notificamos q ha termiando el hilo
			}
			
			
		}
		
	

}
