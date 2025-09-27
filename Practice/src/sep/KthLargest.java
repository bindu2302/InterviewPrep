package sep;

import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int k = 2;
		
		System.out.println("Kth largest num: " + KthLargest(nums,k));
	}
	
	public static int KthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num : nums) {
			pq.offer(num);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
		
	}
}

//Kth largest num: 5

