package capitulo_01;

public class Subcadenas {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres";
		String s1 = s.substring(0,18);
		// Subdivide la cadena desde la posición 0 a la 18
		String s2 = s.substring(19,21);
		// Subdivide la cadena desde la posición 19 a la 21
		String s3 = s.substring(22);
		// Subdivide la cadena desde la posición 22 al final
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
