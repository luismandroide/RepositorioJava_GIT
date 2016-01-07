package capitulo_01;

import java.util.Scanner;

public class PrimerosNumerosWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("n: ");
		int n = scanner.nextInt();
		int i = 1;
		
		while ( i<= n ){
			System.out.println(i);
			// incremento el valor de i
			i++;
		}
		
	}
	
}
