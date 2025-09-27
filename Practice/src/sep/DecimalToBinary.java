package sep;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		int temp = n;
		
		while(temp > 0) {
			int rem = temp % 2;
			sb.append(rem);
			temp = temp / 2;
		}
		sb.reverse();
        System.out.println("The binary equivalent of " + n + " is " + sb + ".");

	}

}
