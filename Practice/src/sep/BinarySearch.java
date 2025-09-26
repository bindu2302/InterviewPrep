package sep;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,3,4,1,5,6,7,8};
		int target = 6;
		System.out.println(binarySearch(arr,target));
	}
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] < target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return -1;
		
	}

}
