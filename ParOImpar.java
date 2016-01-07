package capitulo_01;

import java.util.Scanner;

public class ParOImpar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("NÚMERO: ");
		int v = scanner.nextInt();
		// obtenemos el resto de dividir v entre 2
		int resto = v % 2;
		
		if ( resto == 0 ){
			System.out.println(v + " es PAR");
		}
		else{
			System.out.println(v + " es IMPAR");
		}
		
	}
	
}
