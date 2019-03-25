package Account;

public class Account {
	private int balance;

	public Account(int money) {
		balance = money;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		balance -= money;
	}

}
