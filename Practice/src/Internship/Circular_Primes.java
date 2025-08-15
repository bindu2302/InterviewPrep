package Internship;

import java.util.Scanner;
import java.util.ArrayList;

// Name: Himabindu Nara | Roll No: 198R1A0520 | Course: B.Tech CSE

public class Circular_Primes {

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int limit = scanner.nextInt();

        System.out.println("Circular primes below " + limit + ":");
        printCircularPrimes(limit);

        scanner.close();
    }
    
	 // Method to print all circular primes below N
	    public static void printCircularPrimes(int n) {
	        for (int i = 2; i < n; i++) {
	            // System.out.println("Checking number: " + i);
	            if (isCircularPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	    }

    // Check if a number is a circular prime
    public static boolean isCircularPrime(int num) {
        // Generate all rotations of the number
        ArrayList<Integer> rotations = getAllRotations(num);

        for (int rotated : rotations) {
            if (!isPrime(rotated)) {
                return false;
            }
        }
        return true;
    }

    // Generate all digit rotations of a number
    public static ArrayList<Integer> getAllRotations(int num) {
        ArrayList<Integer> rotations = new ArrayList<>();
        String str = String.valueOf(num);
        int len = str.length();

        for (int i = 0; i < len; i++) {
            String rotatedStr = str.substring(i) + str.substring(0, i);
            rotations.add(Integer.parseInt(rotatedStr));
        }

        return rotations;
    }

    // Prime number checker
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
