package sep;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read first array
        String[] input1 = sc.nextLine().split(" ");
        int n1 = input1.length;
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        // Read second array
        String[] input2 = sc.nextLine().split(" ");
        int n2 = input2.length;
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }
        
        ArrayList<Integer> evenList = new ArrayList<>();
        
        for(int i=0; i<n1; i++) {
        	if(arr1[i] % 2 ==0) {
        		evenList.add(arr1[i]);
        	}
        }
        
        for(int i=0; i<n2; i++) {
        	if(arr2[i] % 2 ==0) {
        		evenList.add(arr2[i]);
        	}
        }
        
        System.out.print("Even Numbers Array: [");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i));
            if (i < evenList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	}

}
