import java.util.ArrayList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Mac");
		list.add("Jony");
		list.add("Joseph");
		list.add("Marylyn");
		list.add("Donald");
		list.add("Phoebe");
		
		System.out.println(list);
		
		list.add(2, "Nagesh");
		
		System.out.println(list);
	}

}
