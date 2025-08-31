package Array_EasyProblems;

public class InsertDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int n = arr.length;
		int[] res = new int[2 * n];
		
		int k = 0;
		for(int i=0; i<n; i++) {
			res[2*i] = arr[i];  // res[k++] = arr[i]
			res[2*i+1] = arr[i]; // res[k++] = arr[i]
		}
        System.out.print("With duplicates: ");
        for(int x : res) {
        	System.out.print(x + " ");
        }
	}
}

//With duplicates: 1 1 2 2 3 3

//res = {0, 0, 0, 0, 0, 0}   // initially empty
//First iteration (i = 0, arr[0] = 1)
//Insert 1 at res[0] → res = {1, 0, 0, 0, 0, 0}
//Insert duplicate 1 at res[1] → res = {1, 1, 0, 0, 0, 0}
//k now = 2.
// Second iteration (i = 1, arr[1] = 2)
//Insert 2 at res[2] → res = {1, 1, 2, 0, 0, 0}
//Insert duplicate 2 at res[3] → res = {1, 1, 2, 2, 0, 0}
//k now = 4.
// Third iteration (i = 2, arr[2] = 3)
//Insert 3 at res[4] → res = {1, 1, 2, 2, 3, 0}
//Insert duplicate 3 at res[5] → res = {1, 1, 2, 2, 3, 3}
//k now = 6 (done).
