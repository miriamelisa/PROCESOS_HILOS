package rt1;

import java.io.File;
import java.io.IOException;

public class PB4 {

	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","DIR");
		//Declaracoin de los descrptores dfe los ficheros a donde vamos 
		//a redireccionar cada salida del proceso
		////standar-->
		File fOut=new File("C:\\Prueba\\salida.txt");
		File fErr=new File("C:\\Prueba\\error.txt");
		pb.redirectError(fErr);
		pb.redirectOutput(fOut);
		//inicio del proceso
		try {
			pb.start();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		

	}

}
