package Array_EasyProblems;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6};
        int n = arr.length;
		
		int index = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while(index < n) {
			arr[index++] = 0;
		}
		
		System.out.print("After moving zeroes: ");
	    for (int num : arr) {
	       System.out.print(num + " ");
	    }
	}
}

//After moving zeroes: 1 9 8 4 2 7 6 0 0 0 0 