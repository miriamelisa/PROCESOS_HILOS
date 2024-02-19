package Bloqueo_Hilos;

public class BloqueoHilos {

	public static void main(String[] args) {
		ObjetoCompartido oc=new ObjetoCompartido();
		
		HiloCadena hc1=new HiloCadena(oc, "A");
	    HiloCadena hc2=new HiloCadena(oc, "B");
	    
	    hc1.start();
	    hc2.start();

	}

}
