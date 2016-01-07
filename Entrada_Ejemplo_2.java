package javaDesde0_01;

import javax.swing.JOptionPane;

public class Entrada_Ejemplo_2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("NOMBRE: ");
		String edad = JOptionPane.showInputDialog("EDAD: ");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola " + nombre_usuario + ", tendrás " + (edad_usuario) + " años");

	}

}
