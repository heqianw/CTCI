package chapter4;

import java.util.LinkedList;

public class RouteNodes {
	//algorithm to find out whether there is a route between two nodes
	//We cannot use bidirectional search for a common node in the middle
	//can't assume that the common node has a way to reach the other node
	//since this is a directed graph(one direction only)
	//we would make two BFS runs, one from each node
	
	//first is the recursive approach which is cleaner
	public boolean isRoute(Node one, Node two, Node current) {
		if(one == two) {
			return true;
		}
		else {
			if(two.equals(current)) {
				return true;
			}
			else {
				current.state = State.Visited;
				for(Node n : current.getChildren()) {
					if(!n.state.equals(State.Visited)) {
						current = n;
						isRoute(one, two, current);
					}
				}
				return false;
			}
		}
		
	}
	
	
	//here is two implementations, iterative and the recursive approach
	//second the iterative approach
	public boolean routeNodes(Graph graph, Node one, Node two) {
		//condition to check at the start, for if equal
		LinkedList<Node> queue = new LinkedList<Node>();
		for(Node u : graph.getNodes()) {
			u.state = State.Unvisited;
		}
		one.state = State.Visiting;
		queue.add(one);
		Node u;
		
		while (!queue.isEmpty()) {
			u = queue.removeFirst();
			if(u != null) {
				for(Node v : u.getChildren()) {
					if(v.state == State.Unvisited) {
						if(v == two) {
							return true;
						}
						else {
							v.state = State.Visiting;
							queue.add(v);
						}
					}
				}
			}
			u.state = State.Visited;
		}
		return false;
	}
}