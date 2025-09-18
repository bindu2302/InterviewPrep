package mypractice;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();
        
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
        	sb.append(words[i]).append(" ");
        }
        
        System.out.println("Reversed Words: " + sb.toString().trim());
	}

}

//Enter sentence: i am a good girl
//Reversed Words: girl good a am i