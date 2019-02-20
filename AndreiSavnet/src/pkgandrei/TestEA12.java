package pkgandrei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEA12 {
	public static int[] removePosition(int[] arr, int pos) {
		if(pos < 0 || pos >= arr.length || arr.length == 0){
            return null;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
                if(i==pos){
                    list.remove(pos);
                }
        }

        int[] arr2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }

        return arr2;
    
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removePosition(new int[] {5, 8, 11, 3, 6}, 2)));
	}
}
