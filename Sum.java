package cap_02;

public class Sum {

	public static void main(String[] args) {
		
		int sum = 1;
		for( int i = 0; i < 5; i++ ){
			sum = sum + i;
			System.out.println("Vuelta " + i + " resultado " + sum);
		}
		System.out.println("\nSum es: " + sum);

	}

}
