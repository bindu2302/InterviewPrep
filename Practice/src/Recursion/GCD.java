package Recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
	
		int result = GCD1.gcd(m,n);
		
		System.out.println(result);
	}
	
	public class GCD1 {
		public static int gcd(int m, int n) {
			if(n==0) {
				return m;
			}
			return gcd(n,m%n);
				
		}

	}
	

}


