import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicateTest {

	public static void main(String[] args) {
		final int initialCapacity = 10;
		List<Integer> list = new ArrayList<Integer>(initialCapacity);
		/*for (int i = 0; i < initialCapacity; i++) {
			double random = Math.random() * 100;
			int element = (int) random;
			list.add(element);
		}*/
		list.add(10);
		list.add(60);
		list.add(70);
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(100);
		list.add(20);
		list.add(70);
		
		System.out.println("Source list: " + list);
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int i1 = i+1; i1 < list.size(); i1++) {
				if(list.get(i) == list.get(i1)){
					System.out.println("Duplicate: " + list.get(i));
				}
				
			}
		}
	}

}
