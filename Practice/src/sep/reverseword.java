package sep;

public class reverseword {

	public static void main(String[] args) {
		String str = "Hello programming!";
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();
		System.out.println(sb);
	}
}

//!gnimmargorp olleH
