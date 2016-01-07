package capitulo_01;

public class PrefijosYSufijos {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres";
		boolean b1 = s.startsWith("Esto"); 
		// verifica si la cadena s comienza con Esto (true)
		boolean b2 = s.startsWith("es"); 
		// verifica si la cadena s comienza con es (false)
		boolean b3 = s.endsWith("caracteres"); 
		// verifica si la cadena s finaliza con caracteres (true)
		boolean b4 = s.endsWith("cadena"); 
		// verifica si la cadena s finaliza con cadena (false)
		System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4);

	}

}
