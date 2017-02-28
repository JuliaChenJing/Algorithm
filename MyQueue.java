import java.util.Stack;

public class MyQueue
{
	
	private Stack<Integer> s1,s2;
	
	MyQueue()
	{
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
	}

	public void enqueue(Integer a)
	{
		s1.push(a);
		
	}
	
	public int dequeue()
	{
		if(!s2.isEmpty())
			return s2.pop();
		else
		{
			while(!s1.isEmpty())
				s2.push(s1.pop());
			
			if(!s2.isEmpty())
				return s2.pop();
			else
				return -1000;
		}
		
	}
	
	
	public static void main(String [] args)
	{
		MyQueue m=new MyQueue();
		m.enqueue(1);
		m.enqueue(2);
		System.out.println(m.dequeue());
		System.out.println(m.dequeue());
		m.enqueue(3);
		System.out.println(m.dequeue());
		System.out.println(m.dequeue());
		
		
	}
	
	
}

/*
1
2
3
-1000
*/
