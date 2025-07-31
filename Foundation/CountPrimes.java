package Foundation;

import java.util.Scanner;

public class CountPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeCount(n));
	}
	
	public static int primeCount(int n) {
		int count = 0;
		for(int i=0; i<=n; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	 public static boolean isPrime(int n) {
		 if(n<2) return false;
		 for(int i=2; i<=Math.sqrt(n); i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
}

//10
//4

//0
//0
