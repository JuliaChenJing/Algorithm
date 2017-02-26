public class AddTwoNumbers {

	public static Node addTwoNumbers(Node head1, Node head2) {

		Node a = head1;
		Node b = head2;

		Node head = null;

		int carry=0;
		int sum=0;
		
		if (head1 != null && head2 != null) {

			sum=a.data + b.data;
			carry=sum/10;
			head = new Node(sum%10);
			Node n = head;
			sum=0;
			
			while (a.next != null && b.next != null) {
				a = a.next;
				b = b.next;
				sum=a.data + b.data+carry;
				carry=sum/10;;
				n.next = new Node(sum%10);
				n = n.next;
			}
			return head;
		}
		return null;

	}

	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(1);
		Node c = new Node(5);
		Node d = new Node(5);
		Node e = new Node(9);
		Node f = new Node(2);
		Node g=new Node(1);
		a.next = b;
		b.next = c;
		// c.next = d;
		d.next = e;
		e.next = f;
		f.next=g;
		Node n = a;
		System.out.println("THE FIRST LINKED LIST: ");
		while (n != null) {
			System.out.println(n.data + "--->");
			n = n.next;
		}
		System.out.println("THE SECEND LINKED LIST: ");
		n = d;
		while (n != null) {
			System.out.println(n.data + "--->");
			n = n.next;
		}

		System.out.println("THE RESULT LINKED LIST: ");
		 n= addTwoNumbers(a,d);
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
THE FIRST LINKED LIST: 
3--->
1--->
5--->
THE SECEND LINKED LIST: 
5--->
9--->
2--->
1--->
THE RESULT LINKED LIST: 
8--->
0--->
8--->

 */
