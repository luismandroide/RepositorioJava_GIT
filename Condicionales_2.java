package javaDesde0_01;

import java.net.StandardSocketOptions;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opci�n: \n1: CUADRADO\n2: RECT�NGULO\n3: TRI�NGULO\n4: C�RCULO");
		int figura = entrada.nextInt();
		
		switch( figura ){
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				System.out.println("El �rea del CUADRADO es " + Math.pow(lado, 2));
				break;
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El �rea del RECT�NGULO es " + base*altura);
				break;
			case 3:
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println("El �rea del TRI�NGULO es " + (base*altura/2));
				break;
			case 4:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				System.out.print("El �rea del C�RCULO es ");
				System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
				break;
			default:
				System.out.println("La opci�n no es correcta");
			
		}

	}

}
