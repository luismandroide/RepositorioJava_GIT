package capitulo_01;

import java.util.StringTokenizer;

public class Split {

	public static void main(String[] args) {
		
		String s = "aeiouaeiouaeiouaeiou";
		String[] tokens = s.split("[o]");
		
		for ( int i = 0; i < tokens.length; i++ ){
			System.out.println(tokens[i]);
		}

	}

}
