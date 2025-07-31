package Foundation;

import java.util.Scanner;

public class AllDivisors_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print_divisors(n);
	}
	
	public static void print_divisors(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
	}
}

//20
//1 2 4 5 10 20 

//21191
//1 21191 