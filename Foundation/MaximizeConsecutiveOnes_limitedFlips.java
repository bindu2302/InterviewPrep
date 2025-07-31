package Foundation;

import java.util.Scanner;

public class MaximizeConsecutiveOnes_limitedFlips {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(maxConsecutiveOnes(arr,k));
	}
	
	public static int maxConsecutiveOnes(int[] arr, int k) {
		int left =0, right=0;
		int maxLen =0, zeroCount=0;
		
		while(right < arr.length) {
			if(arr[right] == 0) {
				zeroCount++;
			}
			
			while(zeroCount > k) {
				if(arr[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			maxLen = Math.max(maxLen, right - left + 1);
			right++;
		}
		return maxLen;		
	}
}

//10
//1 1 1 0 0 0 1 1 1 0
//2

//5

//15
//0 0 1 1 0 0 1 1 1 0 1 1 0 0 1
//3

//10
