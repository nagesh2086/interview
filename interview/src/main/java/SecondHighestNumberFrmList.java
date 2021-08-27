import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SecondHighestNumberFrmList {

	public static void main(String[] args) {
		long startList = System.currentTimeMillis();
		System.out.println("list second highest search start: " + startList);
		List<Integer> list = new ArrayList<>();
		// 100, 14, 46, 57, 94, 94, 38, 100
		list.add(100);
		list.add(14);
		list.add(46);
		list.add(57);
		list.add(94);
		list.add(94);
		list.add(38);
		list.add(100);

		System.out.println("Source list: " + list);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == null) {
					if (o2 == null) {
						return 0;
					}
				}

				if (o1 != null) {
					if (o2 == null) {
						return 1;
					}
				}

				if (o1 == null) {
					if (o2 != null) {
						return -1;
					}
				}

				if (o1.intValue() > o2.intValue()) {
					return 1;
				} else if (o1.intValue() < o2.intValue()) {
					return -1;
				}
				return 0;
			}
		});

		System.out.println("After sort: " + list);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
		System.out.println(treeSet);

		Integer maxElement = treeSet.pollLast();
		System.out.println(treeSet.floor(maxElement));

		long endList = System.currentTimeMillis();
		System.out.println("list second highest search end: " + endList);
		System.out.println("total list search time in ms: " + (endList - startList));

		long startArray = System.currentTimeMillis();
		System.out.println("array second highest search start: " + startList);
		// int[] array = { 14, 46, 57, 94, 94, 100, 38, 100 };
		//int[] array = { 100, 100, 100, 100 };
		int[] array = { 100, 100, 100, 94 };
		Integer highest = array[0];
		Integer secondHighest = null;
		for (int i = 1; i < array.length; i++) {
			if (highest > array[i]) {
				// highest = array[i - 1];
				if (secondHighest == null || secondHighest < array[i]) {
					secondHighest = array[i];
				}
				// secondHighest = array[i];
			} else if (highest < array[i]) {
				secondHighest = highest;
				highest = array[i];
			} /*
				 * else { highest = array[i]; secondHighest = array[i]; }
				 */
		}

		System.out.println("highest: " + highest + " secondHighest:  " + secondHighest);
		long endArray = System.currentTimeMillis();
		System.out.println("array second highest search end: " + endArray);
		System.out.println("total array search time in ms: " + (endArray - startArray));
	}

}
