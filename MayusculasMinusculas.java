package capitulo_01;

public class MayusculasMinusculas {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres";
		String sMayus = s.toUpperCase();
		// el m�todo toUpperCase pasa la cadena s a may�sculas
		String sMinus = s.toLowerCase();
		// el m�todo toLowerCase pasa la cadena s a min�sculas
		System.out.println("TEXTO ORIGINAL: " + s);
		System.out.println("EN MAY�SCULAS: " + sMayus);
		System.out.println("EN MIN�SCULAS: " + sMinus);

	}

}
