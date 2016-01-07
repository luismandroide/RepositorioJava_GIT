package capitulo_01;

import java.util.Scanner;

public class ParOImparIn_Line {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("NÚMERO: ");
		int v = scanner.nextInt();
		// obtenemos el resto de dividir v entre 2
		int resto = v % 2;
		
		// utilizando un if-inline
		String mssg = ( resto == 0 ) ? " es PAR" : " es IMPAR";
		System.out.println(v + mssg);
		
	}
	
}
