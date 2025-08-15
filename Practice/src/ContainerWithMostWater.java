import java.util.*;
public class ContainerWithMostWater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] height = new int[n];
		for(int i =0;i<n;i++) {
			height[i]=scan.nextInt();
		}
		System.out.println(maxArea(height));
		scan.close();
	}
	
	public static int maxArea(int[] height) {
		int left =0;
		int right = height.length-1;
		int maxArea =0;
		
		while(left<right) {
			int width = right-left;
			int minHeight;
			
			if(height[left]<height[right]) { // minHeight = Math.min(height[left],height[right]);
				minHeight = height[left];  //
			} else {                        //
				minHeight = height[right];   //
			}                                //
			int currentArea = width * minHeight;
			if(currentArea > maxArea) {  // maxArea = Math.max(currentArea,maxArea);
				maxArea = currentArea;   //
			}
			if(height[left]<height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}
