package mypractice;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	
		System.out.println("Top element: " + stack.peek());
		System.out.println("Popped Element: " + stack.pop());
	}
}

//Top element: 50
//Popped Element: 50