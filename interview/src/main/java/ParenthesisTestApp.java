import java.util.LinkedList;

public class ParenthesisTestApp {
	private LinkedList<Character> lList = new LinkedList<>();

	public static void main(String[] args) {
		ParenthesisTestApp app = new ParenthesisTestApp();
		// String testStr = "[[{{}}]]";
		// String testStr = "";
		//String testStr = null;
		//String testStr = "[";
		// String testStr = "]";
		// String testStr = "]]]]";
		// String testStr = "[[[[";
		//String testStr = "[[[{}{]]]";
		//String testStr = "[[[{}";
		//String testStr = "[]]]";
		//String testStr = "[}";
		//String testStr = "[   ]";
		String testStr = "(()){}()";
		
		app.checkValidityParenthesis(testStr);
	}

	public void checkValidityParenthesis(String testStr) {
		boolean isValid = true;
		if (testStr == null || testStr.length() <= 1 || testStr.equals("")) {
			System.out.println("test string is empty or null or \"\" or of size 1");
			isValid = false;
		} else {
			char[] charArray = testStr.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if ('(' == charArray[i] || '{' == charArray[i] || '[' == charArray[i]) {
					lList.addLast(charArray[i]);
				} else {
					if (lList.isEmpty()) {
						System.out.println(lList);
						System.out.println("No elements in list due to only closing brackets: ");
						isValid = false;
						break;
					}

					Character last = null;
					last = lList.removeLast();
					if (('[' == last && ']' == charArray[i]) || ('{' == last && '}' == charArray[i]) ||  ('(' == last && ')' == charArray[i])) {// ('(' == last && ')' == charArray[i])
						System.out.println("matching: " + last + charArray[i]);
					} else {
						System.out.println("Not matching: " + last + charArray[i]);
						isValid = false;
						break;
					}
				}
			}
		}

		if (!isValid) {
			System.out.println("NOT VALID OPENING AND CLOSING PARENTHESIS");
		} else if (isValid && !lList.isEmpty()) {
			System.out.println("NOT VALID OPENING AND CLOSING PARENTHESIS because only opening brackets");
		}else{
			System.out.println("VALID");
		}
	}

}
