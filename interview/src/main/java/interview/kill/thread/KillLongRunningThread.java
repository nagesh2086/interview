package interview.kill.thread;

public class KillLongRunningThread {

	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		Thread t = new Thread(sharedResource);
		t.start();
		
		Thread t1 = new Thread(sharedResource);
		t1.start();
		
		Thread t2 = new Thread(sharedResource);
		t2.start();
		
		Thread t3 = new Thread(sharedResource);
		t3.start();
		
		Thread t4 = new Thread(sharedResource);
		t4.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sharedResource.stopProcessing();
	}

}
