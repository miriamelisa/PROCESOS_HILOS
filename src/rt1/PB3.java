package rt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Iterator;


public class PB3 {

	public static void main(String[] args) {
		ProcessBuilder test = new ProcessBuilder();
		//Tratamiento de los argumentos/parametros pasados al 'main()'
		if(args.length<=0) {
			System.out.println("no tenemos argumentos\n");
		}else {
			for(int i=0; i<args.length;i++) {
				System.out.println("Argumento"+(i+1)+": "+args[i]);
			}
		}
		
		//Capturar la variablede entrono de windows
		//y las escribe por pantalla
		
		Map entorno=test.environment();
		
		System.out.println("\n Variables de entorno: ");
		System.out.println(entorno);
		
		//creamos un proceso
		test=new ProcessBuilder("java","unSaludo", "\"Hola Mundo!!\"");
		
		//devuelve el nombre del programa/proceso y sus argumentos
		List l =test.command();
		Iterator iter = l.iterator();
		System.out.println("\n Argumento del comando: ");
		while(iter.hasNext()) 
		{
			System.out.println(iter.next());
		}
		test.command("CMD","/C","DIR");
		try {
			Process p = test.start();
			//Capturar la salida del proceso hijo pata mostrarla por consola
			InputStream is=p.getInputStream();
			//Escribir linea por linea la salida del proceso hijo para mostrarlo por consola
			//utilizando un buffer(BufferReader)
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String linea;
			while((linea = br.readLine()) !=null){
				System.out.println(linea);
			}
					} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
