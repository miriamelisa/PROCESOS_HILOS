package rt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPing {

	public static void main(String[] args) {
		
		Runtime runtime= Runtime.getRuntime();
		Process process= null;
		
		try {//que siga asi de manera infifnita
			process = runtime.exec("ping "+ "www.google.es");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			for(int i=0; i<10; i++) {
				System.out.println("Saludo -->"+ in.readLine());
			}
		} catch (IOException e) {
			System.out.println("No se puede ejecutar el comando 'ping'");
			System.exit(-1);
			//e.printStackTrace();
		}
		if(process!=null){//para que funcione el destroy hay q añadir "-t " en el proceso
			process.destroy();
		}
		
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			System.out.println("NO SE PUDO ESPERAR SU FINALIZADO");
			System.exit(-1);
			e.printStackTrace();
		}
		System.out.println("ESTADO DE FINALIZACION: " +process.exitValue());
		System.exit(0);

	}

}
