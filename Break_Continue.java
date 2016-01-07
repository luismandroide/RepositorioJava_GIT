package javaDesde0_01;

public class Break_Continue {

	public static void main(String[] args) {
		
		for( int i  = 0; i < 5; i++ ){
			
			System.out.println("CICLO número " + i);
			
			if( i == 3){
				//break;
				continue;
			}
			System.out.println("i vale "+ i);
			
		}
		
		System.out.println("FINAL");
	}

}
