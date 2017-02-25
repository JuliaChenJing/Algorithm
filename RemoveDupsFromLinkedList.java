import java.util.Hashtable;
import java.util.LinkedList;

public class removeDuplicatesFromLinkedList {

	//If we can use a buffer, we can keep track of elements in a hashtable and remove any dups:
		public static void deleteDups(Node head)
		{
			Hashtable table = new Hashtable();
			Node n=head;
			Node re = null;
			while (n != null) {
		
				if (table.containsKey(n.data))
					re.next = n.next;
		 
				else 
				{
					table.put(n.data, true);
					re = n;
				}
		 
				n = n.next;
			}
			//return head;//直接就改变了原来的值，所以不返回head也行
		}

	public static void main(String[] args) 
	{
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(1);
		Node d=new Node(2);
		Node e=new Node(3);
		Node f=new Node(4);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		Node n=a;
		System.out.println("BEFORE: ");
		while(n!=null)
		{
			System.out.println(n.data+"--->");
			n=n.next ;
		}
		
		deleteDups(a);
		
		System.out.println("AFTER: ");
		n=a;
		while(n!=null)
		{
			System.out.println(n.data+"--->");
			n=n.next ;
		}
	

	}
}

class Node{
	Node next=null;
	int data;
	public Node(int d)
	{
		data=d;
	}
	void appendToTail (int d)
	{
		Node end=new Node(d);
		Node n=this;
		while (n.next!=null)
			n=n.next;
		n.next=end;
	}
	
	Node deleteNode(Node head,int d){
		Node n=head;
		if(n.data==d){
			return head.next;
		}
		
		while (n.next!=null){
			if(n.next.data==d)
			{
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
}


