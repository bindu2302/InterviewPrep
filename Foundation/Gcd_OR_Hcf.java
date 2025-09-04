//Input: a = 20, b = 28
//Output: 4
//Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28.
//Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.

//Input: a = 60, b = 36
//Output: 12
//Explanation: GCD of  60 and 36 is 12.


package Foundation;

import java.util.Scanner;

public class Gcd_OR_Hcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(GCD(a,b));
	}
	
	public static int GCD(int a, int b) {
		int result = Math.min(a, b);
		while(result > 0) {
			if(a%result ==0 && b%result==0) {
				break;
			}
			result--;
		}
		return result;
	}
	
	
//	public static int GCD(int a, int b) {
//		if(a==0) {
//			return b;
//		}
//		if(b==0) {
//			return a;
//		}
//		if(a==b) {
//			return a;
//		}
//		if(a>b) 
//			return GCD(a-b,b);
//		return GCD(a,b-a);
//	}
}
