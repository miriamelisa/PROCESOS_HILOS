package rt1;

import java.io.BufferedReader;
import java.io.IOException;

public class DestruyoProceso {

	public static void main(String[] args) {
		
		Process miproceso= null;
		try {
		miproceso= new ProcessBuilder("notepad").start();
		Thread.sleep(1000);
		System.out.println("DESTRUYENDO EL PROCESO HIJO");
		miproceso.destroy();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
