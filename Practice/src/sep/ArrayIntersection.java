package sep;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3,4,5};
		int[] arr2 = {2,4,5,6};
	
		Set<Integer> set1 = new HashSet<>();
		for(int num : arr1) {
			set1.add(num);
		}
		
		Set<Integer> result = new HashSet<>();
		for(int num : arr2) {
			if(set1.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result);  // [2, 4, 5]
	}
}
