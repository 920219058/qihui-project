package java.lang;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolException {

	private void mian() throws InterruptedException {
		// ExecutorService executorService = Executors.newFixedThreadPool(2);

		ThreadPoolExecutor executorService = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MINUTES,
				new LinkedBlockingQueue<Runnable>()) {
			/**
			 * ͨ������{@link ThreadPoolExecutor # afterExecute}�ﵽȡ���쳣��Ϣ
			 */
			@Override
			protected void afterExecute(Runnable r, Throwable t) {
				System.out.printf("�߳�[%s] �����쳣,��ϸ��Ϣ��%s\n", Thread.currentThread().getName(), t.getMessage());
			}
		};

		executorService.execute(() -> {
			throw new RuntimeException("���ݴﵽ��ֵ��");
		});
		// �ȴ�һ���� ȷ���������
		executorService.awaitTermination(1, TimeUnit.SECONDS);

		// �ر��̳߳�
		executorService.shutdown();

	}
}
