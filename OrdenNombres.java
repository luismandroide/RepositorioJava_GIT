package cap_03;

import java.util.Arrays;

public class OrdenNombres {

	public static void main(String[] args) {
		String nombres[ ] = { "Miguel" , "María", "Alberto", "Fernando","Alejandro", "Rosa" , "Evaristo", "Bernardo",
				              "Francisco" , "Homero", "Cristina" , "Carla", "César" };
	         System. out.println("El orden original:" ) ;
	         
	         for (int i = 0; i < nombres. length; i++) {
	             
	        	 System.out.print( i + " : " + nombres[i] + " " );
	         
	         }
	         Arrays.sort(nombres) ;
	         System. out.println("\nEl nuevo orden: ");
	         
	         for (int i = 0; i < nombres. length; i++) {
	             
	        	 System.out.print( i + " : " + nombres[i] + " " );
	         
	         }
	         System. out.println();

	}

}
