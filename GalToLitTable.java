package cap_01;

public class GalToLitTable {

	public static void main(String[] args) {
		
		int counter = 0;
		// el contador de l�neas se establece inicialmente en 0
		
		for( double gallons = 1; gallons <= 10; gallons++ ){
			double liters = gallons * 3.7854;
			
			System.out.println(gallons + " gallons is " + liters + " litros");
			counter++;
			// se incrementa el contador de l�neas en cada iteraci�n del bucle
			
			if( counter == 5 ){
				System.out.println();
				// cada 5 l�neas imprime una en blanco
				counter = 0;
				// restablece el contador de l�neas
			}
			
		}

	}

}
