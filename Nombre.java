package capitulo_01;

import java.util.Scanner;

public class Nombre {
	
	public static void main(String[] args) {
		
		// esta clase permite leer datos por teclado
		Scanner scanner = new Scanner(System.in);
		// mensaje para el usuario
		System.out.println("NOMBRE: ");
		// leemos un valor por teclado y lo almacenamos en la variable nom
		String nom = scanner.nextLine();
		// mostramos un mensaje y el valor leido en la variable nom
		System.out.println("Hola "+ nom);
		
	}
	
}
