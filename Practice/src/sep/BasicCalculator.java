package sep;

import java.util.Scanner;
import java.util.Stack;


public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calculate(s));
    }
    
    public static int calculate(String s) {
    	int result=0;
    	int sign = 1;
    	int number =0;
    	
        Stack<Integer> stack = new Stack<>();

    	
    	for(int i=0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		if(Character.isDigit(c)) {
    			number = number * 10 + (c - '0');
    		} else if(c=='+') {
    			result += sign * number;
    			sign = 1;
    			number =0;
    		} else if(c=='-') {
    			result += sign * number;
    			sign = -1;
    			number = 0;
    		} else if(c=='(') {
    			stack.push(result);
    			stack.push(sign);
    			result =0;
    			sign =1;
    		} else if(c==')') {
    			result += sign * number;
                number = 0;
                result *= stack.pop(); // multiply by the sign before parentheses
                result += stack.pop(); // add the result before parentheses
    		}
    	}
    	if (number != 0) result += sign * number;
        return result;
    }
}

//"1 + (2 - (3 + 4)) + 5"
//1
