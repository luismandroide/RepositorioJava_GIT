package capitulo_01;

import java.util.StringTokenizer;

public class Tokens {

	public static void main(String[] args) {
		
		String s = "aeiouaeiouaeiouaeiou";
		StringTokenizer st = new StringTokenizer(s,"o");
		// instanciamos el objeto st pasándole como argumentos la cadena s y una cadena "o" que se considera como
		// separador
		String tok;
		
		while ( st.hasMoreTokens() ){
			tok = st.nextToken();
			System.out.println(tok);
		}

	}

}
