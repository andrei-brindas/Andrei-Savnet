package pkgandrei;
import java.util.Scanner;

public class TestTR3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt(); 

		scanner.close();

		System.out.println(number*number);
        System.out.println(number*number*number);
	}
}
