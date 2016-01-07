package cap_03;

public class SumaMatrices {

	public static void main(String[] args) {
		
		int [][] matrizA = {{1,2},{3,4}};
		int [][] matrizB = {{5,6},{7,8}};
		int contador = 0;
		
		for( int i = 0; i < matrizA.length; i++ ){
			
			for( int j = 0; j < matrizA[i].length; j++ ){
				
				matrizA[i][j] = ++ contador;
				System.out.print(matrizA[i][j] + "\t");
				
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for( int i = 0; i < matrizB.length; i++ ){
	
			for( int j = 0; j < matrizB[i].length; j++ ){
		
				matrizB[i][j] = ++ contador;
				System.out.print(matrizB[i][j] + "\t");
		
			}
	
			System.out.print("\n");
		}
		
		System.out.print("\n");	
		
		int [][] resultante = new int [2][2];
		
		for( int i = 0; i < matrizA.length; i++ ){
			
			for( int j = 0; j < matrizA[i].length; j++ ){
				
				resultante [i][j] = matrizA [i][j] + matrizB [i][j];
				System.out.print(resultante [i][j] + "\t");
				
			}
			
			System.out.print("\n");
		}

	}

}
