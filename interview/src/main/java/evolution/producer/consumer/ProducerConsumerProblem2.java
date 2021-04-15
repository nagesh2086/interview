package evolution.producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem2 {

	public static void main(String[] args) throws InterruptedException {
		final Buffer b = new Buffer(2,false);

		Thread producer = new Thread(new Runnable() {

			public void run() {
				int value = 0;
				try {
					while (!b.stopSignal) {
						b.add(value);

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
					while (!b.stopSignal) {
						int value = b.poll();

						System.out.println("Consumed: " + value);

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

	static class Buffer {
		private int size;
		private Queue<Integer> queue;
		private boolean stopSignal;

		public Buffer(int size, boolean stopSignal) {
			this.size = size;
			this.queue = new LinkedList<Integer>();
			this.stopSignal = stopSignal;
		}

		public void add(int value) throws InterruptedException {
			synchronized (this) {
				if (queue.size() >= size) {
					wait();
				}
				queue.add(value);
				
				if (value == 20) {
					stopSignal = true;
				}
				
				notify();
			}
		}

		public int poll() throws InterruptedException {
			int value = 0;
			synchronized (this) {
				if (queue.size() == 0) {
					wait();
				}
				
				value = queue.poll();
				
				if (value == 20) {
					stopSignal = true;
				}
				
				notify();
			}
			return value;
		}
	}
}
