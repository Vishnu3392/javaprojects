package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSalgorithm {
	private Map<String,List<String>> circle=new HashMap<String,List<String>>();
	private Set<String> visited=new HashSet<String>();
	public void addPerson(String person,String connectedPerson) {
		circle.computeIfAbsent(person,k-> new ArrayList<>()).add(connectedPerson);
		circle.computeIfAbsent(connectedPerson,k-> new ArrayList<>()).add(person);
	}
	public void dfs(String currentPerson) {
		if(visited.contains(currentPerson))return;
		visited.add(currentPerson);
		System.out.println("visited:"+currentPerson);
		for(String neighbour:circle.getOrDefault(currentPerson,new ArrayList<String>())) {
			dfs(neighbour);
		}
	}
	public static void main(String[] args) {
		DFSalgorithm home=new DFSalgorithm ();
		home.addPerson("Msd", "rohit");
		home.addPerson("Msd", "kohli");
		home.addPerson("kohli", "kl");
		System.out.println("DFs starting from Msd");
	home.dfs("Msd");

	}

}
