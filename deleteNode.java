public class DeleteNode {

	public static boolean deleteNode(Node node) {
		 if (node == null || node.next == null)
		 {
			 return false; // Failure
		 }
		
		 Node next = node.next;
		 node.data = next.data;
		 node.next = next.next;
		 return true;
		 
	}


	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		//Node f = new Node(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		//e.next = f;
		Node n = a;
		System.out.println("BEFORE: ");
		while (n != null) {
			System.out.println(n.data + "--->");
			n = n.next;
		}

		deleteNode(c);
		System.out.println("AFTER: ");
		n=a;
		while (n != null) {
			System.out.println(n.data + "--->");
			n = n.next;
		}
	}
}

class Node {
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
			n = n.next;
		n.next = end;
	}

	Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next;
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}

/*
 *BEFORE: 
1--->
2--->
3--->
4--->
5--->
AFTER: 
1--->
2--->
4--->
5--->
 */
