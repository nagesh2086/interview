import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToStringTest {

	public static void main(String[] args) {
		String[] array = new String[]{"Group","Unit","Area",null,""," "};
		System.out.println(Arrays.toString(array));
		if("".equals("")){
			System.out.println("empty string " + "".length());
		}
		if(" ".trim().equals(" ")){
			System.out.println("string with space" + " ".length());
		}
		List<String> list = Arrays.stream(array).filter((e) -> null != e).filter(e -> !(e.trim().length() == 0)).collect(Collectors.toList());
		System.out.println(list);
		long count = Arrays.stream(array).filter((e) -> null != e).filter(e ->  !(e.trim().length() == 0)).count();
		System.out.println(count);
	}

}
