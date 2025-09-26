package sep;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int vowelcount = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch+32);
			}
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelcount++;
			}
		}
		System.out.println("Vowel count: " + vowelcount);
	}
}

//Hima Bindu 
//Vowel count: 4
