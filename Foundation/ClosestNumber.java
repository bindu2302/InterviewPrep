//Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, 
// then output the one having maximum absolute value.

//Examples: 

//Input: n = 13, m = 4
//Output: 12
//Explanation: 12 is the closest to 13, divisible by 4.

//Input: n = -15, m = 6
//Output: -18
//Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.


package Foundation;

import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(closestNum(n,m));
	}
	
	public static int closestNum(int n, int m) {
		int closest = 0;
		int mindiff = Integer.MAX_VALUE;
		
		for(int i= n-Math.abs(m); i <= n+Math.abs(m); ++i) {
			if(i % m ==0) {
				int diff = Math.abs(n-i);
				
				if(diff < mindiff || diff == mindiff && Math.abs(i) > Math.abs(closest)) {
					closest = i;
					mindiff = diff;
				}
			}
		}
		return closest;
	}
}
