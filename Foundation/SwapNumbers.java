package Foundation;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		int temp = a;
//		a =b;
//		b =temp;
		
		a = a+b;
		b = a-b;
		a = a+b;
		System.out.println("a is : " + a + " b is: " + b);
	}
}
