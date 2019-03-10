package pkgandrei;

import java.util.ArrayList;
import java.util.Collections;

public class TestEA20 {
	public static boolean sudokuChecker(int[][] matrix) {

		ArrayList<Integer> elements = new ArrayList<>();

		for (int[] matrix1 : matrix) {
			for (int j = 0; j < matrix[0].length; j++) {
				elements.add(matrix1[j]);
				if (matrix1[j] > 9 || matrix1[j] < 0) {
					return false;
				}
			}
		}

		Collections.sort(elements);

		if (elements.size() != 9) {
			return false;
		}

		for (int i = 0; i < elements.size() - 1; i++) {
			if ((elements.get(i).equals(elements.get(i + 1))) && (elements.get(i) != 0)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(sudokuChecker(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 4, 0 } }));
	}
}
