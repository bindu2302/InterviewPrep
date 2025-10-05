//abc
//pqr
//apbqcr

//ab
//pqrs
//apbqrs

package sep;

import java.util.Scanner;

public class MergeAlternately {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     String word1 = scanner.nextLine();
	     String word2 = scanner.nextLine();
	     System.out.println(mergeAlternately(word1, word2));
	     scanner.close();
	}
	
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder result = new StringBuilder();
		
		int i=0, j=0;
		
		// Take characters alternately until one word finishes
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++)); // take from word1
            result.append(word2.charAt(j++)); // take from word2
        }

        // If word1 still has remaining characters
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }

        // If word2 still has remaining characters
        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }
}