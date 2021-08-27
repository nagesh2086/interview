import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapGetTest {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer>cHM = new ConcurrentHashMap<>();
		cHM.put(1, 1);
		Runnable putTsk = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					cHM.put(1, i);
				}
			}
		};
		Thread t = new Thread(putTsk);
		System.out.println(cHM.get(1));
		
		t.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println(cHM.get(1));
		}
	}

}
