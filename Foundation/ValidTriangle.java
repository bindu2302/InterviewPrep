package Foundation;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
        if ((checkValidity(a, b, c)) == 1)
            System.out.print("Valid");
        else
            System.out.print("Invalid");
	}
	
	public static int checkValidity(int a, int b, int c) {
		if(a+b <= c || a+c <=b || b+c <= a) {
			return 0;
		}
		return 1;
	}

}
