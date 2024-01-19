package Hilos_Semaforos;

import java.util.concurrent.Semaphore;

public class EjemploPabellon {

	public static void main(String[] args) {
		Semaphore semaforo=new Semaphore(10);
		Ejemplo_partido partido1=new Ejemplo_partido("P1",semaforo);
		Ejemplo_partido partido2=new Ejemplo_partido("P2",semaforo);
		Ejemplo_partido partido3=new Ejemplo_partido("P3",semaforo);
		Ejemplo_partido partido4=new Ejemplo_partido("P4",semaforo);
		Ejemplo_partido partido5=new Ejemplo_partido("P5",semaforo);
		Ejemplo_partido partido6=new Ejemplo_partido("P6",semaforo);
		Ejemplo_partido partido7=new Ejemplo_partido("P7",semaforo);
		Ejemplo_partido partido8=new Ejemplo_partido("P8",semaforo);
		Ejemplo_partido partido9=new Ejemplo_partido("P9",semaforo);
		Ejemplo_partido partido10=new Ejemplo_partido("P10",semaforo);
		
		partido1.start();
		partido2.start();
		partido3.start();
		partido4.start();
		partido5.start();
		partido6.start();
		partido7.start();
		partido8.start();
		partido9.start();
		partido10.start();
		
		

	}

}
