import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeTest {

	public static void main(String[] args) {
		/*String test = new String("N12321N");
		isPalindrome(test);*/
		String testStr1 = new String("maan12321NageshHmmemmH");
		//String testStr1 = new String("m");//invalid case
		Map<String, Integer> palidromeHolder = new HashMap<String, Integer>();
		
		String longPTxt = null;
		int longPSize = -1;
		
		for(int i = 0; i < testStr1.length()-1;i++){
			for(int j = i+1; j < testStr1.length();j++){
				String substring = testStr1.substring(i, j+1);
				if(isPalindrome(substring)){
					int length = substring.length();
					if(length > longPSize){
						longPTxt = substring;
						longPSize = length;
					}
					palidromeHolder.put(substring,length);
				}
			}
		}
		
		System.out.println(longPTxt + " " + longPSize);
		System.out.println(palidromeHolder);
	}

	public static boolean isPalindrome(String testStr4) {
		/*String testStr1 = new String("MAAM");
		String testStr2 = new String("12321");
		String testStr3 = new String("Nagesh");
		String testStr4 = new String("HmmemmH");*/
		
		char[] charArray1 = testStr4.toCharArray();
		
		final int length = charArray1.length;
		boolean flag = true;
		for (int i = 0; i < charArray1.length; i++) {
			int front = i; int end = (length - 1 - i);
			if (front > end) {
				break;
			}
			if(charArray1[i] != charArray1[length - 1 - i]){
				flag = false;
			}
		}
		
		/*if (flag) {
			System.out.println(testStr4 +  " is the palindrome.");
		}else{
			System.out.println(testStr4 +  " is not palindrome.");
		}*/
		
		return flag;
	}

}
