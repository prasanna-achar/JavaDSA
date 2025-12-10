package Recursion;

import java.util.LinkedList;
import java.util.List;

public class PowerSet {
	
	
	private static void getPowerSets(List<Integer> org, int index, List<Integer> curr, List<List<Integer>> powerSets) {
		if(index == org.size()) {
			powerSets.add(new LinkedList<Integer>(curr));
			return;
		}
		
		getPowerSets(org, index+1, curr, powerSets);
		curr.add(org.get(index));
		getPowerSets(org, index+1, curr, powerSets);
		curr.remove(curr.size()-1);
	}
	
	public static List<List<Integer>> getPowerSets(List<Integer> org){
		List<List<Integer>> powerSets = new LinkedList<List<Integer>>();
		getPowerSets(org, 0, new LinkedList<Integer>(), powerSets);
		return powerSets;
	}
}
