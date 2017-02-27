 public class Queue{
	Node first,back;
	
	void enqueue(int item){
		if(first==null){
			back=new Node(item);
			first=back;
		}
		else
		{
			back.next=new Node(item);
			back=back.next;
		}
	}
	
	Node dequeue()
	{
		if(first !=null)
		{
			Node item=first;
			first=first.next;
			return item;
		} 
		
		return null;
	}
	
	@Override
	public  String toString()
	{
		String re="first";
		Node n=first;
		while(n!=null)
		{
			re+="-->"+n.data;
			n=n.next;	
		}
		
		re+="-->last";
		
		return re;
	}
	
	public static void main(String[] args)
	{
		Queue s=new Queue();
		Node a=new Node(1);
		s.first=a;
		s.back=a;
		s.enqueue(2);
		s.enqueue(3);
		System.out.println(s.toString());
		s.dequeue();
		System.out.println(s.toString());
		s.enqueue(4);
		s.dequeue();
		s.enqueue(5);
		System.out.println(s.toString());
	}
}


class Node 
{
	Node next = null;
	int data;

	public Node(int d) 
	{
		data = d;
	}

	void appendToTail(int d) 
	{
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
			n = n.next;
		n.next = end;
	}

	Node deleteNode(Node head, int d)
	{
		Node n = head;
		if (n.data == d) {
			return head.next;
		}

		while (n.next != null)
		{
			if (n.next.data == d) 
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
}

/*
first-->1-->2-->3-->last
first-->2-->3-->last
first-->3-->4-->5-->last
 */
