package sep;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,2,5,6,7,8,5};
		System.out.println(findDup(arr));
	}
	
	public static Set<Integer> findDup(int[] arr) {
		Set<Integer>seen = new HashSet<>();
		Set<Integer>dup = new HashSet<>();
		
		for(int num : arr) {
			if(!seen.add(num)) {
				dup.add(num);
			}
		}
		return dup;
	}
}

//[1, 2, 5]