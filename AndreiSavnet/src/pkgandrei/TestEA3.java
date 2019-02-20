package pkgandrei;
public class TestEA3 {

	public static boolean isPrime(int n) {
		
		int nr = 1;
		for(int i=1;i<n;i++) {
			if(n % i == 0) {
				nr++;
			}
		}
		
		if(nr == 2) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(9));
	}
	
	
}
