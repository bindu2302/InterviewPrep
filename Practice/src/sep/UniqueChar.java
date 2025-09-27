package sep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(UniqueChar(s));
	}
	
	public static boolean UniqueChar(String s) {
		Set<Character> set = new HashSet<>();
		
		for(char c : s.toCharArray()) {
			if(!set.add(c)) {
				return false;
			}
		}
		return true;
	}
}

//hima
//true

