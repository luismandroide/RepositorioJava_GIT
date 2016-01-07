package capitulo_01;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		// defino un array de 5 enteros
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un valor: ");
		int v = scanner.nextInt();
		int i = 0;
		
		// mientras v sea distinto de 0 AND i sea menor que 10
		while ( v!=0 && i<10){
			// asigna v en arr[i] y luego incrementa el valor de i
			arr[i++] = v;
			// leo el siguiente valor
			System.out.print("Ingrese otro valor: ");
			v = scanner.nextInt();
		}

		// recorro el array mostrando su contenido
		for ( int j = 0; j < i; j++){
			System.out.println(arr[j]);
		}
		
	}

}
