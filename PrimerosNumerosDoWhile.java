package capitulo_01;

import java.util.Scanner;

public class PrimerosNumerosDoWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("n: ");
		int n = scanner.nextInt();
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}
		while ( i <= n );
		
	}
	
}
