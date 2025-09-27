package sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS {

	public static void main(String[] args) {
		Map<String,List<String>> graph = new HashMap<>();
		
		graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", Arrays.asList("F"));
        graph.put("F", new ArrayList<>());	
        
        
     Set<String> visited = new HashSet<>();
     System.out.print("DFS Traversal: ");
     dfs(graph,"A",visited);
	}
	
	public static void dfs(Map<String,List<String>> graph, String start, Set<String> visited) {
		if(visited.contains(start)) return;
		visited.add(start);
		System.out.print(start+" ");
		
		for(String neighbor : graph.getOrDefault(start, new ArrayList<>())) {
			dfs(graph,neighbor,visited);
		}
	}
}

//DFS Traversal: A B D E F C 