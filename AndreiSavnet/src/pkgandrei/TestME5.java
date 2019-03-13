package pkgandrei;

public class TestME5 {
	private static Integer nr = 0;

	private static int getClimbingOptions(int stairs) {
		int size = 100;
		nr = 0;
		int[] arr = new int[size];
		getCombinations(arr, stairs, 0);
		return nr;
	}

	static void getCombinations(int arr[], int n, int i) {
		final int MAX = 2;
		if (n == 0) {
			nr++;
		} else if (n > 0) {
			for (int k = 1; k <= MAX; k++) {
				arr[i] = k;
				getCombinations(arr, n - k, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(getClimbingOptions(2));
	}
}
