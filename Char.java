package capitulo_01;

public class Char {

	public static void main(String[] args) {
		
		char c;
		for ( int i = 'A'; i < 'D'; i++){
			System.out.println(i);
			c = (char) i;
			// para signar un int en un char debemos castearlo, asegurando al compilador que el valor 
			// del entero i podrá ser contenido en la variable c de tipo char
			System.out.println(c);
		}
		
	}

}
