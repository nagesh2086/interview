package why.functional.programming.in.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstClassHighOrderFunctions {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kjk", "zzz", "yyy", "xxx", "10xxx", "9xxx", "5xxx", "10", "9", "1", "5",
				"11", "11xxx");
		System.out.println(list);
		/*
		 * Collections.sort(list, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { if (o1 == null
		 * && o2 == null) return 0; if (o1 == null & o2 != null) return -1; if
		 * (o1 != null & o2 == null) return 1; return o1.compareTo(o2); } });
		 */
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		System.out.println(list);

		Student student1 = new Student("Nagesh", "12", "Mumbai", 99, 92, 40);
		Student student2 = new Student("Ganesh", "12", "Solapur", 79, 87, 42);
		Student student3 = new Student("Rajesh", "12", "Latur", 35, 45, 95);
		Student student4 = new Student("Swaraj", "12", "Pune", 46, 63, 70);
		Student student5 = new Student("Mithun", "12", "Palghar", 65, 80, 71);

		List<Student> list2 = Arrays.asList(student1, student2, student3, student4, student5);
		List<Student> list3 = list2.stream().map((s) -> {
			s.setTotal(s.getMarksInMarathi().intValue() + s.getMarksInMaths().intValue() + s.getMarksInScience().intValue());
			return s;
		}).collect(Collectors.toList());
		
		list3.forEach((s) -> System.out.println(s.getName() + " " + s.getMarksInMarathi() + " " + s.getMarksInMaths() + " " + s.getMarksInScience() + " " + s.getTotal()));
		
		List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		IntSummaryStatistics intSummaryStatistics = list4.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(intSummaryStatistics.getSum());
	}

}
