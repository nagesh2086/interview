import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolRejectedExceptionHandlerLearning {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);

		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			}
		};

		Runnable task2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
				throw new NullPointerException("Testing rejected exception handling by throwing NPE");
			}
		};

		Future<?> t1Future = pool.submit(task1);
		Future<?> t2Future = pool.submit(task2);

		try {
			Object object1 = t1Future.get();
			System.out.println("Task 1 output: " + object1);
			/*Object object2 = t2Future.get();
			System.out.println("Task 1 output: " + object2);*/
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		boolean doneT2 = t2Future.isDone();
		boolean cancelledT2 = t2Future.isCancelled();
		System.out.println("Task 2: done, cancelled: " + doneT2 + "," + cancelledT2);

		boolean doneT1 = t1Future.isDone();
		boolean cancelledT1 = t1Future.isCancelled();
		System.out.println("Task 1: done, cancelled: " + doneT1 + "," + cancelledT1);

		pool.shutdownNow();
	}

}
