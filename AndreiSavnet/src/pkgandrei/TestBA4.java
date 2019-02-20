package pkgandrei;

public class TestBA4 {
	
	public static int max(int[] sir) {
			
		if(sir.length == 1) {
			return sir[0];
		}
		
		return recursiv(sir,0);
	}
	
	private static int recursiv(int[]sir, int i) {
		if(i == sir.length-1) {
            return sir[i];
        }
		if(sir[i]>sir[i + 1]) {
			sir[i + 1] = sir[i];
		}
		return recursiv(sir,i + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(max(new int[]{0, -6, -3, -8, -4}));
	}
}
