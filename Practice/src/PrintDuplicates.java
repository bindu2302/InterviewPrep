
public class PrintDuplicates {
	
	public void findDuplicates(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		PrintDuplicates dup = new PrintDuplicates();
		int[] arr = {2,1,3,4,5,6,2,4};
		
		dup.findDuplicates(arr);
		
	}
}

//2
//4
