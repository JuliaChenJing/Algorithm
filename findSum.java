import java.util.ArrayList;

public class BinaryTree {

	void findSum(TreeNode head, int sum, ArrayList<Integer> buffer, int start) {
		if (head == null)
			return;
		int tmp = sum;
		buffer.add(head.data);
		for (int i = start; i > -1; i--) {
			tmp =tmp- buffer.get(i);
			if (tmp == 0)
				print(buffer, i, start);//find it,print it
		}
		ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
		findSum(head.left, sum, c1, start + 1);
		findSum(head.right, sum, c2, start + 1);
	}

	void print(ArrayList<Integer> buffer, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(buffer.get(i) + "");
		}
		System.out.println();
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	TreeNode parent;

	TreeNode(int v) {
		data = v;
	}

	int data;
}
