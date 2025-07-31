package Foundation;

import java.util.Scanner;

public class XOR_numbersFromLtoR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		System.out.println(XOR(L,R));
	}
	
	public static int xorFrom0To(int n) {
		if(n%4==0) return n;
		if(n%4==1) return 1;
		if(n%4==2) return n+1;
		return 0;
	}
	
	public static int XOR(int L , int R) {
		return xorFrom0To(R) ^ xorFrom0To(L-1);
	}
}

//4 8
//8

//1 1
//1
