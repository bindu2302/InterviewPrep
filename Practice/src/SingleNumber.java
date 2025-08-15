import java.util.Arrays;
import java.util.Scanner;
public class SingleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = scan.nextInt();
		}
		//bubbleSort(nums);
		System.out.println(Uniquenum_sum(nums));
	}
	
//	public static void bubbleSort(int[] nums) {
//		int n = nums.length;
//		for(int i=0; i<n-1; i++) {
//			for(int j=0; j<n-i-1; j++) {
//				if(nums[j]>nums[j+1]) {
//					int temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
//				}
//			}
//		}
//	}
//	
	
	public static int Uniquenum_sum(int[] nums) {
		Arrays.sort(nums);
		int sum =0;
		for(int i=0;i<nums.length; i++) {
			if((i==0 || nums[i]!=nums[i-1]) && (i==nums.length-1 || nums[i]!= nums[i+1])) {
				sum += nums[i];
			}
		}
		
		return sum;
	}

}
