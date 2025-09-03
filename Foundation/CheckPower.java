//Given two positive numbers x and y, check if y is a power of x or not.
//Examples : 

//Input:  x = 10, y = 1
//Output: True
//x^0 = 1

//Input:  x = 10, y = 1000
//Output: True
//x^3 = 1

//Input:  x = 10, y = 1001
//Output: False

//This approach checks whether a number y is a power of another number x by repeatedly multiplying x until it either matches or exceeds y.
//It starts with an initial value of 1 and keeps multiplying it by x in a loop. If the resulting value becomes equal to y, then y is a 
//power of x; otherwise, if it exceeds y without a match, the function returns false.
//This method efficiently verifies powers by iteratively computing exponential values instead of using logarithms or recursion.


package Foundation;

import java.util.Scanner;

public class CheckPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(checkPower(x,y));
	}
	
	public static boolean checkPower(int x, int y) {
		if(x==1) {
			return y==1;
		}
		
		long power = 1;
		while(power < y) {
			power *= x;
		}
		return (power == y);
	}
}
