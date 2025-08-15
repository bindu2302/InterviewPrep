package Recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Factorial  f = new Factorial();
		int result = f.Fact(n);
		System.out.println(result);
		
		
	}
	static class Factorial{
		public int Fact(int n) {
			if( n==0) {
				return 1;
			}
			return n * Fact(n-1);
		}
	}
}
