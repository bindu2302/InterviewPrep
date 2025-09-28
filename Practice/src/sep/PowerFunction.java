package sep;

import java.util.Scanner;

public class PowerFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.println(myPow(x,n));
	}
	
	public static double myPow(double x, int n) {
		int result = 1;
		
		if(n>=0) {
			for(int i=0; i<n; i++) {
				result *= x;
			}
		} else {
			for(int i=0; i<-n; i++) {
				result *= x;
			}
			result = 1/result;
		}
		return result;
	}
}

//2.0
//3
//8.0
