//8
//3 2 3 3 2 2 4 5
//3
//After removal
//2 2 2 4 5 

package Array_EasyProblems;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int val = sc.nextInt();
		int index = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] != val) {
				arr[index++] = arr[i];
			}
		}
		System.out.println("After removal");
		for(int i=0; i<index; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
