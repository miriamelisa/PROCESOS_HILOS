package rt1;

import java.util.Scanner;

public class ProcesoHijo {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String cadena= lector.nextLine();
		
		while(cadena!= null) {
			System.out.println("Proceso hijo: "+ cadena.toUpperCase());
			cadena=lector.nextLine();
		}
	}
}
