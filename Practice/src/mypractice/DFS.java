package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS {
	
	public static void dfs(int node, Map<Integer,List<Integer>> graph, Set<Integer>visited) {
		visited.add(node);
		System.out.print(node + " ");
		
		for(int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
			if(!visited.contains(neighbor)) {
				dfs(neighbor,graph,visited);
			}
		}
		
	}

	public static void main(String[] args) {
		 Map<Integer, List<Integer>> graph = new HashMap<>();
	        graph.put(0, Arrays.asList(1, 2));
	        graph.put(1, Arrays.asList(2));
	        graph.put(2, Arrays.asList(0, 3));
	        graph.put(3, Arrays.asList(3));

	        dfs(2, graph, new HashSet<>()); // Output: 2 0 1 3
	}

}
