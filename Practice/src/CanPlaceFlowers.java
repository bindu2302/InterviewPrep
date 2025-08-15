import java.util.Scanner;
public class CanPlaceFlowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[] flowerbed = new int[m];
		for(int i=0;i<m;i++) {
			flowerbed[i] = scan.nextInt();
		}
		int n = scan.nextInt();
		System.out.println(canPlaceFlowers(flowerbed,n));
		scan.close();
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed,int n) {
		int count =0;
		for(int i=0;i<flowerbed.length;i++) {
			if(flowerbed[i]==0) {
				 boolean prevEmpty = (i==0 || flowerbed[i-1]==0);
				 boolean nextEmpty = (i==flowerbed.length-1 || flowerbed[i+1]==0);
				 
				 if(prevEmpty && nextEmpty) {
					 flowerbed[i] =1;
					 count++;
					 
					 if(count>=n) {
						 return true;
					 }
				 }
			}
		}
		return false;
	}
}
