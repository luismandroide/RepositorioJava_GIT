package capitulo_01;

public class Apariciones_Subcadenas {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres y es solo una";
		int pos1 = s.indexOf("es");
		// el m�todo indexOf retorna la posici�n de la primera aparici�n de la subcadena es en la cadena (5)
		int pos2 = s.lastIndexOf("una");
		// el m�todo lastIndexOf retorna la posici�n de la �ltima aparici�n de la subcadena una en la cadena (43)
		System.out.println(pos1+ "\n" + pos2);

	}

}
