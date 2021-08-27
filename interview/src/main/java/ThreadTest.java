import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		int reduce = IntStream.range(1, 5).reduce(2, (a, b)->a+b);
		System.out.println(reduce);
		
		Map<Integer, Object>tMap = new TreeMap<Integer, Object>();
		tMap.put(1, null);
		tMap.put(2, null);
		tMap.put(3, null);
		tMap.put(4, null);
		tMap.put(5, null);
		System.out.println(tMap);
		/*ThreadTest tt = new ThreadTest();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(tt.add(2, 2));
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(tt.add(2, 2));
			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(tt.add(2, 2));
			}
		});
		
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(tt.add(2, 2));
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();*/
	}

	public int add(int a, int b) {
		return a + b;
	}
}
