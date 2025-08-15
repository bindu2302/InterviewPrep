package mypractice;

import java.util.Scanner;

public class MaxEleInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr  = {12,3,1,10,44,52};
		
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			max = arr[i];
		}
		System.out.println("Max ele in array: " + max);
	}
}
//Max ele in array: 52
