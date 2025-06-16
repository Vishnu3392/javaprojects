package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSstack1 {

	public static void main(String[] args) {
		Map<String,List<String>> graph=new HashMap<String,List<String>>();
		graph.put("Entrance",Arrays.asList("Reptile House","Bird Sanctuary","Mammal zone"));
		graph.put("Reptile House",Arrays.asList("snake pit"));
		graph.put("Bird Sanctuary", Arrays.asList("Parrot pavilion"));
		graph.put("Mammal zone",new ArrayList<String>());
		graph.put("Lion Den",new ArrayList<String>());
		graph.put("snake pit", new ArrayList<>());            
	    graph.put("Parrot pavilion", new ArrayList<>());  
		graph.put("Elephant Enclosure",new ArrayList<String>());
		System.out.println("Zoo BFS Traversal Starting from Entrance:");
		bfs(graph,"Entrance");
	}

	public static void bfs(Map<String, List<String>> graph, String startroom) {
		  Queue<String> queue=new LinkedList<String>();
		    Set<String> visited=new HashSet<String>();

		      queue.add(startroom);
		       visited.add(startroom);

		while(!queue.isEmpty()) {
		     String currentRoom=queue.poll();
		      System.out.println("visited "+currentRoom);

		for(String neighbor:graph.get(currentRoom)) {
		        if(!visited.contains(neighbor)) {
		        queue.add(neighbor);
		        visited.add(neighbor);
		   }
		  }
	}
	}
}
