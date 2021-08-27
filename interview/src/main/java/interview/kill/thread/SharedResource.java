package interview.kill.thread;

public class SharedResource implements Runnable {
	private int a;
	private int b;
	private int c;
	private volatile boolean stopProcessing;

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

	public static void main(String[] args) {

	}

	@Override
	public void run() {
		while (!stopProcessing) {
			synchronized (this) {
				int tcnt = (threadLocal.get() == null ? 0 : threadLocal.get()) + 1;
				threadLocal.set(tcnt);
				System.out.println(Thread.currentThread().getName() + " : " + tcnt + " : " + a + b + c);
				++a;
				++b;
				++c;
				System.out.println(Thread.currentThread().getName() + " : " + tcnt + " : " + a + b + c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void stopProcessing() {
		this.stopProcessing = true;
	}

}
