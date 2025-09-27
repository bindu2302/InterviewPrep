package sep;

import java.util.Scanner;

public class ClimbStairs {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter n: ");
	     int n = sc.nextInt();
	     System.out.println("Number of ways to climb " + n + " stairs = " + climbStairs(n));
	}
	
	public static int climbStairs(int n) {
		if(n<=2) return n;
		
		int a=1,b=2;
		
		for(int i=3; i<=n; i++) {
			int temp = b;
			b = a+b;
			a = temp;
		}
		return b;
	}
}

//Enter n: 5
//Number of ways to climb 5 stairs = 8
