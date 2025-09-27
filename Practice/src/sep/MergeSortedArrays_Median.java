package sep;

import java.util.Arrays;

public class MergeSortedArrays_Median {

	public static void main(String[] args) {
		 int[] arr1 = {1, 3, 5, 7};
	     int[] arr2 = {2, 4, 6, 8, 10};
	     
	     int[] merged = mergeSortedArr(arr1,arr2);
	     System.out.println("Merge sorted arrays: " + Arrays.toString(merged));
	     
	     System.out.println("Median of sorted array: " + FindmedianSortedArr(arr1,arr2));
	}
	
	public static int[] mergeSortedArr(int[] arr1, int[] arr2) {
		int n1 = arr1.length, n2 = arr2.length;
		
		int[] merged = new int[n1 + n2];
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}
		}
		
		while(i<n1) {
			merged[k++] = arr1[i++];
		}
		
		while(j<n2) {
			merged[k++] = arr2[j++];
		}
		
		return merged;
	}
	
	
	public static int FindmedianSortedArr(int[] arr1, int[] arr2) {
		int[] merged = mergeSortedArr(arr1,arr2);
		
		int n = merged.length;
		
		if(n%2==0) {
			return(merged[n/2-1] + merged[n/2]) / 2;
		}
		return merged[n/2];
	}
}


// Merge sorted arrays: [1, 2, 3, 4, 5, 6, 7, 8, 10]
