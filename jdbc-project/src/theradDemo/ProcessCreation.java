package theradDemo;

import java.io.IOException;

public class ProcessCreation {

	// ���� ����
	public static void main(String[] args) {
		// ��ȡ java Runtime
		Runtime runtime = Runtime.getRuntime();
		Process process;
		try {
			process = runtime.exec("cmd /k start https://www.baidu.com");
			process.exitValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
