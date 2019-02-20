package pkgandrei;
public class TestBA2 {
	
	public static int countNegatives(int[] sir) {
		int nr=0;
		for(int i:sir) {
			if(i<0) {
				nr++;
			}
		}
		return nr;
	}
	
	public static void main(String[] args) {
		System.out.println(countNegatives(new int[] {10, 14, -21, -4, 0, 2, -3}));
	}
}
