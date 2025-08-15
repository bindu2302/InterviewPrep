import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[] arr1 = new int[m+n];
		for(int i=0; i<m; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr2[i] = scan.nextInt();
		}
		
		mergeSort(arr1,arr2,m,n);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void mergeSort(int[] arr1, int[] arr2, int m, int n) {
		int i =m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j>=0) {
			if(arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
				k--;
			} else {
				arr1[k] = arr2[j];
				k--;
				j--;
			}
		}
		
		while(j>=0) {
			arr1[k] = arr2[j];
			k--;
			j--;
		}
	}

}
