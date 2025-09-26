package sep;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n-1];
		for(int i=0; i<n-1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Missing num: " + findnum(arr,n));	
	}
	
	public static int findnum(int[] arr, int n) {
		int expected = n * (n+1) /2;
		int actual =0;
		for(int num:arr) {
			actual += num;
		}
		return expected-actual;
	}
}

//5
//1 2 4 5
//Missing num: 3
