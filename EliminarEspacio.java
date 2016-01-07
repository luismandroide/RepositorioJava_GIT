package cap_03;

public class EliminarEspacio {

	public static void main(String[] args) {
		String citaDiaria = "La educación consiste en enseñar a los hombres no lo que deben pensar sino a pensar.";
        char[] convertir = citaDiaria.toCharArray() ;
        for (int dex = 0; dex < convertir. length; dex++) {
            char current = convertir[dex] ;
            if (current != ' ' ) {
                System.out. print(current);
            }
            else {
                System.out. print('.' );
            }
        }
        
	}

}
