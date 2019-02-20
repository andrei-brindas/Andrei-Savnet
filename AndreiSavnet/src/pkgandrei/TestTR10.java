package pkgandrei;
public class TestTR10 {

	public static int marginsAverage(int[] arr) {
		return arr[0]+arr[arr.length-1]/2;
	}
	
	public static void main(String[] args) {
		marginsAverage(new int[] {0,1,2,3});
	}
}
