package capitulo_01;

public class Concatenar {

	public static void main(String[] args) {
		
		long hi = System.currentTimeMillis();
		// obtengo el milisegundo actual
		int n = 100000;
		String s = "";
		char c;
		
		for ( int i = 0; i < n; i++ ){
			c = (char)('A' + i%('Z'-'A'+1));
			// obtengo caracteres entre 'A' y 'Z'
			s = s + c;
			// concateno el caracter utilizando el operador +
		}
		long hf = System.currentTimeMillis();
		// obtengo el milisegundo actual
		System.out.println(s);
		// muestro la cadena resultante
		System.out.println((hf-hi) + " milisegundos");
		// muestro la cantidad de milisegundos


	}

}
