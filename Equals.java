package capitulo_01;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("PASSWORD: ");
		String s1 = scanner.next();
		System.out.print("Repite el PASSWORD: ");
		String s2 = scanner.next();
		
		if ( s1.equals(s2) ){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son distintas");
		}
	}

}
