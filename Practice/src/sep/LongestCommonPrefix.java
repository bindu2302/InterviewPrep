package sep;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Example 1: " + longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println("Example 2: " + longestCommonPrefix(strs2)); // Output: ""
	}
	
	public static String longestCommonPrefix(String[] str) {
		if(str.length==0) return "";
		String prefix = str[0];
		
		for(String s : str) {
			while(!s.startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
}
