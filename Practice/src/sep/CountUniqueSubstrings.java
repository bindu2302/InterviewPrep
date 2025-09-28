package sep;

import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(CountUniqueSubstring(s));
	}
	
	public static int CountUniqueSubstring(String s) {
		int count = 0;
		int n = s.length();
		
		for(int i=0; i<n; i++) {
			HashSet<Character> set = new HashSet<>();
			for(int j=i; j<n; j++) {
				char c = s.charAt(j);
				if(set.contains(c)) break;
				set.add(c);
				count++;
			}
		}
		return count;
	}
}


//aba
//5