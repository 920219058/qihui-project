package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {

	public static void main(String[] args) throws IOException {
		// 1创建ServerSocket 类型的对象并提供端口号
		ServerSocket ss = new ServerSocket(8888);
		// 2 等待客户端的链接请求，调用accept方法 可以多个连城链接
		System.out.println("等待客户端的链接请求。。。。");
		// 当没有客户端链接 阻塞在accept
		while (true) {
			Socket s = ss.accept();
			System.out.println(s.getInetAddress() + ":客户端链接成功。。。。");
			new SocketThread(s).start();
		}
	}
}
