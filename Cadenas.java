package capitulo_01;

public class Cadenas {

	public static void main(String[] args) {
		
		String s ="Esta en una cadena";
		System.out.println(s.charAt(0));
		// imprime el caracter tipo char ubicado en la posici�n 0 de la cadena (E)
		System.out.println(s.charAt(5));
		// imprime el caracter tipo char ubicado en la posici�n 5 de la cadena (e)
		System.out.println(s.charAt(s.length()-1));
		// imprime el caracter tipo char ubicado en la �ltima posici�n de la cadena (a)
		char c;
		
		for ( int i=0; i < s.length(); i++){
			c = s.charAt(i);
			System.out.println(i + " -> " + c);
			// imprime un n�mero de 0 a la cantidad de caracteres que tiene la cadena y 
			// el caracter tipo char ubicado en la posici�n 0 a �ltima de la cadena
		}

	}

}
