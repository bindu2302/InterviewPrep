//Dry run 1: {9, 9, 9}

//Start: digits = [9,9,9]
//i = 2: digits[2] == 9 → set to 0, carry on → [9,9,0]
//i = 1: digits[1] == 9 → set to 0, carry on → [9,0,0]
//i = 0: digits[0] == 9 → set to 0, carry on → [0,0,0]
//Loop ends (we never hit the < 9 case → no break)
//Post-loop check: digits[0] == 0 → true
//Create new array of size 4: [1,0,0,0]
//Output: 1 0 0 0

package Array_EasyProblems;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int n = digits.length;
		
		for(int i=n-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}
		
		if(digits[0] == 0) {
			int[] newDigits = new int[n+1];
			newDigits[0] = 1;
			digits = newDigits;
		}
		
		System.out.print("Result: ");
	    for (int num : digits) System.out.print(num + " ");
	}
}
