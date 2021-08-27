import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 	
 * caes insensitive in nature
 * 1 --> nothing
 * 2 --> ABC
 * 3 -->DEF
 * 4 -->GHI
 * 5 -->JKL
 * 6 --> MNO
 * 7 --> PQRS
 * 8 --> TUV
 * 9 -->WXYZ
 *0 --> " " --space
 * @author nagesh2086
 *
 */
public class OldNumberPad {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		ConcurrentHashMap<Character, String> keyPadMapping = prepareKeyPadMapping();
		String phoneNumber = "3662277";
		String[] wordsArray = {"foo", "bar", "baz", "foobar", "emo"};
		List<String> words = new ArrayList<>(Arrays.asList(wordsArray));
		
		for (Iterator iterator = words.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			char[] charArray = string.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				char[] phCharArray = phoneNumber.toCharArray();
				for (int j = 0; j < phCharArray.length; j++) {
					char c = phCharArray[j];
					
				}
			}
		}
	}

	public static ConcurrentHashMap<Character, String> prepareKeyPadMapping() {
		ConcurrentHashMap<Character, String> keyPadMapping = new ConcurrentHashMap(16,0.100f,Runtime.getRuntime().availableProcessors()+1);
		keyPadMapping.put('0', " ");
		keyPadMapping.put('1', "");
		keyPadMapping.put('2', "ABC");
		keyPadMapping.put('3', "DEF");
		keyPadMapping.put('4', "GHI");
		keyPadMapping.put('5', "JKL");
		keyPadMapping.put('6', "MNO");
		keyPadMapping.put('7', "PQRS");
		keyPadMapping.put('8', "TUV");
		keyPadMapping.put('9', "WXYZ");
		return keyPadMapping;
	}

}
