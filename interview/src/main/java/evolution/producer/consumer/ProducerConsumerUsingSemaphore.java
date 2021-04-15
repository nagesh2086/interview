package evolution.producer.consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerConsumerUsingSemaphore {

	public static void main(String[] args) throws InterruptedException {
		final Buffer b = new Buffer(2);

		Thread producer = new Thread(new Runnable() {

			public void run() {
				b.produce();
				/*try {
					b.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		});

		Thread consumer = new Thread(new Runnable() {

			public void run() {
				b.consume();
				/*try {
					b.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		});

		producer.start();
		consumer.start();

		producer.join();
		consumer.join();
	}

	static class Buffer {
		private int size;
		private int value = 0;
		private Queue<Integer> queue;
		private Semaphore sema = new Semaphore(1);

		public Buffer(int size) {
			this.size = size;
			this.queue = new LinkedList<Integer>();
		}

		public void produce() {
			while (true) {
				try {
					sema.acquire();
					queue.add(value);
					System.out.println("Produced: " + value);
					value++;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					sema.release();
				}
			}
			
			/*while (true) {
				synchronized (this) {
					if (this.queue.size() >= this.size) {
						this.wait();
					}
					queue.add(value);
					System.out.println("Produced: " + value);
					value++;
					this.notify();
					Thread.sleep(1000);
				}
			}*/
		}

		public void consume() {
			while (true) {
				try {
					sema.acquire();
					Integer polledVal = queue.poll();
					System.out.println("Consumed: " + polledVal);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					sema.release();
				}
			}
			
			/*while (true) {
				synchronized (this) {
					if (this.queue.size() == 0) {
						this.wait();
					}
					Integer value = this.queue.poll();
					System.out.println("Consumed: " + value);
					this.notify();
					Thread.sleep(1000);
				}
			}*/
		}
	}

}
