package capitulo_01;

import java.util.Scanner;

public class EsMayorQue21 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("EDAD: ");
		int edad = scanner.nextInt();
		
		if ( edad >= 21 ){
			System.out.println("Eres mayor de edad");
		}
		else{
			System.out.println("Eres menor de edad");
		}
		
	}
	
}
