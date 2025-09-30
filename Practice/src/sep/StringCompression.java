//7
//a a b b c c c
//6

//4
//a b c d
//4

package sep;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] chars = new char[n];
		for(int i=0; i<n; i++) {
			chars[i] = sc.next().charAt(0);
		}
		System.out.println(compress(chars));
	}
	
	public static int compress(char[] chars) {
		int n = chars.length;
		int index =0,i=0;
		
		while(i < n) {
			char currentChar = chars[i];
			int count =0;
			
			while(i<n && currentChar==chars[i]) {
				i++;
				count++;
			}
			
			chars[index++] = currentChar;
			
			if(count > 1) {
				String currentStr = String.valueOf(count);
				for(char c : currentStr.toCharArray()) {
					chars[index++] = c;
				}
			}
		}	
		return index;
	}

}
