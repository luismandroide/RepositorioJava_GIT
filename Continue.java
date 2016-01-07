package cap_03;

public class Continue {

	public static void main(String[] args) {
		
		outerloop:
		
			for( int i = 1; i < 10; i++ ){
				System.out.print("\ni: " + i+ " y j: ");
				for( int j = 1; j < 10; j++ ){
					if( j == 5) continue outerloop;
					System.out.print(j);
				}
			}

	}

}
