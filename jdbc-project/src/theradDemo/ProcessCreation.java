package theradDemo;

import java.io.IOException;

public class ProcessCreation {

	// 创建 进程
	public static void main(String[] args) {
		// 获取 java Runtime
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
