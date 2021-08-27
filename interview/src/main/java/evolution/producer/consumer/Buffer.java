package evolution.producer.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {

	private BlockingQueue<Integer> list;

	public Buffer(Integer size) {
		this.list = new ArrayBlockingQueue<>(size);
	}

	public void produce(Integer i) throws InterruptedException {
		this.list.put(i);
	}

	public Integer consume() throws InterruptedException {
		return this.list.take();
	}
}
