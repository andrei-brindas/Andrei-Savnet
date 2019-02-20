package pkgandrei;
public class TestEA4 {
	
	 public static int cmmmc(int a, int b) {
		 int x = a;
		 int y = b;
		 while(x != y) {
			 if(x>y) {
				 x = x-y;
			 }
			 else {
				 y = y - x;
			 }
		 }
		 
		 return (a*b)/x;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(cmmmc(3, 5));
	}

}
