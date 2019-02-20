package pkgandrei;
public class TestBA5 {
	public static int product(int[] sir) {
		if(sir.length == 0) {
			return 1;
		}
		int produs = 1;
		for(int i: sir) {
			if(i != 0) {
				produs = produs * i;
			}
		}
		return produs;
	}
	
	public static void main(String[] args) {
		System.out.println(product(new int[]{0,0,0}));
	}
}
