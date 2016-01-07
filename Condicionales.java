package javaDesde0_01;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("EDAD: ");
		int edad = entrada.nextInt();
		
		if( edad < 18 ){
			System.out.println("Eres un adolescente");
		}
		else if( edad < 40 ){
			System.out.println("Eres jove");
		}
		else if( edad < 65 ){
			System.out.println("Eres maduro");
		}
		else{
			System.out.println("Cuídate");
		}

	}

}
