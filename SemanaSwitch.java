package capitulo_01;

import java.util.Scanner;

public class SemanaSwitch {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("NÚMERO entre 1 y 7: ");
		int v = scanner.nextInt();
		
		String dia;
		switch (v){
			case 1:
				dia = "LUNES";
				break;
			case 2:
				dia = "MARTES";
				break;
			case 3:
				dia = "MIERCOLES";
				break;
			case 4:
				dia = "JUEVES";
				break;
			case 5:
				dia = "VIERNES";
				break;
			case 6:
				dia = "SABADO";
				break;
			case 7:
				dia = "DOMINGO";
				break;
			default:
				dia = "Incorrecto... El valor debe ser entre 1 y 7";
		}
		System.out.println("El Número " + v + " introducido corresponde con el " + dia);
		
	}
	
}
