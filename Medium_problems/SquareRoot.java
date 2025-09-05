//Given a positive integer n, find its square root. If n is not a perfect square, then return floor of √n.

//Examples : 

//Input: n = 4
//Output: 2
//Explanation: The square root of 4 is 2.

//Input: n = 11
//Output: 3
//Explanation: The square root of 11 lies in between 3 and 4 so floor of the square root is 3.


package Medium_problems;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Square Root of " + n + " is: " + floorSqrt(n));
	}
	
	public static int floorSqrt(int n) {
		int res = 1;
		while(res * res <= n) {
			res++;
		}
		return res-1;
	}
}
