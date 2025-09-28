package sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
	}
	
	public static List<Integer>findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		
		if(s.length() < p.length()) return result;
		
		int[] pCount = new int[26];
		int[] sCount = new int[26];
		
		for(char c : p.toCharArray()) {
			pCount[c-'a']++;
		}
		
		int window = p.length();
		
		for(int i=0; i<window; i++) {
			sCount[s.charAt(i) - 'a']++;
		}
		
		if(Arrays.equals(pCount, sCount)) result.add(0);
			
		for(int i=window; i<s.length(); i++) {
			sCount[s.charAt(i) - 'a']++;
			
			sCount[s.charAt(i - window) - 'a']--;
			
			if(Arrays.equals(pCount, sCount)) {
				result.add(i - window + 1);
			}
		}
		return result;
	}
}

//[0, 6]
