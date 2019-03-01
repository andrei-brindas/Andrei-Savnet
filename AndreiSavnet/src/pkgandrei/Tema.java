package pkgandrei;

import java.util.Scanner;

public class Tema {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string: ");

		String str = scanner.nextLine();

		scanner.close();

		char[] chars = str.toCharArray();
//	        System.out.println(chars.length);

		String first = "";
		String second = "";
		char sign = 0;
		int nr = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '+' || chars[i] == '-') {
				sign = chars[i];
				nr = i;
			}
		}

		for (int i = 0; i < nr; i++) {
			first = first + chars[i];
		}

		for (int i = nr + 1; i < chars.length; i++) {
			second = second + chars[i];
		}

		int a = Integer.parseInt(first);
		int b = Integer.parseInt(second);

//	        System.out.println("a: " + a);
//	        System.out.println("b: " + b);

		if (sign == '+') {
			System.out.println(a + b);
		}

		else if (sign == '-') {
			if (a > b) {
				System.out.println(a - b);
			} else {
				System.out.println(b - a);
			}
		}
	}
}
