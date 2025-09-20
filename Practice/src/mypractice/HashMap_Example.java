package mypractice;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Hima", 23);
		map.put("Bindu", 80);
		map.put("Nara", 2001);
		
		for(String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
	}
}
//A HashMap does not guarantee order.
//Nara -> 2001
//Hima -> 23
//Bindu -> 80
