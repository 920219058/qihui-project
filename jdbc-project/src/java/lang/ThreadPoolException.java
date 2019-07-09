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
			 * 通过覆盖{@link ThreadPoolExecutor # afterExecute}达到取货异常信息
			 */
			@Override
			protected void afterExecute(Runnable r, Throwable t) {
				System.out.printf("线程[%s] 遇到异常,详细信息：%s\n", Thread.currentThread().getName(), t.getMessage());
			}
		};

		executorService.execute(() -> {
			throw new RuntimeException("数据达到阈值。");
		});
		// 等待一秒钟 确保任务完成
		executorService.awaitTermination(1, TimeUnit.SECONDS);

		// 关闭线程池
		executorService.shutdown();

	}
}
