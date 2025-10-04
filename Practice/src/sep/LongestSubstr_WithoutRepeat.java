//abcabcbb
//The length of the longest substring without repeating characters is: 3

//bbbbb
//The length of the longest substring without repeating characters is: 1

package sep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstr_WithoutRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int longestLength = findLongestStrlen(s);
        System.out.println("The length of the longest substring without repeating characters is: " + longestLength);
	}

	public static int findLongestStrlen(String s) {
		if(s==null || s.length()==0) {
			return 0;
		}
		
		Set<Character> set = new HashSet<>();
		
		int n = s.length();
		int maxLength =0;
		int left =0;
		
		for(int i=0; i<n; i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(s.charAt(i));
			
			maxLength = Math.max(maxLength, i - left +1);
		}
		return maxLength;
	}
}
