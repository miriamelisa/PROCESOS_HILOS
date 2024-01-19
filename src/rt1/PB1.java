package rt1;

import java.io.IOException;

public class PB1 {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("NOTEPAD");
		
		//ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR C:");
		//Con el commando  "CMD", "/C", "DIR C:"; no se obtiene ninguna salida porque 
		// la salida de nuestro programa se redirige a nuestro programa java, no a la pantalla
		try {
			Process p = pb.start();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
