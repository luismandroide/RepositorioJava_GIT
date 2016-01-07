package cap_03;

import java.util.Scanner;

public class Calculadora {

	public static int sumar(int a, int b){
		
		return a + b;
		
	}
	
	public static int restar(int a, int b){
		
		return a - b;
		
	}
	
	public static int multiplicar(int a, int b){
		
		return a * b;
		
	}
	
	public static int dividir(int a, int b){
		
		return a / b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		System.out.print("PRIMER NÚMERO: ");
		int a = lectura.nextInt();
		System.out.print("SEGUNDO NÚMERO: ");
		int b = lectura.nextInt();
		boolean bandera = false;
		
		do{
			System.out.println("Ingrese una opción \n01.\t SUMAR \n02.\t RESTAR \n03.\t MULTIPLICAR \n04.\t DIVIDIR");
			int seleccion = lectura.nextInt();
			switch(seleccion){
			case 1:
				System.out.println("El resultado de sumar " + a + " más " + b + " es: " + sumar(a,b));
				bandera = true;
				break;
			case 2:
				System.out.println("El resultado de restar " + a + " menos " + b + " es: " + restar(a,b));
				bandera = true;
				break;
			case 3:
				System.out.println("El resultado de multiplicar " + a + " por " + b + " es: " + multiplicar(a,b));
				bandera = true;
				break;
			case 4:
				System.out.println("El resultado de dividir " + a + " entre " + b + " es: " + dividir(a,b));
				bandera = true;
				break;
			}
		} while (bandera == false);

	}

}
