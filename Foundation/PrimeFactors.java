package Foundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		List<Integer> result = AllPrimeFactors(n);
		for(int prime : result) {
			System.out.print(prime + " ");
		}
	}
	
	public static List<Integer> AllPrimeFactors(int n) {
		List<Integer> result = new ArrayList<>();
		
		if(n%2==0) {
			result.add(2);
			while(n%2==0) {
				n /= 2;
			}
		}
		
		for(int i=3; i<=Math.sqrt(n); i+=2) {
			if(n%i==0) {
				result.add(i);
				while(n%i==0) {
					n /= i;
				}
			}
		}
		if(n>2) {
			result.add(n);
		}
		return result;
	}
}

//100
//2 5 

//35
//5 7 