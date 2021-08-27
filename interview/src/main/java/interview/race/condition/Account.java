package interview.race.condition;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(int amount) {
		int balance = getBalance();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (balance >= amount) {
			balance = balance - amount;
		}
		setBalance(balance);
	}

	public synchronized void deposit(int amount) {
		int balance = getBalance();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance += amount;
		setBalance(balance);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
