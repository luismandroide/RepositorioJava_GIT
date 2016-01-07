package javaDesde0_01;

import javax.swing.JOptionPane;

public class Peso_Ideal {

	public static void main(String[] args) {
		
		String genero = "";
		
		do{
			genero = JOptionPane.showInputDialog("GENERO (H/M): ");
		}while( genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false );
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("ALTURA en cms: "));
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")){
			pesoIdeal = altura - 110;
		}
		else if( genero.equalsIgnoreCase("M")){
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " kgs");

	}

}
