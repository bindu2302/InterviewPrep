//Repeating: 1, Missing: 5

package Array_EasyProblems;

public class Repeating_Missing {

	public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;
        
        int sumN = n * (n+1)/2;
        int sumsqN = n * (n+1) * (2 * n+1)/6;
        
        int sum =0, sumSq= 0;
        for(int x: arr) {
        	sum += x;
        	sumSq += x * x;
        }
        
        int diff = sum - sumN; // repeating - missing
        int diffSq = sumSq - sumsqN; // repeating^2 - missing^2

        int sumRM = diffSq / diff; // repeating + missing

        int repeating = (diff + sumRM) / 2;
        int missing = repeating - diff;

        
        System.out.println("Repeating: " + repeating + ", Missing: " + missing);
	}
}
