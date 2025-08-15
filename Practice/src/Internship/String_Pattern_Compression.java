package Internship;

import java.util.Scanner;

//Name: Himabindu Nara
//Roll No: 198R1A0520  
//Course: B.Tech CSE


public class String_Pattern_Compression {

    // Method to compress repeating characters unless they're digits
    public static String compressText(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        char lastChar = input.charAt(0);
        int count = Character.isDigit(lastChar) ? 0 : 1;

        result.append(Character.isDigit(lastChar) ? lastChar : "");

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);

            // Optional debug print
            // System.out.println("Processing char: " + current);

            if (Character.isDigit(current)) {
                appendCharGroup(result, lastChar, count); // flush group
                result.append(current);
                count = 0;
            } else if (current == lastChar && count > 0) {
                count++;
            } else {
                appendCharGroup(result, lastChar, count);
                count = 1;
            }

            if (!Character.isDigit(current)) {
                lastChar = current;
            }
        }

        if (!Character.isDigit(lastChar)) {
            appendCharGroup(result, lastChar, count);
        }

        return result.toString();
    }

    // Helper method to handle appending compressed/single characters
    private static void appendCharGroup(StringBuilder result, char ch, int count) {
        if (count <= 0) return; // skip invalid groups
        result.append(count == 1 ? ch : count + "" + ch);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userText = scan.nextLine();

        String output = compressText(userText);
        System.out.println("Compressed result: " + output);

        scan.close();
    }
}
