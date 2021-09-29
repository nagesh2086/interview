package count.down.latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchApp{
	

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " app started");
		CountDownLatchApp app = new CountDownLatchApp();
		
		CountDownLatch cd = new CountDownLatch(2);
		
		Runnable task1 = app.getNewTask(cd);
		Runnable task2 = app.getNewTask(cd);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName() + "cd is waiting");
		cd.await(); 
		
		t1.join();
		t2.join();
		System.out.println(Thread.currentThread().getName() + " app ended");
	}
	
	private Runnable getNewTask(CountDownLatch cd){
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " party reached barrier");
				try {
					Thread.sleep(2000);
					cd.countDown();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					System.out.println(Thread.currentThread().getName() + " finally");
				}
			}
		};
		return task1;
	}


}