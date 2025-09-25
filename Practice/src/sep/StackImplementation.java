package sep;

class Stack {
	int[] arr;
	int top;
	
	public Stack(int size) {
		arr = new int[size];
		top -= 1;
	}
	
	void push(int x) {
		arr[++top] = x;
	}
	
	int pop() {
		return arr[top--];
	}
	
	int peek() {
		return arr[top];
	}
	
	boolean isEmpty() {
		return top == -1;
	}
}
public class StackImplementation {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
	}
}

// 20
