package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFS {
	public static void bfs(int start, Map<Integer, List<Integer>> graph) {
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		
		queue.add(start);
		visited.add(start);
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			
			for(int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
		graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(3));

        bfs(2, graph); // Output: 2 0 3 1
     }
}
