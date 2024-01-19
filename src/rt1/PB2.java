package rt1;

import java.io.IOException;
import java.io.InputStream;

public class PB2 {

	public static void main(String[] args) {
		Process p=null;
		
		try {
			p = new ProcessBuilder("CMD","/C","DIR C:").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream is=p.getInputStream();
		int c;
		try {
			while((c= is.read()) != -1) {
				System.out.print((char)c);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//comprobar error
		int exival;
		try {
			exival=p.waitFor();
			System.out.println("\n valor de salida: "+exival);
			
			if(exival !=0) {
				System.out.println("\n Error en la ejecucion  de la sentencia");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
