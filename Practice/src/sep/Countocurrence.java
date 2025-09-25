package sep;

public class Countocurrence {

	public static void main(String[] args) {
		String str = "hello programming";
		char target = 'l';
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
        System.out.println("Occurrences of '" + target + "': " + count);
	}
}


//Occurrences of 'l': 2
