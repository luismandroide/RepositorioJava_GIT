package capitulo_01;

import java.util.Scanner;

public class NombreEdadAltura {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("NOMBRE, EDAD y ALTURA: ");
		String nom = scanner.next();
		int edad = scanner.nextInt();
		double altura = scanner.nextDouble();
		System.out.println("NOMBRE: " + nom);
		System.out.println("EDAD: " + edad);
		System.out.println("ALTURA: " + altura);
		
	}
	
}
