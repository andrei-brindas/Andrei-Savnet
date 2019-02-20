package pkgandrei;
public class TestEA5 {
	
	 public static int cmmdc(int a, int b) {
		 while (a != b) {
			 if(a > b) {
				 a = a - b;
			 }
			 else {
				 b = b - a;
			 }
		 }
		 
		 return a;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(cmmdc(6,1));
	}
	
	
}
