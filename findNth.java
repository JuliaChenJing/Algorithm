import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FindNth {

	//我自己想的
	public static Node findNth(Node head, int N) {

		if (head == null)
			return null;
		int length = 0;
		Node n = head;
		Node re = null;
		while (n != null) {
			n = n.next;
			length++;

		}

		System.out.println("length=" + length);

		if (length < N)
			return null;
		int j = 1;
		Node m = head;
		while (j < length - N) {
			re = m.next;
			j++;
			m = m.next;
		}

		return re;
	}

	//书上的答案，不好理解啊
	public static Node nthToLast(Node head, int n) {
		if (head == null || n < 1)
		{
			return null;
		}
		
		Node p1 = head;
		Node p2 = head;
		for (int j = 0; j < n - 1; ++j) { // skip n‐1 steps ahead
			if (p2 == null) {
				return null; // not found since list size < n
			}
			
			p2 = p2.next;
		}
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
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

		Node re = findNth(a, 2);

		System.out.println(re.data);
		
		Node re_2 = nthToLast(a, 2);

		System.out.println(re_2.data);
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
 * BEFORE: 
1--->
2--->
3--->
4--->
5--->
6--->
length=6
4
5

 */
