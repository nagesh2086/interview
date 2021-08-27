package why.functional.programming.in.java;

import java.util.Optional;

public class Monad {

	public static void main(String[] args) {
		Optional<Integer> ofOne = Optional.of(1);
		Optional<Integer> flatMap = ofOne.flatMap((o) -> {
			return Optional.of(1).flatMap((o1) -> Optional.of(o + o1 + 100));
		});
		System.out.println(flatMap.get());
	}

}
