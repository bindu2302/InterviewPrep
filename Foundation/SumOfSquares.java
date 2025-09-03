package Foundation;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i * i;
		}
		System.out.println("Sum of squares of first n natural numbers: " + sum);
	}
}

//8
//Sum of squares of first n natural numbers: 204