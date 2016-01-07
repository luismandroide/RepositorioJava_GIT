package cap_03;

public class Help {

	public static void main(String[] args) throws java.io.IOException{
		
		char choice, ignore;
		
		for( ;; ){
		
			do{
				System.out.println("HELP: ");
				System.out.println(" 1 .IF");
				System.out.println(" 2. SWITCH");
				System.out.println(" 3. FOR");
				System.out.println(" 4. WHILE");
				System.out.println(" 5. DO-WHILE");
				System.out.println(" 6. BREAK");
				System.out.println(" 7. CONTINUE\n");
				System.out.print("Choose one (q to quit): ");
		
				choice = (char) System.in.read();
		
				do{
					ignore = (char)System.in.read();
				} while( ignore != '\n');
			} while( choice < '1' | choice > '7' & choice != 'q' );
			
			if( choice == 'q') break;
			
			System.out.println("\n");
		
			switch(choice){
				case '1':
					System.out.println("if:\n");
					System.out.println("if( condicion ) statement;");
					System.out.println("else statement");
					break;
				case '2':
					System.out.println("switch:\n");
					System.out.println("switch( expresion ) {");
					System.out.println("case constant: ");
					System.out.println(" statement sequence");
					System.out.println(" break;");
					System.out.println("  // ...");
					System.out.println("}");
					break;
				case '3':
					System.out.println("for:\n");
					System.out.println("for( init; condition; iteration )");
					System.out.println("case constant: ");
					System.out.println(" statement");
					break;
				case '4':
					System.out.println("while:\n");
					System.out.println("while( condition ) statement");
					break;
				case '5':
					System.out.println("do-while:\n");
					System.out.println("do {");
					System.out.println(" statement");
					System.out.println("} while ( condition );");
					break;
				case '6':
					System.out.println("break:\n");
					System.out.println("break; or break label;");
					break;
				case '7':
					System.out.println("continue:\n");
					System.out.println("continue; or continue label;");
					break;
			}
			System.out.println();
			
		}

	}

}
