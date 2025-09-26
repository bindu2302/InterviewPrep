package sep;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("sum of digits: " + sumDigits(n));
	}
	
	public static int sumDigits(int n) {
		int sum = 0;
		
		while(n!=0) {
			int digit = n % 10;
			sum = sum + digit;
			n /= 10;
		}
		return sum;
	}
}

//12345
//sum of digits: 15