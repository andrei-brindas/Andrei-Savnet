package pkgandrei;
import java.util.Arrays;

public class TestBA8 {
//	public static int[] reverse(int[] sir) {
//		int aux = 0;
//		for(int i=0;i<sir.length;i++) {
//			for(int j=0;j<i;j++) {
//				aux = sir[i];
//				sir[i] = sir[j];
//				sir[j] = aux;
//			}
//		}
//		return sir;
//	}
	
	public static int[] reverse(int[] sir) {
		return reverseArray(sir,0,sir.length-1);
	}
	
	public static int[] reverseArray(int[] a, int i, int j) {
		if(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			reverseArray(a, i+1, j-1);
		}
		return a;
	}
		
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));
	}
}
