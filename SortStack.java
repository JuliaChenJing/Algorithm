import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sort(Stack<Integer> s) {
		
		Stack<Integer> re = new Stack<Integer>();
		
		while (!s.isEmpty()) {
			//处理s当前的peek值
			int tmp = s.pop();
			
			//re里面只能存小的，如果re里面的peek值比s里的peek值大，则把这两个值对调
			while (!re.isEmpty() && re.peek() > tmp) 
			{
				s.push(re.pop());
			}
			
			re.push(tmp);
		}
		return re;
	}

	public static void main(String[] args) {
		
		Stack <Integer>s=new Stack<Integer>();
		s.push(1);
		s.add(5);
		s.push(3);
		s.push(4);
		s.push(2);
		
		Stack<Integer> re=sort(s);
		
		while(!re.isEmpty())
			System.out.println(re.pop());
	}
}

/*
5
4
3
2
1
 */
