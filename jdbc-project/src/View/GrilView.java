package View;

import java.util.Scanner;

public class GrilView {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String in = scanner.next().toString();
		while (scanner.hasNext()) {
			String in = scanner.next().toString();
			System.out.println("您输入的值是：" + in);
		}
	}
}
