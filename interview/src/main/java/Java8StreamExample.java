import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8StreamExample {

	public static void main(String[] args) {
		int[] array = {0,10,2,3,6,8,9,5,4,7,1,11,22,33,44,55,66,77,88,99,110};
		System.out.println("=================================");
		System.out.println("Using Sequential Stream");
		System.out.println("=================================");
		IntStream sequential = Arrays.stream(array);
		sequential.forEach((i) -> {System.out.println(i + " " + Thread.currentThread().getName());});
		
		System.out.println("=================================");
		System.out.println("Using Parallel Stream");
		System.out.println("=================================");
		IntStream parallel = Arrays.stream(array).parallel();
		parallel.forEach((i) -> {System.out.println(i + " " + Thread.currentThread().getName());});
	}

}
