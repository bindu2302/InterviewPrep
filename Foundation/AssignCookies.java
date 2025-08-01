package Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int m = sc.nextInt();
		
		int[] g = new int[n];
		for(int i=0; i<n; i++) {
			g[i] = sc.nextInt();
		}
		
		int[] s = new int[m];
		for(int j=0; j<m; j++) {
			s[j] = sc.nextInt();
		}
		
		System.out.println(findContentChildren(g,s));
	}
	
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i=0,j=0,count=0;
		
		while(i<g.length && j<s.length) {
			if(s[j] >= g[i]) {
				count++;
				i++;
			}
			j++;
		}
		return count;
	}
}

//3 2
//1 2 3
//1 1

//1


//2 3
//1 2
//1 2 3

//2

