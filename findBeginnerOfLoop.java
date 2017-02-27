import java.util.HashSet;

public class AddTwoNumbers {

	public static Node findBeginnerOfLoop(Node head) {
		
		HashSet<Node> h=new HashSet <Node>();
		Node n=head;
		while(n!=null)
		{
	
			if(h.contains(n))
				return n;
			else
				h.add(n);
			n=n.next;
		}

		return null;

	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
	
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		Node n = a;
		System.out.println("THE LINKED LIST: ");
		int i=0;
		while (n != null&& i<10) {
			System.out.println(n.data + "--->");
			n = n.next;
			i++;
		}
		
		Node re= findBeginnerOfLoop(a);
		System.out.println("the beginner of the loop is :"+re.data);
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
THE LINKED LIST: 
1--->
2--->
3--->
4--->
5--->
3--->
4--->
5--->
3--->
4--->
the beginner of the loop is :3
 */
