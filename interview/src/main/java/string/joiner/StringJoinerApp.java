package string.joiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinerApp {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,2,3,4);
		String colonString = list.stream().map(i -> i.toString()).collect(Collectors.joining(":","[","]"));
		System.out.println(colonString);
	}

}
