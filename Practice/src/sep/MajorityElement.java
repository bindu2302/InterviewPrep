package sep;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority element in arr1: " + majorityElement(arr1)); // Output: 3
        System.out.println("Majority element in arr2: " + majorityElement(arr2)); // Output: 2
	}
	
	public static int majorityElement(int[] nums) {
		int count=0, candidate=0;
		
		for(int num:nums) {
			if(count == 0) {
				candidate = num;
			}
			count += (num==candidate) ? 1 : -1;
		}
		return candidate;
	}
}
