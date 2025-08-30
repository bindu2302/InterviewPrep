package Array_EasyProblems;

import java.util.Scanner;

public class Repetitive_Addition_Of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num >= 10) {
			num = sumOfDigits(num);
		}
		System.out.println("Sum of digits: " + num);
	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num >0) {
			int digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		return sum;
	}
}

//9875
//Sum of digits: 2
