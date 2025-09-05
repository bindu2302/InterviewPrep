//nCr = n! / r! * (n - r)! 
//
//Examples:
//input: n = 5, r = 2
//Output: 10 
//Explanation: The value of  5C2 is calculated as 5! / ((5−2)! * 2!​)= 10.
//
//Input: n = 2, r = 4
//Output: 0
//Explanation: Since r is greater than n, thus 2C4 = 0
//
//Input: n = 5, r = 0
//Output: 1
//Explanation:  The value of  5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.

package Medium_problems;

import java.util.Scanner;

public class ValueOf_nCr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
        System.out.println(n + "C" + r + " = " + nCr(n, r));
	}
	
	public static int fact(int n) {
		int fact = 1;
		for(int i=2; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static long nCr(int n, int r) {
		if(r>n) {
			return 0;
		}
        return fact(n) / (fact(r) * fact(n - r));
	}

}
