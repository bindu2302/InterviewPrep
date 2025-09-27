package sep;

public class reverseWords {

	public static void main(String[] args) {
		String s = "  the sky   is blue  ";
        System.out.println("Original: \"" + s + "\"");
        System.out.println("Reversed: \"" + reverseWords(s) + "\"");
	}
	
	public static String reverseWords(String s) {
		
		String[] words = s.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1; i>=0; i--) {
			result.append(words[i]);
			if(i!=0) {
				result.append(" ");
			}
		}
		return result.toString();
	}
}
//Original: "  the sky   is blue  "
//Reversed: "blue is sky the"
