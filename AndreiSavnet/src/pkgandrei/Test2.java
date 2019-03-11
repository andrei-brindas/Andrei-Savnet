package pkgandrei;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti o expresie: ");
		String s = scanner.nextLine();
		scanner.close();

		Integer c = Integer.parseInt("" + s.charAt(0));
		char a = s.charAt(1);
		Integer b = Integer.parseInt("" + s.charAt(2));
		int result = 0;
		if (a == '+') {
			result = c + b;
		} else if (a == '-') {
			result = c - b;
		}
		System.out.println(result);

	}
}
