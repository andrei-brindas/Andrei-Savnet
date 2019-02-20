package pkgandrei;
public class TestBA1 {
	
	 public static double avg(int[] sir) {
		 double sum = 0;
		 for(int i:sir) {
			 sum = sum + i;
		 }
		 return sum / sir.length;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(avg(new int[] {4, 2, 3}));
	}
}
