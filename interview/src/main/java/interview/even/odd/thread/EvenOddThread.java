package interview.even.odd.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddThread {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> bQueue = new LinkedBlockingQueue<>(1);
		bQueue.add(0);
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		CountDownLatch latch = new CountDownLatch(1);
		Lock lock = new ReentrantLock();
		
		EvenProducer evenProducer = new EvenProducer(bQueue, array,latch, lock);
		OddProducer oddProducer = new OddProducer(bQueue, array, latch, lock);
		
		Thread evenTh = new Thread(evenProducer, "EVEN");
		Thread oddTh = new Thread(oddProducer, "ODD");
		
		oddTh.start();
		evenTh.start();
		
		//oddTh.join();
		//evenTh.join();
	}

}
