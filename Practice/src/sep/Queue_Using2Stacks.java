package sep;

import java.util.Stack;

public class Queue_Using2Stacks {

    // Inner class implementing queue using 2 stacks
    public static class QueueTwoStacks {
        private Stack<Integer> inbox = new Stack<>();
        private Stack<Integer> outbox = new Stack<>();

        // Enqueue operation
        public void enqueue(int x) {
            inbox.push(x);
            System.out.println(x + " enqueued");
        }

        // Dequeue operation
        public Integer dequeue() {
            if (outbox.isEmpty()) {
                while (!inbox.isEmpty()) {
                    outbox.push(inbox.pop());
                }
            }
            if (outbox.isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return null;
            }
            int val = outbox.pop();
            System.out.println(val + " dequeued");
            return val;
        }

        // Peek at front of queue
        public Integer peek() {
            if (outbox.isEmpty()) {
                while (!inbox.isEmpty()) {
                    outbox.push(inbox.pop());
                }
            }
            if (outbox.isEmpty()) {
                System.out.println("Queue is empty. Nothing to peek.");
                return null;
            }
            return outbox.peek();
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return inbox.isEmpty() && outbox.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueTwoStacks qs = new QueueTwoStacks();

        qs.enqueue(10);
        qs.enqueue(20);
        qs.enqueue(30);

        System.out.println("Peek: " + qs.peek()); // 10

        qs.dequeue(); // removes 10
        qs.dequeue(); // removes 20

        System.out.println("Peek: " + qs.peek()); // 30
        qs.dequeue(); // removes 30

        qs.dequeue(); // Queue empty message
    }
}
