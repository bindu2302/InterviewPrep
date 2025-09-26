package sep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,2,5,6,7,8,5};
        int[] unique = removeDup(arr);
        System.out.println(Arrays.toString(unique));
	}
	
	public static int[] removeDup(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int[] result = new int[set.size()];
		int i=0;
		for(int num : set) {
			result[i++] = num;
		}
		return result;
	}
}

//[1, 2, 3, 4, 5, 6, 7, 8]

