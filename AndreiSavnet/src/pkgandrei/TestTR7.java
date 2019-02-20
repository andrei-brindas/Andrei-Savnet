package pkgandrei;
public class TestTR7 {
	
	 public static double fahrenheitToCelsius(double temperature) {
		 return (temperature-32)*5/9;
	 }
	 
	 public static void main(String[] args) {
		fahrenheitToCelsius(100);
		fahrenheitToCelsius(0);
		fahrenheitToCelsius(50);
	}
	 
}
