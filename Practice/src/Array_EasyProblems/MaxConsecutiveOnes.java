package Array_EasyProblems;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = {1,1,0,0,0,1,1,1};
		
		int count = 0, maxCount =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
				
				if(count > maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}
		}
        System.out.println("Max consecutive 1s = " + maxCount);
	}
}

//Max consecutive 1s = 3
