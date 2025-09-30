//aaabb
//ababa

//java
//ajav


package sep;

import java.util.Scanner;

public class reorganizeString {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(NoTwoAdjacentChar(s));
	}
	
	public static String NoTwoAdjacentChar(String s) {
		int n = s.length();
		int[] freq = new int[26];
		
		// frequent count;
		for(char c : s.toCharArray()) {
			freq[c-'a']++;
		}
		
		// find most freq char
		int maxCount =0, maxChar =0;
		for(int i=0; i<26; i++) {
			if(freq[i] > maxChar) {
				maxChar = freq[i];
				maxCount = i;
			}
		}
		
		// if impossible
		if(maxChar > (n+1)/2);
		
		char[] res = new char[n];
		int idx = 0;
		
        // Place most frequent character first
		
		while(freq[maxChar] > 0) {
			res[idx] = (char) (maxChar + 'a');
			idx += 2;
			freq[maxChar]--;
		}
		
		// place remaining character
		for(int i=0; i<26; i++) {
			while(freq[i] > 0) {
				if(idx >= n) idx = 1;
				res[idx] = (char)(i+'a');
				idx += 2;
				freq[i]--;
			}
		}
		return new String(res);
	}
}
