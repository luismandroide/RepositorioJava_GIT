package cap_03;

public class Break {

	public static void main(String[] args) {
		
		int i;
		
		for( i = 1; i < 4; i++ ){
			
			uno:{
				dos:{
			  		tres:{
						System.out.println("\ni es " + i);
						
						if( i == 1 ) break uno;
						if( i == 2 ) break dos;
						if( i == 3 ) break tres;
						
						System.out.println("BLOQUE tres");
					}			
					System.out.println("BLOQUE dos");
				}			
				System.out.println("BLOQUE uno");
			}
			System.out.println("BLOQUE for");
		}

	}

}
