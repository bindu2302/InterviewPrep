package sep;

public class StringRotation {

	public static void main(String[] args) {
		System.out.println(isRotation("abcd", "cdab")); // true
        System.out.println(isRotation("abcd", "acbd")); // false
        
	}
	
	public static boolean isRotation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String combined = s1 + s1;
        return combined.contains(s2);
	}
}
