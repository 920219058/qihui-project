package theradDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.printf("�߳�[%s]����ִ���С�������\n", Thread.currentThread().getName());
		}, "���߳�-1");
		thread.start();
		System.out.printf("�߳�[%s] �Ƿ񻹻��ţ�%s\n", thread.getName(), thread.isAlive()); // ��ִ��
	}

	// ������Thread
	public static class MyThread extends Thread {
		/**
		 * ��̬�ķ�ʽ�����Ǹ����ʵ��
		 */
		@Override
		public void run() {

		}
	}
}
