package mypractice;

import java.util.Scanner;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] parts = input.trim().split("\\s+");
		
		int[] arr = new int[parts.length];
		
		for(int i=0; i<parts.length; i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}
		
		int result = secondLargestUnique(arr);
		System.out.println("Second largest unique number:" + result);
	}
	
	public static int secondLargestUnique(int[] arr) {
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		if(set.size() < 2) {
			return -1;
		}
		
		set.remove(set.last());
		return set.last();
	}
}

//4 2 9 7 9 4
//Second largest unique number: 7
//
//5 5 5
//Second largest unique number: -1
