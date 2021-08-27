package evolution.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerWithBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new LinkedBlockingDeque<Integer>();
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					int i = 0;
					while (true) {
						queue.put(i);
						System.out.println(" produced " + i);
						i++;
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while (true) {
						Integer consumed = queue.take();
						System.out.println("Consumed " + consumed);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();
		consumer.start();

		producer.join();
		consumer.join();
	}

}
