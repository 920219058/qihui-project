package ThreadTest;

public class SubThreadStartTest extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run方法中， i = " + i);
		}
	}

	public static void main(String[] args) {
		Thread t = new SubThreadStartTest();
		t.start();
		// t.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("--主方法中--：i = " + i);
		}
	}

}
