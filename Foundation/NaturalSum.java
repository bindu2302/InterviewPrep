package Foundation;

public class NaturalSum {

	public static void main(String[] args) {
		int n= 15;
		
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println("Sum of first natural numbers: " + sum);
	}
}
