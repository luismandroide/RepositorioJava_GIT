package capitulo_01;

import java.util.Scanner;

public class BasesNumericas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("VALOR ENTERO: ");
		int v = scanner.nextInt();
		System.out.println(v + " en BINARIO: " + Integer.toBinaryString(v));
		System.out.println(v + " en OCTAL: " + Integer.toOctalString(v));
		System.out.println(v + " EN HEXADECIMAL: " + Integer.toHexString(v));
		System.out.print("BASE NUMÉRICA: ");
		int b = scanner.nextInt();
		String sBaseN = Integer.toString(v, b);
		System.out.println(v + " en base " + b + " = " + sBaseN);

	}

}
