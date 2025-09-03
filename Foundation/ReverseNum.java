package Foundation;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(reverseNum(n));
	}
	public static int reverseNum(int n) {
		int revNum = 0;
		while(n !=0) {
			revNum = revNum * 10 + n % 10;
			n = n / 10;
		}
		return revNum;
	}
}


//12345
//54321