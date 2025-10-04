//5
//101 102 103 104 105
//105 101 102 103 104 

package sep;

import java.util.Scanner;

public class RotateInAnArray_onePos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Store last element
		int last = arr[n-1];
		
        // Shift elements to the right
		for(int i=n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		
        // Place last element at first position
		arr[0] = last;
		
        // Print rotated array
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
