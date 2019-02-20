package pkgandrei;
public class TestTR9 {
	
	public static boolean inPitagoraRelation(int a, int b, int c) {
		return (a*a + b*b == c*c && (a+b+c) % 10 == 0);
	}
	
	public static void main(String[] args) {
		inPitagoraRelation(5, 12, 13);
	}
}
