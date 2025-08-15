package mypractice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				System.out.println("Ele is found at: " + i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Not Found");
		}
	}
}

//5
//4 3 2 1 6
//3
//Ele is found at: 1
