package ThreadTest;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 100; i++) {
					if (0 != i % 2) {
						System.out.println("线程一：100的奇数" + i);
					}
				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println("线程二：100的偶数" + i);
					}
				}
			}
		};
		t2.start();
		System.out.println("主线程开始等待。。。。。");
		t1.join();
		t2.join();
		System.out.println("所有的线程执行完毕。。。。。");
	}
}
