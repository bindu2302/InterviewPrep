package mypractice;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter element: " + (i+1) + ": ");
			stack.push(sc.nextInt());
		}
		
		System.out.println("Stack: " + stack);
		
		System.out.println("Do want to pop an element(Yes/No) ");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("yes") && !stack.isEmpty()) {
			System.out.println("Which element you want to pop, enter the index: ");
			int index = sc.nextInt();
			
			System.out.println("Popped element: " + stack.remove(index));
			
		} else if (stack.isEmpty()) {
			System.out.println("Stack is empty,nothing to pop.");
		}
		
		System.out.println("Final Stack: " + stack);
		
		
	}

}
