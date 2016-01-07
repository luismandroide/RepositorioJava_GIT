package capitulo_01;

public class Apariciones {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres";
		int pos1 = s.indexOf('E');
		// el método indexOf retorna la posición de la primera aparición del caracter E en la cadena (0)
		int pos2 = s.lastIndexOf('e');
		// el método lastIndexOf retorna la posición de la última aparición del caracter e en la cadena (30)
		int pos3 = s.indexOf('x');
		// el método indexOf retorna la posición de la primera aparición del caracter x en la cadena (-1), no existe
		System.out.println(pos1+ "\n" + pos2+ "\n" + pos3+"\n");

	}

}
