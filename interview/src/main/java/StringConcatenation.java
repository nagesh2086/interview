
public class StringConcatenation {

	public static void main(String[] args) {
		String abc = null;
		String xyz = "";
		
		System.out.println(abc + "");
		System.out.println("" + abc);
		
		//System.out.println(abc.concat(xyz));
		
		System.out.println(xyz.concat(abc));
	}

}
