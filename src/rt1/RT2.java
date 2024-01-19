package rt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RT2 {

	public static void main(String[] args) {
		
		Runtime r= Runtime.getRuntime();
		
		//EJECUTA EL COMANDO Y LUEGO FINALIZA
		String comando="CMD /C DIR";
		Process p = null;
		
		try {
			//para leer la salida, lo que devuelve el metodod del 'rumtime', hay que usar 
			//el objeto 'Process', que se obtiene con el siguiente comando:
			p=r.exec(comando);
			
			//la clase 'Process' proporciona el metodo 'getInputStream' para leer el stream
			// de salida del proceso y asi leer lo que el comando ejecuta y lo escriba en consola
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String linea;
			
			//leemos linea con el metodo realine()
			while((linea = br.readLine()) != null) {
                System.out.println(linea);
			}
                 br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int exitval;
		
		try {
			//comprobacion erro -- >0: Correcto    1: Error
			exitval = p.waitFor();
			System.out.println("\n Valor de salida: "+exitval);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
