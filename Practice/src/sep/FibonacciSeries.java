package sep;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] seq = fibonacci(n);
		
		for(int num : seq) {
			System.out.print(num + " ");
		}
	}
	
	public static int[] fibonacci(int n) {
		int[] seq = new int[n];
		
		if(n>0) seq[0] = 0;
		if(n>1) seq[1] = 1;
		
		for(int i=2; i<n; i++) {
			seq[i] = seq[i-1] + seq[i-2];
		}
		return seq;
	}
}
