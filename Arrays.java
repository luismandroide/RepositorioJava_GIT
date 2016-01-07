package javaDesde0_01;

public class Arrays {

	public static void main(String[] args) {
		
		/*int[] mi_matriz = new int[5];
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		System.out.println("La posición 3 de mi_matriz contiene el entero "+ mi_matriz[3]);*/
		
		int[] mi_matriz = {5, 38, -15, 92, 71};
		
		//for( int i = 0; i < 5; i++ ){
		for( int i = 0; i < mi_matriz.length; i++ ){
			System.out.println("El índice " + i + " de mi_matriz contiene el entero "+ mi_matriz[i]);
		}
		
	}

}
