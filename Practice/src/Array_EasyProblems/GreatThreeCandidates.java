//The maximum product of any three numbers is either:
//the product of the three largest numbers, OR
//the product of the largest number and the two smallest numbers (two big negative numbers can make a large positive when multiplied).
//So we track the top 3 maxima (max1, max2, max3) and the bottom 2 minima (min1, min2) in a single pass, then take max( max1*max2*max3, max1*min1*min2 ).

package Array_EasyProblems;

public class GreatThreeCandidates {

	public static void main(String[] args) {
        int[] arr = {1, 10, -5, 1, -100};
        int product = GreatThree(arr);
        System.out.println("Maximum product of 3 numbers = " + product);
	}
	
	public static int GreatThree(int[] arr) {
		int max1= Integer.MIN_VALUE, max2= Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		int min1= Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			int x = arr[i];
			
			// For largest
			if(x > max1) {
				max3 = max2;
				max2 = max1;
				max1 = x;
			} else if(x > max2) {
				max3 = max2;
				max2 = x;
			} else if(x > max3) {
				max3 = x;
			}

			
			// For smallest
			if(x < min1) {
				min2 = min1;
				min1 = x;
			} else if( x< min2) {
				min2 = x;
			}
		}
		return Math.max(max1 * max2 * max3, max1 * min1 * min2);
	}
}
