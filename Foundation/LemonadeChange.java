package Foundation;

import java.util.Scanner;

public class LemonadeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bills = new int[n];
		for(int i=0; i<n; i++) {
			bills[i] = sc.nextInt();
		}
		System.out.println(canServeAllCustomers(bills));
	}
	public static boolean canServeAllCustomers(int[] bills) {
		int five=0, ten =0;
		
		for(int bill : bills) {
			if(bill == 5) {
				five++;
			} else if(bill == 10) {
				if(five == 0) return false;
				five--;
				ten++;
			} else if(bill == 20) {
				if(ten >0 && five >0) {
					five--;
					ten--;
				} else if(five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}


//5
//5 5 5 10 20
//true

//5
//5 5 10 10 20
//false

