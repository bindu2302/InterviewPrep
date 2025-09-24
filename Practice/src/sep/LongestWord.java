package sep;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.replaceAll("[^a-zA-Z0-9 ]"," ");
		
		String[] words = str.split("\\s+");
		
		String longest = "";
		for(String word: words) {
			if(word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("Longest word: " + longest);
	
//		String str = "I Love programming languages";
//		String longest = "";
//		String word = "";
//		
//		for(int i=0; i<str.length(); i++) {
//			char c = str.charAt(i);
//			if(c != ' ') {
//				word += c;
//			} else {
//				if(word.length() > longest.length()) {
//					longest = word;
//				}
//				word = "";
//			}
//		}
//		if(word.length() > longest.length()) {
//			longest = word;
//		}
//		System.out.println("Longest word: " + longest);
	}
}
