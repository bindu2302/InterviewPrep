package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n+1; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  
        }
        if (n == 1) {
            return 1;  
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
