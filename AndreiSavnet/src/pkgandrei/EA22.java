package pkgandrei;

public class EA22 {
	public static int stringSum(String input) {
		input = input.trim();

		if (input.length() == 0) {
			return 0;
		}

		String[] arrString = input.split("[, ]+");
		int[] arrInt = new int[arrString.length];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(arrString[i]);
		}

		int sum = 0;
		for (int i : arrInt) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(stringSum(" 6, 11"));
	}
}
