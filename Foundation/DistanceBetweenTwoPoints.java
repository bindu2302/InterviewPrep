package Foundation;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println(Math.round(distanceTwoPoints(x1,y1,x2,y2)*100000.0) / 100000.0);
	}
	
	public static double distanceTwoPoints(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)*1.0);
	}

}

//double val = 2.3456789;
//
////printf
//System.out.printf("%.2f%n", val);   // prints 2.35, but val is still 2.3456789
//
////round
//double r = Math.round(val * 100.0) / 100.0;
//System.out.println(r);              // prints 2.35, and r is actually 2.35
