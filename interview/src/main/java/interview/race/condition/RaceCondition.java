package interview.race.condition;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(100);
		
		Thread withdrawal = new Thread(() -> account.withdraw(100));
		Thread deposit = new Thread(() -> account.deposit(100));
		
		withdrawal.start();
		deposit.start();
		
		withdrawal.join();
		deposit.join();
		
		System.out.println(account.getBalance());
	}

}
