package theradDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.printf("线程[%s]正在执行中。。。。\n", Thread.currentThread().getName());
		}, "子线程-1");
		thread.start();
		System.out.printf("线程[%s] 是否还活着：%s\n", thread.getName(), thread.isAlive()); // 先执行
	}

	// 不鼓励Thread
	public static class MyThread extends Thread {
		/**
		 * 多态的方式，覆盖父类的实现
		 */
		@Override
		public void run() {

		}
	}
}
