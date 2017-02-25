public class FindNth {

	// If we can use a buffer, we can keep track of elements in a hashtable and
	// remove any dups
	public static Node findNth(Node head, int N) {
		
		if(head==null)
			return null;
		int length=0;
		Node n=head;
		Node re=null;
		while(n!=null)
		{
			n=n.next;
			length++;
			
		}
		
		System.out.println("length="+length);
		
		if(length<N)
			return null;
		int j=1;
		Node m=head;
		while(j<length-N)
		{
			re=m.next;
			j++;
			m=m.next;
		}
			
		
		return re;
	}


	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		Node n = a;
		System.out.println("BEFORE: ");
		while (n != null) {
			System.out.println(n.data + "--->");
			n = n.next;
		}

		Node re=findNth(a,2);

		System.out.println(re.data);
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
BEFORE: 
1--->
2--->
3--->
4--->
5--->
6--->
length=6
4
 */
