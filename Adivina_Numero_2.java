package javaDesde0_01;

import java.util.Scanner;

public class Adivina_Numero_2 {

public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		//System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do{
			intentos++;
			System.out.print("Introduce un NÚMERO: ");
			numero = entrada.nextInt();
			if( aleatorio < numero ){
				System.out.println("Más bajo");
			}
			else if( aleatorio > numero ){
				System.out.println("Más alto");
			}
		}while( numero != aleatorio);
			
		System.out.println("Correcto después de " + intentos + " intentos");

	}

}
