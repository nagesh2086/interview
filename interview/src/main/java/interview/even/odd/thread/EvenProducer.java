package interview.even.odd.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class EvenProducer implements Runnable {

	private BlockingQueue<Integer> bQueue;
	private int[] array;
	private CountDownLatch latch;
	private Lock lock;

	public EvenProducer(BlockingQueue<Integer> bQueue, int[] array, CountDownLatch latch, Lock lock) {
		this.bQueue = bQueue;
		this.array = array;
		this.latch = latch;
		this.lock = lock;
	}

	@Override
	public void run() {
		int index = -1;
		while (index < array.length) {
			//lock.lock();
			synchronized (bQueue) {
				try {
					latch.await();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				index = bQueue.poll();
				if (index >= array.length) {
					break;
				}
				
				int i = array[index];
				System.out.println(Thread.currentThread().getName() + " " + i + " is even." + " : " + (i % 2 == 0));
				
				index++;
				bQueue.add(index);
				
				try {
					bQueue.notify();
					if (index >= array.length) {
						break;
					}
					bQueue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				//lock.unlock();
		}
	}

}
