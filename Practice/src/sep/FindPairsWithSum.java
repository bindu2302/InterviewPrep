package sep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindPairsWithSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 5;
		List<int[]> pairs = findPairsSum(arr,target);
		
		for(int[] pair : pairs) {
			System.out.println(Arrays.toString(pair));
		}
	}
	
	public static List<int[]> findPairsSum(int[] arr, int target) {
		Set<Integer> seen = new HashSet<>();
		List<int[]> result = new LinkedList<>();
		
		for(int n:arr) {
			int complement = target - n;
			if(seen.contains(complement)) {
				result.add(new int[] {complement,n});
			}
			seen.add(n);
		}
		return result;
	}
}

//[2, 3]
//[1, 4]
