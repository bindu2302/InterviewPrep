package sep;

public class Division {

	public static void main(String[] args) {
        System.out.println(divide(10, 3)); // 3
	}
	
	public static int divide(int dividend, int divisor) {
		int count = 0;
		int sign = ((dividend<0) ^ (divisor<0)) ? -1 : 1;
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		while(dividend >= divisor) {
			dividend -= divisor;
			count++;
		}
		return count * sign; // 3
	}
}
