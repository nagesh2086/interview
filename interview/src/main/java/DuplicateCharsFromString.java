import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharsFromString {

	public static void main(String[] args) {
		String s = "mississippi";
		char[] charArray = s.toCharArray();
//		Stream.of(charArray).flatMap(c -> Arrays.toString(c))
		//Stream.of(s).map(m -> m.toCharArray())
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.get(charArray[i]) == null){
				map.put(charArray[i], 1);
			}else {
				Integer cnt = map.get(charArray[i]);
				map.put(charArray[i], ++cnt);
			}
		}
		System.out.println(map);
		
		
		//Arrays.to
		//Stream.of(s).flatMap(m -> Arrays.stream((Character[])m.toCharArray()));
		//Arrays.asList(charArray);
		//Stream.of(charArray).map(c -> new Character(c));
		
		List<Character>list = new ArrayList<>();
		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);
		}
		
		Map<Character, Integer> map2 = list.stream().collect(Collectors.toMap(c -> c, d -> 1, (u,v) -> ++u));
		System.out.println(map2);
	}

}
