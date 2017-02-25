import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class removeDuplicatesFromLinkedList {

	// If we can use a buffer, we can keep track of elements in a hashtable and
	// remove any dups
	public static void deleteDups(Node head) {
		if (head == null)
			return;
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		Node n = head;
		Node previous = null;// 保存处理中的当前位置，下一个位置可以放入下一个不重复的数字
		while (n != null) {

			if (!table.containsKey(n.data))// 如果节点的值不在表中
			{
				table.put(n.data, true);// 数值放入表中
				previous = n;// ？
			}

			else // 如果节点的值在表中
			{
				previous.next = n.next;// ？
			}

			n = n.next;
		}
		// return head;//直接就改变了原来的值，所以不返回head也行
	}

	// 自己想的，不对啊
	/*
	 * 
	 * AFTER: 1---> 2---> 1---> 3---> 4--->
	 * 
	 */
	public static void deleteDups_Wrong(Node head) {
		if (head == null)
			return;
		Set<Integer> set = new HashSet<Integer>();
		Node n = head;

		while (n.next != null) {

			if (!set.contains(n.data))// 如果节点的值不在表中
			{
				set.add(n.data);

			}

			else // 如果节点的值在表中
			{
				n.next = n.next.next;
			}

			n = n.next;
		}
		// return head;//直接就改变了原来的值，所以不返回head也行
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(1);
		Node d = new Node(2);
		Node e = new Node(3);
		Node f = new Node(4);
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

		deleteDups(a);

		System.out.println("AFTER: ");
		n = a;
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
 * BEFORE: 1---> 2---> 1---> 2---> 3---> 4---> AFTER: 1---> 2---> 3---> 4--->
 * 
 */
