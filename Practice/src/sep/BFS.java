package sep;

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

	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", Arrays.asList("F"));
        graph.put("F", new ArrayList<>());

        // Step 2: Run BFS starting from node "A"
        System.out.print("BFS Traversal: ");
        bfs(graph, "A");
	}
	
	public static void bfs(Map<String,List<String>> graph,String start) {
		Set<String>visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>(); 
        
        visited.add(start); 
        queue.add(start); 
        
        while (!queue.isEmpty()) { 
            String node = queue.poll();      // remove from queue
            System.out.print(node + " ");    // process (print) node
            
            // Visit all neighbors
            for (String neighbor : graph.getOrDefault(node, new ArrayList<>())) { 
                if (!visited.contains(neighbor)) { 
                    visited.add(neighbor);   // mark visited
                    queue.add(neighbor);     // add to queue
                } 
            }
        } 
	}
}

//BFS Traversal: A B C D E F 
