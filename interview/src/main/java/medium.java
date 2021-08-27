import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class medium {

	public static void main(String[] args) {
		//String txt = "asdkfj aksdjfij 2eekfjd iasdfkja lsdjfkds f ff fff fff fff aslkdfjkasdj";
		String txt = " the blue bird flies the south for the winter ";
		String[] splitTxt = txt.trim().split(" ");
		System.out.println(splitTxt.length);
		Map<String, Integer> map = new HashMap<>();
//		Map<String, Integer> map2 = Stream.of(splitTxt).collect(Collectors.toMap(t -> t, x -> 1,(u, v) -> u + v));
		Map<String, Integer> map2 = Stream.of(splitTxt).collect(Collectors.toMap(t -> t, x -> 1,(u, v) -> ++u));
		System.out.println(map2);
		
		String result = " ";
		for(int i = splitTxt.length-1; i >=0; i--){
			result += (splitTxt[i] + " ");
		}
		System.out.println("reversed String text : " + result);
		
		int leftIndex = 0;
		int rightIndex = splitTxt.length-1;
		while (leftIndex <= rightIndex) {
			String temp = splitTxt[leftIndex];
			splitTxt[leftIndex] = splitTxt[rightIndex];
			splitTxt[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
		}
		System.out.println("Swapping function: reversed String text : " + Arrays.toString(splitTxt));
		
		String removeWhiteSpaceText = "   fasdf   dfd  dfd fdfd dfdf dfd      ";
		System.out.println(removeWhiteSpaceText.replaceAll(" " , ""));
		
		//String palindromeTxt = "A man, a plan, a canal: Panama".toLowerCase();
		String palindromeTxt = "race a car".toLowerCase();
		String tempPalindromeTxt = palindromeTxt.replaceAll(",", "").replaceAll(":", "").replaceAll(" ", "").replaceAll(".", "");
		char[] charArray = tempPalindromeTxt.toCharArray();
		int lPdIndex = 0;
		int rPdIndex = charArray.length - 1;
		boolean isPalindrome = true;
		while (lPdIndex <= rPdIndex) {
			if (charArray[lPdIndex] != charArray[rPdIndex]) {
				isPalindrome = false;
				break;
			}
			lPdIndex++;
			rPdIndex--;
		}
		System.out.println(isPalindrome + "   " + palindromeTxt);
	}

}
