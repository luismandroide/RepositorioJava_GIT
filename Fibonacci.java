package javaDesde0_01;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 1;
		int anterior = 0;
		int temporal;
		
		while( true ){
			
			System.out.println(n);
			temporal = n;
			n = n + anterior;
			anterior = temporal;
			
			if( n > 30 ){
				break;
			}
			
		}
		
	}

}
