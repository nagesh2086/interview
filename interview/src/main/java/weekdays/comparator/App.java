package weekdays.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		Weekdays[] days = { Weekdays.FRIDAY, Weekdays.WEDNESDAY, Weekdays.MONDAY, Weekdays.SUNDAY, Weekdays.SATURDAY,
				Weekdays.TUESDAY, Weekdays.THURSDAY };

		System.out.println(Arrays.toString(days));

		//first sorting
		//Arrays.sort(days);

		//System.out.println(Arrays.toString(days));

		final Comparator<Weekdays> comparator = new Comparator<Weekdays>() {

			@Override
			public int compare(Weekdays o1, Weekdays o2) {
				if (o1.ordinal() < o2.ordinal()) {
					return -1;
				} else if (o1.ordinal() > o2.ordinal()) {
					return 1;
				}
				return 0;
			}
		};
		
		//second sorting
		Arrays.sort(days, comparator);

		System.out.println(Arrays.toString(days));
	}

}
