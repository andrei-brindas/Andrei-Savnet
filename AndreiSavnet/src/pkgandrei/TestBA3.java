package pkgandrei;

public class TestBA3 {
	
	public static int factorial(int n) {
		
		int fact = 1;
		
		if(n>0) {
			for(int i=1;i<=n;++i) {
				fact = fact * i;
			}
		}
		return fact;
	}
	
	public static void main(String[] args) {
		factorial(1);
	}
}
