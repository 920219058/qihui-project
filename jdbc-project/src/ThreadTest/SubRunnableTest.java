package ThreadTest;

public class SubRunnableTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run方法中， i = " + i);
		}
	}

	public static void main(String[] args) {
		SubRunnableTest t = new SubRunnableTest();
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("--主方法中--：i = " + i);
		}
	}

}
