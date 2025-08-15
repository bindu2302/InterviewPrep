package Internship;

import java.util.Scanner;

// Name: Himabindu Nara | Roll No: 198R1A0520 | Course: B.Tech CSE

public class Magic_Square_Validator {

    // Method to check if an NxN matrix is a magic square
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        // Magic squares are only valid for odd-order (n % 2 == 1)
        if (n % 2 == 0) {
            return false;
        }

        int magicSum = 0;

        // Calculate the sum of the first row to use as reference
        for (int i = 0; i < n; i++) {
            magicSum += matrix[0][i];
        }

        // Check sums of all rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }

          //System.out.println("Row " + i + " sum: " + rowSum);

            if (rowSum != magicSum) return false;
        }

        // Check sums of all columns
        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += matrix[j][i];
            }
            if (colSum != magicSum) return false;
        }

        // Check main diagonal
        int mainDiag = 0;
        for (int i = 0; i < n; i++) {
            mainDiag += matrix[i][i];
        }
        if (mainDiag != magicSum) return false;

        // Check secondary diagonal
        int secDiag = 0;
        for (int i = 0; i < n; i++) {
            secDiag += matrix[i][n - 1 - i];
        }
        if (secDiag != magicSum) return false;

        // All checks passed
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for matrix size
        System.out.print("Enter the size of the matrix (odd number): ");
        int size = scanner.nextInt();

        // Validate odd size
        if (size % 2 == 0) {
            System.out.println("Only odd-sized matrices are allowed.");
            return;
        }

        int[][] matrix = new int[size][size];

        // Input matrix values
        System.out.println("Enter the matrix values row by row:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Call the checker
        boolean result = isMagicSquare(matrix);
        System.out.println("Is it a magic square? " + result);

        scanner.close();
    }
}
