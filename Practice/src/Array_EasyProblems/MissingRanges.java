package Array_EasyProblems;

public class MissingRanges {

	public static void main(String[] args) {
        int[] arr = {0, 1, 3, 50, 75};
        int lower =0, upper=99;
        int prev = lower-1;
        
        for(int i=0; i<=arr.length; i++) {
        	int curr = (i==arr.length)? upper+1 : arr[i];
        	if(prev+1 <= curr-1) {
        		if(prev+1 == curr-1) {
        			System.out.println(prev+1);
        		} else {
        			System.out.println((prev+1) + " -> " + (curr-1));
        		}
        	}
        	prev = curr;
        }
	}
}

//2
//4 -> 49
//51 -> 74
//76 -> 99
