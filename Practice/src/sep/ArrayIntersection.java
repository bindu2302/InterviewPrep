//1 2 3 4 5
//4 5 6 7 8
//Common Elements: [4, 5]


package sep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input1 = sc.nextLine().split(" ");
		int[] arr1 = new int[input1.length];
		for(int i=0; i<input1.length; i++) {
			arr1[i] = Integer.parseInt(input1[i]);
		}
		
		String[] input2 = sc.nextLine().split(" ");
		int[] arr2 = new int[input2.length];
		for(int i=0; i<input2.length; i++) {
			arr2[i] = Integer.parseInt(input2[i]);
		}
		
		Set<Integer> set1 = new HashSet<>();
		for(int num : arr1) {
			set1.add(num);
		}
		
		Set<Integer> result = new TreeSet<>();
		for(int num : arr2) {
			if(set1.contains(num)) {
				result.add(num);
			}
		}
		System.out.println("Common Elements: " + result);
	}
}
