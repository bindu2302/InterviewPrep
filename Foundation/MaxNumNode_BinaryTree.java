package Foundation;

import java.util.Scanner;

public class MaxNumNode_BinaryTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(power_2(i));
	}
	
	public static int power_2(int i) {
		int result = 1;
		for(int j=0; j<i; j++) {
			result *= 2;
		}
		return result;
	}
}

//5

//32


//1

//2
