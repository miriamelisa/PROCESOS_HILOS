package rt1;

import java.io.File;
import java.io.IOException;

public class PB5 {

	public static void main(String[] args) {
		//ESTAMOS UTILIZANDO COMANDOS DESDE ECLIPSE
		//PARA CREAR CARPETAS, CAPTURAR ERRORES, SALIDAS ETC
		
		//CREAMOS UN FICHERO DENTRO DE PRUEBA con extension.bat
		
		//C:\Prueba\fichero.bat
		//mkdir c:\Prueba\NUEVO --> creams un directorio'NUEVO' dentro de prueba
		//cd C:\Prueba\NUEVO--> ME UBICO EN EL DIRRECTORIO CREADO
		//echo FFIICHEROO creado!! --->mensaje por consola de creacion del fichero
		//echo CERACION FICHERO> C:\Prueba\NUEVO\Mifichero.txt
		//dir c:\Prueba
		//dirr C:\Purbea #comando erroreno
		//echo FIN EJECUCIÓN COMANDOS!!!
		
		ProcessBuilder pb= new ProcessBuilder("CMD");
		//	Un descriptor por cada fichero, salida,errores y entrada
		File fOut=new File("C:\\Prueba\\salida.txt");
		File fErr=new File("C:\\Prueba\\error.txt");
		File fBat=new File("C:\\Prueba\\fichero.bat");
		
		//Redireccionar
		pb.redirectError(fErr);
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
