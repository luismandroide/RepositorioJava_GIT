package javaDesde0_01;

import java.util.Scanner;

public class Refundicion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("NUMERO ENTERO: ");
		int numeroEntero = scanner.nextInt();
		double numeroDecimal = Math.sqrt(numeroEntero);
		int numeroFinal = (int) Math.round(numeroDecimal);
		// convertimos el double a int y lo redondeamos a 15
		System.out.println("La raíz cuadrada de " + numeroEntero + " es " + numeroDecimal);
		System.out.println("Y su redondeo es " + numeroFinal);
			
	}

}
