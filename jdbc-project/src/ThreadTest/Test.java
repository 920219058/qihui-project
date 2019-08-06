package ThreadTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import dao.User;

public class Test {

	public static void main(String[] args) throws Exception {
		System.out.println("请输入你发送的内容：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		System.out.println("你输入的是：" + string);
		PrintStream ps = new PrintStream(new FileOutputStream("Z:\\tmp\\1.txt"));
		ps.println(string);
		ps.close();
	}

	public static void Testqwe(String[] args) {
		String[] aString = "123,456,789,123,456".split(",");
		Map<String, Integer> map = new HashMap<>();
		for (String aString2 : aString) {
			if (map.containsKey(aString2)) {
				map.put(aString2, map.get(aString2) + 1);
			} else {
				map.put(aString2, 1);
			}
		}
		System.out.println(map);
	}

	@org.junit.Test
	public void FileInputStreamTest() throws Exception {
		String aString = "Z:/BaiduNetdiskDownload/（moquu.com分享）微信小程序五部入门+实战视频/微信小程序开发-初探篇_超清.mp4";
		String bString = "Z:/BaiduNetdiskDownload/（moquu.com分享）微信小程序五部入门+实战视频/a.tex";
		FileOutputStream fInputStream = new FileOutputStream(bString);
		fInputStream.write(123);
		fInputStream.flush();
		System.out.println("-------------");
	}

	@org.junit.Test
	public void copyFile() throws Exception {
		String sorFile = "Z:\\tmp\\Navicat汉化版.rar";
		String desFile = "Z:\\tmp\\1.rar";
		FileOutputStream fio = new FileOutputStream(desFile);
		FileInputStream deso = new FileInputStream(sorFile);
		byte[] barry = new byte[1024];
		int desc = 0;
		while ((desc = deso.read(barry)) != -1) {
			// fio.write(barry);
			fio.write(barry, 0, desc);
		}
		deso.close();
		fio.close();
	}

	@org.junit.Test
	public void TestWriteObjectOutput() throws Exception {
		String aString = "Z:\\tmp\\1.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(aString));
		User user = new User("wuqihui", "1234", "13457659811");
		oos.writeObject(user);
		oos.close();

	}

	@org.junit.Test
	public void testReadeObjectInput() throws Exception {
		String inputFile = "Z:\\tmp\\1.txt";
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputFile));
		Object object = inputStream.readObject();
		System.out.println(object);
	}

	@org.junit.Test
	public void AccountTest() throws InterruptedException {
		Account account = new Account(1000);
		// Account account2 = new Account(1000);
		Thread t1 = new Thread(account);
		Thread t2 = new Thread(account);
		System.out.println("主线程开始等待。。。");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("当前账户余额是：" + account.getBalance());

	}

}
