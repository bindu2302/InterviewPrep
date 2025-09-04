//Given two integer arrays a[] and b[] containing two integers each representing the numerator and denominator of a fraction respectively.
//The task is to find the sum of the two fractions and return the numerator and denominator of the result.
//
//Examples : 
//
//Input:  a = [1, 2] , b = [3, 2] 
//Output: [2, 1] 
//Explanation: 1/2 + 3/2 = 2/1
//
//Input:  a = [1, 3] , b = [3, 9] 
//Output: [2, 3] 
//Explanation: 1/3 + 3/9 = 2/3   
//
//Input:  a = [1, 5] , b = [3, 15] 
//Output: [2, 5] 
//Explanation: 1/5 + 3/15 = 2/5 


package Foundation;

import java.util.ArrayList;
import java.util.List;

public class Add_TwoFractions {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		List<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(2);
		
		List<Integer> ans = addFractions(a,b);
		
		System.out.println(ans.get(0) + ", " + ans.get(1));
	}
	
	public static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
	
	// Function to add two fractions
    public static List<Integer> addFractions(List<Integer> a, List<Integer> b) {
        List<Integer> ans = new ArrayList<>(); 
        // Finding gcd of den1 and den2
        int den = gcd(a.get(1), b.get(1));

        // Denominator of final fraction obtained
        // finding LCM of den1 and den2
        // LCM * GCD = a * b 
        den = (a.get(1) * b.get(1)) / den;

        // Changing the fractions to have same denominator
        // Numerator of the final fraction obtained
        int num = (a.get(0)) * (den / a.get(1)) + (b.get(0)) * (den / b.get(1));

        // finding the common factor of numerator and denominator
        int common_factor = gcd(num, den);

        // Converting the result into simpler 
        // fraction by dividing them with common factor 
        den = den / common_factor;
        num = num / common_factor;
        ans.add(num); 
        ans.add(den); 
        return ans;
    }
}
