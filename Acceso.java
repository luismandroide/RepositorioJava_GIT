package javaDesde0_01;

import javax.swing.JOptionPane;

public class Acceso {

	public static void main(String[] args) {
		
		String clave = "Luis";
		String pass = "";
		
		while( clave.equals(pass) == false){
			pass = JOptionPane.showInputDialog("PASSWORD: ");
			
			if( clave.equals(pass) == false){
				System.out.println("Password incorrecto");
			}
			
		}
		System.out.println("ACCESO PERMITIDO");
		
	}

}
