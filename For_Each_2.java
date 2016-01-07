package javaDesde0_01;

import javax.swing.JOptionPane;

public class For_Each_2 {

	public static void main(String[] args) {
		
		String[] paises = new String[8];
		
		for ( int i = 0; i < paises.length; i++ ){
			
			paises[i] = JOptionPane.showInputDialog("Introduce PAÍS " + (i+1));
			
		}
		
		/*paises[0] = "ESPAÑA";
		paises[1] = "MÉXICO";
		paises[2] = "COLOMBIA";
		paises[3] = "PERÚ";
		paises[4] = "CHILE";
		paises[5] = "ARGENTINA";
		paises[6] = "ECUADOR";
		paises[7] = "VENEZUELA";
		
		String[] paises ={"ESPAÑA", "MÉXICO", "COLOMBIA", "PERÚ", "CHILE", "ARGENTINA", "ECUADOR", "VENEZUELA"};
		
		/*for( int i = 0; i < paises.length; i++ ){
			
			System.out.println("El país "+ (i+1) + " es " + paises[i]);
			
		}*/
		
		int i = 0;
		for( String elemento:paises ){
			
			System.out.println("El país "+ (i+1) + " es " + elemento);
			i++;
			
		}
		
	}

}
