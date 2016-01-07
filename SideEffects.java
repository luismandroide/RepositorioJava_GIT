package cap_02;

public class SideEffects {

	public static void main(String[] args) {
		
		int i = 0;
		
		if( false & (++i < 100) ){
		// se incrementa i aunque la instrucción if falle i=1
			System.out.println("ESTO NO SE DESPLEGARÁ");
		}
		System.out.println("La variable i vale "+ i);
		if ( false && (++i < 100) ){
		// no se incrementa i el operador de cortocircuito (&&) ignora el incremento i=1
			System.out.println("ESTO NO SE DESPLEGARÁ");
		}
		System.out.println("La variable i vale "+ i);

	}

}
