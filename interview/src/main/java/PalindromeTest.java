
public class PalindromeTest {

	public static void main(String[] args) {
		String testStr1 = new String("MAAM");
		String testStr2 = new String("12321");
		String testStr3 = new String("Nagesh");
		
		char[] charArray1 = testStr3.toCharArray();
		
		final int length = charArray1.length;
		boolean flag = false;
		for (int i = 0; i < charArray1.length; i++) {
			int front = i; int end = (length - 1 - i);
			if (front > end) {
				break;
			}
			if(charArray1[i] == charArray1[length - 1 - i]){
				flag = true;
			}else{
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println(testStr3 +  " is the palindrome.");
		}else{
			System.out.println(testStr3 +  " is not palindrome.");
		}
		
	}

}
