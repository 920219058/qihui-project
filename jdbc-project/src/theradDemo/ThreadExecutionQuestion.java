package theradDemo;

public class ThreadExecutionQuestion {

	public static void main(String[] args) {
		threadWait();
	}

	private static void threadWait() {
		Thread t1 = new Thread(ThreadExecutionQuestion::action, "t1");
		Thread t2 = new Thread(ThreadExecutionQuestion::action, "t2");
		Thread t3 = new Thread(ThreadExecutionQuestion::action, "t3");
		try {
			threadStartAndWait(t1);
			threadStartAndWait(t2);
			threadStartAndWait(t3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	private static void threadStartAndWait(Thread thread) throws InterruptedException {
		if (Thread.State.NEW.equals(thread.getState())) {
			thread.start();
		}
		while (thread.isAlive()) {
			synchronized (thread) {
				thread.wait(); // ������˭֪ͨ�� Thread -> thread.notify();
			}
		}
	}

	// *******************************88
	private static void threadSleep() throws InterruptedException {
		Thread t1 = new Thread(ThreadExecutionQuestion::action, "t1");
		Thread t2 = new Thread(ThreadExecutionQuestion::action, "t2");
		Thread t3 = new Thread(ThreadExecutionQuestion::action, "t3");

		t1.start();
		while (t1.isAlive()) {
			// sleep
			Thread.sleep(10);
		}
		t2.start();
		while (t2.isAlive()) {
			Thread.sleep(10);
		}
		t3.start();
		while (t3.isAlive()) {
			Thread.sleep(10);
		}
	}

	private static void threadLoop() {
		Thread t1 = new Thread(ThreadExecutionQuestion::action, "t1");
		Thread t2 = new Thread(ThreadExecutionQuestion::action, "t2");
		Thread t3 = new Thread(ThreadExecutionQuestion::action, "t3");

		t1.start();
		while (t1.isAlive()) {
			// ���� Spin
		}
		t2.start();
		while (t2.isAlive()) {

		}
		t3.start();
		while (t3.isAlive()) {

		}

	}

	private static void threadJoinOneByOne() throws InterruptedException {
		Thread t1 = new Thread(ThreadExecutionQuestion::action, "t1");
		Thread t2 = new Thread(ThreadExecutionQuestion::action, "t2");
		Thread t3 = new Thread(ThreadExecutionQuestion::action, "t3");
		// start() ����֪ͨ�߳�����

		// join() �����̱߳���ִ�����
		t1.start();
		t1.join();

		t2.start();
		t2.join();

		t3.start();
		t3.join();
	}

	private static void action() {
		System.out.printf("�߳�[%s]����ִ���С�������\n", Thread.currentThread().getName());
	}
}
