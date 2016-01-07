package cap_02;

import java.io.IOException;

public class Teclado {

	public static void main(String[] args) throws IOException{
		
		char ch;
		System.out.print("Press any key: ");
		ch = (char) System.in.read();
		System.out.println("Your key is: " + ch);

	}

}
