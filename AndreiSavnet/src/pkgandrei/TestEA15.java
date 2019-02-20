package pkgandrei;

import java.util.Arrays;

public class TestEA15 {

	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] prodMatrix = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					prodMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return prodMatrix;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(
				(getMatrixProduct(new int[][] { { 4, 2 }, { 0, 1 } }, new int[][] { { 0, 2 }, { 2, 1 } }))));
	}

}
