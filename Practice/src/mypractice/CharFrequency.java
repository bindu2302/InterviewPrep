package mypractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
        System.out.println("Character frequencies:");
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	}
}

//himabindunara
//Character frequencies:
//a -> 3
//b -> 1
//r -> 1
//d -> 1
//u -> 1
//h -> 1
//i -> 2
//m -> 1
//n -> 2