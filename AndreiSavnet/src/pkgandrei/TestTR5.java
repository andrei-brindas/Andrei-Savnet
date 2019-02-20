package pkgandrei;
import java.util.Scanner;

public class TestTR5 {

	public static void main(String[] args) {
		
		System.out.println("RON: ");
		Scanner scanner = new Scanner(System.in);
		double ron = scanner.nextDouble();
		
		System.out.println("Rate: ");
		double rate = scanner.nextDouble();
		
		scanner.close();
		
		double euro = ron/rate;
		double rest = euro - (long)euro;
		System.out.println("Suma in EUR: " + (int) euro);
		System.out.println("Suma in RON: " + (int)(rest*rate));
		
	}
	
	
}
