package evolution.producer.consumer;
import java.util.LinkedList;
import java.util.Queue;

public class ClassicProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {
		final Buffer b = new Buffer(2,false);

		Thread producer = new Thread(new Runnable() {

			public void run() {
				try {
					b.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			public void run() {
				try {
					b.consume();
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

		public void produce() throws InterruptedException {
			int value = 0;
			while (!stopSignal) {
				synchronized (this) {
					if (queue.size() >= size) {
						wait();
					}
					queue.add(value);
					System.out.println("produced: " + value);
					value++;
					if (value == 20) {
						stopSignal = true;
					}
					notify();
					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException {
			while (!stopSignal) {
				synchronized (this) {
					if (queue.size() == 0) {
						wait();
					}
					Integer value = queue.poll();
					System.out.println("Consumed: " + value);
					if (value == 19) {
						stopSignal = true;
					}
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
