package capitulo_01;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("FILAS de la Matriz: ");
		int n = scanner.nextInt();
		System.out.print("COLUMNAS de la Matriz: ");
		int m = scanner.nextInt();
		
		// matriz de n filas y m columnas
		int mat[][] = new int [n][m];
		int num;
		
		for ( int i = 0; i < n; i++ ){
			for ( int j = 0; j < m; j++ ){
				// genero un número aleatorio entre 0 y 1000
				num = (int)(Math.random()*1000);
				// asigno el número a la matriz
				mat[i][j] = num;
			}
		}
		for ( int i = 0; i < n; i++ ){
			for ( int j = 0; j <m; j++ ){
				// imprimo la celda de la matriz
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
