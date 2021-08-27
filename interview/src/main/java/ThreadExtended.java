
public class ThreadExtended extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadExtended te = new ThreadExtended();
		te.start();
	}

	public void run(){
		System.out.println(Thread.currentThread().getName() + " running");
	}
}
