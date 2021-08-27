package interview.even.odd.thread;
import java.util.concurrent.*;

public class OddEvenCountDownLatchFlavor {
    public static void main(String [] args){
        Object lock = new Object();
        CountDownLatch latch = new CountDownLatch(1);
        Thread oddThread = new OddThread(lock, latch);
        Thread evenThread = new EvenThread(lock, latch);
          
        oddThread.start();
        evenThread.start();
          
        try{
          oddThread.join();
        } catch (InterruptedException ex){
          System.out.println("Main thread is interrupted while waiting " +
                             "for Odd thread to finish execution"+ ex.getMessage());
        }        
    }

    static class OddThread extends Thread {
        private final Object lock;
        private final CountDownLatch latch;

        OddThread(Object lock, CountDownLatch latch){
            this.lock = lock;
            this.latch = latch;
        }

        public void run(){
          synchronized(lock){
              for(int i=1;i<20;i=i+2){
                  System.out.println("Odd thread " + i);
                  latch.countDown();
                  try {	                
                      lock.notify();
                      lock.wait();
                  } catch(InterruptedException ex){
                  	System.out.println("Odd thread is interrupted while waiting for " + 
                                       "Even thread notification"+ ex.getMessage());
                  }
              }
          }	        
        }
    }

    static class EvenThread extends Thread {
        private final Object lock;
        private final CountDownLatch latch;	    
        EvenThread(Object lock, CountDownLatch latch){
              this.lock = lock;
              this.latch = latch;	        
        }
        public void run(){
          try{
                latch.await();
            } catch (InterruptedException ex){
              System.out.println(ex);
            }	        
            synchronized(lock){	        	
                for(int i=2;i<=20;i=i+2){
                    System.out.println("Even thread" + i);
                    try {	                
                        lock.notify();
                        lock.wait();
                    } catch(InterruptedException ex){
                      System.out.println("Even thread is interrupted while waiting " + 
                                         "for Odd thread notification"+ ex.getMessage());
                    }
                }
            }
        }	    
    }
}