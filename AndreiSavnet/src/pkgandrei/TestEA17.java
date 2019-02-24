package pkgandrei;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEA17 {
	public static int[] removeDuplicates(int[] arr) {
		int[] temp = new int[] {};
		if (arr.length == 0) {
			return temp;
		}

		Arrays.sort(arr);

		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				array.add(arr[i]);
			}
		}
		array.add(arr[arr.length - 1]);

		int[] unicArray = new int[array.size()];

		for (int i = 0; i < array.size(); i++) {
			unicArray[i] = array.get(i);
		}

		return unicArray;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 3, 2, 2, 2, 3, 3, 3, 3 })));
	}

}
