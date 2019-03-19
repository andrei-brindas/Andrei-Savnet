package testpkg;

public class Test1 {
	public static double harmonicAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}
		return (2 * a * b) / (a + b);
	}

	public static void main(String[] args) {
		System.out.println(harmonicAvg(2, 2));
	}
}
