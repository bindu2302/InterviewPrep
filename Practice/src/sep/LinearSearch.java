package sep;

public class LinearSearch {

	public static void main(String[] args) {
        int[] arr = {3, 6, 8, 12, 14};
        System.out.println(LinearSearch(arr,12));
	}
	
	public static int LinearSearch(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
