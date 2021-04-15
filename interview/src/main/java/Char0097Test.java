import java.nio.charset.Charset;
import java.util.Arrays;

public class Char0097Test {
	public static void main(String[] args) throws Exception {
		char[] chars = new char[] { '\u0097' };
		System.out.println("chars0097: " + Arrays.toString(chars));
		String str = new String(chars);
		System.out.println("String chars0097: "+ str);
		byte[] bytes = str.getBytes(Charset.availableCharsets().get("UTF-8"));
		System.out.println("bytes chars0097: " + Arrays.toString(bytes));
		System.out.println(Charset.availableCharsets().get("UTF-8"));
	}
}