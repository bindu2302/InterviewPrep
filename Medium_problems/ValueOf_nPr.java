//nPr = n! / (n - r)! 
//
//Examples:
//
//Input: n = 5
//           r = 2
//Output: 20
//Explanation: 5P2 = 5! / (5 - 2)!  = 20
//
//Input: n = 6
//           r = 3
//Output: 120
//Explanation: 6P3 = 6! / (6 - 3)!  = 120

package Medium_problems;

import java.util.Scanner;

public class ValueOf_nPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
        System.out.println(n + "P" + r + " = " + nPr(n, r));
	}
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i=2; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static long nPr(int n,int r) {
		return factorial(n) / factorial(n-r);
	}

}
