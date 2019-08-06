package theradDemo;

public class SubThreadRunTest extends Thread {

	@Override
	public void run() {
		System.out.println("开始干活了。。。。。");
	}

	public static void main(String[] args) {
		Thread t1 = new SubThreadRunTest();
		t1.run();
	}
}
