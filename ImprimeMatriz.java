package cap_03;

public class ImprimeMatriz {

	public static void main(String[] args) {
		
		int contador = 0;
		int [][] x = new int [3][3];
		
		for( int i = 0; i < x.length; i++ ){
			
			for( int j = 0; j < x[i].length; j++ ){
				
				x[i][j] = ++ contador;
				System.out.print(x[i][j] + "\t");
				
			}
			
			System.out.print("\n");
		}

	}

}
