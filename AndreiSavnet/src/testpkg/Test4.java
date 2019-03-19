package testpkg;

public class Test4 {
	public static void permutations(String s, String prefix, int n) {

		if (prefix.length() == n) {
			System.out.println(prefix);
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			permutations(s.substring(0, i), "" + ch + prefix, n);

		}

	}

	public static void main(String[] args) {

		permutations("abc", "", 3);

	}
}
