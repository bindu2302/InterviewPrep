//A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding
//the number itself. Find whether a given positive integer n is perfect or not.
//Examples: 
//
//Input: n = 15
//Output: false
//Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.
//
//Input: n = 6
//Output: true
//Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.

package Foundation;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(perfectNum(n));
	}
	
	public static boolean perfectNum(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n % i==0) {
				sum += i;
			}
		}
		return sum == n;		
	}

}
