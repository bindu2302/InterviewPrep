package Array_EasyProblems;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] arr = {12,78,1,23,34,45,56,67,89};
		System.out.println(secondlargest(arr));
		
	}
	
	public static int secondlargest(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			} else if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		return second;
	}
}
