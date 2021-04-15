package evolution.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		final BlockingQueue<Integer> b = new LinkedBlockingQueue<Integer>();

		Thread producer = new Thread(new Runnable() {

			public void run() {
				int value = 0;
				try {
					while (true) {
						b.put(value);

						System.out.println("produced: " + value);

						value++;

						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			public void run() {
				try {
					int value = b.take();

					System.out.println("Consumed: " + value);

					Thread.sleep(1000);
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
