package java.lang;

public class HowToStopThread {
	private void mian() throws InterruptedException {
		// TODO Auto-generated method stub

		Action action = new Action();

		// �̻����̵߳��쳣
		Thread.setDefaultUncaughtExceptionHandler((thread, Throwable) -> {
			System.out.printf("�߳�[%s] �������쳣����ϸ��Ϣ��%s \n", thread.getName(), Throwable.getMessage());
		});

		// ���߳�
		Thread t1 = new Thread(action, "t1");
		t1.start();

		// �ı��̵߳�״̬
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
		// �̰߳�ȫ���� ��ȷ���ɼ��� ����� volatile ʹ������ʵ���̵߳�ֹͣ����
		private volatile boolean stopped = false;

		@Override
		public void run() {
			if (!stopped) {
				action();// ִ�в���
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
