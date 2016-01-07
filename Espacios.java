package cap_03;

public class Espacios {

	public static void main(String[] args) throws java.io.IOException{
		
			char ch; 
		    int espacios = 0; 
		 
		 
		    System.out.print("DATOS: "); 
		 
		    do { 
		      ch = (char) System.in.read(); 
		      if(ch == ' ') espacios++; 
		    } while(ch != '.'); 
		 
		    System.out.println("ESPACIOS: " + espacios); 

	}

}
