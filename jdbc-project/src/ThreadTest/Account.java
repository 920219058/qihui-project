package ThreadTest;

public class Account implements Runnable {
	@Override
	public synchronized void run() {
		int temp = getBalance();
		if (temp > 200) {
			System.out.println("正在出钞。。。。");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			temp -= 200;
			System.out.println("请取走你的钞票。。。");
		} else {
			System.out.println("账户余额不足，请核对您的账户余额。。。。");
		}
		setBalance(temp);
	}

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public Account() {

	}

}
