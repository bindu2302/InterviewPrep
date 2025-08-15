import java.util.*;
public class UniqueLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String result = findUniqueLetters(input);
		System.out.println(result);
	}
	
	public static String findUniqueLetters(String input) {
		Map<Character,Integer> charCount = new HashMap<>();
		for(char c:input.toCharArray()) {
			charCount.put(c,charCount.getOrDefault(c, 0)+1);
		}
		
		List<Character>uniqueChars = new ArrayList<>();
		for(Map.Entry<Character,Integer>entry:charCount.entrySet()) {
			if(entry.getValue()==1) {
				uniqueChars.add(entry.getKey());
			}
		}
		if(uniqueChars.isEmpty()) {
			return "There are no unique characters";
		}
		return uniqueChars.toString();
	}
}
