
public class StringLiteralAndInstances {

	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		a.toUpperCase();
		System.out.println("String a and b: " + a + b);
		if(a == b) System.out.println("a == b");
		if(a.equals(b)) System.out.println("a.equals(b)");

		String c = new String("test1");
		String d = new String("test1");
		if(c == d) System.out.println("c == d");
		if(c.equals(d)) System.out.println("c.equals(d)");
		
	}

}
