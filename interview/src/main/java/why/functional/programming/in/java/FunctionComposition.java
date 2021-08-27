package why.functional.programming.in.java;

import java.util.function.Function;

public class FunctionComposition {

	public static void main(String[] args) {
	Function<Double, Double>log = (e) -> Math.log10(e);
	
	Function<Double, Double>sqrt = (e) -> Math.sqrt(e);
	
	Function<Double, Double> compose = log.compose(sqrt);
	Double composeResult = compose.apply(16.0);
	System.out.println(composeResult);//0.60
	
	//1.09
	Function<Double, Double> andThenFn = log.andThen(sqrt);
	Double antThenFnResult = andThenFn.apply(16.0);
	System.out.println(antThenFnResult);
	
	System.out.println(log.apply(16.0));
	
	}

}
