package ThreadTest;

public class ThreadJoinTest extends Thread {

	@Override
	public void run() {
		System.out.println("倒计时：。。。");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("新年快乐。。。。");
	}

	public static void main(String[] args) throws Exception {
		Thread t1 = new ThreadJoinTest();
		t1.start();
		System.out.println("开始等待。。。。");
		t1.join(5000);
		System.out.println("子线程结束。。。");
	}

}
