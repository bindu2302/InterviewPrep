package Foundation;

import java.util.Scanner;

public class FindSingleNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		int[] nums = new int[inputArr.length];
		
		for(int i=0; i<inputArr.length; i++) {
			nums[i] = Integer.parseInt(inputArr[i]);
		}
		System.out.println(SingleNum(nums));
	}
	
	public static int SingleNum(int[] nums) {
		int result = 0;
		for(int num : nums) {
			result ^= num;
		}
		return result;
	}
}

//2 2 1
//1


//4 1 2 1 2 
//4

//4 1 2 1 2 4
//0
