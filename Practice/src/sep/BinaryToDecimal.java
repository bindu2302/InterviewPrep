package sep;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary = sc.next();
		
		int decimal =0,power=0;
		
		for(int i=binary.length()-1; i>=0; i--) {
			char bit = binary.charAt(i);
			if(bit == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
        System.out.println("The decimal equivalent of " + binary + " is " + decimal + ".");
	}
}

//1011
//The decimal equivalent of 1011 is 11.

