package sep;

public class Parsing_timeBased {

	public static void main(String[] args) {
        int[][] events = {{1,3}, {5,6}, {7,9}};
        freeTime(events,0,10);
	}
	
	public static void freeTime(int[][] events, int start, int end) {
		int current = start;
		
		for(int i=0; i<events.length; i++) {
			if(current < events[i][0]) {
				System.out.println("Free " + current + " to " + events[i][0]);
			}
			current = Math.max(current, events[i][1]);
		}
		if (current < end) {
            System.out.println("Free: " + current + " to " + end);
        }
	}
}

//Free 0 to 1
//Free 3 to 5
//Free 6 to 7
//Free: 9 to 10
