package cap_01;

public class IfDemo {

	public static void main(String[] args) {
		
		int a,b,c;
		a = 2;
		b = 3;
		c = a - b;
		
		if( a < b ){
			System.out.println("A is less than b");
		}
		else if( a == b ){
			System.out.println("You won´t see this");
		}
		else {
			System.out.println("...");
		}

		if( c >= 0 ){
			System.out.println("c is non-negative");
		}
		else{
			System.out.println("c is negative");
		}
	}

}
