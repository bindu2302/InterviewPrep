package mypractice;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_example {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(10);
		que.add(20);
		que.add(30);
		
		System.out.println("Top element: " + que.peek());
		System.out.println("Removed: " + que.poll());
	}
}

//Top element: 10
//Removed: 10