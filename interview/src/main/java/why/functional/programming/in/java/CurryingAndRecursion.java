package why.functional.programming.in.java;

import java.util.function.Function;

public class CurryingAndRecursion {

	public static void main(String[] args) {
		Function<Double, Function<Double, Double>> weight = mass -> gravity -> mass * gravity;
		Function<Double, Double> weightOnEarth = weight.apply(9.81);
		Double woe = weightOnEarth.apply(80.0);
		System.out.println(woe);
		
		System.out.println(factorial(4));
	}

	private static Integer factorial(int f) {
		return (f == 1) ? 1 : f * factorial(f-1);
	}

}
