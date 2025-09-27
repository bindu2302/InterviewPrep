package sep;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println(Arrays.toString(nums));  // before rotation
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));  // after rotation
	}
	
	 public static void rotateArray(int[] nums, int k) {
	        int n = nums.length;
	        k %= n;  // handle cases when k > n

	        // Step 1: reverse entire array
	        reverse(nums, 0, n - 1);

	        // Step 2: reverse first k elements
	        reverse(nums, 0, k - 1);

	        // Step 3: reverse remaining elements
	        reverse(nums, k, n - 1);
	    }

	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int tmp = nums[start];
	            nums[start++] = nums[end];
	            nums[end--] = tmp;
	        }
	    }
}


//[1, 2, 3, 4, 5, 6, 7]
//[5, 6, 7, 1, 2, 3, 4]
