package pkgandrei;
public class TestEA8 {

	public static boolean contains(int[] a, int[] b) {
		
		if(b.length == 0) {
			return true;
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int k, x=0;
				for(k=i;k<j;k++) {
					if(a[k] == b[x]) {
						x++;
					}
					if(x==b.length) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(contains(new int[]{1, 2, 3, 4, 2, 1, 3, 4},new int[] {2, 3, 4}));
	}
	
}
