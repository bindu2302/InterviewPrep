import java.util.Scanner;
public class digitCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = digitcount(n);
		System.out.println(res);
		

	}
	public static int digitcount(int num) {
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		return count;
	}
}
