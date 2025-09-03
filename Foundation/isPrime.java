package Foundation;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime number or not: " + prime(n));
	}
	
	public static boolean prime(int n) {
		if(n<=0) {
			return false;
		}
		
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
