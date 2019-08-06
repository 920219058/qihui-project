package ThreadTest;

public class ThreadPriorityTest extends Thread {
	@Override
	public void run() {
		System.out.println("当前线程优先级：" + getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("run方法中， i = " + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new ThreadPriorityTest();
		t1.setPriority(10);
		t1.start();
		System.out.println("主线程的优先级：" + Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("主方法中， i = " + i);
		}
	}

}
