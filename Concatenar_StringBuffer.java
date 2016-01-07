package capitulo_01;

public class Concatenar_StringBuffer {

	public static void main(String[] args) {
		
		long hi = System.currentTimeMillis();
		// obtengo el milisegundo actual
		StringBuffer sb = new StringBuffer();
		// instancio un StringBuffer inicialmente vacío
		int n = 1000000;
		char c;
		
		for ( int i = 0; i < n; i++ ){
			c = (char)('A' + i%('Z'-'A'+1));
			// obtengo caracteres entre 'A' y 'Z'
			sb.append(c);
			// concateno el caracter en el StringBuffer
		}
		long hf = System.currentTimeMillis();
		// obtengo el milisegundo actual
		System.out.println(sb.toString());
		// muestro la cadena resultante
		System.out.println((hf-hi) + " milisegundos");
		// muestro la cantidad de milisegundos

	}

}
