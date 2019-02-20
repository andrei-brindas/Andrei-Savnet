package pkgandrei;
public class TestEA2 {

	public static boolean isPalindrome(int n) {
		
		int nr = 0;
		int m = n;
		while(n!=0) {
			nr = (nr*10) + (n%10);
			n = n/10;
		}
		
		if(nr == m) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
	}
}
