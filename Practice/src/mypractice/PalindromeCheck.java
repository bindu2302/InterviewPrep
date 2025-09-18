package mypractice;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
	}
}


//madam
//Palindrome