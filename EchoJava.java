package capitulo_01;

public class EchoJava {

	public static void main(String[] args) {
		
		for ( int i = 0; i < args.length; i++ ){
			System.out.println(args[i]);
		}
		System.out.println("TOTAL: " + args.length + " ARGUMENTOS");
		
	}

}
