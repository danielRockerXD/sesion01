package sesion01;

import java.util.Scanner;

public class Hola {
	public static void main(String[] args) {
		//imprimir la entrada
		System.out.println("bienfvenido mitocyode 2020");
		
		//capturar valores de la consola
		Scanner SC = new Scanner(System.in);
		System.out.println("¿cual es tu nombre?");
		
		String nombre =SC.nextLine();
		System.out.println("bienvenidos " + nombre);
		
		SC.close();
		
	
	}
}
