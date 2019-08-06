package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SocketThread extends Thread {
	private Socket s;

	public SocketThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println("客户端链接成功。。。。");
		// 3、使用输入输出流进行通信
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			PrintStream ps = new PrintStream(s.getOutputStream());
			while (true) {
				String aString = br.readLine();
				System.out.println(aString);
				if ("bye".equals(aString)) {
					System.out.println("服务端已经下线。。");
					break;
				}

				ps.println("jieshou dao ");
				System.out.println("服务器发送成功");
			}

			// 4、关闭Socket
			ps.close();
			br.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
