package interview.even.odd.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class OddProducer implements Runnable {

	private BlockingQueue<Integer> bQueue;
	private int[] array;
	private CountDownLatch latch;
	private Lock lock;

	public OddProducer(BlockingQueue<Integer> bQueue, int[] array, CountDownLatch latch, Lock lock) {
		this.bQueue = bQueue;
		this.array = array;
		this.latch = latch;
		this.lock = lock;
	}

	@Override
	public void run() {
		int index = -1;
		while (index < array.length) {
			// lock.lock();
			synchronized (bQueue) {
				latch.countDown();

				index = bQueue.poll();
				if (index >= array.length) {
					break;
				}

				int i = array[index];
				System.out.println(Thread.currentThread().getName() + " " + i + " is odd." + " : " + (i % 2 != 0));

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
			// lock.unlock();
		}

	}

}
