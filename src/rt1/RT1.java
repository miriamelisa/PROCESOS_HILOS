package rt1;

import java.io.IOException;

public class RT1 {

	public static void main(String[] args) {
		//Capturar el entorno de ejecucion de la aplicacion, captura
		//el curso de ejecucion de la palicacin java
		Runtime r = Runtime.getRuntime();
		
		String comando= "NOTEPAD";
		
		//String comando= "cmd /c dir";
		//Con el commando  "cmd /c dir"; no se obtiene ninguna salida porque 
		// la salida de nuestro programa se redirige a nuestro programa java, no a la pantalla
	
		
		
		Process p;
		try {
			p=r.exec(comando);
		} catch (IOException e) {
			// TODO:
			System.out.println("Error en: "+ comando);
			e.printStackTrace();
		}
		

	}

}
