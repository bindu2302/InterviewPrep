//Wave Array:
//Arrange array such that arr[0] >= arr[1] <= arr[2] >= arr[3] ....
//Swap neighbors accordingly.
//
//Step-by-step:
//
//First pair (i=0 → swap arr[0] & arr[1])
//{2, 1, 3, 4, 5, 6}
//
//Next pair (i=2 → swap arr[2] & arr[3])
//{2, 1, 4, 3, 5, 6}
//
//Next pair (i=4 → swap arr[4] & arr[5])
//{2, 1, 4, 3, 6, 5}
//

//output: Wave Array: 
//2 1 4 3 6 5 

package Array_EasyProblems;

public class WaveArray {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        
        for(int i=0; i<n; i+=2) {
        	int temp =arr[i];
        	arr[i] = arr[i+1];
        	arr[i+1] = temp;
        }
        System.out.println("Wave Array: ");
        for(int num : arr) {
        	System.out.print(num + " ");
        }
	}

}
