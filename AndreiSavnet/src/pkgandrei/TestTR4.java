package pkgandrei;
import java.util.Scanner;

public class TestTR4 {
	
	 public static void main(String[] args) {
		 
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Exchange rate: ");
		    double rate = scanner.nextDouble();
		    System.out.println("Desired sum in EUR: ");
		    double euro = scanner.nextDouble();
		        
		    scanner.close();
		    
		    System.out.printf("Suma in RON: %.2f" , rate*euro);
	 }
}
