//1 2 3 4 5
//4 5 6 7 8
//Common Elements: [4, 5]

package sep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr1Str = sc.nextLine().split(" ");
		int[] arr1 = new int[arr1Str.length];
		for(int i=0; i<arr1Str.length; i++) {
			arr1[i] = Integer.parseInt(arr1Str[i]);
		}
		
		String[] arr2Str = sc.nextLine().split(" ");
		Set<Integer>set = new HashSet<>();
		for(String s : arr2Str) {
			set.add(Integer.parseInt(s));
		}
		
		List<Integer>common = new ArrayList<>();
		Set<Integer>seen = new HashSet<>();
		for(int num : arr1) {
			if(set.contains(num) && !seen.contains(num)) {
				common.add(num);
				seen.add(num);
			}
		}
        System.out.println("Common Elements: " + common);
	}
}


