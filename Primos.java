package cap_02;

public class Primos {

	public static void main(String[] args) {
		
		int i, j;
		boolean esPrimo;
		for( i = 2; i < 25; i++ ){
			esPrimo = true;
			for( j = 2; j <= i/j; j++ ){
			// comprueba si el número puede dividirse entre dos
				if((i%j) == 0){
					esPrimo = false;
				}
			}
			if( esPrimo ){
				System.out.println(i + " es PRIMO");
			}
		}

	}

}
