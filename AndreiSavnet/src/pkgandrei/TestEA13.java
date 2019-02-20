package pkgandrei;

public class TestEA13 {
	
	public static int getMaxTriple(int[] arr) {
		int sum = 0;
        if(arr.length < 4){
            //for(int i=0;i<arr.length;i++)
           for(int i:arr) {
               sum = sum+ arr[i];
            }
        }

        for(int i=0;i<arr.length-2;i++){
            if ((arr[i] + arr[i + 1] + arr[i + 2]) > sum) {
                sum = arr[i] + arr[i + 1] + arr[i + 2];
            }

        }

        return sum;
    
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxTriple( new int[]{3, 8, 5, 21, 10, 5, 13, 9} ));
	}
}
