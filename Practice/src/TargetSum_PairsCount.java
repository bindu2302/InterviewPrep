import java.util.Arrays;
import java.util.Scanner;

public class TargetSum_PairsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
        int[] arr = new int[n];        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();

        System.out.println(TargetSum(arr, target));  // Call the function correctly
        
        scan.close();  // Close scanner
    }
    
    public static int TargetSum(int[] arr, int target) {
    	Arrays.sort(arr);
    	
        int L = 0, R = arr.length - 1;
        int count = 0;
        
        while (L < R) {
            int sum = arr[L] + arr[R];  // Update sum inside the loop
            
            if (sum == target) {
                count++;
                L++;
                R--;
            } else if (sum < target) {
                L++;
            } else {
                R--;
            }
        }
        return count;  // Return count instead of void
    }

}
