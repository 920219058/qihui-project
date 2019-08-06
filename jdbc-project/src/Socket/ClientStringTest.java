package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientStringTest {

	public static void main(String[] args) throws Exception {
		// 1、创建Socket类型的对象并提供服务器的IP地址和端口号
		// Socket s = new Socket("qihui-PC", 8888);
		Socket s = new Socket(InetAddress.getLocalHost(), 8888);
		System.out.println("链接服务器成功。。。。");
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		while (true) {
			// 2、使用输入输出流进行通信
			String msg = sc.nextLine();
			// 实现客户端向服务端发送的内容是由键盘输入
			ps.println(msg);
			if ("bye".equals(msg)) {
				System.out.println("聊天结束。。。");
				break;
			}
			// 接收消息
			String aString = br.readLine();
			System.out.println(aString);

		}

		// 3、关闭Socket
		br.close();
		ps.close();
		s.close();
	}

}
