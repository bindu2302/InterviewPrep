package sep;

class Queue {
	int[] arr;
	int front,rear,size,capacity;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = 0;
		size = 0;
		rear = -1;			
	}
	
	void enqueue(int x) {
		if(size == capacity) return;
		rear = (rear+1) % capacity;
		arr[rear] = x;
		size++;
	}
	
	 int dequeue() {
	        if (size == 0) return -1;
	        int item = arr[front];
	        front = (front + 1) % capacity;
	        size--;
	        return item;
	    }
}
public class QueueImplementation {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		System.out.println(q.dequeue()); //10
	}

}
