package method.overloading;

import java.util.HashMap;

public class HashMapNullKeyTest {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(null, 100);
		map.put(null, 200);
		System.out.println(map);
	}

}
