package capitulo_01;

import java.util.Scanner;

public class ArraySemana {

		public static void main(String[] args) {
			
			String dias[] = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
			Scanner scanner = new Scanner(System.in);
			System.out.print("D�A DE LA SEMANA (Ingrese un n�mero del 1 al 7: ");
			int v = scanner.nextInt();
			
			if ( v <= dias.length){
				// los arrays se numeran desde 0
				System.out.println(dias[v-1]);
			}
			else{
				System.out.println("D�A INCORRECTO (Ingrese un n�mero del 1 al 7");
			}
			
		}
		
}
