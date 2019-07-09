package java.lang;

public class HowToStopThread {
	private void mian() throws InterruptedException {
		// TODO Auto-generated method stub

		Action action = new Action();

		// 铺货子线程的异常
		Thread.setDefaultUncaughtExceptionHandler((thread, Throwable) -> {
			System.out.printf("线程[%s] 遇到了异常，详细信息：%s \n", thread.getName(), Throwable.getMessage());
		});

		// 子线程
		Thread t1 = new Thread(action, "t1");
		t1.start();

		// 改变线程的状态
		action.setStopped(false);
		t1.join();

		Thread t2 = new Thread(() -> {
			if (!Thread.currentThread().isInterrupted()) {
				action();
			}
		}, "t2");

		t2.start();
		t2.interrupt();
		t2.join();
	}

	private static class Action implements Runnable {
		// 线程安全问题 ，确保可见性 必须加 volatile 使用这种实现线程的停止不好
		private volatile boolean stopped = false;

		@Override
		public void run() {
			if (!stopped) {
				action();// 执行操作
			}
		}

		public void setStopped(boolean stopped) {
			this.stopped = stopped;
		}

	}

	private static void action() {
		// TODO Auto-generated method stub
	}
}
