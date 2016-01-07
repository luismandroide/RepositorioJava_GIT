package cap_02;

public class Tabla {

	public static void main(String[] args) {
		
		boolean p, q;
		System.out.println("p\tq\tAND\tOR\tXOR\tNOT\t");
		
		p = true;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!q));
		
		p = true;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!q));
		
		p = false;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!q));
		
		p = false;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!q));

	}

}
