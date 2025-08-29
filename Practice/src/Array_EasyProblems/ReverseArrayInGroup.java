//After reverse Array In groups: 
//3 2 1 6 5 4 8 7 

package Array_EasyProblems;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int k = 3;
		int n = arr.length;
		
		for(int i=0; i<arr.length; i+=k) {
			int end = Math.min(i+k-1, n-1);
			reverse(arr,i,end);
		}
		System.out.println("After reverse Array In groups: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void reverse(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
}
