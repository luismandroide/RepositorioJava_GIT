package capitulo_01;

public class MayusculasMinusculas {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres";
		String sMayus = s.toUpperCase();
		// el método toUpperCase pasa la cadena s a mayúsculas
		String sMinus = s.toLowerCase();
		// el método toLowerCase pasa la cadena s a minúsculas
		System.out.println("TEXTO ORIGINAL: " + s);
		System.out.println("EN MAYÚSCULAS: " + sMayus);
		System.out.println("EN MINÚSCULAS: " + sMinus);

	}

}
