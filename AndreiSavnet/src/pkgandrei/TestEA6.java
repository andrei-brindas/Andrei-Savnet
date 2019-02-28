package pkgandrei;

import java.util.Arrays;

public class TestEA6 {

	public static int[] intToArray(int n) {
		if (n == 0) {
			return new int[] { 0 };
		}

		int nr = Integer.toString(n).length();

		int[] arr = new int[nr];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n = n / 10;
		}

		int[] rev = new int[arr.length];
		int j = arr.length;
		for (int i = 0; i < arr.length; i++) {
			rev[j - 1] = arr[i];
			j--;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intToArray(120)));
	}

}
