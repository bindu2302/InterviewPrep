package mypractice;

public class SubarraySum {

	public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = arr[0];
        int current = arr[0];
        
        for(int i=0; i<arr.length; i++) {
        	current = Math.max(arr[i], current+arr[i]);
        	maxSum = Math.max(maxSum, current);
        }
        System.out.println("Maximum subarray sum: " + maxSum);
	}

}
