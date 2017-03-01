import java.util.LinkedList;


public class RouteBetweenNodes {

	public enum State {
		Unvisited, Visited, Visiting;
	}

	public static boolean search(Graph g, Node start, Node end) {
		LinkedList<Node> q = new LinkedList<Node>(); // operates as Stack
		for (Node u : g.getNodes()) {
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while (!q.isEmpty()) {
			u = q.removeFirst(); // i.e., pop()
			if (u != null) {
				for (Node v : u.getAdjacent()) {
					if (v.state == State.Unvisited) {
						if (v == end) {
							return true;
						} else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;
	}
	
	
	
	
	class Graph
	{
		Node [] nodes;
		Node [] getNodes ()
		{
			return nodes;
		}
	}
	
	class Node
	{
		State state ;
		public Node  [] getAdjacent() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}



