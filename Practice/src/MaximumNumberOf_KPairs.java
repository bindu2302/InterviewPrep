import java.util.Arrays;
import java.util.Scanner;
public class MaximumNumberOf_KPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		//bubbleSort(nums);
		System.out.println(maxOperations(nums,k));
		scan.close();
	}
	
//	public static void bubbleSort(int[] nums) {
//		int n = nums.length;
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				
//				if(nums[j]>nums[j+1]) {
//					
//					int temp = nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1] =temp;
//				}
//			}
//		}
//	}
//	
	public static int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int left =0;
		int right = nums.length-1;
		int pairs =0;
		while(left<right) {
			if(nums[left]+nums[right]==k) {
				left++;
				right--;
				pairs++;
			} else if(nums[left]+nums[right]<k) {
				left++;
			} else {
				right--;
			}
		}
		
	return pairs;	
	}
}
