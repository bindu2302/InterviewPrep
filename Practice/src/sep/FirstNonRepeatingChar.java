package sep;

import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char result = firstNonrepeatingchar(input);
		
		if(result == '\0') {
            System.out.println("No non-repeating character found.");
		} else {
            System.out.println("First non-repeating character: " + result);
		}
	}
	
	public static char firstNonrepeatingchar(String str) {
		int[] freq = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			freq[c]++;
		}
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(freq[c]==1) {
				return c;
			}
		}
		return '\0';
	}
}

//swiss
//First non-repeating character: w

