package sep;

import java.util.Scanner;

public class PowerofTwoCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(powerCheck(n));
	}
	
	public static boolean powerCheck(int n) {
		return n > 0 && (n & (n-1)) == 0;
	}

}

//5
//false
//
//8
//true