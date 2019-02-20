package pkgandrei;

public class TestEA9 {
	
	public static int countPairs(int[] arr, int n) {
		int nr=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == n) {
					nr++;
				}
			}
		}
		return nr;
	}
	
	public static void main(String[] args) {
		System.out.println(countPairs(new int[]{ 1, 2, 3, 5, 7 }, 10));
	}
}
