package capitulo_01;

import java.util.Scanner;

public class SumaValores {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un n�mero: ");
		int n1 = scanner.nextInt();
		System.out.print("Ingresa otro n�mero: ");
		int n2 = scanner.nextInt();
		int n = n1+n2;
		System.out.println("La suma de " + n1 + " y " + n2 + " es " + n);
		
	}
	
}
