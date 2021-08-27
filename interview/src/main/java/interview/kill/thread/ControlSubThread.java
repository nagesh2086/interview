package interview.kill.thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class ControlSubThread implements Runnable {
	private Thread worker;
	private AtomicBoolean running = new AtomicBoolean(true);
	private int interval;

	public ControlSubThread(int interval) {
		this.interval = interval;
	}

	public void start() {
		worker = new Thread(this);
		worker.start();
	}

	public void interruptWorker() {
		running.set(false);
		worker.interrupt();
	}

	@Override
	public void run() {
		while (running.get()) {
			System.out.println(Thread.currentThread().getName() + " started.");
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
				System.out.println(Thread.currentThread().getName() + " interrupted.");
			}
		}
	}

	public static void main(String[] args) {
		ControlSubThread cst = new ControlSubThread(500);
		cst.start();
		try {
			System.out.println(Thread.currentThread().getName() + " sleeping 2000ms.");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(Thread.currentThread().getName() + " interrupted.");
		}
		cst.interruptWorker();
	}
}
