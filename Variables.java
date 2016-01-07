package javaDesde0_01;

public class Variables {

	public static void main(String[] args) {
		
		double a = 5;
		double b = 7;
		double c = b/a;
		c++;
		System.out.println(c);
		final double a_pulgadas = 2.54;
		double cm = 6;
		double resultado = cm/a_pulgadas;
		System.out.println("En " + cm + " cms hay " + resultado + " pulgadas");
		int operador1, operador2, reultado;
		operador1 = 8;
		operador2 = 7;
		resultado = operador1 + operador2;
		System.out.println(resultado);
		double raiz = Math.sqrt(9.0);
		System.out.println(raiz);
		double num1 = 5.85;
		int resultado2 = (int)Math.round(num1);
		System.out.println(resultado2);
		double base = 5;
		double exponente = 3;
		int resultado4 = (int)Math.pow(base,exponente);
		System.out.println("El resultado " + base + " elevado " + exponente + " es " + resultado4);
		
	}

}
