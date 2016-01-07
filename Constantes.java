package capitulo_01;

import java.util.Scanner;

public class Constantes {
	
	// definimos las constantes
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("DÍA DE LA SEMANA (Ingrese un valor entre 1 y 7): ");
		int v = scanner.nextInt();
		String dia;
		
		switch (v){
			case LUNES:
				dia = "LUNES";
				break;
			case MARTES:
				dia = "MARTES";
				break;
			case MIERCOLES:
				dia = "MIERCOLES";
				break;
			case JUEVES:
				dia = "JUEVES";
				break;
			case VIERNES:
				dia = "VIERNES";
				break;
			case SABADO:
				dia = "SABADO";
				break;
			case DOMINGO:
				dia = "DOMINGO";
				break;
			default:
				dia= "Día incorrecto... Ingrese un valor entre 1 y 7";	
		}
		System.out.println(dia);
		
	}

}
