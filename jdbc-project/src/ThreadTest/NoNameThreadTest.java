package ThreadTest;

public class NoNameThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("兄弟，该干活了。。。。");
			}
		};
		t1.start();

		new Thread() {
			@Override
			public void run() {
				System.out.println("2兄弟，该干活了。。。。");
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("-------------");
			}
		}).start();
	}
}
