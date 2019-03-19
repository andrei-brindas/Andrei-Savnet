package testpkg;

public class Test3 {
	public static int next(int[] arr, int n) {
		if (arr[arr.length - 1] == n) {
			return -1;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == n) {
				return arr[i + 1];
			}
		}

		return -2;
	}

	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 5, 7, 2, 4 }, 14));
	}
}
