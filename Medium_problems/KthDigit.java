//Given three numbers a, b and k, find k-th digit in ab from right side
//
//Examples: 
//Input : a = 3, b = 3, k = 1
//Output : 7
//Explanation: 3^3 = 27 for k = 1. First digit is 7 in 27
//
//Input : a = 5, b = 2,  k = 2
//Output : 2
//Explanation: 5^2 = 25 for k = 2. First digit is 2 in 25


package Medium_problems;

import java.util.Scanner;

public class KthDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(kthDigit(a,b,k));
	}
	
	public static int kthDigit(int a, int b, int k) {
		long mod = (long) Math.pow(10, k);
		long res = 1;
		long base=a;
		
		while(b>0) {
			if((b&1) == 1) {
				res = (res * base) % mod; 
			}
			base = (base * base) % mod;
			b>>=1;
		}
		for (int i = 1; i < k; i++)
            res /= 10;

        return (int)res;
	}
}
