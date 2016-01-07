package javaDesde0_01;

import java.util.Scanner;

public class Entrada_Ejemplo_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("NOMBRE: ");
		String nombre_usuario = entrada.nextLine();
		System.out.print("EDAD: ");
		int edad = entrada.nextInt();
		System.out.println("Tu nombre es " + nombre_usuario + " y el año que viene tendrás " + (edad+1) + " años");

	}

}
