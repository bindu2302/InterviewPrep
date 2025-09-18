package mypractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = {4,2,1,3,5,6,4,6};
		Set<Integer> seen = new HashSet<>();
		Set<Integer> dup = new HashSet<>();
		
		for(int num: arr) {
			if(!seen.add(num)) {
				dup.add(num);
			}
		}
        System.out.println("Duplicates: " + dup);
	}
}

//Duplicates: [4, 6]