package javaDesde0_01;

import javax.swing.JOptionPane;

public class For_Each_2 {

	public static void main(String[] args) {
		
		String[] paises = new String[8];
		
		for ( int i = 0; i < paises.length; i++ ){
			
			paises[i] = JOptionPane.showInputDialog("Introduce PA�S " + (i+1));
			
		}
		
		/*paises[0] = "ESPA�A";
		paises[1] = "M�XICO";
		paises[2] = "COLOMBIA";
		paises[3] = "PER�";
		paises[4] = "CHILE";
		paises[5] = "ARGENTINA";
		paises[6] = "ECUADOR";
		paises[7] = "VENEZUELA";
		
		String[] paises ={"ESPA�A", "M�XICO", "COLOMBIA", "PER�", "CHILE", "ARGENTINA", "ECUADOR", "VENEZUELA"};
		
		/*for( int i = 0; i < paises.length; i++ ){
			
			System.out.println("El pa�s "+ (i+1) + " es " + paises[i]);
			
		}*/
		
		int i = 0;
		for( String elemento:paises ){
			
			System.out.println("El pa�s "+ (i+1) + " es " + elemento);
			i++;
			
		}
		
	}

}
