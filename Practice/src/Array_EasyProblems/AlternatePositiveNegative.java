//After Alternate: 
//1 -2 3 -4 6 -5 8 -7 

package Array_EasyProblems;

public class AlternatePositiveNegative {

	public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7, 8};
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        
        int p=0,q=0;
        for(int x : arr) {
        	if(x>=0) {
        		pos[p++] = x;
        	} else {
        		neg[q++] = x;
        	}
        }
        
        int i=0,j=0,k=0;
        while(i<p && j<q) {
        	arr[k++] = pos[i++];
        	arr[k++] = neg[j++];
        }
        
        while(i<p) {
        	arr[k++] = pos[i++];
        }
        
        while(j<q) {
        	arr[k++] = neg[j++];
        }
        
        System.out.println("After Alternate: ");
        for(int x: arr) {
        	System.out.print(x+" ");
        }
	}

}
