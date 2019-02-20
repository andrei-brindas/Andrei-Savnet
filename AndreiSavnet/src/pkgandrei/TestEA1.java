package pkgandrei;
public class TestEA1 {

	public static int reverse(int n) {
		int nr = 0;
		while(n != 0) {
			nr = (nr * 10) + (n%10);
			n = n / 10;
		}
		
		return nr;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
}
