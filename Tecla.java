package cap_01;

import java.io.IOException;

public class Tecla {

	public static void main(String[] args) throws IOException {
		
		char ch;
		System.out.print("Teclea una tecla: ");
		ch = (char) System.in.read(); 
		// El carácter se obtiene como entero y hay que convertirlo en char
		System.out.println("La tecla es la " + ch);

	}

}
