package sep;

public class BubbleSort {

	public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        sort(arr);
        for(int num : arr) {
        	System.out.print(num + " ");
        }
	}
	
	public static int[] sort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<=n-2; i++) {
			for(int j=0; j<=n-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
