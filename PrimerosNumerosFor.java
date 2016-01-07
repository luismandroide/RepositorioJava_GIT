package capitulo_01;

import java.util.Scanner;

public class PrimerosNumerosFor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("n: ");
		int n = scanner.nextInt();
		//int i = 1;
		
		for ( int i = 1; i <= n; i++ ){
			System.out.println(i);
		}
		
	}
	
}
