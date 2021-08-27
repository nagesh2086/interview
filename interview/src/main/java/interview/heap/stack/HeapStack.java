package interview.heap.stack;

public class HeapStack {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		/*Thread user1 = new Thread(() -> calc.add(1, 2));//5
		Thread user2 = new Thread(() -> calc.add(3, 4));//9
		Thread user3 = new Thread(() -> calc.add(4, 4));//10
		Thread user4 = new Thread(() -> calc.add(5, 5));//12
		Thread user5 = new Thread(() -> calc.add(5, 6));//13
		Thread user6 = new Thread(() -> calc.add(6, 6));//14
*/		
		Thread user1 = new Thread(() -> calc.increment(0));//2
		Thread user2 = new Thread(() -> calc.increment(1));//3
		Thread user3 = new Thread(() -> calc.increment(2));//4
		Thread user4 = new Thread(() -> calc.increment(3));//5
		Thread user5 = new Thread(() -> calc.increment(4));//6
		Thread user6 = new Thread(() -> calc.increment(5));//7
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
	}

	static class Calculator{
		volatile int i = 0;
		void add(int a, int b){
			//synchronized (this) {
				/*try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				//++a;
				//++b;
				//int c = a + b + i++;
				i++;
				i++;
				/*try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				System.out.println(Thread.currentThread().getName() + " " + i);
			//}
		}
		
		void increment(int i){
			System.out.println(Thread.currentThread().getName() + " received: " + i);
			i++;
			i++;
			System.out.println(Thread.currentThread().getName() + " incremented: " + i);
		}
	}
}
