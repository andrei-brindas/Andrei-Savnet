package pkgandrei;

public class TestEA21 {

	public static String hangman(String word, String letters) {
		String result = "";
		for (int i = 0; i < word.toCharArray().length; i++) {

			if (word.charAt(i) == ' ') {
				result = result + " ";
				continue;
			}
			if (word.matches("^[a-z A-Z]*$")) {
				boolean check = false;
				for (char ch : letters.toLowerCase().toCharArray()) {
					if (word.toLowerCase().charAt(i) == ch) {
						result = result + word.charAt(i);
						check = true;
					}
				}
				if (!check) {
					result = result + "_";
				}
			} else {
				return null;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(hangman("collections", "eio"));
	}
}
