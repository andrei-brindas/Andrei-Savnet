package pkgandrei;
public class TestEA7 {

	public static int nthSmallest(int[] sir, int n) {
		if(sir.length < n) {
			return -1;
		}
		
		bubbleSort(sir);
		return sir[n-1];

	}

	public static void bubbleSort(int arr[]) {
		int aux;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}

//	        for(i=0; i<n;i++)
//	            System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 3));
	}

}
