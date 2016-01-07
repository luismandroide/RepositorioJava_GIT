package cap_03;

public class CuentaLetras {

	public static void main(String[] args) {
		
		String frase[] = {
	            "TODA CUESTION TIENE DOS PUNTOS DE VISTA",
	             "EL EQUIVOCADO Y EL NUESTRO" ,
	             "TODAS LAS MUJERES TIENEN ALGO HERMOSO",
	             "AUNQUE SEA UNA PRIMA LEJANA",
	             "SE ESTA MURIENDO GENTE QUE ANTES NO SE MORIA",
	             "HE OIDO HABLAR TAN BIEN DE TI",
	             "QUE CREIA QUE ESTABAS MUERTO",
	             "RECUERDA SIEMPRE QUE ERES UNICO",
	             "EXACTAMENTE IGUAL QUE TODOS LOS DEMAS" ,
	             "TODO TIEMPO PASADO FUE ANTERIOR." ,
	             "LOS HONESTOS SON INADAPTADOS SOCIALES",
	             "LA VERDAD ABSOLUTA NO EXISTE" ,
	             "Y ESTO ES ABSOLUTAMENTE CIERTO",
	             "LO TRISTE NO ES IR AL CEMENTERIO, SINO QUEDARSE",
	             "EL AMOR ETERNO DURA APROXIMADAMENTE TRES MESES"
	         };
	         int[ ] contadorLetras = new int[26] ;
	         
	         for (int contador = 0; contador< frase.length; contador++) {
	             
	        	 String actual = frase[contador];
	             char[] letras = actual.toCharArray();
	             
	             for (int contador2 = 0;  contador2 < letras.length; contador2++) {
	                 char let = letras[contador2];
	                 if ( (let >= 'A' ) & (let <= 'Z' ) ) {
	                     contadorLetras[let - 'A' ]++;
	                 }

	             }
	         }
	         
	         for (char contador = 'A' ; contador <='Z'; contador++) {
	             
	        	 System.out.print( contador + ":" +
	                 contadorLetras[contador - 'A' ] +
	                " ") ;
	         }
	         System. out.println();

	}

}
