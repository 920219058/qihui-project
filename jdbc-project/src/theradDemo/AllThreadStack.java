package theradDemo;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class AllThreadStack {

	public static void main(String[] args) {

		// ��ȡ�����߳���Ϣ
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long[] threadIds = threadMXBean.getAllThreadIds();
		for (long threadId : threadIds) {
			ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
			System.out.println(threadInfo);

		}
	}
}
