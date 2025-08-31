//Leaders: 2 5 17

package Array_EasyProblems;

public class ArrayLeaders {

	public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        
        int maxFromRight = arr[n-1];
        System.out.print("Leaders: " + maxFromRight + " ");

        for(int i=n-2; i>=0; i--) {
        	if(arr[i] > maxFromRight) {
        		maxFromRight = arr[i];
        		System.out.print(maxFromRight + " ");
        	}
        }
	}
}

//arr = {16, 17, 4, 3, 5, 2}
//maxFromRight = 2 (initially printed)
//
//i = 4 → arr[4] = 5
//
//5 > 2 → Yes ✅
//
//maxFromRight = 5
//
//Print 5
//
//i = 3 → arr[3] = 3
//
//3 > 5 → No ❌
//
//Do nothing
//
//i = 2 → arr[2] = 4
//
//4 > 5 → No ❌
//
//Do nothing
//
//i = 1 → arr[1] = 17
//
//17 > 5 → Yes ✅
//
//maxFromRight = 17
//
//Print 17
//
//i = 0 → arr[0] = 16
//
//16 > 17 → No ❌
//
//Do nothing