package TreeDs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
	public static void main(String[] args)
	{
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);

		zigZagOrder(node);
	}

	private static void zigZagOrder(Node root) {
		List<List<Integer>> result=new ArrayList<>();
		if(root==null) {
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		int level=0;

		while(q.isEmpty()==false) {
			int len=q.size();
			List<Integer> levelResult=new ArrayList<Integer>();
			for (int i = 0; i < len; i++) {
				Node curr=q.poll();
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
				if(level%2==0) {
					levelResult.add(curr.data);
				}
				else {
					levelResult.add(0,curr.data);
				}
			}
			level++;
			result.add(levelResult);
		}
		System.out.println(result.toString());
	}

}
