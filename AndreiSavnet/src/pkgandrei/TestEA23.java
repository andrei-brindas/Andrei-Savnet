package pkgandrei;

public class TestEA23 {

	public static String camelCase(String input) {
		input = input.trim();
		input = input.toLowerCase();

		String[] arr = input.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {
				arr[i + 1] = arr[i + 1].toUpperCase();
			}
		}

		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i] + "";
		}

		result = result.replace(" ", "");
		return result;
	}

	public static void main(String[] args) {
		System.out.println(camelCase("ana are mere"));
		System.out.println(camelCase(" ANA are MERE"));
	}
}
