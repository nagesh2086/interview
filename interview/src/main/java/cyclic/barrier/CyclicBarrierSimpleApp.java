package cyclic.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSimpleApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " app started");
		CyclicBarrierSimpleApp app = new CyclicBarrierSimpleApp();
		CyclicBarrier cb = new CyclicBarrier(2, new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " barrier tripped or all barrier has been crossed.");
			}
		});
		
		Runnable task1 = app.getNewTask(cb);
		Runnable task2 = app.getNewTask(cb);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread().getName() + " resetting cb");
		cb.reset();
		
		Thread t3 = new Thread(task1);
		Thread t4 = new Thread(task2);
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		System.out.println(Thread.currentThread().getName() + " app ended");
	}
	
	private Runnable getNewTask(CyclicBarrier cb){
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " party reached barrier");
				try {
					Thread.sleep(2000);
					if (cb.await() == 1) {
						System.out.println(Thread.currentThread().getName() + " barrier action now can be executed");
					}
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}finally {
					System.out.println(Thread.currentThread().getName() + " finally");
				}
			}
		};
		return task1;
	}

}
