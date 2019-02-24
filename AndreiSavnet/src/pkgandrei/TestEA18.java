package pkgandrei;

public class TestEA18 {

	public static int countSums(int[] arr) {
		int nr = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						nr++;
						k++;
						j++;
						i++;
					}
				}
			}
		}

		return nr;
	}

	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 1, 2, 3, 4 }));
	}
}