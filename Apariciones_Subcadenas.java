package capitulo_01;

public class Apariciones_Subcadenas {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres y es solo una";
		int pos1 = s.indexOf("es");
		// el método indexOf retorna la posición de la primera aparición de la subcadena es en la cadena (5)
		int pos2 = s.lastIndexOf("una");
		// el método lastIndexOf retorna la posición de la última aparición de la subcadena una en la cadena (43)
		System.out.println(pos1+ "\n" + pos2);

	}

}
