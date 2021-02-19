package TreeDs;

import java.util.LinkedList;
import java.util.Queue;

public class BfsOfBt {
	public static void main(String[] args)
	{
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);

		levOrder(node);
	}

	private static void levOrder(Node root) {
		if(root==null) {
			return;
		}
		else {
			Queue<Node> q=new LinkedList<Node>();
			q.add(root);
			while (q.isEmpty()==false) {
				Node curr=q.poll();
				System.out.print(curr.data);
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
		}
	}

}
