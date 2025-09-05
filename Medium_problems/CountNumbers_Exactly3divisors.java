//Given a number n, print count of numbers in the range from 1 to n having exactly 3 divisors. 

//Examples: 

//Input: n = 16
//Output: 2
//Explanation: Only 4 and 9 have exactly three divisors.

//Input: n = 100
//Output: 4
//Explanation: 4, 9, 25 and 49 have exactly three divisors.


package Medium_problems;

import java.util.Scanner;

public class CountNumbers_Exactly3divisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Exactly3Divisors(n));
	}
	
	public static int countDivisors(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static int Exactly3Divisors(int n) {
		int total = 0;
		for(int i=1; i<=n; i++) {
			if(countDivisors(i) == 3) {
				total++;
			}
		}
		return total;
	}
}
