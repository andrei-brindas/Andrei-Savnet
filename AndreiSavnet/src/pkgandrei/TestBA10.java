package pkgandrei;

public class TestBA10 {

	public static int getSecondaryDiagonalSum(int[][] matrix) {
		int sum = 0;
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i+j == matrix.length-1) {
					sum = sum + matrix[i][j];
				}	
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getSecondaryDiagonalSum(new int[][]{ {5,91,12,0}, {3,6,33,47}, {2,91,64,4}, {23,1,0,55} }));
	}
}
