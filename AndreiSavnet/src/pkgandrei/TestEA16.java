package pkgandrei;

public class TestEA16 {

	public static int countAppearances(int[] a, int[] b) {
		int nr = 0;
		for (int i = 0; i <= (a.length - b.length); i++) {
			int j = 0;
			for (int k : b) {
				if (a[i + j] == k) {
					j++;
				}
			}
			if (j == b.length && b.length > 0) {
				nr++;
			}
		}
		return nr;
	}

	public static void main(String[] args) {
		System.out.println(countAppearances(new int[] { 1, 1, 2, 1, 2, 1, 1, 1 }, new int[] { 1, 2, 1 }));
	}

}
