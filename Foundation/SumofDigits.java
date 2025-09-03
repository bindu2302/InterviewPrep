package Foundation;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumOfDigits(n));
	}
	
//	public static int sumOfDigits(int n) {
//		int sum = 0;
//		while(n != 0) {
//			int digit = n % 10;
//			sum = sum + digit;
//			n = n/10;
//		}
//		return sum;
//	}
	
	public static int sumOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		return (n % 10) + sumOfDigits(n/10);
	}
}
