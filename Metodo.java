package javaDesde0_01;

import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Primer número: ");
		int n1 = scanner.nextInt();
		System.out.print("Segundo número: ");
		int n2 = scanner.nextInt();
		System.out.println("La suma de " + n1 + " y " + n2 + " es: " + sumar(n1,n2));

	}
	
	public static int sumar(int a,int b){
		
		return(a+b);
		
	}

}

