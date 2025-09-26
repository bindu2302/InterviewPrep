package sep;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//        return Arrays.equals(c1, c2); 

		int[] count = new int[26];
		
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			count[c-'a']++;
		}
		
		for(int i=0; i<s2.length(); i++) {
			char c = s2.charAt(i);
			count[c-'a']--;
		}
		
		for(int val : count) {
			if(val != 0) {
				return false;
			}
		}
		return true;
	}
}
