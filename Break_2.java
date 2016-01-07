package cap_03;

public class Break_2 {

	public static void main(String[] args) {
		
		done:
			for( int i=0; i < 10; i++ ){
				for( int j = 0; j < 10; j++ ){
					for( int k = 0; k < 10; k++ ){
						System.out.println(k);
						if( k == 5 ) break done;
					}
					System.out.println("Final bucle k");
				}
				System.out.println("Final bucle j");
			}
			System.out.println("Final bucle i");
	
	}

}
