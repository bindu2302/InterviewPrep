package Foundation;

import java.util.Scanner;

public class MinimumBitFlips_ConvertNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println(BitFlip(start,end));
	}
	
	public static int BitFlip(int start, int end) {
		return Integer.bitCount(start ^ end);
	}
}

//10 7
//3

//3 4
//3