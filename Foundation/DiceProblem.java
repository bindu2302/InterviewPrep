//In a normal 6-faced dice, 1 is opposite to 6, 2 is opposite to 5, and 3 is opposite to 4. Hence a normal if-else-if block can be placed 
//Examples:

//Input: n = 2
//Output: 5
//Explanation: For dice facing number 5 opposite face will have the number 2.

//Input: n = 6
//Output: 1
//Explanation: For dice facing number 6 opposite face will have the number 1.

package Foundation;

import java.util.Scanner;

public class DiceProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(oppositeFaceOfDice(n));
	}
	
	public static int oppositeFaceOfDice(int n)
    {
        int ans;
        if (n == 1) {
            ans = 6;
        }
        else if (n == 2) {
            ans = 5;
        }
        else if (n == 3) {
            ans = 4;
        }
        else if (n == 4) {
            ans = 3;
        }
        else if (n == 5) {
            ans = 2;
        }
        else {
            ans = 1;
        }
		
//		int ans = 7-n;
        
        return ans;
    }
}
