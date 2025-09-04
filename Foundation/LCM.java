//Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
//LCM of two numbers is the smallest number which can be divided by both numbers. 
//
//Input :  a = 10, b = 5
//Output :  10
//Explanation : 10 is the smallest number divisible by both 10 and 5
//
//Input :  a = 5, b = 11
//Output :  55
//Explanation : 55 is the smallest number divisible by both 5 and 11

package Foundation;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Lcm(a,b));
	}
	
//	public static int Lcm(int a, int b) {
//		int g = Math.max(a, b);
//		int s = Math.min(a, b);
//		
//		for(int i=g; i<=a*b; i+=g) {
//			if(i % s ==0) {
//				return i;
//			}
//		}
//		return a * b;
//	}
	
	public static int gcd(int a, int b) {
		return (b==0) ? a : gcd(b,a%b);
	}
	
	public static int Lcm(int a, int b) {
		return (a/gcd(a,b)) * b;
	}
}
