package sep;

import java.util.ArrayList;
import java.util.List;

public class Stack_UsingArrayList {
	
	public static class StackCustom {
		private List<Integer> stack = new ArrayList<>();
		
		public void push(int x) {
			stack.add(x);
		}
		
		public Integer pop() {
			if(stack.isEmpty()) return null;
			return stack.remove(stack.size()-1);
		}
		
		public Integer peek() {
			if(stack.isEmpty()) return null;
			return stack.get(stack.size()-1);
		}
	}
	
	public static void main(String[] args) {
		StackCustom st = new StackCustom();
		st.push(10);
		st.push(20);
		st.push(30);
		
		 System.out.println("Peek: " + st.peek()); // 30
	     System.out.println("Pop: " + st.pop());   // 30
	     System.out.println("Pop: " + st.pop());   // 20
	     System.out.println("Peek: " + st.peek()); // 10
	}
}
