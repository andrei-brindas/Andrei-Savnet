package pkgandrei;

import java.util.Arrays;

public class TestME3 {

	public static int[][] fill(int[][] matrix, int x, int y) {

		if (matrix[x][y] != 1 && matrix[x][y] != 2) {
			matrix[x][y] = 2;
			if (x > 0) {
				fill(matrix, x - 1, y);
			}
			if (y > 0) {
				fill(matrix, x, y - 1);
			}
			if (x < matrix.length - 1) {
				fill(matrix, x + 1, y);
			}
			if (y < matrix.length - 1) {
				fill(matrix, x, y + 1);
			}
		}
		return matrix;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(fill(new int[][] { {0, 0, 1, 1, 0},{0, 0, 0, 1, 1},{1, 1, 0, 1, 0},
{1, 0, 0, 1, 0},{0, 1, 0, 1, 0} }, 4, 4)));
	}
}
