import java.io.IOException;
public class EchoText{
	public static void main(String[] args) throws IOException{
		int ch;
		while( (ch = System.in.read() ) != 13)
		// mientras el valor es igual a 13, valor entero de la tecla INTRO
			System.out.print( (char) ch);
		System.out.println();
	}
}