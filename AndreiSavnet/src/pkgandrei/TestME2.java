package pkgandrei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestME2 {

	static ArrayList<String> arrayList = new ArrayList<>();

	private static ArrayList<String> combinations(String s, String prefix) {
		if (s.length() == 1) {
			arrayList.add(prefix + s);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			combinations(s.substring(0, i) + s.substring(i + 1), "" + prefix + ch);

		}
		return arrayList;
	}

	public static int[] getPermutations(int n) {
		String nrStr = String.valueOf(n);
		ArrayList<String> arrList;
		arrayList.clear();
		arrList = combinations(nrStr, "");
		Collections.sort(arrList);

		for (int i = 0; i < arrList.size() - 1; i++) {
			if (arrList.get(i).equals(arrList.get(i + 1))) {
				arrList.remove(i);
			}
		}

		int[] result = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++) {
			result[i] = Integer.valueOf(arrList.get(i));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getPermutations(898)));
	}
}
