package pkgandrei;
public class TestBA6 {
	 public static int arrayToNumber(int[] sir) {
		 if(sir.length == 0) {
			 return -1;
		 } 		 
		 int number = 0;
		 for(int i:sir) {
			 if(i < 0 || i > 9) {
				 return -2;
			 }
			 
			else number = Integer.valueOf(number + String.valueOf(i));
		 }		 
	 	return number;	 
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(arrayToNumber(new int[] {1,1,1}));
	}
}
